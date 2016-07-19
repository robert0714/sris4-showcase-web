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
import tw.gov.moi.rl.domain.Rl0172aDTO;

/**
 * 戶長變更服務介面.
 * 
 * @author Jay Kan
 */
public interface Rl0172aService {

    /** 戶長變更原因代碼 */
    String UPDATE_REASON_RSCD = RlConstant.RSCD3428;

    /** 戶長變更附繳證件代碼 */
    String CERTIFICATE_RSCD = RlConstant.RSCD3427;

    /** 兼任戶長註記代碼 */
    String CONCURRENT_HEAD_MARK_RSCD = "RSCD0206";

    /** ^\\*.* */
    String REG_EXP = "^\\*.*";

    /** The COMMA. */
    String COMMA = ",";

    /** \r\n. */
    String REPLACE_STRING = "\r\n";

    /** 作業代碼. */
    String OPERATION_CODE = "0172A";

    /** 作業名稱. */
    String OPERATION_NAME = "戶長變更";

    /** 戶長 */
    String HOUSEHOLD_HEAD = "戶長";

    /** 其他變更原因代碼 */
    String OTHER_UPDATE_REASON_CODE = "03";

    /** 其他附繳證件代碼 */
    String OTHER_CERTIFICATE_CODE = "03";

    /** 次分類（申請書類別）. */
    String SUB_TYPE = "0B1";

    /** 記事例代碼. */
    String AUTO_NOTE_ID_1 = "40B1000001";

    /** 記事例代碼. */
    String AUTO_NOTE_ID_2 = "40B1000002";

    /** 請選擇戶長 */
    String HOUSEHOLD_HEAD_ID_EMPTY_MSG = "請選擇戶長";

    /** 戶長統號變更前後相同 */
    String HOUSEHOLD_HEAD_ID_THE_SAME = "戶長統號變更前後相同";

    /** 請輸入稱謂 */
    String RELATIONSHIP_EMPTY_MSG = "請輸入第%s位成員的稱謂";

    /** 兼任戶長變更仍沿用原戶長統號時請修改姓名 */
    String CONCURRENT_HEAD = "兼任戶長變更仍沿用原戶長統號時請修改姓名";

    /** 請輸入變更原因. */
    String UPDATE_REASON_EMPTY_MSG = "請輸入變更原因";

    /** 請輸入其他變更原因. */
    String OTHER_UPDATE_REASON_EMPTY_MSG = "請輸入其他變更原因";

    /** 請輸入變更日期. */
    String UPDATE_YYYMMDD_EMPTY_MSG = "請輸入變更日期";

    /** 請輸入其他之附繳證件. */
    String OTHER_CERTIFICATE_EMPTY_MSG = "請輸入其他之附繳證件";

    /** 變更日期不可大於系統日期. */
    String UPDATE_DATE_MSG = "變更日期不可大於系統日期";

    /** 更新新戶成員「個人基本資料」 */
    String UPDATE_MEMBER_PERSON_DATA = "更新新戶成員「個人基本資料」";

    /** 新增新戶長之「全戶基本資料」 */
    String CREATE_NEW_XLDF001M = "新增新戶長之「全戶基本資料」";

    /** 新增新戶之「全戶動態記事」. */
    String CREATE_XLDF002M = "新增新戶之「全戶動態記事」";

    /** 下除戶 */
    String REMOVE_HOUSEHOLD = "下除戶";

    /** 新增原戶長之「個人除戶動態記事」 */
    String CREATE_XLDF005H = "新增原戶長之「個人除戶動態記事」";

    /** 更改類別 */
    enum ChangeType {
        /** 兼任改兼任 */
        PART_TO_PART,
        /** 兼任改專任 */
        PART_TO_FULL,
        /** 專任改專任 */
        FULL_TO_FULL,
        /** 專任改兼任 */
        FULL_TO_PART
    }

    /**
     * 執行Contoller loadPage() 的第一個Service之共用邏輯.
     * 
     * @param pRl0172aDTO
     *            the rl0172a dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.QUERY)
    void initLoadPage(final Rl0172aDTO pRl0172aDTO, final ExecutantType pExecutantType);

    /**
     * 初始化戶長變更登記.
     * 
     * @param pRl0172aDTO
     *            the rl0172a dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    void initOperationDTO(final Rl0172aDTO pRl0172aDTO, final ExecutantType pExecutantType);

    /**
     * 載入戶長變更登記.
     * 
     * @param pOpeningOperationDTO
     *            the opening operation dto
     * @param pExecutantType
     *            the executant type
     * @return the rl0172a dto
     */
    @RisServiceMethod(MethodType.QUERY)
    Rl0172aDTO loadOperationDTO(final OpeningOperationDTO pOpeningOperationDTO, final ExecutantType pExecutantType);

    /**
     * 再次驗證狀態時載入戶長變更登記DTO.
     * 
     * @param pOpeningOperationDTO
     *            the opening operation dto
     * @param pExecutantType
     *            the executant type
     * @return the rl0172a dto
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    Rl0172aDTO reviewOperationDTO(final OpeningOperationDTO pOpeningOperationDTO, final ExecutantType pExecutantType);

    /**
     * 刪除戶長變更XLDF資料.
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
     * @param pRl0172aDTO
     *            the rl0172a dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.VERIFY)
    void verifyAppData(final Rl0172aDTO pRl0172aDTO, final ExecutantType pExecutantType);

    /**
     * 儲存戶長變更申請資料至XLDF Table.
     * 
     * @param pRl0172aDTO
     *            the rl0172a dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    @WorkStatus(FinalType.TEMP_FINAL)
    void saveXLDF(final Rl0172aDTO pRl0172aDTO, final ExecutantType pExecutantType);

    /**
     * Gets the person data.
     * 
     * @param pRl0172aDTO
     *            the rl0172a dto
     * @param pExecutantType
     *            the executant type
     * @return the person data
     */
    @RisServiceMethod(MethodType.QUERY)
    void getPersonData(final Rl0172aDTO pRl0172aDTO, final ExecutantType pExecutantType);
}
