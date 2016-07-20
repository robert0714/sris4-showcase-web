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
 * The Class Rl0171iDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0171hDTO", propOrder = { "householdOperationDTO", "householdAppDataDTO", "rl0171hAppDataDTO" })
@XmlRootElement(name = "Rl0171hDTO")
public class Rl0171hDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 3587670677728998097L;

    /** 戶籍登記作業共通DTO. */
    @XmlElement(name = "HouseholdOperationDTO")
    @FieldName("戶籍登記作業共通DTO")
    private HouseholdOperationDTO householdOperationDTO = new HouseholdOperationDTO();

    /** 戶籍登記作業共通AppDataDTO. */
    @XmlElement(name = "HouseholdAppDataDTO")
    @FieldName("戶籍登記作業共通AppDataDTO")
    private HouseholdAppDataDTO householdAppDataDTO = new HouseholdAppDataDTO();

    /** rl0171hAppDataDTO. */
    @XmlElement(name = "Rl0171hAppDataDTO")
    @FieldName("rl0171hAppDataDTO")
    private Rl0171hAppDataDTO rl0171hAppDataDTO = new Rl0171hAppDataDTO();

    /**
     * Gets the rl0171h app data dto.
     * 
     * @return the rl0171h app data dto
     */
    public Rl0171hAppDataDTO getRl0171hAppDataDTO() {
        return rl0171hAppDataDTO;
    }

    /**
     * Sets the rl0171h app data dto.
     * 
     * @param rl0171hAppDataDTO
     *            the new rl0171h app data dto
     */
    public void setRl0171hAppDataDTO(Rl0171hAppDataDTO rl0171hAppDataDTO) {
        this.rl0171hAppDataDTO = rl0171hAppDataDTO;
    }

    public HouseholdOperationDTO getHouseholdOperationDTO() {
        return householdOperationDTO;
    }

    public void setHouseholdOperationDTO(HouseholdOperationDTO householdOperationDTO) {
        this.householdOperationDTO = householdOperationDTO;
    }

    public HouseholdAppDataDTO getHouseholdAppDataDTO() {
        return householdAppDataDTO;
    }

    public void setHouseholdAppDataDTO(HouseholdAppDataDTO householdAppDataDTO) {
        this.householdAppDataDTO = householdAppDataDTO;
    }
}
