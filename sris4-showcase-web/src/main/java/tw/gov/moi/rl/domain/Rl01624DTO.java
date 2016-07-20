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
 * The Class Rl01624DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl01624DTO", propOrder = { "regDate", "regBatch", "village", "neighbor", "beforeStreetDoor",
        "beforeStreet", "beforeSection", "beforeLane", "beforeAlley", "beforeArea", "beforeDoorNo", "beforeFloorNo",
        "beforeRegisterDate", "beforeRegisterKind", "changeRange", "saveList", "areaSite" })
@XmlRootElement(name = "Rl01624DTO")
public class Rl01624DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 編釘日期 */
    @XmlElement(name = "RegDate")
    @FieldName("編釘日期")
    private String regDate;

    /** 編釘批號 */
    @XmlElement(name = "RegBatch")
    @FieldName("編釘批號")
    private String regBatch;

    /** 村里 */
    @XmlElement(name = "Village")
    @FieldName("村里")
    private String village;

    /** 鄰 */
    @XmlElement(name = "Neighbor")
    @FieldName("鄰")
    private String neighbor;

    /** 增編前門牌 */
    @XmlElement(name = "BeforeStreetDoor")
    @FieldName("增編前門牌")
    private String beforeStreetDoor;

    /** 增編前街路 */
    @XmlElement(name = "BeforeStreet")
    @FieldName("增編前街路")
    private String beforeStreet;

    /** 增編前段 */
    @XmlElement(name = "BeforeSection")
    @FieldName("增編前段")
    private String beforeSection;

    /** 增編前巷 */
    @XmlElement(name = "BeforeLane")
    @FieldName("增編前巷")
    private String beforeLane;

    /** 增編前弄 */
    @XmlElement(name = "BeforeAlley")
    @FieldName("增編前弄")
    private String beforeAlley;

    /** 增編前地名 */
    @XmlElement(name = "BeforeArea")
    @FieldName("增編前地名")
    private String beforeArea;

    /** 增編前門牌號 */
    @XmlElement(name = "BeforeDoorNo")
    @FieldName("增編前門牌號")
    private String beforeDoorNo;

    /** 增編前樓層 */
    @XmlElement(name = "BeforeFloorNo")
    @FieldName("增編前樓層")
    private String beforeFloorNo;

    /** 增編前編釘日期 */
    @XmlElement(name = "BeforeRegisterDate")
    @FieldName("增編前編釘日期")
    private String beforeRegisterDate;

    /** 增編前編釘類別 */
    @XmlElement(name = "BeforeRegisterKind")
    @FieldName("增編前編釘類別")
    private String beforeRegisterKind;

    /** 複製筆數 */
    @XmlElement(name = "ChangeRange")
    @FieldName("複製筆數")
    private String changeRange;

    /** 複製清單 */
    @XmlElement(name = "SaveList")
    @FieldName("複製清單")
    private List<Rl01624SaveDTO> saveList;

    /** 地名擺放位置 */
    @XmlElement(name = "AreaSite")
    @FieldName("地名擺放位置")
    private String areaSite;

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public String getRegBatch() {
        return regBatch;
    }

    public void setRegBatch(String regBatch) {
        this.regBatch = regBatch;
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

    public String getBeforeStreet() {
        return beforeStreet;
    }

    public void setBeforeStreet(String beforeStreet) {
        this.beforeStreet = beforeStreet;
    }

    public String getBeforeSection() {
        return beforeSection;
    }

    public void setBeforeSection(String beforeSection) {
        this.beforeSection = beforeSection;
    }

    public String getBeforeLane() {
        return beforeLane;
    }

    public void setBeforeLane(String beforeLane) {
        this.beforeLane = beforeLane;
    }

    public String getBeforeAlley() {
        return beforeAlley;
    }

    public void setBeforeAlley(String beforeAlley) {
        this.beforeAlley = beforeAlley;
    }

    public String getBeforeArea() {
        return beforeArea;
    }

    public void setBeforeArea(String beforeArea) {
        this.beforeArea = beforeArea;
    }

    public String getBeforeDoorNo() {
        return beforeDoorNo;
    }

    public void setBeforeDoorNo(String beforeDoorNo) {
        this.beforeDoorNo = beforeDoorNo;
    }

    public String getBeforeFloorNo() {
        return beforeFloorNo;
    }

    public void setBeforeFloorNo(String beforeFloorNo) {
        this.beforeFloorNo = beforeFloorNo;
    }

    /**
     * @return the beforeRegisterDate
     */
    public String getBeforeRegisterDate() {
        return beforeRegisterDate;
    }

    /**
     * @param beforeRegisterDate
     *            the beforeRegisterDate to set
     */
    public void setBeforeRegisterDate(String beforeRegisterDate) {
        this.beforeRegisterDate = beforeRegisterDate;
    }

    /**
     * @return the beforeRegisterKind
     */
    public String getBeforeRegisterKind() {
        return beforeRegisterKind;
    }

    /**
     * @param beforeRegisterKind
     *            the beforeRegisterKind to set
     */
    public void setBeforeRegisterKind(String beforeRegisterKind) {
        this.beforeRegisterKind = beforeRegisterKind;
    }

    public String getChangeRange() {
        return changeRange;
    }

    public void setChangeRange(String changeRange) {
        this.changeRange = changeRange;
    }

    public List<Rl01624SaveDTO> getSaveList() {
        return saveList;
    }

    public void setSaveList(List<Rl01624SaveDTO> saveList) {
        this.saveList = saveList;
    }

    /**
     * @return the areaSite
     */
    public String getAreaSite() {
        return areaSite;
    }

    /**
     * @param areaSite
     *            the areaSite to set
     */
    public void setAreaSite(String areaSite) {
        this.areaSite = areaSite;
    }

}
