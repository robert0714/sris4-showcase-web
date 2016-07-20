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
import tw.gov.moi.rl.domain.Rl0171uDTO;

/**
 * 母姓名更正登記(批次)服務介面.
 * 
 * @author Jay Kan
 */
public interface Rl0171uService {

    /** 作業代碼. */
    String OPERATION_CODE = "0171U";

    /** 作業名稱. */
    String OPERATION_NAME = "母姓名更正";

    /** 記事例代碼. */
    String AUTO_NOTE_ID = "40AB000003";

    /** 母姓名更正原因代碼. */
    String UPDATE_REASON_RSCD = Rl0171jService.UPDATE_REASON_RSCD;

    /** 父母姓名更正-附繳證件. */
    String CERTIFICATE_RSCD = Rl0171jService.CERTIFICATE_RSCD;

    /** 姓名更正引用法條. */
    String QUOTE_LOW_RSCD = Rl0171jService.QUOTE_LOW_RSCD;

    /** 其他更正原因代碼. */
    String OTHER_UPDATE_REASON_CODE = Rl0171jService.OTHER_UPDATE_REASON_CODE;

    /** 其他附繳證件代碼. */
    String OTHER_CERTIFICATE_CODE = Rl0171jService.OTHER_CERTIFICATE_CODE;

    /** 次分類（申請書類別）. */
    String SUB_TYPE = Rl0171jService.SUB_TYPE;

    /** 請輸入更正原因. */
    String UPDATE_REASON_EMPTY_MSG = Rl0171jService.UPDATE_REASON_EMPTY_MSG;

    /** 請輸入其他更正原因. */
    String OTHER_UPDATE_REASON_EMPTY_MSG = Rl0171jService.OTHER_UPDATE_REASON_EMPTY_MSG;

    /** 請輸入更正日期. */
    String UPDATE_YYYMMDD_EMPTY_MSG = Rl0171jService.UPDATE_YYYMMDD_EMPTY_MSG;

    /** 請輸入其他之附繳證件. */
    String OTHER_CERTIFICATE_EMPTY_MSG = Rl0171jService.OTHER_CERTIFICATE_EMPTY_MSG;

    /** 更正日期不可大於系統日期. */
    String UPDATE_DATE_MSG = Rl0171jService.UPDATE_DATE_MSG;

    /** \r\n. */
    String REPLACE_STRING = "\r\n";

    /**
     * 執行Contoller loadPage() 的第一個Service之共用邏輯.
     * 
     * @param pRl0171uDTO
     *            the rl0171u dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.QUERY)
    void initLoadPage(final Rl0171uDTO pRl0171uDTO, final ExecutantType pExecutantType);

    /**
     * 初始化母姓名更正登記.
     * 
     * @param pRl0171uDTO
     *            the rl0171u dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    void initOperationDTO(final Rl0171uDTO pRl0171uDTO, final ExecutantType pExecutantType);

    /**
     * 載入母姓名更正登記.
     * 
     * @param pOpeningOperationDTO
     *            the opening operation dto
     * @param pExecutantType
     *            the executant type
     * @return the rl0171u dto
     */
    @RisServiceMethod(MethodType.QUERY)
    Rl0171uDTO loadOperationDTO(final OpeningOperationDTO pOpeningOperationDTO, final ExecutantType pExecutantType);

    /**
     * 再次驗證狀態時載入母姓名更正登記DTO.
     * 
     * @param pOpeningOperationDTO
     *            the opening operation dto
     * @param pExecutantType
     *            the executant type
     * @return the rl0171u dto
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    Rl0171uDTO reviewOperationDTO(final OpeningOperationDTO pOpeningOperationDTO, final ExecutantType pExecutantType);

    /**
     * 刪除母姓名更正XLDF資料.
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
     * @param pRl0171uDTO
     *            the rl0171u dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.VERIFY)
    void verifyAppData(final Rl0171uDTO pRl0171uDTO, final ExecutantType pExecutantType);

    /**
     * 儲存母姓名更正申請資料至XLDF Table.
     * 
     * @param pRl0171uDTO
     *            the rl0171u dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    @WorkStatus(FinalType.TEMP_FINAL)
    void saveXLDF(final Rl0171uDTO pRl0171uDTO, final ExecutantType pExecutantType);
}
