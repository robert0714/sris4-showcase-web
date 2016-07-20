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

import tw.gov.moi.rl.common.constant.RlConstant;

/**
 * The Class Rldf002h1DTO.
 * 
 * WebService 專用
 * 
 * @author Weiren.Jheng
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rldf002h1DTO", propOrder = { "householdHeadId", "householdId", "siteId" })
@XmlRootElement(name = "Rldf002h1DTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class Rldf002h1DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8524430551990090562L;

    /** 戶長統號. */
    @XmlElement(name = "HouseholdHeadId", required = false)
    private String householdHeadId = "";

    /** 戶號. */
    @XmlElement(name = "HouseholdId", required = false)
    private String householdId = "";

    /** 作業點代碼 */
    @XmlElement(name = "SiteId", required = false)
    private String siteId = "";

    /**
     * Gets the household head id.
     * 
     * @return the household head id
     */
    public String getHouseholdHeadId() {
        return householdHeadId;
    }

    /**
     * Sets the household head id.
     * 
     * @param householdHeadId
     *            the new household head id
     */
    public void setHouseholdHeadId(String householdHeadId) {
        this.householdHeadId = householdHeadId;
    }

    /**
     * Gets the household id.
     * 
     * @return the household id
     */
    public String getHouseholdId() {
        return householdId;
    }

    /**
     * Sets the household id.
     * 
     * @param householdId
     *            the new household id
     */
    public void setHouseholdId(String householdId) {
        this.householdId = householdId;
    }

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

}
