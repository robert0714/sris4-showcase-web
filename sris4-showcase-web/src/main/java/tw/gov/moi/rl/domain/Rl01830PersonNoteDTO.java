package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang.builder.CompareToBuilder;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.domain.xldf.XLDFPersonNoteDomainObject;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01830PersonNoteDTO", propOrder = { "PersonId", "PersonName", "Remark", "ClassType", "RegisterCode",
        "RegisterContent", "Note", "Selected"

})
@XmlRootElement(name = "Rl01830PersonNoteDTO")
public class Rl01830PersonNoteDTO implements Serializable, Comparable<Rl01830PersonNoteDTO> {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    /**
     * 統號
     */
    @XmlElement(name = "PersonId", required = true)
    @FieldName("統號")
    private String personId;
    /**
     * 姓名
     */
    @XmlElement(name = "PersonName", required = true)
    @FieldName("姓名")
    private String personName;
    /**
     * 備註
     */
    @XmlElement(name = "Remark", required = true)
    @FieldName("備註")
    private String remark;
    /**
     * 記事類型
     */
    @XmlElement(name = "ClassType", required = true)
    @FieldName("記事類型")
    private String classType;
    /**
     * 記事代碼
     */
    @XmlElement(name = "RegisterCode", required = true)
    @FieldName("記事代碼")
    private String registerCode;
    /**
     * 記事內容
     */
    @XmlElement(name = "RegisterContent", required = true)
    @FieldName("記事內容")
    private String registerContent;

    @XmlElement(name = "Note", required = true)
    @FieldName("記事")
    private XLDFPersonNoteDomainObject note;

    /**
     * 是否保留
     */
    @XmlElement(name = "selected", required = true)
    @FieldName("是否保留")
    private boolean isSelected = true;

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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public String getRegisterCode() {
        return registerCode;
    }

    public void setRegisterCode(String registerCode) {
        this.registerCode = registerCode;
    }

    public String getRegisterContent() {
        return registerContent;
    }

    public void setRegisterContent(String registerContent) {
        this.registerContent = registerContent;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean isSelected) {
        this.isSelected = isSelected;
    }

    public XLDFPersonNoteDomainObject getNote() {
        return note;
    }

    public void setNote(XLDFPersonNoteDomainObject note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Rl01830PersonNoteDTO [personId=" + personId + ", personName=" + personName + ", remark=" + remark
                + ", classType=" + classType + ", registerCode=" + registerCode + ", registerContent="
                + registerContent + "]";
    }

    @Override
    public int compareTo(Rl01830PersonNoteDTO param) {
        return new CompareToBuilder().append(this.getRemark(), param.getRemark())
                .append(this.getClassType(), param.getClassType()).toComparison()
                * -1;
    }

}
