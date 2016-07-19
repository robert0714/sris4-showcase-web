package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl03540ResultDTO", propOrder = { "village", "neighbor", "streetDoorplate", "sampleStreetDoorplate",
        "registerYyymmdd", "registerKind", "registerBatch", "liveNumber", "householdHeadId", "householdId",
        "householdHeadName", "note" })
@XmlRootElement(name = "Rl03540ResultDTO")
public class Rl03540ResultDTO implements Serializable {

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
    @XmlElement(name = "StreetDoorplate")
    @FieldName("門牌")
    private String streetDoorplate;

    @XmlElement(name = "sampleStreetDoorplate")
    @FieldName("簡易門牌")
    private String sampleStreetDoorplate;

    /** 編釘日期 */
    @XmlElement(name = "RegisterYyymmdd")
    @FieldName("編釘日期")
    private String registerYyymmdd;

    /** 編釘類別 */
    @XmlElement(name = "RegisterKind")
    @FieldName("編釘類別")
    private String registerKind;

    /** 編釘批號 */
    @XmlElement(name = "RegisterBatch")
    @FieldName("編釘批號")
    private String registerBatch;

    /** 現住口數 */
    @XmlElement(name = "LiveNumber")
    @FieldName("現住口數")
    private String liveNumber;

    /** 戶長統編 */
    @XmlElement(name = "HouseholdHeadId")
    @FieldName("戶長統編")
    private String householdHeadId;

    /** 戶號 */
    @XmlElement(name = "HouseholdId")
    @FieldName("戶號")
    private String householdId;

    /** 戶長姓名 */
    @XmlElement(name = "HouseholdHeadName")
    @FieldName("戶長姓名")
    private String householdHeadName;

    /** 備註 */
    @XmlElement(name = "Note")
    @FieldName("備註")
    private String note;

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

    public String getRegisterBatch() {
        return registerBatch;
    }

    public void setRegisterBatch(String registerBatch) {
        this.registerBatch = registerBatch;
    }

    public String getLiveNumber() {
        return liveNumber;
    }

    public void setLiveNumber(String liveNumber) {
        this.liveNumber = liveNumber;
    }

    public String getHouseholdHeadId() {
        return householdHeadId;
    }

    public void setHouseholdHeadId(String householdHeadId) {
        this.householdHeadId = householdHeadId;
    }

    public String getHouseholdId() {
        return householdId;
    }

    public void setHouseholdId(String householdId) {
        this.householdId = householdId;
    }

    public String getHouseholdHeadName() {
        return householdHeadName;
    }

    public void setHouseholdHeadName(String householdHeadName) {
        this.householdHeadName = householdHeadName;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getSampleStreetDoorplate() {
        return sampleStreetDoorplate;
    }

    public void setSampleStreetDoorplate(String sampleStreetDoorplate) {
        this.sampleStreetDoorplate = sampleStreetDoorplate;
    }

}
