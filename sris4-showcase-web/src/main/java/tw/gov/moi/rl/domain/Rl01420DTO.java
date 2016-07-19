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
import tw.gov.moi.domain.Rldf004mType;
import tw.gov.moi.domain.Rldf008mType;
import tw.gov.moi.rl.common.constant.RlConstant;

/**
 * The Class Rl01420DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01420DTO", propOrder = { "personId", "specialCode", "noticeType", "rldf004mType", "rldf008mType",
        "rldf008mTypes" })
@XmlRootElement(name = "Rl01420DTO")
public class Rl01420DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1125905999371185723L;

    /** 統號. */
    @XmlElement(name = "PersonId")
    @FieldName("統號")
    private String personId;

    /** 特殊註記. */
    @XmlElement(name = "SpecialCode")
    @FieldName("特殊註記")
    private String specialCode = RlConstant.STRING_ONE;

    /** 通報類別. */
    @XmlElement(name = "NoticeType")
    @FieldName("通報類別")
    private String noticeType = RlConstant.STRING_ONE;

    /** 個人基本資料. */
    @XmlElement(name = "Rldf004mType")
    @FieldName("個人基本資料")
    private Rldf004mType rldf004mType;

    /** The rldf008m type. */
    @XmlElement(name = "Rldf008mType")
    @FieldName("編修項目")
    private Rldf008mType rldf008mType;

    /** The rldf008m types. */
    @XmlElement(name = "Rldf008mTypes")
    @FieldName("多筆編修項目")
    private List<Rldf008mType> rldf008mTypes = new ArrayList<Rldf008mType>();

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
    public void setPersonId(final String personId) {
        this.personId = personId;
    }

    /**
     * Gets the special code.
     * 
     * @return the special code
     */
    public String getSpecialCode() {
        return specialCode;
    }

    /**
     * Sets the special code.
     * 
     * @param specialCode
     *            the new special code
     */
    public void setSpecialCode(final String specialCode) {
        this.specialCode = specialCode;
    }

    /**
     * Gets the notice type.
     * 
     * @return the notice type
     */
    public String getNoticeType() {
        return noticeType;
    }

    /**
     * Sets the notice type.
     * 
     * @param noticeType
     *            the new notice type
     */
    public void setNoticeType(final String noticeType) {
        this.noticeType = noticeType;
    }

    /**
     * Gets the rldf004m type.
     * 
     * @return the rldf004m type
     */
    public Rldf004mType getRldf004mType() {
        return rldf004mType;
    }

    /**
     * Sets the rldf004m type.
     * 
     * @param rldf004mType
     *            the new rldf004m type
     */
    public void setRldf004mType(final Rldf004mType rldf004mType) {
        this.rldf004mType = rldf004mType;
    }

    /**
     * Gets the rldf008m type.
     * 
     * @return the rldf008m type
     */
    public Rldf008mType getRldf008mType() {
        return rldf008mType;
    }

    /**
     * Sets the rldf008m type.
     * 
     * @param rldf008mType
     *            the new rldf008m type
     */
    public void setRldf008mType(final Rldf008mType rldf008mType) {
        this.rldf008mType = rldf008mType;
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
}
