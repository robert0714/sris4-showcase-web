/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component;

import java.util.List;
import java.util.Map;

import tw.gov.moi.ae.domain.ExecutantType;

/**
 * 戶籍大簿個人相關屬性資料檢核介面.
 * 
 * @author Jay Kan
 */
public interface HouseholdBusinessValidator {

    /**
     * 跟據設定檔對 RLDF系列表格資料進行檢核.
     * 
     * @param pPersonId
     *            the person id
     * @param pSiteId
     *            the site id
     * @param pHouseholdStatus
     *            the household status
     * @param pExecutantType
     *            the executant type
     * @return the map
     */
    Map<String, List<String>> validateForRLDFData(final String pPersonId, final String pSiteId,
            final String pHouseholdStatus, final ExecutantType pExecutantType);

    /**
     * 跟據設定檔對 XLDF系列表格資料進行檢核.
     * 
     * @param pPersonId
     *            the person id
     * @param pSiteId
     *            the site id
     * @param pOperationSequenceId
     *            the operation sequence id
     * @param pHouseholdStatus
     *            the household status
     * @param pExecutantType
     *            the executant type
     * @return the map
     */
    Map<String, List<String>> validateForXLDFData(final String pPersonId, final String pSiteId,
            final Integer pOperationSequenceId, final String pHouseholdStatus, final ExecutantType pExecutantType);

    /**
     * 除了對當時作業順序所做merged的XLDF資料進行檢核外，會檢核檢驗產生出提示所伴隨的常用登記警訊.
     * 
     * @param pPersonId
     *            the person id
     * @param pSiteId
     *            the site id
     * @param pHouseholdStatus
     *            the household status
     * @param pExecutantType
     *            the executant type
     * @return the map
     */
    Map<String, List<String>> validateForRealData(final String pPersonId, final String pSiteId,
            final String pHouseholdStatus, final ExecutantType pExecutantType);
}
