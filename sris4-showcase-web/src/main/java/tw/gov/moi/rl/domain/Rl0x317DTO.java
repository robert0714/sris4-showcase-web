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
import tw.gov.moi.domain.Rldfm03mType;
import tw.gov.moi.domain.Rldfs217Type;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0x317DTO", propOrder = { "mainDTO", "editResult", "quertDto", "selectData", "resutlts", "recored",
        "reason", "isVerify", "commononType", "lockData", "unLockData" })
@XmlRootElement(name = "Rl0x317DTO")
public class Rl0x317DTO implements Serializable {

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
    private Rldfm03mType selectData = new Rldfm03mType();

    @XmlElement(name = "Resutlts")
    @FieldName("查詢結果")
    private List<Rldfm03mType> resutlts = new ArrayList<Rldfm03mType>();

    @XmlElement(name = "Recored")
    @FieldName("修改紀錄")
    private Rldfs217Type recored = new Rldfs217Type();

    @XmlElement(name = "Reason")
    @FieldName("更正原因")
    private String reason = StringUtils.EMPTY;

    @XmlElement(name = "IsVerify")
    @FieldName("是否驗證過")
    private boolean isVerify = false;

    @XmlElement(name = "CommononType")
    @FieldName("R檔預設值")
    private Rldfm03mType commononType = null;

    @XmlElement(name = "LockData")
    @FieldName("愈鎖定之資料")
    private Rldfm03mType lockData = null;

    @XmlElement(name = "unLockData")
    @FieldName("愈解鎖之鎖定之資料")
    private Rldfm03mType unLockData = null;

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

    public Rldfs217Type getRecored() {
        return recored;
    }

    public void setRecored(Rldfs217Type recored) {
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

    public Rldfm03mType getSelectData() {
        return selectData;
    }

    public void setSelectData(Rldfm03mType selectData) {
        this.selectData = selectData;
    }

    public List<Rldfm03mType> getResutlts() {
        return resutlts;
    }

    public void setResutlts(List<Rldfm03mType> resutlts) {
        this.resutlts = resutlts;
    }

    public Rldfm03mType getCommononType() {
        return commononType;
    }

    public void setCommononType(Rldfm03mType commononType) {
        this.commononType = commononType;
    }

    public Rldfm03mType getLockData() {
        return lockData;
    }

    public void setLockData(Rldfm03mType lockData) {
        this.lockData = lockData;
    }

    public Rldfm03mType getUnLockData() {
        return unLockData;
    }

    public void setUnLockData(Rldfm03mType unLockData) {
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
