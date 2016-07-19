/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl02a00.service;

import java.util.List;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl02ac0DTO;
import tw.gov.moi.rl.domain.Rl02ac0ResultDTO;

/**
 * 學童初次請領國民身分證服務介面 Rl02ac0Service
 */
public interface Rl02ac0Service {

    final String APPLY_CODE = "040";

    final String CATEGORY = "02A11";

    final String FEE_CODE = "0004";

    final String FEE_ITEM = "初、換領國民身分證";

    final String FEE_UNIT = "張";

    /**
     * 查詢學童初次請領國民身分證資料.
     * 
     * @param rl02ac0dto
     *            the rl02ac0dto
     * @param executantType
     *            the executant type
     * @return the list
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    public List<Rl02ac0ResultDTO> doQuery(Rl02ac0DTO rl02ac0dto, ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 儲存學童初次請領國民身分證資料.
     * 
     * @param rl02ac0dto
     *            the rl02ac0dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @WorkStatus(FinalType.FINAL)
    @RisServiceMethod(MethodType.QUERY)
    public void doSave(Rl02ac0DTO rl02ac0dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 列印學童初次請領國民身分證一覽表.
     * 
     * @param rl02ac0dto
     *            the rl02ac0dto
     * @param executantType
     *            the executant type
     * @return the string
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    public void doPrint(Rl02ac0DTO rl02ac0dto, ExecutantType executantType) throws RisBusinessException;

    @RisServiceMethod(MethodType.SAVE)
    public void doSaveXldfs040(Rl02ac0DTO rl02ac0dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 列印學童初次請領國民身分證申請書
     * 
     * @param rl02ac0dto
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    public void doPrintApply(final Rl02ac0DTO pRl02ac0DTO, final ExecutantType pExecutantType)
            throws RisBusinessException;

    /**
     * 刪除學童初次請領國民身分證資料.
     * 
     * @param pRl02ac0DTO
     * @param pExecutantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.DELETE)
    public void doDeleteXldfs040(final Rl02ac0DTO pRl02ac0DTO, final ExecutantType pExecutantType)
            throws RisBusinessException;

}
