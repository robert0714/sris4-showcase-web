/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain.xldf;

import tw.gov.moi.rl.component.dto.XLDFDomainObject;
import tw.gov.moi.rl.dto.rl00001.XLDFForeignRoleDTO;

public interface XLDFPersonDataDomainObject {

    public String getAdminOfficeCode();

    public String getAreaCode();

    public String getBirthOrderSex();

    public String getBirthPlaceCode();

    public String getBirthYyymmdd();

    public String getBusiness();

    public String getBusinessCode();

    public PersonCommunication getCommunication();

    public String getCorrectYyy();

    public XLDFDomainObject getDomainObject();

    public String getEducation();

    public String getEducationCode();

    public String getEducationMark();

    public RelPerson getFatherInfo();

    public XLDFForeignRoleDTO getForeignRoleDTO();

    public void setForeignRoleDTO(final XLDFForeignRoleDTO foreignRoleDTO);

    public FosterParents getFosterParentsInfo();

    public String getGender();

    public String getHouseholdHeadId();

    public String getHouseholdId();

    public PersonIdCardLostApply getIdCardLostApply();

    public String getLivingRaceType();

    public String getLivingStyleCode();

    public String getMarriageCode();

    public String getMilitaryCode();

    public RelPerson getMotherInfo();

    public String getMoveInYyymmdd();

    public String getMoveOutType();

    public String getMscMark();

    public PersonNameDetail getNameDetail();

    public String getOccupation();

    public String getOccupationCode();

    public String getOperationSequenceId();

    public String getPersonalMark();

    public String getPersonId();

    public PersonIdCardApply getPersonIdCardApply();

    public String getPersonName();

    public PersonSealApply getPersonSealApply();

    public String getRelationship();

    public HouseholdRemovePage getRemovePage();

    public String getRomanizationMark();

    public String getSiteId();

    public String getSpecialMark();

    public RelPerson getSpouseInfo();

    public String getSpecialId();

    public String getViolenceMark();

    public String getSourceSiteId();

    public void setAdminOfficeCode(final String adminOfficeCode);

    public void setAreaCode(final String areaCode);

    public void setBirthOrderSex(final String birthOrderSex);

    public void setBirthPlaceCode(final String birthPlaceCode);

    public void setBirthYyymmdd(final String birthYyymmdd);

    public void setBusiness(final String business);

    public void setBusinessCode(final String businessCode);

    public void setCommunication(PersonCommunication personCommunication);

    public void setCorrectYyy(final String correctYyy);

    public void setEducation(final String education);

    public void setEducationCode(final String educationCode);

    public void setEducationMark(final String educationMark);

    public void setFather(final String father);

    public void setFatherFirstName(final String fatherFirstName);

    public void setFatherId(final String fatherId);

    public void setFatherIdFlag(final String fatherIdFlag);

    public void setFatherInfo(final RelPerson parent);

    public void setFatherLastName(final String fatherLastName);

    public void setFosterParentsInfo(final FosterParents fosterParentsInfo);

    public void setGender(final String gender);

    public void setHouseholdHeadId(final String householdHeadId);

    public void setHouseholdId(final String householdId);

    public void setLivingRaceType(final String livingRaceType);

    public void setLivingStyleCode(final String livingStyleCode);

    public void setMarriageCode(final String marriageCode);

    public void setMilitaryCode(final String militaryCode);

    public void setMother(final String mother);

    public void setMotherFirstName(final String motherFirstName);

    public void setMotherId(final String motherId);

    public void setMotherIdMark(final String motherIdMark);

    public void setMotherInfo(final RelPerson parent);

    public void setMotherLastName(final String motherLastName);

    public void setMoveInYyymmdd(final String moveInYyymmdd);

    public void setMoveOutType(final String moveOutType);

    public void setMscMark(final String mscMark);

    public void setOccupation(final String occupation);

    public void setOccupationCode(final String occupationCode);

    public void setPersonalMark(final String personalMark);

    public void setPersonId(final String personID);

    public void setPersonIdCardApply(final PersonIdCardApply personIdCardApply);

    public void setPersonName(final String personName);

    public void setPersonSealApply(final PersonSealApply personSealApply);

    public void setRelationship(final String relationship);

    public void setRomanizationMark(final String romanizationMark);

    public void setSiteId(final String siteId);

    public void setSpecialMark(final String specialMark);

    public void setSpouseInfo(final RelPerson spouse);

    public void setSpecialId(final String specialId);

    public void setViolenceMark(final String violenceMark);

    public void setNameDetail(final PersonNameDetail personNameDetail);

    public PersonSourceInfo getPersonSourceInfo();

    public void setPersonTldfInfo(final PersonSourceInfo personSourceInfo);

    public void setOtherBirthPlace(final String otherBirthPlace);

    public String getOtherBirthPlace();

    public void setAssignAddrChangeMode(final String assignAddrChangeMode);

    /**
     * 取得指定地址來源方式.
     * 
     * @return the assign addr change mode
     */
    public String getAssignAddrChangeMode();

    public void setAssignAddrTypeCode(final String assignAddrTypeCode);

    /**
     * 取得指定地址類別代碼.
     * 
     * @return the assign addr type code
     */
    public String getAssignAddrTypeCode();

    public void setAssignAddrZone(final String assignAddrZone);

    /**
     * 取郵遞區號.
     * 
     * @return the assign addr zone
     */
    public String getAssignAddrZone();

    public void setAssignAddrCountyCode(final String assignAddrCountyCode);

    /**
     * 取得指定地址省市縣市代碼.
     * 
     * @return the assign addr county code
     */
    public String getAssignAddrCountyCode();

    public void setAssignAddrAreaCode(final String assignAddrAreaCode);

    /**
     * 取得指定地址鄉鎮市區代碼.
     * 
     * @return the assign addr area code
     */
    public String getAssignAddrAreaCode();

    public void setAssignAddrStreetDoorplate(final String assignAddrStreetDoorplate);

    /**
     * 取得指定地址街路門牌.
     * 
     * @return the assign addr street doorplate
     */
    public String getAssignAddrStreetDoorplate();

    public void setMailbox(final String mailbox);

    /**
     * 取得郵政信箱.
     * 
     * @return the mailbox
     */
    public String getMailbox();

    public void setDayPhoneAreacode(final String dayPhoneAreacode);

    /**
     * 取得日間電話區域號碼.
     * 
     * @return the day phone areacode
     */
    public String getDayPhoneAreacode();

    public void setDayPhoneNumber(final String dayPhoneNumber);

    /**
     * 取得日間電話號碼.
     * 
     * @return the day phone number
     */
    public String getDayPhoneNumber();

    public void setDayPhoneExtension(final String dayPhoneExtension);

    /**
     * 取得日間電話分機.
     * 
     * @return the day phone extension
     */
    public String getDayPhoneExtension();

    public void setNightPhoneAreacode(final String nightPhoneAreacode);

    /**
     * 取得夜間電話區域號碼.
     * 
     * @return the night phone areacode
     */
    public String getNightPhoneAreacode();

    public void setNightPhoneNumber(final String nightPhoneNumber);

    /**
     * 取得夜間電話號碼.
     * 
     * @return the night phone number
     */
    public String getNightPhoneNumber();

    public void setNightPhoneExtension(final String nightPhoneExtension);

    /**
     * 取得夜間電話分機.
     * 
     * @return the night phone extension
     */
    public String getNightPhoneExtension();

    public void setCellPhoneNumber(final String cellPhoneNumber);

    /**
     * 取得行動電話號碼.
     * 
     * @return the cell phone number
     */
    public String getCellPhoneNumber();

    public void setEmailAddress(final String emailAddress);

    /**
     * 取得電子信箱.
     * 
     * @return the email address
     */
    public String getEmailAddress();

    public void setImAccount(final String imAccount);

    /**
     * 取得即時通帳號.
     * 
     * @return the im account
     */
    public String getImAccount();
}