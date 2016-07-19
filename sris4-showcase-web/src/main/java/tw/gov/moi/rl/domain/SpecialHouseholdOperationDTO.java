/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.List;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;

/**
 * The Class SpecialHouseholdOperationDTO.
 * 
 * @author Jay Kan
 */
public class SpecialHouseholdOperationDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -2726783299604248073L;

    /** The opening operation dto. */
    @FieldName("開啟作業DTO")
    private OpeningOperationDTO openingOperationDTO;

    /** The special operations. */
    @FieldName("特殊作業清單")
    private List<SpecialHouseholdOperation> specialOperations;

    /** outlive case. */
    @FieldName("如果是現戶是false,如果是除戶則是true")
    private boolean outliveCase = false;

    /**
     * Instantiates a new special household operation dto.
     * 
     * @param pOpeningOperationDTO
     *            the opening operation dto
     * @param pSpecialOperations
     *            the special operations
     * @param pOutliveCase
     *            the outlive case
     */
    public SpecialHouseholdOperationDTO(final OpeningOperationDTO pOpeningOperationDTO,
            final List<SpecialHouseholdOperation> pSpecialOperations, final boolean pOutliveCase) {
        this.openingOperationDTO = pOpeningOperationDTO;
        this.specialOperations = pSpecialOperations;
        this.outliveCase = pOutliveCase;
    }

    /**
     * Gets the opening operation dto.
     * 
     * @return the opening operation dto
     */
    public OpeningOperationDTO getOpeningOperationDTO() {
        return openingOperationDTO;
    }

    /**
     * Sets the opening operation dto.
     * 
     * @param openingOperationDTO
     *            the new opening operation dto
     */
    public void setOpeningOperationDTO(final OpeningOperationDTO openingOperationDTO) {
        this.openingOperationDTO = openingOperationDTO;
    }

    /**
     * Gets the special operations.
     * 
     * @return the special operations
     */
    public List<SpecialHouseholdOperation> getSpecialOperations() {
        return specialOperations;
    }

    /**
     * Sets the special operations.
     * 
     * @param specialOperations
     *            the new special operations
     */
    public void setSpecialOperations(final List<SpecialHouseholdOperation> specialOperations) {
        this.specialOperations = specialOperations;
    }

    /**
     * Checks if is outlive case.
     * 
     * @return true, if is outlive case
     */
    public boolean isOutliveCase() {
        return outliveCase;
    }

    /**
     * Sets the outlive case.
     * 
     * @param outliveCase
     *            the new outlive case
     */
    public void setOutliveCase(final boolean outliveCase) {
        this.outliveCase = outliveCase;
    }
}
