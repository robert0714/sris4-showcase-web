/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl08f00.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08f11DTO;

/**
 * 設定投票所資料介面Service Interface
 * 
 * @author Ahhong
 */
public interface Rl08f11Service {

    /**
     * 開啟畫面
     * 
     * @param executantType
     * @param rl08f11DTO
     * @throws RisBusinessException
     */
    public void doInitPage(Rl08f11DTO rl08f11DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 執行
     * 
     * @param executantType
     * @param rl08f11DTO
     * @throws RisBusinessException
     */
    @WorkStatus(FinalType.FINAL)
    public void doSave(Rl08f11DTO rl08f11DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 刪除
     * 
     * @param executantType
     * @param rl08f11DTO
     * @throws RisBusinessException
     */
    @WorkStatus(FinalType.FINAL)
    public void doDelete(Rl08f11DTO rl08f11DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 刪除
     * 
     * @param executantType
     * @param rl08f11DTO
     * @throws RisBusinessException
     */
    @WorkStatus(FinalType.FINAL)
    public void doDelete1(Rl08f11DTO rl08f11DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 查詢
     * 
     * @param executantType
     * @param rl08f11DTO
     * @throws RisBusinessException
     */
    @WorkStatus(FinalType.FINAL)
    public void doQuery(Rl08f11DTO rl08f11DTO, ExecutantType executantType) throws RisBusinessException;

}