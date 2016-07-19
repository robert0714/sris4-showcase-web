/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.beanutils.BeanUtils;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;

/**
 * 遷出登記原住地成員DTO
 * 
 * @author Marcus Chen
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01320OriginDataDTO", propOrder = { "selectedHead", "personData" })
@XmlRootElement(name = "Rl01320OriginDataDTO")
public class Rl01320OriginDataDTO implements Serializable {
    /**
     * Serial id.
     */
    private static final long serialVersionUID = 1L;

    /** 選擇新戶長. */
    @XmlElement(name = "SelectedHead", required = true)
    @FieldName("選擇新戶長")
    private boolean selectedHead;

    /** 個人基本資料. */
    @XmlElement(name = "PersonData", required = true)
    @FieldName("個人基本資料")
    private Rl01320PersonDTO personData;

    /**
     * Default Constructor
     * 
     */
    public Rl01320OriginDataDTO() {

    }

    /**
     * Constructor
     * 
     * @param personData
     */
    public Rl01320OriginDataDTO(XLDFPersonDataDomainObject personDataObj) {
        this.selectedHead = Boolean.FALSE;

        // this.personData = personData.get;
        this.personData = new Rl01320PersonDTO();
        personData.setBirthYyymmdd(personDataObj.getBirthYyymmdd());
        personData.setPersonId(personDataObj.getPersonId());
        personData.setSiteId(personDataObj.getSiteId());
        personData.setPersonName(personDataObj.getPersonName());
        personData.setRelationship(personDataObj.getRelationship());
        personData.setEducationMark(personDataObj.getEducationMark());
        personData.setGender(personDataObj.getGender());
        personData.setIdCardLostApplyDate(personDataObj.getIdCardLostApply().getIdCardLostApplyYyymmdd());
        personData.setIdCardLostApplyMark(personDataObj.getIdCardLostApply().getIdCardLostApplyMark());
        personData.setIdCardLostApplyTime(personDataObj.getIdCardLostApply().getIdCardLostApplyHhmmss());
        personData.setMoveinDate(personDataObj.getMoveInYyymmdd());
        personData.setRemoveDate(personDataObj.getRemovePage().getRemoveYyymmdd());
        personData.setRemoveTime(personDataObj.getRemovePage().getRemoveTime());
        personData.setHouseholdHeadId(personDataObj.getHouseholdHeadId());
        personData.setSourceSiteId(personDataObj.getSourceSiteId());

    }

    /**
     * Constructor
     * 
     * @param personData
     */
    public Rl01320OriginDataDTO(Rl01320MoveOutDTO moveinDTO) {
        this.selectedHead = Boolean.FALSE;

        this.personData = new Rl01320PersonDTO();
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
