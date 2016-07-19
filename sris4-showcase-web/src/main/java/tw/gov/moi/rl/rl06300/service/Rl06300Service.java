/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl06300.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl06300DTO;

/**
 * 列印統號配賦表處理服務介面.
 * 
 * @author Derek Wang
 * 
 */
public interface Rl06300Service {

    /**
     * Do print.
     * 
     * @param rl06300DTO
     *            the rl06300 dto
     * @param executantType
     *            the executant type
     * @return the string
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    public void doPrint(final Rl06300DTO rl06300DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * Do download.
     * 
     * @param rl06300DTO
     *            the rl06300 dto
     * @param executantType
     *            the executant type
     * @return the string
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    public void doDownload(final Rl06300DTO rl06300DTO, final ExecutantType executantType);

    /**
     * Do preview.
     * 
     * @param rl06300DTO
     *            the rl06300 dto
     * @param executantType
     *            the executant type
     * @return the string
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.PRINT2SYS)
    public void doPreview(final Rl06300DTO rl06300DTO, final ExecutantType executantType) throws RisBusinessException;
}
