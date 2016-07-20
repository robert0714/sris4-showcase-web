package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.common.constant.RlConstant;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rldf004mAndRldf01mQueryDTO", propOrder = { "personId", "siteId" })
@XmlRootElement(name = "Rldf004mAndRldf01mQueryDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class Rldf004mAndRldf01mQueryDTO implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /** 統號. */
    @XmlElement(name = "PersonId")
    @FieldName("統號")
    private String personId = "";

    /** 工作站. */
    @XmlElement(name = "SiteId")
    @FieldName("工作站")
    private String siteId = "";

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
