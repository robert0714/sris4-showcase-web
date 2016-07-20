/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl08900.service;

import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl089b0DTO;

/**
 * 列印廢止印鑑資料清冊處理服務介面 Rl089b0Service.
 */
public interface Rl089b0Service {

    /**
     * 列印廢止印鑑資料清冊.
     * 
     * @param rl089b0dto
     *            the rl089b0dto
     * @param executantType
     *            the executant type
     * @return the string
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    public void doPrint(final Rl089b0DTO rl089b0dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得並下載廢止印鑑資料清冊.
     * 
     * @param rl089b0dto
     *            the rl089b0dto
     * @param executantType
     *            the executant type
     * @return the string
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    public void doDownload(final Rl089b0DTO rl089b0dto, final ExecutantType executantType) throws RisBusinessException;

}
