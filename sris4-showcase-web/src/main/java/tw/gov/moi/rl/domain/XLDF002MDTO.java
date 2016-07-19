/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.beanutils.BeanUtils;

import tw.gov.moi.domain.Xldf002mType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.common.constant.RlTxCodeConstant;
import tw.gov.moi.rl.component.dto.XLDFDomainObject;
import tw.gov.moi.rl.component.xldf.dto.XLDF002M;


/**
 * XLDF002MDTO
 * 
 * @author DAXIONG
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XLDF002MDTO")
public class XLDF002MDTO extends XLDFHouseholdNoteDTO {

    private static final long serialVersionUID = 1L;

    @Override
    public XLDFDomainObject makeXLDFDomainObject() {

        XLDF002M result = new XLDF002M();
        result.setDomainObj(new Xldf002mType());

        try {
            BeanUtils.copyProperties(result.getDomainObj(), this);
        } catch (Exception e) {
            throw new RisBusinessException(tw.gov.moi.rs.common.constant.RsCDMesg.TX6099E, e);
        }

        return result;
    }

}
