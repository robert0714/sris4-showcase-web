/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl06800.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.rl.domain.Rl06800DTO;

/**
 * 列印未配賦戶號表處理服務介面.
 * 
 * @author Jay Kan
 */
public interface Rl06800Service {

    /** 報表名稱. */
    String RLRP06800 = "RLRP06800";

    /**
     * 列印未配賦戶號表.
     * 
     * @param pRl06800DTO
     *            the rl06800 dto
     * @param pExecutantType
     *            the executant type
     * @return the string
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    void doPrint(final Rl06800DTO pRl06800DTO, final ExecutantType pExecutantType);

    /**
     * 取得並下載未配賦戶號表.
     * 
     * @param pRl06800DTO
     *            the rl06800 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    void doDownload(final Rl06800DTO pRl06800DTO, final ExecutantType pExecutantType);
}
