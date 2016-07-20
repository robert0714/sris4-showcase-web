package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl06c00IdQtyDTO", propOrder = { "idType", "gender", "idQty" })
@XmlRootElement(name = "Rl06c00IdQtyDTO")
public class Rl06c00IdQtyDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @XmlElement(name = "IdType")
    @FieldName("配賦身分代碼")
    private String idType = "";

    @XmlElement(name = "Gender")
    @FieldName("性別")
    private String gender = "";

    @XmlElement(name = "IdQty")
    @FieldName("未配賦筆數")
    private int idQty = 0;

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public int getIdQty() {
        return idQty;
    }

    public void setIdQty(int idQty) {
        this.idQty = idQty;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Rl06c00IdQtyDTO [idType=" + idType + ", gender=" + gender + ", idQty=" + idQty + "]";
    }
}
