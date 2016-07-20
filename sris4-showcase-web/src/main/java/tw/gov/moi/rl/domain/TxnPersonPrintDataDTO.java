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
 * The Class TxnPersonPrintDataDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "txnPersonPrintDataDTO", propOrder = { "householdTransactionDTO", "enforced" ,"queryDTO" })
@XmlRootElement(name = "TxnPersonPrintDataDTO")
public class TxnPersonPrintDataDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 7074469621713725209L;

    /** 戶籍交易DTO. */
    @XmlElement(name = "HouseholdTransactionDTO")
    @FieldName("戶籍交易DTO")
    private HouseholdTransactionDTO householdTransactionDTO;

    /** 是否為逕為登記. */
    @XmlElement(name = "Enforced")
    @FieldName("是否為逕為登記")
    private boolean enforced;

    /** 查詢條件 DTO. */
    @XmlElement(name = "QueryDTO")
    @FieldName("戶籍大簿當初查詢的相關資料")
    private HouseholdQueryDTO queryDTO = new HouseholdQueryDTO();
    /**
     * Instantiates a new txn person print data dto.
     * 
     * @param householdTransactionDTO
     *            the household transaction dto
     * @param enforced
     *            the enforced
     */
    public TxnPersonPrintDataDTO(final HouseholdTransactionDTO householdTransactionDTO, final boolean enforced) {
        super();
        this.householdTransactionDTO = householdTransactionDTO;
        this.enforced = enforced;
    }

    /**
     * Gets the household transaction dto.
     * 
     * @return the household transaction dto
     */
    public HouseholdTransactionDTO getHouseholdTransactionDTO() {
        return householdTransactionDTO;
    }

    /**
     * Sets the household transaction dto.
     * 
     * @param householdTransactionDTO
     *            the new household transaction dto
     */
    public void setHouseholdTransactionDTO(final HouseholdTransactionDTO householdTransactionDTO) {
        this.householdTransactionDTO = householdTransactionDTO;
    }

    /**
     * Checks if is enforced.
     * 
     * @return true, if is enforced
     */
    public boolean isEnforced() {
        return enforced;
    }

    /**
     * Sets the enforced.
     * 
     * @param enforced
     *            the new enforced
     */
    public void setEnforced(final boolean enforced) {
        this.enforced = enforced;
    }

    public HouseholdQueryDTO getQueryDTO() {
        return queryDTO;
    }

    public void setQueryDTO(HouseholdQueryDTO queryDTO) {
        this.queryDTO = queryDTO;
    }
    
}
