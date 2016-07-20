/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl01h00.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl01h12DTO;

/**
 * 村里名稱中英文資料新增、修改、刪除處理服務Service Interface
 * 
 * @author Ahhong
 */
public interface Rl01h12Service {

    /**
     * 開啟畫面
     * 
     * @param executantType
     * @param rl01h12DTO
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doLoadPage(Rl01h12DTO rl01h12DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 新增
     * 
     * @param executantType
     * @param rl01h12DTO
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.VERIFY)
    public void doAdd(Rl01h12DTO rl01h12DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 刪除
     * 
     * @param executantType
     * @param rl01h12DTO
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.DELETE)
    @WorkStatus(FinalType.FINAL)
    public void doDelete(Rl01h12DTO rl01h12DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 修改
     * 
     * @param executantType
     * @param rl01h12DTO
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void doModify(Rl01h12DTO rl01h12DTO, ExecutantType executantType) throws RisBusinessException;

}