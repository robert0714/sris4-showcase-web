/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.component.dto.XLDFTransaction;

/**
 * HouseholdTransactionDTO.
 * 
 * @author Data.Cneng
 */
public class HouseholdTransactionDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -4574644863244553800L;

    /** The xldf transaction. */
    @FieldName("交易資料")
    private XLDFTransaction xldfTransaction;

    /** 全戶基本資料. */
    @FieldName("全戶基本資料")
    private XLDFHouseholdDataDTO txnPersonHousehold;

    /** 戶長姓名. */
    @FieldName("戶長姓名")
    private String transactionPersonHeadName;

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
    public void setXldfTransaction(XLDFTransaction xldfTransaction) {
        this.xldfTransaction = xldfTransaction;
    }

    /**
     * Gets the txn person household.
     * 
     * @return the txn person household
     */
    public XLDFHouseholdDataDTO getTxnPersonHousehold() {
        return txnPersonHousehold;
    }

    /**
     * Sets the txn person household.
     * 
     * @param txnPersonHousehold
     *            the new txn person household
     */
    public void setTxnPersonHousehold(XLDFHouseholdDataDTO txnPersonHousehold) {
        this.txnPersonHousehold = txnPersonHousehold;
    }

    /**
     * Gets the transaction person head name.
     * 
     * @return the transaction person head name
     */
    public String getTransactionPersonHeadName() {
        return transactionPersonHeadName;
    }

    /**
     * Sets the transaction person head name.
     * 
     * @param transactionPersonHeadName
     *            the new transaction person head name
     */
    public void setTransactionPersonHeadName(String transactionPersonHeadName) {
        this.transactionPersonHeadName = transactionPersonHeadName;
    }
}
