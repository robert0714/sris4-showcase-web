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
 * 特殊註記統計資料 DTO
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlrp08620DTO", propOrder = { "village", "neighbor", "man", "woman", "total" })
@XmlRootElement(name = "Rlrp08620DTO")
public class Rlrp08620DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -1154643361099790918L;

    /** 村里. */
    @XmlElement(name = "Village")
    @FieldName("村里")
    private String village = "";

    /** 鄰. */
    @XmlElement(name = "Neighbor")
    @FieldName("鄰")
    private String neighbor = "";

    /** 男人口數. */
    @XmlElement(name = "Man")
    @FieldName("男人口數")
    private String man = "";

    /** 女人口數. */
    @XmlElement(name = "Woman")
    @FieldName("女人口數")
    private String woman = "";

    /** 總人口數. */
    @XmlElement(name = "Total")
    @FieldName("總人口數")
    private String total = "";

    public String getVillage() {
        return this.village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getNeighbor() {
        return this.neighbor;
    }

    public void setNeighbor(String neighbor) {
        this.neighbor = neighbor;
    }

    public String getMan() {
        return this.man;
    }

    public void setMan(String man) {
        this.man = man;
    }

    public String getWoman() {
        return this.woman;
    }

    public void setWoman(String woman) {
        this.woman = woman;
    }

    public String getTotal() {
        return this.total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

}
