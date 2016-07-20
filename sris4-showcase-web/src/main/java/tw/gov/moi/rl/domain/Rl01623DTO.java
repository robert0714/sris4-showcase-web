package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * Rl01623DTO
 * 
 * @author Alan Lo
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl01623DTO", propOrder = { "regDate", "village", "neighor", "beforeStreetDoor", "afterStreetDoor",
        "newStreet", "newSection", "newLane", "newAlley", "newAlley1", "newAlley2", "newArea", "newAreaSite",
        "newDoorNo", "newFloorNo", "oldStreet", "oldSection", "oldLane", "oldAlley", "oldArea", "oldDoorNo",
        "oldFloorNo", "changeRange", "doForm", "modifyBatch", "houseHoldNum", "houseHoldHeadList",
        "selectedHouseHoldHead", "status", "IsSearchStrret" })
@XmlRootElement(name = "Rl01624DTO")
public class Rl01623DTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 編釘日期 */
    @XmlElement(name = "RegDate")
    @FieldName("編釘日期")
    private String regDate;

    /** 村里 */
    @XmlElement(name = "Village")
    @FieldName("村里")
    private String village;

    /** 鄰 */
    @XmlElement(name = "Neighor")
    @FieldName("鄰")
    private String neighor;

    /** 改編前門牌 */
    @XmlElement(name = "BeforeStreetDoor")
    @FieldName("改編前門牌")
    private String beforeStreetDoor;

    /** 改編後門牌 */
    @XmlElement(name = "AfterStreetDoor")
    @FieldName("改編後門牌")
    private String afterStreetDoor;

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
    @XmlElement(name = "oldFloorNo")
    @FieldName("改編前樓層")
    private String oldFloorNo;

    /** 改編範圍 */
    @XmlElement(name = "ChangeRange")
    @FieldName("改編範圍")
    private String changeRange;

    /** 執行頁面 */
    @XmlElement(name = "doForm")
    @FieldName("執行頁面")
    private String doForm;

    /** 編釘批號 */
    @XmlElement(name = "ModifyBatch")
    @FieldName("編釘批號")
    private String modifyBatch;

    /** 門牌戶數 */
    @XmlElement(name = "HouseHoldNum")
    @FieldName("門牌戶數")
    private String houseHoldNum;

    /** 戶長資料List. */
    @XmlElement(name = "HouseHoldHeadList")
    @FieldName("戶長資料List")
    private List<Rl01623HouseHoldHeadDTO> houseHoldHeadList = new ArrayList<Rl01623HouseHoldHeadDTO>();

    /** 戶長資料. */
    @XmlElement(name = "selectedHouseHoldHead")
    @FieldName("戶長資料")
    private Rl01623HouseHoldHeadDTO[] selectedHouseHoldHead = {};

    @XmlElement(name = "IsSearchStrret")
    @FieldName("是否搜尋街路")
    private boolean isSearchStrret = false;

    public boolean isSearchStrret() {
        return isSearchStrret;
    }

    public void setSearchStrret(boolean isSearchStrret) {
        this.isSearchStrret = isSearchStrret;
    }

    /** 處理狀態 */
    @XmlElement(name = "Status")
    @FieldName("處理狀態")
    private String status;

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
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

    public String getBeforeStreetDoor() {
        return beforeStreetDoor;
    }

    public void setBeforeStreetDoor(String beforeStreetDoor) {
        this.beforeStreetDoor = beforeStreetDoor;
    }

    public String getAfterStreetDoor() {
        return afterStreetDoor;
    }

    public void setAfterStreetDoor(String afterStreetDoor) {
        this.afterStreetDoor = afterStreetDoor;
    }

    public String getNewStreet() {
        return newStreet;
    }

    public void setNewStreet(String newStreet) {
        this.newStreet = newStreet;
    }

    public String getNewAlley() {
        return newAlley;
    }

    public void setNewAlley(String newAlley) {
        this.newAlley = newAlley;
    }

    public String getNewAlley1() {
        return newAlley1;
    }

    public void setNewAlley1(String newAlley1) {
        this.newAlley1 = newAlley1;
    }

    public String getNewAlley2() {
        return newAlley2;
    }

    public void setNewAlley2(String newAlley2) {
        this.newAlley2 = newAlley2;
    }

    public String getNewArea() {
        return newArea;
    }

    public void setNewArea(String newArea) {
        this.newArea = newArea;
    }

    public String getNewDoorNo() {
        return newDoorNo;
    }

    public void setNewDoorNo(String newDoorNo) {
        this.newDoorNo = newDoorNo;
    }

    public String getOldStreet() {
        return oldStreet;
    }

    public void setOldStreet(String oldStreet) {
        this.oldStreet = oldStreet;
    }

    public String getOldLane() {
        return oldLane;
    }

    public void setOldLane(String oldLane) {
        this.oldLane = oldLane;
    }

    public String getOldAlley() {
        return oldAlley;
    }

    public void setOldAlley(String oldAlley) {
        this.oldAlley = oldAlley;
    }

    public String getOldArea() {
        return oldArea;
    }

    public void setOldArea(String oldArea) {
        this.oldArea = oldArea;
    }

    public String getOldDoorNo() {
        return oldDoorNo;
    }

    public void setOldDoorNo(String oldDoorNo) {
        this.oldDoorNo = oldDoorNo;
    }

    public String getChangeRange() {
        return changeRange;
    }

    public void setChangeRange(String changeRange) {
        this.changeRange = changeRange;
    }

    public String getDoForm() {
        return doForm;
    }

    public void setDoForm(String doForm) {
        this.doForm = doForm;
    }

    public String getHouseHoldNum() {
        return houseHoldNum;
    }

    public void setHouseHoldNum(String houseHoldNum) {
        this.houseHoldNum = houseHoldNum;
    }

    public List<Rl01623HouseHoldHeadDTO> getHouseHoldHeadList() {
        return houseHoldHeadList;
    }

    public void setHouseHoldHeadList(List<Rl01623HouseHoldHeadDTO> houseHoldHeadList) {
        this.houseHoldHeadList = houseHoldHeadList;
    }

    public String getNewLane() {
        return newLane;
    }

    public void setNewLane(String newLane) {
        this.newLane = newLane;
    }

    public String getModifyBatch() {
        return modifyBatch;
    }

    public void setModifyBatch(String modifyBatch) {
        this.modifyBatch = modifyBatch;
    }

    public Rl01623HouseHoldHeadDTO[] getSelectedHouseHoldHead() {
        return selectedHouseHoldHead;
    }

    public void setSelectedHouseHoldHead(Rl01623HouseHoldHeadDTO[] selectedHouseHoldHead) {
        this.selectedHouseHoldHead = selectedHouseHoldHead;
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

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     *            the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

}
