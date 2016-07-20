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
 * The Class Rl02700DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl02700DTO", propOrder = { "householdHeadId", "householdId", "rl02710dto", "rl02720dto", "rl02730dto",
        "txnInfo", "registerDate" })
@XmlRootElement(name = "Rl02700DTO")
public class Rl02700DTO implements Serializable {

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

    /** The rl02710dto. */
    @XmlElement(name = "Rl02710dto")
    @FieldName("簿頁改換寫")
    private Rl02710DTO rl02710dto = new Rl02710DTO();

    /** The rl02720dto. */
    @XmlElement(name = "Rl02720dto")
    @FieldName("全戶動態記事")
    private Rl02720DTO rl02720dto = new Rl02720DTO();

    /** The rl02730dto. */
    @XmlElement(name = "Rl02730dto")
    @FieldName("現住個人記事")
    private Rl02730DTO rl02730dto = new Rl02730DTO();

    /** The txn info. */
    @XmlElement(name = "TxnInfo")
    @FieldName("交易資料")
    private String txnInfo;

    /** 註冊時間. */
    @XmlElement(name = "RegisterDate")
    @FieldName("註冊時間")
    private String registerDate;

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
     * Gets the rl02710dto.
     * 
     * @return the rl02710dto
     */
    public Rl02710DTO getRl02710dto() {
        return rl02710dto;
    }

    /**
     * Sets the rl02710dto.
     * 
     * @param rl02710dto
     *            the new rl02710dto
     */
    public void setRl02710dto(Rl02710DTO rl02710dto) {
        this.rl02710dto = rl02710dto;
    }

    /**
     * Gets the rl02720dto.
     * 
     * @return the rl02720dto
     */
    public Rl02720DTO getRl02720dto() {
        return rl02720dto;
    }

    /**
     * Sets the rl02720dto.
     * 
     * @param rl02720dto
     *            the new rl02720dto
     */
    public void setRl02720dto(Rl02720DTO rl02720dto) {
        this.rl02720dto = rl02720dto;
    }

    /**
     * Gets the rl02730dto.
     * 
     * @return the rl02730dto
     */
    public Rl02730DTO getRl02730dto() {
        return rl02730dto;
    }

    /**
     * Sets the rl02730dto.
     * 
     * @param rl02730dto
     *            the new rl02730dto
     */
    public void setRl02730dto(Rl02730DTO rl02730dto) {
        this.rl02730dto = rl02730dto;
    }

    /**
     * Gets the txn info.
     * 
     * @return the txn info
     */
    public String getTxnInfo() {
        return txnInfo;
    }

    /**
     * Sets the txn info.
     * 
     * @param txnInfo
     *            the new txn info
     */
    public void setTxnInfo(String txnInfo) {
        this.txnInfo = txnInfo;
    }

    /**
     * Gets the register date.
     * 
     * @return the register date
     */
    public String getRegisterDate() {
        return registerDate;
    }

    /**
     * Sets the register date.
     * 
     * @param registerDate
     *            the new register date
     */
    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Rl02700DTO [householdHeadId=" + householdHeadId + ", householdId=" + householdId + "]";
    }
}
