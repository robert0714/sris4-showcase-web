package tw.gov.moi.rl.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.rl.common.constant.RlConstant;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlGetRemoveYearDTO", propOrder = { "householeId", "removeYear", "siteId" })
@XmlRootElement(name = "RlGetRemoveYearDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RlGetRemoveYearDTO implements java.io.Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @XmlElement(name = "HouseholeId", required = false)
    private String householeId;

    @XmlElement(name = "RemoveYear", required = false)
    private String removeYear;

    @XmlElement(name = "SiteId", required = false)
    private String siteId;

    public String getHouseholeId() {
        return householeId;
    }

    public void setHouseholeId(String householeId) {
        this.householeId = householeId;
    }

    public String getRemoveYear() {
        return removeYear;
    }

    public void setRemoveYear(String removeYear) {
        this.removeYear = removeYear;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

}
