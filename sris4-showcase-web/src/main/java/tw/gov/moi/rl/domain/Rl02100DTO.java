/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldf001hType;
import tw.gov.moi.domain.Rldf049mType;
import tw.gov.moi.domain.Rldfs016Type;
import tw.gov.moi.domain.Rldfu001Type;
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonNoteDomainObject;

/**
 * 戶籍滕本核發DTO.
 * 
 * @author Jay Kan
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl02100DTO", propOrder = { "activeIndex", "applyType", "applyMark", "printType", "removeYear",
        "address", "otherCertificate", "otherApplyReason", "applyCheck", "applyName", "copies", "quantity", "fee",
        "feeAmount", "freeReason", "otherFreeReason", "deleteApplyDate", "deleteApplyTime", "sysDate", "sysTime",
        "receiptId", "siteId", "householdSerialNo", "openingOperationDTO", "xldfPersonData", "xldfHouseholdData",
        "applicant1", "applicant2", "delegatedPerson", "householdHeadName", "printHouseholdNote", "applyNote", "other",
        "applyCount", "selectedIndex", "reportUrl", "printMark", "otherCertificateFlag", "otherApplyReasonFlag",
        "disablePrintHouseholdBtn", "disableSaveBtn", "disableReprintBtn", "householdSelectedAll", "existHousehold",
        "printed", "certificateList", "applyReasonList", "householdList", "oldHouseholdList", "bookList",
        "selectedBook", "deleteDataList", "deleteDataSelectedList", "rldf049mTypes", "removeHouseholdKeys",
        "HidenColumnList", "ChangeNoteList", "HouseholdHeadId", "HouseholdId", "AreaCode", "Village", "Neighbor",
        "StreetDoorplate", "feeItem", "feeItemString", "isFree", "householdSiteId", "printType2", "violenceList",
        "violenceSelectedList", "rldfu001List", "haveCurrentPerson", "tab2Name", "inputId", "inputIdList",
        "currentPersonName", "rlWarningMessageList", "fromRL02F20", "beforeChangeNoteList", "inputName",
        "disabledVerifyBtn" })
@XmlRootElement(name = "Rl02100DTO")
public class Rl02100DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -4222450748995865352L;

    /**
     * 頁籤索引. <BR>
     * Default: 0
     */
    @XmlElement(name = "ActiveIndex")
    @FieldName("頁籤索引")
    private String activeIndex = "0";

    /**
     * 申請資料-申請種類. <BR>
     * Default: 現行戶籍謄本
     */
    @XmlElement(name = "ApplyType")
    @FieldName("申請資料-申請種類")
    private String applyType = "1";

    /**
     * 請領 <BR>
     * Default: 請領.
     */
    @XmlElement(name = "ApplyMark")
    @FieldName("請領")
    private String applyMark = "1";

    /** 列印種類. */
    @XmlElement(name = "PrintType")
    @FieldName("列印種類")
    private String printType;

    /** 申請資料-除戶年份. */
    @XmlElement(name = "RemoveYear")
    @FieldName("申請資料-除戶年份")
    private String removeYear;

    /** 申請資料-地址. */
    @XmlElement(name = "Address")
    @FieldName("申請資料-地址")
    private String address;

    /** 附繳證件-其他說明. */
    @XmlElement(name = "OtherCertificate")
    @FieldName("附繳證件-其他說明")
    private String otherCertificate;

    /** 申請事由-其他說明. */
    @XmlElement(name = "OtherApplyReason")
    @FieldName("申請事由-其他說明")
    private String otherApplyReason;

    /**
     * 申請資料-已檢核申請人(委託人)非保護家庭暴力資料之相對人 <BR>
     * Default: 是.
     */
    @XmlElement(name = "ApplyCheck")
    @FieldName("申請資料-已檢核申請人(委託人)非保護家庭暴力資料之相對人")
    private String applyCheck = "2";

    /** 申請資料-姓名. */
    @XmlElement(name = "ApplyName")
    @FieldName("申請資料-姓名")
    private String applyName;

    /**
     * 列印資料-份數. <BR>
     * Default: 1.
     */
    @XmlElement(name = "Copies")
    @FieldName("列印資料-份數")
    private String copies = "1";

    /** 列印資料-張數. */
    @XmlElement(name = "Quantity")
    @FieldName("列印資料-張數")
    private String quantity = "0";

    /** 列印資料-單價. */
    @XmlElement(name = "Fee")
    @FieldName("列印資料-單價")
    private String fee = "0";

    /** 列印資料-總金額. */
    @XmlElement(name = "FeeAmount")
    @FieldName("列印資料-總金額")
    private String feeAmount = "0";

    /** 列印資料-免收規費原因. */
    @XmlElement(name = "FreeReason")
    @FieldName("列印資料-免收規費原因")
    private String freeReason = "";

    /** 列印資料-其他免收規費原因. */
    @XmlElement(name = "OtherFreeReason")
    @FieldName("列印資料-其他免收規費原因")
    private String otherFreeReason = "";

    /** 撤銷請領-原請領日期. */
    @XmlElement(name = "DeleteApplyDate")
    @FieldName("撤銷請領-原請領日期")
    private String deleteApplyDate;

    /** 撤銷請領-原請領時間. */
    @XmlElement(name = "DeleteApplyTime")
    @FieldName("撤銷請領-原請領時間")
    private String deleteApplyTime;

    /** 系統日期. */
    @XmlElement(name = "SysDate")
    @FieldName("系統日期")
    private String sysDate;

    /** 系統時間. */
    @XmlElement(name = "SysTime")
    @FieldName("系統時間")
    private String sysTime;

    /** 收據號碼. */
    @XmlElement(name = "ReceiptId")
    @FieldName("收據號碼")
    private String receiptId;

    /** 作業點代碼. */
    @XmlElement(name = "SiteId")
    @FieldName("作業點代碼")
    private String siteId;

    /** 戶籍謄本號碼. */
    @XmlElement(name = "HouseholdSerialNo")
    @FieldName("戶籍謄本號碼")
    private String householdSerialNo;

    /** OpeningOperationDTO. */
    @XmlElement(name = "OpeningOperationDTO")
    @FieldName("OpeningOperationDTO")
    private OpeningOperationDTO openingOperationDTO;

    /** 當事人資料. */
    @XmlElement(name = "XldfPersonData")
    @FieldName("當事人資料")
    private XLDFPersonDataDomainObject xldfPersonData;

    /** 全戶基本資料. */
    @XmlElement(name = "XldfHouseholdData")
    @FieldName("全戶基本資料")
    private XLDFHouseholdDataDomainObject xldfHouseholdData;

    /** 申請人1資料. */
    @XmlElement(name = "Applicant1")
    @FieldName("申請人1資料")
    private XLDFApplicantDataDTO applicant1;

    /** 申請人2資料. */
    @XmlElement(name = "Applicant2")
    @FieldName("申請人1資料")
    private XLDFApplicantDataDTO applicant2;

    /** 受委託人資料. */
    @XmlElement(name = "DelegatedPerson")
    @FieldName("受委託人資料")
    private XLDFPersonBriefDataDTO delegatedPerson;

    /** 戶長姓名. */
    @XmlElement(name = "HouseholdHeadName")
    @FieldName("戶長姓名")
    private String householdHeadName = "";

    /** The household head id. */
    @XmlElement(name = "HouseholdHeadId")
    @FieldName("戶長統號")
    private String householdHeadId = "";

    /** The household id. */
    @XmlElement(name = "HouseholdId")
    @FieldName("戶號")
    private String householdId = "";

    /** The area code. */
    @XmlElement(name = "AreaCode")
    @FieldName("行政區域代碼")
    private String areaCode;

    /** The village. */
    @XmlElement(name = "Village")
    @FieldName("里")
    private String village;

    /** The neighbor. */
    @XmlElement(name = "Neighbor")
    @FieldName("鄰")
    private String neighbor;

    /** The street doorplate. */
    @XmlElement(name = "StreetDoorplate")
    @FieldName("門牌")
    private String streetDoorplate;

    /**
     * 列印全戶記事 <BR>
     * Default: 是.
     */
    @XmlElement(name = "PrintHouseholdNote")
    @FieldName("列印全戶記事")
    private String printHouseholdNote = "1";

    /** 備註. */
    @XmlElement(name = "ApplyNote")
    @FieldName("備註")
    private String applyNote = "";

    /** 其他. */
    @XmlElement(name = "Other")
    @FieldName("其他")
    private String other;

    /** 人數. */
    @XmlElement(name = "ApplyCount")
    @FieldName("人數")
    private String applyCount = "0";

    /**
     * 所選列數 <BR>
     * Default: 0.
     */
    @XmlElement(name = "SelectedIndex")
    @FieldName("所選列數")
    private Integer selectedIndex = Integer.valueOf(0);

    /** 報表路徑. */
    @XmlElement(name = "ReportUrl")
    @FieldName("報表路徑")
    private String reportUrl;

    /**
     * 列印資料-列印戶籍謄本申請書 <BR>
     * Default: 要印.
     */
    @XmlElement(name = "PrintMark")
    @FieldName("列印資料-列印戶籍謄本申請書")
    private boolean printMark = true;

    /**
     * 附繳證件-其它說明開關 <BR>
     * Default: hide.
     */
    @XmlElement(name = "OtherCertificateFlag")
    @FieldName("附繳證件-其它說明開關")
    private boolean otherCertificateFlag = false;

    /**
     * 申請事由-其它說明開關 <BR>
     * Default: hide.
     */
    @XmlElement(name = "OtherApplyReasonFlag")
    @FieldName("申請事由-其它說明開關")
    private boolean otherApplyReasonFlag = false;

    /**
     * 「列印戶籍謄本」按鈕 <BR>
     * Default: disabled.
     */
    @XmlElement(name = "DisablePrintHouseholdBtn")
    @FieldName("「列印戶籍謄本」按鈕")
    private boolean disablePrintHouseholdBtn = true;

    /**
     * 「暫存」按鈕 <BR>
     * Default: disabled.
     */
    @XmlElement(name = "DisableSaveBtn")
    @FieldName("「暫存」按鈕")
    private boolean disableSaveBtn = true;

    /**
     * 「重印」按鈕 <BR>
     * Default: disabled.
     */
    @XmlElement(name = "DisableReprintBtn")
    @FieldName("「重印」按鈕")
    private boolean disableReprintBtn = true;

    /**
     * 全選申請現行戶籍謄本 <BR>
     * Default: true.
     */
    @XmlElement(name = "HouseholdSelectedAll")
    @FieldName("全選申請現行戶籍謄本")
    private boolean householdSelectedAll = true;

    /**
     * 辦理現戶或除戶 <BR>
     * Default: true 現戶.
     */
    @XmlElement(name = "ExistHousehold")
    @FieldName("辦理現戶或除戶")
    private boolean existHousehold = true;

    /** 確定列印. */
    @XmlElement(name = "Printed")
    @FieldName("確定列印")
    private boolean printed = false;

    /** 申請資料-附繳證件. */
    @XmlElement(name = "CertificateList")
    @FieldName("申請資料-附繳證件")
    private List<String> certificateList = new ArrayList<String>();

    /** 申請資料-申請事由. */
    @XmlElement(name = "ApplyReasonList")
    @FieldName("申請資料-申請事由")
    private List<String> applyReasonList = new ArrayList<String>();

    /** 申請資料-申請現行戶籍謄本. */
    @XmlElement(name = "HouseholdList")
    @FieldName("申請資料-申請現行戶籍謄本")
    private List<Rl02100ApplyHouseholdDTO> householdList = new ArrayList<Rl02100ApplyHouseholdDTO>();

    /** 申請資料-申請非現行戶籍謄本. */
    @XmlElement(name = "OldHouseholdList")
    @FieldName("申請資料-申請非現行戶籍謄本")
    private List<String> oldHouseholdList = new ArrayList<String>();

    /** 簿頁選擇-簿頁資料. */
    @XmlElement(name = "BookList")
    @FieldName("簿頁選擇-簿頁資料")
    private List<Rldf001hType> bookList = new ArrayList<Rldf001hType>();

    /** 簿頁選擇-選擇的簿頁資料. */
    @XmlElement(name = "SelectedBook")
    @FieldName("簿頁選擇-選擇的簿頁資料")
    private Rldf001hType selectedBook;

    /** 撤銷請領-撤銷請領資料. */
    @XmlElement(name = "DeleteDataList")
    @FieldName("撤銷請領-撤銷請領資料")
    private List<Rldfs016Type> deleteDataList = new ArrayList<Rldfs016Type>();

    /** 撤銷請領-選擇的撤銷請領資料. */
    @XmlElement(name = "DeleteDataSelectedList")
    @FieldName("撤銷請領-選擇的撤銷請領資料")
    private Rldfs016Type[] deleteDataSelectedList;

    /** 保護家庭暴力資料. */
    @XmlElement(name = "Rldf049mTypes")
    @FieldName("保護家庭暴力資料")
    private List<Rldf049mType> rldf049mTypes = new ArrayList<Rldf049mType>();

    /** 除戶全戶資料domain key. */
    @XmlElement(name = "RemoveHouseholdKeys")
    @FieldName("除戶全戶資料domain key")
    private Set<String> removeHouseholdKeys = new HashSet<String>();

    /** 有被修改記事分類的記事. */
    @XmlElement(name = "ChangeNoteList")
    @FieldName("有被修改記事分類的記事")
    private List<XLDFPersonNoteDomainObject> changeNoteList = new ArrayList<XLDFPersonNoteDomainObject>();

    /** 收費項目. */
    @XmlElement(name = "FeeItem")
    @FieldName("收費項目")
    private String feeItem = "";

    /** 收費項目字串. */
    @XmlElement(name = "FeeItemString")
    @FieldName("收費項目字串")
    private String feeItemString = "";

    /** 是否免費. */
    @XmlElement(name = "IsFree")
    @FieldName("是否免費")
    private String isFree = "";

    /** 戶籍所在地作業點代碼. */
    @XmlElement(name = "HouseholdSiteId")
    @FieldName("戶籍所在地作業點代碼")
    private String householdSiteId = "";

    /** 列印種類2. */
    @XmlElement(name = "PrintType2")
    @FieldName("列印種類2")
    private String printType2 = "";

    /** 家暴被保護人清單. */
    @XmlElement(name = "ViolenceList")
    @FieldName("家暴被保護人清單")
    private List<String> violenceList = new ArrayList<String>();

    /** 家暴被保護人被選擇列印記事清單. */
    @XmlElement(name = "ViolenceSelectedList")
    @FieldName("家暴被保護人被選擇列印記事清單")
    private List<String> violenceSelectedList = new ArrayList<String>();

    /** 戶籍謄本規費清單. */
    @XmlElement(name = "Rldfu001List")
    @FieldName("戶籍謄本規費清單")
    private List<Rldfu001Type> rldfu001List = new ArrayList<Rldfu001Type>();

    /** 是否有當事人資料. */
    @XmlElement(name = "HaveCurrentPerson")
    @FieldName("是否有當事人資料")
    private boolean haveCurrentPerson = true;

    /** 頁籤2名稱. */
    @XmlElement(name = "tab2Name")
    @FieldName("頁籤2名稱")
    private String tab2Name = "";

    /** 輸入的統號. */
    @XmlElement(name = "inputId")
    @FieldName("輸入的統號")
    private String inputId = "";

    /** 輸入的統號清單. */
    @XmlElement(name = "inputIdList")
    @FieldName("輸入的統號清單")
    private List<Rl02100ApplyHouseholdDTO> inputIdList = new ArrayList<Rl02100ApplyHouseholdDTO>();

    /** 當事人姓名. */
    @XmlElement(name = "CurrentPersonName")
    @FieldName("當事人姓名")
    private String currentPersonName = "";

    /** 警告訊息清單. */
    @XmlElement(name = "RlWarningMessageList")
    @FieldName("警告訊息清單")
    private List<RlWarningMessage> rlWarningMessageList = new ArrayList<RlWarningMessage>();

    /** 是否從大宗戶籍謄本過來. */
    @XmlElement(name = "RromRL02F20")
    @FieldName("是否從大宗戶籍謄本過來")
    private boolean fromRL02F20 = false;

    /** 大宗戶籍謄本轉向戶籍謄本之用的DTO. */
    @XmlElement(name = "RromRL02F20")
    @FieldName("大宗戶籍謄本轉向戶籍謄本之用的DTO")
    private HP02F20DTO hp02F20DTO;

    /** 尚未被修改記事分類的記事. */
    @XmlElement(name = "BeforeChangeNoteList")
    @FieldName("尚未被修改記事分類的記事")
    private List<XLDFPersonNoteDomainObject> beforeChangeNoteList = new ArrayList<XLDFPersonNoteDomainObject>();

    /** 輸入的姓名. */
    @XmlElement(name = "inputName")
    @FieldName("輸入的姓名")
    private String inputName = "";

    /** 禁用驗證按鈕. */
    @XmlElement(name = "DisabledVerifyBtn")
    @FieldName("禁用驗證按鈕")
    private boolean disabledVerifyBtn = false;

    /**
     * Gets the change note list.
     * 
     * @return the change note list
     */
    public List<XLDFPersonNoteDomainObject> getChangeNoteList() {
        return changeNoteList;
    }

    /**
     * Sets the change note list.
     * 
     * @param changeNoteList
     *            the new change note list
     */
    public void setChangeNoteList(List<XLDFPersonNoteDomainObject> changeNoteList) {
        this.changeNoteList = changeNoteList;
    }

    /**
     * Gets the household head id.
     * 
     * @return the household head id
     */
    public String getHouseholdHeadId() {
        return householdHeadId;
    }

    /**
     * Sets the household head id.
     * 
     * @param householdHeadId
     *            the new household head id
     */
    public void setHouseholdHeadId(String householdHeadId) {
        this.householdHeadId = householdHeadId;
    }

    /**
     * Gets the household id.
     * 
     * @return the household id
     */
    public String getHouseholdId() {
        return householdId;
    }

    /**
     * Sets the household id.
     * 
     * @param householdId
     *            the new household id
     */
    public void setHouseholdId(String householdId) {
        this.householdId = householdId;
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
     * Gets the village.
     * 
     * @return the village
     */
    public String getVillage() {
        return village;
    }

    /**
     * Sets the village.
     * 
     * @param village
     *            the new village
     */
    public void setVillage(String village) {
        this.village = village;
    }

    /**
     * Gets the neighbor.
     * 
     * @return the neighbor
     */
    public String getNeighbor() {
        return neighbor;
    }

    /**
     * Sets the neighbor.
     * 
     * @param neighbor
     *            the new neighbor
     */
    public void setNeighbor(String neighbor) {
        this.neighbor = neighbor;
    }

    /**
     * Gets the street doorplate.
     * 
     * @return the street doorplate
     */
    public String getStreetDoorplate() {
        return streetDoorplate;
    }

    /**
     * Sets the street doorplate.
     * 
     * @param streetDoorplate
     *            the new street doorplate
     */
    public void setStreetDoorplate(String streetDoorplate) {
        this.streetDoorplate = streetDoorplate;
    }

    /**
     * Gets the active index.
     * 
     * @return the active index
     */
    public String getActiveIndex() {
        return activeIndex;
    }

    /**
     * Sets the active index.
     * 
     * @param activeIndex
     *            the new active index
     */
    public void setActiveIndex(final String activeIndex) {
        this.activeIndex = activeIndex;
    }

    /**
     * Gets the apply type.
     * 
     * @return the apply type
     */
    public String getApplyType() {
        return applyType;
    }

    /**
     * Sets the apply type.
     * 
     * @param applyType
     *            the new apply type
     */
    public void setApplyType(final String applyType) {
        this.applyType = applyType;
    }

    /**
     * Gets the apply mark.
     * 
     * @return the apply mark
     */
    public String getApplyMark() {
        return applyMark;
    }

    /**
     * Sets the apply mark.
     * 
     * @param applyMark
     *            the new apply mark
     */
    public void setApplyMark(final String applyMark) {
        this.applyMark = applyMark;
    }

    /**
     * Gets the prints the type.
     * 
     * @return the prints the type
     */
    public String getPrintType() {
        return printType;
    }

    /**
     * Sets the prints the type.
     * 
     * @param printType
     *            the new prints the type
     */
    public void setPrintType(final String printType) {
        this.printType = printType;
    }

    /**
     * Gets the removes the year.
     * 
     * @return the removes the year
     */
    public String getRemoveYear() {
        return removeYear;
    }

    /**
     * Sets the removes the year.
     * 
     * @param removeYear
     *            the new removes the year
     */
    public void setRemoveYear(final String removeYear) {
        this.removeYear = removeYear;
    }

    /**
     * Gets the address.
     * 
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the address.
     * 
     * @param address
     *            the new address
     */
    public void setAddress(final String address) {
        this.address = address;
    }

    /**
     * Gets the other certificate.
     * 
     * @return the other certificate
     */
    public String getOtherCertificate() {
        return otherCertificate;
    }

    /**
     * Sets the other certificate.
     * 
     * @param otherCertificate
     *            the new other certificate
     */
    public void setOtherCertificate(final String otherCertificate) {
        this.otherCertificate = otherCertificate;
    }

    /**
     * Gets the other apply reason.
     * 
     * @return the other apply reason
     */
    public String getOtherApplyReason() {
        return otherApplyReason;
    }

    /**
     * Sets the other apply reason.
     * 
     * @param otherApplyReason
     *            the new other apply reason
     */
    public void setOtherApplyReason(final String otherApplyReason) {
        this.otherApplyReason = otherApplyReason;
    }

    /**
     * Gets the apply check.
     * 
     * @return the apply check
     */
    public String getApplyCheck() {
        return applyCheck;
    }

    /**
     * Sets the apply check.
     * 
     * @param applyCheck
     *            the new apply check
     */
    public void setApplyCheck(final String applyCheck) {
        this.applyCheck = applyCheck;
    }

    /**
     * Gets the apply name.
     * 
     * @return the apply name
     */
    public String getApplyName() {
        return applyName;
    }

    /**
     * Sets the apply name.
     * 
     * @param applyName
     *            the new apply name
     */
    public void setApplyName(final String applyName) {
        this.applyName = applyName;
    }

    /**
     * Gets the copies.
     * 
     * @return the copies
     */
    public String getCopies() {
        return copies;
    }

    /**
     * Sets the copies.
     * 
     * @param copies
     *            the new copies
     */
    public void setCopies(final String copies) {
        this.copies = copies;
    }

    /**
     * Gets the quantity.
     * 
     * @return the quantity
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * Sets the quantity.
     * 
     * @param quantity
     *            the new quantity
     */
    public void setQuantity(final String quantity) {
        this.quantity = quantity;
    }

    /**
     * Gets the fee.
     * 
     * @return the fee
     */
    public String getFee() {
        return fee;
    }

    /**
     * Sets the fee.
     * 
     * @param fee
     *            the new fee
     */
    public void setFee(final String fee) {
        this.fee = fee;
    }

    /**
     * Gets the fee amount.
     * 
     * @return the fee amount
     */
    public String getFeeAmount() {
        return feeAmount;
    }

    /**
     * Sets the fee amount.
     * 
     * @param feeAmount
     *            the new fee amount
     */
    public void setFeeAmount(final String feeAmount) {
        this.feeAmount = feeAmount;
    }

    /**
     * Gets the free reason.
     * 
     * @return the free reason
     */
    public String getFreeReason() {
        return freeReason;
    }

    /**
     * Sets the free reason.
     * 
     * @param freeReason
     *            the new free reason
     */
    public void setFreeReason(final String freeReason) {
        this.freeReason = freeReason;
    }

    /**
     * Gets the other free reason.
     * 
     * @return the other free reason
     */
    public String getOtherFreeReason() {
        return otherFreeReason;
    }

    /**
     * Sets the other free reason.
     * 
     * @param otherFreeReason
     *            the new other free reason
     */
    public void setOtherFreeReason(final String otherFreeReason) {
        this.otherFreeReason = otherFreeReason;
    }

    /**
     * Gets the delete apply date.
     * 
     * @return the delete apply date
     */
    public String getDeleteApplyDate() {
        return deleteApplyDate;
    }

    /**
     * Sets the delete apply date.
     * 
     * @param deleteApplyDate
     *            the new delete apply date
     */
    public void setDeleteApplyDate(final String deleteApplyDate) {
        this.deleteApplyDate = deleteApplyDate;
    }

    /**
     * Gets the delete apply time.
     * 
     * @return the delete apply time
     */
    public String getDeleteApplyTime() {
        return deleteApplyTime;
    }

    /**
     * Sets the delete apply time.
     * 
     * @param deleteApplyTime
     *            the new delete apply time
     */
    public void setDeleteApplyTime(final String deleteApplyTime) {
        this.deleteApplyTime = deleteApplyTime;
    }

    /**
     * Gets the sys date.
     * 
     * @return the sys date
     */
    public String getSysDate() {
        return sysDate;
    }

    /**
     * Sets the sys date.
     * 
     * @param sysDate
     *            the new sys date
     */
    public void setSysDate(final String sysDate) {
        this.sysDate = sysDate;
    }

    /**
     * Gets the sys time.
     * 
     * @return the sys time
     */
    public String getSysTime() {
        return sysTime;
    }

    /**
     * Sets the sys time.
     * 
     * @param sysTime
     *            the new sys time
     */
    public void setSysTime(final String sysTime) {
        this.sysTime = sysTime;
    }

    /**
     * Gets the receipt id.
     * 
     * @return the receipt id
     */
    public String getReceiptId() {
        return receiptId;
    }

    /**
     * Sets the receipt id.
     * 
     * @param receiptId
     *            the new receipt id
     */
    public void setReceiptId(final String receiptId) {
        this.receiptId = receiptId;
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
    public void setSiteId(final String siteId) {
        this.siteId = siteId;
    }

    /**
     * Gets the household serial no.
     * 
     * @return the household serial no
     */
    public String getHouseholdSerialNo() {
        return householdSerialNo;
    }

    /**
     * Sets the household serial no.
     * 
     * @param householdSerialNo
     *            the new household serial no
     */
    public void setHouseholdSerialNo(final String householdSerialNo) {
        this.householdSerialNo = householdSerialNo;
    }

    /**
     * Gets the opening operation dto.
     * 
     * @return the opening operation dto
     */
    public OpeningOperationDTO getOpeningOperationDTO() {
        return openingOperationDTO;
    }

    /**
     * Sets the opening operation dto.
     * 
     * @param openingOperationDTO
     *            the new opening operation dto
     */
    public void setOpeningOperationDTO(OpeningOperationDTO openingOperationDTO) {
        this.openingOperationDTO = openingOperationDTO;
    }

    /**
     * Gets the xldf person data.
     * 
     * @return the xldf person data
     */
    public XLDFPersonDataDomainObject getXldfPersonData() {
        return xldfPersonData;
    }

    /**
     * Sets the xldf person data.
     * 
     * @param xldfPersonData
     *            the new xldf person data
     */
    public void setXldfPersonData(XLDFPersonDataDomainObject xldfPersonData) {
        this.xldfPersonData = xldfPersonData;
    }

    /**
     * Gets the xldf household data.
     * 
     * @return the xldf household data
     */
    public XLDFHouseholdDataDomainObject getXldfHouseholdData() {
        return xldfHouseholdData;
    }

    /**
     * Sets the xldf household data.
     * 
     * @param xldfHouseholdData
     *            the new xldf household data
     */
    public void setXldfHouseholdData(final XLDFHouseholdDataDomainObject xldfHouseholdData) {
        this.xldfHouseholdData = xldfHouseholdData;
    }

    /**
     * Gets the applicant1.
     * 
     * @return the applicant1
     */
    public XLDFApplicantDataDTO getApplicant1() {
        return applicant1;
    }

    /**
     * Sets the applicant1.
     * 
     * @param applicant1
     *            the new applicant1
     */
    public void setApplicant1(XLDFApplicantDataDTO applicant1) {
        this.applicant1 = applicant1;
    }

    /**
     * Gets the applicant2.
     * 
     * @return the applicant2
     */
    public XLDFApplicantDataDTO getApplicant2() {
        return applicant2;
    }

    /**
     * Sets the applicant2.
     * 
     * @param applicant2
     *            the new applicant2
     */
    public void setApplicant2(XLDFApplicantDataDTO applicant2) {
        this.applicant2 = applicant2;
    }

    /**
     * Gets the delegated person.
     * 
     * @return the delegated person
     */
    public XLDFPersonBriefDataDTO getDelegatedPerson() {
        return delegatedPerson;
    }

    /**
     * Sets the delegated person.
     * 
     * @param delegatedPerson
     *            the new delegated person
     */
    public void setDelegatedPerson(XLDFPersonBriefDataDTO delegatedPerson) {
        this.delegatedPerson = delegatedPerson;
    }

    /**
     * Gets the household head name.
     * 
     * @return the household head name
     */
    public String getHouseholdHeadName() {
        return householdHeadName;
    }

    /**
     * Sets the household head name.
     * 
     * @param householdHeadName
     *            the new household head name
     */
    public void setHouseholdHeadName(final String householdHeadName) {
        this.householdHeadName = householdHeadName;
    }

    /**
     * Gets the prints the household note.
     * 
     * @return the prints the household note
     */
    public String getPrintHouseholdNote() {
        return printHouseholdNote;
    }

    /**
     * Sets the prints the household note.
     * 
     * @param printHouseholdNote
     *            the new prints the household note
     */
    public void setPrintHouseholdNote(final String printHouseholdNote) {
        this.printHouseholdNote = printHouseholdNote;
    }

    /**
     * Gets the apply note.
     * 
     * @return the apply note
     */
    public String getApplyNote() {
        return applyNote;
    }

    /**
     * Sets the apply note.
     * 
     * @param applyNote
     *            the new apply note
     */
    public void setApplyNote(final String applyNote) {
        this.applyNote = applyNote;
    }

    /**
     * Gets the other.
     * 
     * @return the other
     */
    public String getOther() {
        return other;
    }

    /**
     * Sets the other.
     * 
     * @param other
     *            the new other
     */
    public void setOther(final String other) {
        this.other = other;
    }

    /**
     * Gets the apply count.
     * 
     * @return the apply count
     */
    public String getApplyCount() {
        return applyCount;
    }

    /**
     * Sets the apply count.
     * 
     * @param applyCount
     *            the new apply count
     */
    public void setApplyCount(final String applyCount) {
        this.applyCount = applyCount;
    }

    /**
     * Gets the selected index.
     * 
     * @return the selected index
     */
    public Integer getSelectedIndex() {
        return selectedIndex;
    }

    /**
     * Sets the selected index.
     * 
     * @param selectedIndex
     *            the new selected index
     */
    public void setSelectedIndex(final Integer selectedIndex) {
        this.selectedIndex = selectedIndex;
    }

    /**
     * Gets the report url.
     * 
     * @return the report url
     */
    public String getReportUrl() {
        return reportUrl;
    }

    /**
     * Sets the report url.
     * 
     * @param reportUrl
     *            the new report url
     */
    public void setReportUrl(final String reportUrl) {
        this.reportUrl = reportUrl;
    }

    /**
     * Checks if is prints the mark.
     * 
     * @return true, if is prints the mark
     */
    public boolean isPrintMark() {
        return printMark;
    }

    /**
     * Sets the prints the mark.
     * 
     * @param printMark
     *            the new prints the mark
     */
    public void setPrintMark(final boolean printMark) {
        this.printMark = printMark;
    }

    /**
     * Checks if is other certificate flag.
     * 
     * @return true, if is other certificate flag
     */
    public boolean isOtherCertificateFlag() {
        return otherCertificateFlag;
    }

    /**
     * Sets the other certificate flag.
     * 
     * @param otherCertificateFlag
     *            the new other certificate flag
     */
    public void setOtherCertificateFlag(final boolean otherCertificateFlag) {
        this.otherCertificateFlag = otherCertificateFlag;
    }

    /**
     * Checks if is other apply reason flag.
     * 
     * @return true, if is other apply reason flag
     */
    public boolean isOtherApplyReasonFlag() {
        return otherApplyReasonFlag;
    }

    /**
     * Sets the other apply reason flag.
     * 
     * @param otherApplyReasonFlag
     *            the new other apply reason flag
     */
    public void setOtherApplyReasonFlag(final boolean otherApplyReasonFlag) {
        this.otherApplyReasonFlag = otherApplyReasonFlag;
    }

    /**
     * Checks if is disable print household btn.
     * 
     * @return true, if is disable print household btn
     */
    public boolean isDisablePrintHouseholdBtn() {
        return disablePrintHouseholdBtn;
    }

    /**
     * Sets the disable print household btn.
     * 
     * @param disablePrintHouseholdBtn
     *            the new disable print household btn
     */
    public void setDisablePrintHouseholdBtn(final boolean disablePrintHouseholdBtn) {
        this.disablePrintHouseholdBtn = disablePrintHouseholdBtn;
    }

    /**
     * Checks if is disable save btn.
     * 
     * @return true, if is disable save btn
     */
    public boolean isDisableSaveBtn() {
        return disableSaveBtn;
    }

    /**
     * Sets the disable save btn.
     * 
     * @param disableSaveBtn
     *            the new disable save btn
     */
    public void setDisableSaveBtn(final boolean disableSaveBtn) {
        this.disableSaveBtn = disableSaveBtn;
    }

    /**
     * Checks if is disable reprint btn.
     * 
     * @return true, if is disable reprint btn
     */
    public boolean isDisableReprintBtn() {
        return disableReprintBtn;
    }

    /**
     * Sets the disable reprint btn.
     * 
     * @param disableReprintBtn
     *            the new disable reprint btn
     */
    public void setDisableReprintBtn(final boolean disableReprintBtn) {
        this.disableReprintBtn = disableReprintBtn;
    }

    /**
     * Checks if is household selected all.
     * 
     * @return true, if is household selected all
     */
    public boolean isHouseholdSelectedAll() {
        return householdSelectedAll;
    }

    /**
     * Sets the household selected all.
     * 
     * @param householdSelectedAll
     *            the new household selected all
     */
    public void setHouseholdSelectedAll(final boolean householdSelectedAll) {
        this.householdSelectedAll = householdSelectedAll;
    }

    /**
     * Checks if is exist household.
     * 
     * @return true, if is exist household
     */
    public boolean isExistHousehold() {
        return existHousehold;
    }

    /**
     * Sets the exist household.
     * 
     * @param existHousehold
     *            the new exist household
     */
    public void setExistHousehold(final boolean existHousehold) {
        this.existHousehold = existHousehold;
    }

    /**
     * Checks if is printed.
     * 
     * @return true, if is printed
     */
    public boolean isPrinted() {
        return printed;
    }

    /**
     * Sets the printed.
     * 
     * @param printed
     *            the new printed
     */
    public void setPrinted(final boolean printed) {
        this.printed = printed;
    }

    /**
     * Gets the certificate list.
     * 
     * @return the certificate list
     */
    public List<String> getCertificateList() {
        return certificateList;
    }

    /**
     * Sets the certificate list.
     * 
     * @param certificateList
     *            the new certificate list
     */
    public void setCertificateList(final List<String> certificateList) {
        this.certificateList = certificateList;
    }

    /**
     * Gets the apply reason list.
     * 
     * @return the apply reason list
     */
    public List<String> getApplyReasonList() {
        return applyReasonList;
    }

    /**
     * Sets the apply reason list.
     * 
     * @param applyReasonList
     *            the new apply reason list
     */
    public void setApplyReasonList(final List<String> applyReasonList) {
        this.applyReasonList = applyReasonList;
    }

    /**
     * Gets the household list.
     * 
     * @return the household list
     */
    public List<Rl02100ApplyHouseholdDTO> getHouseholdList() {
        return householdList;
    }

    /**
     * Sets the household list.
     * 
     * @param householdList
     *            the new household list
     */
    public void setHouseholdList(final List<Rl02100ApplyHouseholdDTO> householdList) {
        this.householdList = householdList;
    }

    /**
     * Gets the old household list.
     * 
     * @return the old household list
     */
    public List<String> getOldHouseholdList() {
        return oldHouseholdList;
    }

    /**
     * Sets the old household list.
     * 
     * @param oldHouseholdList
     *            the new old household list
     */
    public void setOldHouseholdList(final List<String> oldHouseholdList) {
        this.oldHouseholdList = oldHouseholdList;
    }

    /**
     * Gets the book list.
     * 
     * @return the book list
     */
    public List<Rldf001hType> getBookList() {
        return bookList;
    }

    /**
     * Sets the book list.
     * 
     * @param bookList
     *            the new book list
     */
    public void setBookList(final List<Rldf001hType> bookList) {
        this.bookList = bookList;
    }

    /**
     * Gets the selected book.
     * 
     * @return the selected book
     */
    public Rldf001hType getSelectedBook() {
        return selectedBook;
    }

    /**
     * Sets the selected book.
     * 
     * @param selectedBook
     *            the new selected book
     */
    public void setSelectedBook(final Rldf001hType selectedBook) {
        this.selectedBook = selectedBook;
    }

    /**
     * Gets the delete data list.
     * 
     * @return the delete data list
     */
    public List<Rldfs016Type> getDeleteDataList() {
        return deleteDataList;
    }

    /**
     * Sets the delete data list.
     * 
     * @param deleteDataList
     *            the new delete data list
     */
    public void setDeleteDataList(final List<Rldfs016Type> deleteDataList) {
        this.deleteDataList = deleteDataList;
    }

    /**
     * Gets the delete data selected list.
     * 
     * @return the delete data selected list
     */
    public Rldfs016Type[] getDeleteDataSelectedList() {
        return deleteDataSelectedList;
    }

    /**
     * Sets the delete data selected list.
     * 
     * @param deleteDataSelectedList
     *            the new delete data selected list
     */
    public void setDeleteDataSelectedList(final Rldfs016Type[] deleteDataSelectedList) {
        this.deleteDataSelectedList = deleteDataSelectedList;
    }

    /**
     * Gets the rldf049m types.
     * 
     * @return the rldf049m types
     */
    public List<Rldf049mType> getRldf049mTypes() {
        return rldf049mTypes;
    }

    /**
     * Sets the rldf049m types.
     * 
     * @param rldf049mTypes
     *            the new rldf049m types
     */
    public void setRldf049mTypes(final List<Rldf049mType> rldf049mTypes) {
        this.rldf049mTypes = rldf049mTypes;
    }

    /**
     * Gets the removes the household keys.
     * 
     * @return the removes the household keys
     */
    public Set<String> getRemoveHouseholdKeys() {
        return removeHouseholdKeys;
    }

    /**
     * Sets the removes the household keys.
     * 
     * @param removeHouseholdKeys
     *            the new removes the household keys
     */
    public void setRemoveHouseholdKeys(final Set<String> removeHouseholdKeys) {
        this.removeHouseholdKeys = removeHouseholdKeys;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((address == null) ? 0 : address.hashCode());
        result = prime * result + ((applyCheck == null) ? 0 : applyCheck.hashCode());
        result = prime * result + ((applyCount == null) ? 0 : applyCount.hashCode());
        result = prime * result + ((applyMark == null) ? 0 : applyMark.hashCode());
        result = prime * result + ((applyNote == null) ? 0 : applyNote.hashCode());
        result = prime * result + ((applyReasonList == null) ? 0 : applyReasonList.hashCode());
        result = prime * result + ((applyType == null) ? 0 : applyType.hashCode());
        result = prime * result + ((certificateList == null) ? 0 : certificateList.hashCode());
        result = prime * result + ((householdList == null) ? 0 : householdList.hashCode());
        result = prime * result + ((oldHouseholdList == null) ? 0 : oldHouseholdList.hashCode());
        result = prime * result + ((other == null) ? 0 : other.hashCode());
        result = prime * result + ((otherApplyReason == null) ? 0 : otherApplyReason.hashCode());
        result = prime * result + ((otherCertificate == null) ? 0 : otherCertificate.hashCode());
        result = prime * result + ((removeYear == null) ? 0 : removeYear.hashCode());
        return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Rl02100DTO other = (Rl02100DTO) obj;
        if (address == null) {
            if (other.address != null)
                return false;
        } else if (!address.equals(other.address))
            return false;
        if (applyCheck == null) {
            if (other.applyCheck != null)
                return false;
        } else if (!applyCheck.equals(other.applyCheck))
            return false;
        if (applyCount == null) {
            if (other.applyCount != null)
                return false;
        } else if (!applyCount.equals(other.applyCount))
            return false;
        if (applyMark == null) {
            if (other.applyMark != null)
                return false;
        } else if (!applyMark.equals(other.applyMark))
            return false;
        if (applyNote == null) {
            if (other.applyNote != null)
                return false;
        } else if (!applyNote.equals(other.applyNote))
            return false;
        if (applyReasonList == null) {
            if (other.applyReasonList != null)
                return false;
        } else if (!applyReasonList.equals(other.applyReasonList))
            return false;
        if (applyType == null) {
            if (other.applyType != null)
                return false;
        } else if (!applyType.equals(other.applyType))
            return false;
        if (certificateList == null) {
            if (other.certificateList != null)
                return false;
        } else if (!certificateList.equals(other.certificateList))
            return false;
        if (householdList == null) {
            if (other.householdList != null)
                return false;
        } else if (!householdList.equals(other.householdList))
            return false;
        if (oldHouseholdList == null) {
            if (other.oldHouseholdList != null)
                return false;
        } else if (!oldHouseholdList.equals(other.oldHouseholdList))
            return false;
        if (this.other == null) {
            if (other.other != null)
                return false;
        } else if (!this.other.equals(other.other))
            return false;
        if (otherApplyReason == null) {
            if (other.otherApplyReason != null)
                return false;
        } else if (!otherApplyReason.equals(other.otherApplyReason))
            return false;
        if (otherCertificate == null) {
            if (other.otherCertificate != null)
                return false;
        } else if (!otherCertificate.equals(other.otherCertificate))
            return false;
        if (removeYear == null) {
            if (other.removeYear != null)
                return false;
        } else if (!removeYear.equals(other.removeYear))
            return false;

        return true;
    }

    /**
     * Gets the fee item.
     * 
     * @return the fee item
     */
    public String getFeeItem() {
        return feeItem;
    }

    /**
     * Sets the fee item.
     * 
     * @param feeItem
     *            the new fee item
     */
    public void setFeeItem(String feeItem) {
        this.feeItem = feeItem;
    }

    /**
     * Gets the checks if is free.
     * 
     * @return the checks if is free
     */
    public String getIsFree() {
        return isFree;
    }

    /**
     * Sets the checks if is free.
     * 
     * @param isFree
     *            the new checks if is free
     */
    public void setIsFree(String isFree) {
        this.isFree = isFree;
    }

    /**
     * Gets the household site id.
     * 
     * @return the household site id
     */
    public String getHouseholdSiteId() {
        return householdSiteId;
    }

    /**
     * Sets the household site id.
     * 
     * @param householdSiteId
     *            the new household site id
     */
    public void setHouseholdSiteId(String householdSiteId) {
        this.householdSiteId = householdSiteId;
    }

    /**
     * Gets the prints the type2.
     * 
     * @return the prints the type2
     */
    public String getPrintType2() {
        return printType2;
    }

    /**
     * Sets the prints the type2.
     * 
     * @param printType2
     *            the new prints the type2
     */
    public void setPrintType2(String printType2) {
        this.printType2 = printType2;
    }

    /**
     * Gets the violence list.
     * 
     * @return the violence list
     */
    public List<String> getViolenceList() {
        return violenceList;
    }

    /**
     * Sets the violence list.
     * 
     * @param violenceList
     *            the new violence list
     */
    public void setViolenceList(List<String> violenceList) {
        this.violenceList = violenceList;
    }

    /**
     * Gets the violence selected list.
     * 
     * @return the violence selected list
     */
    public List<String> getViolenceSelectedList() {
        return violenceSelectedList;
    }

    /**
     * Sets the violence selected list.
     * 
     * @param violenceSelectedList
     *            the new violence selected list
     */
    public void setViolenceSelectedList(List<String> violenceSelectedList) {
        this.violenceSelectedList = violenceSelectedList;
    }

    /**
     * Gets the rldfu001 list.
     * 
     * @return the rldfu001 list
     */
    public List<Rldfu001Type> getRldfu001List() {
        return rldfu001List;
    }

    /**
     * Sets the rldfu001 list.
     * 
     * @param rldfu001List
     *            the new rldfu001 list
     */
    public void setRldfu001List(List<Rldfu001Type> rldfu001List) {
        this.rldfu001List = rldfu001List;
    }

    /**
     * Gets the fee item string.
     * 
     * @return the fee item string
     */
    public String getFeeItemString() {
        return feeItemString;
    }

    /**
     * Sets the fee item string.
     * 
     * @param feeItemString
     *            the new fee item string
     */
    public void setFeeItemString(String feeItemString) {
        this.feeItemString = feeItemString;
    }

    /**
     * Checks if is have current person.
     * 
     * @return true, if is have current person
     */
    public boolean isHaveCurrentPerson() {
        return haveCurrentPerson;
    }

    /**
     * Sets the have current person.
     * 
     * @param haveCurrentPerson
     *            the new have current person
     */
    public void setHaveCurrentPerson(boolean haveCurrentPerson) {
        this.haveCurrentPerson = haveCurrentPerson;
    }

    /**
     * Gets the tab2 name.
     * 
     * @return the tab2 name
     */
    public String getTab2Name() {
        return tab2Name;
    }

    /**
     * Sets the tab2 name.
     * 
     * @param tab2Name
     *            the new tab2 name
     */
    public void setTab2Name(String tab2Name) {
        this.tab2Name = tab2Name;
    }

    /**
     * Gets the input id.
     * 
     * @return the input id
     */
    public String getInputId() {
        return inputId;
    }

    /**
     * Sets the input id.
     * 
     * @param inputId
     *            the new input id
     */
    public void setInputId(String inputId) {
        this.inputId = inputId;
    }

    /**
     * Gets the input id list.
     * 
     * @return the input id list
     */
    public List<Rl02100ApplyHouseholdDTO> getInputIdList() {
        return inputIdList;
    }

    /**
     * Sets the input id list.
     * 
     * @param inputIdList
     *            the new input id list
     */
    public void setInputIdList(List<Rl02100ApplyHouseholdDTO> inputIdList) {
        this.inputIdList = inputIdList;
    }

    public String getCurrentPersonName() {
        return currentPersonName;
    }

    public void setCurrentPersonName(String currentPersonName) {
        this.currentPersonName = currentPersonName;
    }

    public List<RlWarningMessage> getRlWarningMessageList() {
        return rlWarningMessageList;
    }

    public void setRlWarningMessageList(List<RlWarningMessage> rlWarningMessageList) {
        this.rlWarningMessageList = rlWarningMessageList;
    }

    public boolean isFromRL02F20() {
        return fromRL02F20;
    }

    public void setFromRL02F20(boolean fromRL02F20) {
        this.fromRL02F20 = fromRL02F20;
    }

    public HP02F20DTO getHp02F20DTO() {
        return hp02F20DTO;
    }

    public void setHp02F20DTO(HP02F20DTO hp02f20dto) {
        hp02F20DTO = hp02f20dto;
    }

    public List<XLDFPersonNoteDomainObject> getBeforeChangeNoteList() {
        return beforeChangeNoteList;
    }

    public void setBeforeChangeNoteList(List<XLDFPersonNoteDomainObject> beforeChangeNoteList) {
        this.beforeChangeNoteList = beforeChangeNoteList;
    }

    public String getInputName() {
        return inputName;
    }

    public void setInputName(String inputName) {
        this.inputName = inputName;
    }

    public boolean isDisabledVerifyBtn() {
        return disabledVerifyBtn;
    }

    public void setDisabledVerifyBtn(boolean disabledVerifyBtn) {
        this.disabledVerifyBtn = disabledVerifyBtn;
    }
}