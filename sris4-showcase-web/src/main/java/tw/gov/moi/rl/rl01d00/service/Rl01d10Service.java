/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl01d00.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl01d10DTO;

/**
 * 稱謂代碼對照資料查詢處理服務介面.
 * 
 * @author JL
 */
public interface Rl01d10Service {

    /**
     * 查詢稱謂代碼對照資料.
     * 
     * @param dto
     *            資料傳輸物件
     * @param info
     *            使用者資訊
     * @throws RisBusinessException
     *             執行「查詢稱謂代碼對照資料」服務失敗（TX-6230-E）
     */
    @RisServiceMethod(value = MethodType.VERIFY)
    @WorkStatus(FinalType.FINAL)
    void verifyData(final Rl01d10DTO dto, final ExecutantType info) throws RisBusinessException;

    /**
     * 取得並下載稱謂代碼對照資料
     * 
     * @param dto
     *            資料傳輸物件
     * @param info
     *            使用者資訊
     */
    @RisServiceMethod(MethodType.DOWNLOAD)
    @WorkStatus(FinalType.FINAL)
    public void doDownload(final Rl01d10DTO dto, final ExecutantType info) throws RisBusinessException;

}
