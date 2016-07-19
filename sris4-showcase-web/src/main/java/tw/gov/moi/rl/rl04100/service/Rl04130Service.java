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
import tw.gov.moi.rl.domain.Rl04130DTO;

/**
 * 行政區域調整登錄更正處理服務介面.
 * 
 * @author Mego Peng
 */

public interface Rl04130Service {

    /**
     * 驗証查詢畫面輸入資料
     * 
     * @param Rl04130DTO
     * @param ExecutantType
     * @throws RisBusinessException
     *             ：資料驗證失敗(TX-6387-E) 資料驗證登錄行政區域調整
     */
    @RisServiceMethod(MethodType.QUERY)
    public void verifyAppData(Rl04130DTO rl04130DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 儲存行政區域調整登錄更正
     * 
     * @param Rl04130DTO
     * @param ExecutantType
     * @throws RisBusinessException
     *             ：執行存檔失敗(TX-6363-E) 儲存行政區域調整登錄更正
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void saveData(Rl04130DTO rl04130DTO, ExecutantType executantType) throws RisBusinessException;
}
