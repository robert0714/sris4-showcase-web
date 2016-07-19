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
import tw.gov.moi.domain.Rldf001hType;
import tw.gov.moi.domain.Rldfs202Type;

/**
 * 
 * @author Stanley.Li
 * 
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0x302DTO", propOrder = { "MainDTO", "EditResult", "QuertDto", "SelectData", "Resutlts", "Recored",
        "IsVerify", "CommononType", "lockData", "unLockData", "yyymmmdd", "hhhmmss", "personNotes", "title",
        "CheckCode" })
@XmlRootElement(name = "Rl0x302DTO")
public class Rl0x302DTO implements Serializable {

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
    private Rldf001hType selectData = new Rldf001hType();

    @XmlElement(name = "Resutlts")
    @FieldName("查詢結果")
    private List<Rldf001hType> resutlts = new ArrayList<Rldf001hType>();

    @XmlElement(name = "Recored")
    @FieldName("修改紀錄")
    private Rldfs202Type recored = new Rldfs202Type();

    @XmlElement(name = "Reason")
    @FieldName("更正原因")
    private String reason = StringUtils.EMPTY;

    @XmlElement(name = "IsVerify")
    @FieldName("是否驗證過")
    private boolean isVerify = false;

    @XmlElement(name = "CommononType")
    @FieldName("R檔預設值")
    private Rldf001hType nowProcessType = null;

    @XmlElement(name = "Gender")
    @FieldName("性別")
    private String gender;

    @XmlElement(name = "IdType")
    @FieldName("配賦身分代碼")
    private String idType;

    @XmlElement(name = "Village")
    @FieldName("村里")
    private String village;

    @XmlElement(name = "LockData")
    @FieldName("愈鎖定之資料")
    private Rldf001hType lockData = null;

    @XmlElement(name = "Yyymmmdd")
    @FieldName("年月日")
    private String yyymmmdd = "";

    @XmlElement(name = "Hhhmmss")
    @FieldName("時間")
    private String hhhmmss = "";

    @XmlElement(name = "PersonNotes")
    @FieldName("個人記事")
    private List<Rl0x302DTONote> personNotes = new ArrayList<Rl0x302DTONote>();

    @XmlElement(name = "Title")
    @FieldName("標題")
    private String title = null;

    /**
     * 檢查是否資料有變化
     */
    @XmlElement(name = "CheckCode")
    @FieldName("檢查碼")
    private String CheckCode = null;

    public Rldf001hType getNowProcessType() {
        return nowProcessType;
    }

    public void setNowProcessType(Rldf001hType nowProcessType) {
        this.nowProcessType = nowProcessType;
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

    public Rldf001hType getSelectData() {
        return selectData;
    }

    public void setSelectData(Rldf001hType selectData) {
        this.selectData = selectData;
    }

    public List<Rldf001hType> getResutlts() {
        return resutlts;
    }

    public void setResutlts(List<Rldf001hType> resutlts) {
        this.resutlts = resutlts;
    }

    public boolean isVerify() {
        return isVerify;
    }

    public void setVerify(boolean isVerify) {
        this.isVerify = isVerify;
    }

    public Rldfs202Type getRecored() {
        return recored;
    }

    public void setRecored(Rldfs202Type recored) {
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

    public Rldf001hType getLockData() {
        return lockData;
    }

    public void setLockData(Rldf001hType lockData) {
        this.lockData = lockData;
    }

    public Rldf001hType getUnLockData() {
        return lockData;
    }

    public void setUnLockData(Rldf001hType unLockData) {
        this.lockData = unLockData;
    }

    public List<Rl0x302DTONote> getPersonNotes() {
        return personNotes;
    }

    public void setPersonNotes(List<Rl0x302DTONote> personNotes) {
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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

}
