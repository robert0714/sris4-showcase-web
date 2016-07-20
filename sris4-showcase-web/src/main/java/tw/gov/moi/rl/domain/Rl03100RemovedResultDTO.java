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
import tw.gov.moi.domain.Rldf002hType;
import tw.gov.moi.domain.Rldf004hType;
import tw.gov.moi.domain.Rldf005hType;
import tw.gov.moi.domain.Rldf047hType;
import tw.gov.moi.domain.Rldfm11hType;
import tw.gov.moi.rl.common.constant.RlConstant;

/**
 * The Class Rl03100RemovedResultDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl03100RemovedResultDTO", propOrder = { "householdHeadData", "removedHouseholdMember", "rldf047hType",
        "rldf002hTypes", "rldf005hTypes", "rldfm11hTypes" })
@XmlRootElement(name = "Rl03100RemovedResultDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class Rl03100RemovedResultDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -646067838680749338L;

    /** 戶長除戶個人基本資料. */
    @XmlElement(name = "HouseholdHeadData")
    @FieldName("戶長除戶個人基本資料")
    private Rldf004hType householdHeadData;

    /** 除戶戶內人口個人基本資料. */
    @XmlElement(name = "RemovedHouseholdMember")
    @FieldName("除戶戶內人口個人基本資料")
    private List<Rldf004hType> removedHouseholdMember;

    /** 除戶羅馬拼音姓名資料. */
    @XmlElement(name = "Rldf047hType")
    @FieldName("除戶羅馬拼音姓名資料")
    private Rldf047hType rldf047hType;

    /** 除戶全戶動態記事資料. */
    @XmlElement(name = "Rldf002hTypes")
    @FieldName("除戶全戶動態記事資料")
    private List<Rldf002hType> rldf002hTypes;

    /** 除戶個人記事資料. */
    @XmlElement(name = "Rldf005hTypes")
    @FieldName("除戶個人記事資料")
    private List<Rldf005hType> rldf005hTypes;

    /** 除戶個人姓氏資料檔. */
    @XmlElement(name = "Rldfm11hTypes")
    @FieldName("除戶個人姓氏資料檔")
    private List<Rldfm11hType> rldfm11hTypes;

    /**
     * Gets the household head data.
     * 
     * @return the household head data
     */
    public Rldf004hType getHouseholdHeadData() {
        return householdHeadData;
    }

    /**
     * Sets the household head data.
     * 
     * @param householdHeadData
     *            the new household head data
     */
    public void setHouseholdHeadData(final Rldf004hType householdHeadData) {
        this.householdHeadData = householdHeadData;
    }

    /**
     * Gets the removed household member.
     * 
     * @return the removed household member
     */
    public List<Rldf004hType> getRemovedHouseholdMember() {
        return removedHouseholdMember;
    }

    /**
     * Sets the removed household member.
     * 
     * @param removedHouseholdMember
     *            the new removed household member
     */
    public void setRemovedHouseholdMember(final List<Rldf004hType> removedHouseholdMember) {
        this.removedHouseholdMember = removedHouseholdMember;
    }

    /**
     * Gets the rldf047h type.
     * 
     * @return the rldf047h type
     */
    public Rldf047hType getRldf047hType() {
        return rldf047hType;
    }

    /**
     * Sets the rldf047h type.
     * 
     * @param rldf047hType
     *            the new rldf047h type
     */
    public void setRldf047hType(final Rldf047hType rldf047hType) {
        this.rldf047hType = rldf047hType;
    }

    /**
     * Gets the rldf002h types.
     * 
     * @return the rldf002h types
     */
    public List<Rldf002hType> getRldf002hTypes() {
        return rldf002hTypes;
    }

    /**
     * Sets the rldf002h types.
     * 
     * @param rldf002hTypes
     *            the new rldf002h types
     */
    public void setRldf002hTypes(final List<Rldf002hType> rldf002hTypes) {
        this.rldf002hTypes = rldf002hTypes;
    }

    /**
     * Gets the rldf005h types.
     * 
     * @return the rldf005h types
     */
    public List<Rldf005hType> getRldf005hTypes() {
        return rldf005hTypes;
    }

    /**
     * Sets the rldf005h types.
     * 
     * @param rldf005hTypes
     *            the new rldf005h types
     */
    public void setRldf005hTypes(final List<Rldf005hType> rldf005hTypes) {
        this.rldf005hTypes = rldf005hTypes;
    }

    public List<Rldfm11hType> getRldfm11hTypes() {
        return rldfm11hTypes;
    }

    public void setRldfm11hTypes(List<Rldfm11hType> rldfm11hTypes) {
        this.rldfm11hTypes = rldfm11hTypes;
    }
}
