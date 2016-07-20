package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl05800PeopleDTO", propOrder = { "personId", "personName", "identity" })
@XmlRootElement(name = "Rl05800PeopleDTO")
public class Rl05800PeopleDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 統一編號 */
    @XmlElement(name = "personId")
    @FieldName("統一編號")
    private String personId;

    /** 姓名 */
    @XmlElement(name = "personName")
    @FieldName("姓名")
    private String personName;

    /** 身分 */
    @XmlElement(name = "identity")
    @FieldName("身分")
    private String identity;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }
}
