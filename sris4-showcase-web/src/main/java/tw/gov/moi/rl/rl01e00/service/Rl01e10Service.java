/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl01e00.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl01e10DTO;

/**
 * 稱號更改處理服務介面.
 * 
 */
public interface Rl01e10Service {

    /**
     * 初始化
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(value = MethodType.QUERY)
    void initOperation(final Rl01e10DTO dto, final ExecutantType executantType);

    /**
     * 執行資料驗證
     * 
     * @param Rl01e10DTO
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.VERIFY)
    void verifyAppData(Rl01e10DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 暫存稱謂更改資料至XLDF Table
     * 
     * @param Rl01e10DTO
     * @param executantType
     * @throws RisBusinessException
     *             RisBusinessException：「執行稱謂更改程式失敗」失敗
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    @WorkStatus(FinalType.TEMP_FINAL)
    void saveXldf(Rl01e10DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 刪除稱謂更改資料
     * 
     * @param Rl01e10DTO
     * @param executantType
     * @throws RisBusinessException
     *             RisBusinessException：「執行稱謂更改程式失敗」失敗
     */
    @RisServiceMethod(MethodType.DELETE)
    void doDelete(Rl01e10DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 載入稱謂更改作業編輯頁面
     * 
     * @param rl01e10DTO
     * @param executantType
     * @return Rl01e10DTO
     * @throws RisBusinessException
     *             RisBusinessException：「載入稱謂更改作業」失敗
     */

    Rl01e10DTO loadOperationDTO(Rl01e10DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 載入稱謂更改作業編輯後頁面
     * 
     * 
     * @param rl01e10DTO
     * @param executantType
     * @return Rl01e10DTO
     * @throws RisBusinessException
     *             RisBusinessException：「載入稱謂更改作業」失敗
     */
    @RisServiceMethod(MethodType.QUERY)
    Rl01e10DTO reviewOperationDTO(Rl01e10DTO dto, ExecutantType executantType) throws RisBusinessException;

}
