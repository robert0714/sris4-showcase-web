package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang.StringUtils;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldf020mType;
import tw.gov.moi.domain.Rldfs225Type;

/**
 * 
 * @author Mego
 * 
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0x325DTO", propOrder = { "MainDTO", "EditResult", "QuertDto", "SelectData", "Resutlts", "Recored",
        "IsVerify", "CommononType", "verifyData", "leftData", "rightData", "lockData", "unLockData", "title",
        "checkCode", "isVerifyDoor", "status" })
@XmlRootElement(name = "Rl0x325DTO")
public class Rl0x325DTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @XmlElement(name = "MainDTO")
    @FieldName("主檔")
    private Rl0x001DTO mainDTO;

    @XmlElement(name = "EditResult")
    @FieldName("編輯資料")
    private List<Rl0x001DTOResult> editResult = new ArrayList<Rl0x001DTOResult>();

    @XmlElement(name = "QuertDto")
    @FieldName("查詢畫面")
    private List<Rl0x001DTOResult> quertDto = new ArrayList<Rl0x001DTOResult>();

    // 來源資料
    @XmlElement(name = "SelectData")
    @FieldName("來源資料")
    private Rldf020mType selectData = new Rldf020mType();

    @XmlElement(name = "Resutlts")
    @FieldName("查詢結果")
    private List<Rldf020mType> resutlts = new ArrayList<Rldf020mType>();

    @XmlElement(name = "Recored")
    @FieldName("修改紀錄")
    private Rldfs225Type recored = new Rldfs225Type();

    @XmlElement(name = "Reason")
    @FieldName("更正原因")
    private String reason = StringUtils.EMPTY;

    @XmlElement(name = "IsVerify")
    @FieldName("是否驗證過")
    private boolean isVerify = false;

    @XmlElement(name = "CommononType")
    @FieldName("R檔預設值")
    private Rldf020mType commononType = null;

    @XmlElement(name = "VerifyData")
    @FieldName("檢核資料")
    private Rldf020mType verifyData = new Rldf020mType();

    @XmlElement(name = "LeftData")
    @FieldName("左側資料")
    private Rldf020mType leftData = new Rldf020mType();

    @XmlElement(name = "RightData")
    @FieldName("右側資料")
    private Rldf020mType rightData = new Rldf020mType();

    @XmlElement(name = "LockData")
    @FieldName("愈鎖定之資料")
    private Rldf020mType lockData = null;

    @XmlElement(name = "unLockData")
    @FieldName("愈解鎖之鎖定之資料")
    private Rldf020mType unLockData = null;

    @XmlElement(name = "Title")
    @FieldName("標題")
    private String title = "";

    @XmlElement(name = "CheckCode")
    @FieldName("檢查碼")
    private String checkCode = null;

    @XmlElement(name = "IsVerifyDoor")
    @FieldName("是否驗證地址")
    private boolean isVerifyDoor = false;

    @XmlElement(name = "Status")
    @FieldName("驗證狀態")
    private String status = "";

    @XmlElement(name = "QueryType")
    @FieldName("查詢類別")
    private String queryType = "0";

    @XmlElement(name = "QueryDTO")
    @FieldName("查詢條件")
    private RlStreetFullAdressDTO queryDTO = new RlStreetFullAdressDTO();

    @XmlElement(name = "OldAddrTxCode")
    @FieldName("oldAddrTxCode")
    private String oldAddrTxCode;

    @XmlElement(name = "NewAddrTxCode")
    @FieldName("newAddrTxCode")
    private String newAddrTxCode;

    public String getOldAddrTxCode() {
        return oldAddrTxCode;
    }

    public void setOldAddrTxCode(String oldAddrTxCode) {
        this.oldAddrTxCode = oldAddrTxCode;
    }

    public String getNewAddrTxCode() {
        return newAddrTxCode;
    }

    public void setNewAddrTxCode(String newAddrTxCode) {
        this.newAddrTxCode = newAddrTxCode;
    }

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

    public Rl0x001DTO getMainDTO() {
        return mainDTO;
    }

    public void setMainDTO(Rl0x001DTO mainDTO) {
        this.mainDTO = mainDTO;
    }

    public List<Rl0x001DTOResult> getEditResult() {
        return editResult;
    }

    public void setEditResult(List<Rl0x001DTOResult> editResult) {
        this.editResult = editResult;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public List<Rl0x001DTOResult> getQuertDto() {
        return quertDto;
    }

    public void setQuertDto(List<Rl0x001DTOResult> quertDto) {
        this.quertDto = quertDto;
    }

    public Rldf020mType getSelectData() {
        return selectData;
    }

    public void setSelectData(Rldf020mType selectData) {
        this.selectData = selectData;
    }

    public List<Rldf020mType> getResutlts() {
        return resutlts;
    }

    public void setResutlts(List<Rldf020mType> resutlts) {
        this.resutlts = resutlts;
    }

    public Rldf020mType getCommononType() {
        return commononType;
    }

    public void setCommononType(Rldf020mType commononType) {
        this.commononType = commononType;
    }

    public boolean isVerify() {
        return isVerify;
    }

    public void setVerify(boolean isVerify) {
        this.isVerify = isVerify;
    }

    public Rldfs225Type getRecored() {
        return recored;
    }

    public void setRecored(Rldfs225Type recored) {
        this.recored = recored;
    }

    public Rldf020mType getVerifyData() {
        return verifyData;
    }

    public void setVerifyData(Rldf020mType verifyData) {
        this.verifyData = verifyData;
    }

    public Rldf020mType getLeftData() {
        return leftData;
    }

    public void setLeftData(Rldf020mType leftData) {
        this.leftData = leftData;
    }

    public Rldf020mType getRightData() {
        return rightData;
    }

    public void setRightData(Rldf020mType rightData) {
        this.rightData = rightData;
    }

    public Rldf020mType getLockData() {
        return lockData;
    }

    public void setLockData(Rldf020mType lockData) {
        this.lockData = lockData;
    }

    public Rldf020mType getUnLockData() {
        return unLockData;
    }

    public void setUnLockData(Rldf020mType unLockData) {
        this.unLockData = unLockData;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCheckCode() {
        return checkCode;
    }

    public void setCheckCode(String checkCode) {
        this.checkCode = checkCode;
    }

    public boolean isVerifyDoor() {
        return isVerifyDoor;
    }

    public void setVerifyDoor(boolean isVerifyDoor) {
        this.isVerifyDoor = isVerifyDoor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Rl0x325DTO [mainDTO=" + mainDTO + ", editResult=" + editResult + ", quertDto=" + quertDto
                + ", selectData=" + selectData + ", resutlts=" + resutlts + ", reason=" + reason + ", isVerify="
                + isVerify + ", commononType=" + commononType + ", verifyData=" + verifyData + ", leftData=" + leftData
                + ", rightData=" + rightData + ", title=" + title + ", checkCode=" + checkCode + ", isVerifyDoor="
                + isVerifyDoor + ", status=" + status + "]";
    }

}
