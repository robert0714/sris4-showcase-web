package tw.gov.moi.rl.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.rl.common.constant.RlConstant;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlGetApplyDTO", propOrder = { "personId", "siteId", "dataSiteId", "applyTransationId",
        "applySequenceId", "applyType" })
@XmlRootElement(name = "RlGetApplyDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RlGetApplyDTO implements java.io.Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @XmlElement(name = "PersonId", required = false)
    private String personId;

    @XmlElement(name = "SiteId", required = false)
    private String siteId;

    @XmlElement(name = "DataSiteId", required = false)
    private String dataSiteId;

    @XmlElement(name = "ApplyTransationId", required = false)
    private String applyTransationId;

    @XmlElement(name = "ApplySequenceId", required = false)
    private String applySequenceId;

    @XmlElement(name = "ApplyType", required = false)
    private String applyType;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getDataSiteId() {
        return dataSiteId;
    }

    public void setDataSiteId(String dataSiteId) {
        this.dataSiteId = dataSiteId;
    }

    public String getApplyTransationId() {
        return applyTransationId;
    }

    public void setApplyTransationId(String applyTransationId) {
        this.applyTransationId = applyTransationId;
    }

    public String getApplySequenceId() {
        return applySequenceId;
    }

    public void setApplySequenceId(String applySequenceId) {
        this.applySequenceId = applySequenceId;
    }

    public String getApplyType() {
        return applyType;
    }

    public void setApplyType(String applyType) {
        this.applyType = applyType;
    }

}
