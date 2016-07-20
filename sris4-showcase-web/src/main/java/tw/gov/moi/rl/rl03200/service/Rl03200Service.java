/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl03200.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl03200DTO;

/**
 * 概要戶籍資料查詢處理服務介面 Rl03200Service
 */
public interface Rl03200Service {

    /**
     * 查詢概要戶籍資料－現戶簿頁索引.
     * 
     * @param rl03200dto
     *            the rl03200dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @WorkStatus(FinalType.FINAL)
    @RisServiceMethod(MethodType.QUERY)
    public void doMQueryIndex(Rl03200DTO rl03200dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 查詢概要戶籍資料－現戶簿頁明細.
     * 
     * @param rl03200dto
     *            the rl03200dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @WorkStatus(FinalType.FINAL)
    @RisServiceMethod(MethodType.QUERY)
    public void doMQueryDetail(Rl03200DTO rl03200dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 查詢概要戶籍資料－除戶簿頁索引.
     * 
     * @param rl03200dto
     *            the rl03200dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @WorkStatus(FinalType.FINAL)
    @RisServiceMethod(MethodType.QUERY)
    public void doHQueryIndex(Rl03200DTO rl03200dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 查詢概要戶籍資料－除戶簿頁明細.
     * 
     * @param rl03200dto
     *            the rl03200dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @WorkStatus(FinalType.FINAL)
    @RisServiceMethod(MethodType.QUERY)
    public void doHQueryDetail(Rl03200DTO rl03200dto, ExecutantType executantType) throws RisBusinessException;

}
