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
import tw.gov.moi.domain.Rldf004mType;
import tw.gov.moi.domain.Rldf005mType;
import tw.gov.moi.domain.Rldf006mType;
import tw.gov.moi.domain.Rldf007mType;
import tw.gov.moi.domain.Rldf008mType;
import tw.gov.moi.domain.Rldf010mType;
import tw.gov.moi.domain.Rldf047mType;
import tw.gov.moi.domain.Rldf049mType;
import tw.gov.moi.domain.Rldf087tType;
import tw.gov.moi.domain.Rldf088tType;
import tw.gov.moi.domain.Rldf089tType;
import tw.gov.moi.domain.Rldfm01mType;
import tw.gov.moi.domain.Rldfm02mType;
import tw.gov.moi.domain.Rldfm03mType;
import tw.gov.moi.domain.Rldfm04mType;
import tw.gov.moi.domain.Rldfm05mType;
import tw.gov.moi.domain.Rldfm06mType;
import tw.gov.moi.domain.Rldfm08mType;
import tw.gov.moi.domain.Rldfm09mType;
import tw.gov.moi.domain.Rldfm10mType;
import tw.gov.moi.domain.Rldfm11mType;
import tw.gov.moi.rl.common.constant.RlConstant;

/**
 * @author marcus
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlPersonalDataDTO", propOrder = { "p4mTypes", "p5mTypes", "p6mTypes", "p7mTypes", "p8mTypes",
        "p10mTypes", "p47mTypes", "p49mType", "pm01mType", "pm02mTypes", "pm03mTypes", "pm04mTypes", "pm05mTypes",
        "pm06mTypes", "pm08mTypes", "pm09mTypes", "pm10mTypes", "pm11mType", "p87tTypes", "p88tTypes", "p89tTypes" })
@XmlRootElement(name = "RlPersonalDataDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RlPersonalDataDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 4865538287465448613L;

    /** 當事人個人基本資料. */
    @XmlElement(name = "P4mTypes")
    @FieldName("當事人個人基本資料")
    private Rldf004mType p4mTypes;

    /** 個人記事資料. */
    @XmlElement(name = "P5mTypes")
    @FieldName("個人記事資料")
    private List<Rldf005mType> p5mTypes;

    /** 遷徙紀錄. */
    @XmlElement(name = "P6mTypes")
    @FieldName("遷徙紀錄")
    private List<Rldf006mType> p6mTypes;

    /** 姓名更改紀錄. */
    @XmlElement(name = "P7mTypes")
    @FieldName("姓名更改紀錄")
    private List<Rldf007mType> p7mTypes;

    /** 特殊註記. */
    @XmlElement(name = "P8mTypes")
    @FieldName("特殊註記")
    private List<Rldf008mType> p8mTypes;

    /** 限制遷徙人口記錄檔. */
    @XmlElement(name = "P10mTypes")
    @FieldName("限制遷徙人口記錄檔")
    private List<Rldf010mType> p10mTypes;

    /** 羅馬拼音姓名紀錄檔. */
    @XmlElement(name = "P47mTypes")
    @FieldName("羅馬拼音姓名紀錄檔")
    private List<Rldf047mType> p47mTypes;

    /** 家暴註記檔. */
    @XmlElement(name = "P49mType")
    @FieldName("家暴註記檔")
    private Rldf049mType p49mType;

    /** 出生資料. */
    @XmlElement(name = "Pm01mType")
    @FieldName("出生資料")
    private Rldfm01mType pm01mType;

    /** 婚姻紀錄. */
    @XmlElement(name = "Pm02mTypes")
    @FieldName("婚姻紀錄")
    private List<Rldfm02mType> pm02mTypes;

    /** 統號更改紀錄. */
    @XmlElement(name = "Pm03mTypes")
    @FieldName("統號更改紀錄")
    private List<Rldfm03mType> pm03mTypes;

    /** 認領、收養記錄檔. */
    @XmlElement(name = "Pm04mTypes")
    @FieldName("認領、收養記錄檔")
    private List<Rldfm04mType> pm04mTypes;

    /** 監護、輔助、未成年子女權利義務行使負擔資料檔 . */
    @XmlElement(name = "Pm05mTypes")
    @FieldName("監護、輔助、未成年子女權利義務行使負擔資料檔")
    private List<Rldfm05mType> pm05mTypes;

    /** 身分證掛失紀錄. */
    @XmlElement(name = "Pm06mTypes")
    @FieldName("身分證掛失紀錄")
    private List<Rldfm06mType> pm06mTypes;

    /** 監護資料. */
    @XmlElement(name = "Pm08mTypes")
    @FieldName("監護資料")
    private List<Rldfm08mType> pm08mTypes;

    /** 出生日期更改紀錄檔. */
    @XmlElement(name = "Pm09mTypes")
    @FieldName("出生日期更改紀錄檔")
    private List<Rldfm09mType> pm09mTypes;

    /** 個人申請書索引檔. */
    @XmlElement(name = "Pm10mTypes")
    @FieldName("個人申請書索引檔")
    private List<Rldfm10mType> pm10mTypes;

    /** 個人姓氏資料檔. */
    @XmlElement(name = "Pm11mType")
    @FieldName("個人姓氏資料檔")
    private Rldfm11mType pm11mType;

    /** 登記婚前結(離)婚證明書資料檔. */
    @XmlElement(name = "P87tTypes")
    @FieldName("登記婚前結(離)婚證明書資料檔")
    private List<Rldf087tType> p87tTypes;

    /** 中文結婚證明書檔. */
    @XmlElement(name = "P88tTypes")
    @FieldName("結(離)婚證明書資料檔")
    private List<Rldf088tType> p88tTypes;

    /** 英文結(離)婚證明書資料檔. */
    @XmlElement(name = "P89tTypes")
    @FieldName("英文結(離)婚證明書資料檔")
    private List<Rldf089tType> p89tTypes;

    /**
     * @return the p4mTypes
     */
    public Rldf004mType getP4mTypes() {
        return p4mTypes;
    }

    /**
     * @param p4mTypes
     *            the p4mTypes to set
     */
    public void setP4mTypes(Rldf004mType p4mTypes) {
        this.p4mTypes = p4mTypes;
    }

    /**
     * @return the p5mTypes
     */
    public List<Rldf005mType> getP5mTypes() {
        return p5mTypes;
    }

    /**
     * @param p5mTypes
     *            the p5mTypes to set
     */
    public void setP5mTypes(List<Rldf005mType> p5mTypes) {
        this.p5mTypes = p5mTypes;
    }

    /**
     * @return the p6mTypes
     */
    public List<Rldf006mType> getP6mTypes() {
        return p6mTypes;
    }

    /**
     * @param p6mTypes
     *            the p6mTypes to set
     */
    public void setP6mTypes(List<Rldf006mType> p6mTypes) {
        this.p6mTypes = p6mTypes;
    }

    /**
     * @return the p7mTypes
     */
    public List<Rldf007mType> getP7mTypes() {
        return p7mTypes;
    }

    /**
     * @param p7mTypes
     *            the p7mTypes to set
     */
    public void setP7mTypes(List<Rldf007mType> p7mTypes) {
        this.p7mTypes = p7mTypes;
    }

    /**
     * @return the p8mTypes
     */
    public List<Rldf008mType> getP8mTypes() {
        return p8mTypes;
    }

    /**
     * @param p8mTypes
     *            the p8mTypes to set
     */
    public void setP8mTypes(List<Rldf008mType> p8mTypes) {
        this.p8mTypes = p8mTypes;
    }

    /**
     * @return the p10mTypes
     */
    public List<Rldf010mType> getP10mTypes() {
        return p10mTypes;
    }

    /**
     * @param p10mTypes
     *            the p10mTypes to set
     */
    public void setP10mTypes(List<Rldf010mType> p10mTypes) {
        this.p10mTypes = p10mTypes;
    }

    /**
     * @return the p47mTypes
     */
    public List<Rldf047mType> getP47mTypes() {
        return p47mTypes;
    }

    /**
     * @param p47mTypes
     *            the p47mTypes to set
     */
    public void setP47mTypes(List<Rldf047mType> p47mTypes) {
        this.p47mTypes = p47mTypes;
    }

    /**
     * @return the p49mType
     */
    public Rldf049mType getP49mType() {
        return p49mType;
    }

    /**
     * @param p49mType
     *            the p49mType to set
     */
    public void setP49mType(Rldf049mType p49mType) {
        this.p49mType = p49mType;
    }

    /**
     * @return the pm01mType
     */
    public Rldfm01mType getPm01mType() {
        return pm01mType;
    }

    /**
     * @param pm01mType
     *            the pm01mType to set
     */
    public void setPm01mType(Rldfm01mType pm01mType) {
        this.pm01mType = pm01mType;
    }

    /**
     * @return the pm02mTypes
     */
    public List<Rldfm02mType> getPm02mTypes() {
        return pm02mTypes;
    }

    /**
     * @param pm02mTypes
     *            the pm02mTypes to set
     */
    public void setPm02mTypes(List<Rldfm02mType> pm02mTypes) {
        this.pm02mTypes = pm02mTypes;
    }

    /**
     * @return the pm03mTypes
     */
    public List<Rldfm03mType> getPm03mTypes() {
        return pm03mTypes;
    }

    /**
     * @param pm03mTypes
     *            the pm03mTypes to set
     */
    public void setPm03mTypes(List<Rldfm03mType> pm03mTypes) {
        this.pm03mTypes = pm03mTypes;
    }

    /**
     * @return the pm04mTypes
     */
    public List<Rldfm04mType> getPm04mTypes() {
        return pm04mTypes;
    }

    /**
     * @param pm04mTypes
     *            the pm04mTypes to set
     */
    public void setPm04mTypes(List<Rldfm04mType> pm04mTypes) {
        this.pm04mTypes = pm04mTypes;
    }

    /**
     * @return the pm05mTypes
     */
    public List<Rldfm05mType> getPm05mTypes() {
        return pm05mTypes;
    }

    /**
     * @param pm05mTypes
     *            the pm05mTypes to set
     */
    public void setPm05mTypes(List<Rldfm05mType> pm05mTypes) {
        this.pm05mTypes = pm05mTypes;
    }

    /**
     * @return the pm06mTypes
     */
    public List<Rldfm06mType> getPm06mTypes() {
        return pm06mTypes;
    }

    /**
     * @param pm06mTypes
     *            the pm06mTypes to set
     */
    public void setPm06mTypes(List<Rldfm06mType> pm06mTypes) {
        this.pm06mTypes = pm06mTypes;
    }

    /**
     * @return the pm08mTypes
     */
    public List<Rldfm08mType> getPm08mTypes() {
        return pm08mTypes;
    }

    /**
     * @param pm08mTypes
     *            the pm08mTypes to set
     */
    public void setPm08mTypes(List<Rldfm08mType> pm08mTypes) {
        this.pm08mTypes = pm08mTypes;
    }

    /**
     * @return the pm09mTypes
     */
    public List<Rldfm09mType> getPm09mTypes() {
        return pm09mTypes;
    }

    /**
     * @param pm09mTypes
     *            the pm09mTypes to set
     */
    public void setPm09mTypes(List<Rldfm09mType> pm09mTypes) {
        this.pm09mTypes = pm09mTypes;
    }

    /**
     * @return the pm10mTypes
     */
    public List<Rldfm10mType> getPm10mTypes() {
        return pm10mTypes;
    }

    /**
     * @param pm10mTypes
     *            the pm10mTypes to set
     */
    public void setPm10mTypes(List<Rldfm10mType> pm10mTypes) {
        this.pm10mTypes = pm10mTypes;
    }

    /**
     * @return the pm11mType
     */
    public Rldfm11mType getPm11mType() {
        return pm11mType;
    }

    /**
     * @param pm11mType
     *            the pm11mType to set
     */
    public void setPm11mType(Rldfm11mType pm11mType) {
        this.pm11mType = pm11mType;
    }

    /**
     * @return the p87tTypes
     */
    public List<Rldf087tType> getP87tTypes() {
        return p87tTypes;
    }

    /**
     * @param p87tTypes
     *            the p87tTypes to set
     */
    public void setP87tTypes(List<Rldf087tType> p87tTypes) {
        this.p87tTypes = p87tTypes;
    }

    /**
     * @return the p88tTypes
     */
    public List<Rldf088tType> getP88tTypes() {
        return p88tTypes;
    }

    /**
     * @param p88tTypes
     *            the p88tTypes to set
     */
    public void setP88tTypes(List<Rldf088tType> p88tTypes) {
        this.p88tTypes = p88tTypes;
    }

    /**
     * @return the p89tTypes
     */
    public List<Rldf089tType> getP89tTypes() {
        return p89tTypes;
    }

    /**
     * @param p89tTypes
     *            the p89tTypes to set
     */
    public void setP89tTypes(List<Rldf089tType> p89tTypes) {
        this.p89tTypes = p89tTypes;
    }

}
