/*
 * Copyright (c) 2010-2020 IISI. All rights reserved.
 * 
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl04200.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl04212DTO;

/**
 * 登錄門牌整編資料(多對多)服務介面 Interface Rl04212Service.
 * 
 * @author kenfc
 */

public interface Rl04212Service {

    /**
     * 驗証查詢畫面輸入資料
     * 
     * @param Rl04212DTO
     * 
     * @return
     * 
     * @throws RisBusinessException
     *             ：執行「資料驗証登錄門牌整編資料(多對多)」服務失敗(TX-6387-E)
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl04212DTO verifyAppData(Rl04212DTO rl04212DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 儲存登錄門牌整編資料(多對多)
     * 
     * @param Rl04212DTO
     * 
     * @return rl04212ResultDTO
     * 
     * @throws RisBusinessException
     *             ：執行「儲存登錄門牌整編資料(多對多)」服務失敗（TX-6363-E）
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void saveRldf(Rl04212DTO rl04212DTO, ExecutantType executantType) throws RisBusinessException;
}
