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
 * 原住民身分及族別更正DTO.
 * 
 * @author Jay Kan
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0171lDTO", propOrder = { "householdOperationDTO", "householdAppDataDTO", "rl0171lAppDataDTO",
        "errorCode" })
@XmlRootElement(name = "Rl0171lDTO")
public class Rl0171lDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1188829996997419397L;

    /** 戶籍登記作業共通DTO. */
    @XmlElement(name = "HouseholdOperationDTO")
    @FieldName("戶籍登記作業共通DTO")
    private HouseholdOperationDTO householdOperationDTO = new HouseholdOperationDTO();

    /** 戶籍登記作業共通AppDataDTO. */
    @XmlElement(name = "HouseholdAppDataDTO")
    @FieldName("戶籍登記作業共通AppDataDTO")
    private HouseholdAppDataDTO householdAppDataDTO = new HouseholdAppDataDTO();

    /** 原住民身分及族別更正AppDataDTO. */
    @XmlElement(name = "Rl0171lAppDataDTO")
    @FieldName("原住民身分及族別更正AppDataDTO")
    private Rl0171lAppDataDTO rl0171lAppDataDTO = new Rl0171lAppDataDTO();

    /** 錯誤代碼. */
    @XmlElement(name = "ErrorCode")
    @FieldName("錯誤代碼")
    private String errorCode;

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
     * Gets the rl0171l app data dto.
     * 
     * @return the rl0171l app data dto
     */
    public Rl0171lAppDataDTO getRl0171lAppDataDTO() {
        return rl0171lAppDataDTO;
    }

    /**
     * Sets the rl0171l app data dto.
     * 
     * @param rl0171lAppDataDTO
     *            the new rl0171l app data dto
     */
    public void setRl0171lAppDataDTO(final Rl0171lAppDataDTO rl0171lAppDataDTO) {
        this.rl0171lAppDataDTO = rl0171lAppDataDTO;
    }

    /**
     * Gets the error code.
     * 
     * @return the error code
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the error code.
     * 
     * @param errorCode
     *            the new error code
     */
    public void setErrorCode(final String errorCode) {
        this.errorCode = errorCode;
    }
}
