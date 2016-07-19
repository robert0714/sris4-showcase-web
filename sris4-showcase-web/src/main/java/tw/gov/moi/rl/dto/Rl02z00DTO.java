/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldf001hType;
import tw.gov.moi.rl.domain.Rl02100ApplyHouseholdDTO;
import tw.gov.moi.rl.domain.XLDFApplicantDataDTO;
import tw.gov.moi.rl.domain.XLDFPersonBriefDataDTO;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;

/**
 * 戶籍資料列印DTO.
 * 
 * @author Jay Kan
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl02z00DTO", propOrder = { "activeIndex", "applyType", "printType", "removeYear", "applyName",
        "personId", "applySiteId", "householdSerialNo", "xldfPersonData", "xldfHouseholdData", "applicant1",
        "delegatedPerson", "printHouseholdNote", "other", "applyCount", "selectedIndex", "reportUrl",
        "disablePrintHouseholdBtn", "householdSelectedAll", "existHousehold", "openBook", "txnAndApplicantTheSame",
        "beginApply", "householdList", "oldHouseholdList", "bookList", "selectedBook", "removeTime", "removeTime",
        "rldf001hType", "householdSiteId" })
@XmlRootElement(name = "Rl02z00DTO")
public class Rl02z00DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 6078777469312082747L;

    /**
     * 頁籤索引. <BR>
     * Default: 0
     */
    @XmlElement(name = "ActiveIndex")
    @FieldName("activeIndex")
    private String activeIndex = "0";

    @XmlElement(name = "RemoveYyymmdd")
    @FieldName("除戶日期")
    private String removeYyymmdd;

    @XmlElement(name = "RemoveTime")
    @FieldName("除戶時間")
    private String removeTime;

    @XmlElement(name = "rldf001hType")
    @FieldName("除戶")
    private Rldf001hType rldf001hType;

    /**
     * 申請資料-申請種類. <BR>
     * Default: 現行戶籍謄本
     */
    @XmlElement(name = "ApplyType")
    @FieldName("applyType")
    private String applyType = "1";

    /** 列印種類. */
    @XmlElement(name = "PrintType")
    @FieldName("列印種類")
    private String printType;

    /** 申請資料-除戶年份. */
    @XmlElement(name = "RemoveYear")
    @FieldName("申請資料-除戶年份")
    private String removeYear;

    /** 申請資料-姓名. */
    @XmlElement(name = "ApplyName")
    @FieldName("申請資料-姓名")
    private String applyName;

    /** 當事人國民身分證. */
    @XmlElement(name = "PersonId")
    @FieldName("當事人國民身分證")
    private String personId;

    /** 當事人作業點代碼. */
    @XmlElement(name = "ApplySiteId")
    @FieldName("當事人作業點代碼")
    private String applySiteId;

    /** 戶籍謄本號碼. */
    @XmlElement(name = "HouseholdSerialNo")
    @FieldName("戶籍謄本號碼")
    private String householdSerialNo;

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
    private XLDFApplicantDataDTO applicant1 = new XLDFApplicantDataDTO();

    /** 受委託人資料. */
    @XmlElement(name = "DelegatedPerson")
    @FieldName("受委託人資料")
    private XLDFPersonBriefDataDTO delegatedPerson = new XLDFPersonBriefDataDTO();

    /**
     * 列印全戶記事 <BR>
     * Default: 是.
     */
    @XmlElement(name = "PrintHouseholdNote")
    @FieldName("printHouseholdNote")
    private String printHouseholdNote = "1";

    /** 其他. */
    @XmlElement(name = "Other")
    @FieldName("其他")
    private String other;

    /** 人數. */
    @XmlElement(name = "ApplyCount")
    @FieldName("人數")
    private Integer applyCount;

    /**
     * 所選列數 <BR>
     * Default: 0.
     */
    @XmlElement(name = "SelectedIndex")
    @FieldName("selectedIndex")
    private Integer selectedIndex = Integer.valueOf(0);

    /** 報表路徑. */
    @XmlElement(name = "ReportUrl")
    @FieldName("報表路徑")
    private String reportUrl;

    /**
     * 「列印戶籍謄本」按鈕 <BR>
     * Default: disabled.
     */
    @XmlElement(name = "DisablePrintHouseholdBtn")
    @FieldName("disablePrintHouseholdBtn")
    private boolean disablePrintHouseholdBtn = true;

    /**
     * 全選申請現行戶籍謄本 <BR>
     * Default: true.
     */
    @XmlElement(name = "HouseholdSelectedAll")
    @FieldName("householdSelectedAll")
    private boolean householdSelectedAll = true;

    /**
     * 辦理現戶或除戶 <BR>
     * Default: true 現戶.
     */
    @XmlElement(name = "ExistHousehold")
    @FieldName("existHousehold")
    private boolean existHousehold = true;

    /**
     * 開啟簿頁<BR>
     * Default: false.
     */
    @XmlElement(name = "OpenBook")
    @FieldName("openBook")
    private boolean openBook = false;

    /**
     * 申請人同當事人<BR>
     * Default: false.
     */
    @FieldName("txnAndApplicantTheSame")
    private boolean txnAndApplicantTheSame = false;

    /**
     * 開始申請<BR>
     * Default: false.
     */
    @FieldName("beginApply")
    private boolean beginApply = false;

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

    /** 除戶簿頁所在地作業點代碼. */
    @XmlElement(name = "HouseholdSiteId")
    @FieldName("除戶簿頁戶籍所在地作業點代碼")
    private String householdSiteId = "";

    /** 輸入的統號. */
    @XmlElement(name = "inputId")
    @FieldName("輸入的統號")
    private String inputId = "";

    /** 輸入的統號清單. */
    @XmlElement(name = "inputIdList")
    @FieldName("輸入的統號清單")
    private List<Rl02100ApplyHouseholdDTO> inputIdList = new ArrayList<Rl02100ApplyHouseholdDTO>();

    /** 列印種類2. */
    @XmlElement(name = "PrintType2")
    @FieldName("列印種類2")
    private String printType2 = "";

    /** 除戶日期(年份). */
    @XmlElement(name = "RemoveYear", required = false)
    @FieldName("除戶日期(年份)")
    private String removeYearForApply;

    /** 除戶日期(月份). */
    @XmlElement(name = "RemoveMonth", required = false)
    @FieldName("除戶日期(月份)")
    private String removeMonth;

    /** 除戶日期(日). */
    @XmlElement(name = "RemoveDay", required = false)
    @FieldName("除戶日期(日)")
    private String removeDay;

    /** 除戶日期(時). */
    @XmlElement(name = "RemoveHh", required = false)
    @FieldName("除戶日期(時)")
    private String removeHh;

    /** 除戶日期(分). */
    @XmlElement(name = "RemoveMm", required = false)
    @FieldName("除戶日期(分)")
    private String removeMm;

    /** 除戶日期(秒). */
    @XmlElement(name = "RemoveSs", required = false)
    @FieldName("除戶日期(秒)")
    private String removeSs;

    public Rldf001hType getRldf001hType() {
        return rldf001hType;
    }

    public void setRldf001hType(Rldf001hType rldf001hType) {
        this.rldf001hType = rldf001hType;
    }

    public String getRemoveYyymmdd() {
        return removeYyymmdd;
    }

    public void setRemoveYyymmdd(String removeYyymmdd) {
        this.removeYyymmdd = removeYyymmdd;
    }

    public String getRemoveTime() {
        return removeTime;
    }

    public void setRemoveTime(String removeTime) {
        this.removeTime = removeTime;
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
     * Gets the person id.
     * 
     * @return the person id
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * Sets the person id.
     * 
     * @param personId
     *            the new person id
     */
    public void setPersonId(final String personId) {
        this.personId = personId;
    }

    /**
     * Gets the apply site id.
     * 
     * @return the apply site id
     */
    public String getApplySiteId() {
        return applySiteId;
    }

    /**
     * Sets the apply site id.
     * 
     * @param applySiteId
     *            the new apply site id
     */
    public void setApplySiteId(final String applySiteId) {
        this.applySiteId = applySiteId;
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
    public void setXldfPersonData(final XLDFPersonDataDomainObject xldfPersonData) {
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
    public void setApplicant1(final XLDFApplicantDataDTO applicant1) {
        this.applicant1 = applicant1;
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
    public void setDelegatedPerson(final XLDFPersonBriefDataDTO delegatedPerson) {
        this.delegatedPerson = delegatedPerson;
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
    public Integer getApplyCount() {
        return applyCount;
    }

    /**
     * Sets the apply count.
     * 
     * @param applyCount
     *            the new apply count
     */
    public void setApplyCount(final Integer applyCount) {
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
     * Checks if is open book.
     * 
     * @return true, if is open book
     */
    public boolean isOpenBook() {
        return openBook;
    }

    /**
     * Sets the open book.
     * 
     * @param openBook
     *            the new open book
     */
    public void setOpenBook(final boolean openBook) {
        this.openBook = openBook;
    }

    /**
     * Checks if is txn and applicant the same.
     * 
     * @return true, if is txn and applicant the same
     */
    public boolean isTxnAndApplicantTheSame() {
        return txnAndApplicantTheSame;
    }

    /**
     * Sets the txn and applicant the same.
     * 
     * @param txnAndApplicantTheSame
     *            the new txn and applicant the same
     */
    public void setTxnAndApplicantTheSame(final boolean txnAndApplicantTheSame) {
        this.txnAndApplicantTheSame = txnAndApplicantTheSame;
    }

    /**
     * Checks if is begin apply.
     * 
     * @return true, if is begin apply
     */
    public boolean isBeginApply() {
        return beginApply;
    }

    /**
     * Sets the begin apply.
     * 
     * @param beginApply
     *            the new begin apply
     */
    public void setBeginApply(final boolean beginApply) {
        this.beginApply = beginApply;
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

    public String getHouseholdSiteId() {
        return householdSiteId;
    }

    public void setHouseholdSiteId(String householdSiteId) {
        this.householdSiteId = householdSiteId;
    }

    public String getInputId() {
        return inputId;
    }

    public void setInputId(String inputId) {
        this.inputId = inputId;
    }

    public List<Rl02100ApplyHouseholdDTO> getInputIdList() {
        return inputIdList;
    }

    public void setInputIdList(List<Rl02100ApplyHouseholdDTO> inputIdList) {
        this.inputIdList = inputIdList;
    }

    public String getPrintType2() {
        return printType2;
    }

    public void setPrintType2(String printType2) {
        this.printType2 = printType2;
    }

    public String getRemoveYearForApply() {
        return removeYearForApply;
    }

    public void setRemoveYearForApply(String removeYearForApply) {
        this.removeYearForApply = removeYearForApply;
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

    public String getRemoveHh() {
        return removeHh;
    }

    public void setRemoveHh(String removeHh) {
        this.removeHh = removeHh;
    }

    public String getRemoveMm() {
        return removeMm;
    }

    public void setRemoveMm(String removeMm) {
        this.removeMm = removeMm;
    }

    public String getRemoveSs() {
        return removeSs;
    }

    public void setRemoveSs(String removeSs) {
        this.removeSs = removeSs;
    }
}
