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
@XmlType(name = "Rl0171cAppDataDTO", propOrder = { "registerDate", "registerTime", "acceptAdminOfficeCode",
        "enforcedFlag", "orgEducationMark", "afterPersonId", "orgAfterPersonId", "updateType", "updateReasonCode",
        "otherUpdateReason", "updateYyymmdd", "certificateList", "otherCertificateFlag", "otherCertificate",
        "bookFlag", "householdHeadFlag", "personForeignFlag", "registerContent", "needFineFlag", "assignNewMaleId",
        "assignNewFemaleId", "birthOrderSex", "removeflag", "removeYear", "removeMonth", "removeDay", "removeHour",
        "removeMinute", "removeSecond", "removeSiteId", "outliveCaseFlag", "assignWay" })
@XmlRootElement(name = "Rl0171cAppDataDTO")
public class Rl0171cAppDataDTO implements Serializable {

    /** serialVersionUID */
    private static final long serialVersionUID = 1641591846766299247L;

    /** 登記日期 */
    @FieldName("登記日期")
    @XmlElement(name = "RegisterDate", required = false)
    private String registerDate;

    /** 登記時間 */
    @FieldName("登記時間")
    @XmlElement(name = "RegisterTime", required = false)
    private String registerTime;

    /** 受理地戶所代碼 */
    @FieldName("受理地戶所代碼")
    @XmlElement(name = "AcceptAdminOfficeCode", required = false)
    private String acceptAdminOfficeCode;

    /** 逕為登記旗標 */
    @FieldName("逕為登記旗標")
    @XmlElement(name = "EnforcedFlag", required = false)
    private String enforcedFlag;

    /** 原教育程度註記 */
    @FieldName("原教育程度註記")
    @XmlElement(name = "OrgEducationMark", required = false)
    private String orgEducationMark;

    /** 新統一編號 */
    @FieldName("新統一編號")
    @XmlElement(name = "AfterPersonId", required = false)
    private String afterPersonId;

    /** 原配賦新統一編號 */
    @FieldName("原配賦新統一編號")
    @XmlElement(name = "OrgAfterPersonId", required = false)
    private String orgAfterPersonId;

    /** 更正類別 */
    @FieldName("更正類別")
    @XmlElement(name = "UpdateType", required = false)
    private String updateType;

    /** 更正原因代碼 */
    @FieldName("更正原因代碼")
    @XmlElement(name = "UpdateReasonCode", required = false)
    private String updateReasonCode;

    /** 其他更正原因 */
    @FieldName("其他更正原因")
    @XmlElement(name = "OtherUpdateReason", required = false)
    private String otherUpdateReason;

    /** 更正日期 */
    @FieldName("更正日期")
    @XmlElement(name = "UpdateYyymmdd", required = false)
    private String updateYyymmdd;

    /** 附繳證件 */
    @FieldName("附繳證件")
    @XmlElement(name = "CertificateList", required = false)
    private List<String> certificateList = new ArrayList<String>();

    /** 旗標:其他附繳證件. */
    @XmlElement(name = "OtherCertificateFlag", required = true)
    @FieldName("旗標:其他附繳證件")
    private boolean otherCertificateFlag = false;

    /** 其他附繳證件 */
    @FieldName("其他附繳證件")
    @XmlElement(name = "OtherCertificate", required = false)
    private String otherCertificate;

    /** 當事人簿頁旗標 */
    @FieldName("當事人簿頁旗標")
    @XmlElement(name = "BookFlag", required = false)
    private String bookFlag;

    /** 當事人是否為戶長旗標 */
    @FieldName("當事人是否為戶長旗標")
    @XmlElement(name = "HouseholdHeadFlag", required = false)
    private Boolean householdHeadFlag;

    /** 當事人統號是否為外籍者 */
    @FieldName("當事人統號是否為外籍者")
    @XmlElement(name = "PersonForeignFlag", required = false)
    private Boolean personForeignFlag;

    /** 申請書備註 */
    @FieldName("申請書備註 ")
    @XmlElement(name = "RegisterContent", required = false)
    private String registerContent;

    /** 須進行罰鍰處理 */
    @FieldName("須進行罰鍰處理")
    @XmlElement(name = "NeedFineFlag", required = false)
    private String needFineFlag;

    /** 配賦之男性統號 */

    @FieldName("配賦之男性統號")
    @XmlElement(name = "AssignNewMaleId", required = false)
    private String assignNewMaleId;

    /** 配賦之女性統號 */
    @FieldName("配賦之女性統號")
    @XmlElement(name = "AssignNewFemaleId", required = false)
    private String assignNewFemaleId;

    /** 出生別代碼 */
    @FieldName("出生別代碼")
    @XmlElement(name = "BirthOrderSex", required = false)
    private String birthOrderSex;

    /** 補填除戶簿頁記事 */
    @FieldName("補填除戶簿頁記事")
    @XmlElement(name = "Removeflag", required = false)
    private String removeflag;

    /** 除戶日期-年 */
    @FieldName("除戶日期-年")
    @XmlElement(name = "RemoveYear", required = false)
    private String removeYear;

    /** 除戶日期-年 */
    @FieldName("除戶日期-月")
    @XmlElement(name = "RemoveMonth", required = false)
    private String removeMonth;

    /** 除戶日期-年 */
    @FieldName("除戶日期-日")
    @XmlElement(name = "RemoveDay", required = false)
    private String removeDay;

    /** 除戶時間-時 */
    @FieldName("除戶時間-時")
    @XmlElement(name = "RemoveHour", required = false)
    private String removeHour;

    /** 除戶時間-分 */
    @FieldName("除戶時間-分")
    @XmlElement(name = "RemoveMinute", required = false)
    private String removeMinute;

    /** 除戶時間-秒 */
    @FieldName("除戶時間-秒")
    @XmlElement(name = "RemoveSecond", required = false)
    private String removeSecond;

    /** 除戶作業點代碼 */
    @FieldName("除戶作業點代碼")
    @XmlElement(name = "RemoveSiteId", required = false)
    private String removeSiteId;

    /** 非現住人口處理註記 */
    @FieldName("非現住人口處理註記")
    @XmlElement(name = "outliveCaseFlag", required = false)
    private String outliveCaseFlag;

    /** 統號配賦方式 */
    @FieldName("統號配賦方式")
    @XmlElement(name = "AssignWay", required = false)
    private String assignWay;

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

    public String getEnforcedFlag() {
        return enforcedFlag;
    }

    public void setEnforcedFlag(String enforcedFlag) {
        this.enforcedFlag = enforcedFlag;
    }

    public String getAfterPersonId() {
        return afterPersonId;
    }

    public void setAfterPersonId(String afterPersonId) {
        this.afterPersonId = afterPersonId;
    }

    public String getUpdateType() {
        return updateType;
    }

    public void setUpdateType(String updateType) {
        this.updateType = updateType;
    }

    public String getUpdateReasonCode() {
        return updateReasonCode;
    }

    public void setUpdateReasonCode(String updateReasonCode) {
        this.updateReasonCode = updateReasonCode;
    }

    public String getOtherUpdateReason() {
        return otherUpdateReason;
    }

    public void setOtherUpdateReason(String otherUpdateReason) {
        this.otherUpdateReason = otherUpdateReason;
    }

    public String getUpdateYyymmdd() {
        return updateYyymmdd;
    }

    public void setUpdateYyymmdd(String updateYyymmdd) {
        this.updateYyymmdd = updateYyymmdd;
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

    public Boolean getHouseholdHeadFlag() {
        return householdHeadFlag;
    }

    public void setHouseholdHeadFlag(Boolean householdHeadFlag) {
        this.householdHeadFlag = householdHeadFlag;
    }

    public Boolean getPersonForeignFlag() {
        return personForeignFlag;
    }

    public void setPersonForeignFlag(Boolean personForeignFlag) {
        this.personForeignFlag = personForeignFlag;
    }

    public String getRegisterContent() {
        return registerContent;
    }

    public void setRegisterContent(String registerContent) {
        this.registerContent = registerContent;
    }

    public String getNeedFineFlag() {
        return needFineFlag;
    }

    public void setNeedFineFlag(String needFineFlag) {
        this.needFineFlag = needFineFlag;
    }

    public String getOrgEducationMark() {
        return orgEducationMark;
    }

    public void setOrgEducationMark(String orgEducationMark) {
        this.orgEducationMark = orgEducationMark;
    }

    public String getAssignNewMaleId() {
        return assignNewMaleId;
    }

    public void setAssignNewMaleId(String assignNewMaleId) {
        this.assignNewMaleId = assignNewMaleId;
    }

    public String getAssignNewFemaleId() {
        return assignNewFemaleId;
    }

    public void setAssignNewFemaleId(String assignNewFemaleId) {
        this.assignNewFemaleId = assignNewFemaleId;
    }

    public String getBirthOrderSex() {
        return birthOrderSex;
    }

    public void setBirthOrderSex(String birthOrderSex) {
        this.birthOrderSex = birthOrderSex;
    }

    public String getRemoveflag() {
        return removeflag;
    }

    public void setRemoveflag(String removeflag) {
        this.removeflag = removeflag;
    }

    public String getRemoveYear() {
        return removeYear;
    }

    public void setRemoveYear(String removeYear) {
        this.removeYear = removeYear;
    }

    public String getRemoveMonth() {
        return removeMonth;
    }

    public void setRemoveMonth(String removeMonth) {
        this.removeMonth = removeMonth;
    }

    public String getRemoveDay() {
        return removeDay;
    }

    public void setRemoveDay(String removeDay) {
        this.removeDay = removeDay;
    }

    public String getRemoveHour() {
        return removeHour;
    }

    public void setRemoveHour(String removeHour) {
        this.removeHour = removeHour;
    }

    public String getRemoveMinute() {
        return removeMinute;
    }

    public void setRemoveMinute(String removeMinute) {
        this.removeMinute = removeMinute;
    }

    public String getRemoveSecond() {
        return removeSecond;
    }

    public void setRemoveSecond(String removeSecond) {
        this.removeSecond = removeSecond;
    }

    public String getRemoveSiteId() {
        return removeSiteId;
    }

    public void setRemoveSiteId(String removeSiteId) {
        this.removeSiteId = removeSiteId;
    }

    public String getOutliveCaseFlag() {
        return outliveCaseFlag;
    }

    public void setOutliveCaseFlag(String outliveCaseFlag) {
        this.outliveCaseFlag = outliveCaseFlag;
    }

    public boolean isOtherCertificateFlag() {
        return otherCertificateFlag;
    }

    public void setOtherCertificateFlag(boolean otherCertificateFlag) {
        this.otherCertificateFlag = otherCertificateFlag;
    }

    public String getOrgAfterPersonId() {
        return orgAfterPersonId;
    }

    public void setOrgAfterPersonId(String orgAfterPersonId) {
        this.orgAfterPersonId = orgAfterPersonId;
    }

    public String getAssignWay() {
        return assignWay;
    }

    public void setAssignWay(String assignWay) {
        this.assignWay = assignWay;
    }

}
