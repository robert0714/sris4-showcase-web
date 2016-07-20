package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0251zChangeDateDTO", propOrder = { "personId", "applyYyymmdd", "earlyupdateDate" })
@XmlRootElement(name = "Rl0251zChangeDateDTO")
public class Rl0251zChangeDateDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /**
     * 統號
     */
    @XmlElement(name = "PersonId")
    @FieldName("統號")
    private String personId;

    // 請領日期
    @XmlElement(name = "ApplyYyymmdd")
    @FieldName("請領日期")
    private String applyYyymmdd;

    // 請領日期
    @XmlElement(name = "EarlyupdateDate")
    @FieldName("最早異動日期")
    private String earlyupdateDate;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getApplyYyymmdd() {
        return applyYyymmdd;
    }

    public void setApplyYyymmdd(String applyYyymmdd) {
        this.applyYyymmdd = applyYyymmdd;
    }

    public String getEarlyupdateDate() {
        return earlyupdateDate;
    }

    public void setEarlyupdateDate(String earlyupdateDate) {
        this.earlyupdateDate = earlyupdateDate;
    }

}
