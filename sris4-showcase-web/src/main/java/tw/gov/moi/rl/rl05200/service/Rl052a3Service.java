/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl05200.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl052a3DTO;

/**
 * 列印出生證明通報書及出生通報表服務介面 Rl052a3Service.
 * 
 * @author Dan Tsai
 */
public interface Rl052a3Service {

    /**
     * 列印出生證明通報書及出生通報表.
     * 
     * @param rl052a3DTO
     *            the rl052a3 dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @WorkStatus(FinalType.FINAL)
    @RisServiceMethod(MethodType.PRINT2TERM)
    public void doPrint(final Rl052a3DTO rl052a3DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得並下載出生證明通報書及出生通報表.
     * 
     * @param rl052a3DTO
     *            the rl052a3 dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @WorkStatus(FinalType.FINAL)
    @RisServiceMethod(MethodType.DOWNLOAD)
    public void doDownload(final Rl052a3DTO rl052a3DTO, final ExecutantType executantType) throws RisBusinessException;

}
