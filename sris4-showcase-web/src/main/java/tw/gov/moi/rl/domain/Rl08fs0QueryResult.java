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
import tw.gov.moi.domain.Rlde806wType;

/**
 * 選舉造冊封面列查詢結果DTO.
 * 
 * @author Viva.Hong
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl08fs0QueryResult", propOrder = { "birthDate", "entity", "householdId", "householdPersonId",
        "moveInDate", "neighbor", "personId", "personName", "streetplate", "village", "voteOffice" })
@XmlRootElement(name = "Rl08fs0QueryResult")
public class Rl08fs0QueryResult implements Serializable {

    /** SerialVersion UID. */
    private static final long serialVersionUID = 1L;

    /** 出生日期. */
    @XmlElement(name = "BirthDate", required = true)
    @FieldName("出生日期")
    private String birthDate;

    /** Entity. */
    @XmlElement(name = "Entity", required = true)
    @FieldName("Entity")
    private Rlde806wType entity;

    /** 戶號. */
    @XmlElement(name = "HouseholdId", required = true)
    @FieldName("戶號")
    private String householdId;

    /** 戶長統號. */
    @XmlElement(name = "HouseholdPersonId", required = true)
    @FieldName("戶長統號")
    private String householdPersonId;

    /** 遷入日期. */
    @XmlElement(name = "MoveInDate", required = true)
    @FieldName("遷入日期")
    private String moveInDate;

    /** 鄰. */
    @XmlElement(name = "Neighbor", required = true)
    @FieldName("鄰")
    private String neighbor;

    /** 統一編號. */
    @XmlElement(name = "PersonId", required = true)
    @FieldName("統一編號")
    private String personId;

    /** 姓名. */
    @XmlElement(name = "PersonName", required = true)
    @FieldName("姓名")
    private String personName;

    /** 街路門牌. */
    @XmlElement(name = "Streetplate", required = true)
    @FieldName("街路門牌")
    private String streetplate;

    /** 村里. */
    @XmlElement(name = "Village", required = true)
    @FieldName("村里")
    private String village;

    /** 投票所. */
    @XmlElement(name = "VoteOffice", required = true)
    @FieldName("投票所")
    private String voteOffice;

    public String getBirthDate() {
        return birthDate;
    }

    public Rlde806wType getEntity() {
        return entity;
    }

    public String getHouseholdId() {
        return householdId;
    }

    public String getHouseholdPersonId() {
        return householdPersonId;
    }

    public String getMoveInDate() {
        return moveInDate;
    }

    public String getNeighbor() {
        return neighbor;
    }

    public String getPersonId() {
        return personId;
    }

    public String getPersonName() {
        return personName;
    }

    public String getStreetplate() {
        return streetplate;
    }

    public String getVillage() {
        return village;
    }

    public String getVoteOffice() {
        return voteOffice;
    }

    public void setBirthDate(final String birthDate) {
        this.birthDate = birthDate;
    }

    public void setEntity(final Rlde806wType entity) {
        this.entity = entity;
    }

    public void setHouseholdId(final String householdId) {
        this.householdId = householdId;
    }

    public void setHouseholdPersonId(final String householdPersonId) {
        this.householdPersonId = householdPersonId;
    }

    public void setMoveInDate(final String moveInDate) {
        this.moveInDate = moveInDate;
    }

    public void setNeighbor(final String neighbor) {
        this.neighbor = neighbor;
    }

    public void setPersonId(final String personId) {
        this.personId = personId;
    }

    public void setPersonName(final String personName) {
        this.personName = personName;
    }

    public void setStreetplate(final String streetplate) {
        this.streetplate = streetplate;
    }

    public void setVillage(final String village) {
        this.village = village;
    }

    public void setVoteOffice(final String voteOffice) {
        this.voteOffice = voteOffice;
    }

}
