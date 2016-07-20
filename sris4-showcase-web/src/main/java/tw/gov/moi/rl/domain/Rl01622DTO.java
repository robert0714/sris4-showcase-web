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
@XmlType(name = "rl01622DTO", propOrder = { "SelectDoor", "regDate", "regBatch", "copyType", "regVillage",
        "regNeighor", "streetDoorPlate_A", "street_A", "section_A", "area_A", "lane_A", "alley_A", "alley1_A",
        "alley2_A", "doorNo_A", "floorNo_A", "selectedRowIndex_A", "streetDoorPlate_B", "street_B", "section_B",
        "area_B", "lane_B", "alley_B", "alley1_B", "alley2_B", "doorNo_B1_Start", "doorNo_B2_Start", "doorNo_B3_Start",
        "floorNo_B1_Start", "floorNo_B2_Start", "doorNo_B1_End", "doorNo_B2_End", "doorNo_B3_End", "floorNo_B1_End",
        "floorNo_B2_End", "isSerial_doorNo_B1", "isSerial_doorNo_B2", "isSerial_doorNo_B3", "isSerial_floorNo_B1",
        "isSerial_floorNo_B2", "regDoorNum", "existDoorNum", "doForm", "rl01622SDPList", "rl01622EDPList",
        "areaSite_A", "areaSite_B" })
@XmlRootElement(name = "Rl01622DTO")
public class Rl01622DTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 6590035826711818945L;

    @XmlElement(name = "SelectDoor", required = false)
    @FieldName("現在處理中的門牌")
    private Rl01622SDPDTO selectDoor = null;

    /** 編釘日期 */
    @XmlElement(name = "RegDate", required = false)
    @FieldName("編釘日期")
    private String regDate;

    /** 編釘批號 */
    @XmlElement(name = "RegBatch", required = false)
    @FieldName("編釘批號")
    private String regBatch;

    /** 複製類別 */
    @XmlElement(name = "CopyType", required = false)
    @FieldName("複製類別")
    private String copyType;

    /** 房屋地點-村里 */
    @XmlElement(name = "RegVillage", required = false)
    @FieldName("房屋地點-村里")
    private String regVillage;

    /** 房屋地點-鄰 */
    @XmlElement(name = "RegNeighor", required = false)
    @FieldName("房屋地點-鄰")
    private String regNeighor;

    /** A類-門牌-展開門牌 */
    @XmlElement(name = "StreetDoorPlate_A", required = false)
    @FieldName("A類-門牌-展開門牌")
    private String streetDoorPlate_A;

    /** A類-門牌-街路 */
    @XmlElement(name = "Street_A", required = false)
    @FieldName("A類-門牌-街路")
    private String street_A;

    /** A類-門牌-段 */
    @XmlElement(name = "Section_A", required = false)
    @FieldName("A類-門牌-段")
    private String section_A;

    /** A類-門牌-地名 */
    @XmlElement(name = "Area_A", required = false)
    @FieldName("A類-門牌-地名")
    private String area_A;

    /** A類-門牌-巷 */
    @XmlElement(name = "Lane_A", required = false)
    @FieldName("A類-門牌-巷")
    private String lane_A;

    /** A類-門牌-弄 */
    @XmlElement(name = "Alley_A", required = false)
    @FieldName("A類-門牌-弄")
    private String alley_A;

    /** A類-門牌-衖 */
    @XmlElement(name = "Alley1_A", required = false)
    @FieldName("A類-門牌-衖")
    private String alley1_A;

    /** A類-門牌-衕 */
    @XmlElement(name = "Alley2_A", required = false)
    @FieldName("A類-門牌-衕")
    private String alley2_A;

    /** A類-門牌-號 */
    @XmlElement(name = "DoorNo_A", required = false)
    @FieldName("A類-門牌-號")
    private String doorNo_A;

    /** A類-門牌-樓 */
    @XmlElement(name = "FloorNo_A", required = false)
    @FieldName("A類-門牌-樓")
    private String floorNo_A;

    /** A類-被選中的資料序號 */
    @XmlElement(name = "SelectedRowIndex_A", required = false)
    @FieldName("A類-被選中的資料序號")
    private int selectedRowIndex_A;

    /** B類-門牌-展開門牌 */
    @XmlElement(name = "StreetDoorPlate_B", required = false)
    @FieldName("B類-門牌-展開門牌")
    private String streetDoorPlate_B;

    /** B類-門牌-街路 */
    @XmlElement(name = "Street_B", required = false)
    @FieldName("B類-門牌-街路")
    private String street_B;

    /** B類-門牌-段 */
    @XmlElement(name = "Section_B", required = false)
    @FieldName("B類-門牌-段")
    private String section_B;

    /** B類-門牌-地名 */
    @XmlElement(name = "Area_B", required = false)
    @FieldName("B類-門牌-地名")
    private String area_B;

    /** B類-門牌-巷 */
    @XmlElement(name = "Lane_B", required = false)
    @FieldName("B類-門牌-巷")
    private String lane_B;

    /** B類-門牌-弄 */
    @XmlElement(name = "Alley_B", required = false)
    @FieldName("B類-門牌-弄")
    private String alley_B;

    /** B類-門牌-衖 */
    @XmlElement(name = "Alley1_B", required = false)
    @FieldName("B類-門牌-衖")
    private String alley1_B;

    /** B類-門牌-衕 */
    @XmlElement(name = "Alley2_B", required = false)
    @FieldName("B類-門牌-衕")
    private String alley2_B;

    /** B類-門牌-doorNo_B1_Start */
    @XmlElement(name = "DoorNo_B1_Start", required = false)
    @FieldName("B類-門牌-doorNo_B1_Start")
    private String doorNo_B1_Start;

    /** B類-門牌-doorNo_B2_Start */
    @XmlElement(name = "DoorNo_B2_Start", required = false)
    @FieldName("B類-門牌-doorNo_B2_Start")
    private String doorNo_B2_Start;

    /** B類-門牌-doorNo_B3_Start */
    @XmlElement(name = "DoorNo_B3_Start", required = false)
    @FieldName("B類-門牌-doorNo_B3_Start")
    private String doorNo_B3_Start;

    /** B類-門牌-floorNo_B1_Start */
    @XmlElement(name = "FloorNo_B1_Start", required = false)
    @FieldName("B類-門牌-floorNo_B1_Start")
    private String floorNo_B1_Start;

    /** B類-門牌-floorNo_B2_Start */
    @XmlElement(name = "FloorNo_B2_Start", required = false)
    @FieldName("B類-門牌-floorNo_B2_Start")
    private String floorNo_B2_Start;

    /** B類-門牌-doorNo_B1_End */
    @XmlElement(name = "DoorNo_B1_End", required = false)
    @FieldName("B類-門牌-doorNo_B1_End")
    private String doorNo_B1_End;

    /** B類-門牌-doorNo_B2_End */
    @XmlElement(name = "DoorNo_B2_End", required = false)
    @FieldName("B類-門牌-doorNo_B2_End")
    private String doorNo_B2_End;

    /** B類-門牌-doorNo_B3_End */
    @XmlElement(name = "DoorNo_B3_End", required = false)
    @FieldName("B類-門牌-doorNo_B3_End")
    private String doorNo_B3_End;

    /** B類-門牌-floorNo_B1_End */
    @XmlElement(name = "FloorNo_B1_End", required = false)
    @FieldName("B類-門牌-floorNo_B1_End")
    private String floorNo_B1_End;

    /** B類-門牌-floorNo_B2_End */
    @XmlElement(name = "FloorNo_B2_End", required = false)
    @FieldName("B類-門牌-floorNo_B2_End")
    private String floorNo_B2_End;

    /** B類-門牌-doorNo_B1_是否連續 */
    @XmlElement(name = "IsSerial_doorNo_B1", required = false)
    @FieldName("B類-門牌-doorNo_B1_是否連續")
    private String isSerial_doorNo_B1;

    /** B類-門牌-doorNo_B2_是否連續 */
    @XmlElement(name = "IsSerial_doorNo_B2", required = false)
    @FieldName("B類-門牌-doorNo_B2_是否連續")
    private String isSerial_doorNo_B2;

    /** B類-門牌-doorNo_B3_是否連續 */
    @XmlElement(name = "IsSerial_doorNo_B3", required = false)
    @FieldName("B類-門牌-doorNo_B3_是否連續")
    private String isSerial_doorNo_B3;

    /** B類-門牌-floorNo_B1_是否連續 */
    @XmlElement(name = "IsSerial_floorNo_B1", required = false)
    @FieldName("B類-門牌-floorNo_B1_是否連續")
    private String isSerial_floorNo_B1;

    /** B類-門牌-floorNo_B2_是否連續 */
    @XmlElement(name = "IsSerial_floorNo_B2", required = false)
    @FieldName("B類-門牌-floorNo_B2_是否連續")
    private String isSerial_floorNo_B2;

    /** 展開門牌筆數 */
    @XmlElement(name = "RegDoorNum", required = false)
    @FieldName("展開門牌筆數")
    private String regDoorNum;

    /** 存在門牌筆數 */
    @XmlElement(name = "ExistDoorNum", required = false)
    @FieldName("存在門牌筆數")
    private String existDoorNum;

    /** 執行頁面 */
    @XmlElement(name = "DoForm", required = false)
    @FieldName("執行頁面")
    private String doForm;

    /** 展開門牌資料List[] */
    @XmlElement(name = "Rl01622SDPList", required = false)
    @FieldName("展開門牌資料List[]")
    private List<Rl01622SDPDTO> rl01622SDPList = new ArrayList<Rl01622SDPDTO>();

    /** 已存在門牌資料List[] */
    @XmlElement(name = "Rl01622EDPList", required = false)
    @FieldName("已存在門牌資料List[]")
    private List<Rl01622EDPDTO> rl01622EDPList = new ArrayList<Rl01622EDPDTO>();

    /** 已存在門牌資料List[] */
    @XmlElement(name = "Rl01622EDPList", required = false)
    @FieldName("勾選清單")
    private List<Rl01622SDPDTO> checkList = new ArrayList<Rl01622SDPDTO>();

    public List<Rl01622SDPDTO> getCheckList() {
        return checkList;
    }

    public void setCheckList(List<Rl01622SDPDTO> checkList) {
        this.checkList = checkList;
    }

    /** A類-地名擺放位置 */
    @XmlElement(name = "AreaSite_A")
    @FieldName("A類-地名擺放位置")
    private String areaSite_A;

    /** B類-地名擺放位置 */
    @XmlElement(name = "AreaSite_B")
    @FieldName("B類-地名擺放位置")
    private String areaSite_B;

    public Rl01622SDPDTO getSelectDoor() {
        return selectDoor;
    }

    public void setSelectDoor(Rl01622SDPDTO selectDoor) {
        this.selectDoor = selectDoor;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public String getRegBatch() {
        return regBatch;
    }

    public void setRegBatch(String regBatch) {
        this.regBatch = regBatch;
    }

    public String getCopyType() {
        return copyType;
    }

    public void setCopyType(String copyType) {
        this.copyType = copyType;
    }

    public String getRegVillage() {
        return regVillage;
    }

    public void setRegVillage(String regVillage) {
        this.regVillage = regVillage;
    }

    public String getRegNeighor() {
        return regNeighor;
    }

    public void setRegNeighor(String regNeighor) {
        this.regNeighor = regNeighor;
    }

    public String getStreetDoorPlate_A() {
        return streetDoorPlate_A;
    }

    public void setStreetDoorPlate_A(String streetDoorPlate_A) {
        this.streetDoorPlate_A = streetDoorPlate_A;
    }

    public String getStreet_A() {
        return street_A;
    }

    public void setStreet_A(String street_A) {
        this.street_A = street_A;
    }

    public String getSection_A() {
        return section_A;
    }

    public void setSection_A(String section_A) {
        this.section_A = section_A;
    }

    public String getArea_A() {
        return area_A;
    }

    public void setArea_A(String area_A) {
        this.area_A = area_A;
    }

    public String getLane_A() {
        return lane_A;
    }

    public void setLane_A(String lane_A) {
        this.lane_A = lane_A;
    }

    public String getAlley_A() {
        return alley_A;
    }

    public void setAlley_A(String alley_A) {
        this.alley_A = alley_A;
    }

    public String getAlley1_A() {
        return alley1_A;
    }

    public void setAlley1_A(String alley1_A) {
        this.alley1_A = alley1_A;
    }

    public String getAlley2_A() {
        return alley2_A;
    }

    public void setAlley2_A(String alley2_A) {
        this.alley2_A = alley2_A;
    }

    public String getDoorNo_A() {
        return doorNo_A;
    }

    public void setDoorNo_A(String doorNo_A) {
        this.doorNo_A = doorNo_A;
    }

    public String getFloorNo_A() {
        return floorNo_A;
    }

    public void setFloorNo_A(String floorNo_A) {
        this.floorNo_A = floorNo_A;
    }

    public int getSelectedRowIndex_A() {
        return selectedRowIndex_A;
    }

    public void setSelectedRowIndex_A(int selectedRowIndex_A) {
        this.selectedRowIndex_A = selectedRowIndex_A;
    }

    public String getStreetDoorPlate_B() {
        return streetDoorPlate_B;
    }

    public void setStreetDoorPlate_B(String streetDoorPlate_B) {
        this.streetDoorPlate_B = streetDoorPlate_B;
    }

    public String getStreet_B() {
        return street_B;
    }

    public void setStreet_B(String street_B) {
        this.street_B = street_B;
    }

    public String getSection_B() {
        return section_B;
    }

    public void setSection_B(String section_B) {
        this.section_B = section_B;
    }

    public String getArea_B() {
        return area_B;
    }

    public void setArea_B(String area_B) {
        this.area_B = area_B;
    }

    public String getLane_B() {
        return lane_B;
    }

    public void setLane_B(String lane_B) {
        this.lane_B = lane_B;
    }

    public String getAlley_B() {
        return alley_B;
    }

    public void setAlley_B(String alley_B) {
        this.alley_B = alley_B;
    }

    public String getAlley1_B() {
        return alley1_B;
    }

    public void setAlley1_B(String alley1_B) {
        this.alley1_B = alley1_B;
    }

    public String getAlley2_B() {
        return alley2_B;
    }

    public void setAlley2_B(String alley2_B) {
        this.alley2_B = alley2_B;
    }

    public String getDoorNo_B1_Start() {
        return doorNo_B1_Start;
    }

    public void setDoorNo_B1_Start(String doorNo_B1_Start) {
        this.doorNo_B1_Start = doorNo_B1_Start;
    }

    public String getDoorNo_B2_Start() {
        return doorNo_B2_Start;
    }

    public void setDoorNo_B2_Start(String doorNo_B2_Start) {
        this.doorNo_B2_Start = doorNo_B2_Start;
    }

    public String getDoorNo_B3_Start() {
        return doorNo_B3_Start;
    }

    public void setDoorNo_B3_Start(String doorNo_B3_Start) {
        this.doorNo_B3_Start = doorNo_B3_Start;
    }

    public String getFloorNo_B1_Start() {
        return floorNo_B1_Start;
    }

    public void setFloorNo_B1_Start(String floorNo_B1_Start) {
        this.floorNo_B1_Start = floorNo_B1_Start;
    }

    public String getFloorNo_B2_Start() {
        return floorNo_B2_Start;
    }

    public void setFloorNo_B2_Start(String floorNo_B2_Start) {
        this.floorNo_B2_Start = floorNo_B2_Start;
    }

    public String getDoorNo_B1_End() {
        return doorNo_B1_End;
    }

    public void setDoorNo_B1_End(String doorNo_B1_End) {
        this.doorNo_B1_End = doorNo_B1_End;
    }

    public String getDoorNo_B2_End() {
        return doorNo_B2_End;
    }

    public void setDoorNo_B2_End(String doorNo_B2_End) {
        this.doorNo_B2_End = doorNo_B2_End;
    }

    public String getDoorNo_B3_End() {
        return doorNo_B3_End;
    }

    public void setDoorNo_B3_End(String doorNo_B3_End) {
        this.doorNo_B3_End = doorNo_B3_End;
    }

    public String getFloorNo_B1_End() {
        return floorNo_B1_End;
    }

    public void setFloorNo_B1_End(String floorNo_B1_End) {
        this.floorNo_B1_End = floorNo_B1_End;
    }

    public String getFloorNo_B2_End() {
        return floorNo_B2_End;
    }

    public void setFloorNo_B2_End(String floorNo_B2_End) {
        this.floorNo_B2_End = floorNo_B2_End;
    }

    public String getIsSerial_doorNo_B1() {
        return isSerial_doorNo_B1;
    }

    public void setIsSerial_doorNo_B1(String isSerial_doorNo_B1) {
        this.isSerial_doorNo_B1 = isSerial_doorNo_B1;
    }

    public String getIsSerial_doorNo_B2() {
        return isSerial_doorNo_B2;
    }

    public void setIsSerial_doorNo_B2(String isSerial_doorNo_B2) {
        this.isSerial_doorNo_B2 = isSerial_doorNo_B2;
    }

    public String getIsSerial_doorNo_B3() {
        return isSerial_doorNo_B3;
    }

    public void setIsSerial_doorNo_B3(String isSerial_doorNo_B3) {
        this.isSerial_doorNo_B3 = isSerial_doorNo_B3;
    }

    public String getIsSerial_floorNo_B1() {
        return isSerial_floorNo_B1;
    }

    public void setIsSerial_floorNo_B1(String isSerial_floorNo_B1) {
        this.isSerial_floorNo_B1 = isSerial_floorNo_B1;
    }

    public String getIsSerial_floorNo_B2() {
        return isSerial_floorNo_B2;
    }

    public void setIsSerial_floorNo_B2(String isSerial_floorNo_B2) {
        this.isSerial_floorNo_B2 = isSerial_floorNo_B2;
    }

    public String getRegDoorNum() {
        return regDoorNum;
    }

    public void setRegDoorNum(String regDoorNum) {
        this.regDoorNum = regDoorNum;
    }

    public String getExistDoorNum() {
        return existDoorNum;
    }

    public void setExistDoorNum(String existDoorNum) {
        this.existDoorNum = existDoorNum;
    }

    public String getDoForm() {
        return doForm;
    }

    public void setDoForm(String doForm) {
        this.doForm = doForm;
    }

    public List<Rl01622SDPDTO> getRl01622SDPList() {
        return rl01622SDPList;
    }

    public void setRl01622SDPList(List<Rl01622SDPDTO> rl01622sdpList) {
        rl01622SDPList = rl01622sdpList;
    }

    public List<Rl01622EDPDTO> getRl01622EDPList() {
        return rl01622EDPList;
    }

    public void setRl01622EDPList(List<Rl01622EDPDTO> rl01622edpList) {
        rl01622EDPList = rl01622edpList;
    }

    /**
     * @return the areaSite_A
     */
    public String getAreaSite_A() {
        return areaSite_A;
    }

    /**
     * @param areaSite_A
     *            the areaSite_A to set
     */
    public void setAreaSite_A(String areaSite_A) {
        this.areaSite_A = areaSite_A;
    }

    /**
     * @return the areaSite_B
     */
    public String getAreaSite_B() {
        return areaSite_B;
    }

    /**
     * @param areaSite_B
     *            the areaSite_B to set
     */
    public void setAreaSite_B(String areaSite_B) {
        this.areaSite_B = areaSite_B;
    }

}
