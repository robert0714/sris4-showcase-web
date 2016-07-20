/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * The Class ValidationMessageDTO.
 */
public class ValidationMessageDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -1387658460116671365L;

    /** 訊息. */
    @FieldName("訊息")
    private Map<String, List<String>> message;

    /**
     * Instantiates a new validation message dto.
     * 
     * @param message
     *            the message
     */
    public ValidationMessageDTO(final Map<String, List<String>> message) {
        this.message = message;
    }

    /**
     * Gets the message.
     * 
     * @return the message
     */
    public Map<String, List<String>> getMessage() {
        return message;
    }

    /**
     * Sets the message.
     * 
     * @param message
     *            the message
     */
    public void setMessage(final Map<String, List<String>> message) {
        this.message = message;
    }
}
