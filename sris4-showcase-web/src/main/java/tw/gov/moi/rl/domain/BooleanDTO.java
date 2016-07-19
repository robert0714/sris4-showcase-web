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
 * The Class BooleanDTO.
 */
public class BooleanDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -1619484991781886105L;

    /** The true or false. */
    @FieldName("真或假")
    private boolean trueOrFalse;

    /**
     * Instantiates a new boolean dto.
     */
    public BooleanDTO() {

    }

    /**
     * Instantiates a new boolean dto.
     * 
     * @param pTrueOrFalse
     *            the true or false
     */
    public BooleanDTO(final boolean pTrueOrFalse) {
        this.trueOrFalse = pTrueOrFalse;
    }

    /**
     * Checks if is true or false.
     * 
     * @return true, if is true or false
     */
    public boolean isTrueOrFalse() {
        return trueOrFalse;
    }

    /**
     * Sets the true or false.
     * 
     * @param trueOrFalse
     *            the new true or false
     */
    public void setTrueOrFalse(final boolean trueOrFalse) {
        this.trueOrFalse = trueOrFalse;
    }
}
