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
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.domain.Rl01835DTO;

/**
 * 母姓名更正撤銷登記(批次)服務介面.
 * 
 * @author Jay Kan
 */
public interface Rl01835Service {

    /** 作業代碼. */
    String OPERATION_CODE = "01835";

    /** 作業名稱. */
    String OPERATION_NAME = "母姓名更正撤銷";

    /** 記事例代碼. */
    String AUTO_NOTE_ID = "8098000002";

    /** 母姓名更正撤銷原因代碼. */
    String CANCEL_REASON_RSCD = Rl01807Service.CANCEL_REASON_RSCD;

    /** 母姓名更正撤銷附繳證件代碼. */
    String CERTIFICATE_RSCD = Rl01807Service.CERTIFICATE_RSCD;

    /** 撤銷姓名引用法條. */
    String QUOTE_LOW_RSCD = Rl01807Service.QUOTE_LOW_RSCD;

    /** 其他附繳證件代碼. */
    String OTHER_CERTIFICATE_CODE = Rl01807Service.OTHER_CERTIFICATE_CODE;

    /** 次分類（申請書類別）. */
    String SUB_TYPE = Rl01807Service.SUB_TYPE;

    /** 請輸入撤銷原因. */
    String REVOKE_REASON_CODE = Rl01807Service.REVOKE_REASON_CODE;

    /** 請輸入撤銷日期. */
    String REVOKE_YYYMMDD_EMPTY_MSG = Rl01807Service.REVOKE_YYYMMDD_EMPTY_MSG;

    /** 請輸入其他之附繳證件. */
    String OTHER_CERTIFICATE_EMPTY_MSG = Rl01807Service.OTHER_CERTIFICATE_EMPTY_MSG;

    /** 撤銷日期不可大於系統日期. */
    String REVOKE_YYYMMDD = Rl01807Service.REVOKE_YYYMMDD;

    /** \r\n. */
    String REPLACE_STRING = "\r\n";

    /**
     * 執行Contoller loadPage() 的第一個Service之共用邏輯.
     * 
     * @param pRl01835DTO
     *            the rl01835 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.QUERY)
    void initLoadPage(final Rl01835DTO pRl01835DTO, final ExecutantType pExecutantType);

    /**
     * 初始化母姓名更正撤銷登記.
     * 
     * @param pRl01835DTO
     *            the rl01835 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    void initOperationDTO(final Rl01835DTO pRl01835DTO, final ExecutantType pExecutantType);

    /**
     * 載入母姓名更正撤銷登記.
     * 
     * @param pOpeningOperationDTO
     *            the opening operation dto
     * @param pExecutantType
     *            the executant type
     * @return the rl01835 dto
     */
    @RisServiceMethod(MethodType.QUERY)
    Rl01835DTO loadOperationDTO(final OpeningOperationDTO pOpeningOperationDTO, final ExecutantType pExecutantType);

    /**
     * 再次驗證狀態時載入母姓名更正撤銷登記DTO.
     * 
     * @param pOpeningOperationDTO
     *            the opening operation dto
     * @param pExecutantType
     *            the executant type
     * @return the rl01835 dto
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    Rl01835DTO reviewOperationDTO(final OpeningOperationDTO pOpeningOperationDTO, final ExecutantType pExecutantType);

    /**
     * 刪除母姓名更正撤銷XLDF資料.
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
     * @param pRl01835DTO
     *            the rl01835 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.VERIFY)
    void verifyAppData(final Rl01835DTO pRl01835DTO, final ExecutantType pExecutantType);

    /**
     * 儲存母姓名更正撤銷申請資料至XLDF Table.
     * 
     * @param pRl01835DTO
     *            the rl01835 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    @WorkStatus(FinalType.TEMP_FINAL)
    void saveXLDF(final Rl01835DTO pRl01835DTO, final ExecutantType pExecutantType);

    /**
     * 選取擬撤銷的原登記申請書。.
     * 
     * @param pRl01835DTO
     *            the rl01835 dto
     * @param pExecutantType
     *            the executant type
     */
    void selectOrgApplication(final Rl01835DTO pRl01835DTO, final ExecutantType pExecutantType);

    /**
     * 檢視擬撤銷之原登記申請書。.
     * 
     * @param pRl01835DTO
     *            the rl01835 dto
     * @param pExecutantType
     *            the executant type
     */
    void viewOrgApplication(final Rl01835DTO pRl01835DTO, final ExecutantType pExecutantType);
}
