/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl01200.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.domain.Rl01273DTO;

/**
 * 終止收養登記服務介面
 * 
 * @author DAXIONG
 */
public interface Rl01273Service {
    // Constant
    final String MAIN = "被收養者";
    final String MAIN_TYPE = "2";
    final String APPLY_CODE = "062";
    final String NOTICE_TYPE = "L003";
    final String FOSTER_FATHER = "養父";
    final String FOSTER_MOTHER = "養母";
    final String APPLY_TYPE_MAIN = "0";
    final String DE_NAME = "RLRPA0000";
    final String MAIN_NOTE_CODE = "2062000001";
    final String APPLY_TYPE_FOSTER_FATHER = "1";
    final String APPLY_TYPE_FOSTER_MOTHER = "2";
    final String EXPIRE_ADOPT_TYPE_DEFAULT = "2";
    final String FOSTER_NOTE_CODE = "2062000002";
    final String OPERATION_CODE = RlConstant.OPERATION_CODE_01273;

    // Error Message
    final String E_MSG_METHOD_DO_DELETE = "刪除終止收養登記資料失敗";
    final String E_MSG_METHOD_SAVE_XLDF1S = "暫存「申請書資料檔」至XLDF1S失敗";
    final String E_MSG_METHOD_SAVE_XLDF2R = "暫存「外來申請書資料」至XLDF2R失敗";
    final String E_MSG_METHOD_SAVE_XCDF = "暫存終止收養登記申請資料至XLDFTable失敗";
    final String E_MSG_METHOD_INIT_OPERATION_DTO = "設定第一次新增登記畫面初始值失敗";
    final String E_MSG_METHOD_SAVE_XLDF008S = "暫存「申請書索引資料檔」至XLDF008S失敗";
    final String E_MSG_METHOD_SAVE_XLDF016S = "暫存「連線交易統計記錄檔」至XLDF016S失敗";
    final String E_MSG_METHOD_SAVE_XLDFM04MORH = "暫存「收養記錄檔」至XLDFM04MorH失敗";
    final String E_MSG_METHOD_SAVE_XLDF005MORH = "暫存「個人記事資料」至XLDF005MorH失敗";
    final String E_MSG_METHOD_SAVE_XLDF009S = "暫存「臨時－外來申請書索引紀錄」至XLDF009S失敗";
    final String E_MSG_METHOD_SAVE_XLDF004MT = "暫存「被收養者-個人基本資料」至XLDF004MT失敗";
    final String E_MSG_METHOD_SAVE_XLDFM10MORH = "暫存「個人申請書紀錄檔」至XLDFM10MorH失敗";
    final String E_MSG_METHOD_SAVE_XCDF001MRL = "暫存「全國個人資料摘要資料」至XCDF001MRL失敗";
    final String E_MSG_METHOD_SAVE_XLDF026S = "暫存「臨時－辦理他所申請書索引資料」至XLDF026S失敗";
    final String E_MSG_METHOD_SAVE_XLDF4T = "暫存「辦理他所－終止收養登記申請書歷史資料」至XLDF4T失敗";
    final String E_MSG_METHOD_SAVE_XLDFY062MORH = "暫存「個人記事欄位化資料」至XLDFY062MorH失敗";
    final String E_MSG_METHOD_SAVE_XLDF004MORH = "暫存「被收養者-個人基本資料」至XLDF004MorH失敗";
    final String E_MSG_METHOD_SAVE_XLDF004MORH_FOSTER_FATHER = "暫存「養父-個人基本資料」至XLDF004MorH失敗";
    final String E_MSG_METHOD_SAVE_XLDF004MORH_FOSTER_MOTHER = "暫存「養母-個人基本資料」至XLDF004MorH失敗";

    /**
     * 刪除終止收養登記資料。
     * 
     * @param dto
     *            終止收養登記DTO
     * @param exec
     *            ExecutantType
     * @throws RisBusinessException
     */
    void doDelete(final Rl01273DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 取得養父資料。
     * 
     * @param dto
     *            終止收養登記DTO
     * @param exec
     *            ExecutantType
     * @return 終止收養登記DTO
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    Rl01273DTO getFosterFatherData(final Rl01273DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 取得養母資料。
     * 
     * @param dto
     *            終止收養登記DTO
     * @param exec
     *            ExecutantType
     * @return 終止收養登記DTO
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    Rl01273DTO getFosterMotherData(final Rl01273DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 執行Contoller loadPage() 的第一個Service之共用邏輯。
     * 
     * @param dto
     *            終止收養登記DTO
     * @param exec
     *            ExecutantType
     * @return 終止收養登記DTO
     * @throws RisBusinessException
     */
    Rl01273DTO initLoadPage(final Rl01273DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 設定第一次新增登記畫面初始值。
     * 
     * @param dto
     *            終止收養登記DTO
     * @param exec
     *            ExecutantType
     * @return 終止收養登記DTO
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    Rl01273DTO initOperationDTO(final Rl01273DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 設定編輯登記畫面初始值。
     * 
     * @param dto
     *            終止收養登記DTO
     * @param exec
     *            ExecutantType
     * @return 終止收養登記DTO
     * @throws RisBusinessException
     */
    Rl01273DTO loadOperationDTO(final Rl01273DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 再次驗證狀態時載入登記畫面初始值。
     * 
     * @param dto
     *            終止收養登記DTO
     * @param exec
     *            ExecutantType
     * @return 終止收養登記DTO
     * @throws RisBusinessException
     */
    Rl01273DTO reviewOperationDTO(final Rl01273DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 暫存「終止收養登記資料」至XLDFTable。
     * 
     * @param dto
     *            終止收養登記DTO
     * @param exec
     *            ExecutantType
     * @return 終止收養登記DTO
     * @throws RisBusinessException
     */
    @WorkStatus(FinalType.TEMP_FINAL)
    @RisServiceMethod(MethodType.SAVE2TEMP)
    Rl01273DTO saveXldf(final Rl01273DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 執行資料驗證並自動組合記事。
     * 
     * @param dto
     *            終止收養登記DTO
     * @param exec
     *            ExecutantType
     * @return 終止收養登記DTO
     * @throws RisBusinessException
     */
    Rl01273DTO verifyAppData(final Rl01273DTO dto, final ExecutantType exec) throws RisBusinessException;
}