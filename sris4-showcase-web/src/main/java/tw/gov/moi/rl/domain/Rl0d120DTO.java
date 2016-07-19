/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
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
import tw.gov.moi.ae.filesystem.RisFile;
import tw.gov.moi.ae.personimage.domain.ImgInfoDto;
import tw.gov.moi.domain.Rldf002dType;
import tw.gov.moi.domain.Rldf017dType;
import tw.gov.moi.domain.Rldf022dType;
import tw.gov.moi.domain.Rldfm12mType;

/**
 * 例行列印國民身分證 DTO.
 * 
 * @author Weiren.Jheng
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0d120DTO", propOrder = { "scanDate", "scanTime", "newScanDate", "newScanTime", "scanType", "status",
        "personId", "siteId", "gender", "personName", "personNameBase64String", "imageFlag", "nameRomanization",
        "birthYyymmdd", "idCardApplyYyymmdd", "idCardApplyCode", "adminOfficeCode", "applyReason", "father",
        "fatherBase64String", "mother", "motherBase64String", "fosterFather", "fosterFatherBase64String",
        "fosterMother", "fosterMotherBase64String", "spouse", "spouseBase64String", "militaryCode", "birthPlaceCode",
        "birthPlaceBase64String", "countyCode", "countyBase64String", "townCode", "townBase64String", "village",
        "villageBase64String", "neighbor", "streetDoorplate", "streetDoorplateBase64String", "registerContent",
        "printYyymmdd", "printHhmmss", "acceptAdminofficeCode", "settlementAdminofficeCode", "marriageStatus",
        "personNameFlag", "romanizationNameFlag", "fatherNameFlag", "motherNameFlag", "spouseNameFlag", "spouseName",
        "birthPlaceFlag", "reusePhotoFlag", "birthPlace", "rldf017dTypeListTemplate", "personDynamicNoteList",
        "romanizationMark", "fosterParentMark", "idCardPrintFlag", "rldfm12m", "rldf002d", "rldf002dFlag", "rldf022d",
        "rldf022dFlag", "imgPath", "nophotoReason", "specialMark", "applyYyymmdd", "applyHhmmss", "applyReasonText",
        "personIdCardBean", "historyImage", "reuseFlag", "fosterParentRelationship", "isAlert", "birthYyymmddHidden",
        "idCardApplyYyymmddHidden", "disabledVerifyBtn", "imgInfoDto", "birthPlaceContent", "otherBirthPlace",
        "sliderZoom", "rlWarningMessageList" })
@XmlRootElement(name = "Rl0d120DTO")
public class Rl0d120DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 最新取像日期. */
    @XmlElement(name = "ScanDate")
    @FieldName("最新取像日期")
    private String scanDate = "";

    /** 最新取像時間. */
    @XmlElement(name = "ScanTime")
    @FieldName("最新取像時間")
    private String scanTime = "";

    /** 前次取像日期. */
    @XmlElement(name = "NewScanDate")
    @FieldName("前次取像日期")
    private String newScanDate = "";

    /** 前次取像時間. */
    @XmlElement(name = "NewScanTime")
    @FieldName("前次取像時間")
    private String newScanTime = "";

    /** 取像類別. */
    @XmlElement(name = "ScanType")
    @FieldName("取像類別")
    private String scanType = "";

    /** 影像狀態. */
    @XmlElement(name = "Status")
    @FieldName("影像狀態")
    private String status = "";

    /** 國民身分證統一編號. */
    @XmlElement(name = "PersonId")
    @FieldName("國民身分證統一編號")
    private String personId = "";

    /** 作業點代碼. */
    @XmlElement(name = "SiteId")
    @FieldName("作業點代碼")
    private String siteId = "";

    /** 性別. */
    @XmlElement(name = "Gender")
    @FieldName("性別")
    private String gender = "";

    /** 姓名. */
    @XmlElement(name = "PersonName")
    @FieldName("姓名")
    private String personName = "";

    /** 姓名Base64字串. */
    @XmlElement(name = "PersonNameBase64String")
    @FieldName("姓名Base64字串")
    private String personNameBase64String = "";

    /** 相片列印方式. */
    @XmlElement(name = "ImageFlag")
    @FieldName("相片列印方式")
    private String imageFlag = "";

    /** 羅馬拼音. */
    @XmlElement(name = "NameRomanization")
    @FieldName("羅馬拼音")
    private String nameRomanization = "";

    /** 出生日期. */
    @XmlElement(name = "BirthYyymmdd")
    @FieldName("出生日期")
    private String birthYyymmdd = "";

    /** 身分證領補換日期. */
    @XmlElement(name = "IdCardApplyYyymmdd")
    @FieldName("身分證領補換日期")
    private String idCardApplyYyymmdd = "";

    /** 身分證領補換代碼. */
    @XmlElement(name = "IdCardApplyCode")
    @FieldName("身分證領補換代碼")
    private String idCardApplyCode = "";

    /** 戶所代碼. */
    @XmlElement(name = "AdminOfficeCode")
    @FieldName("戶所代碼")
    private String adminOfficeCode = "";

    /** 申請事由. */
    @XmlElement(name = "ApplyReason")
    @FieldName("申請事由")
    private String applyReason = "";

    /** 生父. */
    @XmlElement(name = "Father")
    @FieldName("生父")
    private String father = "";

    /** 生父Base64字串. */
    @XmlElement(name = "FatherBase64String")
    @FieldName("生父Base64字串")
    private String fatherBase64String = "";

    /** 生母. */
    @XmlElement(name = "Mother")
    @FieldName("生母")
    private String mother = "";

    /** 生母Base64字串. */
    @XmlElement(name = "MotherBase64String")
    @FieldName("生母Base64字串")
    private String motherBase64String = "";

    /** 養父. */
    @XmlElement(name = "FosterFather")
    @FieldName("養父")
    private String fosterFather = "";

    /** 養父Base64字串. */
    @XmlElement(name = "FosteratherBase64String")
    @FieldName("養父Base64字串")
    private String fosterFatherBase64String = "";

    /** 養母. */
    @XmlElement(name = "FosterMother")
    @FieldName("養母")
    private String fosterMother = "";

    /** 養母Base64字串. */
    @XmlElement(name = "FosterMotherBase64String")
    @FieldName("養母Base64字串")
    private String fosterMotherBase64String = "";

    /** 配偶姓名. */
    @XmlElement(name = "Spouse")
    @FieldName("配偶姓名")
    private String spouse = "";

    /** 配偶姓名Base64字串. */
    @XmlElement(name = "SpouseBase64String")
    @FieldName("配偶姓名Base64字串")
    private String spouseBase64String = "";

    /** 役別. */
    @XmlElement(name = "MilitaryCode")
    @FieldName("役別")
    private String militaryCode = "";

    /** 出生地. */
    @XmlElement(name = "BirthPlaceCode")
    @FieldName("出生地")
    private String birthPlaceCode = "";

    /** 出生地Base64字串. */
    @XmlElement(name = "BirthPlaceBase64String")
    @FieldName("出生地Base64字串")
    private String birthPlaceBase64String = "";

    /** 省市縣市. */
    @XmlElement(name = "CountyCode")
    @FieldName("省市縣市")
    private String countyCode = "";

    /** 省市縣市Base64字串. */
    @XmlElement(name = "CountyBase64String")
    @FieldName("省市縣市Base64字串")
    private String countyBase64String = "";

    /** 鄉鎮市區. */
    @XmlElement(name = "TownCode")
    @FieldName("鄉鎮市區")
    private String townCode = "";

    /** 鄉鎮市區Base64字串. */
    @XmlElement(name = "TownBase64String")
    @FieldName("鄉鎮市區Base64字串")
    private String townBase64String = "";

    /** 村里. */
    @XmlElement(name = "Village")
    @FieldName("村里")
    private String village = "";

    /** 村里Base64字串. */
    @XmlElement(name = "VillageBase64String")
    @FieldName("村里Base64字串")
    private String villageBase64String = "";

    /** 鄰. */
    @XmlElement(name = "Neighbor")
    @FieldName("鄰")
    private String neighbor = "";

    /** 街路門牌. */
    @XmlElement(name = "StreetDoorplate")
    @FieldName("街路門牌")
    private String streetDoorplate = "";

    /** 街路門牌Base64字串. */
    @XmlElement(name = "StreetDoorplateBase64String")
    @FieldName("街路門牌Base64字串")
    private String streetDoorplateBase64String = "";

    /** 個人記事. */
    @XmlElement(name = "RegisterContent")
    @FieldName("個人記事")
    private String registerContent = "";

    /** 列印日期. */
    @XmlElement(name = "PrintYyymmdd")
    @FieldName("列印日期")
    private String printYyymmdd = "";

    /** 列印時間. */
    @XmlElement(name = "PrintHhmmss")
    @FieldName("列印時間")
    private String printHhmmss = "";

    /** 製證戶所代碼. */
    @XmlElement(name = "AcceptAdminofficeCode")
    @FieldName("製證戶所代碼")
    private String acceptAdminofficeCode = "";

    /** 戶籍地戶所代碼. */
    @XmlElement(name = "SettlementAdminofficeCode")
    @FieldName("戶籍地戶所代碼")
    private String settlementAdminofficeCode = "";

    /** 婚姻狀況. */
    @XmlElement(name = "MarriageStatus")
    @FieldName("婚姻狀況")
    private String marriageStatus = "";

    /** 姓名列印旗標. */
    @XmlElement(name = "PersonNameFlag")
    @FieldName("姓名列印旗標")
    private String personNameFlag = "";

    /** 羅馬拼音列印旗標. */
    @XmlElement(name = "RomanizationNameFlag")
    @FieldName("羅馬拼音列印旗標")
    private String romanizationNameFlag = "";

    /** 父姓名列印旗標. */
    @XmlElement(name = "FatherNameFlag")
    @FieldName("父姓名列印旗標")
    private String fatherNameFlag = "";

    /** 母姓名列印旗標. */
    @XmlElement(name = "MotherNameFlag")
    @FieldName("母姓名列印旗標")
    private String motherNameFlag = "";

    /** 配偶姓名列印旗標. */
    @XmlElement(name = "SpouseNameFlag")
    @FieldName("配偶姓名列印旗標")
    private String spouseNameFlag = "";

    /** 列印配偶姓名. */
    @XmlElement(name = "SpouseName")
    @FieldName("列印配偶姓名")
    private String spouseName = "";

    /** 出生地列印旗標. */
    @XmlElement(name = "BirthPlaceFlag")
    @FieldName("出生地列印旗標")
    private String birthPlaceFlag = "";

    /** 當事人同意以存檔相片列印. */
    @XmlElement(name = "ReusePhotoFlag")
    @FieldName("當事人同意以存檔相片列印")
    private String reusePhotoFlag = "";

    /** 登錄出生地. */
    @XmlElement(name = "BirthPlace")
    @FieldName("登錄出生地")
    private String birthPlace = "";

    /** 沿用影像註記(暫存區). */
    @XmlElement(name = "Rldf017dTypeListTemplate")
    @FieldName("沿用影像註記")
    private List<Rldf017dType> rldf017dTypeListTemplate = new ArrayList<Rldf017dType>();

    /** 個人動態記事. */
    @XmlElement(name = "PersonDynamicNote")
    @FieldName("個人動態記事")
    private List<Rl0d120DTO> personDynamicNoteList = new ArrayList<Rl0d120DTO>();

    /** 羅馬拼音註記. */
    @XmlElement(name = "RomanizationMark")
    @FieldName("羅馬拼音註記")
    private String romanizationMark = "";

    /** 養父母註記. */
    @XmlElement(name = "FosterParentMark")
    @FieldName("養父母註記")
    private String fosterParentMark = "";

    /** 國民身分證列印旗標. */
    @XmlElement(name = "FosterParentMark")
    @FieldName("國民身分證列印旗標")
    private boolean idCardPrintFlag = false;

    /** 國民身分證列印旗標資料檔. */
    @XmlElement(name = "Rldfm12m")
    @FieldName("國民身分證列印旗標資料檔")
    private Rldfm12mType rldfm12m;

    /** 新式國民身分證請領資料檔. */
    @XmlElement(name = "Rldf002d")
    @FieldName("新式國民身分證請領資料檔")
    private Rldf002dType rldf002d;

    /** 判斷是否有新式國民身分證請領資料檔. */
    @XmlElement(name = "Rldf002dFlag")
    @FieldName("判斷是否有新式國民身分證請領資料檔")
    private boolean rldf002dFlag = false;

    /** 辦理他所新式國民身分證請領資料檔. */
    @XmlElement(name = "Rldf022d")
    @FieldName("辦理他所新式國民身分證請領資料檔")
    private Rldf022dType rldf022d;

    /** 判斷是否有辦理他所新式國民身分證請領資料檔. */
    @XmlElement(name = "Rldf022dFlag")
    @FieldName("判斷是否有辦理他所新式國民身分證請領資料檔")
    private boolean rldf022dFlag = false;

    /** 影像路徑. */
    @XmlElement(name = "ImgPath")
    @FieldName("影像路徑")
    private String imgPath = "";

    /** 免列印相片原因. */
    @XmlElement(name = "NophotoReason")
    @FieldName("免列印相片原因")
    private String nophotoReason = "";

    /** 特殊註記. */
    @XmlElement(name = "SpecialMark")
    @FieldName("特殊註記")
    private String specialMark = "";

    /** 受理日期. */
    @XmlElement(name = "ApplyYyymmdd")
    @FieldName("受理日期")
    private String applyYyymmdd = "";

    /** 受理時間. */
    @XmlElement(name = "ApplyHhmmss")
    @FieldName("受理時間")
    private String applyHhmmss = "";

    /** 申請事由文字. */
    @XmlElement(name = "applyReasonText")
    @FieldName("申請事由文字")
    private String applyReasonText = "";

    /** 影像掃描 DTO. */
    @XmlElement(name = "PersonIdCardBean")
    @FieldName("影像掃描 DTO")
    private PersonIdCardBean personIdCardBean;

    /** 歷史影像檔. */
    @XmlElement(name = "HstoryImage")
    @FieldName("歷史影像檔")
    private RisFile historyImage;

    /** 以檔存相片列印. */
    @XmlElement(name = "ReuseFlag")
    @FieldName("以檔存相片列印")
    private String reuseFlag = "";

    /** 養父母與生父母俱有婚姻關係者. */
    @XmlElement(name = "FosterParentRelationship")
    @FieldName("養父母與生父母俱有婚姻關係者")
    private boolean fosterParentRelationship = Boolean.FALSE;

    /** 是否已顯示訊息. */
    @XmlElement(name = "IsAlert")
    @FieldName("是否已顯示訊息")
    private boolean isAlert = false;

    /** 生日(hidden column). */
    @XmlElement(name = "BirthYyymmddHidden")
    @FieldName("是否已顯示訊息")
    private String birthYyymmddHidden = "";

    /** 發證日期 (hidden column). */
    @XmlElement(name = "IdCardApplyYyymmddHidden")
    @FieldName("是否已顯示訊息")
    private String idCardApplyYyymmddHidden = "";

    /** The disabled verify btn. */
    @XmlElement(name = "DisabledVerifyBtn")
    @FieldName("是否 Disabled 驗證按鈕")
    private boolean disabledVerifyBtn = Boolean.TRUE;

    /** 檔存相片 Dto. */
    @XmlElement(name = "ImgInfoDto")
    @FieldName("檔存相片 Dto")
    private ImgInfoDto imgInfoDto;

    /** 出生地內容. */
    @XmlElement(name = "BirthPlaceContent")
    @FieldName("出生地內容")
    private String birthPlaceContent = "";

    /** 其他出生地. */
    @XmlElement(name = "OtherBirthPlace")
    @FieldName("其他出生地")
    private String otherBirthPlace = "";

    /** 圖片縮放比例尺. */
    @XmlElement(name = "sliderZoom")
    @FieldName("圖片縮放比例尺")
    private String sliderZoom = "70";

    /** 警告訊息清單. */
    @XmlElement(name = "RlWarningMessageList")
    @FieldName("警告訊息清單")
    private List<RlWarningMessage> rlWarningMessageList = new ArrayList<RlWarningMessage>();

    /**
     * Gets the scan date.
     * 
     * @return the scan date
     */
    public String getScanDate() {
        return scanDate;
    }

    /**
     * Sets the scan date.
     * 
     * @param scanDate
     *            the new scan date
     */
    public void setScanDate(String scanDate) {
        this.scanDate = scanDate;
    }

    /**
     * Gets the scan time.
     * 
     * @return the scan time
     */
    public String getScanTime() {
        return scanTime;
    }

    /**
     * Sets the scan time.
     * 
     * @param scanTime
     *            the new scan time
     */
    public void setScanTime(String scanTime) {
        this.scanTime = scanTime;
    }

    /**
     * Gets the new scan date.
     * 
     * @return the new scan date
     */
    public String getNewScanDate() {
        return newScanDate;
    }

    /**
     * Sets the new scan date.
     * 
     * @param newScanDate
     *            the new new scan date
     */
    public void setNewScanDate(String newScanDate) {
        this.newScanDate = newScanDate;
    }

    /**
     * Gets the new scan time.
     * 
     * @return the new scan time
     */
    public String getNewScanTime() {
        return newScanTime;
    }

    /**
     * Sets the new scan time.
     * 
     * @param newScanTime
     *            the new new scan time
     */
    public void setNewScanTime(String newScanTime) {
        this.newScanTime = newScanTime;
    }

    /**
     * Gets the scan type.
     * 
     * @return the scan type
     */
    public String getScanType() {
        return scanType;
    }

    /**
     * Sets the scan type.
     * 
     * @param scanType
     *            the new scan type
     */
    public void setScanType(String scanType) {
        this.scanType = scanType;
    }

    /**
     * Gets the status.
     * 
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the status.
     * 
     * @param status
     *            the new status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Gets the person id.
     * 
     * @return the person id
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * Sets the person id.
     * 
     * @param personId
     *            the new person id
     */
    public void setPersonId(String personId) {
        this.personId = personId;
    }

    /**
     * Gets the site id.
     * 
     * @return the site id
     */
    public String getSiteId() {
        return siteId;
    }

    /**
     * Sets the site id.
     * 
     * @param siteId
     *            the new site id
     */
    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    /**
     * Gets the gender.
     * 
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the gender.
     * 
     * @param gender
     *            the new gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Gets the person name.
     * 
     * @return the person name
     */
    public String getPersonName() {
        return personName;
    }

    /**
     * Sets the person name.
     * 
     * @param personName
     *            the new person name
     */
    public void setPersonName(String personName) {
        this.personName = personName;
    }

    /**
     * Gets the image flag.
     * 
     * @return the image flag
     */
    public String getImageFlag() {
        return imageFlag;
    }

    /**
     * Sets the image flag.
     * 
     * @param imageFlag
     *            the new image flag
     */
    public void setImageFlag(String imageFlag) {
        this.imageFlag = imageFlag;
    }

    /**
     * Gets the birth yyymmdd.
     * 
     * @return the birth yyymmdd
     */
    public String getBirthYyymmdd() {
        return birthYyymmdd;
    }

    /**
     * Sets the birth yyymmdd.
     * 
     * @param birthYyymmdd
     *            the new birth yyymmdd
     */
    public void setBirthYyymmdd(String birthYyymmdd) {
        this.birthYyymmdd = birthYyymmdd;
    }

    /**
     * Gets the id card apply yyymmdd.
     * 
     * @return the id card apply yyymmdd
     */
    public String getIdCardApplyYyymmdd() {
        return idCardApplyYyymmdd;
    }

    /**
     * Sets the id card apply yyymmdd.
     * 
     * @param idCardApplyYyymmdd
     *            the new id card apply yyymmdd
     */
    public void setIdCardApplyYyymmdd(String idCardApplyYyymmdd) {
        this.idCardApplyYyymmdd = idCardApplyYyymmdd;
    }

    /**
     * Gets the id card apply code.
     * 
     * @return the id card apply code
     */
    public String getIdCardApplyCode() {
        return idCardApplyCode;
    }

    /**
     * Sets the id card apply code.
     * 
     * @param idCardApplyCode
     *            the new id card apply code
     */
    public void setIdCardApplyCode(String idCardApplyCode) {
        this.idCardApplyCode = idCardApplyCode;
    }

    /**
     * Gets the apply reason.
     * 
     * @return the apply reason
     */
    public String getApplyReason() {
        return applyReason;
    }

    /**
     * Sets the apply reason.
     * 
     * @param applyReason
     *            the new apply reason
     */
    public void setApplyReason(String applyReason) {
        this.applyReason = applyReason;
    }

    /**
     * Gets the father.
     * 
     * @return the father
     */
    public String getFather() {
        return father;
    }

    /**
     * Sets the father.
     * 
     * @param father
     *            the new father
     */
    public void setFather(String father) {
        this.father = father;
    }

    /**
     * Gets the mother.
     * 
     * @return the mother
     */
    public String getMother() {
        return mother;
    }

    /**
     * Sets the mother.
     * 
     * @param mother
     *            the new mother
     */
    public void setMother(String mother) {
        this.mother = mother;
    }

    /**
     * Gets the foster father.
     * 
     * @return the foster father
     */
    public String getFosterFather() {
        return fosterFather;
    }

    /**
     * Sets the foster father.
     * 
     * @param fosterFather
     *            the new foster father
     */
    public void setFosterFather(String fosterFather) {
        this.fosterFather = fosterFather;
    }

    /**
     * Gets the foster mother.
     * 
     * @return the foster mother
     */
    public String getFosterMother() {
        return fosterMother;
    }

    /**
     * Sets the foster mother.
     * 
     * @param fosterMother
     *            the new foster mother
     */
    public void setFosterMother(String fosterMother) {
        this.fosterMother = fosterMother;
    }

    /**
     * Gets the spouse.
     * 
     * @return the spouse
     */
    public String getSpouse() {
        return spouse;
    }

    /**
     * Sets the spouse.
     * 
     * @param spouse
     *            the new spouse
     */
    public void setSpouse(String spouse) {
        this.spouse = spouse;
    }

    /**
     * Gets the military code.
     * 
     * @return the military code
     */
    public String getMilitaryCode() {
        return militaryCode;
    }

    /**
     * Sets the military code.
     * 
     * @param militaryCode
     *            the new military code
     */
    public void setMilitaryCode(String militaryCode) {
        this.militaryCode = militaryCode;
    }

    /**
     * Gets the birth place code.
     * 
     * @return the birth place code
     */
    public String getBirthPlaceCode() {
        return birthPlaceCode;
    }

    /**
     * Sets the birth place code.
     * 
     * @param birthPlaceCode
     *            the new birth place code
     */
    public void setBirthPlaceCode(String birthPlaceCode) {
        this.birthPlaceCode = birthPlaceCode;
    }

    /**
     * Gets the county code.
     * 
     * @return the county code
     */
    public String getCountyCode() {
        return countyCode;
    }

    /**
     * Sets the county code.
     * 
     * @param countyCode
     *            the new county code
     */
    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode;
    }

    /**
     * Gets the town code.
     * 
     * @return the town code
     */
    public String getTownCode() {
        return townCode;
    }

    /**
     * Sets the town code.
     * 
     * @param townCode
     *            the new town code
     */
    public void setTownCode(String townCode) {
        this.townCode = townCode;
    }

    /**
     * Gets the village.
     * 
     * @return the village
     */
    public String getVillage() {
        return village;
    }

    /**
     * Sets the village.
     * 
     * @param village
     *            the new village
     */
    public void setVillage(String village) {
        this.village = village;
    }

    /**
     * Gets the neighbor.
     * 
     * @return the neighbor
     */
    public String getNeighbor() {
        return neighbor;
    }

    /**
     * Sets the neighbor.
     * 
     * @param neighbor
     *            the new neighbor
     */
    public void setNeighbor(String neighbor) {
        this.neighbor = neighbor;
    }

    /**
     * Gets the street doorplate.
     * 
     * @return the street doorplate
     */
    public String getStreetDoorplate() {
        return streetDoorplate;
    }

    /**
     * Sets the street doorplate.
     * 
     * @param streetDoorplate
     *            the new street doorplate
     */
    public void setStreetDoorplate(String streetDoorplate) {
        this.streetDoorplate = streetDoorplate;
    }

    /**
     * Gets the register content.
     * 
     * @return the register content
     */
    public String getRegisterContent() {
        return registerContent;
    }

    /**
     * Sets the register content.
     * 
     * @param registerContent
     *            the new register content
     */
    public void setRegisterContent(String registerContent) {
        this.registerContent = registerContent;
    }

    /**
     * Gets the prints the yyymmdd.
     * 
     * @return the prints the yyymmdd
     */
    public String getPrintYyymmdd() {
        return printYyymmdd;
    }

    /**
     * Sets the prints the yyymmdd.
     * 
     * @param printYyymmdd
     *            the new prints the yyymmdd
     */
    public void setPrintYyymmdd(String printYyymmdd) {
        this.printYyymmdd = printYyymmdd;
    }

    /**
     * Gets the prints the hhmmss.
     * 
     * @return the prints the hhmmss
     */
    public String getPrintHhmmss() {
        return printHhmmss;
    }

    /**
     * Sets the prints the hhmmss.
     * 
     * @param printHhmmss
     *            the new prints the hhmmss
     */
    public void setPrintHhmmss(String printHhmmss) {
        this.printHhmmss = printHhmmss;
    }

    /**
     * Gets the marriage status.
     * 
     * @return the marriage status
     */
    public String getMarriageStatus() {
        return marriageStatus;
    }

    /**
     * Sets the marriage status.
     * 
     * @param marriageStatus
     *            the new marriage status
     */
    public void setMarriageStatus(String marriageStatus) {
        this.marriageStatus = marriageStatus;
    }

    /**
     * Gets the person name flag.
     * 
     * @return the person name flag
     */
    public String getPersonNameFlag() {
        return personNameFlag;
    }

    /**
     * Sets the person name flag.
     * 
     * @param personNameFlag
     *            the new person name flag
     */
    public void setPersonNameFlag(String personNameFlag) {
        this.personNameFlag = personNameFlag;
    }

    /**
     * Gets the romanization name flag.
     * 
     * @return the romanization name flag
     */
    public String getRomanizationNameFlag() {
        return romanizationNameFlag;
    }

    /**
     * Sets the romanization name flag.
     * 
     * @param romanizationNameFlag
     *            the new romanization name flag
     */
    public void setRomanizationNameFlag(String romanizationNameFlag) {
        this.romanizationNameFlag = romanizationNameFlag;
    }

    /**
     * Gets the father name flag.
     * 
     * @return the father name flag
     */
    public String getFatherNameFlag() {
        return fatherNameFlag;
    }

    /**
     * Sets the father name flag.
     * 
     * @param fatherNameFlag
     *            the new father name flag
     */
    public void setFatherNameFlag(String fatherNameFlag) {
        this.fatherNameFlag = fatherNameFlag;
    }

    /**
     * Gets the mother name flag.
     * 
     * @return the mother name flag
     */
    public String getMotherNameFlag() {
        return motherNameFlag;
    }

    /**
     * Sets the mother name flag.
     * 
     * @param motherNameFlag
     *            the new mother name flag
     */
    public void setMotherNameFlag(String motherNameFlag) {
        this.motherNameFlag = motherNameFlag;
    }

    /**
     * Gets the spouse name flag.
     * 
     * @return the spouse name flag
     */
    public String getSpouseNameFlag() {
        return spouseNameFlag;
    }

    /**
     * Sets the spouse name flag.
     * 
     * @param spouseNameFlag
     *            the new spouse name flag
     */
    public void setSpouseNameFlag(String spouseNameFlag) {
        this.spouseNameFlag = spouseNameFlag;
    }

    /**
     * Gets the spouse name.
     * 
     * @return the spouse name
     */
    public String getSpouseName() {
        return spouseName;
    }

    /**
     * Sets the spouse name.
     * 
     * @param spouseName
     *            the new spouse name
     */
    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName;
    }

    /**
     * Gets the birth place flag.
     * 
     * @return the birth place flag
     */
    public String getBirthPlaceFlag() {
        return birthPlaceFlag;
    }

    /**
     * Sets the birth place flag.
     * 
     * @param birthPlaceFlag
     *            the new birth place flag
     */
    public void setBirthPlaceFlag(String birthPlaceFlag) {
        this.birthPlaceFlag = birthPlaceFlag;
    }

    /**
     * Gets the reuse photo flag.
     * 
     * @return the reuse photo flag
     */
    public String getReusePhotoFlag() {
        return reusePhotoFlag;
    }

    /**
     * Sets the reuse photo flag.
     * 
     * @param reusePhotoFlag
     *            the new reuse photo flag
     */
    public void setReusePhotoFlag(String reusePhotoFlag) {
        this.reusePhotoFlag = reusePhotoFlag;
    }

    /**
     * Gets the birth place.
     * 
     * @return the birth place
     */
    public String getBirthPlace() {
        return birthPlace;
    }

    /**
     * Sets the birth place.
     * 
     * @param birthPlace
     *            the new birth place
     */
    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    /**
     * Gets the admin office code.
     * 
     * @return the admin office code
     */
    public String getAdminOfficeCode() {
        return adminOfficeCode;
    }

    /**
     * Sets the admin office code.
     * 
     * @param adminOfficeCode
     *            the new admin office code
     */
    public void setAdminOfficeCode(String adminOfficeCode) {
        this.adminOfficeCode = adminOfficeCode;
    }

    /**
     * Gets the accept adminoffice code.
     * 
     * @return the accept adminoffice code
     */
    public String getAcceptAdminofficeCode() {
        return acceptAdminofficeCode;
    }

    /**
     * Sets the accept adminoffice code.
     * 
     * @param acceptAdminofficeCode
     *            the new accept adminoffice code
     */
    public void setAcceptAdminofficeCode(String acceptAdminofficeCode) {
        this.acceptAdminofficeCode = acceptAdminofficeCode;
    }

    /**
     * Gets the settlement adminoffice code.
     * 
     * @return the settlement adminoffice code
     */
    public String getSettlementAdminofficeCode() {
        return settlementAdminofficeCode;
    }

    /**
     * Sets the settlement adminoffice code.
     * 
     * @param settlementAdminofficeCode
     *            the new settlement adminoffice code
     */
    public void setSettlementAdminofficeCode(String settlementAdminofficeCode) {
        this.settlementAdminofficeCode = settlementAdminofficeCode;
    }

    /**
     * Gets the rldf017d type list template.
     * 
     * @return the rldf017d type list template
     */
    public List<Rldf017dType> getRldf017dTypeListTemplate() {
        return rldf017dTypeListTemplate;
    }

    /**
     * Sets the rldf017d type list template.
     * 
     * @param rldf017dTypeListTemplate
     *            the new rldf017d type list template
     */
    public void setRldf017dTypeListTemplate(List<Rldf017dType> rldf017dTypeListTemplate) {
        this.rldf017dTypeListTemplate = rldf017dTypeListTemplate;
    }

    /**
     * Gets the person dynamic note list.
     * 
     * @return the person dynamic note list
     */
    public List<Rl0d120DTO> getPersonDynamicNoteList() {
        return personDynamicNoteList;
    }

    /**
     * Sets the person dynamic note list.
     * 
     * @param personDynamicNoteList
     *            the new person dynamic note list
     */
    public void setPersonDynamicNoteList(List<Rl0d120DTO> personDynamicNoteList) {
        this.personDynamicNoteList = personDynamicNoteList;
    }

    /**
     * Gets the name romanization.
     * 
     * @return the name romanization
     */
    public String getNameRomanization() {
        return nameRomanization;
    }

    /**
     * Sets the name romanization.
     * 
     * @param nameRomanization
     *            the new name romanization
     */
    public void setNameRomanization(String nameRomanization) {
        this.nameRomanization = nameRomanization;
    }

    /**
     * Gets the romanization mark.
     * 
     * @return the romanization mark
     */
    public String getRomanizationMark() {
        return romanizationMark;
    }

    /**
     * Sets the romanization mark.
     * 
     * @param romanizationMark
     *            the new romanization mark
     */
    public void setRomanizationMark(String romanizationMark) {
        this.romanizationMark = romanizationMark;
    }

    /**
     * Gets the foster parent mark.
     * 
     * @return the foster parent mark
     */
    public String getFosterParentMark() {
        return fosterParentMark;
    }

    /**
     * Sets the foster parent mark.
     * 
     * @param fosterParentMark
     *            the new foster parent mark
     */
    public void setFosterParentMark(String fosterParentMark) {
        this.fosterParentMark = fosterParentMark;
    }

    /**
     * Checks if is id card print flag.
     * 
     * @return true, if is id card print flag
     */
    public boolean isIdCardPrintFlag() {
        return idCardPrintFlag;
    }

    /**
     * Sets the id card print flag.
     * 
     * @param idCardPrintFlag
     *            the new id card print flag
     */
    public void setIdCardPrintFlag(boolean idCardPrintFlag) {
        this.idCardPrintFlag = idCardPrintFlag;
    }

    /**
     * Gets the rldfm12m.
     * 
     * @return the rldfm12m
     */
    public Rldfm12mType getRldfm12m() {
        return rldfm12m;
    }

    /**
     * Sets the rldfm12m.
     * 
     * @param rldfm12m
     *            the new rldfm12m
     */
    public void setRldfm12m(Rldfm12mType rldfm12m) {
        this.rldfm12m = rldfm12m;
    }

    /**
     * Gets the rldf002d.
     * 
     * @return the rldf002d
     */
    public Rldf002dType getRldf002d() {
        return rldf002d;
    }

    /**
     * Sets the rldf002d.
     * 
     * @param rldf002d
     *            the new rldf002d
     */
    public void setRldf002d(Rldf002dType rldf002d) {
        this.rldf002d = rldf002d;
    }

    /**
     * Checks if is rldf002d flag.
     * 
     * @return true, if is rldf002d flag
     */
    public boolean isRldf002dFlag() {
        return rldf002dFlag;
    }

    /**
     * Sets the rldf002d flag.
     * 
     * @param rldf002dFlag
     *            the new rldf002d flag
     */
    public void setRldf002dFlag(boolean rldf002dFlag) {
        this.rldf002dFlag = rldf002dFlag;
    }

    /**
     * Gets the rldf022d.
     * 
     * @return the rldf022d
     */
    public Rldf022dType getRldf022d() {
        return rldf022d;
    }

    /**
     * Sets the rldf022d.
     * 
     * @param rldf022d
     *            the new rldf022d
     */
    public void setRldf022d(Rldf022dType rldf022d) {
        this.rldf022d = rldf022d;
    }

    /**
     * Checks if is rldf022d flag.
     * 
     * @return true, if is rldf022d flag
     */
    public boolean isRldf022dFlag() {
        return rldf022dFlag;
    }

    /**
     * Sets the rldf022d flag.
     * 
     * @param rldf022dFlag
     *            the new rldf022d flag
     */
    public void setRldf022dFlag(boolean rldf022dFlag) {
        this.rldf022dFlag = rldf022dFlag;
    }

    /**
     * Gets the img path.
     * 
     * @return the img path
     */
    public String getImgPath() {
        return imgPath;
    }

    /**
     * Sets the img path.
     * 
     * @param imgPath
     *            the new img path
     */
    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    /**
     * Gets the nophoto reason.
     * 
     * @return the nophoto reason
     */
    public String getNophotoReason() {
        return nophotoReason;
    }

    /**
     * Sets the nophoto reason.
     * 
     * @param nophotoReason
     *            the new nophoto reason
     */
    public void setNophotoReason(String nophotoReason) {
        this.nophotoReason = nophotoReason;
    }

    /**
     * Gets the special mark.
     * 
     * @return the special mark
     */
    public String getSpecialMark() {
        return specialMark;
    }

    /**
     * Sets the special mark.
     * 
     * @param specialMark
     *            the new special mark
     */
    public void setSpecialMark(String specialMark) {
        this.specialMark = specialMark;
    }

    /**
     * Gets the apply yyymmdd.
     * 
     * @return the apply yyymmdd
     */
    public String getApplyYyymmdd() {
        return applyYyymmdd;
    }

    /**
     * Sets the apply yyymmdd.
     * 
     * @param applyYyymmdd
     *            the new apply yyymmdd
     */
    public void setApplyYyymmdd(String applyYyymmdd) {
        this.applyYyymmdd = applyYyymmdd;
    }

    /**
     * Gets the apply hhmmss.
     * 
     * @return the apply hhmmss
     */
    public String getApplyHhmmss() {
        return applyHhmmss;
    }

    /**
     * Sets the apply hhmmss.
     * 
     * @param applyHhmmss
     *            the new apply hhmmss
     */
    public void setApplyHhmmss(String applyHhmmss) {
        this.applyHhmmss = applyHhmmss;
    }

    /**
     * Gets the apply reason text.
     * 
     * @return the apply reason text
     */
    public String getApplyReasonText() {
        return applyReasonText;
    }

    /**
     * Sets the apply reason text.
     * 
     * @param applyReasonText
     *            the new apply reason text
     */
    public void setApplyReasonText(String applyReasonText) {
        this.applyReasonText = applyReasonText;
    }

    /**
     * Gets the person id card bean.
     * 
     * @return the person id card bean
     */
    public PersonIdCardBean getPersonIdCardBean() {
        return personIdCardBean;
    }

    /**
     * Sets the person id card bean.
     * 
     * @param personIdCardBean
     *            the new person id card bean
     */
    public void setPersonIdCardBean(PersonIdCardBean personIdCardBean) {
        this.personIdCardBean = personIdCardBean;
    }

    /**
     * Gets the history image.
     * 
     * @return the history image
     */
    public RisFile getHistoryImage() {
        return historyImage;
    }

    /**
     * Sets the history image.
     * 
     * @param historyImage
     *            the new history image
     */
    public void setHistoryImage(RisFile historyImage) {
        this.historyImage = historyImage;
    }

    /**
     * Gets the reuse flag.
     * 
     * @return the reuse flag
     */
    public String getReuseFlag() {
        return reuseFlag;
    }

    /**
     * Sets the reuse flag.
     * 
     * @param reuseFlag
     *            the new reuse flag
     */
    public void setReuseFlag(String reuseFlag) {
        this.reuseFlag = reuseFlag;
    }

    /**
     * Checks if is foster parent relationship.
     * 
     * @return true, if is foster parent relationship
     */
    public boolean isFosterParentRelationship() {
        return fosterParentRelationship;
    }

    /**
     * Sets the foster parent relationship.
     * 
     * @param fosterParentRelationship
     *            the new foster parent relationship
     */
    public void setFosterParentRelationship(boolean fosterParentRelationship) {
        this.fosterParentRelationship = fosterParentRelationship;
    }

    /**
     * Checks if is alert.
     * 
     * @return true, if is alert
     */
    public boolean isAlert() {
        return isAlert;
    }

    /**
     * Sets the alert.
     * 
     * @param isAlert
     *            the new alert
     */
    public void setAlert(boolean isAlert) {
        this.isAlert = isAlert;
    }

    /**
     * Gets the birth yyymmdd hidden.
     * 
     * @return the birth yyymmdd hidden
     */
    public String getBirthYyymmddHidden() {
        return birthYyymmddHidden;
    }

    /**
     * Sets the birth yyymmdd hidden.
     * 
     * @param birthYyymmddHidden
     *            the new birth yyymmdd hidden
     */
    public void setBirthYyymmddHidden(String birthYyymmddHidden) {
        this.birthYyymmddHidden = birthYyymmddHidden;
    }

    /**
     * Gets the id card apply yyymmdd hidden.
     * 
     * @return the id card apply yyymmdd hidden
     */
    public String getIdCardApplyYyymmddHidden() {
        return idCardApplyYyymmddHidden;
    }

    /**
     * Sets the id card apply yyymmdd hidden.
     * 
     * @param idCardApplyYyymmddHidden
     *            the new id card apply yyymmdd hidden
     */
    public void setIdCardApplyYyymmddHidden(String idCardApplyYyymmddHidden) {
        this.idCardApplyYyymmddHidden = idCardApplyYyymmddHidden;
    }

    /**
     * Checks if is disabled verify btn.
     * 
     * @return true, if is disabled verify btn
     */
    public boolean isDisabledVerifyBtn() {
        return disabledVerifyBtn;
    }

    /**
     * Sets the disabled verify btn.
     * 
     * @param disabledVerifyBtn
     *            the new disabled verify btn
     */
    public void setDisabledVerifyBtn(boolean disabledVerifyBtn) {
        this.disabledVerifyBtn = disabledVerifyBtn;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Rl0d120DTO [scanDate=" + scanDate + ", scanTime=" + scanTime + ", newScanDate=" + newScanDate
                + ", newScanTime=" + newScanTime + ", scanType=" + scanType + ", status=" + status + ", personId="
                + personId + ", siteId=" + siteId + ", gender=" + gender + ", personName=" + personName
                + ", imageFlag=" + imageFlag + ", nameRomanization=" + nameRomanization + ", birthYyymmdd="
                + birthYyymmdd + ", idCardApplyYyymmdd=" + idCardApplyYyymmdd + ", idCardApplyCode=" + idCardApplyCode
                + ", adminOfficeCode=" + adminOfficeCode + ", applyReason=" + applyReason + ", father=" + father
                + ", mother=" + mother + ", fosterFather=" + fosterFather + ", fosterMother=" + fosterMother
                + ", spouse=" + spouse + ", militaryCode=" + militaryCode + ", birthPlaceCode=" + birthPlaceCode
                + ", countyCode=" + countyCode + ", townCode=" + townCode + ", village=" + village + ", neighbor="
                + neighbor + ", streetDoorplate=" + streetDoorplate + ", registerContent=" + registerContent
                + ", printYyymmdd=" + printYyymmdd + ", printHhmmss=" + printHhmmss + ", acceptAdminofficeCode="
                + acceptAdminofficeCode + ", settlementAdminofficeCode=" + settlementAdminofficeCode
                + ", marriageStatus=" + marriageStatus + ", personNameFlag=" + personNameFlag
                + ", romanizationNameFlag=" + romanizationNameFlag + ", fatherNameFlag=" + fatherNameFlag
                + ", motherNameFlag=" + motherNameFlag + ", spouseNameFlag=" + spouseNameFlag + ", spouseName="
                + spouseName + ", birthPlaceFlag=" + birthPlaceFlag + ", reusePhotoFlag=" + reusePhotoFlag
                + ", birthPlace=" + birthPlace + ", rldf017dTypeListTemplate=" + rldf017dTypeListTemplate
                + ", personDynamicNoteList=" + personDynamicNoteList + ", romanizationMark=" + romanizationMark
                + ", fosterParentMark=" + fosterParentMark + ", idCardPrintFlag=" + idCardPrintFlag + ", rldfm12m="
                + rldfm12m + ", rldf002d=" + rldf002d + ", rldf002dFlag=" + rldf002dFlag + ", rldf022d=" + rldf022d
                + ", rldf022dFlag=" + rldf022dFlag + ", imgPath=" + imgPath + ", nophotoReason=" + nophotoReason
                + ", specialMark=" + specialMark + ", applyYyymmdd=" + applyYyymmdd + ", applyHhmmss=" + applyHhmmss
                + ", applyReasonText=" + applyReasonText + ", personIdCardBean=" + personIdCardBean + ", historyImage="
                + historyImage + ", reuseFlag=" + reuseFlag + ", fosterParentRelationship=" + fosterParentRelationship
                + ", isAlert=" + isAlert + ", birthYyymmddHidden=" + birthYyymmddHidden + ", idCardApplyYyymmddHidden="
                + idCardApplyYyymmddHidden + ", disabledVerifyBtn=" + disabledVerifyBtn + "]";
    }

    /**
     * Gets the img info dto.
     * 
     * @return the img info dto
     */
    public ImgInfoDto getImgInfoDto() {
        return imgInfoDto;
    }

    /**
     * Sets the img info dto.
     * 
     * @param imgInfoDto
     *            the new img info dto
     */
    public void setImgInfoDto(ImgInfoDto imgInfoDto) {
        this.imgInfoDto = imgInfoDto;
    }

    /**
     * Gets the birth place content.
     * 
     * @return the birth place content
     */
    public String getBirthPlaceContent() {
        return birthPlaceContent;
    }

    /**
     * Sets the birth place content.
     * 
     * @param birthPlaceContent
     *            the new birth place content
     */
    public void setBirthPlaceContent(String birthPlaceContent) {
        this.birthPlaceContent = birthPlaceContent;
    }

    /**
     * Gets the other birth place.
     * 
     * @return the other birth place
     */
    public String getOtherBirthPlace() {
        return otherBirthPlace;
    }

    /**
     * Sets the other birth place.
     * 
     * @param otherBirthPlace
     *            the new other birth place
     */
    public void setOtherBirthPlace(String otherBirthPlace) {
        this.otherBirthPlace = otherBirthPlace;
    }

    public String getSliderZoom() {
        return sliderZoom;
    }

    public void setSliderZoom(String sliderZoom) {
        this.sliderZoom = sliderZoom;
    }

    public List<RlWarningMessage> getRlWarningMessageList() {
        return rlWarningMessageList;
    }

    public void setRlWarningMessageList(List<RlWarningMessage> rlWarningMessageList) {
        this.rlWarningMessageList = rlWarningMessageList;
    }

    public String getPersonNameBase64String() {
        return personNameBase64String;
    }

    public void setPersonNameBase64String(String personNameBase64String) {
        this.personNameBase64String = personNameBase64String;
    }

    public String getFatherBase64String() {
        return fatherBase64String;
    }

    public void setFatherBase64String(String fatherBase64String) {
        this.fatherBase64String = fatherBase64String;
    }

    public String getMotherBase64String() {
        return motherBase64String;
    }

    public void setMotherBase64String(String motherBase64String) {
        this.motherBase64String = motherBase64String;
    }

    public String getFosterFatherBase64String() {
        return fosterFatherBase64String;
    }

    public void setFosterFatherBase64String(String fosterFatherBase64String) {
        this.fosterFatherBase64String = fosterFatherBase64String;
    }

    public String getFosterMotherBase64String() {
        return fosterMotherBase64String;
    }

    public void setFosterMotherBase64String(String fosterMotherBase64String) {
        this.fosterMotherBase64String = fosterMotherBase64String;
    }

    public String getSpouseBase64String() {
        return spouseBase64String;
    }

    public void setSpouseBase64String(String spouseBase64String) {
        this.spouseBase64String = spouseBase64String;
    }

    public String getVillageBase64String() {
        return villageBase64String;
    }

    public void setVillageBase64String(String villageBase64String) {
        this.villageBase64String = villageBase64String;
    }

    public String getStreetDoorplateBase64String() {
        return streetDoorplateBase64String;
    }

    public void setStreetDoorplateBase64String(String streetDoorplateBase64String) {
        this.streetDoorplateBase64String = streetDoorplateBase64String;
    }

    public String getBirthPlaceBase64String() {
        return birthPlaceBase64String;
    }

    public void setBirthPlaceBase64String(String birthPlaceBase64String) {
        this.birthPlaceBase64String = birthPlaceBase64String;
    }

    public String getCountyBase64String() {
        return countyBase64String;
    }

    public void setCountyBase64String(String countyBase64String) {
        this.countyBase64String = countyBase64String;
    }

    public String getTownBase64String() {
        return townBase64String;
    }

    public void setTownBase64String(String townBase64String) {
        this.townBase64String = townBase64String;
    }

}
