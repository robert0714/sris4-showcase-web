/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl08200.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl082a0DTO;

/**
 * 製作其他動態處理服務介面
 * 
 * @author philip
 */
public interface Rl082a0Service {

    /**
     * 製作其他動態統計表
     * 
     * @param pRl082a0DTO
     *            the rl082a0 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    @WorkStatus(FinalType.FINAL)
    void doPrint(final Rl082a0DTO pRl082a0DTO, final ExecutantType pExecutantType);

    /**
     * 預覽列印其他動態統計表
     * 
     * @param rl082a0DTO
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    @WorkStatus(FinalType.FINAL)
    public void doPreview(final Rl082a0DTO rl082a0DTO, final ExecutantType executantType) throws RisBusinessException;
    
    /**
     * 取得並下載其他動態統計表
     * 
     * @param pRl082a0DTO
     *            the rl082a0 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.DOWNLOAD)
    @WorkStatus(FinalType.FINAL)
    void doDownload(final Rl082a0DTO pRl082a0DTO, final ExecutantType pExecutantType);
}
