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
import tw.gov.moi.domain.Xldfr074Type;
import tw.gov.moi.domain.Rldfr074Type;
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
 * The Class XLDFR074.
 *
 * @author JL
 */
@RldfMappingEntity(
        value = Rldfr074Type.class ,
        entityDsName = "rldfr074ByKey" ,
        xldfEntityClass = Xldfr074Type.class ,        
        keys  = { 
            @XldfKeyMapping( name = "personId" , length = 10),
            @XldfKeyMapping( name = "applyTransactionId" , length = 22),
            @XldfKeyMapping( name = "applySequenceId" , length = 12),
            @XldfKeyMapping( name = "siteId" , length = 8),
            @XldfKeyMapping( name = "applySeq" , length = 12)

        }) 
@XldfDsNameMaping(xldfDsName = "xldfr074Query", xldfDsByTrans = "xldfr074MaxSerialNo",  xldfDsBySerialNo = "xldfr074BySerialNo")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XLDFR074", propOrder = {
        "domainObj"
})
@XmlRootElement(name = "XLDFR074")
public class XLDFR074 implements XLDFDomainObject, java.io.Serializable {

	private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new XLDF
     */
    public XLDFR074(){
        super();
    }
    
    public XLDFR074(String personId ,String applyTransactionId ,Integer applySequenceId ,String siteId ,Integer applySeq ) {
        super();
        this.domainObj = new Xldfr074Type();
        getDomainObj().setPersonId(personId); 
        getDomainObj().setApplyTransactionId(applyTransactionId); 
        getDomainObj().setApplySequenceId(applySequenceId); 
        getDomainObj().setSiteId(siteId); 
        getDomainObj().setApplySeq(applySeq); 

    }

    
    /** domainObj. */
    @XmlElement(name = "DomainObj")
    @FieldName("XLDF領域物件")
    private Xldfr074Type domainObj;

    /**
     * Gets the domain obj.
     *
     * @return the domain obj
     */
    public Xldfr074Type getDomainObj() {
        return domainObj;
    }

    /**
     * Sets the domain obj.
     *
     * @param domainObj the new domain obj
     */
    public void setDomainObj(Xldfr074Type domainObj) {
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
