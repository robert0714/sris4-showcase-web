/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl02a00.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl02ag0DTO;

/**
 * 免列印相片統計表及名冊服務介面
 * 
 * @author DAXIONG
 */
public interface Rl02ag0Service {
    /**
     * 免列印相片統計表及名冊
     * 
     * @param dto
     *            the dto
     * @param exec
     *            the exec
     * @return the string
     */
    @RisServiceMethod(MethodType.PRINT2SYS)
    @WorkStatus(FinalType.FINAL)
    public void doPrint(final Rl02ag0DTO dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * Do download.
     * 
     * @param rc0c2b0dto
     *            the rc0c2b0dto
     * @param executantType
     *            the executant type
     * @return the string
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    @WorkStatus(FinalType.FINAL)
    public void doDownload(final Rl02ag0DTO dto, final ExecutantType executantType) throws RisBusinessException;
}