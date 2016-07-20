package tw.gov.moi.rl.dto.rl01300;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;

/**
 * Rl01320MoveOutDTO
 * 
 * @author Stanley.Li
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01320MoveOutDTO", propOrder = { "selectClear", "personId", "personName", "birthYyymmdd",
        "householdHeadId", "moveInDate", "relationShip", "educationMark", "idCardLostApplyMark", "idCardLostApplyDate",
        "idCardLostApplyTime", "gender", "sourceSiteId", "registerReady", "specialMark", "departDate",
        "oriRelationShip" })
@XmlRootElement(name = "Rl01320MoveOutDTO")
public class Rl01320MoveOutDTO implements Serializable {

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

    @XmlElement(name = "OriRelationShip")
    @FieldName("原稱謂")
    private String oriRelationShip;

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
    private String idCardLostApplyMark;

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

    @XmlElement(name = "DepartDate")
    @FieldName("出境日期")
    private String departDate;

    public Rl01320MoveOutDTO() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Rl01320MoveOutDTO(XLDFPersonDataDomainObject addPersonData) {
        super();
        this.setSelectClear(false);
        this.setRegisterReady(false);
        this.setPersonId(addPersonData.getPersonId());
        this.setPersonName(addPersonData.getPersonName());
        this.setBirthYyymmdd(addPersonData.getBirthYyymmdd());
        this.setHouseholdHeadId(addPersonData.getHouseholdHeadId());
        this.setMoveInDate(addPersonData.getMoveInYyymmdd());
        this.setRelationShip(addPersonData.getRelationship());
        this.setOriRelationShip(addPersonData.getRelationship());
        this.setOriginEducationMark(addPersonData.getEducationMark());
        this.setNewEducationMark(addPersonData.getEducationMark());
        this.setIdCardLostApplyMark(addPersonData.getIdCardLostApply().getIdCardLostApplyMark() == true ? "Y" : "N");
        this.setIdCardLostApplyDate(addPersonData.getIdCardLostApply().getIdCardLostApplyYyymmdd());
        this.setIdCardLostApplyTime(addPersonData.getIdCardLostApply().getIdCardLostApplyHhmmss());
        this.setGender(addPersonData.getGender());
        this.setSpecialMark(addPersonData.getSpecialMark());
        this.setSourceSiteId(addPersonData.getSiteId());

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

    public String getIdCardLostApplyMark() {
        return idCardLostApplyMark;
    }

    public void setIdCardLostApplyMark(String idCardLostApplyMark) {
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

    /**
     * @return the departDate
     */
    public String getDepartDate() {
        return departDate;
    }

    /**
     * @param departDate
     *            the departDate to set
     */
    public void setDepartDate(String departDate) {
        this.departDate = departDate;
    }

    /**
     * @return the oriRelationShip
     */
    public String getOriRelationShip() {
        return oriRelationShip;
    }

    /**
     * @param oriRelationShip
     *            the oriRelationShip to set
     */
    public void setOriRelationShip(String oriRelationShip) {
        this.oriRelationShip = oriRelationShip;
    }

}
