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
@XmlType(name = "rl03550DTORecord", propOrder = { "village", "neighbor", "streetDoorplate", "registerYyymmdd",
        "modifyKind" })
@XmlRootElement(name = "Rl03550DTORecord")
public class Rl03550DTORecord implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    private Rldf019mType rldf019m = null;

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

    /** 標準門牌 */
    @XmlElement(name = "SampleStreetDoorplate")
    @FieldName("標準門牌")
    private String sampleStreetDoorplate;

    /** 年別 */
    @XmlElement(name = "YearKind")
    @FieldName("年別")
    private String yearKind;

    /** 編釘日期 */
    @XmlElement(name = "RegisterYyymmdd")
    @FieldName("編釘日期")
    private String registerYyymmdd;

    /** 編釘類別 */
    @XmlElement(name = "RegisterKind")
    @FieldName("編釘類別")
    private String registerKind;

    /** 編釘類別名稱 */
    @XmlElement(name = "RegisterKindName")
    @FieldName("編釘類別名稱")
    private String registerKindName;

    /** 異動類別 */
    @XmlElement(name = "ModifyKind")
    @FieldName("異動類別")
    private String modifyKind;

    /** 門牌種類 */
    @XmlElement(name = "FileKind")
    @FieldName("門牌種類")
    private String fileKind;

    public String getModifyKind() {
        return modifyKind;
    }

    public void setModifyKind(String modifyKind) {
        this.modifyKind = modifyKind;
    }

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

    public String getSampleStreetDoorplate() {
        return sampleStreetDoorplate;
    }

    public void setSampleStreetDoorplate(String sampleStreetDoorplate) {
        this.sampleStreetDoorplate = sampleStreetDoorplate;
    }

    public String getYearKind() {
        return yearKind;
    }

    public void setYearKind(String yearKind) {
        this.yearKind = yearKind;
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

    public String getFileKind() {
        return fileKind;
    }

    public void setFileKind(String fileKind) {
        this.fileKind = fileKind;
    }

    public Rldf019mType getRldf019m() {
        return rldf019m;
    }

    public void setRldf019m(Rldf019mType rldf019m) {
        this.rldf019m = rldf019m;
    }

}
