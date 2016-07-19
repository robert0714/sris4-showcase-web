/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.XldfefaplcType;
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.component.dto.XLDFDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;

/**
 * The Class Rl01e00DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01e00DTO", propOrder = { "householdHeadId", "siteId", "editList", "afterSave" })
@XmlRootElement(name = "Rl01e10DTO")
public class Rl01e00DTO implements Serializable {

    /** 大簿控制各作業之資訊 */
    @FieldName("大簿控制各作業之資訊")
    @XmlElement(name = "OpeningOperationDTO", required = false)
    private OpeningOperationDTO openingOperationDTO = new OpeningOperationDTO();

    /** 當事人-個人基本資料 */
    @FieldName("當事人-個人基本資料")
    @XmlElement(name = "Person", required = false)
    private XLDFPersonDataDomainObject person;

    /** 當事人-全戶基本資料 */
    @FieldName("當事人-全戶基本資料")
    @XmlElement(name = "PersonHousehold", required = false)
    private XLDFHouseholdDataDomainObject personHousehold;

    /** 當事人-申請資料 */
    @FieldName("當事人-申請資料")
    @XmlElement(name = "Rl0y100AppData", required = false)
    private Rl0y100AppDataDTO rl0y100AppData = new Rl0y100AppDataDTO();

    /** 申請人1 */
    @FieldName("申請人1")
    @XmlElement(name = "Apply1", required = false)
    private XLDFApplicantDataDTO apply1 = new XLDFApplicantDataDTO();

    /** 申請人2 */
    @FieldName("申請人2")
    @XmlElement(name = "Apply2", required = false)
    private XLDFApplicantDataDTO apply2 = new XLDFApplicantDataDTO();

    /** 受委託人 */
    @FieldName("受委託人")
    @XmlElement(name = "Delegated", required = false)
    private XLDFPersonBriefDataDTO delegated = new XLDFPersonBriefDataDTO();

    /** 當事人-相關申請資料 */
    @FieldName("當事人-相關申請資料")
    @XmlElement(name = "PersonData", required = false)
    private PersonEduData personData = new PersonEduData();

    /** 當事人清單 */
    @FieldName("當事人清單")
    @XmlElement(name = "PersonDataList", required = false)
    private List<PersonEduData> personDataList = new ArrayList<PersonEduData>();

    /** 逕為登記申請人 */
    @FieldName("逕為登記申請人")
    @XmlElement(name = "EnforcedApplicant", required = false)
    private XldfefaplcType enforcedApplicant;

    /** 當事人-身分角色 */
    @FieldName("當事人-身分角色")
    @XmlElement(name = "PersonRole", required = false)
    private String personRole;

    /** 頁面控制:暫存按鈕狀態<LI>註解:true = disabled ，1 = enabled */
    @FieldName("頁面控制:暫存按鈕狀態")
    @XmlElement(name = "ButtonSaveDisabled", required = false)
    private Boolean buttonSaveDisabled;

    /** 初始化是否成功 */
    @XmlElement(name = "InitSuccess", required = true)
    @FieldName("初始化是否成功")
    private boolean initSuccess;

    /** 戶內成員 */
    @FieldName("戶內成員")
    @XmlElement(name = "MemberMap", required = false)
    private Map<String, XLDFDomainObject> memberMap = new HashMap<String, XLDFDomainObject>();

    private Map<String, XLDFPersonDataDomainObject> XLDFPersonDataDomainObjects = new HashMap<String, XLDFPersonDataDomainObject>();

    public OpeningOperationDTO getOpeningOperationDTO() {
        return openingOperationDTO;
    }

    public void setOpeningOperationDTO(OpeningOperationDTO openingOperationDTO) {
        this.openingOperationDTO = openingOperationDTO;
    }

    public XLDFPersonDataDomainObject getPerson() {
        return person;
    }

    public void setPerson(XLDFPersonDataDomainObject person) {
        this.person = person;
    }

    public XLDFHouseholdDataDomainObject getPersonHousehold() {
        return personHousehold;
    }

    public void setPersonHousehold(XLDFHouseholdDataDomainObject personHousehold) {
        this.personHousehold = personHousehold;
    }

    public Rl0y100AppDataDTO getRl0y100AppData() {
        return rl0y100AppData;
    }

    public void setRl0y100AppData(Rl0y100AppDataDTO rl0y100AppData) {
        this.rl0y100AppData = rl0y100AppData;
    }

    public XLDFApplicantDataDTO getApply1() {
        return apply1;
    }

    public void setApply1(XLDFApplicantDataDTO apply1) {
        this.apply1 = apply1;
    }

    public XLDFApplicantDataDTO getApply2() {
        return apply2;
    }

    public void setApply2(XLDFApplicantDataDTO apply2) {
        this.apply2 = apply2;
    }

    public XLDFPersonBriefDataDTO getDelegated() {
        return delegated;
    }

    public void setDelegated(XLDFPersonBriefDataDTO delegated) {
        this.delegated = delegated;
    }

    public PersonEduData getPersonData() {
        return personData;
    }

    public void setPersonData(PersonEduData personData) {
        this.personData = personData;
    }

    public List<PersonEduData> getPersonDataList() {
        return personDataList;
    }

    public void setPersonDataList(List<PersonEduData> personDataList) {
        this.personDataList = personDataList;
    }

    public XldfefaplcType getEnforcedApplicant() {
        return enforcedApplicant;
    }

    public void setEnforcedApplicant(XldfefaplcType enforcedApplicant) {
        this.enforcedApplicant = enforcedApplicant;
    }

    public String getPersonRole() {
        return personRole;
    }

    public void setPersonRole(String personRole) {
        this.personRole = personRole;
    }

    public Boolean getButtonSaveDisabled() {
        return buttonSaveDisabled;
    }

    public void setButtonSaveDisabled(Boolean buttonSaveDisabled) {
        this.buttonSaveDisabled = buttonSaveDisabled;
    }

    public boolean isInitSuccess() {
        return initSuccess;
    }

    public void setInitSuccess(boolean initSuccess) {
        this.initSuccess = initSuccess;
    }

    public Map<String, XLDFDomainObject> getMemberMap() {
        return memberMap;
    }

    public void setMemberMap(Map<String, XLDFDomainObject> memberMap) {
        this.memberMap = memberMap;
    }

    public Map<String, XLDFPersonDataDomainObject> getXLDFPersonDataDomainObjects() {
        return XLDFPersonDataDomainObjects;
    }

    public void setXLDFPersonDataDomainObjects(Map<String, XLDFPersonDataDomainObject> xLDFPersonDataDomainObjects) {
        XLDFPersonDataDomainObjects = xLDFPersonDataDomainObjects;
    }

}
