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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * The Class XLDFUpdateInsertedParams.
 * 
 * @author JL
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XLDFUpdateInsertedParams", propOrder = { "operationSequenceId", "DomainObj" })
@XmlRootElement(name = "XLDFUpdateInsertedParams")
public class XLDFUpdateInsertedParams {

    /** The operation sequence id. */
    @XmlElement(name = "OperationSequenceId")
    private Integer operationSequenceId;

    /** The domain obj. */
    @XmlElement(name = "DomainObj")
    private XLDFDomainObject domainObj;

    /**
     * Instantiates a new xLDF update inserted params.
     *
     * @param operationSequenceId the operation sequence id
     * @param domainObj the domain obj
     */
    public XLDFUpdateInsertedParams(final Integer operationSequenceId, final XLDFDomainObject domainObj) {
        super();
        this.operationSequenceId = operationSequenceId;
        this.domainObj = domainObj;
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
     * @param operationSequenceId the new operation sequence id
     */
    public void setOperationSequenceId(final Integer operationSequenceId) {
        this.operationSequenceId = operationSequenceId;
    }

    /**
     * Gets the domain obj.
     *
     * @return the domain obj
     */
    public XLDFDomainObject getDomainObj() {
        return domainObj;
    }

    /**
     * Sets the domain obj.
     *
     * @param domainObj the new domain obj
     */
    public void setDomainObj(final XLDFDomainObject domainObj) {
        this.domainObj = domainObj;
    }

}
