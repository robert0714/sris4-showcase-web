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
import tw.gov.moi.rl.component.xldf.dto.XLDF004M;

/**
 * 稱謂修改 當事人DTO
 * 
 * @author marcus
 * 
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01e10PersonDTO", propOrder = { "personData", "oriRelationShip", "relationship" })
@XmlRootElement(name = "Rl01e10PersonDTO")
public class Rl01e10PersonDTO implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @XmlElement(name = "PersonData")
    @FieldName("當事人資料")
    private XLDF004M personData;

    @XmlElement(name = "OriRelationShip")
    @FieldName("原稱謂")
    private String oriRelationShip;

    @XmlElement(name = "Relationship")
    @FieldName("更改後的稱謂")
    private String relationship;

    public Rl01e10PersonDTO() {
        super();

    }

    public Rl01e10PersonDTO(XLDF004M personData) {
        super();
        this.personData = personData;
        this.oriRelationShip = personData.getDomainObj().getRelationship();
        this.relationship = oriRelationShip;
    }

    /**
     * @return the personData
     */
    public XLDF004M getPersonData() {
        return personData;
    }

    /**
     * @param personData
     *            the personData to set
     */
    public void setPersonData(XLDF004M personData) {
        this.personData = personData;
    }

    /**
     * @return the oriRelationShip
     */
    public String getOriRelationShip() {
        return oriRelationShip;
    }

    /**
     * @param oriRelationShip
     *            the oriRelationShip to set
     */
    public void setOriRelationShip(String oriRelationShip) {
        this.oriRelationShip = oriRelationShip;
    }

    /**
     * @return the relationship
     */
    public String getRelationship() {
        return relationship;
    }

    /**
     * @param relationship
     *            the relationship to set
     */
    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

}
