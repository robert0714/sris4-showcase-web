package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * 
 * @author Mego
 * 
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0x323DTOResult", propOrder = { "streetDoorplate", "street", "section", "lane", "alley", "alley1",
        "alley2", "area", "areaSite", "doorNo", "floorNo" })
@XmlRootElement(name = "Rl0x323DTOResult")
public class Rl0x323DTOResult implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 街路門牌 */
    @XmlElement(name = "StreetDoorplate")
    @FieldName("街路門牌")
    private String streetDoorplate;

    /** 街路 */
    @XmlElement(name = "Street")
    @FieldName("街路")
    private String street;

    /** 段 */
    @XmlElement(name = "Section")
    @FieldName("段")
    private String section;

    /** 巷 */
    @XmlElement(name = "Lane")
    @FieldName("巷")
    private String lane;

    /** 弄 */
    @XmlElement(name = "Alley")
    @FieldName("弄")
    private String alley;

    /** 衖 */
    @XmlElement(name = "Alley1")
    @FieldName("衖")
    private String alley1;

    /** 衕 */
    @XmlElement(name = "Alley2")
    @FieldName("衕")
    private String alley2;

    /** 地名 */
    @XmlElement(name = "Area")
    @FieldName("地名")
    private String area;

    /** 地名放置位置 */
    @XmlElement(name = "AreaSite")
    @FieldName("地名放置位置")
    private String areaSite;

    /** 門牌號 */
    @XmlElement(name = "DoorNo")
    @FieldName("門牌號")
    private String doorNo;

    /** 樓層 */
    @XmlElement(name = "FloorNo")
    @FieldName("樓層")
    private String floorNo;

    /**
     * @return the streetDoorplate
     */
    public String getStreetDoorplate() {
        return streetDoorplate;
    }

    /**
     * @param streetDoorplate
     *            the streetDoorplate to set
     */
    public void setStreetDoorplate(String streetDoorplate) {
        this.streetDoorplate = streetDoorplate;
    }

    /**
     * @return the street
     */
    public String getStreet() {
        return street;
    }

    /**
     * @param street
     *            the street to set
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * @return the section
     */
    public String getSection() {
        return section;
    }

    /**
     * @param section
     *            the section to set
     */
    public void setSection(String section) {
        this.section = section;
    }

    /**
     * @return the lane
     */
    public String getLane() {
        return lane;
    }

    /**
     * @param lane
     *            the lane to set
     */
    public void setLane(String lane) {
        this.lane = lane;
    }

    /**
     * @return the alley
     */
    public String getAlley() {
        return alley;
    }

    /**
     * @param alley
     *            the alley to set
     */
    public void setAlley(String alley) {
        this.alley = alley;
    }

    /**
     * @return the alley1
     */
    public String getAlley1() {
        return alley1;
    }

    /**
     * @param alley1
     *            the alley1 to set
     */
    public void setAlley1(String alley1) {
        this.alley1 = alley1;
    }

    /**
     * @return the alley2
     */
    public String getAlley2() {
        return alley2;
    }

    /**
     * @param alley2
     *            the alley2 to set
     */
    public void setAlley2(String alley2) {
        this.alley2 = alley2;
    }

    /**
     * @return the area
     */
    public String getArea() {
        return area;
    }

    /**
     * @param area
     *            the area to set
     */
    public void setArea(String area) {
        this.area = area;
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

    /**
     * @return the doorNo
     */
    public String getDoorNo() {
        return doorNo;
    }

    /**
     * @param doorNo
     *            the doorNo to set
     */
    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }

    /**
     * @return the floorNo
     */
    public String getFloorNo() {
        return floorNo;
    }

    /**
     * @param floorNo
     *            the floorNo to set
     */
    public void setFloorNo(String floorNo) {
        this.floorNo = floorNo;
    }
}
