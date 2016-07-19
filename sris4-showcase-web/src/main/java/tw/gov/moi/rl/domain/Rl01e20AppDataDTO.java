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
 * 完整出生地登錄AppDataDTO.
 * 
 * @author Jay Kan
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01e20AppDataDTO", propOrder = { "birthPlaceCode", "beforeOtherBirthPlace", "afterOtherBirthPlace" })
@XmlRootElement(name = "Rl01e20AppDataDTO")
public class Rl01e20AppDataDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 3663674079946589853L;

    /** 出生地代碼. */
    @XmlElement(name = "BirthPlaceCode")
    @FieldName("出生地代碼")
    private String birthPlaceCode;

    /** 原其他出生地. */
    @XmlElement(name = "BeforeOtherBirthPlace")
    @FieldName("原其他出生地")
    private String beforeOtherBirthPlace;

    /** 新其他出生地. */
    @XmlElement(name = "AfterOtherBirthPlace")
    @FieldName("新其他出生地")
    private String afterOtherBirthPlace;

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

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((afterOtherBirthPlace == null) ? 0 : afterOtherBirthPlace.hashCode());
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
        Rl01e20AppDataDTO other = (Rl01e20AppDataDTO) obj;
        if (afterOtherBirthPlace == null) {
            if (other.afterOtherBirthPlace != null)
                return false;
        } else if (!afterOtherBirthPlace.equals(other.afterOtherBirthPlace))
            return false;
        return true;
    }
}
