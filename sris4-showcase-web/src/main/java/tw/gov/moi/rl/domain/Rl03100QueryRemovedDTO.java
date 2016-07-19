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
 * The Class Rl03100QueryRemovedDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl03100QueryRemovedDTO", propOrder = { "householdHeadId", "householdId", "personId", "removeYyymmdd",
        "removeTime", "siteId" })
@XmlRootElement(name = "Rl03100QueryRemovedDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class Rl03100QueryRemovedDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1453759676710884240L;

    /** 戶長統號. */
    @XmlElement(name = "HouseholdHeadId")
    @FieldName("戶長統號")
    private String householdHeadId;

    /** 戶號. */
    @XmlElement(name = "HouseholdId")
    @FieldName("戶號")
    private String householdId;

    /** 統號. */
    @XmlElement(name = "PersonId")
    @FieldName("統號")
    private String personId;

    /** 除戶日期. */
    @XmlElement(name = "RemoveYyymmdd")
    @FieldName("除戶日期")
    private String removeYyymmdd;

    /** 除戶時間. */
    @XmlElement(name = "RemoveTime")
    @FieldName("除戶時間")
    private String removeTime;

    /** 作業點代碼. */
    @XmlElement(name = "SiteId")
    @FieldName("作業點代碼")
    private String siteId;

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
     * Gets the removes the yyymmdd.
     * 
     * @return the removes the yyymmdd
     */
    public String getRemoveYyymmdd() {
        return removeYyymmdd;
    }

    /**
     * Sets the removes the yyymmdd.
     * 
     * @param removeYyymmdd
     *            the new removes the yyymmdd
     */
    public void setRemoveYyymmdd(final String removeYyymmdd) {
        this.removeYyymmdd = removeYyymmdd;
    }

    /**
     * Gets the removes the time.
     * 
     * @return the removes the time
     */
    public String getRemoveTime() {
        return removeTime;
    }

    /**
     * Sets the removes the time.
     * 
     * @param removeTime
     *            the new removes the time
     */
    public void setRemoveTime(final String removeTime) {
        this.removeTime = removeTime;
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
