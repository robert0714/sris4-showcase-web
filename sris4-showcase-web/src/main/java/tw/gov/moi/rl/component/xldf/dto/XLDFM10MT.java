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
import tw.gov.moi.domain.Xldfm10mtType;
import tw.gov.moi.domain.Tldfm10mType;
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
 * The Class XLDFM10MT.
 *
 * @author JL
 */
@RldfMappingEntity(
        value = Tldfm10mType.class ,
        entityDsName = "tldfm10mByKey" ,
        xldfEntityClass = Xldfm10mtType.class ,        
        keys  = { 
            @XldfKeyMapping( name = "personId" , length = 10),
            @XldfKeyMapping( name = "siteId" , length = 8),
            @XldfKeyMapping( name = "dataSiteId" , length = 8),
            @XldfKeyMapping( name = "applyTransactionId" , length = 22),
            @XldfKeyMapping( name = "applySequenceId" , length = 12),
            @XldfKeyMapping( name = "applySeq" , length = 12),
            @XldfKeyMapping( name = "applyType" , length = 1),
            @XldfKeyMapping( name = "applyCode" , length = 3),
            @XldfKeyMapping( name = "registerDate" , length = 7),
            @XldfKeyMapping( name = "registerTime" , length = 6)

        }) 
@XldfDsNameMaping(xldfDsName = "xldfm10mtQuery", xldfDsByTrans = "xldfm10mtMaxSerialNo",  xldfDsBySerialNo = "xldfm10mtBySerialNo")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XLDFM10MT", propOrder = {
        "domainObj"
})
@XmlRootElement(name = "XLDFM10MT")
public class XLDFM10MT implements XLDFDomainObject, java.io.Serializable {

	private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new XLDF
     */
    public XLDFM10MT(){
        super();
    }
    
    public XLDFM10MT(String personId ,String siteId ,String dataSiteId ,String applyTransactionId ,Integer applySequenceId ,Integer applySeq ,String applyType,String applyCode ,String registerDate,String registerTime) {
        super();
        this.domainObj = new Xldfm10mtType();
        getDomainObj().setPersonId(personId); 
        getDomainObj().setSiteId(siteId); 
        getDomainObj().setDataSiteId(dataSiteId); 
        getDomainObj().setApplyTransactionId(applyTransactionId); 
        getDomainObj().setApplySequenceId(applySequenceId); 
        getDomainObj().setApplySeq(applySeq); 
        getDomainObj().setApplyType(applyType); 
        
        getDomainObj().setApplyCode(applyCode); 
        getDomainObj().setRegisterDate(registerDate); 
        getDomainObj().setRegisterTime(registerTime); 
    }
    public XLDFM10MT(String personId ,String siteId ,String dataSiteId ,String applyTransactionId ,Integer applySequenceId ,Integer applySeq ,String applyType ) {
        super();
        this.domainObj = new Xldfm10mtType();
        getDomainObj().setPersonId(personId); 
        getDomainObj().setSiteId(siteId); 
        getDomainObj().setDataSiteId(dataSiteId); 
        getDomainObj().setApplyTransactionId(applyTransactionId); 
        getDomainObj().setApplySequenceId(applySequenceId); 
        getDomainObj().setApplySeq(applySeq); 
        getDomainObj().setApplyType(applyType); 

    }
    
    /** domainObj. */
    @XmlElement(name = "DomainObj")
    @FieldName("XLDF領域物件")
    private Xldfm10mtType domainObj;

    /**
     * Gets the domain obj.
     *
     * @return the domain obj
     */
    public Xldfm10mtType getDomainObj() {
        return domainObj;
    }

    /**
     * Sets the domain obj.
     *
     * @param domainObj the new domain obj
     */
    public void setDomainObj(Xldfm10mtType domainObj) {
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
