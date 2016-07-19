package tw.gov.moi.rl.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.rl.common.constant.RlConstant;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlGetPersonIdEndueDTO", propOrder = { "personId", "personIdEndueMark", "gender", "idType", "siteId" })
@XmlRootElement(name = "RlGetPersonIdEndueDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RlGetPersonIdEndueDTO implements java.io.Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @XmlElement(name = "PersonId", required = false)
    private String personId;

    @XmlElement(name = "PersonIdEndueMark", required = false)
    private String personIdEndueMark;

    @XmlElement(name = "Gender", required = false)
    private String gender;

    @XmlElement(name = "IdType", required = false)
    private String idType;

    @XmlElement(name = "SiteId", required = false)
    private String siteId;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getPersonIdEndueMark() {
        return personIdEndueMark;
    }

    public void setPersonIdEndueMark(String personIdEndueMark) {
        this.personIdEndueMark = personIdEndueMark;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

}
