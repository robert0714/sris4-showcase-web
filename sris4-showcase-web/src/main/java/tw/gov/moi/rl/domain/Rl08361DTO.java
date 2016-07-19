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
 * The Class Rl08361DTO.
 * 
 * @author Weiren.Jheng
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08361DTO", propOrder = { "village", "neighbor", "householdHeadId", "householdId", "householdType",
        "infoList" })
@XmlRootElement(name = "Rl08361DTO")
public class Rl08361DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The village. */
    @XmlElement(name = "Village")
    @FieldName("村里")
    private String village = "";

    /** The neighbor. */
    @XmlElement(name = "Neighbor")
    @FieldName("鄰")
    private String neighbor = "";

    /** The household head id. */
    @XmlElement(name = "HouseholdHeadId")
    @FieldName("戶長統號")
    private String householdHeadId = "";

    /** The household id. */
    @XmlElement(name = "HouseholdId")
    @FieldName("戶號")
    private String householdId = "";

    /** The household type. */
    @XmlElement(name = "HouseholdType")
    @FieldName("戶別")
    private String householdType = "";

    /** The info list. */
    @XmlElement(name = "InfoList")
    @FieldName("查詢結果集")
    private List<Rl08361InfoDTO> infoList = new ArrayList<Rl08361InfoDTO>();

    /** The info dto. */
    @XmlElement(name = "infoDTO")
    @FieldName("個人資料")
    private Rl08361InfoDTO infoDTO = new Rl08361InfoDTO();

    /**
     * Gets the village.
     * 
     * @return the village
     */
    public String getVillage() {
        return village;
    }

    /**
     * Sets the village.
     * 
     * @param village
     *            the new village
     */
    public void setVillage(String village) {
        this.village = village;
    }

    /**
     * Gets the neighbor.
     * 
     * @return the neighbor
     */
    public String getNeighbor() {
        return neighbor;
    }

    /**
     * Sets the neighbor.
     * 
     * @param neighbor
     *            the new neighbor
     */
    public void setNeighbor(String neighbor) {
        this.neighbor = neighbor;
    }

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
     * @param householdHeadId
     *            the new household head id
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
     * @param householdId
     *            the new household id
     */
    public void setHouseholdId(String householdId) {
        this.householdId = householdId;
    }

    /**
     * Gets the household type.
     * 
     * @return the household type
     */
    public String getHouseholdType() {
        return householdType;
    }

    /**
     * Sets the household type.
     * 
     * @param householdType
     *            the new household type
     */
    public void setHouseholdType(String householdType) {
        this.householdType = householdType;
    }

    /**
     * Gets the info list.
     * 
     * @return the info list
     */
    public List<Rl08361InfoDTO> getInfoList() {
        return infoList;
    }

    /**
     * Sets the info list.
     * 
     * @param infoList
     *            the new info list
     */
    public void setInfoList(List<Rl08361InfoDTO> infoList) {
        this.infoList = infoList;
    }

    /**
     * Gets the info dto.
     * 
     * @return the info dto
     */
    public Rl08361InfoDTO getInfoDTO() {
        return infoDTO;
    }

    /**
     * Sets the info dto.
     * 
     * @param infoDTO
     *            the new info dto
     */
    public void setInfoDTO(Rl08361InfoDTO infoDTO) {
        this.infoDTO = infoDTO;
    }

}
