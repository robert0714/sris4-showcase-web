/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl06400.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl06400DTO;

/**
 * 列印戶號配賦表處理服務介面.
 * 
 * @author Derek Wang
 * 
 */
public interface Rl06400Service {

    /**
     * Do print.
     * 
     * @param rl06400DTO
     *            the rl06400 dto
     * @param executantType
     *            the executant type
     * @return the string
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    public void doPrint(final Rl06400DTO rl06400DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * Do download.
     * 
     * @param rl06400DTO
     *            the rl06400 dto
     * @param executantType
     *            the executant type
     * @return the string
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    public void doDownload(final Rl06400DTO rl06400DTO, final ExecutantType executantType);

    /**
     * Do preview.
     * 
     * @param rl06400DTO
     *            the rl06400 dto
     * @param executantType
     *            the executant type
     * @return the string
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.PRINT2SYS)
    public void doPreview(final Rl06400DTO rl06400DTO, final ExecutantType executantType) throws RisBusinessException;
}
