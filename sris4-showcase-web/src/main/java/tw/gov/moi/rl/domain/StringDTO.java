/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * The Class StringDTO.
 */
public class StringDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 5455248137560244762L;

    /** The string. */
    @FieldName("字串")
    private String string;

    /**
     * Instantiates a new string dto.
     */
    public StringDTO() {

    }

    /**
     * Instantiates a new string dto.
     * 
     * @param pString
     *            the string
     */
    public StringDTO(final String pString) {
        this.string = pString;
    }

    /**
     * Gets the string.
     * 
     * @return the string
     */
    public String getString() {
        return string;
    }

    /**
     * Sets the string.
     * 
     * @param string
     *            the new string
     */
    public void setString(final String string) {
        this.string = string;
    }
}
