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
import tw.gov.moi.rl.domain.Rl012e0DTO;

/**
 * 監護登記服務介面
 * 
 * @author DAXIONG
 */
public interface Rl012e0Service {
    // Constant
    final String MAIN = "受監護人";
    final String MAIN_TYPE = "2";
    final String RELATED = "監護人";
    final String SU_OP_CODE = "1";
    final String APPLY_CODE = "079";
    final String RELATION_CODE = "V";
    final String NOTICE_TYPE = "L003";
    final String APPLY_TYPE_MAIN = "0";
    final String DE_NAME = "RLRPA0000";
    final String APPLY_TYPE_RELATED = "1";
    final String SUPERVISE_TYPE_DEFAULT = "1";
    final String SUPERVISE_REASON = "RSCD3082";
    final String LAW_SU_JUDGE_WAY_DEFAULT = "1";
    final String SUPERVISE_REASON_DEFAULT = "1";
    final String DECALRE_SU_JUDGE_WAY_DEFAULT = "1";
    final String WILL_SU_DECISION_MAKER_DEFAULT = "1";
    final String DELEGATE_SU_DELEGATE_ASKER_DEFAULT = "1";
    final String LAW_SU_SUPERVIOR_CHANGE_FLAG_DEFAULT = "2";
    final String LAW_SU_SUPERVIOR_CHANGE_REASON_DEFAULT = "1";
    final String OPERATION_CODE = RlConstant.OPERATION_CODE_012E0;

    // Error Message
    final String E_MSG_METHOD_DO_DELETE = "刪除監護登記資料失敗";
    final String E_MSG_METHOD_SAVE_XLDF1S = "暫存「申請書資料檔」至XLDF1S失敗";
    final String E_MSG_METHOD_SAVE_XCDF = "暫存監護登記申請資料至XLDFTable失敗";
    final String E_MSG_METHOD_SAVE_XLDF2R = "暫存「外來申請書資料」至XLDF2R失敗";
    final String E_MSG_METHOD_INIT_OPERATION_DTO = "設定第一次新增登記畫面初始值失敗";
    final String E_MSG_METHOD_SAVE_XLDF008S = "暫存「申請書索引資料檔」至XLDF008S失敗";
    final String E_MSG_METHOD_SAVE_XLDF016S = "暫存「連線交易統計記錄檔」至XLDF016S失敗";
    final String E_MSG_METHOD_CONFIRM_RELATED_PERSON_DATA = "確定新增監護人資料失敗";
    final String E_MSG_METHOD_SAVE_XLDFM05MORH = "暫存「監護資料檔」至XLDFM05MorH失敗";
    final String E_MSG_METHOD_SAVE_XLDFM08MORH = "暫存「監護紀錄檔」至XLDFM08MorH失敗";
    final String E_MSG_METHOD_REMOVE_RELATED_PERSON_DATA = "刪除勾選的新增監護人資料失敗";
    final String E_MSG_METHOD_SAVE_XLDF005MORH = "暫存「個人記事資料」至XLDF005MorH失敗";
    final String E_MSG_METHOD_SAVE_XLDF009S = "暫存「臨時－外來申請書索引紀錄」至XLDF009S失敗";
    final String E_MSG_METHOD_SAVE_XLDF4T = "暫存「辦理他所－監護登記申請書歷史資料」至XLDF4T失敗";
    final String E_MSG_METHOD_SAVE_XLDFM10MORH = "暫存「個人申請書紀錄檔」至XLDFM10MorH失敗";
    final String E_MSG_METHOD_SAVE_XLDF026S = "暫存「臨時－辦理他所申請書索引資料」至XLDF026S失敗";
    final String E_MSG_METHOD_ADD_XLDF_APLCEX = "暫存監護人到「外加申請人記錄檔」XLDFAPLCEX失敗";
    final String E_MSG_METHOD_SAVE_XLDFY079MORH = "暫存「個人記事欄位化資料」至XLDFY079MorH失敗";
    final String E_MSG_METHOD_SAVE_XLDF004MORH = "暫存「受監護人-個人基本資料」至XLDF004MorH失敗";
    final String E_MSG_METHOD_GET_APPLICANT_1_TO_RELATED_PERSON = "取得申請人1到新增監護人失敗";
    final String E_MSG_METHOD_GET_APPLICANT_2_TO_RELATED_PERSON = "取得申請人2到新增監護人失敗";
    final String E_MSG_METHOD_SAVE_XLDFY079DMORH = "暫存「個人記事欄位化資料-子檔」至XLDFY079DMorH 失敗";
    final String E_MSG_METHOD_SAVE_XLDF004MORH_RELATED_PERSON = "暫存「監護人-個人基本資料」至XLDF004MorH失敗";

    /**
     * 確定新增監護人資料。
     * 
     * @param dto
     *            監護登記DTO
     * @param exec
     *            ExecutantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    void confirmRelatedPersonData(final Rl012e0DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 刪除監護登記資料。
     * 
     * @param dto
     *            監護登記DTO
     * @param exec
     *            ExecutantType
     * @throws RisBusinessException
     */
    void doDelete(final Rl012e0DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 取得申請人1到新增監護人。
     * 
     * @param dto
     *            監護登記DTO
     * @param exec
     *            ExecutantType
     * @throws RisBusinessException
     */
    void getApplicant1ToRelatedPerson(final Rl012e0DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 取得申請人2到新增監護人。
     * 
     * @param dto
     *            監護登記DTO
     * @param exec
     *            ExecutantType
     * @throws RisBusinessException
     */
    void getApplicant2ToRelatedPerson(final Rl012e0DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 取得監護人資料。
     * 
     * @param dto
     *            監護登記DTO
     * @param exec
     *            ExecutantType
     * @throws RisBusinessException
     */
    void getSupervisorData(final Rl012e0DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 執行Contoller loadPage() 的第一個Service之共用邏輯。
     * 
     * @param dto
     *            監護登記DTO
     * @param exec
     *            ExecutantType
     * @return 監護登記DTO
     * @throws RisBusinessException
     */
    Rl012e0DTO initLoadPage(final Rl012e0DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 設定第一次新增登記畫面初始值。
     * 
     * @param dto
     *            監護登記DTO
     * @param exec
     *            ExecutantType
     * @return 監護登記DTO
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    Rl012e0DTO initOperationDTO(final Rl012e0DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 設定編輯登記畫面初始值。
     * 
     * @param dto
     *            監護登記DTO
     * @param exec
     *            ExecutantType
     * @return 監護登記DTO
     * @throws RisBusinessException
     */
    Rl012e0DTO loadOperationDTO(final Rl012e0DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 刪除勾選的新增監護人資料。
     * 
     * @param dto
     *            監護登記DTO
     * @param exec
     *            ExecutantType
     * @throws RisBusinessException
     */
    void removeRelatedPersonData(final Rl012e0DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 再次驗證狀態時載入登記畫面初始值。
     * 
     * @param dto
     *            監護登記DTO
     * @param exec
     *            ExecutantType
     * @return 監護登記DTO
     * @throws RisBusinessException
     */
    Rl012e0DTO reviewOperationDTO(final Rl012e0DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 暫存「監護登記資料」至XLDFTable。
     * 
     * @param dto
     *            監護登記DTO
     * @param exec
     *            ExecutantType
     * @return 監護登記DTO
     * @throws RisBusinessException
     */
    @WorkStatus(FinalType.TEMP_FINAL)
    @RisServiceMethod(MethodType.SAVE2TEMP)
    Rl012e0DTO saveXldf(final Rl012e0DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 執行資料驗證並自動組合記事。
     * 
     * @param dto
     *            監護登記DTO
     * @param exec
     *            ExecutantType
     * @return 監護登記DTO
     * @throws RisBusinessException
     */
    Rl012e0DTO verifyAppData(final Rl012e0DTO dto, final ExecutantType exec) throws RisBusinessException;
}