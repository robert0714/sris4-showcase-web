package tw.gov.moi.rl.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.common.constant.RlConstant;
 
/**
 * The Class RlRequestRetrieveTableDataBySQLsDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlRequestRetrieveTableDataBySQLsDTO", propOrder = { "requests" })
@XmlRootElement(name = "RlRequestRetrieveTableDataBySQLs", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RlRequestRetrieveTableDataBySQLsDTO implements java.io.Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 2583014215288836358L;
    
    /** The requests. */
    @FieldName("全部要求")
    @XmlElement(name = "Requests", required = true)
    private RlRequestRetrieveTableDataBySQLDTO[] requests;

    /**
     * Gets the requests.
     *
     * @return the requests
     */
    public RlRequestRetrieveTableDataBySQLDTO[] getRequests() {
        return this.requests;
    }

    /**
     * Sets the requests.
     *
     * @param requests the new requests
     */
    public void setRequests(RlRequestRetrieveTableDataBySQLDTO[] requests) {
        if (requests != null) {
            this.requests = requests.clone();
        } else {
            this.requests = null;
        }
    }

}
