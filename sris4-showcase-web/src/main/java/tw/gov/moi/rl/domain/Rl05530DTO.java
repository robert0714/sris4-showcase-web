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
import tw.gov.moi.domain.Rldf019mType;

/**
 * 門牌異動紀錄重送中央、市縣.
 * 
 * @author Derek Wang
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl05520DTO", propOrder = { "changeType", "oldVillageTown", "newVillageTown", "oldNeighbor",
        "newNeighbor", "oldStreetDoorPlate", "newStreetDoorPlate", "modifyDate", "modifyBatch", "modifyKind",
        "dataCount", "isNotice", "noticeRC", "noticeRR", "dataObj", "resultList" })
@XmlRootElement(name = "Rl05520DTO")
public class Rl05530DTO implements Serializable {
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 新/舊選項. */
    @XmlElement(name = "ChangeType")
    @FieldName("新/舊選項")
    private String changeType;

    /** 舊村里. */
    @XmlElement(name = "OldVillageTown")
    @FieldName("舊村里")
    private String oldVillageTown;

    /** 新村里. */
    @XmlElement(name = "NewVillageTown")
    @FieldName("新村里")
    private String newVillageTown;

    /** 舊鄰. */
    @XmlElement(name = "OldNeighbor")
    @FieldName("舊鄰")
    private String oldNeighbor;

    /** 新鄰. */
    @XmlElement(name = "NewNeighbor")
    @FieldName("新鄰")
    private String newNeighbor;

    /** 舊街路門牌. */
    @XmlElement(name = "OldStreetDoorPlate")
    @FieldName("舊街路門牌")
    private String oldStreetDoorPlate;

    /** 新街路門牌. */
    @XmlElement(name = "NewStreetDoorPlate")
    @FieldName("新街路門牌")
    private String newStreetDoorPlate;

    /** 生效日期. */
    @XmlElement(name = "ModifyDate")
    @FieldName("生效日期")
    private String modifyDate;

    /** 異動批號. */
    @XmlElement(name = "ModifyBatch")
    @FieldName("異動批號")
    private String modifyBatch;

    /** 異動類別. */
    @XmlElement(name = "ModifyKind")
    @FieldName("異動類別")
    private String modifyKind;

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

    /** rldf019m 物件. */
    @XmlElement(name = "DataObj")
    @FieldName("rldf019m 物件")
    private Rldf019mType dataObj;

    /** 查詢結果. */
    @XmlElement(name = "ResultList")
    @FieldName("查詢結果")
    private List<Rl05530DTO> resultList;

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
     * Gets the old village town.
     * 
     * @return the old village town
     */
    public String getOldVillageTown() {
        return oldVillageTown;
    }

    /**
     * Sets the old village town.
     * 
     * @param oldVillageTown
     *            the new old village town
     */
    public void setOldVillageTown(String oldVillageTown) {
        this.oldVillageTown = oldVillageTown;
    }

    /**
     * Gets the new village town.
     * 
     * @return the new village town
     */
    public String getNewVillageTown() {
        return newVillageTown;
    }

    /**
     * Sets the new village town.
     * 
     * @param newVillageTown
     *            the new new village town
     */
    public void setNewVillageTown(String newVillageTown) {
        this.newVillageTown = newVillageTown;
    }

    /**
     * Gets the old neighbor.
     * 
     * @return the old neighbor
     */
    public String getOldNeighbor() {
        return oldNeighbor;
    }

    /**
     * Sets the old neighbor.
     * 
     * @param oldNeighbor
     *            the new old neighbor
     */
    public void setOldNeighbor(String oldNeighbor) {
        this.oldNeighbor = oldNeighbor;
    }

    /**
     * Gets the new neighbor.
     * 
     * @return the new neighbor
     */
    public String getNewNeighbor() {
        return newNeighbor;
    }

    /**
     * Sets the new neighbor.
     * 
     * @param newNeighbor
     *            the new new neighbor
     */
    public void setNewNeighbor(String newNeighbor) {
        this.newNeighbor = newNeighbor;
    }

    /**
     * Gets the old street door plate.
     * 
     * @return the old street door plate
     */
    public String getOldStreetDoorPlate() {
        return oldStreetDoorPlate;
    }

    /**
     * Sets the old street door plate.
     * 
     * @param oldStreetDoorPlate
     *            the new old street door plate
     */
    public void setOldStreetDoorPlate(String oldStreetDoorPlate) {
        this.oldStreetDoorPlate = oldStreetDoorPlate;
    }

    /**
     * Gets the new street door plate.
     * 
     * @return the new street door plate
     */
    public String getNewStreetDoorPlate() {
        return newStreetDoorPlate;
    }

    /**
     * Sets the new street door plate.
     * 
     * @param newStreetDoorPlate
     *            the new street door plate
     */
    public void setNewStreetDoorPlate(String newStreetDoorPlate) {
        this.newStreetDoorPlate = newStreetDoorPlate;
    }

    /**
     * Gets the modify date.
     * 
     * @return the modify date
     */
    public String getModifyDate() {
        return modifyDate;
    }

    /**
     * Sets the modify date.
     * 
     * @param modifyDate
     *            the new modify date
     */
    public void setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
    }

    /**
     * Gets the modify batch.
     * 
     * @return the modify batch
     */
    public String getModifyBatch() {
        return modifyBatch;
    }

    /**
     * Sets the modify batch.
     * 
     * @param modifyBatch
     *            the new modify batch
     */
    public void setModifyBatch(String modifyBatch) {
        this.modifyBatch = modifyBatch;
    }

    /**
     * Gets the modify kind.
     * 
     * @return the modify kind
     */
    public String getModifyKind() {
        return modifyKind;
    }

    /**
     * Sets the modify kind.
     * 
     * @param modifyKind
     *            the new modify kind
     */
    public void setModifyKind(String modifyKind) {
        this.modifyKind = modifyKind;
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
     * Gets the data obj.
     * 
     * @return the data obj
     */
    public Rldf019mType getDataObj() {
        return dataObj;
    }

    /**
     * Sets the data obj.
     * 
     * @param dataObj
     *            the new data obj
     */
    public void setDataObj(final Rldf019mType dataObj) {
        this.dataObj = dataObj;
    }

    /**
     * Gets the result list.
     * 
     * @return the result list
     */
    public List<Rl05530DTO> getResultList() {
        return resultList;
    }

    /**
     * Sets the result list.
     * 
     * @param resultList
     *            the new result list
     */
    public void setResultList(List<Rl05530DTO> resultList) {
        this.resultList = resultList;
    }

}
