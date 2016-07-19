/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * The Class PaginationDTO.
 */
public class PaginationDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 5919755402374620727L;

    /** 第幾筆. */
    @FieldName("第幾筆")
    private int first;

    /** 頁筆數. */
    @FieldName("頁筆數")
    private int pageSize;

    /** 交易日期. */
    @FieldName("交易日期")
    private String txnDate;
    
    /** 登入人員姓名. */
    @FieldName("登入人員姓名")
    private String actionUser;

    /**
     * Instantiates a new pagination dto.
     * 
     * @param pFirst
     *            the first
     * @param pPageSize
     *            the page size
     * @param pTxnDate
     *            the txn date
     */
    public PaginationDTO(final int pFirst, final int pPageSize, final String pTxnDate, final String actionUser) {
        this.first = pFirst;
        this.pageSize = pPageSize;
        this.txnDate = pTxnDate;
        this.actionUser = actionUser;
    }

    /**
     * Gets the first.
     * 
     * @return the first
     */
    public int getFirst() {
        return first;
    }

    /**
     * Sets the first.
     * 
     * @param first
     *            the new first
     */
    public void setFirst(final int first) {
        this.first = first;
    }

    /**
     * Gets the page size.
     * 
     * @return the page size
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * Sets the page size.
     * 
     * @param pageSize
     *            the new page size
     */
    public void setPageSize(final int pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * Gets the txn date.
     * 
     * @return the txn date
     */
    public String getTxnDate() {
        return txnDate;
    }

    /**
     * Sets the txn date.
     * 
     * @param txnDate
     *            the new txn date
     */
    public void setTxnDate(final String txnDate) {
        this.txnDate = txnDate;
    }

	public String getActionUser() {
		return actionUser;
	}

	public void setActionUser(String actionUser) {
		this.actionUser = actionUser;
	}

}
