/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl08700.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.rs.domain.DynamicReportDTO;

/**
 * 動、靜態資料造冊統計處理服務介面.
 * 
 * @author Jay Kan
 */
public interface Rl08740Service {

    /**
     * Do init.
     * 
     * @param pRl08740DTO
     *            the rl08740 dto
     * @param pExecutantType
     *            the executant type
     * @return the list
     */
    @RisServiceMethod(MethodType.QUERY)
    void doInit(final DynamicReportDTO pRl08740DTO, final ExecutantType pExecutantType);

    /**
     * Do query.
     * 
     * @param pRl08740DTO
     *            the rl08740 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.QUERY)
    void doQuery(final DynamicReportDTO pRl08740DTO, final ExecutantType pExecutantType);

    /**
     * Do generate page.
     * 
     * @param pDynamicReportDTO
     *            the dynamic report dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.QUERY)
    void doGeneratePage(final DynamicReportDTO pDynamicReportDTO, final ExecutantType pExecutantType);

    /**
     * Update rsdfz9000.
     * 
     * @param pRl08740DTO
     *            the rl08740 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE)
    void updateRsdfz9000(final DynamicReportDTO pRl08740DTO, final ExecutantType pExecutantType);

    /**
     * Verify data.
     * 
     * @param pRl08740DTO
     *            the rl08740 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.VERIFY)
    void verifyData(final DynamicReportDTO pRl08740DTO, final ExecutantType pExecutantType);

    /**
     * 動、靜態資料造冊統計.
     * 
     * @param pRl08740DTO
     *            the rl08740 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.BATCH)
    @WorkStatus(FinalType.FINAL)
    void doPrint(final DynamicReportDTO pRl08740DTO, final ExecutantType pExecutantType);

    /**
     * Generate print columns.
     * 
     * @param pRl08740DTO
     *            the rl08740 dto
     * @param pExecutantType
     *            the executant type
     */
    void generatePrintColumns(final DynamicReportDTO pRl08740DTO, final ExecutantType pExecutantType);

    /**
     * Do generate report list.
     * 
     * @param pRl08740DTO
     *            the rl08740 dto
     * @param pExecutantType
     *            the executant type
     */
    void doGenerateReportList(final DynamicReportDTO pRl08740DTO, final ExecutantType pExecutantType);

    /**
     * Calculate data count.
     * 
     * @param pRl08740DTO
     *            the rl08740 dto
     * @param pExecutantType
     *            the executant type
     */
    void calculateDataCount(final DynamicReportDTO pRl08740DTO, final ExecutantType pExecutantType);
}
