package tw.gov.moi.rl.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl04240DataDTO", propOrder = { "Action", "Obj" })
@XmlRootElement(name = "Rl04240DataDTO")
public class Rl04240DataDTO {

    @XmlElement(name = "Action")
    @FieldName("異動行為")
    private String action = "";

    @XmlElement(name = "Obj")
    @FieldName("資料")
    private Object obj;

    public Rl04240DataDTO(String action, Object obj) {
        super();
        this.action = action;
        this.obj = obj;
    }

    public String getAction() {
        return action;
    }

    public Object getObj() {
        return obj;
    }

}
