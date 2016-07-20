/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl03500.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl03540DTO;

/**
 * 里鄰門牌資料查詢服務介面Service Interface
 * 
 * @author Ahhong
 */
public interface Rl03540Service {

    /**
     * 做初始化
     * 
     * @param executantType
     * @throws RisBusinessException
     */

    public void init(ExecutantType executantType) throws RisBusinessException;

    /**
     * 查詢處理
     * 
     * @param rl03540DTO
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    @WorkStatus(FinalType.FINAL)
    public void doQuery(Rl03540DTO rl03540DTO, ExecutantType executantType) throws RisBusinessException;

}