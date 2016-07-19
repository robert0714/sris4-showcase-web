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
 * The Class Rl04213DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl04213DTO", propOrder = { "ModifyDate", "Village", "Neighbor", "FullNeighbor", "StreetDoor",
        "ModifyMark", "Insert406wDataFlag", "ResultList", "oldStreet", "oldSection", "oldLane", "oldAlley", "oldArea",
        "oldDoorNo", "oldFloorNo", "oldAreaSite" })
@XmlRootElement(name = "Rl04213DTO")
public class Rl04213DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 整編日期 */
    @XmlElement(name = "ModifyDate", required = true)
    @FieldName("整編日期")
    private String modifyDate;

    /** 村里 */
    @XmlElement(name = "Village", required = true)
    @FieldName("村里")
    private String village;

    /** 鄰 */
    @XmlElement(name = "Neighbor", required = true)
    @FieldName("鄰")
    private String neighbor;

    /** 鄰-補0的 */
    @XmlElement(name = "FullNeighbor", required = true)
    @FieldName("鄰-補0的")
    private String fullNeighbor;

    /** 整編前門牌 */
    @XmlElement(name = "StreetDoor", required = true)
    @FieldName("整編前門牌")
    private String streetDoor;

    /** Insert406w Data Flag */
    @XmlElement(name = "Insert406wDataFlag", required = true)
    @FieldName("Insert406w Data Flag")
    private boolean insert406wDataFlag;

    /** 查詢結果 */
    @XmlElement(name = "ResultList", required = true)
    @FieldName("查詢結果 ")
    private List<Rl04213SaveDTO> resultList;

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

    @XmlElement(name = "QueryType")
    @FieldName("查詢類別")
    private String queryType = "0";

    public String getQueryType() {
        return queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public String getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(final String modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(final String village) {
        this.village = village;
    }

    public String getNeighbor() {
        return neighbor;
    }

    public void setNeighbor(final String neighbor) {
        this.neighbor = neighbor;
    }

    public String getStreetDoor() {
        return streetDoor;
    }

    public void setStreetDoor(final String streetDoor) {
        this.streetDoor = streetDoor;
    }

    public List<Rl04213SaveDTO> getResultList() {
        return resultList;
    }

    public void setResultList(final List<Rl04213SaveDTO> resultList) {
        this.resultList = resultList;
    }

    public String getFullNeighbor() {
        return fullNeighbor;
    }

    public void setFullNeighbor(final String fullNeighbor) {
        this.fullNeighbor = fullNeighbor;
    }

    public boolean isInsert406wDataFlag() {
        return insert406wDataFlag;
    }

    public void setInsert406wDataFlag(final boolean insert406wDataFlag) {
        this.insert406wDataFlag = insert406wDataFlag;
    }

    /**
     * @return the oldStreet
     */
    public String getOldStreet() {
        return oldStreet;
    }

    /**
     * @param oldStreet
     *            the oldStreet to set
     */
    public void setOldStreet(String oldStreet) {
        this.oldStreet = oldStreet;
    }

    /**
     * @return the oldSection
     */
    public String getOldSection() {
        return oldSection;
    }

    /**
     * @param oldSection
     *            the oldSection to set
     */
    public void setOldSection(String oldSection) {
        this.oldSection = oldSection;
    }

    /**
     * @return the oldLane
     */
    public String getOldLane() {
        return oldLane;
    }

    /**
     * @param oldLane
     *            the oldLane to set
     */
    public void setOldLane(String oldLane) {
        this.oldLane = oldLane;
    }

    /**
     * @return the oldAlley
     */
    public String getOldAlley() {
        return oldAlley;
    }

    /**
     * @param oldAlley
     *            the oldAlley to set
     */
    public void setOldAlley(String oldAlley) {
        this.oldAlley = oldAlley;
    }

    /**
     * @return the oldArea
     */
    public String getOldArea() {
        return oldArea;
    }

    /**
     * @param oldArea
     *            the oldArea to set
     */
    public void setOldArea(String oldArea) {
        this.oldArea = oldArea;
    }

    /**
     * @return the oldDoorNo
     */
    public String getOldDoorNo() {
        return oldDoorNo;
    }

    /**
     * @param oldDoorNo
     *            the oldDoorNo to set
     */
    public void setOldDoorNo(String oldDoorNo) {
        this.oldDoorNo = oldDoorNo;
    }

    /**
     * @return the oldFloorNo
     */
    public String getOldFloorNo() {
        return oldFloorNo;
    }

    /**
     * @param oldFloorNo
     *            the oldFloorNo to set
     */
    public void setOldFloorNo(String oldFloorNo) {
        this.oldFloorNo = oldFloorNo;
    }

    /**
     * @return the oldAreaSite
     */
    public String getOldAreaSite() {
        return oldAreaSite;
    }

    /**
     * @param oldAreaSite
     *            the oldAreaSite to set
     */
    public void setOldAreaSite(String oldAreaSite) {
        this.oldAreaSite = oldAreaSite;
    }

}