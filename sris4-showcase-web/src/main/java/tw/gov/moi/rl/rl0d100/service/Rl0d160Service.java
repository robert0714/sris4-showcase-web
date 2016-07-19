/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl0d100.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl0d160DTO;

/**
 * 例行品管作業服務介面.
 * 
 * @author Weiren.Jheng
 */
public interface Rl0d160Service {

    String REGISTRATION_ID = "0D160";

    /**
     * 查詢例行品管作業資料.
     * 
     * @param rl0d160dto
     *            the rl0d160dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doQuery(final Rl0d160DTO rl0d160dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 存檔例行品管作業資料.
     * 
     * @param rl0d160dto
     *            the rl0d160dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void doSave(final Rl0d160DTO rl0d160dto, final ExecutantType executantType) throws RisBusinessException;
}
