/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.beanutils.BeanUtils;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Xldf005hType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.common.constant.RlTxCodeConstant;
import tw.gov.moi.rl.component.dto.XLDFDomainObject;
import tw.gov.moi.rl.component.xldf.dto.XLDF005H;
import tw.gov.moi.rl.dto.rl00001.XLDFRemoveDTO;

/**
 * XLDF005HDTO
 * 
 * @author DAXIONG
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XLDF005HDTO", propOrder = { "removeYyymmdd", "removeTime" })
public class XLDF005HDTO extends XLDFPersonNoteDTO {

    private static final long serialVersionUID = 1L;

    /** 除戶日期 */
    @XmlElement(name = "RemoveYyymmdd", required = true)
    @FieldName("除戶日期")
    private String removeYyymmdd;

    /** 除戶時間 */
    @XmlElement(name = "RemoveTime", required = true)
    @FieldName("除戶時間")
    private String removeTime;

    @Override
    public XLDFDomainObject makeXLDFDomainObject() {

        XLDF005H result = new XLDF005H();
        result.setDomainObj(new Xldf005hType());

        try {
            BeanUtils.copyProperties(result.getDomainObj(), this);
        } catch (Exception e) {
            throw new RisBusinessException(tw.gov.moi.rs.common.constant.RsCDMesg.TX6099E, e);
        }
        return result;
    }

    public String getRemoveYyymmdd() {
        return removeYyymmdd;
    }

    public void setRemoveYyymmdd(String removeYyymmdd) {
        this.removeYyymmdd = removeYyymmdd;
    }

    public String getRemoveTime() {
        return removeTime;
    }

    public void setRemoveTime(String removeTime) {
        this.removeTime = removeTime;
    }

    /*
     * (non-Javadoc)
     * 
     * @see tw.gov.moi.rl.dto.rl00001.XLDFPersonNoteDTO#getRemoveDTO()
     */
    @Override
    public XLDFRemoveDTO getRemoveDTO() {
        return new XLDFSimpleRemoveDTO(removeYyymmdd, removeTime);
    }

}
