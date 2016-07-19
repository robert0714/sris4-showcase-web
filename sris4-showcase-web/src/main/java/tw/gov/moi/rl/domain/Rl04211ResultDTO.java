package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl04211ResultDTO", propOrder = { "dataIndex", "oldStreetDoor", "newStreetDoor", "formatStreetDoor",
        "ifSave", "newStreet", "newSection", "newLane", "newAlley", "newAlley1", "newAlley2", "newArea", "newAreaSite",
        "newDoorNo", "newFloorNo", "oldStreet", "oldSection", "oldLane", "oldAlley", "oldArea", "oldDoorNo",
        "oldFloorNo" })
@XmlRootElement(name = "Rl04211ResultDTO")
public class Rl04211ResultDTO implements Serializable {

    private static final long serialVersionUID = -5210044834019281043L;

    /** 整編前門牌 */
    @FieldName("整編前門牌")
    @XmlElement(name = "OldStreetDoor", required = false)
    private String oldStreetDoor;

    /** 整編後門牌 */
    @FieldName("整編後門牌")
    @XmlElement(name = "NewStreetDoor", required = false)
    private String newStreetDoor;

    /** 經副程式處理過之門牌 */
    @FieldName("經副程式處理過之門牌")
    @XmlElement(name = "FormatStreetDoor", required = false)
    private String formatStreetDoor;

    /** 是否整編 */
    @FieldName("是否整編")
    @XmlElement(name = "IfSave", required = false)
    private boolean ifSave;

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

    /** 改編後弄 */
    @XmlElement(name = "NewAlley")
    @FieldName("改編後弄")
    private String newAlley;

    /** 改編後衖 */
    @XmlElement(name = "NewAlley1")
    @FieldName("改編後衖")
    private String newAlley1;

    /** 改編後衕 */
    @XmlElement(name = "NewAlley2")
    @FieldName("改編後衕")
    private String newAlley2;

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

    /** 改編前街路 */
    @XmlElement(name = "OldStreet")
    @FieldName("改編前街路")
    private String oldStreet;

    /** 改編前段 */
    @XmlElement(name = "OldSection")
    @FieldName("改編前段")
    private String oldSection;

    /** 改編前巷 */
    @XmlElement(name = "OldLane")
    @FieldName("改編前巷")
    private String oldLane;

    /** 改編前弄衖衕 */
    @XmlElement(name = "OldAlley")
    @FieldName("改編前弄衖衕")
    private String oldAlley;

    /** 改編前地名 */
    @XmlElement(name = "OldArea")
    @FieldName("改編前地名")
    private String oldArea;

    /** 改編門牌號 */
    @XmlElement(name = "OldDoorNo")
    @FieldName("改編門牌號")
    private String oldDoorNo;

    /** 改編前樓層 */
    @XmlElement(name = "OldFloorNo")
    @FieldName("改編前樓層")
    private String oldFloorNo;

    public String getOldStreetDoor() {
        return oldStreetDoor;
    }

    public void setOldStreetDoor(String oldStreetDoor) {
        this.oldStreetDoor = oldStreetDoor;
    }

    public String getNewStreetDoor() {
        return newStreetDoor;
    }

    public void setNewStreetDoor(String newStreetDoor) {
        this.newStreetDoor = newStreetDoor;
    }

    public String getFormatStreetDoor() {
        return formatStreetDoor;
    }

    public void setFormatStreetDoor(String formatStreetDoor) {
        this.formatStreetDoor = formatStreetDoor;
    }

    public boolean isIfSave() {
        return ifSave;
    }

    public void setIfSave(boolean ifSave) {
        this.ifSave = ifSave;
    }

    /**
     * @return the newStreet
     */
    public String getNewStreet() {
        return newStreet;
    }

    /**
     * @param newStreet
     *            the newStreet to set
     */
    public void setNewStreet(String newStreet) {
        this.newStreet = newStreet;
    }

    /**
     * @return the newSection
     */
    public String getNewSection() {
        return newSection;
    }

    /**
     * @param newSection
     *            the newSection to set
     */
    public void setNewSection(String newSection) {
        this.newSection = newSection;
    }

    /**
     * @return the newLane
     */
    public String getNewLane() {
        return newLane;
    }

    /**
     * @param newLane
     *            the newLane to set
     */
    public void setNewLane(String newLane) {
        this.newLane = newLane;
    }

    /**
     * @return the newAlley
     */
    public String getNewAlley() {
        return newAlley;
    }

    /**
     * @param newAlley
     *            the newAlley to set
     */
    public void setNewAlley(String newAlley) {
        this.newAlley = newAlley;
    }

    /**
     * @return the newAlley1
     */
    public String getNewAlley1() {
        return newAlley1;
    }

    /**
     * @param newAlley1
     *            the newAlley1 to set
     */
    public void setNewAlley1(String newAlley1) {
        this.newAlley1 = newAlley1;
    }

    /**
     * @return the newAlley2
     */
    public String getNewAlley2() {
        return newAlley2;
    }

    /**
     * @param newAlley2
     *            the newAlley2 to set
     */
    public void setNewAlley2(String newAlley2) {
        this.newAlley2 = newAlley2;
    }

    /**
     * @return the newArea
     */
    public String getNewArea() {
        return newArea;
    }

    /**
     * @param newArea
     *            the newArea to set
     */
    public void setNewArea(String newArea) {
        this.newArea = newArea;
    }

    /**
     * @return the newAreaSite
     */
    public String getNewAreaSite() {
        return newAreaSite;
    }

    /**
     * @param newAreaSite
     *            the newAreaSite to set
     */
    public void setNewAreaSite(String newAreaSite) {
        this.newAreaSite = newAreaSite;
    }

    /**
     * @return the newDoorNo
     */
    public String getNewDoorNo() {
        return newDoorNo;
    }

    /**
     * @param newDoorNo
     *            the newDoorNo to set
     */
    public void setNewDoorNo(String newDoorNo) {
        this.newDoorNo = newDoorNo;
    }

    /**
     * @return the newFloorNo
     */
    public String getNewFloorNo() {
        return newFloorNo;
    }

    /**
     * @param newFloorNo
     *            the newFloorNo to set
     */
    public void setNewFloorNo(String newFloorNo) {
        this.newFloorNo = newFloorNo;
    }

    /**
     * @return the oldStreet
     */
    public String getOldStreet() {
        return oldStreet;
    }

    /**
     * @param oldStreet
     *            the oldStreet to set
     */
    public void setOldStreet(String oldStreet) {
        this.oldStreet = oldStreet;
    }

    /**
     * @return the oldSection
     */
    public String getOldSection() {
        return oldSection;
    }

    /**
     * @param oldSection
     *            the oldSection to set
     */
    public void setOldSection(String oldSection) {
        this.oldSection = oldSection;
    }

    /**
     * @return the oldLane
     */
    public String getOldLane() {
        return oldLane;
    }

    /**
     * @param oldLane
     *            the oldLane to set
     */
    public void setOldLane(String oldLane) {
        this.oldLane = oldLane;
    }

    /**
     * @return the oldAlley
     */
    public String getOldAlley() {
        return oldAlley;
    }

    /**
     * @param oldAlley
     *            the oldAlley to set
     */
    public void setOldAlley(String oldAlley) {
        this.oldAlley = oldAlley;
    }

    /**
     * @return the oldArea
     */
    public String getOldArea() {
        return oldArea;
    }

    /**
     * @param oldArea
     *            the oldArea to set
     */
    public void setOldArea(String oldArea) {
        this.oldArea = oldArea;
    }

    /**
     * @return the oldDoorNo
     */
    public String getOldDoorNo() {
        return oldDoorNo;
    }

    /**
     * @param oldDoorNo
     *            the oldDoorNo to set
     */
    public void setOldDoorNo(String oldDoorNo) {
        this.oldDoorNo = oldDoorNo;
    }

    /**
     * @return the oldFloorNo
     */
    public String getOldFloorNo() {
        return oldFloorNo;
    }

    /**
     * @param oldFloorNo
     *            the oldFloorNo to set
     */
    public void setOldFloorNo(String oldFloorNo) {
        this.oldFloorNo = oldFloorNo;
    }

}
