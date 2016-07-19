/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl05500.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl05540DTO;

/**
 * 新式國民身分證請領記錄重送中央服務介面Service Interface
 * 
 * @author Ahhong
 */
public interface Rl05540Service {

    /**
     * 請領紀錄查詢處理
     * 
     * @param rl05540DTO
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doQuery(Rl05540DTO rl05540DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 請領紀錄通報處理
     * 
     * @param rl05540DTO
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.NOTICE)
    @WorkStatus(FinalType.FINAL)
    public void sendNotice(Rl05540DTO rl05540DTO, ExecutantType executantType) throws RisBusinessException;

}