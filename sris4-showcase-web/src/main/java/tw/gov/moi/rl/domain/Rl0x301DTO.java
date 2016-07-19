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
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldf001mType;
import tw.gov.moi.domain.Rldfs201Type;

/**
 * 
 * @author Stanley.Li
 * 
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0x301DTO", propOrder = { "MainDTO", "EditResult", "QuertDto", "SelectData", "Resutlts", "Recored",
        "IsVerify", "CommononType", "lockData", "unLockData", "yyymmmdd", "hhhmmss", "personNotes", "title",
        "CheckCode" })
@XmlRootElement(name = "Rl0x301DTO")
public class Rl0x301DTO implements Serializable {

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
    private Rldf001mType selectData = new Rldf001mType();

    @XmlElement(name = "Resutlts")
    @FieldName("查詢結果")
    private List<Rldf001mType> resutlts = new ArrayList<Rldf001mType>();

    @XmlElement(name = "Recored")
    @FieldName("修改紀錄")
    private Rldfs201Type recored = new Rldfs201Type();

    @XmlElement(name = "Reason")
    @FieldName("更正原因")
    private String reason = StringUtils.EMPTY;

    @XmlElement(name = "IsVerify")
    @FieldName("是否驗證過")
    private boolean isVerify = false;

    @XmlElement(name = "CommononType")
    @FieldName("R檔預設值")
    private Rldf001mType nowProcessType = null;

    @XmlElement(name = "Gender")
    @FieldName("性別")
    private String gender;

    @XmlElement(name = "IdType")
    @FieldName("配賦身分代碼")
    private String idType;

    @XmlElement(name = "Village")
    @FieldName("村里")
    private String village;

    @XmlElement(name = "Yyymmmdd")
    @FieldName("年月日")
    private String yyymmmdd = "";

    @XmlElement(name = "Hhhmmss")
    @FieldName("時間")
    private String hhhmmss = "";

    @XmlElement(name = "PersonNotes")
    @FieldName("個人記事")
    private List<Rl0x301DTONote> personNotes = new ArrayList<Rl0x301DTONote>();

    @XmlElement(name = "Title")
    @FieldName("標題")
    private String title = null;

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

    public Rldf001mType getSelectData() {
        return selectData;
    }

    public void setSelectData(Rldf001mType selectData) {
        this.selectData = selectData;
    }

    public List<Rldf001mType> getResutlts() {
        return resutlts;
    }

    public void setResutlts(List<Rldf001mType> resutlts) {
        this.resutlts = resutlts;
    }

    public boolean isVerify() {
        return isVerify;
    }

    public void setVerify(boolean isVerify) {
        this.isVerify = isVerify;
    }

    public Rldfs201Type getRecored() {
        return recored;
    }

    public void setRecored(Rldfs201Type recored) {
        this.recored = recored;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public List<Rl0x301DTONote> getPersonNotes() {
        return personNotes;
    }

    public void setPersonNotes(List<Rl0x301DTONote> personNotes) {
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

    public Rldf001mType getNowProcessType() {
        return nowProcessType;
    }

    public void setNowProcessType(Rldf001mType nowProcessType) {
        this.nowProcessType = nowProcessType;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

}
