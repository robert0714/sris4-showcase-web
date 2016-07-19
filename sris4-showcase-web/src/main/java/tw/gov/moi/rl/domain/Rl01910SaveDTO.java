/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Tldf004mType;
import tw.gov.moi.domain.Tldf005mType;
import tw.gov.moi.domain.Tldf006mType;
import tw.gov.moi.domain.Tldf007mType;
import tw.gov.moi.domain.Tldf008mType;
import tw.gov.moi.domain.Tldf010mType;
import tw.gov.moi.domain.Tldf047mType;

/**
 * The Class Rl01910SaveDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01910SaveDTO", propOrder = { "tldf004mObj", "tldf005mList", "tldf005mSelectArr", "tldf006mList",
        "tldf007mList", "tldf008mList", "tldf010mList", "tldf047mList", "isNewPersonId" })
@XmlRootElement(name = "Rl01910SaveDTO")
public class Rl01910SaveDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** Tldf004m Object */
    @XmlElement(name = "Tldf004mObj", required = true)
    @FieldName("Tldf004m Object")
    private Tldf004mType tldf004mObj;

    /** Tldf005m Object List */
    @XmlElement(name = "Tldf005mList", required = true)
    @FieldName("Tldf005m Object List")
    private List<Tldf005mType> tldf005mList;

    /** Tldf005m Object Array */
    @XmlElement(name = "Tldf005mSelectArr", required = true)
    @FieldName("Tldf005m Object Array")
    private Tldf005mType[] tldf005mSelectArr = new Tldf005mType[0];

    /** Tldf005m Object List */
    @XmlElement(name = "Tldf005mEditList", required = true)
    @FieldName("Tldf005m Edit Object List")
    private List<Tldf005mType> tldf005mEditList = new ArrayList<Tldf005mType>();

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

    // /** Tldf030m Object List */
    // @XmlElement(name = "Tldf030mList", required = true)
    // @FieldName("Tldf030m Object List")
    // private List<Tldf030mType> tldf030mList;

    /** Tldf047m Object List */
    @XmlElement(name = "Tldf047mList", required = true)
    @FieldName("Tldf047m Object List")
    private List<Tldf047mType> tldf047mList;

    // /** Tldfm01m Object List */
    // @XmlElement(name = "Tldfm01mList", required = true)
    // @FieldName("Tldfm01m Object List")
    // private List<Tldfm01mType> tldfm01mList;

    // /** Tldfm02m Object List */
    // @XmlElement(name = "Tldfm02mList", required = true)
    // @FieldName("Tldfm02m Object List")
    // private List<Tldfm02mType> tldfm02mList;

    // /** Tldfm03m Object List */
    // @XmlElement(name = "Tldfm03mList", required = true)
    // @FieldName("Tldfm03m Object List")
    // private List<Tldfm03mType> tldfm03mList;

    // /** Tldfm04m Object List */
    // @XmlElement(name = "Tldfm04mList", required = true)
    // @FieldName("Tldfm04m Object List")
    // private List<Tldfm04mType> tldfm04mList;

    // /** Tldfm05m Object List */
    // @XmlElement(name = "Tldfm05mList", required = true)
    // @FieldName("Tldfm05m Object List")
    // private List<Tldfm05mType> tldfm05mList;

    // /** Tldfm06m Object List */
    // @XmlElement(name = "Tldfm06mList", required = true)
    // @FieldName("Tldfm06m Object List")
    // private List<Tldfm06mType> tldfm06mList;

    // /** Tldfm08m Object List */
    // @XmlElement(name = "Tldfm08mList", required = true)
    // @FieldName("Tldfm08m Object List")
    // private List<Tldfm08mType> tldfm08mList;

    // /** Tldfm09m Object List */
    // @XmlElement(name = "Tldfm09mList", required = true)
    // @FieldName("Tldfm09m Object List")
    // private List<Tldfm09mType> tldfm09mList;

    // /** Tldfm10m Object List */
    // @XmlElement(name = "Tldfm10mList", required = true)
    // @FieldName("Tldfm10m Object List")
    // private List<Tldfm10mType> tldfm10mList;

    // /** Tldfm11m Object List */
    // @XmlElement(name = "Tldfm11mList", required = true)
    // @FieldName("Tldfm11m Object List")
    // private List<Tldfm11mType> tldfm11mList;

    /** 新配賦統號 */
    @XmlElement(name = "IsNewPersonId", required = true)
    @FieldName("新配賦統號")
    private String isNewPersonId;

    /** 自立新戶. */
    @XmlElement(name = "NewHousehold")
    @FieldName("自立新戶")
    private String newHousehold;

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

    public String getIsNewPersonId() {
        return isNewPersonId;
    }

    public void setIsNewPersonId(String isNewPersonId) {
        this.isNewPersonId = isNewPersonId;
    }

    public Tldf005mType[] getTldf005mSelectArr() {
        return tldf005mSelectArr;
    }

    public void setTldf005mSelectArr(Tldf005mType[] tldf005mSelectArr) {
        this.tldf005mSelectArr = tldf005mSelectArr;
    }

    public List<Tldf005mType> getTldf005mEditList() {
        return tldf005mEditList;
    }

    public void setTldf005mEditList(List<Tldf005mType> tldf005mEditList) {
        this.tldf005mEditList = tldf005mEditList;
    }

    public String getNewHousehold() {
        return newHousehold;
    }

    public void setNewHousehold(String newHousehold) {
        this.newHousehold = newHousehold;
    }

}
