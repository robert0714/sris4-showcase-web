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
 * The Class Rl08411AdressDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl08411AdressDTO", propOrder = { "village", "beginNeighbor", "endNeighbor" })
@XmlRootElement(name = "Rl08411AdressDTO")
public class Rl08411AdressDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 7114960209519386288L;

    /** 年度. */
    @XmlElement(name = "termYyy")
    @FieldName("年度")
    private String termYyy;

    /** 學區. */
    @XmlElement(name = "School")
    @FieldName("學區")
    private String school;

    /** 村里. */
    @XmlElement(name = "Village")
    @FieldName("村里")
    private String village;

    /** 鄰(起). */
    @XmlElement(name = "BeginNeighbor")
    @FieldName("鄰(起)")
    private String beginNeighbor;

    /** 鄰(迄). */
    @XmlElement(name = "EndNeighbor")
    @FieldName("鄰(迄)")
    private String endNeighbor;

    /** 鄰. */
    @XmlElement(name = "neighbor")
    @FieldName("鄰")
    private String neighbor;

    /** 作業點. */
    @XmlElement(name = "siteId")
    @FieldName("作業點")
    private String siteId;

    /** 狀態. */
    @XmlElement(name = "Status")
    @FieldName("狀態")
    private String status;

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
     * Gets the begin neighbor.
     * 
     * @return the begin neighbor
     */
    public String getBeginNeighbor() {
        return beginNeighbor;
    }

    /**
     * Sets the begin neighbor.
     * 
     * @param beginNeighbor
     *            the new begin neighbor
     */
    public void setBeginNeighbor(final String beginNeighbor) {
        this.beginNeighbor = beginNeighbor;
    }

    /**
     * Gets the end neighbor.
     * 
     * @return the end neighbor
     */
    public String getEndNeighbor() {
        return endNeighbor;
    }

    /**
     * Sets the end neighbor.
     * 
     * @param endNeighbor
     *            the new end neighbor
     */
    public void setEndNeighbor(final String endNeighbor) {
        this.endNeighbor = endNeighbor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getNeighbor() {
        return neighbor;
    }

    public void setNeighbor(String neighbor) {
        this.neighbor = neighbor;
    }

    public String getTermYyy() {
        return termYyy;
    }

    public void setTermYyy(String termYyy) {
        this.termYyy = termYyy;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((neighbor == null) ? 0 : neighbor.hashCode());
        result = prime * result + ((school == null) ? 0 : school.hashCode());
        result = prime * result + ((siteId == null) ? 0 : siteId.hashCode());
        result = prime * result + ((village == null) ? 0 : village.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Rl08411AdressDTO other = (Rl08411AdressDTO) obj;
        if (neighbor == null) {
            if (other.neighbor != null)
                return false;
        } else if (!neighbor.equals(other.neighbor))
            return false;
        if (school == null) {
            if (other.school != null)
                return false;
        } else if (!school.equals(other.school))
            return false;
        if (siteId == null) {
            if (other.siteId != null)
                return false;
        } else if (!siteId.equals(other.siteId))
            return false;
        if (village == null) {
            if (other.village != null)
                return false;
        } else if (!village.equals(other.village))
            return false;
        return true;
    }

}
