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
 * Rl01320this
 * 
 * @author Stanley.Li
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01320OriginDataDTO", propOrder = { "selectHead", "personId", "personName", "birthYyymmdd",
        "householdHeadId", "moveInDate", "relationShip", "educationMark", "idCardLostApplyMark", "idCardLostApplyDate",
        "idCardLostApplyTime", "gender", "sourceSiteId" })
@XmlRootElement(name = "Rl01320OriginDataDTO")
public class Rl01320OriginDataDTO implements Serializable {

    /** Serial Id. */
    private static final long serialVersionUID = 1L;

    @XmlElement(name = "SelectHead")
    @FieldName("選擇新戶長")
    private boolean selectHead;

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

    @XmlElement(name = "EducationMark")
    @FieldName("教育程度註記")
    private String educationMark;

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

    public Rl01320OriginDataDTO(XLDFPersonDataDomainObject addPersonData) {
        super();
        this.setPersonId(addPersonData.getPersonId());
        this.setPersonName(addPersonData.getPersonName());
        this.setBirthYyymmdd(addPersonData.getBirthYyymmdd());
        this.setHouseholdHeadId(addPersonData.getHouseholdHeadId());
        this.setMoveInDate(addPersonData.getMoveInYyymmdd());
        this.setRelationShip(addPersonData.getRelationship());
        this.setEducationMark(addPersonData.getEducationMark());
        this.setIdCardLostApplyMark(addPersonData.getIdCardLostApply().getIdCardLostApplyMark() ? "Y" : "N");
        this.setIdCardLostApplyDate(addPersonData.getIdCardLostApply().getIdCardLostApplyYyymmdd());
        this.setIdCardLostApplyTime(addPersonData.getIdCardLostApply().getIdCardLostApplyHhmmss());
        this.setGender(addPersonData.getGender());
        this.setSourceSiteId(addPersonData.getSiteId());
        this.setOriRelationShip(addPersonData.getRelationship());
    }

    public Rl01320OriginDataDTO(Rl01320MoveOutDTO addPersonData) {
        super();
        this.setPersonId(addPersonData.getPersonId());
        this.setPersonName(addPersonData.getPersonName());
        this.setBirthYyymmdd(addPersonData.getBirthYyymmdd());
        this.setHouseholdHeadId(addPersonData.getHouseholdHeadId());
        this.setMoveInDate(addPersonData.getMoveInDate());
        this.setRelationShip(addPersonData.getRelationShip());
        this.setEducationMark(addPersonData.getNewEducationMark());
        this.setIdCardLostApplyMark(addPersonData.getIdCardLostApplyMark());
        this.setIdCardLostApplyDate(addPersonData.getIdCardLostApplyDate());
        this.setIdCardLostApplyTime(addPersonData.getIdCardLostApplyTime());
        this.setGender(addPersonData.getGender());
        this.setSourceSiteId(addPersonData.getSourceSiteId());
        this.setOriRelationShip(addPersonData.getOriRelationShip());
    }

    public Rl01320OriginDataDTO() {
        super();
        // TODO Auto-generated constructor stub
    }

    public boolean isSelectHead() {
        return selectHead;
    }

    public void setSelectHead(boolean selectHead) {
        this.selectHead = selectHead;
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

    public String getEducationMark() {
        return educationMark;
    }

    public void setEducationMark(String educationMark) {
        this.educationMark = educationMark;
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
