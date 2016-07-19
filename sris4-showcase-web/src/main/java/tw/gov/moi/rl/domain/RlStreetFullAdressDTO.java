package tw.gov.moi.rl.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlStreetFullAdressDTO", propOrder = { "Street", "FloorNo", "DoorNo", "Section", "Area", "Lane",
        "Alley" })
@XmlRootElement(name = "RlStreetFullAdressDTO")
public class RlStreetFullAdressDTO {

    @FieldName("街路 ")
    @XmlElement(name = "Street", required = false)
    private String street;

    @FieldName("街路 ")
    @XmlElement(name = "FloorNo", required = false)
    private String floorNo;

    @FieldName("街路 ")
    @XmlElement(name = "DoorNo", required = false)
    private String doorNo;

    @FieldName("段 ")
    @XmlElement(name = "Section", required = false)
    private String section;

    @FieldName("地名")
    @XmlElement(name = "Area", required = false)
    private String area;

    @FieldName("巷 ")
    @XmlElement(name = "Lane", required = false)
    private String lane;

    @FieldName("弄(衖、衕) ")
    @XmlElement(name = "Alley", required = false)
    private String alley;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(String floorNo) {
        this.floorNo = floorNo;
    }

    public String getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
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

    @Override
    public String toString() {
        return "RlStreetFullAdressDTO [street=" + street + ", floorNo=" + floorNo + ", doorNo=" + doorNo + ", section="
                + section + ", area=" + area + ", lane=" + lane + ", alley=" + alley + "]";
    }

}
