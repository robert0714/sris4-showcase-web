/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.List;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * The Class SpecialHouseholdOperation.
 * 
 * @author Jay Kan
 */
public class SpecialHouseholdOperation implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 6588656844777075323L;

    /** 作業代碼. */
    @FieldName("作業代碼")
    private String operationCode;

    /** The xldf domain objects. */
    @FieldName("領域物件")
    private List<String> xldfDomainObjects;

    /**
     * 是否完成. Default: false
     */
    @FieldName("是否完成")
    private boolean completion = false;

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
     * Gets the xldf domain objects.
     * 
     * @return the xldf domain objects
     */
    public List<String> getXldfDomainObjects() {
        return xldfDomainObjects;
    }

    /**
     * Sets the xldf domain objects.
     * 
     * @param xldfDomainObjects
     *            the new xldf domain objects
     */
    public void setXldfDomainObjects(final List<String> xldfDomainObjects) {
        this.xldfDomainObjects = xldfDomainObjects;
    }

    /**
     * Checks if is completion.
     * 
     * @return true, if is completion
     */
    public boolean isCompletion() {
        return completion;
    }

    /**
     * Sets the completion.
     * 
     * @param completion
     *            the new completion
     */
    public void setCompletion(final boolean completion) {
        this.completion = completion;
    }
}
