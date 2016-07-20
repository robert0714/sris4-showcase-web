/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * 出生別更正撤銷登記AppDataDTO.
 * 
 * @author Jay Kan
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl01811AppDataDTO", propOrder = { "beforeWork", "beforeBirthOrderSex", "beforeRelationship",
        "afterBirthOrderSex", "afterRelationship", "revokeYyymmdd", "revokeReason", "otherCertificate",
        "certificateList" })
@XmlRootElement(name = "Rl01811AppDataDTO")
public class Rl01811AppDataDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8141881903818660492L;

    /** 原登記事項. */
    @XmlElement(name = "BeforeWork")
    @FieldName("原登記事項")
    private String beforeWork;

    /** 原出生別代碼. */
    @XmlElement(name = "BeforeBirthOrderSex")
    @FieldName("原出生別代碼")
    private String beforeBirthOrderSex;

    /** 原稱謂. */
    @XmlElement(name = "BeforeRelationship")
    @FieldName("原稱謂")
    private String beforeRelationship;

    /** 撤銷後出生別代碼. */
    @XmlElement(name = "AfterBirthOrderSex")
    @FieldName("撤銷後出生別代碼")
    private String afterBirthOrderSex;

    /** 撤銷稱謂. */
    @XmlElement(name = "AfterRelationship")
    @FieldName("撤銷稱謂")
    private String afterRelationship;

    /** 撤銷日期. */
    @XmlElement(name = "RevokeYyymmdd")
    @FieldName("撤銷日期")
    private String revokeYyymmdd;

    /** 撤銷原因. */
    @XmlElement(name = "RevokeReason")
    @FieldName("撤銷原因")
    private String revokeReason;

    /** 其他附繳證件. */
    @XmlElement(name = "OtherCertificate")
    @FieldName("其他附繳證件")
    private String otherCertificate;

    /** 附繳證件清單. */
    @XmlElement(name = "CertificateList")
    @FieldName("附繳證件清單")
    private List<String> certificateList = new ArrayList<String>();

    /**
     * Gets the before work.
     * 
     * @return the before work
     */
    public String getBeforeWork() {
        return beforeWork;
    }

    /**
     * Sets the before work.
     * 
     * @param beforeWork
     *            the new before work
     */
    public void setBeforeWork(final String beforeWork) {
        this.beforeWork = beforeWork;
    }

    /**
     * Gets the before birth order sex.
     * 
     * @return the before birth order sex
     */
    public String getBeforeBirthOrderSex() {
        return beforeBirthOrderSex;
    }

    /**
     * Sets the before birth order sex.
     * 
     * @param beforeBirthOrderSex
     *            the new before birth order sex
     */
    public void setBeforeBirthOrderSex(final String beforeBirthOrderSex) {
        this.beforeBirthOrderSex = beforeBirthOrderSex;
    }

    /**
     * Gets the before relationship.
     * 
     * @return the before relationship
     */
    public String getBeforeRelationship() {
        return beforeRelationship;
    }

    /**
     * Sets the before relationship.
     * 
     * @param beforeRelationship
     *            the new before relationship
     */
    public void setBeforeRelationship(final String beforeRelationship) {
        this.beforeRelationship = beforeRelationship;
    }

    /**
     * Gets the after birth order sex.
     * 
     * @return the after birth order sex
     */
    public String getAfterBirthOrderSex() {
        return afterBirthOrderSex;
    }

    /**
     * Sets the after birth order sex.
     * 
     * @param afterBirthOrderSex
     *            the new after birth order sex
     */
    public void setAfterBirthOrderSex(final String afterBirthOrderSex) {
        this.afterBirthOrderSex = afterBirthOrderSex;
    }

    /**
     * Gets the after relationship.
     * 
     * @return the after relationship
     */
    public String getAfterRelationship() {
        return afterRelationship;
    }

    /**
     * Sets the after relationship.
     * 
     * @param afterRelationship
     *            the new after relationship
     */
    public void setAfterRelationship(final String afterRelationship) {
        this.afterRelationship = afterRelationship;
    }

    /**
     * Gets the revoke yyymmdd.
     * 
     * @return the revoke yyymmdd
     */
    public String getRevokeYyymmdd() {
        return revokeYyymmdd;
    }

    /**
     * Sets the revoke yyymmdd.
     * 
     * @param revokeYyymmdd
     *            the new revoke yyymmdd
     */
    public void setRevokeYyymmdd(final String revokeYyymmdd) {
        this.revokeYyymmdd = revokeYyymmdd;
    }

    /**
     * Gets the revoke reason.
     * 
     * @return the revoke reason
     */
    public String getRevokeReason() {
        return revokeReason;
    }

    /**
     * Sets the revoke reason.
     * 
     * @param revokeReason
     *            the new revoke reason
     */
    public void setRevokeReason(final String revokeReason) {
        this.revokeReason = revokeReason;
    }

    /**
     * Gets the other certificate.
     * 
     * @return the other certificate
     */
    public String getOtherCertificate() {
        return otherCertificate;
    }

    /**
     * Sets the other certificate.
     * 
     * @param otherCertificate
     *            the new other certificate
     */
    public void setOtherCertificate(final String otherCertificate) {
        this.otherCertificate = otherCertificate;
    }

    /**
     * Gets the certificate list.
     * 
     * @return the certificate list
     */
    public List<String> getCertificateList() {
        return certificateList;
    }

    /**
     * Sets the certificate list.
     * 
     * @param certificateList
     *            the new certificate list
     */
    public void setCertificateList(final List<String> certificateList) {
        this.certificateList = certificateList;
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
        result = prime * result + ((afterBirthOrderSex == null) ? 0 : afterBirthOrderSex.hashCode());
        result = prime * result + ((beforeWork == null) ? 0 : beforeWork.hashCode());
        result = prime * result + ((certificateList == null) ? 0 : certificateList.hashCode());
        result = prime * result + ((otherCertificate == null) ? 0 : otherCertificate.hashCode());
        result = prime * result + ((revokeReason == null) ? 0 : revokeReason.hashCode());
        result = prime * result + ((revokeYyymmdd == null) ? 0 : revokeYyymmdd.hashCode());
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
        Rl01811AppDataDTO other = (Rl01811AppDataDTO) obj;
        if (afterBirthOrderSex == null) {
            if (other.afterBirthOrderSex != null)
                return false;
        } else if (!afterBirthOrderSex.equals(other.afterBirthOrderSex))
            return false;
        if (beforeWork == null) {
            if (other.beforeWork != null)
                return false;
        } else if (!beforeWork.equals(other.beforeWork))
            return false;
        if (certificateList == null) {
            if (other.certificateList != null)
                return false;
        } else if (!certificateList.equals(other.certificateList))
            return false;
        if (otherCertificate == null) {
            if (other.otherCertificate != null)
                return false;
        } else if (!otherCertificate.equals(other.otherCertificate))
            return false;
        if (revokeReason == null) {
            if (other.revokeReason != null)
                return false;
        } else if (!revokeReason.equals(other.revokeReason))
            return false;
        if (revokeYyymmdd == null) {
            if (other.revokeYyymmdd != null)
                return false;
        } else if (!revokeYyymmdd.equals(other.revokeYyymmdd))
            return false;
        return true;
    }
}
