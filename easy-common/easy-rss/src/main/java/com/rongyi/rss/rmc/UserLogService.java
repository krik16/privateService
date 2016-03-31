package com.rongyi.rss.rmc;

import java.util.List;

import com.rongyi.easy.domain.member.ReportBasicResult;



public interface UserLogService {

  public List<ReportBasicResult> getRegisterData(String mallId, String type, String endDate,
      Integer limit);

  public List<ReportBasicResult> getLoginData(String mallId, String type, String endDate,
      Integer limit);

  public List<ReportBasicResult> getSignData(String mallId, String type, String endDate,
      Integer limit);

  public List<ReportBasicResult> getMemberData(String mallId, Integer biz, String type,
      String endDate, Integer limit);

  public List<ReportBasicResult> getRegisterRatio(String mallId, String startDate, String endDate);

  public List<ReportBasicResult> getLoginRatio(String mallId, String startDate, String endDate);

  public List<ReportBasicResult> getSignRatio(String mallId, String startDate, String endDate);

  public List<ReportBasicResult> getRatioData(String mallId, Integer biz, String startDate,
      String endDate);

  public void test(String mallId, String type, String endDate, Integer limit);

}
