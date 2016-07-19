/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl0f100.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl0f130DTO;

/**
 * 
 * 瑕疵退回確認及通報 服務介面
 * 
 * @author Marcus Chen
 * 
 */
public interface Rl0f130Service {

    /** 執行「瑕疵退回確認及通報查詢處理」服務失敗 */
    final String DO_QUERY_ERROR = "執行「瑕疵退回確認及通報查詢處理」服務失敗";

    /** 執行「瑕疵退回確認及通報存檔處理」服務失敗 */
    final String DO_SAVE_ERROR = "執行「瑕疵退回確認及通報存檔處理」服務失敗";

    /**
     * 瑕疵退回確認及通報查詢處理
     * 
     * @param rl0f130dto
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doQuery(final Rl0f130DTO dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 瑕疵退回確認及通報存檔處理
     * 
     * @param rl0f130dto
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void doSave(final Rl0f130DTO dto, final ExecutantType executant) throws RisBusinessException;
}
