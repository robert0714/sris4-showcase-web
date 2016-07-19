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
 * The Class RlGetMultiDataRequestDto.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlGetMultiDataRequestDto", propOrder = { "transactionId", "requests", "additionalLocks" })
@XmlRootElement(name = "RlGetMultiDataRequestDto", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RlGetMultiDataRequestDto implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1318961071129869863L;

    /** The transaction id. */
    @FieldName("交易代號")
    @XmlElement(name = "TransactionId", required = true)
    private String transactionId = "";

    /** The requests. */
    @FieldName("全部要求")
    @XmlElement(name = "Requests", required = true)
    private RlGetSingleDataRequestDto[] requests;

    /** The additional locks. */
    @FieldName("額外的lock")
    @XmlElement(name = "AdditionalLocks", required = true)
    private RlLockSingleDataRequestDto[] additionalLocks;

    /**
     * Gets the requests.
     *
     * @return the requests
     */
    public RlGetSingleDataRequestDto[] getRequests() {
        return this.requests;
    }

    /**
     * Sets the requests.
     *
     * @param requests the new requests
     */
    public void setRequests(RlGetSingleDataRequestDto[] requests) {
        if (requests != null) {
            this.requests = requests.clone();
        } else {
            this.requests = null;
        }
    }

    /**
     * Gets the additional locks.
     *
     * @return the additional locks
     */
    public RlLockSingleDataRequestDto[] getAdditionalLocks() {
        return this.additionalLocks;
    }

    /**
     * Sets the additional locks.
     *
     * @param additionalLocks the new additional locks
     */
    public void setAdditionalLocks(final RlLockSingleDataRequestDto[] additionalLocks) {
        if (additionalLocks != null) {
            this.additionalLocks = additionalLocks.clone();
        } else {
            this.additionalLocks = null;
        }
    }

    /**
     * Gets the transaction id.
     *
     * @return the transaction id
     */
    public String getTransactionId() {
        return this.transactionId;
    }

    /**
     * Sets the transaction id.
     *
     * @param transactionId the new transaction id
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
}
