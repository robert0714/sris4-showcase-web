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
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;

/**
 * (監護、輔助)人DTO
 * 
 * @author DAXIONG
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supervisorDataDTO", propOrder = { "isNewHousehold", "relatedPersonHouseholdData", "relatedPersonData", "relatedPersonRole", "relatedPersonBookFlag", "relatedPersonOrgEducationMark", "relatedPersonForeignPersonData", "relatedPersonRelationship", "relatedPersonApplyUnit", "selected" })
@XmlRootElement(name = "SupervisorDataDTO")
public class SupervisorDataDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 是否自立新戶 */
    @XmlElement(name = "IsNewHousehold", required = true)
    @FieldName("是否自立新戶")
    private String isNewHousehold;

    /** (監護、輔助)人-全戶基本資料 */
    @XmlElement(name = "RelatedPersonHouseholdData", required = true)
    @FieldName("(監護、輔助)人-全戶基本資料")
    private XLDFHouseholdDataDomainObject relatedPersonHouseholdData;

    /** (監護、輔助)人-個人基本資料 */
    @XmlElement(name = "RelatedPersonData", required = true)
    @FieldName("(監護、輔助)人-個人基本資料")
    private XLDFPersonDataDomainObject relatedPersonData;

    /** (監護、輔助)人-身分角色 */
    @XmlElement(name = "RelatedPersonRole", required = true)
    @FieldName("(監護、輔助)人-身分角色")
    private String relatedPersonRole;

    /** (監護、輔助)人-簿頁旗標 */
    @XmlElement(name = "RelatedPersonBookFlag", required = true)
    @FieldName("(監護、輔助)人-簿頁旗標")
    private String relatedPersonBookFlag;

    /** (監護、輔助)人-原教育程度註記 */
    @XmlElement(name = "RelatedPersonOrgEducationMark", required = true)
    @FieldName("(監護、輔助)人-原教育程度註記")
    private String relatedPersonOrgEducationMark;

    /** (監護、輔助)人-外籍者資料 */
    @XmlElement(name = "RelatedPersonForeignPersonData", required = true)
    @FieldName("(監護、輔助)人-外籍者資料")
    private XLDFForeignPersonDTO relatedPersonForeignPersonData = new XLDFForeignPersonDTO();

    /** (監護、輔助)人-與當事人之關係 */
    @XmlElement(name = "RelatedPersonRelationship", required = true)
    @FieldName("(監護、輔助)人-與當事人之關係")
    private String relatedPersonRelationship;

    /** (監護、輔助)人-申請之個人或單位性質 */
    @XmlElement(name = "RelatedPersonApplyUnit", required = true)
    @FieldName("(監護、輔助)人-申請之個人或單位性質")
    private String relatedPersonApplyUnit;

    /** 是否選取 */
    @XmlElement(name = "Selected", required = true)
    @FieldName("是否選取")
    private boolean selected;

    /**
     * 取得是否自立新戶
     * 
     * @return 是否自立新戶
     */
    public String getIsNewHousehold() {
        return isNewHousehold;
    }

    /**
     * 設定是否自立新戶
     * 
     * @param isNewHousehold
     *            是否自立新戶
     */
    public void setIsNewHousehold(final String isNewHousehold) {
        this.isNewHousehold = isNewHousehold;
    }

    /**
     * 取得(監護、輔助)人-全戶基本資料
     * 
     * @return (監護、輔助)人-全戶基本資料
     */
    public XLDFHouseholdDataDomainObject getRelatedPersonHouseholdData() {
        return relatedPersonHouseholdData;
    }

    /**
     * 設定(監護、輔助)人-全戶基本資料
     * 
     * @param relatedPersonHouseholdData
     *            (監護、輔助)人-全戶基本資料
     */
    public void setRelatedPersonHouseholdData(final XLDFHouseholdDataDomainObject relatedPersonHouseholdData) {
        this.relatedPersonHouseholdData = relatedPersonHouseholdData;
    }

    /**
     * 取得(監護、輔助)人-個人基本資料
     * 
     * @return (監護、輔助)人-個人基本資料
     */
    public XLDFPersonDataDomainObject getRelatedPersonData() {
        return relatedPersonData;
    }

    /**
     * 設定(監護、輔助)人-個人基本資料
     * 
     * @param relatedPersonData
     *            (監護、輔助)人-個人基本資料
     */
    public void setRelatedPersonData(final XLDFPersonDataDomainObject relatedPersonData) {
        this.relatedPersonData = relatedPersonData;
    }

    /**
     * 取得(監護、輔助)人-身分角色
     * 
     * @return (監護、輔助)人-身分角色
     */
    public String getRelatedPersonRole() {
        return relatedPersonRole;
    }

    /**
     * 設定(監護、輔助)人-身分角色
     * 
     * @param relatedPersonRole
     *            (監護、輔助)人-身分角色
     */
    public void setRelatedPersonRole(final String relatedPersonRole) {
        this.relatedPersonRole = relatedPersonRole;
    }

    /**
     * 取得(監護、輔助)人-簿頁旗標
     * 
     * @return (監護、輔助)人-簿頁旗標
     */
    public String getRelatedPersonBookFlag() {
        return relatedPersonBookFlag;
    }

    /**
     * 設定(監護、輔助)人-簿頁旗標
     * 
     * @param relatedPersonBookFlag
     *            (監護、輔助)人-簿頁旗標
     */
    public void setRelatedPersonBookFlag(final String relatedPersonBookFlag) {
        this.relatedPersonBookFlag = relatedPersonBookFlag;
    }

    /**
     * 取得(監護、輔助)人-原教育程度註記
     * 
     * @return (監護、輔助)人-原教育程度註記
     */
    public String getRelatedPersonOrgEducationMark() {
        return relatedPersonOrgEducationMark;
    }

    /**
     * 設定(監護、輔助)人-原教育程度註記
     * 
     * @param relatedPersonOrgEducationMark
     *            (監護、輔助)人-原教育程度註記
     */
    public void setRelatedPersonOrgEducationMark(final String relatedPersonOrgEducationMark) {
        this.relatedPersonOrgEducationMark = relatedPersonOrgEducationMark;
    }

    /**
     * 取得(監護、輔助)人-外籍者資料
     * 
     * @return (監護、輔助)人-外籍者資料
     */
    public XLDFForeignPersonDTO getRelatedPersonForeignPersonData() {
        return relatedPersonForeignPersonData;
    }

    /**
     * 設定(監護、輔助)人-外籍者資料
     * 
     * @param relatedPersonForeignPersonData
     *            (監護、輔助)人-外籍者資料
     */
    public void setRelatedPersonForeignPersonData(final XLDFForeignPersonDTO relatedPersonForeignPersonData) {
        this.relatedPersonForeignPersonData = relatedPersonForeignPersonData;
    }

    /**
     * 取得(監護、輔助)人-與當事人之關係
     * 
     * @return (監護、輔助)人-與當事人之關係
     */
    public String getRelatedPersonRelationship() {
        return relatedPersonRelationship;
    }

    /**
     * 設定(監護、輔助)人-與當事人之關係
     * 
     * @param relatedPersonRelationship
     *            (監護、輔助)人-與當事人之關係
     */
    public void setRelatedPersonRelationship(final String relatedPersonRelationship) {
        this.relatedPersonRelationship = relatedPersonRelationship;
    }

    /**
     * 取得(監護、輔助)人-申請之個人或單位性質
     * 
     * @return (監護、輔助)人-申請之個人或單位性質
     */
    public String getRelatedPersonApplyUnit() {
        return relatedPersonApplyUnit;
    }

    /**
     * 設定(監護、輔助)人-申請之個人或單位性質
     * 
     * @param relatedPersonApplyUnit
     *            (監護、輔助)人-申請之個人或單位性質
     */
    public void setRelatedPersonApplyUnit(final String relatedPersonApplyUnit) {
        this.relatedPersonApplyUnit = relatedPersonApplyUnit;
    }

    /**
     * 取得是否選取
     * 
     * @return 是否選取
     */
    public boolean isSelected() {
        return selected;
    }

    /**
     * 設定是否選取
     * 
     * @param selected
     *            是否選取
     */
    public void setSelected(final boolean selected) {
        this.selected = selected;
    }

}