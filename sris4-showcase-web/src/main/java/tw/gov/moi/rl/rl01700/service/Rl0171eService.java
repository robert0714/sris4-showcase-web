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
import tw.gov.moi.rl.domain.Rl0171eDTO;

/**
 * 出生日期更正服務介面.
 * 
 * @author Derek Wang
 */
public interface Rl0171eService {

    /** 作業代碼. */
    String OPERATION_CODE = "0171E";

    /** 作業名稱. */
    String OPERATION_NAME = "出生日期更正登記 ";

    /** 出生日期更正原因代碼 */
    String UPDATE_REASON_RSCD = RlConstant.RSCD3254;

    /** 出生日期更正-附繳證件 */
    String CERTIFICATE_RSCD = RlConstant.RSCD3263;

    /** 記事例代碼 */
    String AUTO_NOTE_ID = "40A2000001";

    /** 次分類（申請書類別）. */
    String SUB_TYPE = "0A2";

    /** 其他更正原因代碼. */
    String OTHER_UPDATE_REASON_CODE = "3";

    /** 其他附繳證件代碼. */
    String OTHER_CERTIFICATE_CODE = "21";

    /** 出生日期 */
    String BIRTH_YYYMMDD = "birthYyymmdd";

    /** 請輸入更正原因 */
    String UPDATE_REASON_EMPTY_MSG = "請輸入更正原因";

    /** 請輸入其他更正原因 */
    String OTHER_UPDATE_REASON_EMPTY_MSG = "請輸入其他更正原因";

    /** 請輸入更正日期 */
    String UPDATE_YYYMMDD_EMPTY_MSG = "請輸入更正日期";

    /** 請輸入其他之附繳證件 */
    String OTHER_CERTIFICATE_EMPTY_MSG = "請輸入其他之附繳證件";

    /** 應更正事項，出生日期不可為空白 */
    String AFTER_BIRTHDATE_EMPTY_MSG = "應更正事項，出生日期不可為空白";

    /** 請修改出生日期 */
    String BIRTHDATE_SAME_EMPTY_MSG = "請修改出生日期";

    /** 更正日期不可大於系統日期 */
    String UPDATE_DATE_MSG = "更正日期不可大於系統日期";

    /** 新增「臨時─出生日期更改紀錄檔失敗」. */
    String CREATE_XLDFM09M_EXT_MESSAGE = "新增「臨時─出生日期更改紀錄檔失敗」";

    /**
     * 執行Contoller loadPage() 的第一個Service之共用邏輯.
     * 
     * @param pRl0171eDTO
     *            the rl0171e dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.QUERY)
    void initLoadPage(final Rl0171eDTO pRl0171eDTO, final ExecutantType pExecutantType);

    /**
     * 初始化出生日期更正登記.
     * 
     * @param rl0171eDTO
     *            the rl0171e dto
     * @param executantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    void initOperationDTO(final Rl0171eDTO rl0171eDTO, final ExecutantType pExecutantType);

    /**
     * 載入出生日期更正登記.
     * 
     * @param rl0171eDTO
     *            the rl0171e dto
     * @param executantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.QUERY)
    Rl0171eDTO loadOperationDTO(final OpeningOperationDTO pOpeningOperationDTO, final ExecutantType pExecutantType);

    /**
     * 再次驗證狀態時載入出生日期更正登記DTO.
     * 
     * @param Rl0171eDTO
     *            the rl0171eDTO
     * @param ExecutantType
     *            the executantType
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    Rl0171eDTO reviewOperationDTO(final OpeningOperationDTO pOpeningOperationDTO, final ExecutantType pExecutantType);

    /**
     * 刪除出生日期更正XLDF資料.
     * 
     * @param openingOperationDTO
     *            the opening operation dto
     * @param executantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.DELETE)
    void doDelete(final OpeningOperationDTO openingOperationDTO, final ExecutantType pExecutantType);

    /**
     * 執行資料驗證並自動組合記事.
     * 
     * @param rl0171eDTO
     *            the rl0171e dto
     * @param executantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.VERIFY)
    void verifyAppData(final Rl0171eDTO rl0171eDTO, final ExecutantType pExecutantType);

    /**
     * 儲存出生日期更正申請資料至XLDF Table.
     * 
     * @param rl0171eDTO
     *            the rl0171e dto
     * @param executantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    @WorkStatus(FinalType.TEMP_FINAL)
    void saveXLDF(final Rl0171eDTO rl0171eDTO, final ExecutantType pExecutantType);

}
