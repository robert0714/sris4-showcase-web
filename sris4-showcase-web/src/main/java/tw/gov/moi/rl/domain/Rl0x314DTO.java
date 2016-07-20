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
import tw.gov.moi.domain.Rldf008hType;
import tw.gov.moi.domain.Rldfs214Type;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0x314DTO", propOrder = { "mainDTO", "editResult", "quertDto", "selectData", "resutlts", "recored",
        "reason", "isVerify", "commononType", "lockData", "unLockData", "checkCode" })
@XmlRootElement(name = "Rl0x314DTO")
public class Rl0x314DTO implements Serializable {

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
    private Rldf008hType selectData = new Rldf008hType();

    @XmlElement(name = "Resutlts")
    @FieldName("查詢結果")
    private List<Rldf008hType> resutlts = new ArrayList<Rldf008hType>();

    @XmlElement(name = "Recored")
    @FieldName("修改紀錄")
    private Rldfs214Type recored = new Rldfs214Type();

    @XmlElement(name = "Reason")
    @FieldName("更正原因")
    private String reason = StringUtils.EMPTY;

    @XmlElement(name = "IsVerify")
    @FieldName("是否驗證過")
    private boolean isVerify = false;

    @XmlElement(name = "CommononType")
    @FieldName("R檔預設值")
    private Rldf008hType commononType = null;

    @XmlElement(name = "LockData")
    @FieldName("愈鎖定之資料")
    private Rldf008hType lockData = null;

    @XmlElement(name = "unLockData")
    @FieldName("愈解鎖之鎖定之資料")
    private Rldf008hType unLockData = null;

    @XmlElement(name = "Title")
    @FieldName("標題")
    private String title = "";

    @XmlElement(name = "CheckCode")
    @FieldName("檢查碼")
    private String checkCode = null;

    public Rl0x001DTO getMainDTO() {
        return mainDTO;
    }

    public void setMainDTO(Rl0x001DTO mainDTO) {
        this.mainDTO = mainDTO;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getReason() {
        return reason;
    }

    public boolean isVerify() {
        return isVerify;
    }

    public void setVerify(boolean isVerify) {
        this.isVerify = isVerify;
    }

    public Rldfs214Type getRecored() {
        return recored;
    }

    public void setRecored(Rldfs214Type recored) {
        this.recored = recored;
    }

    public List<Rl0x001DTOResult> getEditResult() {
        return editResult;
    }

    public void setEditResult(List<Rl0x001DTOResult> editResult) {
        this.editResult = editResult;
    }

    public List<Rl0x001DTOResult> getQuertDto() {
        return quertDto;
    }

    public void setQuertDto(List<Rl0x001DTOResult> quertDto) {
        this.quertDto = quertDto;
    }

    public Rldf008hType getSelectData() {
        return selectData;
    }

    public void setSelectData(Rldf008hType selectData) {
        this.selectData = selectData;
    }

    public List<Rldf008hType> getResutlts() {
        return resutlts;
    }

    public void setResutlts(List<Rldf008hType> resutlts) {
        this.resutlts = resutlts;
    }

    public Rldf008hType getCommononType() {
        return commononType;
    }

    public void setCommononType(Rldf008hType commononType) {
        this.commononType = commononType;
    }

    public Rldf008hType getLockData() {
        return lockData;
    }

    public void setLockData(Rldf008hType lockData) {
        this.lockData = lockData;
    }

    public Rldf008hType getUnLockData() {
        return unLockData;
    }

    public void setUnLockData(Rldf008hType unLockData) {
        this.unLockData = unLockData;
    }

    public String getCheckCode() {
        return checkCode;
    }

    public void setCheckCode(String checkCode) {
        this.checkCode = checkCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
