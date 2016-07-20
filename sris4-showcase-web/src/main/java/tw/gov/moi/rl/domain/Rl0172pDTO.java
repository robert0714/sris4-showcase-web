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
 * 出生地變更登記DTO.
 * 
 * @author Jay Kan
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0172pDTO", propOrder = { "householdOperationDTO", "householdAppDataDTO", "rl0172pAppDataDTO" })
@XmlRootElement(name = "Rl0172pDTO")
public class Rl0172pDTO implements Serializable {

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

    /** 出生地變更登記 AppDataDTO. */
    @XmlElement(name = "Rl0172pAppDataDTO")
    @FieldName("出生地變更登記 AppDataDTO")
    private Rl0172pAppDataDTO rl0172pAppDataDTO = new Rl0172pAppDataDTO();

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
     * Gets the rl0172p app data dto.
     * 
     * @return the rl0172p app data dto
     */
    public Rl0172pAppDataDTO getRl0172pAppDataDTO() {
        return rl0172pAppDataDTO;
    }

    /**
     * Sets the rl0172p app data dto.
     * 
     * @param rl0172pAppDataDTO
     *            the new rl0172p app data dto
     */
    public void setRl0172pAppDataDTO(final Rl0172pAppDataDTO rl0172pAppDataDTO) {
        this.rl0172pAppDataDTO = rl0172pAppDataDTO;
    }
}