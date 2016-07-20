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
 * The Class Rl02a50ProcessDataDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl02a50ProcessDataDTO", propOrder = { "changeType", "personId", "personName", "birthYyymmdd",
        "expireYyymmdd", "expireHhmmss", "expireReason", "expireReasonCode", "adminOfficeCode", "areaCode", "siteId",
        "village", "neighbor", "streetDoorplate" })
@XmlRootElement(name = "Rl02a50ProcessDataDTO")
public class Rl02a50ProcessDataDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 2336842195747517005L;

    /** 異動類別. */
    @XmlElement(name = "ChangeType")
    @FieldName("異動類別")
    private String changeType;

    /** 國民身分證統一編號. */
    @XmlElement(name = "PersonId")
    @FieldName("國民身分證統一編號")
    private String personId;

    /** 姓名. */
    @XmlElement(name = "PersonName")
    @FieldName("姓名")
    private String personName;

    /** 出生日期. */
    @XmlElement(name = "BirthYyymmdd")
    @FieldName("出生日期")
    private String birthYyymmdd;

    /** 註銷日期. */
    @XmlElement(name = "ExpireYyymmdd")
    @FieldName("註銷日期")
    private String expireYyymmdd;

    /** 註銷時間. */
    @XmlElement(name = "ExpireHhmmss")
    @FieldName("註銷時間")
    private String expireHhmmss;

    /** 註銷原因. */
    @XmlElement(name = "ExpireReason")
    @FieldName("註銷原因")
    private String expireReason;

    /** 本次註銷原因代碼. */
    @XmlElement(name = "ExpireReasonCode")
    @FieldName("本次註銷原因代碼")
    private String expireReasonCode;

    /** 戶籍地戶所代碼. */
    @XmlElement(name = "AdminOfficeCode")
    @FieldName("戶籍地戶所代碼")
    private String adminOfficeCode;

    /** 行政區域代碼. */
    @XmlElement(name = "AreaCode")
    @FieldName("行政區域代碼")
    private String areaCode;

    /** 作業點代碼. */
    @XmlElement(name = "SiteId")
    @FieldName("作業點代碼")
    private String siteId;

    /** 村里. */
    @XmlElement(name = "Village")
    @FieldName("村里")
    private String village;

    /** 鄰. */
    @XmlElement(name = "Neighbor")
    @FieldName("鄰")
    private String neighbor;

    /** 街路門牌. */
    @XmlElement(name = "StreetDoorplate")
    @FieldName("街路門牌")
    private String streetDoorplate;

    /**
     * Gets the change type.
     * 
     * @return the change type
     */
    public String getChangeType() {
        return changeType;
    }

    /**
     * Sets the change type.
     * 
     * @param changeType
     *            the new change type
     */
    public void setChangeType(final String changeType) {
        this.changeType = changeType;
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
     * Gets the person name.
     * 
     * @return the person name
     */
    public String getPersonName() {
        return personName;
    }

    /**
     * Sets the person name.
     * 
     * @param personName
     *            the new person name
     */
    public void setPersonName(final String personName) {
        this.personName = personName;
    }

    /**
     * Gets the birth yyymmdd.
     * 
     * @return the birth yyymmdd
     */
    public String getBirthYyymmdd() {
        return birthYyymmdd;
    }

    /**
     * Sets the birth yyymmdd.
     * 
     * @param birthYyymmdd
     *            the new birth yyymmdd
     */
    public void setBirthYyymmdd(final String birthYyymmdd) {
        this.birthYyymmdd = birthYyymmdd;
    }

    /**
     * Gets the expire yyymmdd.
     * 
     * @return the expire yyymmdd
     */
    public String getExpireYyymmdd() {
        return expireYyymmdd;
    }

    /**
     * Sets the expire yyymmdd.
     * 
     * @param expireYyymmdd
     *            the new expire yyymmdd
     */
    public void setExpireYyymmdd(final String expireYyymmdd) {
        this.expireYyymmdd = expireYyymmdd;
    }

    /**
     * Gets the expire hhmmss.
     * 
     * @return the expire hhmmss
     */
    public String getExpireHhmmss() {
        return expireHhmmss;
    }

    /**
     * Sets the expire hhmmss.
     * 
     * @param expireHhmmss
     *            the new expire hhmmss
     */
    public void setExpireHhmmss(final String expireHhmmss) {
        this.expireHhmmss = expireHhmmss;
    }

    /**
     * Gets the expire reason.
     * 
     * @return the expire reason
     */
    public String getExpireReason() {
        return expireReason;
    }

    /**
     * Sets the expire reason.
     * 
     * @param expireReason
     *            the new expire reason
     */
    public void setExpireReason(final String expireReason) {
        this.expireReason = expireReason;
    }

    /**
     * Gets the expire reason code.
     * 
     * @return the expire reason code
     */
    public String getExpireReasonCode() {
        return expireReasonCode;
    }

    /**
     * Sets the expire reason code.
     * 
     * @param expireReasonCode
     *            the new expire reason code
     */
    public void setExpireReasonCode(final String expireReasonCode) {
        this.expireReasonCode = expireReasonCode;
    }

    /**
     * Gets the admin office code.
     * 
     * @return the admin office code
     */
    public String getAdminOfficeCode() {
        return adminOfficeCode;
    }

    /**
     * Sets the admin office code.
     * 
     * @param adminOfficeCode
     *            the new admin office code
     */
    public void setAdminOfficeCode(final String adminOfficeCode) {
        this.adminOfficeCode = adminOfficeCode;
    }

    /**
     * Gets the area code.
     * 
     * @return the area code
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * Sets the area code.
     * 
     * @param areaCode
     *            the new area code
     */
    public void setAreaCode(final String areaCode) {
        this.areaCode = areaCode;
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
     * Gets the neighbor.
     * 
     * @return the neighbor
     */
    public String getNeighbor() {
        return neighbor;
    }

    /**
     * Sets the neighbor.
     * 
     * @param neighbor
     *            the new neighbor
     */
    public void setNeighbor(final String neighbor) {
        this.neighbor = neighbor;
    }

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

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((expireHhmmss == null) ? 0 : expireHhmmss.hashCode());
        result = prime * result + ((expireYyymmdd == null) ? 0 : expireYyymmdd.hashCode());
        result = prime * result + ((personId == null) ? 0 : personId.hashCode());
        return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Rl02a50ProcessDataDTO other = (Rl02a50ProcessDataDTO) obj;
        if (expireHhmmss == null) {
            if (other.expireHhmmss != null)
                return false;
        } else if (!expireHhmmss.equals(other.expireHhmmss))
            return false;
        if (expireYyymmdd == null) {
            if (other.expireYyymmdd != null)
                return false;
        } else if (!expireYyymmdd.equals(other.expireYyymmdd))
            return false;
        if (personId == null) {
            if (other.personId != null)
                return false;
        } else if (!personId.equals(other.personId))
            return false;
        return true;
    }
}
