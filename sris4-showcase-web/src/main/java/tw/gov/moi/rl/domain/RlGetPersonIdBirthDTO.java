package tw.gov.moi.rl.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.common.constant.RlConstant;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlGetPersonIdBirthDTO", propOrder = { "personId", "birthStartDate", "birthEndDate", "siteId", "removeStartDate", "removeEndDate" })
@XmlRootElement(name = "RlGetPersonIdBirthDTO", namespace = RlConstant.Namespace_RL_DOMAIN)
public class RlGetPersonIdBirthDTO implements java.io.Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /** 統 號 */
    @XmlElement(name = "PersonId", required = false)
    @FieldName("統 號")
    private String personId = "";

    /** 出生起日 */
    @XmlElement(name = "BirthStartDate", required = false)
    @FieldName("出生起日")
    private String birthStartDate = "";

    /** 出生迄日 */
    @XmlElement(name = "BirthEndDate", required = false)
    @FieldName("出生迄日")
    private String birthEndDate = "";

    /** 作業點代碼 */
    @XmlElement(name = "SiteId", required = false)
    @FieldName("作業點代碼")
    private String siteId = "";

    /** 除戶起日 */
    @XmlElement(name = "RemoveStartDate", required = false)
    @FieldName("除戶起日")
    private String removeStartDate = "";

    /** 除戶迄日 */
    @XmlElement(name = "RemoveEndDate", required = false)
    @FieldName("除戶迄日")
    private String removeEndDate = "";

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
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

}
