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
import tw.gov.moi.rl.domain.Rl05520DTO;

/**
 * 里鄰門牌資料重送中央、市縣處理服務介面.
 * 
 * @author Derek Wang
 */
public interface Rl05520Service {

    /**
     * Query count.
     * 
     * @param rl05520DTO
     *            the rl05520 dto
     * @param executantType
     *            the executant type
     * @return the string
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    public void queryCount(Rl05520DTO rl05520DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * Do confirm.
     * 
     * @param rl05520DTO
     *            the rl05520 dto
     * @param executantType
     *            the executant type
     * @return the string
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doConfirm(Rl05520DTO rl05520DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * Do send.
     * 
     * @param rl05520DTO
     *            the rl05520 dto
     * @param executantType
     *            the executant type
     * @return the string
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.SEND)
    @WorkStatus(FinalType.FINAL)
    public void doSend(Rl05520DTO rl05520DTO, ExecutantType executantType) throws RisBusinessException;
}
