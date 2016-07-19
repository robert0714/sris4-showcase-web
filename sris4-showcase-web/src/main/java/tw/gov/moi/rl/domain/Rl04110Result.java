package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl04110Result", propOrder = { "regStreetDoor", "stdStreetDoor", "checkRange", "street", "section",
        "area", "lane", "alley", "doorNo", "floorNo" })
@XmlRootElement(name = "Rl04110Result")
public class Rl04110Result implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 街路門牌 **/
    @XmlElement(name = "RegStreetDoor")
    @FieldName("街路門牌")
    private String regStreetDoor;

    /** 標準門牌 **/
    @XmlElement(name = "StdStreetDoor")
    @FieldName("標準門牌")
    private String stdStreetDoor;

    /** 是否調整 **/
    @XmlElement(name = "CheckRange")
    @FieldName("是否調整")
    private boolean checkRange;

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

    /**
     * @return the regStreetDoor
     */
    public String getRegStreetDoor() {
        return regStreetDoor;
    }

    /**
     * @param regStreetDoor
     *            the regStreetDoor to set
     */
    public void setRegStreetDoor(String regStreetDoor) {
        this.regStreetDoor = regStreetDoor;
    }

    /**
     * @return the stdStreetDoor
     */
    public String getStdStreetDoor() {
        return stdStreetDoor;
    }

    /**
     * @param stdStreetDoor
     *            the stdStreetDoor to set
     */
    public void setStdStreetDoor(String stdStreetDoor) {
        this.stdStreetDoor = stdStreetDoor;
    }

    /**
     * @return the checkRange
     */
    public boolean isCheckRange() {
        return checkRange;
    }

    /**
     * @param checkRange
     *            the checkRange to set
     */
    public void setCheckRange(boolean checkRange) {
        this.checkRange = checkRange;
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