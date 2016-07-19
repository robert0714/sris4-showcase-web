/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl01700.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.domain.Rl0171sDTO;

/**
 * 親子關係更正父(母)姓名更正服務介面.
 * 
 * @author Jay Kan
 */
public interface Rl0171sService {

    /**
     * The Enum ApplyType.
     */
    enum ApplyType {

        /** 當事人. */
        TXN_PERSON,

        /** 原父親. */
        BEFORE_FATHER,

        /** 原母親. */
        BEFORE_MOTHER,

        /** 新父親. */
        AFTER_FATHER,

        /** 新母親. */
        AFTER_MOTHER
    }

    /** 作業代碼. */
    String OPERATION_CODE = "0171S";

    /** 作業名稱. */
    String OPERATION_NAME = "親子關係更正父(母)姓名更正";

    /** 其他附繳證件代碼. */
    String OTHER_CERTIFICATE_CODE = "12";

    /** 親子關係更正原因代碼 */
    String UPDATE_REASON_RSCD = RlConstant.RSCD3394;

    /** 親子關係更正-附繳證件 */
    String CERTIFICATE_RSCD = RlConstant.RSCD3393;

    /** 記事例代碼. */
    String AUTO_NOTE_ID_1 = "40AL000001";

    /** 記事例代碼. */
    String AUTO_NOTE_ID_2 = "40AL000002";

    /** 記事例代碼. */
    String AUTO_NOTE_ID_3 = "40AL000003";

    /** 記事例代碼. */
    String AUTO_NOTE_ID_4 = "40AL000004";

    /** 記事例代碼. */
    String AUTO_NOTE_ID_5 = "40AL000005";

    /** 記事例代碼. */
    String AUTO_NOTE_ID_6 = "40AL000006";

    /** 記事例代碼. */
    String AUTO_NOTE_ID_7 = "40AL000007";

    /** 次分類（申請書類別）. */
    String SUB_TYPE = "0AL";

    /** The RE g_2. */
    String REG_2 = ".{2}[6-8].{7}";

    /** The RE g_3. */
    String REG_3 = "\\d{1}.{9}";

    /** \r\n. */
    String REPLACE_STRING = "\r\n";

    /** 父姓名. */
    String FATHER = "father";

    /** 父姓. */
    String FATHER_LAST_NAME = "fatherLastName";

    /** 父名. */
    String FATHER_FIRST_NAME = "fatherFirstName";

    /** 父統號. */
    String FATHER_ID = "fatherId";

    /** 母姓名. */
    String MOTHER = "mother";

    /** 母姓. */
    String MOTHER_LAST_NAME = "motherLastName";

    /** 母名. */
    String MOTHER_FIRST_NAME = "motherFirstName";

    /** 母統號. */
    String MOTHER_ID = "motherId";

    /** 新父親-補登個人基本資料不存在. */
    String AFTER_FATHER_4MT_NOT_FOUND = "新父親-補登個人基本資料不存在";

    /** 新父親-個人基本資料不存在. */
    String AFTER_FATHER_4M_NOT_FOUND = "新父親-個人基本資料不存在";

    /** 新父親-補登全戶基本資料不存在. */
    String AFTER_FATHER_1MT_NOT_FOUND = "新父親-補登全戶基本資料不存在";

    /** 新父親-全戶基本資料不存在. */
    String AFTER_FATHER_1M_NOT_FOUND = "新父親-全戶基本資料不存在";

    /** 新母親-補登個人基本資料不存在. */
    String AFTER_MOTHER_4MT_NOT_FOUND = "新母親-補登個人基本資料不存在";

    /** 新母親-個人基本資料不存在. */
    String AFTER_MOTHER_4M_NOT_FOUND = "新母親-個人基本資料不存在";

    /** 新母親-補登全戶基本資料不存在. */
    String AFTER_MOTHER_1MT_NOT_FOUND = "新母親-補登全戶基本資料不存在";

    /** 新母親-全戶基本資料不存在. */
    String AFTER_MOTHER_1M_NOT_FOUND = "新母親-全戶基本資料不存在";

    /** 父親必須為男性. */
    String FATHER_GENDER = "父親必須為男性";

    /** 母親必須為女性. */
    String MOTHER_GENDER = "母親必須為女性";

    /** 請輸入更正原因. */
    String UPDATE_REASON_EMPTY_MSG = "請輸入更正原因";

    /** 請輸入更正日期. */
    String UPDATE_YYYMMDD_EMPTY_MSG = "請輸入更正日期";

    /** 請輸入其他之附繳證件. */
    String OTHER_CERTIFICATE_EMPTY_MSG = "請輸入其他之附繳證件";

    /** 請輸入出生別 */
    String BIRTH_ORDER_SEX_EMPTY_MSG = "請輸入出生別";

    /** 請輸入結婚日期 */
    String DATE_OF_MARRIAGE_EMPTY_MSG = "請輸入結婚日期";

    /** 請按取得更正父資料 */
    String AFTER_FATHER_DATA = "請按取得更正父資料";

    /** 請按取得更正母資料 */
    String AFTER_MOTHER_DATA = "請按取得更正母資料";

    /** 應更正事項至少須輸入一個. */
    String CHANGE_ITEM = "應更正事項至少須輸入一個";

    /** 原登記父統一編號與應更正父統一編號相同. */
    String FATHER_ID_THE_SAME = "原登記父統一編號與應更正父統一編號相同";

    /** 原登記母統一編號與應更正母統一編號相同. */
    String MOTHER_ID_THE_SAME = "原登記母統一編號與應更正母統一編號相同";

    /** 母統一編號，不可與更正者統一編號重複. */
    String MOTHER_ID_AND_TXN_ID_THE_SAME = "母統一編號，不可與更正者統一編號重複";

    /** 父統一編號，不可與更正者統一編號重複. */
    String FATHER_ID_AND_TXN_ID_THE_SAME = "父統一編號，不可與更正者統一編號重複";

    /** 更正日期不可大於系統日期. */
    String UPDATE_DATE_MSG = "更正日期不可大於系統日期";

    /** 請輸入記事內容. */
    String REGISTER_CONTENT_EMPTY_MSG = "請輸入記事內容";

    /** 取得新父親資料. */
    String GET_AFTER_FATHER_DATA = "取得新父親資料";

    /** 取得新母親資料. */
    String GET_AFTER_MOTHER_DATA = "取得新母親資料";

    /** 更新當事人「全國個人資料摘要檔」. */
    String UPDATE_XLDF001MRL = "更新當事人「全國個人資料摘要檔」";

    /** 暫存「外來申請書資料」至XLDF2R 失敗. */
    String SAVE_XLDF2R_EXT_MESSAGE = "暫存「外來申請書資料」至XLDF2R 失敗";

    /** 暫存「臨時－外來申請書索引紀錄」至XLDF009S失敗. */
    String SAVE_XLDF009S_EXT_MESSAGE = "暫存「臨時－外來申請書索引紀錄」至XLDF009S 失敗";

    /**
     * 執行Contoller loadPage() 的第一個Service之共用邏輯.
     * 
     * @param pRl0171sDTO
     *            the rl0171s dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.QUERY)
    void initLoadPage(final Rl0171sDTO pRl0171sDTO, final ExecutantType pExecutantType);

    /**
     * 初始化親子關係更正父(母)姓名更正.
     * 
     * @param pRl0171sDTO
     *            the rl0171s dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    void initOperationDTO(final Rl0171sDTO pRl0171sDTO, final ExecutantType pExecutantType);

    /**
     * 載入親子關係更正父(母)姓名更正.
     * 
     * @param pOpeningOperationDTO
     *            the opening operation dto
     * @param pExecutantType
     *            the executant type
     * @return the rl0171s dto
     */
    @RisServiceMethod(MethodType.QUERY)
    Rl0171sDTO loadOperationDTO(final OpeningOperationDTO pOpeningOperationDTO, final ExecutantType pExecutantType);

    /**
     * 再次驗證狀態時載入親子關係更正父(母)姓名更正.
     * 
     * @param pOpeningOperationDTO
     *            the opening operation dto
     * @param pExecutantType
     *            the executant type
     * @return the rl0171s dto
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    Rl0171sDTO reviewOperationDTO(final OpeningOperationDTO pOpeningOperationDTO, final ExecutantType pExecutantType);

    /**
     * 取得新父親資料.
     * 
     * @param pRl0171sDTO
     *            the rl0171s dto
     * @param pExecutantType
     *            the executant type
     * @return the after father data
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    void getAfterFatherData(final Rl0171sDTO pRl0171sDTO, final ExecutantType pExecutantType);

    /**
     * 取得新母親資料.
     * 
     * @param pRl0171sDTO
     *            the rl0171s dto
     * @param pExecutantType
     *            the executant type
     * @return the after mother data
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    void getAfterMotherData(final Rl0171sDTO pRl0171sDTO, final ExecutantType pExecutantType);

    /**
     * 刪除親子關係更正父(母)姓名更正XLDF資料.
     * 
     * @param pOpeningOperationDTO
     *            the opening operation dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.DELETE)
    void doDelete(final OpeningOperationDTO pOpeningOperationDTO, final ExecutantType pExecutantType);

    /**
     * 執行資料驗證並自動組合記事.
     * 
     * @param pRl0171sDTO
     *            the rl0171s dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.VERIFY)
    void verifyAppData(final Rl0171sDTO pRl0171sDTO, final ExecutantType pExecutantType);

    /**
     * 儲存親子關係更正父(母)姓名更正申請資料至XLDF Table.
     * 
     * @param pRl0171sDTO
     *            the rl0171s dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    @WorkStatus(FinalType.TEMP_FINAL)
    void saveXLDF(final Rl0171sDTO pRl0171sDTO, final ExecutantType pExecutantType);
}
