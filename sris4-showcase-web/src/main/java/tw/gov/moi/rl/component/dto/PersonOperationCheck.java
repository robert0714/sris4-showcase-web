/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component.dto;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.common.constant.RlConstant.Operator;
import tw.gov.moi.rl.component.PersonOperationComponent;
import tw.gov.moi.rl.component.xldf.dto.XLDF004M;
import tw.gov.moi.rl.domain.PersonOperationCondition;

/**
 * 個人的戶籍登記判斷物件.
 * 
 * @author CK Lin, Jay Kan
 * 
 */
public class PersonOperationCheck implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8953206298225738930L;

    /** 個人類別型態. */
    @FieldName("個人類別型態")
    private List<String> personClassType = Arrays.asList(XLDF004M.class.getSimpleName());

    /** 使用者類型. */
    @FieldName("使用者類型")
    private String personType = PersonOperationComponent.TXN_PERSON;

    /** 個人資料判斷的欄位資訊. */
    @FieldName("個人資料判斷的欄位資訊")
    private List<PersonOperationCondition> personOperationConditions;

    /** 全戶資料判斷的欄位資訊. */
    @FieldName("全戶資料判斷的欄位資訊")
    private List<PersonOperationCondition> householdOperationConditions;

    /** 個人與全戶間運算子. */
    @FieldName("個人與全戶間運算子")
    private String personHouseholdOperator = Operator.AND.name();

    /** 作業代碼. */
    @FieldName("作業代碼")
    private String operationCode;

    /** 相關的作業代碼. */
    @FieldName("相關的作業代碼")
    private List<String> dependencyOperationCode;

    /** 延伸訊息. */
    @FieldName("延伸訊息")
    private String extMessage;

    /**
     * 作業是否顯示.<BR>
     * Default: true
     */
    @FieldName("作業是否顯示")
    private boolean enabled = true;

    /**
     * 書證是否可辦理.<BR>
     * Default: true
     */
    private boolean enableCertificate = true;

    /**
     * Gets the person class type.
     * 
     * @return the personclassType
     */
    public List<String> getPersonClassType() {
        return personClassType;
    }

    /**
     * Sets the person class type.
     * 
     * @param personClassType
     *            the personClassType to set
     */
    public void setPersonClassType(final List<String> personClassType) {
        this.personClassType = personClassType;
    }

    /**
     * Gets the person type.
     * 
     * @return the personType
     */
    public String getPersonType() {
        return personType;
    }

    /**
     * Sets the person type.
     * 
     * @param personType
     *            the personType to set
     */
    public void setPersonType(final String personType) {
        this.personType = personType;
    }

    /**
     * Gets the person operation conditions.
     * 
     * @return the person operation conditions
     */
    public List<PersonOperationCondition> getPersonOperationConditions() {
        return personOperationConditions;
    }

    /**
     * Sets the person operation conditions.
     * 
     * @param personOperationConditions
     *            the new person operation conditions
     */
    public void setPersonOperationConditions(final List<PersonOperationCondition> personOperationConditions) {
        this.personOperationConditions = personOperationConditions;
    }

    /**
     * Gets the household operation conditions.
     * 
     * @return the household operation conditions
     */
    public List<PersonOperationCondition> getHouseholdOperationConditions() {
        return householdOperationConditions;
    }

    /**
     * Sets the household operation conditions.
     * 
     * @param householdOperationConditions
     *            the new household operation conditions
     */
    public void setHouseholdOperationConditions(final List<PersonOperationCondition> householdOperationConditions) {
        this.householdOperationConditions = householdOperationConditions;
    }

    /**
     * Gets the person household operator.
     * 
     * @return the person household operator
     */
    public String getPersonHouseholdOperator() {
        return personHouseholdOperator;
    }

    /**
     * Sets the person household operator.
     * 
     * @param personHouseholdOperator
     *            the new person household operator
     */
    public void setPersonHouseholdOperator(final String personHouseholdOperator) {
        this.personHouseholdOperator = personHouseholdOperator;
    }

    /**
     * Gets the operation code.
     * 
     * @return the operationCode
     */
    public String getOperationCode() {
        return operationCode;
    }

    /**
     * Sets the operation code.
     * 
     * @param operationCode
     *            the operationCode to set
     */
    public void setOperationCode(final String operationCode) {
        this.operationCode = operationCode;
    }

    /**
     * Gets the dependency operation code.
     * 
     * @return the dependencyOperationCode
     */
    public List<String> getDependencyOperationCode() {
        return dependencyOperationCode;
    }

    /**
     * Sets the dependency operation code.
     * 
     * @param dependencyOperationCode
     *            the dependencyOperationCode to set
     */
    public void setDependencyOperationCode(final List<String> dependencyOperationCode) {
        this.dependencyOperationCode = dependencyOperationCode;
    }

    /**
     * Gets the ext message.
     * 
     * @return the ext message
     */
    public String getExtMessage() {
        return extMessage;
    }

    /**
     * Sets the ext message.
     * 
     * @param extMessage
     *            the new ext message
     */
    public void setExtMessage(final String extMessage) {
        this.extMessage = extMessage;
    }

    /**
     * Checks if is enabled.
     * 
     * @return true, if is enabled
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the enabled.
     * 
     * @param enabled
     *            the new enabled
     */
    public void setEnabled(final boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Checks if is enable certificate.
     * 
     * @return true, if is enable certificate
     */
    public boolean isEnableCertificate() {
        return enableCertificate;
    }

    /**
     * Sets the enable certificate.
     * 
     * @param enableCertificate
     *            the new enable certificate
     */
    public void setEnableCertificate(final boolean enableCertificate) {
        this.enableCertificate = enableCertificate;
    }
}
