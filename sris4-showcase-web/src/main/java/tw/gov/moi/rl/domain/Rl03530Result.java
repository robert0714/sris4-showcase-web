package tw.gov.moi.rl.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl03530Result", propOrder = { "newVillage", "newNeighbor", "newDoorplate", "modifyDate", "oldVillage",
        "odlNeighbor", "oldDoorplate", "modifyKind", "modifyKindName", "serialNo", "modifyBatch" })
@XmlRootElement(name = "Rl03530Result")
public class Rl03530Result {

    /** 變更後村里 */
    @XmlElement(name = "NewVillage")
    @FieldName("變更後村里")
    private String newVillage;
    /** 變更後鄰 */
    @XmlElement(name = "NewNeighbor")
    @FieldName("變更後鄰")
    private String newNeighbor;
    /** 變更後門牌 */
    @XmlElement(name = "NewDoorplate")
    @FieldName("變更後門牌")
    private String newDoorplate;
    /** 變更日期 */
    @XmlElement(name = "ModifyDate")
    @FieldName("變更日期")
    private String modifyDate;
    /** 變更前村里 */
    @XmlElement(name = "OldVillage")
    @FieldName("變更前村里")
    private String oldVillage;
    /** 變更前鄰 */
    @XmlElement(name = "OdlNeighbo")
    @FieldName("變更前鄰")
    private String odlNeighbor;
    /** 變更前門牌 */
    @XmlElement(name = "OldDoorplate")
    @FieldName("變更前門牌")
    private String oldDoorplate;
    /** 異動類別 */
    @XmlElement(name = "ModifyKind")
    @FieldName("異動類別")
    private String modifyKind;
    /** 異動類別名稱 */
    @XmlElement(name = "ModifyKindName")
    @FieldName("異動類別名稱")
    private String modifyKindName;
    /** 交易序號 */
    @XmlElement(name = "SerialNo")
    @FieldName("交易序號")
    private String serialNo;
    /** 變更批號 */
    @XmlElement(name = "modifyBatch")
    @FieldName("變更批號")
    private String modifyBatch;

    public String getNewVillage() {
        return newVillage;
    }

    public void setNewVillage(String newVillage) {
        this.newVillage = newVillage;
    }

    public String getNewNeighbor() {
        return newNeighbor;
    }

    public void setNewNeighbor(String newNeighbor) {
        this.newNeighbor = newNeighbor;
    }

    public String getNewDoorplate() {
        return newDoorplate;
    }

    public void setNewDoorplate(String newDoorplate) {
        this.newDoorplate = newDoorplate;
    }

    public String getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getOldVillage() {
        return oldVillage;
    }

    public void setOldVillage(String oldVillage) {
        this.oldVillage = oldVillage;
    }

    public String getOdlNeighbor() {
        return odlNeighbor;
    }

    public void setOdlNeighbor(String odlNeighbor) {
        this.odlNeighbor = odlNeighbor;
    }

    public String getOldDoorplate() {
        return oldDoorplate;
    }

    public void setOldDoorplate(String oldDoorplate) {
        this.oldDoorplate = oldDoorplate;
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

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getModifyBatch() {
        return modifyBatch;
    }

    public void setModifyBatch(String modifyBatch) {
        this.modifyBatch = modifyBatch;
    }

}
