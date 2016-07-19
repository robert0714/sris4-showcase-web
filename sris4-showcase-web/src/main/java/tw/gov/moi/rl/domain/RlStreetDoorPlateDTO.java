package tw.gov.moi.rl.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlStreetDoorPlateDTO", propOrder = { "Street", "Section", "Lane", "Alley", "Area", "AreaSite",
        "DoorNo" })
@XmlRootElement(name = "rlStreetDoorPlateDTO")
public class RlStreetDoorPlateDTO {

    /** 街路 */
    @XmlElement(name = "Street")
    @FieldName("街路")
    private String street = "";

    /** 段 */
    @XmlElement(name = "Section")
    @FieldName("段")
    private String section = "";

    /** 巷 */
    @XmlElement(name = "Lane")
    @FieldName("巷")
    private String Lane = "";

    /** 弄衖衕 */
    @XmlElement(name = "Alley")
    @FieldName("弄衖衕")
    private String alley = "";

    /** 地名 */
    @XmlElement(name = "Area")
    @FieldName("地名")
    private String area = "";

    /** 地名放置位置 */
    @XmlElement(name = "AreaSite")
    @FieldName("地名放置位置")
    private String areaSite = "";

    /** 門牌號 */
    @XmlElement(name = "DoorNo")
    @FieldName("門牌號")
    private String doorNo = "";

    @XmlElement(name = "floorNo")
    @FieldName("樓號")
    private String floorNo = "";

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

    public String getLane() {
        return Lane;
    }

    public void setLane(String lane) {
        Lane = lane;
    }

    public String getAlley() {
        return alley;
    }

    public void setAlley(String alley) {
        this.alley = alley;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAreaSite() {
        return areaSite;
    }

    public void setAreaSite(String areaSite) {
        this.areaSite = areaSite;
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

    @Override
    public String toString() {
        return "RlStreetDoorPlateDTO [street=" + street + ", section=" + section + ", Lane=" + Lane + ", alley="
                + alley + ", area=" + area + ", areaSite=" + areaSite + ", doorNo=" + doorNo + "]";
    }

}
