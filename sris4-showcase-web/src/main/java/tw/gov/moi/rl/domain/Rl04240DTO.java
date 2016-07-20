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
import tw.gov.moi.domain.Rlde406wType;
import tw.gov.moi.domain.Rlde407wType;
import tw.gov.moi.domain.Rldf001mType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl04240DTO", propOrder = { "lockId", "updateType", "status", "rlde406wData", "rlde407wData",
        "rldf001mData" })
@XmlRootElement(name = "Rl04240DTO")
public class Rl04240DTO implements Serializable {

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

    /** 處理的Rlde406w **/
    @XmlElement(name = "Rlde406wData")
    @FieldName("處理的Rlde406w")
    private Rlde406wType rlde406wData;

    /** 處理的Rlde407w **/
    @XmlElement(name = "Rlde407wData")
    @FieldName("處理的Rlde407w")
    private Rlde407wType rlde407wData;

    /** 處理的Rldf001m **/
    @XmlElement(name = "Rldf001mData")
    @FieldName("處理的Rldf001m")
    private Rldf001mType rldf001mData;

    /** 處理的Rldf001m **/
    @XmlElement(name = "CollectDTO")
    @FieldName("要存的資料")
    private Rl04240ObnfDTO collectDTO = new Rl04240ObnfDTO();

    private List<String> keys = new ArrayList<String>();

    public List<String> getKeys() {
        return keys;
    }

    public void setKeys(List<String> keys) {
        this.keys = keys;
    }

    private Rl04810DTORecode rl04240DTORecode = new Rl04810DTORecode();

    private RlCompositeDTO pathRec = new RcPanelCompositeDTO();

    public RlCompositeDTO getPathRec() {
        return pathRec;
    }

    public void setPathRec(RlCompositeDTO pathRec) {
        this.pathRec = pathRec;
    }

    public Rl04240ObnfDTO getCollectDTO() {
        return collectDTO;
    }

    public void setCollectDTO(Rl04240ObnfDTO collectDTO) {
        this.collectDTO = collectDTO;
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
     * @return the rlde406wData
     */
    public Rlde406wType getRlde406wData() {
        return rlde406wData;
    }

    /**
     * @param rlde406wData
     *            the rlde406wData to set
     */
    public void setRlde406wData(Rlde406wType rlde406wData) {
        this.rlde406wData = rlde406wData;
    }

    /**
     * @return the rlde407wData
     */
    public Rlde407wType getRlde407wData() {
        return rlde407wData;
    }

    /**
     * @param rlde407wData
     *            the rlde407wData to set
     */
    public void setRlde407wData(Rlde407wType rlde407wData) {
        this.rlde407wData = rlde407wData;
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

    public Rl04810DTORecode getRl04240DTORecode() {
        return rl04240DTORecode;
    }

    public void setRl04240DTORecode(Rl04810DTORecode rl04240dtoRecode) {
        rl04240DTORecode = rl04240dtoRecode;
    }

}
