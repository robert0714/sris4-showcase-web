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
import tw.gov.moi.domain.Rldfu001Type;
import tw.gov.moi.domain.Rldfu002Type;
import tw.gov.moi.domain.Rldfu003Type;

/**
 * 新增規費收據 DTO.
 * 
 * @author 劉嘉煒
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl0a600DTO", propOrder = { "transactionId", "acceptSiteId", "userId", "initTime", "rldfu002Type",
        "rldfu003Type", "tmpRldfu002", "feeDetaiList", "rl0a600DataDTO", "feeItemList", "serialNumber", "receiptId",
        "paymentWay", "apply", "apply1SiteId", "apply2SiteId" })
@XmlRootElement(name = "Rl0a600DTO")
public class Rl0a600DTO implements Serializable {

    /** serialVersion UID. */
    private static final long serialVersionUID = 1L;

    /** 交易序號. */
    @XmlElement(name = "TransactionId", required = true)
    @FieldName("交易序號")
    private String transactionId;

    /** 受理地作業點代碼. */
    @XmlElement(name = "AcceptSiteId", required = true)
    @FieldName("受理地作業點代碼")
    private String acceptSiteId;

    /** 使用者帳號. */
    @XmlElement(name = "UserId", required = true)
    @FieldName("使用者帳號")
    private String userId;

    /** 初始化時間. */
    @XmlElement(name = "InitTime", required = true)
    @FieldName("初始化時間")
    private String initTime;

    /** 規費主檔. */
    @XmlElement(name = "Rldfu002Type", required = true)
    @FieldName("規費主檔")
    private Rldfu002Type rldfu002Type;

    /** 規費明細. */
    @XmlElement(name = "Rldfu003Type", required = true)
    @FieldName("規費明細")
    private Rldfu003Type rldfu003Type;

    /** 新增收據號碼所產生的規費主檔. */
    @XmlElement(name = "TmpRldfu002", required = true)
    @FieldName("新增收據號碼所產生的規費主檔")
    private Rldfu002Type tmpRldfu002;

    /** 規費明細清單. */
    @XmlElement(name = "FeeDetaiList", required = true)
    @FieldName("規費明細清單")
    private List<Rldfu003Type> feeDetaiList;

    /** The rl0a600 data dto. */
    @XmlElement(name = "Rl0a600DataDTO", required = true)
    @FieldName("Rl0a600DataDTO")
    private Rl0a600DataDTO rl0a600DataDTO;

    /** The fee item list. */
    @XmlElement(name = "FeeItemList", required = true)
    @FieldName("規費項目清單")
    private List<Rldfu001Type> feeItemList;

    /** 識別序號. */
    @XmlElement(name = "SerialNumber", required = true)
    @FieldName("識別序號")
    private String serialNumber;

    /** 收據號碼. */
    @XmlElement(name = "ReceiptId", required = true)
    @FieldName("收據號碼")
    private String receiptId;

    /** 繳費方式. */
    @XmlElement(name = "PaymentWay", required = true)
    @FieldName("繳費方式")
    private String paymentWay;

    /** 申請人1、申請人2. */
    @XmlElement(name = "Apply", required = true)
    @FieldName("申請人1、申請人2")
    private String apply;

    /** 申請人1作業點. */
    @XmlElement(name = "Apply1SiteId", required = true)
    @FieldName("申請人1、申請人2")
    private String apply1SiteId;

    /** 申請人2作業點. */
    @XmlElement(name = "Apply2SiteId", required = true)
    @FieldName("申請人1、申請人2")
    private String apply2SiteId;

    /**
     * Gets the rldfu002 type.
     * 
     * @return the rldfu002Type
     */
    public Rldfu002Type getRldfu002Type() {
        if (this.rldfu002Type == null) {
            this.rldfu002Type = new Rldfu002Type();
        }
        return rldfu002Type;
    }

    /**
     * Sets the rldfu002 type.
     * 
     * @param rldfu002Type
     *            the rldfu002Type to set
     */
    public void setRldfu002Type(Rldfu002Type rldfu002Type) {
        this.rldfu002Type = rldfu002Type;
    }

    /**
     * Gets the rldfu003 type.
     * 
     * @return the rldfu003Type
     */
    public Rldfu003Type getRldfu003Type() {
        if (this.rldfu003Type == null) {
            this.rldfu003Type = new Rldfu003Type();
        }
        return rldfu003Type;
    }

    /**
     * Sets the rldfu003 type.
     * 
     * @param rldfu003Type
     *            the rldfu003Type to set
     */
    public void setRldfu003Type(Rldfu003Type rldfu003Type) {
        this.rldfu003Type = rldfu003Type;
    }

    /**
     * Gets the fee detai list.
     * 
     * @return the feeDetaiList
     */
    public List<Rldfu003Type> getFeeDetaiList() {
        if (this.feeDetaiList == null) {
            this.feeDetaiList = new ArrayList<Rldfu003Type>();
        }
        return feeDetaiList;
    }

    /**
     * Sets the fee detai list.
     * 
     * @param feeDetaiList
     *            the feeDetaiList to set
     */
    public void setFeeDetaiList(List<Rldfu003Type> feeDetaiList) {
        this.feeDetaiList = feeDetaiList;
    }

    /**
     * Gets the rl0a600 data dto.
     * 
     * @return the rl0a600DataDTO
     */
    public Rl0a600DataDTO getRl0a600DataDTO() {
        if (this.rl0a600DataDTO == null) {
            this.rl0a600DataDTO = new Rl0a600DataDTO();
        }
        return rl0a600DataDTO;
    }

    /**
     * Sets the rl0a600 data dto.
     * 
     * @param rl0a600DataDTO
     *            the rl0a600DataDTO to set
     */
    public void setRl0a600DataDTO(Rl0a600DataDTO rl0a600DataDTO) {
        this.rl0a600DataDTO = rl0a600DataDTO;
    }

    /**
     * Gets the fee item list.
     * 
     * @return the fee item list
     */
    public List<Rldfu001Type> getFeeItemList() {
        return feeItemList;
    }

    /**
     * Sets the fee item list.
     * 
     * @param feeItemList
     *            the new fee item list
     */
    public void setFeeItemList(List<Rldfu001Type> feeItemList) {
        this.feeItemList = feeItemList;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Rl0a600DTO [rldfu002Type=" + rldfu002Type + ", rldfu003Type=" + rldfu003Type + ", feeDetaiList="
                + feeDetaiList + ", rl0a600DataDTO=" + rl0a600DataDTO + "]";
    }

    /**
     * Gets the transaction id.
     * 
     * @return the transaction id
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the transaction id.
     * 
     * @param transactionId
     *            the new transaction id
     */
    public void setTransactionId(final String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * Gets the accept site id.
     * 
     * @return the accept site id
     */
    public String getAcceptSiteId() {
        return acceptSiteId;
    }

    /**
     * Sets the accept site id.
     * 
     * @param acceptSiteId
     *            the new accept site id
     */
    public void setAcceptSiteId(final String acceptSiteId) {
        this.acceptSiteId = acceptSiteId;
    }

    /**
     * Gets the user id.
     * 
     * @return the user id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the user id.
     * 
     * @param userId
     *            the new user id
     */
    public void setUserId(final String userId) {
        this.userId = userId;
    }

    /**
     * Gets the inits the time.
     * 
     * @return the inits the time
     */
    public String getInitTime() {
        return initTime;
    }

    /**
     * Sets the inits the time.
     * 
     * @param initTime
     *            the new inits the time
     */
    public void setInitTime(final String initTime) {
        this.initTime = initTime;
    }

    /**
     * Gets the serial number.
     * 
     * @return the serial number
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the serial number.
     * 
     * @param serialNumber
     *            the new serial number
     */
    public void setSerialNumber(final String serialNumber) {
        this.serialNumber = serialNumber;
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
    public void setReceiptId(final String receiptId) {
        this.receiptId = receiptId;
    }

    /**
     * Gets the apply.
     * 
     * @return the apply
     */
    public String getApply() {
        return apply;
    }

    /**
     * Sets the apply.
     * 
     * @param apply
     *            the new apply
     */
    public void setApply(final String apply) {
        this.apply = apply;
    }

    /**
     * Gets the apply1 site id.
     * 
     * @return the apply1 site id
     */
    public String getApply1SiteId() {
        return apply1SiteId;
    }

    /**
     * Sets the apply1 site id.
     * 
     * @param apply1SiteId
     *            the new apply1 site id
     */
    public void setApply1SiteId(final String apply1SiteId) {
        this.apply1SiteId = apply1SiteId;
    }

    /**
     * Gets the apply2 site id.
     * 
     * @return the apply2 site id
     */
    public String getApply2SiteId() {
        return apply2SiteId;
    }

    /**
     * Sets the apply2 site id.
     * 
     * @param apply2SiteId
     *            the new apply2 site id
     */
    public void setApply2SiteId(final String apply2SiteId) {
        this.apply2SiteId = apply2SiteId;
    }

    public Rldfu002Type getTmpRldfu002() {
        return tmpRldfu002;
    }

    public void setTmpRldfu002(final Rldfu002Type tmpRldfu002) {
        this.tmpRldfu002 = tmpRldfu002;
    }

}
