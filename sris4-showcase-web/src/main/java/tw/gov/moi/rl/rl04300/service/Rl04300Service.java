/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl04300.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl04300DTO;

/**
 * 製作歷史門牌初編資料表服務介面Service Interface
 * 
 * @author Ahhong
 */
public interface Rl04300Service {

    /**
     * 製作歷史門牌初編資料表
     * 
     * @param rl04300DTO
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.PRINT2SYS)
    public void doPrint(final Rl04300DTO rl04300DTO, final ExecutantType executantType) throws RisBusinessException;

    /** 批次作業 **/
    @RisServiceMethod(MethodType.GENREPORT)
    @WorkStatus(FinalType.FINAL)
    public void doBatchPrint(final Rl04300DTO rl04300DTO, final ExecutantType executantType)
            throws RisBusinessException;

    /** 預覽列印 **/
    @RisServiceMethod(MethodType.PRINT2SYS)
    public void doPreview(final Rl04300DTO rl04300DTO, final ExecutantType executantType) throws RisBusinessException;
}