package tw.gov.moi.rl.dto.rl01800;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.component.dto.XLDFDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;

/**
 * Rl01803MoveOutDTO
 * 
 * @author Stanley.Li
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01803MoveOutDTO", propOrder = { "selectClear", "personId", "personName", "birthYyymmdd",
        "householdHeadId", "moveInDate", "relationShip", "educationMark", "idCardLostApplyMark", "idCardLostApplyDate",
        "idCardLostApplyTime", "gender", "sourceSiteId", "registerReady", "specialMark", "last006mSiteId",
        "last006mRegisterDate", "Last006mRegisterTime" })
@XmlRootElement(name = "Rl01803MoveOutDTO")
public class Rl01803MoveOutDTO implements Serializable {

    /** Serial Id. */
    private static final long serialVersionUID = 1L;

    @XmlElement(name = "SelectClear")
    @FieldName("清除")
    private boolean selectClear;

    @XmlElement(name = "PersonId")
    @FieldName("統號")
    private String personId;

    @XmlElement(name = "PersonName")
    @FieldName("姓名")
    private String personName;

    @XmlElement(name = "BirthYyymmdd")
    @FieldName("出生日期")
    private String birthYyymmdd;

    @XmlElement(name = "HouseholdHeadId")
    @FieldName("戶長統號")
    private String householdHeadId;

    @XmlElement(name = "MoveInDate")
    @FieldName("遷入日期")
    private String moveInDate;

    @XmlElement(name = "RelationShip")
    @FieldName("稱謂")
    private String relationShip;

    @XmlElement(name = "OriginEducationMark")
    @FieldName("原教育程度註記")
    private String originEducationMark;

    @XmlElement(name = "NewEducationMark")
    @FieldName("新教育程度註記")
    private String newEducationMark;

    @XmlElement(name = "IdCardLostApplyMark")
    @FieldName("國民身分證掛失註記")
    private boolean idCardLostApplyMark;

    @XmlElement(name = "IdCardLostApplyDate")
    @FieldName("國民身分證掛失日期")
    private String idCardLostApplyDate;

    @XmlElement(name = "IdCardLostApplyTime")
    @FieldName("國民身分證掛失時間")
    private String idCardLostApplyTime;

    @XmlElement(name = "Gender")
    @FieldName("性別")
    private String gender;

    @XmlElement(name = "SourceSiteId")
    @FieldName("來源作業點代碼")
    private String sourceSiteId;

    @XmlElement(name = "RegisterReady")
    @FieldName("選擇記事")
    private boolean registerReady;

    @XmlElement(name = "SpecialMark")
    @FieldName("特殊註記")
    private String specialMark;

    @XmlElement(name = "Last006mSiteId")
    @FieldName("最後一筆遷徙紀錄作業點")
    private String last006mSiteId;

    @XmlElement(name = "Last006mRegisterDate")
    @FieldName("最後一筆遷徙紀錄登記日期")
    private String last006mRegisterDate;

    @XmlElement(name = "Last006mRegisterTime")
    @FieldName("最後一筆遷徙紀錄登記時間")
    private String last006mRegisterTime;

    @XmlElement(name = "M10mLists")
    @FieldName("m10m")
    private List<XLDFDomainObject> m10mLists = new ArrayList<XLDFDomainObject>();

    public Rl01803MoveOutDTO(XLDFPersonDataDomainObject personDataObj) {
        super();
        this.settingPersonDataDTO(personDataObj);

    }

    public Rl01803MoveOutDTO() {
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
        this.relationShip = personDataObj.getRelationship();
        this.newEducationMark = personDataObj.getEducationMark();
        this.gender = personDataObj.getGender();
        this.idCardLostApplyDate = personDataObj.getIdCardLostApply().getIdCardLostApplyYyymmdd();
        this.idCardLostApplyMark = personDataObj.getIdCardLostApply().getIdCardLostApplyMark();
        this.idCardLostApplyTime = personDataObj.getIdCardLostApply().getIdCardLostApplyHhmmss();
        this.moveInDate = personDataObj.getMoveInYyymmdd();
        this.sourceSiteId = personDataObj.getSiteId();
        this.householdHeadId = personDataObj.getHouseholdHeadId();
        this.originEducationMark = personDataObj.getEducationMark();

    }

    public String getLast006mRegisterTime() {
        return last006mRegisterTime;
    }

    public void setLast006mRegisterTime(String last006mRegisterTime) {
        this.last006mRegisterTime = last006mRegisterTime;
    }

    public boolean isSelectClear() {
        return selectClear;
    }

    public void setSelectClear(boolean selectClear) {
        this.selectClear = selectClear;
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

    public String getHouseholdHeadId() {
        return householdHeadId;
    }

    public void setHouseholdHeadId(String householdHeadId) {
        this.householdHeadId = householdHeadId;
    }

    public String getMoveInDate() {
        return moveInDate;
    }

    public void setMoveInDate(String moveInDate) {
        this.moveInDate = moveInDate;
    }

    public String getRelationShip() {
        return relationShip;
    }

    public void setRelationShip(String relationShip) {
        this.relationShip = relationShip;
    }

    /**
     * @return the idCardLostApplyMark
     */
    public boolean isIdCardLostApplyMark() {
        return idCardLostApplyMark;
    }

    /**
     * @param idCardLostApplyMark
     *            the idCardLostApplyMark to set
     */
    public void setIdCardLostApplyMark(boolean idCardLostApplyMark) {
        this.idCardLostApplyMark = idCardLostApplyMark;
    }

    public String getIdCardLostApplyDate() {
        return idCardLostApplyDate;
    }

    public void setIdCardLostApplyDate(String idCardLostApplyDate) {
        this.idCardLostApplyDate = idCardLostApplyDate;
    }

    public String getIdCardLostApplyTime() {
        return idCardLostApplyTime;
    }

    public void setIdCardLostApplyTime(String idCardLostApplyTime) {
        this.idCardLostApplyTime = idCardLostApplyTime;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSourceSiteId() {
        return sourceSiteId;
    }

    public void setSourceSiteId(String sourceSiteId) {
        this.sourceSiteId = sourceSiteId;
    }

    public boolean isRegisterReady() {
        return registerReady;
    }

    public void setRegisterReady(boolean registerReady) {
        this.registerReady = registerReady;
    }

    public String getSpecialMark() {
        return specialMark;
    }

    public void setSpecialMark(String specialMark) {
        this.specialMark = specialMark;
    }

    public String getOriginEducationMark() {
        return originEducationMark;
    }

    public void setOriginEducationMark(String originEducationMark) {
        this.originEducationMark = originEducationMark;
    }

    public String getNewEducationMark() {
        return newEducationMark;
    }

    public void setNewEducationMark(String newEducationMark) {
        this.newEducationMark = newEducationMark;
    }

    public String getLast006mSiteId() {
        return last006mSiteId;
    }

    public void setLast006mSiteId(String last006mSiteId) {
        this.last006mSiteId = last006mSiteId;
    }

    public String getLast006mRegisterDate() {
        return last006mRegisterDate;
    }

    public void setLast006mRegisterDate(String last006mRegisterDate) {
        this.last006mRegisterDate = last006mRegisterDate;
    }

    public List<XLDFDomainObject> getM10mLists() {
        return m10mLists;
    }

    public void setM10mLists(List<XLDFDomainObject> m10mLists) {
        this.m10mLists = m10mLists;
    }

}
