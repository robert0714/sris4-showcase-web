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
@XmlType(name = "rl01814AppDataDTO", propOrder = { "registerDate", "registerTime", "acceptAdminOfficeCode",
        "originalFact", "revokeReasonCode", "otherRevokeReason", "revokeYyymmdd", "registerItem", "newHouseholdFlag",
        "certificateList", "otherCertificate", "enforcedFlag", "settleCityCountyName", "settleTownName", "livingStyle",
        "livingRace", "applyCityCounty1Name", "applyTown1Name", "applyCityCounty2Name", "applyTown2Name",
        "commCityCountyName", "bookFlag", "returnOrgHousehold", "foreignPersonFlag", "registerContent", "relationship",
        "orgEducationMark", "doFineCheckFlag", "fineEventDate", "needFineFlag", "fineFreeFlag", "removeFeeReason",
        "receiptId", "outLiveCaseFlag", "previousDoFineCheckFlag", "previousFineEventDate" })
@XmlRootElement(name = "Rl01814AppDataDTO", namespace = "http://tw.gov.moi/rl/domain")
public class Rl01814AppDataDTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1442634348672263238L;

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

    /** 原登記事項 */
    @FieldName("原登記事項")
    @XmlElement(name = "OriginalFact", required = false)
    private String originalFact;

    /** 撤銷原因 */
    @FieldName("撤銷原因")
    @XmlElement(name = "RevokeReasonCode", required = false)
    private String revokeReasonCode;

    @FieldName("其他撤銷原因")
    @XmlElement(name = "OtherRevokeReason", required = false)
    private String otherRevokeReason;

    /** 撤銷日期 */
    @FieldName("撤銷日期")
    @XmlElement(name = "RevokeYyymmdd", required = false)
    private String revokeYyymmdd;

    /** 登記項目 */
    @FieldName("登記項目")
    @XmlElement(name = "RegisterItem", required = false)
    private String registerItem;

    /** 自立新戶 */
    @FieldName("自立新戶")
    @XmlElement(name = "NewHouseholdFlag", required = false)
    private String newHouseholdFlag;

    /** 附繳證件 */
    @FieldName("附繳證件")
    @XmlElement(name = "CertificateList", required = false)
    private List<String> certificateList = new ArrayList<String>();

    /** 其他附繳證件 */
    @FieldName("其他附繳證件")
    @XmlElement(name = "OtherCertificate", required = false)
    private String otherCertificate;

    /** 逕為登記旗標 */
    @FieldName("逕為登記旗標")
    @XmlElement(name = "EnforcedFlag", required = false)
    private String enforcedFlag;

    /** 戶籍地省市縣市名稱 */
    @FieldName("戶籍地省市縣市名稱")
    @XmlElement(name = "SettleCityCountyName", required = false)
    private String settleCityCountyName;

    /** 戶籍地鄉鎮市區名稱 */
    @FieldName("戶籍地鄉鎮市區名稱")
    @XmlElement(name = "SettleTownName", required = false)
    private String settleTownName;

    /** 原住民身分 */
    @FieldName("原住民身分")
    @XmlElement(name = "LivingStyle", required = false)
    private String livingStyle;

    /** 原住民族別 */
    @FieldName("原住民族別")
    @XmlElement(name = "LivingRace", required = false)
    private String livingRace;

    /** 申請人１住址省市縣市名稱 */
    @FieldName("申請人１住址省市縣市名稱")
    @XmlElement(name = "ApplyCityCounty1Name", required = false)
    private String applyCityCounty1Name;

    /** 申請人１住址鄉鎮市區名稱 */
    @FieldName("申請人１住址鄉鎮市區名稱")
    @XmlElement(name = "ApplyTown1Name", required = false)
    private String applyTown1Name;

    /** 申請人2住址省市縣市名稱 */
    @FieldName("申請人2住址省市縣市名稱")
    @XmlElement(name = "ApplyCityCounty2Name", required = false)
    private String applyCityCounty2Name;

    /** 申請人2住址鄉鎮市區名稱 */
    @FieldName("申請人2住址鄉鎮市區名稱")
    @XmlElement(name = "ApplyTown2Name", required = false)
    private String applyTown2Name;

    /** 受委託人住址省市縣市名稱 */
    @FieldName("受委託人住址省市縣市名稱")
    @XmlElement(name = "CommCityCountyName", required = false)
    private String commCityCountyName;

    /** 受委託人住址鄉鎮市區名稱 */
    @FieldName("受委託人住址鄉鎮市區名稱")
    @XmlElement(name = "CommTownName", required = false)
    private String commTownName;

    /** 當事人簿頁旗標 */
    @FieldName("當事人簿頁旗標")
    @XmlElement(name = "BookFlag", required = false)
    private String bookFlag;

    /** 是否需回原戶 */
    @FieldName("是否需回原戶")
    @XmlElement(name = "ReturnOrgHousehold", required = false)
    private Boolean returnOrgHousehold;

    /** 是否為外籍者 */
    @FieldName("是否為外籍者 ")
    @XmlElement(name = "ForeignPersonFlag", required = false)
    private Boolean foreignPersonFlag;

    /** 備註 */
    @FieldName("備註")
    @XmlElement(name = "RegisterContent", required = false)
    private String registerContent;

    /** 舊稱謂 */
    @FieldName("舊稱謂")
    @XmlElement(name = "Relationship", required = false)
    private String relationship;

    /** 原教育程度註記 */
    @FieldName("原教育程度註記")
    @XmlElement(name = "OrgEducationMark", required = false)
    private String orgEducationMark;

    /** 進行逾期申報之罰鍰檢視 */
    @FieldName("進行逾期申報之罰鍰檢視")
    @XmlElement(name = "DoFineCheckFlag", required = false)
    private String doFineCheckFlag;

    /** 判斷罰鍰之事件發生(確定)日期 */
    @FieldName("判斷罰鍰之事件發生(確定)日期")
    @XmlElement(name = "FineEventDate", required = false)
    private String fineEventDate;

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
    @XmlElement(name = "OutLiveCaseFlag", required = false)
    private boolean outLiveCaseFlag = false;

    /** 前一次資料驗證之是否進行逾期申報之罰鍰檢視旗標 */
    @XmlElement(name = "PreviousDoFineCheckFlag", required = true)
    @FieldName("前一次資料驗證之是否進行逾期申報之罰鍰檢視旗標")
    private String previousDoFineCheckFlag = "";

    /** 前一次資料驗證之事件發生(確定)日期 */
    @XmlElement(name = "PreviousFineEventDate", required = true)
    @FieldName("前一次資料驗證之事件發生(確定)日期")
    private String previousFineEventDate = "";

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

    public String getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }

    public String getOriginalFact() {
        return originalFact;
    }

    public void setOriginalFact(String originalFact) {
        this.originalFact = originalFact;
    }

    public String getRevokeReasonCode() {
        return revokeReasonCode;
    }

    public void setRevokeReasonCode(String revokeReasonCode) {
        this.revokeReasonCode = revokeReasonCode;
    }

    public String getRevokeYyymmdd() {
        return revokeYyymmdd;
    }

    public void setRevokeYyymmdd(String revokeYyymmdd) {
        this.revokeYyymmdd = revokeYyymmdd;
    }

    public String getRegisterItem() {
        return registerItem;
    }

    public void setRegisterItem(String registerItem) {
        this.registerItem = registerItem;
    }

    public String getNewHouseholdFlag() {
        return newHouseholdFlag;
    }

    public void setNewHouseholdFlag(String newHouseholdFlag) {
        this.newHouseholdFlag = newHouseholdFlag;
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

    public String getSettleCityCountyName() {
        return settleCityCountyName;
    }

    public void setSettleCityCountyName(String settleCityCountyName) {
        this.settleCityCountyName = settleCityCountyName;
    }

    public String getSettleTownName() {
        return settleTownName;
    }

    public void setSettleTownName(String settleTownName) {
        this.settleTownName = settleTownName;
    }

    public String getLivingStyle() {
        return livingStyle;
    }

    public void setLivingStyle(String livingStyle) {
        this.livingStyle = livingStyle;
    }

    public String getLivingRace() {
        return livingRace;
    }

    public void setLivingRace(String livingRace) {
        this.livingRace = livingRace;
    }

    public String getNeedFineFlag() {
        return needFineFlag;
    }

    public void setNeedFineFlag(String needFineFlag) {
        this.needFineFlag = needFineFlag;
    }

    public String getApplyCityCounty1Name() {
        return applyCityCounty1Name;
    }

    public void setApplyCityCounty1Name(String applyCityCounty1Name) {
        this.applyCityCounty1Name = applyCityCounty1Name;
    }

    public String getApplyTown1Name() {
        return applyTown1Name;
    }

    public void setApplyTown1Name(String applyTown1Name) {
        this.applyTown1Name = applyTown1Name;
    }

    public String getApplyCityCounty2Name() {
        return applyCityCounty2Name;
    }

    public void setApplyCityCounty2Name(String applyCityCounty2Name) {
        this.applyCityCounty2Name = applyCityCounty2Name;
    }

    public String getApplyTown2Name() {
        return applyTown2Name;
    }

    public void setApplyTown2Name(String applyTown2Name) {
        this.applyTown2Name = applyTown2Name;
    }

    public String getCommCityCountyName() {
        return commCityCountyName;
    }

    public void setCommCityCountyName(String commCityCountyName) {
        this.commCityCountyName = commCityCountyName;
    }

    public String getCommTownName() {
        return commTownName;
    }

    public void setCommTownName(String commTownName) {
        this.commTownName = commTownName;
    }

    public String getBookFlag() {
        return bookFlag;
    }

    public void setBookFlag(String bookFlag) {
        this.bookFlag = bookFlag;
    }

    public Boolean getReturnOrgHousehold() {
        return returnOrgHousehold;
    }

    public void setReturnOrgHousehold(Boolean returnOrgHousehold) {
        this.returnOrgHousehold = returnOrgHousehold;
    }

    public Boolean getForeignPersonFlag() {
        return foreignPersonFlag;
    }

    public void setForeignPersonFlag(Boolean foreignPersonFlag) {
        this.foreignPersonFlag = foreignPersonFlag;
    }

    public String getEnforcedFlag() {
        return enforcedFlag;
    }

    public void setEnforcedFlag(String enforcedFlag) {
        this.enforcedFlag = enforcedFlag;
    }

    public String getRegisterContent() {
        return registerContent;
    }

    public void setRegisterContent(String registerContent) {
        this.registerContent = registerContent;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getOtherRevokeReason() {
        return otherRevokeReason;
    }

    public void setOtherRevokeReason(String otherRevokeReason) {
        this.otherRevokeReason = otherRevokeReason;
    }

    public String getOrgEducationMark() {
        return orgEducationMark;
    }

    public void setOrgEducationMark(String orgEducationMark) {
        this.orgEducationMark = orgEducationMark;
    }

    public String getDoFineCheckFlag() {
        return doFineCheckFlag;
    }

    public void setDoFineCheckFlag(String doFineCheckFlag) {
        this.doFineCheckFlag = doFineCheckFlag;
    }

    public String getFineEventDate() {
        return fineEventDate;
    }

    public void setFineEventDate(String fineEventDate) {
        this.fineEventDate = fineEventDate;
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

    public boolean isOutLiveCaseFlag() {
        return outLiveCaseFlag;
    }

    public void setOutLiveCaseFlag(boolean outLiveCaseFlag) {
        this.outLiveCaseFlag = outLiveCaseFlag;
    }

    public String getPreviousDoFineCheckFlag() {
        return previousDoFineCheckFlag;
    }

    public void setPreviousDoFineCheckFlag(String previousDoFineCheckFlag) {
        this.previousDoFineCheckFlag = previousDoFineCheckFlag;
    }

    public String getPreviousFineEventDate() {
        return previousFineEventDate;
    }

    public void setPreviousFineEventDate(String previousFineEventDate) {
        this.previousFineEventDate = previousFineEventDate;
    }

}
