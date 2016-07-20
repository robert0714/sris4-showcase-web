/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component.dto;

import java.io.Serializable;

import tw.gov.moi.rl.domain.XLDFHouseholdDataDTO;
import tw.gov.moi.rl.domain.XLDFPersonDataDTO;


/**
 * 當事人資料
 * 
 * @author Jay Kan
 */
public class TransactionPersonDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private XLDFPersonDataDTO person;

    private XLDFPersonDataDTO personRome;

    private XLDFHouseholdDataDTO personHousehold;

    public XLDFPersonDataDTO getPerson() {
        return person;
    }

    public void setPerson(final XLDFPersonDataDTO person) {
        this.person = person;
    }

    public XLDFPersonDataDTO getPersonRome() {
        return personRome;
    }

    public void setPersonRome(final XLDFPersonDataDTO personRome) {
        this.personRome = personRome;
    }

    public XLDFHouseholdDataDTO getPersonHousehold() {
        return personHousehold;
    }

    public void setPersonHousehold(final XLDFHouseholdDataDTO personHousehold) {
        this.personHousehold = personHousehold;
    }
}