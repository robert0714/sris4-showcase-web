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
 * 親子關係更正父(母)姓名更正 AppDataDTO.
 * 
 * @author Jay Kan
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0171sAppDataDTO", propOrder = { "registerDate", "registerTime", "acceptAdminOfficeCode",
        "beforeFather", "beforeFatherLastName", "beforeFatherFirstName", "beforeFatherId", "beforeFatherRole",
        "beforeFatherSiteId", "beforeMother", "beforeMotherLastName", "beforeMotherFirstName", "beforeMotherId",
        "beforeMotherRole", "beforeMotherSiteId", "afterFather", "afterFatherLastName", "afterFatherFirstName",
        "afterFatherId", "afterFatherRole", "afterFatherSiteId", "afterMother", "afterMotherLastName",
        "afterMotherFirstName", "afterMotherId", "afterMotherRole", "afterMotherSiteId", "updateYyymmdd",
        "quoteLowCode", "updateReasonCode", "otherCertificate", "certificateList", "enforcedFlag", "registerContent",
        "acceptRegisterName", "receiptId", "personForeignFlag", "householdHeadFlag", "birthOrderSex", "dateOfMarriage",
        "deleteFather", "deleteMother", "fineEventDate", "doFineCheckFlag", "deleteFineDTOFlag",
        "previousDoFineCheckFlag", "previousFineEventDate", "fineFreeFlag", "doFineCheckFlagOpen", "fineDTO",
        "saveBtnFlag", "fineBtnFlag", "updateBtnFlag", "needFineFlag", "removeFeeReason", "fineSerialNumber",
        "feeAmount", "applySeq", "applyCaseNo", "transactionId", "operationCode", "applySequenceId", "finePersonId",
        "fineSiteId", "registerBirthOrderSexOnFather", "birthOrderSexRequired" })
@XmlRootElement(name = "Rl0171sAppDataDTO")
public class Rl0171sAppDataDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 7053044491632775755L;

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

    /** 原父姓名. */
    @XmlElement(name = "BeforeFather")
    @FieldName("原父姓名")
    private String beforeFather;

    /** 原父姓. */
    @XmlElement(name = "BeforeFatherLastName")
    @FieldName("原父姓")
    private String beforeFatherLastName;

    /** 原父名. */
    @XmlElement(name = "BeforeFatherFirstName")
    @FieldName("原父名")
    private String beforeFatherFirstName;

    /** 原父統編. */
    @XmlElement(name = "BeforeFatherId")
    @FieldName("原父統編")
    private String beforeFatherId;

    /** 原父-身分角色. */
    @XmlElement(name = "BeforeFatherRole")
    @FieldName("原父-身分角色")
    private String beforeFatherRole;

    /** 原父作業點代碼. */
    @XmlElement(name = "BeforeFatherSiteId")
    @FieldName("原父作業點代碼")
    private String beforeFatherSiteId;

    /** 原母姓名. */
    @XmlElement(name = "BeforeMother")
    @FieldName("原母姓名")
    private String beforeMother;

    /** 原母姓. */
    @XmlElement(name = "BeforeMotherLastName")
    @FieldName("原母姓")
    private String beforeMotherLastName;

    /** 原母名. */
    @XmlElement(name = "BeforeMotherFirstName")
    @FieldName("原母名")
    private String beforeMotherFirstName;

    /** 原母統編. */
    @XmlElement(name = "BeforeMotherId")
    @FieldName("原母統編")
    private String beforeMotherId;

    /** 原母-身分角色. */
    @XmlElement(name = "BeforeMotherRole")
    @FieldName("原母-身分角色")
    private String beforeMotherRole;

    /** 原母作業點代碼. */
    @XmlElement(name = "BeforeMotherSiteId")
    @FieldName("原母作業點代碼")
    private String beforeMotherSiteId;

    /** 新父姓名. */
    @XmlElement(name = "AfterFather")
    @FieldName("新父姓名")
    private String afterFather;

    /** 新父姓. */
    @XmlElement(name = "AfterFatherLastName")
    @FieldName("新父姓")
    private String afterFatherLastName;

    /** 新父名. */
    @XmlElement(name = "AfterFatherFirstName")
    @FieldName("新父名")
    private String afterFatherFirstName;

    /** 新父統編. */
    @XmlElement(name = "AfterFatherId")
    @FieldName("新父統編")
    private String afterFatherId;

    /** 新父-身分角色. */
    @XmlElement(name = "AfterFatherRole")
    @FieldName("新父-身分角色")
    private String afterFatherRole;

    /** 新父作業點代碼. */
    @XmlElement(name = "AfterFatherSiteId")
    @FieldName("新父作業點代碼")
    private String afterFatherSiteId;

    /** 新母姓名. */
    @XmlElement(name = "AfterMother")
    @FieldName("新母姓名")
    private String afterMother;

    /** 新母姓. */
    @XmlElement(name = "AfterMotherLastName")
    @FieldName("新母姓")
    private String afterMotherLastName;

    /** 新母名. */
    @XmlElement(name = "AfterMotherFirstName")
    @FieldName("新母名")
    private String afterMotherFirstName;

    /** 新母統編. */
    @XmlElement(name = "AfterMotherId")
    @FieldName("新母統編")
    private String afterMotherId;

    /** 新母-身分角色. */
    @XmlElement(name = "AfterMotherRole")
    @FieldName("新母-身分角色")
    private String afterMotherRole;

    /** 新母作業點代碼. */
    @XmlElement(name = "AfterMotherSiteId")
    @FieldName("新母作業點代碼")
    private String afterMotherSiteId;

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

    /** 其他附繳證件. */
    @XmlElement(name = "OtherCertificate")
    @FieldName("其他附繳證件")
    private String otherCertificate;

    /** 附繳證件清單. */
    @XmlElement(name = "CertificateList")
    @FieldName("附繳證件")
    private List<String> certificateList = new ArrayList<String>();

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

    /** 當事人統號是否為外籍者. */
    @XmlElement(name = "PersonForeignFlag")
    @FieldName("當事人統號是否為外籍者")
    private boolean personForeignFlag = false;

    /** 當事人是否為戶長旗標. */
    @XmlElement(name = "HouseholdHeadFlag")
    @FieldName("當事人是否為戶長旗標")
    private boolean householdHeadFlag = false;

    /** 出生別. */
    @XmlElement(name = "BirthOrderSex")
    @FieldName("出生別")
    private String birthOrderSex;

    /** 生父母結婚日期. */
    @XmlElement(name = "DateOfMarriage")
    @FieldName("生父母結婚日期")
    private String dateOfMarriage;

    /** 刪除父親. */
    @XmlElement(name = "DeleteFather")
    @FieldName("刪除父親")
    private boolean deleteFather = false;

    /** 刪除母親. */
    @XmlElement(name = "DeleteMother")
    @FieldName("刪除母親")
    private boolean deleteMother = false;

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

    /** 罰緩統號. */
    @XmlElement(name = "FinePersonId")
    @FieldName("罰緩統號")
    private String finePersonId;

    /** 罰緩作業點代碼. */
    @XmlElement(name = "FineSiteId")
    @FieldName("罰緩作業點代碼")
    private String fineSiteId;

    /**
     * 出生別記事記在父親身上.<BR>
     * Default: true
     */
    @XmlElement(name = "RegisterBirthOrderSexOnFather")
    @FieldName("出生別記事記在父親身上")
    private boolean registerBirthOrderSexOnFather = true;

    /**
     * 出生別是否為必填.<BR>
     * Default: true
     */
    @XmlElement(name = "BirthOrderSexRequired")
    @FieldName("出生別是否為必填")
    private boolean birthOrderSexRequired = true;

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
     * Gets the before father.
     * 
     * @return the before father
     */
    public String getBeforeFather() {
        return beforeFather;
    }

    /**
     * Sets the before father.
     * 
     * @param beforeFather
     *            the new before father
     */
    public void setBeforeFather(final String beforeFather) {
        this.beforeFather = beforeFather;
    }

    /**
     * Gets the before father last name.
     * 
     * @return the before father last name
     */
    public String getBeforeFatherLastName() {
        return beforeFatherLastName;
    }

    /**
     * Sets the before father last name.
     * 
     * @param beforeFatherLastName
     *            the new before father last name
     */
    public void setBeforeFatherLastName(final String beforeFatherLastName) {
        this.beforeFatherLastName = beforeFatherLastName;
    }

    /**
     * Gets the before father first name.
     * 
     * @return the before father first name
     */
    public String getBeforeFatherFirstName() {
        return beforeFatherFirstName;
    }

    /**
     * Sets the before father first name.
     * 
     * @param beforeFatherFirstName
     *            the new before father first name
     */
    public void setBeforeFatherFirstName(final String beforeFatherFirstName) {
        this.beforeFatherFirstName = beforeFatherFirstName;
    }

    /**
     * Gets the before father id.
     * 
     * @return the before father id
     */
    public String getBeforeFatherId() {
        return beforeFatherId;
    }

    /**
     * Sets the before father id.
     * 
     * @param beforeFatherId
     *            the new before father id
     */
    public void setBeforeFatherId(final String beforeFatherId) {
        this.beforeFatherId = beforeFatherId;
    }

    /**
     * Gets the before father role.
     * 
     * @return the before father role
     */
    public String getBeforeFatherRole() {
        return beforeFatherRole;
    }

    /**
     * Sets the before father role.
     * 
     * @param beforeFatherRole
     *            the new before father role
     */
    public void setBeforeFatherRole(final String beforeFatherRole) {
        this.beforeFatherRole = beforeFatherRole;
    }

    /**
     * Gets the before father site id.
     * 
     * @return the before father site id
     */
    public String getBeforeFatherSiteId() {
        return beforeFatherSiteId;
    }

    /**
     * Sets the before father site id.
     * 
     * @param beforeFatherSiteId
     *            the new before father site id
     */
    public void setBeforeFatherSiteId(final String beforeFatherSiteId) {
        this.beforeFatherSiteId = beforeFatherSiteId;
    }

    /**
     * Gets the before mother.
     * 
     * @return the before mother
     */
    public String getBeforeMother() {
        return beforeMother;
    }

    /**
     * Sets the before mother.
     * 
     * @param beforeMother
     *            the new before mother
     */
    public void setBeforeMother(final String beforeMother) {
        this.beforeMother = beforeMother;
    }

    /**
     * Gets the before mother last name.
     * 
     * @return the before mother last name
     */
    public String getBeforeMotherLastName() {
        return beforeMotherLastName;
    }

    /**
     * Sets the before mother last name.
     * 
     * @param beforeMotherLastName
     *            the new before mother last name
     */
    public void setBeforeMotherLastName(final String beforeMotherLastName) {
        this.beforeMotherLastName = beforeMotherLastName;
    }

    /**
     * Gets the before mother first name.
     * 
     * @return the before mother first name
     */
    public String getBeforeMotherFirstName() {
        return beforeMotherFirstName;
    }

    /**
     * Sets the before mother first name.
     * 
     * @param beforeMotherFirstName
     *            the new before mother first name
     */
    public void setBeforeMotherFirstName(final String beforeMotherFirstName) {
        this.beforeMotherFirstName = beforeMotherFirstName;
    }

    /**
     * Gets the before mother id.
     * 
     * @return the before mother id
     */
    public String getBeforeMotherId() {
        return beforeMotherId;
    }

    /**
     * Sets the before mother id.
     * 
     * @param beforeMotherId
     *            the new before mother id
     */
    public void setBeforeMotherId(final String beforeMotherId) {
        this.beforeMotherId = beforeMotherId;
    }

    /**
     * Gets the before mother role.
     * 
     * @return the before mother role
     */
    public String getBeforeMotherRole() {
        return beforeMotherRole;
    }

    /**
     * Sets the before mother role.
     * 
     * @param beforeMotherRole
     *            the new before mother role
     */
    public void setBeforeMotherRole(final String beforeMotherRole) {
        this.beforeMotherRole = beforeMotherRole;
    }

    /**
     * Gets the before mother site id.
     * 
     * @return the before mother site id
     */
    public String getBeforeMotherSiteId() {
        return beforeMotherSiteId;
    }

    /**
     * Sets the before mother site id.
     * 
     * @param beforeMotherSiteId
     *            the new before mother site id
     */
    public void setBeforeMotherSiteId(final String beforeMotherSiteId) {
        this.beforeMotherSiteId = beforeMotherSiteId;
    }

    /**
     * Gets the after father.
     * 
     * @return the after father
     */
    public String getAfterFather() {
        return afterFather;
    }

    /**
     * Sets the after father.
     * 
     * @param afterFather
     *            the new after father
     */
    public void setAfterFather(final String afterFather) {
        this.afterFather = afterFather;
    }

    /**
     * Gets the after father last name.
     * 
     * @return the after father last name
     */
    public String getAfterFatherLastName() {
        return afterFatherLastName;
    }

    /**
     * Sets the after father last name.
     * 
     * @param afterFatherLastName
     *            the new after father last name
     */
    public void setAfterFatherLastName(final String afterFatherLastName) {
        this.afterFatherLastName = afterFatherLastName;
    }

    /**
     * Gets the after father first name.
     * 
     * @return the after father first name
     */
    public String getAfterFatherFirstName() {
        return afterFatherFirstName;
    }

    /**
     * Sets the after father first name.
     * 
     * @param afterFatherFirstName
     *            the new after father first name
     */
    public void setAfterFatherFirstName(final String afterFatherFirstName) {
        this.afterFatherFirstName = afterFatherFirstName;
    }

    /**
     * Gets the after father id.
     * 
     * @return the after father id
     */
    public String getAfterFatherId() {
        return afterFatherId;
    }

    /**
     * Sets the after father id.
     * 
     * @param afterFatherId
     *            the new after father id
     */
    public void setAfterFatherId(final String afterFatherId) {
        this.afterFatherId = afterFatherId;
    }

    /**
     * Gets the after father role.
     * 
     * @return the after father role
     */
    public String getAfterFatherRole() {
        return afterFatherRole;
    }

    /**
     * Sets the after father role.
     * 
     * @param afterFatherRole
     *            the new after father role
     */
    public void setAfterFatherRole(final String afterFatherRole) {
        this.afterFatherRole = afterFatherRole;
    }

    /**
     * Gets the after father site id.
     * 
     * @return the after father site id
     */
    public String getAfterFatherSiteId() {
        return afterFatherSiteId;
    }

    /**
     * Sets the after father site id.
     * 
     * @param afterFatherSiteId
     *            the new after father site id
     */
    public void setAfterFatherSiteId(final String afterFatherSiteId) {
        this.afterFatherSiteId = afterFatherSiteId;
    }

    /**
     * Gets the after mother.
     * 
     * @return the after mother
     */
    public String getAfterMother() {
        return afterMother;
    }

    /**
     * Sets the after mother.
     * 
     * @param afterMother
     *            the new after mother
     */
    public void setAfterMother(final String afterMother) {
        this.afterMother = afterMother;
    }

    /**
     * Gets the after mother last name.
     * 
     * @return the after mother last name
     */
    public String getAfterMotherLastName() {
        return afterMotherLastName;
    }

    /**
     * Sets the after mother last name.
     * 
     * @param afterMotherLastName
     *            the new after mother last name
     */
    public void setAfterMotherLastName(final String afterMotherLastName) {
        this.afterMotherLastName = afterMotherLastName;
    }

    /**
     * Gets the after mother first name.
     * 
     * @return the after mother first name
     */
    public String getAfterMotherFirstName() {
        return afterMotherFirstName;
    }

    /**
     * Sets the after mother first name.
     * 
     * @param afterMotherFirstName
     *            the new after mother first name
     */
    public void setAfterMotherFirstName(final String afterMotherFirstName) {
        this.afterMotherFirstName = afterMotherFirstName;
    }

    /**
     * Gets the after mother id.
     * 
     * @return the after mother id
     */
    public String getAfterMotherId() {
        return afterMotherId;
    }

    /**
     * Sets the after mother id.
     * 
     * @param afterMotherId
     *            the new after mother id
     */
    public void setAfterMotherId(final String afterMotherId) {
        this.afterMotherId = afterMotherId;
    }

    /**
     * Gets the after mother role.
     * 
     * @return the after mother role
     */
    public String getAfterMotherRole() {
        return afterMotherRole;
    }

    /**
     * Sets the after mother role.
     * 
     * @param afterMotherRole
     *            the new after mother role
     */
    public void setAfterMotherRole(final String afterMotherRole) {
        this.afterMotherRole = afterMotherRole;
    }

    /**
     * Gets the after mother site id.
     * 
     * @return the after mother site id
     */
    public String getAfterMotherSiteId() {
        return afterMotherSiteId;
    }

    /**
     * Sets the after mother site id.
     * 
     * @param afterMotherSiteId
     *            the new after mother site id
     */
    public void setAfterMotherSiteId(final String afterMotherSiteId) {
        this.afterMotherSiteId = afterMotherSiteId;
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
    public void setQuoteLowCode(final String quoteLowCode) {
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
    public void setUpdateReasonCode(final String updateReasonCode) {
        this.updateReasonCode = updateReasonCode;
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
     * Gets the birth order sex.
     * 
     * @return the birth order sex
     */
    public String getBirthOrderSex() {
        return birthOrderSex;
    }

    /**
     * Sets the birth order sex.
     * 
     * @param birthOrderSex
     *            the new birth order sex
     */
    public void setBirthOrderSex(final String birthOrderSex) {
        this.birthOrderSex = birthOrderSex;
    }

    /**
     * Gets the date of marriage.
     * 
     * @return the date of marriage
     */
    public String getDateOfMarriage() {
        return dateOfMarriage;
    }

    /**
     * Sets the date of marriage.
     * 
     * @param dateOfMarriage
     *            the new date of marriage
     */
    public void setDateOfMarriage(final String dateOfMarriage) {
        this.dateOfMarriage = dateOfMarriage;
    }

    /**
     * Checks if is delete father.
     * 
     * @return true, if is delete father
     */
    public boolean isDeleteFather() {
        return deleteFather;
    }

    /**
     * Sets the delete father.
     * 
     * @param deleteFather
     *            the new delete father
     */
    public void setDeleteFather(final boolean deleteFather) {
        this.deleteFather = deleteFather;
    }

    /**
     * Checks if is delete mother.
     * 
     * @return true, if is delete mother
     */
    public boolean isDeleteMother() {
        return deleteMother;
    }

    /**
     * Sets the delete mother.
     * 
     * @param deleteMother
     *            the new delete mother
     */
    public void setDeleteMother(final boolean deleteMother) {
        this.deleteMother = deleteMother;
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
     * Gets the fine person id.
     * 
     * @return the fine person id
     */
    public String getFinePersonId() {
        return finePersonId;
    }

    /**
     * Sets the fine person id.
     * 
     * @param finePersonId
     *            the new fine person id
     */
    public void setFinePersonId(final String finePersonId) {
        this.finePersonId = finePersonId;
    }

    /**
     * Gets the fine site id.
     * 
     * @return the fine site id
     */
    public String getFineSiteId() {
        return fineSiteId;
    }

    /**
     * Sets the fine site id.
     * 
     * @param fineSiteId
     *            the new fine site id
     */
    public void setFineSiteId(final String fineSiteId) {
        this.fineSiteId = fineSiteId;
    }

    /**
     * Checks if is register birth order sex on father.
     * 
     * @return true, if is register birth order sex on father
     */
    public boolean isRegisterBirthOrderSexOnFather() {
        return registerBirthOrderSexOnFather;
    }

    /**
     * Sets the register birth order sex on father.
     * 
     * @param registerBirthOrderSexOnFather
     *            the new register birth order sex on father
     */
    public void setRegisterBirthOrderSexOnFather(final boolean registerBirthOrderSexOnFather) {
        this.registerBirthOrderSexOnFather = registerBirthOrderSexOnFather;
    }

    /**
     * Checks if is birth order sex required.
     * 
     * @return true, if is birth order sex required
     */
    public boolean isBirthOrderSexRequired() {
        return birthOrderSexRequired;
    }

    /**
     * Sets the birth order sex required.
     * 
     * @param birthOrderSexRequired
     *            the new birth order sex required
     */
    public void setBirthOrderSexRequired(final boolean birthOrderSexRequired) {
        this.birthOrderSexRequired = birthOrderSexRequired;
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
        result = prime * result + ((afterFatherId == null) ? 0 : afterFatherId.hashCode());
        result = prime * result + ((afterFatherSiteId == null) ? 0 : afterFatherSiteId.hashCode());
        result = prime * result + ((afterMotherId == null) ? 0 : afterMotherId.hashCode());
        result = prime * result + ((afterMotherSiteId == null) ? 0 : afterMotherSiteId.hashCode());
        result = prime * result + ((certificateList == null) ? 0 : certificateList.hashCode());
        result = prime * result + ((otherCertificate == null) ? 0 : otherCertificate.hashCode());
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
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Rl0171sAppDataDTO other = (Rl0171sAppDataDTO) obj;
        if (afterFatherId == null) {
            if (other.afterFatherId != null)
                return false;
        } else if (!afterFatherId.equals(other.afterFatherId))
            return false;
        if (afterFatherSiteId == null) {
            if (other.afterFatherSiteId != null)
                return false;
        } else if (!afterFatherSiteId.equals(other.afterFatherSiteId))
            return false;
        if (afterMotherId == null) {
            if (other.afterMotherId != null)
                return false;
        } else if (!afterMotherId.equals(other.afterMotherId))
            return false;
        if (afterMotherSiteId == null) {
            if (other.afterMotherSiteId != null)
                return false;
        } else if (!afterMotherSiteId.equals(other.afterMotherSiteId))
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
