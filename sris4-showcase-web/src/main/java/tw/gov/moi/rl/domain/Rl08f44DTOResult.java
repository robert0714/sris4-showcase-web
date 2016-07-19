package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rlde806wType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08f44DTOResult", propOrder = { "VoteCode", "VoteDate", "PersonId", "Rlde806wType", "SaveLists" })
@XmlRootElement(name = "Rl08f44DTOResult")
public class Rl08f44DTOResult implements Serializable {

    @XmlElement(name = "Rlde806wType", required = true)
    @FieldName("候選人")
    private Rlde806wType rlde806wType = new Rlde806wType();

    @XmlElement(name = "AddReprint", required = true)
    @FieldName("新增後請重印 ")
    private String addReprint;

    @XmlElement(name = "Mask", required = true)
    @FieldName("備註")
    private String mask;

    @XmlElement(name = "ChangeSource", required = true)
    @FieldName("異動原因")
    private String changeSource;

    public Rlde806wType getRlde806wType() {
        return rlde806wType;
    }

    public void setRlde806wType(Rlde806wType rlde806wType) {
        this.rlde806wType = rlde806wType;
    }

    public String getAddReprint() {
        return addReprint;
    }

    public void setAddReprint(String addReprint) {
        this.addReprint = addReprint;
    }

    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }

    public String getChangeSource() {
        return changeSource;
    }

    public void setChangeSource(String changeSource) {
        this.changeSource = changeSource;
    }

}
