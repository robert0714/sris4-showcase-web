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
 * The Class Rl01626DTOResult.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01626DTOResult", propOrder = { "delDoorNum", "deleteDate", "village", "neighor", "delDoorNo" })
@XmlRootElement(name = "Rl01626DTOResult")
public class Rl01626DTOResult implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 廢止門牌筆數. */
    @XmlElement(name = "DelDoorNum")
    @FieldName("廢止門牌筆數")
    private String delDoorNum;

    /** 廢止日期. */
    @XmlElement(name = "DeleteDate")
    @FieldName("廢止日期")
    private String deleteDate;

    /** 村里. */
    @XmlElement(name = "Village")
    @FieldName("村里")
    private String village;

    /** 鄰. */
    @XmlElement(name = "Neighor")
    @FieldName("鄰")
    private String neighor;

    /** 廢止門牌. */
    // private String delStreetDoor;
    /** 廢止街路 */
    // private String delStreet;
    /** 廢止段 */
    // private String delSection;
    /** 廢止巷 */
    // private String delLane;
    /** 廢止弄 */
    // private String delAlley;
    /** 廢止地名 */
    // private String delArea;

    /** 廢止門牌號 */
    @XmlElement(name = "DelDoorNo")
    @FieldName("廢止門牌號")
    private String delDoorNo;

    private Object obj = null;

    private List<Rldf020mType> rldf020ms;

    public List<Rldf020mType> getRldf020ms() {
        return rldf020ms;
    }

    public void setRldf020ms(List<Rldf020mType> rldf020ms) {
        this.rldf020ms = rldf020ms;
    }

    /**
     * 廢止樓層.
     * 
     * @return the delete date
     */
    // private String delFloorNo;

    public String getDeleteDate() {
        return deleteDate;
    }

    /**
     * Sets the delete date.
     * 
     * @param deleteDate
     *            the new delete date
     */
    public void setDeleteDate(String deleteDate) {
        this.deleteDate = deleteDate;
    }

    // public String getDelStreetDoor() {
    // return delStreetDoor;
    // }
    //
    // public void setDelStreetDoor(String delStreetDoor) {
    // this.delStreetDoor = delStreetDoor;
    // }
    //
    // public String getDelStreet() {
    // return delStreet;
    // }
    //
    // public void setDelStreet(String delStreet) {
    // this.delStreet = delStreet;
    // }
    //
    // public String getDelSection() {
    // return delSection;
    // }
    //
    // public void setDelSection(String delSection) {
    // this.delSection = delSection;
    // }
    //
    // public String getDelLane() {
    // return delLane;
    // }
    //
    // public void setDelLane(String delLane) {
    // this.delLane = delLane;
    // }
    //
    // public String getDelAlley() {
    // return delAlley;
    // }
    //
    // public void setDelAlley(String delAlley) {
    // this.delAlley = delAlley;
    // }
    //
    // public String getDelArea() {
    // return delArea;
    // }
    //
    // public void setDelArea(String delArea) {
    // this.delArea = delArea;
    // }

    /**
     * Gets the del door no.
     * 
     * @return the del door no
     */
    public String getDelDoorNo() {
        return delDoorNo;
    }

    /**
     * Sets the del door no.
     * 
     * @param delDoorNo
     *            the new del door no
     */
    public void setDelDoorNo(String delDoorNo) {
        this.delDoorNo = delDoorNo;
    }

    // public String getDelFloorNo() {
    // return delFloorNo;
    // }
    //
    // public void setDelFloorNo(String delFloorNo) {
    // this.delFloorNo = delFloorNo;
    // }

    /**
     * Gets the del door num.
     * 
     * @return the del door num
     */
    public String getDelDoorNum() {
        return delDoorNum;
    }

    /**
     * Sets the del door num.
     * 
     * @param delDoorNum
     *            the new del door num
     */
    public void setDelDoorNum(String delDoorNum) {
        this.delDoorNum = delDoorNum;
    }

    /**
     * Gets the village.
     * 
     * @return the village
     */
    public String getVillage() {
        return village;
    }

    /**
     * Sets the village.
     * 
     * @param village
     *            the new village
     */
    public void setVillage(String village) {
        this.village = village;
    }

    /**
     * Gets the neighor.
     * 
     * @return the neighor
     */
    public String getNeighor() {
        return neighor;
    }

    /**
     * Sets the neighor.
     * 
     * @param neighor
     *            the new neighor
     */
    public void setNeighor(String neighor) {
        this.neighor = neighor;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

}
