/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rcdfc198Type;
import tw.gov.moi.domain.Rrdfr198Type;

/**
 * 戶政管理服務案件統計表saveDTO.
 * 
 * @author Derek Wang
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl08181SaveDTO", propOrder = { "statisticYyymmdd", "siteId", "areaCode", "adminOfficeCode",
        "dissembleMoving", "nonSettling", "dupSettling", "noHouseholdReg", "lawlessIdCard", "officialDoc",
        "blankIdFilm", "blankId", "blankIdFilmDamage", "blankIdDamage", "idCard1", "idCard2", "idCard3", "idCard4",
        "telephone", "atHome", "mail", "homeServiceCheck", "idCardConfirm", "webOrder", "idCardLoss",
        "naturalPersonsEvidence", "windowNo", "inform1stNo", "dataObjRR198", "dataObjRC198" })
@XmlRootElement(name = "Rl08181SaveDTO")
public class Rl08181SaveDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 統計日期. */
    @XmlElement(name = "StatisticYyymmdd", required = false)
    @FieldName("統計日期")
    private String statisticYyymmdd;

    /** 作業點代碼. */
    @XmlElement(name = "SiteId", required = false)
    @FieldName("作業點代碼 ")
    private String siteId;

    /** 行政區域代碼. */
    @XmlElement(name = "AreaCode", required = false)
    @FieldName("行政區域代碼")
    private String areaCode;

    /** 戶所代碼. */
    @XmlElement(name = "AdminOfficeCode", required = false)
    @FieldName("戶所代碼")
    private String adminOfficeCode;

    /** 虛報遷入(出). */
    @XmlElement(name = "DissembleMoving", required = false)
    @FieldName("虛報遷入(出)")
    private String dissembleMoving;

    /** 無戶籍人口. */
    @XmlElement(name = "Nonsettling", required = false)
    @FieldName("無戶籍人口")
    private String nonsettling;

    /** 重複戶籍. */
    @XmlElement(name = "Dupsettling", required = false)
    @FieldName("重複戶籍")
    private String dupsettling;

    /** 未接受戶籍校正. */
    @XmlElement(name = "NoHouseholdReg", required = false)
    @FieldName("未接受戶籍校正")
    private String noHouseholdReg;

    /** 發現不法取得、冒用、變造國民身分證. */
    @XmlElement(name = "LawlessIdCard", required = false)
    @FieldName("發現不法取得、冒用、變造國民身分證")
    private String lawlessIdCard;

    /** 受理公文件數. */
    @XmlElement(name = "OfficialDoc", required = false)
    @FieldName("受理公文件數")
    private String officialDoc;

    /** 空白身分證-膠膜存量. */
    @XmlElement(name = "BlankIdFilm", required = false)
    @FieldName("空白身分證-膠膜存量")
    private String blankIdFilm;

    /** 空白身分證-空白證存量. */
    @XmlElement(name = "BlankId", required = false)
    @FieldName("空白身分證-空白證存量")
    private String blankId;

    /** 空白身分證-膠膜毀損. */
    @XmlElement(name = "BlankIdFilmDamage", required = false)
    @FieldName("空白身分證-膠膜毀損")
    private String blankIdFilmDamage;

    /** 空白身分證-空白證毀損. */
    @XmlElement(name = "BlankIdDamage", required = false)
    @FieldName("空白身分證-空白證毀損")
    private String blankIdDamage;

    /** 未領(換)國民身分證-初領. */
    @XmlElement(name = "IdCard1", required = false)
    @FieldName("未領(換)國民身分證-初領")
    private String idCard1;

    /** 未領(換)國民身分證-補領. */
    @XmlElement(name = "IdCard2", required = false)
    @FieldName("未領(換)國民身分證-補領")
    private String idCard2;

    /** 未領(換)國民身分證-換領. */
    @XmlElement(name = "IdCard3", required = false)
    @FieldName("未領(換)國民身分證-換領")
    private String idCard3;

    /** 未領(換)國民身分證-全面換證. */
    @XmlElement(name = "IdCard4", required = false)
    @FieldName("未領(換)國民身分證-全面換證")
    private String idCard4;

    /** 電話傳真申請. */
    @XmlElement(name = "Telephone", required = false)
    @FieldName("電話傳真申請")
    private String telephone;

    /** 派員到府. */
    @XmlElement(name = "AtHome", required = false)
    @FieldName("派員到府 ")
    private String atHome;

    /** 通信申請. */
    @XmlElement(name = "Mail", required = false)
    @FieldName("通信申請")
    private String mail;

    /** 派員查明居住事實. */
    @XmlElement(name = "HomeServiceCheck", required = false)
    @FieldName("派員查明居住事實")
    private String homeServiceCheck;

    /** 辦理護照人別確認. */
    @XmlElement(name = "IdCardConfirm", required = false)
    @FieldName("辦理護照人別確認")
    private String idCardConfirm;

    /** 辦理自然人憑證. */
    @XmlElement(name = "NaturalPersonsEvidence", required = false)
    @FieldName("辦理自然人憑證")
    private String naturalPersonsEvidence;

    /** 網路預約辦理戶籍登記. */
    @XmlElement(name = "WebOrder", required = false)
    @FieldName("網路預約辦理戶籍登記")
    private String webOrder;

    /** 國民身分證掛失(含撤銷). */
    @XmlElement(name = "IdCardLoss", required = false)
    @FieldName("國民身分證掛失(含撤銷)")
    private String idCardLoss;

    /** 設置服務窗口. */
    @XmlElement(name = "WindowNo", required = false)
    @FieldName("設置服務窗口")
    private String windowNo;

    /** 填發一次告知單. */
    @XmlElement(name = "Inform1stNo", required = false)
    @FieldName("填發一次告知單")
    private String inform1stNo;

    /** dataObjRR198. */
    @XmlElement(name = "DataObjRR198", required = false)
    @FieldName("dataObjRR198")
    private Rrdfr198Type dataObjRR198;

    /** dataObjRC198. */
    @XmlElement(name = "DataObjRC198", required = false)
    @FieldName("dataObjRC198")
    private Rcdfc198Type dataObjRC198;

    /**
     * Gets the statistic yyymmdd.
     * 
     * @return the statistic yyymmdd
     */
    public String getStatisticYyymmdd() {
        return statisticYyymmdd;
    }

    /**
     * Sets the statistic yyymmdd.
     * 
     * @param statisticYyymmdd
     *            the new statistic yyymmdd
     */
    public void setStatisticYyymmdd(String statisticYyymmdd) {
        this.statisticYyymmdd = statisticYyymmdd;
    }

    /**
     * Gets the site id.
     * 
     * @return the site id
     */
    public String getSiteId() {
        return siteId;
    }

    /**
     * Sets the site id.
     * 
     * @param siteId
     *            the new site id
     */
    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    /**
     * Gets the area code.
     * 
     * @return the area code
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * Sets the area code.
     * 
     * @param areaCode
     *            the new area code
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    /**
     * Gets the admin office code.
     * 
     * @return the admin office code
     */
    public String getAdminOfficeCode() {
        return adminOfficeCode;
    }

    /**
     * Sets the admin office code.
     * 
     * @param adminOfficeCode
     *            the new admin office code
     */
    public void setAdminOfficeCode(String adminOfficeCode) {
        this.adminOfficeCode = adminOfficeCode;
    }

    /**
     * Gets the dissemble moving.
     * 
     * @return the dissemble moving
     */
    public String getDissembleMoving() {
        return dissembleMoving;
    }

    /**
     * Sets the dissemble moving.
     * 
     * @param dissembleMoving
     *            the new dissemble moving
     */
    public void setDissembleMoving(String dissembleMoving) {
        this.dissembleMoving = dissembleMoving;
    }

    /**
     * Gets the nonsettling.
     * 
     * @return the nonsettling
     */
    public String getNonsettling() {
        return nonsettling;
    }

    /**
     * Sets the nonsettling.
     * 
     * @param nonsettling
     *            the new nonsettling
     */
    public void setNonsettling(String nonsettling) {
        this.nonsettling = nonsettling;
    }

    /**
     * Gets the dupsettling.
     * 
     * @return the dupsettling
     */
    public String getDupsettling() {
        return dupsettling;
    }

    /**
     * Sets the dupsettling.
     * 
     * @param dupsettling
     *            the new dupsettling
     */
    public void setDupsettling(String dupsettling) {
        this.dupsettling = dupsettling;
    }

    /**
     * Gets the no household reg.
     * 
     * @return the no household reg
     */
    public String getNoHouseholdReg() {
        return noHouseholdReg;
    }

    /**
     * Sets the no household reg.
     * 
     * @param noHouseholdReg
     *            the new no household reg
     */
    public void setNoHouseholdReg(String noHouseholdReg) {
        this.noHouseholdReg = noHouseholdReg;
    }

    /**
     * Gets the lawless id card.
     * 
     * @return the lawless id card
     */
    public String getLawlessIdCard() {
        return lawlessIdCard;
    }

    /**
     * Sets the lawless id card.
     * 
     * @param lawlessIdCard
     *            the new lawless id card
     */
    public void setLawlessIdCard(String lawlessIdCard) {
        this.lawlessIdCard = lawlessIdCard;
    }

    /**
     * Gets the official doc.
     * 
     * @return the official doc
     */
    public String getOfficialDoc() {
        return officialDoc;
    }

    /**
     * Sets the official doc.
     * 
     * @param officialDoc
     *            the new official doc
     */
    public void setOfficialDoc(String officialDoc) {
        this.officialDoc = officialDoc;
    }

    /**
     * Gets the blank id film.
     * 
     * @return the blank id film
     */
    public String getBlankIdFilm() {
        return blankIdFilm;
    }

    /**
     * Sets the blank id film.
     * 
     * @param blankIdFilm
     *            the new blank id film
     */
    public void setBlankIdFilm(String blankIdFilm) {
        this.blankIdFilm = blankIdFilm;
    }

    /**
     * Gets the blank id.
     * 
     * @return the blank id
     */
    public String getBlankId() {
        return blankId;
    }

    /**
     * Sets the blank id.
     * 
     * @param blankId
     *            the new blank id
     */
    public void setBlankId(String blankId) {
        this.blankId = blankId;
    }

    /**
     * Gets the blank id film damage.
     * 
     * @return the blank id film damage
     */
    public String getBlankIdFilmDamage() {
        return blankIdFilmDamage;
    }

    /**
     * Sets the blank id film damage.
     * 
     * @param blankIdFilmDamage
     *            the new blank id film damage
     */
    public void setBlankIdFilmDamage(String blankIdFilmDamage) {
        this.blankIdFilmDamage = blankIdFilmDamage;
    }

    /**
     * Gets the blank id damage.
     * 
     * @return the blank id damage
     */
    public String getBlankIdDamage() {
        return blankIdDamage;
    }

    /**
     * Sets the blank id damage.
     * 
     * @param blankIdDamage
     *            the new blank id damage
     */
    public void setBlankIdDamage(String blankIdDamage) {
        this.blankIdDamage = blankIdDamage;
    }

    /**
     * Gets the id card1.
     * 
     * @return the id card1
     */
    public String getIdCard1() {
        return idCard1;
    }

    /**
     * Sets the id card1.
     * 
     * @param idCard1
     *            the new id card1
     */
    public void setIdCard1(String idCard1) {
        this.idCard1 = idCard1;
    }

    /**
     * Gets the id card2.
     * 
     * @return the id card2
     */
    public String getIdCard2() {
        return idCard2;
    }

    /**
     * Sets the id card2.
     * 
     * @param idCard2
     *            the new id card2
     */
    public void setIdCard2(String idCard2) {
        this.idCard2 = idCard2;
    }

    /**
     * Gets the id card3.
     * 
     * @return the id card3
     */
    public String getIdCard3() {
        return idCard3;
    }

    /**
     * Sets the id card3.
     * 
     * @param idCard3
     *            the new id card3
     */
    public void setIdCard3(String idCard3) {
        this.idCard3 = idCard3;
    }

    /**
     * Gets the id card4.
     * 
     * @return the id card4
     */
    public String getIdCard4() {
        return idCard4;
    }

    /**
     * Sets the id card4.
     * 
     * @param idCard4
     *            the new id card4
     */
    public void setIdCard4(String idCard4) {
        this.idCard4 = idCard4;
    }

    /**
     * Gets the telephone.
     * 
     * @return the telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * Sets the telephone.
     * 
     * @param telephone
     *            the new telephone
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * Gets the at home.
     * 
     * @return the at home
     */
    public String getAtHome() {
        return atHome;
    }

    /**
     * Sets the at home.
     * 
     * @param atHome
     *            the new at home
     */
    public void setAtHome(String atHome) {
        this.atHome = atHome;
    }

    /**
     * Gets the mail.
     * 
     * @return the mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * Sets the mail.
     * 
     * @param mail
     *            the new mail
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * Gets the home service check.
     * 
     * @return the home service check
     */
    public String getHomeServiceCheck() {
        return homeServiceCheck;
    }

    /**
     * Sets the home service check.
     * 
     * @param homeServiceCheck
     *            the new home service check
     */
    public void setHomeServiceCheck(String homeServiceCheck) {
        this.homeServiceCheck = homeServiceCheck;
    }

    /**
     * Gets the id card confirm.
     * 
     * @return the id card confirm
     */
    public String getIdCardConfirm() {
        return idCardConfirm;
    }

    /**
     * Sets the id card confirm.
     * 
     * @param idCardConfirm
     *            the new id card confirm
     */
    public void setIdCardConfirm(String idCardConfirm) {
        this.idCardConfirm = idCardConfirm;
    }

    /**
     * Gets the natural persons evidence.
     * 
     * @return the natural persons evidence
     */
    public String getNaturalPersonsEvidence() {
        return naturalPersonsEvidence;
    }

    /**
     * Sets the natural persons evidence.
     * 
     * @param naturalPersonsEvidence
     *            the new natural persons evidence
     */
    public void setNaturalPersonsEvidence(String naturalPersonsEvidence) {
        this.naturalPersonsEvidence = naturalPersonsEvidence;
    }

    /**
     * Gets the web order.
     * 
     * @return the web order
     */
    public String getWebOrder() {
        return webOrder;
    }

    /**
     * Sets the web order.
     * 
     * @param webOrder
     *            the new web order
     */
    public void setWebOrder(String webOrder) {
        this.webOrder = webOrder;
    }

    /**
     * Gets the id card loss.
     * 
     * @return the id card loss
     */
    public String getIdCardLoss() {
        return idCardLoss;
    }

    /**
     * Sets the id card loss.
     * 
     * @param idCardLoss
     *            the new id card loss
     */
    public void setIdCardLoss(String idCardLoss) {
        this.idCardLoss = idCardLoss;
    }

    /**
     * Gets the window no.
     * 
     * @return the window no
     */
    public String getWindowNo() {
        return windowNo;
    }

    /**
     * Sets the window no.
     * 
     * @param windowNo
     *            the new window no
     */
    public void setWindowNo(String windowNo) {
        this.windowNo = windowNo;
    }

    /**
     * Gets the inform1st no.
     * 
     * @return the inform1st no
     */
    public String getInform1stNo() {
        return inform1stNo;
    }

    /**
     * Sets the inform1st no.
     * 
     * @param inform1stNo
     *            the new inform1st no
     */
    public void setInform1stNo(String inform1stNo) {
        this.inform1stNo = inform1stNo;
    }

    /**
     * Gets the data obj r r198.
     * 
     * @return the data obj r r198
     */
    public Rrdfr198Type getDataObjRR198() {
        return dataObjRR198;
    }

    /**
     * Sets the data obj r r198.
     * 
     * @param dataObjRR198
     *            the new data obj r r198
     */
    public void setDataObjRR198(Rrdfr198Type dataObjRR198) {
        this.dataObjRR198 = dataObjRR198;
    }

    /**
     * Gets the data obj r c198.
     * 
     * @return the data obj r c198
     */
    public Rcdfc198Type getDataObjRC198() {
        return dataObjRC198;
    }

    /**
     * Sets the data obj r c198.
     * 
     * @param dataObjRC198
     *            the new data obj r c198
     */
    public void setDataObjRC198(Rcdfc198Type dataObjRC198) {
        this.dataObjRC198 = dataObjRC198;
    }

    // /** 未領(換)國民身分證 */
    // @XmlElement(name = "Idcard", required = false)
    // @FieldName("未領(換)國民身分證 ")
    // private String idcard;
    //
    // /** 拒絕接受戶口調查 */
    // @XmlElement(name = "Noncheckup", required = false)
    // @FieldName("拒絕接受戶口調查 ")
    // private String noncheckup;
    //
    // /** 逾期申報出生 */
    // @XmlElement(name = "Birth", required = false)
    // @FieldName("逾期申報出生")
    // private String birth;
    //
    // /** 逾期申報死亡 */
    // @XmlElement(name = "Dead", required = false)
    // @FieldName("逾期申報死亡")
    // private String dead;
    //
    // /** 逾期申報認領 */
    // @XmlElement(name = "Recognize", required = false)
    // @FieldName("逾期申報認領")
    // private String recognize;
    //
    // /** 逾期申報遷入(出) */
    // @XmlElement(name = "Moving", required = false)
    // @FieldName("逾期申報遷入(出)")
    // private String moving;
    //
    // /** 逾期申報結(離)婚 */
    // @XmlElement(name = "MarryDivorse", required = false)
    // @FieldName("逾期申報結(離)婚")
    // private String marryDivorse;
    //
    // /** 其他逾期申報戶籍事項變更 */
    // @XmlElement(name = "OtherRegister", required = false)
    // @FieldName("其他逾期申報戶籍事項變更")
    // private String otherRegister;
    //
    // /** 逾期申報收養(終止收養) */
    // @XmlElement(name = "AdoptEndadopt", required = false)
    // @FieldName("逾期申報收養(終止收養)")
    // private String adoptEndadopt;
    //
    // /** 逾期申報監護 */
    // @XmlElement(name = "Protect", required = false)
    // @FieldName("逾期申報監護")
    // private String protect;
    //
    // /** 逾期申報初設戶籍 */
    // @XmlElement(name = "FirstSettling", required = false)
    // @FieldName("逾期申報初設戶籍")
    // private String firstSettling;
    //
    // /** 其他便民服務 */
    // @XmlElement(name = "OtherService", required = false)
    // @FieldName("其他便民服務")
    // private String otherService;

}
