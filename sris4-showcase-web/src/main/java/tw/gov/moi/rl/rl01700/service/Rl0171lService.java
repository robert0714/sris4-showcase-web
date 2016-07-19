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
import tw.gov.moi.rl.domain.Rl0171lDTO;

/**
 * 原住民身分及族別更正服務介面.
 * 
 * @author Jay Kan
 */
public interface Rl0171lService {

    /** 作業代碼 */
    String OPERATION_CODE = "0171L";

    /** 作業名稱. */
    String OPERATION_NAME = "原住民身分及族別更正";

    /** 原住民身分及族別更正原因代碼 */
    String UPDATE_REASON_RSCD = RlConstant.RSCD3352;

    /** 原住民身分及族別更正附繳證件 */
    String CERTIFICATE_RSCD = RlConstant.RSCD3338;

    /** 原住民身分及族別更正引用法條代碼 */
    String QUOTE_LOW_RSCD = RlConstant.RSCD3337;

    /** 原住民身份-代碼檔名稱 */
    String LIVING_STYLE_RSCD = RlConstant.RSCD0208;

    /** 原住民族別-代碼檔名稱 */
    String LIVING_RACE_TYPE_RSCD = RlConstant.RSCD0220;

    /** 記事例代碼 */
    String AUTO_NOTE_ID_1 = "40A5000001";

    /** 記事例代碼 */
    String AUTO_NOTE_ID_2 = "40A5000002";

    /** 記事例代碼 */
    String AUTO_NOTE_ID_3 = "40A5000003";

    /** 次分類（申請書類別） */
    String SUB_TYPE = "0A5";

    /** 其他更正原因代碼 */
    String OTHER_UPDATE_REASON_CODE = "03";

    /** 其他附繳證件代碼 */
    String OTHER_CERTIFICATE_CODE = "5";

    /** 原住民身分 */
    String LIVING_STYLE_CODE = "livingStyleCode";

    /** 原住民族別 */
    String LIVING_RACE_TYPE = "livingRaceType";

    /** 請輸入更正原因 */
    String UPDATE_REASON_EMPTY_MSG = "請輸入更正原因";

    /** 請輸入其他更正原因 */
    String OTHER_UPDATE_REASON_EMPTY_MSG = "請輸入其他更正原因";

    /** 請輸入更正日期 */
    String UPDATE_YYYMMDD_EMPTY_MSG = "請輸入更正日期";

    /** 請輸入其他之附繳證件 */
    String OTHER_CERTIFICATE_EMPTY_MSG = "請輸入其他之附繳證件";

    /** 修改之原住民身分及族別與原登記之身分及族別相同 */
    String LIVING_SAME_MSG = "修改之原住民身分及族別與原登記之身分及族別相同";

    /** 當事人無原住民身分不得註記族別 */
    String NO_RACE_TYPE_MSG = "當事人無原住民身分不得註記族別";

    /** 更正日期不可大於系統日期 */
    String UPDATE_DATE_MSG = "更正日期不可大於系統日期";

    /**
     * 執行Contoller loadPage() 的第一個Service之共用邏輯.
     * 
     * @param pRl0171lDTO
     *            the rl0171l dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.QUERY)
    void initLoadPage(final Rl0171lDTO pRl0171lDTO, final ExecutantType pExecutantType);

    /**
     * 初始化原住民身分及族別更正登記.
     * 
     * @param pRl0171lDTO
     *            the rl0171l dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    void initOperationDTO(final Rl0171lDTO pRl0171lDTO, final ExecutantType pExecutantType);

    /**
     * 載入原住民身分及族別更正登記.
     * 
     * @param pOpeningOperationDTO
     *            the opening operation dto
     * @param pExecutantType
     *            the executant type
     * @return the rl0171l dto
     */
    @RisServiceMethod(MethodType.QUERY)
    Rl0171lDTO loadOperationDTO(final OpeningOperationDTO pOpeningOperationDTO, final ExecutantType pExecutantType);

    /**
     * 再次驗證狀態時載入原住民身分及族別更正登記DTO.
     * 
     * @param pOpeningOperationDTO
     *            the opening operation dto
     * @param pExecutantType
     *            the executant type
     * @return the rl0171l dto
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    Rl0171lDTO reviewOperationDTO(final OpeningOperationDTO pOpeningOperationDTO, final ExecutantType pExecutantType);

    /**
     * 刪除原住民身分及族別更正XLDF資料.
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
     * @param pRl0171lDTO
     *            the rl0171l dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.VERIFY)
    void verifyAppData(final Rl0171lDTO pRl0171lDTO, final ExecutantType pExecutantType);

    /**
     * 儲存原住民身分及族別更正申請資料至XLDF Table.
     * 
     * @param pRl0171lDTO
     *            the rl0171l dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    @WorkStatus(FinalType.TEMP_FINAL)
    void saveXLDF(final Rl0171lDTO pRl0171lDTO, final ExecutantType pExecutantType);
}
