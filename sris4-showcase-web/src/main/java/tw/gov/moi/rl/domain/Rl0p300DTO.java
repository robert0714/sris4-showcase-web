package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0P300DTO", propOrder = { "startDate", "endDate", "reportcategory", "reporitype", "reporturl",
        "areaCode", "adminOfficceCode", "acceptSiteId", "personId", "sysDate", "sysTime", "applyReason", "checkImage",
        "remark", "document", "passportScanName", "applyPersonName", "applyBirthYyyMmDd", "applyCityCountyCode",
        "applyTownCode", "applyVillage", "applyNeighbor", "applyStreetDoorplate", "relationType", "relationRersonId",
        "relationPersonName", "relationBirthYyyMmDd", "relationCityCountyCode", "relationTownCode", "relationVillage",
        "relationNeighbor", "relationStreetDoorplate", "commPersonId", "commPersonName", "commBirthYyyMmDd",
        "commCityCountyCode", "commTownCode", "commVillage", "commNeighbor", "commStreetDoorplate", "userName",
        "foreignOfficeMark", "seqNo1", "seqNo2" })
@XmlRootElement(name = "Rl0P300DTO")
public class Rl0p300DTO implements Serializable {

    @XmlElement(name = "StartDate", required = true)
    @FieldName("申辦日期(起)")
    private String StartDate;

    @XmlElement(name = "EndDate", required = true)
    @FieldName("申辦日期(迄)")
    private String endDate;

    @XmlElement(name = "Reportcategory", required = true)
    @FieldName("統計造冊")
    private String reportcategory;

    @XmlElement(name = "Reporttype", required = true)
    @FieldName("報表格式")
    private String reporttype;

    @XmlElement(name = "Reportuel", required = true)
    @FieldName("報表網址")
    private String reportuel;

    @XmlElement(name = "AreaCode", required = true)
    @FieldName("行政區域代碼")
    private String areaCode;

    @XmlElement(name = "AdminOfficceCode", required = true)
    @FieldName("戶所代碼")
    private String adminOfficceCode;

    @XmlElement(name = "AcceptSiteId", required = true)
    @FieldName("作業點代碼")
    private String acceptSiteId;

    @XmlElement(name = "PersonId", required = true)
    @FieldName("護照申請人統號")
    private String personId;

    @XmlElement(name = "SysDate", required = true)
    @FieldName("申辦日期")
    private String sysDate;

    @XmlElement(name = "Systime", required = true)
    @FieldName("申辦時間")
    private String systime;

    @XmlElement(name = "ApplyReason", required = true)
    @FieldName("辦理原因")
    private String applyReason;

    @XmlElement(name = "CheckImage", required = true)
    @FieldName("人別確認審查結果")
    private String checkImage;

    @XmlElement(name = "Remark", required = true)
    @FieldName("所內備註")
    private String remark;

    @XmlElement(name = "Document", required = true)
    @FieldName("補件通知註記")
    private String document;

    @XmlElement(name = "PassportScanName", required = true)
    @FieldName("申請書掃瞄檔名稱")
    private String passportScanName;

    @XmlElement(name = "ApplyPersonName", required = true)
    @FieldName("護照申請人姓名")
    private String applyPersonName;

    @XmlElement(name = "ApplyBirthYyyMmDd", required = true)
    @FieldName("護照申請人出生日期")
    private String applyBirthYyyMmDd;

    @XmlElement(name = "ApplyCityCountyCode", required = true)
    @FieldName("護照申請人省市縣市代碼")
    private String applyCityCountyCode;

    @XmlElement(name = "ApplyTownCode", required = true)
    @FieldName("護照申請人鄉鎮市區代碼")
    private String applyTownCode;

    @XmlElement(name = "ApplyVillage", required = true)
    @FieldName("護照申請人村里")
    private String applyVillage;

    @XmlElement(name = "ApplyNeighbor", required = true)
    @FieldName("護照申請人鄰")
    private String applyNeighbor;

    @XmlElement(name = "ApplyStreetDoorplate", required = true)
    @FieldName("護照申請人街路門牌")
    private String applyStreetDoorplate;

    @XmlElement(name = "RelationType", required = true)
    @FieldName("關係人身分")
    private String relationType;

    @XmlElement(name = "RelationPersonId", required = true)
    @FieldName("關係人統號")
    private String relationPersonId;

    @XmlElement(name = "RelationPersonName", required = true)
    @FieldName("關係人姓名")
    private String relationPersonName;

    @XmlElement(name = "RelationBirthYyyMmDd", required = true)
    @FieldName("關係人出生日期")
    private String relationBirthYyyMmDd;

    @XmlElement(name = "RelationCityCountyCode", required = true)
    @FieldName("關係人省市縣市代碼")
    private String relationCityCountyCode;

    @XmlElement(name = "RelationTownCode", required = true)
    @FieldName("關係人鄉鎮市區代碼")
    private String relationTownCode;

    @XmlElement(name = "RelationVillage", required = true)
    @FieldName("關係人村里")
    private String relationVillage;

    @XmlElement(name = "RelationNeighbor", required = true)
    @FieldName("關係人鄰")
    private String relationNeighbor;

    @XmlElement(name = "RelationStreetDoorplate", required = true)
    @FieldName("關係人街路門牌")
    private String relationStreetDoorplate;

    @XmlElement(name = "CommPersonId", required = true)
    @FieldName("受委任人統號")
    private String commPersonId;

    @XmlElement(name = "CommPersonName", required = true)
    @FieldName("受委任人姓名")
    private String commPersonName;

    @XmlElement(name = "CommBirthYyyMmDd", required = true)
    @FieldName("受委任人出生年月日")
    private String commBirthYyyMmDd;

    @XmlElement(name = "CommCityCountyCode", required = true)
    @FieldName("受委任人省市縣市代碼")
    private String commCityCountyCode;

    @XmlElement(name = "CommTownCode", required = true)
    @FieldName("受委任人鄉鎮市區代碼")
    private String commTownCode;

    @XmlElement(name = "CommVillage", required = true)
    @FieldName("受委任人村里")
    private String commVillage;

    @XmlElement(name = "CommNeighbor", required = true)
    @FieldName("受委任人鄰")
    private String commNeighbor;

    @XmlElement(name = "CommStreetDoorplate", required = true)
    @FieldName("受委任人街路門牌")
    private String commStreetDoorplate;

    @XmlElement(name = "UserName", required = true)
    @FieldName("戶籍員姓名 ")
    private String userName;

    @XmlElement(name = "ForeignOfficeMark", required = true)
    @FieldName("外交部註記 ")
    private String foreignOfficeMark;

    @XmlElement(name = "SeqNo1", required = true)
    @FieldName("排序順序1 ")
    private String seqNo1;

    @XmlElement(name = "SeqNo2", required = true)
    @FieldName("排序順序2 ")
    private String seqNo2;

    /**
     * Get the startDate
     * 
     * @return the startDate
     */
    public String getStartDate() {
        return StartDate;
    }

    /**
     * Set the startDate
     * 
     * @param startDate
     *            the startDate to set
     */
    public void setStartDate(String startDate) {
        StartDate = startDate;
    }

    /**
     * Get the endDate
     * 
     * @return the endDate
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Set the endDate
     * 
     * @param endDate
     *            the endDate to set
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * Get the reportcategory
     * 
     * @return the reportcategory
     */
    public String getReportcategory() {
        return reportcategory;
    }

    /**
     * Set the reportcategory
     * 
     * @param reportcategory
     *            the reportcategory to set
     */
    public void setReportcategory(String reportcategory) {
        this.reportcategory = reportcategory;
    }

    /**
     * Get the reporttype
     * 
     * @return the reporttype
     */
    public String getReporttype() {
        return reporttype;
    }

    /**
     * Set the reporttype
     * 
     * @param reporttype
     *            the reporttype to set
     */
    public void setReporttype(String reporttype) {
        this.reporttype = reporttype;
    }

    /**
     * Get the reportuel
     * 
     * @return the reportuel
     */
    public String getReportuel() {
        return reportuel;
    }

    /**
     * Set the reportuel
     * 
     * @param reportuel
     *            the reportuel to set
     */
    public void setReportuel(String reportuel) {
        this.reportuel = reportuel;
    }

    /**
     * Get the areaCode
     * 
     * @return the areaCode
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * Set the areaCode
     * 
     * @param areaCode
     *            the areaCode to set
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    /**
     * Get the adminOfficceCode
     * 
     * @return the adminOfficceCode
     */
    public String getAdminOfficceCode() {
        return adminOfficceCode;
    }

    /**
     * Set the adminOfficceCode
     * 
     * @param adminOfficceCode
     *            the adminOfficceCode to set
     */
    public void setAdminOfficceCode(String adminOfficceCode) {
        this.adminOfficceCode = adminOfficceCode;
    }

    /**
     * Get the acceptSiteId
     * 
     * @return the acceptSiteId
     */
    public String getAcceptSiteId() {
        return acceptSiteId;
    }

    /**
     * Set the acceptSiteId
     * 
     * @param acceptSiteId
     *            the acceptSiteId to set
     */
    public void setAcceptSiteId(String acceptSiteId) {
        this.acceptSiteId = acceptSiteId;
    }

    /**
     * Get the personId
     * 
     * @return the personId
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * Set the personId
     * 
     * @param personId
     *            the personId to set
     */
    public void setPersonId(String personId) {
        this.personId = personId;
    }

    /**
     * Get the sysDate
     * 
     * @return the sysDate
     */
    public String getSysDate() {
        return sysDate;
    }

    /**
     * Set the sysDate
     * 
     * @param sysDate
     *            the sysDate to set
     */
    public void setSysDate(String sysDate) {
        this.sysDate = sysDate;
    }

    /**
     * Get the systime
     * 
     * @return the systime
     */
    public String getSystime() {
        return systime;
    }

    /**
     * Set the systime
     * 
     * @param systime
     *            the systime to set
     */
    public void setSystime(String systime) {
        this.systime = systime;
    }

    /**
     * Get the applyReason
     * 
     * @return the applyReason
     */
    public String getApplyReason() {
        return applyReason;
    }

    /**
     * Set the applyReason
     * 
     * @param applyReason
     *            the applyReason to set
     */
    public void setApplyReason(String applyReason) {
        this.applyReason = applyReason;
    }

    /**
     * Get the checkImage
     * 
     * @return the checkImage
     */
    public String getCheckImage() {
        return checkImage;
    }

    /**
     * Set the checkImage
     * 
     * @param checkImage
     *            the checkImage to set
     */
    public void setCheckImage(String checkImage) {
        this.checkImage = checkImage;
    }

    /**
     * Get the remark
     * 
     * @return the remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Set the remark
     * 
     * @param remark
     *            the remark to set
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * Get the document
     * 
     * @return the document
     */
    public String getDocument() {
        return document;
    }

    /**
     * Set the document
     * 
     * @param document
     *            the document to set
     */
    public void setDocument(String document) {
        this.document = document;
    }

    /**
     * Get the passportScanName
     * 
     * @return the passportScanName
     */
    public String getPassportScanName() {
        return passportScanName;
    }

    /**
     * Set the passportScanName
     * 
     * @param passportScanName
     *            the passportScanName to set
     */
    public void setPassportScanName(String passportScanName) {
        this.passportScanName = passportScanName;
    }

    /**
     * Get the applyPersonName
     * 
     * @return the applyPersonName
     */
    public String getApplyPersonName() {
        return applyPersonName;
    }

    /**
     * Set the applyPersonName
     * 
     * @param applyPersonName
     *            the applyPersonName to set
     */
    public void setApplyPersonName(String applyPersonName) {
        this.applyPersonName = applyPersonName;
    }

    /**
     * Get the applyBirthYyyMmDd
     * 
     * @return the applyBirthYyyMmDd
     */
    public String getApplyBirthYyyMmDd() {
        return applyBirthYyyMmDd;
    }

    /**
     * Set the applyBirthYyyMmDd
     * 
     * @param applyBirthYyyMmDd
     *            the applyBirthYyyMmDd to set
     */
    public void setApplyBirthYyyMmDd(String applyBirthYyyMmDd) {
        this.applyBirthYyyMmDd = applyBirthYyyMmDd;
    }

    /**
     * Get the applyCityCountyCode
     * 
     * @return the applyCityCountyCode
     */
    public String getApplyCityCountyCode() {
        return applyCityCountyCode;
    }

    /**
     * Set the applyCityCountyCode
     * 
     * @param applyCityCountyCode
     *            the applyCityCountyCode to set
     */
    public void setApplyCityCountyCode(String applyCityCountyCode) {
        this.applyCityCountyCode = applyCityCountyCode;
    }

    /**
     * Get the applyTownCode
     * 
     * @return the applyTownCode
     */
    public String getApplyTownCode() {
        return applyTownCode;
    }

    /**
     * Set the applyTownCode
     * 
     * @param applyTownCode
     *            the applyTownCode to set
     */
    public void setApplyTownCode(String applyTownCode) {
        this.applyTownCode = applyTownCode;
    }

    /**
     * Get the applyVillage
     * 
     * @return the applyVillage
     */
    public String getApplyVillage() {
        return applyVillage;
    }

    /**
     * Set the applyVillage
     * 
     * @param applyVillage
     *            the applyVillage to set
     */
    public void setApplyVillage(String applyVillage) {
        this.applyVillage = applyVillage;
    }

    /**
     * Get the applyNeighbor
     * 
     * @return the applyNeighbor
     */
    public String getApplyNeighbor() {
        return applyNeighbor;
    }

    /**
     * Set the applyNeighbor
     * 
     * @param applyNeighbor
     *            the applyNeighbor to set
     */
    public void setApplyNeighbor(String applyNeighbor) {
        this.applyNeighbor = applyNeighbor;
    }

    /**
     * Get the applyStreetDoorplate
     * 
     * @return the applyStreetDoorplate
     */
    public String getApplyStreetDoorplate() {
        return applyStreetDoorplate;
    }

    /**
     * Set the applyStreetDoorplate
     * 
     * @param applyStreetDoorplate
     *            the applyStreetDoorplate to set
     */
    public void setApplyStreetDoorplate(String applyStreetDoorplate) {
        this.applyStreetDoorplate = applyStreetDoorplate;
    }

    /**
     * Get the relationType
     * 
     * @return the relationType
     */
    public String getRelationType() {
        return relationType;
    }

    /**
     * Set the relationType
     * 
     * @param relationType
     *            the relationType to set
     */
    public void setRelationType(String relationType) {
        this.relationType = relationType;
    }

    /**
     * Get the relationPersonId
     * 
     * @return the relationPersonId
     */
    public String getRelationPersonId() {
        return relationPersonId;
    }

    /**
     * Set the relationPersonId
     * 
     * @param relationPersonId
     *            the relationPersonId to set
     */
    public void setRelationPersonId(String relationPersonId) {
        this.relationPersonId = relationPersonId;
    }

    /**
     * Get the relationPersonName
     * 
     * @return the relationPersonName
     */
    public String getRelationPersonName() {
        return relationPersonName;
    }

    /**
     * Set the relationPersonName
     * 
     * @param relationPersonName
     *            the relationPersonName to set
     */
    public void setRelationPersonName(String relationPersonName) {
        this.relationPersonName = relationPersonName;
    }

    /**
     * Get the relationBirthYyyMmDd
     * 
     * @return the relationBirthYyyMmDd
     */
    public String getRelationBirthYyyMmDd() {
        return relationBirthYyyMmDd;
    }

    /**
     * Set the relationBirthYyyMmDd
     * 
     * @param relationBirthYyyMmDd
     *            the relationBirthYyyMmDd to set
     */
    public void setRelationBirthYyyMmDd(String relationBirthYyyMmDd) {
        this.relationBirthYyyMmDd = relationBirthYyyMmDd;
    }

    /**
     * Get the relationCityCountyCode
     * 
     * @return the relationCityCountyCode
     */
    public String getRelationCityCountyCode() {
        return relationCityCountyCode;
    }

    /**
     * Set the relationCityCountyCode
     * 
     * @param relationCityCountyCode
     *            the relationCityCountyCode to set
     */
    public void setRelationCityCountyCode(String relationCityCountyCode) {
        this.relationCityCountyCode = relationCityCountyCode;
    }

    /**
     * Get the relationTownCode
     * 
     * @return the relationTownCode
     */
    public String getRelationTownCode() {
        return relationTownCode;
    }

    /**
     * Set the relationTownCode
     * 
     * @param relationTownCode
     *            the relationTownCode to set
     */
    public void setRelationTownCode(String relationTownCode) {
        this.relationTownCode = relationTownCode;
    }

    /**
     * Get the relationVillage
     * 
     * @return the relationVillage
     */
    public String getRelationVillage() {
        return relationVillage;
    }

    /**
     * Set the relationVillage
     * 
     * @param relationVillage
     *            the relationVillage to set
     */
    public void setRelationVillage(String relationVillage) {
        this.relationVillage = relationVillage;
    }

    /**
     * Get the relationNeighbor
     * 
     * @return the relationNeighbor
     */
    public String getRelationNeighbor() {
        return relationNeighbor;
    }

    /**
     * Set the relationNeighbor
     * 
     * @param relationNeighbor
     *            the relationNeighbor to set
     */
    public void setRelationNeighbor(String relationNeighbor) {
        this.relationNeighbor = relationNeighbor;
    }

    /**
     * Get the relationStreetDoorplate
     * 
     * @return the relationStreetDoorplate
     */
    public String getRelationStreetDoorplate() {
        return relationStreetDoorplate;
    }

    /**
     * Set the relationStreetDoorplate
     * 
     * @param relationStreetDoorplate
     *            the relationStreetDoorplate to set
     */
    public void setRelationStreetDoorplate(String relationStreetDoorplate) {
        this.relationStreetDoorplate = relationStreetDoorplate;
    }

    /**
     * Get the commPersonId
     * 
     * @return the commPersonId
     */
    public String getCommPersonId() {
        return commPersonId;
    }

    /**
     * Set the commPersonId
     * 
     * @param commPersonId
     *            the commPersonId to set
     */
    public void setCommPersonId(String commPersonId) {
        this.commPersonId = commPersonId;
    }

    /**
     * Get the commPersonName
     * 
     * @return the commPersonName
     */
    public String getCommPersonName() {
        return commPersonName;
    }

    /**
     * Set the commPersonName
     * 
     * @param commPersonName
     *            the commPersonName to set
     */
    public void setCommPersonName(String commPersonName) {
        this.commPersonName = commPersonName;
    }

    /**
     * Get the commBirthYyyMmDd
     * 
     * @return the commBirthYyyMmDd
     */
    public String getCommBirthYyyMmDd() {
        return commBirthYyyMmDd;
    }

    /**
     * Set the commBirthYyyMmDd
     * 
     * @param commBirthYyyMmDd
     *            the commBirthYyyMmDd to set
     */
    public void setCommBirthYyyMmDd(String commBirthYyyMmDd) {
        this.commBirthYyyMmDd = commBirthYyyMmDd;
    }

    /**
     * Get the commCityCountyCode
     * 
     * @return the commCityCountyCode
     */
    public String getCommCityCountyCode() {
        return commCityCountyCode;
    }

    /**
     * Set the commCityCountyCode
     * 
     * @param commCityCountyCode
     *            the commCityCountyCode to set
     */
    public void setCommCityCountyCode(String commCityCountyCode) {
        this.commCityCountyCode = commCityCountyCode;
    }

    /**
     * Get the commTownCode
     * 
     * @return the commTownCode
     */
    public String getCommTownCode() {
        return commTownCode;
    }

    /**
     * Set the commTownCode
     * 
     * @param commTownCode
     *            the commTownCode to set
     */
    public void setCommTownCode(String commTownCode) {
        this.commTownCode = commTownCode;
    }

    /**
     * Get the commVillage
     * 
     * @return the commVillage
     */
    public String getCommVillage() {
        return commVillage;
    }

    /**
     * Set the commVillage
     * 
     * @param commVillage
     *            the commVillage to set
     */
    public void setCommVillage(String commVillage) {
        this.commVillage = commVillage;
    }

    /**
     * Get the commNeighbor
     * 
     * @return the commNeighbor
     */
    public String getCommNeighbor() {
        return commNeighbor;
    }

    /**
     * Set the commNeighbor
     * 
     * @param commNeighbor
     *            the commNeighbor to set
     */
    public void setCommNeighbor(String commNeighbor) {
        this.commNeighbor = commNeighbor;
    }

    /**
     * Get the commStreetDoorplate
     * 
     * @return the commStreetDoorplate
     */
    public String getCommStreetDoorplate() {
        return commStreetDoorplate;
    }

    /**
     * Set the commStreetDoorplate
     * 
     * @param commStreetDoorplate
     *            the commStreetDoorplate to set
     */
    public void setCommStreetDoorplate(String commStreetDoorplate) {
        this.commStreetDoorplate = commStreetDoorplate;
    }

    /**
     * Get the userName
     * 
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Set the userName
     * 
     * @param userName
     *            the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Get the foreignOfficeMark
     * 
     * @return the foreignOfficeMark
     */
    public String getForeignOfficeMark() {
        return foreignOfficeMark;
    }

    /**
     * Set the foreignOfficeMark
     * 
     * @param foreignOfficeMark
     *            the foreignOfficeMark to set
     */
    public void setForeignOfficeMark(String foreignOfficeMark) {
        this.foreignOfficeMark = foreignOfficeMark;
    }

    /**
     * Get the seqNo1
     * 
     * @return the seqNo1
     */
    public String getSeqNo1() {
        return seqNo1;
    }

    /**
     * Set the seqNo1
     * 
     * @param seqNo1
     *            the seqNo1 to set
     */
    public void setSeqNo1(String seqNo1) {
        this.seqNo1 = seqNo1;
    }

    /**
     * Get the seqNo2
     * 
     * @return the seqNo2
     */
    public String getSeqNo2() {
        return seqNo2;
    }

    /**
     * Set the seqNo2
     * 
     * @param seqNo2
     *            the seqNo2 to set
     */
    public void setSeqNo2(String seqNo2) {
        this.seqNo2 = seqNo2;
    }

}
