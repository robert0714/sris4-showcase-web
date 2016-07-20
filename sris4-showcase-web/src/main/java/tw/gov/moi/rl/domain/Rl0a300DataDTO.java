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
 * 規費處理資料.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl0a300DataDTO", propOrder = { "detailNum", "total", "modifyMode", "fromDetailPage", "pdfPath",
        "receiptPath", "registrationReportChangeFlag", "certificateReportChangeFlag", "newReceiptId", "orgReceiptId",
        "cancelNum", "mannualAddNum", "newSerialNumber", "printOption", "quantity", "price", "feeCodeKey" })
@XmlRootElement(name = "Rl0a300DataDTO")
public class Rl0a300DataDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8213491947853567138L;

    /** 規費明細數量. */
    @FieldName("規費明細數量")
    @XmlElement(name = "DetailNum")
    private int detailNum;

    /** 應收金額. */
    @FieldName("應收金額")
    @XmlElement(name = "Total")
    private Integer total;

    /** 新增/修改模式. */
    @FieldName("新增/修改模式")
    @XmlElement(name = "ModifyMode")
    private String modifyMode;

    /** 是否由規費細項展開畫面開啟. */
    @FieldName("是否由規費細項展開畫面開啟")
    @XmlElement(name = "FromDetailPage")
    private Boolean fromDetailPage;

    /** 申請書PDF路徑. */
    @FieldName("申請書PDF路徑")
    @XmlElement(name = "PdfPath")
    private String pdfPath;

    /** 收據PDF路徑. */
    @FieldName("收據PDF路徑")
    @XmlElement(name = "ReceiptPath")
    private String receiptPath;

    /** 戶籍登記申請書修改註記. */
    @FieldName("戶籍登記申請書修改註記")
    @XmlElement(name = "RegistrationReportChangeFlag")
    private Boolean registrationReportChangeFlag;

    /** 書證謄本申請書修改註記. */
    @FieldName("書證謄本申請書修改註記")
    @XmlElement(name = "CertificateReportChangeFlag")
    private Boolean certificateReportChangeFlag;

    /** 作廢數量. */
    @FieldName("作廢數量")
    @XmlElement(name = "CancelNum")
    private Integer cancelNum;

    /** 自行新增數量. */
    @FieldName("自行新增數量")
    @XmlElement(name = "MannualAddNum")
    private Integer mannualAddNum;

    /** 新收據主檔識別序號. */
    @FieldName("新收據主檔識別序號")
    @XmlElement(name = "NewSerialNumber")
    private String newSerialNumber;

    /** 列印選項. */
    @FieldName("列印選項")
    @XmlElement(name = "PrintOption")
    private String printOption;

    /** 數量. */
    @XmlElement(name = "Quantity")
    @FieldName("數量")
    private String quantity;

    /** 金額. */
    @XmlElement(name = "Price")
    @FieldName("金額")
    private String price;

    /** 規費項目健值. */
    @XmlElement(name = "FeeCodeKey")
    @FieldName("規費項目健值")
    private String feeCodeKey;

    /**
     * Gets the detail num.
     * 
     * @return the detail num
     */
    public int getDetailNum() {
        return detailNum;
    }

    /**
     * Sets the detail num.
     * 
     * @param detailNum
     *            the new detail num
     */
    public void setDetailNum(int detailNum) {
        this.detailNum = detailNum;
    }

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
     *            the new total
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * Gets the modify mode.
     * 
     * @return the modify mode
     */
    public String getModifyMode() {
        return modifyMode;
    }

    /**
     * Sets the modify mode.
     * 
     * @param modifyMode
     *            the new modify mode
     */
    public void setModifyMode(String modifyMode) {
        this.modifyMode = modifyMode;
    }

    /**
     * Gets the from detail page.
     * 
     * @return the from detail page
     */
    public Boolean getFromDetailPage() {
        return fromDetailPage;
    }

    /**
     * Sets the from detail page.
     * 
     * @param fromDetailPage
     *            the new from detail page
     */
    public void setFromDetailPage(Boolean fromDetailPage) {
        this.fromDetailPage = fromDetailPage;
    }

    /**
     * Gets the pdf path.
     * 
     * @return the pdf path
     */
    public String getPdfPath() {
        return pdfPath;
    }

    /**
     * Sets the pdf path.
     * 
     * @param pdfPath
     *            the new pdf path
     */
    public void setPdfPath(String pdfPath) {
        this.pdfPath = pdfPath;
    }

    /**
     * Gets the receipt path.
     * 
     * @return the receipt path
     */
    public String getReceiptPath() {
        return receiptPath;
    }

    /**
     * Sets the receipt path.
     * 
     * @param receiptPath
     *            the new receipt path
     */
    public void setReceiptPath(String receiptPath) {
        this.receiptPath = receiptPath;
    }

    /**
     * Gets the registration report change flag.
     * 
     * @return the registration report change flag
     */
    public Boolean getRegistrationReportChangeFlag() {
        return registrationReportChangeFlag;
    }

    /**
     * Sets the registration report change flag.
     * 
     * @param registrationReportChangeFlag
     *            the new registration report change flag
     */
    public void setRegistrationReportChangeFlag(Boolean registrationReportChangeFlag) {
        this.registrationReportChangeFlag = registrationReportChangeFlag;
    }

    /**
     * Gets the certificate report change flag.
     * 
     * @return the certificate report change flag
     */
    public Boolean getCertificateReportChangeFlag() {
        return certificateReportChangeFlag;
    }

    /**
     * Sets the certificate report change flag.
     * 
     * @param certificateReportChangeFlag
     *            the new certificate report change flag
     */
    public void setCertificateReportChangeFlag(Boolean certificateReportChangeFlag) {
        this.certificateReportChangeFlag = certificateReportChangeFlag;
    }

    /**
     * Gets the cancel num.
     * 
     * @return the cancel num
     */
    public Integer getCancelNum() {
        return cancelNum;
    }

    /**
     * Sets the cancel num.
     * 
     * @param cancelNum
     *            the new cancel num
     */
    public void setCancelNum(Integer cancelNum) {
        this.cancelNum = cancelNum;
    }

    /**
     * Gets the mannual add num.
     * 
     * @return the mannual add num
     */
    public Integer getMannualAddNum() {
        return mannualAddNum;
    }

    /**
     * Sets the mannual add num.
     * 
     * @param mannualAddNum
     *            the new mannual add num
     */
    public void setMannualAddNum(Integer mannualAddNum) {
        this.mannualAddNum = mannualAddNum;
    }

    /**
     * Gets the new serial number.
     * 
     * @return the new serial number
     */
    public String getNewSerialNumber() {
        return newSerialNumber;
    }

    /**
     * Sets the new serial number.
     * 
     * @param newSerialNumber
     *            the new new serial number
     */
    public void setNewSerialNumber(String newSerialNumber) {
        this.newSerialNumber = newSerialNumber;
    }

    /**
     * Gets the prints the option.
     * 
     * @return the prints the option
     */
    public String getPrintOption() {
        return printOption;
    }

    /**
     * Sets the prints the option.
     * 
     * @param printOption
     *            the new prints the option
     */
    public void setPrintOption(String printOption) {
        this.printOption = printOption;
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
