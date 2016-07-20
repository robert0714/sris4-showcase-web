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
import tw.gov.moi.rl.domain.Rl01210DTO;

/**
 * 出生登記服務介面
 * 
 * @author DAXIONG
 */
public interface Rl01210Service {
    // Constant
    final String MALE = "男";
    final String FEMALE = "女";
    final String MAIN = "出生者";
    final String FATHER = "生父";
    final String MOTHER = "生母";
    final String MAIN_TYPE = "2";
    final String MALE_CODE = "1";
    final String FEMALE_CODE = "2";
    final String HOUSEHOLD = "擬入戶";
    final String APPLY_CODE = "001";
    final String IDENTITY_TYPE = "1";
    final String HOUSEHOLD_ID = "戶號";
    final String NOTICE_TYPE = "L003";
    final String FROM_FATHER_ID = "2";
    final String FROM_MOTHER_ID = "1";
    final String APPLY_TYPE_MAIN = "0";
    final String DE_NAME = "RLRPA0000";
    final String HOUSEHOLD_HEAD = "戶長";
    final String NEW_HOUSEHOLD = "自立新戶";
    final String APPLY_TYPE_FATHER = "1";
    final String APPLY_TYPE_MOTHER = "2";
    final String NAME_TYPE_DEFAULT = "1";
    final String DATE_FORMAT = "twyMMdd";
    final String BIRTH_KIND_DEFAULT = "1";
    final String ANNOUNCE_BY_FATHER = "2";
    final String ANNOUNCE_BY_MOTHER = "1";
    final String BIRTH_DATE_TYPE_DEFAULT = "1";
    final String BIRTH_TYPE_CODE_DEFAULT = "1";
    final String IS_NEW_HOUSEHOLD_DEFAULT = "2";
    final String SAME_BIRTH_ORDER_DEFAULT = "0";
    final String FATHER_NOTE_CODE = "2001000003";
    final String LIVING_STYLE_CODE_DEFAULT = "0";
    final String MOTHER_NOTE_CODE = "2001000004";
    final String HOUSEHOLD_NOTE_CODE = "2001000002";
    final String BIRTH_PLACE_TYPE_CODE_DEFAULT = "1";
    final String OPERATION_CODE = RlConstant.OPERATION_CODE_01210;

    // Error Message
    final String E_MSG_GENDER = "%s必須為%s性";
    final String E_MSG_METHOD_DO_DELETE = "刪除出生登記資料失敗";
    final String E_MSG_METHOD_SAVE_XLDF1S = "暫存「申請書資料檔」至XLDF1S失敗";
    final String E_MSG_METHOD_SAVE_XCDF = "暫存出生登記申請資料至XLDFTable失敗";
    final String E_MSG_METHOD_SAVE_XLDF2R = "暫存「外來申請書資料」至XLDF2R失敗";
    final String E_MSG_GET_NEW_MALE_PERSON_ID = "取得作業點為%s的男生新統號失敗";
    final String E_MSG_GET_NEW_HOUSEHOLD_ID = "取得作業點為%s的自立新戶之新戶號失敗";
    final String E_MSG_GET_NEW_FEMALE_PERSON_ID = "取得作業點為%s的女生新統號失敗";
    final String E_MSG_METHOD_SAVE_XLDF005M = "暫存「個人記事資料」至XLDF005M失敗";
    final String E_MSG_METHOD_SAVE_XLDF021M = "暫存「戶號配賦資料」至XLDF021M失敗";
    final String E_MSG_METHOD_SAVE_XLDF022M = "暫存「統號配賦資料」至XLDF022M失敗";
    final String E_MSG_METHOD_INIT_OPERATION_DTO = "設定第一次新增登記畫面初始值失敗";
    final String E_MSG_METHOD_SAVE_XLDF008S = "暫存「申請書索引資料檔」至XLDF008S失敗";
    final String E_MSG_METHOD_SAVE_XLDFM01M = "暫存「出生者-出生資料」至XLDFM01M失敗";
    final String E_MSG_METHOD_SAVE_XLDFM10M = "暫存「個人申請書紀錄檔」至XLDFM10M失敗";
    final String E_MSG_METHOD_SAVE_XLDF016S = "暫存「連線交易統計記錄檔」至XLDF016S失敗";
    final String E_MSG_METHOD_SAVE_XLDF004M = "暫存「出生者-個人基本資料」至XLDF004M失敗";
    final String E_MSG_METHOD_SAVE_XLDF058M = "暫存「出生通報查核結果資料」至XLDF058M失敗";
    final String E_MSG_METHOD_SAVE_XLDFM11M = "暫存「出生者-個人姓氏資料」至XLDFM11M失敗";
    final String E_MSG_METHOD_SAVE_XLDFX001M = "暫存「全戶記事欄位化資料」至XLDFX001M失敗";
    final String E_MSG_METHOD_SAVE_XLDFY001M = "暫存「個人記事欄位化資料」至XLDFY001M失敗";
    final String E_MSG_METHOD_SAVE_XLDF009S = "暫存「臨時－外來申請書索引紀錄」至XLDF009S失敗";
    final String E_MSG_METHOD_SAVE_XLDF4T = "暫存「辦理他所－出生登記申請書歷史資料」至XLDF4T失敗";
    final String E_MSG_METHOD_SAVE_XCDF001MRL = "暫存「全國個人資料摘要資料」至XCDF001MRL失敗";
    final String E_MSG_METHOD_SAVE_XLDF026S = "暫存「臨時－辦理他所申請書索引資料」至XLDF026S失敗";
    final String E_MSG_METHOD_SAVE_XLDF001M_NEW = "暫存「自立新戶之全戶基本資料」至XLDF001M失敗";
    final String E_MSG_METHOD_SAVE_XLDF004M_FATHER = "暫存「生父-個人基本資料」至XLDF004M失敗";
    final String E_MSG_METHOD_SAVE_XLDF004M_MOTHER = "暫存「生母-個人基本資料」至XLDF004M失敗";
    final String E_MSG_METHOD_SAVE_XLDF001M_UPDATE = "暫存「入他人戶之全戶基本資料」至XLDF001M失敗";
    final String E_MSG_METHOD_GET_NEW_HOUSEHOLD_ID_BY_SITE_ID = "依作業點代碼取得自立新戶之新戶號失敗";

    /**
     * 刪除出生登記資料。
     * 
     * @param dto
     *            出生登記DTO
     * @param exec
     *            ExecutantType
     * @throws RisBusinessException
     */
    void doDelete(final Rl01210DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 取得出生通報查核結果資料。
     * 
     * @param dto
     *            出生登記DTO
     * @param exec
     *            ExecutantType
     * @throws RisBusinessException
     */
    void getBirthAnnounceCheckResult(final Rl01210DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 依生父生母統號取得子女資料。
     * 
     * @param dto
     *            出生登記DTO
     * @param exec
     *            ExecutantType
     * @return 出生登記DTO
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    Rl01210DTO getChildList(final Rl01210DTO dto, final ExecutantType exec) throws RisBusinessException;

    // REDMINE:#4268
    // /**
    // * 依作業點代碼取得自立新戶之新戶號。
    // *
    // * @param dto
    // * 出生登記DTO
    // * @param exec
    // * ExecutantType
    // * @return 出生登記DTO
    // * @throws RisBusinessException
    // */
    // @RisServiceMethod(MethodType.QUERY)
    // Rl01210DTO getNewHouseholdIdBySiteId(final Rl01210DTO dto, final ExecutantType exec) throws RisBusinessException;

    // REDMINE:#4268
    // /**
    // * 依作業點代碼取得男生及女生新統號。
    // *
    // * @param dto
    // * 出生登記DTO
    // * @param exec
    // * ExecutantType
    // * @return 出生登記DTO
    // * @throws RisBusinessException
    // */
    // @RisServiceMethod(MethodType.QUERY)
    // Rl01210DTO getNewPersonIdPairBySiteId(final Rl01210DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 取得非自立新戶時擬入戶戶長資料。
     * 
     * @param dto
     *            出生登記DTO
     * @param exec
     *            ExecutantType
     * @return 出生登記DTO
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    Rl01210DTO getHouseholdHeadData(final Rl01210DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 取得生父、生母資料及出生通報資料。
     * 
     * @param dto
     *            出生登記DTO
     * @param exec
     *            ExecutantType
     * @return 出生登記DTO
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    Rl01210DTO getParentData(final Rl01210DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 執行Contoller loadPage() 的第一個Service之共用邏輯。
     * 
     * @param dto
     *            出生登記DTO
     * @param exec
     *            ExecutantType
     * @return 出生登記DTO
     * @throws RisBusinessException
     */
    Rl01210DTO initLoadPage(final Rl01210DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 設定第一次新增登記畫面初始值。
     * 
     * @param dto
     *            出生登記DTO
     * @param exec
     *            ExecutantType
     * @return 出生登記DTO
     * @throws RisBusinessException
     */
    Rl01210DTO initOperationDTO(final Rl01210DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 設定編輯登記畫面初始值。
     * 
     * @param dto
     *            出生登記DTO
     * @param exec
     *            ExecutantType
     * @return 出生登記DTO
     * @throws RisBusinessException
     */
    Rl01210DTO loadOperationDTO(final Rl01210DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 再次驗證狀態時載入登記畫面初始值。
     * 
     * @param dto
     *            出生登記DTO
     * @param exec
     *            ExecutantType
     * @return 出生登記DTO
     * @throws RisBusinessException
     */
    Rl01210DTO reviewOperationDTO(final Rl01210DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 儲存出生登記申請資料至XLDF Table。
     * 
     * @param dto
     *            出生登記DTO
     * @param exec
     *            ExecutantType
     * @return 出生登記DTO
     * @throws RisBusinessException
     */
    @WorkStatus(FinalType.TEMP_FINAL)
    @RisServiceMethod(value = MethodType.SAVE2TEMP)
    Rl01210DTO saveXldf(final Rl01210DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 設定嬰兒出生通報資料。
     * 
     * @param dto
     *            出生登記DTO
     * @param exec
     *            ExecutantType
     * @return 出生登記DTO
     * @throws RisBusinessException
     */
    Rl01210DTO setBirthAnnounceData(final Rl01210DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 執行資料驗證並自動組合記事。
     * 
     * @param dto
     *            出生登記DTO
     * @param exec
     *            ExecutantType
     * @return 出生登記DTO
     * @throws RisBusinessException
     */
    Rl01210DTO verifyAppData(final Rl01210DTO dto, final ExecutantType exec) throws RisBusinessException;
}