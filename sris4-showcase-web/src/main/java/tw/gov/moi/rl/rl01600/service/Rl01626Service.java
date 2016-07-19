/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl01600.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl01626DTO;

/**
 * 門牌註銷服務介面.
 * 
 * @author Dan Tsai
 */
public interface Rl01626Service {

    /**
     * 驗證門牌註銷.
     * 
     * @param rl01626DTO
     *            the rl01626 dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    public void verifyData(final Rl01626DTO rl01626DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 儲存門牌註銷.
     * 
     * @param rl01626DTO
     *            the rl01626 dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void doSave(final Rl01626DTO rl01626DTO, final ExecutantType executantType) throws RisBusinessException;
}