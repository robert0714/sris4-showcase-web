/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01828AppDataDTO", propOrder = { "registerDate", "registerTime", "livingStyleCode", "livingRaceType",
        "orgLivingStyleCode", "orgLivingRaceType", "acceptAdminOfficeCode", "registerContent", "enforcedFlag",
        "orgEducationMark", "orgApplyReasonCode", "revokeReason", "revokeYyymmdd", "certificateList",
        "otherCertificate", "bookFlag", "personForeignFlag", "nameRomanization", "outliveCaseFlag" })
@XmlRootElement(name = "Rl01828AppDataDTO")
public class Rl01828AppDataDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 登記日期 */
    @FieldName("登記日期")
    @XmlElement(name = "RegisterDate", required = false)
    private String registerDate;

    /** 登記時間 */
    @FieldName("登記時間")
    @XmlElement(name = "RegisterTime", required = false)
    private String registerTime;

    /** 撤銷後原住民身分代碼 */
    @FieldName("撤銷後原住民身分代碼")
    @XmlElement(name = "LivingStyleCode", required = false)
    private String livingStyleCode;

    /** 撤銷後族別代碼 */
    @FieldName("撤銷後族別代碼")
    @XmlElement(name = "LivingRaceType", required = false)
    private String livingRaceType;

    /** 原原住民身分代碼 */
    @FieldName("原原住民身分代碼")
    @XmlElement(name = "OrgLivingStyleCode", required = false)
    private String orgLivingStyleCode;

    /** 原族別代碼 */
    @FieldName("原族別代碼")
    @XmlElement(name = "OrgLivingRaceType", required = false)
    private String orgLivingRaceType;

    /** 受理地作業點代碼 */
    @FieldName("受理地作業點代碼")
    @XmlElement(name = "AcceptAdminOfficeCode", required = false)
    private String acceptAdminOfficeCode;

    /** 申請書備註 */
    @FieldName("申請書備註")
    @XmlElement(name = "RegisterContent", required = false)
    private String registerContent;

    /** 逕為登記旗標 */
    @FieldName("逕為登記旗標")
    @XmlElement(name = "EnforcedFlag", required = false)
    private String enforcedFlag;

    /** 教育程度註記 */
    @FieldName("教育程度註記")
    @XmlElement(name = "OrgEducationMark", required = false)
    private String orgEducationMark;

    /** 申請事由代碼 */
    @FieldName("申請事由代碼")
    @XmlElement(name = "OrgApplyReasonCode", required = false)
    private String orgApplyReasonCode;

    /** 撤銷原因 */
    @FieldName("撤銷原因")
    @XmlElement(name = "RevokeReason", required = false)
    private String revokeReason;

    /** 撤銷日期 */
    @FieldName("撤銷日期")
    @XmlElement(name = "RevokeYyymmdd", required = false)
    private String revokeYyymmdd;

    /** 附繳證件 */
    @FieldName("附繳證件")
    @XmlElement(name = "CertificateList", required = false)
    private List<String> certificateList = new ArrayList<String>();

    /** 其他附繳證件 */
    @FieldName("其他附繳證件")
    @XmlElement(name = "OteherCertificate", required = false)
    private String otherCertificate;

    /** 當事人簿頁旗標 */
    @FieldName("當事人簿頁旗標")
    @XmlElement(name = "BookFlag", required = false)
    private String bookFlag;

    /** 當事人統號是否為外籍者 */
    @FieldName("當事人統號是否為外籍者")
    @XmlElement(name = "PersonForeignFlag", required = false)
    private String personForeignFlag;

    /** 姓名羅馬拼音 */
    @FieldName("姓名羅馬拼音")
    @XmlElement(name = "NameRomanization", required = false)
    private String nameRomanization;

    /** 非現住人口處理註記 */
    @FieldName("非現住人口處理註記")
    @XmlElement(name = "OutliveCaseFlag", required = false)
    private String outliveCaseFlag;

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public String getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
    }

    public String getLivingStyleCode() {
        return livingStyleCode;
    }

    public void setLivingStyleCode(String livingStyleCode) {
        this.livingStyleCode = livingStyleCode;
    }

    public String getLivingRaceType() {
        return livingRaceType;
    }

    public void setLivingRaceType(String livingRaceType) {
        this.livingRaceType = livingRaceType;
    }

    public String getOrgLivingStyleCode() {
        return orgLivingStyleCode;
    }

    public void setOrgLivingStyleCode(String orgLivingStyleCode) {
        this.orgLivingStyleCode = orgLivingStyleCode;
    }

    public String getOrgLivingRaceType() {
        return orgLivingRaceType;
    }

    public void setOrgLivingRaceType(String orgLivingRaceType) {
        this.orgLivingRaceType = orgLivingRaceType;
    }

    public String getAcceptAdminOfficeCode() {
        return acceptAdminOfficeCode;
    }

    public void setAcceptAdminOfficeCode(String acceptAdminOfficeCode) {
        this.acceptAdminOfficeCode = acceptAdminOfficeCode;
    }

    public String getRegisterContent() {
        return registerContent;
    }

    public void setRegisterContent(String registerContent) {
        this.registerContent = registerContent;
    }

    public String getEnforcedFlag() {
        return enforcedFlag;
    }

    public void setEnforcedFlag(String enforcedFlag) {
        this.enforcedFlag = enforcedFlag;
    }

    public String getOrgEducationMark() {
        return orgEducationMark;
    }

    public void setOrgEducationMark(String orgEducationMark) {
        this.orgEducationMark = orgEducationMark;
    }

    public String getOrgApplyReasonCode() {
        return orgApplyReasonCode;
    }

    public void setOrgApplyReasonCode(String orgApplyReasonCode) {
        this.orgApplyReasonCode = orgApplyReasonCode;
    }

    public String getRevokeReason() {
        return revokeReason;
    }

    public void setRevokeReason(String revokeReason) {
        this.revokeReason = revokeReason;
    }

    public String getRevokeYyymmdd() {
        return revokeYyymmdd;
    }

    public void setRevokeYyymmdd(String revokeYyymmdd) {
        this.revokeYyymmdd = revokeYyymmdd;
    }

    public List<String> getCertificateList() {
        return certificateList;
    }

    public void setCertificateList(List<String> certificateList) {
        this.certificateList = certificateList;
    }

    public String getOtherCertificate() {
        return otherCertificate;
    }

    public void setOtherCertificate(String otherCertificate) {
        this.otherCertificate = otherCertificate;
    }

    public String getBookFlag() {
        return bookFlag;
    }

    public void setBookFlag(String bookFlag) {
        this.bookFlag = bookFlag;
    }

    public String getPersonForeignFlag() {
        return personForeignFlag;
    }

    public void setPersonForeignFlag(String personForeignFlag) {
        this.personForeignFlag = personForeignFlag;
    }

    public String getNameRomanization() {
        return nameRomanization;
    }

    public void setNameRomanization(String nameRomanization) {
        this.nameRomanization = nameRomanization;
    }

    public String getOutliveCaseFlag() {
        return outliveCaseFlag;
    }

    public void setOutliveCaseFlag(String outliveCaseFlag) {
        this.outliveCaseFlag = outliveCaseFlag;
    }
}
