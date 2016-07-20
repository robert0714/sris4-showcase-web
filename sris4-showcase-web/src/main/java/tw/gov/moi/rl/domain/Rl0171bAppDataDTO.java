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
@XmlType(name = "rl0171bAppDataDTO", propOrder = { "registerDate", "registerTime", "acceptAdminOfficeCode",
        "updateYyymmdd", "updatereason", "certificateList", "otherCertificate", "registerContent", "enforcedFlag",
        "acceptRegisterName", "errorReason", "bookFlag", "personForeignFlag", "orgEducationMark" })
@XmlRootElement(name = "Rl0171bAppDataDTO")
public class Rl0171bAppDataDTO implements Serializable {

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

    /** 受理地作業點代碼 */
    @FieldName("受理地作業點代碼")
    @XmlElement(name = "AcceptAdminOfficeCode", required = false)
    private String acceptAdminOfficeCode;

    /** 更正前戶別代碼 */
    @FieldName("更正前戶別代碼")
    @XmlElement(name = "BeforeHouseholdType", required = false)
    private String beforeHouseholdType = "";

    /** 更正後戶別代碼 */
    @FieldName("更正後戶別代碼")
    @XmlElement(name = "AfterHouseholdType", required = false)
    private String afterHouseholdType = "";

    /** 更正日期 */
    @FieldName("更正日期")
    @XmlElement(name = "UpdateYyymmdd", required = false)
    private String updateYyymmdd = "";

    /** 更正原因 */
    @FieldName("更正原因")
    @XmlElement(name = "UpdateReason", required = false)
    private String updateReason = "";

    /** 附繳證件 */
    @FieldName("附繳證件")
    @XmlElement(name = "CertificateList", required = false)
    private List<String> certificateList = new ArrayList<String>();

    /** 其他附繳證件 */
    @FieldName("其他附繳證件")
    @XmlElement(name = "OteherCertificate", required = false)
    private String otherCertificate;

    /** 更正原因(備註) */
    @FieldName("更正原因(備註)")
    @XmlElement(name = "RegisterContent", required = false)
    private String registerContent;

    /** 逕為登記旗標 */
    @FieldName("逕為登記旗標")
    @XmlElement(name = "EnforcedFlag", required = false)
    private String enforcedFlag;

    /** 受理地戶籍員姓名 */
    @FieldName("受理地戶籍員姓名")
    @XmlElement(name = "AcceptRegisterName", required = false)
    private String acceptRegisterName = "";

    /** 錯誤原因: 1.誤報2.誤錄 */
    @FieldName("錯誤原因: 1.誤報2.誤錄 ")
    @XmlElement(name = "ErrorReason", required = false)
    private String errorReason = "";

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

    public String getAcceptAdminOfficeCode() {
        return acceptAdminOfficeCode;
    }

    public void setAcceptAdminOfficeCode(String acceptAdminOfficeCode) {
        this.acceptAdminOfficeCode = acceptAdminOfficeCode;
    }

    public String getBeforeHouseholdType() {
        return beforeHouseholdType;
    }

    public void setBeforeHouseholdType(String beforeHouseholdType) {
        this.beforeHouseholdType = beforeHouseholdType;
    }

    public String getAfterHouseholdType() {
        return afterHouseholdType;
    }

    public void setAfterHouseholdType(String afterHouseholdType) {
        this.afterHouseholdType = afterHouseholdType;
    }

    public String getUpdateYyymmdd() {
        return updateYyymmdd;
    }

    public void setUpdateYyymmdd(String updateYyymmdd) {
        this.updateYyymmdd = updateYyymmdd;
    }

    public String getUpdateReason() {
        return updateReason;
    }

    public void setUpdateReason(String updateReason) {
        this.updateReason = updateReason;
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

    public String getAcceptRegisterName() {
        return acceptRegisterName;
    }

    public void setAcceptRegisterName(String acceptRegisterName) {
        this.acceptRegisterName = acceptRegisterName;
    }

    public String getErrorReason() {
        return errorReason;
    }

    public void setErrorReason(String errorReason) {
        this.errorReason = errorReason;
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

}
