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
import tw.gov.moi.domain.Rldfs175Type;

/**
 * 
 * @author Andy
 * 
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0x475DTO", propOrder = { "MainDTO", "EditResult", "QuertDto", "SelectData", "Resutlts", "Recored",
        "IsVerify", "CommononType", "lockData", "LockData", "Title", "CheckCode" })
@XmlRootElement(name = "Rl0x475DTO")
public class Rl0x475DTO implements Serializable {

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
    private Object selectData = new Object();

    @XmlElement(name = "Resutlts")
    @FieldName("查詢結果")
    private List<Object> resutlts = new ArrayList<Object>();

    @XmlElement(name = "Recored")
    @FieldName("修改紀錄")
    private Rldfs175Type recored = new Rldfs175Type();

    @XmlElement(name = "Reason")
    @FieldName("更正原因")
    private String reason = StringUtils.EMPTY;

    @XmlElement(name = "IsVerify")
    @FieldName("是否驗證過")
    private boolean isVerify = false;

    @XmlElement(name = "CommononType")
    @FieldName("R檔預設值")
    private Object commononType = null;

    @XmlElement(name = "LockData")
    @FieldName("愈鎖定之資料")
    private Object lockData = null;

    @XmlElement(name = "unLockData")
    @FieldName("愈解鎖之鎖定之資料")
    private Object unLockData = null;

    @XmlElement(name = "Title")
    @FieldName("標題")
    private String title = "";

    @XmlElement(name = "CheckCode")
    @FieldName("檢查碼")
    private String checkCode = "";

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

    public Object getSelectData() {
        return selectData;
    }

    public void setSelectData(Object selectData) {
        this.selectData = selectData;
    }

    public List<Object> getResutlts() {
        return resutlts;
    }

    public void setResutlts(List<Object> resutlts) {
        this.resutlts = resutlts;
    }

    public Object getCommononType() {
        return commononType;
    }

    public void setCommononType(Object commononType) {
        this.commononType = commononType;
    }

    public boolean isVerify() {
        return isVerify;
    }

    public void setVerify(boolean isVerify) {
        this.isVerify = isVerify;
    }

    public Rldfs175Type getRecored() {
        return recored;
    }

    public void setRecored(Rldfs175Type recored) {
        this.recored = recored;
    }

    public Object getLockData() {
        return lockData;
    }

    public void setLockData(Object lockData) {
        this.lockData = lockData;
    }

    public Object getUnLockData() {
        return unLockData;
    }

    public void setUnLockData(Object unLockData) {
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

    @Override
    public String toString() {
        return "Rl0x475DTO [mainDTO=" + mainDTO + ", editResult=" + editResult + ", quertDto=" + quertDto
                + ", selectData=" + selectData + ", resutlts=" + resutlts + ", recored=" + recored + ", reason="
                + reason + ", isVerify=" + isVerify + ", commononType=" + commononType + ", lockData=" + lockData
                + ", unLockData=" + unLockData + ", title=" + title + ", checkCode=" + checkCode + "]";
    }

}
