/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component.dto;

import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * The Class XLDFCreationParams.
 * 
 * @author JL
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XLDFCreationParams", propOrder = { "operationCode", "lock", "srcXldfObj" })
@XmlRootElement(name = "XLDFCreationParams")
public class XLDFCreationParams extends XLDFQueryParams {

    /** The operation code. */
    @XmlElement(name = "operationCode")
    private String operationCode;

    /** The lock. */
    @XmlElement(name = "lock")
    private boolean lock;

    private XLDFCreationValidator validator;

    /** 要處理的XLDFDomainObject */
    @XmlElement(name = "srcObj")
    private Object srcObj;

    /** 要處理的XLDFDomainObject */
    @XmlElement(name = "srcObj")
    private Map<Class<?>, List<?>> rldfDataMap;

    /** 從RlDFdataMap中找資料 */
    @XmlElement(name = "DoSearchRldfDataMap")
    private boolean doSearchRldfDataMap = Boolean.FALSE;

    public XLDFCreationParams(Integer operationSequenceId, Class<? extends XLDFDomainObject> domainType,
            String domainKey, String operationCode, boolean lock, XLDFCreationValidator validator) {
        super(operationSequenceId, domainType, domainKey);
        this.operationCode = operationCode;
        this.lock = lock;
        this.validator = validator;
    }

    /**
     * @param operationSequenceId
     * @param domainType
     * @param operationCode
     * @param lock
     * @param domainKey
     */
    public XLDFCreationParams(Integer operationSequenceId, Class<? extends XLDFDomainObject> domainType,
            String operationCode, boolean lock, String domainKey) {
        super(operationSequenceId, domainType, domainKey);
        this.operationCode = operationCode;
        this.lock = lock;
    }

    /**
     * @param operationSequenceId
     * @param domainType
     * @param operationCode
     * @param lock
     * @param domainKey
     */
    public XLDFCreationParams(Integer operationSequenceId, Class<? extends XLDFDomainObject> domainType,
            String operationCode, boolean lock, String domainKey, Map<Class<?>, List<?>> rldfDataMap) {
        super(operationSequenceId, domainType, domainKey);
        this.operationCode = operationCode;
        this.lock = lock;
        this.rldfDataMap = rldfDataMap;
        this.doSearchRldfDataMap = Boolean.TRUE;
    }

    /**
     * 
     * @param operationSequenceId
     * @param domainType
     * @param domainKey
     * @param operationCode
     * @param lock
     * @param validator
     */
    public XLDFCreationParams(Integer operationSequenceId, Class<? extends XLDFDomainObject> domainType,
            String domainKey, String operationCode, boolean lock, XLDFCreationValidator validator, Object srcObj) {
        super(operationSequenceId, domainType, domainKey);
        this.operationCode = operationCode;
        this.lock = lock;
        this.validator = validator;
        this.srcObj = srcObj;
    }

    public XLDFCreationValidator getValidator() {
        return validator;
    }

    public void setValidator(XLDFCreationValidator validator) {
        this.validator = validator;
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
    public void setOperationCode(String operationCode) {
        this.operationCode = operationCode;
    }

    /**
     * Checks if is lock.
     * 
     * @return true, if is lock
     */
    public boolean isLock() {
        return lock;
    }

    /**
     * Sets the lock.
     * 
     * @param lock
     *            the new lock
     */
    public void setLock(boolean lock) {
        this.lock = lock;
    }

    /**
     * @return the srcObj
     */
    public Object getSrcObj() {
        return srcObj;
    }

    /**
     * @param srcObj
     *            the srcObj to set
     */
    public void setSrcObj(Object srcObj) {
        this.srcObj = srcObj;
    }

    /**
     * @return the rldfDataMap
     */
    public Map<Class<?>, List<?>> getRldfDataMap() {
        return rldfDataMap;
    }

    /**
     * @param rldfDataMap
     *            the rldfDataMap to set
     */
    public void setRldfDataMap(Map<Class<?>, List<?>> rldfDataMap) {
        this.rldfDataMap = rldfDataMap;
    }

    /**
     * @return the doSearchRldfDataMap
     */
    public boolean isDoSearchRldfDataMap() {
        return doSearchRldfDataMap;
    }

    /**
     * @param doSearchRldfDataMap
     *            the doSearchRldfDataMap to set
     */
    public void setDoSearchRldfDataMap(boolean doSearchRldfDataMap) {
        this.doSearchRldfDataMap = doSearchRldfDataMap;
    }

}
