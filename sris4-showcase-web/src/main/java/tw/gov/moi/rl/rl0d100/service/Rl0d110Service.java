/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl0d100.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl0d110DTO;

/**
 * 空白國民身分證(膠膜)領用確認 服務介面
 * 
 * @author Marcus Chen
 * 
 */
public interface Rl0d110Service {

    /** 執行「空白國民身分證(膠膜)領用確認 查詢」服務失敗 */
    final String DO_QUERY_ERROR = "執行「空白國民身分證(膠膜)領用確認 查詢」服務失敗";

    /** 執行「空白國民身分證(膠膜)領用確認 儲存」服務失敗 */
    final String DO_SAVE_ERROR = "執行「空白國民身分證(膠膜)領用確認 儲存」服務失敗";

    /**
     * 領用確認查詢處理
     * 
     * @param Rl0d110DTO
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doQuery(final Rl0d110DTO dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 領用確認存檔處理
     * 
     * @param Rl0f220DTO
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void doSave(final Rl0d110DTO dto, final ExecutantType executantType) throws RisBusinessException;

}
