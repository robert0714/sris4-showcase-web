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
 * 出生地登記DTO.
 * 
 * @author Jay Kan
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01290DTO", propOrder = { "householdOperationDTO", "householdAppDataDTO", "rl01290AppDataDTO" })
@XmlRootElement(name = "Rl01290DTO")
public class Rl01290DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8792028189651368942L;

    /** 戶籍登記作業共通DTO. */
    @XmlElement(name = "HouseholdOperationDTO")
    @FieldName("戶籍登記作業共通DTO")
    private HouseholdOperationDTO householdOperationDTO = new HouseholdOperationDTO();

    /** 戶籍登記作業共通AppDataDTO. */
    @XmlElement(name = "HouseholdAppDataDTO")
    @FieldName("戶籍登記作業共通AppDataDTO")
    private HouseholdAppDataDTO householdAppDataDTO = new HouseholdAppDataDTO();

    /** 出生地登記 AppDataDTO. */
    @XmlElement(name = "Rl01290AppDataDTO")
    @FieldName("出生地登記 AppDataDTO")
    private Rl01290AppDataDTO rl01290AppDataDTO = new Rl01290AppDataDTO();

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
     * Gets the rl01290 app data dto.
     * 
     * @return the rl01290 app data dto
     */
    public Rl01290AppDataDTO getRl01290AppDataDTO() {
        return rl01290AppDataDTO;
    }

    /**
     * Sets the rl01290 app data dto.
     * 
     * @param rl01290AppDataDTO
     *            the new rl01290 app data dto
     */
    public void setRl01290AppDataDTO(final Rl01290AppDataDTO rl01290AppDataDTO) {
        this.rl01290AppDataDTO = rl01290AppDataDTO;
    }
}
