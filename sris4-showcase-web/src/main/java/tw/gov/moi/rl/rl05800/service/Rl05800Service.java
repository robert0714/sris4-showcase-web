/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl05800.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl05800DTO;

/**
 * 查核他所未辦理完成案件處理情形介面Service Interface
 * 
 * @author Ahhong
 */
public interface Rl05800Service {

    /**
     * 做初始化
     * 
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void init(ExecutantType executantType) throws RisBusinessException;

    /**
     * 查核他所未辦理完成案件處理情形
     * 
     * @param rl05800DTO
     * @param executantType
     * @throws RisBusinessException
     */
    @WorkStatus(FinalType.FINAL)
    @RisServiceMethod(MethodType.QUERY)
    public void doQuery(Rl05800DTO rl05800DTO, ExecutantType executantType) throws RisBusinessException;

}