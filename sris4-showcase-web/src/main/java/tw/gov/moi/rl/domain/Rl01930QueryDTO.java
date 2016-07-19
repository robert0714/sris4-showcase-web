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
import tw.gov.moi.domain.Tldf001mType;
import tw.gov.moi.domain.Tldf004mType;
import tw.gov.moi.domain.Tldf005mType;
import tw.gov.moi.domain.Tldf006mType;
import tw.gov.moi.domain.Tldf007mType;
import tw.gov.moi.domain.Tldf008mType;
import tw.gov.moi.domain.Tldf010mType;
import tw.gov.moi.domain.Tldf047mType;

/**
 * The Class Rl01930QueryDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01930QueryDTO", propOrder = { "tldf001mObj", "tldf004mObj", "tldf005mList", "tldf006mList",
        "tldf007mList", "tldf008mList", "tldf010mList", "tldf047mList", "isInterdicted" })
@XmlRootElement(name = "Rl01930QueryDTO")
public class Rl01930QueryDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** Tldf001m Object */
    @XmlElement(name = "Tldf001mObj", required = true)
    @FieldName("Tldf001m Object")
    private Tldf001mType tldf001mObj;

    /** Tldf004m Object */
    @XmlElement(name = "Tldf004mObj", required = true)
    @FieldName("Tldf004m Object")
    private Tldf004mType tldf004mObj;

    /** Tldf005m Object List */
    @XmlElement(name = "Tldf005mList", required = true)
    @FieldName("Tldf005m Object List")
    private List<Tldf005mType> tldf005mList;

    /** Tldf006m Object List */
    @XmlElement(name = "Tldf006mList", required = true)
    @FieldName("Tldf006m Object List")
    private List<Tldf006mType> tldf006mList;

    /** Tldf007m Object List */
    @XmlElement(name = "Tldf007mList", required = true)
    @FieldName("Tldf007m Object List")
    private List<Tldf007mType> tldf007mList;

    /** Tldf008m Object List */
    @XmlElement(name = "Tldf008mList", required = true)
    @FieldName("Tldf008m Object List")
    private List<Tldf008mType> tldf008mList;

    /** Tldf010m Object List */
    @XmlElement(name = "Tldf010mList", required = true)
    @FieldName("Tldf010m Object List")
    private List<Tldf010mType> tldf010mList;

    /** Tldf047m Object List */
    @XmlElement(name = "Tldf047mList", required = true)
    @FieldName("Tldf047m Object List")
    private List<Tldf047mType> tldf047mList;

    /** 是否被禁治產 */
    @XmlElement(name = "IsInterdicted", required = true)
    @FieldName("是否被禁治產")
    private String isInterdicted;

    public Tldf001mType getTldf001mObj() {
        return tldf001mObj;
    }

    public void setTldf001mObj(final Tldf001mType tldf001mObj) {
        this.tldf001mObj = tldf001mObj;
    }

    public Tldf004mType getTldf004mObj() {
        return tldf004mObj;
    }

    public void setTldf004mObj(final Tldf004mType tldf004mObj) {
        this.tldf004mObj = tldf004mObj;
    }

    public List<Tldf005mType> getTldf005mList() {
        return tldf005mList;
    }

    public void setTldf005mList(final List<Tldf005mType> tldf005mList) {
        this.tldf005mList = tldf005mList;
    }

    public List<Tldf006mType> getTldf006mList() {
        return tldf006mList;
    }

    public void setTldf006mList(final List<Tldf006mType> tldf006mList) {
        this.tldf006mList = tldf006mList;
    }

    public List<Tldf007mType> getTldf007mList() {
        return tldf007mList;
    }

    public void setTldf007mList(final List<Tldf007mType> tldf007mList) {
        this.tldf007mList = tldf007mList;
    }

    public List<Tldf008mType> getTldf008mList() {
        return tldf008mList;
    }

    public void setTldf008mList(final List<Tldf008mType> tldf008mList) {
        this.tldf008mList = tldf008mList;
    }

    public List<Tldf047mType> getTldf047mList() {
        return tldf047mList;
    }

    public void setTldf047mList(final List<Tldf047mType> tldf047mList) {
        this.tldf047mList = tldf047mList;
    }

    public List<Tldf010mType> getTldf010mList() {
        return tldf010mList;
    }

    public void setTldf010mList(final List<Tldf010mType> tldf010mList) {
        this.tldf010mList = tldf010mList;
    }

    public String getIsInterdicted() {
        return isInterdicted;
    }

    public void setIsInterdicted(final String isInterdicted) {
        this.isInterdicted = isInterdicted;
    }

}
