package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldf008mType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl03310Result", propOrder = { "personName", "rldf008mType" })
@XmlRootElement(name = "Rl03310Result")
public class Rl03310Result implements Serializable {

    private static final long serialVersionUID = 1L;
    
    /** 姓名 **/
    @XmlElement(name = "personName")
    @FieldName("姓名")
    private String personName;

    /** 特殊註記資料 **/
    @XmlElement(name = "rldf008mType")
    @FieldName("特殊註記")
    private Rldf008mType rldf008mType;

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public Rldf008mType getRldf008mType() {
        return rldf008mType;
    }

    public void setRldf008mType(Rldf008mType rldf008mType) {
        this.rldf008mType = rldf008mType;
    }

}
