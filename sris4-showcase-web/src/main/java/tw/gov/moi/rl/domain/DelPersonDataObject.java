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
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;

/**
 * 撤銷戶籍登記-撤銷戶籍者DTO.
 * 
 * @author Viva.Hong
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DelPersonDataObject", propOrder = { "delPersonData", "personNoteFlag", "householdState", "personRole",
        "orgEducationMark", "educationName", "delPersonFlag", "finishFlag", "cancelFlag", "newHouseholdFlag",
        "firstSettleDate", "firstCountyCode", "firstAreaCode", "firstVillage", "firstNeighbor", "firstStreetDoorplate",
        "admoApprovedDate", "acptAdmoName", "acptAdmoSign", "acptAdmoMarking", "moveOutDate", "moveOutCountyCode",
        "moveOutAreaCode", "moveOutVillage", "moveOutNeighbor", "moveOutStreetDoorplate", "changeName",
        "secondSettleDate", "secondCountyCode", "secondAreaCode", "secondVillage", "secondNeighbor",
        "secondStreetDoorplate", "orgRelationship", "orgHouseholdHeadId" })
@XmlRootElement(name = "DelPersonDataObject")
public class DelPersonDataObject implements Serializable {

    /** serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** (撤銷戶籍者)個人基本資料. */
    @XmlElement(name = "DelPersonData", required = true)
    @FieldName("(撤銷戶籍者)個人基本資料")
    private XLDFPersonDataDomainObject delPersonData;

    /** (撤銷戶籍者)個人記事代碼. */
    @XmlElement(name = "PersonNoteFlag", required = true)
    @FieldName("(撤銷戶籍者)個人記事代碼")
    private String personNoteFlag;

    /** 撤銷戶籍者-戶籍簿頁狀態. */
    @XmlElement(name = "HouseholdState", required = true)
    @FieldName("撤銷戶籍者-戶籍簿頁狀態")
    private String householdState;

    /** 撤銷戶籍者-身分角色. */
    @XmlElement(name = "PersonRole", required = true)
    @FieldName("撤銷戶籍者-身分角色")
    private String personRole;

    /** 撤銷戶籍者-原教育程度註記. */
    @XmlElement(name = "OrgEducationMark", required = true)
    @FieldName("撤銷戶籍者-原教育程度註記")
    private String orgEducationMark;

    /** 撤銷戶籍者-教育程度名稱. */
    @XmlElement(name = "EducationName", required = true)
    @FieldName("撤銷戶籍者-教育程度名稱")
    private String educationName;

    /** 已選取為撤銷戶籍者旗標. */
    @XmlElement(name = "DelPersonFlag", required = true)
    @FieldName("已選取為撤銷戶籍者旗標")
    private boolean delPersonFlag;

    /** 完成個人狀態. */
    @XmlElement(name = "FinishFlag", required = true)
    @FieldName("完成個人狀態")
    private boolean finishFlag;

    /** 刪除旗標. */
    @XmlElement(name = "CancelFlag", required = true)
    @FieldName("刪除旗標")
    private boolean cancelFlag;

    /** 新戶長旗標. */
    @XmlElement(name = "NewHouseholdFlag", required = true)
    @FieldName("新戶長旗標")
    private boolean newHouseholdFlag;

    /** 初次設籍日期. */
    @XmlElement(name = "FirstSettleDate", required = true)
    @FieldName("初次設籍日期")
    private String firstSettleDate;

    /** 初次設籍地址-省市縣市(行政區域代碼前5碼). */
    @XmlElement(name = "FirstCountyCode", required = true)
    @FieldName("初次設籍地址-省市縣市(行政區域代碼前5碼)")
    private String firstCountyCode;

    /** 初次設籍地址-鄉鎮市區(行政區域代碼). */
    @XmlElement(name = "FirstAreaCode", required = true)
    @FieldName("初次設籍地址-鄉鎮市區(行政區域代碼)")
    private String firstAreaCode;

    /** 初次設籍地址-村里. */
    @XmlElement(name = "FirstVillage", required = true)
    @FieldName("初次設籍地址-村里")
    private String firstVillage;

    /** 初次設籍地址-鄰. */
    @XmlElement(name = "FirstNeighbor", required = true)
    @FieldName("初次設籍地址-鄰")
    private String firstNeighbor;

    /** 初次設籍地址-街路門牌. */
    @XmlElement(name = "FirstStreetDoorplate", required = true)
    @FieldName("初次設籍地址-街路門牌")
    private String firstStreetDoorplate;

    /** 戶政事務所核准日期. */
    @XmlElement(name = "AdmoApprovedDate", required = true)
    @FieldName("戶政事務所核准日期")
    private String admoApprovedDate;

    /** 受理地戶政事務所名稱. */
    @XmlElement(name = "AcptAdmoName", required = true)
    @FieldName("受理地戶政事務所名稱")
    private String acptAdmoName;

    /** 受理地戶政事務所字. */
    @XmlElement(name = "AcptAdmoSign", required = true)
    @FieldName("受理地戶政事務所字")
    private String acptAdmoSign;

    /** 受理地戶政事務所號函. */
    @XmlElement(name = "AcptAdmoMarking", required = true)
    @FieldName("受理地戶政事務所號函")
    private String acptAdmoMarking;

    /** 遷出日期. */
    @XmlElement(name = "MoveOutDate", required = true)
    @FieldName("遷出日期")
    private String moveOutDate;

    /** 遷出地址-省市縣市(行政區域代碼前5碼). */
    @XmlElement(name = "MoveOutCountyCode", required = true)
    @FieldName("遷出地址-省市縣市(行政區域代碼前5碼)")
    private String moveOutCountyCode;

    /** 遷出地址-鄉鎮市區(行政區域代碼). */
    @XmlElement(name = "MoveOutAreaCode", required = true)
    @FieldName("遷出地址-鄉鎮市區(行政區域代碼)")
    private String moveOutAreaCode;

    /** 遷出地址-村里. */
    @XmlElement(name = "MoveOutVillage", required = true)
    @FieldName("遷出地址-村里")
    private String moveOutVillage;

    /** 遷出地址-鄰. */
    @XmlElement(name = "MoveOutNeighbor", required = true)
    @FieldName("遷出地址-鄰")
    private String moveOutNeighbor;

    /** 遷出地址-街路門牌. */
    @XmlElement(name = "MoveOutStreetDoorplate", required = true)
    @FieldName("遷出地址-街路門牌")
    private String moveOutStreetDoorplate;

    /** 更正姓名. */
    @XmlElement(name = "ChangeName", required = true)
    @FieldName("更正姓名")
    private String changeName;

    /** 重複設籍日期. */
    @XmlElement(name = "SecondSettleDate", required = true)
    @FieldName("重複設籍日期")
    private String secondSettleDate;

    /** 重複設籍地址-省市縣市(行政區域代碼前5碼). */
    @XmlElement(name = "SecondCountyCode", required = true)
    @FieldName("重複設籍地址-省市縣市(行政區域代碼前5碼)")
    private String secondCountyCode;

    /** 重複設籍地址-鄉鎮市區(行政區域代碼). */
    @XmlElement(name = "SecondAreaCode", required = true)
    @FieldName("重複設籍地址-鄉鎮市區(行政區域代碼)")
    private String secondAreaCode;

    /** 重複設籍地址-村里. */
    @XmlElement(name = "SecondVillage", required = true)
    @FieldName("重複設籍地址-村里")
    private String secondVillage;

    /** 重複設籍地址-鄰. */
    @XmlElement(name = "SecondNeighbor", required = true)
    @FieldName("重複設籍地址-鄰")
    private String secondNeighbor;

    /** 重複設籍地址-街路門牌. */
    @XmlElement(name = "SecondStreetDoorplate", required = true)
    @FieldName("重複設籍地址-街路門牌")
    private String secondStreetDoorplate;

    /** 原稱謂. */
    @XmlElement(name = "OrgRelationship", required = true)
    @FieldName("原稱謂")
    private String orgRelationship;

    /** 原戶長統號. */
    @XmlElement(name = "OrgHouseholdHeadId", required = true)
    @FieldName("原戶長統號")
    private String orgHouseholdHeadId;

    /**
     * Gets the del person data.
     * 
     * @return the del person data
     */
    public XLDFPersonDataDomainObject getDelPersonData() {
        return delPersonData;
    }

    /**
     * Sets the del person data.
     * 
     * @param delPersonData
     *            the new del person data
     */
    public void setDelPersonData(final XLDFPersonDataDomainObject delPersonData) {
        this.delPersonData = delPersonData;
    }

    /**
     * Gets the person note flag.
     * 
     * @return the person note flag
     */
    public String getPersonNoteFlag() {
        return personNoteFlag;
    }

    /**
     * Sets the person note flag.
     * 
     * @param personNoteFlag
     *            the new person note flag
     */
    public void setPersonNoteFlag(final String personNoteFlag) {
        this.personNoteFlag = personNoteFlag;
    }

    /**
     * Gets the household state.
     * 
     * @return the household state
     */
    public String getHouseholdState() {
        return householdState;
    }

    /**
     * Sets the household state.
     * 
     * @param householdState
     *            the new household state
     */
    public void setHouseholdState(final String householdState) {
        this.householdState = householdState;
    }

    /**
     * Gets the person role.
     * 
     * @return the person role
     */
    public String getPersonRole() {
        return personRole;
    }

    /**
     * Sets the person role.
     * 
     * @param personRole
     *            the new person role
     */
    public void setPersonRole(final String personRole) {
        this.personRole = personRole;
    }

    /**
     * Gets the org education mark.
     * 
     * @return the org education mark
     */
    public String getOrgEducationMark() {
        return orgEducationMark;
    }

    /**
     * Sets the org education mark.
     * 
     * @param orgEducationMark
     *            the new org education mark
     */
    public void setOrgEducationMark(final String orgEducationMark) {
        this.orgEducationMark = orgEducationMark;
    }

    /**
     * Gets the education name.
     * 
     * @return the education name
     */
    public String getEducationName() {
        return educationName;
    }

    /**
     * Sets the education name.
     * 
     * @param educationName
     *            the new education name
     */
    public void setEducationName(final String educationName) {
        this.educationName = educationName;
    }

    /**
     * Gets the del person flag.
     * 
     * @return the del person flag
     */
    public boolean getDelPersonFlag() {
        return delPersonFlag;
    }

    /**
     * Sets the del person flag.
     * 
     * @param delPersonFlag
     *            the new del person flag
     */
    public void setDelPersonFlag(final boolean delPersonFlag) {
        this.delPersonFlag = delPersonFlag;
    }

    /**
     * Gets the finish flag.
     * 
     * @return the finish flag
     */
    public boolean getFinishFlag() {
        return finishFlag;
    }

    /**
     * Sets the finish flag.
     * 
     * @param finishFlag
     *            the new finish flag
     */
    public void setFinishFlag(final boolean finishFlag) {
        this.finishFlag = finishFlag;
    }

    /**
     * Gets the cancel flag.
     * 
     * @return the cancel flag
     */
    public boolean getCancelFlag() {
        return cancelFlag;
    }

    /**
     * Sets the cancel flag.
     * 
     * @param cancelFlag
     *            the new cancel flag
     */
    public void setCancelFlag(final boolean cancelFlag) {
        this.cancelFlag = cancelFlag;
    }

    /**
     * Gets the new household flag.
     * 
     * @return the new household flag
     */
    public boolean getNewHouseholdFlag() {
        return newHouseholdFlag;
    }

    /**
     * Sets the new household flag.
     * 
     * @param newHouseholdFlag
     *            the new new household flag
     */
    public void setNewHouseholdFlag(final boolean newHouseholdFlag) {
        this.newHouseholdFlag = newHouseholdFlag;
    }

    /**
     * Gets the first settle date.
     * 
     * @return the first settle date
     */
    public String getFirstSettleDate() {
        return firstSettleDate;
    }

    /**
     * Sets the first settle date.
     * 
     * @param firstSettleDate
     *            the new first settle date
     */
    public void setFirstSettleDate(final String firstSettleDate) {
        this.firstSettleDate = firstSettleDate;
    }

    /**
     * Gets the first county code.
     * 
     * @return the first county code
     */
    public String getFirstCountyCode() {
        return firstCountyCode;
    }

    /**
     * Sets the first county code.
     * 
     * @param firstCountyCode
     *            the new first county code
     */
    public void setFirstCountyCode(final String firstCountyCode) {
        this.firstCountyCode = firstCountyCode;
    }

    /**
     * Gets the first area code.
     * 
     * @return the first area code
     */
    public String getFirstAreaCode() {
        return firstAreaCode;
    }

    /**
     * Sets the first area code.
     * 
     * @param firstAreaCode
     *            the new first area code
     */
    public void setFirstAreaCode(final String firstAreaCode) {
        this.firstAreaCode = firstAreaCode;
    }

    /**
     * Gets the first village.
     * 
     * @return the first village
     */
    public String getFirstVillage() {
        return firstVillage;
    }

    /**
     * Sets the first village.
     * 
     * @param firstVillage
     *            the new first village
     */
    public void setFirstVillage(final String firstVillage) {
        this.firstVillage = firstVillage;
    }

    /**
     * Gets the first neighbor.
     * 
     * @return the first neighbor
     */
    public String getFirstNeighbor() {
        return firstNeighbor;
    }

    /**
     * Sets the first neighbor.
     * 
     * @param firstNeighbor
     *            the new first neighbor
     */
    public void setFirstNeighbor(final String firstNeighbor) {
        this.firstNeighbor = firstNeighbor;
    }

    /**
     * Gets the first street doorplate.
     * 
     * @return the first street doorplate
     */
    public String getFirstStreetDoorplate() {
        return firstStreetDoorplate;
    }

    /**
     * Sets the first street doorplate.
     * 
     * @param firstStreetDoorplate
     *            the new first street doorplate
     */
    public void setFirstStreetDoorplate(final String firstStreetDoorplate) {
        this.firstStreetDoorplate = firstStreetDoorplate;
    }

    /**
     * Gets the admo approved date.
     * 
     * @return the admo approved date
     */
    public String getAdmoApprovedDate() {
        return admoApprovedDate;
    }

    /**
     * Sets the admo approved date.
     * 
     * @param admoApprovedDate
     *            the new admo approved date
     */
    public void setAdmoApprovedDate(final String admoApprovedDate) {
        this.admoApprovedDate = admoApprovedDate;
    }

    /**
     * Gets the acpt admo name.
     * 
     * @return the acpt admo name
     */
    public String getAcptAdmoName() {
        return acptAdmoName;
    }

    /**
     * Sets the acpt admo name.
     * 
     * @param acptAdmoName
     *            the new acpt admo name
     */
    public void setAcptAdmoName(final String acptAdmoName) {
        this.acptAdmoName = acptAdmoName;
    }

    /**
     * Gets the acpt admo sign.
     * 
     * @return the acpt admo sign
     */
    public String getAcptAdmoSign() {
        return acptAdmoSign;
    }

    /**
     * Sets the acpt admo sign.
     * 
     * @param acptAdmoSign
     *            the new acpt admo sign
     */
    public void setAcptAdmoSign(final String acptAdmoSign) {
        this.acptAdmoSign = acptAdmoSign;
    }

    /**
     * Gets the acpt admo marking.
     * 
     * @return the acpt admo marking
     */
    public String getAcptAdmoMarking() {
        return acptAdmoMarking;
    }

    /**
     * Sets the acpt admo marking.
     * 
     * @param acptAdmoMarking
     *            the new acpt admo marking
     */
    public void setAcptAdmoMarking(final String acptAdmoMarking) {
        this.acptAdmoMarking = acptAdmoMarking;
    }

    /**
     * Gets the move out date.
     * 
     * @return the move out date
     */
    public String getMoveOutDate() {
        return moveOutDate;
    }

    /**
     * Sets the move out date.
     * 
     * @param moveOutDate
     *            the new move out date
     */
    public void setMoveOutDate(final String moveOutDate) {
        this.moveOutDate = moveOutDate;
    }

    /**
     * Gets the move out county code.
     * 
     * @return the move out county code
     */
    public String getMoveOutCountyCode() {
        return moveOutCountyCode;
    }

    /**
     * Sets the move out county code.
     * 
     * @param moveOutCountyCode
     *            the new move out county code
     */
    public void setMoveOutCountyCode(final String moveOutCountyCode) {
        this.moveOutCountyCode = moveOutCountyCode;
    }

    /**
     * Gets the move out area code.
     * 
     * @return the move out area code
     */
    public String getMoveOutAreaCode() {
        return moveOutAreaCode;
    }

    /**
     * Sets the move out area code.
     * 
     * @param moveOutAreaCode
     *            the new move out area code
     */
    public void setMoveOutAreaCode(final String moveOutAreaCode) {
        this.moveOutAreaCode = moveOutAreaCode;
    }

    /**
     * Gets the move out village.
     * 
     * @return the move out village
     */
    public String getMoveOutVillage() {
        return moveOutVillage;
    }

    /**
     * Sets the move out village.
     * 
     * @param moveOutVillage
     *            the new move out village
     */
    public void setMoveOutVillage(final String moveOutVillage) {
        this.moveOutVillage = moveOutVillage;
    }

    /**
     * Gets the move out neighbor.
     * 
     * @return the move out neighbor
     */
    public String getMoveOutNeighbor() {
        return moveOutNeighbor;
    }

    /**
     * Sets the move out neighbor.
     * 
     * @param moveOutNeighbor
     *            the new move out neighbor
     */
    public void setMoveOutNeighbor(final String moveOutNeighbor) {
        this.moveOutNeighbor = moveOutNeighbor;
    }

    /**
     * Gets the move out street doorplate.
     * 
     * @return the move out street doorplate
     */
    public String getMoveOutStreetDoorplate() {
        return moveOutStreetDoorplate;
    }

    /**
     * Sets the move out street doorplate.
     * 
     * @param moveOutStreetDoorplate
     *            the new move out street doorplate
     */
    public void setMoveOutStreetDoorplate(final String moveOutStreetDoorplate) {
        this.moveOutStreetDoorplate = moveOutStreetDoorplate;
    }

    /**
     * Gets the change name.
     * 
     * @return the change name
     */
    public String getChangeName() {
        return changeName;
    }

    /**
     * Sets the change name.
     * 
     * @param changeName
     *            the new change name
     */
    public void setChangeName(final String changeName) {
        this.changeName = changeName;
    }

    /**
     * Gets the second settle date.
     * 
     * @return the second settle date
     */
    public String getSecondSettleDate() {
        return secondSettleDate;
    }

    /**
     * Sets the second settle date.
     * 
     * @param secondSettleDate
     *            the new second settle date
     */
    public void setSecondSettleDate(final String secondSettleDate) {
        this.secondSettleDate = secondSettleDate;
    }

    /**
     * Gets the second county code.
     * 
     * @return the second county code
     */
    public String getSecondCountyCode() {
        return secondCountyCode;
    }

    /**
     * Sets the second county code.
     * 
     * @param secondCountyCode
     *            the new second county code
     */
    public void setSecondCountyCode(final String secondCountyCode) {
        this.secondCountyCode = secondCountyCode;
    }

    /**
     * Gets the second area code.
     * 
     * @return the second area code
     */
    public String getSecondAreaCode() {
        return secondAreaCode;
    }

    /**
     * Sets the second area code.
     * 
     * @param secondAreaCode
     *            the new second area code
     */
    public void setSecondAreaCode(final String secondAreaCode) {
        this.secondAreaCode = secondAreaCode;
    }

    /**
     * Gets the second village.
     * 
     * @return the second village
     */
    public String getSecondVillage() {
        return secondVillage;
    }

    /**
     * Sets the second village.
     * 
     * @param secondVillage
     *            the new second village
     */
    public void setSecondVillage(final String secondVillage) {
        this.secondVillage = secondVillage;
    }

    /**
     * Gets the second neighbor.
     * 
     * @return the second neighbor
     */
    public String getSecondNeighbor() {
        return secondNeighbor;
    }

    /**
     * Sets the second neighbor.
     * 
     * @param secondNeighbor
     *            the new second neighbor
     */
    public void setSecondNeighbor(final String secondNeighbor) {
        this.secondNeighbor = secondNeighbor;
    }

    /**
     * Gets the second street doorplate.
     * 
     * @return the second street doorplate
     */
    public String getSecondStreetDoorplate() {
        return secondStreetDoorplate;
    }

    /**
     * Sets the second street doorplate.
     * 
     * @param secondStreetDoorplate
     *            the new second street doorplate
     */
    public void setSecondStreetDoorplate(final String secondStreetDoorplate) {
        this.secondStreetDoorplate = secondStreetDoorplate;
    }

    /**
     * Gets the org relationship.
     * 
     * @return the org relationship
     */
    public String getOrgRelationship() {
        return orgRelationship;
    }

    /**
     * Sets the org relationship.
     * 
     * @param orgRelationship
     *            the new org relationship
     */
    public void setOrgRelationship(final String orgRelationship) {
        this.orgRelationship = orgRelationship;
    }

    /**
     * Gets the org household head id.
     * 
     * @return the org household head id
     */
    public String getOrgHouseholdHeadId() {
        return orgHouseholdHeadId;
    }

    /**
     * Sets the org household head id.
     * 
     * @param orgHouseholdHeadId
     *            the new org household head id
     */
    public void setOrgHouseholdHeadId(final String orgHouseholdHeadId) {
        this.orgHouseholdHeadId = orgHouseholdHeadId;
    }

}
