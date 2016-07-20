/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
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
import tw.gov.moi.rl.domain.Rl08941DTO;

/**
 * Rl08941Service Interface.
 */
public interface Rl08941Service {

    /** The ERRO ERROR_MSG1. */
    public final String ERROR_MSG1 = "執行「查詢已登錄逕遷至戶政事務所人數」服務失敗";

    /** The ERRO ERROR_MSG2. */
    public final String ERROR_MSG2 = "執行「儲存登錄逕遷至戶政事務所人數資料」服務失敗";

    /** The ERRO ERROR_MSG3. */
    public final String ERROR_MSG3 = "上月資料不存在";

    /** The NOTIFY_CODE. */
    final String NOTIFY_CODE = "Z200";

    /**
     * 查詢已登錄逕遷至戶政事務所人數.
     * 
     * @param rl08941DTO
     *            ,ExecutantType
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doQuery(final Rl08941DTO rl08941DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 儲存登錄逕遷至戶政事務所人數資料.
     * 
     * @param rl08941DTO
     *            ,ExecutantType
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void doSave(final Rl08941DTO rl08941DTO, final ExecutantType executantType) throws RisBusinessException;

}
