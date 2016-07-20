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
import tw.gov.moi.domain.Rlde406wType;
import tw.gov.moi.domain.Rlde407wType;

/**
 * The Class Rl04230ResultDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl04230ResultDTO", propOrder = { "Serial", "Delete", "Rlde407wObj", "Rlde406wObj", "newAreaSite",
        "newAlley", "newAlley1", "newAlley2" })
@XmlRootElement(name = "Rl04230ResultDTO")
public class Rl04230ResultDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 序號 */
    @XmlElement(name = "Serial", required = true)
    @FieldName("序號")
    private String serial;

    /** 是否刪除 */
    @XmlElement(name = "Delete", required = true)
    @FieldName("是否刪除")
    private boolean delete;

    /** rlde407w Object */
    @XmlElement(name = "Rlde407wObj", required = true)
    @FieldName("rlde407w Object")
    private Rlde407wType rlde407wObj;

    /** rlde406w Object */
    @XmlElement(name = "Rlde406wObj", required = true)
    @FieldName("rlde406w Object")
    private Rlde406wType rlde406wObj;

    /** 整編後地名放置位置 */
    @XmlElement(name = "NewAreaSite")
    @FieldName("整編後地名放置位置")
    private String newAreaSite;

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

    public String getSerial() {
        return serial;
    }

    public void setSerial(final String serial) {
        this.serial = serial;
    }

    public Rlde407wType getRlde407wObj() {
        return rlde407wObj;
    }

    public void setRlde407wObj(final Rlde407wType rlde407wObj) {
        this.rlde407wObj = rlde407wObj;
    }

    public Rlde406wType getRlde406wObj() {
        return rlde406wObj;
    }

    public void setRlde406wObj(final Rlde406wType rlde406wObj) {
        this.rlde406wObj = rlde406wObj;
    }

    public boolean isDelete() {
        return delete;
    }

    public void setDelete(final boolean delete) {
        this.delete = delete;
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

}