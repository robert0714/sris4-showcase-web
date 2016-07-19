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
import tw.gov.moi.rl.component.dto.PersonDataInputDTO;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "applicantDataInputDTO", propOrder = { "personData" })
@XmlRootElement(name = "ApplicantDataInputDTO")
public class ApplicantDataInputDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 申請人資料 */
    @XmlElement(name = "PeraonData", required = true)
    @FieldName("申請人資料")
    private PersonDataInputDTO personData = new PersonDataInputDTO();

    public PersonDataInputDTO getPersonData() {
        return personData;
    }

    public void setPersonData(PersonDataInputDTO personData) {
        this.personData = personData;
    }
}
