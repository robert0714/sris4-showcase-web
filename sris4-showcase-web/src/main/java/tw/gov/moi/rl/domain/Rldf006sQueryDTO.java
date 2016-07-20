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
 * The Class Rldf006sQueryDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rldf006sQueryDTO", propOrder = { "siteId", "rlProcessCode" })
@XmlRootElement(name = "Rldf006sQueryDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class Rldf006sQueryDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -8264010110417275699L;

    /** 作業點代碼. */
    @XmlElement(name = "SiteId")
    @FieldName("作業點代碼")
    private String siteId = "";

    /** RL處理註記. */
    @XmlElement(name = "RlProcessCode")
    @FieldName("RL處理註記")
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
        return "Rldf006sQueryDTO [siteId=" + siteId + ", rlProcessCode=" + rlProcessCode + "]";
    }

}
