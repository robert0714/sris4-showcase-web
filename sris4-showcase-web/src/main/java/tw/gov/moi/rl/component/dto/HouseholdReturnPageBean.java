/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * The Class HouseholdReturnPageBean.
 * 
 */
public class HouseholdReturnPageBean implements Serializable {
    /** 作業代碼 */
    private String operationCode;

    /** RUL */
    private String thenReturnPagePartPath;

    /** 排除作業之作業代碼清單 */
    private List<String> excludeOperationCodeList;

    private static final long serialVersionUID = 1L;

    /** 檢核規則 */
    private Map<String, HouseholdReturnPageConditionBean> ruleMap;

    public List<String> getExcludeOperationCodeList() {
        return excludeOperationCodeList;
    }

    public String getOperationCode() {
        return operationCode;
    }

    public Map<String, HouseholdReturnPageConditionBean> getRuleMap() {
        return ruleMap;
    }

    public String getThenReturnPagePartPath() {
        return thenReturnPagePartPath;
    }

    public void setExcludeOperationCodeList(final List<String> excludeOperationCodeList) {
        this.excludeOperationCodeList = excludeOperationCodeList;
    }

    public void setOperationCode(final String operationCode) {
        this.operationCode = operationCode;
    }

    public void setRuleMap(final Map<String, HouseholdReturnPageConditionBean> ruleMap) {
        this.ruleMap = ruleMap;
    }

    public void setThenReturnPagePartPath(final String thenReturnPagePartPath) {
        this.thenReturnPagePartPath = thenReturnPagePartPath;
    }
}