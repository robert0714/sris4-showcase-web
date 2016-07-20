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
 * 父姓名更正登記DTO.
 * 
 * @author Jay Kan
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0171iDTO", propOrder = { "householdOperationDTO", "householdAppDataDTO", "rl0171iAppDataDTO" })
@XmlRootElement(name = "Rl0171iDTO")
public class Rl0171iDTO implements Serializable {

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

    /** 父姓名更正登記 AppDataDTO. */
    @XmlElement(name = "Rl0171iAppDataDTO")
    @FieldName("父姓名更正登記 AppDataDTO")
    private Rl0171iAppDataDTO rl0171iAppDataDTO = new Rl0171iAppDataDTO();

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
     * Gets the rl0171i app data dto.
     * 
     * @return the rl0171i app data dto
     */
    public Rl0171iAppDataDTO getRl0171iAppDataDTO() {
        return rl0171iAppDataDTO;
    }

    /**
     * Sets the rl0171i app data dto.
     * 
     * @param rl0171iAppDataDTO
     *            the new rl0171i app data dto
     */
    public void setRl0171iAppDataDTO(final Rl0171iAppDataDTO rl0171iAppDataDTO) {
        this.rl0171iAppDataDTO = rl0171iAppDataDTO;
    }
}
