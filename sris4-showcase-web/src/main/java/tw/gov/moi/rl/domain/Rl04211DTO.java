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

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl04211DTO", propOrder = { "regDate", "oldVillage", "oldNeighor", "oldStreetDoor", "newStreetDoor",
        "rl04211DTOResult", "newStreet", "newSection", "newLane", "newAlley", "newAlley1", "newAlley2", "newArea",
        "newAreaSite", "newDoorNo", "newFloorNo" })
@XmlRootElement(name = "Rl04211DTO")
public class Rl04211DTO implements Serializable {

    private static final long serialVersionUID = -7935542565449651820L;

    /** 編釘日期 */
    @FieldName("編釘日期")
    @XmlElement(name = "RegDate", required = false)
    private String regDate;

    /** 村里 */
    @FieldName("村里")
    @XmlElement(name = "OldVillage", required = false)
    private String oldVillage;

    /** 鄰 */
    @FieldName("鄰")
    @XmlElement(name = "OldNeighor", required = false)
    private String oldNeighor;

    /** 整編前門牌 */
    @FieldName("整編前門牌")
    @XmlElement(name = "OldStreetDoor", required = false)
    private String oldStreetDoor;

    /** 整編後門牌 */
    @FieldName("整編後門牌")
    @XmlElement(name = "NewStreetDoor", required = false)
    private String newStreetDoor;

    /** 門牌List[] */
    @FieldName("門牌清單")
    @XmlElement(name = "Rl04211DTOResult", required = false)
    private List<Rl04211ResultDTO> rl04211DTOResult = new ArrayList<Rl04211ResultDTO>();

    /** 門牌List[] */
    @FieldName("門牌清單")
    @XmlElement(name = "DoSaveList", required = false)
    private List<Rl04211ResultDTO> doSaveList = new ArrayList<Rl04211ResultDTO>();

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

    @XmlElement(name = "QueryType")
    @FieldName("查詢類別")
    private String queryType = "0";

    @XmlElement(name = "QueryDTO")
    @FieldName("查詢條件")
    private RlStreetFullAdressDTO queryDTO = new RlStreetFullAdressDTO();

    public RlStreetFullAdressDTO getQueryDTO() {
        return queryDTO;
    }

    public void setQueryDTO(RlStreetFullAdressDTO queryDTO) {
        this.queryDTO = queryDTO;
    }

    public String getQueryType() {
        return queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public String getOldVillage() {
        return oldVillage;
    }

    public void setOldVillage(String oldVillage) {
        this.oldVillage = oldVillage;
    }

    public String getOldNeighor() {
        return oldNeighor;
    }

    public void setOldNeighor(String oldNeighor) {
        this.oldNeighor = oldNeighor;
    }

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

    public List<Rl04211ResultDTO> getRl04211DTOResult() {
        return rl04211DTOResult;
    }

    public void setRl04211DTOResult(List<Rl04211ResultDTO> rl04211dtoResult) {
        rl04211DTOResult = rl04211dtoResult;
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

    public List<Rl04211ResultDTO> getDoSaveList() {
        return doSaveList;
    }

    public void setDoSaveList(List<Rl04211ResultDTO> doSaveList) {
        this.doSaveList = doSaveList;
    }

}
