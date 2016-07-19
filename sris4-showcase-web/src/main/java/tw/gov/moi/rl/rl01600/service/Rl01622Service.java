/*
 * Copyright (c) 2010-2020 IISI. All rights reserved.
 * 
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl01600.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl01622DTO;

/**
 * 門牌初編服務介面 Interface Rl01622Service.
 * 
 * @author kenfc
 */

public interface Rl01622Service {

    /**
     * 顯示門牌初編資料
     * 
     * @param Rl01622DTO
     * 
     * @param ExecutantType
     * 
     * @return Rl01622DTO
     * 
     * @throws RisBusinessException
     *             ：執行查詢作業失敗，（TX-B056-E）＋由RisCommon取得作業名稱
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl01622DTO verifyData(Rl01622DTO rl01622DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 儲存門牌初編資料
     * 
     * @param Rl01622DTO
     * 
     * @param ExecutantType
     * 
     * @return Rl01622DTO
     * 
     * @throws RisBusinessException
     *             ：執行下載作業失敗，（TX-B055-E）+ 由RisCommon取得作業名稱
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public Rl01622DTO doSave01(Rl01622DTO rl01622DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 儲存門牌初編資料
     * 
     * @param Rl01622DTO
     * 
     * @param ExecutantType
     * 
     * @return Rl01622DTO
     * 
     * @throws RisBusinessException
     *             ：執行下載作業失敗，（TX-B055-E）+ 由RisCommon取得作業名稱
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public Rl01622DTO doSave02(Rl01622DTO rl01622DTO, ExecutantType executantType) throws RisBusinessException;

}
