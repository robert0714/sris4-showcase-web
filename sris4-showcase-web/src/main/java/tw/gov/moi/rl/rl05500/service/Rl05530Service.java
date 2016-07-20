/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl05500.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl05530DTO;

/**
 * 門牌異動紀錄重送中央、市縣服務介面.
 * 
 * @author Derek Wang
 */
public interface Rl05530Service {

    /**
     * Query count.
     * 
     * @param rl05530DTO
     *            the rl05530 dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    public void queryCount(Rl05530DTO rl05530DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * Do confirm.
     * 
     * @param rl05530DTO
     *            the rl05530 dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doConfirm(Rl05530DTO rl05530DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * Do send.
     * 
     * @param rl05530DTO
     *            the rl05530 dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.SEND)
    @WorkStatus(FinalType.FINAL)
    public void doSend(Rl05530DTO rl05530DTO, ExecutantType executantType) throws RisBusinessException;
}
