/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang.StringUtils;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldfu001Type;
import tw.gov.moi.domain.Rldfu002Type;
import tw.gov.moi.rl.common.dto.FeeDTO;
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.component.dto.XLDFDomainObject;
import tw.gov.moi.rl.component.xldf.dto.XLDFU002;

/**
 * 規費處理DTO.
 * 
 * @author Charles Chen
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl0a300DTO", propOrder = { "transactionId", "acceptSiteId", "userId", "initTime",
        "openingOperationDTO", "mainFee", "feeDetailList", "rl0a300Data", "rldfu001List", "rldfu002Type", "showMap",
        "showMapKeyList", "warningMessgeList", "initErrorMessageList", "haveApplyCntList", "notCancelList",
        "editCopiesList", "applicationList", "havePersonNameList", "initException", "paymentWay", "feeDTO",
        "applicantComputer1", "applicantComputer2" })
@XmlRootElement(name = "Rl0a300DTO")
public class Rl0a300DTO implements Serializable {

    /** serialVersion UID. */
    private static final long serialVersionUID = 2290942245050190572L;

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

    /** 大簿控制各作業之資訊. */
    @FieldName("大簿控制各作業之資訊")
    @XmlElement(name = "OpeningOperationDTO", required = false)
    private OpeningOperationDTO openingOperationDTO = new OpeningOperationDTO();

    /** 規費主檔. */
    @FieldName("規費主檔")
    @XmlElement(name = "MainFee", required = false)
    private XLDFDomainObject mainFee = new XLDFU002(StringUtils.EMPTY, StringUtils.EMPTY);

    /** 規費檢視明細清單. */
    @FieldName("規費檢視明細清單")
    @XmlElement(name = "FeeDetailList", required = false)
    private List<ShowFeeDetailDTO> feeDetailList = new ArrayList<ShowFeeDetailDTO>();

    /** 規費處理資料. */
    @FieldName("規費處理資料")
    @XmlElement(name = "Rl0a300Data", required = false)
    Rl0a300DataDTO rl0a300Data = new Rl0a300DataDTO();

    /** 規費項目清單. */
    @FieldName("規費項目清單")
    @XmlElement(name = "Rldfu001List", required = false)
    private List<Rldfu001Type> rldfu001List = new ArrayList<Rldfu001Type>();

    /** 收據主檔. */
    @FieldName("收據主檔")
    @XmlElement(name = "Rldfu002Type", required = false)
    private Rldfu002Type rldfu002Type;

    /** 規費明細顯示資料. */
    @FieldName("規費明細顯示資料")
    @XmlElement(name = "ShowMap", required = false)
    private Map<String, ShowFeeDTO> showMap = new HashMap<String, ShowFeeDTO>();

    /** The show map key list. */
    @FieldName("規費明細顯示資料key值")
    @XmlElement(name = "ShowMapKeyList", required = false)
    private List<String> showMapKeyList = new ArrayList<String>();

    /** 警告訊息清單. */
    @FieldName("警告訊息清單")
    @XmlElement(name = "WarningMessgeList", required = false)
    private List<RlWarningMessage> warningMessgeList = new ArrayList<RlWarningMessage>();

    /** 錯誤訊息清單. */
    @XmlElement(name = "InitErrorMessageList", required = true)
    @FieldName("錯誤訊息清單")
    private List<List<String>> initErrorMessageList = new ArrayList<List<String>>();

    /** 有申請份數的申請書. */
    @XmlElement(name = "HaveApplyCntList", required = true)
    @FieldName("有申請份數的申請書")
    private List<String> haveApplyCntList = new ArrayList<String>();

    /** 不可作廢的申請書. */
    @XmlElement(name = "NotCancelList", required = true)
    @FieldName("不可作廢的申請書")
    private List<String> notCancelList = new ArrayList<String>();

    /** 須修改申請書copies欄位清單. */
    @XmlElement(name = "EditCopiesList", required = true)
    @FieldName("不可作廢的申請書")
    private List<String> editCopiesList = new ArrayList<String>();

    /** 有2筆以上申請書作業編號. */
    @XmlElement(name = "ApplicationList", required = true)
    @FieldName("有2筆以上申請書作業編號")
    private List<String> applicationList = new ArrayList<String>();

    /** 規費名稱需顯示姓名的作業清單. */
    @XmlElement(name = "HavePersonNameList", required = true)
    @FieldName("規費名稱需顯示姓名的作業清單")
    private List<String> havePersonNameList = new ArrayList<String>();

    /** 初始化錯誤Exception. */
    @XmlElement(name = "InitErrorMessageList", required = true)
    @FieldName("初始化錯誤Exception")
    private Exception initException;

    /** 繳費方式. */
    @XmlElement(name = "PaymentWay", required = true)
    @FieldName("繳費方式")
    private String paymentWay;

    /** 規費傳輸物件. */
    @XmlElement(name = "FeeDTO", required = true)
    @FieldName("規費傳輸物件")
    private FeeDTO feeDTO = new FeeDTO();

    /** 申請人1是否為電腦化前人口. */
    @XmlElement(name = "ApplicantComputer1", required = true)
    @FieldName("申請人1是否為電腦化前人口")
    private boolean applicantComputer1 = false;

    /** 申請人2是否為電腦化前人口. */
    @XmlElement(name = "ApplicantComputer2", required = true)
    @FieldName("申請人2是否為電腦化前人口")
    private boolean applicantComputer2 = false;

    /**
     * Gets the opening operation dto.
     * 
     * @return the opening operation dto
     */
    public OpeningOperationDTO getOpeningOperationDTO() {
        return openingOperationDTO;
    }

    /**
     * Sets the opening operation dto.
     * 
     * @param openingOperationDTO
     *            the new opening operation dto
     */
    public void setOpeningOperationDTO(final OpeningOperationDTO openingOperationDTO) {
        this.openingOperationDTO = openingOperationDTO;
    }

    /**
     * Gets the main fee.
     * 
     * @return the main fee
     */
    public XLDFDomainObject getMainFee() {
        return mainFee;
    }

    /**
     * Sets the main fee.
     * 
     * @param mainFee
     *            the new main fee
     */
    public void setMainFee(final XLDFDomainObject mainFee) {
        this.mainFee = mainFee;
    }

    /**
     * Gets the fee detail list.
     * 
     * @return the fee detail list
     */
    public List<ShowFeeDetailDTO> getFeeDetailList() {
        return feeDetailList;
    }

    /**
     * Sets the fee detail list.
     * 
     * @param feeDetailList
     *            the new fee detail list
     */
    public void setFeeDetailList(final List<ShowFeeDetailDTO> feeDetailList) {
        this.feeDetailList = feeDetailList;
    }

    /**
     * Gets the rl0a300 data.
     * 
     * @return the rl0a300 data
     */
    public Rl0a300DataDTO getRl0a300Data() {
        return rl0a300Data;
    }

    /**
     * Sets the rl0a300 data.
     * 
     * @param rl0a300Data
     *            the new rl0a300 data
     */
    public void setRl0a300Data(final Rl0a300DataDTO rl0a300Data) {
        this.rl0a300Data = rl0a300Data;
    }

    /**
     * Gets the show map.
     * 
     * @return the show map
     */
    public Map<String, ShowFeeDTO> getShowMap() {
        return showMap;
    }

    /**
     * Sets the show map.
     * 
     * @param showMap
     *            the show map
     */
    public void setShowMap(final Map<String, ShowFeeDTO> showMap) {
        this.showMap = showMap;
    }

    /**
     * Gets the show map key list.
     * 
     * @return the show map key list
     */
    public List<String> getShowMapKeyList() {
        return showMapKeyList;
    }

    /**
     * Sets the show map key list.
     * 
     * @param showMapKeyList
     *            the new show map key list
     */
    public void setShowMapKeyList(final List<String> showMapKeyList) {
        this.showMapKeyList = showMapKeyList;
    }

    /**
     * Gets the warning messge list.
     * 
     * @return the warning messge list
     */
    public List<RlWarningMessage> getWarningMessgeList() {
        return warningMessgeList;
    }

    /**
     * Sets the warning messge list.
     * 
     * @param warningMessgeList
     *            the new warning messge list
     */
    public void setWarningMessgeList(final List<RlWarningMessage> warningMessgeList) {
        this.warningMessgeList = warningMessgeList;
    }

    /**
     * Gets the rldfu001 list.
     * 
     * @return the rldfu001 list
     */
    public List<Rldfu001Type> getRldfu001List() {
        return rldfu001List;
    }

    /**
     * Sets the rldfu001 list.
     * 
     * @param rldfu001List
     *            the new rldfu001 list
     */
    public void setRldfu001List(final List<Rldfu001Type> rldfu001List) {
        this.rldfu001List = rldfu001List;
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
     * Gets the inits the error message list.
     * 
     * @return the inits the error message list
     */
    public List<List<String>> getInitErrorMessageList() {
        return initErrorMessageList;
    }

    /**
     * Sets the inits the error message list.
     * 
     * @param initErrorMessageList
     *            the new inits the error message list
     */
    public void setInitErrorMessageList(final List<List<String>> initErrorMessageList) {
        this.initErrorMessageList = initErrorMessageList;
    }

    /**
     * Gets the inits the exception.
     * 
     * @return the inits the exception
     */
    public Exception getInitException() {
        return initException;
    }

    /**
     * Sets the inits the exception.
     * 
     * @param initException
     *            the new inits the exception
     */
    public void setInitException(final Exception initException) {
        this.initException = initException;
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
     * Gets the have apply cnt list.
     * 
     * @return the have apply cnt list
     */
    public List<String> getHaveApplyCntList() {
        return haveApplyCntList;
    }

    /**
     * Sets the have apply cnt list.
     * 
     * @param haveApplyCntList
     *            the new have apply cnt list
     */
    public void setHaveApplyCntList(final List<String> haveApplyCntList) {
        this.haveApplyCntList = haveApplyCntList;
    }

    /**
     * Gets the not cancel list.
     * 
     * @return the not cancel list
     */
    public List<String> getNotCancelList() {
        return notCancelList;
    }

    /**
     * Sets the not cancel list.
     * 
     * @param notCancelList
     *            the new not cancel list
     */
    public void setNotCancelList(final List<String> notCancelList) {
        this.notCancelList = notCancelList;
    }

    /**
     * Gets the fee dto.
     * 
     * @return the fee dto
     */
    public FeeDTO getFeeDTO() {
        return feeDTO;
    }

    /**
     * Sets the fee dto.
     * 
     * @param feeDTO
     *            the new fee dto
     */
    public void setFeeDTO(final FeeDTO feeDTO) {
        this.feeDTO = feeDTO;
    }

    /**
     * Gets the rldfu002 type.
     * 
     * @return the rldfu002 type
     */
    public Rldfu002Type getRldfu002Type() {
        return rldfu002Type;
    }

    /**
     * Sets the rldfu002 type.
     * 
     * @param rldfu002Type
     *            the new rldfu002 type
     */
    public void setRldfu002Type(final Rldfu002Type rldfu002Type) {
        this.rldfu002Type = rldfu002Type;
    }

    /**
     * Gets the application list.
     * 
     * @return the application list
     */
    public List<String> getApplicationList() {
        return applicationList;
    }

    /**
     * Sets the application list.
     * 
     * @param applicationList
     *            the new application list
     */
    public void setApplicationList(final List<String> applicationList) {
        this.applicationList = applicationList;
    }

    /**
     * Gets the edits the copies list.
     * 
     * @return the edits the copies list
     */
    public List<String> getEditCopiesList() {
        return editCopiesList;
    }

    /**
     * Sets the edits the copies list.
     * 
     * @param editCopiesList
     *            the new edits the copies list
     */
    public void setEditCopiesList(final List<String> editCopiesList) {
        this.editCopiesList = editCopiesList;
    }

    /**
     * Checks if is applicant computer1.
     * 
     * @return true, if is applicant computer1
     */
    public boolean isApplicantComputer1() {
        return applicantComputer1;
    }

    /**
     * Sets the applicant computer1.
     * 
     * @param applicantComputer1
     *            the new applicant computer1
     */
    public void setApplicantComputer1(final boolean applicantComputer1) {
        this.applicantComputer1 = applicantComputer1;
    }

    /**
     * Checks if is applicant computer2.
     * 
     * @return true, if is applicant computer2
     */
    public boolean isApplicantComputer2() {
        return applicantComputer2;
    }

    /**
     * Sets the applicant computer2.
     * 
     * @param applicantComputer2
     *            the new applicant computer2
     */
    public void setApplicantComputer2(final boolean applicantComputer2) {
        this.applicantComputer2 = applicantComputer2;
    }

    /**
     * Gets the have person name list.
     * 
     * @return the have person name list
     */
    public List<String> getHavePersonNameList() {
        return havePersonNameList;
    }

    /**
     * Sets the have person name list.
     * 
     * @param havePersonNameList
     *            the new have person name list
     */
    public void setHavePersonNameList(final List<String> havePersonNameList) {
        this.havePersonNameList = havePersonNameList;
    }

}
