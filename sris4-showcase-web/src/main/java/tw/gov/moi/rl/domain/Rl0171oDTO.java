/*
 * Copyright (c) 2010-2020 IISI. All rights reserved.
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
 * 出生地更正登記DTO.
 * 
 * @author Jay Kan
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0171oDTO", propOrder = { "householdOperationDTO", "householdAppDataDTO", "rl0171oAppDataDTO" })
@XmlRootElement(name = "Rl0171oDTO")
public class Rl0171oDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -878658304299236108L;

    /** 戶籍登記作業共通DTO. */
    @XmlElement(name = "HouseholdOperationDTO")
    @FieldName("戶籍登記作業共通DTO")
    private HouseholdOperationDTO householdOperationDTO = new HouseholdOperationDTO();

    /** 戶籍登記作業共通AppDataDTO. */
    @XmlElement(name = "HouseholdAppDataDTO")
    @FieldName("戶籍登記作業共通AppDataDTO")
    private HouseholdAppDataDTO householdAppDataDTO = new HouseholdAppDataDTO();

    /** 出生地更正登記 AppDataDTO. */
    @XmlElement(name = "Rl0171oAppDataDTO")
    @FieldName("出生地更正登記 AppDataDTO")
    private Rl0171oAppDataDTO rl0171oAppDataDTO = new Rl0171oAppDataDTO();

    /**
     * Gets the household operation dto.
     * 
     * @return the household operation dto
     */
    public HouseholdOperationDTO getHouseholdOperationDTO() {
        return householdOperationDTO;
    }

    /**
     * Sets the household operation dto.
     * 
     * @param householdOperationDTO
     *            the new household operation dto
     */
    public void setHouseholdOperationDTO(final HouseholdOperationDTO householdOperationDTO) {
        this.householdOperationDTO = householdOperationDTO;
    }

    /**
     * Gets the household app data dto.
     * 
     * @return the household app data dto
     */
    public HouseholdAppDataDTO getHouseholdAppDataDTO() {
        return householdAppDataDTO;
    }

    /**
     * Sets the household app data dto.
     * 
     * @param householdAppDataDTO
     *            the new household app data dto
     */
    public void setHouseholdAppDataDTO(final HouseholdAppDataDTO householdAppDataDTO) {
        this.householdAppDataDTO = householdAppDataDTO;
    }

    /**
     * Gets the rl0171o app data dto.
     * 
     * @return the rl0171o app data dto
     */
    public Rl0171oAppDataDTO getRl0171oAppDataDTO() {
        return rl0171oAppDataDTO;
    }

    /**
     * Sets the rl0171o app data dto.
     * 
     * @param rl0171oAppDataDTO
     *            the new rl0171o app data dto
     */
    public void setRl0171oAppDataDTO(final Rl0171oAppDataDTO rl0171oAppDataDTO) {
        this.rl0171oAppDataDTO = rl0171oAppDataDTO;
    }
}