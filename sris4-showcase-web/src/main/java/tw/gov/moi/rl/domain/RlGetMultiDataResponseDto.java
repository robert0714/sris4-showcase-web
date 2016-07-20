package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rs.domain.RsLockInforDTO;

/**
 * The Class RlGetMultiDataResponseDto.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlGetMultiDataResponseDto", propOrder = { "transactionId", "userId", "actionIp", "responses", "additionalLocks",
        "lockByOtherInfos" })
@XmlRootElement(name = "RlGetMultiDataResponseDto", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RlGetMultiDataResponseDto implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -1544557678256765444L;

    /** The transaction id. */
    @FieldName("交易代號")
    @XmlElement(name = "TransactionId", required = true)
    private String transactionId;

    /** The user id. */
    @FieldName("戶籍員代碼")
    @XmlElement(name = "UserId", required = true)
    private String userId;

    /** The action ip. */
    @FieldName("發出Request的ip位址")
    @XmlElement(name = "ActionIp", required = true)
    private String actionIp;

    /** The responses. */
    @FieldName("全部回應")
    @XmlElement(name = "Responses", required = true)
    private RlGetSingleDataResponseDto[] responses;

    /** The additional locks. */
    @FieldName("額外的lock回應")
    @XmlElement(name = "AdditionalLocks", required = true)
    private RlLockSingleDataResponseDto[] additionalLocks;

    /** The lock by other infos. */
    @FieldName("被他人鎖定資訊")
    @XmlElement(name = "LockByOtherInfos", required = true)
    private RsLockInforDTO[] lockByOtherInfos;

    /**
     * Gets the responses.
     *
     * @return the responses
     */
    public RlGetSingleDataResponseDto[] getResponses() {
        return this.responses;
    }

    /**
     * Sets the responses.
     *
     * @param responses the new responses
     */
    public void setResponses(RlGetSingleDataResponseDto[] responses) {
        if (responses != null) {
            this.responses = responses.clone();
        } else {
            this.responses = null;
        }
    }

    /**
     * Gets the additional locks.
     *
     * @return the additional locks
     */
    public RlLockSingleDataResponseDto[] getAdditionalLocks() {
        return this.additionalLocks;
    }

    /**
     * Sets the additional locks.
     *
     * @param additionalLocks the new additional locks
     */
    public void setAdditionalLocks(RlLockSingleDataResponseDto[] additionalLocks) {
        this.additionalLocks = additionalLocks;
    }

    /**
     * Gets the lock by other infos.
     *
     * @return the lock by other infos
     */
    public RsLockInforDTO[] getLockByOtherInfos() {
        return this.lockByOtherInfos;
    }

    /**
     * Sets the lock by other infos.
     *
     * @param lockByOtherInfos the new lock by other infos
     */
    public void setLockByOtherInfos(RsLockInforDTO[] lockByOtherInfos) {
        if (lockByOtherInfos != null) {
            this.lockByOtherInfos = lockByOtherInfos.clone();
        } else {
            this.lockByOtherInfos = null;
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

    /**
     * Gets the user id.
     *
     * @return the user id
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * Sets the user id.
     *
     * @param userId the new user id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * Gets the action ip.
     *
     * @return the action ip
     */
    public String getActionIp() {
        return this.actionIp;
    }

    /**
     * Sets the action ip.
     *
     * @param actionIp the new action ip
     */
    public void setActionIp(String actionIp) {
        this.actionIp = actionIp;
    }

}
