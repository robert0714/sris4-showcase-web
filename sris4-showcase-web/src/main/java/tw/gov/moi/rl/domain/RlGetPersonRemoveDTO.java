package tw.gov.moi.rl.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.rl.common.constant.RlConstant;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlGetPersonRemoveDTO", propOrder = { "personId", "removeYyymmdd", "removeTime", "siteId" })
@XmlRootElement(name = "RlGetPersonRemoveDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RlGetPersonRemoveDTO implements java.io.Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @XmlElement(name = "PersonId", required = false)
    private String personId;

    @XmlElement(name = "RemoveYyymmdd", required = false)
    private String removeYyymmdd;

    @XmlElement(name = "RemoveTime", required = false)
    private String removeTime;

    @XmlElement(name = "SiteId", required = false)
    private String siteId;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getSiteId() {
        return siteId;
    }

    public String getRemoveYyymmdd() {
        return removeYyymmdd;
    }

    public void setRemoveYyymmdd(String removeYyymmdd) {
        this.removeYyymmdd = removeYyymmdd;
    }

    public String getRemoveTime() {
        return removeTime;
    }

    public void setRemoveTime(String removeTime) {
        this.removeTime = removeTime;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

}
