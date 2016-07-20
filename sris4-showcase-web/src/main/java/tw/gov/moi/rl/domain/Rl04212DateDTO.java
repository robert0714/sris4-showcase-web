package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;

import tw.gov.moi.ae.checker.annotation.FieldName;

public class Rl04212DateDTO implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /** 整編前門牌 */
    @FieldName("整編前門牌 ")
    @XmlElement(name = "InputStringDoor", required = false)
    private String inputStringDoor;

    /** 整編後門牌 */
    @FieldName("整編後門牌")
    @XmlElement(name = "NewStreetDoor", required = false)
    private String newStreetDoor;

    /** 改編後街路 */
    @XmlElement(name = "NewStreet")
    @FieldName("改編後街路")
    private String newStreet;

    /** 改編後段 */
    @XmlElement(name = "NewSection")
    @FieldName("改編後段")
    private String newSection;

    /** 改編後巷 */
    @XmlElement(name = "NewLane")
    @FieldName("改編後巷")
    private String newLane;

    /** 改編後弄衖衕 */
    @XmlElement(name = "NewAlley")
    @FieldName("改編後弄衖衕")
    private String newAlley;

    /** 改編後地名 */
    @XmlElement(name = "NewArea")
    @FieldName("改編後地名")
    private String newArea;

    /** 改編後地名放置位置 */
    @XmlElement(name = "NewAreaSite")
    @FieldName("改編後地名放置位置")
    private String newAreaSite;

    /** 改編後門牌號 */
    @XmlElement(name = "NewDoorNo")
    @FieldName("改編後門牌號")
    private String newDoorNo;

    /** 改編後樓層 */
    @XmlElement(name = "NewFloorNo")
    @FieldName("改編後樓層")
    private String newFloorNo;

    @XmlElement(name = "IsKeyStreet")
    @FieldName("改編前樓層")
    private boolean isKeyStreet = false;

    @XmlElement(name = "IsKeySection")
    @FieldName("改編前樓層")
    private boolean isKeySection = false;

    @XmlElement(name = "IsKeyArea")
    @FieldName("改編前樓層")
    private boolean isKeyArea = false;

    @XmlElement(name = "IsKeyLane")
    @FieldName("改編前樓層")
    private boolean isKeyLane = false;

    @XmlElement(name = "IsKeyDoorNo")
    @FieldName("改編前樓層")
    private boolean isKeyDoorNo = false;

    @XmlElement(name = "IsKeyFloorNo")
    @FieldName("改編前樓層")
    private boolean isKeyFloorNo = false;

    @XmlElement(name = "IsKeyFloorNo")
    @FieldName("改編前樓層")
    private boolean isKeyAlley = false;

    public String getInputStringDoor() {
        return inputStringDoor;
    }

    public void setInputStringDoor(String inputStringDoor) {
        this.inputStringDoor = inputStringDoor;
    }

    public String getNewStreetDoor() {
        return newStreetDoor;
    }

    public void setNewStreetDoor(String newStreetDoor) {
        this.newStreetDoor = newStreetDoor;
    }

    public String getNewStreet() {
        return newStreet;
    }

    public void setNewStreet(String newStreet) {
        this.newStreet = newStreet;
    }

    public String getNewSection() {
        return newSection;
    }

    public void setNewSection(String newSection) {
        this.newSection = newSection;
    }

    public String getNewLane() {
        return newLane;
    }

    public void setNewLane(String newLane) {
        this.newLane = newLane;
    }

    public String getNewAlley() {
        return newAlley;
    }

    public void setNewAlley(String newAlley) {
        this.newAlley = newAlley;
    }

    public String getNewArea() {
        return newArea;
    }

    public void setNewArea(String newArea) {
        this.newArea = newArea;
    }

    public String getNewAreaSite() {
        return newAreaSite;
    }

    public void setNewAreaSite(String newAreaSite) {
        this.newAreaSite = newAreaSite;
    }

    public String getNewDoorNo() {
        return newDoorNo;
    }

    public void setNewDoorNo(String newDoorNo) {
        this.newDoorNo = newDoorNo;
    }

    public String getNewFloorNo() {
        return newFloorNo;
    }

    public void setNewFloorNo(String newFloorNo) {
        this.newFloorNo = newFloorNo;
    }

    public boolean isKeyStreet() {
        return isKeyStreet;
    }

    public void setKeyStreet(boolean isKeyStreet) {
        this.isKeyStreet = isKeyStreet;
    }

    public boolean isKeySection() {
        return isKeySection;
    }

    public void setKeySection(boolean isKeySection) {
        this.isKeySection = isKeySection;
    }

    public boolean isKeyArea() {
        return isKeyArea;
    }

    public void setKeyArea(boolean isKeyArea) {
        this.isKeyArea = isKeyArea;
    }

    public boolean isKeyLane() {
        return isKeyLane;
    }

    public void setKeyLane(boolean isKeyLane) {
        this.isKeyLane = isKeyLane;
    }

    public boolean isKeyDoorNo() {
        return isKeyDoorNo;
    }

    public void setKeyDoorNo(boolean isKeyDoorNo) {
        this.isKeyDoorNo = isKeyDoorNo;
    }

    public boolean isKeyFloorNo() {
        return isKeyFloorNo;
    }

    public void setKeyFloorNo(boolean isKeyFloorNo) {
        this.isKeyFloorNo = isKeyFloorNo;
    }

    public boolean isKeyAlley() {
        return isKeyAlley;
    }

    public void setKeyAlley(boolean isKeyAlley) {
        this.isKeyAlley = isKeyAlley;
    }

}
