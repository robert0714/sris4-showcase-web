package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldf020mType;

//ExistDoorPlate(EDP)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01622EDPDTO", propOrder = { "dataIndex", "existDoorPlate" })
@XmlRootElement(name = "Rl01622EDPDTO")
public class Rl01622EDPDTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 6122335548761862897L;

    /** 存在門牌 */
    @FieldName("存在門牌 ")
    @XmlElement(name = "ExistDoorPlate", required = false)
    private String existDoorPlate;

    private Rldf020mType type;

    public String getExistDoorPlate() {
        return existDoorPlate;
    }

    public void setExistDoorPlate(String existDoorPlate) {
        this.existDoorPlate = existDoorPlate;
    }

    public Rldf020mType getType() {
        return type;
    }

    public void setType(Rldf020mType type) {
        this.type = type;
    }

}
