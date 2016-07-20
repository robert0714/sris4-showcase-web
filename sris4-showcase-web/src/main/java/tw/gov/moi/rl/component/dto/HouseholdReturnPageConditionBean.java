/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component.dto;

import java.io.Serializable;

/**
 * The Class HouseholdReturnPageBean.
 *  
 */
public class HouseholdReturnPageConditionBean implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 3923140623315190334L;
    
    private String propertyName;
    
    private String propertyValue;
    
    private String thenReturnPagePartPath;

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue;
    }

    public String getThenReturnPagePartPath() {
        return thenReturnPagePartPath;
    }

    public void setThenReturnPagePartPath(String thenReturnPagePartPath) {
        this.thenReturnPagePartPath = thenReturnPagePartPath;
    }

}
