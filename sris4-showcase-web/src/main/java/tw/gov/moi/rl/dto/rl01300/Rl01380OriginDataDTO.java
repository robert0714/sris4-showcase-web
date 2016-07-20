package tw.gov.moi.rl.dto.rl01300;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * Rl01380OriginDataDTO
 * 
 * @author Stanley.Li
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01380OriginDataDTO", propOrder = { "selectHead", "personId", "personName", "birthYyymmdd",
        "householdHeadId", "moveInDate", "relationShip", "educationMark", "idCardLostApplyMark", "idCardLostApplyDate",
        "idCardLostApplyTime", "gender", "sourceSiteId" })
@XmlRootElement(name = "Rl01380OriginDataDTO")
public class Rl01380OriginDataDTO implements Serializable {

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

}
