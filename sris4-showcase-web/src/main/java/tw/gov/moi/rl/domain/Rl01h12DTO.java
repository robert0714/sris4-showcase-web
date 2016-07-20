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
import tw.gov.moi.domain.Rlde211wType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01h12DTO", propOrder = { "villageC", "villageE1", "villageE2", "modifyRlde211wType",
        "deleteRlde211wType", "listRlde211wType" })
@XmlRootElement(name = "Rl01h12DTO")
public class Rl01h12DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 村里中文名稱 */
    @XmlElement(name = "villageC")
    @FieldName("村里中文名稱")
    private String villageC = "";

    /** 村里英文名稱_漢語 */
    @XmlElement(name = "villageE1")
    @FieldName("村里英文名稱_漢語")
    private String villageE1 = "";

    /** 村里英文名稱_通用 */
    @XmlElement(name = "villageE2")
    @FieldName("村里英文名稱_通用")
    private String villageE2 = "";

    /** 要被修改的 */
    @XmlElement(name = "modifyRlde211wType")
    @FieldName("修改旗標")
    private Rlde211wType modifyRlde211wType = new Rlde211wType();

    /** 要被刪除的 */
    @XmlElement(name = "deleteRlde211wType")
    @FieldName("刪除旗標")
    private Rlde211wType deleteRlde211wType = new Rlde211wType();

    /** 資料顯示 */
    @XmlElement(name = "listRlde211wType")
    @FieldName("資料顯示旗標")
    private List<Rlde211wType> listRlde211wType = new ArrayList<Rlde211wType>(0);

    public String getVillageC() {
        return villageC;
    }

    public void setVillageC(String villageC) {
        this.villageC = villageC;
    }

    public String getVillageE1() {
        return villageE1;
    }

    public void setVillageE1(String villageE1) {
        this.villageE1 = villageE1;
    }

    public String getVillageE2() {
        return villageE2;
    }

    public void setVillageE2(String villageE2) {
        this.villageE2 = villageE2;
    }

    public List<Rlde211wType> getListRlde211wType() {
        return listRlde211wType;
    }

    public void setListRlde211wType(List<Rlde211wType> listRlde211wType) {
        this.listRlde211wType = listRlde211wType;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public Rlde211wType getModifyRlde211wType() {
        return modifyRlde211wType;
    }

    public Rlde211wType getDeleteRlde211wType() {
        return deleteRlde211wType;
    }

    public void setDeleteRlde211wType(Rlde211wType deleteRlde211wType) {
        this.deleteRlde211wType = deleteRlde211wType;
    }

    public void setModifyRlde211wType(Rlde211wType modifyRlde211wType) {
        this.modifyRlde211wType = modifyRlde211wType;
    }

}
