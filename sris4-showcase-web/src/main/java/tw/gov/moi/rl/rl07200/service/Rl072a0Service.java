/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl07200.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.rl.domain.Rl072a0DTO;

/**
 * 查詢本戶所總人數/總戶數處理服務介面.
 * 
 * @author Derek Wang
 * 
 */
public interface Rl072a0Service {

    /**
     * Do query.
     * 
     * @param rl072a0DTO
     *            the rl072a0 dto
     * @param executantType
     *            the executant type
     * @return the rl072a0 dto
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl072a0DTO doQuery(final Rl072a0DTO rl072a0DTO, final ExecutantType executantType);
}
