/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component.dto;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import tw.gov.moi.rl.component.mutltiDataPocess.AppendGetMultiDatalogic;

/**
 * The Class XLDFReadParams.
 * 
 * @author JL
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XLDFCreationParams", propOrder = { "operationSequenceId", "operationCode", "lock", "srcObjs", "domainTypes",
        "domainKeys", "validators", "appendLogics" })
public class XLDFMultiCreationParams implements Serializable {
    
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 4189854781821873587L;

    /** The operation sequence id. */
    @XmlElement(name = "operationSequenceId")
    protected Integer operationSequenceId;

    /** The operation code. */
    @XmlElement(name = "operationCode")
    private String operationCode;

    /** The lock. */
    @XmlElement(name = "lock")
    private boolean lock;

    /**  要處理的RLDF Hibernate entitis. */
    @XmlElement(name = "srcObjs")
    private Object[] srcObjs;

    /** The domain type. */
    @XmlElement(name = "domainTypes")
    protected Class<? extends XLDFDomainObject>[] domainTypes;

    /** The domain key. */
    @XmlElement(name = "domainKeys")
    protected String[] domainKeys;

    /** The validators. */
    @XmlElement(name = "validators")
    private XLDFCreationValidator[] validators;

    /** The append logics. */
    @XmlElement(name = "appendLogics")
    private Class<? extends AppendGetMultiDatalogic>[] appendLogics;

    /**
     * Instantiates a new XLDF multi creation params.
     *
     * @param params the params
     * @param logic the logic
     */
    public XLDFMultiCreationParams(final XLDFCreationParams[] params, final Class<? extends AppendGetMultiDatalogic>[] logic) {
        this.domainTypes = new Class[params.length];
        this.domainKeys = new String[params.length];
        this.validators = new XLDFCreationValidator[params.length];
        this.appendLogics = logic;
        this.srcObjs = new Object[params.length];
        for (int i = 0; i < params.length; ++i) {
            this.domainTypes[i] = params[i].getDomainType();
            this.domainKeys[i] = params[i].getDomainKey();
            this.validators[i] = params[i].getValidator();
            this.srcObjs[i] = params[i].getSrcObj();
            this.operationSequenceId = params[i].getOperationSequenceId();
            this.operationCode = params[i].getOperationCode();
            this.lock = params[i].isLock();
        }
    }

    /**
     * Instantiates a new XLDF multi creation params.
     *
     * @param param the param
     * @param logic the logic
     */
    public XLDFMultiCreationParams(final XLDFCreationParams param, final Class<? extends AppendGetMultiDatalogic> logic) {
        this.operationSequenceId = param.getOperationSequenceId();
        this.domainTypes = new Class[] { param.getDomainType() };
        this.domainKeys = new String[] { param.getDomainKey() };
        this.operationCode = param.getOperationCode();
        this.lock = param.isLock();
        this.validators = new XLDFCreationValidator[] { param.getValidator() };
        this.appendLogics = new Class[] { logic };
        this.srcObjs = new Object[] { param.getSrcObj() };
    }

    /**
     * Instantiates a new XLDF multi creation params.
     *
     * @param paramList the param list
     * @param operationSequenceId the operation sequence id
     * @param operationCode the operation code
     * @param lock the lock
     */
    public XLDFMultiCreationParams(final List<XLDFCreationParams> paramList, final Integer operationSequenceId,
            final String operationCode, final boolean lock) {
        this.domainTypes = new Class[paramList.size()];
        this.domainKeys = new String[paramList.size()];
        this.validators = new XLDFCreationValidator[paramList.size()];
        this.srcObjs = new Object[paramList.size()];
        for (int i = 0; i < paramList.size(); ++i) {
            this.domainTypes[i] = paramList.get(i).getDomainType();
            this.domainKeys[i] = paramList.get(i).getDomainKey();
            this.validators[i] = paramList.get(i).getValidator();
            this.srcObjs[i] = paramList.get(i).getSrcObj();
        }
        this.operationSequenceId = operationSequenceId;
        this.operationCode = operationCode;
        this.lock = lock;
    }

    /**
     * Gets the operation sequence id.
     * 
     * @return the operation sequence id
     */
    public Integer getOperationSequenceId() {
        return this.operationSequenceId;
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
     * Gets the domain types.
     *
     * @return the domain types
     */
    public Class<? extends XLDFDomainObject>[] getDomainTypes() {
        return this.domainTypes;
    }

    /**
     * Sets the domain types.
     *
     * @param domainTypes the new domain types
     */
    public void setDomainTypes(Class<XLDFDomainObject>[] domainTypes) {
        this.domainTypes = domainTypes;
        if (domainTypes != null) {
            final Class<XLDFDomainObject>[] dest = new Class[domainTypes.length];
            System.arraycopy(domainTypes, 0, dest, 0, domainTypes.length);
            this.domainTypes = dest;
        } else {
            this.domainTypes = null;
        }
    }

    /**
     * Gets the domain keys.
     *
     * @return the domain keys
     */
    public String[] getDomainKeys() {        
        return this.domainKeys;
    }

    /**
     * Sets the domain keys.
     *
     * @param domainKeys the new domain keys
     */
    public void setDomainKeys(String[] domainKeys) {
        this.domainKeys = domainKeys;
        if (domainKeys  != null) {
            final String[] dest = new String[domainKeys.length];
            System.arraycopy(domainKeys, 0, dest, 0, domainKeys.length);
            this.domainKeys = dest;
        } else {
            this.srcObjs = null;
        }
    }

    /**
     * Gets the operation code.
     *
     * @return the operation code
     */
    public String getOperationCode() {
        return this.operationCode;
    }

    /**
     * Sets the operation code.
     *
     * @param operationCode the new operation code
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
        return this.lock;
    }

    /**
     * Sets the lock.
     *
     * @param lock the new lock
     */
    public void setLock(boolean lock) {
        this.lock = lock;
    }

    /**
     * Gets the src objs.
     *
     * @return the src objs
     */
    public Object[] getSrcObjs() {
        return this.srcObjs;
    }

    /**
     * Sets the src objs.
     *
     * @param srcObjs the new src objs
     */
    public void setSrcObjs(final Object[] srcObjs) {
        this.srcObjs = srcObjs;
        if (srcObjs != null) {
            final Object[] dest = new Object[srcObjs.length];
            System.arraycopy(srcObjs, 0, dest, 0, srcObjs.length);
            this.srcObjs = dest;
        } else {
            this.srcObjs = null;
        }
    }

    /**
     * Gets the append logics.
     *
     * @return the append logics
     */
    public Class<? extends AppendGetMultiDatalogic>[] getAppendLogics() {       
        return this.appendLogics;
    }

    /**
     * Sets the append logics.
     *
     * @param appendLogics the new append logics
     */
    public void setAppendLogics(Class<? extends AppendGetMultiDatalogic>[] appendLogics) {
        if(appendLogics!=null){
            final Class<? extends AppendGetMultiDatalogic>[] dest =new Class    [appendLogics.length];
            System.arraycopy(appendLogics, 0, dest, 0, appendLogics.length);
            this.appendLogics = dest;
        }else{
            this.appendLogics = null;
        }
    }
}
