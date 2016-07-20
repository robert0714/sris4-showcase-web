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
 * 養母姓名更正登記 DTO.
 * 
 * @author Jay Kan
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0171rDTO", propOrder = { "householdOperationDTO", "householdAppDataDTO", "rl0171rAppDataDTO" })
@XmlRootElement(name = "Rl0171rDTO")
public class Rl0171rDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8502196032359264711L;

    /** 戶籍登記作業共通DTO. */
    @XmlElement(name = "HouseholdOperationDTO")
    @FieldName("戶籍登記作業共通DTO")
    private HouseholdOperationDTO householdOperationDTO = new HouseholdOperationDTO();

    /** 戶籍登記作業共通AppDataDTO. */
    @XmlElement(name = "HouseholdAppDataDTO")
    @FieldName("戶籍登記作業共通AppDataDTO")
    private HouseholdAppDataDTO householdAppDataDTO = new HouseholdAppDataDTO();

    /** 養母姓名更正登記 app data dto. */
    @XmlElement(name = "Rl0171rAppDataDTO")
    @FieldName("養母姓名更正登記 app data dto")
    private Rl0171rAppDataDTO rl0171rAppDataDTO = new Rl0171rAppDataDTO();

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
     * Gets the rl0171r app data dto.
     * 
     * @return the rl0171r app data dto
     */
    public Rl0171rAppDataDTO getRl0171rAppDataDTO() {
        return rl0171rAppDataDTO;
    }

    /**
     * Sets the rl0171r app data dto.
     * 
     * @param rl0171rAppDataDTO
     *            the new rl0171r app data dto
     */
    public void setRl0171rAppDataDTO(final Rl0171rAppDataDTO rl0171rAppDataDTO) {
        this.rl0171rAppDataDTO = rl0171rAppDataDTO;
    }
}
