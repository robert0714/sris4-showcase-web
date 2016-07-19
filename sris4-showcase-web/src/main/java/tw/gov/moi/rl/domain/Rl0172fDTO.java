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
 * 配偶姓名變更DTO.
 * 
 * @author Jay Kan
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0172fDTO", propOrder = { "householdOperationDTO", "householdAppDataDTO", "rl0172fAppDataDTO" })
@XmlRootElement(name = "Rl0172fDTO")
public class Rl0172fDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -7987316839504827783L;

    /** 戶籍登記作業共通DTO. */
    @XmlElement(name = "HouseholdOperationDTO")
    @FieldName("戶籍登記作業共通DTO")
    private HouseholdOperationDTO householdOperationDTO = new HouseholdOperationDTO();

    /** 戶籍登記作業共通AppDataDTO. */
    @XmlElement(name = "HouseholdAppDataDTO")
    @FieldName("戶籍登記作業共通AppDataDTO")
    private HouseholdAppDataDTO householdAppDataDTO = new HouseholdAppDataDTO();

    /** 配偶姓名變更AppDataDTO. */
    @XmlElement(name = "Rl0172fAppDataDTO")
    @FieldName("配偶姓名變更AppDataDTO")
    private Rl0172fAppDataDTO rl0172fAppDataDTO = new Rl0172fAppDataDTO();

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
     * Gets the rl0172f app data dto.
     * 
     * @return the rl0172f app data dto
     */
    public Rl0172fAppDataDTO getRl0172fAppDataDTO() {
        return rl0172fAppDataDTO;
    }

    /**
     * Sets the rl0172f app data dto.
     * 
     * @param rl0172fAppDataDTO
     *            the new rl0172f app data dto
     */
    public void setRl0172fAppDataDTO(final Rl0172fAppDataDTO rl0172fAppDataDTO) {
        this.rl0172fAppDataDTO = rl0172fAppDataDTO;
    }
}
