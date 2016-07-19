/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl0f200.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl0f210DTO;

/**
 * 空白國民身分證(膠膜)配賦資料查詢服務
 * 
 * @author Marcus Chen
 * 
 */
public interface Rl0f210Service {

    final String DO_QUERY_ERROR = "執行「配賦資料查詢處理」服務失敗";

    /**
     * 配賦資料查詢處理
     * 
     * @param Rl0f210DTO
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    @WorkStatus(FinalType.FINAL)
    public void doQuery(final Rl0f210DTO dto, final ExecutantType executantType) throws RisBusinessException;
}
