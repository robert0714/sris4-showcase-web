/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.dto.XLDFDomainDTO;
import tw.gov.moi.rl.dto.rl00001.XLDFEmptyForeignRoleDTO;
import tw.gov.moi.rl.dto.rl00001.XLDFEmptyRemoveDTO;
import tw.gov.moi.rl.dto.rl00001.XLDFForeignRoleDTO;
import tw.gov.moi.rl.dto.rl00001.XLDFGeneralIDCardLostApplyDTO;
import tw.gov.moi.rl.dto.rl00001.XLDFIDCardLostApplyDTO;
import tw.gov.moi.rl.dto.rl00001.XLDFNoneIDCardLostApplyDTO;
import tw.gov.moi.rl.dto.rl00001.XLDFRemoveDTO;

/**
 * 個人基本資料DTO
 * 
 * @author DAXIONG
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XLDFPersonDataDTO", propOrder = { "siteId", "personId", "areaCode", "adminOfficeCode", "nameType",
        "personName", "lastName", "firstName", "gender", "birthOrderSex", "birthYyymmdd", "householdHeadId",
        "householdId", "moveInYyymmdd", "educationCode", "education", "businessCode", "business", "occupationCode",
        "occupation", "spouseId", "spouseIdMark", "spouse", "spouseLastName", "spouseFirstName", "fatherId",
        "fatherIdMark", "father", "fatherLastName", "fatherFirstName", "motherId", "motherIdMark", "mother",
        "motherLastName", "motherFirstName", "fosterFatherId", "fosterFatherSiteId", "fosterFatherIdMark",
        "fosterFather", "fosterFatherLastName", "fosterFatherFirstName", "fosterMotherId", "fosterMotherSiteId",
        "fosterMotherIdMark", "fosterMother", "fosterMotherLastName", "idCardLostApplyMark", "idCardLostApplyYyymmdd",
        "idCardLostApplyHhmmss", "fosterMotherFirstName", "correctYyy", "birthPlaceCode", "otherBirthPlace",
        "livingStyleCode", "militaryCode", "idCardApplyYyymmdd", "idCardApplyCode", "sealApplyYyymmdd",
        "sealApplyCode", "fosterParentMark", "relationship", "specialMark", "personalMark", "mscMark", "marriageCode",
        "moveOutType", "idCardApplyMark", "educationMark", "livingRaceType", "romanizationMark", "violenceMark",
        "assignAddrChangeMode", "assignAddrTypeCode", "assignAddrZone", "assignAddrCountyCode", "assignAddrAreaCode",
        "assignAddrStreetDoorplate", "mailbox", "dayPhoneAreacode", "dayPhoneNumber", "dayPhoneExtension",
        "nightPhoneAreacode", "nightPhoneNumber", "nightPhoneExtension", "cellPhoneNumber", "emailAddress",
        "imAccount", "regType", "sourceSiteId", "nationCode", "nation", "englishName" })
@XmlRootElement(name = "XLDFPersonDataDTO")
public abstract class XLDFPersonDataDTO implements XLDFDomainDTO, Serializable {

    private static final long serialVersionUID = 1L;

    /** Site id */
    @XmlElement(name = "SiteId", required = true)
    @FieldName("Site id")
    private String siteId;

    /** 統號 */
    @XmlElement(name = "PersonId", required = true)
    @FieldName("統號")
    private String personId;

    /** 行政區域代碼 */
    @XmlElement(name = "AreaCode", required = true)
    @FieldName("行政區域代碼")
    private String areaCode;

    /** 戶所代碼 */
    @XmlElement(name = "AdminOfficeCode", required = true)
    @FieldName("戶所代碼")
    private String adminOfficeCode;

    /** 姓名類別 */
    @XmlElement(name = "NameType", required = true)
    @FieldName("姓名類別")
    private String nameType;

    /** 姓名 */
    @XmlElement(name = "PersonName", required = true)
    @FieldName("姓名")
    private String personName;

    /** 姓 */
    @XmlElement(name = "LastName", required = true)
    @FieldName("姓")
    private String lastName;

    /** 名 */
    @XmlElement(name = "FirstName", required = true)
    @FieldName("名")
    private String firstName;

    /** 性別 */
    @XmlElement(name = "Gender", required = true)
    @FieldName("性別")
    private String gender;

    /** 出生別代碼 */
    @XmlElement(name = "BirthOrderSex", required = true)
    @FieldName("出生別代碼")
    private String birthOrderSex;

    /** 出生日期 */
    @XmlElement(name = "BirthYyymmdd", required = true)
    @FieldName("出生日期")
    private String birthYyymmdd;

    /** 戶長統號 */
    @XmlElement(name = "HouseholdHeadId", required = true)
    @FieldName("戶長統號")
    private String householdHeadId;

    /** 戶號 */
    @XmlElement(name = "HouseholdId", required = true)
    @FieldName("戶號")
    private String householdId;

    /** 遷入日期 */
    @XmlElement(name = "MoveInYyymmdd", required = true)
    @FieldName("遷入日期")
    private String moveInYyymmdd;

    /** 教育程度代碼 */
    @XmlElement(name = "EducationCode", required = true)
    @FieldName("教育程度代碼")
    private String educationCode;

    /** 教育程度(學校科系名稱) */
    @XmlElement(name = "Education", required = true)
    @FieldName("教育程度(學校科系名稱)")
    private String education;

    /** 行業代碼 */
    @XmlElement(name = "BusinessCode", required = true)
    @FieldName("行業代碼")
    private String businessCode;

    /** 行業名稱 */
    @XmlElement(name = "Business", required = true)
    @FieldName("行業名稱")
    private String business;

    /** 職業代碼 */
    @XmlElement(name = "OccupationCode", required = true)
    @FieldName("職業代碼")
    private String occupationCode;

    /** 職業名稱 */
    @XmlElement(name = "Occupation", required = true)
    @FieldName("職業名稱")
    private String occupation;

    /** 配偶統號 */
    @XmlElement(name = "SpouseId", required = true)
    @FieldName("配偶統號")
    private String spouseId;

    /** 配偶增編識別碼 */
    @XmlElement(name = "SpouseIdMark", required = true)
    @FieldName("配偶增編識別碼")
    private String spouseIdMark;

    /** 配偶姓名 */
    @XmlElement(name = "Spouse", required = true)
    @FieldName("配偶姓名")
    private String spouse;

    /** 配偶姓 */
    @XmlElement(name = "SpouseLastName", required = true)
    @FieldName("配偶姓")
    private String spouseLastName;

    /** 配偶名 */
    @XmlElement(name = "SpouseFirstName", required = true)
    @FieldName("配偶名")
    private String spouseFirstName;

    /** 父統號 */
    @XmlElement(name = "FatherId", required = true)
    @FieldName("父統號")
    private String fatherId;

    /** 父增編識別碼 */
    @XmlElement(name = "FatherIdMark", required = true)
    @FieldName("父增編識別碼")
    private String fatherIdMark;

    /** 父姓名 */
    @XmlElement(name = "Father", required = true)
    @FieldName("父姓名")
    private String father;

    /** 父姓 */
    @XmlElement(name = "FatherLastName", required = true)
    @FieldName("父姓")
    private String fatherLastName;

    /** 父名 */
    @XmlElement(name = "FatherFirstName", required = true)
    @FieldName("父名")
    private String fatherFirstName;

    /** 母統號 */
    @XmlElement(name = "MotherId", required = true)
    @FieldName("母統號")
    private String motherId;

    /** 母增編識別碼 */
    @XmlElement(name = "MotherIdMark", required = true)
    @FieldName("母增編識別碼")
    private String motherIdMark;

    /** 母姓名 */
    @XmlElement(name = "Mother", required = true)
    @FieldName("母姓名")
    private String mother;

    /** 母姓 */
    @XmlElement(name = "MotherLastName", required = true)
    @FieldName("母姓")
    private String motherLastName;

    /** 母名 */
    @XmlElement(name = "MotherFirstName", required = true)
    @FieldName("母名")
    private String motherFirstName;

    /** 養父統號 */
    @XmlElement(name = "FosterFatherId", required = true)
    @FieldName("養父統號")
    private String fosterFatherId;

    /** 養父Site id */
    @XmlElement(name = "FosterFatherSiteId", required = true)
    @FieldName("養父Site id")
    private String fosterFatherSiteId;

    /** 養父增編識別碼 */
    @XmlElement(name = "FosterFatherIdMark", required = true)
    @FieldName("養父增編識別碼")
    private String fosterFatherIdMark;

    /** 養父姓名 */
    @XmlElement(name = "FosterFather", required = true)
    @FieldName("養父姓名")
    private String fosterFather;

    /** 養父姓 */
    @XmlElement(name = "FosterFatherLastName", required = true)
    @FieldName("養父姓")
    private String fosterFatherLastName;

    /** 養父名 */
    @XmlElement(name = "FosterFatherFirstName", required = true)
    @FieldName("養父名")
    private String fosterFatherFirstName;

    /** 養母統號 */
    @XmlElement(name = "FosterMotherId", required = true)
    @FieldName("養母統號")
    private String fosterMotherId;

    /** 養母Site id */
    @XmlElement(name = "FosterMotherSiteId", required = true)
    @FieldName("養母Site id")
    private String fosterMotherSiteId;

    /** 養母增編識別碼 */
    @XmlElement(name = "FosterMotherIdMark", required = true)
    @FieldName("養母增編識別碼")
    private String fosterMotherIdMark;

    /** 養母姓名 */
    @XmlElement(name = "FosterMother", required = true)
    @FieldName("養母姓名")
    private String fosterMother;

    /** 養母姓 */
    @XmlElement(name = "FosterMotherLastName", required = true)
    @FieldName("養母姓")
    private String fosterMotherLastName;

    /** 國民身分證掛失註記 */
    @XmlElement(name = "IdCardLostApplyMark", required = true)
    @FieldName("國民身分證掛失註記")
    private String idCardLostApplyMark;

    /** 國民身分證掛失日期 */
    @XmlElement(name = "IdCardLostApplyYyymmdd", required = true)
    @FieldName("國民身分證掛失日期")
    private String idCardLostApplyYyymmdd;

    /** 國民身分證掛失時間 */
    @XmlElement(name = "IdCardLostApplyHhmmss", required = true)
    @FieldName("國民身分證掛失時間")
    private String idCardLostApplyHhmmss;

    /** 養母名 */
    @XmlElement(name = "FosterMotherFirstName", required = true)
    @FieldName("養母名")
    private String fosterMotherFirstName;

    /** 戶口校正年份 */
    @XmlElement(name = "CorrectYyy", required = true)
    @FieldName("戶口校正年份")
    private String correctYyy;

    /** 出生地代碼 */
    @XmlElement(name = "BirthPlaceCode", required = true)
    @FieldName("出生地代碼")
    private String birthPlaceCode;

    /** 其他出生地 */
    @XmlElement(name = "OtherBirthPlace", required = true)
    @FieldName("其他出生地")
    private String otherBirthPlace;

    /** 原住民註記 */
    @XmlElement(name = "LivingStyleCode", required = true)
    @FieldName("原住民註記")
    private String livingStyleCode;

    /** 役別代碼 */
    @XmlElement(name = "MilitaryCode", required = true)
    @FieldName("役別代碼")
    private String militaryCode;

    /** 身分證領補換日期 */
    @XmlElement(name = "IdCardApplyYyymmdd", required = true)
    @FieldName("身分證領補換日期")
    private String idCardApplyYyymmdd;

    /** 身分證領補換代碼 */
    @XmlElement(name = "IdCardApplyCode", required = true)
    @FieldName("身分證領補換代碼")
    private String idCardApplyCode;

    /** 印登日期 */
    @XmlElement(name = "SealApplyYyymmdd", required = true)
    @FieldName("印登日期")
    private String sealApplyYyymmdd;

    /** 印登代碼 */
    @XmlElement(name = "SealApplyCode", required = true)
    @FieldName("印登代碼")
    private String sealApplyCode;

    /** 養父母註記 */
    @XmlElement(name = "FosterParentMark", required = true)
    @FieldName("養父母註記")
    private String fosterParentMark;

    /** 與戶長關係 */
    @XmlElement(name = "Relationship", required = true)
    @FieldName("與戶長關係")
    private String relationship;

    /** 特殊註記 */
    @XmlElement(name = "SpecialMark", required = true)
    @FieldName("特殊註記")
    private String specialMark;

    /** 個人註記 */
    @XmlElement(name = "PersonalMark", required = true)
    @FieldName("個人註記")
    private String personalMark;

    /** 所內註記 */
    @XmlElement(name = "MscMark", required = true)
    @FieldName("所內註記")
    private String mscMark;

    /** 婚姻狀況 */
    @XmlElement(name = "MarriageCode", required = true)
    @FieldName("婚姻狀況")
    private String marriageCode;

    /** 遷出類別 */
    @XmlElement(name = "MoveOutType", required = true)
    @FieldName("遷出類別")
    private String moveOutType;

    /** 國民身分證請領註記 */
    @XmlElement(name = "IdCardApplyMark", required = true)
    @FieldName("國民身分證請領註記")
    private String idCardApplyMark;

    /** 教育程度註記 */
    @XmlElement(name = "EducationMark", required = true)
    @FieldName("教育程度註記")
    private String educationMark;

    /** 族別 */
    @XmlElement(name = "LivingRaceType", required = true)
    @FieldName("族別")
    private String livingRaceType;

    /** 羅馬拼音註記 */
    @XmlElement(name = "RomanizationMark", required = true)
    @FieldName("羅馬拼音註記")
    private String romanizationMark;

    /** 家暴註記 */
    @XmlElement(name = "ViolenceMark", required = true)
    @FieldName("家暴註記")
    private String violenceMark;

    /** 指定地址-來源方式 */
    @XmlElement(name = "AssignAddrChangeMode", required = true)
    @FieldName("指定地址-來源方式")
    private String assignAddrChangeMode;

    /** 指定地址-類別代碼 */
    @XmlElement(name = "AssignAddrTypeCode", required = true)
    @FieldName("指定地址-類別代碼")
    private String assignAddrTypeCode;

    /** 郵遞區號 */
    @XmlElement(name = "AssignAddrZone", required = true)
    @FieldName("郵遞區號")
    private String assignAddrZone;

    /** 指定地址-省市縣市代碼 */
    @XmlElement(name = "AssignAddrCountyCode", required = true)
    @FieldName("指定地址-省市縣市代碼")
    private String assignAddrCountyCode;

    /** 指定地址-鄉鎮市區代碼 */
    @XmlElement(name = "AssignAddrAreaCode", required = true)
    @FieldName("指定地址-鄉鎮市區代碼")
    private String assignAddrAreaCode;

    /** 指定地址-街路門牌 */
    @XmlElement(name = "AssignAddrStreetDoorplate", required = true)
    @FieldName("指定地址-街路門牌")
    private String assignAddrStreetDoorplate;

    /** 郵政信箱 */
    @XmlElement(name = "Mailbox", required = true)
    @FieldName("郵政信箱")
    private String mailbox;

    /** 日間電話-區域號碼 */
    @XmlElement(name = "DayPhoneAreacode", required = true)
    @FieldName("日間電話-區域號碼")
    private String dayPhoneAreacode;

    /** 日間電話-號碼 */
    @XmlElement(name = "DayPhoneNumber", required = true)
    @FieldName("日間電話-號碼")
    private String dayPhoneNumber;

    /** 日間電話-分機 */
    @XmlElement(name = "DayPhoneExtension", required = true)
    @FieldName("日間電話-分機")
    private String dayPhoneExtension;

    /** 夜間電話-區域號碼 */
    @XmlElement(name = "NightPhoneAreacode", required = true)
    @FieldName("夜間電話-區域號碼")
    private String nightPhoneAreacode;

    /** 夜間電話-號碼 */
    @XmlElement(name = "NightPhoneNumber", required = true)
    @FieldName("夜間電話-號碼")
    private String nightPhoneNumber;

    /** 夜間電話-分機 */
    @XmlElement(name = "NightPhoneExtension", required = true)
    @FieldName("夜間電話-分機")
    private String nightPhoneExtension;

    /** 行動電話-號碼 */
    @XmlElement(name = "CellPhoneNumber", required = true)
    @FieldName("行動電話-號碼")
    private String cellPhoneNumber;

    /** 電子信箱 */
    @XmlElement(name = "EmailAddress", required = true)
    @FieldName("電子信箱")
    private String emailAddress;

    /** 即時通帳號 */
    @XmlElement(name = "ImAccount", required = true)
    @FieldName("即時通帳號")
    private String imAccount;

    /** 補登類別 */
    @XmlElement(name = "RegType", required = true)
    @FieldName("補登類別")
    private String regType;

    /** 來源作業點代碼 */
    @XmlElement(name = "SourceSiteId", required = true)
    @FieldName("來源作業點代碼")
    private String sourceSiteId;

    /** 國籍代碼 */
    @XmlElement(name = "NationCode", required = true)
    @FieldName("國籍代碼")
    private String nationCode;

    /** 國籍 */
    @XmlElement(name = "Nation", required = true)
    @FieldName("國籍")
    private String nation;

    /** 英文姓名 */
    @XmlElement(name = "EnglishName", required = true)
    @FieldName("英文姓名")
    private String englishName;

    public String getAdminOfficeCode() {
        return adminOfficeCode;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public String getAssignAddrAreaCode() {
        return assignAddrAreaCode;
    }

    public String getAssignAddrChangeMode() {
        return assignAddrChangeMode;
    }

    public String getAssignAddrCountyCode() {
        return assignAddrCountyCode;
    }

    public String getAssignAddrStreetDoorplate() {
        return assignAddrStreetDoorplate;
    }

    public String getAssignAddrTypeCode() {
        return assignAddrTypeCode;
    }

    public String getAssignAddrZone() {
        return assignAddrZone;
    }

    public String getBirthOrderSex() {
        return birthOrderSex;
    }

    public String getBirthPlaceCode() {
        return birthPlaceCode;
    }

    public String getBirthYyymmdd() {
        return birthYyymmdd;
    }

    public String getBusiness() {
        return business;
    }

    public String getBusinessCode() {
        return businessCode;
    }

    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public String getCorrectYyy() {
        return correctYyy;
    }

    public String getDayPhoneAreacode() {
        return dayPhoneAreacode;
    }

    public String getDayPhoneExtension() {
        return dayPhoneExtension;
    }

    public String getDayPhoneNumber() {
        return dayPhoneNumber;
    }

    public String getEducation() {
        return education;
    }

    public String getEducationCode() {
        return educationCode;
    }

    public String getEducationMark() {
        return educationMark;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getFather() {
        return father;
    }

    public String getFatherFirstName() {
        return fatherFirstName;
    }

    public String getFatherId() {
        return fatherId;
    }

    public String getFatherIdMark() {
        return fatherIdMark;
    }

    public String getFatherLastName() {
        return fatherLastName;
    }

    public String getFirstName() {
        return firstName;
    }

    /**
     * 取得外籍者資料
     * 
     * @return XLDFForeignRoleDTO
     */
    public XLDFForeignRoleDTO getForeignRoleDTO() {
        return XLDFEmptyForeignRoleDTO.getInstance();
    }

    public String getFosterFather() {
        return fosterFather;
    }

    public String getFosterFatherFirstName() {
        return fosterFatherFirstName;
    }

    public String getFosterFatherId() {
        return fosterFatherId;
    }

    public String getFosterFatherIdMark() {
        return fosterFatherIdMark;
    }

    public String getFosterFatherLastName() {
        return fosterFatherLastName;
    }

    public String getFosterMother() {
        return fosterMother;
    }

    public String getFosterMotherFirstName() {
        return fosterMotherFirstName;
    }

    public String getFosterMotherId() {
        return fosterMotherId;
    }

    public String getFosterMotherIdMark() {
        return fosterMotherIdMark;
    }

    public String getFosterMotherLastName() {
        return fosterMotherLastName;
    }

    public String getFosterParentMark() {
        return fosterParentMark;
    }

    public String getGender() {
        return gender;
    }

    public String getHouseholdHeadId() {
        return householdHeadId;
    }

    public String getHouseholdId() {
        return householdId;
    }

    public String getIdCardApplyCode() {
        return idCardApplyCode;
    }

    public String getIdCardApplyMark() {
        return idCardApplyMark;
    }

    public String getIdCardApplyYyymmdd() {
        return idCardApplyYyymmdd;
    }

    public XLDFIDCardLostApplyDTO getIDCardCardLostApply() {
        XLDFIDCardLostApplyDTO result = XLDFNoneIDCardLostApplyDTO.getInstance();
        if (RlConstant.YES_CHAR.equals(idCardLostApplyMark.toUpperCase())) {
            result = new XLDFGeneralIDCardLostApplyDTO(idCardLostApplyYyymmdd, idCardLostApplyHhmmss);
        }
        return result;
    }

    public String getIdCardLostApplyHhmmss() {
        return idCardLostApplyHhmmss;
    }

    public String getIdCardLostApplyMark() {
        return idCardLostApplyMark;
    }

    public String getIdCardLostApplyYyymmdd() {
        return idCardLostApplyYyymmdd;
    }

    public String getImAccount() {
        return imAccount;
    }

    public String getLastName() {
        return lastName;
    }

    public String getLivingRaceType() {
        return livingRaceType;
    }

    public String getLivingStyleCode() {
        return livingStyleCode;
    }

    public String getMailbox() {
        return mailbox;
    }

    public String getMarriageCode() {
        return marriageCode;
    }

    public String getMilitaryCode() {
        return militaryCode;
    }

    public String getMother() {
        return mother;
    }

    public String getMotherFirstName() {
        return motherFirstName;
    }

    public String getMotherId() {
        return motherId;
    }

    public String getMotherIdMark() {
        return motherIdMark;
    }

    public String getMotherLastName() {
        return motherLastName;
    }

    public String getMoveInYyymmdd() {
        return moveInYyymmdd;
    }

    public String getMoveOutType() {
        return moveOutType;
    }

    public String getMscMark() {
        return mscMark;
    }

    public String getNameType() {
        return nameType;
    }

    public String getNightPhoneAreacode() {
        return nightPhoneAreacode;
    }

    public String getNightPhoneExtension() {
        return nightPhoneExtension;
    }

    public String getNightPhoneNumber() {
        return nightPhoneNumber;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getOccupationCode() {
        return occupationCode;
    }

    public String getOtherBirthPlace() {
        return otherBirthPlace;
    }

    public String getPersonalMark() {
        return personalMark;
    }

    public String getPersonId() {
        return personId;
    }

    public String getPersonName() {
        return personName;
    }

    public String getRelationship() {
        return relationship;
    }

    /**
     * 取得除戶簿頁
     * 
     * @return XLDFRemoveDTO
     */
    public XLDFRemoveDTO getRemoveDTO() {
        return XLDFEmptyRemoveDTO.getInstance();
    }

    public String getRomanizationMark() {
        return romanizationMark;
    }

    public String getSealApplyCode() {
        return sealApplyCode;
    }

    public String getSealApplyYyymmdd() {
        return sealApplyYyymmdd;
    }

    public String getSiteId() {
        return siteId;
    }

    public String getSpecialMark() {
        return specialMark;
    }

    public String getSpouse() {
        return spouse;
    }

    public String getSpouseFirstName() {
        return spouseFirstName;
    }

    public String getSpouseId() {
        return spouseId;
    }

    public String getSpouseIdMark() {
        return spouseIdMark;
    }

    public String getSpouseLastName() {
        return spouseLastName;
    }

    public String getViolenceMark() {
        return violenceMark;
    }

    public void setAdminOfficeCode(final String adminOfficeCode) {
        this.adminOfficeCode = adminOfficeCode;
    }

    public void setAreaCode(final String areaCode) {
        this.areaCode = areaCode;
    }

    public void setAssignAddrAreaCode(final String assignAddrAreaCode) {
        this.assignAddrAreaCode = assignAddrAreaCode;
    }

    public void setAssignAddrChangeMode(final String assignAddrChangeMode) {
        this.assignAddrChangeMode = assignAddrChangeMode;
    }

    public void setAssignAddrCountyCode(final String assignAddrCountyCode) {
        this.assignAddrCountyCode = assignAddrCountyCode;
    }

    public void setAssignAddrStreetDoorplate(final String assignAddrStreetDoorplate) {
        this.assignAddrStreetDoorplate = assignAddrStreetDoorplate;
    }

    public void setAssignAddrTypeCode(final String assignAddrTypeCode) {
        this.assignAddrTypeCode = assignAddrTypeCode;
    }

    public void setAssignAddrZone(final String assignAddrZone) {
        this.assignAddrZone = assignAddrZone;
    }

    public void setBirthOrderSex(final String birthOrderSex) {
        this.birthOrderSex = birthOrderSex;
    }

    public void setBirthPlaceCode(final String birthPlaceCode) {
        this.birthPlaceCode = birthPlaceCode;
    }

    public void setBirthYyymmdd(final String birthYyymmdd) {
        this.birthYyymmdd = birthYyymmdd;
    }

    public void setBusiness(final String business) {
        this.business = business;
    }

    public void setBusinessCode(final String businessCode) {
        this.businessCode = businessCode;
    }

    public void setCellPhoneNumber(final String cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
    }

    public void setCorrectYyy(final String correctYyy) {
        this.correctYyy = correctYyy;
    }

    public void setDayPhoneAreacode(final String dayPhoneAreacode) {
        this.dayPhoneAreacode = dayPhoneAreacode;
    }

    public void setDayPhoneExtension(final String dayPhoneExtension) {
        this.dayPhoneExtension = dayPhoneExtension;
    }

    public void setDayPhoneNumber(final String dayPhoneNumber) {
        this.dayPhoneNumber = dayPhoneNumber;
    }

    public void setEducation(final String education) {
        this.education = education;
    }

    public void setEducationCode(final String educationCode) {
        this.educationCode = educationCode;
    }

    public void setEducationMark(final String educationMark) {
        this.educationMark = educationMark;
    }

    public void setEmailAddress(final String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setFather(final String father) {
        this.father = father;
    }

    public void setFatherFirstName(final String fatherFirstName) {
        this.fatherFirstName = fatherFirstName;
    }

    public void setFatherId(final String fatherId) {
        this.fatherId = fatherId;
    }

    public void setFatherIdMark(final String fatherIdMark) {
        this.fatherIdMark = fatherIdMark;
    }

    public void setFatherLastName(final String fatherLastName) {
        this.fatherLastName = fatherLastName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public void setFosterFather(final String fosterFather) {
        this.fosterFather = fosterFather;
    }

    public void setFosterFatherFirstName(final String fosterFatherFirstName) {
        this.fosterFatherFirstName = fosterFatherFirstName;
    }

    public void setFosterFatherId(final String fosterFatherId) {
        this.fosterFatherId = fosterFatherId;
    }

    public void setFosterFatherIdMark(final String fosterFatherIdMark) {
        this.fosterFatherIdMark = fosterFatherIdMark;
    }

    public void setFosterFatherLastName(final String fosterFatherLastName) {
        this.fosterFatherLastName = fosterFatherLastName;
    }

    public void setFosterMother(final String fosterMother) {
        this.fosterMother = fosterMother;
    }

    public void setFosterMotherFirstName(final String fosterMotherFirstName) {
        this.fosterMotherFirstName = fosterMotherFirstName;
    }

    public void setFosterMotherId(final String fosterMotherId) {
        this.fosterMotherId = fosterMotherId;
    }

    public void setFosterMotherIdMark(final String fosterMotherIdMark) {
        this.fosterMotherIdMark = fosterMotherIdMark;
    }

    public void setFosterMotherLastName(final String fosterMotherLastName) {
        this.fosterMotherLastName = fosterMotherLastName;
    }

    public void setFosterParentMark(final String fosterParentMark) {
        this.fosterParentMark = fosterParentMark;
    }

    public void setGender(final String gender) {
        this.gender = gender;
    }

    public void setHouseholdHeadId(final String householdHeadId) {
        this.householdHeadId = householdHeadId;
    }

    public void setHouseholdId(final String householdId) {
        this.householdId = householdId;
    }

    public void setIdCardApplyCode(final String idCardApplyCode) {
        this.idCardApplyCode = idCardApplyCode;
    }

    public void setIdCardApplyMark(final String idCardApplyMark) {
        this.idCardApplyMark = idCardApplyMark;
    }

    public void setIdCardApplyYyymmdd(final String idCardApplyYyymmdd) {
        this.idCardApplyYyymmdd = idCardApplyYyymmdd;
    }

    public void setIdCardLostApplyHhmmss(final String idCardLostApplyHhmmss) {
        this.idCardLostApplyHhmmss = idCardLostApplyHhmmss;
    }

    public void setIdCardLostApplyMark(final String idCardLostApplyMark) {
        this.idCardLostApplyMark = idCardLostApplyMark;
    }

    public void setIdCardLostApplyYyymmdd(final String idCardLostApplyYyymmdd) {
        this.idCardLostApplyYyymmdd = idCardLostApplyYyymmdd;
    }

    public void setImAccount(final String imAccount) {
        this.imAccount = imAccount;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public void setLivingRaceType(final String livingRaceType) {
        this.livingRaceType = livingRaceType;
    }

    public void setLivingStyleCode(final String livingStyleCode) {
        this.livingStyleCode = livingStyleCode;
    }

    public void setMailbox(final String mailbox) {
        this.mailbox = mailbox;
    }

    public void setMarriageCode(final String marriageCode) {
        this.marriageCode = marriageCode;
    }

    public void setMilitaryCode(final String militaryCode) {
        this.militaryCode = militaryCode;
    }

    public void setMother(final String mother) {
        this.mother = mother;
    }

    public void setMotherFirstName(final String motherFirstName) {
        this.motherFirstName = motherFirstName;
    }

    public void setMotherId(final String motherId) {
        this.motherId = motherId;
    }

    public void setMotherIdMark(final String motherIdMark) {
        this.motherIdMark = motherIdMark;
    }

    public void setMotherLastName(final String motherLastName) {
        this.motherLastName = motherLastName;
    }

    public void setMoveInYyymmdd(final String moveInYyymmdd) {
        this.moveInYyymmdd = moveInYyymmdd;
    }

    public void setMoveOutType(final String moveOutType) {
        this.moveOutType = moveOutType;
    }

    public void setMscMark(final String mscMark) {
        this.mscMark = mscMark;
    }

    public void setNameType(final String nameType) {
        this.nameType = nameType;
    }

    public void setNightPhone_extension(final String nightPhoneExtension) {
        this.nightPhoneExtension = nightPhoneExtension;
    }

    public void setNightPhoneAreacode(final String nightPhoneAreacode) {
        this.nightPhoneAreacode = nightPhoneAreacode;
    }

    public void setNightPhoneExtension(final String nightPhoneExtension) {
        this.nightPhoneExtension = nightPhoneExtension;
    }

    public void setNightPhoneNumber(final String nightPhoneNumber) {
        this.nightPhoneNumber = nightPhoneNumber;
    }

    public void setOccupation(final String occupation) {
        this.occupation = occupation;
    }

    public void setOccupationCode(final String occupationCode) {
        this.occupationCode = occupationCode;
    }

    public void setOtherBirthPlace(final String otherBirthPlace) {
        this.otherBirthPlace = otherBirthPlace;
    }

    public void setPersonalMark(final String personalMark) {
        this.personalMark = personalMark;
    }

    public void setPersonId(final String personId) {
        this.personId = personId;
    }

    public void setPersonName(final String personName) {
        this.personName = personName;
    }

    public void setRelationship(final String relationship) {
        this.relationship = relationship;
    }

    public void setRomanizationMark(final String romanizationMark) {
        this.romanizationMark = romanizationMark;
    }

    public void setSealApplyCode(final String sealApplyCode) {
        this.sealApplyCode = sealApplyCode;
    }

    public void setSealApplyYyymmdd(final String sealApplyYyymmdd) {
        this.sealApplyYyymmdd = sealApplyYyymmdd;
    }

    public void setSiteId(final String siteId) {
        this.siteId = siteId;
    }

    public void setSpecialMark(final String specialMark) {
        this.specialMark = specialMark;
    }

    public void setSpouse(final String spouse) {
        this.spouse = spouse;
    }

    public void setSpouseFirstName(final String spouseFirstName) {
        this.spouseFirstName = spouseFirstName;
    }

    public void setSpouseId(final String spouseId) {
        this.spouseId = spouseId;
    }

    public void setSpouseIdMark(final String spouseIdMark) {
        this.spouseIdMark = spouseIdMark;
    }

    public void setSpouseLastName(final String spouseLastName) {
        this.spouseLastName = spouseLastName;
    }

    public void setViolenceMark(final String violenceMark) {
        this.violenceMark = violenceMark;
    }

    public String getFosterFatherSiteId() {
        return fosterFatherSiteId;
    }

    public void setFosterFatherSiteId(final String fosterFatherSiteId) {
        this.fosterFatherSiteId = fosterFatherSiteId;
    }

    public String getFosterMotherSiteId() {
        return fosterMotherSiteId;
    }

    public void setFosterMotherSiteId(final String fosterMotherSiteId) {
        this.fosterMotherSiteId = fosterMotherSiteId;
    }

    public String getRegType() {
        return regType;
    }

    public void setRegType(final String regType) {
        this.regType = regType;
    }

    public String getSourceSiteId() {
        return sourceSiteId;
    }

    public void setSourceSiteId(final String sourceSiteId) {
        this.sourceSiteId = sourceSiteId;
    }

    public String getNationCode() {
        return nationCode;
    }

    public void setNationCode(final String nationCode) {
        this.nationCode = nationCode;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(final String nation) {
        this.nation = nation;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(final String englishName) {
        this.englishName = englishName;
    }

}
