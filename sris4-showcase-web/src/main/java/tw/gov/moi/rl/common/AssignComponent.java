/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.common;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;

/**
 * 號碼取得共用元件介面.
 * 
 * @author JL
 * 
 */
public interface AssignComponent {

    /** The Constant REG_CODE4=0. */
    final static String REG_CODE4 = "0";

    final static String SPACE = " ";

    /**
     * 依原戶號是否存在暫存簿頁以取得配賦之新戶號.
     * 
     * @param lSiteId
     *            SiteId
     * @param househouldHeadId
     *            住變遷出戶新戶長國民身分證統一編號
     * @param householdId
     *            住變遷出戶戶號
     * @param executant
     *            使用者資訊
     * @return 新戶號
     * @throws RisBusinessException
     *             「依原戶號是否存在暫存簿頁以取得配賦之新戶號」失敗
     */
    // String getHouseholdId(String lSiteId, String househouldHeadId, String
    // householdId, ExecutantType executant)
    // throws RisBusinessException;

    /**
     * 取得配賦之新戶號.
     * 
     * @param lSiteId
     *            siteId
     * @param executant
     *            使用者資訊
     * @return 新戶號
     * @throws RisBusinessException
     *             「取得配賦之新戶號」失敗
     */
    String getNewHouseholdId(String lSiteId, ExecutantType executant) throws RisBusinessException;

    /**
     * 取得配賦之新統號.
     * 
     * @param lSiteId
     *            siteId
     * @param sex
     *            性別
     * 
     * @param idType
     *            身份別
     * @param executant
     *            使用者資訊
     * @return 新統號
     * @throws RisBusinessException
     *             「取得配賦之新統號」失敗
     */
    String getPersonalId(String lSiteId, String sex, String idType, ExecutantType executant)
            throws RisBusinessException;

    // /**
    // * 更新戶號配賦檔.
    // *
    // * @param householdId
    // * 戶號
    // * @param householdHeadName
    // * 戶長姓名
    // * @param executant
    // * 使用者資訊
    // * @throws RisBusinessException
    // * 「更新戶號配賦檔」失敗
    // */
    // void saveHouseholdId(String householdId, String householdHeadName,
    // ExecutantType executant)
    // throws RisBusinessException;
    //
    /**
     * 更新統號配賦檔.
     * 
     * @param personId
     *            統號
     * @param endueMark
     *            配賦註記
     * @param name
     *            姓名
     * @param executant
     *            使用者資訊
     * @throws RisBusinessException
     *             「更新統號配賦檔」失敗
     */
    // void savePersonalId(String personId, String endueMark, String name,
    // ExecutantType executant)
    // throws RisBusinessException;
    //
    // /**
    // * 歸還未使用之戶號.
    // *
    // * @param householdId
    // * 戶號
    // * @param executant
    // * 使用者資訊
    // * @throws RisBusinessException
    // * 「歸還未使用之戶號」失敗
    // */
    // void cancelHouseholdId(String householdId, ExecutantType executant)
    // throws RisBusinessException;
    //
    // /**
    // * 歸還未使用之統號.
    // *
    // * @param personId
    // * 統號
    // * @param executant
    // * 使用者資訊
    // * @throws RisBusinessException
    // * 「歸還未使用之統號」失敗
    // */
    // void cancelPersonalId(String personId, ExecutantType executant) throws
    // RisBusinessException;

}
