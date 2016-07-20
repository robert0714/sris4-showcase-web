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
import tw.gov.moi.rl.domain.Rl01621DTO;

/**
 * * 門牌補發服務介面.
 * 
 * @author 劉嘉煒
 */
public interface Rl01621Service {

    /**
     * 驗證門牌補發.
     * 
     * @param rl01621DTO
     *            the rl01621 dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.VERIFY)
    public void verifyData(final Rl01621DTO rl01621DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 儲存門牌補發.
     * 
     * @param rl01621DTO
     *            the rl01621 dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void doSave(final Rl01621DTO rl01621DTO, final ExecutantType executantType) throws RisBusinessException;
}