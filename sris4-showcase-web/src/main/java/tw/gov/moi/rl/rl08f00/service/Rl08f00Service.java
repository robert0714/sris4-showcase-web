/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl08f00.service;

import java.util.List;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08f00DTO;

/**
 * 選舉造策主畫面服務介面Service Interface
 * 
 * @author Ahhong
 */
public interface Rl08f00Service {

    final String RL08F00_3_GET_RLDE800W = "rl08f00_3.getRlde800w";

    final String DELSQL_FORMAT = "DELETE FROM %s WHERE VOTE_CODE = ? AND SITE_ID = ? ";

    final String DELSQL_FORMAT_802W = "DELETE FROM %s WHERE SITE_ID = ? ";

    /**
     * 做初始化
     * 
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void init(final ExecutantType executantType) throws RisBusinessException;

    /**
     * 開啟畫面
     * 
     * @param executantType
     * @param rl08f00DTO
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doInitPage(final Rl08f00DTO rl08f00DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 執行
     * 
     * @param executantType
     * @param rl08f00DTO
     * @throws RisBusinessException
     */
    @WorkStatus(FinalType.FINAL)
    public void doPerform(final Rl08f00DTO rl08f00DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 設定
     * 
     * @param executantType
     * @param rl08f00DTO
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doConfig(final Rl08f00DTO rl08f00DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 執行 (新增作用中的選舉組合彈跳視窗按鈕)
     * 
     * @param executantType
     * @param rl08f00DTO
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void doPerformAddActive(final Rl08f00DTO rl08f00DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 檢查 RLDE800W 是否有資料
     * 
     * @param rl08f00DTO
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    void checkRlde800w(final Rl08f00DTO dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得投票所清單
     * 
     * @param rl08f00DTO
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    List<String> getVotePointList(final Rl08f00DTO dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 執行選舉清檔
     * 
     * @param executantType
     * @param rl08f00DTO
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void doClearData(final Rl08f00DTO rl08f00DTO, final ExecutantType executantType) throws RisBusinessException;
}