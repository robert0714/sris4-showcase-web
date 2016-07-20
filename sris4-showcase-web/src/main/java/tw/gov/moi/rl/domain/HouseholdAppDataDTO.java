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

import org.apache.commons.lang.StringUtils;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.component.dto.XLDFDomainObject;

/**
 * 戶籍登記作業共通AppDataDTO.
 * 
 * @author Jay Kan
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "householdAppDataDTO", propOrder = { "registerDate", "registerTime", "acceptAdminOfficeCode",
        "enforcedFlag", "registerContent", "acceptRegisterName", "receiptId", "personForeignFlag", "householdHeadFlag",
        "initializationFlag", "enableOtherCertificate", "fineEventDate", "doFineCheckFlag", "deleteFineDTOFlag",
        "previousDoFineCheckFlag", "previousFineEventDate", "fineFreeFlag", "doFineCheckFlagOpen", "fineDTO",
        "saveBtnFlag", "fineBtnFlag", "updateBtnFlag", "needFineFlag", "removeFeeReason", "fineSerialNumber",
        "feeAmount", "applySeq", "applyCaseNo", "transactionId", "operationCode", "applySequenceId", "xldfy0xxmList",
        "fineParameterDTO" })
@XmlRootElement(name = "HouseholdAppDataDTO")
public class HouseholdAppDataDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -7008503832730573363L;

    /** 登記日期. */
    @XmlElement(name = "RegisterDate")
    @FieldName("登記日期")
    private String registerDate;

    /** 登記時間. */
    @XmlElement(name = "RegisterTime")
    @FieldName("登記時間")
    private String registerTime;

    /** 受理地戶所代碼. */
    @XmlElement(name = "AcceptAdminOfficeCode")
    @FieldName("受理地戶所代碼")
    private String acceptAdminOfficeCode;

    /** 逕為登記旗標. */
    @XmlElement(name = "EnforcedFlag")
    @FieldName("逕為登記旗標")
    private String enforcedFlag = RlConstant.NO_CHAR;

    /** 申請書備註. */
    @XmlElement(name = "RegisterContent")
    @FieldName("申請書備註")
    private String registerContent;

    /** 受理地戶籍員姓名. */
    @XmlElement(name = "AcceptRegisterName")
    @FieldName("受理地戶籍員姓名")
    private String acceptRegisterName;

    /** 收據號碼. */
    @XmlElement(name = "ReceiptId")
    @FieldName("收據號碼")
    private String receiptId;

    /** 當事人統號是否為外籍者. */
    @XmlElement(name = "PersonForeignFlag")
    @FieldName("當事人統號是否為外籍者")
    private boolean personForeignFlag = false;

    /** 當事人是否為戶長. */
    @XmlElement(name = "HouseholdHeadFlag")
    @FieldName("當事人是否為戶長")
    private boolean householdHeadFlag = false;

    /**
     * 初始化. <BR>
     * Default: true
     */
    @XmlElement(name = "InitializationFlag")
    @FieldName("初始化")
    private boolean initializationFlag = true;

    /** 其他附繳證件開關. */
    @XmlElement(name = "EnableOtherCertificate")
    @FieldName("其他附繳證件開關")
    private boolean enableOtherCertificate = false;

    /** 事件發生(確定)日期. */
    @XmlElement(name = "FineEventDate", required = true)
    @FieldName("事件發生(確定)日期")
    private String fineEventDate;

    /** 進行逾期申報之罰鍰檢視. */
    @XmlElement(name = "DoFineCheckFlag", required = true)
    @FieldName("進行逾期申報之罰鍰檢視")
    private boolean doFineCheckFlag;

    /** 刪除罰鍰處理資料旗標. */
    @XmlElement(name = "DeleteFineDTOFlag", required = true)
    @FieldName("刪除罰鍰處理資料旗標")
    private boolean deleteFineDTOFlag;

    /** 前一次資料驗證之是否進行逾期申報之罰鍰檢視旗標. */
    @XmlElement(name = "PreviousDoFineCheckFlag", required = true)
    @FieldName("前一次資料驗證之是否進行逾期申報之罰鍰檢視旗標")
    private boolean previousDoFineCheckFlag;

    /** 前一次資料驗證之事件發生(確定)日期. */
    @XmlElement(name = "PreviousFineEventDate", required = true)
    @FieldName("前一次資料驗證之事件發生(確定)日期")
    private String previousFineEventDate;

    /** 免罰旗標. */
    @XmlElement(name = "FineFreeFlag", required = true)
    @FieldName("免罰旗標")
    private boolean fineFreeFlag;

    /** 旗標-進行逾期申報之罰緩檢視. */
    @XmlElement(name = "DoFineCheckFlagOpen", required = true)
    @FieldName("旗標-進行逾期申報之罰緩檢視")
    private boolean doFineCheckFlagOpen;

    /** 罰鍰處理資料. */
    @XmlElement(name = "FineDTO", required = true)
    @FieldName("罰鍰處理資料")
    private FineDTO fineDTO = new FineDTO();

    /** 旗標-暫存按鈕. */
    @XmlElement(name = "SaveBtnFlag", required = true)
    @FieldName("旗標-暫存按鈕")
    private boolean saveBtnFlag;

    /** 旗標-罰緩處理按鈕. */
    @XmlElement(name = "FineBtnFlag", required = true)
    @FieldName("旗標-罰緩處理按鈕")
    private boolean fineBtnFlag;

    /** 旗標-是否更新按鈕狀態. */
    @XmlElement(name = "UpdateBtnFlag", required = true)
    @FieldName("旗標-是否更新按鈕狀態")
    private boolean updateBtnFlag;

    /** 判斷是否罰鍰旗標. */
    @XmlElement(name = "NeedFineFlag", required = true)
    @FieldName("判斷是否罰鍰旗標")
    private String needFineFlag = RlConstant.NO_CHAR;

    /** 免罰原因. */
    @XmlElement(name = "RemoveFeeReason", required = true)
    @FieldName("免罰原因")
    private String removeFeeReason = StringUtils.EMPTY;

    /** 罰鍰裁處書識別序號. */
    @XmlElement(name = "fineSerialNumber")
    @FieldName("罰鍰裁處書識別序號")
    private String fineSerialNumber = StringUtils.EMPTY;

    /** 戶籍罰鍰金額. */
    @XmlElement(name = "feeAmount")
    @FieldName("戶籍罰鍰金額")
    private String feeAmount = StringUtils.EMPTY;

    /** 申請書流水號. */
    @XmlElement(name = "ApplySeq", required = true)
    @FieldName("申請書流水號")
    private String applySeq;

    /** 申登案別. */
    @XmlElement(name = "ApplyCaseNo", required = true)
    @FieldName("申登案別")
    private String applyCaseNo;

    /** 交易序號. */
    @XmlElement(name = "TransactionId", required = true)
    @FieldName("交易序號")
    private String transactionId;

    /** 作業代碼. */
    @XmlElement(name = "OperationCode", required = true)
    @FieldName("作業代碼")
    private String operationCode;

    /** 作業順序編號. */
    @XmlElement(name = "ApplySequenceId", required = true)
    @FieldName("作業順序編號")
    private String applySequenceId;

    /** 個人記事欄位化. */
    @XmlElement(name = "Xldfy0xxmList")
    @FieldName("個人記事欄位化")
    private List<XLDFDomainObject> xldfy0xxmList = new ArrayList<XLDFDomainObject>();

    /** 罰緩參數. */
    @XmlElement(name = "FineParameterDTO")
    @FieldName("罰緩參數")
    private FineParameterDTO fineParameterDTO;

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
    public void setRegisterDate(final String registerDate) {
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
    public void setRegisterTime(final String registerTime) {
        this.registerTime = registerTime;
    }

    /**
     * Gets the accept admin office code.
     * 
     * @return the accept admin office code
     */
    public String getAcceptAdminOfficeCode() {
        return acceptAdminOfficeCode;
    }

    /**
     * Sets the accept admin office code.
     * 
     * @param acceptAdminOfficeCode
     *            the new accept admin office code
     */
    public void setAcceptAdminOfficeCode(final String acceptAdminOfficeCode) {
        this.acceptAdminOfficeCode = acceptAdminOfficeCode;
    }

    /**
     * Gets the enforced flag.
     * 
     * @return the enforced flag
     */
    public String getEnforcedFlag() {
        return enforcedFlag;
    }

    /**
     * Sets the enforced flag.
     * 
     * @param enforcedFlag
     *            the new enforced flag
     */
    public void setEnforcedFlag(final String enforcedFlag) {
        this.enforcedFlag = enforcedFlag;
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
    public void setRegisterContent(final String registerContent) {
        this.registerContent = registerContent;
    }

    /**
     * Gets the accept register name.
     * 
     * @return the accept register name
     */
    public String getAcceptRegisterName() {
        return acceptRegisterName;
    }

    /**
     * Sets the accept register name.
     * 
     * @param acceptRegisterName
     *            the new accept register name
     */
    public void setAcceptRegisterName(final String acceptRegisterName) {
        this.acceptRegisterName = acceptRegisterName;
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
     * Checks if is person foreign flag.
     * 
     * @return true, if is person foreign flag
     */
    public boolean isPersonForeignFlag() {
        return personForeignFlag;
    }

    /**
     * Sets the person foreign flag.
     * 
     * @param personForeignFlag
     *            the new person foreign flag
     */
    public void setPersonForeignFlag(final boolean personForeignFlag) {
        this.personForeignFlag = personForeignFlag;
    }

    /**
     * Checks if is household head flag.
     * 
     * @return true, if is household head flag
     */
    public boolean isHouseholdHeadFlag() {
        return householdHeadFlag;
    }

    /**
     * Sets the household head flag.
     * 
     * @param householdHeadFlag
     *            the new household head flag
     */
    public void setHouseholdHeadFlag(final boolean householdHeadFlag) {
        this.householdHeadFlag = householdHeadFlag;
    }

    /**
     * Checks if is initialization flag.
     * 
     * @return true, if is initialization flag
     */
    public boolean isInitializationFlag() {
        return initializationFlag;
    }

    /**
     * Sets the initialization flag.
     * 
     * @param initializationFlag
     *            the new initialization flag
     */
    public void setInitializationFlag(final boolean initializationFlag) {
        this.initializationFlag = initializationFlag;
    }

    /**
     * Checks if is enable other certificate.
     * 
     * @return true, if is enable other certificate
     */
    public boolean isEnableOtherCertificate() {
        return enableOtherCertificate;
    }

    /**
     * Sets the enable other certificate.
     * 
     * @param enableOtherCertificate
     *            the new enable other certificate
     */
    public void setEnableOtherCertificate(final boolean enableOtherCertificate) {
        this.enableOtherCertificate = enableOtherCertificate;
    }

    /**
     * Gets the fine event date.
     * 
     * @return the fine event date
     */
    public String getFineEventDate() {
        return fineEventDate;
    }

    /**
     * Sets the fine event date.
     * 
     * @param fineEventDate
     *            the new fine event date
     */
    public void setFineEventDate(final String fineEventDate) {
        this.fineEventDate = fineEventDate;
    }

    /**
     * Checks if is do fine check flag.
     * 
     * @return true, if is do fine check flag
     */
    public boolean isDoFineCheckFlag() {
        return doFineCheckFlag;
    }

    /**
     * Sets the do fine check flag.
     * 
     * @param doFineCheckFlag
     *            the new do fine check flag
     */
    public void setDoFineCheckFlag(final boolean doFineCheckFlag) {
        this.doFineCheckFlag = doFineCheckFlag;
    }

    /**
     * Checks if is delete fine dto flag.
     * 
     * @return true, if is delete fine dto flag
     */
    public boolean isDeleteFineDTOFlag() {
        return deleteFineDTOFlag;
    }

    /**
     * Sets the delete fine dto flag.
     * 
     * @param deleteFineDTOFlag
     *            the new delete fine dto flag
     */
    public void setDeleteFineDTOFlag(final boolean deleteFineDTOFlag) {
        this.deleteFineDTOFlag = deleteFineDTOFlag;
    }

    /**
     * Checks if is previous do fine check flag.
     * 
     * @return true, if is previous do fine check flag
     */
    public boolean isPreviousDoFineCheckFlag() {
        return previousDoFineCheckFlag;
    }

    /**
     * Sets the previous do fine check flag.
     * 
     * @param previousDoFineCheckFlag
     *            the new previous do fine check flag
     */
    public void setPreviousDoFineCheckFlag(final boolean previousDoFineCheckFlag) {
        this.previousDoFineCheckFlag = previousDoFineCheckFlag;
    }

    /**
     * Gets the previous fine event date.
     * 
     * @return the previous fine event date
     */
    public String getPreviousFineEventDate() {
        return previousFineEventDate;
    }

    /**
     * Sets the previous fine event date.
     * 
     * @param previousFineEventDate
     *            the new previous fine event date
     */
    public void setPreviousFineEventDate(final String previousFineEventDate) {
        this.previousFineEventDate = previousFineEventDate;
    }

    /**
     * Checks if is fine free flag.
     * 
     * @return true, if is fine free flag
     */
    public boolean isFineFreeFlag() {
        return fineFreeFlag;
    }

    /**
     * Sets the fine free flag.
     * 
     * @param fineFreeFlag
     *            the new fine free flag
     */
    public void setFineFreeFlag(final boolean fineFreeFlag) {
        this.fineFreeFlag = fineFreeFlag;
    }

    /**
     * Checks if is do fine check flag open.
     * 
     * @return true, if is do fine check flag open
     */
    public boolean isDoFineCheckFlagOpen() {
        return doFineCheckFlagOpen;
    }

    /**
     * Sets the do fine check flag open.
     * 
     * @param doFineCheckFlagOpen
     *            the new do fine check flag open
     */
    public void setDoFineCheckFlagOpen(final boolean doFineCheckFlagOpen) {
        this.doFineCheckFlagOpen = doFineCheckFlagOpen;
    }

    /**
     * Gets the fine dto.
     * 
     * @return the fine dto
     */
    public FineDTO getFineDTO() {
        return fineDTO;
    }

    /**
     * Sets the fine dto.
     * 
     * @param fineDTO
     *            the new fine dto
     */
    public void setFineDTO(final FineDTO fineDTO) {
        this.fineDTO = fineDTO;
    }

    /**
     * Checks if is save btn flag.
     * 
     * @return true, if is save btn flag
     */
    public boolean isSaveBtnFlag() {
        return saveBtnFlag;
    }

    /**
     * Sets the save btn flag.
     * 
     * @param saveBtnFlag
     *            the new save btn flag
     */
    public void setSaveBtnFlag(final boolean saveBtnFlag) {
        this.saveBtnFlag = saveBtnFlag;
    }

    /**
     * Checks if is fine btn flag.
     * 
     * @return true, if is fine btn flag
     */
    public boolean isFineBtnFlag() {
        return fineBtnFlag;
    }

    /**
     * Sets the fine btn flag.
     * 
     * @param fineBtnFlag
     *            the new fine btn flag
     */
    public void setFineBtnFlag(final boolean fineBtnFlag) {
        this.fineBtnFlag = fineBtnFlag;
    }

    /**
     * Checks if is update btn flag.
     * 
     * @return true, if is update btn flag
     */
    public boolean isUpdateBtnFlag() {
        return updateBtnFlag;
    }

    /**
     * Sets the update btn flag.
     * 
     * @param updateBtnFlag
     *            the new update btn flag
     */
    public void setUpdateBtnFlag(final boolean updateBtnFlag) {
        this.updateBtnFlag = updateBtnFlag;
    }

    /**
     * Gets the need fine flag.
     * 
     * @return the need fine flag
     */
    public String getNeedFineFlag() {
        return needFineFlag;
    }

    /**
     * Sets the need fine flag.
     * 
     * @param needFineFlag
     *            the new need fine flag
     */
    public void setNeedFineFlag(final String needFineFlag) {
        this.needFineFlag = needFineFlag;
    }

    /**
     * Gets the removes the fee reason.
     * 
     * @return the removes the fee reason
     */
    public String getRemoveFeeReason() {
        return removeFeeReason;
    }

    /**
     * Sets the removes the fee reason.
     * 
     * @param removeFeeReason
     *            the new removes the fee reason
     */
    public void setRemoveFeeReason(final String removeFeeReason) {
        this.removeFeeReason = removeFeeReason;
    }

    /**
     * Gets the fine serial number.
     * 
     * @return the fine serial number
     */
    public String getFineSerialNumber() {
        return fineSerialNumber;
    }

    /**
     * Sets the fine serial number.
     * 
     * @param fineSerialNumber
     *            the new fine serial number
     */
    public void setFineSerialNumber(final String fineSerialNumber) {
        this.fineSerialNumber = fineSerialNumber;
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
    public void setFeeAmount(final String feeAmount) {
        this.feeAmount = feeAmount;
    }

    /**
     * Gets the apply seq.
     * 
     * @return the apply seq
     */
    public String getApplySeq() {
        return applySeq;
    }

    /**
     * Sets the apply seq.
     * 
     * @param applySeq
     *            the new apply seq
     */
    public void setApplySeq(final String applySeq) {
        this.applySeq = applySeq;
    }

    /**
     * Gets the apply case no.
     * 
     * @return the apply case no
     */
    public String getApplyCaseNo() {
        return applyCaseNo;
    }

    /**
     * Sets the apply case no.
     * 
     * @param applyCaseNo
     *            the new apply case no
     */
    public void setApplyCaseNo(final String applyCaseNo) {
        this.applyCaseNo = applyCaseNo;
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
     * Gets the apply sequence id.
     * 
     * @return the apply sequence id
     */
    public String getApplySequenceId() {
        return applySequenceId;
    }

    /**
     * Sets the apply sequence id.
     * 
     * @param applySequenceId
     *            the new apply sequence id
     */
    public void setApplySequenceId(final String applySequenceId) {
        this.applySequenceId = applySequenceId;
    }

    /**
     * Gets the xldfy0xxm list.
     * 
     * @return the xldfy0xxm list
     */
    public List<XLDFDomainObject> getXldfy0xxmList() {
        return xldfy0xxmList;
    }

    /**
     * Sets the xldfy0xxm list.
     * 
     * @param xldfy0xxmList
     *            the new xldfy0xxm list
     */
    public void setXldfy0xxmList(final List<XLDFDomainObject> xldfy0xxmList) {
        this.xldfy0xxmList = xldfy0xxmList;
    }

    /**
     * Gets the fine parameter dto.
     * 
     * @return the fine parameter dto
     */
    public FineParameterDTO getFineParameterDTO() {
        return fineParameterDTO;
    }

    /**
     * Sets the fine parameter dto.
     * 
     * @param fineParameterDTO
     *            the new fine parameter dto
     */
    public void setFineParameterDTO(final FineParameterDTO fineParameterDTO) {
        this.fineParameterDTO = fineParameterDTO;
    }
}
