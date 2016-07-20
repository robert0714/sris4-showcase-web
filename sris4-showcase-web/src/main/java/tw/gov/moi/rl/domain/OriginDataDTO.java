/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

import javax.xml.bind.annotation.XmlElement;

import org.apache.commons.beanutils.BeanUtils;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;

/**
 * OriginDataDTO
 * 
 * @author Marcus Chen
 * @version 1.0 7/8
 * @version 2.0 8/20
 */
public class OriginDataDTO implements Serializable {

    /**
     * Serial id.
     */
    private static final long serialVersionUID = 1L;

    /** 選擇新戶長. */
    @XmlElement(name = "selectedHead", required = true)
    @FieldName("選擇新戶長")
    private boolean selectedHead = Boolean.FALSE;

    /** 個人基本資料. */
    @XmlElement(name = "personData", required = true)
    @FieldName("個人基本資料")
    private Rl01804PersonDTO personData;

    /**
     * Default Constructor
     * 
     */
    public OriginDataDTO() {

    }

    /**
     * Default Constructor
     * 
     */
    public OriginDataDTO(boolean selectedHead, XLDFPersonDataDomainObject personDataObj) {
        this.selectedHead = selectedHead;
        settingDTO(personDataObj);
    }

    /**
     * Constructor
     * 
     * @param personData
     */
    public OriginDataDTO(XLDFPersonDataDomainObject personDataObj) {
        this.selectedHead = Boolean.FALSE;
        settingDTO(personDataObj);
        // this.personData = personData.get;

    }

    private void settingDTO(XLDFPersonDataDomainObject personDataObj) {

        this.personData = new Rl01804PersonDTO();
        personData.setBirthYyymmdd(personDataObj.getBirthYyymmdd());
        personData.setPersonId(personDataObj.getPersonId());
        personData.setSiteId(personDataObj.getSiteId());
        personData.setPersonName(personDataObj.getPersonName());
        personData.setRelationship(personDataObj.getRelationship());
        personData.setOriRelationship(personDataObj.getRelationship());
        personData.setEducationMark(personDataObj.getEducationMark());
        personData.setGender(personDataObj.getGender());
        personData.setIdCardLostApplyDate(personDataObj.getIdCardLostApply().getIdCardLostApplyYyymmdd());
        // personData.setIdCardLostApplyMark(personDataObj.getIdCardLostApply().getIdCardLostApplyMark());
        personData.setIdCardLostApplyTime(personDataObj.getIdCardLostApply().getIdCardLostApplyHhmmss());
        personData.setMoveinDate(personDataObj.getMoveInYyymmdd());
        personData.setRemoveDate(personDataObj.getRemovePage().getRemoveYyymmdd());
        personData.setRemoveTime(personDataObj.getRemovePage().getRemoveTime());
        personData.setHouseholdHeadId(personDataObj.getHouseholdHeadId());
        // FIXME personData.setSourceSiteId(personDataObj.getSourceSiteId());
        personData.setRl6mRegisterDate(RlConstant.EMPTY_STRING);
        personData.setRl6mRegisterTime(RlConstant.EMPTY_STRING);

    }

    /**
     * Constructor
     * 
     * @param personData
     */
    public OriginDataDTO(MoveInDTO moveinDTO) {
        this.selectedHead = Boolean.FALSE;

        // this.personData = personData.get;
        this.personData = new Rl01804PersonDTO();
        try {
            BeanUtils.copyProperties(this.personData, moveinDTO.getPersonData());
        } catch (IllegalAccessException e) {

        } catch (InvocationTargetException e) {

        }
    }

    /**
     * @return the selectedHead
     */
    public boolean isSelectedHead() {
        return selectedHead;
    }

    /**
     * @param selectedHead
     *            the selectedHead to set
     */
    public void setSelectedHead(boolean selectedHead) {
        this.selectedHead = selectedHead;
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

}
