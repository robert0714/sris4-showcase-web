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
import tw.gov.moi.domain.Rldf001mType;
import tw.gov.moi.domain.Rldf002dType;
import tw.gov.moi.domain.Rldf002mType;
import tw.gov.moi.domain.Rldf004mType;
import tw.gov.moi.domain.Rldf005mType;
import tw.gov.moi.domain.Rldf006mType;
import tw.gov.moi.domain.Rldf007mType;
import tw.gov.moi.domain.Rldf008mType;
import tw.gov.moi.domain.Rldf018dType;
import tw.gov.moi.domain.Rldf030mType;
import tw.gov.moi.domain.Rldf039mType;
import tw.gov.moi.domain.Rldf040mType;
import tw.gov.moi.domain.Rldf047mType;
import tw.gov.moi.domain.Rldfm01mType;
import tw.gov.moi.domain.Rldfm02mType;
import tw.gov.moi.domain.Rldfm03mType;
import tw.gov.moi.domain.Rldfm04mType;
import tw.gov.moi.domain.Rldfm06mType;
import tw.gov.moi.domain.Rldfm08mType;
import tw.gov.moi.domain.Rldfm11mType;
import tw.gov.moi.rl.common.constant.RlConstant;

/**
 * The Class Rl03100ResultDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl03100ResultDTO", propOrder = { "targetPersonData", "householdData", "householdHeadData",
        "householdMembers", "rldf007mTypes", "rldf002mTypes", "rldf005mTypes", "rldf047mType", "rldfm02mTypes",
        "rldfm08mTypes", "rldfm01mType", "rldfm06mTypes", "rldf006mTypes", "rldf008mTypes", "rldf030mTypes",
        "rldf002dTypes", "rldf039mTypes", "rldf040mTypes", "rldfm03mTypes", "rldf018dTypes", "rldfm04mTypes",
        "rldfm11mTypes" })
@XmlRootElement(name = "Rl03100ResultDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class Rl03100ResultDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 4865538287465448613L;

    /** 當事人個人基本資料. */
    @XmlElement(name = "TargetPersonData")
    @FieldName("當事人個人基本資料")
    private Rldf004mType targetPersonData;

    /** 全戶基本資料. */
    @XmlElement(name = "HouseholdData")
    @FieldName("全戶基本資料")
    private Rldf001mType householdData;

    /** 戶長個人基本資料. */
    @XmlElement(name = "HouseholdHeadData")
    @FieldName("戶長個人基本資料")
    private Rldf004mType householdHeadData;

    /** 全戶現住人口個人資料. */
    @XmlElement(name = "HouseholdMembers")
    @FieldName("全戶現住人口個人資料")
    private List<Rldf004mType> householdMembers;

    /** 姓名更改紀錄. */
    @XmlElement(name = "Rldf007mTypes")
    @FieldName("姓名更改紀錄")
    private List<Rldf007mType> rldf007mTypes;

    /** 全戶動態資料. */
    @XmlElement(name = "Rldf002mTypes")
    @FieldName("全戶動態資料")
    private List<Rldf002mType> rldf002mTypes;

    /** 個人紀事資料. */
    @XmlElement(name = "Rldf005mTypes")
    @FieldName("個人紀事資料")
    private List<Rldf005mType> rldf005mTypes;

    /** 羅馬拼音姓名檔. */
    @XmlElement(name = "Rldf047mType")
    @FieldName("羅馬拼音姓名檔")
    private Rldf047mType rldf047mType;

    /** 婚姻紀錄. */
    @XmlElement(name = "Rldfm02mTypes")
    @FieldName("婚姻紀錄")
    private List<Rldfm02mType> rldfm02mTypes;

    /** 監護資料. */
    @XmlElement(name = "Rldfm08mTypes")
    @FieldName("監護資料")
    private List<Rldfm08mType> rldfm08mTypes;

    /** 出生資料. */
    @XmlElement(name = "Rldfm01mType")
    @FieldName("出生資料")
    private Rldfm01mType rldfm01mType;

    /** 身分證掛失紀錄. */
    @XmlElement(name = "Rldfm06mTypes")
    @FieldName("身分證掛失紀錄")
    private List<Rldfm06mType> rldfm06mTypes;

    /** 遷徙紀錄. */
    @XmlElement(name = "Rldf006mTypes")
    @FieldName("遷徙紀錄")
    private List<Rldf006mType> rldf006mTypes;

    /** 特殊註記. */
    @XmlElement(name = "Rldf008mTypes")
    @FieldName("特殊註記")
    private List<Rldf008mType> rldf008mTypes;

    /** 所內記事. */
    @XmlElement(name = "Rldf030mTypes")
    @FieldName("所內記事")
    private List<Rldf030mType> rldf030mTypes;

    /** 身分證請領記錄. */
    @XmlElement(name = "Rldf002dTypes")
    @FieldName("身分證請領記錄")
    private List<Rldf002dType> rldf002dTypes;

    /** 入出境紀錄. */
    @XmlElement(name = "Rldf039mTypes")
    @FieldName("入出境紀錄")
    private List<Rldf039mType> rldf039mTypes;

    /** 入出境紀錄. */
    @XmlElement(name = "Rldf040mTypes")
    @FieldName("入出境紀錄")
    private List<Rldf040mType> rldf040mTypes;

    /** 統號更改紀錄. */
    @XmlElement(name = "Rldfm03mTypes")
    @FieldName("統號更改紀錄")
    private List<Rldfm03mType> rldfm03mTypes;

    /** 戶口名簿請領紀錄. */
    @XmlElement(name = "Rldf018dTypes")
    @FieldName("戶口名簿請領紀錄")
    private List<Rldf018dType> rldf018dTypes;

    /** 認領、收養記錄. */
    @XmlElement(name = "Rldfm04mTypes")
    @FieldName("認領、收養記錄")
    private List<Rldfm04mType> rldfm04mTypes;

    /** 個人姓氏資料檔. */
    @XmlElement(name = "Rldfm11mTypes")
    @FieldName("個人姓氏資料檔")
    private List<Rldfm11mType> rldfm11mTypes;

    /**
     * Gets the target person data.
     * 
     * @return the target person data
     */
    public Rldf004mType getTargetPersonData() {
        return targetPersonData;
    }

    /**
     * Sets the target person data.
     * 
     * @param targetPersonData
     *            the new target person data
     */
    public void setTargetPersonData(final Rldf004mType targetPersonData) {
        this.targetPersonData = targetPersonData;
    }

    /**
     * Gets the household data.
     * 
     * @return the household data
     */
    public Rldf001mType getHouseholdData() {
        return householdData;
    }

    /**
     * Sets the household data.
     * 
     * @param householdData
     *            the new household data
     */
    public void setHouseholdData(final Rldf001mType householdData) {
        this.householdData = householdData;
    }

    /**
     * Gets the household head data.
     * 
     * @return the household head data
     */
    public Rldf004mType getHouseholdHeadData() {
        return householdHeadData;
    }

    /**
     * Sets the household head data.
     * 
     * @param householdHeadData
     *            the new household head data
     */
    public void setHouseholdHeadData(final Rldf004mType householdHeadData) {
        this.householdHeadData = householdHeadData;
    }

    /**
     * Gets the household members.
     * 
     * @return the household members
     */
    public List<Rldf004mType> getHouseholdMembers() {
        return householdMembers;
    }

    /**
     * Sets the household members.
     * 
     * @param householdMembers
     *            the new household members
     */
    public void setHouseholdMembers(final List<Rldf004mType> householdMembers) {
        this.householdMembers = householdMembers;
    }

    /**
     * Gets the rldf007m types.
     * 
     * @return the rldf007m types
     */
    public List<Rldf007mType> getRldf007mTypes() {
        return rldf007mTypes;
    }

    /**
     * Sets the rldf007m types.
     * 
     * @param rldf007mTypes
     *            the new rldf007m types
     */
    public void setRldf007mTypes(final List<Rldf007mType> rldf007mTypes) {
        this.rldf007mTypes = rldf007mTypes;
    }

    /**
     * Gets the rldf002m types.
     * 
     * @return the rldf002m types
     */
    public List<Rldf002mType> getRldf002mTypes() {
        return rldf002mTypes;
    }

    /**
     * Sets the rldf002m types.
     * 
     * @param rldf002mTypes
     *            the new rldf002m types
     */
    public void setRldf002mTypes(final List<Rldf002mType> rldf002mTypes) {
        this.rldf002mTypes = rldf002mTypes;
    }

    /**
     * Gets the rldf005m types.
     * 
     * @return the rldf005m types
     */
    public List<Rldf005mType> getRldf005mTypes() {
        return rldf005mTypes;
    }

    /**
     * Sets the rldf005m types.
     * 
     * @param rldf005mTypes
     *            the new rldf005m types
     */
    public void setRldf005mTypes(final List<Rldf005mType> rldf005mTypes) {
        this.rldf005mTypes = rldf005mTypes;
    }

    /**
     * Gets the rldf047m type.
     * 
     * @return the rldf047m type
     */
    public Rldf047mType getRldf047mType() {
        return rldf047mType;
    }

    /**
     * Sets the rldf047m type.
     * 
     * @param rldf047mType
     *            the new rldf047m type
     */
    public void setRldf047mType(final Rldf047mType rldf047mType) {
        this.rldf047mType = rldf047mType;
    }

    /**
     * Gets the rldfm02m types.
     * 
     * @return the rldfm02m types
     */
    public List<Rldfm02mType> getRldfm02mTypes() {
        return rldfm02mTypes;
    }

    /**
     * Sets the rldfm02m types.
     * 
     * @param rldfm02mTypes
     *            the new rldfm02m types
     */
    public void setRldfm02mTypes(final List<Rldfm02mType> rldfm02mTypes) {
        this.rldfm02mTypes = rldfm02mTypes;
    }

    /**
     * Gets the rldfm08m types.
     * 
     * @return the rldfm08m types
     */
    public List<Rldfm08mType> getRldfm08mTypes() {
        return rldfm08mTypes;
    }

    /**
     * Sets the rldfm08m types.
     * 
     * @param rldfm08mTypes
     *            the new rldfm08m types
     */
    public void setRldfm08mTypes(final List<Rldfm08mType> rldfm08mTypes) {
        this.rldfm08mTypes = rldfm08mTypes;
    }

    /**
     * Gets the rldfm01m type.
     * 
     * @return the rldfm01m type
     */
    public Rldfm01mType getRldfm01mType() {
        return rldfm01mType;
    }

    /**
     * Sets the rldfm01m type.
     * 
     * @param rldfm01mType
     *            the new rldfm01m type
     */
    public void setRldfm01mType(final Rldfm01mType rldfm01mType) {
        this.rldfm01mType = rldfm01mType;
    }

    /**
     * Gets the rldfm06m types.
     * 
     * @return the rldfm06m types
     */
    public List<Rldfm06mType> getRldfm06mTypes() {
        return rldfm06mTypes;
    }

    /**
     * Sets the rldfm06m types.
     * 
     * @param rldfm06mTypes
     *            the new rldfm06m types
     */
    public void setRldfm06mTypes(final List<Rldfm06mType> rldfm06mTypes) {
        this.rldfm06mTypes = rldfm06mTypes;
    }

    /**
     * Gets the rldf006m types.
     * 
     * @return the rldf006m types
     */
    public List<Rldf006mType> getRldf006mTypes() {
        return rldf006mTypes;
    }

    /**
     * Sets the rldf006m types.
     * 
     * @param rldf006mTypes
     *            the new rldf006m types
     */
    public void setRldf006mTypes(final List<Rldf006mType> rldf006mTypes) {
        this.rldf006mTypes = rldf006mTypes;
    }

    /**
     * Gets the rldf008m types.
     * 
     * @return the rldf008m types
     */
    public List<Rldf008mType> getRldf008mTypes() {
        return rldf008mTypes;
    }

    /**
     * Sets the rldf008m types.
     * 
     * @param rldf008mTypes
     *            the new rldf008m types
     */
    public void setRldf008mTypes(final List<Rldf008mType> rldf008mTypes) {
        this.rldf008mTypes = rldf008mTypes;
    }

    /**
     * Gets the rldf030m types.
     * 
     * @return the rldf030m types
     */
    public List<Rldf030mType> getRldf030mTypes() {
        return rldf030mTypes;
    }

    /**
     * Sets the rldf030m types.
     * 
     * @param rldf030mTypes
     *            the new rldf030m types
     */
    public void setRldf030mTypes(final List<Rldf030mType> rldf030mTypes) {
        this.rldf030mTypes = rldf030mTypes;
    }

    /**
     * Gets the rldf002d types.
     * 
     * @return the rldf002d types
     */
    public List<Rldf002dType> getRldf002dTypes() {
        return rldf002dTypes;
    }

    /**
     * Sets the rldf002d types.
     * 
     * @param rldf002dTypes
     *            the new rldf002d types
     */
    public void setRldf002dTypes(final List<Rldf002dType> rldf002dTypes) {
        this.rldf002dTypes = rldf002dTypes;
    }

    /**
     * Gets the rldf039m types.
     * 
     * @return the rldf039m types
     */
    public List<Rldf039mType> getRldf039mTypes() {
        return rldf039mTypes;
    }

    /**
     * Sets the rldf039m types.
     * 
     * @param rldf039mTypes
     *            the new rldf039m types
     */
    public void setRldf039mTypes(final List<Rldf039mType> rldf039mTypes) {
        this.rldf039mTypes = rldf039mTypes;
    }

    /**
     * Gets the rldf040m types.
     * 
     * @return the rldf040m types
     */
    public List<Rldf040mType> getRldf040mTypes() {
        return rldf040mTypes;
    }

    /**
     * Sets the rldf040m types.
     * 
     * @param rldf040mTypes
     *            the new rldf040m types
     */
    public void setRldf040mTypes(final List<Rldf040mType> rldf040mTypes) {
        this.rldf040mTypes = rldf040mTypes;
    }

    /**
     * Gets the rldfm03m types.
     * 
     * @return the rldfm03m types
     */
    public List<Rldfm03mType> getRldfm03mTypes() {
        return rldfm03mTypes;
    }

    /**
     * Sets the rldfm03m types.
     * 
     * @param rldfm03mTypes
     *            the new rldfm03m types
     */
    public void setRldfm03mTypes(final List<Rldfm03mType> rldfm03mTypes) {
        this.rldfm03mTypes = rldfm03mTypes;
    }

    /**
     * Gets the rldf018d types.
     * 
     * @return the rldf018d types
     */
    public List<Rldf018dType> getRldf018dTypes() {
        return rldf018dTypes;
    }

    /**
     * Sets the rldf018d types.
     * 
     * @param rldf018dTypes
     *            the new rldf018d types
     */
    public void setRldf018dTypes(final List<Rldf018dType> rldf018dTypes) {
        this.rldf018dTypes = rldf018dTypes;
    }

    public List<Rldfm04mType> getRldfm04mTypes() {
        return rldfm04mTypes;
    }

    public void setRldfm04mTypes(List<Rldfm04mType> rldfm04mTypes) {
        this.rldfm04mTypes = rldfm04mTypes;
    }

    public List<Rldfm11mType> getRldfm11mTypes() {
        return rldfm11mTypes;
    }

    public void setRldfm11mTypes(List<Rldfm11mType> rldfm11mTypes) {
        this.rldfm11mTypes = rldfm11mTypes;
    }
}
