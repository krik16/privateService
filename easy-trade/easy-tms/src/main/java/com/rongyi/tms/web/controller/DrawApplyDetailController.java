
/**   
 * @Title: DrawApplyController.java 
 * @Package: com.rongyi.tms.web.controller 
 * @Description: TODO
 * @author user  
 * @date 2015年5月14日 下午2:34:57 
 */


package com.rongyi.tms.web.controller;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import base.util.excel.ExcelWriter;

import com.rongyi.core.common.PagingVO;
import com.rongyi.easy.malllife.common.util.DateTool;
import com.rongyi.easy.tms.entity.DrawApply;
import com.rongyi.easy.va.entity.VirtualAccountEntity;
import com.rongyi.rss.roa.ROAVirtualAccountGeneralService;
import com.rongyi.tms.constants.Constant;
import com.rongyi.tms.moudle.vo.DrawApplyPageParam;
import com.rongyi.tms.service.DrawApplyService;
import com.rongyi.tms.service.DrawVerifyLogService;

/** 
 * @Description 提现申请 controller
 * @author 袁波
 * @date 2015年5月14日 下午2:34:57 
 */
@Controller
@RequestMapping("/drawDetail")
public class DrawApplyDetailController extends BaseController {
    private static final Log LOGGER = LogFactory.getLog(DrawApplyDetailController.class);
    @Autowired
    private DrawApplyService drawService;
    
    @Autowired
    private DrawVerifyLogService drawVerifyLogService;
    
    @Autowired
    ROAVirtualAccountGeneralService rOAVirtualAccountGeneralService;
    
    @RequestMapping("/search")
    public String searchIntegralComm() {
        return "accountCheck/apply-search";
    }
    @RequestMapping(value="/list")
    public String findByPage(@ModelAttribute("param")DrawApplyPageParam param,ModelMap modelMap){
        try{
            Map<String,Object> params=param.toParamsMap();
            LOGGER.info("params:"+params);
            params.put("orderBy","-trade_at");
            PagingVO<DrawApply> pagingvos=drawService.findByPage(params);
            modelMap.addAttribute("list", pagingvos.getDataList());
            BigDecimal totalBigDecimal=new BigDecimal(0);
            if(!pagingvos.getDataList().isEmpty()){
                for(DrawApply apply:pagingvos.getDataList()){
                    totalBigDecimal=totalBigDecimal.add(new BigDecimal(apply.getDrawAmount().toString()));
                }
            }
            modelMap.put("totalAmount",totalBigDecimal);
            modelMap.addAttribute("size",pagingvos.getDataList().size());
            modelMap.addAttribute("currpage", pagingvos.getCurrentPage());
            modelMap.addAttribute("rowCont", pagingvos.getTotalPage());
            return "accountCheck/apply-list";
        }catch(Exception e){
            LOGGER.info(e);
            modelMap.addAttribute(Constant.VIEW_MSG.MSG, "获取数据失败");
            modelMap.addAttribute(Constant.VIEW_MSG.DETAIL, e.getMessage());
            return Constant.VIEW_MSG.ERROR;
        }
    }
    /**
     * 导出明细，最多5000条
     * @param params
     * @param session
     * @param request 
     */
    @RequestMapping(value="/output")
    public void outPutDetail(DrawApplyPageParam params,String temp,HttpSession session,HttpServletRequest request,HttpServletResponse response){
        try{
            Map<String,Object> paramsMap=params.toParamsMap();
            paramsMap.put("size",5000);
            LOGGER.info("params:"+params);
            PagingVO<DrawApply> pagingvos=drawService.findByPage(paramsMap);
            LOGGER.info("size:"+pagingvos.getDataList().size());
            if(pagingvos.getDataList().isEmpty()){
                this.responseJson("{\"msg\":\""+"没有数据"+"\",\"result\":\"error\"}", response);
            }else if(pagingvos.getDataList().size()>5000){
                this.responseJson("{\"msg\":\""+"数据超过5000条，无法导出"+",\"result\":\"error\"}", response);
            }else{
                if(temp!=null&&temp.equals("1")){
                    String fileName = new String("提现明细.xlsx".getBytes(), "ISO8859_1");
                    // 设置response参数，可以打开下载页面
                    response.reset();
                    response.setContentType("application/vnd.ms-excel;charset=utf-8");
                    response.setHeader("Content-Disposition", "attachment;filename=" + fileName);
                    OutputStream out = new BufferedOutputStream(response.getOutputStream());
                    createRecordExcel(out, pagingvos.getDataList());
                }else{
                    this.responseJson("{\"result\":\"ok\"}", response);
                }
            }
        }catch(Exception e){
            LOGGER.info(e);
            this.responseJson("{\"msg\":\""+"请稍后再试！"+"\"}", response);
        }
    }
    
    @RequestMapping(value="/detail")
    public String checkDrawApply(int id,HttpServletRequest request,ModelMap modelMap){
        try{
            LOGGER.info(id);
            if (id==0) {
                request.setAttribute("msg", "参数传递有误！");
                return Constant.VIEW_MSG.ERROR;
            }else{
                DrawApply drawApply=drawService.getOneById(id);
                VirtualAccountEntity vaEntity = rOAVirtualAccountGeneralService.selectByUserId(drawApply.getDrawUserId());
                LOGGER.info(drawApply.getCreateAt());
                modelMap.addAttribute("balance",vaEntity.getBalance());
                modelMap.addAttribute("apply", drawApply);
            }
            return "accountCheck/draw_apply-detail";
        }catch(Exception e){
            LOGGER.error(e);
            request.setAttribute(Constant.VIEW_MSG.MSG, "获取数据失败");
            request.setAttribute(Constant.VIEW_MSG.DETAIL, e.getMessage());
            return Constant.VIEW_MSG.ERROR;
        }
    }
    protected void createRecordExcel(OutputStream out, List<DrawApply> recordList) throws Exception {
        try {
            ExcelWriter excelWriter = new ExcelWriter(out, false);
            excelWriter.createSheet(DateTool.date2String(new Date(),
                    DateTool.FORMAT_DATE_2));
            excelWriter.createRow(0);
            excelWriter.setCell(0, "提现流水号");
            excelWriter.setCell(1, "打款方式");
            excelWriter.setCell(2, "商场");
            excelWriter.setCell(3, "店铺");
            excelWriter.setCell(4, "卖家账号");
            excelWriter.setCell(5, "卖家支付宝账号");
            excelWriter.setCell(6, "卖家支付宝姓名");
            excelWriter.setCell(7, "卖家开户银行");
            excelWriter.setCell(8, "卖家卡号");
            excelWriter.setCell(9, "卖家持卡人姓名");
            excelWriter.setCell(10, "提现金额");

            int i = 1;
            for (DrawApply record : recordList) {
                excelWriter.createRow(i);
                excelWriter.setCell(0, record.getDrawNo().toString());
                excelWriter.setCell(1,record.getPayType()==0?"支付宝":(record.getPayType()==1?"银行卡":"未知"));
                excelWriter.setCell(2, record.getMallName());
                excelWriter.setCell(3, record.getShopName());
                excelWriter.setCell(4, record.getSellerAccount());
                if(record.getPayType()==0){
                    excelWriter.setCell(5, record.getPayAccount());
                    excelWriter.setCell(6, record.getPayName());
                }else if(record.getPayType()==1){
                    excelWriter.setCell(7, "");
                    excelWriter.setCell(8, record.getPayAccount());
                    excelWriter.setCell(9, record.getPayName());
                }
                excelWriter.setCell(10, record.getDrawAmount());
                i++;
            }
            excelWriter.export();
        } catch (Exception e) {
            LOGGER.error("导出现金券领用记录失败！",e);
        }

    }

}
