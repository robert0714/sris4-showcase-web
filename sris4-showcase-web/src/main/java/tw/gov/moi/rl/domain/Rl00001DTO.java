/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Tldf004mType;
import tw.gov.moi.rl.component.dto.HouseholdOperation;

/**
 * 戶籍大簿DTO.
 * 
 * @author Jay Kan
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl00001DTO", propOrder = { "queryPage", "enableSaveBtn", "enableFeeBtn", "countyCode",
        "applicationReportURL", "feeReceiptReportURL", "tabViewActiveIndex", "certificateViewStatus", "firstSave",
        "operationMap", "operationCategoryList", "operationCategoryForeignList", "certificateOperationMap",
        "operationSortMap", "certificateOperationList", "xldfPersonDataDTO", "xldfPersonBriefDataDTOs", "txnInfo",
        "reviewMode", "reviewOperationName", "editOperationName", "newOperationMap", "newOperationRenderedMap",
        "operationCategoryRenderedMap", "oldOperationList", "imgFilePath", "applicantImgFilePath", "disablePrintBtn",
        "operationBeanName", "stopPoll", "rl01900MomeryIdDTO", "memoryPerson", "memoryApplyPerson1",
        "memoryApplyPerson2", "memoryDelegatedPerson", "testEnv", "enableCloseWindowBtn", "haveFee", "haveCertificate",
        "allOperationDisabled" })
@XmlRootElement(name = "Rl00001DTO")
public class Rl00001DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -8050692552482766063L;

    /** 是否為查詢頁. */
    @XmlElement(name = "QueryPage")
    @FieldName("是否為查詢頁")
    private boolean queryPage = true;

    /** 是否開啟存檔按鈕. */
    @XmlElement(name = "EnableSaveBtn")
    @FieldName("是否開啟存檔按鈕")
    private boolean enableSaveBtn = false;

    /** 是否開啟規費處理按鈕. */
    @XmlElement(name = "EnableFeeBtn")
    @FieldName("是否開啟規費處理按鈕")
    private boolean enableFeeBtn = false;

    /** 省市縣市. */
    @XmlElement(name = "CountyCode")
    @FieldName("省市縣市")
    private String countyCode;

    /** 戶籍登記報表URL. */
    @XmlElement(name = "ApplicationReportURL")
    @FieldName("戶籍登記報表URL")
    private String applicationReportURL;

    /** 書籍申請書報表URL. */
    @XmlElement(name = "FeeReceiptReportURL")
    @FieldName("書籍申請書報表URL")
    private String feeReceiptReportURL;

    /** TabView之ActiveIndex. */
    @XmlElement(name = "TabViewActiveIndex")
    @FieldName("TabViewActiveIndex")
    private String tabViewActiveIndex;

    /** 書證謄本顯示狀態. */
    @XmlElement(name = "CertificateViewStatus")
    @FieldName("書證謄本顯示狀態")
    private boolean certificateViewStatus = true;

    /** 是否第一次存檔. */
    @XmlElement(name = "FirstSave")
    @FieldName("是否第一次存檔")
    private boolean firstSave = true;

    /** 戶籍登記作業種類. */
    @XmlElement(name = "OperationMap")
    @FieldName("戶籍登記作業種類")
    private transient Map<String, HouseholdOperation> operationMap;

    /** 戶籍登記作業種類【單選清單】. */
    @XmlElement(name = "OperationCategoryList")
    @FieldName("戶籍登記作業種類【單選清單】")
    private List<String> operationCategoryList = new ArrayList<String>();

    /** 戶籍登記外國人作業種類【單選清單】. */
    @XmlElement(name = "OperationCategoryForeignList")
    @FieldName("戶籍登記外國人作業種類【單選清單】")
    private List<String> operationCategoryForeignList = new ArrayList<String>();

    /** 戶籍登記作業【書證謄本清單】. */
    @XmlElement(name = "CertificateOperationMap")
    @FieldName("戶籍登記作業【書證謄本清單】")
    private Map<String, HouseholdOperation> certificateOperationMap = new HashMap<String, HouseholdOperation>();

    /** 戶籍登記作業【分類列表清單】. */
    @XmlElement(name = "OperationSortMap")
    @FieldName("戶籍登記作業【分類列表清單】")
    private Map<String, List<HouseholdOperation>> operationSortMap = new HashMap<String, List<HouseholdOperation>>();

    /** 戶籍登記作業【書證謄本清單 key】. */
    @FieldName("戶籍登記作業【書證謄本清單 key】")
    @XmlElement(name = "CertificateOperationList")
    private List<String> certificateOperationList = new ArrayList<String>();

    /** 當事人資料DTO. */
    @XmlElement(name = "XldfPersonDataDTO")
    @FieldName("當事人資料")
    private XLDFPersonDataDTO xldfPersonDataDTO;

    /** 申請人/受委託人資料. */
    @XmlElement(name = "XldfPersonBriefDataDTOs")
    @FieldName("申請人/受委託人資料")
    private Map<String, XLDFPersonBriefDataDTO> xldfPersonBriefDataDTOs;

    /** The txn info. */
    @XmlElement(name = "TxnInfo")
    @FieldName("交易資料")
    private String txnInfo;

    /** The review mode. */
    @XmlElement(name = "ReviewMode")
    @FieldName("檢視模式")
    private boolean reviewMode = false;

    /** The review operation name. */
    @XmlElement(name = "ReviewOperationName")
    @FieldName("檢視作業名稱")
    private String reviewOperationName;

    /** The edit operation name. */
    @XmlElement(name = "EditOperationName")
    @FieldName("編輯作業名稱")
    private String editOperationName;

    /** The new operation map. */
    @XmlElement(name = "NewOperationMap")
    @FieldName("創新模式作業")
    private Map<String, List<HouseholdOperation>> newOperationMap = new HashMap<String, List<HouseholdOperation>>();

    /** 創新模式作業按鈕顯示. */
    @XmlElement(name = "NewOperationRenderedMap")
    @FieldName("創新模式作業按鈕顯示")
    private Map<String, Boolean> newOperationRenderedMap = new HashMap<String, Boolean>();

    /** 作業類別顯示. */
    @XmlElement(name = "OperationCategoryRenderedMap")
    @FieldName("作業類別顯示")
    private Map<String, Boolean> operationCategoryRenderedMap = new HashMap<String, Boolean>();

    /** The old operation list. */
    @XmlElement(name = "OldOperationList")
    @FieldName("舊模式作業")
    private List<HouseholdOperation> oldOperationList = new ArrayList<HouseholdOperation>();

    /** 當事人國民身分證影像檔名. */
    @XmlElement(name = "ImgFilePath")
    @FieldName("當事人國民身分證影像檔名")
    private String imgFilePath;

    /** 申請人國民身分證影像檔名. */
    @XmlElement(name = "ApplicantImgFilePath")
    @FieldName("申請人國民身分證影像檔名")
    private List<String> applicantImgFilePath = new ArrayList<String>();

    /** 列印申請書按鈕. */
    @XmlElement(name = "DisablePrintBtn")
    @FieldName("列印申請書按鈕")
    private boolean disablePrintBtn = true;

    /** 作業設定名稱. */
    @XmlElement(name = "OperationBeanName")
    @FieldName("作業設定名稱")
    private String operationBeanName;

    /** The stop poll. */
    @XmlElement(name = "StopPoll")
    @FieldName("stopPoll")
    private boolean stopPoll = false;

    /** The rl01900 momery id dto. */
    @XmlElement(name = "Rl01900MomeryIdDTO")
    @FieldName("rl01900MomeryIdDTO")
    private Rl01900MemoryIdDTO rl01900MomeryIdDTO = new Rl01900MemoryIdDTO();

    /** 記憶人. */
    @XmlElement(name = "MemoryPerson")
    @FieldName("記憶人")
    private Tldf004mType memoryPerson;

    /** 記憶申請人1. */
    @XmlElement(name = "MemoryApplyPerson1")
    @FieldName("記憶申請人1")
    private Tldf004mType memoryApplyPerson1;

    /** 記憶申請人2. */
    @XmlElement(name = "MemoryApplyPerson2")
    @FieldName("記憶申請人2")
    private Tldf004mType memoryApplyPerson2;

    /** 記憶受委託人. */
    @XmlElement(name = "MemoryDelegatedPerson")
    @FieldName("記憶受委託人")
    private Tldf004mType memoryDelegatedPerson;

    /** 是否為測試環境. */
    @XmlElement(name = "TestEnv")
    @FieldName("是否為測試環境")
    private boolean testEnv = true;

    /** 是否開放關閉視窗. */
    @XmlElement(name = "EnableCloseWindowBtn")
    @FieldName("是否開放關閉視窗")
    private boolean enableCloseWindowBtn;

    /** 是否有規費. */
    @XmlElement(name = "HaveFee")
    @FieldName("是否有規費")
    private boolean haveFee;

    /** 是否有附繳證件. */
    @XmlElement(name = "HaveCertificate")
    @FieldName("是否有附繳證件")
    private boolean haveCertificate = true;

    /** 是否全部作業不可做. */
    @XmlElement(name = "AllOperationDisabled")
    @FieldName("是否全部作業不可做")
    private boolean allOperationDisabled;

    /**
     * Checks if is query page.
     * 
     * @return true, if is query page
     */
    public boolean isQueryPage() {
        return queryPage;
    }

    /**
     * Sets the query page.
     * 
     * @param queryPage
     *            the new query page
     */
    public void setQueryPage(final boolean queryPage) {
        this.queryPage = queryPage;
    }

    /**
     * Checks if is enable save btn.
     * 
     * @return true, if is enable save btn
     */
    public boolean isEnableSaveBtn() {
        return enableSaveBtn;
    }

    /**
     * Sets the enable save btn.
     * 
     * @param enableSaveBtn
     *            the new enable save btn
     */
    public void setEnableSaveBtn(final boolean enableSaveBtn) {
        this.enableSaveBtn = enableSaveBtn;
    }

    /**
     * Checks if is enable fee btn.
     * 
     * @return true, if is enable fee btn
     */
    public boolean isEnableFeeBtn() {
        return enableFeeBtn;
    }

    /**
     * Sets the enable fee btn.
     * 
     * @param enableFeeBtn
     *            the new enable fee btn
     */
    public void setEnableFeeBtn(final boolean enableFeeBtn) {
        this.enableFeeBtn = enableFeeBtn;
    }

    /**
     * Gets the county code.
     * 
     * @return the county code
     */
    public String getCountyCode() {
        return countyCode;
    }

    /**
     * Sets the county code.
     * 
     * @param countyCode
     *            the new county code
     */
    public void setCountyCode(final String countyCode) {
        this.countyCode = countyCode;
    }

    /**
     * Gets the application report url.
     * 
     * @return the application report url
     */
    public String getApplicationReportURL() {
        return applicationReportURL;
    }

    /**
     * Sets the application report url.
     * 
     * @param applicationReportURL
     *            the new application report url
     */
    public void setApplicationReportURL(final String applicationReportURL) {
        this.applicationReportURL = applicationReportURL;
    }

    /**
     * Gets the fee receipt report url.
     * 
     * @return the fee receipt report url
     */
    public String getFeeReceiptReportURL() {
        return feeReceiptReportURL;
    }

    /**
     * Sets the fee receipt report url.
     * 
     * @param feeReceiptReportURL
     *            the new fee receipt report url
     */
    public void setFeeReceiptReportURL(final String feeReceiptReportURL) {
        this.feeReceiptReportURL = feeReceiptReportURL;
    }

    /**
     * Gets the tab view active index.
     * 
     * @return the tab view active index
     */
    public String getTabViewActiveIndex() {
        return tabViewActiveIndex;
    }

    /**
     * Sets the tab view active index.
     * 
     * @param tabViewActiveIndex
     *            the new tab view active index
     */
    public void setTabViewActiveIndex(final String tabViewActiveIndex) {
        this.tabViewActiveIndex = tabViewActiveIndex;
    }

    /**
     * Checks if is certificate view status.
     * 
     * @return true, if is certificate view status
     */
    public boolean isCertificateViewStatus() {
        return certificateViewStatus;
    }

    /**
     * Sets the certificate view status.
     * 
     * @param certificateViewStatus
     *            the new certificate view status
     */
    public void setCertificateViewStatus(final boolean certificateViewStatus) {
        this.certificateViewStatus = certificateViewStatus;
    }

    /**
     * Checks if is first save.
     * 
     * @return true, if is first save
     */
    public boolean isFirstSave() {
        return firstSave;
    }

    /**
     * Sets the first save.
     * 
     * @param firstSave
     *            the new first save
     */
    public void setFirstSave(final boolean firstSave) {
        this.firstSave = firstSave;
    }

    /**
     * Gets the operation map.
     * 
     * @return the operation map
     */
    public Map<String, HouseholdOperation> getOperationMap() {
        return operationMap;
    }

    /**
     * Sets the operation map.
     * 
     * @param operationMap
     *            the operation map
     */
    public void setOperationMap(final Map<String, HouseholdOperation> operationMap) {
        this.operationMap = operationMap;
    }

    /**
     * Gets the operation category list.
     * 
     * @return the operation category list
     */
    public List<String> getOperationCategoryList() {
        return operationCategoryList;
    }

    /**
     * Sets the operation category list.
     * 
     * @param operationCategoryList
     *            the new operation category list
     */
    public void setOperationCategoryList(final List<String> operationCategoryList) {
        this.operationCategoryList = operationCategoryList;
    }

    /**
     * Gets the operation category foreign list.
     * 
     * @return the operation category foreign list
     */
    public List<String> getOperationCategoryForeignList() {
        return operationCategoryForeignList;
    }

    /**
     * Sets the operation category foreign list.
     * 
     * @param operationCategoryForeignList
     *            the new operation category foreign list
     */
    public void setOperationCategoryForeignList(final List<String> operationCategoryForeignList) {
        this.operationCategoryForeignList = operationCategoryForeignList;
    }

    /**
     * Gets the certificate operation map.
     * 
     * @return the certificate operation map
     */
    public Map<String, HouseholdOperation> getCertificateOperationMap() {
        return certificateOperationMap;
    }

    /**
     * Sets the certificate operation map.
     * 
     * @param certificateOperationMap
     *            the certificate operation map
     */
    public void setCertificateOperationMap(final Map<String, HouseholdOperation> certificateOperationMap) {
        this.certificateOperationMap = certificateOperationMap;
    }

    /**
     * Gets the operation sort map.
     * 
     * @return the operation sort map
     */
    public Map<String, List<HouseholdOperation>> getOperationSortMap() {
        return operationSortMap;
    }

    /**
     * Sets the operation sort map.
     * 
     * @param operationSortMap
     *            the operation sort map
     */
    public void setOperationSortMap(final Map<String, List<HouseholdOperation>> operationSortMap) {
        this.operationSortMap = operationSortMap;
    }

    /**
     * Gets the certificate operation list.
     * 
     * @return the certificate operation list
     */
    public List<String> getCertificateOperationList() {
        return certificateOperationList;
    }

    /**
     * Sets the certificate operation list.
     * 
     * @param certificateOperationList
     *            the new certificate operation list
     */
    public void setCertificateOperationList(final List<String> certificateOperationList) {
        this.certificateOperationList = certificateOperationList;
    }

    /**
     * Gets the xldf person data dto.
     * 
     * @return the xldf person data dto
     */
    public XLDFPersonDataDTO getXldfPersonDataDTO() {
        return xldfPersonDataDTO;
    }

    /**
     * Sets the xldf person data dto.
     * 
     * @param xldfPersonDataDTO
     *            the new xldf person data dto
     */
    public void setXldfPersonDataDTO(final XLDFPersonDataDTO xldfPersonDataDTO) {
        this.xldfPersonDataDTO = xldfPersonDataDTO;
    }

    /**
     * Gets the xldf person brief data dt os.
     * 
     * @return the xldf person brief data dt os
     */
    public Map<String, XLDFPersonBriefDataDTO> getXldfPersonBriefDataDTOs() {
        // 由於發生就事先(原本設計是在householdmaintain.xhtml而不是rl00001.xhtml)使用這屬性...造成發生nullpointerException
        if (xldfPersonBriefDataDTOs == null) {
            xldfPersonBriefDataDTOs = new HashMap<String, XLDFPersonBriefDataDTO>();
        }
        return xldfPersonBriefDataDTOs;
    }

    /**
     * Sets the xldf person brief data dt os.
     * 
     * @param xldfPersonBriefDataDTOs
     *            the xldf person brief data dt os
     */
    public void setXldfPersonBriefDataDTOs(final Map<String, XLDFPersonBriefDataDTO> xldfPersonBriefDataDTOs) {
        this.xldfPersonBriefDataDTOs = xldfPersonBriefDataDTOs;
    }

    /**
     * Gets the txn info.
     * 
     * @return the txn info
     */
    public String getTxnInfo() {
        return txnInfo;
    }

    /**
     * Sets the txn info.
     * 
     * @param txnInfo
     *            the new txn info
     */
    public void setTxnInfo(final String txnInfo) {
        this.txnInfo = txnInfo;
    }

    /**
     * Checks if is review mode.
     * 
     * @return true, if is review mode
     */
    public boolean isReviewMode() {
        return reviewMode;
    }

    /**
     * Sets the review mode.
     * 
     * @param reviewMode
     *            the new review mode
     */
    public void setReviewMode(final boolean reviewMode) {
        this.reviewMode = reviewMode;
    }

    /**
     * Gets the review operation name.
     * 
     * @return the review operation name
     */
    public String getReviewOperationName() {
        return reviewOperationName;
    }

    /**
     * Sets the review operation name.
     * 
     * @param reviewOperationName
     *            the new review operation name
     */
    public void setReviewOperationName(final String reviewOperationName) {
        this.reviewOperationName = reviewOperationName;
    }

    /**
     * Gets the new operation map.
     * 
     * @return the new operation map
     */
    public Map<String, List<HouseholdOperation>> getNewOperationMap() {
        return newOperationMap;
    }

    /**
     * Sets the new operation map.
     * 
     * @param newOperationMap
     *            the new operation map
     */
    public void setNewOperationMap(final Map<String, List<HouseholdOperation>> newOperationMap) {
        this.newOperationMap = newOperationMap;
    }

    /**
     * Gets the new operation rendered map.
     * 
     * @return the new operation rendered map
     */
    public Map<String, Boolean> getNewOperationRenderedMap() {
        return newOperationRenderedMap;
    }

    /**
     * Sets the new operation rendered map.
     * 
     * @param newOperationRenderedMap
     *            the new operation rendered map
     */
    public void setNewOperationRenderedMap(final Map<String, Boolean> newOperationRenderedMap) {
        this.newOperationRenderedMap = newOperationRenderedMap;
    }

    /**
     * Gets the operation category rendered map.
     * 
     * @return the operation category rendered map
     */
    public Map<String, Boolean> getOperationCategoryRenderedMap() {
        return operationCategoryRenderedMap;
    }

    /**
     * Sets the operation category rendered map.
     * 
     * @param operationCategoryRenderedMap
     *            the operation category rendered map
     */
    public void setOperationCategoryRenderedMap(final Map<String, Boolean> operationCategoryRenderedMap) {
        this.operationCategoryRenderedMap = operationCategoryRenderedMap;
    }

    /**
     * Gets the old operation list.
     * 
     * @return the old operation list
     */
    public List<HouseholdOperation> getOldOperationList() {
        return oldOperationList;
    }

    /**
     * Sets the old operation list.
     * 
     * @param oldOperationList
     *            the new old operation list
     */
    public void setOldOperationList(final List<HouseholdOperation> oldOperationList) {
        this.oldOperationList = oldOperationList;
    }

    /**
     * Gets the img file path.
     * 
     * @return the img file path
     */
    public String getImgFilePath() {
        return imgFilePath;
    }

    /**
     * Sets the img file path.
     * 
     * @param imgFilePath
     *            the new img file path
     */
    public void setImgFilePath(final String imgFilePath) {
        this.imgFilePath = imgFilePath;
    }

    /**
     * Gets the applicant img file path.
     * 
     * @return the applicant img file path
     */
    public List<String> getApplicantImgFilePath() {
        return applicantImgFilePath;
    }

    /**
     * Sets the applicant img file path.
     * 
     * @param applicantImgFilePath
     *            the new applicant img file path
     */
    public void setApplicantImgFilePath(final List<String> applicantImgFilePath) {
        this.applicantImgFilePath = applicantImgFilePath;
    }

    /**
     * Checks if is disable print btn.
     * 
     * @return true, if is disable print btn
     */
    public boolean isDisablePrintBtn() {
        return disablePrintBtn;
    }

    /**
     * Sets the disable print btn.
     * 
     * @param disablePrintBtn
     *            the new disable print btn
     */
    public void setDisablePrintBtn(final boolean disablePrintBtn) {
        this.disablePrintBtn = disablePrintBtn;
    }

    /**
     * Gets the operation bean name.
     * 
     * @return the operation bean name
     */
    public String getOperationBeanName() {
        return operationBeanName;
    }

    /**
     * Sets the operation bean name.
     * 
     * @param operationBeanName
     *            the new operation bean name
     */
    public void setOperationBeanName(final String operationBeanName) {
        this.operationBeanName = operationBeanName;
    }

    /**
     * Checks if is stop poll.
     * 
     * @return true, if is stop poll
     */
    public boolean isStopPoll() {
        return stopPoll;
    }

    /**
     * Sets the stop poll.
     * 
     * @param stopPoll
     *            the new stop poll
     */
    public void setStopPoll(final boolean stopPoll) {
        this.stopPoll = stopPoll;
    }

    /**
     * Gets the rl01900 momery id dto.
     * 
     * @return the rl01900 momery id dto
     */
    public Rl01900MemoryIdDTO getRl01900MomeryIdDTO() {
        return rl01900MomeryIdDTO;
    }

    /**
     * Sets the rl01900 momery id dto.
     * 
     * @param rl01900MomeryIdDTO
     *            the new rl01900 momery id dto
     */
    public void setRl01900MomeryIdDTO(final Rl01900MemoryIdDTO rl01900MomeryIdDTO) {
        this.rl01900MomeryIdDTO = rl01900MomeryIdDTO;
    }

    /**
     * Gets the memory person.
     * 
     * @return the memory person
     */
    public Tldf004mType getMemoryPerson() {
        return memoryPerson;
    }

    /**
     * Sets the memory person.
     * 
     * @param memoryPerson
     *            the new memory person
     */
    public void setMemoryPerson(final Tldf004mType memoryPerson) {
        this.memoryPerson = memoryPerson;
    }

    /**
     * Gets the memory apply person1.
     * 
     * @return the memory apply person1
     */
    public Tldf004mType getMemoryApplyPerson1() {
        return memoryApplyPerson1;
    }

    /**
     * Sets the memory apply person1.
     * 
     * @param memoryApplyPerson1
     *            the new memory apply person1
     */
    public void setMemoryApplyPerson1(final Tldf004mType memoryApplyPerson1) {
        this.memoryApplyPerson1 = memoryApplyPerson1;
    }

    /**
     * Gets the memory apply person2.
     * 
     * @return the memory apply person2
     */
    public Tldf004mType getMemoryApplyPerson2() {
        return memoryApplyPerson2;
    }

    /**
     * Sets the memory apply person2.
     * 
     * @param memoryApplyPerson2
     *            the new memory apply person2
     */
    public void setMemoryApplyPerson2(final Tldf004mType memoryApplyPerson2) {
        this.memoryApplyPerson2 = memoryApplyPerson2;
    }

    /**
     * Gets the memory delegated person.
     * 
     * @return the memory delegated person
     */
    public Tldf004mType getMemoryDelegatedPerson() {
        return memoryDelegatedPerson;
    }

    /**
     * Sets the memory delegated person.
     * 
     * @param memoryDelegatedPerson
     *            the new memory delegated person
     */
    public void setMemoryDelegatedPerson(final Tldf004mType memoryDelegatedPerson) {
        this.memoryDelegatedPerson = memoryDelegatedPerson;
    }

    /**
     * Checks if is test env.
     * 
     * @return true, if is test env
     */
    public boolean isTestEnv() {
        return testEnv;
    }

    /**
     * Sets the test env.
     * 
     * @param testEnv
     *            the new test env
     */
    public void setTestEnv(final boolean testEnv) {
        this.testEnv = testEnv;
    }

    /**
     * Checks if is enable close window btn.
     * 
     * @return true, if is enable close window btn
     */
    public boolean isEnableCloseWindowBtn() {
        return enableCloseWindowBtn;
    }

    /**
     * Sets the enable close window btn.
     * 
     * @param enableCloseWindowBtn
     *            the new enable close window btn
     */
    public void setEnableCloseWindowBtn(final boolean enableCloseWindowBtn) {
        this.enableCloseWindowBtn = enableCloseWindowBtn;
    }

    /**
     * Gets the edits the operation name.
     * 
     * @return the edits the operation name
     */
    public String getEditOperationName() {
        return editOperationName;
    }

    /**
     * Sets the edits the operation name.
     * 
     * @param editOperationName
     *            the new edits the operation name
     */
    public void setEditOperationName(final String editOperationName) {
        this.editOperationName = editOperationName;
    }

    /**
     * Checks if is have fee.
     * 
     * @return true, if is have fee
     */
    public boolean isHaveFee() {
        return haveFee;
    }

    /**
     * Sets the have fee.
     * 
     * @param haveFee
     *            the new have fee
     */
    public void setHaveFee(final boolean haveFee) {
        this.haveFee = haveFee;
    }

    /**
     * Checks if is have certificate.
     * 
     * @return true, if is have certificate
     */
    public boolean isHaveCertificate() {
        return haveCertificate;
    }

    /**
     * Sets the have certificate.
     * 
     * @param haveCertificate
     *            the new have certificate
     */
    public void setHaveCertificate(final boolean haveCertificate) {
        this.haveCertificate = haveCertificate;
    }

    /**
     * Checks if is all operation disabled.
     * 
     * @return true, if is all operation disabled
     */
    public boolean isAllOperationDisabled() {
        return allOperationDisabled;
    }

    /**
     * Sets the all operation disabled.
     * 
     * @param allOperationDisabled
     *            the new all operation disabled
     */
    public void setAllOperationDisabled(final boolean allOperationDisabled) {
        this.allOperationDisabled = allOperationDisabled;
    }
}