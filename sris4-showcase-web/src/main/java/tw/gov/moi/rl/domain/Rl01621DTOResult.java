package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01621DTOResult", propOrder = { "DelDoorNum", "DeleteDate", "Village", "Neighor", "DelStreetDoor",
        "DelStreet", "DelSection", "DelLane", "DelAlley", "DelArea", "DelDoorNo", "DelFloorNo" })
@XmlRootElement(name = "Rl01621DTOResult")
public class Rl01621DTOResult implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 補發門牌筆數 */
    @XmlElement(name = "DelDoorNum")
    @FieldName("補發門牌筆數")
    private String delDoorNum;

    /** 補發日期 */
    @XmlElement(name = "DeleteDate")
    @FieldName("補發日期")
    private String deleteDate;

    /** 村里 */
    @XmlElement(name = "Village")
    @FieldName("村里")
    private String village;

    /** 鄰 */
    @XmlElement(name = "Neighor")
    @FieldName("鄰")
    private String neighor;

    /** 補發門牌 */
    @XmlElement(name = "DelStreetDoor")
    @FieldName("補發門牌")
    private String delStreetDoor;

    /** 補發街路 */
    @XmlElement(name = "DelStreet")
    @FieldName("補發街路")
    private String delStreet;

    /** 補發段 */
    @XmlElement(name = "DelSection")
    @FieldName("補發段")
    private String delSection;

    /** 補發巷 */
    @XmlElement(name = "DelLane")
    @FieldName("補發巷")
    private String delLane;

    /** 補發弄 */
    @XmlElement(name = "DelAlley")
    @FieldName("補發弄")
    private String delAlley;

    /** 補發地名 */
    @XmlElement(name = "DelArea")
    @FieldName("補發地名")
    private String delArea;

    /** 補發門牌號 */
    @XmlElement(name = "DelDoorNo")
    @FieldName("補發門牌號")
    private String delDoorNo;

    /** 補發樓層 */
    @XmlElement(name = "DelFloorNo")
    @FieldName("補發樓層")
    private String delFloorNo;

    private Object obj;

    public String getDeleteDate() {
        return deleteDate;
    }

    public void setDeleteDate(String deleteDate) {
        this.deleteDate = deleteDate;
    }

    public String getDelStreetDoor() {
        return delStreetDoor;
    }

    public void setDelStreetDoor(String delStreetDoor) {
        this.delStreetDoor = delStreetDoor;
    }

    public String getDelStreet() {
        return delStreet;
    }

    public void setDelStreet(String delStreet) {
        this.delStreet = delStreet;
    }

    public String getDelSection() {
        return delSection;
    }

    public void setDelSection(String delSection) {
        this.delSection = delSection;
    }

    public String getDelLane() {
        return delLane;
    }

    public void setDelLane(String delLane) {
        this.delLane = delLane;
    }

    public String getDelAlley() {
        return delAlley;
    }

    public void setDelAlley(String delAlley) {
        this.delAlley = delAlley;
    }

    public String getDelArea() {
        return delArea;
    }

    public void setDelArea(String delArea) {
        this.delArea = delArea;
    }

    public String getDelDoorNo() {
        return delDoorNo;
    }

    public void setDelDoorNo(String delDoorNo) {
        this.delDoorNo = delDoorNo;
    }

    public String getDelFloorNo() {
        return delFloorNo;
    }

    public void setDelFloorNo(String delFloorNo) {
        this.delFloorNo = delFloorNo;
    }

    public String getDelDoorNum() {
        return delDoorNum;
    }

    public void setDelDoorNum(String delDoorNum) {
        this.delDoorNum = delDoorNum;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getNeighor() {
        return neighor;
    }

    public void setNeighor(String neighor) {
        this.neighor = neighor;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

}
