/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl02100.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.domain.Rl02100DTO;

/**
 * 戶籍謄本核發服務介面.
 * 
 * @author Jay Kan
 */
public interface Rl02100Service {

    /** 作業代碼 */
    String OPERATION_CODE = "02100";

    /** 申請書類別 */
    String APPLY_CODE = "016";

    /** 申請書類別 */
    String APPLY_CODE_1 = "021";

    /** 戶籍謄本報表代碼 */
    String REPORT_NAME = "RLRP02101";

    /** 其他附繳證件代碼 */
    String OTHER_CERTIFICATE_CODE = "19";

    /** 規費代碼 */
    String FEE_CODE_1 = "RL0A2000002";

    /** 規費代碼 */
    String FEE_CODE_2 = "RL0A2000001";

    /** 規費代碼 */
    String FEE_CODE_3 = "RL0A2000005";

    /** 規費名稱 */
    String FEE_ITEM_1 = "現行戶籍謄本";

    /** 規費名稱 */
    String FEE_ITEM_2 = "閱覽戶籍資料";

    /** 規費名稱 */
    String FEE_ITEM_3 = "戶籍檔案原始資料影本";

    String UNIT = "張";

    /** 列印日期 */
    String PRINT_MAEK = "列印日期";

    /** 鄰 */
    String NEIGHBOR_CHAR = "鄰";

    /** 當事人 */
    String CURRENT_PERSON = "當事人";

    /** 申請人 */
    String APPLICANT = "申請人";

    /** 受委託人 */
    String DELEGATED_PERSON = "受委託人";

    /** 省略記事共%s筆 */
    String NOT_PRINT_TEMPLATE = "省略記事共%s筆。";

    /** 省略記事共%s筆 */
    final String NOT_PRINT_TEMPLATE2 = "尚省略記事%s筆。";

    /** 戶口校正 */
    String CORRECT_PRINT_TEMPLATE = "%s年戶校。";

    /** 役別 */
    String MILITARY_PRINT_TEMPLATE = "%s。";

    /** 補、換證 */
    String ID_CARD_APPLY_TEMPLAT = "%s%s。";

    String BY_PASS = "省略";

    String NOTE_BY_PASS = "記事省略";

    /** 頓號 */
    String COMMA = "、";

    /** 句號 */
    String PERIOD = "。";

    /** 分號 */
    String SEMICOLON = "；";

    /** 全型空白 */
    String SPACE = "　";

    String RL02100_GET_RLDFS016 = "rl02100.getRldfs016";

    /** 稱謂代碼對照檔 */
    String RL02100_GET_RLDE205W = "rl02100.getRlde205w";

    String INIT_OPERATION_DTO = "執行「初始化戶籍謄本核發」失敗";

    String SAVE_XLDF016S = "暫存「連線交易暫存檔」至XLDF016S 失敗";

    String SAVE_XLDF008S = "暫存「申請書索引資料檔」至XLDF008S 失敗";

    String SAVE_XLDFS016 = "暫存「臨時戶籍謄本核發申請書資料檔」至XLDFS016 失敗";

    String SAVE_XLDFW016 = "暫存「臨時-辦理他所戶籍謄本核發申請書資料檔」至XLDFW016 失敗";

    String SAVE_XLDFU003 = "暫存「臨時規費明細檔」失敗";

    String DO_QUERY_CALL_BACK = "執行「查詢撤銷請領」失敗";

    String DO_CALL_BACK = "執行「儲存撤銷請領」失敗";

    String VERIFY_DATA = "執行「驗證戶籍謄本核發」失敗";

    String SAVE_XLDF = "儲存戶籍謄本核發資料至XLDF Table";

    String GET_FEE = "執行「取得規費」失敗";

    String GET_REPORT_PAGE_COUNT = "執行「取得報表頁數」失敗";

    String SAVE_PRINT = "執行「儲存列印資料」失敗";

    String DO_DELETE = "執行「刪除戶籍謄本核發XLDF資料」失敗";

    String DO_QUERY_REMOVE_HOUSEHOLD = "執行「查詢除戶簿頁」失敗";

    String DO_PRINT = "執行「列印戶籍謄本核發」失敗";

    String[] OTHER_COUNTRY = new String[] { "99998", "99999" }; // 99998=大陸其他省市,99999=國外

    final String TEMP_PERSON_ID = "Y000000000";

    final String OTHER_PLACE_REG = "99998|99999";

    /**
     * 初始化戶籍謄本核發資料.
     * 
     * @param pRl02100DTO
     *            the rl02100 dto
     * @param pExecutantType
     *            the executant type
     */
    void initOperationDTO(final Rl02100DTO pRl02100DTO, final ExecutantType pExecutantType);

    /**
     * 初始化全戶資料
     * 
     * @param pRl02100DTO
     * @param pExecutantType
     */
    void initHouseholdData(final Rl02100DTO pRl02100DTO, final ExecutantType pExecutantType);

    /**
     * 載入戶籍謄本核發.
     * 
     * @param pOpeningOperationDTO
     *            the opening operation dto
     * @param pExecutantType
     *            the executant type
     * @return the rl02100 dto
     */
    @RisServiceMethod(MethodType.QUERY)
    Rl02100DTO loadOperationDTO(final OpeningOperationDTO pOpeningOperationDTO, final ExecutantType pExecutantType);

    /**
     * 驗證戶籍謄本核發.
     * 
     * @param pRl02100DTO
     *            the rl02100 dto
     * @param pExecutantType
     *            the executant type
     */
    void verifyData(final Rl02100DTO pRl02100DTO, final ExecutantType pExecutantType);

    /**
     * 儲存戶籍謄本核發資料至XLDF Table.
     * 
     * @param pRl02100DTO
     *            the rl02100 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.TEMP_FINAL)
    void saveXldf(final Rl02100DTO pRl02100DTO, final ExecutantType pExecutantType);

    /**
     * 儲存列印資料至TLDF table.
     * 
     * @param pRl02100DTO
     *            the rl02100 dto
     * @param pExecutantType
     *            the executant type
     */
    void savePrint(final Rl02100DTO pRl02100DTO, final ExecutantType pExecutantType);

    /**
     * 列印「戶籍謄本核發」資料.
     * 
     * @param pRl02100DTO
     *            the rl02100 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    void doPrint(final Rl02100DTO pRl02100DTO, final ExecutantType pExecutantType);

    /**
     * 查詢「撤銷請領」資料.
     * 
     * @param pRl02100DTO
     *            the rl02100 dto
     * @param pExecutantType
     *            the executant type
     */
    void doQueryCallBack(final Rl02100DTO pRl02100DTO, final ExecutantType pExecutantType);

    /**
     * 儲存撤銷請領.
     * 
     * @param pRl02100DTO
     *            the rl02100 dto
     * @param pExecutantType
     *            the executant type
     */
    void doCallBack(final Rl02100DTO pRl02100DTO, final ExecutantType pExecutantType);

    /**
     * 刪除戶籍謄本核發XLDF資料.
     * 
     * @param pOpeningOperationDTO
     *            the opening operation dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.DELETE)
    void doDelete(final Rl02100DTO pRl02100DTO, final ExecutantType pExecutantType);

    /**
     * 取得規費.
     * 
     * @param pRl02100DTO
     *            the rl02100 dto
     * @param pExecutantType
     *            the executant type
     * @return the fee
     */
    void getFee(final Rl02100DTO pRl02100DTO, final ExecutantType pExecutantType);

    /**
     * 取得報表頁數.
     * 
     * @param pRl02100DTO
     *            the rl02100 dto
     * @param pExecutantType
     *            the executant type
     * @return the report page count
     */
    void getReportPageCount(final Rl02100DTO pRl02100DTO, final ExecutantType pExecutantType);

    /**
     * 重新列印戶籍謄本.
     * 
     * @param pRl02100DTO
     *            the rl02100 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    void doRepeatPrint(final Rl02100DTO pRl02100DTO, final ExecutantType pExecutantType);

    /**
     * 查詢除戶簿頁.
     * 
     * @param pRl02100DTO
     *            the rl02100 dto
     * @param pExecutantType
     *            the executant type
     */
    void doQueryRemoveHousehold(final Rl02100DTO pRl02100DTO, final ExecutantType pExecutantType);

    /**
     * Do query remove household member.
     * 
     * @param pRl02100DTO
     *            the rl02100 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.QUERY)
    void doQueryRemoveHouseholdMember(final Rl02100DTO pRl02100DTO, final ExecutantType pExecutantType);

    /**
     * Filter household member.
     * 
     * @param pRl02100DTO
     *            the rl02100 dto
     * @param pExecutantType
     *            the executant type
     */
    void filterHouseholdMember(final Rl02100DTO pRl02100DTO, final ExecutantType pExecutantType);

    /**
     * 更新大宗戶籍謄本資料
     * 
     * @param pRl02100DTO
     * @param pExecutantType
     */
    void updateRldf2fXX(final Rl02100DTO pRl02100DTO, final ExecutantType pExecutantType);

    /**
     * 儲存尚未修改的記事至 XLDF TABLE
     * 
     * @param pRl02100DTO
     * @param pExecutantType
     */
    // @RisServiceMethod(MethodType.SAVE)
    void saveBeforeChangeNoteToXLDF(final Rl02100DTO pRl02100DTO, final ExecutantType pExecutantType);
}
