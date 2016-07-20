/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component.dto;

import java.io.Serializable;

/**
 * The Class CognosApplyCodeMapOperationCode.
 */
public class CognosApplyCodeMapOperationCode implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 6826121091827179282L;

    /** The cognos apply code. */
    private String cognosApplyCode;

    /** The print name. */
    private String printName;

    /** The apply code. */
    private String applyCode;

    /** The operation code. */
    private String operationCode;

    /** The independent use. */
    private boolean independentUse;

    /**
     * Gets the cognos apply code.
     * 
     * @return the cognos apply code
     */
    public String getCognosApplyCode() {
        return cognosApplyCode;
    }

    /**
     * Sets the cognos apply code.
     * 
     * @param cognosApplyCode
     *            the new cognos apply code
     */
    public void setCognosApplyCode(final String cognosApplyCode) {
        this.cognosApplyCode = cognosApplyCode;
    }

    /**
     * Gets the prints the name.
     * 
     * @return the prints the name
     */
    public String getPrintName() {
        return printName;
    }

    /**
     * Sets the prints the name.
     * 
     * @param printName
     *            the new prints the name
     */
    public void setPrintName(final String printName) {
        this.printName = printName;
    }

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
     * Checks if is independent use.
     * 
     * @return true, if is independent use
     */
    public boolean isIndependentUse() {
        return independentUse;
    }

    /**
     * Sets the independent use.
     * 
     * @param independentUse
     *            the new independent use
     */
    public void setIndependentUse(final boolean independentUse) {
        this.independentUse = independentUse;
    }
}
