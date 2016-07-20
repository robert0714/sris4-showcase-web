/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl08300.service;

import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08310DTO;

/**
 * The Interface Rl08310Service.
 */
public interface Rl08310Service {

    /**
     * Verify data.
     * 
     * @param rl08310DTO
     *            the rl08310 dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.BATCH)
    void verifyData(final Rl08310DTO rl08310DTO, final ExecutantType executantType);
}
