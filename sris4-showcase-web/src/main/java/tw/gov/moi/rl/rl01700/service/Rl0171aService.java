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
import tw.gov.moi.rl.domain.Rl0171aDTO;

/**
 * 行政區劃及門牌更正登記服務介面.
 * 
 * @author Jay Kan
 */
public interface Rl0171aService {

    /** 作業代碼 */
    String OPERATION_CODE = "0171A";

    /** 作業名稱. */
    String OPERATION_NAME = "行政區劃及門牌更正登記";

    /** 行政區劃及門牌更正原因代碼 */
    String UPDATE_REASON_RSCD = RlConstant.RSCD3352;

    /** 行政區劃及門牌更正附繳證件 */
    String CERTIFICATE_RSCD = RlConstant.RSCD3255;

    /** 其他更正原因代碼 */
    String OTHER_UPDATE_REASON_CODE = "03";

    /** 其他附繳證件代碼 */
    String OTHER_CERTIFICATE_CODE = "7";

    /** 該街路門牌不存在. */
    String STREET_DOORPLATE_NOT_FOUND = "該街路門牌不存在";

    /** 請輸入更正原因 */
    String UPDATE_REASON_EMPTY_MSG = "請輸入更正原因";

    /** 請輸入其他更正原因 */
    String OTHER_UPDATE_REASON_EMPTY_MSG = "請輸入其他更正原因";

    /** 請輸入更正日期 */
    String UPDATE_YYYMMDD_EMPTY_MSG = "請輸入更正日期";

    /** 請輸入其他之附繳證件 */
    String OTHER_CERTIFICATE_EMPTY_MSG = "請輸入其他之附繳證件";

    /** 更正日期不可大於系統日期 */
    String UPDATE_DATE_MSG = "更正日期不可大於系統日期";

    /** 記事例代碼 */
    String AUTO_NOTE_ID = "40A1000001";

    /** \r\n. */
    String REPLACE_STRING = "\r\n";

    /** 0A1 */
    String SUB_TYPE = "0A1";

    /** 更新「全戶基本資料」 */
    String UPDATE_HOUSEHOLD_DATA_EXT_MESSAGE = "更新「全戶基本資料」";

    /** 新增「全戶動態記事」失敗. */
    String CREATE_XLDF002M_EXT_MESSAGE = "新增「全戶動態記事」失敗";

    /** 新增「遷出入人口統計資料」失敗 */
    String CREATE_XLDF003S_EXT_MESSAGE = "新增「遷出入人口統計資料」失敗";

    /**
     * 執行Contoller loadPage() 的第一個Service之共用邏輯.
     * 
     * @param pRl0171aDTO
     *            the rl0171a dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.QUERY)
    void initLoadPage(final Rl0171aDTO pRl0171aDTO, final ExecutantType pExecutantType);

    /**
     * 初始化行政區劃及門牌更正登記.
     * 
     * @param pRl0171aDTO
     *            the rl0171a dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    void initOperationDTO(final Rl0171aDTO pRl0171aDTO, final ExecutantType pExecutantType);

    /**
     * 載入行政區劃及門牌更正登記.
     * 
     * @param pOpeningOperationDTO
     *            the opening operation dto
     * @param pExecutantType
     *            the executant type
     * @return the rl0171a dto
     */
    @RisServiceMethod(MethodType.QUERY)
    Rl0171aDTO loadOperationDTO(final OpeningOperationDTO pOpeningOperationDTO, final ExecutantType pExecutantType);

    /**
     * 再次驗證狀態時載入行政區劃及門牌更正登記DTO.
     * 
     * @param pOpeningOperationDTO
     *            the opening operation dto
     * @param pExecutantType
     *            the executant type
     * @return the rl0171a dto
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    Rl0171aDTO reviewOperationDTO(final OpeningOperationDTO pOpeningOperationDTO, final ExecutantType pExecutantType);

    /**
     * 刪除行政區劃及門牌更正登記XLDF資料.
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
     * @param pRl0171aDTO
     *            the rl0171a dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.VERIFY)
    void verifyAppData(final Rl0171aDTO pRl0171aDTO, final ExecutantType pExecutantType);

    /**
     * 儲存行政區劃及門牌更正登記申請資料至XLDF Table.
     * 
     * @param pRl0171aDTO
     *            the rl0171a dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    @WorkStatus(FinalType.TEMP_FINAL)
    void saveXLDF(final Rl0171aDTO pRl0171aDTO, final ExecutantType pExecutantType);
}
