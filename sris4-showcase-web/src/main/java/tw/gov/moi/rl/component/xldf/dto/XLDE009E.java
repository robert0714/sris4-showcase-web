/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component.xldf.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.domain.Xlde009eType;
import tw.gov.moi.domain.Rlde009eType;
import tw.gov.moi.rl.component.dto.XLDFAction;
import tw.gov.moi.rl.component.dto.XLDFDomainKey;
import tw.gov.moi.rl.component.dto.XLDFDomainObject;
import tw.gov.moi.rl.component.dto.XLDFState;
import tw.gov.moi.rl.component.xldf.annotations.RldfMappingEntity;
import tw.gov.moi.rl.component.xldf.annotations.XldfDsNameMaping;
import tw.gov.moi.rl.component.xldf.annotations.XldfKeyMapping;
import tw.gov.moi.rl.utils.XLDFDomainKeyFormatUtils;
import tw.gov.moi.rl.utils.XLDFDomainUtils;

/**
 * The Class XLDE009E.
 *
 * @author JL
 */
@RldfMappingEntity(
        value = Rlde009eType.class ,
        entityDsName = "rlde009eByKey" ,
        xldfEntityClass = Xlde009eType.class ,        
        keys  = { 
            @XldfKeyMapping( name = "fineTransactionId" , length = 22),
            @XldfKeyMapping( name = "acceptSiteId" , length = 8),
            @XldfKeyMapping( name = "clauseType" , length = 2),
            @XldfKeyMapping( name = "clauseNo" , length = 2)

        }) 
@XldfDsNameMaping(xldfDsName = "xlde009eQuery", xldfDsByTrans = "xlde009eMaxSerialNo",  xldfDsBySerialNo = "xlde009eBySerialNo")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XLDE009E", propOrder = {
        "DomainObj"
})
@XmlRootElement(name = "XLDE009E")
public class XLDE009E implements XLDFDomainObject, java.io.Serializable {

	private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new XLDF
     */
    public XLDE009E(){
        super();
    }
    
    public XLDE009E(String fineTransactionId ,String acceptSiteId ,String clauseType ,String clauseNo ) {
        super();
        this.domainObj = new Xlde009eType();
        getDomainObj().setFineTransactionId(fineTransactionId); 
        getDomainObj().setAcceptSiteId(acceptSiteId); 
        getDomainObj().setClauseType(clauseType); 
        getDomainObj().setClauseNo(clauseNo); 

    }

    
    /** domainObj. */
    @XmlElement(name = "DomainObj")
    private Xlde009eType domainObj;

    /**
     * Gets the domain obj.
     *
     * @return the domain obj
     */
    public Xlde009eType getDomainObj() {
        return domainObj;
    }

    /**
     * Sets the domain obj.
     *
     * @param domainObj the new domain obj
     */
    public void setDomainObj(Xlde009eType domainObj) {
        this.domainObj = domainObj;
    }
    
    /*
     * (non-Javadoc)
     * 
     * @see
     * tw.gov.moi.rl.component.dto.XLDFDomainObject#getTransactionId()
     */
    @Override
    public String getTransactionId() {
        return getDomainObj() != null ? getDomainObj().getTransactionId() : null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see tw.gov.moi.rl.component.dto.XLDFDomainObject#getOperationSequenceId()
     */
    @Override
    public String getOperationSequenceId() {
        return getDomainObj() != null ? String.valueOf(getDomainObj().getSequenceId()) : null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see tw.gov.moi.rl.component.dto.XLDFDomainObject#getSequenceNumber()
     */
    @Override
    public String getSequenceNumber() {
        return getDomainObj() != null ? String.valueOf(getDomainObj().getSerialNo()) : null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see tw.gov.moi.rl.component.dto.XLDFDomainObject#getAction()
     */
    @Override
    public XLDFAction getAction() {
        return getDomainObj() != null ? XLDFDomainUtils.caseXldfAction(getDomainObj().getAction()) : XLDFAction.none;
    }

    /*
     * (non-Javadoc)
     * 
     * @see tw.gov.moi.rl.component.dto.XLDFDomainObject#getState()
     */
    @Override
    public XLDFState getState() {
        return getDomainObj() != null ? XLDFDomainUtils.caseXldfState(getDomainObj().getState()) : XLDFState.none;

    }

    /*
     * (non-Javadoc)
     * 
     * @see tw.gov.moi.rl.component.dto.XLDFDomainObject#isReadOnly()
     */
    @Override
    public boolean isReadOnly() {
        return getDomainObj() != null ? !Boolean.valueOf(getDomainObj().getLockMode()) : Boolean.FALSE;
    }

    /*
     * (non-Javadoc)
     * 
     * @see tw.gov.moi.rl.component.dto.XLDFDomainKey#getKeyValue()
     */
    @Override
    public String getKeyValue() {
        return XLDFDomainKeyFormatUtils.getXldfKey(this);
    }

    /*
     * (non-Javadoc)
     * 
     * @see tw.gov.moi.rl.component.dto.XLDFDomainObject#getDomainKey()
     */
    @Override
    public XLDFDomainKey getDomainKey() {
        return this;
    }

}
