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
 * The Class Rl08970DTOResuls.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl08970DTOResuls", propOrder = { "personId" })
@XmlRootElement(name = "Rl08970DTOResuls")
public class Rl08970DTOResuls implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 統號. */
    @XmlElement(name = "personId")
    @FieldName("統號")
    private String personId;

    public Rl08970DTOResuls() {
        super();
    }

    public Rl08970DTOResuls(String personId) {
        this.personId = personId;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    @Override
    public String toString() {
        return "Rl08970DTOResuls [personId=" + personId + "]";
    }

}
