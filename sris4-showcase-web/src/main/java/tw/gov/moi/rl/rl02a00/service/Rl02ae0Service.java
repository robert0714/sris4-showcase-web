/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl02a00.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl02ae0DTO;

/**
 * 註銷國民身分證請領服務介面 Rl02ae0Service
 */
public interface Rl02ae0Service {

    final String APPLY_CODE = "0Z3";

    /**
     * 查詢註銷國民身分證請領資料.
     * 
     * @param rl02ae0dto
     *            the rl02ae0dto
     * @param executantType
     *            the executant type
     * @return the list
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl02ae0DTO doQuery(Rl02ae0DTO rl02ae0dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 自動組合註銷國民身分證請領記事.
     * 
     * @param rl02ae0dto
     *            the rl02ae0dto
     * @param executantType
     *            the executant type
     * @return the rl02ae0 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl02ae0DTO autoNotes(Rl02ae0DTO rl02ae0dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 儲存註銷國民身分證請領資料.
     * 
     * @param rl02ae0dto
     *            the rl02ae0dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @WorkStatus(FinalType.FINAL)
    @RisServiceMethod(MethodType.QUERY)
    public void doSave(Rl02ae0DTO rl02ae0dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 列印註銷國民身分證請領記錄表.
     * 
     * @param rl02ae0dto
     *            the rl02ae0dto
     * @param executantType
     *            the executant type
     * @return the string
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    public void doPrint(Rl02ae0DTO rl02ae0dto, ExecutantType executantType) throws RisBusinessException;

}
