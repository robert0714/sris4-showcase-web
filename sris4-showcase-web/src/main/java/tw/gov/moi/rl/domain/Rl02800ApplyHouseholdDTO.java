package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.CompareToBuilder;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldf006yType;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;

/**
 * 英文戶籍謄本申請人資料
 * 
 * @author Administrator
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl02800ApplyHouseholdDTO", propOrder = { "selected", "printSequence", "personData", "personNotes", "relationCode", "selectAllNote", "rldf006y"
})
@XmlRootElement(name = "Rl02800ApplyHouseholdDTO")
public class Rl02800ApplyHouseholdDTO implements Serializable, Comparable<Rl02800ApplyHouseholdDTO> {

    private static final long serialVersionUID = 1L;

    /**
     * 是否選擇 <BR>
     * Default: 是.
     */
    @XmlElement(name = "Selected")
    @FieldName("是否選擇 ")
    private boolean selected = true;

    /** 列印順序. */
    @XmlElement(name = "PrintSequence")
    @FieldName("列印順序")
    private Integer printSequence;

    /** 個人基本資料. */
    @XmlElement(name = "PersonData")
    @FieldName("個人基本資料")
    private XLDFPersonDataDomainObject personData;

    /** 個人記事資料. */
    @XmlElement(name = "PersonNotes")
    @FieldName("個人記事資料")
    private List<Rl02800NoteDTO> personNotes = new ArrayList<Rl02800NoteDTO>();

    /** 稱謂代碼. */
    @XmlElement(name = "RelationCode")
    @FieldName("稱謂代碼")
    private String relationCode;

    /** 是否選擇全部記事 */
    @XmlElement(name = "SelectAllNote")
    @FieldName("是否選擇全部記事")
    private boolean selectAllNote = true;

    /**
     * 個人英文資料
     */
    @XmlElement(name = "Rldf006y")
    @FieldName("個人英文資料")
    private Rldf006yType rldf006y = new Rldf006yType();

    public boolean isSelectAllNote() {
        return selectAllNote;
    }

    public void setSelectAllNote(boolean selectAllNote) {
        this.selectAllNote = selectAllNote;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public Integer getPrintSequence() {
        return printSequence;
    }

    public void setPrintSequence(Integer printSequence) {
        this.printSequence = printSequence;
    }

    public XLDFPersonDataDomainObject getPersonData() {
        return personData;
    }

    public void setPersonData(XLDFPersonDataDomainObject personData) {
        this.personData = personData;
    }

    public List<Rl02800NoteDTO> getPersonNotes() {
        return personNotes;
    }

    public void setPersonNotes(List<Rl02800NoteDTO> personNotes) {
        this.personNotes = personNotes;
    }

    public String getRelationCode() {
        return relationCode;
    }

    public void setRelationCode(String relationCode) {
        this.relationCode = relationCode;
    }

    public Rldf006yType getRldf006y() {
        return rldf006y;
    }

    public void setRldf006y(Rldf006yType rldf006y) {
        this.rldf006y = rldf006y;
    }

    @Override
    public String toString() {
        return "Rl02800ApplyHouseholdDTO [selected=" + selected + ", printSequence=" + printSequence + ", personData=" + personData + ", personNotes=" + personNotes + ", relationCode=" + relationCode + ", selectAllNote=" + selectAllNote + ", rldf006y=" + rldf006y + "]";
    }

    @Override
    public int compareTo(Rl02800ApplyHouseholdDTO obj) {
        String relationCode1 = StringUtils.defaultIfBlank(getRelationCode(), String.valueOf(Short.MAX_VALUE));
        String relationCode2 = StringUtils.defaultIfBlank(obj.getRelationCode(), String.valueOf(Short.MAX_VALUE));
        return new CompareToBuilder().append(relationCode1, relationCode2)
        		.append(getPersonData().getBirthYyymmdd(), obj.getPersonData().getBirthYyymmdd())
        		.append(getPersonData().getPersonId(), obj.getPersonData().getPersonId()).toComparison();
    }

}
