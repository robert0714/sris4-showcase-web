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
 * The Class RlGetRldfxDataDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlGetRldfxDataDTO", propOrder = { "householdId", "householdHeadId", "siteId" })
@XmlRootElement(name = "RlGetRldfxDataDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RlGetRldfxDataDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -7603303891980876196L;

    /** 戶號. */
    @XmlElement(name = "HouseholdId")
    @FieldName("戶號")
    private String householdId;

    /** 戶長統號. */
    @XmlElement(name = "HouseholdHeadId")
    @FieldName("戶長統號")
    private String householdHeadId;

    /** 作業點代碼. */
    @XmlElement(name = "SiteId")
    @FieldName("作業點代碼")
    private String siteId;

    /**
     * Instantiates a new rl get rldfx data dto.
     */
    public RlGetRldfxDataDTO() {
        super();
    }

    /**
     * Instantiates a new rl get rldfx data dto.
     * 
     * @param householdId
     *            the household id
     * @param householdHeadId
     *            the household head id
     * @param siteId
     *            the site id
     */
    public RlGetRldfxDataDTO(final String householdId, final String householdHeadId, final String siteId) {
        super();
        this.householdId = householdId;
        this.householdHeadId = householdHeadId;
        this.siteId = siteId;
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
    public void setHouseholdId(final String householdId) {
        this.householdId = householdId;
    }

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
    public void setHouseholdHeadId(final String householdHeadId) {
        this.householdHeadId = householdHeadId;
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
    public void setSiteId(final String siteId) {
        this.siteId = siteId;
    }
}
