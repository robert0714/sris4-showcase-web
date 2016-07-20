package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

import tw.gov.moi.ae.checker.annotation.FieldName;

public class FeeRegistrarDTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 5896984733088428530L;

    /** 收費戶籍員帳號 */
    @XmlElement(name = "registrarId")
    @FieldName("收費戶籍員帳號")
    private String registrarId;

    /** 收費戶籍員姓名 */
    @XmlElement(name = "registrarName")
    @FieldName("收費戶籍員姓名")
    private String registrarName;

    public FeeRegistrarDTO() {
        super();
    }

    public FeeRegistrarDTO(String id, String name) {
        super();
        this.setRegistrarId(id);
        this.setRegistrarName(name);
    }

    public String getRegistrarId() {
        return registrarId;
    }

    public void setRegistrarId(String registrarId) {
        this.registrarId = registrarId;
    }

    public String getRegistrarName() {
        return registrarName;
    }

    public void setRegistrarName(String registrarName) {
        this.registrarName = registrarName;
    }

}
