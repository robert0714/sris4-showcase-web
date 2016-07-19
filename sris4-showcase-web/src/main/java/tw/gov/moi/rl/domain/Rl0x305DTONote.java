package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * 個人記事
 * 
 * @author Andy
 * 
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0x305DTONote", propOrder = { "PersonId", "PersonName", "Content", "Remark" })
@XmlRootElement(name = "Rl0x305DTONote")
public class Rl0x305DTONote implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @XmlElement(name = "PersonId")
    @FieldName("統號")
    private String personId = "";

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
        return "Rl0x305DTONote [personId=" + personId + ", personName=" + personName + ", content=" + content + ", remark=" + remark + "]";
    }

}
