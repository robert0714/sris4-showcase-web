/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl02a00.service;

import java.util.List;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl02ad0DTO;
import tw.gov.moi.rl.domain.Rl02ad0ResultDTO;

/**
 * 國民身分證註銷記錄查詢服務介面 Rl02ad0Service
 */
public interface Rl02ad0Service {

    /**
     * 查詢國民身分證註銷記錄
     * 
     * @param rl02ad0dto
     *            the rl02ad0dto
     * @param executantType
     *            the executant type
     * @return the list
     * @throws RisBusinessException
     *             the ris business exception
     */
    @WorkStatus(FinalType.FINAL)
    @RisServiceMethod(MethodType.QUERY)
    public List<Rl02ad0ResultDTO> doQuery(Rl02ad0DTO rl02ad0dto, ExecutantType executantType)
            throws RisBusinessException;

}
