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
import tw.gov.moi.rl.domain.Rl0172jDTO;

/**
 * 養母姓名變更服務介面.
 * 
 * @author Jay Kan
 */
public interface Rl0172jService {

    /** 作業代碼. */
    String OPERATION_CODE = "0172J";

    /** 作業名稱. */
    String OPERATION_NAME = "養母姓名變更";

    /** 養母姓名變更附繳證件代碼 */
    String CERTIFICATE_RSCD = RlConstant.RSCD3386;

    /** 養母姓名變更原因代碼 */
    String UPDATE_REASON_RSCD = RlConstant.RSCD3378;

    /** 養母姓名變更法條 */
    String QUOTE_LOW_RSCD = RlConstant.RSCD3379;

    /** 次分類（申請書類別）. */
    String SUB_TYPE = "0BA";

    /** 其他變更原因代碼 */
    String OTHER_UPDATE_REASON_CODE = "04";

    /** 其他附繳證件代碼 */
    String OTHER_CERTIFICATE_CODE = "5";

    /** 記事例代碼. */
    String AUTO_NOTE_ID_1 = "40BA000001";

    /** 記事例代碼. */
    String AUTO_NOTE_ID_2 = "40BA000002";

    /** 養母姓名. */
    String FOSTER_MOTHER = "fosterMother";

    /** 養母姓. */
    String FOSTER_MOTHER_LAST_NAME = "fosterMotherLastName";

    /** 養母名. */
    String FOSTER_MOTHER_FIRST_NAME = "fosterMotherFirstName";

    /** 養父母註記 */
    String FOSTER_PARENT_MARK = "fosterParentMark";

    /** 請輸入變更原因. */
    String UPDATE_REASON_EMPTY_MSG = "請輸入變更原因";

    /** 請輸入其他變更原因. */
    String OTHER_UPDATE_REASON_EMPTY_MSG = "請輸入其他變更原因";

    /** 請輸入變更日期. */
    String UPDATE_YYYMMDD_EMPTY_MSG = "請輸入變更日期";

    /** 請輸入其他之附繳證件. */
    String OTHER_CERTIFICATE_EMPTY_MSG = "請輸入其他之附繳證件";

    /** 應變更事項，養母名不可為空白. */
    String AFTER_FOSTER_MOTHER_EMPTY_MSG = "應變更事項，養母名不可為空白";

    /** 請修改養母姓名. */
    String FOSTER_MOTHER_SAME_MSG = "請修改養母姓名";

    /** 變更日期不可大於系統日期. */
    String UPDATE_DATE_MSG = "變更日期不可大於系統日期";

    /**
     * 執行Contoller loadPage() 的第一個Service之共用邏輯.
     * 
     * @param pRl0172jDTO
     *            the rl0172j dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.QUERY)
    void initLoadPage(final Rl0172jDTO pRl0172jDTO, final ExecutantType pExecutantType);

    /**
     * 初始化養母姓名變更登記.
     * 
     * @param pRl0172jDTO
     *            the rl0172j dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    void initOperationDTO(final Rl0172jDTO pRl0172jDTO, final ExecutantType pExecutantType);

    /**
     * 載入養母姓名變更登記.
     * 
     * @param pOpeningOperationDTO
     *            the opening operation dto
     * @param pExecutantType
     *            the executant type
     * @return the rl0172j dto
     */
    @RisServiceMethod(MethodType.QUERY)
    Rl0172jDTO loadOperationDTO(final OpeningOperationDTO pOpeningOperationDTO, final ExecutantType pExecutantType);

    /**
     * 再次驗證狀態時載入養母姓名變更登記DTO.
     * 
     * @param pOpeningOperationDTO
     *            the opening operation dto
     * @param pExecutantType
     *            the executant type
     * @return the rl0172j dto
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    Rl0172jDTO reviewOperationDTO(final OpeningOperationDTO pOpeningOperationDTO, final ExecutantType pExecutantType);

    /**
     * 刪除養母姓名變更XLDF資料.
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
     * @param pRl0172jDTO
     *            the rl0172j dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.VERIFY)
    void verifyAppData(final Rl0172jDTO pRl0172jDTO, final ExecutantType pExecutantType);

    /**
     * 儲存養母姓名變更申請資料至XLDF Table.
     * 
     * @param pRl0172jDTO
     *            the rl0172j dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    @WorkStatus(FinalType.TEMP_FINAL)
    void saveXLDF(final Rl0172jDTO pRl0172jDTO, final ExecutantType pExecutantType);
}
