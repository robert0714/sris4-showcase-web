/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * The Class Rl02a70ResultDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl02a70ResultDTO", propOrder = { "Index", "PersonId", "PersonName", "BirthYyymmdd", "ApplyYyymmdd",
        "ApplyHhmmss", "IdCardApplyYyymmdd", "IdCardApplyCode", "ApplyReason", "DayPhoneNumber", "DayPhoneExtension",
        "NightPhoneNumber", "NightPhoneExtension", "CellPhoneNumber", "AcceptSiteId", "ProcessStatus", "ProcessMark",
        "NophotoReason", "NophotoRemark", "SendId", "SendYyymmdd", "SendLotNo", "SendPageNo", "Village", "Neighbor",
        "StreetDoorplate", "settleAreaCode" })
@XmlRootElement(name = "Rl02a70ResultDTO")
public class Rl02a70ResultDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 序號 */
    @FieldName("序號")
    @XmlElement(name = "Index")
    private String index;

    /** 國民身分證統一編號 */
    @FieldName("國民身分證統一編號")
    @XmlElement(name = "PersonId")
    private String personId;

    /** 姓名 */
    @FieldName("姓名")
    @XmlElement(name = "PersonName")
    private String personName;

    /** 出生日期 */
    @FieldName("出生日期")
    @XmlElement(name = "BirthYyymmdd")
    private String birthYyymmdd;

    /** 受理日期 */
    @FieldName("受理日期")
    @XmlElement(name = "ApplyYyymmdd")
    private String applyYyymmdd;

    /** 受理時間 */
    @FieldName("受理時間")
    @XmlElement(name = "ApplyHhmmss")
    private String applyHhmmss;

    /** 原/異動後領補換日期 */
    @FieldName("原/異動後領補換日期")
    @XmlElement(name = "IdCardApplyYyymmdd")
    private String idCardApplyYyymmdd;

    /** 原/異動後領補換代碼 */
    @FieldName("原/異動後領補換代碼")
    @XmlElement(name = "IdCardApplyCode")
    private String idCardApplyCode;

    /** 申請事由 */
    @FieldName("申請事由")
    @XmlElement(name = "ApplyReason")
    private String applyReason;

    /** 聯絡電話(日) */
    @FieldName("聯絡電話(日)")
    @XmlElement(name = "DayPhoneNumber")
    private String dayPhoneNumber;

    /** 分機(日) */
    @FieldName("分機(日)")
    @XmlElement(name = "DayPhoneExtension")
    private String dayPhoneExtension;

    /** 聯絡電話(夜) */
    @FieldName("聯絡電話(夜)")
    @XmlElement(name = "NightPhoneNumber")
    private String nightPhoneNumber;

    /** 分機(夜) */
    @FieldName("分機(夜)")
    @XmlElement(name = "NightPhoneExtension")
    private String nightPhoneExtension;

    /** 行動電話 */
    @FieldName("行動電話")
    @XmlElement(name = "CellPhoneNumber")
    private String cellPhoneNumber;

    /** 發證戶所 */
    @FieldName("發證戶所")
    @XmlElement(name = "AcceptSiteId")
    private String acceptSiteId;

    /** 處理狀況 */
    @FieldName("處理狀況")
    @XmlElement(name = "ProcessStatus")
    private String processStatus;

    /** 製程註記 */
    @FieldName("製程註記")
    @XmlElement(name = "ProcessMark")
    private String processMark;

    /** 免列印相片原因 */
    @FieldName("免列印相片原因")
    @XmlElement(name = "NophotoReason")
    private String nophotoReason;

    /** 免列印相片說明 */
    @FieldName("免列印相片說明")
    @XmlElement(name = "NophotoRemark")
    private String nophotoRemark;

    /** 送件識別碼 */
    @FieldName("送件識別碼")
    @XmlElement(name = "SendId")
    private String sendId;

    /** 送件日期 */
    @FieldName("送件日期")
    @XmlElement(name = "SendYyymmdd")
    private String sendYyymmdd;

    /** 列印序號 */
    @FieldName("列印序號")
    @XmlElement(name = "SendLotNo")
    private String sendLotNo;

    /** 送件號碼 */
    @FieldName("送件號碼")
    @XmlElement(name = "SendPageNo")
    private String sendPageNo;

    /** 村里 */
    @FieldName("村里 ")
    @XmlElement(name = "Village")
    private String village;

    /** 鄰 */
    @FieldName("鄰")
    @XmlElement(name = "Neighbor")
    private String neighbor;

    /** 街路門牌 */
    @FieldName("街路門牌")
    @XmlElement(name = "StreetDoorplate")
    private String streetDoorplate;

    /** 戶籍地行政區域代碼. */
    @FieldName("戶籍地行政區域代碼")
    @XmlElement(name = "SettleAreaCode")
    private String settleAreaCode = "";

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getBirthYyymmdd() {
        return birthYyymmdd;
    }

    public void setBirthYyymmdd(String birthYyymmdd) {
        this.birthYyymmdd = birthYyymmdd;
    }

    public String getApplyYyymmdd() {
        return applyYyymmdd;
    }

    public void setApplyYyymmdd(String applyYyymmdd) {
        this.applyYyymmdd = applyYyymmdd;
    }

    public String getApplyHhmmss() {
        return applyHhmmss;
    }

    public void setApplyHhmmss(String applyHhmmss) {
        this.applyHhmmss = applyHhmmss;
    }

    public String getIdCardApplyYyymmdd() {
        return idCardApplyYyymmdd;
    }

    public void setIdCardApplyYyymmdd(String idCardApplyYyymmdd) {
        this.idCardApplyYyymmdd = idCardApplyYyymmdd;
    }

    public String getIdCardApplyCode() {
        return idCardApplyCode;
    }

    public void setIdCardApplyCode(String idCardApplyCode) {
        this.idCardApplyCode = idCardApplyCode;
    }

    public String getApplyReason() {
        return applyReason;
    }

    public void setApplyReason(String applyReason) {
        this.applyReason = applyReason;
    }

    public String getDayPhoneNumber() {
        return dayPhoneNumber;
    }

    public void setDayPhoneNumber(String dayPhoneNumber) {
        this.dayPhoneNumber = dayPhoneNumber;
    }

    public String getDayPhoneExtension() {
        return dayPhoneExtension;
    }

    public void setDayPhoneExtension(String dayPhoneExtension) {
        this.dayPhoneExtension = dayPhoneExtension;
    }

    public String getNightPhoneNumber() {
        return nightPhoneNumber;
    }

    public void setNightPhoneNumber(String nightPhoneNumber) {
        this.nightPhoneNumber = nightPhoneNumber;
    }

    public String getNightPhoneExtension() {
        return nightPhoneExtension;
    }

    public void setNightPhoneExtension(String nightPhoneExtension) {
        this.nightPhoneExtension = nightPhoneExtension;
    }

    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public void setCellPhoneNumber(String cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
    }

    public String getAcceptSiteId() {
        return acceptSiteId;
    }

    public void setAcceptSiteId(String acceptSiteId) {
        this.acceptSiteId = acceptSiteId;
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

    public String getNophotoReason() {
        return nophotoReason;
    }

    public void setNophotoReason(String nophotoReason) {
        this.nophotoReason = nophotoReason;
    }

    public String getNophotoRemark() {
        return nophotoRemark;
    }

    public void setNophotoRemark(String nophotoRemark) {
        this.nophotoRemark = nophotoRemark;
    }

    public String getSendId() {
        return sendId;
    }

    public void setSendId(String sendId) {
        this.sendId = sendId;
    }

    public String getSendYyymmdd() {
        return sendYyymmdd;
    }

    public void setSendYyymmdd(String sendYyymmdd) {
        this.sendYyymmdd = sendYyymmdd;
    }

    public String getSendLotNo() {
        return sendLotNo;
    }

    public void setSendLotNo(String sendLotNo) {
        this.sendLotNo = sendLotNo;
    }

    public String getSendPageNo() {
        return sendPageNo;
    }

    public void setSendPageNo(String sendPageNo) {
        this.sendPageNo = sendPageNo;
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

    public String getStreetDoorplate() {
        return streetDoorplate;
    }

    public void setStreetDoorplate(String streetDoorplate) {
        this.streetDoorplate = streetDoorplate;
    }

    public String getSettleAreaCode() {
        return settleAreaCode;
    }

    public void setSettleAreaCode(String settleAreaCode) {
        this.settleAreaCode = settleAreaCode;
    }

}
