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

/**
 * The Class Rl02720DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl02720DTO", propOrder = { "householdHeadId", "householdId", "householdHeadName", "siteId", "householdNoteDTOList" })
@XmlRootElement(name = "Rl02720DTO")
public class Rl02720DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 戶長統號. */
    @XmlElement(name = "HouseholdHeadId")
    @FieldName("戶長統號")
    private String householdHeadId = "";

    /** 戶號. */
    @XmlElement(name = "HouseholdId")
    @FieldName("戶號")
    private String householdId = "";

    /** 戶長姓名. */
    @XmlElement(name = "HouseholdHeadName")
    @FieldName("戶長姓名")
    private String householdHeadName = "";

    /** 作業點代碼. */
    @XmlElement(name = "SiteId")
    @FieldName("作業點代碼")
    private String siteId = "";

    /** 全戶動態記事資料. */
    @XmlElement(name = "HouseholdNoteDTOList")
    @FieldName("全戶動態記事資料")
    private List<Rl02720HouseholdNoteDTO> householdNoteDTOList = new ArrayList<Rl02720HouseholdNoteDTO>();

    /**
     * Gets the household head id.
     *
     * @return the household head id
     */
    public String getHouseholdHeadId() {
        return householdHeadId;
    }

    /**
     * Sets the household head id.
     *
     * @param householdHeadId the new household head id
     */
    public void setHouseholdHeadId(String householdHeadId) {
        this.householdHeadId = householdHeadId;
    }

    /**
     * Gets the household id.
     *
     * @return the household id
     */
    public String getHouseholdId() {
        return householdId;
    }

    /**
     * Sets the household id.
     *
     * @param householdId the new household id
     */
    public void setHouseholdId(String householdId) {
        this.householdId = householdId;
    }

    /**
     * Gets the household head name.
     *
     * @return the household head name
     */
    public String getHouseholdHeadName() {
        return householdHeadName;
    }

    /**
     * Sets the household head name.
     *
     * @param householdHeadName the new household head name
     */
    public void setHouseholdHeadName(String householdHeadName) {
        this.householdHeadName = householdHeadName;
    }

    /**
     * Gets the household note dto list.
     *
     * @return the household note dto list
     */
    public List<Rl02720HouseholdNoteDTO> getHouseholdNoteDTOList() {
        return householdNoteDTOList;
    }

    /**
     * Sets the household note dto list.
     *
     * @param householdNoteDTOList the new household note dto list
     */
    public void setHouseholdNoteDTOList(List<Rl02720HouseholdNoteDTO> householdNoteDTOList) {
        this.householdNoteDTOList = householdNoteDTOList;
    }

    /**
     * Gets the site id.
     *
     * @return the site id
     */
    public String getSiteId() {
        return siteId;
    }

    /**
     * Sets the site id.
     *
     * @param siteId the new site id
     */
    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

}
