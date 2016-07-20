/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl07100.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl07113DTO;

/**
 * The Interface Rl07113Service.
 */
public interface Rl07113Service {

    /**
     * 查詢戶籍巡查資料.
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.VERIFY)
    void verifyData(final Rl07113DTO dto, final ExecutantType executantType);

    /**
     * 儲存登錄戶籍巡查記事資料.
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    void saveData(final Rl07113DTO dto, final ExecutantType executantType);
}
