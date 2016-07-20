package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl06c00QtyDTO", propOrder = { "idType", "maleQty", "femaleQty" })
@XmlRootElement(name = "Rl06c00QtyDTO")
public class Rl06c00QtyDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @XmlElement(name = "IdType")
    @FieldName("配賦身分代碼")
    private String idType = "";

    @XmlElement(name = "MaleQty")
    @FieldName("男性配賦數量")
    private String maleQty = "";

    @XmlElement(name = "FemaleQty")
    @FieldName("女性配賦數量")
    private String femaleQty = "";

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getMaleQty() {
        return maleQty;
    }

    public void setMaleQty(String maleQty) {
        this.maleQty = maleQty;
    }

    public String getFemaleQty() {
        return femaleQty;
    }

    public void setFemaleQty(String femaleQty) {
        this.femaleQty = femaleQty;
    }

}
