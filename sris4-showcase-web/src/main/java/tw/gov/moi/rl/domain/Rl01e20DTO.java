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
 * 完整出生地登錄 DTO.
 * 
 * @author Jay Kan
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01e20DTO", propOrder = { "householdOperationDTO", "householdAppDataDTO", "rl01e20AppDataDTO",
        "errorCode" })
@XmlRootElement(name = "Rl01e20DTO")
public class Rl01e20DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -6979226308984329589L;

    /** 戶籍登記作業共通DTO. */
    @XmlElement(name = "HouseholdOperationDTO")
    @FieldName("戶籍登記作業共通DTO")
    private HouseholdOperationDTO householdOperationDTO = new HouseholdOperationDTO();

    /** 戶籍登記作業共通AppDataDTO. */
    @XmlElement(name = "HouseholdAppDataDTO")
    @FieldName("戶籍登記作業共通AppDataDTO")
    private HouseholdAppDataDTO householdAppDataDTO = new HouseholdAppDataDTO();

    /** 完整出生地登錄 AppDataDTO. */
    @XmlElement(name = "Rl01e20AppDataDTO")
    @FieldName("完整出生地登錄 AppDataDTO")
    private Rl01e20AppDataDTO rl01e20AppDataDTO = new Rl01e20AppDataDTO();

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
     * Gets the rl01e20 app data dto.
     * 
     * @return the rl01e20 app data dto
     */
    public Rl01e20AppDataDTO getRl01e20AppDataDTO() {
        return rl01e20AppDataDTO;
    }

    /**
     * Sets the rl01e20 app data dto.
     * 
     * @param rl01e20AppDataDTO
     *            the new rl01e20 app data dto
     */
    public void setRl01e20AppDataDTO(final Rl01e20AppDataDTO rl01e20AppDataDTO) {
        this.rl01e20AppDataDTO = rl01e20AppDataDTO;
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
