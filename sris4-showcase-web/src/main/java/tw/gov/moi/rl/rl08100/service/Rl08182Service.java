/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl08100.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08182DTO;

/**
 * 列印戶政管理服務案件統計表處理服務介面.
 * 
 * @author Derek Wang
 */
public interface Rl08182Service {

    /**
     * 列印戶政管理服務案件統計表.
     * 
     * @param rl08182DTO
     *            the rl08182 dto
     * @param executantType
     *            the executant type
     * @return the string
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    public void doPrint(Rl08182DTO rl08182DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得並下載戶政管理服務案件統計表.
     * 
     * @param rl08182DTO
     *            the rl08182 dto
     * @param executantType
     *            the executant type
     * @return the string
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    public void doDownload(Rl08182DTO rl08182DTO, ExecutantType executantType) throws RisBusinessException;
}
