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
 * The Class Rldf021oQueryDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rldf021oQueryDTO", propOrder = { "siteId" })
@XmlRootElement(name = "Rldf021oQueryDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class Rldf021oQueryDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8691995580098252712L;

    /** 作業點代碼. */
    @XmlElement(name = "SiteId")
    @FieldName("作業點代碼")
    private String siteId = "";

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

    @Override
    public String toString() {
        return "Rldf021oQueryDTO [siteId=" + siteId + "]";
    }

}
