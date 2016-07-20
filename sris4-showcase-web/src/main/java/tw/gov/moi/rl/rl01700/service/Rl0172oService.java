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
import tw.gov.moi.rl.domain.Rl0172oDTO;

/**
 * 戶號變更服務介面.
 * 
 * @author Jay Kan
 */
public interface Rl0172oService {

    /** 作業代碼. */
    String OPERATION_CODE = "0172O";

    /** 作業名稱. */
    String OPERATION_NAME = "戶號變更";

    /** 戶號變更原因代碼 */
    String UPDATE_REASON_RSCD = RlConstant.RSCD3425;

    /** 戶號變更登記附繳證件 */
    String CERTIFICATE_RSCD = RlConstant.RSCD3424;

    /** 次分類（申請書類別）. */
    String SUB_TYPE = "0BC";

    /** 記事例代碼. */
    String AUTO_NOTE_ID = "40BC000001";

    /** 其他變更原因代碼 */
    String OTHER_UPDATE_REASON_CODE = "07";

    /** 其他附繳證件代碼 */
    String OTHER_CERTIFICATE_CODE = "5";

    /** \r\n. */
    String REPLACE_STRING = "\r\n";

    /** 戶號. */
    String HOUSEHOLD_ID = "householdId";

    /** 請輸入變更戶號. */
    String HOUSEHOLD_ID_EMPTY_MSG = "請輸入變更戶號";

    /** 請輸入變更原因. */
    String UPDATE_REASON_EMPTY_MSG = "請輸入變更原因";

    /** 請輸入其他變更原因. */
    String OTHER_UPDATE_REASON_EMPTY_MSG = "請輸入其他變更原因";

    /** 請輸入變更日期. */
    String UPDATE_YYYMMDD_EMPTY_MSG = "請輸入變更日期";

    /** 請輸入其他之附繳證件. */
    String OTHER_CERTIFICATE_EMPTY_MSG = "請輸入其他之附繳證件";

    /** 變更戶號不應和原戶號相同. */
    String HOUSEHOLD_ID_THE_SAME = "變更戶號不應和原戶號相同";

    /** 變更日期不可大於系統日期. */
    String UPDATE_DATE_MSG = "變更日期不可大於系統日期";

    /** 請輸入記事內容. */
    String REGISTER_CONTENT_EMPTY_MSG = "請輸入記事內容";

    /** 更新「全戶基本資料的戶號」. */
    String UPDATE_HOUSEHOLD_DATA = "更新「全戶基本資料的戶號」";

    /** 更新戶下人口清單裡的「個人基本資料」 */
    String UPDATE_MEMBER_PERSON_DATA = "更新戶下人口清單裡的「個人基本資料」";

    /** 新增「全戶動態記事」失敗. */
    String CREATE_XLDF002M_EXT_MESSAGE = "新增「全戶動態記事」失敗";

    /** 更新全戶動態記事的戶號 */
    String UPDATE_XLDF002M = "更新全戶動態記事的戶號";

    /** 取得作業點為siteId的新戶號失敗 */
    String GET_NEW_HOUSEHOLD_ID_BY_SITE_ID = "取得作業點為%s的新戶號失敗";

    /** 暫存「戶號配賦資料」至XLDF021M */
    String SAVE_XLDF021M = "暫存「戶號配賦資料」至XLDF021M";

    /**
     * 執行Contoller loadPage() 的第一個Service之共用邏輯.
     * 
     * @param pRl0172oDTO
     *            the rl0172o dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.QUERY)
    void initLoadPage(final Rl0172oDTO pRl0172oDTO, final ExecutantType pExecutantType);

    /**
     * 初始化戶號變更登記.
     * 
     * @param pRl0172oDTO
     *            the rl0172o dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    void initOperationDTO(final Rl0172oDTO pRl0172oDTO, final ExecutantType pExecutantType);

    /**
     * 載入戶號變更登記.
     * 
     * @param pOpeningOperationDTO
     *            the opening operation dto
     * @param pExecutantType
     *            the executant type
     * @return the rl0172o dto
     */
    @RisServiceMethod(MethodType.QUERY)
    Rl0172oDTO loadOperationDTO(final OpeningOperationDTO pOpeningOperationDTO, final ExecutantType pExecutantType);

    /**
     * 再次驗證狀態時載入戶號變更登記DTO.
     * 
     * @param pOpeningOperationDTO
     *            the opening operation dto
     * @param pExecutantType
     *            the executant type
     * @return the rl0172o dto
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    Rl0172oDTO reviewOperationDTO(final OpeningOperationDTO pOpeningOperationDTO, final ExecutantType pExecutantType);

    /**
     * 刪除戶號變更XLDF資料.
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
     * @param pRl0172oDTO
     *            the rl0172o dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.VERIFY)
    void verifyAppData(final Rl0172oDTO pRl0172oDTO, final ExecutantType pExecutantType);

    /**
     * 儲存戶號變更申請資料至XLDF Table.
     * 
     * @param pRl0172oDTO
     *            the rl0172o dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    @WorkStatus(FinalType.TEMP_FINAL)
    void saveXLDF(final Rl0172oDTO pRl0172oDTO, final ExecutantType pExecutantType);
}
