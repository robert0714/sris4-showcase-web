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
 * The Class Rldfm10hQueryDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rldfm10hQueryDTO", propOrder = { "personId", "removeYyymmdd", "removeTime", "siteId", "applyCode",
        "applyType" })
@XmlRootElement(name = "Rldfm10hQueryDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class Rldfm10hQueryDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 666636560825517781L;

    /** 統號. */
    @XmlElement(name = "PersonId")
    @FieldName("統號")
    private String personId = "";

    /** 除戶日期. */
    @XmlElement(name = "RemoveYyymmdd")
    @FieldName("除戶日期")
    private String removeYyymmdd = "";

    /** 除戶時間. */
    @XmlElement(name = "RemoveTime")
    @FieldName("除戶時間")
    private String removeTime = "";

    /** 作業點代碼. */
    @XmlElement(name = "SiteId")
    @FieldName("作業點代碼")
    private String siteId = "";

    /** 申請書代碼. */
    @XmlElement(name = "ApplyCode")
    @FieldName("申請書代碼")
    private String applyCode = "";

    /** 申請書類別. */
    @XmlElement(name = "ApplyType")
    @FieldName("申請書類別")
    private String applyType = "";

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
    public void setPersonId(String personId) {
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
    public void setRemoveYyymmdd(String removeYyymmdd) {
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
    public void setRemoveTime(String removeTime) {
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
    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    /**
     * Gets the apply code.
     * 
     * @return the apply code
     */
    public String getApplyCode() {
        return applyCode;
    }

    /**
     * Sets the apply code.
     * 
     * @param applyCode
     *            the new apply code
     */
    public void setApplyCode(String applyCode) {
        this.applyCode = applyCode;
    }

    /**
     * Gets the apply type.
     * 
     * @return the apply type
     */
    public String getApplyType() {
        return applyType;
    }

    /**
     * Sets the apply type.
     * 
     * @param applyType
     *            the new apply type
     */
    public void setApplyType(String applyType) {
        this.applyType = applyType;
    }

    @Override
    public String toString() {
        return "Rldfm10hQueryDTO [personId=" + personId + ", removeYyymmdd=" + removeYyymmdd + ", removeTime="
                + removeTime + ", siteId=" + siteId + ", applyCode=" + applyCode + ", applyType=" + applyType + "]";
    }
}
