package tw.gov.moi.rl.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.rl.common.constant.RlConstant;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlGetEntityUtityDTO", propOrder = { "dsName", "queryParameter", "destSiteId" })
@XmlRootElement(name = "RlGetEntityUtityDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RlGetEntityUtityDTO implements java.io.Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @XmlElement(name = "DsName", required = false)
    private String dsName;

    @XmlElement(name = "QueryParameter", required = false)
    private List<String> queryParameter;

    @XmlElement(name = "DestSiteId", required = false)
    private String destSiteId;

    public String getDsName() {
        return dsName;
    }

    public void setDsName(String dsName) {
        this.dsName = dsName;
    }

    public List<String> getQueryParameter() {
        return queryParameter;
    }

    public void setQueryParameter(List<String> queryParameter) {
        this.queryParameter = queryParameter;
    }

    public String getDestSiteId() {
        return destSiteId;
    }

    public void setDestSiteId(String destSiteId) {
        this.destSiteId = destSiteId;
    }

}
