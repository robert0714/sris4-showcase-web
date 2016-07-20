/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl01600.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl01625DTO;

/**
 * 門牌合併服務介面Service Interface
 * 
 * @author Ahhong
 */
public interface Rl01625Service {

    /**
     * 驗證門牌合併
     * 
     * @param rl01625DTO
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void verifyData(Rl01625DTO rl01625DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 儲存門牌合併
     * 
     * @param rl01625DTO
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void doSave(Rl01625DTO rl01625DTO, ExecutantType executantType) throws RisBusinessException;
}