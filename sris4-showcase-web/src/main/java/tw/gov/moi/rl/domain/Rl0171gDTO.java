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
 * 出生別更正登記 DTO.
 * 
 * @author Dan Tsai
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0171gDTO", propOrder = { "householdOperationDTO", "householdAppDataDTO", "rl0171gAppDataDTO" })
@XmlRootElement(name = "Rl0171gDTO")
public class Rl0171gDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 戶籍登記作業共通DTO. */
    @XmlElement(name = "HouseholdOperationDTO")
    @FieldName("戶籍登記作業共通DTO")
    private HouseholdOperationDTO householdOperationDTO = new HouseholdOperationDTO();

    /** 戶籍登記作業共通AppDataDTO. */
    @XmlElement(name = "HouseholdAppDataDTO")
    @FieldName("戶籍登記作業共通AppDataDTO")
    private HouseholdAppDataDTO householdAppDataDTO = new HouseholdAppDataDTO();

    /** 出生別更正登記 AppDataDTO. */
    @XmlElement(name = "Rl0171gAppDataDTO")
    @FieldName("出生別更正登記 AppDataDTO")
    private Rl0171gAppDataDTO rl0171gAppDataDTO = new Rl0171gAppDataDTO();

    /**
     * Gets the rl0171g app data dto.
     * 
     * @return the rl0171g app data dto
     */
    public Rl0171gAppDataDTO getRl0171gAppDataDTO() {
        return rl0171gAppDataDTO;
    }

    /**
     * Sets the rl0171g app data dto.
     * 
     * @param rl0171gAppDataDTO
     *            the new rl0171g app data dto
     */
    public void setRl0171gAppDataDTO(Rl0171gAppDataDTO rl0171gAppDataDTO) {
        this.rl0171gAppDataDTO = rl0171gAppDataDTO;
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
    public void setHouseholdAppDataDTO(HouseholdAppDataDTO householdAppDataDTO) {
        this.householdAppDataDTO = householdAppDataDTO;
    }

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
    public void setHouseholdOperationDTO(HouseholdOperationDTO householdOperationDTO) {
        this.householdOperationDTO = householdOperationDTO;
    }

}
