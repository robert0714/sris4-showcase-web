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
 * The Class PersonRemovedDataDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personRemovedDataDTO", propOrder = { "removeDate", "removeTime", "personId", "siteId" })
@XmlRootElement(name = "PersonRemovedDataDTO")
public class PersonRemovedDataDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -5862262344628781533L;

    /** 除戶日期. */
    @XmlElement(name = "RemoveDate")
    @FieldName("除戶日期")
    private String removeDate;

    /** 除戶時間. */
    @XmlElement(name = "RemoveTime")
    @FieldName("除戶時間")
    private String removeTime;

    /** 統號. */
    @XmlElement(name = "PersonId")
    @FieldName("統號")
    private String personId;

    /** 作業點代碼. */
    @XmlElement(name = "SiteId")
    @FieldName("作業點代碼")
    private String siteId;

    /**
     * Instantiates a new removed data dto.
     * 
     * @param removeDate
     *            the remove date
     * @param removeTime
     *            the remove time
     * @param personId
     *            the person id
     * @param siteId
     *            the site id
     */
    public PersonRemovedDataDTO(final String removeDate, final String removeTime, final String personId,
            final String siteId) {
        super();
        this.removeDate = removeDate;
        this.removeTime = removeTime;
        this.personId = personId;
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
