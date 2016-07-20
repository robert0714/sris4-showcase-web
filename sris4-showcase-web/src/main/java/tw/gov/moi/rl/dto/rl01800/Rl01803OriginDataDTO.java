package tw.gov.moi.rl.dto.rl01800;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * Rl01803OriginDataDTO
 * 
 * @author Stanley.Li
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01803OriginDataDTO", propOrder = { "selectHead", "personId", "personName", "birthYyymmdd",
        "householdHeadId", "moveInDate", "relationShip", "educationMark", "idCardLostApplyMark", "idCardLostApplyDate",
        "idCardLostApplyTime", "gender", "sourceSiteId", "Last006mSiteId", "last006mRegisterDate" })
@XmlRootElement(name = "Rl01803OriginDataDTO")
public class Rl01803OriginDataDTO implements Serializable {

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

    @XmlElement(name = "Last006mSiteId")
    @FieldName("最後一筆遷徙紀錄作業點")
    private String last006mSiteId;

    @XmlElement(name = "Last006mRegisterDate")
    @FieldName("最後一筆遷徙紀錄登記日期")
    private String last006mRegisterDate;

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

}
