package tw.gov.moi.rl.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.rl.common.constant.RlConstant;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rrGetPersonIdDTO", propOrder = { "personId", "siteId" })
@XmlRootElement(name = "RrGetPersonIdDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RrGetPersonIdDTO {

    @XmlElement(name = "PersonId", required = false)
    private String personId;

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

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

}
