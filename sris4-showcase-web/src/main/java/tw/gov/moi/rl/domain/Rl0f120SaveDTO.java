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
import tw.gov.moi.domain.Rldf012dType;
import tw.gov.moi.domain.Rldf016dType;

/**
 * The Class Rl0f120DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl0f120SaveDTO", propOrder = { "Serial", "Type", "FoundYyymmdd", "FoundHhmmss", "LostName",
        "LostReason", "StartNo", "EndNo", "SiteId", "IsLoss", "Rldf016dData", "Rldf012dList" })
@XmlRootElement(name = "Rl0f120SaveDTO")
public class Rl0f120SaveDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 序號 */
    @XmlElement(name = "Serial", required = true)
    @FieldName("序號")
    private String serial;

    /** 類別 */
    @XmlElement(name = "Type", required = true)
    @FieldName("類別")
    private String type;

    /** 發現遺失日期和時間 */
    // @XmlElement(name = "FoundTime", required = true)
    // @FieldName("發現遺失日期")
    // private String foundTime;

    /** 發現遺失日期 */
    @FieldName("發現遺失日期")
    @XmlElement(name = "FoundYyymmdd", required = true)
    private String foundYyymmdd;

    /** 發現遺失日期 */
    @FieldName("發現遺失時間")
    @XmlElement(name = "FoundHhmmss", required = true)
    private String foundHhmmss;

    /** 遺失人員 */
    @XmlElement(name = "LostName", required = true)
    @FieldName("遺失人員")
    private String lostName;

    /** 遺失原因 */
    @XmlElement(name = "LostReason", required = true)
    @FieldName("遺失原因")
    private String lostReason;

    /** 起始號碼 */
    @XmlElement(name = "StartNo", required = true)
    @FieldName("起始號碼")
    private String startNo;

    /** 中止號碼 */
    @XmlElement(name = "EndNo", required = true)
    @FieldName("中止號碼")
    private String endNo;

    /** 作業代碼 */
    @XmlElement(name = "SiteId", required = true)
    @FieldName("作業代碼")
    private String siteId;

    /** 確認 */
    @XmlElement(name = "IsLoss", required = true)
    @FieldName("確認")
    private String isLoss;

    /** rldf016d Data */
    @XmlElement(name = "Rldf016dData", required = true)
    @FieldName("rldf016d Data")
    private Rldf016dType rldf016dData;

    /** rldf012d List */
    @XmlElement(name = "Rldf012dList", required = true)
    @FieldName("rldf012d List")
    private List<Rldf012dType> rldf012dList;

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public String getLostName() {
        return lostName;
    }

    public void setLostName(final String lostName) {
        this.lostName = lostName;
    }

    public String getLostReason() {
        return lostReason;
    }

    public void setLostReason(final String lostReason) {
        this.lostReason = lostReason;
    }

    public String getStartNo() {
        return startNo;
    }

    public void setStartNo(final String startNo) {
        this.startNo = startNo;
    }

    public String getEndNo() {
        return endNo;
    }

    public void setEndNo(final String endNo) {
        this.endNo = endNo;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(final String siteId) {
        this.siteId = siteId;
    }

    public String getIsLoss() {
        return isLoss;
    }

    public void setIsLoss(final String isLoss) {
        this.isLoss = isLoss;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(final String serial) {
        this.serial = serial;
    }

    public Rldf016dType getRldf016dData() {
        return rldf016dData;
    }

    public void setRldf016dData(final Rldf016dType rldf016dData) {
        this.rldf016dData = rldf016dData;
    }

    public List<Rldf012dType> getRldf012dList() {
        return rldf012dList;
    }

    public void setRldf012dList(final List<Rldf012dType> rldf012dList) {
        this.rldf012dList = rldf012dList;
    }

    // public String getFoundTime() {
    // return foundTime;
    // }
    //
    // public void setFoundTime(final String foundTime) {
    // this.foundTime = foundTime;
    // }

    public String getFoundYyymmdd() {
        return foundYyymmdd;
    }

    public void setFoundYyymmdd(String foundYyymmdd) {
        this.foundYyymmdd = foundYyymmdd;
    }

    public String getFoundHhmmss() {
        return foundHhmmss;
    }

    public void setFoundHhmmss(String foundHhmmss) {
        this.foundHhmmss = foundHhmmss;
    }
}
