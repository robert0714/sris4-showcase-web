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
 * The Class RlMultiLockRequestDto.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlMultiLockRequestDto", propOrder = { "transactionId", "actionIp", "actionSiteId", "actionUser",
        "tokenLockPool", "requests" })
@XmlRootElement(name = "RlMultiLockRequestDto", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RlMultiLockRequestDto implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1318961071129863863L;

    /** The transaction id. */
    @FieldName("交易代號")
    @XmlElement(name = "TransactionId", required = true)
    private String transactionId;

    /**  the action ip. */
    @FieldName("the action ip")
    @XmlElement(name = "ActionIp")
    private String actionIp;

    /**  the action site id *. */
    @FieldName("the action Site Id")
    @XmlElement(name = "ActionSiteId")
    private String actionSiteId;

    /**  the action user. */
    @FieldName("the action user")
    @XmlElement(name = "ActionUser")
    private String actionUser;

    /** The token lock pool. */
    @FieldName("the token lock pool")
    @XmlElement(name = "TokenLockPool")
    private String[] tokenLockPool;

    /** The requests. */
    @FieldName("全部要求")
    @XmlElement(name = "Requests", required = true)
    private RlSingleLockRequestDto[] requests;

    /**
     * Gets the requests.
     *
     * @return the requests
     */
    public RlSingleLockRequestDto[] getRequests() {
        return this.requests;
    }

    /**
     * Sets the requests.
     *
     * @param requests the new requests
     */
    public void setRequests(final RlSingleLockRequestDto[] requests) {
        if (requests != null) {
            this.requests = requests.clone();
        } else {
            this.requests = null;
        }
    }

    /**
     * Gets the transaction id.
     *
     * @return the transaction id
     */
    public String getTransactionId() {
        return  this.transactionId;
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
     * Gets the action ip.
     *
     * @return the action ip
     */
    public String getActionIp() {
        return  this.actionIp;
    }

    /**
     * Sets the action ip.
     *
     * @param actionIp the new action ip
     */
    public void setActionIp(String actionIp) {
        this.actionIp = actionIp;
    }

    /**
     * Gets the action user.
     *
     * @return the action user
     */
    public String getActionUser() {
        return  this.actionUser;
    }

    /**
     * Sets the action user.
     *
     * @param actionUser the new action user
     */
    public void setActionUser(String actionUser) {
        this.actionUser = actionUser;
    }

    /**
     * Gets the token lock pool.
     *
     * @return the token lock pool
     */
    public String[] getTokenLockPool() {
        return  this.tokenLockPool;
    }

    /**
     * Sets the token lock pool.
     *
     * @param tokenLockPool the new token lock pool
     */
    public void setTokenLockPool(String[] tokenLockPool) {
        if (tokenLockPool != null) {
            final String[] dest = new String[tokenLockPool.length];
            System.arraycopy(tokenLockPool, 0, dest, 0, tokenLockPool.length);
            this.tokenLockPool = dest;
        } else {
            this.tokenLockPool = null;
        }
    }

    /**
     * Gets the action site id.
     *
     * @return the action site id
     */
    public String getActionSiteId() {
        return  this.actionSiteId;
    }

    /**
     * Sets the action site id.
     *
     * @param actionSiteId the new action site id
     */
    public void setActionSiteId(String actionSiteId) {
        this.actionSiteId = actionSiteId;
    }

}
