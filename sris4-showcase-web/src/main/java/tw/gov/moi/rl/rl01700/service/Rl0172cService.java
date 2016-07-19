/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl01700.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.domain.Rl0172cDTO;

/**
 * 出生別變更服務介面.
 * 
 * @author Jay Kan
 */
public interface Rl0172cService {

    /** 作業代碼 */
    String OPERATION_CODE = "0172C";

    /** 作業名稱. */
    String OPERATION_NAME = "出生別變更";

    /** 出生別-代碼檔名稱 */
    String BIRTH_ORDER_SEX_RSCD = RlConstant.RSCD0205;

    /** 出生別變更原因代碼 */
    String UPDATE_REASON_RSCD = RlConstant.RSCD3372;

    /** 出生別變更登記附繳證件 */
    String CERTIFICATE_RSCD = RlConstant.RSCD3371;

    /** 記事例代碼 */
    String AUTO_NOTE_ID_1 = "40B2000001";

    /** 記事例代碼 */
    String AUTO_NOTE_ID_2 = "40B2000002";

    /** 記事例代碼 */
    String AUTO_NOTE_ID_3 = "40B2000003";

    /** 記事例代碼 */
    String AUTO_NOTE_ID_4 = "40B2000004";

    /** 次分類（申請書類別） */
    String SUB_TYPE = "0B2";

    /** 其他變更原因代碼 */
    String OTHER_UPDATE_REASON_CODE = "06";

    /** 其他附繳證件代碼 */
    String OTHER_CERTIFICATE_CODE = "8";

    /** 出生別 */
    String BIRTH_ORDER_SEX = "birthOrderSex";

    /** 稱謂 */
    String RELATIONSHIP = "relationship";

    /** 請輸入變更原因 */
    String UPDATE_REASON_EMPTY_MSG = "請輸入變更原因";

    /** 請輸入其他變更原因 */
    String OTHER_UPDATE_REASON_EMPTY_MSG = "請輸入其他變更原因";

    /** 請輸入變更日期 */
    String UPDATE_YYYMMDD_EMPTY_MSG = "請輸入變更日期";

    /** 請輸入其他之附繳證件 */
    String OTHER_CERTIFICATE_EMPTY_MSG = "請輸入其他之附繳證件";

    /** 應變更事項，出生別不可為空白 */
    String BIRTH_ORDER_SEX_EMPTY_MSG = "應變更事項，出生別不可為空白";

    /** 請修改出生別 */
    String BIRTH_ORDER_SEX_SAME_MSG = "請修改出生別";

    /** 請輸入領養日期 */
    String RELATED_DATE_EMPTY_MSG = "請輸入領養日期";

    /** 請輸入領養者姓名 */
    String RELATED_PERSON_EMPTY_MSG = "請輸入領養者姓名";

    /** 請輸入性別變更日期 */
    String CHANGE_SEX_DATE_EMPTY_MSG = "請輸入性別變更日期";

    /** 請輸入兄或姊國民身分證統一編號 */
    String BRO_SIS_EMPTY_MSG = "請輸入兄或姊國民身分證統一編號";

    /** 變更日期不可大於系統日期 */
    String UPDATE_DATE_MSG = "變更日期不可大於系統日期";

    /** 領養日期不可大於系統日期 */
    String RELATED_DATE_MSG = "領養日期不可大於系統日期";

    /** 性別變更日期不可大於系統日期 */
    String CHANGE_SEX_DATE = "性別變更日期不可大於系統日期";

    /**
     * 執行Contoller loadPage() 的第一個Service之共用邏輯.
     * 
     * @param pRl0172cDTO
     *            the rl0172c dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.QUERY)
    void initLoadPage(final Rl0172cDTO pRl0172cDTO, final ExecutantType pExecutantType);

    /**
     * 初始化出生別變更登記.
     * 
     * @param pRl0172cDTO
     *            the rl0172c dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    void initOperationDTO(final Rl0172cDTO pRl0172cDTO, final ExecutantType pExecutantType);

    /**
     * 載入出生別變更登記.
     * 
     * @param pOpeningOperationDTO
     *            the opening operation dto
     * @param pExecutantType
     *            the executant type
     * @return the rl0172c dto
     */
    @RisServiceMethod(MethodType.QUERY)
    Rl0172cDTO loadOperationDTO(final OpeningOperationDTO pOpeningOperationDTO, final ExecutantType pExecutantType);

    /**
     * 再次驗證狀態時載入出生別變更登記DTO.
     * 
     * @param pOpeningOperationDTO
     *            the opening operation dto
     * @param pExecutantType
     *            the executant type
     * @return the rl0172c dto
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    Rl0172cDTO reviewOperationDTO(final OpeningOperationDTO pOpeningOperationDTO, final ExecutantType pExecutantType);

    /**
     * 刪除出生別變更XLDF資料.
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
     * @param pRl0172cDTO
     *            the rl0172c dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.VERIFY)
    void verifyAppData(final Rl0172cDTO pRl0172cDTO, final ExecutantType pExecutantType);

    /**
     * 儲存出生別變更申請資料至XLDF Table.
     * 
     * @param pRl0172cDTO
     *            the rl0172c dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    @WorkStatus(FinalType.TEMP_FINAL)
    void saveXLDF(final Rl0172cDTO pRl0172cDTO, final ExecutantType pExecutantType);

    /**
     * Gets the brother or sister data.
     * 
     * @param pRl0172cDTO
     *            the rl0172c dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    void getBrotherOrSisterData(final Rl0172cDTO pRl0172cDTO, final ExecutantType pExecutantType);
}
