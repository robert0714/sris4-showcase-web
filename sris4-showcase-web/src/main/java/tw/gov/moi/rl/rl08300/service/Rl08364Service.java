/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl08300.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08364DTO;

/**
 * 年終靜態資料刪除處理服務介面
 * 
 * @author Weiren.Jheng
 * 
 */
public interface Rl08364Service {

    /**
     * 驗証查詢輸入的資料是否重複
     * 
     * @param rl08364DTO
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.VERIFY)
    public void verifyData(Rl08364DTO rl08364DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 儲存年終靜態資料刪除
     * 
     * @param rl08364DTO
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.DELETE)
    @WorkStatus(FinalType.FINAL)
    public void saveData(Rl08364DTO rl08364DTO, ExecutantType executantType) throws RisBusinessException;
}
