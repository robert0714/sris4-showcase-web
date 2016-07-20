package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldf019mType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl03551DTO", propOrder = { "village", "neighbor", "streetDoorplate", "yearKind", "registerYyymmdd",
        "registerKind", "registerKindName", "modifyKind", "fileKind", "oldVillage", "oldNeighbor",
        "oldStreetDoorplate", "newold", "sampleStreetDoorplate", "state" })
@XmlRootElement(name = "Rl03551DTO")
public class Rl03551DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 村里 */
    @FieldName("村里")
    @XmlElement(name = "Village")
    private String village;

    /** 鄰 */
    @FieldName("鄰")
    @XmlElement(name = "neighbor")
    private String neighbor;

    /** 門牌 */
    @FieldName("門牌")
    @XmlElement(name = "StreetDoorplate")
    private String streetDoorplate;

    /** 年別 */
    @FieldName("年別 ")
    @XmlElement(name = "YearKind")
    private String yearKind;

    /** 編釘日期 */
    @FieldName("編釘日期")
    @XmlElement(name = "RegisterYyymmdd")
    private String registerYyymmdd;

    /** 編釘類別 */
    @FieldName("編釘類別")
    @XmlElement(name = "RegisterKind")
    private String registerKind;

    /** 編釘類別名稱 */
    @FieldName("編釘類別名稱")
    @XmlElement(name = "RegisterKindName")
    private String registerKindName;

    /** 異動類別 */
    @FieldName("異動類別")
    @XmlElement(name = "ModifyKind")
    private String modifyKind;

    /** 門牌種類 */
    @FieldName("門牌種類")
    @XmlElement(name = "FileKind")
    private String fileKind;

    /** 異動前村里 */
    @FieldName("異動前村里")
    @XmlElement(name = "OldVillage")
    private String oldVillage;

    /** 異動前鄰 */
    @FieldName("異動前鄰")
    @XmlElement(name = "OldNeighbor")
    private String oldNeighbor;

    /** 異動前門牌 */
    @FieldName("異動前門牌")
    @XmlElement(name = "OldStreetDoorplate")
    private String oldStreetDoorplate;

    /** 門牌新舊註記 */
    @FieldName("門牌新舊註記")
    @XmlElement(name = "Newold")
    private String newold;

    @FieldName("sampleStreetDoorplate")
    @XmlElement(name = "SampleStreetDoorplate")
    private String sampleStreetDoorplate;

    @FieldName("資料新舊狀態")
    @XmlElement(name = "state")
    private String state = "";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    private Rldf019mType rldf019mType = null;

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

    public String getStreetDoorplate() {
        return streetDoorplate;
    }

    public void setStreetDoorplate(String streetDoorplate) {
        this.streetDoorplate = streetDoorplate;
    }

    public String getYearKind() {
        return yearKind;
    }

    public void setYearKind(String yearKind) {
        this.yearKind = yearKind;
    }

    public String getRegisterYyymmdd() {
        return registerYyymmdd;
    }

    public void setRegisterYyymmdd(String registerYyymmdd) {
        this.registerYyymmdd = registerYyymmdd;
    }

    public String getRegisterKind() {
        return registerKind;
    }

    public void setRegisterKind(String registerKind) {
        this.registerKind = registerKind;
    }

    public String getRegisterKindName() {
        return registerKindName;
    }

    public void setRegisterKindName(String registerKindName) {
        this.registerKindName = registerKindName;
    }

    public String getModifyKind() {
        return modifyKind;
    }

    public void setModifyKind(String modifyKind) {
        this.modifyKind = modifyKind;
    }

    public String getFileKind() {
        return fileKind;
    }

    public void setFileKind(String fileKind) {
        this.fileKind = fileKind;
    }

    public String getOldVillage() {
        return oldVillage;
    }

    public void setOldVillage(String oldVillage) {
        this.oldVillage = oldVillage;
    }

    public String getOldNeighbor() {
        return oldNeighbor;
    }

    public void setOldNeighbor(String oldNeighbor) {
        this.oldNeighbor = oldNeighbor;
    }

    public String getOldStreetDoorplate() {
        return oldStreetDoorplate;
    }

    public void setOldStreetDoorplate(String oldStreetDoorplate) {
        this.oldStreetDoorplate = oldStreetDoorplate;
    }

    public String getNewold() {
        return newold;
    }

    public void setNewold(String newold) {
        this.newold = newold;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public String getSampleStreetDoorplate() {
        return sampleStreetDoorplate;
    }

    public void setSampleStreetDoorplate(String sampleStreetDoorplate) {
        this.sampleStreetDoorplate = sampleStreetDoorplate;
    }

    public Rldf019mType getRldf019mType() {
        return rldf019mType;
    }

    public void setRldf019mType(Rldf019mType rldf019mType) {
        this.rldf019mType = rldf019mType;
    }

}
