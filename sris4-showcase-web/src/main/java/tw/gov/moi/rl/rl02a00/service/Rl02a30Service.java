/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl02a00.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl02a30DTO;

/**
 * 國民身分證處理狀況登錄服務介面 Rl02a30Service
 */
public interface Rl02a30Service {

    final String DS_RLDF002D = "rl02a30.getRldf002d";
    final String DS_RLDF022D = "rl02a30.getRldf022d";
    final String DS_RLDF012D = "rl02a30.getRldf012d";

    /**
     * 查詢國民身分證處理狀況資料.
     * 
     * @param rl02a30dto
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doQuery(Rl02a30DTO rl02a30dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 儲存國民身分證處理相關資料
     * 
     * @param rl02a30dto
     * @param executantType
     * @throws RisBusinessException
     */
    @WorkStatus(FinalType.FINAL)
    @RisServiceMethod(MethodType.QUERY)
    public void doSave(Rl02a30DTO rl02a30dto, ExecutantType executantType) throws RisBusinessException;

}
