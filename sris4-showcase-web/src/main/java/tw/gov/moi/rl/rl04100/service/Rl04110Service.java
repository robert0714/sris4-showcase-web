/*
 * Copyright (c) 2010-2020 IISI. All rights reserved.
 * 
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl04100.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl04110DTO;

/**
 * 登錄行政區域調整處理服務介面 .
 * 
 * @author Mego Peng
 */

public interface Rl04110Service {

    /**
     * 驗証查詢畫面輸入資料
     * 
     * @param Rl04110DTO
     * @param ExecutantType
     * @throws RisBusinessException
     *             ：資料驗證失敗(TX-6387-E) 資料驗證登錄行政區域調整
     */
    @RisServiceMethod(MethodType.QUERY)
    public void verifyAppData(Rl04110DTO rl04110DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 儲存登錄行政區域調整
     * 
     * @param Rl04110DTO
     * @param ExecutantType
     * @throws RisBusinessException
     *             ：執行存檔失敗(TX-6363-E) 儲存登錄行政區域調整
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void saveData(Rl04110DTO rl04110DTO, ExecutantType executantType) throws RisBusinessException;
}
