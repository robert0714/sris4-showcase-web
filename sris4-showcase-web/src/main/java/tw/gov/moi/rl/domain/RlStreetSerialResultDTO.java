package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * 門牌歷史紀錄
 * 
 * @author Andy
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RlStreet19MResult", propOrder = { "Village", "Neighbor", "Doorplate", "ModifyDate", "Leavel" })
@XmlRootElement(name = "rlStreet19MResult")
public class RlStreetSerialResultDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 村里 */
    @XmlElement(name = "Village")
    @FieldName("村里")
    private String village;

    /** 鄰 */
    @XmlElement(name = "Neighbor")
    @FieldName("鄰")
    private String neighbor;

    /** 門牌 */
    @XmlElement(name = "Doorplate")
    @FieldName("門牌")
    private String doorplate;

    /** 編釘日期 */
    @XmlElement(name = "ModifyDate")
    @FieldName("編釘日期")
    private String modifyDate;

    /** 異動類別 */
    @XmlElement(name = "ModifyKind")
    @FieldName("異動類別")
    private String modifyKind;

    /** 異動類別名稱 */
    @XmlElement(name = "ModifyKindName")
    @FieldName("異動類別名稱")
    private String modifyKindName;

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getNeighbor() {
        return neighbor;
    }

    public void setNeighbor(String neighbor) {
        this.neighbor = neighbor;
    }

    public String getDoorplate() {
        return doorplate;
    }

    public void setDoorplate(String doorplate) {
        this.doorplate = doorplate;
    }

    public String getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getModifyKind() {
        return modifyKind;
    }

    public void setModifyKind(String modifyKind) {
        this.modifyKind = modifyKind;
    }

    public String getModifyKindName() {
        return modifyKindName;
    }

    public void setModifyKindName(String modifyKindName) {
        this.modifyKindName = modifyKindName;
    }

    @Override
    public String toString() {
        return "RlStreetSerialResultDTO [village=" + village + ", neighbor=" + neighbor + ", doorplate=" + doorplate
                + ", modifyDate=" + modifyDate + ", modifyKind=" + modifyKind + ", modifyKindName=" + modifyKindName
                + "]";
    }

}
