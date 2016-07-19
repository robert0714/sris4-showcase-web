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
 * The Class RlMultiLockResponseDto.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlMultiLockResponseDto", propOrder = { "transactionId", "actionIp", "actionSiteId", "actionUser", "responses" })
@XmlRootElement(name = "RlMultiLockResponseDto", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RlMultiLockResponseDto implements Serializable {
    
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

    /** The responses. */
    @FieldName("全部回應")
    @XmlElement(name = "Responses", required = true)
    private RlSingleLockResponseDto[] responses;

    /**
     * Gets the responses.
     *
     * @return the responses
     */
    public RlSingleLockResponseDto[] getResponses() {
        return this.responses;
    }

    /**
     * Sets the responses.
     *
     * @param responses the new responses
     */
    public void setResponses(RlSingleLockResponseDto[] responses) {
        if (responses != null) {
            final RlSingleLockResponseDto[] dest = new RlSingleLockResponseDto[responses.length];
            System.arraycopy(responses, 0, dest, 0, responses.length);
            this.responses = dest;
        } else {
            this.responses = null;
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

    /**
     * Gets the action site id.
     *
     * @return the action site id
     */
    public String getActionSiteId() {
        return this.actionSiteId;
    }

    /**
     * Sets the action site id.
     *
     * @param actionSiteId the new action site id
     */
    public void setActionSiteId(String actionSiteId) {
        this.actionSiteId = actionSiteId;
    }

    /**
     * Gets the action user.
     *
     * @return the action user
     */
    public String getActionUser() {
        return this.actionUser;
    }

    /**
     * Sets the action user.
     *
     * @param actionUser the new action user
     */
    public void setActionUser(String actionUser) {
        this.actionUser = actionUser;
    }

}
