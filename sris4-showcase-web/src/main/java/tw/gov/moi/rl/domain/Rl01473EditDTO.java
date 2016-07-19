package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldf050mType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01473EditDTO", propOrder = { "type", "name" })
@XmlRootElement(name = "Rl01473EditDTO")
public class Rl01473EditDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;    

    @XmlElement(name = "type")
    @FieldName("特殊註記")
    private Rldf050mType type;

    @XmlElement(name = "name")
    @FieldName("姓名")
    private String name;

    public Rl01473EditDTO(Rldf050mType type, String name) {
        super();
        this.type = type;
        this.name = name;
    }

    public Rldf050mType getType() {
        return type;
    }

    public void setType(Rldf050mType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
