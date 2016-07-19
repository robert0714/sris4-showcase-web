package tw.gov.moi.rl.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.rl.common.constant.RlConstant;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlGetHousehouldHeadIdDTO", propOrder = { "householdHeadId", "siteId" })
@XmlRootElement(name = "RlGetHousehouldHeadIdDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RlGetHousehouldHeadIdDTO implements java.io.Serializable{


    private static final long serialVersionUID = -6451178251446043445L;

    @XmlElement(name = "HouseholdHeadId", required = false)
    private String householdHeadId;

    @XmlElement(name = "SiteId", required = false)
    private String siteId;

    public String getHouseholdHeadId() {
        return householdHeadId;
    }

    public void setHouseholdHeadId(String householdHeadId) {
        this.householdHeadId = householdHeadId;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

}
