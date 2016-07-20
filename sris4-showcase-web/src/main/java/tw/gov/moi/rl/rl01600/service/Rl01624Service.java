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
import tw.gov.moi.rl.domain.Rl01624DTO;

/**
 * 門牌增編服務介面.
 * 
 */
public interface Rl01624Service {

    /**
     * 驗證門牌增編資料.
     * 
     * @param rl01624dto
     *            the rl01624dto
     * @param executantType
     *            the executant type
     * @return the rl01624 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl01624DTO verifyData(Rl01624DTO rl01624dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 儲存門牌增編.
     * 
     * @param rl01624dto
     *            the rl01624dto
     * @param executantType
     *            the executant type
     * @return the rl01624 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public Rl01624DTO doSave(Rl01624DTO rl01624dto, ExecutantType executantType) throws RisBusinessException;

}
