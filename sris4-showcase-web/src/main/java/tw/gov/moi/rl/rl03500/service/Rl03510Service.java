/*
 * Copyright (c) 2010-2020 IISI. All rights reserved.
 * 
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl03500.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl03510DTO;

/**
 * 全戶基本資料查詢服務介面 Interface Rl03510Service.
 * 
 * @author kenfc
 */

public interface Rl03510Service {

    /**
     * 查詢輸入條件內容
     * 
     * @param Rl03510DTO
     * 
     * @return
     * 
     * @throws RisBusinessException
     *             ：執行作業失敗(TX-6397-E) + extMessage = "查詢國民身分證註銷記錄"
     */
    @RisServiceMethod(MethodType.QUERY)
    @WorkStatus(FinalType.FINAL)
    public Rl03510DTO doQuery(Rl03510DTO rl03510DTO, ExecutantType executantType) throws RisBusinessException;

}
