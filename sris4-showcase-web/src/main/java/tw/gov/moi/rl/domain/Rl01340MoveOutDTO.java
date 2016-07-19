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
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01340MoveOutDTO", propOrder = { "PersonId", "PersonName", "BirthYyymmdd", "MoveOutDate",
        "Appellation", "EducationMark", "ModifyEducationMark", "SiteId", "AdminOfficeCode", "AreaCode", "NoteList",
        "IdentityNoteList", "MoveNoteList", "CorrectChangeNoteList", "RevokeNoteList", "AbolishNoteList",
        "SupplementNoteList", "OtherNoteList", "Checked", "IsHigh", "PersonDataKind"

})
@XmlRootElement(name = "Rl01340MoveOutDTO")
public class Rl01340MoveOutDTO implements Serializable {
    /**
     * 
     */
    private static final long serialVersionUID = -5419390392572313102L;
    /**
     * 統編
     */
    @XmlElement(name = "PersonId", required = true)
    @FieldName("統編")
    private String personId;
    /**
     * 姓名
     */
    @XmlElement(name = "PersonName", required = true)
    @FieldName("姓名")
    private String personName;
    /**
     * 出生日期
     */
    @XmlElement(name = "BirthYyymmdd", required = true)
    @FieldName("出生日期")
    private String birthYyymmdd;

    /**
     * 遷出日期
     */
    @XmlElement(name = "MoveOutDate", required = true)
    @FieldName("遷出日期")
    private String moveOutDate;

    /**
     * 稱謂
     */
    @XmlElement(name = "Appellation", required = true)
    @FieldName("稱謂")
    private String appellation;

    /**
     * 教育程度
     */
    @XmlElement(name = "EducationMark", required = true)
    @FieldName("教育程度")
    private String educationMark;

    /**
     * 修改後教育程度
     */
    @XmlElement(name = "ModifyEducationMark", required = true)
    @FieldName("修改後教育程度")
    private String modifyEducationMark;

    /**
     * 戶籍地作業點代碼
     */
    @XmlElement(name = "SiteId", required = true)
    @FieldName("戶籍地作業點代碼")
    private String siteId;

    /**
     * 戶籍地戶所代碼
     */
    @XmlElement(name = "AdminOfficeCode", required = true)
    @FieldName("戶籍地戶所代碼")
    private String adminOfficeCode;

    /**
     * 戶籍地行政區域代碼
     */
    @XmlElement(name = "AreaCode", required = true)
    @FieldName("戶籍地行政區域代碼")
    private String areaCode;

    /**
     * 個人記事
     */
    @XmlElement(name = "NoteList", required = true)
    @FieldName("個人記事")
    private List<Rl01340MoveOutNoteDTO> noteList = new ArrayList<Rl01340MoveOutNoteDTO>();

    /**
     * 身分登記
     */
    @XmlElement(name = "IdentityNoteList", required = true)
    @FieldName("身分登記")
    private List<Rl01340MoveOutNoteDTO> identityNoteList = new ArrayList<Rl01340MoveOutNoteDTO>();

    /**
     * 更正或變更登記
     */
    @XmlElement(name = "MoveNoteList", required = true)
    @FieldName("遷徙登記")
    private List<Rl01340MoveOutNoteDTO> moveNoteList = new ArrayList<Rl01340MoveOutNoteDTO>();

    /**
     * 更正或變更登記
     */
    @XmlElement(name = "CorrectChangeNoteList", required = true)
    @FieldName("更正或變更登記")
    private List<Rl01340MoveOutNoteDTO> correctChangeNoteList = new ArrayList<Rl01340MoveOutNoteDTO>();

    /**
     * 補填登記
     */
    @XmlElement(name = "RevokeNoteList", required = true)
    @FieldName("補填登記")
    private List<Rl01340MoveOutNoteDTO> revokeNoteList = new ArrayList<Rl01340MoveOutNoteDTO>();

    /**
     * 撤銷登記
     */
    @XmlElement(name = "AbolishNoteList", required = true)
    @FieldName("撤銷登記")
    private List<Rl01340MoveOutNoteDTO> abolishNoteList = new ArrayList<Rl01340MoveOutNoteDTO>();

    /**
     * 廢止登記代碼
     */
    @XmlElement(name = "SupplementNoteList", required = true)
    @FieldName("廢止登記代碼")
    private List<Rl01340MoveOutNoteDTO> supplementNoteList = new ArrayList<Rl01340MoveOutNoteDTO>();

    /**
     * 其他
     */
    @XmlElement(name = "OtherNoteList", required = true)
    @FieldName("其他")
    private List<Rl01340MoveOutNoteDTO> otherNoteList = new ArrayList<Rl01340MoveOutNoteDTO>();

    /**
     * 光棒判斷
     */
    @XmlElement(name = "Checked", required = true)
    @FieldName("光棒判斷")
    private Boolean checked = Boolean.FALSE;

    @XmlElement(name = "IsHigh", required = true)
    @FieldName("光棒判斷")
    private Boolean isHigh = Boolean.FALSE;

    /**
     * 資料種類 1:正常2:補登
     */
    @XmlElement(name = "PersonDataKind", required = true)
    @FieldName("資料種類")
    private String personDataKind;

    public Rl01340MoveOutDTO(XLDFPersonDataDomainObject personDataObj, String systemDate) {
        super();
        settingPersonDataDTO(personDataObj);
        this.moveOutDate = systemDate;
    }

    public Rl01340MoveOutDTO() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * 
     * @param personDataObj
     */
    private void settingPersonDataDTO(XLDFPersonDataDomainObject personDataObj) {

        this.birthYyymmdd = personDataObj.getBirthYyymmdd();
        this.personId = personDataObj.getPersonId();
        this.personName = personDataObj.getPersonName();
        this.appellation = personDataObj.getRelationship();
        this.educationMark = personDataObj.getEducationMark();
        this.personDataKind = RlConstant.STRING_ONE;
    }

    public String getPersonDataKind() {
        return personDataKind;
    }

    public void setPersonDataKind(String personDataKind) {
        this.personDataKind = personDataKind;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getBirthYyymmdd() {
        return birthYyymmdd;
    }

    public void setBirthYyymmdd(String birthYyymmdd) {
        this.birthYyymmdd = birthYyymmdd;
    }

    public String getMoveOutDate() {
        return moveOutDate;
    }

    public void setMoveOutDate(String moveOutDate) {
        this.moveOutDate = moveOutDate;
    }

    public String getAppellation() {
        return appellation;
    }

    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }

    public String getEducationMark() {
        return educationMark;
    }

    public void setEducationMark(String educationMark) {
        this.educationMark = educationMark;
    }

    public String getModifyEducationMark() {
        return modifyEducationMark;
    }

    public void setModifyEducationMark(String modifyEducationMark) {
        this.modifyEducationMark = modifyEducationMark;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getAdminOfficeCode() {
        return adminOfficeCode;
    }

    public void setAdminOfficeCode(String adminOfficeCode) {
        this.adminOfficeCode = adminOfficeCode;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public List<Rl01340MoveOutNoteDTO> getNoteList() {
        return noteList;
    }

    public void setNoteList(List<Rl01340MoveOutNoteDTO> noteList) {
        this.noteList = noteList;
    }

    public Boolean getChecked() {
        return checked;
    }

    public Boolean getIsHigh() {
        return isHigh;
    }

    public void setIsHigh(Boolean isHigh) {
        this.isHigh = isHigh;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    public List<Rl01340MoveOutNoteDTO> getIdentityNoteList() {
        return identityNoteList;
    }

    public void setIdentityNoteList(List<Rl01340MoveOutNoteDTO> identityNoteList) {
        this.identityNoteList = identityNoteList;
    }

    public List<Rl01340MoveOutNoteDTO> getMoveNoteList() {
        return moveNoteList;
    }

    public void setMoveNoteList(List<Rl01340MoveOutNoteDTO> moveNoteList) {
        this.moveNoteList = moveNoteList;
    }

    public List<Rl01340MoveOutNoteDTO> getCorrectChangeNoteList() {
        return correctChangeNoteList;
    }

    public void setCorrectChangeNoteList(List<Rl01340MoveOutNoteDTO> correctChangeNoteList) {
        this.correctChangeNoteList = correctChangeNoteList;
    }

    public List<Rl01340MoveOutNoteDTO> getRevokeNoteList() {
        return revokeNoteList;
    }

    public void setRevokeNoteList(List<Rl01340MoveOutNoteDTO> revokeNoteList) {
        this.revokeNoteList = revokeNoteList;
    }

    public List<Rl01340MoveOutNoteDTO> getAbolishNoteList() {
        return abolishNoteList;
    }

    public void setAbolishNoteList(List<Rl01340MoveOutNoteDTO> abolishNoteList) {
        this.abolishNoteList = abolishNoteList;
    }

    public List<Rl01340MoveOutNoteDTO> getSupplementNoteList() {
        return supplementNoteList;
    }

    public void setSupplementNoteList(List<Rl01340MoveOutNoteDTO> supplementNoteList) {
        this.supplementNoteList = supplementNoteList;
    }

    public List<Rl01340MoveOutNoteDTO> getOtherNoteList() {
        return otherNoteList;
    }

    public void setOtherNoteList(List<Rl01340MoveOutNoteDTO> otherNoteList) {
        this.otherNoteList = otherNoteList;
    }

    @Override
    public String toString() {
        return "Rl01340MoveOutDTO [personId=" + personId + ", personName=" + personName + ", birthYyymmdd="
                + birthYyymmdd + ", moveOutDate=" + moveOutDate + ", appellation=" + appellation + ", educationMark="
                + educationMark + ", modifyEducationMark=" + modifyEducationMark + ", siteId=" + siteId
                + ", adminOfficeCode=" + adminOfficeCode + ", areaCode=" + areaCode + ", noteList=" + noteList + "]";
    }

}
