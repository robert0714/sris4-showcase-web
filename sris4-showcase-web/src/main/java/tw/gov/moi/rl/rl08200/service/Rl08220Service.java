/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl08200.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08220DTO;

/**
 * 製作出生動態處理服務介面
 * 
 * @author Jay Kan
 */
public interface Rl08220Service {

    /**
     * 製作出生動態統計表
     * 
     * @param pRl08220DTO
     *            the rl08220 dto
     * @param pExecutantType
     *            the executant type
     */
//    @RisServiceMethod(MethodType.PRINT2TERM)
//    @WorkStatus(FinalType.TEMP_FINAL)
//    void doPrint(final Rl08220DTO pRl08220DTO, final ExecutantType pExecutantType);

    /**
     * 取得並下載出生動態統計表
     * 
     * @param pRl08220DTO
     *            the rl08220 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    @WorkStatus(FinalType.TEMP_FINAL)
    void doDownload(final Rl08220DTO pRl08220DTO, final ExecutantType pExecutantType);

    void doPreview(Rl08220DTO dto, ExecutantType executantType) throws RisBusinessException;

    void doBatchPrint(Rl08220DTO dto, ExecutantType executantType) throws RisBusinessException;
}
