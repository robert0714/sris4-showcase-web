/*
 * Copyright (c) 2010-2020 IISI. All rights reserved.
 * 
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl01700.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.dto.Rl0171pDTO;

/**
 * 戶號更正服務介面.
 */
public interface Rl0171pService {

    String OPERATION_CODE = "0171P";

    String SUB_TYPE = "0AD";

    /** 戶號更正原因代碼 */
    String UPDATE_REASON_RSCD = "RSCD3358";

    /** 戶號更正-附繳證件 */
    String CERTIFICATE_RSCD = "RSCD3360";

    /** 其他更正原因代碼 */
    String OTHER_UPDATE_REASON_CODE = "03";

    /** 其他附繳證件代碼 */
    String OTHER_CERTIFICATE_CODE = "5";

    /** 取得作業點為siteId的新戶號失敗 */
    String GET_NEW_HOUSEHOLD_ID_BY_SITE_ID = "取得作業點為%s的新戶號失敗";

    /** 請輸入更正戶號. */
    String HOUSEHOLD_ID_EMPTY_MSG = "請輸入更正戶號";

    /** 暫存「戶號配賦資料」至XLDF021M */
    String SAVE_XLDF021M = "暫存「戶號配賦資料」至XLDF021M";

    /**
     * 初始化戶號更正登記.
     * 
     * @param dto
     *            the dto
     * @param exe
     *            the exe
     */
    void initOperationDTO(final Rl0171pDTO dto, final ExecutantType exe);

    /**
     * 載入戶號更正登記.
     * 
     * @param pOpeningOperationDTO
     *            the opening operation dto
     * @param exe
     *            the exe
     * @return the rl0171p dto
     */
    Rl0171pDTO loadOperationDTO(final OpeningOperationDTO pOpeningOperationDTO, final ExecutantType exe);

    /**
     * 再次驗證狀態時載入戶號更正登記DTO.
     * 
     * @param pOpeningOperationDTO
     *            the opening operation dto
     * @param exe
     *            the exe
     * @return the rl0171p dto
     */
    Rl0171pDTO reviewOperationDTO(final OpeningOperationDTO pOpeningOperationDTO, final ExecutantType exe);

    /**
     * 刪除戶號更正XLDF資料.
     * 
     * @param openingOperationDTO
     *            the opening operation dto
     * @param exe
     *            the exe
     */
    void doDelete(final OpeningOperationDTO openingOperationDTO, final ExecutantType exe);

    /**
     * 執行資料驗證並自動組合記事.
     * 
     * @param dto
     *            the dto
     * @param exe
     *            the exe
     */
    void verifyAppData(final Rl0171pDTO dto, final ExecutantType exe);

    /**
     * 儲存戶號更正申請資料至XLDF Table.
     * 
     * @param dto
     *            the dto
     * @param exe
     *            the exe
     */
    void saveXLDF(final Rl0171pDTO dto, final ExecutantType exe);

    /**
     * 逕為登記旗標.
     * 
     * @param dto
     *            the dto
     * @param pExecutantType
     *            the executant type
     */
    void initEnforcedFlag(final Rl0171pDTO dto, final ExecutantType pExecutantType);
}
