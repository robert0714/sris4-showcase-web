/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl02a00.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl02a60DTO;

/**
 * 製作註銷國民身分證名冊服務介面Service Interface
 * 
 * @author Ahhong
 */
public interface Rl02a60Service {

    /**
     * 取得最後收妥時間
     * 
     * @param rl02a60DTO
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void getLastReceiveDate(Rl02a60DTO rl02a60DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 製作註銷國民身分證名冊
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.PRINT2SYS)
    @WorkStatus(FinalType.FINAL)
    public void doPrint(Rl02a60DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 送出 (批次列印).
     * 
     * @param dto
     *            輸入的查詢條件
     * @param executantType
     *            使用者資訊
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.PRINT2SYS)
    @WorkStatus(FinalType.FINAL)
    public void doBatchPrint(final Rl02a60DTO dto, final ExecutantType executantType)
    		throws RisBusinessException;

    /**
     * 預覽列印.
     * 
     * @param dto
     *            輸入的查詢條件
     * @param executantType
     *            使用者資訊
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    public void doPreview(final Rl02a60DTO dto, final ExecutantType executantType)
    		throws RisBusinessException;

    /**
     * 取得並下載製作註銷國民身分證名冊
     * 
     * @param rl02a60DTO
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    @WorkStatus(FinalType.FINAL)
    public void doDownload(Rl02a60DTO rl02a60DTO, ExecutantType executantType) throws RisBusinessException;

}