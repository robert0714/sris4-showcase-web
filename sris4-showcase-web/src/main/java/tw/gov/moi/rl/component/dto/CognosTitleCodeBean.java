/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component.dto;

import java.io.Serializable;

/**
 * The Class CognosTitleCodeBean.
 * 
 * @author Jay Kan
 */
public class CognosTitleCodeBean implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -6464268664163012313L;

    /** The apply code. */
    private String applyCode;

    /** The column name. */
    private String columnName;

    /** The strategy. */
    private String strategy;

    /** The title code. */
    private String titleCode;
    
    private boolean noCondition;
    
    /** The operation code. */
    private String operationCode;

    /**
     * Gets the apply code.
     * 
     * @return the apply code
     */
    public String getApplyCode() {
        return applyCode;
    }

    /**
     * Sets the apply code.
     * 
     * @param applyCode
     *            the new apply code
     */
    public void setApplyCode(final String applyCode) {
        this.applyCode = applyCode;
    }

    /**
     * Gets the column name.
     * 
     * @return the column name
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * Sets the column name.
     * 
     * @param columnName
     *            the new column name
     */
    public void setColumnName(final String columnName) {
        this.columnName = columnName;
    }

    /**
     * Gets the strategy.
     * 
     * @return the strategy
     */
    public String getStrategy() {
        return strategy;
    }

    /**
     * Sets the strategy.
     * 
     * @param strategy
     *            the new strategy
     */
    public void setStrategy(final String strategy) {
        this.strategy = strategy;
    }

    /**
     * Gets the title code.
     * 
     * @return the title code
     */
    public String getTitleCode() {
        return titleCode;
    }

    /**
     * Sets the title code.
     * 
     * @param titleCode
     *            the new title code
     */
    public void setTitleCode(final String titleCode) {
        this.titleCode = titleCode;
    }

    public boolean isNoCondition() {
        return noCondition;
    }

    public void setNoCondition(boolean noCondition) {
        this.noCondition = noCondition;
    }

    public String getOperationCode() {
        return operationCode;
    }

    public void setOperationCode(String operationCode) {
        this.operationCode = operationCode;
    }

    
    
}
