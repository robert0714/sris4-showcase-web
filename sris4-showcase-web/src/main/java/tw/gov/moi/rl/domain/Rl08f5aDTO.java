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

/**
 * The Class Rl08f5aDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl08f5aDTO", propOrder = { "labelHead", "voteCode", "voteDate", "votePoint", "workVotePoint",
        "listRl08f5aResultDTO", "votePointList", "importYyymmddStart", "importYyymmddEnd", "onlyErrorRecord",
        "importFilePath", "ageYyymmdd", "tabViewActiveIndex" })
@XmlRootElement(name = "Rl08f5aDTO")
public class Rl08f5aDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 標題名稱. */
    @XmlElement(name = "LabelHead")
    @FieldName("標題名稱")
    private String labelHead = "";

    /** 選舉組合代碼. */
    @XmlElement(name = "VoteCode")
    @FieldName("選舉組合代碼")
    private String voteCode = "";

    /** 投票日期. */
    @XmlElement(name = "VoteDate")
    @FieldName("投票日期")
    private String voteDate = "";

    /** 投票所. */
    @XmlElement(name = "VotePoint")
    @FieldName("投票所")
    private String votePoint = "";

    /** 工作地投票所. */
    @XmlElement(name = "WorkVotePoint")
    @FieldName("工作地投票所")
    private String workVotePoint = "";

    /** listRl08f5aResultDTO. */
    @XmlElement(name = "ListRl08f5aResultDTO")
    @FieldName("查詢結果 ")
    private List<Rl08f5aResultDTO> listRl08f5aResultDTO = new ArrayList<Rl08f5aResultDTO>(0);

    /** 投票所清單. */
    @XmlElement(name = "VotePointList")
    @FieldName("投票所清單")
    private List<String> votePointList = new ArrayList<String>();

    /** 匯入日期查詢起日 */
    @FieldName("匯入日期查詢起日")
    @XmlElement(name = "importYyymmddStart", required = false)
    private String importYyymmddStart;

    /** 匯入日期查詢迄日 */
    @FieldName("匯入日期查詢迄日")
    @XmlElement(name = "importYyymmddEnd", required = false)
    private String importYyymmddEnd;

    /** 僅查詢錯誤記錄 */
    @FieldName("僅查詢錯誤記錄")
    @XmlElement(name = "onlyErrorRecord", required = false)
    private boolean onlyErrorRecord;

    /** 匯入檔案路徑 */
    @FieldName("匯入檔案路徑")
    @XmlElement(name = "importFilePath", required = false)
    private String importFilePath;

    /** 年齡 */
    @FieldName("年齡")
    @XmlElement(name = "ageYyymmdd", required = false)
    private String ageYyymmdd;

    /** TabView之ActiveIndex. */
    @XmlElement(name = "TabViewActiveIndex")
    @FieldName("TabViewActiveIndex")
    private String tabViewActiveIndex;

    /**
     * Gets the label head.
     * 
     * @return the label head
     */
    public String getLabelHead() {
        return labelHead;
    }

    /**
     * Sets the label head.
     * 
     * @param labelHead
     *            the new label head
     */
    public void setLabelHead(String labelHead) {
        this.labelHead = labelHead;
    }

    /**
     * Gets the vote code.
     * 
     * @return the vote code
     */
    public String getVoteCode() {
        return voteCode;
    }

    /**
     * Sets the vote code.
     * 
     * @param voteCode
     *            the new vote code
     */
    public void setVoteCode(String voteCode) {
        this.voteCode = voteCode;
    }

    /**
     * Gets the vote date.
     * 
     * @return the vote date
     */
    public String getVoteDate() {
        return voteDate;
    }

    /**
     * Sets the vote date.
     * 
     * @param voteDate
     *            the new vote date
     */
    public void setVoteDate(String voteDate) {
        this.voteDate = voteDate;
    }

    /**
     * Gets the vote point.
     * 
     * @return the vote point
     */
    public String getVotePoint() {
        return votePoint;
    }

    /**
     * Sets the vote point.
     * 
     * @param votePoint
     *            the new vote point
     */
    public void setVotePoint(String votePoint) {
        this.votePoint = votePoint;
    }

    /**
     * Gets the work vote point.
     * 
     * @return the work vote point
     */
    public String getWorkVotePoint() {
        return workVotePoint;
    }

    /**
     * Sets the work vote point.
     * 
     * @param workVotePoint
     *            the new work vote point
     */
    public void setWorkVotePoint(String workVotePoint) {
        this.workVotePoint = workVotePoint;
    }

    /**
     * Gets the list rl08f5a result dto.
     * 
     * @return the list rl08f5a result dto
     */
    public List<Rl08f5aResultDTO> getListRl08f5aResultDTO() {
        return listRl08f5aResultDTO;
    }

    /**
     * Sets the list rl08f5a result dto.
     * 
     * @param listRl08f5aResultDTO
     *            the new list rl08f5a result dto
     */
    public void setListRl08f5aResultDTO(List<Rl08f5aResultDTO> listRl08f5aResultDTO) {
        this.listRl08f5aResultDTO = listRl08f5aResultDTO;
    }

    /**
     * Gets the vote point list.
     * 
     * @return the vote point list
     */
    public List<String> getVotePointList() {
        return votePointList;
    }

    /**
     * Sets the vote point list.
     * 
     * @param votePointList
     *            the new vote point list
     */
    public void setVotePointList(List<String> votePointList) {
        this.votePointList = votePointList;
    }

    public String getImportYyymmddStart() {
        return importYyymmddStart;
    }

    public void setImportYyymmddStart(String importYyymmddStart) {
        this.importYyymmddStart = importYyymmddStart;
    }

    public String getImportYyymmddEnd() {
        return importYyymmddEnd;
    }

    public void setImportYyymmddEnd(String importYyymmddEnd) {
        this.importYyymmddEnd = importYyymmddEnd;
    }

    public boolean isOnlyErrorRecord() {
        return onlyErrorRecord;
    }

    public void setOnlyErrorRecord(boolean onlyErrorRecord) {
        this.onlyErrorRecord = onlyErrorRecord;
    }

    public String getImportFilePath() {
        return importFilePath;
    }

    public void setImportFilePath(String importFilePath) {
        this.importFilePath = importFilePath;
    }

    public String getAgeYyymmdd() {
        return ageYyymmdd;
    }

    public void setAgeYyymmdd(String ageYyymmdd) {
        this.ageYyymmdd = ageYyymmdd;
    }

    public String getTabViewActiveIndex() {
        return tabViewActiveIndex;
    }

    public void setTabViewActiveIndex(String tabViewActiveIndex) {
        this.tabViewActiveIndex = tabViewActiveIndex;
    }

}
