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
import tw.gov.moi.domain.Rldf019mType;
import tw.gov.moi.domain.Rldfs224Type;

/**
 * 
 * @author Mego
 * 
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0x324DTO", propOrder = { "MainDTO", "EditResult", "QuertDto", "SelectData", "Resutlts", "Recored",
        "IsVerify", "CommononType", "verifyData", "leftData", "rightData", "lockData", "unLockData", "title",
        "checkCode", "status" })
@XmlRootElement(name = "Rl0x324DTO")
public class Rl0x324DTO implements Serializable {

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
    private Rldf019mType selectData = new Rldf019mType();

    @XmlElement(name = "Resutlts")
    @FieldName("查詢結果")
    private List<Rldf019mType> resutlts = new ArrayList<Rldf019mType>();

    @XmlElement(name = "Recored")
    @FieldName("修改紀錄")
    private Rldfs224Type recored = new Rldfs224Type();

    @XmlElement(name = "Reason")
    @FieldName("更正原因")
    private String reason = StringUtils.EMPTY;

    @XmlElement(name = "IsVerify")
    @FieldName("是否驗證過")
    private boolean isVerify = false;

    @XmlElement(name = "CommononType")
    @FieldName("R檔預設值")
    private Rldf019mType commononType = null;

    @XmlElement(name = "VerifyData")
    @FieldName("檢核資料")
    private Rldf019mType verifyData = new Rldf019mType();

    @XmlElement(name = "LeftData")
    @FieldName("左側資料")
    private Rldf019mType leftData = new Rldf019mType();

    @XmlElement(name = "RightData")
    @FieldName("右側資料")
    private Rldf019mType rightData = new Rldf019mType();

    @XmlElement(name = "LockData")
    @FieldName("愈鎖定之資料")
    private Rldf019mType lockData = null;

    @XmlElement(name = "unLockData")
    @FieldName("愈解鎖之鎖定之資料")
    private Rldf019mType unLockData = null;

    @XmlElement(name = "Title")
    @FieldName("標題")
    private String title = "";

    @XmlElement(name = "CheckCode")
    @FieldName("檢查碼")
    private String checkCode = null;

    @XmlElement(name = "Status")
    @FieldName("驗證狀態")
    private String status = "";

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

    public Rldf019mType getSelectData() {
        return selectData;
    }

    public void setSelectData(Rldf019mType selectData) {
        this.selectData = selectData;
    }

    public List<Rldf019mType> getResutlts() {
        return resutlts;
    }

    public void setResutlts(List<Rldf019mType> resutlts) {
        this.resutlts = resutlts;
    }

    public Rldf019mType getCommononType() {
        return commononType;
    }

    public void setCommononType(Rldf019mType commononType) {
        this.commononType = commononType;
    }

    public boolean isVerify() {
        return isVerify;
    }

    public void setVerify(boolean isVerify) {
        this.isVerify = isVerify;
    }

    public Rldfs224Type getRecored() {
        return recored;
    }

    public void setRecored(Rldfs224Type recored) {
        this.recored = recored;
    }

    public Rldf019mType getVerifyData() {
        return verifyData;
    }

    public void setVerifyData(Rldf019mType verifyData) {
        this.verifyData = verifyData;
    }

    public Rldf019mType getLeftData() {
        return leftData;
    }

    public void setLeftData(Rldf019mType leftData) {
        this.leftData = leftData;
    }

    public Rldf019mType getRightData() {
        return rightData;
    }

    public void setRightData(Rldf019mType rightData) {
        this.rightData = rightData;
    }

    public Rldf019mType getLockData() {
        return lockData;
    }

    public void setLockData(Rldf019mType lockData) {
        this.lockData = lockData;
    }

    public Rldf019mType getUnLockData() {
        return unLockData;
    }

    public void setUnLockData(Rldf019mType unLockData) {
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Rl0x324DTO [mainDTO=" + mainDTO + ", editResult=" + editResult + ", quertDto=" + quertDto
                + ", selectData=" + selectData + ", resutlts=" + resutlts + ", reason=" + reason + ", isVerify="
                + isVerify + ", commononType=" + commononType + ", verifyData=" + verifyData + ", leftData=" + leftData
                + ", rightData=" + rightData + ", title=" + title + ", checkCode=" + checkCode + ", status=" + status
                + "]";
    }

}
