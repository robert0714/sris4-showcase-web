/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component.dto;

/**
 * The Class XLDFMaintainParams.
 * 
 * @param <E>
 *            the element type
 * @author JL
 */
public class XLDFUpdateParams<E extends XLDFDomainObject> {

    /** The operation sequence id. */
    protected String operationSequenceId;

    /** The domain type. */
    protected E domainObject;

    /** The domain key. */
    protected Object[] domainKey;

    /**
     * Instantiates a new xLDF maintain params.
     * 
     * @param operationSequenceId
     *            the operation sequence id
     * @param domainObject
     *            the domain Object
     * @param domainKey
     *            the domain key
     */
    public XLDFUpdateParams(String operationSequenceId, E domainObject, Object... domainKey) {
        super();
        setParams(operationSequenceId, domainObject, domainKey);
    }

    /**
     * Sets the params.
     * 
     * @param operationSequenceId
     *            the operation sequence id
     * @param domainObject
     *            the domain Object
     * @param domainKey
     *            the domain key
     */
    private void setParams(String operationSequenceId, E domainObject, Object... domainKey) {
        this.operationSequenceId = operationSequenceId;
        this.domainObject = domainObject;
        this.domainKey = domainKey;
    }

    /**
     * Gets the operation sequence id.
     * 
     * @return the operation sequence id
     */
    public String getOperationSequenceId() {
        return operationSequenceId;
    }

    /**
     * Sets the operation sequence id.
     * 
     * @param operationSequenceId
     *            the new operation sequence id
     */
    public void setOperationSequenceId(String operationSequenceId) {
        this.operationSequenceId = operationSequenceId;
    }

    /**
     * Gets the domain object.
     * 
     * @return the domain object
     */
    public E getDomainObject() {
        return domainObject;
    }

    /**
     * Sets the domain object.
     * 
     * @param domainObject
     *            the new domain object
     */
    public void setDomainObject(E domainObject) {
        this.domainObject = domainObject;
    }

    /**
     * Gets the domain key.
     * 
     * @return the domain key
     */
    public Object[] getDomainKey() {
        return domainKey;
    }

    /**
     * Sets the domain key.
     * 
     * @param domainKey
     *            the new domain key
     */
    public void setDomainKey(Object[] domainKey) {
        this.domainKey = domainKey;
    }
}
