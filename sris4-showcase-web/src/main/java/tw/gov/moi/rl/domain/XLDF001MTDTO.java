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

import tw.gov.moi.domain.Xldf001mtType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.common.constant.RlTxCodeConstant;
import tw.gov.moi.rl.component.dto.XLDFDomainObject;
import tw.gov.moi.rl.component.xldf.dto.XLDF001MT;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XLDF001MTDTO")
public class XLDF001MTDTO extends XLDFHouseholdDataDTO {

    private static final long serialVersionUID = 1L;

    @Override
    public XLDFDomainObject makeXLDFDomainObject() {

        XLDF001MT result = new XLDF001MT();
        result.setDomainObj(new Xldf001mtType());
        try {
            BeanUtils.copyProperties(result.getDomainObj(), this);
        } catch (Exception e) {
            throw new RisBusinessException(tw.gov.moi.rs.common.constant.RsCDMesg.TX6099E, e);
        }

        return result;
    }

}