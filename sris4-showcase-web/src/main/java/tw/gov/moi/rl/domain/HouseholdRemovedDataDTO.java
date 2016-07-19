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

/**
 * The Class HouseholdRemovedDataDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "householdRemovedDataDTO", propOrder = { "removeDate", "removeTime", "householdHeadId", "householdId",
        "siteId" })
@XmlRootElement(name = "HouseholdRemovedDataDTO")
public class HouseholdRemovedDataDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -627789138737833459L;

    /** 除戶日期. */
    @XmlElement(name = "RemoveDate")
    @FieldName("除戶日期")
    private String removeDate;

    /** 除戶時間. */
    @XmlElement(name = "RemoveTime")
    @FieldName("除戶時間")
    private String removeTime;

    /** 戶長統號. */
    @XmlElement(name = "HouseholdHeadId")
    @FieldName("戶長統號")
    private String householdHeadId;

    /** 戶號. */
    @XmlElement(name = "HouseholdId")
    @FieldName("戶號")
    private String householdId;

    /** 作業點代碼. */
    @XmlElement(name = "SiteId")
    @FieldName("作業點代碼")
    private String siteId;

    /**
     * Instantiates a new household removed data dto.
     * 
     * @param removeDate
     *            the remove date
     * @param removeTime
     *            the remove time
     * @param householdHeadId
     *            the household head id
     * @param householdId
     *            the household id
     * @param siteId
     *            the site id
     */
    public HouseholdRemovedDataDTO(final String removeDate, final String removeTime, final String householdHeadId,
            final String householdId, final String siteId) {
        super();
        this.removeDate = removeDate;
        this.removeTime = removeTime;
        this.householdHeadId = householdHeadId;
        this.householdId = householdId;
        this.siteId = siteId;
    }

    /**
     * Gets the removes the date.
     * 
     * @return the removes the date
     */
    public String getRemoveDate() {
        return removeDate;
    }

    /**
     * Sets the removes the date.
     * 
     * @param removeDate
     *            the new removes the date
     */
    public void setRemoveDate(final String removeDate) {
        this.removeDate = removeDate;
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
