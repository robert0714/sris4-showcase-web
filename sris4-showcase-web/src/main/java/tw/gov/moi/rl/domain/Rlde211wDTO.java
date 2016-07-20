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
 * The Class Rlde211wDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlde211wDTO", propOrder = { "village", "siteId" })
@XmlRootElement(name = "Rlde211wDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class Rlde211wDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 3216033342478188467L;

    /**
     * Instantiates a new rlde211w dto.
     */
    public Rlde211wDTO() {

    }

    /**
     * Instantiates a new rlde211w dto.
     * 
     * @param pVillage
     *            the village
     * @param pSiteId
     *            the site id
     */
    public Rlde211wDTO(final String pVillage, final String pSiteId) {
        this.village = pVillage;
        this.siteId = pSiteId;
    }

    /** 村里中文名稱. */
    @XmlElement(name = "Village", required = true)
    private String village = "";

    /** 作業點代碼. */
    @XmlElement(name = "SiteId", required = true)
    private String siteId = "";

    /**
     * Gets the village.
     * 
     * @return the village
     */
    public String getVillage() {
        return village;
    }

    /**
     * Sets the village.
     * 
     * @param village
     *            the new village
     */
    public void setVillage(final String village) {
        this.village = village;
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
