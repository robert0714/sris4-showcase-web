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
 * The Class Rl01627DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl01627DTO", propOrder = { "regDate", "modifyBatch", "village", "neighbor", "beforeStreetDoor",
        "ResultList", "oldStreet", "oldSection", "oldLane", "oldAlley", "oldArea", "oldDoorNo", "oldFloorNo",
        "oldAreaSite", "queryDoor" })
@XmlRootElement(name = "Rl01627DTO")
public class Rl01627DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 編釘日期 */
    @XmlElement(name = "regDate", required = true)
    @FieldName("編釘日期")
    private String regDate;

    /** 編釘批號 */
    @XmlElement(name = "ModifyBatch")
    @FieldName("編釘批號")
    private String modifyBatch;

    /** 村里 */
    @XmlElement(name = "Village", required = true)
    @FieldName("村里")
    private String village;

    /** 鄰 */
    @XmlElement(name = "Neighbor", required = true)
    @FieldName("鄰")
    private String neighbor;

    /** 整編前門牌 */
    @XmlElement(name = "BeforeStreetDoor", required = true)
    @FieldName("整編前門牌")
    private String beforeStreetDoor;

    /** 查詢結果 */
    @XmlElement(name = "ResultList", required = true)
    @FieldName("查詢結果 ")
    private List<Rl01627SaveDTO> resultList;

    /** 改編前街路 */
    @XmlElement(name = "OldStreet")
    @FieldName("改編前街路")
    private String oldStreet;

    /** 改編前段 */
    @XmlElement(name = "OldSection")
    @FieldName("改編前段")
    private String oldSection;

    /** 改編前巷 */
    @XmlElement(name = "OldLane")
    @FieldName("改編前巷")
    private String oldLane;

    /** 改編前弄衖衕 */
    @XmlElement(name = "OldAlley")
    @FieldName("改編前弄衖衕")
    private String oldAlley;

    /** 改編前地名 */
    @XmlElement(name = "OldArea")
    @FieldName("改編前地名")
    private String oldArea;

    /** 改編門牌號 */
    @XmlElement(name = "OldDoorNo")
    @FieldName("改編門牌號")
    private String oldDoorNo;

    /** 改編前樓層 */
    @XmlElement(name = "OldFloorNo")
    @FieldName("改編前樓層")
    private String oldFloorNo;

    /** 改編前地名放置位置 */
    @XmlElement(name = "OldAreaSite")
    @FieldName("改編前地名放置位置")
    private String oldAreaSite;

    /** 檢核門牌 */
    @XmlElement(name = "QueryDoor")
    @FieldName("檢核門牌")
    private String queryDoor;

    @XmlElement(name = "seqNo")
    @FieldName("序號")
    private Integer seqNo = 0;

    public Integer getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(Integer seqNo) {
        this.seqNo = seqNo;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public String getModifyBatch() {
        return modifyBatch;
    }

    public void setModifyBatch(String modifyBatch) {
        this.modifyBatch = modifyBatch;
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

    public String getBeforeStreetDoor() {
        return beforeStreetDoor;
    }

    public void setBeforeStreetDoor(String beforeStreetDoor) {
        this.beforeStreetDoor = beforeStreetDoor;
    }

    public List<Rl01627SaveDTO> getResultList() {
        return resultList;
    }

    public void setResultList(List<Rl01627SaveDTO> resultList) {
        this.resultList = resultList;
    }

    public String getOldStreet() {
        return oldStreet;
    }

    public void setOldStreet(String oldStreet) {
        this.oldStreet = oldStreet;
    }

    public String getOldSection() {
        return oldSection;
    }

    public void setOldSection(String oldSection) {
        this.oldSection = oldSection;
    }

    public String getOldLane() {
        return oldLane;
    }

    public void setOldLane(String oldLane) {
        this.oldLane = oldLane;
    }

    public String getOldAlley() {
        return oldAlley;
    }

    public void setOldAlley(String oldAlley) {
        this.oldAlley = oldAlley;
    }

    public String getOldArea() {
        return oldArea;
    }

    public void setOldArea(String oldArea) {
        this.oldArea = oldArea;
    }

    public String getOldDoorNo() {
        return oldDoorNo;
    }

    public void setOldDoorNo(String oldDoorNo) {
        this.oldDoorNo = oldDoorNo;
    }

    public String getOldFloorNo() {
        return oldFloorNo;
    }

    public void setOldFloorNo(String oldFloorNo) {
        this.oldFloorNo = oldFloorNo;
    }

    public String getOldAreaSite() {
        return oldAreaSite;
    }

    public void setOldAreaSite(String oldAreaSite) {
        this.oldAreaSite = oldAreaSite;
    }

    public String getQueryDoor() {
        return queryDoor;
    }

    public void setQueryDoor(String queryDoor) {
        this.queryDoor = queryDoor;
    }
}