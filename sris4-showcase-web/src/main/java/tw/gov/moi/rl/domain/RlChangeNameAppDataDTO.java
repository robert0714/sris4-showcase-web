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
import tw.gov.moi.rl.domain.xldf.XLDFPersonDataDomainObject;
import tw.gov.moi.rl.domain.xldf.XLDFPersonNoteDomainObject;

/**
 * The Class RlChangeNameAppDataDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlChangeNameAppDataDTO", propOrder = { "xldfPersonData", "xldfForeignPersonDTO", "personNoteList",
        "registerContent", "personForeignFlag", "householdHeadFlag", "enableOtherCertificate", "fineEventDate",
        "doFineCheckFlag", "deleteFineDTOFlag", "previousDoFineCheckFlag", "previousFineEventDate", "fineFreeFlag",
        "doFineCheckFlagOpen", "fineDTO", "saveBtnFlag", "fineBtnFlag", "updateBtnFlag", "needFineFlag",
        "removeFeeReason", "fineSerialNumber", "feeAmount", "applySeq", "applyCaseNo", "transactionId",
        "operationCode", "applySequenceId", "xldfy0xxmList", "fineParameterDTO", "beforeParentName",
        "beforeParentLastName", "beforeParentFirstName", "afterParentName", "afterParentLastName",
        "afterParentFirstName", "updateYyymmdd", "quoteLowCode", "updateReasonCode", "otherUpdateReason",
        "otherCertificate", "certificateList", "colorStyle", "receiptId", "save" })
@XmlRootElement(name = "RlChangeNameAppDataDTO")
public class RlChangeNameAppDataDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -8714704786197072318L;

    /** 當事人資料. */
    @XmlElement(name = "XldfPersonData")
    @FieldName("當事人資料")
    private XLDFPersonDataDomainObject xldfPersonData;

    /** 當事人外籍者資料. */
    @XmlElement(name = "XldfForeignPersonDTO")
    @FieldName("當事人外籍者資料")
    private XLDFForeignPersonDTO xldfForeignPersonDTO;

    /** 個人記事清單. */
    @XmlElement(name = "PersonNoteList")
    @FieldName("個人記事清單")
    private List<XLDFPersonNoteDomainObject> personNoteList = new ArrayList<XLDFPersonNoteDomainObject>();

    /** 申請書備註. */
    @XmlElement(name = "RegisterContent")
    @FieldName("申請書備註")
    private String registerContent;

    /** 當事人統號是否為外籍者. */
    @XmlElement(name = "PersonForeignFlag")
    @FieldName("當事人統號是否為外籍者")
    private boolean personForeignFlag = false;

    /** 當事人是否為戶長. */
    @XmlElement(name = "HouseholdHeadFlag")
    @FieldName("當事人是否為戶長")
    private boolean householdHeadFlag = false;

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

    /** 原父母姓名 . */
    @XmlElement(name = "BeforeParentName")
    @FieldName("原父母姓名")
    private String beforeParentName;

    /** 原父母姓. */
    @XmlElement(name = "BeforeParentLastName")
    @FieldName("原父母姓")
    private String beforeParentLastName;

    /** 原父母名. */
    @XmlElement(name = "BeforeParentFirstName")
    @FieldName("原父母名")
    private String beforeParentFirstName;

    /** 更正後父母姓名. */
    @XmlElement(name = "AfterParentName")
    @FieldName("更正後父母姓名")
    private String afterParentName;

    /** 更正後父母姓. */
    @XmlElement(name = "AfterParentLastName")
    @FieldName("更正後父母姓")
    private String afterParentLastName;

    /** 更正後父母名. */
    @XmlElement(name = "AfterParentFirstName")
    @FieldName("更正後父母名")
    private String afterParentFirstName;

    /** 更正日期. */
    @XmlElement(name = "UpdateYyymmdd")
    @FieldName("更正日期")
    private String updateYyymmdd;

    /** 引用法條代碼. */
    @XmlElement(name = "QuoteLowCode")
    @FieldName("引用法條代碼")
    private String quoteLowCode = "01";

    /** 更正原因代碼. */
    @XmlElement(name = "UpdateReasonCode")
    @FieldName("更正原因代碼")
    private String updateReasonCode = "01";

    /** 其他更正原因. */
    @XmlElement(name = "OtherUpdateReason")
    @FieldName("其他更正原因")
    private String otherUpdateReason;

    /** 其他附繳證件. */
    @XmlElement(name = "OtherCertificate")
    @FieldName("其他附繳證件")
    private String otherCertificate;

    /** 附繳證件清單. */
    @XmlElement(name = "CertificateList")
    @FieldName("附繳證件清單")
    private List<String> certificateList = new ArrayList<String>();

    /** 背景顏色. */
    @XmlElement(name = "ColorStyle")
    @FieldName("背景顏色")
    private String colorStyle;

    /** 收據號碼. */
    @XmlElement(name = "ReceiptId")
    @FieldName("收據號碼")
    private String receiptId;

    /** 是否暫存. */
    @XmlElement(name = "Save")
    @FieldName("是否暫存")
    private boolean save;

    /**
     * Gets the xldf person data.
     * 
     * @return the xldf person data
     */
    public XLDFPersonDataDomainObject getXldfPersonData() {
        return xldfPersonData;
    }

    /**
     * Sets the xldf person data.
     * 
     * @param xldfPersonData
     *            the new xldf person data
     */
    public void setXldfPersonData(XLDFPersonDataDomainObject xldfPersonData) {
        this.xldfPersonData = xldfPersonData;
    }

    /**
     * Gets the xldf foreign person dto.
     * 
     * @return the xldf foreign person dto
     */
    public XLDFForeignPersonDTO getXldfForeignPersonDTO() {
        return xldfForeignPersonDTO;
    }

    /**
     * Sets the xldf foreign person dto.
     * 
     * @param xldfForeignPersonDTO
     *            the new xldf foreign person dto
     */
    public void setXldfForeignPersonDTO(XLDFForeignPersonDTO xldfForeignPersonDTO) {
        this.xldfForeignPersonDTO = xldfForeignPersonDTO;
    }

    /**
     * Gets the person note list.
     * 
     * @return the person note list
     */
    public List<XLDFPersonNoteDomainObject> getPersonNoteList() {
        return personNoteList;
    }

    /**
     * Sets the person note list.
     * 
     * @param personNoteList
     *            the new person note list
     */
    public void setPersonNoteList(List<XLDFPersonNoteDomainObject> personNoteList) {
        this.personNoteList = personNoteList;
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
    public void setPersonForeignFlag(boolean personForeignFlag) {
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
    public void setHouseholdHeadFlag(boolean householdHeadFlag) {
        this.householdHeadFlag = householdHeadFlag;
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
    public void setEnableOtherCertificate(boolean enableOtherCertificate) {
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
    public void setFineEventDate(String fineEventDate) {
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
    public void setDoFineCheckFlag(boolean doFineCheckFlag) {
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
    public void setDeleteFineDTOFlag(boolean deleteFineDTOFlag) {
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
    public void setPreviousDoFineCheckFlag(boolean previousDoFineCheckFlag) {
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
    public void setPreviousFineEventDate(String previousFineEventDate) {
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
    public void setFineFreeFlag(boolean fineFreeFlag) {
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
    public void setDoFineCheckFlagOpen(boolean doFineCheckFlagOpen) {
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
    public void setSaveBtnFlag(boolean saveBtnFlag) {
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
    public void setFineBtnFlag(boolean fineBtnFlag) {
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
    public void setUpdateBtnFlag(boolean updateBtnFlag) {
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
    public void setNeedFineFlag(String needFineFlag) {
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
    public void setRemoveFeeReason(String removeFeeReason) {
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
    public void setFineSerialNumber(String fineSerialNumber) {
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
    public void setFeeAmount(String feeAmount) {
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
    public void setApplySeq(String applySeq) {
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
    public void setApplyCaseNo(String applyCaseNo) {
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
    public void setTransactionId(String transactionId) {
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
    public void setOperationCode(String operationCode) {
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
    public void setApplySequenceId(String applySequenceId) {
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
    public void setXldfy0xxmList(List<XLDFDomainObject> xldfy0xxmList) {
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
    public void setFineParameterDTO(FineParameterDTO fineParameterDTO) {
        this.fineParameterDTO = fineParameterDTO;
    }

    /**
     * Gets the before parent name.
     * 
     * @return the before parent name
     */
    public String getBeforeParentName() {
        return beforeParentName;
    }

    /**
     * Sets the before parent name.
     * 
     * @param beforeParentName
     *            the new before parent name
     */
    public void setBeforeParentName(String beforeParentName) {
        this.beforeParentName = beforeParentName;
    }

    /**
     * Gets the before parent last name.
     * 
     * @return the before parent last name
     */
    public String getBeforeParentLastName() {
        return beforeParentLastName;
    }

    /**
     * Sets the before parent last name.
     * 
     * @param beforeParentLastName
     *            the new before parent last name
     */
    public void setBeforeParentLastName(String beforeParentLastName) {
        this.beforeParentLastName = beforeParentLastName;
    }

    /**
     * Gets the before parent first name.
     * 
     * @return the before parent first name
     */
    public String getBeforeParentFirstName() {
        return beforeParentFirstName;
    }

    /**
     * Sets the before parent first name.
     * 
     * @param beforeParentFirstName
     *            the new before parent first name
     */
    public void setBeforeParentFirstName(String beforeParentFirstName) {
        this.beforeParentFirstName = beforeParentFirstName;
    }

    /**
     * Gets the after parent name.
     * 
     * @return the after parent name
     */
    public String getAfterParentName() {
        return afterParentName;
    }

    /**
     * Sets the after parent name.
     * 
     * @param afterParentName
     *            the new after parent name
     */
    public void setAfterParentName(String afterParentName) {
        this.afterParentName = afterParentName;
    }

    /**
     * Gets the after parent last name.
     * 
     * @return the after parent last name
     */
    public String getAfterParentLastName() {
        return afterParentLastName;
    }

    /**
     * Sets the after parent last name.
     * 
     * @param afterParentLastName
     *            the new after parent last name
     */
    public void setAfterParentLastName(String afterParentLastName) {
        this.afterParentLastName = afterParentLastName;
    }

    /**
     * Gets the after parent first name.
     * 
     * @return the after parent first name
     */
    public String getAfterParentFirstName() {
        return afterParentFirstName;
    }

    /**
     * Sets the after parent first name.
     * 
     * @param afterParentFirstName
     *            the new after parent first name
     */
    public void setAfterParentFirstName(String afterParentFirstName) {
        this.afterParentFirstName = afterParentFirstName;
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
    public void setUpdateYyymmdd(String updateYyymmdd) {
        this.updateYyymmdd = updateYyymmdd;
    }

    /**
     * Gets the quote low code.
     * 
     * @return the quote low code
     */
    public String getQuoteLowCode() {
        return quoteLowCode;
    }

    /**
     * Sets the quote low code.
     * 
     * @param quoteLowCode
     *            the new quote low code
     */
    public void setQuoteLowCode(String quoteLowCode) {
        this.quoteLowCode = quoteLowCode;
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
    public void setUpdateReasonCode(String updateReasonCode) {
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
    public void setOtherUpdateReason(String otherUpdateReason) {
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
    public void setOtherCertificate(String otherCertificate) {
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
    public void setCertificateList(List<String> certificateList) {
        this.certificateList = certificateList;
    }

    /**
     * Gets the color style.
     * 
     * @return the color style
     */
    public String getColorStyle() {
        return colorStyle;
    }

    /**
     * Sets the color style.
     * 
     * @param colorStyle
     *            the new color style
     */
    public void setColorStyle(String colorStyle) {
        this.colorStyle = colorStyle;
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
     * Checks if is save.
     * 
     * @return true, if is save
     */
    public boolean isSave() {
        return save;
    }

    /**
     * Sets the save.
     * 
     * @param save
     *            the new save
     */
    public void setSave(boolean save) {
        this.save = save;
    }
}
