/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component.dto;


/**
 * The Interface XLDFDomainObject.
 *
 * @author JL
 */
public interface XLDFDomainObject extends XLDFDomainKey{
    
    /**
     * Gets the transaction id.
     *
     * @return the transaction id
     */
    String getTransactionId();

    /**
     * Gets the sequence id.
     *
     * @return the sequence id
     */
    String getOperationSequenceId();

    /**
     * Gets the serial no.
     *
     * @return the serial no
     */
    String getSequenceNumber();

    /**
     * Gets the action.
     *
     * @return the action
     */
    XLDFAction getAction();

    /**
     * Gets the state.
     *
     * @return the state
     */
    XLDFState getState();

    /**
     * Checks if is read only.
     *
     * @return true, if is read only
     */
    boolean isReadOnly();

    /**
     * Gets the domain key.
     *
     * @return the domain key
     */
    XLDFDomainKey getDomainKey();
}
