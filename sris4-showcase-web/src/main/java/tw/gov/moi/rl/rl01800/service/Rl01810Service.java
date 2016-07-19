/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl01800.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.domain.Rl01810DTO;

/**
 * 配偶姓名更正撤銷服務介面.
 * 
 * @author Jay Kan
 */
public interface Rl01810Service {

    /** 作業代碼. */
    String OPERATION_CODE = "01810";

    /** 作業名稱. */
    String OPERATION_NAME = "配偶姓名更正撤銷";

    /** 配偶姓名更正撤銷原因代碼 */
    String CANCEL_REASON_RSCD = RlConstant.RSCD3447;

    /** 配偶姓名更正撤銷附繳證件代碼 */
    String CERTIFICATE_RSCD = RlConstant.RSCD3446;

    /** 撤銷姓名引用法條 */
    String QUOTE_LOW_RSCD = RlConstant.RSCD3329;

    /** 其他附繳證件代碼 */
    String OTHER_CERTIFICATE_CODE = "02";

    /** 記事例代碼. */
    String AUTO_NOTE_ID = "809B000001";

    /** 次分類（申請書類別）. */
    String SUB_TYPE = "09B";

    /** 配偶姓名. */
    String SPOUSE = "spouse";

    /** 配偶姓. */
    String SPOUSE_LAST_NAME = "spouseLastName";

    /** 配偶名. */
    String SPOUSE_FIRST_NAME = "spouseFirstName";

    /** 請輸入原登記事項. */
    String BEFORE_WORK = "請輸入原登記事項";

    /** 請輸入撤銷原因. */
    String REVOKE_REASON_CODE = "請輸入撤銷原因";

    /** 請輸入撤銷日期. */
    String REVOKE_YYYMMDD_EMPTY_MSG = "請輸入撤銷日期";

    /** 請輸入其他之附繳證件. */
    String OTHER_CERTIFICATE_EMPTY_MSG = "請輸入其他之附繳證件";

    /** 應撤銷事項，配偶姓名不可為空白. */
    String AFTER_SPOUSE_EMPTY_MSG = "應撤銷事項，配偶姓名不可為空白";

    /** 撤銷日期不可大於系統日期. */
    String REVOKE_YYYMMDD = "撤銷日期不可大於系統日期";

    /**
     * 執行Contoller loadPage() 的第一個Service之共用邏輯.
     * 
     * @param pRl01810DTO
     *            the rl01810 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.QUERY)
    void initLoadPage(final Rl01810DTO pRl01810DTO, final ExecutantType pExecutantType);

    /**
     * 初始化配偶姓名更正撤銷登記.
     * 
     * @param pRl01810DTO
     *            the rl01810 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    void initOperationDTO(final Rl01810DTO pRl01810DTO, final ExecutantType pExecutantType);

    /**
     * 載入配偶姓名更正撤銷登記.
     * 
     * @param pOpeningOperationDTO
     *            the opening operation dto
     * @param pExecutantType
     *            the executant type
     * @return the rl01810 dto
     */
    @RisServiceMethod(MethodType.QUERY)
    Rl01810DTO loadOperationDTO(final OpeningOperationDTO pOpeningOperationDTO, final ExecutantType pExecutantType);

    /**
     * 再次驗證狀態時載入配偶姓名更正撤銷登記DTO.
     * 
     * @param pOpeningOperationDTO
     *            the opening operation dto
     * @param pExecutantType
     *            the executant type
     * @return the rl01810 dto
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    Rl01810DTO reviewOperationDTO(final OpeningOperationDTO pOpeningOperationDTO, final ExecutantType pExecutantType);

    /**
     * 刪除配偶姓名更正撤銷XLDF資料.
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
     * @param pRl01810DTO
     *            the rl01810 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.VERIFY)
    void verifyAppData(final Rl01810DTO pRl01810DTO, final ExecutantType pExecutantType);

    /**
     * 儲存配偶姓名更正撤銷申請資料至XLDF Table.
     * 
     * @param pRl01810DTO
     *            the rl01810 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    @WorkStatus(FinalType.TEMP_FINAL)
    void saveXLDF(final Rl01810DTO pRl01810DTO, final ExecutantType pExecutantType);

    /**
     * 選取擬撤銷的原登記申請書。.
     * 
     * @param pRl01810DTO
     *            the rl01810 dto
     * @param pExecutantType
     *            the executant type
     */
    void selectOrgApplication(final Rl01810DTO pRl01810DTO, final ExecutantType pExecutantType);

    /**
     * 檢視擬撤銷之原登記申請書。.
     * 
     * @param pRl01810DTO
     *            the rl01810 dto
     * @param pExecutantType
     *            the executant type
     */
    void viewOrgApplication(final Rl01810DTO pRl01810DTO, final ExecutantType pExecutantType);
}
