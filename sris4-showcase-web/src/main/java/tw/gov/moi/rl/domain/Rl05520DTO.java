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
import tw.gov.moi.domain.Rldf020mType;

/**
 * 里鄰門牌資料重送中央、市縣處理.
 * 
 * @author Derek Wang
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl05520DTO", propOrder = { "villageTown", "neighbor", "streetDoorPlate", "registerYyymmdd",
        "registerKind", "changeType", "dataCount", "isNotice", "noticeRC", "noticeRR", "dataObj", "resultList",
        "rowKey" })
@XmlRootElement(name = "Rl05520DTO")
public class Rl05520DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 村里鄰. */
    @XmlElement(name = "VillageTown")
    @FieldName("村里鄰")
    private String villageTown;

    /** 鄰. */
    @XmlElement(name = "Neighbor")
    @FieldName("鄰")
    private String neighbor;

    /** 街路門牌. */
    @XmlElement(name = "StreetDoorPlate")
    @FieldName("街路門牌")
    private String streetDoorPlate;

    /** 編釘日期. */
    @XmlElement(name = "RegisterYyymmdd")
    @FieldName("編釘日期")
    private String registerYyymmdd;

    /** RC、RR編釘日期. */
    @XmlElement(name = "RegisterDate")
    @FieldName("RC、RR編釘日期")
    private String registerDate;

    /** 編釘類別. */
    @XmlElement(name = "RegisterKind")
    @FieldName("編釘類別")
    private String registerKind;

    /** 異動模式. */
    @XmlElement(name = "ChangeType")
    @FieldName("異動模式")
    private String changeType;

    /** 資料筆數. */
    @XmlElement(name = "DataCount")
    @FieldName("資料筆數")
    private String dataCount;

    /** 是否全部重送通報. */
    @XmlElement(name = "IsNotice")
    @FieldName("是否全部重送通報")
    private String isNotice;

    /** 通報中央. */
    @XmlElement(name = "NoticeRC")
    @FieldName("通報中央")
    private boolean noticeRC;

    /** 通報市縣. */
    @XmlElement(name = "NoticeRR")
    @FieldName("通報市縣")
    private boolean noticeRR;

    /** rldf020m 物件. */
    @XmlElement(name = "DataObj")
    @FieldName("rldf020m 物件")
    private Rldf020mType dataObj;

    /** 查詢結果. */
    @XmlElement(name = "ResultList")
    @FieldName("查詢結果")
    private List<Rl05520DTO> resultList;

    /** rowKey. */
    @XmlElement(name = "RowKey")
    @FieldName("rowKey")
    private String rowKey;

    /** 通報日期. */
    @XmlElement(name = "NoticeDate")
    @FieldName("通報日期")
    private String noticeDate;

    /** 通報時間. */
    @XmlElement(name = "NoticeTime")
    @FieldName("通報時間")
    private String noticeTime;

    /** 通報起始地. */
    @XmlElement(name = "FromSiteId")
    @FieldName("通報起始地")
    private String fromSiteId;

    /**
     * Gets the village town.
     * 
     * @return the village town
     */
    public String getVillageTown() {
        return villageTown;
    }

    /**
     * Sets the village town.
     * 
     * @param villageTown
     *            the new village town
     */
    public void setVillageTown(String villageTown) {
        this.villageTown = villageTown;
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
     * Gets the street door plate.
     * 
     * @return the street door plate
     */
    public String getStreetDoorPlate() {
        return streetDoorPlate;
    }

    /**
     * Sets the street door plate.
     * 
     * @param streetDoorPlate
     *            the new street door plate
     */
    public void setStreetDoorPlate(String streetDoorPlate) {
        this.streetDoorPlate = streetDoorPlate;
    }

    /**
     * Gets the register yyymmdd.
     * 
     * @return the register yyymmdd
     */
    public String getRegisterYyymmdd() {
        return registerYyymmdd;
    }

    /**
     * Sets the register yyymmdd.
     * 
     * @param registerYyymmdd
     *            the new register yyymmdd
     */
    public void setRegisterYyymmdd(String registerYyymmdd) {
        this.registerYyymmdd = registerYyymmdd;
    }

    /**
     * Gets the registerDate.
     * 
     * @return the registerDate
     */
    public String getRegisterDate() {
        return registerDate;
    }

    /**
     * Sets the registerDate.
     * 
     * @param registerDate
     *            the new registerDate
     */
    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    /**
     * Gets the register kind.
     * 
     * @return the register kind
     */
    public String getRegisterKind() {
        return registerKind;
    }

    /**
     * Sets the register kind.
     * 
     * @param registerKind
     *            the new register kind
     */
    public void setRegisterKind(String registerKind) {
        this.registerKind = registerKind;
    }

    /**
     * Gets the change type.
     * 
     * @return the change type
     */
    public String getChangeType() {
        return changeType;
    }

    /**
     * Sets the change type.
     * 
     * @param changeType
     *            the new change type
     */
    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    /**
     * Gets the data count.
     * 
     * @return the data count
     */
    public String getDataCount() {
        return dataCount;
    }

    /**
     * Sets the data count.
     * 
     * @param dataCount
     *            the new data count
     */
    public void setDataCount(String dataCount) {
        this.dataCount = dataCount;
    }

    /**
     * Gets the checks if is notice.
     * 
     * @return the checks if is notice
     */
    public String getIsNotice() {
        return isNotice;
    }

    /**
     * Sets the checks if is notice.
     * 
     * @param isNotice
     *            the new checks if is notice
     */
    public void setIsNotice(String isNotice) {
        this.isNotice = isNotice;
    }

    /**
     * Checks if is notice rc.
     * 
     * @return true, if is notice rc
     */
    public boolean isNoticeRC() {
        return noticeRC;
    }

    /**
     * Sets the notice rc.
     * 
     * @param noticeRC
     *            the new notice rc
     */
    public void setNoticeRC(boolean noticeRC) {
        this.noticeRC = noticeRC;
    }

    /**
     * Checks if is notice rr.
     * 
     * @return true, if is notice rr
     */
    public boolean isNoticeRR() {
        return noticeRR;
    }

    /**
     * Sets the notice rr.
     * 
     * @param noticeRR
     *            the new notice rr
     */
    public void setNoticeRR(boolean noticeRR) {
        this.noticeRR = noticeRR;
    }

    /**
     * Gets the result list.
     * 
     * @return the result list
     */
    public List<Rl05520DTO> getResultList() {
        return resultList;
    }

    /**
     * Sets the result list.
     * 
     * @param resultList
     *            the new result list
     */
    public void setResultList(List<Rl05520DTO> resultList) {
        this.resultList = resultList;
    }

    /**
     * Gets the data obj.
     * 
     * @return the data obj
     */
    public Rldf020mType getDataObj() {
        return dataObj;
    }

    /**
     * Sets the data obj.
     * 
     * @param dataObj
     *            the new data obj
     */
    public void setDataObj(final Rldf020mType dataObj) {
        this.dataObj = dataObj;
    }

    /**
     * Gets the row key.
     * 
     * @return the row key
     */
    public String getRowKey() {
        return rowKey;
    }

    /**
     * Sets the noticedate.
     * 
     * @param noticeDate
     *            the new noticeDate
     */
    public void setNoticeDate(String noticeDate) {
        this.noticeDate = noticeDate;
    }

    /**
     * Sets the noticetime.
     * 
     * @param noticeTime
     *            the new noticeTime
     */
    public void setNoticeTime(String noticeTime) {
        this.noticeTime = noticeTime;
    }

    /**
     * Sets the fromSiteId.
     * 
     * @param fromSiteId
     *            the new fromSiteId
     */
    public void setFromSiteId(String fromSiteId) {
        this.fromSiteId = fromSiteId;
    }

    /**
     * Sets the row key.
     * 
     * @param rowKey
     *            the new row key
     */
    public void setRowKey(String rowKey) {
        this.rowKey = rowKey;
    }

}
