/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl08200.service;

import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08240DTO;

/**
 * 製作結婚動態處理服務介面
 * 
 * @author Jay Kan
 */
public interface Rl08240Service {

    /**
     * 製作結婚動態統計表
     * 
     * @param pRl08240DTO
     *            the rl08240 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    void doPrint(final Rl08240DTO pRl08240DTO, final ExecutantType pExecutantType);

    /**
     * 取得並下載結婚動態統計表
     * 
     * @param pRl08240DTO
     *            the rl08240 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    void doDownload(final Rl08240DTO pRl08240DTO, final ExecutantType pExecutantType);

    void doBatchPrint(Rl08240DTO dto, ExecutantType executantType) throws RisBusinessException;

    void doPreview(Rl08240DTO dto, ExecutantType executantType) throws RisBusinessException;
}
