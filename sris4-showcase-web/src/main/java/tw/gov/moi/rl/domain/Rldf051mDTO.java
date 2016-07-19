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
 * WebService 專用.
 * 
 * @author Weiren.Jheng
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rldf051mDTO", propOrder = { "motherPersonId", "spPersonId", "siteId" })
@XmlRootElement(name = "Rldf051mDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class Rldf051mDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -7963724214979519494L;

    /** 母統號. */
    @XmlElement(name = "MotherPersonId")
    @FieldName("母統號")
    private String motherPersonId = "";

    /** 配偶統號. */
    @XmlElement(name = "SpPersonId")
    @FieldName("配偶統號")
    private String spPersonId = "";

    /** 作業點代碼. */
    @XmlElement(name = "SiteId")
    @FieldName("作業點代碼")
    private String siteId = "";

    /**
     * Gets the mother person id.
     * 
     * @return the mother person id
     */
    public String getMotherPersonId() {
        return motherPersonId;
    }

    /**
     * Sets the mother person id.
     * 
     * @param motherPersonId
     *            the new mother person id
     */
    public void setMotherPersonId(String motherPersonId) {
        this.motherPersonId = motherPersonId;
    }

    /**
     * Gets the sp person id.
     * 
     * @return the sp person id
     */
    public String getSpPersonId() {
        return spPersonId;
    }

    /**
     * Sets the sp person id.
     * 
     * @param spPersonId
     *            the new sp person id
     */
    public void setSpPersonId(String spPersonId) {
        this.spPersonId = spPersonId;
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
