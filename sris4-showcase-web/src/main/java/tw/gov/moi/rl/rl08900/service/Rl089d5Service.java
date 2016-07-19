/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl08900.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl089d5DTO;

/**
 * 列印清查人口統計表.
 * 
 * @author Andy
 */
public interface Rl089d5Service {

    /**
     * 列印清查人口統計表.
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @return the string
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.PRINT2SYS)
    @WorkStatus(FinalType.FINAL)
    public void doPrint(final Rl089d5DTO dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得並下載清查人口名冊.
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @return the string
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.DOWNLOAD)
    @WorkStatus(FinalType.FINAL)
    public void doDownload(final Rl089d5DTO dto, final ExecutantType executantType) throws RisBusinessException;

    @RisServiceMethod(MethodType.QUERY)
    public void doPreview(final Rl089d5DTO dto, final ExecutantType executantType) throws RisBusinessException;

}
