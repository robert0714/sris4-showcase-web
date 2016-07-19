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
import tw.gov.moi.domain.Rldf008mType;
import tw.gov.moi.domain.Rldfs213Type;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0x313DTO", propOrder = { "mainDTO", "editResult", "quertDto", "selectData", "resutlts", "recored",
        "reason", "isVerify", "commononType", "lockData", "unLockData", "checkCode" })
@XmlRootElement(name = "Rl0x313DTO")
public class Rl0x313DTO implements Serializable {

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
    private Rldf008mType selectData = new Rldf008mType();

    @XmlElement(name = "Resutlts")
    @FieldName("查詢結果")
    private List<Rldf008mType> resutlts = new ArrayList<Rldf008mType>();

    @XmlElement(name = "Recored")
    @FieldName("修改紀錄")
    private Rldfs213Type recored = new Rldfs213Type();

    @XmlElement(name = "Reason")
    @FieldName("更正原因")
    private String reason = StringUtils.EMPTY;

    @XmlElement(name = "IsVerify")
    @FieldName("是否驗證過")
    private boolean isVerify = false;

    @XmlElement(name = "CommononType")
    @FieldName("R檔預設值")
    private Rldf008mType commononType = null;

    @XmlElement(name = "LockData")
    @FieldName("於鎖定之資料")
    private Rldf008mType lockData = null;

    @XmlElement(name = "unLockData")
    @FieldName("於解鎖之鎖定之資料")
    private Rldf008mType unLockData = null;

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

    public Rldf008mType getSelectData() {
        return selectData;
    }

    public void setSelectData(Rldf008mType selectData) {
        this.selectData = selectData;
    }

    public List<Rldf008mType> getResutlts() {
        return resutlts;
    }

    public void setResutlts(List<Rldf008mType> resutlts) {
        this.resutlts = resutlts;
    }

    public Rldfs213Type getRecored() {
        return recored;
    }

    public void setRecored(Rldfs213Type recored) {
        this.recored = recored;
    }

    public Rldf008mType getCommononType() {
        return commononType;
    }

    public void setCommononType(Rldf008mType commononType) {
        this.commononType = commononType;
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

    public Rldf008mType getLockData() {
        return lockData;
    }

    public void setLockData(Rldf008mType lockData) {
        this.lockData = lockData;
    }

    public Rldf008mType getUnLockData() {
        return unLockData;
    }

    public void setUnLockData(Rldf008mType unLockData) {
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
