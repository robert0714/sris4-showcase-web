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
 * 出生地更正登記.
 * 
 * @author Jay Kan
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0171oAppDataDTO", propOrder = { "beforeBirthPlaceCode", "beforeOtherBirthPlace",
        "afterBirthPlaceCode", "afterOtherBirthPlace", "updateYyymmdd", "updateReasonCode", "otherUpdateReason",
        "otherCertificate", "certificateList" })
@XmlRootElement(name = "Rl0171oAppDataDTO")
public class Rl0171oAppDataDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8415531981675152710L;

    /** 原出生地代碼. */
    @XmlElement(name = "BeforeBirthPlaceCode")
    @FieldName("原出生地代碼")
    private String beforeBirthPlaceCode;

    /** 原其他出生地. */
    @XmlElement(name = "BeforeOtherBirthPlace")
    @FieldName("原其他出生地")
    private String beforeOtherBirthPlace;

    /** 更正出生地代碼. */
    @XmlElement(name = "AfterBirthPlaceCode")
    @FieldName("更正出生地代碼")
    private String afterBirthPlaceCode;

    /** 更正其他出生地. */
    @XmlElement(name = "AfterOtherBirthPlace")
    @FieldName("更正其他出生地")
    private String afterOtherBirthPlace;

    /** 更正日期. */
    @XmlElement(name = "UpdateYyymmdd")
    @FieldName("更正日期")
    private String updateYyymmdd;

    /** 更正原因代碼. */
    @XmlElement(name = "UpdateReasonCode")
    @FieldName("更正原因代碼")
    private String updateReasonCode = "01";

    /** 其他更正原因. */
    @XmlElement(name = "OtherUpdateReason")
    @FieldName("其他更正原因")
    private String otherUpdateReason;

    /** 其他附繳證件. */
    @XmlElement(name = "OtherCertificate")
    @FieldName("其他附繳證件")
    private String otherCertificate;

    /** 附繳證件清單. */
    @XmlElement(name = "CertificateList")
    @FieldName("附繳證件清單")
    private List<String> certificateList = new ArrayList<String>();

    /**
     * Gets the before birth place code.
     * 
     * @return the before birth place code
     */
    public String getBeforeBirthPlaceCode() {
        return beforeBirthPlaceCode;
    }

    /**
     * Sets the before birth place code.
     * 
     * @param beforeBirthPlaceCode
     *            the new before birth place code
     */
    public void setBeforeBirthPlaceCode(final String beforeBirthPlaceCode) {
        this.beforeBirthPlaceCode = beforeBirthPlaceCode;
    }

    /**
     * Gets the before other birth place.
     * 
     * @return the before other birth place
     */
    public String getBeforeOtherBirthPlace() {
        return beforeOtherBirthPlace;
    }

    /**
     * Sets the before other birth place.
     * 
     * @param beforeOtherBirthPlace
     *            the new before other birth place
     */
    public void setBeforeOtherBirthPlace(final String beforeOtherBirthPlace) {
        this.beforeOtherBirthPlace = beforeOtherBirthPlace;
    }

    /**
     * Gets the after birth place code.
     * 
     * @return the after birth place code
     */
    public String getAfterBirthPlaceCode() {
        return afterBirthPlaceCode;
    }

    /**
     * Sets the after birth place code.
     * 
     * @param afterBirthPlaceCode
     *            the new after birth place code
     */
    public void setAfterBirthPlaceCode(final String afterBirthPlaceCode) {
        this.afterBirthPlaceCode = afterBirthPlaceCode;
    }

    /**
     * Gets the after other birth place.
     * 
     * @return the after other birth place
     */
    public String getAfterOtherBirthPlace() {
        return afterOtherBirthPlace;
    }

    /**
     * Sets the after other birth place.
     * 
     * @param afterOtherBirthPlace
     *            the new after other birth place
     */
    public void setAfterOtherBirthPlace(final String afterOtherBirthPlace) {
        this.afterOtherBirthPlace = afterOtherBirthPlace;
    }

    /**
     * Gets the update yyymmdd.
     * 
     * @return the update yyymmdd
     */
    public String getUpdateYyymmdd() {
        return updateYyymmdd;
    }

    /**
     * Sets the update yyymmdd.
     * 
     * @param updateYyymmdd
     *            the new update yyymmdd
     */
    public void setUpdateYyymmdd(final String updateYyymmdd) {
        this.updateYyymmdd = updateYyymmdd;
    }

    /**
     * Gets the update reason code.
     * 
     * @return the update reason code
     */
    public String getUpdateReasonCode() {
        return updateReasonCode;
    }

    /**
     * Sets the update reason code.
     * 
     * @param updateReasonCode
     *            the new update reason code
     */
    public void setUpdateReasonCode(final String updateReasonCode) {
        this.updateReasonCode = updateReasonCode;
    }

    /**
     * Gets the other update reason.
     * 
     * @return the other update reason
     */
    public String getOtherUpdateReason() {
        return otherUpdateReason;
    }

    /**
     * Sets the other update reason.
     * 
     * @param otherUpdateReason
     *            the new other update reason
     */
    public void setOtherUpdateReason(final String otherUpdateReason) {
        this.otherUpdateReason = otherUpdateReason;
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
        result = prime * result + ((afterBirthPlaceCode == null) ? 0 : afterBirthPlaceCode.hashCode());
        result = prime * result + ((afterOtherBirthPlace == null) ? 0 : afterOtherBirthPlace.hashCode());
        result = prime * result + ((certificateList == null) ? 0 : certificateList.hashCode());
        result = prime * result + ((otherCertificate == null) ? 0 : otherCertificate.hashCode());
        result = prime * result + ((otherUpdateReason == null) ? 0 : otherUpdateReason.hashCode());
        result = prime * result + ((updateReasonCode == null) ? 0 : updateReasonCode.hashCode());
        result = prime * result + ((updateYyymmdd == null) ? 0 : updateYyymmdd.hashCode());
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
        Rl0171oAppDataDTO other = (Rl0171oAppDataDTO) obj;
        if (afterBirthPlaceCode == null) {
            if (other.afterBirthPlaceCode != null)
                return false;
        } else if (!afterBirthPlaceCode.equals(other.afterBirthPlaceCode))
            return false;
        if (afterOtherBirthPlace == null) {
            if (other.afterOtherBirthPlace != null)
                return false;
        } else if (!afterOtherBirthPlace.equals(other.afterOtherBirthPlace))
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
        if (otherUpdateReason == null) {
            if (other.otherUpdateReason != null)
                return false;
        } else if (!otherUpdateReason.equals(other.otherUpdateReason))
            return false;
        if (updateReasonCode == null) {
            if (other.updateReasonCode != null)
                return false;
        } else if (!updateReasonCode.equals(other.updateReasonCode))
            return false;
        if (updateYyymmdd == null) {
            if (other.updateYyymmdd != null)
                return false;
        } else if (!updateYyymmdd.equals(other.updateYyymmdd))
            return false;
        return true;
    }
}