package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl01625OldAddressDTO", propOrder = { "personName", "personId", "houseHoldId", "houseType",
        "regContent" })
@XmlRootElement(name = "Rl01625OldAddressDTO")
public class Rl01625HouseHoldDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 戶長姓名 */
    @XmlElement(name = "personName")
    @FieldName("戶長姓名")
    private String personName = "";

    /** 戶長統號 */
    @XmlElement(name = "personId")
    @FieldName("戶長統號")
    private String personId = "";

    /** 戶號 */
    @XmlElement(name = "houseHoldId")
    @FieldName("戶號")
    private String houseHoldId = "";

    /** 戶別 */
    @XmlElement(name = "houseType")
    @FieldName("戶別")
    private String houseType = "";

    /** 記事內容 */
    @XmlElement(name = "regContent")
    @FieldName("記事內容")
    private String regContent = "";

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getHouseHoldId() {
        return houseHoldId;
    }

    public void setHouseHoldId(String houseHoldId) {
        this.houseHoldId = houseHoldId;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public String getRegContent() {
        return regContent;
    }

    public void setRegContent(String regContent) {
        this.regContent = regContent;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

}
