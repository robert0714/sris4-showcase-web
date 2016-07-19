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
 * The Class Rl0171aAppDataDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0171aAppDataDTO", propOrder = { "registerDate", "registerTime", "acceptAdminOfficeCode",
        "beforeAreaCode", "afterAreaCode", "beforeCityCounty", "afterCityCounty", "beforeTown", "afterTown",
        "beforeVillage", "afterVillage", "beforeNeighbor", "afterNeighbor", "beforeStreetDoorplate",
        "afterStreetDoorplate", "updateYyymmdd", "updateReasonCode", "otherUpdateReason", "certificateList",
        "otherCertificate", "enforcedFlag", "registerContent", "acceptRegisterName", "receiptId", "fineEventDate",
        "doFineCheckFlag", "deleteFineDTOFlag", "previousDoFineCheckFlag", "previousFineEventDate", "fineFreeFlag",
        "doFineCheckFlagOpen", "fineDTO", "saveBtnFlag", "fineBtnFlag", "updateBtnFlag", "needFineFlag",
        "removeFeeReason", "fineSerialNumber", "feeAmount", "applySeq", "applyCaseNo", "transactionId",
        "operationCode", "applySequenceId", "enableOtherCertificate" })
@XmlRootElement(name = "Rl0171aAppDataDTO")
public class Rl0171aAppDataDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -344751727492403650L;

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

    /** 原行政區域代碼. */
    @XmlElement(name = "BeforeAreaCode")
    @FieldName("原行政區域代碼")
    private String beforeAreaCode;

    /** 更正後行政區域代碼. */
    @XmlElement(name = "AfterAreaCode")
    @FieldName("更正後行政區域代碼")
    private String afterAreaCode;

    /** 原省市縣市. */
    @XmlElement(name = "BeforeCityCounty")
    @FieldName("原省市縣市")
    private String beforeCityCounty;

    /** 更正後省市縣市. */
    @XmlElement(name = "AfterCityCounty")
    @FieldName("更正後省市縣市")
    private String afterCityCounty;

    /** 原鄉鎮市區. */
    @XmlElement(name = "BeforeTown")
    @FieldName("原鄉鎮市區")
    private String beforeTown;

    /** 更正後鄉鎮市區. */
    @XmlElement(name = "AfterTown")
    @FieldName("更正後鄉鎮市區")
    private String afterTown;

    /** 原村里. */
    @XmlElement(name = "BeforeVillage")
    @FieldName("原村里")
    private String beforeVillage;

    /** 更正後村里. */
    @XmlElement(name = "AfterVillage")
    @FieldName("更正後村里")
    private String afterVillage;

    /** 原鄰. */
    @XmlElement(name = "BeforeNeighbor")
    @FieldName("原鄰")
    private String beforeNeighbor;

    /** 更正後鄰. */
    @XmlElement(name = "AfterNeighbor")
    @FieldName("更正後鄰")
    private String afterNeighbor;

    /** 原門牌. */
    @XmlElement(name = "BeforeStreetDoorplate")
    @FieldName("原門牌")
    private String beforeStreetDoorplate;

    /** 更正門牌. */
    @XmlElement(name = "AfterStreetDoorplate")
    @FieldName("更正門牌")
    private String afterStreetDoorplate;

    /** 更正日期. */
    @XmlElement(name = "UpdateYyymmdd")
    @FieldName("更正日期")
    private String updateYyymmdd;

    /** 更正原因. */
    @XmlElement(name = "UpdateReasonCode")
    @FieldName("更正原因")
    private String updateReasonCode = "01";

    /** 其他更正原因. */
    @XmlElement(name = "OtherUpdateReason")
    @FieldName("其他更正原因")
    private String otherUpdateReason;

    /** 申請資料【附繳證件】. */
    @XmlElement(name = "certificateList")
    @FieldName("申請資料附繳證件")
    private List<String> certificateList = new ArrayList<String>();

    /** 其他附繳證件. */
    @XmlElement(name = "OtherCertificate")
    @FieldName("其他附繳證件")
    private String otherCertificate;

    /** 逕為登記旗標. */
    @XmlElement(name = "EnforcedFlag")
    @FieldName("逕為登記旗標")
    private String enforcedFlag = RlConstant.NO_CHAR;

    /** 備註. */
    @XmlElement(name = "RegisterContent")
    @FieldName("備註")
    private String registerContent;

    /** 受理地戶籍員姓名. */
    @XmlElement(name = "AcceptRegisterName")
    @FieldName("受理地戶籍員姓名")
    private String acceptRegisterName;

    /** 收據號碼. */
    @XmlElement(name = "ReceiptId")
    @FieldName("收據號碼")
    private String receiptId;

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

    /** 其他附繳證件開關. */
    @XmlElement(name = "EnableOtherCertificate")
    @FieldName("其他附繳證件開關")
    private boolean enableOtherCertificate = false;

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
     * Gets the before area code.
     * 
     * @return the before area code
     */
    public String getBeforeAreaCode() {
        return beforeAreaCode;
    }

    /**
     * Sets the before area code.
     * 
     * @param beforeAreaCode
     *            the new before area code
     */
    public void setBeforeAreaCode(final String beforeAreaCode) {
        this.beforeAreaCode = beforeAreaCode;
    }

    /**
     * Gets the after area code.
     * 
     * @return the after area code
     */
    public String getAfterAreaCode() {
        return afterAreaCode;
    }

    /**
     * Sets the after area code.
     * 
     * @param afterAreaCode
     *            the new after area code
     */
    public void setAfterAreaCode(final String afterAreaCode) {
        this.afterAreaCode = afterAreaCode;
    }

    /**
     * Gets the before city county.
     * 
     * @return the before city county
     */
    public String getBeforeCityCounty() {
        return beforeCityCounty;
    }

    /**
     * Sets the before city county.
     * 
     * @param beforeCityCounty
     *            the new before city county
     */
    public void setBeforeCityCounty(final String beforeCityCounty) {
        this.beforeCityCounty = beforeCityCounty;
    }

    /**
     * Gets the after city county.
     * 
     * @return the after city county
     */
    public String getAfterCityCounty() {
        return afterCityCounty;
    }

    /**
     * Sets the after city county.
     * 
     * @param afterCityCounty
     *            the new after city county
     */
    public void setAfterCityCounty(final String afterCityCounty) {
        this.afterCityCounty = afterCityCounty;
    }

    /**
     * Gets the before town.
     * 
     * @return the before town
     */
    public String getBeforeTown() {
        return beforeTown;
    }

    /**
     * Sets the before town.
     * 
     * @param beforeTown
     *            the new before town
     */
    public void setBeforeTown(final String beforeTown) {
        this.beforeTown = beforeTown;
    }

    /**
     * Gets the after town.
     * 
     * @return the after town
     */
    public String getAfterTown() {
        return afterTown;
    }

    /**
     * Sets the after town.
     * 
     * @param afterTown
     *            the new after town
     */
    public void setAfterTown(final String afterTown) {
        this.afterTown = afterTown;
    }

    /**
     * Gets the before village.
     * 
     * @return the before village
     */
    public String getBeforeVillage() {
        return beforeVillage;
    }

    /**
     * Sets the before village.
     * 
     * @param beforeVillage
     *            the new before village
     */
    public void setBeforeVillage(final String beforeVillage) {
        this.beforeVillage = beforeVillage;
    }

    /**
     * Gets the after village.
     * 
     * @return the after village
     */
    public String getAfterVillage() {
        return afterVillage;
    }

    /**
     * Sets the after village.
     * 
     * @param afterVillage
     *            the new after village
     */
    public void setAfterVillage(final String afterVillage) {
        this.afterVillage = afterVillage;
    }

    /**
     * Gets the before neighbor.
     * 
     * @return the before neighbor
     */
    public String getBeforeNeighbor() {
        return beforeNeighbor;
    }

    /**
     * Sets the before neighbor.
     * 
     * @param beforeNeighbor
     *            the new before neighbor
     */
    public void setBeforeNeighbor(final String beforeNeighbor) {
        this.beforeNeighbor = beforeNeighbor;
    }

    /**
     * Gets the after neighbor.
     * 
     * @return the after neighbor
     */
    public String getAfterNeighbor() {
        return afterNeighbor;
    }

    /**
     * Sets the after neighbor.
     * 
     * @param afterNeighbor
     *            the new after neighbor
     */
    public void setAfterNeighbor(final String afterNeighbor) {
        this.afterNeighbor = afterNeighbor;
    }

    /**
     * Gets the before street doorplate.
     * 
     * @return the before street doorplate
     */
    public String getBeforeStreetDoorplate() {
        return beforeStreetDoorplate;
    }

    /**
     * Sets the before street doorplate.
     * 
     * @param beforeStreetDoorplate
     *            the new before street doorplate
     */
    public void setBeforeStreetDoorplate(final String beforeStreetDoorplate) {
        this.beforeStreetDoorplate = beforeStreetDoorplate;
    }

    /**
     * Gets the after street doorplate.
     * 
     * @return the after street doorplate
     */
    public String getAfterStreetDoorplate() {
        return afterStreetDoorplate;
    }

    /**
     * Sets the after street doorplate.
     * 
     * @param afterStreetDoorplate
     *            the new after street doorplate
     */
    public void setAfterStreetDoorplate(final String afterStreetDoorplate) {
        this.afterStreetDoorplate = afterStreetDoorplate;
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

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((afterCityCounty == null) ? 0 : afterCityCounty.hashCode());
        result = prime * result + ((afterNeighbor == null) ? 0 : afterNeighbor.hashCode());
        result = prime * result + ((afterStreetDoorplate == null) ? 0 : afterStreetDoorplate.hashCode());
        result = prime * result + ((afterTown == null) ? 0 : afterTown.hashCode());
        result = prime * result + ((afterVillage == null) ? 0 : afterVillage.hashCode());
        result = prime * result + ((certificateList == null) ? 0 : certificateList.hashCode());
        result = prime * result + ((otherCertificate == null) ? 0 : otherCertificate.hashCode());
        result = prime * result + ((otherUpdateReason == null) ? 0 : otherUpdateReason.hashCode());
        result = prime * result + ((updateReasonCode == null) ? 0 : updateReasonCode.hashCode());
        result = prime * result + ((updateYyymmdd == null) ? 0 : updateYyymmdd.hashCode());
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
        Rl0171aAppDataDTO other = (Rl0171aAppDataDTO) obj;
        if (afterCityCounty == null) {
            if (other.afterCityCounty != null)
                return false;
        } else if (!afterCityCounty.equals(other.afterCityCounty))
            return false;
        if (afterNeighbor == null) {
            if (other.afterNeighbor != null)
                return false;
        } else if (!afterNeighbor.equals(other.afterNeighbor))
            return false;
        if (afterStreetDoorplate == null) {
            if (other.afterStreetDoorplate != null)
                return false;
        } else if (!afterStreetDoorplate.equals(other.afterStreetDoorplate))
            return false;
        if (afterTown == null) {
            if (other.afterTown != null)
                return false;
        } else if (!afterTown.equals(other.afterTown))
            return false;
        if (afterVillage == null) {
            if (other.afterVillage != null)
                return false;
        } else if (!afterVillage.equals(other.afterVillage))
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
        return true;
    }
}
