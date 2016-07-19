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
 * 養母姓名變更DTO.
 * 
 * @author Jay Kan
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0172jDTO", propOrder = { "householdOperationDTO", "householdAppDataDTO", "rl0172jAppDataDTO" })
@XmlRootElement(name = "Rl0172jDTO")
public class Rl0172jDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -3402524495629382195L;

    /** 戶籍登記作業共通DTO. */
    @XmlElement(name = "HouseholdOperationDTO")
    @FieldName("戶籍登記作業共通DTO")
    private HouseholdOperationDTO householdOperationDTO = new HouseholdOperationDTO();

    /** 戶籍登記作業共通AppDataDTO. */
    @XmlElement(name = "HouseholdAppDataDTO")
    @FieldName("戶籍登記作業共通AppDataDTO")
    private HouseholdAppDataDTO householdAppDataDTO = new HouseholdAppDataDTO();

    /** 養母姓名變更 AppDataDTO. */
    @XmlElement(name = "Rl0172jAppDataDTO")
    @FieldName("養母姓名變更 AppDataDTO")
    private Rl0172jAppDataDTO rl0172jAppDataDTO = new Rl0172jAppDataDTO();

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
     * Gets the rl0172j app data dto.
     * 
     * @return the rl0172j app data dto
     */
    public Rl0172jAppDataDTO getRl0172jAppDataDTO() {
        return rl0172jAppDataDTO;
    }

    /**
     * Sets the rl0172j app data dto.
     * 
     * @param rl0172jAppDataDTO
     *            the new rl0172j app data dto
     */
    public void setRl0172jAppDataDTO(final Rl0172jAppDataDTO rl0172jAppDataDTO) {
        this.rl0172jAppDataDTO = rl0172jAppDataDTO;
    }
}
