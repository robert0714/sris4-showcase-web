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
import tw.gov.moi.rl.domain.Rl0171gDTO;

/**
 * 出生別更正服務介面.
 * 
 * @author Dan Tsai
 */
public interface Rl0171gService {

    /** 作業代碼. */
    String OPERATION_CODE = "0171G";

    /** 作業名稱. */
    String OPERATION_NAME = "出生別更正";

    /** 出生別更正原因代碼 */
    String UPDATE_REASON_RSCD = RlConstant.RSCD3254;

    /** 出生別代碼 */
    String BIRTH_ORDER_RSCD = RlConstant.RSCD0205;

    /** 附繳證件代碼 */
    String CERTIFICATE_RSCD = RlConstant.RSCD3263;

    /** 其他附繳證件代碼 */
    String OTHER_CERTIFICATE_CODE = "21";

    /** 其他更正原因代碼. */
    String OTHER_UPDATE_REASON_CODE = "3";

    /** 40A3000001. */
    String AUTO_NOTE_ID = "40A3000001";

    /** 0A3. */
    String SUB_TYPE = "0A3";

    /** 請輸入更正原因 */
    String UPDATE_REASON_EMPTY_MSG = "請輸入更正原因";

    /** 請輸入其他更正原因 */
    String OTHER_UPDATE_REASON_EMPTY_MSG = "請輸入其他更正原因";

    /** 請輸入更正日期 */
    String UPDATE_YYYMMDD_EMPTY_MSG = "請輸入更正日期";

    /** 請輸入其他之附繳證件. */
    String OTHER_CERTIFICATE_EMPTY_MSG = "請輸入其他之附繳證件";

    /** 應更正事項，出生別不可為空白 */
    String AFTER_BIRTH_ORDER_MSG = "應更正事項，出生別不可為空白";

    /** 請修改出生別 */
    String BIRTH_ORDER_SAME_MSG = "請修改出生別";

    /** 更正日期不可大於系統日期 */
    String UPDATE_DATE_MSG = "更正日期不可大於系統日期";

    /**
     * 執行Contoller loadPage() 的第一個Service之共用邏輯.
     * 
     * @param pRl0171gDTO
     *            the rl0171g dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.QUERY)
    void initLoadPage(final Rl0171gDTO pRl0171gDTO, final ExecutantType pExecutantType);

    /**
     * 初始化出生別更正登記.
     * 
     * @param pRl0171gDTO
     *            the rl0171g dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    void initOperationDTO(final Rl0171gDTO pRl0171gDTO, final ExecutantType pExecutantType);

    /**
     * 載入出生別更正登記.
     * 
     * @param pOpeningOperationDTO
     *            the opening operation dto
     * @param pExecutantType
     *            the executant type
     * @return the rl0171g dto
     */
    @RisServiceMethod(MethodType.QUERY)
    Rl0171gDTO loadOperationDTO(final OpeningOperationDTO pOpeningOperationDTO, final ExecutantType pExecutantType);

    /**
     * 再次驗證狀態時載入出生別更正登記DTO.
     * 
     * @param pOpeningOperationDTO
     *            the opening operation dto
     * @param pExecutantType
     *            the executant type
     * @return the rl0171g dto
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    Rl0171gDTO reviewOperationDTO(final OpeningOperationDTO pOpeningOperationDTO, final ExecutantType pExecutantType);

    /**
     * 刪除出生別更正XLDF資料.
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
     * @param pRl0171gDTO
     *            the rl0171g dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.VERIFY)
    void verifyAppData(final Rl0171gDTO pRl0171gDTO, final ExecutantType pExecutantType);

    /**
     * 儲存出生別更正申請資料至XLDF Table.
     * 
     * @param pRl0171gDTO
     *            the rl0171g dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    @WorkStatus(FinalType.TEMP_FINAL)
    void saveXLDF(final Rl0171gDTO pRl0171gDTO, final ExecutantType pExecutantType);
}
