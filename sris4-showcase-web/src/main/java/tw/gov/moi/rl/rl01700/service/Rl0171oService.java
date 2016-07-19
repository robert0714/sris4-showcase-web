/*
 * Copyright (c) 2010-2020 IISI. All rights reserved.
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
import tw.gov.moi.rl.domain.Rl0171oDTO;

/**
 * 出生地更正登記服務介面.
 * 
 * @author Jay Kan
 */
public interface Rl0171oService {

    /** 作業代碼 */
    String OPERATION_CODE = "0171O";

    /** 作業名稱. */
    String OPERATION_NAME = "出生地更正";

    /** 出生地更正原因代碼 */
    String UPDATE_REASON_RSCD = "RSCD3358";

    /** 出生地代碼 */
    String BIRTH_PLACE_RSCD = "RSCD0104";

    /** 出生地更正-附繳證件 */
    String CERTIFICATE_RSCD = "RSCD3357";

    /** 大陸其他省市 */
    String CHINA_CODE = RlConstant.RSCD0104_CODE_99998;

    /** 國外 */
    String FOREIGN_CODE = RlConstant.RSCD0104_CODE_99999;

    /** 次分類（申請書類別） */
    String SUB_TYPE = "0A6";

    /** 其他更正原因代碼 */
    String OTHER_UPDATE_REASON_CODE = "03";

    /** 其他附繳證件代碼 */
    String OTHER_CERTIFICATE_CODE = "8";

    /** 記事例代碼 */
    String AUTO_NOTE_ID_1 = "40A6000001";

    /** 記事例代碼 */
    String AUTO_NOTE_ID_2 = "40A6000002";

    /** 出生地代碼 */
    String BIRTH_PLACE_CODE = "birthPlaceCode";

    /** 其他出生地 */
    String OTHER_BIRTH_PLACE = "otherBirthPlace";

    /** 請輸入更正原因 */
    String UPDATE_REASON_EMPTY_MSG = "請輸入更正原因";

    /** 請輸入其他更正原因 */
    String OTHER_UPDATE_REASON_EMPTY_MSG = "請輸入其他更正原因";

    /** 請輸入更正日期 */
    String UPDATE_YYYMMDD_EMPTY_MSG = "請輸入更正日期";

    /** 請輸入其他之附繳證件 */
    String OTHER_CERTIFICATE_EMPTY_MSG = "請輸入其他之附繳證件";

    /** 應更正事項，出生地不可為空白 */
    String AFTER_BIRTH_PLACE_EMPTY_MSG = "應更正事項，出生地不可為空白";

    /** 請修改出生地 */
    String BIRTH_PLACE_SAME_MSG = "請修改出生地";

    /** 更正日期不可大於系統日期 */
    String UPDATE_DATE_MSG = "更正日期不可大於系統日期";

    /** 更新「國民其他出生地資料檔」 */
    String UPDATE_XLDFM13M = "更新「國民其他出生地資料檔」";

    /**
     * 執行Contoller loadPage() 的第一個Service之共用邏輯.
     * 
     * @param pRl0171oDTO
     *            the rl0171o dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.QUERY)
    void initLoadPage(final Rl0171oDTO pRl0171oDTO, final ExecutantType pExecutantType);

    /**
     * 初始化出生地更正登記.
     * 
     * @param pRl0171oDTO
     *            the rl0171o dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    void initOperationDTO(final Rl0171oDTO pRl0171oDTO, final ExecutantType pExecutantType);

    /**
     * 載入出生地更正登記.
     * 
     * @param pOpeningOperationDTO
     *            the opening operation dto
     * @param pExecutantType
     *            the executant type
     * @return the rl0171o dto
     */
    @RisServiceMethod(MethodType.QUERY)
    Rl0171oDTO loadOperationDTO(final OpeningOperationDTO pOpeningOperationDTO, final ExecutantType pExecutantType);

    /**
     * 再次驗證狀態時載入出生地更正登記DTO.
     * 
     * @param pOpeningOperationDTO
     *            the opening operation dto
     * @param pExecutantType
     *            the executant type
     * @return the rl0171o dto
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    Rl0171oDTO reviewOperationDTO(final OpeningOperationDTO pOpeningOperationDTO, final ExecutantType pExecutantType);

    /**
     * 刪除出生地更正XLDF資料.
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
     * @param pRl0171oDTO
     *            the rl0171o dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.VERIFY)
    void verifyAppData(final Rl0171oDTO pRl0171oDTO, final ExecutantType pExecutantType);

    /**
     * 儲存出生地更正申請資料至XLDF Table.
     * 
     * @param pRl0171oDTO
     *            the rl0171o dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    @WorkStatus(FinalType.TEMP_FINAL)
    void saveXLDF(final Rl0171oDTO pRl0171oDTO, final ExecutantType pExecutantType);
}
