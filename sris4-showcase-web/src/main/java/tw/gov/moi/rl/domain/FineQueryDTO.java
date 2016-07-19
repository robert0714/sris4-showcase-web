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

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fineQueryDTO", propOrder = { "transactionId", "applySequenceId", "applySiteId", "applySeq",
        "applyCaseNo", "registrationsDate", "hasTheDate", "receiptId", "operationName", "personId", "finePerson" })
@XmlRootElement(name = "FineQueryDTO")
public class FineQueryDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 交易序號 */
    @FieldName("交易序號")
    @XmlElement(name = "TransactionId", required = false)
    private String transactionId;

    /** 作業順序 */
    @FieldName("作業順序")
    @XmlElement(name = "ApplySequenceId", required = false)
    private String applySequenceId;

    /** 作業點代碼 */
    @FieldName("作業點代碼")
    @XmlElement(name = "ApplySiteId", required = false)
    private String applySiteId;

    /** 申請書流水號 */
    @FieldName("申請書流水號")
    @XmlElement(name = "ApplySeq", required = false)
    private String applySeq;

    /** 申請書代碼 */
    @FieldName("申請書代碼")
    @XmlElement(name = "ApplyCaseNo", required = false)
    private String applyCaseNo;

    /** 登記日期 */
    @FieldName("登記日期")
    @XmlElement(name = "RegistrationsDate", required = false)
    private String registrationsDate;

    /** 發生日期 */
    @FieldName("發生日期")
    @XmlElement(name = "HasTheDate", required = false)
    private String hasTheDate;

    /** 收據號碼 */
    @FieldName("收據號碼")
    @XmlElement(name = "ReceiptId", required = false)
    private String receiptId;

    /** 作業代碼 */
    @FieldName("作業代碼")
    @XmlElement(name = "OperationName", required = false)
    private String operationName;

    /** 當事人統編 */
    @FieldName("當事人統編")
    @XmlElement(name = "PersonId", required = false)
    private String personId;

    /** 受處份人 */
    @FieldName("受處份人")
    @XmlElement(name = "FinePerson", required = false)
    private XLDFApplicantDataDTO finePerson = new XLDFApplicantDataDTO();

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getApplySequenceId() {
        return applySequenceId;
    }

    public void setApplySequenceId(String applySequenceId) {
        this.applySequenceId = applySequenceId;
    }

    public String getApplySiteId() {
        return applySiteId;
    }

    public void setApplySiteId(String applySiteId) {
        this.applySiteId = applySiteId;
    }

    public String getApplySeq() {
        return applySeq;
    }

    public void setApplySeq(String applySeq) {
        this.applySeq = applySeq;
    }

    public String getApplyCaseNo() {
        return applyCaseNo;
    }

    public void setApplyCaseNo(String applyCaseNo) {
        this.applyCaseNo = applyCaseNo;
    }

    public String getRegistrationsDate() {
        return registrationsDate;
    }

    public void setRegistrationsDate(String registrationsDate) {
        this.registrationsDate = registrationsDate;
    }

    public String getHasTheDate() {
        return hasTheDate;
    }

    public void setHasTheDate(String hasTheDate) {
        this.hasTheDate = hasTheDate;
    }

    public String getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public XLDFApplicantDataDTO getFinePerson() {
        return finePerson;
    }

    public void setFinePerson(XLDFApplicantDataDTO finePerson) {
        this.finePerson = finePerson;
    }

}
