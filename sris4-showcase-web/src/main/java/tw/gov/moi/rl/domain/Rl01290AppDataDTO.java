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
 * 出生地登記 AppDataDTO.
 * 
 * @author Jay Kan
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01290AppDataDTO", propOrder = { "birthPlaceCode", "otherBirthPlace", "otherCertificate",
        "certificateList" })
@XmlRootElement(name = "Rl01290AppDataDTO")
public class Rl01290AppDataDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8069953668815775998L;

    /** 出生地. */
    @XmlElement(name = "BirthPlaceCode")
    @FieldName("出生地")
    private String birthPlaceCode;

    /** 其它出生地. */
    @XmlElement(name = "OtherBirthPlace")
    @FieldName("其它出生地")
    private String otherBirthPlace;

    /** 其他附繳證件. */
    @XmlElement(name = "OtherCertificate")
    @FieldName("其他附繳證件")
    private String otherCertificate;

    /** 附繳證件清單. */
    @XmlElement(name = "CertificateList")
    @FieldName("附繳證件清單")
    private List<String> certificateList = new ArrayList<String>();

    /**
     * Gets the birth place code.
     * 
     * @return the birth place code
     */
    public String getBirthPlaceCode() {
        return birthPlaceCode;
    }

    /**
     * Sets the birth place code.
     * 
     * @param birthPlaceCode
     *            the new birth place code
     */
    public void setBirthPlaceCode(final String birthPlaceCode) {
        this.birthPlaceCode = birthPlaceCode;
    }

    /**
     * Gets the other birth place.
     * 
     * @return the other birth place
     */
    public String getOtherBirthPlace() {
        return otherBirthPlace;
    }

    /**
     * Sets the other birth place.
     * 
     * @param otherBirthPlace
     *            the new other birth place
     */
    public void setOtherBirthPlace(final String otherBirthPlace) {
        this.otherBirthPlace = otherBirthPlace;
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
        result = prime * result + ((birthPlaceCode == null) ? 0 : birthPlaceCode.hashCode());
        result = prime * result + ((certificateList == null) ? 0 : certificateList.hashCode());
        result = prime * result + ((otherBirthPlace == null) ? 0 : otherBirthPlace.hashCode());
        result = prime * result + ((otherCertificate == null) ? 0 : otherCertificate.hashCode());
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
        Rl01290AppDataDTO other = (Rl01290AppDataDTO) obj;
        if (birthPlaceCode == null) {
            if (other.birthPlaceCode != null)
                return false;
        } else if (!birthPlaceCode.equals(other.birthPlaceCode))
            return false;
        if (certificateList == null) {
            if (other.certificateList != null)
                return false;
        } else if (!certificateList.equals(other.certificateList))
            return false;
        if (otherBirthPlace == null) {
            if (other.otherBirthPlace != null)
                return false;
        } else if (!otherBirthPlace.equals(other.otherBirthPlace))
            return false;
        if (otherCertificate == null) {
            if (other.otherCertificate != null)
                return false;
        } else if (!otherCertificate.equals(other.otherCertificate))
            return false;
        return true;
    }
}
