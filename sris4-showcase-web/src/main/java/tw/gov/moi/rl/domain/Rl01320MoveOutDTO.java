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
 * 遷出登記遷出當事人DTO
 * 
 * @author Marcusc Chen
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01320MoveinDTO", propOrder = { "cancel", "selectRegister", "personData" })
@XmlRootElement(name = "Rl01320MoveinDTO")
public class Rl01320MoveOutDTO implements Serializable {

    /**
     * Serial id.
     */
    private static final long serialVersionUID = 1L;

    /** 清除. */
    @XmlElement(name = "Cancel", required = true)
    @FieldName("清除")
    private boolean cancel;

    /** 選擇記事. */
    @XmlElement(name = "SelectRegister", required = true)
    @FieldName("選擇記事")
    private boolean selectRegister;

    /** 個人細項 */
    @XmlElement(name = "PersonData", required = true)
    @FieldName("個人細項")
    private Rl01320PersonDTO personData;

    /** Constrouctor */
    public Rl01320MoveOutDTO() {

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
    public Rl01320MoveOutDTO(boolean cancel, XLDFPersonDataDomainObject personDataObj, boolean selectRegister) {
        this.cancel = Boolean.FALSE;

        this.selectRegister = Boolean.FALSE;

        settingPersonDataDTO(personDataObj);

    }

    /**
     * 建構子
     * 
     * @param personData
     *            個人基本資料(XLDFPersonDataDomainObject)
     */
    public Rl01320MoveOutDTO(XLDFPersonDataDomainObject personDataObj) {
        this.cancel = Boolean.FALSE;
        this.selectRegister = Boolean.FALSE;
        settingPersonDataDTO(personDataObj);

    }

    /**
     * 
     * @param personDataObj
     */
    private void settingPersonDataDTO(XLDFPersonDataDomainObject personDataObj) {
        this.personData = new Rl01320PersonDTO();
        this.personData.setBirthYyymmdd(personDataObj.getBirthYyymmdd());
        this.personData.setPersonId(personDataObj.getPersonId());
        this.personData.setPersonName(personDataObj.getPersonName());
        this.personData.setRelationship(personDataObj.getRelationship());
        this.personData.setEducationMark(personDataObj.getEducationMark());
        this.personData.setGender(personDataObj.getGender());
        this.personData.setIdCardLostApplyDate(personDataObj.getIdCardLostApply().getIdCardLostApplyYyymmdd());
        this.personData.setIdCardLostApplyMark(personDataObj.getIdCardLostApply().getIdCardLostApplyMark());
        this.personData.setIdCardLostApplyTime(personDataObj.getIdCardLostApply().getIdCardLostApplyHhmmss());
        this.personData.setMoveinDate(personDataObj.getMoveInYyymmdd());
        this.personData.setRemoveDate(personDataObj.getRemovePage().getRemoveYyymmdd());
        this.personData.setRemoveTime(personDataObj.getRemovePage().getRemoveTime());
        this.personData.setHouseholdHeadId(personDataObj.getHouseholdHeadId());
        this.personData.setSourceSiteId(personDataObj.getSourceSiteId());

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
     * @return the personData
     */
    public Rl01320PersonDTO getPersonData() {
        return personData;
    }

    /**
     * @param personData
     *            the personData to set
     */
    public void setPersonData(Rl01320PersonDTO personData) {
        this.personData = personData;
    }
}
