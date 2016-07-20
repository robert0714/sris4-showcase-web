package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlElement;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rlde401wType;
import tw.gov.moi.domain.Rlde413wType;
import tw.gov.moi.domain.Rldf001mType;
import tw.gov.moi.domain.Rldf004mType;
import tw.gov.moi.domain.Rldf004nType;
import tw.gov.moi.rl.component.dto.MassMoveVillageDTO;

public class Rl04140NewSaveDTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /** 處理的Rlde401w **/
    @XmlElement(name = "Rlde401wData")
    @FieldName("處理的Rlde401w")
    private Rlde401wType rlde401wData;

    @XmlElement(name = "insertSeqNo")
    @FieldName("insertSeqNo")
    private int insertSeqNo = 0;

    private boolean isSynchronous = false;

    /** 處理的Rlde401w **/
    @XmlElement(name = "rldf001mType")
    @FieldName("處理的rldf001mType")
    private Rldf001mType rldf001mType;

    /** 處理的Rldf004mType **/
    @XmlElement(name = "rldf004mType")
    @FieldName("處理的rldf004mType")
    private Rldf004mType rldf004mType;

    /** 處理的Rldf004mType **/
    @XmlElement(name = "rldf004nType")
    @FieldName("處理的rldf004nType")
    private Rldf004nType rldf004nType;

    // /** 門牌整編新門牌分欄 **/
    // @XmlElement(name = "NewStreetDoorplateColumn")
    // @FieldName("門牌整編新舊門牌分欄")
    // private Rl04140Result historyStreetDoorplateColumn;

    private String modifyStatus = "";

    private Rl04140SaveResultDTO oldStrrtColumns = new Rl04140SaveResultDTO();
    private Rl04140SaveResultDTO newStrrtColumns = new Rl04140SaveResultDTO();

    private boolean isInsert018m = false;

    // ###################################//
    // 記事
    // ###################################//
    private String oldVillage = "";
    private String oldNeighbor = "";
    private String modifyDate = "";

    private Rlde413wType rlde413w = null;

    public Rl04140SaveResultDTO getOldStrrtColumns() {
        return oldStrrtColumns;
    }

    public void setOldStrrtColumns(Rl04140SaveResultDTO oldStrrtColumns) {
        this.oldStrrtColumns = oldStrrtColumns;
    }

    public Rl04140SaveResultDTO getNewStrrtColumns() {
        return newStrrtColumns;
    }

    public void setNewStrrtColumns(Rl04140SaveResultDTO newStrrtColumns) {
        this.newStrrtColumns = newStrrtColumns;
    }

    public boolean isInsert018m() {
        return isInsert018m;
    }

    public void setInsert018m(boolean isInsert018m) {
        this.isInsert018m = isInsert018m;
    }

    public Rldf004nType getRldf004nType() {
        return rldf004nType;
    }

    public void setRldf004nType(Rldf004nType rldf004nType) {
        this.rldf004nType = rldf004nType;
    }

    public Rlde413wType getRlde413w() {
        return rlde413w;
    }

    public void setRlde413w(Rlde413wType rlde413w) {
        this.rlde413w = rlde413w;
    }

    public String getOldVillage() {
        return oldVillage;
    }

    public void setOldVillage(String oldVillage) {
        this.oldVillage = oldVillage;
    }

    public String getOldNeighbor() {
        return oldNeighbor;
    }

    public void setOldNeighbor(String oldNeighbor) {
        this.oldNeighbor = oldNeighbor;
    }

    public String getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
    }

    private Map<String, MassMoveVillageDTO> villageMap = new HashMap<String, MassMoveVillageDTO>();

    public Rldf004mType getRldf004mType() {
        return rldf004mType;
    }

    public void setRldf004mType(Rldf004mType rldf004mType) {
        this.rldf004mType = rldf004mType;
    }

    public Map<String, MassMoveVillageDTO> getVillageMap() {
        return villageMap;
    }

    public void setVillageMap(Map<String, MassMoveVillageDTO> villageMap) {
        this.villageMap = villageMap;
    }

    public boolean isSynchronous() {
        return isSynchronous;
    }

    public void setSynchronous(boolean isSynchronous) {
        this.isSynchronous = isSynchronous;
    }

    // public Rl04140Result getHistoryStreetDoorplateColumn() {
    // return historyStreetDoorplateColumn;
    // }
    //
    // public void setHistoryStreetDoorplateColumn(Rl04140Result
    // historyStreetDoorplateColumn) {
    // this.historyStreetDoorplateColumn = historyStreetDoorplateColumn;
    // }

    public Rlde401wType getRlde401wData() {
        return rlde401wData;
    }

    public void setRlde401wData(Rlde401wType rlde401wData) {
        this.rlde401wData = rlde401wData;
    }

    public int getInsertSeqNo() {
        return insertSeqNo;
    }

    public void setInsertSeqNo(int insertSeqNo) {
        this.insertSeqNo = insertSeqNo;
    }

    public Rldf001mType getRldf001mType() {
        return rldf001mType;
    }

    public void setRldf001mType(Rldf001mType rldf001mType) {
        this.rldf001mType = rldf001mType;
    }

    public String getModifyStatus() {
        return modifyStatus;
    }

    public void setModifyStatus(String modifyStatus) {
        this.modifyStatus = modifyStatus;
    }

}
