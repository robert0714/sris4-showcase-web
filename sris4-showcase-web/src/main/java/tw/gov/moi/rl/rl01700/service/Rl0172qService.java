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
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.domain.Rl0172qDTO;

/**
 * 父姓名變更登記(批次)服務介面.
 * 
 * @author Jay Kan
 */
public interface Rl0172qService {

    /** 作業代碼. */
    String OPERATION_CODE = "0172Q";

    /** 作業名稱. */
    String OPERATION_NAME = "父姓名變更";

    /** 記事例代碼. */
    String AUTO_NOTE_ID = "40B4000002";

    /** 父姓名變更原因代碼. */
    String UPDATE_REASON_RSCD = Rl0172gService.UPDATE_REASON_RSCD;

    /** 父母姓名變更-附繳證件. */
    String CERTIFICATE_RSCD = Rl0172gService.CERTIFICATE_RSCD;

    /** 姓名變更引用法條. */
    String QUOTE_LOW_RSCD = Rl0172gService.QUOTE_LOW_RSCD;

    /** 其他變更原因代碼. */
    String OTHER_UPDATE_REASON_CODE = Rl0172gService.OTHER_UPDATE_REASON_CODE;

    /** 其他附繳證件代碼. */
    String OTHER_CERTIFICATE_CODE = Rl0172gService.OTHER_CERTIFICATE_CODE;

    /** 次分類（申請書類別）. */
    String SUB_TYPE = Rl0172gService.SUB_TYPE;

    /** 請輸入變更原因. */
    String UPDATE_REASON_EMPTY_MSG = Rl0172gService.UPDATE_REASON_EMPTY_MSG;

    /** 請輸入其他變更原因. */
    String OTHER_UPDATE_REASON_EMPTY_MSG = Rl0172gService.OTHER_UPDATE_REASON_EMPTY_MSG;

    /** 請輸入變更日期. */
    String UPDATE_YYYMMDD_EMPTY_MSG = Rl0172gService.UPDATE_YYYMMDD_EMPTY_MSG;

    /** 請輸入其他之附繳證件. */
    String OTHER_CERTIFICATE_EMPTY_MSG = Rl0172gService.OTHER_CERTIFICATE_EMPTY_MSG;

    /** 變更日期不可大於系統日期. */
    String UPDATE_DATE_MSG = Rl0172gService.UPDATE_DATE_MSG;

    /** \r\n. */
    String REPLACE_STRING = "\r\n";

    /**
     * 執行Contoller loadPage() 的第一個Service之共用邏輯.
     * 
     * @param pRl0172qDTO
     *            the rl0172q dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.QUERY)
    void initLoadPage(final Rl0172qDTO pRl0172qDTO, final ExecutantType pExecutantType);

    /**
     * 初始化父姓名變更登記.
     * 
     * @param pRl0172qDTO
     *            the rl0172q dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    void initOperationDTO(final Rl0172qDTO pRl0172qDTO, final ExecutantType pExecutantType);

    /**
     * 載入父姓名變更登記.
     * 
     * @param pOpeningOperationDTO
     *            the opening operation dto
     * @param pExecutantType
     *            the executant type
     * @return the rl0172q dto
     */
    @RisServiceMethod(MethodType.QUERY)
    Rl0172qDTO loadOperationDTO(final OpeningOperationDTO pOpeningOperationDTO, final ExecutantType pExecutantType);

    /**
     * 再次驗證狀態時載入父姓名變更登記DTO.
     * 
     * @param pOpeningOperationDTO
     *            the opening operation dto
     * @param pExecutantType
     *            the executant type
     * @return the rl0172q dto
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    Rl0172qDTO reviewOperationDTO(final OpeningOperationDTO pOpeningOperationDTO, final ExecutantType pExecutantType);

    /**
     * 刪除父姓名變更XLDF資料.
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
     * @param pRl0172qDTO
     *            the rl0172q dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.VERIFY)
    void verifyAppData(final Rl0172qDTO pRl0172qDTO, final ExecutantType pExecutantType);

    /**
     * 儲存父姓名變更申請資料至XLDF Table.
     * 
     * @param pRl0172qDTO
     *            the rl0172q dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    @WorkStatus(FinalType.TEMP_FINAL)
    void saveXLDF(final Rl0172qDTO pRl0172qDTO, final ExecutantType pExecutantType);
}
