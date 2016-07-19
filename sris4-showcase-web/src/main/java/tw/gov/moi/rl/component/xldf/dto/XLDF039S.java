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
import tw.gov.moi.domain.Xldf039sType;
import tw.gov.moi.domain.Rldf039sType;
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
 * The Class XLDF039S.
 *
 * @author JL
 */
@RldfMappingEntity(
        value = Rldf039sType.class ,
        entityDsName = "rldf039sByKey" ,
        xldfEntityClass = Xldf039sType.class ,        
        keys  = { 
            @XldfKeyMapping( name = "siteId" , length = 8),
            @XldfKeyMapping( name = "statisticYyymm" , length = 7),
            @XldfKeyMapping( name = "village" , length = 32),
            @XldfKeyMapping( name = "inOutCode" , length = 1),
            @XldfKeyMapping( name = "registerTime" , length = 6),
            @XldfKeyMapping( name = "personId" , length = 10),
            @XldfKeyMapping( name = "applyTransactionId" , length = 22)

        }) 
@XldfDsNameMaping(xldfDsName = "xldf039sQuery", xldfDsByTrans = "xldf039sMaxSerialNo",  xldfDsBySerialNo = "xldf039sBySerialNo")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XLDF039S", propOrder = {
        "domainObj"
})
@XmlRootElement(name = "XLDF039S")
public class XLDF039S implements XLDFDomainObject, java.io.Serializable {

	private static final long serialVersionUID = 1L;

    /**
     * Instantiates a new XLDF
     */
    public XLDF039S(){
        super();
    }
    
    public XLDF039S(String siteId ,String statisticYyymm ,String village ,String inOutCode ,String registerTime ,String personId ,String applyTransactionId ) {
        super();
        this.domainObj = new Xldf039sType();
        getDomainObj().setSiteId(siteId); 
        getDomainObj().setStatisticYyymm(statisticYyymm); 
        getDomainObj().setVillage(village); 
        getDomainObj().setInOutCode(inOutCode); 
        getDomainObj().setRegisterTime(registerTime); 
        getDomainObj().setPersonId(personId); 
        getDomainObj().setApplyTransactionId(applyTransactionId); 

    }

    
    /** domainObj. */
    @XmlElement(name = "DomainObj")
    @FieldName("XLDF領域物件")
    private Xldf039sType domainObj;

    /**
     * Gets the domain obj.
     *
     * @return the domain obj
     */
    public Xldf039sType getDomainObj() {
        return domainObj;
    }

    /**
     * Sets the domain obj.
     *
     * @param domainObj the new domain obj
     */
    public void setDomainObj(Xldf039sType domainObj) {
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
