package com.rongyi.easy.gcc;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class TransConfigurations implements Serializable{

	private static final long serialVersionUID = 1L;

	private int CommissionType;//返佣类型，0固定金额 1订单百分比  2单件商品百分比
	private int CommissionCountMax  = 0;//这个是同一卖家在同一天与同一买家交易量中，最多能获取的返佣单数
	private int CommissionDailyMax  = 0;//这个是同一卖家在同一天中，最多能获取的返佣单数
	private int CashCouponUseMax = 0;//这个是同一个买家同一天允许使用的现金卷的次数
	private BigDecimal  CommissionRatio = new BigDecimal(0); //这个是每单返回佣金的比例
	private BigDecimal  CommissionRatioLimit = new BigDecimal(0); //这个是每单返回佣金的比例	上限金额
	private BigDecimal  CommissionPrice = new BigDecimal(0); //这个是每单返回佣金的金额
	private int SettleDateEarly = 0;//范围1-28   这个是月初结算日
	private int SettleDateLate = 0;//范围1-28    这个是月末结算日
	private int DrawCountMax = 0;//这个是同一天同一个卖家允许提现的次数

	/*俞志坚 新加字段 有时间你们记得重构吧*/
	//验码返佣金
	private BigDecimal  checkCodePrice = new BigDecimal(0); //这个是每单返回佣金的金额
	private int checkCodeDateEarly = 0;//范围1-28   这个是月初结算日 开始日期
	private int checkCodeDateLate = 0;//范围1-28    这个是月末结算日 结束日期
	private int checkCodeMax = 0;//同一导购最多能获取反单数
	//首单返佣金
	private BigDecimal  firstPrice = new BigDecimal(0); //这个是每单返回佣金的金额
	private int firstDateEarly = 0;//范围1-28   这个是月初结算日 开始日期
	private int firstDateLate = 0;//范围1-28    这个是月末结算日 结束日期
	private int firstMax = 0;//同一导购最多能获取反单数
	//注册返佣
	private BigDecimal  registPrice = new BigDecimal(0); //这个是每单返回佣金的金额
	private int  registType= 0;// 0表示系统 1 表示手动
	private int registMax = 0;//同一导购最多能获取反单数

	//按单件商品百分比返佣
	private BigDecimal goodsRatio = new BigDecimal(0);  //每件返佣百分比
	private BigDecimal goodsMinimumPrice = new BigDecimal(0);  //每件起返商品售价
	private BigDecimal goodsPriceLimit = new BigDecimal(0); //每件商品返佣上限

	private int useUserType ; //可以使用的用户  0全用户   1指定的用户
	private List<Integer> userList ; //指定的用户列表
	private String userIdsStr ;    //指定的用户IDs 以逗号分隔
	private String userAccountsStr ;  //输入的指定用户账号or手机号s 以逗号分隔


	public int getCommissionCountMax() {
		return CommissionCountMax;
	}

	public void setCommissionCountMax(int commissionCountMax) {
		CommissionCountMax = commissionCountMax;
	}

	public int getCashCouponUseMax() {
		return CashCouponUseMax;
	}

	public void setCashCouponUseMax(int cashCouponUseMax) {
		CashCouponUseMax = cashCouponUseMax;
	}

	public BigDecimal getCommissionPrice() {
		return CommissionPrice;
	}

	public void setCommissionPrice(BigDecimal commissionPrice) {
		CommissionPrice = commissionPrice;
	}

	public int getSettleDateEarly() {
		return SettleDateEarly;
	}

	public void setSettleDateEarly(int settleDateEarly) {
		SettleDateEarly = settleDateEarly;
	}

	public int getSettleDateLate() {
		return SettleDateLate;
	}

	public void setSettleDateLate(int settleDateLate) {
		SettleDateLate = settleDateLate;
	}

	public int getDrawCountMax() {
		return DrawCountMax;
	}

	public void setDrawCountMax(int drawCountMax) {
		DrawCountMax = drawCountMax;
	}

	public BigDecimal getCheckCodePrice() {
		return checkCodePrice;
	}

	public void setCheckCodePrice(BigDecimal checkCodePrice) {
		this.checkCodePrice = checkCodePrice;
	}

	public int getCheckCodeDateEarly() {
		return checkCodeDateEarly;
	}

	public void setCheckCodeDateEarly(int checkCodeDateEarly) {
		this.checkCodeDateEarly = checkCodeDateEarly;
	}

	public int getCheckCodeDateLate() {
		return checkCodeDateLate;
	}

	public void setCheckCodeDateLate(int checkCodeDateLate) {
		this.checkCodeDateLate = checkCodeDateLate;
	}

	public int getCheckCodeMax() {
		return checkCodeMax;
	}

	public void setCheckCodeMax(int checkCodeMax) {
		this.checkCodeMax = checkCodeMax;
	}

	public BigDecimal getFirstPrice() {
		return firstPrice;
	}

	public void setFirstPrice(BigDecimal firstPrice) {
		this.firstPrice = firstPrice;
	}

	public int getFirstDateEarly() {
		return firstDateEarly;
	}

	public void setFirstDateEarly(int firstDateEarly) {
		this.firstDateEarly = firstDateEarly;
	}

	public int getFirstDateLate() {
		return firstDateLate;
	}

	public void setFirstDateLate(int firstDateLate) {
		this.firstDateLate = firstDateLate;
	}

	public int getFirstMax() {
		return firstMax;
	}

	public void setFirstMax(int firstMax) {
		this.firstMax = firstMax;
	}

	public BigDecimal getRegistPrice() {
		return registPrice;
	}

	public void setRegistPrice(BigDecimal registPrice) {
		this.registPrice = registPrice;
	}

	public int getRegistType() {
		return registType;
	}

	public void setRegistType(int registType) {
		this.registType = registType;
	}

	public int getRegistMax() {
		return registMax;
	}

	public void setRegistMax(int registMax) {
		this.registMax = registMax;
	}

	public int getCommissionDailyMax()
	{
		return CommissionDailyMax;
	}

	public void setCommissionDailyMax(int commissionDailyMax)
	{
		CommissionDailyMax = commissionDailyMax;
	}

	public BigDecimal getCommissionRatio()
	{
		return CommissionRatio;
	}

	public void setCommissionRatio(BigDecimal commissionRatio)
	{
		CommissionRatio = commissionRatio;
	}

	public BigDecimal getCommissionRatioLimit()
	{
		return CommissionRatioLimit;
	}

	public void setCommissionRatioLimit(BigDecimal commissionRatioLimit)
	{
		CommissionRatioLimit = commissionRatioLimit;
	}

	public int getCommissionType()
	{
		return CommissionType;
	}

	public void setCommissionType(int commissionType)
	{
		CommissionType = commissionType;
	}

	public BigDecimal getGoodsRatio() {
		return goodsRatio;
	}

	public void setGoodsRatio(BigDecimal goodsRatio) {
		this.goodsRatio = goodsRatio;
	}

	public BigDecimal getGoodsMinimumPrice() {
		return goodsMinimumPrice;
	}

	public void setGoodsMinimumPrice(BigDecimal goodsMinimumPrice) {
		this.goodsMinimumPrice = goodsMinimumPrice;
	}

	public BigDecimal getGoodsPriceLimit() {
		return goodsPriceLimit;
	}

	public void setGoodsPriceLimit(BigDecimal goodsPriceLimit) {
		this.goodsPriceLimit = goodsPriceLimit;
	}

	public int getUseUserType() {
		return useUserType;
	}

	public void setUseUserType(int useUserType) {
		this.useUserType = useUserType;
	}

	public List<Integer> getUserList() {
		return userList;
	}

	public void setUserList(List<Integer> userList) {
		this.userList = userList;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
	}

	public String getUserIdsStr() {
		return userIdsStr;
	}

	public void setUserIdsStr(String userIdsStr) {
		this.userIdsStr = userIdsStr;
	}

	public String getUserAccountsStr() {
		return userAccountsStr;
	}

	public void setUserAccountsStr(String userAccountsStr) {
		this.userAccountsStr = userAccountsStr;
	}
}
