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
 * The Class Rl01627SaveDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl01627SaveDTO", propOrder = { "Serial", "HouseholdHeadId", "HouseholdId", "ModifyStreetDoor",
        "newStreet", "newSection", "newLane", "newAlley", "newAlley1", "newAlley2", "newArea", "newAreaSite",
        "newDoorNo", "newFloorNo" })
@XmlRootElement(name = "Rl01627SaveDTO")
public class Rl01627SaveDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 序號 */
    @XmlElement(name = "Serial", required = true)
    @FieldName("序號")
    private String serial;

    /** 戶長統號 */
    @XmlElement(name = "HouseholdHeadId", required = true)
    @FieldName("戶長統號")
    private String householdHeadId;

    /** 戶號 */
    @XmlElement(name = "HouseholdId", required = true)
    @FieldName("戶號")
    private String householdId;

    /** 整編後街路門牌 */
    @XmlElement(name = "ModifyStreetDoor", required = true)
    @FieldName("整編後街路門牌")
    private String modifyStreetDoor;

    /** 改編後街路 */
    @XmlElement(name = "NewStreet")
    @FieldName("改編後街路")
    private String newStreet;

    /** 改編後段 */
    @XmlElement(name = "NewSection")
    @FieldName("改編後段")
    private String newSection;

    /** 改編後巷 */
    @XmlElement(name = "NewLane")
    @FieldName("改編後巷")
    private String newLane;

    /** 改編後弄 */
    @XmlElement(name = "NewAlley")
    @FieldName("改編後弄")
    private String newAlley;

    /** 改編後衖 */
    @XmlElement(name = "NewAlley1")
    @FieldName("改編後衖")
    private String newAlley1;

    /** 改編後衕 */
    @XmlElement(name = "NewAlley2")
    @FieldName("改編後衕")
    private String newAlley2;

    /** 改編後地名 */
    @XmlElement(name = "NewArea")
    @FieldName("改編後地名")
    private String newArea;

    /** 改編後地名放置位置 */
    @XmlElement(name = "NewAreaSite")
    @FieldName("改編後地名放置位置")
    private String newAreaSite;

    /** 改編後門牌號 */
    @XmlElement(name = "NewDoorNo")
    @FieldName("改編後門牌號")
    private String newDoorNo;

    /** 改編後樓層 */
    @XmlElement(name = "NewFloorNo")
    @FieldName("改編後樓層")
    private String newFloorNo;

    public String getHouseholdHeadId() {
        return householdHeadId;
    }

    public void setHouseholdHeadId(final String householdHeadId) {
        this.householdHeadId = householdHeadId;
    }

    public String getHouseholdId() {
        return householdId;
    }

    public void setHouseholdId(final String householdId) {
        this.householdId = householdId;
    }

    public String getModifyStreetDoor() {
        return modifyStreetDoor;
    }

    public void setModifyStreetDoor(final String modifyStreetDoor) {
        this.modifyStreetDoor = modifyStreetDoor;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(final String serial) {
        this.serial = serial;
    }

    /**
     * @return the newStreet
     */
    public String getNewStreet() {
        return newStreet;
    }

    /**
     * @param newStreet
     *            the newStreet to set
     */
    public void setNewStreet(String newStreet) {
        this.newStreet = newStreet;
    }

    /**
     * @return the newSection
     */
    public String getNewSection() {
        return newSection;
    }

    /**
     * @param newSection
     *            the newSection to set
     */
    public void setNewSection(String newSection) {
        this.newSection = newSection;
    }

    /**
     * @return the newLane
     */
    public String getNewLane() {
        return newLane;
    }

    /**
     * @param newLane
     *            the newLane to set
     */
    public void setNewLane(String newLane) {
        this.newLane = newLane;
    }

    /**
     * @return the newAlley
     */
    public String getNewAlley() {
        return newAlley;
    }

    /**
     * @param newAlley
     *            the newAlley to set
     */
    public void setNewAlley(String newAlley) {
        this.newAlley = newAlley;
    }

    /**
     * @return the newAlley1
     */
    public String getNewAlley1() {
        return newAlley1;
    }

    /**
     * @param newAlley1
     *            the newAlley1 to set
     */
    public void setNewAlley1(String newAlley1) {
        this.newAlley1 = newAlley1;
    }

    /**
     * @return the newAlley2
     */
    public String getNewAlley2() {
        return newAlley2;
    }

    /**
     * @param newAlley2
     *            the newAlley2 to set
     */
    public void setNewAlley2(String newAlley2) {
        this.newAlley2 = newAlley2;
    }

    /**
     * @return the newArea
     */
    public String getNewArea() {
        return newArea;
    }

    /**
     * @param newArea
     *            the newArea to set
     */
    public void setNewArea(String newArea) {
        this.newArea = newArea;
    }

    /**
     * @return the newAreaSite
     */
    public String getNewAreaSite() {
        return newAreaSite;
    }

    /**
     * @param newAreaSite
     *            the newAreaSite to set
     */
    public void setNewAreaSite(String newAreaSite) {
        this.newAreaSite = newAreaSite;
    }

    /**
     * @return the newDoorNo
     */
    public String getNewDoorNo() {
        return newDoorNo;
    }

    /**
     * @param newDoorNo
     *            the newDoorNo to set
     */
    public void setNewDoorNo(String newDoorNo) {
        this.newDoorNo = newDoorNo;
    }

    /**
     * @return the newFloorNo
     */
    public String getNewFloorNo() {
        return newFloorNo;
    }

    /**
     * @param newFloorNo
     *            the newFloorNo to set
     */
    public void setNewFloorNo(String newFloorNo) {
        this.newFloorNo = newFloorNo;
    }
}