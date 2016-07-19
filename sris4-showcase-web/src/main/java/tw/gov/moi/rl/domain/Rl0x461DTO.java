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
import tw.gov.moi.domain.Rldft061Type;

/**
 * 監護登記申請書職權更正 DTO
 * 
 * @author Weiren.Jheng
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0x461DTO", propOrder = { "mainDTO", "editResult", "quertDto", "selectData", "resutlts", "title",
        "reason", "commononType", "lockData", "verify", "checkCode", "unLockData", "rightData" })
@XmlRootElement(name = "Rl0x461DTO")
public class Rl0x461DTO implements Serializable {

    private static final long serialVersionUID = 1766269762511323398L;

    /** 主檔 */
    @XmlElement(name = "MainDTO")
    @FieldName("主檔")
    private Rl0x001DTO mainDTO;

    /** 編輯資料 */
    @XmlElement(name = "EditResult")
    @FieldName("編輯資料")
    private List<Rl0x001DTOResult> editResult = new ArrayList<Rl0x001DTOResult>();

    /** 查詢畫面 */
    @XmlElement(name = "QuertDto")
    @FieldName("查詢畫面")
    private List<Rl0x001DTOResult> quertDto = new ArrayList<Rl0x001DTOResult>();

    /** 來源資料 */
    @XmlElement(name = "SelectData")
    @FieldName("來源資料")
    private Object selectData = new Object();

    /** 查詢結果 */
    @XmlElement(name = "Resutlts")
    @FieldName("查詢結果")
    private List<Object> resutlts = new ArrayList<Object>();

    /** 標題 */
    @XmlElement(name = "Title")
    @FieldName("標題")
    private String title = "";

    /** 更正原因 */
    @XmlElement(name = "Reason")
    @FieldName("更正原因")
    private String reason = "";

    /** R檔預設值 */
    @XmlElement(name = "CommononType")
    @FieldName("R檔預設值")
    private Rldft061Type commononType = null;

    /** 愈鎖定之資料 */
    @XmlElement(name = "LockData")
    @FieldName("愈鎖定之資料")
    private Object lockData = null;

    @XmlElement(name = "verify")
    @FieldName("是否驗證過")
    private boolean verify = false;

    /** 右側的資料 */
    @XmlElement(name = "RightData")
    @FieldName("右側的資料")
    private Rldft061Type rightData = null;

    /**
     * 檢查是否資料有變化
     */
    @XmlElement(name = "CheckCode")
    @FieldName("檢查碼")
    private String checkCode = "";

    /** 愈解鎖之鎖定之資料 */
    @XmlElement(name = "UnLockData")
    @FieldName("愈解鎖之鎖定之資料")
    private Object unLockData = null;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Rldft061Type getCommononType() {
        return commononType;
    }

    public void setCommononType(Rldft061Type commononType) {
        this.commononType = commononType;
    }

    public Object getLockData() {
        return lockData;
    }

    public void setLockData(Object lockData) {
        this.lockData = lockData;
    }

    public boolean isVerify() {
        return verify;
    }

    public void setVerify(boolean verify) {
        this.verify = verify;
    }

    public String getCheckCode() {
        return checkCode;
    }

    public void setCheckCode(String checkCode) {
        this.checkCode = checkCode;
    }

    public Object getUnLockData() {
        return unLockData;
    }

    public void setUnLockData(Object unLockData) {
        this.unLockData = unLockData;
    }

    public Rldft061Type getRightData() {
        return rightData;
    }

    public void setRightData(Rldft061Type rightData) {
        this.rightData = rightData;
    }

}
