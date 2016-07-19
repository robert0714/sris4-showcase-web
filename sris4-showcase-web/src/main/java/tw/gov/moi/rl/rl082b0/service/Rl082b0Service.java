/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl082b0.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl082b0DTO;

/**
 * 戶籍遷徒統計表服務介面.
 * 
 * @author Dan Tsai
 * 
 */
public interface Rl082b0Service {

    // /**
    // * Do print.
    // *
    // * @param rl082b0DTO
    // * the rl082b0 dto
    // * @param executantType
    // * the executant type
    // * @throws RisBusinessException
    // * the ris business exception
    // */
    // @RisServiceMethod(MethodType.PRINT2SYS)
    // @WorkStatus(FinalType.TEMP_FINAL)
    // void doPrint(final Rl082b0DTO rl082b0DTO, final ExecutantType
    // executantType) throws RisBusinessException;

    /**
     * Do download.
     * 
     * @param rl082b0DTO
     *            the rl082b0 dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    @WorkStatus(FinalType.TEMP_FINAL)
    void doDownload(final Rl082b0DTO rl082b0DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * Do batch print.
     * 
     * @param rl082b0DTO
     *            the rl082b0 dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @WorkStatus(FinalType.TEMP_FINAL)
    void doBatchPrint(Rl082b0DTO rl082b0DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * Do preview.
     * 
     * @param rl082b0DTO
     *            the rl082b0 dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    void doPreview(Rl082b0DTO rl082b0DTO, ExecutantType executantType) throws RisBusinessException;
}
