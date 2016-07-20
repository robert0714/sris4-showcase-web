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
import tw.gov.moi.rl.domain.Rl02a90DTO;

/**
 * 發證登錄服務介面
 */
public interface Rl02a90Service {

    /**
     * 驗證查詢.
     * 
     * @param rl02a90dto
     *            the rl02a90dto
     * @param executantType
     *            the executant type
     * @return the rldf002d type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doQuery(Rl02a90DTO rl02a90dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 存檔.
     * 
     * @param rl02a90dto
     *            the rl02a90dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @WorkStatus(FinalType.FINAL)
    @RisServiceMethod(MethodType.SAVE)
    public void doSave(Rl02a90DTO rl02a90dto, ExecutantType executantType) throws RisBusinessException;
}
