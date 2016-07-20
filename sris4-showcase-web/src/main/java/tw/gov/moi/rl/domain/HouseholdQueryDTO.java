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
import tw.gov.moi.rl.component.dto.PersonDataInputDTO;

/**
 * The Class HouseholdQueryDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "householdQueryDTO", propOrder = { "applicant1", "applicant2", "delegatedPerson", "txnPerson",
        "operationCode", "ifEnforce", "outliveCase", "backFromL00004", "fromRL02F10" ,"recoverTxId" })
@XmlRootElement(name = "HouseholdQueryDTO")
public class HouseholdQueryDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -1217036901175759252L;

    /** The applicant1. */
    @XmlElement(name = "Applicant1", required = true)
    @FieldName("申請人1")
    private ApplicantDataInputDTO applicant1 = new ApplicantDataInputDTO();

    /** The applicant2. */
    @XmlElement(name = "Applicant2", required = true)
    @FieldName("申請人2")
    private ApplicantDataInputDTO applicant2 = new ApplicantDataInputDTO();

    /** The delegated person. */
    @XmlElement(name = "DelegatedPerson", required = true)
    @FieldName("受委託人")
    private PersonDataInputDTO delegatedPerson = new PersonDataInputDTO();

    /** The txn person. */
    @XmlElement(name = "TxnPerson", required = true)
    @FieldName("當事人")
    private PersonDataInputDTO txnPerson = new PersonDataInputDTO();

    /** The operation code. */
    @XmlElement(name = "OperationCode", required = true)
    @FieldName("作業代碼")
    private String operationCode;

    /** The if enforce. */
    @XmlElement(name = "IfEnforce", required = true)
    @FieldName("是否逕為登記")
    private boolean ifEnforce = false;

    /** outlive case. */
    @XmlElement(name = "OutliveCase", required = true)
    @FieldName("如果是現戶是false,如果是除戶則是true")
    private boolean outliveCase = false;

    /** The back from l00004. */
    @XmlElement(name = "BackFromL00004", required = true)
    @FieldName("如果是由文件核發頁面是true,如果是現戶大簿則是false")
    private boolean backFromL00004 = false;

    /** 作業是否為大宗戶籍謄本過來. */
    @XmlElement(name = "FromRL02F10", required = true)
    @FieldName("作業是否為大宗戶籍謄本過來")
    private boolean fromRL02F10;

    /** 交易除錯復原唯一識別碼. */
    @XmlElement(name = "recoverTxId", required = true)
    @FieldName("交易除錯復原唯一識別碼")
    private String recoverTxId ; 
    
    
    /**
     * Gets the applicant1.
     * 
     * @return the applicant1
     */
    public ApplicantDataInputDTO getApplicant1() {
        return applicant1;
    }

    /**
     * Sets the applicant1.
     * 
     * @param applicant1
     *            the new applicant1
     */
    public void setApplicant1(final ApplicantDataInputDTO applicant1) {
        this.applicant1 = applicant1;
    }

    /**
     * Gets the applicant2.
     * 
     * @return the applicant2
     */
    public ApplicantDataInputDTO getApplicant2() {
        return applicant2;
    }

    /**
     * Sets the applicant2.
     * 
     * @param applicant2
     *            the new applicant2
     */
    public void setApplicant2(final ApplicantDataInputDTO applicant2) {
        this.applicant2 = applicant2;
    }

    /**
     * Gets the delegated person.
     * 
     * @return the delegated person
     */
    public PersonDataInputDTO getDelegatedPerson() {
        return delegatedPerson;
    }

    /**
     * Sets the delegated person.
     * 
     * @param delegatedPerson
     *            the new delegated person
     */
    public void setDelegatedPerson(final PersonDataInputDTO delegatedPerson) {
        this.delegatedPerson = delegatedPerson;
    }

    /**
     * Gets the txn person.
     * 
     * @return the txn person
     */
    public PersonDataInputDTO getTxnPerson() {
        return txnPerson;
    }

    /**
     * Sets the txn person.
     * 
     * @param txnPerson
     *            the new txn person
     */
    public void setTxnPerson(final PersonDataInputDTO txnPerson) {
        this.txnPerson = txnPerson;
    }

    /**
     * Gets the operation code.
     * 
     * @return the operation code
     */
    public String getOperationCode() {
        return operationCode;
    }

    /**
     * Sets the operation code.
     * 
     * @param operationCode
     *            the new operation code
     */
    public void setOperationCode(final String operationCode) {
        this.operationCode = operationCode;
    }

    /**
     * Checks if is if enforce.
     * 
     * @return true, if is if enforce
     */
    public boolean isIfEnforce() {
        return ifEnforce;
    }

    /**
     * Sets the if enforce.
     * 
     * @param ifEnforce
     *            the new if enforce
     */
    public void setIfEnforce(final boolean ifEnforce) {
        this.ifEnforce = ifEnforce;
    }

    /**
     * Checks if is outlive case.
     * 
     * @return true, if is outlive case
     */
    public boolean isOutliveCase() {
        return outliveCase;
    }

    /**
     * Sets the outlive case.
     * 
     * @param outliveCase
     *            the new outlive case
     */
    public void setOutliveCase(final boolean outliveCase) {
        this.outliveCase = outliveCase;
    }
    /**
     * Checks if is back from l00004.
     * 
     * @return true, if is back from l00004
     */
    public boolean isBackFromL00004() {
        return backFromL00004;
    }

    /**
     * Sets the back from l00004.
     * 
     * @param backFromL00004
     *            the new back from l00004
     */
    public void setBackFromL00004(final boolean backFromL00004) {
        this.backFromL00004 = backFromL00004;
    }

    public boolean isFromRL02F10() {
        return fromRL02F10;
    }

    public void setFromRL02F10(boolean fromRL02F10) {
        this.fromRL02F10 = fromRL02F10;
    }

    public String getRecoverTxId() {
        return recoverTxId;
    }

    public void setRecoverTxId(String recoverTxId) {
        this.recoverTxId = recoverTxId;
    }

}
