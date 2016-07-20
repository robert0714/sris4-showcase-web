/*
 * Copyright (c) 2010-2020 IISI. All rights reserved.
 * 
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl08900.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl089a0DTO;
import tw.gov.moi.rl.domain.Rl089a0ResultDTO;

/**
 * 登錄偽冒領及變造國民身分證資料服務介面 Interface Rl089a0Service.
 * 
 * @author kenfc
 */

public interface Rl089a0Service {

    /**
     * 載入偽冒領及變造國民身分證資料
     * 
     * @param Rl089a0DTO
     * 
     * @return
     * 
     * @throws RisBusinessException
     *             ：執行下載作業失敗，TX-6351-E+ 由RisCommon取得作業名稱
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl089a0DTO initialPageList(Rl089a0DTO rl089a0DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 登錄偽冒領及變造國民身分證資料
     * 
     * @param Rl089a0DTO
     * 
     * @return rl089a0ResultDTO
     * 
     * @throws RisBusinessException
     *             ：執行新增作業失敗，TX-6351-E+ 由RisCommon取得作業名稱
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public Rl089a0ResultDTO createQuantity(Rl089a0ResultDTO rl089a0ResultDTO, ExecutantType executantType)
            throws RisBusinessException;
}
