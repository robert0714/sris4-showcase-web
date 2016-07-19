/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl08400.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08411DTO;

/**
 * 國民小學學區資料設定作業處理服務介面.
 * 
 * @author Jay Kan
 */
public interface Rl08411Service {

    /**
     * 儲存國民小學學區資料.
     * 
     * @param pRl08411DTO
     *            the rl08411 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    void saveData(final Rl08411DTO pRl08411DTO, final ExecutantType pExecutantType) throws RisBusinessException;

    // void doDelete(final Rl08411DTO pRl08411DTO, final ExecutantType
    // pExecutantType) throws RisBusinessException;

    void doQuery(final Rl08411DTO pRl08411DTO, final ExecutantType pExecutantType) throws RisBusinessException;
}
