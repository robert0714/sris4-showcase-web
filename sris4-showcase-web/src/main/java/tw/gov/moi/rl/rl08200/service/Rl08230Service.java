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
import tw.gov.moi.rl.domain.Rl08230DTO;

/**
 * 製作死亡動態處理服務介面
 * 
 * @author Jay Kan
 */
public interface Rl08230Service {

    /**
     * 製作死亡動態統計表
     * 
     * @param pRl08230DTO
     *            the rl08230 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    void doPrint(final Rl08230DTO pRl08230DTO, final ExecutantType pExecutantType);

    /**
     * 取得並下載死亡動態統計表
     * 
     * @param pRl08230DTO
     *            the rl08230 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    void doDownload(final Rl08230DTO pRl08230DTO, final ExecutantType pExecutantType);

    void doBatchPrint(Rl08230DTO dto, ExecutantType executantType) throws RisBusinessException;

    void doPreview(Rl08230DTO dto, ExecutantType executantType) throws RisBusinessException;
}
