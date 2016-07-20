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
@XmlType(name = "rl03550DTO", propOrder = { "village", "neighbor", "streetDoorplate", "registerYyymmdd",
        "startVillage", "startNeighbor", "startStreetDoorplate", "startrRegisterYyymmdd", "registerKind", "modifyKind",
        "status", "queryDoorplate", "queryNote", "selectNewOld", "tabIndex", "selectedRl03551DTO",
        "selectedRl03552DTO", "rl03551List", "rl03552List", "rl03553List", "firstHistoryRecord" })
@XmlRootElement(name = "Rl03550DTO")
public class Rl03550DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 村里 */
    @XmlElement(name = "Village")
    @FieldName("村里")
    private String village = "";

    /** 鄰 */
    @XmlElement(name = "Neighbor")
    @FieldName("鄰")
    private String neighbor = "";

    /** 街路門牌 */
    @XmlElement(name = "StreetDoorplate")
    @FieldName("街路門牌")
    private String streetDoorplate = "";

    /** 編釘日期 */
    @XmlElement(name = "RegisterYyymmdd")
    @FieldName("編釘日期")
    private String registerYyymmdd = "";

    /** 最初村里 */
    @XmlElement(name = "StartVillage")
    @FieldName("最初村里")
    private String startVillage = "";

    /** 最初鄰 */
    @XmlElement(name = "StartNeighbor")
    @FieldName("最初鄰")
    private String startNeighbor = "";

    /** 最初街路門牌 */
    @XmlElement(name = "StartStreetDoorplate")
    @FieldName("最初街路門牌")
    private String startStreetDoorplate = "";

    /** 最初編釘日期 */
    @XmlElement(name = "StartRegisterYyymmdd")
    @FieldName("最初編釘日期")
    private String startRegisterYyymmdd = "";

    /** 編釘類別 */
    @XmlElement(name = "RegisterKind")
    @FieldName("編釘類別")
    private String registerKind = "";

    /** 異動類別 */
    @XmlElement(name = "ModifyKind")
    @FieldName("異動類別")
    private String modifyKind = "";

    /** 處理狀態 */
    @XmlElement(name = "Status")
    @FieldName("處理狀態")
    private String status = "";

    /** 查詢門牌 */
    @XmlElement(name = "QueryDoorplate")
    @FieldName("查詢門牌")
    private String queryDoorplate = "";

    /** 查詢備註 */
    @XmlElement(name = "QueryNote")
    @FieldName("查詢備註")
    private String queryNote = "";

    /** 選擇門牌新舊註記 */
    @XmlElement(name = "SelectNewOld")
    @FieldName("選擇門牌新舊註記")
    private String selectNewOld = "";

    /** 標籤 */
    @XmlElement(name = "TabIndex")
    @FieldName("標籤 ")
    private String tabIndex = "0";

    /** 使用者選取的3551DTO */
    @XmlElement(name = "SelectedRl03551DTO")
    @FieldName("使用者選取的3551DTO")
    private Rl03551DTO selectedRl03551DTO = new Rl03551DTO();

    /** 使用者選取的3552DTO */
    @XmlElement(name = "SelectedRl03552DTO")
    @FieldName("使用者選取的3552DTO")
    private Rl03552DTO selectedRl03552DTO = new Rl03552DTO();

    /** 選擇門牌清單 */
    @XmlElement(name = "Rl03551List")
    @FieldName("選擇門牌清單")
    private List<Rl03551DTO> rl03551List = new ArrayList<Rl03551DTO>(0);

    /** 門牌歷史資料串聯選擇門牌清單 */
    @XmlElement(name = "Rl03552List")
    @FieldName("門牌歷史資料串聯選擇門牌清單")
    private List<Rl03552DTO> rl03552List = new ArrayList<Rl03552DTO>(0);

    /** 結果列表清單 */
    @XmlElement(name = "Rl03553List")
    @FieldName("結果列表清單")
    private List<Rl03553DTO> rl03553List = new ArrayList<Rl03553DTO>(0);

    private RlStreetSerialDataDTO rlStreetSerialDataDTO;

    @XmlElement(name = "QueryType")
    @FieldName("查詢類別")
    private String queryType = "0";

    public String getQueryType() {
        return queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public RlStreetSerialDataDTO getRlStreetSerialDataDTO() {
        return rlStreetSerialDataDTO;
    }

    public void setRlStreetSerialDataDTO(RlStreetSerialDataDTO rlStreetSerialDataDTO) {
        this.rlStreetSerialDataDTO = rlStreetSerialDataDTO;
    }

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

    public String getStreetDoorplate() {
        return streetDoorplate;
    }

    public void setStreetDoorplate(String streetDoorplate) {
        this.streetDoorplate = streetDoorplate;
    }

    public String getRegisterYyymmdd() {
        return registerYyymmdd;
    }

    public void setRegisterYyymmdd(String registerYyymmdd) {
        this.registerYyymmdd = registerYyymmdd;
    }

    public String getModifyKind() {
        return modifyKind;
    }

    public void setModifyKind(String modifyKind) {
        this.modifyKind = modifyKind;
    }

    public String getRegisterKind() {
        return registerKind;
    }

    public void setRegisterKind(String registerKind) {
        this.registerKind = registerKind;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Rl03551DTO> getRl03551List() {
        return rl03551List;
    }

    public void setRl03551List(List<Rl03551DTO> rl03551List) {
        this.rl03551List = rl03551List;
    }

    public List<Rl03552DTO> getRl03552List() {
        return rl03552List;
    }

    public void setRl03552List(List<Rl03552DTO> rl03552List) {
        this.rl03552List = rl03552List;
    }

    public List<Rl03553DTO> getRl03553List() {
        return rl03553List;
    }

    public void setRl03553List(List<Rl03553DTO> rl03553List) {
        this.rl03553List = rl03553List;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public String getTabIndex() {
        return tabIndex;
    }

    public void setTabIndex(String tabIndex) {
        this.tabIndex = tabIndex;
    }

    public Rl03551DTO getSelectedRl03551DTO() {
        return selectedRl03551DTO;
    }

    public void setSelectedRl03551DTO(Rl03551DTO selectedRl03551DTO) {
        this.selectedRl03551DTO = selectedRl03551DTO;
    }

    public Rl03552DTO getSelectedRl03552DTO() {
        return selectedRl03552DTO;
    }

    public void setSelectedRl03552DTO(Rl03552DTO selectedRl03552DTO) {
        this.selectedRl03552DTO = selectedRl03552DTO;
    }

    public String getQueryDoorplate() {
        return queryDoorplate;
    }

    public void setQueryDoorplate(String queryDoorplate) {
        this.queryDoorplate = queryDoorplate;
    }

    public String getQueryNote() {
        return queryNote;
    }

    public void setQueryNote(String queryNote) {
        this.queryNote = queryNote;
    }

    public String getSelectNewOld() {
        return selectNewOld;
    }

    public void setSelectNewOld(String selectNewOld) {
        this.selectNewOld = selectNewOld;
    }

    public String getStartVillage() {
        return startVillage;
    }

    public void setStartVillage(String startVillage) {
        this.startVillage = startVillage;
    }

    public String getStartNeighbor() {
        return startNeighbor;
    }

    public void setStartNeighbor(String startNeighbor) {
        this.startNeighbor = startNeighbor;
    }

    public String getStartStreetDoorplate() {
        return startStreetDoorplate;
    }

    public void setStartStreetDoorplate(String startStreetDoorplate) {
        this.startStreetDoorplate = startStreetDoorplate;
    }

    public String getStartRegisterYyymmdd() {
        return startRegisterYyymmdd;
    }

    public void setStartRegisterYyymmdd(String startRegisterYyymmdd) {
        this.startRegisterYyymmdd = startRegisterYyymmdd;
    }

    // public Rl03550DTORecord getFirstHistoryRecord() {
    // return firstHistoryRecord;
    // }
    //
    // public void setFirstHistoryRecord(Rl03550DTORecord firstHistoryRecord) {
    // this.firstHistoryRecord = firstHistoryRecord;
    // }

}
