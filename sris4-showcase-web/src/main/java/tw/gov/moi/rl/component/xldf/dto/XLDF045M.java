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
import tw.gov.moi.domain.Xldf045mType;
import tw.gov.moi.domain.Rldf045mType;
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
 * The Class XLDF045M.
 *
 * @author JL
 */
@RldfMappingEntity(
        value = Rldf045mType.class ,
        entityDsName = "rldf045mByKey" ,
        xldfEntityClass = Xldf045mType.class ,        
        keys  = { 
            @XldfKeyMapping( name = "personId" , length = 10),
            @XldfKeyMapping( name = "beginYyymmdd" , length = 7),
            @XldfKeyMapping( name = "noticeYyymmdd" , length = 7),
            @XldfKeyMapping( name = "noticeHhqqss" , length = 6),
            @XldfKeyMapping( name = "siteId" , length = 8)

        }) 
@XldfDsNameMaping(xldfDsName = "xldf045mQuery", xldfDsByTrans = "xldf045mMaxSerialNo",  xldfDsBySerialNo = "xldf045mBySerialNo")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XLDF045M", propOrder = {
        "domainObj"
})
@XmlRootElement(name = "XLDF045M")
public class XLDF045M implements XLDFDomainObject, java.io.Serializable {

	private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new XLDF
     */
    public XLDF045M(){
        super();
    }
    
    public XLDF045M(String personId ,String beginYyymmdd ,String noticeYyymmdd ,String noticeHhqqss ,String siteId ) {
        super();
        this.domainObj = new Xldf045mType();
        getDomainObj().setPersonId(personId); 
        getDomainObj().setBeginYyymmdd(beginYyymmdd); 
        getDomainObj().setNoticeYyymmdd(noticeYyymmdd); 
        getDomainObj().setNoticeHhqqss(noticeHhqqss); 
        getDomainObj().setSiteId(siteId); 

    }

    
    /** domainObj. */
    @XmlElement(name = "DomainObj")
    @FieldName("XLDF領域物件")
    private Xldf045mType domainObj;

    /**
     * Gets the domain obj.
     *
     * @return the domain obj
     */
    public Xldf045mType getDomainObj() {
        return domainObj;
    }

    /**
     * Sets the domain obj.
     *
     * @param domainObj the new domain obj
     */
    public void setDomainObj(Xldf045mType domainObj) {
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
