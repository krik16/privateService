package com.rongyi.easy.entity;

import java.util.Date;

import org.bson.types.ObjectId;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

/**
 * 容易网统一用户信息
 * @author baodk
 */
@Entity(value = "rmc_ru_users", noClassnameStored = true)
public class RuUsersDel {

    @Id
    private ObjectId id;
    
    /** 身份证号 */
    private String identify;
  
    /** 手机号1 */
    private String phone1;
    
    /** 手机号2 */
    private String phone2;
    
    /** 手机号3 */
    private String phone3;
    
    /** 固定电话 */
    private String telephone;
    
    /** 邮箱 */
    private String email;
    
    /** qq号 */
    private String qq;
    
    /** 微博id */
    @Property("weibo_id")
    private String weiboId;
    
    /** 微信id */
    @Property("weixin_id")
    private String weixinId;
    
    /** 车牌号 */
    @Property("car_license")
    private String carLicense;
    
    /** 所属国家 */
    private String country;
    
    /** 省 */
    private String province;
    
    /** 市 */
    private String city;
    
    /** 区 */
    private String town;
   
    /** 街道 */
    private String street;
    
    /** 门牌号 */
    private String doorplate;
    
    /** 邮编 */
    @Property("zip_code")
    private String zipCode;
    
    /** 注册渠道唯一ID（容易网摩生活，容易网微信，商场微信，商场终端，商场App等）*/
    @Property("registration_method")
    private String registrationMethod;
    
    /** 首次注册日期（容易网首次登记日期） */
    @Property("first_login_time")
    private Date firstLoginTime;
    
    /** 真实姓名 */
    private String name;
    
    /** 出生年 */
    @Property("birth_year")
    private String birthYear;
    
    /** 出生月 */
    @Property("birth_month")
    private String birthMonth;
    
    /** 出生日 */
    @Property("birth_day")
    private String birthDay;
    
    /** 性别*/
    private String sex;
    
    /** 关联银行1 */
    private String bank1;
    
    /** 银行1账号 */
    @Property("card_num1")
    private String cardNum1;
    
    /** 关联银行2 */
    private String bank2;
    
    /** 银行2账号 */
    @Property("card_num2")
    private String cardNum2;

    /** 关联银行3 */
    private String bank3;
    
    /** 银行3账号 */
    @Property("card_num3")
    private String cardNum3;
    
    /** 关联支付宝账号 */
    @Property("alipay_num")
    private String alipayNum;
 
    /** 关联财付通账号 */
    @Property("tenpay_num")
    private String tenpayNum;
    
    /** 个人月收入 */
    @Property("personal_month_income")
    private Double personalMonthIncome;
    
    /** 家庭月收入 */
    @Property("family_month_income")
    private Double familyMonthIncome;
 
    /** 职业 */
    private String job;
    
    /** 行业 */
    private String industry;
    
    /** 工作单位 */
    private String company;
    
    /** 婚姻状况 */
    private Boolean married;
    
    /** 关联摩生活ID */
    @Property("mall_life_id")
    private String mallLifeId;
    
    /** 父亲id */
    @Property("father_id")
    private String fatherId;
    
    /** 母亲id */
    @Property("mother_id")
    private String motherId;
    
    /** 伴侣id */
    @Property("parter_id")
    private String parterId;

    /** 关联owner（服务商+商场ID） */
    private String owner;
    
    /** vip会员编号1 */
    @Property("vip_num1")
    private String vipNum1;

    /** vip会员编号2 */
    @Property("vip_num2")
    
    private String vipNum2;
    
    /** vip会员编号3 */
    @Property("vip_num3")
    private String vipNum3;

    public ObjectId getId() {
        return id;
    }
    
    public void setId(ObjectId id) {
        this.id = id;
    }
    
    
    public String getSex() {
        return sex;
    }

    
    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIdentify() {
        return identify;
    }

    public void setIdentify(String identify) {
        this.identify = identify;
    }
    
    public String getPhone1() {
        return phone1;
    }
    
    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }
    
    public String getPhone3() {
        return phone3;
    }
    
    public void setPhone3(String phone3) {
        this.phone3 = phone3;
    }
    
    public String getTelephone() {
        return telephone;
    }
    
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
    public String getQq() {
        return qq;
    }
    
    public void setQq(String qq) {
        this.qq = qq;
    }
    
    public String getCountry() {
        return country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }
    
    public String getProvince() {
        return province;
    }
    
    public void setProvince(String province) {
        this.province = province;
    }
    
    public String getCity() {
        return city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }
    
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDoorplate() {
        return doorplate;
    }

    public void setDoorplate(String doorplate) {
        this.doorplate = doorplate;
    }

    public String getZipCode() {
        return zipCode;
    }
    
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getRegistrationMethod() {
        return registrationMethod;
    }

    public void setRegistrationMethod(String registrationMethod) {
        this.registrationMethod = registrationMethod;
    }
    
    public Date getFirstLoginTime() {
        return firstLoginTime;
    }

    public void setFirstLoginTime(Date firstLoginTime) {
        this.firstLoginTime = firstLoginTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public String getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(String birthMonth) {
        this.birthMonth = birthMonth;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

  
    public String getBank1() {
        return bank1;
    }

    public void setBank1(String bank1) {
        this.bank1 = bank1;
    }

    public String getCardNum1() {
        return cardNum1;
    }
    
    public void setCardNum1(String cardNum1) {
        this.cardNum1 = cardNum1;
    }

    public String getBank2() {
        return bank2;
    }
    
    public void setBank2(String bank2) {
        this.bank2 = bank2;
    }
    
    public String getCardNum2() {
        return cardNum2;
    }
    
    public void setCardNum2(String cardNum2) {
        this.cardNum2 = cardNum2;
    }

    public String getBank3() {
        return bank3;
    }
    
    public void setBank3(String bank3) {
        this.bank3 = bank3;
    }
    
    public String getCardNum3() {
        return cardNum3;
    }

    public void setCardNum3(String cardNum3) {
        this.cardNum3 = cardNum3;
    }

    public String getAlipayNum() {
        return alipayNum;
    }

    public void setAlipayNum(String alipayNum) {
        this.alipayNum = alipayNum;
    }

    public String getTenpayNum() {
        return tenpayNum;
    }

    public void setTenpayNum(String tenpayNum) {
        this.tenpayNum = tenpayNum;
    }

    public Double getPersonalMonthIncome() {
        return personalMonthIncome;
    }
    
    public void setPersonalMonthIncome(Double personalMonthIncome) {
        this.personalMonthIncome = personalMonthIncome;
    }
    
    public Double getFamilyMonthIncome() {
        return familyMonthIncome;
    }
    
    public void setFamilyMonthIncome(Double familyMonthIncome) {
        this.familyMonthIncome = familyMonthIncome;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
    
    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }
    
    public String getCompany() {
        return company;
    }
    
    public void setCompany(String company) {
        this.company = company;
    }

    public Boolean getMarried() {
        return married;
    }

    public void setMarried(Boolean married) {
        this.married = married;
    }

    public String getMallLifeId() {
        return mallLifeId;
    }

    public void setMallLifeId(String mallLifeId) {
        this.mallLifeId = mallLifeId;
    }

    public String getFatherId() {
        return fatherId;
    }
    
    public void setFatherId(String fatherId) {
        this.fatherId = fatherId;
    }
    
    public String getMotherId() {
        return motherId;
    }
    
    public void setMotherId(String motherId) {
        this.motherId = motherId;
    }
    
    public String getParterId() {
        return parterId;
    }
    
    public void setParterId(String parterId) {
        this.parterId = parterId;
    }
    
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    
    public String getVipNum1() {
        return vipNum1;
    }

    public void setVipNum1(String vipNum1) {
        this.vipNum1 = vipNum1;
    }
    
    public String getVipNum2() {
        return vipNum2;
    }

    public void setVipNum2(String vipNum2) {
        this.vipNum2 = vipNum2;
    }
    
    public String getVipNum3() {
        return vipNum3;
    }

    public void setVipNum3(String vipNum3) {
        this.vipNum3 = vipNum3;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWeiboId() {
        return weiboId;
    }

    public void setWeiboId(String weiboId) {
        this.weiboId = weiboId;
    }
    
    public String getWeixinId() {
        return weixinId;
    }

    public void setWeixinId(String weixinId) {
        this.weixinId = weixinId;
    }

    public String getCarLicense() {
        return carLicense;
    }
    
    public void setCarLicense(String carLicense) {
        this.carLicense = carLicense;
    }

    @Override
    public String toString() {
        return "RuUsers [id=" + id + ", identify=" + identify + ", phone1=" + phone1 + ", phone2=" + phone2
                + ", phone3=" + phone3 + ", telephone=" + telephone + ", email=" + email + ", qq=" + qq + ", weiboId="
                + weiboId + ", weixinId=" + weixinId + ", carLicense=" + carLicense + ", country=" + country
                + ", province=" + province + ", city=" + city + ", town=" + town + ", street=" + street
                + ", doorplate=" + doorplate + ", zipCode=" + zipCode + ", registrationMethod=" + registrationMethod
                + ", firstLoginTime=" + firstLoginTime + ", name=" + name + ", birthYear=" + birthYear
                + ", birthMonth=" + birthMonth + ", birthDay=" + birthDay + ", sex=" + sex + ", bank1=" + bank1
                + ", cardNum1=" + cardNum1 + ", bank2=" + bank2 + ", cardNum2=" + cardNum2 + ", bank3=" + bank3
                + ", cardNum3=" + cardNum3 + ", alipayNum=" + alipayNum + ", tenpayNum=" + tenpayNum
                + ", personalMonthIncome=" + personalMonthIncome + ", familyMonthIncome=" + familyMonthIncome
                + ", job=" + job + ", industry=" + industry + ", company=" + company + ", married=" + married
                + ", mallLifeId=" + mallLifeId + ", fatherId=" + fatherId + ", motherId=" + motherId + ", parterId="
                + parterId + ", owner=" + owner + ", vipNum1=" + vipNum1 + ", vipNum2=" + vipNum2 + ", vipNum3="
                + vipNum3 + "]";
    }
    
}

