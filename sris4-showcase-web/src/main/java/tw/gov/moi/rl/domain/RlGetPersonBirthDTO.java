package tw.gov.moi.rl.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.rl.common.constant.RlConstant;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlGetPersonBirthDTO", propOrder = { "personName", "birthStartDate", "birthEndDate", "siteId" })
@XmlRootElement(name = "RlGetPersonBirthDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RlGetPersonBirthDTO implements java.io.Serializable{

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

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

}
