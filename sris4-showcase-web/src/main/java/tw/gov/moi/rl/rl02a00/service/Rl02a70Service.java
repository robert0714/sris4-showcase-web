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
import tw.gov.moi.rl.domain.Rl02a70DTO;
import tw.gov.moi.rl.domain.Rl02a70ResultDTO;

/**
 * 國民身分證請領記錄查詢服務介面 Rl02a70Service
 */
public interface Rl02a70Service {

    /**
     * 查詢國民身分證請領記錄
     * 
     * @param rl02a70dto
     * @param executantType
     * @throws RisBusinessException
     */
    @WorkStatus(FinalType.FINAL)
    @RisServiceMethod(MethodType.QUERY)
    public List<Rl02a70ResultDTO> doQuery(Rl02a70DTO rl02a70dto, ExecutantType executantType)
            throws RisBusinessException;

}
