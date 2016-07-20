/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * The Class Rl052a4DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl052a4DTO", propOrder = { "CurrentPage", "NoticeStartDate", "ModifyIndex", "NoticeEndDate",
        "BirthNoticeSeq", "ModifyObj", "OriList", "SaveList", "EditList", "ErrorMesgList", "SaveBtn", "TemporaryBtn" })
@XmlRootElement(name = "Rl052a4DTO")
public class Rl052a4DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 當前頁 */
    @XmlElement(name = "CurrentPage", required = true)
    @FieldName("當前頁")
    private int currentPage = 0;

    /** 通報資料周期起始日（起） */
    @XmlElement(name = "NoticeStartDate", required = true)
    @FieldName("通報資料周期起始日（起）")
    private String noticeStartDate;

    /** 通報資料周期起始日（迄） */
    @XmlElement(name = "NoticeEndDate", required = true)
    @FieldName("通報資料周期起始日（迄）")
    private String noticeEndDate;

    /** 出生通報序號 */
    @XmlElement(name = "BirthNoticeSeq", required = true)
    @FieldName("出生通報序號")
    private String birthNoticeSeq;

    /** 出生通報序號 */
    @XmlElement(name = "BirthNoticeNo", required = true)
    @FieldName("出生通報序號")
    private String birthNoticeNo;

    /** 出生通報資料週期（起） */
    @XmlElement(name = "BirthBeginYyymmdd", required = true)
    @FieldName("出生通報資料週期（起）")
    private String birthBeginYyymmdd;

    /** 資料類別 */
    @XmlElement(name = "DataKind", required = true)
    @FieldName("資料類別")
    private String dataKind;

    /** 新生兒出生日期 */
    @XmlElement(name = "BirthYyymmdd", required = true)
    @FieldName("新生兒出生日期")
    private String birthYyymmdd;

    /** 出生者統一編號 */
    @XmlElement(name = "PersonId", required = true)
    @FieldName("出生者統一編號")
    private String personId;

    /** 處理狀況 */
    @XmlElement(name = "ProcessStatus", required = true)
    @FieldName("處理狀況")
    private String processStatus;

    /** 催告日期 */
    @XmlElement(name = "AnnounceYyymmdd", required = true)
    @FieldName("催告日期")
    private String announceYyymmdd;

    /** 逕為登記 */
    @XmlElement(name = "DirectReg", required = true)
    @FieldName("逕為登記")
    private String directReg;

    /** 親子鑑定 */
    @XmlElement(name = "Dna", required = true)
    @FieldName("親子鑑定")
    private String dna;

    /** 未辦原因 */
    @XmlElement(name = "NoRegReason", required = true)
    @FieldName("未辦原因")
    private String noRegReason;

    /** 備註 */
    @XmlElement(name = "Remark", required = true)
    @FieldName("備註")
    private String remark;

    /** dialog修改物件 */
    @XmlElement(name = "ModifyObj", required = true)
    @FieldName("dialog修改物件")
    private Rl052a4ResultDTO modifyObj;

    /** 查詢結果-提供修改的資料 */
    @XmlElement(name = "SaveList", required = true)
    @FieldName("查詢結果-提供修改的資料 ")
    private List<Rl052a4ResultDTO> saveList;

    /** 錯誤訊息 */
    @XmlElement(name = "ErrorMesgList", required = true)
    @FieldName("錯誤訊息")
    private List<Rl052a4ErrorDTO> errorMesgList;

    /** 控制「存檔」鈕 */
    @XmlElement(name = "SaveBtn", required = true)
    @FieldName("控制存檔鈕")
    private boolean saveBtn;

    /** 控制「暫存」鈕 */
    @XmlElement(name = "TemporaryBtn", required = true)
    @FieldName("控制暫存鈕")
    private boolean temporaryBtn;

    public String getNoticeStartDate() {
        return noticeStartDate;
    }

    public void setNoticeStartDate(final String noticeStartDate) {
        this.noticeStartDate = noticeStartDate;
    }

    public String getNoticeEndDate() {
        return noticeEndDate;
    }

    public void setNoticeEndDate(final String noticeEndDate) {
        this.noticeEndDate = noticeEndDate;
    }

    public String getBirthNoticeSeq() {
        return birthNoticeSeq;
    }

    public void setBirthNoticeSeq(final String birthNoticeSeq) {
        this.birthNoticeSeq = birthNoticeSeq;
    }

    public List<Rl052a4ResultDTO> getSaveList() {
        return saveList;
    }

    public void setSaveList(final List<Rl052a4ResultDTO> saveList) {
        this.saveList = saveList;
    }

    public Rl052a4ResultDTO getModifyObj() {
        return modifyObj;
    }

    public void setModifyObj(final Rl052a4ResultDTO modifyObj) {
        this.modifyObj = modifyObj;
    }

    public List<Rl052a4ErrorDTO> getErrorMesgList() {
        return errorMesgList;
    }

    public void setErrorMesgList(final List<Rl052a4ErrorDTO> errorMesgList) {
        this.errorMesgList = errorMesgList;
    }

    public String getBirthNoticeNo() {
        return birthNoticeNo;
    }

    public void setBirthNoticeNo(final String birthNoticeNo) {
        this.birthNoticeNo = birthNoticeNo;
    }

    public String getBirthBeginYyymmdd() {
        return birthBeginYyymmdd;
    }

    public void setBirthBeginYyymmdd(final String birthBeginYyymmdd) {
        this.birthBeginYyymmdd = birthBeginYyymmdd;
    }

    public String getDataKind() {
        return dataKind;
    }

    public void setDataKind(final String dataKind) {
        this.dataKind = dataKind;
    }

    public String getBirthYyymmdd() {
        return birthYyymmdd;
    }

    public void setBirthYyymmdd(final String birthYyymmdd) {
        this.birthYyymmdd = birthYyymmdd;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(final String personId) {
        this.personId = personId;
    }

    public String getProcessStatus() {
        return processStatus;
    }

    public void setProcessStatus(final String processStatus) {
        this.processStatus = processStatus;
    }

    public String getAnnounceYyymmdd() {
        return announceYyymmdd;
    }

    public void setAnnounceYyymmdd(final String announceYyymmdd) {
        this.announceYyymmdd = announceYyymmdd;
    }

    public String getDirectReg() {
        return directReg;
    }

    public void setDirectReg(final String directReg) {
        this.directReg = directReg;
    }

    public String getDna() {
        return dna;
    }

    public void setDna(final String dna) {
        this.dna = dna;
    }

    public String getNoRegReason() {
        return noRegReason;
    }

    public void setNoRegReason(final String noRegReason) {
        this.noRegReason = noRegReason;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(final String remark) {
        this.remark = remark;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public boolean isSaveBtn() {
        return saveBtn;
    }

    public void setSaveBtn(boolean saveBtn) {
        this.saveBtn = saveBtn;
    }

    public boolean isTemporaryBtn() {
        return temporaryBtn;
    }

    public void setTemporaryBtn(boolean temporaryBtn) {
        this.temporaryBtn = temporaryBtn;
    }

}