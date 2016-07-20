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
import tw.gov.moi.domain.Rcdf001mrlType;
import tw.gov.moi.domain.Rldfs226Type;

/**
 * 
 * @author Andy
 * 
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0x326DTO", propOrder = { "MainDTO", "EditResult", "QuertDto", "SelectData", "Resutlts", "Recored",
        "IsVerify", "CommononType", "lockData", "LockData" })
@XmlRootElement(name = "Rl0x326DTO")
public class Rl0x326DTO implements Serializable {

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
    private Rcdf001mrlType selectData = new Rcdf001mrlType();

    @XmlElement(name = "Resutlts")
    @FieldName("查詢結果")
    private List<Rcdf001mrlType> resutlts = new ArrayList<Rcdf001mrlType>();

    @XmlElement(name = "Recored")
    @FieldName("修改紀錄")
    private Rldfs226Type recored = new Rldfs226Type();

    @XmlElement(name = "Reason")
    @FieldName("更正原因")
    private String reason = StringUtils.EMPTY;

    @XmlElement(name = "IsVerify")
    @FieldName("是否驗證過")
    private boolean isVerify = false;

    @XmlElement(name = "CommononType")
    @FieldName("R檔預設值")
    private Rcdf001mrlType commononType = null;

    @XmlElement(name = "LockData")
    @FieldName("愈鎖定之資料")
    private Rcdf001mrlType lockData = null;

    @XmlElement(name = "unLockData")
    @FieldName("愈解鎖之鎖定之資料")
    private Rcdf001mrlType unLockData = null;

    @XmlElement(name = "Title")
    @FieldName("標題")
    private String title = "";

    @XmlElement(name = "CheckCode")
    @FieldName("檢查碼")
    private String checkCode = null;

    @XmlElement(name = "verifyObj")
    @FieldName("要驗證物件")
    private Rcdf001mrlType verifyObj;

    public Rcdf001mrlType getVerifyObj() {
        return verifyObj;
    }

    public void setVerifyObj(Rcdf001mrlType verifyObj) {
        this.verifyObj = verifyObj;
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

    public boolean isVerify() {
        return isVerify;
    }

    public void setVerify(boolean isVerify) {
        this.isVerify = isVerify;
    }

    public Rldfs226Type getRecored() {
        return recored;
    }

    public void setRecored(Rldfs226Type recored) {
        this.recored = recored;
    }

    public Rcdf001mrlType getCommononType() {
        return commononType;
    }

    public void setCommononType(Rcdf001mrlType commononType) {
        this.commononType = commononType;
    }

    public Rcdf001mrlType getLockData() {
        return lockData;
    }

    public void setLockData(Rcdf001mrlType lockData) {
        this.lockData = lockData;
    }

    public Rcdf001mrlType getUnLockData() {
        return unLockData;
    }

    public void setUnLockData(Rcdf001mrlType unLockData) {
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
        return "Rl0x326DTO [mainDTO=" + mainDTO + ", editResult=" + editResult + ", quertDto=" + quertDto
                + ", selectData=" + selectData + ", resutlts=" + resutlts + ", reason=" + reason + ", isVerify="
                + isVerify + ", commononType=" + commononType + "]";
    }

    public Rcdf001mrlType getSelectData() {
        return selectData;
    }

    public void setSelectData(Rcdf001mrlType selectData) {
        this.selectData = selectData;
    }

    public List<Rcdf001mrlType> getResutlts() {
        return resutlts;
    }

    public void setResutlts(List<Rcdf001mrlType> resutlts) {
        this.resutlts = resutlts;
    }

}
