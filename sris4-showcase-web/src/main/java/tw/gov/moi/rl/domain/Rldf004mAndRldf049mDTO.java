package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldf004mType;
import tw.gov.moi.domain.Rldf049mType;
import tw.gov.moi.rl.common.constant.RlConstant;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rldf004mAndRldf049mDTO", propOrder = { "personId", "siteId", "rldf004mList", "rldf049mList" })
@XmlRootElement(name = "Rldf004mAndRldf049mDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class Rldf004mAndRldf049mDTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @XmlElement(name = "PersonId")
    @FieldName("personId")
    private String personId = "";

    @XmlElement(name = "SiteId")
    @FieldName("siteId")
    private String siteId = "";

    @XmlElement(name = "Rldf004mList")
    @FieldName("rldf004mList")
    private List<Rldf004mType> rldf004mList = new ArrayList<Rldf004mType>();

    @XmlElement(name = "Rldf049mList")
    @FieldName("rldf049mList")
    private List<Rldf049mType> rldf049mList = new ArrayList<Rldf049mType>();

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

    public List<Rldf004mType> getRldf004mList() {
        return rldf004mList;
    }

    public void setRldf004mList(List<Rldf004mType> rldf004mList) {
        this.rldf004mList = rldf004mList;
    }

    public List<Rldf049mType> getRldf049mList() {
        return rldf049mList;
    }

    public void setRldf049mList(List<Rldf049mType> rldf049mList) {
        this.rldf049mList = rldf049mList;
    }

}
