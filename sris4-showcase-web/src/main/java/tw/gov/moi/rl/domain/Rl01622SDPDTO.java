package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

//StreetDoorPlate(SDP)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01622SDPDTO", propOrder = { "dataIndex", "streetDoorPlate", "street", "section", "area", "lane",
        "alley", "alley1", "alley2", "doorNo", "floorNo", "regStatus", "regMark", "regKind", "areaSite" })
@XmlRootElement(name = "Rl01622SDPDTO")
public class Rl01622SDPDTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -7038089115048809900L;

    /** 展開門牌 */
    @XmlElement(name = "StreetDoorPlate", required = false)
    @FieldName("展開門牌")
    private String streetDoorPlate;

    /** 街路 */
    @XmlElement(name = "Street", required = false)
    @FieldName("街路")
    private String street;

    /** 段 */
    @XmlElement(name = "Section", required = false)
    @FieldName("段")
    private String section;

    /** 地名 */
    @XmlElement(name = "Area", required = false)
    @FieldName("地名")
    private String area;

    /** 巷 */
    @XmlElement(name = "Lane", required = false)
    @FieldName("巷")
    private String lane;

    /** 弄 */
    @XmlElement(name = "Alley", required = false)
    @FieldName("弄")
    private String alley;

    /** 衖 */
    @XmlElement(name = "Alley1", required = false)
    @FieldName("衖")
    private String alley1;

    /** 衕 */
    @XmlElement(name = "Alley2", required = false)
    @FieldName("衕")
    private String alley2;

    /** 門牌號 */
    @XmlElement(name = "DoorNo", required = false)
    @FieldName("門牌號")
    private String doorNo;

    /** 樓 */
    @XmlElement(name = "FloorNo", required = false)
    @FieldName("樓")
    private String floorNo;

    /** 是否登錄 */
    @XmlElement(name = "RegStatus", required = false)
    @FieldName("是否登錄")
    private boolean regStatus;

    /** 編釘類別 */
    @XmlElement(name = "RegKind", required = false)
    @FieldName("編釘類別")
    private String regKind;

    /** 地名擺放位置 */
    @XmlElement(name = "AreaSite")
    @FieldName("地名擺放位置")
    private String areaSite;

    @XmlElement(name = "AreaSite")
    @FieldName("地名擺放位置")
    private Rl01622EDPDTO rl01622EDPDTO = null;

    public Rl01622EDPDTO getRl01622EDPDTO() {
        return rl01622EDPDTO;
    }

    public void setRl01622EDPDTO(Rl01622EDPDTO rl01622edpdto) {
        rl01622EDPDTO = rl01622edpdto;
    }

    public String getStreetDoorPlate() {
        return streetDoorPlate;
    }

    public void setStreetDoorPlate(String streetDoorPlate) {
        this.streetDoorPlate = streetDoorPlate;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getLane() {
        return lane;
    }

    public void setLane(String lane) {
        this.lane = lane;
    }

    public String getAlley() {
        return alley;
    }

    public void setAlley(String alley) {
        this.alley = alley;
    }

    public String getAlley1() {
        return alley1;
    }

    public void setAlley1(String alley1) {
        this.alley1 = alley1;
    }

    public String getAlley2() {
        return alley2;
    }

    public void setAlley2(String alley2) {
        this.alley2 = alley2;
    }

    public String getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }

    public String getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(String floorNo) {
        this.floorNo = floorNo;
    }

    public boolean isRegStatus() {
        return regStatus;
    }

    public void setRegStatus(boolean regStatus) {
        this.regStatus = regStatus;
    }

    public String getRegKind() {
        return regKind;
    }

    public void setRegKind(String regKind) {
        this.regKind = regKind;
    }

    /**
     * @return the areaSite
     */
    public String getAreaSite() {
        return areaSite;
    }

    /**
     * @param areaSite
     *            the areaSite to set
     */
    public void setAreaSite(String areaSite) {
        this.areaSite = areaSite;
    }

}
