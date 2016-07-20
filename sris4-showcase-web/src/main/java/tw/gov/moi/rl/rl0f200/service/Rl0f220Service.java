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
import tw.gov.moi.rl.domain.Rl0f220DTO;

/**
 * 空白國民身分證(膠膜)配賦資料展開 服務
 * 
 * @author Marcus Chen
 * 
 */
public interface Rl0f220Service {

    final String DO_QUERY_ERROR = "執行「配賦資料展開查詢處理」服務失敗";

    final String DO_SAVE_ERROR = "執行「配賦資料展開存檔處理」服務失敗";

    final String TYPE_ONE = "空白國民身分證";

    final String TYPE_TWO = "膠膜";

    /**
     * 配賦資料展開查詢處理
     * 
     * @param Rl0f220DTO
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doQuery(final Rl0f220DTO dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 配賦資料展開存檔處理
     * 
     * @param Rl0f220DTO
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void doSave(final Rl0f220DTO dto, final ExecutantType executantType) throws RisBusinessException;

}
