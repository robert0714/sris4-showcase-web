/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl01800.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.domain.Rl01831DTO;

/**
 * 監護撤銷登記服務介面
 * 
 * @author DAXIONG
 */
public interface Rl01831Service {
    // Constant
    final String MAIN = "受監護人";
    final String MAIN_TYPE = "2";
    final String RELATED = "監護人";
    final String APPLY_CODE = "09S";
    final String RELATION_CODE = "V";
    final String NOTICE_TYPE = "L003";
    final String APPLY_TYPE_MAIN = "0";
    final String DE_NAME = "RLRPA0000";
    final String APPLY_TYPE_RELATED = "1";
    final String CANCEL_REASON = "RSCD3432";
    final String CANCEL_REASON_DEFAULT = "1";
    final String MAIN_NOTE_CODE = "809S000001";
    final String RELATED_NOTE_CODE = "809S000002";
    final String OPERATION_CODE = RlConstant.OPERATION_CODE_01831;

    // Error Message
    final String E_MSG_METHOD_DO_DELETE = "刪除監護撤銷登記資料失敗";
    final String E_MSG_METHOD_SAVE_XLDF1S = "暫存「申請書資料檔」至XLDF1S失敗";
    final String E_MSG_METHOD_SAVE_XLDF2R = "暫存「外來申請書資料」至XLDF2R失敗";
    final String E_MSG_METHOD_SAVE_XCDF = "暫存監護撤銷登記申請資料至XLDFTable失敗";
    final String E_MSG_METHOD_INIT_OPERATION_DTO = "設定第一次新增登記畫面初始值失敗";
    final String E_MSG_METHOD_SAVE_XLDF008S = "暫存「申請書索引資料檔」至XLDF008S失敗";
    final String E_MSG_METHOD_SAVE_XLDF016S = "暫存「連線交易統計記錄檔」至XLDF016S失敗";
    final String E_MSG_METHOD_SAVE_XLDFM05MORH = "暫存「監護資料檔」至XLDFM05MorH失敗";
    final String E_MSG_METHOD_SAVE_XLDFM08MORH = "暫存「監護紀錄檔」至XLDFM08MorH失敗";
    final String E_MSG_METHOD_SAVE_XLDF005MORH = "暫存「個人記事資料」至XLDF005MorH失敗";
    final String E_MSG_METHOD_SAVE_XLDF009S = "暫存「臨時－外來申請書索引紀錄」至XLDF009S失敗";
    final String E_MSG_METHOD_GET_XLDFM05MORH = "取得受監護人「監護資料檔」XLDFM05MorH失敗";
    final String E_MSG_METHOD_SAVE_XLDFM10MORH = "暫存「個人申請書紀錄檔」至XLDFM10MorH失敗";
    final String E_MSG_METHOD_SAVE_XLDF026S = "暫存「臨時－辦理他所申請書索引資料」至XLDF026S失敗";
    final String E_MSG_METHOD_SAVE_XLDF4T = "暫存「辦理他所－監護撤銷登記申請書歷史資料」至XLDF4T失敗";
    final String E_MSG_METHOD_SAVE_XLDFY09SMORH = "暫存「個人記事欄位化資料」至XLDFY09SMorH失敗";
    final String E_MSG_METHOD_SAVE_XLDF004MORH = "暫存「受監護人-個人基本資料」至XLDF004MorH失敗";
    final String E_MSG_METHOD_SAVE_XLDF004MORH_RELATED_PERSON = "暫存「監護人-個人基本資料」至XLDF004MorH失敗";

    /**
     * 刪除監護撤銷登記資料資料。
     * 
     * @param dto
     *            監護撤銷登記DTO
     * @param exec
     *            ExecutantType
     * @throws RisBusinessException
     */
    void doDelete(final Rl01831DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 取得監護人資料。
     * 
     * @param dto
     *            監護撤銷登記DTO
     * @param exec
     *            ExecutantType
     * @return 監護撤銷登記DTO
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    Rl01831DTO getRelatedPersonData(final Rl01831DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 取得受監護人「監護資料檔」XLDFM05MorH
     * 
     * @param dto
     *            監護撤銷登記DTO
     * @param exec
     *            ExecutantType
     * @throws RisBusinessException
     */
    void getXLDFM05MorH(final Rl01831DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 執行Contoller loadPage() 的第一個Service之共用邏輯。
     * 
     * @param dto
     *            監護撤銷登記DTO
     * @param exec
     *            ExecutantType
     * @return 監護撤銷登記DTO
     * @throws RisBusinessException
     */
    Rl01831DTO initLoadPage(final Rl01831DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 設定第一次新增登記畫面初始值。
     * 
     * @param dto
     *            監護撤銷登記DTO
     * @param exec
     *            ExecutantType
     * @return 監護撤銷登記DTO
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    Rl01831DTO initOperationDTO(final Rl01831DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 設定編輯登記畫面初始值。
     * 
     * @param dto
     *            監護撤銷登記DTO
     * @param exec
     *            ExecutantType
     * @return 監護撤銷登記DTO
     * @throws RisBusinessException
     */
    Rl01831DTO loadOperationDTO(final Rl01831DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 再次驗證狀態時載入登記畫面初始值。
     * 
     * @param dto
     *            監護撤銷登記DTO
     * @param exec
     *            ExecutantType
     * @return 監護撤銷登記DTO
     * @throws RisBusinessException
     */
    Rl01831DTO reviewOperationDTO(final Rl01831DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 暫存「監護撤銷登記資料」至XLDFTable。
     * 
     * @param dto
     *            監護撤銷登記DTO
     * @param exec
     *            ExecutantType
     * @return 監護撤銷登記DTO
     * @throws RisBusinessException
     */
    @WorkStatus(FinalType.TEMP_FINAL)
    @RisServiceMethod(MethodType.SAVE2TEMP)
    Rl01831DTO saveXldf(final Rl01831DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 選取擬撤銷的原登記申請書。
     * 
     * @param dto
     *            監護撤銷登記DTO
     * @param exec
     *            ExecutantType
     * @return 監護撤銷登記DTO
     * @throws RisBusinessException
     */
    Rl01831DTO selectOrgApplication(final Rl01831DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 執行資料驗證並自動組合記事。
     * 
     * @param dto
     *            監護撤銷登記DTO
     * @param exec
     *            ExecutantType
     * @return 監護撤銷登記DTO
     * @throws RisBusinessException
     */
    Rl01831DTO verifyAppData(final Rl01831DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 檢視擬撤銷之原登記申請書。
     * 
     * @param dto
     *            監護撤銷登記DTO
     * @param exec
     *            ExecutantType
     * @return 監護撤銷登記DTO
     * @throws RisBusinessException
     */
    Rl01831DTO viewOrgApplication(final Rl01831DTO dto, final ExecutantType exec) throws RisBusinessException;
}