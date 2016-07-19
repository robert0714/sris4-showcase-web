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
 * 撤銷出生地登記 AppDataDTO.
 * 
 * @author Jay Kan
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01823AppDataDTO", propOrder = { "beforeBirthPlaceCode", "beforeOtherBirthPlace", "otherCertificate",
        "certificateList" })
@XmlRootElement(name = "Rl01823AppDataDTO")
public class Rl01823AppDataDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8148858534639785297L;

    /** 舊出生地. */
    @XmlElement(name = "BeforeBirthPlaceCode")
    @FieldName("舊出生地")
    private String beforeBirthPlaceCode;

    /** 舊其他出生地. */
    @XmlElement(name = "BeforeOtherBirthPlace")
    @FieldName("舊其他出生地")
    private String beforeOtherBirthPlace;

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
        result = prime * result + ((certificateList == null) ? 0 : certificateList.hashCode());
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
        Rl01823AppDataDTO other = (Rl01823AppDataDTO) obj;
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
        return true;
    }
}
