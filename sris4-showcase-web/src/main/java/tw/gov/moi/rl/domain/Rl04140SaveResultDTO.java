package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

import tw.gov.moi.ae.checker.annotation.FieldName;

public class Rl04140SaveResultDTO implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /** 街路 */
    @XmlElement(name = "Street")
    @FieldName("街路")
    private String street;

    /** 段 */
    @XmlElement(name = "Section")
    @FieldName("段")
    private String section;

    /** 地名 */
    @XmlElement(name = "Area")
    @FieldName("地名")
    private String area;

    /** 巷 */
    @XmlElement(name = "Lane")
    @FieldName("巷")
    private String lane;

    /** 弄 */
    @XmlElement(name = "Alley")
    @FieldName("弄")
    private String alley;

    /** 門牌號 */
    @XmlElement(name = "DoorNo")
    @FieldName("門牌號")
    private String doorNo;

    /** 樓 */
    @XmlElement(name = "FloorNo")
    @FieldName("樓")
    private String floorNo;

    @XmlElement(name = "Village")
    @FieldName("村里")
    private String village;

    @XmlElement(name = "Neighbor")
    @FieldName("鄰")
    private String neighbor;

    @XmlElement(name = "StreetDoorPlate")
    @FieldName("街路")
    private String streetDoorPlate;

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

    public String getStreetDoorPlate() {
        return streetDoorPlate;
    }

    public void setStreetDoorPlate(String streetDoorPlate) {
        this.streetDoorPlate = streetDoorPlate;
    }

}
