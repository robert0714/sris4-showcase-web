package tw.gov.moi.rl.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.rl.common.constant.RlConstant;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlGetHouseholdIdDTO", propOrder = { "householdHeadId", "householdId", "siteId" })
@XmlRootElement(name = "RlGetHouseholdIdDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RlGetHouseholdIdDTO implements java.io.Serializable{

    private static final long serialVersionUID = 1L;

    @XmlElement(name = "HouseholdHeadId", required = false)
    private String householdHeadId;

    @XmlElement(name = "HouseholdId", required = false)
    private String householdId;

    @XmlElement(name = "SiteId", required = false)
    private String siteId;

    public String getHouseholdHeadId() {
        return householdHeadId;
    }

    public void setHouseholdHeadId(String householdHeadId) {
        this.householdHeadId = householdHeadId;
    }

    public String getHouseholdId() {
        return householdId;
    }

    public void setHouseholdId(String householdId) {
        this.householdId = householdId;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

}
