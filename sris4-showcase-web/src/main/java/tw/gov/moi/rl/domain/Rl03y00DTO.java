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
import tw.gov.moi.domain.Rcdfm06mType;
import tw.gov.moi.domain.Rldfm06mType;

/**
 * 國民身分證查詢掛失紀錄DTO.
 * 
 * @author Alan Lo
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl03y00DTO", propOrder = { "trMode", "personId", "createSiteIdOption", "createSiteId", "offLineCount",
        "applyYyymmddStart", "applyYyymmddEnd", "applyYyymmdd", "siteId", "detailDTO", "rcdfm06mOffLineList",
        "rcdfm06mList", "selectedPersonId", "SelectedIndex", "rcdfm06mUnhandedList", "rcdfm06m", "verifyMark",
        "verifyNote", "warningMessgeList", "rcdfm06mAfterUpdate", "rldfm06mOffLineList", "rldfm06mUnhandedList",
        "rldfm06mList", "rldfm06m" })
@XmlRootElement(name = "Rl03y00DTO")
public class Rl03y00DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 掛失類別. */
    @XmlElement(name = "TrMode")
    @FieldName("掛失類別")
    private String trMode = "";

    /** 申請日期. */
    @XmlElement(name = "ApplyYyymmdd")
    @FieldName("申請日期")
    private String applyYyymmdd = "";

    /** 申請日期起日. */
    @XmlElement(name = "ApplyYyymmddStart")
    @FieldName("申請日期起日")
    private String applyYyymmddStart = "";

    /** 申請日期迄日. */
    @XmlElement(name = "ApplyYyymmddEnd")
    @FieldName("申請日期迄日")
    private String applyYyymmddEnd = "";

    /** 國民身分證統一編號. */
    @XmlElement(name = "PersonId")
    @FieldName("國民身分證統一編號")
    private String personId = "";

    /** 作業點代碼. */
    @XmlElement(name = "SiteId")
    @FieldName("作業點代碼")
    private String siteId = "";

    /** 本單位掛失及撤銷掛失記錄作業點代碼. */
    @XmlElement(name = "CreateSiteId")
    @FieldName("本單位掛失及撤銷掛失記錄作業點代碼")
    private String createSiteId = "";

    /** 離線記數. */
    @XmlElement(name = "OffLineCount")
    @FieldName("離線記數")
    private String offLineCount = "";

    /** 本單位掛失及撤銷掛失記錄. */
    @XmlElement(name = "CreateSiteIdOption")
    @FieldName("本單位掛失及撤銷掛失記錄")
    private boolean createSiteIdOption;

    /** 存放rcdfm06mTpye資料. */
    @XmlElement(name = "DetailDTO")
    @FieldName("存放rcdfm06mTpye資料")
    private Rcdfm06mType detailDTO;

    /** 非上班時間掛失查詢結果. */
    @XmlElement(name = "Rcdfm06mOffLineList")
    @FieldName("非上班時間掛失查詢結果")
    private List<Rcdfm06mType> rcdfm06mOffLineList = new ArrayList<Rcdfm06mType>();

    /** 掛失查詢結果. */
    @XmlElement(name = "Rcdfm06mList")
    @FieldName("掛失查詢結果")
    private List<Rcdfm06mType> rcdfm06mList = new ArrayList<Rcdfm06mType>();

    /** 選取的身分證統一編號. */
    @XmlElement(name = "SelectedPersonId")
    @FieldName("選取的身分證統一編號")
    private String selectedPersonId = "";

    /** 選取的索引值. */
    @XmlElement(name = "SelectedIndex")
    @FieldName("選取的索引值")
    private Integer selectedIndex;

    /** 未處理查詢結果. */
    @XmlElement(name = "Rcdfm06mUnhandedList")
    @FieldName("未處理查詢結果")
    private List<Rcdfm06mType> rcdfm06mUnhandedList = new ArrayList<Rcdfm06mType>();

    /** 選取的掛失資料. */
    @XmlElement(name = "Rcdfm06m")
    @FieldName("選取的掛失資料")
    private Rcdfm06mType rcdfm06m;

    /** 掛失註記. */
    @XmlElement(name = "VerifyMark")
    @FieldName("掛失註記")
    private String verifyMark = "";

    /** 掛失說明. */
    @XmlElement(name = "VerifyNote")
    @FieldName("掛失說明")
    private String verifyNote = "";

    /** 警告訊息清單. */
    @FieldName("警告訊息清單")
    @XmlElement(name = "WarningMessgeList", required = false)
    private List<RlWarningMessage> warningMessgeList = new ArrayList<RlWarningMessage>();

    /** 更新之後的身分證掛失註記. */
    @FieldName("更新之後的身分證掛失註記")
    @XmlElement(name = "Rcdfm06mAfterUpdate", required = false)
    private Rcdfm06mType rcdfm06mAfterUpdate;

    /** 非上班時間掛失查詢結果2. */
    @XmlElement(name = "Rldfm06mOffLineList")
    @FieldName("非上班時間掛失查詢結果2")
    private List<Rldfm06mType> rldfm06mOffLineList = new ArrayList<Rldfm06mType>();

    /** 未處理查詢結果2. */
    @XmlElement(name = "Rldfm06mUnhandedList")
    @FieldName("未處理查詢結果2")
    private List<Rldfm06mType> rldfm06mUnhandedList = new ArrayList<Rldfm06mType>();

    /** 掛失查詢結果2. */
    @XmlElement(name = "Rldfm06mList")
    @FieldName("掛失查詢結果2")
    private List<Rldfm06mType> rldfm06mList = new ArrayList<Rldfm06mType>();

    /** 選取的掛失資料2. */
    @XmlElement(name = "Rldfm06m")
    @FieldName("選取的掛失資料2")
    private Rldfm06mType rldfm06m;

    /**
     * Gets the tr mode.
     * 
     * @return the tr mode
     */
    public String getTrMode() {
        return trMode;
    }

    /**
     * Sets the tr mode.
     * 
     * @param trMode
     *            the new tr mode
     */
    public void setTrMode(String trMode) {
        this.trMode = trMode;
    }

    /**
     * Gets the apply yyymmdd.
     * 
     * @return the apply yyymmdd
     */
    public String getApplyYyymmdd() {
        return applyYyymmdd;
    }

    /**
     * Sets the apply yyymmdd.
     * 
     * @param applyYyymmdd
     *            the new apply yyymmdd
     */
    public void setApplyYyymmdd(String applyYyymmdd) {
        this.applyYyymmdd = applyYyymmdd;
    }

    /**
     * Gets the apply yyymmdd start.
     * 
     * @return the apply yyymmdd start
     */
    public String getApplyYyymmddStart() {
        return applyYyymmddStart;
    }

    /**
     * Sets the apply yyymmdd start.
     * 
     * @param applyYyymmddStart
     *            the new apply yyymmdd start
     */
    public void setApplyYyymmddStart(String applyYyymmddStart) {
        this.applyYyymmddStart = applyYyymmddStart;
    }

    /**
     * Gets the apply yyymmdd end.
     * 
     * @return the apply yyymmdd end
     */
    public String getApplyYyymmddEnd() {
        return applyYyymmddEnd;
    }

    /**
     * Sets the apply yyymmdd end.
     * 
     * @param applyYyymmddEnd
     *            the new apply yyymmdd end
     */
    public void setApplyYyymmddEnd(String applyYyymmddEnd) {
        this.applyYyymmddEnd = applyYyymmddEnd;
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
    public void setPersonId(String personId) {
        this.personId = personId;
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
     * Gets the creates the site id.
     * 
     * @return the creates the site id
     */
    public String getCreateSiteId() {
        return createSiteId;
    }

    /**
     * Sets the creates the site id.
     * 
     * @param createSiteId
     *            the new creates the site id
     */
    public void setCreateSiteId(String createSiteId) {
        this.createSiteId = createSiteId;
    }

    /**
     * Gets the off line count.
     * 
     * @return the off line count
     */
    public String getOffLineCount() {
        return offLineCount;
    }

    /**
     * Sets the off line count.
     * 
     * @param offLineCount
     *            the new off line count
     */
    public void setOffLineCount(String offLineCount) {
        this.offLineCount = offLineCount;
    }

    /**
     * Checks if is creates the site id option.
     * 
     * @return true, if is creates the site id option
     */
    public boolean isCreateSiteIdOption() {
        return createSiteIdOption;
    }

    /**
     * Sets the creates the site id option.
     * 
     * @param createSiteIdOption
     *            the new creates the site id option
     */
    public void setCreateSiteIdOption(boolean createSiteIdOption) {
        this.createSiteIdOption = createSiteIdOption;
    }

    /**
     * Gets the detail dto.
     * 
     * @return the detail dto
     */
    public Rcdfm06mType getDetailDTO() {
        return detailDTO;
    }

    /**
     * Sets the detail dto.
     * 
     * @param detailDTO
     *            the new detail dto
     */
    public void setDetailDTO(Rcdfm06mType detailDTO) {
        this.detailDTO = detailDTO;
    }

    /**
     * Gets the rcdfm06m off line list.
     * 
     * @return the rcdfm06m off line list
     */
    public List<Rcdfm06mType> getRcdfm06mOffLineList() {
        return rcdfm06mOffLineList;
    }

    /**
     * Sets the rcdfm06m off line list.
     * 
     * @param rcdfm06mOffLineList
     *            the new rcdfm06m off line list
     */
    public void setRcdfm06mOffLineList(List<Rcdfm06mType> rcdfm06mOffLineList) {
        this.rcdfm06mOffLineList = rcdfm06mOffLineList;
    }

    /**
     * Gets the rcdfm06m list.
     * 
     * @return the rcdfm06m list
     */
    public List<Rcdfm06mType> getRcdfm06mList() {
        return rcdfm06mList;
    }

    /**
     * Sets the rcdfm06m list.
     * 
     * @param rcdfm06mList
     *            the new rcdfm06m list
     */
    public void setRcdfm06mList(List<Rcdfm06mType> rcdfm06mList) {
        this.rcdfm06mList = rcdfm06mList;
    }

    /**
     * Gets the selected person id.
     * 
     * @return the selected person id
     */
    public String getSelectedPersonId() {
        return selectedPersonId;
    }

    /**
     * Sets the selected person id.
     * 
     * @param selectedPersonId
     *            the new selected person id
     */
    public void setSelectedPersonId(String selectedPersonId) {
        this.selectedPersonId = selectedPersonId;
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
    public void setSelectedIndex(Integer selectedIndex) {
        this.selectedIndex = selectedIndex;
    }

    /**
     * Gets the rcdfm06m unhanded list.
     * 
     * @return the rcdfm06m unhanded list
     */
    public List<Rcdfm06mType> getRcdfm06mUnhandedList() {
        return rcdfm06mUnhandedList;
    }

    /**
     * Sets the rcdfm06m unhanded list.
     * 
     * @param rcdfm06mUnhandedList
     *            the new rcdfm06m unhanded list
     */
    public void setRcdfm06mUnhandedList(List<Rcdfm06mType> rcdfm06mUnhandedList) {
        this.rcdfm06mUnhandedList = rcdfm06mUnhandedList;
    }

    /**
     * Gets the rcdfm06m.
     * 
     * @return the rcdfm06m
     */
    public Rcdfm06mType getRcdfm06m() {
        if (rcdfm06m == null) {
            rcdfm06m = new Rcdfm06mType();
        }
        return rcdfm06m;
    }

    /**
     * Sets the rcdfm06m.
     * 
     * @param rcdfm06m
     *            the new rcdfm06m
     */
    public void setRcdfm06m(Rcdfm06mType rcdfm06m) {
        this.rcdfm06m = rcdfm06m;
    }

    /**
     * Gets the verify mark.
     * 
     * @return the verify mark
     */
    public String getVerifyMark() {
        return verifyMark;
    }

    /**
     * Sets the verify mark.
     * 
     * @param verifyMark
     *            the new verify mark
     */
    public void setVerifyMark(String verifyMark) {
        this.verifyMark = verifyMark;
    }

    /**
     * Gets the verify note.
     * 
     * @return the verify note
     */
    public String getVerifyNote() {
        return verifyNote;
    }

    /**
     * Sets the verify note.
     * 
     * @param verifyNote
     *            the new verify note
     */
    public void setVerifyNote(String verifyNote) {
        this.verifyNote = verifyNote;
    }

    /**
     * Gets the warning messge list.
     * 
     * @return the warning messge list
     */
    public List<RlWarningMessage> getWarningMessgeList() {
        return warningMessgeList;
    }

    /**
     * Sets the warning messge list.
     * 
     * @param warningMessgeList
     *            the new warning messge list
     */
    public void setWarningMessgeList(List<RlWarningMessage> warningMessgeList) {
        this.warningMessgeList = warningMessgeList;
    }

    public Rcdfm06mType getRcdfm06mAfterUpdate() {
        return rcdfm06mAfterUpdate;
    }

    public void setRcdfm06mAfterUpdate(Rcdfm06mType rcdfm06mAfterUpdate) {
        this.rcdfm06mAfterUpdate = rcdfm06mAfterUpdate;
    }

    public List<Rldfm06mType> getRldfm06mOffLineList() {
        return rldfm06mOffLineList;
    }

    public void setRldfm06mOffLineList(List<Rldfm06mType> rldfm06mOffLineList) {
        this.rldfm06mOffLineList = rldfm06mOffLineList;
    }

    public List<Rldfm06mType> getRldfm06mUnhandedList() {
        return rldfm06mUnhandedList;
    }

    public void setRldfm06mUnhandedList(List<Rldfm06mType> rldfm06mUnhandedList) {
        this.rldfm06mUnhandedList = rldfm06mUnhandedList;
    }

    public List<Rldfm06mType> getRldfm06mList() {
        return rldfm06mList;
    }

    public void setRldfm06mList(List<Rldfm06mType> rldfm06mList) {
        this.rldfm06mList = rldfm06mList;
    }

    public Rldfm06mType getRldfm06m() {
        return rldfm06m;
    }

    public void setRldfm06m(Rldfm06mType rldfm06m) {
        this.rldfm06m = rldfm06m;
    }

}
