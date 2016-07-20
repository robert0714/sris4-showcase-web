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

import javax.xml.bind.annotation.XmlElement;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.component.dto.XLDFDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;

/**
 * 
 * @author Marcusc Chen
 * 
 */
public class Rl01804MoveinDTO implements Serializable {

    /**
     * Serial id.
     */
    private static final long serialVersionUID = 1L;

    /** 清除. */
    @XmlElement(name = "cancel", required = true)
    @FieldName("清除")
    private boolean cancel;

    /** 選擇記事. */
    @XmlElement(name = "selectRegister", required = true)
    @FieldName("選擇記事")
    private boolean selectRegister;

    /** 撤銷後遷入日期 */
    @XmlElement(name = "cancelMoveInDate", required = true)
    @FieldName("撤銷後遷入日期")
    private String cancelMoveInDate;

    /** 個人細項 */
    @XmlElement(name = "personData", required = true)
    @FieldName("個人細項")
    private Rl01804PersonDTO personData;

    /** 個人申請書資料檔 */
    @XmlElement(name = "m10mList", required = true)
    @FieldName("個人申請書資料檔")
    private List<XLDFDomainObject> m10mList = new ArrayList<XLDFDomainObject>();;

    /** 被挑選原申請書紀錄 */
    @XmlElement(name = "selectApplication", required = true)
    @FieldName("被挑選原申請書紀錄")
    XLDFDomainObject selectApplication;

    /** Constrouctor */
    public Rl01804MoveinDTO() {

    }

    /**
     * 建構子
     * 
     * @param cancel
     *            清除
     * @param personData
     *            個人基本資料(XLDFPersonDataDTO)
     * @param selectRegister
     *            選擇記事
     */
    public Rl01804MoveinDTO(boolean cancel, XLDFPersonDataDomainObject personDataObj, boolean selectRegister,
            String last6mDate, String last6mTime) {
        this.cancel = Boolean.FALSE;

        this.selectRegister = Boolean.FALSE;
        this.cancelMoveInDate = RlConstant.EMPTY_STRING;
        settingPersonDataDTO(personDataObj, last6mDate, last6mTime);

    }

    /**
     * 建構子
     * 
     * @param personData
     *            個人基本資料(XLDFPersonDataDomainObject)
     */
    public Rl01804MoveinDTO(XLDFPersonDataDomainObject personDataObj, String last6mDate, String last6mTime) {
        this.cancel = Boolean.FALSE;
        this.selectRegister = Boolean.FALSE;
        settingPersonDataDTO(personDataObj, last6mDate, last6mTime);

    }

    /**
     * 建構子
     * 
     * @param personData
     *            個人基本資料(XLDFPersonDataDomainObject)
     */
    public Rl01804MoveinDTO(XLDFPersonDataDomainObject personDataObj, String last6mDate, String last6mTime,
            String aftCancelMoveinDate) {
        this.cancel = Boolean.FALSE;
        this.selectRegister = Boolean.FALSE;
        settingPersonDataDTO(personDataObj, last6mDate, last6mTime, aftCancelMoveinDate);

    }

    /**
     * 建構子
     * 
     * @param personData
     *            個人基本資料(XLDFPersonDataDomainObject)
     */
    public Rl01804MoveinDTO(XLDFPersonDataDomainObject personDataObj) {
        this.cancel = Boolean.FALSE;
        this.selectRegister = Boolean.FALSE;
        settingPersonDataDTO(personDataObj, RlConstant.EMPTY_STRING, RlConstant.EMPTY_STRING);

    }

    /**
     * 
     * @param personDataObj
     */
    private void settingPersonDataDTO(XLDFPersonDataDomainObject personDataObj, String last6mDate, String last6mTime) {
        this.personData = new Rl01804PersonDTO();
        personData.setBirthYyymmdd(personDataObj.getBirthYyymmdd());
        personData.setPersonId(personDataObj.getPersonId());
        personData.setPersonName(personDataObj.getPersonName());
        personData.setRelationship(personDataObj.getRelationship());
        personData.setEducationMark(personDataObj.getEducationMark());
        personData.setGender(personDataObj.getGender());
        personData.setIdCardLostApplyDate(personDataObj.getIdCardLostApply().getIdCardLostApplyYyymmdd());
        personData.setOriRelationship(personDataObj.getRelationship());
        personData.setIdCardLostApplyMark(personDataObj.getIdCardLostApply().getIdCardLostApplyMark());
        personData.setIdCardLostApplyTime(personDataObj.getIdCardLostApply().getIdCardLostApplyHhmmss());

        personData.setRl6mRegisterDate(last6mDate);
        personData.setRl6mRegisterTime(last6mTime);
        personData.setMoveinDate(personDataObj.getMoveInYyymmdd());
        personData.setRemoveDate(personDataObj.getPersonSourceInfo().getSourceRemoveYyymmdd());
        personData.setRemoveTime(personDataObj.getPersonSourceInfo().getSourceRemoveTime());
        personData.setHouseholdHeadId(personDataObj.getHouseholdHeadId());
        personData.setSourceSiteId(personDataObj.getPersonSourceInfo().getSourceSiteId());

    }

    /**
     * 
     * @param personDataObj
     */
    private void settingPersonDataDTO(XLDFPersonDataDomainObject personDataObj, String last6mDate, String last6mTime,
            String aftcancelMoveDate) {
        this.personData = new Rl01804PersonDTO();
        personData.setBirthYyymmdd(personDataObj.getBirthYyymmdd());
        personData.setPersonId(personDataObj.getPersonId());
        personData.setPersonName(personDataObj.getPersonName());
        personData.setRelationship(personDataObj.getRelationship());
        personData.setEducationMark(personDataObj.getEducationMark());
        personData.setGender(personDataObj.getGender());
        personData.setIdCardLostApplyDate(personDataObj.getIdCardLostApply().getIdCardLostApplyYyymmdd());
        personData.setOriRelationship(personDataObj.getRelationship());
        personData.setIdCardLostApplyMark(personDataObj.getIdCardLostApply().getIdCardLostApplyMark());
        personData.setIdCardLostApplyTime(personDataObj.getIdCardLostApply().getIdCardLostApplyHhmmss());

        personData.setRl6mRegisterDate(last6mDate);
        personData.setRl6mRegisterTime(last6mTime);
        personData.setMoveinDate(aftcancelMoveDate);
        personData.setRemoveDate(personDataObj.getPersonSourceInfo().getSourceRemoveYyymmdd());
        personData.setRemoveTime(personDataObj.getPersonSourceInfo().getSourceRemoveTime());
        personData.setHouseholdHeadId(personDataObj.getHouseholdHeadId());
        personData.setSourceSiteId(personDataObj.getPersonSourceInfo().getSourceSiteId());

    }

    /**
     * @return the cancel
     */
    public boolean isCancel() {
        return cancel;
    }

    /**
     * @param cancel
     *            the cancel to set
     */
    public void setCancel(boolean cancel) {
        this.cancel = cancel;
    }

    /**
     * @return the selectRegister
     */
    public boolean isSelectRegister() {
        return selectRegister;
    }

    /**
     * @param selectRegister
     *            the selectRegister to set
     */
    public void setSelectRegister(boolean selectRegister) {
        this.selectRegister = selectRegister;
    }

    /**
     * @return the cancelMoveInDate
     */
    public String getCancelMoveInDate() {
        return cancelMoveInDate;
    }

    /**
     * @param cancelMoveInDate
     *            the cancelMoveInDate to set
     */
    public void setCancelMoveInDate(String cancelMoveInDate) {
        this.cancelMoveInDate = cancelMoveInDate;
    }

    /**
     * @return the personData
     */
    public Rl01804PersonDTO getPersonData() {
        return personData;
    }

    /**
     * @param personData
     *            the personData to set
     */
    public void setPersonData(Rl01804PersonDTO personData) {
        this.personData = personData;
    }

    /**
     * @return the m10mList
     */
    public List<XLDFDomainObject> getM10mList() {
        return m10mList;
    }

    /**
     * @param m10mList
     *            the m10mList to set
     */
    public void setM10mList(List<XLDFDomainObject> m10mList) {
        this.m10mList = m10mList;
    }

    /**
     * @return the selectApplication
     */
    public XLDFDomainObject getSelectApplication() {
        return selectApplication;
    }

    /**
     * @param selectApplication
     *            the selectApplication to set
     */
    public void setSelectApplication(XLDFDomainObject selectApplication) {
        this.selectApplication = selectApplication;
    }

}
