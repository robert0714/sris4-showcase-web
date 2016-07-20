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
import tw.gov.moi.domain.Rldf004mType;
import tw.gov.moi.domain.Rldfs205Type;

/**
 * 
 * @author Andy
 * 
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0x305DTO", propOrder = { "MainDTO", "EditResult", "QuertDto", "SelectData", "Resutlts", "Recored",
        "IsVerify", "CommononType", "lockData", "LockData", "Yyymmmdd", "Hhhmmss", "PersonNotes", "Title", "CheckCode" })
@XmlRootElement(name = "Rl0x305DTO")
public class Rl0x305DTO implements Serializable {

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
    private Rldf004mType selectData = new Rldf004mType();

    @XmlElement(name = "Resutlts")
    @FieldName("查詢結果")
    private List<Rldf004mType> resutlts = new ArrayList<Rldf004mType>();

    @XmlElement(name = "Recored")
    @FieldName("修改紀錄")
    private Rldfs205Type recored = new Rldfs205Type();

    @XmlElement(name = "Reason")
    @FieldName("更正原因")
    private String reason = StringUtils.EMPTY;

    @XmlElement(name = "IsVerify")
    @FieldName("是否驗證過")
    private boolean isVerify = false;

    @XmlElement(name = "CommononType")
    @FieldName("R檔預設值")
    private Rldf004mType commononType = null;

    @XmlElement(name = "Yyymmmdd")
    @FieldName("年月日")
    private String yyymmmdd = "";

    @XmlElement(name = "Hhhmmss")
    @FieldName("時間")
    private String hhhmmss = "";

    @XmlElement(name = "PersonNotes")
    @FieldName("個人記事")
    private List<Rl0x305DTONote> personNotes = new ArrayList<Rl0x305DTONote>();

    @XmlElement(name = "Title")
    @FieldName("標題")
    private String title = null;

    private String tractionId = "";

    /**
     * 檢查是否資料有變化
     */
    @XmlElement(name = "CheckCode")
    @FieldName("檢查碼")
    private String CheckCode = null;

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

    public Rldf004mType getSelectData() {
        return selectData;
    }

    public void setSelectData(Rldf004mType selectData) {
        this.selectData = selectData;
    }

    public List<Rldf004mType> getResutlts() {
        return resutlts;
    }

    public void setResutlts(List<Rldf004mType> resutlts) {
        this.resutlts = resutlts;
    }

    public Rldf004mType getCommononType() {
        return commononType;
    }

    public void setCommononType(Rldf004mType commononType) {
        this.commononType = commononType;
    }

    public boolean isVerify() {
        return isVerify;
    }

    public void setVerify(boolean isVerify) {
        this.isVerify = isVerify;
    }

    public Rldfs205Type getRecored() {
        return recored;
    }

    public void setRecored(Rldfs205Type recored) {
        this.recored = recored;
    }

    public List<Rl0x305DTONote> getPersonNotes() {
        return personNotes;
    }

    public void setPersonNotes(List<Rl0x305DTONote> personNotes) {
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

    public String getCheckCode() {
        return CheckCode;
    }

    public void setCheckCode(String checkCode) {
        CheckCode = checkCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTractionId() {
        return tractionId;
    }

    public void setTractionId(String tractionId) {
        this.tractionId = tractionId;
    }

    @Override
    public String toString() {
        return "Rl0x305DTO [mainDTO=" + mainDTO + ", editResult=" + editResult + ", quertDto=" + quertDto
                + ", selectData=" + selectData + ", resutlts=" + resutlts + ", recored=" + recored + ", reason="
                + reason + ", isVerify=" + isVerify + ", commononType=" + commononType + ", yyymmmdd=" + yyymmmdd
                + ", hhhmmss=" + hhhmmss + ", personNotes=" + personNotes + ", title=" + title + ", tractionId="
                + tractionId + ", CheckCode=" + CheckCode + "]";
    }

}
