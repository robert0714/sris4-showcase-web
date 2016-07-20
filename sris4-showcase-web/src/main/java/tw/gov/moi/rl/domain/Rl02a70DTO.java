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
 * The Class Rl02a70DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl02a70DTO", propOrder = { "UpdateType", "PersonId", "SiteId", "HandleType", "ApplyYyymmddStart",
        "ApplyYyymmddEnd", "BirthYyymmddStart", "BirthYyymmddEnd", "SendId", "ApplyReason", "Village", "Neighbor",
        "ProcessStatus", "ProcessMark", "DataSiteId", "SelectedResult", "Rl02a70ResultList" })
@XmlRootElement(name = "Rl02a70DTO")
public class Rl02a70DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 異動類別 */
    @XmlElement(name = "UpdateType")
    @FieldName("異動類別")
    private String updateType;

    /** 國民身分證統一編號 */
    @XmlElement(name = "PersonId")
    @FieldName("國民身分證統一編號")
    private String personId;

    /** 作業點代碼 */
    @XmlElement(name = "SiteId")
    @FieldName("作業點代碼")
    private String siteId;

    /** 辦理類別 */
    @XmlElement(name = "HandleType")
    @FieldName("辦理類別")
    private String handleType;

    /** 受理日期(起) */
    @XmlElement(name = "ApplyYyymmddStart")
    @FieldName("受理日期(起)")
    private String applyYyymmddStart;

    /** 受理日期(迄) */
    @XmlElement(name = "ApplyYyymmddEnd")
    @FieldName("受理日期(迄)")
    private String applyYyymmddEnd;

    /** 出生日期(起) */
    @XmlElement(name = "BirthYyymmddStart")
    @FieldName("出生日期(起)")
    private String birthYyymmddStart;

    /** 出生日期(迄) */
    @XmlElement(name = "BirthYyymmddEnd")
    @FieldName("出生日期(迄)")
    private String birthYyymmddEnd;

    /** 送件識別碼 */
    @XmlElement(name = "SendId")
    @FieldName("送件識別碼")
    private String sendId;

    /** 申請事由 */
    @XmlElement(name = "ApplyReason")
    @FieldName("申請事由")
    private String applyReason;

    /** 村里 */
    @XmlElement(name = "Village")
    @FieldName("村里")
    private String village;

    /** 鄰 */
    @XmlElement(name = "Neighbor")
    @FieldName("鄰")
    private String neighbor;

    /** 處理狀況 */
    @XmlElement(name = "ProcessStatus")
    @FieldName("處理狀況")
    private String processStatus;

    /** 製程註記 */
    @XmlElement(name = "ProcessMark")
    @FieldName("製程註記")
    private String processMark;

    /** 資料所在地 */
    @XmlElement(name = "DataSiteId")
    @FieldName("資料所在地")
    private String dataSiteId;

    /** 國民身分證請領記錄 */
    @XmlElement(name = "SelectedResult")
    @FieldName("國民身分證請領記錄")
    private Rl02a70ResultDTO selectedResult;

    /** 國民身分證請領記錄清單 */
    @XmlElement(name = "Rl02a70ResultList")
    @FieldName("國民身分證請領記錄清單")
    private List<Rl02a70ResultDTO> rl02a70ResultList;

    public String getUpdateType() {
        return updateType;
    }

    public void setUpdateType(String updateType) {
        this.updateType = updateType;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getHandleType() {
        return handleType;
    }

    public void setHandleType(String handleType) {
        this.handleType = handleType;
    }

    public String getApplyYyymmddStart() {
        return applyYyymmddStart;
    }

    public void setApplyYyymmddStart(String applyYyymmddStart) {
        this.applyYyymmddStart = applyYyymmddStart;
    }

    public String getApplyYyymmddEnd() {
        return applyYyymmddEnd;
    }

    public void setApplyYyymmddEnd(String applyYyymmddEnd) {
        this.applyYyymmddEnd = applyYyymmddEnd;
    }

    public String getBirthYyymmddStart() {
        return birthYyymmddStart;
    }

    public void setBirthYyymmddStart(String birthYyymmddStart) {
        this.birthYyymmddStart = birthYyymmddStart;
    }

    public String getBirthYyymmddEnd() {
        return birthYyymmddEnd;
    }

    public void setBirthYyymmddEnd(String birthYyymmddEnd) {
        this.birthYyymmddEnd = birthYyymmddEnd;
    }

    public String getSendId() {
        return sendId;
    }

    public void setSendId(String sendId) {
        this.sendId = sendId;
    }

    public String getApplyReason() {
        return applyReason;
    }

    public void setApplyReason(String applyReason) {
        this.applyReason = applyReason;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getNeighbor() {
        return neighbor;
    }

    public void setNeighbor(String neighbor) {
        this.neighbor = neighbor;
    }

    public String getProcessStatus() {
        return processStatus;
    }

    public void setProcessStatus(String processStatus) {
        this.processStatus = processStatus;
    }

    public String getProcessMark() {
        return processMark;
    }

    public void setProcessMark(String processMark) {
        this.processMark = processMark;
    }

    public String getDataSiteId() {
        return dataSiteId;
    }

    public void setDataSiteId(String dataSiteId) {
        this.dataSiteId = dataSiteId;
    }

    public Rl02a70ResultDTO getSelectedResult() {
        return selectedResult;
    }

    public void setSelectedResult(Rl02a70ResultDTO selectedResult) {
        this.selectedResult = selectedResult;
    }

    public List<Rl02a70ResultDTO> getRl02a70ResultList() {
        return rl02a70ResultList;
    }

    public void setRl02a70ResultList(List<Rl02a70ResultDTO> rl02a70ResultList) {
        this.rl02a70ResultList = rl02a70ResultList;
    }

}
