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
import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Xldf018dType;
import tw.gov.moi.domain.Rldf018dType;
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
 * The Class XLDF018D.
 *
 * @author JL
 */
@RldfMappingEntity(
        value = Rldf018dType.class ,
        entityDsName = "rldf018dByKey" ,
        xldfEntityClass = Xldf018dType.class ,        
        keys  = { 
            @XldfKeyMapping( name = "siteId" , length = 8),
            @XldfKeyMapping( name = "householdHeadId" , length = 10),
            @XldfKeyMapping( name = "householdId" , length = 8),
            @XldfKeyMapping( name = "seqNo" , length = 5),
            @XldfKeyMapping( name = "applyYyymmdd" , length = 7),
            @XldfKeyMapping( name = "applyHhmmss" , length = 6),
            @XldfKeyMapping( name = "personId" , length = 10)

        }) 
@XldfDsNameMaping(xldfDsName = "xldf018dQuery", xldfDsByTrans = "xldf018dMaxSerialNo",  xldfDsBySerialNo = "xldf018dBySerialNo")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XLDF018D", propOrder = {
        "domainObj"
})
@XmlRootElement(name = "XLDF018D")
public class XLDF018D implements XLDFDomainObject, java.io.Serializable {

	private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new XLDF
     */
    public XLDF018D(){
        super();
    }
    
    public XLDF018D(String siteId ,String householdHeadId ,String householdId ,String seqNo ,String applyYyymmdd ,String applyHhmmss ,String personId ) {
        super();
        this.domainObj = new Xldf018dType();
        getDomainObj().setSiteId(siteId); 
        getDomainObj().setHouseholdHeadId(householdHeadId); 
        getDomainObj().setHouseholdId(householdId); 
        getDomainObj().setSeqNo(seqNo); 
        getDomainObj().setApplyYyymmdd(applyYyymmdd); 
        getDomainObj().setApplyHhmmss(applyHhmmss); 
        getDomainObj().setPersonId(personId); 

    }

    
    /** domainObj. */
    @XmlElement(name = "DomainObj")
    @FieldName("XLDF領域物件")
    private Xldf018dType domainObj;

    /**
     * Gets the domain obj.
     *
     * @return the domain obj
     */
    public Xldf018dType getDomainObj() {
        return domainObj;
    }

    /**
     * Sets the domain obj.
     *
     * @param domainObj the new domain obj
     */
    public void setDomainObj(Xldf018dType domainObj) {
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
        return getDomainObj() != null ? !getDomainObj().isLockMode() : Boolean.FALSE;
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
