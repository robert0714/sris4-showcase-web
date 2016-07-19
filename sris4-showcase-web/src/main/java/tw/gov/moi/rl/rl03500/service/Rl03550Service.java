/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl03500.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl03550DTO;

/**
 * 歷史門牌資料查詢服務介面Service Interface
 * 
 * @author Ahhong
 */
public interface Rl03550Service {

    /**
     * 查詢處理
     * 
     * @param rl03550DTO
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    @WorkStatus(FinalType.FINAL)
    public void doQuery(Rl03550DTO rl03550DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 選取處理
     * 
     * @param rl03550DTO
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    @WorkStatus(FinalType.FINAL)
    public void doSelect(Rl03550DTO rl03550DTO, ExecutantType executantType) throws RisBusinessException;

}