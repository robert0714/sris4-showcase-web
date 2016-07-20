package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.rl.common.constant.RlConstant;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlGetHouseholdEndueDTO", propOrder = { "householdId", "householdIdEndueMark", "siteId" })
@XmlRootElement(name = "RlGetHouseholdEndueDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RlGetHouseholdEndueDTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @XmlElement(name = "HouseholdId", required = false)
    private String householdId;

    @XmlElement(name = "HouseholdIdEndueMark", required = false)
    private String householdIdEndueMark;

    @XmlElement(name = "SiteId", required = false)
    private String siteId;

    public String getHouseholdId() {
        return householdId;
    }

    public void setHouseholdId(String householdId) {
        this.householdId = householdId;
    }

    public String getHouseholdIdEndueMark() {
        return householdIdEndueMark;
    }

    public void setHouseholdIdEndueMark(String householdIdEndueMark) {
        this.householdIdEndueMark = householdIdEndueMark;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

}
