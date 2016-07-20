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
import tw.gov.moi.domain.Rldf001mType;
import tw.gov.moi.domain.Rldf004mType;
import tw.gov.moi.domain.Rldf010eType;

/**
 * 戶口校正資料登錄(新增)處理.
 * 
 * @author Derek Wang
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl07224DTO", propOrder = { "personId", "personName", "birthYyymmdd", "beforeCorrectYyy",
        "afterCorrectYyy", "beforeNoRevisionReason", "afterNoRevisionReason", "village", "neighbor", "dataObj01m",
        "dataObj", "dataObj10e" })
@XmlRootElement(name = "Rl07224DTO")
public class Rl07224DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 統號. */
    @XmlElement(name = "PersonId")
    @FieldName("統號")
    private String personId;

    /** 姓名. */
    @XmlElement(name = "PersonName")
    @FieldName("姓名")
    private String personName;

    /** 出生日. */
    @XmlElement(name = "BirthYyymmdd")
    @FieldName("出生日")
    private String birthYyymmdd;

    /** 原校正年分. */
    @XmlElement(name = "BeforeCorrectYyy")
    @FieldName("原校正年分")
    private String beforeCorrectYyy;

    /** 校正後年分. */
    @XmlElement(name = "AfterCorrectYyy")
    @FieldName("校正後年分")
    private String afterCorrectYyy;

    /** 原校正原因. */
    @XmlElement(name = "BeforeNoRevisionReason")
    @FieldName("原校正原因")
    private String beforeNoRevisionReason;

    /** 修改後校正年分. */
    @XmlElement(name = "AfterNoRevisionReason")
    @FieldName("修改後校正年分")
    private String afterNoRevisionReason;

    /** 村里. */
    @XmlElement(name = "Village")
    @FieldName("村里")
    private String village;

    /** 鄰. */
    @XmlElement(name = "Neighbor")
    @FieldName("鄰")
    private String neighbor;

    /** rldf001m 物件. */
    @XmlElement(name = "DataObj01m")
    @FieldName("rldf001m 物件")
    private Rldf001mType dataObj01m = new Rldf001mType();

    /** rldf004m 物件. */
    @XmlElement(name = "DataObj")
    @FieldName("rldf004m 物件")
    private Rldf004mType dataObj = new Rldf004mType();

    /** rldf010e 物件. */
    @XmlElement(name = "DataObj10e")
    @FieldName("rldf010e 物件")
    private Rldf010eType dataObj10e = new Rldf010eType();

    /**
     * Gets the person id.
     * 
     * @return the person id
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * Sets the person id.
     * 
     * @param personId
     *            the new person id
     */
    public void setPersonId(String personId) {
        this.personId = personId;
    }

    /**
     * Gets the person name.
     * 
     * @return the person name
     */
    public String getPersonName() {
        return personName;
    }

    /**
     * Sets the person name.
     * 
     * @param personName
     *            the new person name
     */
    public void setPersonName(String personName) {
        this.personName = personName;
    }

    /**
     * Gets the birth yyymmdd.
     * 
     * @return the birth yyymmdd
     */
    public String getBirthYyymmdd() {
        return birthYyymmdd;
    }

    /**
     * Sets the birth yyymmdd.
     * 
     * @param birthYyymmdd
     *            the new birth yyymmdd
     */
    public void setBirthYyymmdd(String birthYyymmdd) {
        this.birthYyymmdd = birthYyymmdd;
    }

    /**
     * Gets the before correct yyy.
     * 
     * @return the before correct yyy
     */
    public String getBeforeCorrectYyy() {
        return beforeCorrectYyy;
    }

    /**
     * Sets the before correct yyy.
     * 
     * @param beforeCorrectYyy
     *            the new before correct yyy
     */
    public void setBeforeCorrectYyy(String beforeCorrectYyy) {
        this.beforeCorrectYyy = beforeCorrectYyy;
    }

    /**
     * Gets the after correct yyy.
     * 
     * @return the after correct yyy
     */
    public String getAfterCorrectYyy() {
        return afterCorrectYyy;
    }

    /**
     * Sets the after correct yyy.
     * 
     * @param afterCorrectYyy
     *            the new after correct yyy
     */
    public void setAfterCorrectYyy(String afterCorrectYyy) {
        this.afterCorrectYyy = afterCorrectYyy;
    }

    /**
     * Gets the before no revision reason.
     * 
     * @return the before no revision reason
     */
    public String getBeforeNoRevisionReason() {
        return beforeNoRevisionReason;
    }

    /**
     * Sets the before no revision reason.
     * 
     * @param beforeNoRevisionReason
     *            the new before no revision reason
     */
    public void setBeforeNoRevisionReason(String beforeNoRevisionReason) {
        this.beforeNoRevisionReason = beforeNoRevisionReason;
    }

    /**
     * Gets the after no revision reason.
     * 
     * @return the after no revision reason
     */
    public String getAfterNoRevisionReason() {
        return afterNoRevisionReason;
    }

    /**
     * Sets the after no revision reason.
     * 
     * @param afterNoRevisionReason
     *            the new after no revision reason
     */
    public void setAfterNoRevisionReason(String afterNoRevisionReason) {
        this.afterNoRevisionReason = afterNoRevisionReason;
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
     * Gets the data obj01m.
     * 
     * @return the data obj01m
     */
    public Rldf001mType getDataObj01m() {
        return dataObj01m;
    }

    /**
     * Sets the data obj01m.
     * 
     * @param dataObj01m
     *            the new data obj01m
     */
    public void setDataObj01m(Rldf001mType dataObj01m) {
        this.dataObj01m = dataObj01m;
    }

    /**
     * Gets the data obj.
     * 
     * @return the data obj
     */
    public Rldf004mType getDataObj() {
        return dataObj;
    }

    /**
     * Sets the data obj.
     * 
     * @param dataObj
     *            the new data obj
     */
    public void setDataObj(Rldf004mType dataObj) {
        this.dataObj = dataObj;
    }

    /**
     * Gets the data obj10e.
     * 
     * @return the data obj10e
     */
    public Rldf010eType getDataObj10e() {
        return dataObj10e;
    }

    /**
     * Sets the data obj10e.
     * 
     * @param dataObj10e
     *            the new data obj10e
     */
    public void setDataObj10e(Rldf010eType dataObj10e) {
        this.dataObj10e = dataObj10e;
    }

}
