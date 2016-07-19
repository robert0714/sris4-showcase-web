/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.common.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * 規費傳輸物件.
 * 
 * @author Viva.Hong
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeDTO", propOrder = { "receiptId", "applyId1", "applyName1", "applyId2", "applyName2", "applyCode",
        "personId", "applyTransactionId", "applySequenceId", "sequenceId", "applySiteId", "applySeq", "org",
        "category", "feeCode", "feeItem", "quantity", "unit", "price", "freeFlag", "freeReasonCode", "otherFreeReason",
        "subtotal", "paymentWay", "mannualAddFlag", "operationCode", "applyDate" })
@XmlRootElement(name = "FeeDTO")
public class FeeDTO implements Serializable {

    /** serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 收據號碼. */
    @XmlElement(name = "ReceiptId", required = true)
    @FieldName("收據號碼")
    private String receiptId;

    /** 申請人１國民身分證統一編號. */
    @XmlElement(name = "ApplyId1", required = true)
    @FieldName("申請人１國民身分證統一編號")
    private String applyId1;

    /** 申請人１姓名. */
    @XmlElement(name = "ApplyName1", required = true)
    @FieldName("申請人１姓名")
    private String applyName1;

    /** 申請人２國民身分證統一編號. */
    @XmlElement(name = "ApplyId2", required = true)
    @FieldName("申請人２國民身分證統一編號")
    private String applyId2;

    /** 申請人２姓名. */
    @XmlElement(name = "ApplyName2", required = true)
    @FieldName("申請人２姓名")
    private String applyName2;

    /** 申請書類別. */
    @XmlElement(name = "ApplyCode", required = true)
    @FieldName("申請書類別")
    private String applyCode;

    /** 申請書當事人統號. */
    @XmlElement(name = "PersonId", required = true)
    @FieldName("申請書當事人統號")
    private String personId;

    /** 交易序號. */
    @XmlElement(name = "ApplyTransactionId", required = true)
    @FieldName("交易序號")
    private String applyTransactionId;

    /** 作業順序編號. */
    @XmlElement(name = "ApplySequenceId", required = true)
    @FieldName("作業順序編號")
    private Integer applySequenceId;

    /** 編號作業順序. */
    @XmlElement(name = "sequenceId", required = true)
    @FieldName("編號作業順序")
    private Integer sequenceId;

    /** 資料儲存地作業點代碼. */
    @XmlElement(name = "ApplySiteId", required = true)
    @FieldName("資料儲存地作業點代碼")
    private String applySiteId;

    /** 申請書流水號. */
    @XmlElement(name = "ApplySeq", required = true)
    @FieldName("申請書流水號")
    private Integer applySeq;

    /** 主管機關. */
    @XmlElement(name = "Org", required = true)
    @FieldName("主管機關")
    private String org;

    /** 規費項目類別. */
    @XmlElement(name = "Category", required = true)
    @FieldName("規費項目類別")
    private String category;

    /** 規費代碼. */
    @XmlElement(name = "FeeCode", required = true)
    @FieldName("規費代碼")
    private String feeCode;

    /** 規費項目名稱. */
    @XmlElement(name = "FeeItem", required = true)
    @FieldName("規費項目名稱")
    private String feeItem;

    /** 數量. */
    @XmlElement(name = "Quantity", required = true)
    @FieldName("數量")
    private int quantity;

    /** 單位. */
    @XmlElement(name = "Unit", required = true)
    @FieldName("單位")
    private String unit;

    /** 單價. */
    @XmlElement(name = "Price", required = true)
    @FieldName("單價")
    private int price;

    /** 是否免費. */
    @XmlElement(name = "FreeFlag", required = true)
    @FieldName("是否免費")
    private Boolean freeFlag;

    /** 免收規費原因代碼. */
    @XmlElement(name = "FreeReasonCode", required = true)
    @FieldName("免收規費原因代碼")
    private String freeReasonCode;

    /** 其他免收規費原因. */
    @XmlElement(name = "OtherFreeReason", required = true)
    @FieldName("其他免收規費原因")
    private String otherFreeReason;

    /** 小計. */
    @XmlElement(name = "Subtotal", required = true)
    @FieldName("小計")
    private int subtotal;

    /** 繳費方式. */
    @XmlElement(name = "PaymentWay", required = true)
    @FieldName("繳費方式")
    private String paymentWay;

    /** 是否手動新增. */
    @XmlElement(name = "MannualAddFlag", required = true)
    @FieldName("是否手動新增")
    private String mannualAddFlag;

    /** 作業編號. */
    @XmlElement(name = "OperationCode", required = true)
    @FieldName("作業編號")
    private String operationCode;

    /** 申請日期. */
    @XmlElement(name = "ApplyDate", required = true)
    @FieldName("申請日期")
    private String applyDate;

    /**
     * Instantiates a new fee dto.
     */
    public FeeDTO() {
        super();
    }

    /**
     * Instantiates a new fee dto.
     * 
     * @param receiptId
     *            the receipt id
     * @param applyId1
     *            the apply id1
     * @param applyName1
     *            the apply name1
     * @param applyId2
     *            the apply id2
     * @param applyName2
     *            the apply name2
     * @param applyCode
     *            the apply code
     * @param personId
     *            the person id
     * @param applyTransactionId
     *            the apply transaction id
     * @param applySequenceId
     *            the apply sequence id
     * @param applySiteId
     *            the apply site id
     * @param applySeq
     *            the apply seq
     * @param feeCode
     *            the fee code
     * @param feeItem
     *            the fee item
     * @param quantity
     *            the quantity
     * @param unit
     *            the unit
     * @param price
     *            the price
     * @param freeFlag
     *            the free flag
     * @param freeReasonCode
     *            the free reason code
     * @param otherFreeReason
     *            the other free reason
     * @param subtotal
     *            the subtotal
     */
    public FeeDTO(String receiptId, String applyId1, String applyName1, String applyId2, String applyName2,
            String applyCode, String personId, String applyTransactionId, Integer applySequenceId, String applySiteId,
            Integer applySeq, String feeCode, String feeItem, int quantity, String unit, int price, Boolean freeFlag,
            String freeReasonCode, String otherFreeReason, int subtotal) {
        super();
        this.receiptId = receiptId;
        this.applyId1 = applyId1;
        this.applyName1 = applyName1;
        this.applyId2 = applyId2;
        this.applyName2 = applyName2;
        this.applyCode = applyCode;
        this.personId = personId;
        this.applyTransactionId = applyTransactionId;
        this.applySequenceId = applySequenceId;
        this.applySiteId = applySiteId;
        this.applySeq = applySeq;
        this.feeCode = feeCode;
        this.feeItem = feeItem;
        this.quantity = quantity;
        this.unit = unit;
        this.price = price;
        this.freeFlag = freeFlag;
        this.freeReasonCode = freeReasonCode;
        this.otherFreeReason = otherFreeReason;
        this.subtotal = subtotal;
    }

    /**
     * Gets the receipt id.
     * 
     * @return the receipt id
     */
    public String getReceiptId() {
        return receiptId;
    }

    /**
     * Sets the receipt id.
     * 
     * @param receiptId
     *            the new receipt id
     */
    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }

    /**
     * Gets the apply id1.
     * 
     * @return the apply id1
     */
    public String getApplyId1() {
        return applyId1;
    }

    /**
     * Sets the apply id1.
     * 
     * @param applyId1
     *            the new apply id1
     */
    public void setApplyId1(String applyId1) {
        this.applyId1 = applyId1;
    }

    /**
     * Gets the apply name1.
     * 
     * @return the apply name1
     */
    public String getApplyName1() {
        return applyName1;
    }

    /**
     * Sets the apply name1.
     * 
     * @param applyName1
     *            the new apply name1
     */
    public void setApplyName1(String applyName1) {
        this.applyName1 = applyName1;
    }

    /**
     * Gets the apply id2.
     * 
     * @return the apply id2
     */
    public String getApplyId2() {
        return applyId2;
    }

    /**
     * Sets the apply id2.
     * 
     * @param applyId2
     *            the new apply id2
     */
    public void setApplyId2(String applyId2) {
        this.applyId2 = applyId2;
    }

    /**
     * Gets the apply name2.
     * 
     * @return the apply name2
     */
    public String getApplyName2() {
        return applyName2;
    }

    /**
     * Sets the apply name2.
     * 
     * @param applyName2
     *            the new apply name2
     */
    public void setApplyName2(String applyName2) {
        this.applyName2 = applyName2;
    }

    /**
     * Gets the apply code.
     * 
     * @return the apply code
     */
    public String getApplyCode() {
        return applyCode;
    }

    /**
     * Sets the apply code.
     * 
     * @param applyCode
     *            the new apply code
     */
    public void setApplyCode(String applyCode) {
        this.applyCode = applyCode;
    }

    /**
     * Gets the person id.
     * 
     * @return the person id
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * Sets the person id.
     * 
     * @param personId
     *            the new person id
     */
    public void setPersonId(String personId) {
        this.personId = personId;
    }

    /**
     * Gets the apply transaction id.
     * 
     * @return the apply transaction id
     */
    public String getApplyTransactionId() {
        return applyTransactionId;
    }

    /**
     * Sets the apply transaction id.
     * 
     * @param applyTransactionId
     *            the new apply transaction id
     */
    public void setApplyTransactionId(String applyTransactionId) {
        this.applyTransactionId = applyTransactionId;
    }

    /**
     * Gets the apply sequence id.
     * 
     * @return the apply sequence id
     */
    public Integer getApplySequenceId() {
        return applySequenceId;
    }

    /**
     * Sets the apply sequence id.
     * 
     * @param applySequenceId
     *            the new apply sequence id
     */
    public void setApplySequenceId(Integer applySequenceId) {
        this.applySequenceId = applySequenceId;
    }

    /**
     * Gets the apply site id.
     * 
     * @return the apply site id
     */
    public String getApplySiteId() {
        return applySiteId;
    }

    /**
     * Sets the apply site id.
     * 
     * @param applySiteId
     *            the new apply site id
     */
    public void setApplySiteId(String applySiteId) {
        this.applySiteId = applySiteId;
    }

    /**
     * Gets the apply seq.
     * 
     * @return the apply seq
     */
    public Integer getApplySeq() {
        return applySeq;
    }

    /**
     * Sets the apply seq.
     * 
     * @param applySeq
     *            the new apply seq
     */
    public void setApplySeq(Integer applySeq) {
        this.applySeq = applySeq;
    }

    /**
     * Gets the fee code.
     * 
     * @return the fee code
     */
    public String getFeeCode() {
        return feeCode;
    }

    /**
     * Sets the fee code.
     * 
     * @param feeCode
     *            the new fee code
     */
    public void setFeeCode(String feeCode) {
        this.feeCode = feeCode;
    }

    /**
     * Gets the fee item.
     * 
     * @return the fee item
     */
    public String getFeeItem() {
        return feeItem;
    }

    /**
     * Sets the fee item.
     * 
     * @param feeItem
     *            the new fee item
     */
    public void setFeeItem(String feeItem) {
        this.feeItem = feeItem;
    }

    /**
     * Gets the quantity.
     * 
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Sets the quantity.
     * 
     * @param quantity
     *            the new quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Gets the unit.
     * 
     * @return the unit
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the unit.
     * 
     * @param unit
     *            the new unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * Gets the price.
     * 
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * Sets the price.
     * 
     * @param price
     *            the new price
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * Gets the free flag.
     * 
     * @return the free flag
     */
    public Boolean getFreeFlag() {
        return freeFlag;
    }

    /**
     * Sets the free flag.
     * 
     * @param freeFlag
     *            the new free flag
     */
    public void setFreeFlag(Boolean freeFlag) {
        this.freeFlag = freeFlag;
    }

    /**
     * Gets the free reason code.
     * 
     * @return the free reason code
     */
    public String getFreeReasonCode() {
        return freeReasonCode;
    }

    /**
     * Sets the free reason code.
     * 
     * @param freeReasonCode
     *            the new free reason code
     */
    public void setFreeReasonCode(String freeReasonCode) {
        this.freeReasonCode = freeReasonCode;
    }

    /**
     * Gets the other free reason.
     * 
     * @return the other free reason
     */
    public String getOtherFreeReason() {
        return otherFreeReason;
    }

    /**
     * Sets the other free reason.
     * 
     * @param otherFreeReason
     *            the new other free reason
     */
    public void setOtherFreeReason(String otherFreeReason) {
        this.otherFreeReason = otherFreeReason;
    }

    /**
     * Gets the subtotal.
     * 
     * @return the subtotal
     */
    public int getSubtotal() {
        return subtotal;
    }

    /**
     * Sets the subtotal.
     * 
     * @param subtotal
     *            the subtotal to set
     */
    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    /**
     * Gets the org.
     * 
     * @return the org
     */
    public String getOrg() {
        return org;
    }

    /**
     * Sets the org.
     * 
     * @param org
     *            the new org
     */
    public void setOrg(final String org) {
        this.org = org;
    }

    /**
     * Gets the category.
     * 
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the category.
     * 
     * @param category
     *            the new category
     */
    public void setCategory(final String category) {
        this.category = category;
    }

    /**
     * Gets the payment way.
     * 
     * @return the payment way
     */
    public String getPaymentWay() {
        return paymentWay;
    }

    /**
     * Sets the payment way.
     * 
     * @param paymentWay
     *            the new payment way
     */
    public void setPaymentWay(final String paymentWay) {
        this.paymentWay = paymentWay;
    }

    /**
     * Gets the mannual add flag.
     * 
     * @return the mannual add flag
     */
    public String getMannualAddFlag() {
        return mannualAddFlag;
    }

    /**
     * Sets the mannual add flag.
     * 
     * @param mannualAddFlag
     *            the new mannual add flag
     */
    public void setMannualAddFlag(final String mannualAddFlag) {
        this.mannualAddFlag = mannualAddFlag;
    }

    /**
     * Gets the sequence id.
     * 
     * @return the sequence id
     */
    public Integer getSequenceId() {
        return sequenceId;
    }

    /**
     * Sets the sequence id.
     * 
     * @param sequenceId
     *            the new sequence id
     */
    public void setSequenceId(final Integer sequenceId) {
        this.sequenceId = sequenceId;
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
     * Gets the apply date.
     * 
     * @return the apply date
     */
    public String getApplyDate() {
        return applyDate;
    }

    /**
     * Sets the apply date.
     * 
     * @param applyDate
     *            the new apply date
     */
    public void setApplyDate(final String applyDate) {
        this.applyDate = applyDate;
    }

}
