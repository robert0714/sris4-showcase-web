/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl01g00.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.domain.Rl01g10DTO;

/**
 * 配偶姓名更正廢止服務介面.
 * 
 * @author Jay Kan
 */
public interface Rl01g10Service {

    /** 作業代碼 */
    String OPERATION_CODE = "01G10";

    /** 作業名稱. */
    String OPERATION_NAME = "配偶姓名更正廢止";

    /** 其他附繳證件代碼 */
    String OTHER_CERTIFICATE_CODE = "1";

    /** 配偶姓名更正廢止附繳證件 */
    String CERTIFICATE_RSCD = RlConstant.RSCD3259;

    /** 配偶姓名更正廢止登記引用法條 */
    String QUOTE_LOW_RSCD = RlConstant.RSCD3520;

    /** 請輸入廢止後事項 */
    String CANCEL_ITEM_EMPTY_MSG = "請輸入廢止後事項";

    /** 請輸入更正原因 */
    String CANCEL_REASON_EMPTY_MSG = "請輸入更正原因";

    /** 請輸入更正日期 */
    String CANCEL_YYYMMDD_EMPTY_MSG = "請輸入更正日期";

    /** 請輸入其他之附繳證件 */
    String OTHER_CERTIFICATE_EMPTY_MSG = "請輸入其他之附繳證件";

    /** 請修改配偶姓名 */
    String SPOUSE_SAME_EMPTY_MSG = "請修改配偶姓名";

    /** 記事例代碼 */
    String AUTO_NOTE_ID = "G0DA000001";

    /** 次分類（申請書類別） */
    String SUB_TYPE = "0DA";

    /** 廢止後配偶姓名 */
    String SPOUSE = "spouse";

    /** 廢止後配偶姓 */
    String SPOUSE_LAST_NAME = "spouseLastName";

    /** 廢止後配偶名 */
    String SPOUSE_FIRST_NAME = "spouseFirstName";

    /**
     * 執行Contoller loadPage() 的第一個Service之共用邏輯.
     * 
     * @param pRl01g10DTO
     *            the rl01g10 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.QUERY)
    void initLoadPage(final Rl01g10DTO pRl01g10DTO, final ExecutantType pExecutantType);

    /**
     * 初始化配偶姓名更正廢止登記.
     * 
     * @param pRl01g10DTO
     *            the rl01g10 dto
     * @param pExecutantType
     *            the executant type
     * @return the rl01g10 dto
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    void initOperationDTO(final Rl01g10DTO pRl01g10DTO, final ExecutantType pExecutantType);

    /**
     * 載入配偶姓名更正廢止登記.
     * 
     * @param pOpeningOperationDTO
     *            the opening operation dto
     * @param pExecutantType
     *            the executant type
     * @return the rl01g10 dto
     */
    @RisServiceMethod(MethodType.QUERY)
    Rl01g10DTO loadOperationDTO(final OpeningOperationDTO pOpeningOperationDTO, final ExecutantType pExecutantType);

    /**
     * 再次驗證狀態時載入配偶姓名更正廢止登記DTO.
     * 
     * @param pOpeningOperationDTO
     *            the opening operation dto
     * @param pExecutantType
     *            the executant type
     * @return the rl01g10 dto
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    Rl01g10DTO reviewOperationDTO(final OpeningOperationDTO pOpeningOperationDTO, final ExecutantType pExecutantType);

    /**
     * 刪除配偶姓名更正廢止XLDF資料.
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
     * @param pRl01g10DTO
     *            the rl01g10 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.VERIFY)
    void verifyAppData(final Rl01g10DTO pRl01g10DTO, final ExecutantType pExecutantType);

    /**
     * 儲存配偶姓名更正廢止申請資料至XLDF Table.
     * 
     * @param pRl01g10DTO
     *            the rl01g10 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    @WorkStatus(FinalType.TEMP_FINAL)
    void saveXLDF(final Rl01g10DTO pRl01g10DTO, final ExecutantType pExecutantType);
}
