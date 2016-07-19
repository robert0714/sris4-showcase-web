package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rlde401wType;
import tw.gov.moi.domain.Rlde406wType;
import tw.gov.moi.domain.Rldf001mType;
import tw.gov.moi.rl.component.dto.MassMoveVillageDTO;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl04140DTO", propOrder = { "lockId", "updateType", "status", "sync", "rlde401wData", "rldf001mData",
        "newStreetDoorplate" })
@XmlRootElement(name = "Rl04140DTO")
public class Rl04140DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 鎖定交易序號 **/
    @XmlElement(name = "LockId")
    @FieldName("鎖定交易序號")
    private String lockId;

    /** 生效類別 **/
    @XmlElement(name = "UpdateType")
    @FieldName("生效類別")
    private String updateType;

    /** 處理狀態 **/
    @XmlElement(name = "Status")
    @FieldName("處理狀態")
    private String status;

    /** 同步生效 **/
    @XmlElement(name = "Sync")
    @FieldName("同步生效")
    private String sync;

    /** 處理的Rlde401w **/
    @XmlElement(name = "Rlde401wData")
    @FieldName("處理的Rlde401w")
    private Rlde401wType rlde401wData;

    /** 處理的Rlde401w **/
    @XmlElement(name = "Rlde406wData")
    @FieldName("處理的Rlde406w")
    private Rlde406wType rlde406wData;

    /** 處理的Rldf001m **/
    @XmlElement(name = "Rldf001mData")
    @FieldName("處理的Rldf001m")
    private Rldf001mType rldf001mData;

    /** 門牌整編新門牌 **/
    @XmlElement(name = "NewStreetDoorplate")
    @FieldName("門牌整編新門牌")
    private String newStreetDoorplate;

    /** 門牌整編新門牌 **/
    @XmlElement(name = "OldStreetDoorplate")
    @FieldName("門牌整編新門牌")
    private String oldStreetDoorplate;

    /** 門牌整編新門牌分欄 **/
    @XmlElement(name = "NewStreetDoorplateColumn")
    @FieldName("門牌整編新門牌分欄")
    private Rl04140Result newStreetDoorplateColumn;

    private boolean insert018m = true;

    private String modifyStatus;

    private String restoreTransactionId;

    private int insertSeqNo = 0;

    private Map<String, MassMoveVillageDTO> villageMap = new HashMap<String, MassMoveVillageDTO>();

    public boolean isInsert018m() {
        return insert018m;
    }

    public void setInsert018m(boolean insert018m) {
        this.insert018m = insert018m;
    }

    public String getModifyStatus() {
        return modifyStatus;
    }

    public void setModifyStatus(String modifyStatus) {
        this.modifyStatus = modifyStatus;
    }

    public String getRestoreTransactionId() {
        return restoreTransactionId;
    }

    public void setRestoreTransactionId(String restoreTransactionId) {
        this.restoreTransactionId = restoreTransactionId;
    }

    public int getInsertSeqNo() {
        return insertSeqNo;
    }

    public void setInsertSeqNo(int insertSeqNo) {
        this.insertSeqNo = insertSeqNo;
    }

    public Map<String, MassMoveVillageDTO> getVillageMap() {
        return villageMap;
    }

    public void setVillageMap(Map<String, MassMoveVillageDTO> villageMap) {
        this.villageMap = villageMap;
    }

    private Rl04140ObnfDTO obnfDTO = new Rl04140ObnfDTO();

    public String getOldStreetDoorplate() {
        return oldStreetDoorplate;
    }

    public void setOldStreetDoorplate(String oldStreetDoorplate) {
        this.oldStreetDoorplate = oldStreetDoorplate;
    }

    public Rlde406wType getRlde406wData() {
        return rlde406wData;
    }

    public void setRlde406wData(Rlde406wType rlde406wData) {
        this.rlde406wData = rlde406wData;
    }

    public Rl04140ObnfDTO getObnfDTO() {
        return obnfDTO;
    }

    public void setObnfDTO(Rl04140ObnfDTO obnfDTO) {
        this.obnfDTO = obnfDTO;
    }

    /**
     * @return the lockId
     */
    public String getLockId() {
        return lockId;
    }

    /**
     * @param lockId
     *            the lockId to set
     */
    public void setLockId(String lockId) {
        this.lockId = lockId;
    }

    /**
     * @return the updateType
     */
    public String getUpdateType() {
        return updateType;
    }

    /**
     * @param updateType
     *            the updateType to set
     */
    public void setUpdateType(String updateType) {
        this.updateType = updateType;
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

    /**
     * @return the sync
     */
    public String getSync() {
        return sync;
    }

    /**
     * @param sync
     *            the sync to set
     */
    public void setSync(String sync) {
        this.sync = sync;
    }

    /**
     * @return the rlde401wData
     */
    public Rlde401wType getRlde401wData() {
        return rlde401wData;
    }

    /**
     * @param rlde401wData
     *            the rlde401wData to set
     */
    public void setRlde401wData(Rlde401wType rlde401wData) {
        this.rlde401wData = rlde401wData;
    }

    /**
     * @return the rldf001mData
     */
    public Rldf001mType getRldf001mData() {
        return rldf001mData;
    }

    /**
     * @param rldf001mData
     *            the rldf001mData to set
     */
    public void setRldf001mData(Rldf001mType rldf001mData) {
        this.rldf001mData = rldf001mData;
    }

    /**
     * @return the newStreetDoorplate
     */
    public String getNewStreetDoorplate() {
        return newStreetDoorplate;
    }

    /**
     * @param newStreetDoorplate
     *            the newStreetDoorplate to set
     */
    public void setNewStreetDoorplate(String newStreetDoorplate) {
        this.newStreetDoorplate = newStreetDoorplate;
    }

    /**
     * @return the newStreetDoorplateColumn
     */
    public Rl04140Result getNewStreetDoorplateColumn() {
        return newStreetDoorplateColumn;
    }

    /**
     * @param newStreetDoorplateColumn
     *            the newStreetDoorplateColumn to set
     */
    public void setNewStreetDoorplateColumn(Rl04140Result newStreetDoorplateColumn) {
        this.newStreetDoorplateColumn = newStreetDoorplateColumn;
    }

}
