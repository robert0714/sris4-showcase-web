/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component.dto;

import java.io.Serializable;
import java.util.List;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * 戶籍登記作業物件.
 * 
 * @author DAXIONG
 */
public class HouseholdOperation implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1834251998712940030L;

    /** 作業代碼. */
    @FieldName("作業代碼")
    private String operationCode;

    /** 作業類別. */
    @FieldName("作業類別")
    private String operationCategory;

    /** 作業名稱. */
    @FieldName("作業名稱")
    private String operationName;

    /** 作業列印名稱. */
    @FieldName("作業列印名稱")
    private String operationNameForPrinting;

    /** 作業頁面名稱. */
    @FieldName("作業頁面名稱")
    private String operationPageName;

    /** 作業階段. */
    @FieldName("作業階段")
    private String operationPhase;

    /** 是否可異地辦理. */
    @FieldName("是否可異地辦理")
    private boolean crossSiteEnabled;

    /**
     * L2 戶籍大簿頁是否顯示.<BR>
     * Default: true
     */
    @FieldName("L2 戶籍大簿頁是否顯示")
    private boolean householdPageEnabled = true;

    /** 申請人個數. */
    @FieldName("申請人個數")
    private int applicantNumber;

    /** 當事人是否必填. */
    @FieldName("當事人是否必填")
    private boolean currentPersonRequired;

    /** 是否必須是第一個作業. */
    @FieldName("是否必須是第一個作業")
    private boolean firstOperation;

    /**
     * 外籍者.<BR>
     * Default: false
     */
    @FieldName("外籍者")
    private boolean forForeignEnable = false;

    /**
     * 非逕為登記<BR>
     * Default: false.
     */
    @FieldName("非逕為登記")
    private boolean nonEnForceable = false;

    /** The applications. */
    @FieldName("申請書")
    private List<String> applications;

    /** 順序. */
    @FieldName("順序")
    private int order;

    /**
     * Checks if is first operation.
     * 
     * @return true, if is first operation
     */
    public boolean isFirstOperation() {
        return firstOperation;
    }

    /**
     * Sets the first operation.
     * 
     * @param firstOperation
     *            the new first operation
     */
    public void setFirstOperation(final boolean firstOperation) {
        this.firstOperation = firstOperation;
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
     * Gets the operation category.
     * 
     * @return the operation category
     */
    public String getOperationCategory() {
        return operationCategory;
    }

    /**
     * Sets the operation category.
     * 
     * @param operationCategory
     *            the new operation category
     */
    public void setOperationCategory(final String operationCategory) {
        this.operationCategory = operationCategory;
    }

    /**
     * Gets the operation name.
     * 
     * @return the operation name
     */
    public String getOperationName() {
        return operationName;
    }

    /**
     * Sets the operation name.
     * 
     * @param operationName
     *            the new operation name
     */
    public void setOperationName(final String operationName) {
        this.operationName = operationName;
    }

    /**
     * Gets the operation name for printing.
     * 
     * @return the operation name for printing
     */
    public String getOperationNameForPrinting() {
        return operationNameForPrinting;
    }

    /**
     * Sets the operation name for printing.
     * 
     * @param operationNameForPrinting
     *            the new operation name for printing
     */
    public void setOperationNameForPrinting(final String operationNameForPrinting) {
        this.operationNameForPrinting = operationNameForPrinting;
    }

    /**
     * Gets the operation page name.
     * 
     * @return the operation page name
     */
    public String getOperationPageName() {
        return operationPageName;
    }

    /**
     * Sets the operation page name.
     * 
     * @param operationPageName
     *            the new operation page name
     */
    public void setOperationPageName(final String operationPageName) {
        this.operationPageName = operationPageName;
    }

    /**
     * Checks if is cross site enabled.
     * 
     * @return true, if is cross site enabled
     */
    public boolean isCrossSiteEnabled() {
        return crossSiteEnabled;
    }

    /**
     * Sets the cross site enabled.
     * 
     * @param crossSiteEnabled
     *            the new cross site enabled
     */
    public void setCrossSiteEnabled(final boolean crossSiteEnabled) {
        this.crossSiteEnabled = crossSiteEnabled;
    }

    /**
     * Checks if is household page enabled.
     * 
     * @return true, if is household page enabled
     */
    public boolean isHouseholdPageEnabled() {
        return householdPageEnabled;
    }

    /**
     * Sets the household page enabled.
     * 
     * @param householdPageEnabled
     *            the new household page enabled
     */
    public void setHouseholdPageEnabled(final boolean householdPageEnabled) {
        this.householdPageEnabled = householdPageEnabled;
    }

    /**
     * Gets the applicant number.
     * 
     * @return the applicant number
     */
    public int getApplicantNumber() {
        return applicantNumber;
    }

    /**
     * Sets the applicant number.
     * 
     * @param applicantNumber
     *            the new applicant number
     */
    public void setApplicantNumber(int applicantNumber) {
        this.applicantNumber = applicantNumber;
    }

    /**
     * Checks if is current person required.
     * 
     * @return true, if is current person required
     */
    public boolean isCurrentPersonRequired() {
        return currentPersonRequired;
    }

    /**
     * Sets the current person required.
     * 
     * @param currentPersonRequired
     *            the new current person required
     */
    public void setCurrentPersonRequired(final boolean currentPersonRequired) {
        this.currentPersonRequired = currentPersonRequired;
    }

    /**
     * Gets the operation phase.
     * 
     * @return the operationPhase
     */
    public String getOperationPhase() {
        return operationPhase;
    }

    /**
     * Sets the operation phase.
     * 
     * @param operationPhase
     *            the operationPhase to set
     */
    public void setOperationPhase(final String operationPhase) {
        this.operationPhase = operationPhase;
    }

    /**
     * Checks if is for foreign enable.
     * 
     * @return true, if is for foreign enable
     */
    public boolean isForForeignEnable() {
        return forForeignEnable;
    }

    /**
     * Sets the for foreign enable.
     * 
     * @param forForeignEnable
     *            the new for foreign enable
     */
    public void setForForeignEnable(final boolean forForeignEnable) {
        this.forForeignEnable = forForeignEnable;
    }

    /**
     * Checks if is non en forceable.
     * 
     * @return true, if is non en forceable
     */
    public boolean isNonEnForceable() {
        return nonEnForceable;
    }

    /**
     * Sets the non en forceable.
     * 
     * @param nonEnForceable
     *            the new non en forceable
     */
    public void setNonEnForceable(final boolean nonEnForceable) {
        this.nonEnForceable = nonEnForceable;
    }

    /**
     * Gets the applications.
     * 
     * @return the applications
     */
    public List<String> getApplications() {
        return applications;
    }

    /**
     * Sets the applications.
     * 
     * @param applications
     *            the new applications
     */
    public void setApplications(final List<String> applications) {
        this.applications = applications;
    }

    /**
     * Gets the order.
     * 
     * @return the order
     */
    public int getOrder() {
        return order;
    }

    /**
     * Sets the order.
     * 
     * @param order
     *            the new order
     */
    public void setOrder(final int order) {
        this.order = order;
    }
}