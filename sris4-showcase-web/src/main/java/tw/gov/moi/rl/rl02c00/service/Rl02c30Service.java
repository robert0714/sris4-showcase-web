/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl02c00.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl02c30DTO;

/**
 * 製作行政區域調整及門牌整編戶口名簿改註及換證通知單服務介面.
 * 
 * @author Derek Wang
 * 
 */
public interface Rl02c30Service {

    /**
     * Do print.
     * 
     * @param rl02c30DTO
     *            the rl02c30 dto
     * @param executantType
     *            the executant type
     * @return the string
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    @WorkStatus(FinalType.FINAL)
    public void doPrint(final Rl02c30DTO rl02c30DTO, final ExecutantType executantType) throws RisBusinessException;

}
