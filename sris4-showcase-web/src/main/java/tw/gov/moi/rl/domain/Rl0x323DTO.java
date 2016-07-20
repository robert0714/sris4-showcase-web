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
import tw.gov.moi.domain.Rldf018mType;
import tw.gov.moi.domain.Rldfs223Type;
import tw.gov.moi.domain.Rldfv007Type;

/**
 * 
 * @author Mego
 * 
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0x323DTO", propOrder = { "mainDTO", "editResult", "quertDto", "selectData", "resutlts", "recored",
        "isVerify", "commononType", "verifyData", "leftData", "rightData", "lockData", "unLockData", "title",
        "checkCode", "isVerifyDoor", "status" })
@XmlRootElement(name = "Rl0x323DTO")
public class Rl0x323DTO implements Serializable {

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
    private Rldf018mType selectData = new Rldf018mType();

    @XmlElement(name = "Resutlts")
    @FieldName("查詢結果")
    private List<Rldf018mType> resutlts = new ArrayList<Rldf018mType>();

    @XmlElement(name = "Recored")
    @FieldName("修改紀錄")
    private Rldfs223Type recored = new Rldfs223Type();

    @XmlElement(name = "Reason")
    @FieldName("更正原因")
    private String reason = StringUtils.EMPTY;

    @XmlElement(name = "IsVerify")
    @FieldName("是否驗證過")
    private boolean isVerify = false;

    @XmlElement(name = "CommononType")
    @FieldName("R檔預設值")
    private Rldf018mType commononType = null;

    @XmlElement(name = "VerifyData")
    @FieldName("檢核資料")
    private Rldf018mType verifyData = new Rldf018mType();

    @XmlElement(name = "LeftData")
    @FieldName("左側資料")
    private Rldf018mType leftData = new Rldf018mType();

    @XmlElement(name = "RightData")
    @FieldName("右側資料")
    private Rldf018mType rightData = new Rldf018mType();

    @XmlElement(name = "LockData")
    @FieldName("愈鎖定之資料")
    private Rldf018mType lockData = null;

    @XmlElement(name = "unLockData")
    @FieldName("愈解鎖之鎖定之資料")
    private Rldf018mType unLockData = null;

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

    private String areaCode = "";

    private List<Rldfv007Type> rldfv007s = new ArrayList<Rldfv007Type>();

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public List<Rldfv007Type> getRldfv007s() {
        return rldfv007s;
    }

    public void setRldfv007s(List<Rldfv007Type> rldfv007s) {
        this.rldfv007s = rldfv007s;
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

    public Rldf018mType getSelectData() {
        return selectData;
    }

    public void setSelectData(Rldf018mType selectData) {
        this.selectData = selectData;
    }

    public List<Rldf018mType> getResutlts() {
        return resutlts;
    }

    public void setResutlts(List<Rldf018mType> resutlts) {
        this.resutlts = resutlts;
    }

    public Rldf018mType getCommononType() {
        return commononType;
    }

    public void setCommononType(Rldf018mType commononType) {
        this.commononType = commononType;
    }

    public boolean isVerify() {
        return isVerify;
    }

    public void setVerify(boolean isVerify) {
        this.isVerify = isVerify;
    }

    public Rldfs223Type getRecored() {
        return recored;
    }

    public void setRecored(Rldfs223Type recored) {
        this.recored = recored;
    }

    public Rldf018mType getVerifyData() {
        return verifyData;
    }

    public void setVerifyData(Rldf018mType verifyData) {
        this.verifyData = verifyData;
    }

    public Rldf018mType getLeftData() {
        return leftData;
    }

    public void setLeftData(Rldf018mType leftData) {
        this.leftData = leftData;
    }

    public Rldf018mType getRightData() {
        return rightData;
    }

    public void setRightData(Rldf018mType rightData) {
        this.rightData = rightData;
    }

    public Rldf018mType getLockData() {
        return lockData;
    }

    public void setLockData(Rldf018mType lockData) {
        this.lockData = lockData;
    }

    public Rldf018mType getUnLockData() {
        return unLockData;
    }

    public void setUnLockData(Rldf018mType unLockData) {
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
        return "Rl0x323DTO [mainDTO=" + mainDTO + ", editResult=" + editResult + ", quertDto=" + quertDto
                + ", selectData=" + selectData + ", resutlts=" + resutlts + ", reason=" + reason + ", isVerify="
                + isVerify + ", commononType=" + commononType + ", verifyData=" + verifyData + ", leftData=" + leftData
                + ", rightData=" + rightData + ", title=" + title + ", checkCode=" + checkCode + ", isVerifyDoor="
                + isVerifyDoor + ", status=" + status + "]";
    }

}
