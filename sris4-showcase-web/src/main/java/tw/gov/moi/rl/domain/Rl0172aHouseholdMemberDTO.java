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
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;

/**
 * The Class Rl0172aHouseholdMemberDTO.
 * 
 * @author Jay Kan
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0172aHouseholdMemberDTO", propOrder = { "personDataDomainObject", "relationCode", "newRelationship" })
@XmlRootElement(name = "Rl0172aHouseholdMemberDTO")
public class Rl0172aHouseholdMemberDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -8595277296786086219L;

    /** 個人基本資料. */
    @XmlElement(name = "PersonDataDomainObject")
    @FieldName("個人基本資料")
    private XLDFPersonDataDomainObject personDataDomainObject;

    /** 舊稱謂代碼. */
    @XmlElement(name = "RelationCode")
    @FieldName("舊稱謂代碼")
    private String relationCode;

    /** 新稱謂. */
    @XmlElement(name = "NewRelationship")
    @FieldName("新稱謂")
    private String newRelationship;

    /**
     * Gets the person data domain object.
     * 
     * @return the person data domain object
     */
    public XLDFPersonDataDomainObject getPersonDataDomainObject() {
        return personDataDomainObject;
    }

    /**
     * Sets the person data domain object.
     * 
     * @param personDataDomainObject
     *            the new person data domain object
     */
    public void setPersonDataDomainObject(final XLDFPersonDataDomainObject personDataDomainObject) {
        this.personDataDomainObject = personDataDomainObject;
    }

    /**
     * Gets the relation code.
     * 
     * @return the relation code
     */
    public String getRelationCode() {
        return relationCode;
    }

    /**
     * Sets the relation code.
     * 
     * @param relationCode
     *            the new relation code
     */
    public void setRelationCode(final String relationCode) {
        this.relationCode = relationCode;
    }

    /**
     * Gets the new relationship.
     * 
     * @return the new relationship
     */
    public String getNewRelationship() {
        return newRelationship;
    }

    /**
     * Sets the new relationship.
     * 
     * @param newRelationship
     *            the new new relationship
     */
    public void setNewRelationship(final String newRelationship) {
        this.newRelationship = newRelationship;
    }
}
