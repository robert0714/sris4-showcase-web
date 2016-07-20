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

/**
 * The Class Rl08941DTO.
 * 
 * @author Jay Kan
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl08941DTO", propOrder = { "dataYear", "dataMonth", "govHouseT", "govHouseI", "govHouseO",
        "govPeopleT", "govPeopleI", "govPeopleO", "unmannedHouseT", "unmannedHouseI", "unmannedHouseO",
        "unmannedPeopleT", "unmannedPeopleI", "unmannedPeopleO" })
@XmlRootElement(name = "Rl08941DTO")
public class Rl08941DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -4387740318841024164L;

    /** 統計年度. */
    @XmlElement(name = "DataYear")
    @FieldName("統計年度")
    private String dataYear;

    /** 統計月份. */
    @XmlElement(name = "DataMonth")
    @FieldName("統計月份")
    private String dataMonth;

    /** 機關申請辦理逕遷-戶數總計. */
    @XmlElement(name = "GovHouseT")
    @FieldName("機關申請辦理逕遷-戶數總計")
    private String govHouseT;

    /** 機關申請辦理逕遷-前一個月戶數總計. */
    @XmlElement(name = "LastGovHouseT")
    @FieldName("機關申請辦理逕遷-前一個月戶數總計")
    private String lastGovHouseT;

    /** 機關申請辦理逕遷-戶數增加. */
    @XmlElement(name = "GovHouseI")
    @FieldName("機關申請辦理逕遷-戶數增加")
    private String govHouseI;

    /** 機關申請辦理逕遷-戶數減少. */
    @XmlElement(name = "GovHouseO")
    @FieldName("機關申請辦理逕遷-戶數減少")
    private String govHouseO;

    /** 機關申請辦理逕遷-人數總計. */
    @XmlElement(name = "GovPeopleT")
    @FieldName("機關申請辦理逕遷-人數總計")
    private String govPeopleT;

    /** 機關申請辦理逕遷-前一個月人數總計. */
    @XmlElement(name = "LadtGovPeopleT")
    @FieldName("機關申請辦理逕遷-前一個月人數總計")
    private String lastGovPeopleT;

    /** 機關申請辦理逕遷-人數增加. */
    @XmlElement(name = "GovPeopleI")
    @FieldName("機關申請辦理逕遷-人數增加")
    private String govPeopleI;

    /** 機關申請辦理逕遷-人數減少. */
    @XmlElement(name = "GovPeopleO")
    @FieldName("機關申請辦理逕遷-人數減少")
    private String govPeopleO;

    /** 無人申請辦理逕遷-戶數總計. */
    @XmlElement(name = "UnmannedHouseT")
    @FieldName("無人申請辦理逕遷-戶數總計")
    private String unmannedHouseT;

    /** 無人申請辦理逕遷-前一個月戶數總計. */
    @XmlElement(name = "LastUnmannedHouseT")
    @FieldName("無人申請辦理逕遷-前一個月戶數總計")
    private String lastUnmannedHouseT;

    /** 無人申請辦理逕遷-戶數增加. */
    @XmlElement(name = "UnmannedHouseI")
    @FieldName("無人申請辦理逕遷-戶數增加")
    private String unmannedHouseI;

    /** 無人申請辦理逕遷-戶數減少. */
    @XmlElement(name = "UnmannedHouseO")
    @FieldName("無人申請辦理逕遷-戶數減少")
    private String unmannedHouseO;

    /** 無人申請辦理逕遷-人數總計. */
    @XmlElement(name = "UnmannedPeopleT")
    @FieldName("無人申請辦理逕遷-人數總計")
    private String unmannedPeopleT;

    /** 無人申請辦理逕遷-前一個人數總計. */
    @XmlElement(name = "LastUnmannedPeopleT")
    @FieldName("無人申請辦理逕遷-前一個人數總計")
    private String lastUnmannedPeopleT;

    /** 無人申請辦理逕遷-人數增加. */
    @XmlElement(name = "UnmannedPeopleI")
    @FieldName("無人申請辦理逕遷-人數增加")
    private String unmannedPeopleI;

    /** 無人申請辦理逕遷-人數減少. */
    @XmlElement(name = "UnmannedPeopleO")
    @FieldName("無人申請辦理逕遷-人數減少")
    private String unmannedPeopleO;

    public String getDataYear() {
        return dataYear;
    }

    public void setDataYear(String dataYear) {
        this.dataYear = dataYear;
    }

    public String getDataMonth() {
        return dataMonth;
    }

    public void setDataMonth(String dataMonth) {
        this.dataMonth = dataMonth;
    }

    public String getGovHouseT() {
        return govHouseT;
    }

    public void setGovHouseT(String govHouseT) {
        this.govHouseT = govHouseT;
    }

    public String getLastGovHouseT() {
        return lastGovHouseT;
    }

    public void setLastGovHouseT(String lastGovHouseT) {
        this.lastGovHouseT = lastGovHouseT;
    }

    public String getGovHouseI() {
        return govHouseI;
    }

    public void setGovHouseI(String govHouseI) {
        this.govHouseI = govHouseI;
    }

    public String getGovHouseO() {
        return govHouseO;
    }

    public void setGovHouseO(String govHouseO) {
        this.govHouseO = govHouseO;
    }

    public String getGovPeopleT() {
        return govPeopleT;
    }

    public void setGovPeopleT(String govPeopleT) {
        this.govPeopleT = govPeopleT;
    }

    public String getLastGovPeopleT() {
        return lastGovPeopleT;
    }

    public void setLastGovPeopleT(String lastGovPeopleT) {
        this.lastGovPeopleT = lastGovPeopleT;
    }

    public String getGovPeopleI() {
        return govPeopleI;
    }

    public void setGovPeopleI(String govPeopleI) {
        this.govPeopleI = govPeopleI;
    }

    public String getGovPeopleO() {
        return govPeopleO;
    }

    public void setGovPeopleO(String govPeopleO) {
        this.govPeopleO = govPeopleO;
    }

    public String getUnmannedHouseT() {
        return unmannedHouseT;
    }

    public void setUnmannedHouseT(String unmannedHouseT) {
        this.unmannedHouseT = unmannedHouseT;
    }

    public String getLastUnmannedHouseT() {
        return lastUnmannedHouseT;
    }

    public void setLastUnmannedHouseT(String lastUnmannedHouseT) {
        this.lastUnmannedHouseT = lastUnmannedHouseT;
    }

    public String getUnmannedHouseI() {
        return unmannedHouseI;
    }

    public void setUnmannedHouseI(String unmannedHouseI) {
        this.unmannedHouseI = unmannedHouseI;
    }

    public String getUnmannedHouseO() {
        return unmannedHouseO;
    }

    public void setUnmannedHouseO(String unmannedHouseO) {
        this.unmannedHouseO = unmannedHouseO;
    }

    public String getUnmannedPeopleT() {
        return unmannedPeopleT;
    }

    public void setUnmannedPeopleT(String unmannedPeopleT) {
        this.unmannedPeopleT = unmannedPeopleT;
    }

    public String getLastUnmannedPeopleT() {
        return lastUnmannedPeopleT;
    }

    public void setLastUnmannedPeopleT(String lastUnmannedPeopleT) {
        this.lastUnmannedPeopleT = lastUnmannedPeopleT;
    }

    public String getUnmannedPeopleI() {
        return unmannedPeopleI;
    }

    public void setUnmannedPeopleI(String unmannedPeopleI) {
        this.unmannedPeopleI = unmannedPeopleI;
    }

    public String getUnmannedPeopleO() {
        return unmannedPeopleO;
    }

    public void setUnmannedPeopleO(String unmannedPeopleO) {
        this.unmannedPeopleO = unmannedPeopleO;
    }

}
