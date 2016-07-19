package tw.gov.moi.rl.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.rl.common.constant.RlConstant;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlGetPersonDataDTO", propOrder = { "personId", "householdHeadId", "siteId", "householdId" })
@XmlRootElement(name = "RlGetPersonDataDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RlGetPersonDataDTO implements java.io.Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @XmlElement(name = "PersonId", required = false)
    private String personId;

    @XmlElement(name = "HouseholdHeadId", required = false)
    private String householdHeadId;

    @XmlElement(name = "SiteId", required = false)
    private String siteId;

    @XmlElement(name = "householdId", required = false)
    private String householdId;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

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

    public String getHouseholdId() {
        return householdId;
    }

    public void setHouseholdId(String householdId) {
        this.householdId = householdId;
    }

}
