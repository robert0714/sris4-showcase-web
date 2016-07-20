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
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;
import tw.gov.moi.rl.dto.rl01300.Rl01310PersonDTO;

/**
 * 
 * 遷入登記 遷入當事人資料DTO
 * 
 * @author Marcus Chen
 * 
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "moveInDTO", propOrder = { "cancel", "personData", "cancelMoveInDate", "selectRegister" })
@XmlRootElement(name = "MoveInDTO")
public class MoveInDTO implements Serializable {

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
    private Rl01310PersonDTO personData;

    /** Constrouctor */
    public MoveInDTO() {

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
    public MoveInDTO(boolean cancel, XLDFPersonDataDomainObject personData, boolean selectRegister) {
        super();
        this.cancel = Boolean.FALSE;

        this.selectRegister = Boolean.FALSE;

        this.cancelMoveInDate = RlConstant.EMPTY_STRING;
        settingPersonDataDTO(personData);
    }

    /**
     * 建構子
     * 
     * @param personData
     *            個人基本資料(XLDFPersonDataDomainObject)
     */
    public MoveInDTO(XLDFPersonDataDomainObject personData) {
        this.cancel = Boolean.FALSE;

        this.selectRegister = Boolean.FALSE;
        settingPersonDataDTO(personData);
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
    public Rl01310PersonDTO getPersonData() {
        return personData;
    }

    /**
     * @param personData
     *            the personData to set
     */
    public void setPersonData(Rl01310PersonDTO personData) {
        this.personData = personData;
    }

    /**
     * 
     * @param personDataObj
     */
    private void settingPersonDataDTO(XLDFPersonDataDomainObject personDataObj) {
        this.personData = new Rl01310PersonDTO();
        personData.setBirthYyymmdd(personDataObj.getBirthYyymmdd());
        personData.setPersonId(personDataObj.getPersonId());
        personData.setCorrectYyy(personDataObj.getCorrectYyy());
        personData.setSpecialMark(personDataObj.getSpecialMark());
        personData.setPersonName(personDataObj.getPersonName());
        personData.setRelationship(personDataObj.getRelationship());
        personData.setOriRelationship(personDataObj.getRelationship());
        personData.setEducationMark(personDataObj.getEducationMark());
        personData.setGender(personDataObj.getGender());
        personData.setIdCardLostApplyDate(personDataObj.getIdCardLostApply().getIdCardLostApplyYyymmdd());
        personData.setIdCardLostApplyMark(personDataObj.getIdCardLostApply().getIdCardLostApplyMark());
        personData.setIdCardLostApplyTime(personDataObj.getIdCardLostApply().getIdCardLostApplyHhmmss());
        personData.setMoveinDate(personDataObj.getMoveInYyymmdd());
        personData.setRemoveDate(personDataObj.getPersonSourceInfo().getSourceRemoveYyymmdd());
        personData.setRemoveTime(personDataObj.getPersonSourceInfo().getSourceRemoveTime());
        personData.setHouseholdHeadId(personDataObj.getHouseholdHeadId());
        personData.setSourceSiteId(personDataObj.getPersonSourceInfo().getSourceSiteId());
        personData.setSiteId(personDataObj.getSiteId());
    }

}
