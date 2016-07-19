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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.component.dto.XLDFDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFHouseholdNoteDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;

/**
 * 戶長變更DTO.
 * 
 * @author Jay Kan
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl0172aDTO", propOrder = { "householdOperationDTO", "householdAppDataDTO", "rl0172aAppDataDTO",
        "householdNoteList", "newHousehold", "newMemberList", "nonResidentList", "selectedHouseholdHead",
        "householdHeadData" })
@XmlRootElement(name = "Rl0172aDTO")
public class Rl0172aDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 2165723283251306720L;

    /** 戶籍登記作業共通DTO. */
    @XmlElement(name = "HouseholdOperationDTO")
    @FieldName("戶籍登記作業共通DTO")
    private HouseholdOperationDTO householdOperationDTO = new HouseholdOperationDTO();

    /** 戶籍登記作業共通AppDataDTO. */
    @XmlElement(name = "HouseholdAppDataDTO")
    @FieldName("戶籍登記作業共通AppDataDTO")
    private HouseholdAppDataDTO householdAppDataDTO = new HouseholdAppDataDTO();

    /** 戶長變更登記AppDataDTO. */
    @XmlElement(name = "Rl0172aAppDataDTO")
    @FieldName("戶長變更登記AppDataDTO")
    private Rl0172aAppDataDTO rl0172aAppDataDTO = new Rl0172aAppDataDTO();

    /** 全戶記事清單. */
    @XmlElement(name = "HouseholdNoteList")
    @FieldName("全戶記事清單")
    private List<XLDFHouseholdNoteDomainObject> householdNoteList = new ArrayList<XLDFHouseholdNoteDomainObject>();

    /** 新戶. */
    @XmlElement(name = "NewHousehold")
    @FieldName("新戶")
    private XLDFHouseholdDataDomainObject newHousehold;

    /** 新戶成員. */
    @XmlElement(name = "NewMemberList")
    @FieldName("新戶成員")
    private List<Rl0172aHouseholdMemberDTO> newMemberList = new ArrayList<Rl0172aHouseholdMemberDTO>();

    /** 戶下非現住人口清單. */
    @XmlElement(name = "NonResidentList")
    @FieldName("戶下非現住人口清單")
    private List<XLDFDomainObject> nonResidentList = new ArrayList<XLDFDomainObject>();

    /** 新戶長. */
    @XmlElement(name = "SelectedHouseholdHead")
    @FieldName("新戶長")
    private Rl0172aHouseholdMemberDTO selectedHouseholdHead;

    /** 大戶新戶長. */
    @XmlElement(name = "HouseholdHeadData")
    @FieldName("大戶新戶長")
    private XLDFPersonDataDomainObject householdHeadData;

    /**
     * Gets the household operation dto.
     * 
     * @return the household operation dto
     */
    public HouseholdOperationDTO getHouseholdOperationDTO() {
        return householdOperationDTO;
    }

    /**
     * Sets the household operation dto.
     * 
     * @param householdOperationDTO
     *            the new household operation dto
     */
    public void setHouseholdOperationDTO(final HouseholdOperationDTO householdOperationDTO) {
        this.householdOperationDTO = householdOperationDTO;
    }

    /**
     * Gets the household app data dto.
     * 
     * @return the household app data dto
     */
    public HouseholdAppDataDTO getHouseholdAppDataDTO() {
        return householdAppDataDTO;
    }

    /**
     * Sets the household app data dto.
     * 
     * @param householdAppDataDTO
     *            the new household app data dto
     */
    public void setHouseholdAppDataDTO(final HouseholdAppDataDTO householdAppDataDTO) {
        this.householdAppDataDTO = householdAppDataDTO;
    }

    /**
     * Gets the rl0172a app data dto.
     * 
     * @return the rl0172a app data dto
     */
    public Rl0172aAppDataDTO getRl0172aAppDataDTO() {
        return rl0172aAppDataDTO;
    }

    /**
     * Sets the rl0172a app data dto.
     * 
     * @param rl0172aAppDataDTO
     *            the new rl0172a app data dto
     */
    public void setRl0172aAppDataDTO(final Rl0172aAppDataDTO rl0172aAppDataDTO) {
        this.rl0172aAppDataDTO = rl0172aAppDataDTO;
    }

    /**
     * Gets the household note list.
     * 
     * @return the household note list
     */
    public List<XLDFHouseholdNoteDomainObject> getHouseholdNoteList() {
        return householdNoteList;
    }

    /**
     * Sets the household note list.
     * 
     * @param householdNoteList
     *            the new household note list
     */
    public void setHouseholdNoteList(final List<XLDFHouseholdNoteDomainObject> householdNoteList) {
        this.householdNoteList = householdNoteList;
    }

    /**
     * Gets the new household.
     * 
     * @return the new household
     */
    public XLDFHouseholdDataDomainObject getNewHousehold() {
        return newHousehold;
    }

    /**
     * Sets the new household.
     * 
     * @param newHousehold
     *            the new new household
     */
    public void setNewHousehold(final XLDFHouseholdDataDomainObject newHousehold) {
        this.newHousehold = newHousehold;
    }

    /**
     * Gets the new member list.
     * 
     * @return the new member list
     */
    public List<Rl0172aHouseholdMemberDTO> getNewMemberList() {
        return newMemberList;
    }

    /**
     * Sets the new member list.
     * 
     * @param newMemberList
     *            the new new member list
     */
    public void setNewMemberList(final List<Rl0172aHouseholdMemberDTO> newMemberList) {
        this.newMemberList = newMemberList;
    }

    /**
     * Gets the non resident list.
     * 
     * @return the non resident list
     */
    public List<XLDFDomainObject> getNonResidentList() {
        return nonResidentList;
    }

    /**
     * Sets the non resident list.
     * 
     * @param nonResidentList
     *            the new non resident list
     */
    public void setNonResidentList(final List<XLDFDomainObject> nonResidentList) {
        this.nonResidentList = nonResidentList;
    }

    /**
     * Gets the selected household head.
     * 
     * @return the selected household head
     */
    public Rl0172aHouseholdMemberDTO getSelectedHouseholdHead() {
        return selectedHouseholdHead;
    }

    /**
     * Sets the selected household head.
     * 
     * @param selectedHouseholdHead
     *            the new selected household head
     */
    public void setSelectedHouseholdHead(final Rl0172aHouseholdMemberDTO selectedHouseholdHead) {
        this.selectedHouseholdHead = selectedHouseholdHead;
    }

    /**
     * Gets the household head data.
     * 
     * @return the household head data
     */
    public XLDFPersonDataDomainObject getHouseholdHeadData() {
        return householdHeadData;
    }

    /**
     * Sets the household head data.
     * 
     * @param householdHeadData
     *            the new household head data
     */
    public void setHouseholdHeadData(final XLDFPersonDataDomainObject householdHeadData) {
        this.householdHeadData = householdHeadData;
    }
}
