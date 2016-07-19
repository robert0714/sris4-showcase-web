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
 * 配偶姓名更正廢止DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01g10DTO", propOrder = { "householdOperationDTO", "householdAppDataDTO", "rl01g10AppDataDTO" })
@XmlRootElement(name = "Rl01g10DTO")
public class Rl01g10DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -7085929809346297338L;

    /** 戶籍登記作業共通DTO. */
    @XmlElement(name = "HouseholdOperationDTO")
    @FieldName("戶籍登記作業共通DTO")
    private HouseholdOperationDTO householdOperationDTO = new HouseholdOperationDTO();

    /** 戶籍登記作業共通AppDataDTO. */
    @XmlElement(name = "HouseholdAppDataDTO")
    @FieldName("戶籍登記作業共通AppDataDTO")
    private HouseholdAppDataDTO householdAppDataDTO = new HouseholdAppDataDTO();

    /** 配偶姓名更正廢止AppDataDTO. */
    @XmlElement(name = "Rl01g10AppDataDTO")
    @FieldName("配偶姓名更正廢止AppDataDTO")
    private Rl01g10AppDataDTO rl01g10AppDataDTO = new Rl01g10AppDataDTO();

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
     * Gets the rl01g10 app data dto.
     * 
     * @return the rl01g10 app data dto
     */
    public Rl01g10AppDataDTO getRl01g10AppDataDTO() {
        return rl01g10AppDataDTO;
    }

    /**
     * Sets the rl01g10 app data dto.
     * 
     * @param rl01g10AppDataDTO
     *            the new rl01g10 app data dto
     */
    public void setRl01g10AppDataDTO(final Rl01g10AppDataDTO rl01g10AppDataDTO) {
        this.rl01g10AppDataDTO = rl01g10AppDataDTO;
    }
}
