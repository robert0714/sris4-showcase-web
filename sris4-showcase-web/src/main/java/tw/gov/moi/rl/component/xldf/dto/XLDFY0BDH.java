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
import tw.gov.moi.domain.Xldfy0bdhType;
import tw.gov.moi.domain.Rldfy0bdhType;
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
 * The Class XLDFY0BDH.
 *
 * @author JL
 */
@RldfMappingEntity(
        value = Rldfy0bdhType.class ,
        entityDsName = "rldfy0bdhByKey" ,
        xldfEntityClass = Xldfy0bdhType.class ,        
        keys  = { 
            @XldfKeyMapping( name = "personId" , length = 10),
            @XldfKeyMapping( name = "removeYyymmdd" , length = 7),
            @XldfKeyMapping( name = "removeTime" , length = 6),
            @XldfKeyMapping( name = "registerYyymmdd" , length = 7),
            @XldfKeyMapping( name = "registerHhmmss" , length = 6),
            @XldfKeyMapping( name = "siteId" , length = 8)

        }) 
@XldfDsNameMaping(xldfDsName = "xldfy0bdhQuery", xldfDsByTrans = "xldfy0bdhMaxSerialNo",  xldfDsBySerialNo = "xldfy0bdhBySerialNo")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XLDFY0BDH", propOrder = {
        "domainObj"
})
@XmlRootElement(name = "XLDFY0BDH")
public class XLDFY0BDH implements XLDFDomainObject, java.io.Serializable {

	private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new XLDF
     */
    public XLDFY0BDH(){
        super();
    }
    
    public XLDFY0BDH(String personId ,String removeYyymmdd ,String removeTime ,String registerYyymmdd ,String registerHhmmss ,String siteId ) {
        super();
        this.domainObj = new Xldfy0bdhType();
        getDomainObj().setPersonId(personId); 
        getDomainObj().setRemoveYyymmdd(removeYyymmdd); 
        getDomainObj().setRemoveTime(removeTime); 
        getDomainObj().setRegisterYyymmdd(registerYyymmdd); 
        getDomainObj().setRegisterHhmmss(registerHhmmss); 
        getDomainObj().setSiteId(siteId); 

    }

    
    /** domainObj. */
    @XmlElement(name = "DomainObj")
    @FieldName("XLDF領域物件")
    private Xldfy0bdhType domainObj;

    /**
     * Gets the domain obj.
     *
     * @return the domain obj
     */
    public Xldfy0bdhType getDomainObj() {
        return domainObj;
    }

    /**
     * Sets the domain obj.
     *
     * @param domainObj the new domain obj
     */
    public void setDomainObj(Xldfy0bdhType domainObj) {
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
