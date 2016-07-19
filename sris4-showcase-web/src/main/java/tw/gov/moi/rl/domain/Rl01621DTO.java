package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01621DTO", propOrder = { "EditList", "SaveBtn" })
@XmlRootElement(name = "Rl01621DTO")
public class Rl01621DTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @XmlElement(name = "EditList")
    @FieldName("編輯")
    private List<Rl01621DTOResult> editList;

    @XmlElement(name = "SaveBtn")
    @FieldName("儲存")
    private boolean saveBtn;

    public List<Rl01621DTOResult> getEditList() {
        if (editList == null) {
            editList = new ArrayList<Rl01621DTOResult>();
        }
        return editList;
    }

    public void setEditList(List<Rl01621DTOResult> editList) {
        this.editList = editList;
    }

    public boolean isSaveBtn() {
        return saveBtn;
    }

    public void setSaveBtn(boolean saveBtn) {
        this.saveBtn = saveBtn;
    }

}
