/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl01600.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl01630DTO;

/**
 * 核發門牌證明服務介面
 * 
 * @author Marcus Chen
 * 
 */
public interface Rl01630Service {

    /**
     * 驗證核發門牌證明資料
     * 
     * @param rl01630DTO
     * @param executant
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.VERIFY)
    public void verifyData(final Rl01630DTO rl01630DTO, final ExecutantType executant) throws RisBusinessException;

    /**
     * 儲存核發門牌證明資料
     * 
     * @param rl01630DTO
     * @param executant
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void saveData(final Rl01630DTO rl01630DTO, final ExecutantType executant) throws RisBusinessException;

    /**
     * 列印門牌證明
     * 
     * @param rl01630DTO
     * @param executant
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    public void doPrint(final Rl01630DTO rl01630DTO, final ExecutantType executant) throws RisBusinessException;

    @RisServiceMethod(MethodType.PRINT2TERM)
    public void callReport(final Rl01630DTO rl01630DTO, final ExecutantType executant) throws RisBusinessException;

}
