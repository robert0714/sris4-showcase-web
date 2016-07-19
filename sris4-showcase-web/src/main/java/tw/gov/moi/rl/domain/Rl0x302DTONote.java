package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * 除戶基本資料記事
 * 
 * @author Andy
 * 
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0x302DTONote", propOrder = { "PersonId","houseId","PersonName", "Content", "Remark" })
@XmlRootElement(name = "Rl0x302DTONote")
public class Rl0x302DTONote implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @XmlElement(name = "PersonId")
    @FieldName("戶長統號")
    private String personId = "";

    @XmlElement(name = "HouseId")
    @FieldName("戶號")
    private String houseId = "";

    @XmlElement(name = "PersonName")
    @FieldName("姓名")
    private String personName = "";

    @XmlElement(name = "Content")
    @FieldName("內容")
    private String content = "";

    @XmlElement(name = "Remark")
    @FieldName("備註")
    private String remark = "";

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }
    public void setHouseId(String houseId) {
        this.houseId = houseId;
    }
    
    public String getHouseId() {
        return this.houseId;
    }
    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Rl0x302DTONote [personId=" + personId + ", personName=" + personName + ", content=" + content + ", remark=" + remark + "]";
    }

}
