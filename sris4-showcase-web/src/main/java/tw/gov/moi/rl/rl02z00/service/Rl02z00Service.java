/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl02z00.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.rl.dto.Rl02z00DTO;

/**
 * 戶籍資料列印服務介面.
 * 
 * @author Jay Kan
 */
public interface Rl02z00Service {

    /** 戶籍謄本報表代碼 */
    String REPORT_NAME = "RLRP02101";

    /** 稱謂代碼對照檔 */
    String RL02100_GET_RLDE205W = "rl02100.getRlde205w";

    /** 當事人 */
    String CURRENT_PERSON = "當事人";

    /** 鄰 */
    String NEIGHBOR_CHAR = "鄰";

    /** 句號 */
    String PERIOD = "。";

    /** 全型空白 */
    String SPACE = "　";

    /** 省略記事共%s筆 */
    String NOT_PRINT_TEMPLATE = "省略記事共%s筆。";

    /** 省略記事共%s筆 */
    final String NOT_PRINT_TEMPLATE2 = "尚省略記事%s筆。";

    /** 列印日期 */
    String PRINT_MARK = "列印日期";

    /** 規費名稱 */
    String FEE_ITEM_1 = "戶籍謄本";

    /** 執行「開始申請」失敗 */
    String DO_BEGIN_APPLY = "執行「開始申請」失敗";

    /** 執行「儲存列印資料」失敗 */
    String SAVE_PRINT = "執行「儲存列印資料」失敗";

    /** 執行「列印戶籍謄本核發」失敗 */
    String DO_PRINT = "執行「列印戶籍謄本核發」失敗";

    /** 執行「取得報表頁數」失敗 */
    String GET_REPORT_PAGE_COUNT = "執行「取得報表頁數」失敗";

    /** 執行「查詢除戶簿頁」失敗 */
    String DO_QUERY_REMOVE_HOUSEHOLD = "執行「查詢除戶簿頁」失敗";

    String BY_PASS = "省略";

    String NOTE_BY_PASS = "記事省略";

    String[] OTHER_COUNTRY = new String[] { "99998", "99999" }; // 99998=大陸其他省市,99999=國外

    /** 役別 */
    String MILITARY_PRINT_TEMPLATE = "%s。";

    /** 補、換證 */
    String ID_CARD_APPLY_TEMPLAT = "%s%s。";

    /** 戶口校正 */
    String CORRECT_PRINT_TEMPLATE = "%s年戶校。";

    /**
     * 開始申請.
     * 
     * @param pRl02z00DTO
     *            the rl02z00 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.QUERY)
    void doBeginApply(final Rl02z00DTO pRl02z00DTO, final ExecutantType pExecutantType);

    /**
     * 列印「戶籍謄本核發」資料.
     * 
     * @param pRl02z00DTO
     *            the rl02z00 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    @WorkStatus(FinalType.FINAL)
    void doPrint(final Rl02z00DTO pRl02z00DTO, final ExecutantType pExecutantType);

    /**
     * 查詢除戶簿頁.
     * 
     * @param pRl02z00DTO
     *            the rl02z00 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.QUERY)
    void doQueryRemoveHousehold(final Rl02z00DTO pRl02z00DTO, final ExecutantType pExecutantType);

    /**
     * Do query remove household member.
     * 
     * @param pRl02z00DTO
     *            the rl02z00 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.QUERY)
    void doQueryRemoveHouseholdMember(final Rl02z00DTO pRl02z00DTO, final ExecutantType pExecutantType);
}
