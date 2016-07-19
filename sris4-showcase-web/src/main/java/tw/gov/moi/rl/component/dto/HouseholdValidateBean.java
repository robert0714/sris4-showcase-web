/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component.dto;

import java.io.Serializable;
import java.util.Map;

/**
 * The Class HouseholdValidateBean.
 * 
 * @author Jay Kan
 */
public class HouseholdValidateBean implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 3923140623325060334L;

    /** 表格名稱. */
    private String tableName;

    /** 檢核規則. */
    private Map<String, String> ruleMap;

    /** 訊息代碼. */
    private String messageCode;

    /** 延伸訊息. */
    private String extMessage;

    /** 延伸訊息參數. */
    private Map<String, String> extMessageParamMap;

    /**
     * Gets the table name.
     * 
     * @return the table name
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * Sets the table name.
     * 
     * @param tableName
     *            the new table name
     */
    public void setTableName(final String tableName) {
        this.tableName = tableName;
    }

    /**
     * Gets the rule map.
     * 
     * @return the rule map
     */
    public Map<String, String> getRuleMap() {
        return ruleMap;
    }

    /**
     * Sets the rule map.
     * 
     * @param ruleMap
     *            the rule map
     */
    public void setRuleMap(final Map<String, String> ruleMap) {
        this.ruleMap = ruleMap;
    }

    /**
     * Gets the message code.
     * 
     * @return the message code
     */
    public String getMessageCode() {
        return messageCode;
    }

    /**
     * Sets the message code.
     * 
     * @param messageCode
     *            the new message code
     */
    public void setMessageCode(final String messageCode) {
        this.messageCode = messageCode;
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
     * Gets the ext message param map.
     * 
     * @return the ext message param map
     */
    public Map<String, String> getExtMessageParamMap() {
        return extMessageParamMap;
    }

    /**
     * Sets the ext message param map.
     * 
     * @param extMessageParamMap
     *            the ext message param map
     */
    public void setExtMessageParamMap(final Map<String, String> extMessageParamMap) {
        this.extMessageParamMap = extMessageParamMap;
    }
}
