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
@XmlType(name = "rl012b0AppDataDTO", propOrder = { "registerDate", "registerTime", "livingStyleCode", "livingRaceType",
        "orgLivingStyleCode", "orgLivingRaceType", "acceptAdminOfficeCode", "registerContent", "enforcedFlag",
        "nameRomanization", "applyReasonCode", "headId", "certificateList", "otherCertificate", "loseReasonCode",
        "eventDate", "applyLaw", "bookFlag", "personForeignFlag", "orgEducationMark", "needFineFlag", "fineFreeFlag",
        "removeFeeReason", "receiptId", "outliveCaseFlag" })
@XmlRootElement(name = "Rl012b0AppDataDTO")
public class Rl012b0AppDataDTO implements Serializable {

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

    /** 原住民身分代碼 */
    @FieldName("原住民身分代碼")
    @XmlElement(name = "LivingStyleCode", required = false)
    private String livingStyleCode;

    /** 族別代碼 */
    @FieldName("族別代碼")
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

    /** 姓名羅馬拼音 */
    @FieldName("姓名羅馬拼音")
    @XmlElement(name = "NameRomanization", required = false)
    private String nameRomanization;

    /** 申請事由代碼 */
    @FieldName("申請事由代碼")
    @XmlElement(name = "ApplyReasonCode", required = false)
    private String applyReasonCode;

    /** 戶長統號 */
    @FieldName("戶長統號")
    @XmlElement(name = "HeadId", required = false)
    private String headId;

    /** 附繳證件 */
    @FieldName("附繳證件")
    @XmlElement(name = "CertificateList", required = false)
    private List<String> certificateList = new ArrayList<String>();

    /** 其他附繳證件 */
    @FieldName("其他附繳證件")
    @XmlElement(name = "OteherCertificate", required = false)
    private String otherCertificate;

    /** 喪失原因代碼 */
    @FieldName("喪失原因代碼")
    @XmlElement(name = "LoseReasonCode", required = false)
    private String loseReasonCode;

    /** 事件日期 */
    @FieldName("事件日期")
    @XmlElement(name = "EventDate", required = false)
    private String eventDate;

    /** 適用法規依據 */
    @FieldName("適用法規依據")
    @XmlElement(name = "applyLaw", required = false)
    private String applyLaw;

    /** 當事人簿頁旗標 */
    @FieldName("當事人簿頁旗標")
    @XmlElement(name = "BookFlag", required = false)
    private String bookFlag;

    /** 當事人統號是否為外籍者 */
    @FieldName("當事人統號是否為外籍者")
    @XmlElement(name = "PersonForeignFlag", required = false)
    private String personForeignFlag;

    /** 教育程度註記 */
    @FieldName("教育程度註記")
    @XmlElement(name = "OrgEducationMark", required = false)
    private String orgEducationMark;

    /** 判斷是否罰鍰旗標 */
    @FieldName("判斷是否罰鍰旗標")
    @XmlElement(name = "NeedFineFlag", required = false)
    private String needFineFlag;

    /** 免罰旗標 */
    @FieldName("免罰旗標")
    @XmlElement(name = "FineFreeFlag", required = false)
    private String fineFreeFlag;

    /** 免罰原因 */
    @FieldName("免罰原因")
    @XmlElement(name = "RemoveFeeReason", required = false)
    private String removeFeeReason;

    /** 收據號碼 */
    @FieldName("收據號碼")
    @XmlElement(name = "ReceiptId", required = false)
    private String receiptId;

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

    public String getNameRomanization() {
        return nameRomanization;
    }

    public void setNameRomanization(String nameRomanization) {
        this.nameRomanization = nameRomanization;
    }

    public String getApplyReasonCode() {
        return applyReasonCode;
    }

    public void setApplyReasonCode(String applyReasonCode) {
        this.applyReasonCode = applyReasonCode;
    }

    public String getHeadId() {
        return headId;
    }

    public void setHeadId(String headId) {
        this.headId = headId;
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

    public String getLoseReasonCode() {
        return loseReasonCode;
    }

    public void setLoseReasonCode(String loseReasonCode) {
        this.loseReasonCode = loseReasonCode;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getApplyLaw() {
        return applyLaw;
    }

    public void setApplyLaw(String applyLaw) {
        this.applyLaw = applyLaw;
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

    public String getOrgEducationMark() {
        return orgEducationMark;
    }

    public void setOrgEducationMark(String orgEducationMark) {
        this.orgEducationMark = orgEducationMark;
    }

    public String getNeedFineFlag() {
        return needFineFlag;
    }

    public void setNeedFineFlag(String needFineFlag) {
        this.needFineFlag = needFineFlag;
    }

    public String getFineFreeFlag() {
        return fineFreeFlag;
    }

    public void setFineFreeFlag(String fineFreeFlag) {
        this.fineFreeFlag = fineFreeFlag;
    }

    public String getRemoveFeeReason() {
        return removeFeeReason;
    }

    public void setRemoveFeeReason(String removeFeeReason) {
        this.removeFeeReason = removeFeeReason;
    }

    public String getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }

    public String getOutliveCaseFlag() {
        return outliveCaseFlag;
    }

    public void setOutliveCaseFlag(String outliveCaseFlag) {
        this.outliveCaseFlag = outliveCaseFlag;
    }

}
