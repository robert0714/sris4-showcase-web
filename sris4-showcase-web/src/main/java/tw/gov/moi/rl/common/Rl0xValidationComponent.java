/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.common;

import java.util.List;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl0x001DTOResult;

/**
 * 職權更正共用元件介面.
 */
public interface Rl0xValidationComponent {

    void validateRldf004mExist(Object domainType, ExecutantType execute);

    void validateRldf004hExist(Object domainType, ExecutantType execute);

    void halfCharToFullChar(String[] columnCodes, List<Rl0x001DTOResult> editResult, String businessType,
            ExecutantType execute);

    public String helfCharToFullChar(String value, ExecutantType execute) throws RisBusinessException;
}
