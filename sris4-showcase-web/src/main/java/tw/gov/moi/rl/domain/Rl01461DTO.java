package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01461DTO", propOrder = { "selectedArray", "confirmMessage", "number", "personId", "beginYyymmdd",
        "rl01461List", "rl01461EditList" })
@XmlRootElement(name = "Rl01461DTO")
public class Rl01461DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 勾選Array[] */
    @XmlElement(name = "SelectedArray")
    @FieldName("勾選Array[]")
    private Rl01461QueryDTO[] selectedArray;

    /** 通報詢問訊息 */
    @XmlElement(name = "ConfirmMessage", required = true)
    @FieldName("通報詢問訊息")
    private String confirmMessage;

    /** 序號 */
    @XmlElement(name = "Number")
    @FieldName("序號")
    private String number;

    /** 統一編號 */
    @XmlElement(name = "PersonId")
    @FieldName("統一編號")
    private String personId;

    /** 發生日期 */
    @XmlElement(name = "BeginYyymmdd")
    @FieldName("發生日期")
    private String beginYyymmdd;

    /** 新增資料List */
    @XmlElement(name = "Rl01461List")
    @FieldName("新增資料List")
    private List<Rl01461QueryDTO> rl01461List;

    /** 編輯資料List */
    @XmlElement(name = "Rl01461EditList")
    @FieldName("編輯資料List")
    private List<Rl01461DTO> rl01461EditList;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getBeginYyymmdd() {
        return beginYyymmdd;
    }

    public void setBeginYyymmdd(String beginYyymmdd) {
        this.beginYyymmdd = beginYyymmdd;
    }

    public Rl01461QueryDTO[] getSelectedArray() {
        return selectedArray;
    }

    public void setSelectedArray(Rl01461QueryDTO[] selectedArray) {
        this.selectedArray = selectedArray;
    }

    public String getConfirmMessage() {
        return confirmMessage;
    }

    public void setConfirmMessage(String confirmMessage) {
        this.confirmMessage = confirmMessage;
    }

    public List<Rl01461QueryDTO> getRl01461List() {
        return rl01461List;
    }

    public void setRl01461List(List<Rl01461QueryDTO> rl01461List) {
        this.rl01461List = rl01461List;
    }

    public List<Rl01461DTO> getRl01461EditList() {
        return rl01461EditList;
    }

    public void setRl01461EditList(List<Rl01461DTO> rl01461EditList) {
        this.rl01461EditList = rl01461EditList;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

}
