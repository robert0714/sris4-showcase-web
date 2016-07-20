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
 * The Class Rl0a600DataDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl0a600DataDTO", propOrder = { "total", "quantity", "price", "modifyMode", "receiptPath", "feeCodeKey" })
@XmlRootElement(name = "Rl0a600DataDTO")
public class Rl0a600DataDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 應收金額. */
    @XmlElement(name = "Total")
    @FieldName("應收金額")
    private Integer total = 0;

    /** 數量. */
    @XmlElement(name = "Quantity")
    @FieldName("數量")
    private String quantity;

    /** 金額. */
    @XmlElement(name = "Price")
    @FieldName("金額")
    private String price;

    /** 新增/修改模式. */
    @XmlElement(name = "ModifyMode")
    @FieldName("新增/修改模式")
    private String modifyMode;

    /** 收據PDF路徑. */
    @XmlElement(name = "ReceiptPath")
    @FieldName("收據PDF路徑")
    private String receiptPath;

    /** 規費項目健值. */
    @XmlElement(name = "FeeCodeKey")
    @FieldName("規費項目健值")
    private String feeCodeKey;

    /**
     * Gets the total.
     * 
     * @return the total
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * Sets the total.
     * 
     * @param total
     *            the total to set
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * Gets the modify mode.
     * 
     * @return the modifyMode
     */
    public String getModifyMode() {
        return modifyMode;
    }

    /**
     * Sets the modify mode.
     * 
     * @param modifyMode
     *            the modifyMode to set
     */
    public void setModifyMode(String modifyMode) {
        this.modifyMode = modifyMode;
    }

    /**
     * Gets the receipt path.
     * 
     * @return the receiptPath
     */
    public String getReceiptPath() {
        return receiptPath;
    }

    /**
     * Sets the receipt path.
     * 
     * @param receiptPath
     *            the receiptPath to set
     */
    public void setReceiptPath(String receiptPath) {
        this.receiptPath = receiptPath;
    }

    /**
     * Gets the quantity.
     * 
     * @return the quantity
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * Sets the quantity.
     * 
     * @param quantity
     *            the new quantity
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /**
     * Gets the price.
     * 
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * Sets the price.
     * 
     * @param price
     *            the new price
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * Gets the fee code key.
     * 
     * @return the fee code key
     */
    public String getFeeCodeKey() {
        return feeCodeKey;
    }

    /**
     * Sets the fee code key.
     * 
     * @param feeCodeKey
     *            the new fee code key
     */
    public void setFeeCodeKey(String feeCodeKey) {
        this.feeCodeKey = feeCodeKey;
    }

}
