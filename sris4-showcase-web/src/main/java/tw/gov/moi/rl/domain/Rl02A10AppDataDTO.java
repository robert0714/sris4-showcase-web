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
 * 申請資料 DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl02A10AppDataDTO", propOrder = { "registerDate", "registerTime", "applyDate", "applyYyymmdd",
        "applyHhmmss", "applyReason", "endYyymmdd", "docuId", "docuNo", "isNophotoFlag", "nophotoReason",
        "nophotoRemark", "lostYyymmdd", "lostYear", "lostMonth", "lostDay", "lostHhmmss", "lostPlace", "sendId",
        "attachment", "otherCertificate", "otherCertificateName", "registerContent", "outliveCaseFlag",
        "acceptRegistrarName", "feeAmount", "freeReasonCode", "otherFreeReason", "receiptId", "pdfUrl",
        "isFreePhotoFlag", "reuseFlag", "renderedDeathSpouse", "recoveryDeathSpouse", "recoveryDeathSpouseName",
        "renderedRecoveryDeathSpouseName", "applyYyymmddBackup", "showOtherCertificateName", "lostYearBackup",
        "lostMonthBackup", "lostDayBackup", "lostPlaceBackup", "feeAmountBackup", "idCardApplyItem", "feeItem",
        "isFree", "feePrice", "otherFreeReasonBackup" })
@XmlRootElement(name = "Rl02A10AppDataDTO")
public class Rl02A10AppDataDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -266478207940635582L;

    /** 登記日期. */
    @XmlElement(name = "RegisterDate")
    @FieldName("登記日期")
    private String registerDate = "";

    /** 登記時間. */
    @XmlElement(name = "RegisterTime")
    @FieldName("登記時間")
    private String registerTime = "";

    /** 申請日期. */
    @XmlElement(name = "ApplyDate")
    @FieldName("申請日期")
    private String applyDate = "";

    /** 受理日期. */
    @XmlElement(name = "ApplyYyymmdd")
    @FieldName("受理日期")
    private String applyYyymmdd = "";

    /** 受理時間. */
    @XmlElement(name = "ApplyHhmmss")
    @FieldName("受理時間")
    private String applyHhmmss = "";

    /** 申請事由. */
    @XmlElement(name = "ApplyReason")
    @FieldName("申請事由")
    private String applyReason = "";

    /** 終止日期. */
    @XmlElement(name = "EndYyymmdd")
    @FieldName("終止日期")
    private String endYyymmdd = "";

    /** 來文字. */
    @XmlElement(name = "DocuId")
    @FieldName("來文字")
    private String docuId = "";

    /** 來文號. */
    @XmlElement(name = "DocuNo")
    @FieldName("來文號")
    private String docuNo = "";

    /** 身分證免列印相片. */
    @XmlElement(name = "IsNophotoFlag")
    @FieldName("身分證免列印相片")
    private String isNophotoFlag = "";

    /** 身分證免列印相片原因. */
    @XmlElement(name = "NophotoReason")
    @FieldName("身分證免列印相片原因")
    private String nophotoReason = "";

    /** 身分證免列印相片原因說明. */
    @XmlElement(name = "NophotoRemark")
    @FieldName("身分證免列印相片原因說明")
    private String nophotoRemark = "";

    /** 身分證遺(滅)失日期. */
    @XmlElement(name = "LostYyymmdd")
    @FieldName("身分證遺(滅)失日期")
    private String lostYyymmdd = "";

    /** 身分證遺(滅)失年. */
    @XmlElement(name = "LostYear")
    @FieldName("身分證遺(滅)失年")
    private String lostYear = "";

    /** 身分證遺(滅)失月. */
    @XmlElement(name = "LostMonth")
    @FieldName("身分證遺(滅)失月")
    private String lostMonth = "";

    /** 身分證遺(滅)失日. */
    @XmlElement(name = "LostDay")
    @FieldName("身分證遺(滅)失日")
    private String lostDay = "";

    /** 身分證遺(滅)失時間. */
    @XmlElement(name = "LostHhmmss")
    @FieldName("身分證遺(滅)失時間")
    private String lostHhmmss = "";

    /** 身分證遺(滅)失地點. */
    @XmlElement(name = "LostPlace")
    @FieldName("身分證遺(滅)失地點")
    private String lostPlace = "";

    /** 送件識別碼. */
    @XmlElement(name = "SendId")
    @FieldName("送件識別碼")
    private String sendId = "";

    /** 附繳證件. */
    @XmlElement(name = "Attachment")
    @FieldName("附繳證件")
    private List<String> attachment = new ArrayList<String>();

    /** 其他附繳證件. */
    @XmlElement(name = "OtherCertificate")
    @FieldName("其他附繳證件")
    private boolean otherCertificate = Boolean.FALSE;

    /** 其他附繳證件名稱. */
    @XmlElement(name = "OtherCertificateName")
    @FieldName("其他附繳證件名稱")
    private String otherCertificateName = "";

    /** 備註. */
    @XmlElement(name = "RegisterContent")
    @FieldName("備註")
    private String registerContent = "";

    /** 非現住人口處理註記. */
    @XmlElement(name = "OutliveCaseFlag")
    @FieldName("非現住人口處理註記")
    private String outliveCaseFlag = "";

    /** 受理地戶籍員姓名. */
    @XmlElement(name = "AcceptRegistrarName")
    @FieldName("受理地戶籍員姓名")
    private String acceptRegistrarName = "";

    /** 規費. */
    @XmlElement(name = "FeeAmount")
    @FieldName("規費")
    private String feeAmount = "0";

    /** 免規費原因. */
    @XmlElement(name = "FreeReasonCode")
    @FieldName("免規費原因")
    private String freeReasonCode = "";

    /** 免規費原因(字串). */
    @XmlElement(name = "OtherFreeReason")
    @FieldName("免規費原因(字串)")
    private String otherFreeReason = "";

    /** 收據號碼. */
    @XmlElement(name = "ReceiptId")
    @FieldName("收據號碼")
    private String receiptId = "";

    /** 申請書路徑. */
    @XmlElement(name = "PdfUrl")
    @FieldName("申請書路徑")
    private String pdfUrl = "";

    /** 免費照相. */
    @XmlElement(name = "IsFreePhotoFlag")
    @FieldName("免費照相")
    private String isFreePhotoFlag = "";

    /** 當事人同意以檔存相片列印. */
    @XmlElement(name = "ReuseFlag")
    @FieldName("當事人同意以檔存相片列印")
    private String reuseFlag = "";

    /** 是否顯示當事人同意回復已歿配偶姓名欄位. */
    @XmlElement(name = "RenderedDeathSpouse")
    @FieldName("是否顯示當事人同意回復已歿配偶姓名欄位")
    private boolean renderedDeathSpouse = Boolean.FALSE;

    /** 當事人同意回復已歿配偶姓名欄位. */
    @XmlElement(name = "RecoveryDeathSpouse")
    @FieldName("當事人同意回復已歿配偶姓名欄位")
    private boolean recoveryDeathSpouse = Boolean.FALSE;

    /** 已歿配偶姓名欄位. */
    @XmlElement(name = "RecoveryDeathSpouseName")
    @FieldName("已歿配偶姓名欄位")
    private String recoveryDeathSpouseName = "";

    /** 是否顯示已歿配偶姓名欄位. */
    @XmlElement(name = "RenderedRecoveryDeathSpouseName")
    @FieldName("是否顯示已歿配偶姓名欄位")
    private boolean renderedRecoveryDeathSpouseName = Boolean.FALSE;

    /** 受理日期備份. */
    @XmlElement(name = "ApplyYyymmddBackup")
    @FieldName("受理日期備份")
    private String applyYyymmddBackup = "";

    /** 顯示其他附送證件欄位. */
    @XmlElement(name = "ShowOtherCertificateName")
    @FieldName("顯示其他附送證件欄位")
    private boolean showOtherCertificateName = Boolean.FALSE;

    /** 身分證遺(滅)失年備份. */
    @XmlElement(name = "LostYearBackup")
    @FieldName("身分證遺(滅)失年備份")
    private String lostYearBackup = "";

    /** 身分證遺(滅)失月備份. */
    @XmlElement(name = "LostMonthBackup")
    @FieldName("身分證遺(滅)失月備份")
    private String lostMonthBackup = "";

    /** 身分證遺(滅)失日備份. */
    @XmlElement(name = "LostDayBackup")
    @FieldName("身分證遺(滅)失日備份")
    private String lostDayBackup = "";

    /** 身分證遺(滅)失地點備份. */
    @XmlElement(name = "LostPlaceBackup")
    @FieldName("身分證遺(滅)失地點備份")
    private String lostPlaceBackup = "";

    /** 規費備份. */
    @XmlElement(name = "FeeAmountBackup")
    @FieldName("規費備份")
    private String feeAmountBackup = "";

    /** 請領項目. */
    @XmlElement(name = "idCardApplyItem")
    @FieldName("請領項目")
    private String idCardApplyItem = "";

    /** 收費項目. */
    @XmlElement(name = "FeeItem")
    @FieldName("收費項目")
    private String feeItem = "";

    /** 是否免費. */
    @XmlElement(name = "IsFree")
    @FieldName("是否免費")
    private String isFree = "";

    /** 單價. */
    @XmlElement(name = "FeePrice")
    @FieldName("單價")
    private Integer feePrice = 0;

    /** 免規費原因(字串)備份. */
    @XmlElement(name = "OtherFreeReasonBackup")
    @FieldName("免規費原因(字串)備份")
    private String otherFreeReasonBackup = "";

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

    /**
     * Gets the register time.
     * 
     * @return the register time
     */
    public String getRegisterTime() {
        return registerTime;
    }

    /**
     * Sets the register time.
     * 
     * @param registerTime
     *            the new register time
     */
    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
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
    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }

    /**
     * Gets the apply yyymmdd.
     * 
     * @return the apply yyymmdd
     */
    public String getApplyYyymmdd() {
        return applyYyymmdd;
    }

    /**
     * Sets the apply yyymmdd.
     * 
     * @param applyYyymmdd
     *            the new apply yyymmdd
     */
    public void setApplyYyymmdd(String applyYyymmdd) {
        this.applyYyymmdd = applyYyymmdd;
    }

    /**
     * Gets the apply hhmmss.
     * 
     * @return the apply hhmmss
     */
    public String getApplyHhmmss() {
        return applyHhmmss;
    }

    /**
     * Sets the apply hhmmss.
     * 
     * @param applyHhmmss
     *            the new apply hhmmss
     */
    public void setApplyHhmmss(String applyHhmmss) {
        this.applyHhmmss = applyHhmmss;
    }

    /**
     * Gets the apply reason.
     * 
     * @return the apply reason
     */
    public String getApplyReason() {
        return applyReason;
    }

    /**
     * Sets the apply reason.
     * 
     * @param applyReason
     *            the new apply reason
     */
    public void setApplyReason(String applyReason) {
        this.applyReason = applyReason;
    }

    /**
     * Gets the end yyymmdd.
     * 
     * @return the end yyymmdd
     */
    public String getEndYyymmdd() {
        return endYyymmdd;
    }

    /**
     * Sets the end yyymmdd.
     * 
     * @param endYyymmdd
     *            the new end yyymmdd
     */
    public void setEndYyymmdd(String endYyymmdd) {
        this.endYyymmdd = endYyymmdd;
    }

    /**
     * Gets the docu id.
     * 
     * @return the docu id
     */
    public String getDocuId() {
        return docuId;
    }

    /**
     * Sets the docu id.
     * 
     * @param docuId
     *            the new docu id
     */
    public void setDocuId(String docuId) {
        this.docuId = docuId;
    }

    /**
     * Gets the docu no.
     * 
     * @return the docu no
     */
    public String getDocuNo() {
        return docuNo;
    }

    /**
     * Sets the docu no.
     * 
     * @param docuNo
     *            the new docu no
     */
    public void setDocuNo(String docuNo) {
        this.docuNo = docuNo;
    }

    /**
     * Gets the checks if is nophoto flag.
     * 
     * @return the checks if is nophoto flag
     */
    public String getIsNophotoFlag() {
        return isNophotoFlag;
    }

    /**
     * Sets the checks if is nophoto flag.
     * 
     * @param isNophotoFlag
     *            the new checks if is nophoto flag
     */
    public void setIsNophotoFlag(String isNophotoFlag) {
        this.isNophotoFlag = isNophotoFlag;
    }

    /**
     * Gets the nophoto reason.
     * 
     * @return the nophoto reason
     */
    public String getNophotoReason() {
        return nophotoReason;
    }

    /**
     * Sets the nophoto reason.
     * 
     * @param nophotoReason
     *            the new nophoto reason
     */
    public void setNophotoReason(String nophotoReason) {
        this.nophotoReason = nophotoReason;
    }

    /**
     * Gets the nophoto remark.
     * 
     * @return the nophoto remark
     */
    public String getNophotoRemark() {
        return nophotoRemark;
    }

    /**
     * Sets the nophoto remark.
     * 
     * @param nophotoRemark
     *            the new nophoto remark
     */
    public void setNophotoRemark(String nophotoRemark) {
        this.nophotoRemark = nophotoRemark;
    }

    /**
     * Gets the lost yyymmdd.
     * 
     * @return the lost yyymmdd
     */
    public String getLostYyymmdd() {
        return lostYyymmdd;
    }

    /**
     * Sets the lost yyymmdd.
     * 
     * @param lostYyymmdd
     *            the new lost yyymmdd
     */
    public void setLostYyymmdd(String lostYyymmdd) {
        this.lostYyymmdd = lostYyymmdd;
    }

    /**
     * Gets the lost year.
     * 
     * @return the lost year
     */
    public String getLostYear() {
        return lostYear;
    }

    /**
     * Sets the lost year.
     * 
     * @param lostYear
     *            the new lost year
     */
    public void setLostYear(String lostYear) {
        this.lostYear = lostYear;
    }

    /**
     * Gets the lost month.
     * 
     * @return the lost month
     */
    public String getLostMonth() {
        return lostMonth;
    }

    /**
     * Sets the lost month.
     * 
     * @param lostMonth
     *            the new lost month
     */
    public void setLostMonth(String lostMonth) {
        this.lostMonth = lostMonth;
    }

    /**
     * Gets the lost day.
     * 
     * @return the lost day
     */
    public String getLostDay() {
        return lostDay;
    }

    /**
     * Sets the lost day.
     * 
     * @param lostDay
     *            the new lost day
     */
    public void setLostDay(String lostDay) {
        this.lostDay = lostDay;
    }

    /**
     * Gets the lost hhmmss.
     * 
     * @return the lost hhmmss
     */
    public String getLostHhmmss() {
        return lostHhmmss;
    }

    /**
     * Sets the lost hhmmss.
     * 
     * @param lostHhmmss
     *            the new lost hhmmss
     */
    public void setLostHhmmss(String lostHhmmss) {
        this.lostHhmmss = lostHhmmss;
    }

    /**
     * Gets the lost place.
     * 
     * @return the lost place
     */
    public String getLostPlace() {
        return lostPlace;
    }

    /**
     * Sets the lost place.
     * 
     * @param lostPlace
     *            the new lost place
     */
    public void setLostPlace(String lostPlace) {
        this.lostPlace = lostPlace;
    }

    /**
     * Gets the send id.
     * 
     * @return the send id
     */
    public String getSendId() {
        return sendId;
    }

    /**
     * Sets the send id.
     * 
     * @param sendId
     *            the new send id
     */
    public void setSendId(String sendId) {
        this.sendId = sendId;
    }

    /**
     * Gets the attachment.
     * 
     * @return the attachment
     */
    public List<String> getAttachment() {
        return attachment;
    }

    /**
     * Sets the attachment.
     * 
     * @param attachment
     *            the new attachment
     */
    public void setAttachment(List<String> attachment) {
        this.attachment = attachment;
    }

    /**
     * Gets the other certificate name.
     * 
     * @return the other certificate name
     */
    public String getOtherCertificateName() {
        return otherCertificateName;
    }

    /**
     * Sets the other certificate name.
     * 
     * @param otherCertificateName
     *            the new other certificate name
     */
    public void setOtherCertificateName(String otherCertificateName) {
        this.otherCertificateName = otherCertificateName;
    }

    /**
     * Gets the register content.
     * 
     * @return the register content
     */
    public String getRegisterContent() {
        return registerContent;
    }

    /**
     * Sets the register content.
     * 
     * @param registerContent
     *            the new register content
     */
    public void setRegisterContent(String registerContent) {
        this.registerContent = registerContent;
    }

    /**
     * Gets the outlive case flag.
     * 
     * @return the outlive case flag
     */
    public String getOutliveCaseFlag() {
        return outliveCaseFlag;
    }

    /**
     * Sets the outlive case flag.
     * 
     * @param outliveCaseFlag
     *            the new outlive case flag
     */
    public void setOutliveCaseFlag(String outliveCaseFlag) {
        this.outliveCaseFlag = outliveCaseFlag;
    }

    /**
     * Gets the accept registrar name.
     * 
     * @return the accept registrar name
     */
    public String getAcceptRegistrarName() {
        return acceptRegistrarName;
    }

    /**
     * Sets the accept registrar name.
     * 
     * @param acceptRegistrarName
     *            the new accept registrar name
     */
    public void setAcceptRegistrarName(String acceptRegistrarName) {
        this.acceptRegistrarName = acceptRegistrarName;
    }

    /**
     * Gets the fee amount.
     * 
     * @return the fee amount
     */
    public String getFeeAmount() {
        return feeAmount;
    }

    /**
     * Sets the fee amount.
     * 
     * @param feeAmount
     *            the new fee amount
     */
    public void setFeeAmount(String feeAmount) {
        this.feeAmount = feeAmount;
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
     * Gets the pdf url.
     * 
     * @return the pdf url
     */
    public String getPdfUrl() {
        return pdfUrl;
    }

    /**
     * Sets the pdf url.
     * 
     * @param pdfUrl
     *            the new pdf url
     */
    public void setPdfUrl(String pdfUrl) {
        this.pdfUrl = pdfUrl;
    }

    /**
     * Gets the checks if is free photo flag.
     * 
     * @return the checks if is free photo flag
     */
    public String getIsFreePhotoFlag() {
        return isFreePhotoFlag;
    }

    /**
     * Sets the checks if is free photo flag.
     * 
     * @param isFreePhotoFlag
     *            the new checks if is free photo flag
     */
    public void setIsFreePhotoFlag(String isFreePhotoFlag) {
        this.isFreePhotoFlag = isFreePhotoFlag;
    }

    /**
     * Checks if is rendered death spouse.
     * 
     * @return true, if is rendered death spouse
     */
    public boolean isRenderedDeathSpouse() {
        return renderedDeathSpouse;
    }

    /**
     * Sets the rendered death spouse.
     * 
     * @param renderedDeathSpouse
     *            the new rendered death spouse
     */
    public void setRenderedDeathSpouse(boolean renderedDeathSpouse) {
        this.renderedDeathSpouse = renderedDeathSpouse;
    }

    /**
     * Checks if is recovery death spouse.
     * 
     * @return true, if is recovery death spouse
     */
    public boolean isRecoveryDeathSpouse() {
        return recoveryDeathSpouse;
    }

    /**
     * Sets the recovery death spouse.
     * 
     * @param recoveryDeathSpouse
     *            the new recovery death spouse
     */
    public void setRecoveryDeathSpouse(boolean recoveryDeathSpouse) {
        this.recoveryDeathSpouse = recoveryDeathSpouse;
    }

    /**
     * Gets the recovery death spouse name.
     * 
     * @return the recovery death spouse name
     */
    public String getRecoveryDeathSpouseName() {
        return recoveryDeathSpouseName;
    }

    /**
     * Sets the recovery death spouse name.
     * 
     * @param recoveryDeathSpouseName
     *            the new recovery death spouse name
     */
    public void setRecoveryDeathSpouseName(String recoveryDeathSpouseName) {
        this.recoveryDeathSpouseName = recoveryDeathSpouseName;
    }

    /**
     * Checks if is rendered recovery death spouse name.
     * 
     * @return true, if is rendered recovery death spouse name
     */
    public boolean isRenderedRecoveryDeathSpouseName() {
        return renderedRecoveryDeathSpouseName;
    }

    /**
     * Sets the rendered recovery death spouse name.
     * 
     * @param renderedRecoveryDeathSpouseName
     *            the new rendered recovery death spouse name
     */
    public void setRenderedRecoveryDeathSpouseName(boolean renderedRecoveryDeathSpouseName) {
        this.renderedRecoveryDeathSpouseName = renderedRecoveryDeathSpouseName;
    }

    /**
     * Checks if is other certificate.
     * 
     * @return true, if is other certificate
     */
    public boolean isOtherCertificate() {
        return otherCertificate;
    }

    /**
     * Sets the other certificate.
     * 
     * @param otherCertificate
     *            the new other certificate
     */
    public void setOtherCertificate(boolean otherCertificate) {
        this.otherCertificate = otherCertificate;
    }

    /**
     * Gets the apply yyymmdd backup.
     * 
     * @return the apply yyymmdd backup
     */
    public String getApplyYyymmddBackup() {
        return applyYyymmddBackup;
    }

    /**
     * Sets the apply yyymmdd backup.
     * 
     * @param applyYyymmddBackup
     *            the new apply yyymmdd backup
     */
    public void setApplyYyymmddBackup(String applyYyymmddBackup) {
        this.applyYyymmddBackup = applyYyymmddBackup;
    }

    /**
     * Checks if is show other certificate name.
     * 
     * @return true, if is show other certificate name
     */
    public boolean isShowOtherCertificateName() {
        return showOtherCertificateName;
    }

    /**
     * Sets the show other certificate name.
     * 
     * @param showOtherCertificateName
     *            the new show other certificate name
     */
    public void setShowOtherCertificateName(boolean showOtherCertificateName) {
        this.showOtherCertificateName = showOtherCertificateName;
    }

    /**
     * Gets the reuse flag.
     * 
     * @return the reuse flag
     */
    public String getReuseFlag() {
        return reuseFlag;
    }

    /**
     * Sets the reuse flag.
     * 
     * @param reuseFlag
     *            the new reuse flag
     */
    public void setReuseFlag(String reuseFlag) {
        this.reuseFlag = reuseFlag;
    }

    public String getLostYearBackup() {
        return lostYearBackup;
    }

    public void setLostYearBackup(String lostYearBackup) {
        this.lostYearBackup = lostYearBackup;
    }

    public String getLostMonthBackup() {
        return lostMonthBackup;
    }

    public void setLostMonthBackup(String lostMonthBackup) {
        this.lostMonthBackup = lostMonthBackup;
    }

    public String getLostDayBackup() {
        return lostDayBackup;
    }

    public void setLostDayBackup(String lostDayBackup) {
        this.lostDayBackup = lostDayBackup;
    }

    public String getLostPlaceBackup() {
        return lostPlaceBackup;
    }

    public void setLostPlaceBackup(String lostPlaceBackup) {
        this.lostPlaceBackup = lostPlaceBackup;
    }

    public String getFeeAmountBackup() {
        return feeAmountBackup;
    }

    public void setFeeAmountBackup(String feeAmountBackup) {
        this.feeAmountBackup = feeAmountBackup;
    }

    public String getIdCardApplyItem() {
        return idCardApplyItem;
    }

    public void setIdCardApplyItem(String idCardApplyItem) {
        this.idCardApplyItem = idCardApplyItem;
    }

    public String getFeeItem() {
        return feeItem;
    }

    public void setFeeItem(String feeItem) {
        this.feeItem = feeItem;
    }

    public String getIsFree() {
        return isFree;
    }

    public void setIsFree(String isFree) {
        this.isFree = isFree;
    }

    public Integer getFeePrice() {
        return feePrice;
    }

    public void setFeePrice(Integer feePrice) {
        this.feePrice = feePrice;
    }

    public String getOtherFreeReasonBackup() {
        return otherFreeReasonBackup;
    }

    public void setOtherFreeReasonBackup(String otherFreeReasonBackup) {
        this.otherFreeReasonBackup = otherFreeReasonBackup;
    }

}
