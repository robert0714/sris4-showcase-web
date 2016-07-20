package tw.gov.moi.rl.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rs.domain.RsLockInforDTO;
 
/**
 * The Class RlResponseRetrieveRLDFTableDataBySQLsDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlResponseRetrieveRLDFTableDataBySQLsDTO", propOrder = { "responses" })
@XmlRootElement(name = "RlResponseRetrieveRLDFTableDataBySQLs", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RlResponseRetrieveRLDFTableDataBySQLsDTO implements java.io.Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;
    
    /** The responses. */
    @FieldName("全部回應")
    @XmlElement(name = "Responses", required = true)
    private RlResponseRetrieveRLDFTableDataBySQLDTO[] responses;

    /**
     * Gets the responses.
     *
     * @return the responses
     */
    public RlResponseRetrieveRLDFTableDataBySQLDTO[] getResponses() {
        return this.responses;
    }

    /**
     * Sets the responses.
     *
     * @param responses the new responses
     */
    public void setResponses(RlResponseRetrieveRLDFTableDataBySQLDTO[] responses) {
        if (responses != null) {
            final RlResponseRetrieveRLDFTableDataBySQLDTO[] dest = new RlResponseRetrieveRLDFTableDataBySQLDTO[responses.length];
            System.arraycopy(responses, 0, dest, 0, responses.length);
            this.responses = dest;
        } else {
            this.responses = null;
        }
    }

}
