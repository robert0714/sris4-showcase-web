/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl03500.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl03530DTO;

/**
 * 村里鄰及街路門牌變更資料查詢服務介面
 * 
 * The Interface Rl03530Service.
 */
public interface Rl03530Service {

    /**
     * 查詢村里鄰及街路門牌變更資料.
     * 
     * @param rl03530DTO
     *            the rl03530 dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    @WorkStatus(FinalType.FINAL)
    public Rl03530DTO doQuery(final Rl03530DTO rl03530DTO, final ExecutantType executantType)
            throws RisBusinessException;

}
