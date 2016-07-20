/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl01130.service;

import java.util.List;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.domain.Rldfd003Type;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.domain.Rl01130DTO;

/**
 * 補填、更正除戶個人記事服務介面.
 * 
 * @author Dan Tsai
 */
public interface Rl01130Service {

    /** 作業名稱. */
    String OPERATION_NAME = "更正除戶個人記事";

    /** 原事項 */
    String BEFORE_REGISTER_CONTENT_EMPTY_MSG = "請輸入原事項";

    /** 請輸入更正事項原因 */
    String AFTER_REGISTER_CONTENT_EMPTY_MSG = "請輸入更正事項原因";

    /** 戶長除戶個人基本資料不存在 */
    String HOUSE_HOLD_HEAD_PERSON_DATA_EMPTY_MSG = "戶長除戶個人基本資料不存在";

    /** 請輸入更正原因 */
    String UPDATE_REASON_EMPTY_MSG = "請輸入更正原因";

    /** 更正日期 */
    String UPDATE_YYYMMDD_EMPTY_MSG = "請輸入更正日期";

    /** 請輸入附繳證件 */
    String CERTIFICATE_LIST_EMPTY_MSG = "請輸入附繳證件";

    /** 請輸入其他之附繳證件 */
    String OTHER_CERTIFICATE_EMPTY_MSG = "請輸入其他之附繳證件";

    /** 修改之原住民身分及族別與原登記之身分及族別相同 */
    String LIVING_SAME_MSG = "修改之原住民身分及族別與原登記之身分及族別相同";

    /** 當事人無原住民身分不得註記族別 */
    String NO_RACE_TYPE_MSG = "當事人無原住民身分不得註記族別";

    /** 更正日期不可大於系統日期 */
    String UPDATE_DATE_MSG = "更正日期不可大於系統日期";

    /** 補填 */
    String CHANGE_TITLE_0C9 = "0C9";

    /** 更正 */
    String CHANGE_TITLE_0AH = "0AH";

    /**
     * 執行Contoller loadPage() 的第一個Service之共用邏輯.
     * 
     * @param pRl0171lDTO
     *            the rl0171l dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.QUERY)
    void initLoadPage(final Rl01130DTO pRl01130DTO, final ExecutantType pExecutantType);

    /**
     * 第一次呼叫狀態時載入補填、更正除戶個人記事DTO.
     * 
     * @param pRl01130DTO
     *            the rl01130 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.QUERY)
    void initOperationDTO(final Rl01130DTO pRl01130DTO, final ExecutantType pExecutantType);

    /**
     * 編輯狀態時載入補填、更正除戶個人記事DTO.
     * 
     * @param pRl01130DTO
     *            the rl01130 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE)
    Rl01130DTO loadOperationDTO(final OpeningOperationDTO pOpeningOperationDTO, final ExecutantType pExecutantType);

    /**
     * 再次驗證狀態時載入補填、更正除戶個人記事DTO.
     * 
     * @param pRl01130DTO
     *            the rl01130 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE)
    Rl01130DTO reviewOperationDTO(final OpeningOperationDTO pOpeningOperationDTO, final ExecutantType pExecutantType);

    /**
     * 刪除補填、更正除戶個人記事資料.
     * 
     * @param pOpeningOperationDTO
     *            the opening operation dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.DELETE)
    void doDelete(final Rl01130DTO pRl01130DTO, final ExecutantType pExecutantType);

    /**
     * 執行資料驗證.
     * 
     * @param pRl01130DTO
     *            the rl01130 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.VERIFY)
    void verifyAppData(final Rl01130DTO pRl01130DTO, final ExecutantType pExecutantType);

    /**
     * 暫存補填、更正除戶個人記事申請資料至XLDF Table.
     * 
     * @param pRl01130DTO
     *            the rl01130 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    @WorkStatus(FinalType.TEMP_FINAL)
    void saveXLDF(final Rl01130DTO pRl01130DTO, final ExecutantType pExecutantType);

    /**
     * 查詢 RLDFD003 製作 auto complete
     * 
     * @param Rl01130DTO
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    List<Rldfd003Type> doQueryRLDFD003(final Rl01130DTO pRl01130DTO, final ExecutantType pExecutantType);

}
