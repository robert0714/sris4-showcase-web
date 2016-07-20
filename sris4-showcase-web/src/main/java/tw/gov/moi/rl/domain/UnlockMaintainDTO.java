/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rs.domain.RsLockInforDTO;

/**
 * The Class UnlockMaintainDTO.
 * 
 * @author Jay Kan
 */
public class UnlockMaintainDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -6364674177049188114L;

    @FieldName("外縣市統號")
    private String  remotePersonId ; 
    
    @FieldName("外縣市作業點")
    private String  remoteSiteId;
    
    /** 交易日期. */
    @FieldName("交易日期")
    private String txnDate;

    /** 統號. */
    @FieldName("登入人員姓名")
    private String actionUser;
    
    @FieldName("外縣市戶籍資料他所辦理情形")
    private RsLockInforDTO lockStatus;
    /**
     * Gets the txn date.
     * 
     * @return the txn date
     */
    public String getTxnDate() {
        return txnDate;
    }

    public String getRemotePersonId() {
        return remotePersonId;
    }

    public void setRemotePersonId(String remotePersonId) {
        this.remotePersonId = remotePersonId;
    }

    public String getRemoteSiteId() {
        return remoteSiteId;
    }

    public void setRemoteSiteId(String remoteSiteId) {
        this.remoteSiteId = remoteSiteId;
    }

    public RsLockInforDTO getLockStatus() {
        return lockStatus;
    }

    public void setLockStatus(RsLockInforDTO lockStatus) {
        this.lockStatus = lockStatus;
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
