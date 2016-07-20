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
import tw.gov.moi.domain.Rldf047mType;
import tw.gov.moi.domain.Rldfs215Type;

/**
 * 姓名羅馬拼音紀錄職權更正DTO
 * 
 * @author Derek
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0x315DTO", propOrder = { "mainDTO", "editResult", "quertDto", "selectData", "resutlts", "recored",
        "reason", "isVerify", "commononType", "lockData", "unLockData", "title", "applyItem", "checkCode" })
@XmlRootElement(name = "Rl0x315DTO")
public class Rl0x315DTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @XmlElement(name = "MainDTO")
    @FieldName("查詢結果")
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
    private Rldf047mType selectData = new Rldf047mType();

    @XmlElement(name = "Resutlts")
    @FieldName("查詢結果")
    private List<Rldf047mType> resutlts = new ArrayList<Rldf047mType>();

    @XmlElement(name = "Recored")
    @FieldName("修改紀錄")
    private Rldfs215Type recored = new Rldfs215Type();

    @XmlElement(name = "Reason")
    @FieldName("更正原因")
    private String reason = "";

    @XmlElement(name = "IsVerify")
    @FieldName("是否驗證過")
    private boolean isVerify = false;

    @XmlElement(name = "CommononType")
    @FieldName("R檔預設值")
    private Rldf047mType commononType = null;

    @XmlElement(name = "LockData")
    @FieldName("欲鎖定之資料")
    private Rldf047mType lockData = null;

    @XmlElement(name = "unLockData")
    @FieldName("欲解鎖之鎖定之資料")
    private Rldf047mType unLockData = null;

    @XmlElement(name = "Title")
    @FieldName("標題")
    private String title = "";

    @XmlElement(name = "ApplyItem")
    @FieldName("申請事項")
    private String applyItem = "";

    /**
     * 檢查是否資料有變化
     */
    @XmlElement(name = "CheckCode")
    @FieldName("檢查碼")
    private String checkCode = null;

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

    public List<Rl0x001DTOResult> getQuertDto() {
        return quertDto;
    }

    public void setQuertDto(List<Rl0x001DTOResult> quertDto) {
        this.quertDto = quertDto;
    }

    public Rldf047mType getSelectData() {
        return selectData;
    }

    public void setSelectData(Rldf047mType selectData) {
        this.selectData = selectData;
    }

    public List<Rldf047mType> getResutlts() {
        return resutlts;
    }

    public void setResutlts(List<Rldf047mType> resutlts) {
        this.resutlts = resutlts;
    }

    public Rldfs215Type getRecored() {
        return recored;
    }

    public void setRecored(Rldfs215Type recored) {
        this.recored = recored;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public boolean isVerify() {
        return isVerify;
    }

    public void setVerify(boolean isVerify) {
        this.isVerify = isVerify;
    }

    public Rldf047mType getCommononType() {
        return commononType;
    }

    public void setCommononType(Rldf047mType commononType) {
        this.commononType = commononType;
    }

    public Rldf047mType getLockData() {
        return lockData;
    }

    public void setLockData(Rldf047mType lockData) {
        this.lockData = lockData;
    }

    public Rldf047mType getUnLockData() {
        return unLockData;
    }

    public void setUnLockData(Rldf047mType unLockData) {
        this.unLockData = unLockData;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getApplyItem() {
        return applyItem;
    }

    public void setApplyItem(String applyItem) {
        this.applyItem = applyItem;
    }

    public String getCheckCode() {
        return checkCode;
    }

    public void setCheckCode(String checkCode) {
        this.checkCode = checkCode;
    }

}
