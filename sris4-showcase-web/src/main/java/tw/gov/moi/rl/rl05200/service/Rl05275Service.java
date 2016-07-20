/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl05200.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl05275DTO;

/**
 * 入出境紀錄查詢處理服務介面
 * 
 * @author Marcus Chen
 * 
 */
public interface Rl05275Service {

    /** 執行「入出境紀錄查詢查詢」服務失敗 */
    final String DO_QUERY_ERROR = "執行「入出境紀錄查詢查詢」服務失敗";

    /**
     * 入出境紀錄查詢查詢
     * 
     * @param dto
     *            Rl05275DTO
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    @WorkStatus(FinalType.FINAL)
    public void doQuery(final Rl05275DTO dto, final ExecutantType executantType) throws RisBusinessException;
}
