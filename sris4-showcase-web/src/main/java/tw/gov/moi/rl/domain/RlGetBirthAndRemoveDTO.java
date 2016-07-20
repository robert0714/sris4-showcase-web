package tw.gov.moi.rl.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.rl.common.constant.RlConstant;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlGetBirthAndRemoveDTO", propOrder = { "personName", "birthStartDate", "birthEndDate",
        "removeStartDate", "removeEndDate", "siteId" })
@XmlRootElement(name = "RlGetBirthAndRemoveDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RlGetBirthAndRemoveDTO implements java.io.Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @XmlElement(name = "PersonName", required = false)
    private String personName;

    @XmlElement(name = "BirthStartDate", required = false)
    private String birthStartDate;

    @XmlElement(name = "BirthEndDate", required = false)
    private String birthEndDate;

    @XmlElement(name = "RemoveStartDate", required = false)
    private String removeStartDate;

    @XmlElement(name = "RemoveEndDate", required = false)
    private String removeEndDate;

    @XmlElement(name = "SiteId", required = false)
    private String siteId;

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getBirthStartDate() {
        return birthStartDate;
    }

    public void setBirthStartDate(String birthStartDate) {
        this.birthStartDate = birthStartDate;
    }

    public String getBirthEndDate() {
        return birthEndDate;
    }

    public void setBirthEndDate(String birthEndDate) {
        this.birthEndDate = birthEndDate;
    }

    public String getRemoveStartDate() {
        return removeStartDate;
    }

    public void setRemoveStartDate(String removeStartDate) {
        this.removeStartDate = removeStartDate;
    }

    public String getRemoveEndDate() {
        return removeEndDate;
    }

    public void setRemoveEndDate(String removeEndDate) {
        this.removeEndDate = removeEndDate;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

}
