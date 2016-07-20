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
import tw.gov.moi.domain.Rldf004hType;
import tw.gov.moi.domain.Rldfs206Type;

/**
 * 
 * @author Andy
 * 
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0x306DTO", propOrder = { "MainDTO", "EditResult", "QuertDto", "SelectData", "Resutlts", "Recored",
        "IsVerify", "CommononType", "lockData", "LockData", "Yyymmmdd", "Hhhmmss", "PersonNotes", "Title", "CheckCode" })
@XmlRootElement(name = "Rl0x306DTO")
public class Rl0x306DTO implements Serializable {

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
    private Rldf004hType selectData = new Rldf004hType();

    @XmlElement(name = "Resutlts")
    @FieldName("查詢結果")
    private List<Rldf004hType> resutlts = new ArrayList<Rldf004hType>();

    @XmlElement(name = "Recored")
    @FieldName("修改紀錄")
    private Rldfs206Type recored = new Rldfs206Type();

    @XmlElement(name = "Reason")
    @FieldName("更正原因")
    private String reason = StringUtils.EMPTY;

    @XmlElement(name = "IsVerify")
    @FieldName("是否驗證過")
    private boolean isVerify = false;

    @XmlElement(name = "CommononType")
    @FieldName("R檔預設值")
    private Rldf004hType commononType = null;

    @XmlElement(name = "Yyymmmdd")
    @FieldName("年月日")
    private String yyymmmdd = "";

    @XmlElement(name = "Hhhmmss")
    @FieldName("時間")
    private String hhhmmss = "";

    @XmlElement(name = "PersonNotes")
    @FieldName("個人記事")
    private List<Rl0x306DTONote> personNotes = new ArrayList<Rl0x306DTONote>();

    @XmlElement(name = "Title")
    @FieldName("標題")
    private String title = "";

    @XmlElement(name = "CheckCode")
    @FieldName("檢查碼")
    private String checkCode = null;

    private String tractionId = "";

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

    public Rldf004hType getSelectData() {
        return selectData;
    }

    public void setSelectData(Rldf004hType selectData) {
        this.selectData = selectData;
    }

    public List<Rldf004hType> getResutlts() {
        return resutlts;
    }

    public void setResutlts(List<Rldf004hType> resutlts) {
        this.resutlts = resutlts;
    }

    public Rldf004hType getCommononType() {
        return commononType;
    }

    public void setCommononType(Rldf004hType commononType) {
        this.commononType = commononType;
    }

    public boolean isVerify() {
        return isVerify;
    }

    public void setVerify(boolean isVerify) {
        this.isVerify = isVerify;
    }

    public Rldfs206Type getRecored() {
        return recored;
    }

    public void setRecored(Rldfs206Type recored) {
        this.recored = recored;
    }

    public List<Rl0x306DTONote> getPersonNotes() {
        return personNotes;
    }

    public void setPersonNotes(List<Rl0x306DTONote> personNotes) {
        this.personNotes = personNotes;
    }

    public String getYyymmmdd() {
        return yyymmmdd;
    }

    public void setYyymmmdd(String yyymmmdd) {
        this.yyymmmdd = yyymmmdd;
    }

    public String getHhhmmss() {
        return hhhmmss;
    }

    public void setHhhmmss(String hhhmmss) {
        this.hhhmmss = hhhmmss;
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

    public String getTractionId() {
        return tractionId;
    }

    public void setTractionId(String tractionId) {
        this.tractionId = tractionId;
    }

    @Override
    public String toString() {
        return "Rl0x306DTO [mainDTO=" + mainDTO + ", editResult=" + editResult + ", quertDto=" + quertDto
                + ", selectData=" + selectData + ", resutlts=" + resutlts + ", recored=" + recored + ", reason="
                + reason + ", isVerify=" + isVerify + ", commononType=" + commononType + ", yyymmmdd=" + yyymmmdd
                + ", hhhmmss=" + hhhmmss + ", personNotes=" + personNotes + ", title=" + title + ", checkCode="
                + checkCode + ", tractionId=" + tractionId + "]";
    }

}
