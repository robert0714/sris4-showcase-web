package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.domain.xldf.XLDFPersonNoteDomainObject;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01330MoveOutNoteDTO", propOrder = { "Note", "Selected" })
@XmlRootElement(name = "Rl01330MoveOutNoteDTO")
public class Rl01330MoveOutNoteDTO implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 個人記事
     */
    @XmlElement(name = "Note", required = true)
    @FieldName("個人記事")
    private XLDFPersonNoteDomainObject note;;
    /**
     * 是否保留
     */
    @XmlElement(name = "Selected", required = true)
    @FieldName("是否保留")
    private Boolean selected = new Boolean(true);

    public Boolean getSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {

        this.selected = selected;

    }

    public XLDFPersonNoteDomainObject getNote() {
        return note;
    }

    public void setNote(XLDFPersonNoteDomainObject note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Rl01330MoveOutNoteDTO [note=" + note + ", selected=" + selected + "]";
    }

}
