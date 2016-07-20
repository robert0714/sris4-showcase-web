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

/**
 * 戶號變更登記AppDataDTO.
 * 
 * @author Jay Kan
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0172oAppDataDTO", propOrder = { "registerDate", "registerTime", "acceptAdminOfficeCode",
        "beforeHouseholdId", "afterHouseholdId", "updateYyymmdd", "updateReasonCode", "otherUpdateReason",
        "otherCertificate", "certificateList", "enforcedFlag", "registerContent", "acceptRegisterName", "receiptId",
        "personForeignFlag", "householdHeadFlag", "fineEventDate", "doFineCheckFlag", "deleteFineDTOFlag",
        "previousDoFineCheckFlag", "previousFineEventDate", "fineFreeFlag", "doFineCheckFlagOpen", "fineDTO",
        "saveBtnFlag", "fineBtnFlag", "updateBtnFlag", "needFineFlag", "removeFeeReason", "fineSerialNumber",
        "feeAmount", "applySeq", "applyCaseNo", "transactionId", "operationCode", "applySequenceId",
        "householdIdAssignType" })
@XmlRootElement(name = "Rl0172oAppDataDTO")
public class Rl0172oAppDataDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -329528746314699996L;

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

    /** 原戶號. */
    @XmlElement(name = "BeforeHouseholdId")
    @FieldName("原戶號")
    private String beforeHouseholdId;

    /** 變更戶號. */
    @XmlElement(name = "AfterHouseholdId")
    @FieldName("變更戶號")
    private String afterHouseholdId;

    /** 變更日期. */
    @XmlElement(name = "UpdateYyymmdd")
    @FieldName("變更日期")
    private String updateYyymmdd;

    /** 變更原因代碼. */
    @XmlElement(name = "UpdateReasonCode")
    @FieldName("變更原因代碼")
    private String updateReasonCode = "01";

    /** 其他變更原因. */
    @XmlElement(name = "OtherUpdateReason")
    @FieldName("其他變更原因")
    private String otherUpdateReason;

    /** 其他附繳證件. */
    @XmlElement(name = "OtherCertificate")
    @FieldName("其他附繳證件")
    private String otherCertificate;

    /** 附繳證件清單. */
    @XmlElement(name = "CertificateList")
    @FieldName("附繳證件清單")
    private List<String> certificateList = new ArrayList<String>();

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

    /** 當事人是否為戶長旗標. */
    @XmlElement(name = "HouseholdHeadFlag")
    @FieldName("當事人是否為戶長旗標")
    private boolean householdHeadFlag = false;

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

    /** 戶號配賦方式. */
    @XmlElement(name = "HouseholdIdAssignType", required = true)
    @FieldName("戶號配賦方式")
    private String householdIdAssignType = "1";

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
     * Gets the before household id.
     * 
     * @return the before household id
     */
    public String getBeforeHouseholdId() {
        return beforeHouseholdId;
    }

    /**
     * Sets the before household id.
     * 
     * @param beforeHouseholdId
     *            the new before household id
     */
    public void setBeforeHouseholdId(final String beforeHouseholdId) {
        this.beforeHouseholdId = beforeHouseholdId;
    }

    /**
     * Gets the after household id.
     * 
     * @return the after household id
     */
    public String getAfterHouseholdId() {
        return afterHouseholdId;
    }

    /**
     * Sets the after household id.
     * 
     * @param afterHouseholdId
     *            the new after household id
     */
    public void setAfterHouseholdId(final String afterHouseholdId) {
        this.afterHouseholdId = afterHouseholdId;
    }

    /**
     * Gets the update yyymmdd.
     * 
     * @return the update yyymmdd
     */
    public String getUpdateYyymmdd() {
        return updateYyymmdd;
    }

    /**
     * Sets the update yyymmdd.
     * 
     * @param updateYyymmdd
     *            the new update yyymmdd
     */
    public void setUpdateYyymmdd(final String updateYyymmdd) {
        this.updateYyymmdd = updateYyymmdd;
    }

    /**
     * Gets the update reason code.
     * 
     * @return the update reason code
     */
    public String getUpdateReasonCode() {
        return updateReasonCode;
    }

    /**
     * Sets the update reason code.
     * 
     * @param updateReasonCode
     *            the new update reason code
     */
    public void setUpdateReasonCode(final String updateReasonCode) {
        this.updateReasonCode = updateReasonCode;
    }

    /**
     * Gets the other update reason.
     * 
     * @return the other update reason
     */
    public String getOtherUpdateReason() {
        return otherUpdateReason;
    }

    /**
     * Sets the other update reason.
     * 
     * @param otherUpdateReason
     *            the new other update reason
     */
    public void setOtherUpdateReason(final String otherUpdateReason) {
        this.otherUpdateReason = otherUpdateReason;
    }

    /**
     * Gets the other certificate.
     * 
     * @return the other certificate
     */
    public String getOtherCertificate() {
        return otherCertificate;
    }

    /**
     * Sets the other certificate.
     * 
     * @param otherCertificate
     *            the new other certificate
     */
    public void setOtherCertificate(final String otherCertificate) {
        this.otherCertificate = otherCertificate;
    }

    /**
     * Gets the certificate list.
     * 
     * @return the certificate list
     */
    public List<String> getCertificateList() {
        return certificateList;
    }

    /**
     * Sets the certificate list.
     * 
     * @param certificateList
     *            the new certificate list
     */
    public void setCertificateList(final List<String> certificateList) {
        this.certificateList = certificateList;
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
    public void setFineDTO(FineDTO fineDTO) {
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
     * Gets the household id assign type.
     * 
     * @return the household id assign type
     */
    public String getHouseholdIdAssignType() {
        return householdIdAssignType;
    }

    /**
     * Sets the household id assign type.
     * 
     * @param householdIdAssignType
     *            the new household id assign type
     */
    public void setHouseholdIdAssignType(final String householdIdAssignType) {
        this.householdIdAssignType = householdIdAssignType;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((afterHouseholdId == null) ? 0 : afterHouseholdId.hashCode());
        result = prime * result + ((certificateList == null) ? 0 : certificateList.hashCode());
        result = prime * result + ((otherCertificate == null) ? 0 : otherCertificate.hashCode());
        result = prime * result + ((otherUpdateReason == null) ? 0 : otherUpdateReason.hashCode());
        result = prime * result + ((updateReasonCode == null) ? 0 : updateReasonCode.hashCode());
        result = prime * result + ((updateYyymmdd == null) ? 0 : updateYyymmdd.hashCode());
        result = prime * result + ((householdIdAssignType == null) ? 0 : householdIdAssignType.hashCode());
        return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Rl0172oAppDataDTO other = (Rl0172oAppDataDTO) obj;
        if (afterHouseholdId == null) {
            if (other.afterHouseholdId != null)
                return false;
        } else if (!afterHouseholdId.equals(other.afterHouseholdId))
            return false;
        if (certificateList == null) {
            if (other.certificateList != null)
                return false;
        } else if (!certificateList.equals(other.certificateList))
            return false;
        if (otherCertificate == null) {
            if (other.otherCertificate != null)
                return false;
        } else if (!otherCertificate.equals(other.otherCertificate))
            return false;
        if (otherUpdateReason == null) {
            if (other.otherUpdateReason != null)
                return false;
        } else if (!otherUpdateReason.equals(other.otherUpdateReason))
            return false;
        if (updateReasonCode == null) {
            if (other.updateReasonCode != null)
                return false;
        } else if (!updateReasonCode.equals(other.updateReasonCode))
            return false;
        if (updateYyymmdd == null) {
            if (other.updateYyymmdd != null)
                return false;
        } else if (!updateYyymmdd.equals(other.updateYyymmdd))
            return false;
        if (householdIdAssignType == null) {
            if (other.householdIdAssignType != null)
                return false;
        } else if (!householdIdAssignType.equals(other.householdIdAssignType))
            return false;
        return true;
    }
}
