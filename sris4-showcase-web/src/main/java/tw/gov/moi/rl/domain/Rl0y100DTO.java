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
import tw.gov.moi.domain.XldfefaplcType;
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdDataDomainObject;

/**
 * 姓名區分作業DTO
 * 
 * @author DAXIONG
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0y100DTO", propOrder = { "household", "personData", "personDataList", "apply1", "apply2", "delegated", "systemDate", "systemTime", "openingOperationDTO", "warningMessgeList", "crossSiteEnabled", "enforcedFlag", "outliveCase", "enforcedApplicant", "acceptAdminOfficeCode", "saveButtonShow", "deleteButtonShow", "operationCode", "initSuccess", "activeIndex", "styleForPersonId", "styleForSiteId", "ellipsisStyleForFirstName", "ellipsisStyleForLastName", "ellipsisStyleForPersonName" })
@XmlRootElement(name = "Rl0y100DTO")
public class Rl0y100DTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 當事人-全戶基本資料 */
    @XmlElement(name = "Household", required = true)
    @FieldName("當事人-全戶基本資料")
    private XLDFHouseholdDataDomainObject household;

    /** 姓名區分作業相關申請資料 */
    @XmlElement(name = "PersonData", required = true)
    @FieldName("姓名區分作業相關申請資料")
    private PersonData personData = new PersonData();

    /** 姓名區分作業相關申請資料清單 */
    @XmlElement(name = "PersonDataList", required = true)
    @FieldName("姓名區分作業相關申請資料清單")
    private List<PersonData> personDataList = new ArrayList<PersonData>();

    /** 申請人1 */
    @XmlElement(name = "Apply1", required = true)
    @FieldName("申請人1")
    private XLDFApplicantDataDTO apply1 = new XLDFApplicantDataDTO();

    /** 申請人2 */
    @XmlElement(name = "Apply2", required = true)
    @FieldName("申請人2")
    private XLDFApplicantDataDTO apply2 = new XLDFApplicantDataDTO();

    /** 受委託人 */
    @XmlElement(name = "Delegated", required = true)
    @FieldName("受委託人")
    private XLDFPersonBriefDataDTO delegated = new XLDFPersonBriefDataDTO();

    /** 系統日期 */
    @XmlElement(name = "SystemDate", required = true)
    @FieldName("系統日期")
    private String systemDate;

    /** 系統時間 */
    @XmlElement(name = "SystemTime", required = true)
    @FieldName("系統時間")
    private String systemTime;

    /** 大簿控制各作業之資訊 */
    @XmlElement(name = "OpeningOperationDTO", required = true)
    @FieldName("大簿控制各作業之資訊")
    private OpeningOperationDTO openingOperationDTO;

    /** 警告訊息清單 */
    @XmlElement(name = "WarningMessgeList", required = true)
    @FieldName("警告訊息清單")
    private List<RlWarningMessage> warningMessgeList = new ArrayList<RlWarningMessage>();

    /** 是否可異地辦理 */
    @XmlElement(name = "CrossSiteEnabled", required = true)
    @FieldName("是否可異地辦理")
    private boolean crossSiteEnabled;

    /** 逕為登記旗標 */
    @XmlElement(name = "EnforcedFlag", required = true)
    @FieldName("逕為登記旗標")
    private boolean enforcedFlag;

    /** 是否開放除戶簿頁(當事人) */
    @XmlElement(name = "OutliveCase", required = true)
    @FieldName("是否開放除戶簿頁(當事人)")
    private boolean outliveCase;

    /** 逕為登記申請人 */
    @XmlElement(name = "EnforcedApplicant", required = true)
    @FieldName("逕為登記申請人")
    private XldfefaplcType enforcedApplicant;

    /** 受理地戶所代碼 */
    @XmlElement(name = "AcceptAdminOfficeCode", required = true)
    @FieldName("受理地戶所代碼")
    private String acceptAdminOfficeCode;

    /** 暫存按鈕是否顯示 */
    @XmlElement(name = "SaveButtonShow", required = true)
    @FieldName("暫存按鈕是否顯示")
    private boolean saveButtonShow;

    /** 刪除按鈕是否顯示 */
    @XmlElement(name = "DeleteButtonShow", required = true)
    @FieldName("刪除按鈕是否顯示")
    private boolean deleteButtonShow;

    /** 作業代碼 */
    @XmlElement(name = "OperationCode", required = true)
    @FieldName("作業代碼")
    private String operationCode;

    /** 初始化是否成功 */
    @XmlElement(name = "InitSuccess", required = true)
    @FieldName("初始化是否成功")
    private boolean initSuccess;

    /** 頁籤索引 */
    @XmlElement(name = "ActiveIndex", required = true)
    @FieldName("頁籤索引")
    private String activeIndex;

    /** 統號樣式 */
    @XmlElement(name = "StyleForPersonId", required = true)
    @FieldName("統號樣式")
    private String styleForPersonId;

    /** 作業點樣式 */
    @XmlElement(name = "StyleForSiteId", required = true)
    @FieldName("作業點樣式")
    private String styleForSiteId;

    /** 省略元件樣式(名) */
    @XmlElement(name = "EllipsisStyleForFirstName", required = true)
    @FieldName("省略元件樣式(名)")
    private String ellipsisStyleForFirstName;

    /** 省略元件樣式(姓) */
    @XmlElement(name = "EllipsisStyleForLastName", required = true)
    @FieldName("省略元件樣式(姓)")
    private String ellipsisStyleForLastName;

    /** 省略元件樣式(姓名) */
    @XmlElement(name = "EllipsisStyleForPersonName", required = true)
    @FieldName("省略元件樣式(姓名)")
    private String ellipsisStyleForPersonName;

    /**
     * 取得當事人-全戶基本資料
     * 
     * @return 當事人-全戶基本資料
     */
    public XLDFHouseholdDataDomainObject getHousehold() {
        return household;
    }

    /**
     * 設定當事人-全戶基本資料
     * 
     * @param household
     *            當事人-全戶基本資料
     */
    public void setHousehold(final XLDFHouseholdDataDomainObject household) {
        this.household = household;
    }

    /**
     * 取得姓名區分作業相關申請資料
     * 
     * @return 姓名區分作業相關申請資料
     */
    public PersonData getPersonData() {
        return personData;
    }

    /**
     * 設定姓名區分作業相關申請資料
     * 
     * @param personData
     *            姓名區分作業相關申請資料
     */
    public void setPersonData(final PersonData personData) {
        this.personData = personData;
    }

    /**
     * 取得姓名區分作業相關申請資料清單
     * 
     * @return 姓名區分作業相關申請資料清單
     */
    public List<PersonData> getPersonDataList() {
        return personDataList;
    }

    /**
     * 設定姓名區分作業相關申請資料清單
     * 
     * @param personDataList
     *            姓名區分作業相關申請資料清單
     */
    public void setPersonDataList(final List<PersonData> personDataList) {
        this.personDataList = personDataList;
    }

    /**
     * 取得申請人1
     * 
     * @return 申請人1
     */
    public XLDFApplicantDataDTO getApply1() {
        return apply1;
    }

    /**
     * 設定申請人1
     * 
     * @param apply1
     *            申請人1
     */
    public void setApply1(final XLDFApplicantDataDTO apply1) {
        this.apply1 = apply1;
    }

    /**
     * 取得申請人2
     * 
     * @return 申請人2
     */
    public XLDFApplicantDataDTO getApply2() {
        return apply2;
    }

    /**
     * 設定申請人2
     * 
     * @param apply2
     *            申請人2
     */
    public void setApply2(final XLDFApplicantDataDTO apply2) {
        this.apply2 = apply2;
    }

    /**
     * 取得受委託人
     * 
     * @return 受委託人
     */
    public XLDFPersonBriefDataDTO getDelegated() {
        return delegated;
    }

    /**
     * 設定受委託人
     * 
     * @param delegated
     *            受委託人
     */
    public void setDelegated(final XLDFPersonBriefDataDTO delegated) {
        this.delegated = delegated;
    }

    /**
     * 取得系統日期
     * 
     * @return 系統日期
     */
    public String getSystemDate() {
        return systemDate;
    }

    /**
     * 設定系統日期
     * 
     * @param systemDate
     *            系統日期
     */
    public void setSystemDate(final String systemDate) {
        this.systemDate = systemDate;
    }

    /**
     * 取得系統時間
     * 
     * @return 系統時間
     */
    public String getSystemTime() {
        return systemTime;
    }

    /**
     * 設定系統時間
     * 
     * @param systemTime
     *            系統時間
     */
    public void setSystemTime(final String systemTime) {
        this.systemTime = systemTime;
    }

    /**
     * 取得大簿控制各作業之資訊
     * 
     * @return 大簿控制各作業之資訊
     */
    public OpeningOperationDTO getOpeningOperationDTO() {
        return openingOperationDTO;
    }

    /**
     * 設定大簿控制各作業之資訊
     * 
     * @param openingOperationDTO
     *            大簿控制各作業之資訊
     */
    public void setOpeningOperationDTO(final OpeningOperationDTO openingOperationDTO) {
        this.openingOperationDTO = openingOperationDTO;
    }

    /**
     * 取得警告訊息清單
     * 
     * @return 警告訊息清單
     */
    public List<RlWarningMessage> getWarningMessgeList() {
        return warningMessgeList;
    }

    /**
     * 設定警告訊息清單
     * 
     * @param warningMessgeList
     *            警告訊息清單
     */
    public void setWarningMessgeList(final List<RlWarningMessage> warningMessgeList) {
        this.warningMessgeList = warningMessgeList;
    }

    /**
     * 取得是否可異地辦理
     * 
     * @return 是否可異地辦理
     */
    public boolean isCrossSiteEnabled() {
        return crossSiteEnabled;
    }

    /**
     * 設定是否可異地辦理
     * 
     * @param crossSiteEnabled
     *            是否可異地辦理
     */
    public void setCrossSiteEnabled(final boolean crossSiteEnabled) {
        this.crossSiteEnabled = crossSiteEnabled;
    }

    /**
     * 取得逕為登記旗標
     * 
     * @return 逕為登記旗標
     */
    public boolean isEnforcedFlag() {
        return enforcedFlag;
    }

    /**
     * 設定逕為登記旗標
     * 
     * @param enforcedFlag
     *            逕為登記旗標
     */
    public void setEnforcedFlag(final boolean enforcedFlag) {
        this.enforcedFlag = enforcedFlag;
    }

    /**
     * 取得是否開放除戶簿頁(當事人)
     * 
     * @return 是否開放除戶簿頁(當事人)
     */
    public boolean isOutliveCase() {
        return outliveCase;
    }

    /**
     * 設定是否開放除戶簿頁(當事人)
     * 
     * @param outliveCase
     *            是否開放除戶簿頁(當事人)
     */
    public void setOutliveCase(final boolean outliveCase) {
        this.outliveCase = outliveCase;
    }

    /**
     * 取得逕為登記申請人
     * 
     * @return 逕為登記申請人
     */
    public XldfefaplcType getEnforcedApplicant() {
        return enforcedApplicant;
    }

    /**
     * 設定逕為登記申請人
     * 
     * @param enforcedApplicant
     *            逕為登記申請人
     */
    public void setEnforcedApplicant(final XldfefaplcType enforcedApplicant) {
        this.enforcedApplicant = enforcedApplicant;
    }

    /**
     * 取得受理地戶所代碼
     * 
     * @return 受理地戶所代碼
     */
    public String getAcceptAdminOfficeCode() {
        return acceptAdminOfficeCode;
    }

    /**
     * 設定受理地戶所代碼
     * 
     * @param acceptAdminOfficeCode
     *            受理地戶所代碼
     */
    public void setAcceptAdminOfficeCode(final String acceptAdminOfficeCode) {
        this.acceptAdminOfficeCode = acceptAdminOfficeCode;
    }

    /**
     * 取得暫存按鈕是否顯示
     * 
     * @return 暫存按鈕是否顯示
     */
    public boolean isSaveButtonShow() {
        return saveButtonShow;
    }

    /**
     * 設定暫存按鈕是否顯示
     * 
     * @param saveButtonShow
     *            暫存按鈕是否顯示
     */
    public void setSaveButtonShow(final boolean saveButtonShow) {
        this.saveButtonShow = saveButtonShow;
    }

    /**
     * 取得刪除按鈕是否顯示
     * 
     * @return 刪除按鈕是否顯示
     */
    public boolean isDeleteButtonShow() {
        return deleteButtonShow;
    }

    /**
     * 設定刪除按鈕是否顯示
     * 
     * @param deleteButtonShow
     *            刪除按鈕是否顯示
     */
    public void setDeleteButtonShow(final boolean deleteButtonShow) {
        this.deleteButtonShow = deleteButtonShow;
    }

    /**
     * 取得作業代碼
     * 
     * @return 作業代碼
     */
    public String getOperationCode() {
        return operationCode;
    }

    /**
     * 設定作業代碼
     * 
     * @param operationCode
     *            作業代碼
     */
    public void setOperationCode(final String operationCode) {
        this.operationCode = operationCode;
    }

    /**
     * 取得初始化是否成功
     * 
     * @return 初始化是否成功
     */
    public boolean isInitSuccess() {
        return initSuccess;
    }

    /**
     * 設定初始化是否成功
     * 
     * @param initSuccess
     *            初始化是否成功
     */
    public void setInitSuccess(final boolean initSuccess) {
        this.initSuccess = initSuccess;
    }

    /**
     * 取得頁籤索引
     * 
     * @return 頁籤索引
     */
    public String getActiveIndex() {
        return activeIndex;
    }

    /**
     * 設定頁籤索引
     * 
     * @param activeIndex
     *            頁籤索引
     */
    public void setActiveIndex(final String activeIndex) {
        this.activeIndex = activeIndex;
    }

    /**
     * 取得統號樣式
     * 
     * @return 統號樣式
     */
    public String getStyleForPersonId() {
        return styleForPersonId;
    }

    /**
     * 設定統號樣式
     * 
     * @param styleForPersonId
     *            統號樣式
     */
    public void setStyleForPersonId(final String styleForPersonId) {
        this.styleForPersonId = styleForPersonId;
    }

    /**
     * 取得作業點樣式
     * 
     * @return 作業點樣式
     */
    public String getStyleForSiteId() {
        return styleForSiteId;
    }

    /**
     * 設定作業點樣式
     * 
     * @param styleForSiteId
     *            作業點樣式
     */
    public void setStyleForSiteId(final String styleForSiteId) {
        this.styleForSiteId = styleForSiteId;
    }

    /**
     * 取得省略元件樣式(名)
     * 
     * @return 省略元件樣式(名)
     */
    public String getEllipsisStyleForFirstName() {
        return ellipsisStyleForFirstName;
    }

    /**
     * 設定省略元件樣式(名)
     * 
     * @param ellipsisStyleForFirstName
     *            省略元件樣式(名)
     */
    public void setEllipsisStyleForFirstName(final String ellipsisStyleForFirstName) {
        this.ellipsisStyleForFirstName = ellipsisStyleForFirstName;
    }

    /**
     * 取得省略元件樣式(姓)
     * 
     * @return 省略元件樣式(姓)
     */
    public String getEllipsisStyleForLastName() {
        return ellipsisStyleForLastName;
    }

    /**
     * 設定省略元件樣式(姓)
     * 
     * @param ellipsisStyleForLastName
     *            省略元件樣式(姓)
     */
    public void setEllipsisStyleForLastName(final String ellipsisStyleForLastName) {
        this.ellipsisStyleForLastName = ellipsisStyleForLastName;
    }

    /**
     * 取得省略元件樣式(姓名)
     * 
     * @return 省略元件樣式(姓名)
     */
    public String getEllipsisStyleForPersonName() {
        return ellipsisStyleForPersonName;
    }

    /**
     * 設定省略元件樣式(姓名)
     * 
     * @param ellipsisStyleForPersonName
     *            省略元件樣式(姓名)
     */
    public void setEllipsisStyleForPersonName(final String ellipsisStyleForPersonName) {
        this.ellipsisStyleForPersonName = ellipsisStyleForPersonName;
    }

}