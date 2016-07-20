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
import tw.gov.moi.domain.Rlde212wType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01h22DTO", propOrder = { "streetDoorplateC", "streetDoorplateE1", "streetDoorplateE2",
        "modifyRlde212wType", "deleteRlde212wType", "listRlde212wType" })
@XmlRootElement(name = "Rl01h22DTO")
public class Rl01h22DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 街路門牌中文名稱 */
    @XmlElement(name = "streetDoorplateC")
    @FieldName("街路門牌中文名稱")
    private String streetDoorplateC = "";

    /** 街路門牌英文名稱_漢語 */
    @XmlElement(name = "streetDoorplateE1")
    @FieldName("街路門牌英文名稱_漢語")
    private String streetDoorplateE1 = "";

    /** 街路門牌英文名稱_通用 */
    @XmlElement(name = "streetDoorplateE2")
    @FieldName("街路門牌英文名稱_通用")
    private String streetDoorplateE2 = "";

    /** 要被修改的 */
    @XmlElement(name = "modifyRlde212wType")
    @FieldName("修改旗標")
    private Rlde212wType modifyRlde212wType = new Rlde212wType();

    /** 要被刪除的 */
    @XmlElement(name = "deleteRlde212wType")
    @FieldName("刪除旗標")
    private Rlde212wType deleteRlde212wType = new Rlde212wType();

    /** 資料顯示 */
    @XmlElement(name = "listRlde212wType")
    @FieldName("資料顯示旗標")
    private List<Rlde212wType> listRlde212wType = new ArrayList<Rlde212wType>(0);

    public String getStreetDoorplateC() {
        return streetDoorplateC;
    }

    public void setStreetDoorplateC(String streetDoorplateC) {
        this.streetDoorplateC = streetDoorplateC;
    }

    public String getStreetDoorplateE1() {
        return streetDoorplateE1;
    }

    public void setStreetDoorplateE1(String streetDoorplateE1) {
        this.streetDoorplateE1 = streetDoorplateE1;
    }

    public String getStreetDoorplateE2() {
        return streetDoorplateE2;
    }

    public void setStreetDoorplateE2(String streetDoorplateE2) {
        this.streetDoorplateE2 = streetDoorplateE2;
    }

    public List<Rlde212wType> getListRlde212wType() {
        return listRlde212wType;
    }

    public void setListRlde212wType(List<Rlde212wType> listRlde212wType) {
        this.listRlde212wType = listRlde212wType;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public Rlde212wType getModifyRlde212wType() {
        return modifyRlde212wType;
    }

    public Rlde212wType getDeleteRlde212wType() {
        return deleteRlde212wType;
    }

    public void setDeleteRlde212wType(Rlde212wType deleteRlde212wType) {
        this.deleteRlde212wType = deleteRlde212wType;
    }

    public void setModifyRlde212wType(Rlde212wType modifyRlde212wType) {
        this.modifyRlde212wType = modifyRlde212wType;
    }

}
