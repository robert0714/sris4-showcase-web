/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl03400.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl03410DTO;

/**
 * 批次作業處理狀況查詢服務介面 Rl03400Service
 */
public interface Rl03410Service {

    /**
     * 查詢批次作業處理狀況.
     * 
     * @param rl03410dto
     *            the rl03410dto
     * @param executantType
     *            the executant type
     * @return the rl03400 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    @WorkStatus(FinalType.FINAL)
    @RisServiceMethod(MethodType.QUERY)
    public void doQuery(Rl03410DTO rl03410dto, ExecutantType executantType) throws RisBusinessException;

}
