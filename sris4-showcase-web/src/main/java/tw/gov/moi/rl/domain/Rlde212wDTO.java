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
 * The Class Rlde212wDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlde212wDTO", propOrder = { "streetDoorplate", "siteId" })
@XmlRootElement(name = "Rlde212wDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class Rlde212wDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 3216033342478188467L;

    /**
     * Instantiates a new rlde212w dto.
     */
    public Rlde212wDTO() {

    }

    /**
     * Instantiates a new rlde212w dto.
     * 
     * @param pStreetDoorplate
     *            the street doorplate
     * @param pSiteId
     *            the site id
     */
    public Rlde212wDTO(final String pStreetDoorplate, final String pSiteId) {
        this.streetDoorplate = pStreetDoorplate;
        this.siteId = pSiteId;
    }

    /** 街路門牌中文名稱. */
    @XmlElement(name = "StreetDoorplate", required = true)
    private String streetDoorplate = "";

    /** 作業點代碼. */
    @XmlElement(name = "SiteId", required = true)
    private String siteId = "";

    /**
     * Gets the street doorplate.
     * 
     * @return the street doorplate
     */
    public String getStreetDoorplate() {
        return streetDoorplate;
    }

    /**
     * Sets the street doorplate.
     * 
     * @param streetDoorplate
     *            the new street doorplate
     */
    public void setStreetDoorplate(final String streetDoorplate) {
        this.streetDoorplate = streetDoorplate;
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
