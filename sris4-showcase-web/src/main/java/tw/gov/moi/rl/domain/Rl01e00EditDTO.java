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
import tw.gov.moi.domain.Rldf004mType;

/**
 * The Class Rl01e00EditDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl01e00EditDTO", propOrder = { "rldf004mObj", "modfiyEducation" })
@XmlRootElement(name = "Rl01e00EditDTO")
public class Rl01e00EditDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** Rldf004m. */
    @XmlElement(name = "Rldf004mObj", required = true)
    @FieldName("Rldf004m")
    private Rldf004mType rldf004mObj;

    /** 修改後教育程度註記. */
    @XmlElement(name = "ModfiyEducation", required = true)
    @FieldName("修改後教育程度註記")
    private String modfiyEducation;

    /**
     * Gets the rldf004m obj.
     * 
     * @return the rldf004m obj
     */
    public Rldf004mType getRldf004mObj() {
        return rldf004mObj;
    }

    /**
     * Sets the rldf004m obj.
     * 
     * @param rldf004mObj
     *            the new rldf004m obj
     */
    public void setRldf004mObj(final Rldf004mType rldf004mObj) {
        this.rldf004mObj = rldf004mObj;
    }

    /**
     * Gets the modfiy education.
     * 
     * @return the modfiy education
     */
    public String getModfiyEducation() {
        return modfiyEducation;
    }

    /**
     * Sets the modfiy education.
     * 
     * @param modfiyEducation
     *            the new modfiy education
     */
    public void setModfiyEducation(final String modfiyEducation) {
        this.modfiyEducation = modfiyEducation;
    }
}
