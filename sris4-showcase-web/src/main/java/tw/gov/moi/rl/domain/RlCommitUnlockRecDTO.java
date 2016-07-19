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
import tw.gov.moi.rl.common.constant.RlConstant;
 
/**
 * The Class RlGetPersonIdDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlCommitUnlockRecDTO", propOrder = { "transactionIds", "dataSiteId" })
@XmlRootElement(name = "RlCommitUnlockRecDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RlCommitUnlockRecDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 5822574766445261308L;
    /** The Transaction Ids . */
    @XmlElement(name = "TransactionIds", required = false)
    @FieldName("交易序號")
    private String[] transactionIds;

    /** The data site id. */
    @XmlElement(name = "DataSiteId", required = false)
    @FieldName("資料作業點")
    private String dataSiteId;

    /**
     * Gets the transaction ids.
     *
     * @return the transaction ids
     */
    public String[] getTransactionIds() {
        return this.transactionIds;
    }

    /**
     * Sets the transaction ids.
     *
     * @param transactionIds the new transaction ids
     */
    public void setTransactionIds(String[] transactionIds) {
        if (transactionIds != null) {
            this.transactionIds = transactionIds.clone();
        } else {
            this.transactionIds = null;
        }
    }

    /**
     * Gets the data site id.
     *
     * @return the data site id
     */
    public String getDataSiteId() {
        return this.dataSiteId;
    }

    /**
     * Sets the data site id.
     *
     * @param dataSiteId the new data site id
     */
    public void setDataSiteId(String dataSiteId) {
        this.dataSiteId = dataSiteId;
    }

}
