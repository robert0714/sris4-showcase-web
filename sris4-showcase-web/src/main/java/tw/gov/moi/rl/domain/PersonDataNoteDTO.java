/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.Map;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.component.dto.XLDFTransaction;

/**
 * The Class PersonDataNoteDTO.
 */
public class PersonDataNoteDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 7054265180774495196L;

    /** 個人資料. */
    @FieldName("個人資料")
    private Map<String, XLDFPersonDataDTO> personDataMap;

    /** 開啟作業DTO. */
    @FieldName("開啟作業DTO")
    private OpeningOperationDTO openingOperationDTO;

    /** 交易資料. */
    @FieldName("交易資料")
    private XLDFTransaction xldfTransaction;

    /**
     * Instantiates a new person data note dto.
     * 
     * @param pPersonDataMap
     *            the person data map
     * @param pOpeningOperationDTO
     *            the opening operation dto
     */
    public PersonDataNoteDTO(final Map<String, XLDFPersonDataDTO> pPersonDataMap,
            final OpeningOperationDTO pOpeningOperationDTO) {
        this.personDataMap = pPersonDataMap;
        this.openingOperationDTO = pOpeningOperationDTO;
    }

    /**
     * Instantiates a new person data note dto.
     * 
     * @param pPersonDataMap
     *            the person data map
     * @param pOpeningOperationDTO
     *            the opening operation dto
     * @param pXLDFTransaction
     *            the xLDF transaction
     */
    public PersonDataNoteDTO(final Map<String, XLDFPersonDataDTO> pPersonDataMap,
            final OpeningOperationDTO pOpeningOperationDTO, final XLDFTransaction pXLDFTransaction) {
        this.personDataMap = pPersonDataMap;
        this.openingOperationDTO = pOpeningOperationDTO;
        this.xldfTransaction = pXLDFTransaction;
    }

    /**
     * Gets the person data map.
     * 
     * @return the person data map
     */
    public Map<String, XLDFPersonDataDTO> getPersonDataMap() {
        return personDataMap;
    }

    /**
     * Sets the person data map.
     * 
     * @param personDataMap
     *            the person data map
     */
    public void setPersonDataMap(final Map<String, XLDFPersonDataDTO> personDataMap) {
        this.personDataMap = personDataMap;
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
     * Gets the xldf transaction.
     * 
     * @return the xldf transaction
     */
    public XLDFTransaction getXldfTransaction() {
        return xldfTransaction;
    }

    /**
     * Sets the xldf transaction.
     * 
     * @param xldfTransaction
     *            the new xldf transaction
     */
    public void setXldfTransaction(final XLDFTransaction xldfTransaction) {
        this.xldfTransaction = xldfTransaction;
    }
}
