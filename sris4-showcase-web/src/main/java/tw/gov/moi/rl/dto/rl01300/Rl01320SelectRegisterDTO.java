package tw.gov.moi.rl.dto.rl01300;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.domain.xldf.XLDFPersonNoteDomainObject;

/**
 * Rl01320SelectRegisterDTO
 * 
 * @author Stanley.Li
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01320SelectRegisterDTO", propOrder = { "selectRegister", "note" })
@XmlRootElement(name = "Rl01320SelectRegisterDTO")
public class Rl01320SelectRegisterDTO implements Serializable {

    /** Serial Id. */
    private static final long serialVersionUID = 1L;

    @XmlElement(name = "SelectRegister")
    @FieldName("選擇")
    private boolean selectRegister;

    @XmlElement(name = "Note")
    @FieldName("個人記事資料")
    private XLDFPersonNoteDomainObject note;

    public boolean isSelectRegister() {
        return selectRegister;
    }

    public void setSelectRegister(boolean selectRegister) {
        this.selectRegister = selectRegister;
    }

    public XLDFPersonNoteDomainObject getNote() {
        return note;
    }

    public void setNote(XLDFPersonNoteDomainObject note) {
        this.note = note;
    }

}
