/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl01300.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl01310DTO;
import tw.gov.moi.rl.domain.TempFileDTO;

/**
 * 遷入登記服務介面
 * 
 * @author Marcus Chen
 * 
 */
public interface Rl01310Service {

    public static final String XLDF030M_CONTENT_TAIL = "遷出戶口名簿未補註";

    public static final String RSCD3550 = "RSCD3550";

    public static final String RSCD3213 = "RSCD3213";

    /** 申請書類別代碼 */
    public static final String STRING_73 = "073";

    /** 案件種類 */
    public static final String APPLY_CODE_74 = "74";

    /** 罰鍰 申請類別代碼 */
    public static final String APPLY_CASE_NO_003 = "003";
    /** RlConstant - MAINTYPE:3 */
    final static String MAINTYPE = "3";
    /** RlConstant - APPLY_CODE:073 */
    final static String APPLY_CODE = "073";
    /** RlConstant - OTHER_CERTIFICATE_CODE:26 (RSCD3478) */
    final static String OTHER_CERTIFICATE_CODE = "26";
    /** RlConstant - CERTIFICATE_CODE: (RSCD3478) */
    final static String CERTIFICATE_CODE = "RSCD3478";

    /** RlConstant - DATE FORMAT */
    public static final String DATE_FORMAT = "yyyyMMddHHmm";

    /** RlConstant - 【191100000000】Long */
    public static final Long NINETEEN_ELEVEN = 191100000000L;

    public static int MOVEIN = 1;

    public static int MEMBER = 2;

    public static int ORIGIN = 3;

    public static String FOREIGN_4N_OLDSTREET = "自國外遷入";

    /** 身分登記 */
    public static final String NOTETYPE_IDENTITY = "2";
    /** 遷徙登記 */
    public static final String NOTETYPE_MOVE = "3";
    /** 撤銷登記代碼 */
    public static final String NOTETYPE_CORRECTCHANGE = "4";
    /** 撤銷登記代碼 */
    public static final String NOTETYPE_REVOKE = "8";
    /** 廢止登記代碼 */
    public static final String NOTETYPE_ABOLISH = "G";

    /** =============輸入資料錯誤訊息======================= */
    /** RlConstant - 請輸入遷入地 */
    public final static String MSG_MOVEIN_AREACODE = "請輸入遷入地";

    /** RlConstant - 請輸入申請種類 */
    public final static String MSG_APPLYKIND = "請輸入申請種類 ";

    /** RlConstant - 請輸入遷入統計註記 */
    public final static String MSG_STATISTIC_MOVECODE = "請輸入遷入統計註記 ";

    /** RlConstant - 請輸入稱謂(當事人資料頁籤) */
    public final static String MSG_MOVEIN_RELATIONSHIP = "請輸入稱謂(當事人資料頁籤)";

    /** RlConstant - 請輸入是否自立新戶 */
    public final static String MSG_NEWHOUSE = "請輸入是否自立新戶(其他申請資料頁籤)";

    /** RlConstant - 請輸入戶號(其他申請資料頁籤) */
    public final static String MSG_MOVEIN_HOUSEHOLDID = "請輸入遷入地戶號(其他申請資料頁籤)";

    /** RlConstant - 請輸入戶長統號 */
    public final static String MSG_MOVEIN_HOUSEHOLDHEADID = "請輸入遷入地戶長統號(其他申請資料頁籤)";

    /** RlConstant - 請輸入戶號及戶長統號(其他申請資料頁籤) */
    public final static String MSG_MOVEIN_HOUSEHOLD = "請輸入遷入地戶號及戶長統號(其他申請資料頁籤)";

    /** RlConstant - 請輸入(其他申請資料頁籤) */
    public final static String MSG_MOVEIN_HOUSEHOLDTYPE = "請輸入戶別(其他申請資料頁籤)";

    /** RlConstant - 請輸入兼任戶長註記 */
    public final static String MSG_CONCURRENTHEAD_MARK = "請輸入兼任戶長註記";

    /** RlConstant - 請輸入兼任戶長統號 */
    public final static String MSG_CONCURRENTHEAD_ID = "請輸入兼任戶長統號";

    /** RlConstant - 請輸入兼任戶長作業點代碼 */
    public final static String MSG_CONCURRENTHEAD_SITEID = "請輸入兼任戶長作業點代碼";

    /** RlConstant - 請輸入遷地地址 */
    public final static String MSG_MOVEIN_ADDRESS = "請輸入遷入地址(其他申請資料頁籤)";

    /** RlConstant - 請輸入附繳證件 */
    public final static String MSG_CERTIFICATE = "請輸入附繳證件";

    /** RlConstant - 請輸入其他附繳證件 */
    public final static String MSG_CERTIFICATE_OTHER = "請輸入其他附繳證件(其他申請資料頁籤)";

    /** RlConstant - 請輸入須進行罰鍰處理 */
    public final static String MSG_PUNISH = "請輸入須進行罰鍰處理";

    /** RlConstant - 請輸入未於法定期間申報 */
    public final static String MSG_LAWDATE = "請輸入未於法定期間申報";

    /** RlConstant - 請輸入未於法定期間申報日期 */
    public final static String MSG_LAWDATE_DATE = "請輸入未於法定期間申報日期";

    /** RlConstant - 請輸入遷出戶戶長未提供戶口名簿 */
    public final static String MSG_NOT_HOUSEBOOK = "請輸入遷出戶戶長未提供戶口名簿";

    /** RlConstant - 請輸入稱謂(原住地資料頁籤) */
    public final static String MSG_ORIGIN_RELATIONSHIP = "請輸入稱謂(原住地資料頁籤)";

    /** RlConstant - 請輸入戶別(原住地資料頁籤) */
    public final static String MSG_ORIGIN_HOUSETYPE = "請輸入戶別(原住地資料頁籤)";

    /** RlConstant - 戶別錯誤(原住地資料頁籤) */
    public final static String MSG_ORIGIN_HOUSETYPE_WRONG = "戶別錯誤(原住地資料頁籤)";

    /** RlConstant - 請輸入兼任戶長註記(原住地資料頁籤) */
    public final static String MSG_ORIGIN_CONCURRENTHEAD_MARK = "請輸入兼任戶長註記(原住地資料頁籤)";

    /** RlConstant - 請輸入新增當事人統號 */
    public final static String MSG_MOVEIN_ADDPERSONID = "請輸入新增當事人統號";

    public final static String MSG_MOVEIN_HOUSEHOLDDATA = "無遷入地全戶基本資料，請確認遷入地資訊皆正確無誤";

    /** RlConstant - 統號: */
    public final static String MSG_PERSON_ID = " 統號:";

    /** RlConstant - 姓名: */
    public final static String MSG_PERSON_NAME = " 姓名:";

    public final static String HOUSE_HEAD_ID = "戶長統號:";

    public final static String HOUSE_ID = "戶號:";

    public final static String SITE_ID = "作業點代碼:";

    /** Constant - dto */

    /** RlConstant - dto */

    public final static String DTO = "dto";

    /** RlConstant - XLDF005M */
    public final static String REGI_BOOK_5M = "XLDF005M";

    /** RlConstant - XLDF005H */
    public final static String REGI_BOOK_5H = "XLDF005H";

    /** RlConstant - XLDF002M */
    public final static String REGI_BOOK_2M = "XLDF002M";

    /** RlConstant - XLDF002H */
    public final static String REGI_BOOK_2H = "XLDF002H";

    /** RlConstant - 3073000001 */
    public final static String REGI_CODE_1 = "3073000001";

    /** RlConstant - 3073000002 */
    public final static String REGI_CODE_2 = "3073000002";

    /** RlConstant - 3073000003 */
    public final static String REGI_CODE_3 = "3073000003";

    /** RlConstant - 3073000004 */
    public final static String REGI_CODE_4 = "3073000004";

    /** RlConstant - 3073000005 */
    public final static String REGI_CODE_5 = "3073000005";

    /** RlConstant - 3073000006 */
    public final static String REGI_CODE_6 = "3073000006";

    /** RlConstant - 3073000007 */
    public final static String REGI_CODE_7 = "3073000007";

    /** RlConstant - 3073000008 */
    public final static String REGI_CODE_8 = "3073000008";

    /** RlConstant - 3073000009 */
    public final static String REGI_CODE_9 = "3073000009";

    /** RlConstant - 3073000010 */
    public final static String REGI_CODE_10 = "3073000010";

    /** RlConstant - 3073000011 原3073000037 */
    public final static String REGI_CODE_11 = "3073000011";

    /** RlConstant - 3073000012 原 3073000038 */
    public final static String REGI_CODE_12 = "3073000012";

    /** RlConstant - 3073000013 原3073000039 */
    public final static String REGI_CODE_13 = "3073000013";

    /** RlConstant - 3073000014 原3073000040 */
    public final static String REGI_CODE_14 = "3073000014";

    /** RlConstant - 3073000015 原3073000041 */
    public final static String REGI_CODE_15 = "3073000015";

    /** RlConstant - 3073000016 原3073000042 */
    public final static String REGI_CODE_16 = "3073000016";

    /** RlConstant - 3073000017 原3073000050 */
    public final static String REGI_CODE_17 = "3073000017";

    /** RlConstant - 3073000018 原3073000051 */
    public final static String REGI_CODE_18 = "3073000018";

    /** RlConstant - 3073000019 原3073000052 */
    public final static String REGI_CODE_19 = "3073000019";

    /** RlConstant - 3073000020 原3073000053 */
    public final static String REGI_CODE_20 = "3073000020";

    /** RlConstant - 3073000021 原3073000054 */
    public final static String REGI_CODE_21 = "3073000021";
    /** RlConstant - 3073000022 原3073000055 */
    public final static String REGI_CODE_22 = "3073000022";

    /** RlConstant - Status 1(遷徙者) */
    public final static String STAS_1 = "1";

    /** RlConstant - Status 2(原住地新戶) */
    public final static String STAS_2 = "2";

    /** RlConstant - Status 3(遷入地新戶) */
    public final static String STAS_3 = "3";

    /** RlConstant - Status 4(共同事業戶) */
    public final static String STAS_4 = "4";

    /** RlConstant - Status 5(原戶長遷入地) */
    public final static String STAS_5 = "5";

    /** RlConstant - Status 6(原戶長遷入地) */
    public final static String STAS_6 = "6";

    /** RlConstant - Status 7(遷出地原戶) */
    public final static String STAS_7 = "7";

    /** RlConstant - 備註 現戶 */
    public final static String REMARK_M = "現戶";

    /** RlConstant - 備註除戶 */
    public final static String REMARK_H = "除戶";

    public final static String DEFAULT_CONSITEID = "00000";

    public final static String APPLY_CODE_73 = "073";

    /** ERROR MSG: service.initOperationDTO=== */
    public final static String METHOD_1 = "<ERROR> service.initOperationDTO ===";

    /** ERROR MSG: service.checkPersonData=== */
    public final static String METHOD_2 = "<ERROR> service.checkPersonData ===";

    /** LOCK_TRUE */
    public final static boolean LOCK_TRUE = Boolean.TRUE;

    /** LOCK_FALSE */
    public final static boolean LOCK_FALSE = Boolean.FALSE;

    /** 99999991 有戶籍無統號自大陸遷入 */
    public final static String CODE_99999991 = "(9){7}1";

    /** 99999992 有戶籍及統號自大陸遷入 */
    public final static String CODE_99999992 = "(9){7}2";

    /** 99999994 註銷外僑登記 */
    public final static String CODE_99999994 = "(9){7}4";

    /** 99999996 補辦戶籍遷入 */
    public final static String CODE_99999996 = "(9){7}6";

    /** 99999997 國內原有戶籍未配賦統號遷入 */
    public final static String CODE_99999997 = "(9){7}7";

    /** 99999999 自國外遷入 */
    public final static String CODE_99999999 = "(9){7}9";

    /** 役政通報類別 41 全戶遷出 */
    public final static String NOTICE_TYPE_41 = "41";

    /** 役政通報類別 42 部分遷出 */
    public final static String NOTICE_TYPE_42 = "42";

    /** 役政通報類別 18 遷出 */
    public final static String NOTICE_TYPE_18 = "18";

    /** 役政通報類別 36 特殊遷徙 */
    public final static String NOTICE_TYPE_36 = "36";

    /** 役政通報類別 19 遷入 */
    public final static String NOTICE_TYPE_19 = "19";

    /**
     * 初始化遷入登記-針對大部當事人-
     * 
     * @param rl01310DTO
     * @param executantType
     * @return Rl01310DTO
     * @throws RisBusinessException
     *             RisBusinessException：「初始化遷入登記」失敗
     */

    void initCreateTxnPerson(Rl01310DTO rl01310DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 初始化遷入登記
     * 
     * @param rl01310DTO
     * @param executantType
     * @return Rl01310DTO
     * @throws RisBusinessException
     *             RisBusinessException：「初始化遷入登記」失敗
     */
    Rl01310DTO initOperationDTO(Rl01310DTO rl01310DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 載入遷入登記編輯頁面
     * 
     * @param rl01310DTO
     * @param executantType
     * @return Rl01310DTO
     * @throws RisBusinessException
     *             RisBusinessException：「載入遷入登記」失敗
     */

    Rl01310DTO loadOperationDTO(Rl01310DTO rl01310DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 載入遷入登記編輯後頁面
     * 
     * 
     * @param rl01310DTO
     * @param executantType
     * @return Rl01310DTO
     * @throws RisBusinessException
     *             RisBusinessException：「載入遷入登記」失敗
     */
    @RisServiceMethod(MethodType.QUERY)
    Rl01310DTO reviewOperationDTO(Rl01310DTO rl01310DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 預設當事人資料與戶內成員清單
     * 
     * 
     * @param rl01310DTO
     * @param executantType
     * @return Rl01310DTO
     * @throws RisBusinessException
     *             RisBusinessException：「遷入地行政區域輸入錯誤」
     */
    Rl01310DTO procApplyKind(Rl01310DTO rl01310DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 預設當事人資料與戶內成員清單(大戶)
     * 
     * 
     * @param rl01310DTO
     * @param executantType
     * @throws RisBusinessException
     * 
     */

    void procApplyKind_BigHousehold(Rl01310DTO rl01310DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得單一當事人個人資料
     * 
     * 
     * @param rl01310DTO
     * @param executantType
     * @return Rl01310DTO
     * @throws RisBusinessException
     */

    Rl01310DTO querySinglePerson(Rl01310DTO rl01310DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得多個當事人個人資料
     * 
     * @param rl01310DTO
     * @param executantType
     * @return Rl01310DTO
     * @throws RisBusinessException
     */

    Rl01310DTO queryManyPerson(Rl01310DTO rl01310DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得多個當事人個人資料(大戶)
     * 
     * @param rl01310DTO
     * @param executantType
     * @throws RisBusinessException
     */

    void queryPeople_BigHousehold(Rl01310DTO rl01310DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 清除當事人資料
     * 
     * @param rl01310DTO
     * @param executantType
     * @return Rl01310DTO
     * @throws RisBusinessException
     *             RisBusinessException：「全戶遷出時，不可執行清除國民身分證統一編號」
     *             RisBusinessException：「未勾選欲清除國民身分證統一編號」
     */

    Rl01310DTO cancelSelectPerson(Rl01310DTO rl01310DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 保留個人記事料
     * 
     * @param rl01310DTO
     * @param executantType
     * @return Rl01310DTO
     * @throws RisBusinessException
     *             RisBusinessException：「未選擇個人記事」
     */

    Rl01310DTO selectPersonRegister(Rl01310DTO rl01310DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 設定要顯示的記事
     * 
     * @param rl01310DTO
     * @param executantType
     * @return Rl01310DTO
     * @throws RisBusinessException
     *             RisBusinessException：「初始化遷入登記」失敗
     */

    Rl01310DTO showPersonRegister(Rl01310DTO rl01310DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 初始化遷入全戶資料
     * 
     * @param rl01310DTO
     * @param executantType
     * @return Rl01310DTO
     * @throws RisBusinessException
     */

    Rl01310DTO initMoveInHouse(Rl01310DTO rl01310DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得遷入戶資料
     * 
     * 
     * @param rl01310DTO
     * @param executantType
     * @return Rl01310DTO
     * @throws RisBusinessException
     *             RisBusinessException：「全戶基本資料不存在」
     *             RisBusinessException：「擬入戶戶長個人基本資料不存在」
     *             RisBusinessException：「擬入戶戶長須為現住人口」
     *             RisBusinessException：「該戶沒有戶長」
     */
    @RisServiceMethod(MethodType.QUERY)
    Rl01310DTO queryMoveInData(Rl01310DTO rl01310DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得兼任戶長個人資料
     * 
     * @param rl01310DTO
     * @param executantType
     * @return Rl01310DTO
     * @throws RisBusinessException
     *             RisBusinessException：「擬入戶戶長個人基本資料不存在」
     *             RisBusinessException：「擬入戶戶長須為現住人口」
     */

    Rl01310DTO queryConcurrentHead(Rl01310DTO rl01310DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 執行資料驗證並自動組合記事
     * 
     * @param rl01310DTO
     * @param executantType
     * @return Rl01310DTO
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.VERIFY)
    Rl01310DTO verifyAppData(Rl01310DTO rl01310DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 暫存遷入登記申請資料至XLDF Table
     * 
     * @param rl01310DTO
     * @param executantType
     * @throws RisBusinessException
     *             RisBusinessException：「執行遷入登記程式失敗」失敗
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    void saveXldf(Rl01310DTO rl01310DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 刪除遷入登記資料
     * 
     * @param rl01310DTO
     * @param executantType
     * @throws RisBusinessException
     *             RisBusinessException：「執行遷入登記程式失敗」失敗
     */
    @RisServiceMethod(MethodType.DELETE)
    void doDelete(Rl01310DTO rl01310DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * Save temp file.
     * 
     * @param pTempFileDTO
     *            the temp file dto
     * @param pExecutantType
     *            the executant type
     */

    void saveTempFile(final TempFileDTO<Rl01310DTO> tempFileDTO, final ExecutantType executantType);

    /**
     * Load temp file.
     * 
     * @param tempFileDTO
     *            the temp file dto
     * @param executantType
     *            the executant type
     * @return the Rl01310DTO dto
     */

    Rl01310DTO loadTempFile(final TempFileDTO<Rl01310DTO> tempFileDTO, final ExecutantType executantType);

    /**
     * 處理當事人改變siteId.
     * 
     * @param Rl01310DTO
     *            the dto
     * @param executantType
     *            the executant type
     * @return
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    @WorkStatus(FinalType.TEMP_FINAL)
    void processMoveinPersonSiteId(final Rl01310DTO dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 清除大戶查詢ID DTO
     * 
     * @param Rl01310DTO
     *            the dto
     * @param executantType
     *            the executant type
     * @return
     */
    void clearBigHouseholdQryDTO(final Rl01310DTO dto, final ExecutantType executantType) throws RisBusinessException;

}
