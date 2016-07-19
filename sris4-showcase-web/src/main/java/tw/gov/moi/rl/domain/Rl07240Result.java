package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl07240Result", propOrder = { "correctYear", "personId", "personName", "siteId", "householdHeadId",
        "householdId", "verifyResult" })
@XmlRootElement(name = "Rl07240Result")
public class Rl07240Result implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /** 校正年份 */
    @XmlElement(name = "CorrectYear")
    @FieldName("校正年份")
    private String correctYear;

    /** 統號 */
    @XmlElement(name = "PersonId")
    @FieldName("統號")
    private String personId;

    /** 姓名 */
    @XmlElement(name = "PersonName")
    @FieldName("姓名")
    private String personName;

    /** 作業點代碼 */
    @XmlElement(name = "SiteId")
    @FieldName("戶號")
    private String siteId;

    /** 戶長統號 */
    @XmlElement(name = "HouseholdHeadId")
    @FieldName("戶長統號")
    private String householdHeadId;

    /** 戶號 */
    @XmlElement(name = "HouseholdId")
    @FieldName("戶號")
    private String householdId;

    /** 訊息 */
    @XmlElement(name = "VerifyResult")
    @FieldName("訊息")
    private String verifyResult;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getCorrectYear() {
        return correctYear;
    }

    public void setCorrectYear(String correctYear) {
        this.correctYear = correctYear;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getVerifyResult() {
        return verifyResult;
    }

    public void setVerifyResult(String verifyResult) {
        this.verifyResult = verifyResult;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((personId == null) ? 0 : personId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Rl07240Result other = (Rl07240Result) obj;
        if (personId == null) {
            if (other.personId != null)
                return false;
        } else if (!personId.equals(other.personId))
            return false;
        return true;
    }

    public String getHouseholdHeadId() {
        return householdHeadId;
    }

    public void setHouseholdHeadId(String householdHeadId) {
        this.householdHeadId = householdHeadId;
    }

    public String getHouseholdId() {
        return householdId;
    }

    public void setHouseholdId(String householdId) {
        this.householdId = householdId;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }
}
