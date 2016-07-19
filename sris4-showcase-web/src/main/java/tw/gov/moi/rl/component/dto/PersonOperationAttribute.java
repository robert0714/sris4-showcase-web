/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component.dto;

import java.io.Serializable;

/**
 * 個人作業的顯示判斷屬性物件.
 * 
 * @author CK Lin, Jay Kan
 * 
 */
public class PersonOperationAttribute implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 4782190375030248958L;

    /** 判斷的欄位名稱. */
    private String attributeName;

    /** 判斷的欄位值. */
    private String attributeValue;

    /**
     * Gets the attribute name.
     * 
     * @return the attribute name
     */
    public String getAttributeName() {
        return attributeName;
    }

    /**
     * Sets the attribute name.
     * 
     * @param attributeName
     *            the new attribute name
     */
    public void setAttributeName(final String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * Gets the attribute value.
     * 
     * @return the attribute value
     */
    public String getAttributeValue() {
        return attributeValue;
    }

    /**
     * Sets the attribute value.
     * 
     * @param attributeValue
     *            the new attribute value
     */
    public void setAttributeValue(final String attributeValue) {
        this.attributeValue = attributeValue;
    }
}
