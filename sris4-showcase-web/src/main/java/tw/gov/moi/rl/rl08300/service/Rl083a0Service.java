/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl08300.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.rl.domain.Rl083a0DTO;

/**
 * 維護年終靜態鄰數統計數處理服務介面
 * 
 * @author Jay Kan
 */
public interface Rl083a0Service {

    /**
     * 查詢年終靜態鄰數資料
     * 
     * @param pRl083a0DTO
     *            the rl083a0 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.QUERY)
    void verifyData(final Rl083a0DTO pRl083a0DTO, final ExecutantType pExecutantType);

    /**
     * 儲存年終靜態鄰數資料
     * 
     * @param pRl083a0DTO
     *            the rl083a0 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    void saveData(final Rl083a0DTO pRl083a0DTO, final ExecutantType pExecutantType);
}
