/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * The Class XLDFReadParams.
 * 
 * @author JL
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XLDFCreationParams", propOrder = { "operationSequenceId", "domainType", "domainKey" })
public class XLDFQueryParams {
    /** The operation sequence id. */
    @XmlElement(name = "operationSequenceId")
    protected Integer operationSequenceId;

    /** The domain type. */
    @XmlElement(name = "domainType")
    protected Class<? extends XLDFDomainObject> domainType;

    /** The domain key. */
    @XmlElement(name = "domainKey")
    protected String domainKey;

    /** 要處理的XLDFDomainObject */
    @XmlElement(name = "qSrcObj")
    private Object qSrcObj;

    /**
     * Instantiates a new xLDF maintain params.
     * 
     * @param operationSequenceId
     *            the operation sequence id
     * @param domainType
     *            the domain type
     * @param domainKey
     *            the domain key
     */
    public XLDFQueryParams(Integer operationSequenceId, Class<? extends XLDFDomainObject> domainType, String domainKey) {
        super();
        setParams(operationSequenceId, domainType, domainKey, null);
    }

    /**
     * Instantiates a new xLDF maintain params.
     * 
     * @param operationSequenceId
     *            the operation sequence id
     * @param domainType
     *            the domain type
     * @param domainKey
     *            the domain key
     */
    public XLDFQueryParams(Integer operationSequenceId, Class<? extends XLDFDomainObject> domainType, String domainKey,
            Object qSrcObj) {
        super();
        setParams(operationSequenceId, domainType, domainKey, qSrcObj);
    }

    /**
     * Sets the params.
     * 
     * @param operationSequenceId
     *            the operation sequence id
     * @param domainType
     *            the domain type
     * @param domainKey
     *            the domain key
     */
    private void setParams(Integer operationSequenceId, Class<? extends XLDFDomainObject> domainType, String domainKey,
            Object qSrcObj) {
        this.operationSequenceId = operationSequenceId;
        this.domainType = domainType;
        this.domainKey = domainKey;
        this.qSrcObj = qSrcObj;
    }

    /**
     * Gets the operation sequence id.
     * 
     * @return the operation sequence id
     */
    public Integer getOperationSequenceId() {
        return operationSequenceId;
    }

    /**
     * Sets the operation sequence id.
     * 
     * @param operationSequenceId
     *            the new operation sequence id
     */
    public void setOperationSequenceId(Integer operationSequenceId) {
        this.operationSequenceId = operationSequenceId;
    }

    /**
     * Gets the domain type.
     * 
     * @return the domain type
     */
    public Class<? extends XLDFDomainObject> getDomainType() {
        return domainType;
    }

    /**
     * Sets the domain type.
     * 
     * @param domainType
     *            the new domain type
     */
    public void setDomainType(Class<? extends XLDFDomainObject> domainType) {
        this.domainType = domainType;
    }

    /**
     * Gets the domain key.
     * 
     * @return the domain key
     */
    public String getDomainKey() {
        return domainKey;
    }

    /**
     * Sets the domain key.
     * 
     * @param domainKey
     *            the new domain key
     */
    public void setDomainKey(String domainKey) {
        this.domainKey = domainKey;
    }

    /**
     * @return the qSrcObj
     */
    public Object getqSrcObj() {
        return qSrcObj;
    }

    /**
     * @param qSrcObj
     *            the qSrcObj to set
     */
    public void setqSrcObj(Object qSrcObj) {
        this.qSrcObj = qSrcObj;
    }

}
