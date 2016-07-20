package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl07420PeopleDTO", propOrder = { "index", "personId", "personName" })
@XmlRootElement(name = "Rl07420PeopleDTO")
public class Rl07420PeopleDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 序號 */
    @XmlElement(name = "index")
    @FieldName("序號")
    private String index = "";

    /** 統號 */
    @XmlElement(name = "personId")
    @FieldName("統號")
    private String personId = "";

    /** 姓名 */
    @XmlElement(name = "personName")
    @FieldName("姓名")
    private String personName;
    
    @XmlElement(name = "transactionId")
    @FieldName("transactionId")
    private String transactionId;
    
    @XmlElement(name = "acceptSiteId")
    @FieldName("acceptSiteId")
    private String acceptSiteId;
    
    @XmlElement(name = "adminOfficeCode")
    @FieldName("adminOfficeCode")
    private String adminOfficeCode;
    
    @XmlElement(name = "areaCode")
    @FieldName("areaCode")
    private String areaCode;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getAcceptSiteId() {
        return acceptSiteId;
    }

    public void setAcceptSiteId(String acceptSiteId) {
        this.acceptSiteId = acceptSiteId;
    }

    public String getAdminOfficeCode() {
        return adminOfficeCode;
    }

    public void setAdminOfficeCode(String adminOfficeCode) {
        this.adminOfficeCode = adminOfficeCode;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

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

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public boolean equals(Object other) {
        Rl07420PeopleDTO rl07420PeopleDTO = (Rl07420PeopleDTO) other;
        if (this.getPersonId().equals(rl07420PeopleDTO.getPersonId())) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.getPersonId().hashCode();
    }

}
