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
import tw.gov.moi.rl.domain.Rl0172fDTO;

/**
 * 配偶姓名變更服務介面.
 * 
 * @author Jay Kan
 */
public interface Rl0172fService {

    /** 作業代碼. */
    String OPERATION_CODE = "0172F";

    /** 作業名稱. */
    String OPERATION_NAME = "配偶姓名變更";

    /** 配偶姓名變更登記附繳證件 */
    String CERTIFICATE_RSCD = RlConstant.RSCD3390;

    /** 配偶姓名變更原因代碼 */
    String UPDATE_REASON_RSCD = RlConstant.RSCD3391;

    /** 配偶姓名變更法條 */
    String QUOTE_LOW_RSCD = RlConstant.RSCD3392;

    /** 記事例代碼 */
    String AUTO_NOTE_ID = "40B8000001";

    /** 次分類（申請書類別） */
    String SUB_TYPE = "0B8";

    /** 其他變更原因代碼 */
    String OTHER_UPDATE_REASON_CODE = "05";

    /** 配偶死亡更正原因代碼 */
    String SPOUSE_DEATH_UPDATE_REASON_CODE = "04";

    /** 其他附繳證件代碼 */
    String OTHER_CERTIFICATE_CODE = "5";

    /** 配偶姓名 */
    String SPOUSE = "spouse";

    /** 配偶姓 */
    String SPOUSE_LAST_NAME = "spouseLastName";

    /** 配偶名 */
    String SPOUSE_FIRST_NAME = "spouseFirstName";

    /** 請輸入變更原因 */
    String UPDATE_REASON_EMPTY_MSG = "請輸入變更原因";

    /** 請輸入其他變更原因 */
    String OTHER_UPDATE_REASON_EMPTY_MSG = "請輸入其他變更原因";

    /** 請輸入變更日期 */
    String UPDATE_YYYMMDD_EMPTY_MSG = "請輸入變更日期";

    /** 請輸入其他之附繳證件 */
    String OTHER_CERTIFICATE_EMPTY_MSG = "請輸入其他之附繳證件";

    /** 變更日期不可大於系統日期 */
    String UPDATE_DATE_MSG = "變更日期不可大於系統日期";

    /** 應變更事項，配偶名不可為空白 */
    String AFTER_SPOUSE_EMPTY = "應變更事項，配偶名不可為空白";

    /** 請輸入死亡日期 */
    String SPOUSE_DEATH_DATE_EMPTY = "請輸入死亡日期";

    /** 請修改配偶姓名 */
    String SPOUSE_THE_SAME = "請修改配偶姓名";

    /**
     * 執行Contoller loadPage() 的第一個Service之共用邏輯.
     * 
     * @param pRl0172fDTO
     *            the rl0172f dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.QUERY)
    void initLoadPage(final Rl0172fDTO pRl0172fDTO, final ExecutantType pExecutantType);

    /**
     * 初始化配偶姓名變更登記.
     * 
     * @param pRl0172fDTO
     *            the rl0172f dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    void initOperationDTO(final Rl0172fDTO pRl0172fDTO, final ExecutantType pExecutantType);

    /**
     * 載入配偶姓名變更登記.
     * 
     * @param pOpeningOperationDTO
     *            the opening operation dto
     * @param pExecutantType
     *            the executant type
     * @return the rl0172f dto
     */
    @RisServiceMethod(MethodType.QUERY)
    Rl0172fDTO loadOperationDTO(final OpeningOperationDTO pOpeningOperationDTO, final ExecutantType pExecutantType);

    /**
     * 再次驗證狀態時載入配偶姓名變更登記DTO.
     * 
     * @param pOpeningOperationDTO
     *            the opening operation dto
     * @param pExecutantType
     *            the executant type
     * @return the rl0172f dto
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    Rl0172fDTO reviewOperationDTO(final OpeningOperationDTO pOpeningOperationDTO, final ExecutantType pExecutantType);

    /**
     * 刪除配偶姓名變更XLDF資料.
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
     * @param pRl0172fDTO
     *            the rl0172f dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.VERIFY)
    void verifyAppData(final Rl0172fDTO pRl0172fDTO, final ExecutantType pExecutantType);

    /**
     * 儲存配偶姓名變更申請資料至XLDF Table.
     * 
     * @param pRl0172fDTO
     *            the rl0172f dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    @WorkStatus(FinalType.TEMP_FINAL)
    void saveXLDF(final Rl0172fDTO pRl0172fDTO, final ExecutantType pExecutantType);
}
