/*
 * Copyright (c) 2010-2020 IISI. All rights reserved.
 * 
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl07400.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl07440DTO;
import tw.gov.moi.rl.domain.Rl07440ResultDTO;

/**
 * 催告個案資料刪除處理服務介面 Interface Rl07440Service.
 * 
 * @author kenfc
 */

public interface Rl07440Service {

    /**
     * 查詢輸入條件內容
     * 
     * @param Rl07440DTO
     * 
     * @return
     * 
     * @throws RisBusinessException
     *             ：執行「催告個案資料刪除處理服務」服務失敗(TX-6207-E)
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl07440DTO doQuery(Rl07440DTO rl07440DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 刪除催告個案資料
     * 
     * @param Rl07440DTO
     * 
     * @return rl07440ResultDTO
     * 
     * @throws RisBusinessException
     *             ：執行「刪除催告個案資料」服務失敗（TX-6209-E）
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void delData(Rl07440ResultDTO rl07440ResultDTO, ExecutantType executantType) throws RisBusinessException;
}
