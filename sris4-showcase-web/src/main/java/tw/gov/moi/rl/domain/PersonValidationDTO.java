/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.component.dto.XLDFDomainObject;

/**
 * The Class PersonValidationDTO.
 * 
 * @author Jay Kan
 */
public class PersonValidationDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -1015119972129217836L;

    /** 作業代碼. */
    @FieldName("作業代碼")
    private String operationCode;

    /** 當事人個人基本資料. */
    @FieldName("當事人個人基本資料")
    private XLDFDomainObject xldfDomainObject;

    /** 當事人全戶基本資料. */
    @FieldName("當事人全戶基本資料")
    private XLDFHouseholdDataDTO xldfHouseholdDataDTO;

    /**
     * Instantiates a new person validation dto.
     * 
     * @param pOperationCode
     *            the operation code
     * @param pXLDFDomainObject
     *            the xLDF domain object
     */
    public PersonValidationDTO(final String pOperationCode, final XLDFDomainObject pXLDFDomainObject,
            final XLDFHouseholdDataDTO pXLDFHouseholdDataDTO) {
        this.operationCode = pOperationCode;
        this.xldfDomainObject = pXLDFDomainObject;
        this.xldfHouseholdDataDTO = pXLDFHouseholdDataDTO;
    }

    /**
     * Gets the operation code.
     * 
     * @return the operation code
     */
    public String getOperationCode() {
        return operationCode;
    }

    /**
     * Sets the operation code.
     * 
     * @param operationCode
     *            the new operation code
     */
    public void setOperationCode(final String operationCode) {
        this.operationCode = operationCode;
    }

    /**
     * Gets the xldf domain object.
     * 
     * @return the xldf domain object
     */
    public XLDFDomainObject getXldfDomainObject() {
        return xldfDomainObject;
    }

    /**
     * Sets the xldf domain object.
     * 
     * @param xldfDomainObject
     *            the new xldf domain object
     */
    public void setXldfDomainObject(final XLDFDomainObject xldfDomainObject) {
        this.xldfDomainObject = xldfDomainObject;
    }

    /**
     * Gets the xldf household data dto.
     * 
     * @return the xldf household data dto
     */
    public XLDFHouseholdDataDTO getXldfHouseholdDataDTO() {
        return xldfHouseholdDataDTO;
    }

    /**
     * Sets the xldf household data dto.
     * 
     * @param xldfHouseholdDataDTO
     *            the new xldf household data dto
     */
    public void setXldfHouseholdDataDTO(final XLDFHouseholdDataDTO xldfHouseholdDataDTO) {
        this.xldfHouseholdDataDTO = xldfHouseholdDataDTO;
    }
}
