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
import tw.gov.moi.rl.domain.Rl01h22DTO;

/**
 * 街路門牌名稱中英文資料新增、修改、刪除處理服務Service Interface
 * 
 * @author Ahhong
 */
public interface Rl01h22Service {

    /**
     * 做初始化
     * 
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void init(ExecutantType executantType) throws RisBusinessException;

    /**
     * 開啟畫面
     * 
     * @param executantType
     * @param rl01h22DTO
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doLoadPage(Rl01h22DTO rl01h22DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 新增
     * 
     * @param executantType
     * @param rl01h22DTO
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.VERIFY)
    public void doAdd(Rl01h22DTO rl01h22DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 刪除
     * 
     * @param executantType
     * @param rl01h22DTO
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.DELETE)
    @WorkStatus(FinalType.FINAL)
    public void doDelete(Rl01h22DTO rl01h22DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 修改
     * 
     * @param executantType
     * @param rl01h22DTO
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void doModify(Rl01h22DTO rl01h22DTO, ExecutantType executantType) throws RisBusinessException;

}