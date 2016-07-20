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
import tw.gov.moi.rl.domain.Rl04211DTO;

/**
 * 登錄門牌整編資料(一對一)服務介面 Interface Rl04211Service.
 * 
 * @author kenfc
 */

public interface Rl04211Service {

    /**
     * 驗証查詢畫面輸入資料
     * 
     * @param Rl04211DTO
     * 
     * @return
     * 
     * @throws RisBusinessException
     *             ：執行「資料驗証登錄門牌整編資料(一對一)」服務失敗(TX-6387-E)
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl04211DTO verifyAppData(Rl04211DTO rl04211DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 儲存登錄門牌整編資料(一對一)
     * 
     * @param Rl04211DTO
     * 
     * @return rl04211ResultDTO
     * 
     * @throws RisBusinessException
     *             ：執行「儲存登錄門牌整編資料(一對一)」服務失敗（TX-6363-E）
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void saveRldf(Rl04211DTO rl04211DTO, ExecutantType executantType) throws RisBusinessException;
}
