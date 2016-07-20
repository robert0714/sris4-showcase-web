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
import tw.gov.moi.rl.common.constant.RlConstant;

/**
 * The Class Rldf007sQueryDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rldf007sQueryDTO", propOrder = { "siteId", "gender", "idType", "rlProcessCode" })
@XmlRootElement(name = "Rldf007sQueryDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class Rldf007sQueryDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 作業點代碼. */
    @XmlElement(name = "")
    @FieldName("作業點代碼")
    private String siteId = "";

    /** 性別. */
    @XmlElement(name = "")
    @FieldName("性別")
    private String gender = "";

    /** 配賦身分代碼. */
    @XmlElement(name = "")
    @FieldName("配賦身分代碼")
    private String idType = "";

    /** RL 處理註記. */
    @XmlElement(name = "")
    @FieldName("RL 處理註記")
    private String rlProcessCode = "";

    /**
     * Gets the site id.
     * 
     * @return the site id
     */
    public String getSiteId() {
        return siteId;
    }

    /**
     * Sets the site id.
     * 
     * @param siteId
     *            the new site id
     */
    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    /**
     * Gets the gender.
     * 
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the gender.
     * 
     * @param gender
     *            the new gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Gets the id type.
     * 
     * @return the id type
     */
    public String getIdType() {
        return idType;
    }

    /**
     * Sets the id type.
     * 
     * @param idType
     *            the new id type
     */
    public void setIdType(String idType) {
        this.idType = idType;
    }

    /**
     * Gets the rl process code.
     * 
     * @return the rl process code
     */
    public String getRlProcessCode() {
        return rlProcessCode;
    }

    /**
     * Sets the rl process code.
     * 
     * @param rlProcessCode
     *            the new rl process code
     */
    public void setRlProcessCode(String rlProcessCode) {
        this.rlProcessCode = rlProcessCode;
    }

    @Override
    public String toString() {
        return "Rldf007sQueryDTO [siteId=" + siteId + ", gender=" + gender + ", idType=" + idType + ", rlProcessCode=" + rlProcessCode + "]";
    }

}
