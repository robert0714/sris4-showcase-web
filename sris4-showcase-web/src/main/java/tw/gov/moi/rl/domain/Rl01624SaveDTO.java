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
 * The Class Rl01624SaveDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl01624SaveDTO", propOrder = { "Index", "NewStreetDoor", "NewStreet", "NewSection", "NewLane",
        "NewAlley", "NewAlley1", "NewAlley2", "NewArea", "NewDoorNo", "NewFloorNo", "NewAreaSite" })
@XmlRootElement(name = "Rl01624SaveDTO")
public class Rl01624SaveDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 序號 */
    @XmlElement(name = "Index")
    @FieldName("序號 ")
    private String index;

    /** 增編門牌 */
    @XmlElement(name = "NewStreetDoor")
    @FieldName("增編門牌 ")
    private String newStreetDoor;

    /** 增編街路 */
    @XmlElement(name = "NewStreet")
    @FieldName("增編街路")
    private String newStreet;

    /** 增編段 */
    @XmlElement(name = "NewSection")
    @FieldName("增編段")
    private String newSection;

    /** 增編巷 */
    @XmlElement(name = "NewLane")
    @FieldName("增編巷")
    private String newLane;

    /** 增編弄 */
    @XmlElement(name = "NewAlley")
    @FieldName("增編弄")
    private String newAlley;

    /** 增編衖 */
    @XmlElement(name = "NewAlley1")
    @FieldName("增編衖")
    private String newAlley1;

    /** 增編衕 */
    @XmlElement(name = "NewAlley2")
    @FieldName("增編衕")
    private String newAlley2;
    /** 增編地名 */
    @XmlElement(name = "NewArea")
    @FieldName("增編地名")
    private String newArea;

    /** 增編門牌號 */
    @XmlElement(name = "NewDoorNo")
    @FieldName("增編門牌號")
    private String newDoorNo;

    /** 增編樓層 */
    @XmlElement(name = "NewFloorNo")
    @FieldName("增編樓層")
    private String newFloorNo;

    /** 增編地名擺放位置 */
    @XmlElement(name = "NewAreaSite")
    @FieldName("增編地名擺放位置")
    private String newAreaSite;

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getNewStreetDoor() {
        return newStreetDoor;
    }

    public void setNewStreetDoor(String newStreetDoor) {
        this.newStreetDoor = newStreetDoor;
    }

    public String getNewStreet() {
        return newStreet;
    }

    public void setNewStreet(String newStreet) {
        this.newStreet = newStreet;
    }

    public String getNewSection() {
        return newSection;
    }

    public void setNewSection(String newSection) {
        this.newSection = newSection;
    }

    public String getNewLane() {
        return newLane;
    }

    public void setNewLane(String newLane) {
        this.newLane = newLane;
    }

    public String getNewAlley() {
        return newAlley;
    }

    public void setNewAlley(String newAlley) {
        this.newAlley = newAlley;
    }

    public String getNewAlley1() {
        return newAlley1;
    }

    public void setNewAlley1(String newAlley1) {
        this.newAlley1 = newAlley1;
    }

    public String getNewAlley2() {
        return newAlley2;
    }

    public void setNewAlley2(String newAlley2) {
        this.newAlley2 = newAlley2;
    }

    public String getNewArea() {
        return newArea;
    }

    public void setNewArea(String newArea) {
        this.newArea = newArea;
    }

    public String getNewDoorNo() {
        return newDoorNo;
    }

    public void setNewDoorNo(String newDoorNo) {
        this.newDoorNo = newDoorNo;
    }

    public String getNewFloorNo() {
        return newFloorNo;
    }

    public void setNewFloorNo(String newFloorNo) {
        this.newFloorNo = newFloorNo;
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

}
