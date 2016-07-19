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
import tw.gov.moi.rl.domain.Rl01824DTO;

/**
 * 姓名變更撤銷登記服務介面
 * 
 * @author DAXIONG
 */
public interface Rl01824Service {
    // Constant
    final String MAIN = "當事人";
    final String APPLY_CODE = "09N";
    final String OPERATION_CODE = "01824";

    // Error Message
    final String E_MSG_METHOD_DO_DELETE = "刪除姓名變更撤銷登記資料失敗";
    final String E_MSG_METHOD_INIT_OPERATION_DTO = "設定第一次新增登記畫面初始值失敗";
    final String E_MSG_METHOD_SAVE_XCDF = "暫存姓名變更撤銷登記申請資料至XLDFTable失敗";

    /**
     * 刪除姓名變更撤銷登記資料資料。
     * 
     * @param dto
     *            姓名變更撤銷登記DTO
     * @param exec
     *            ExecutantType
     * @throws RisBusinessException
     */
    void doDelete(final Rl01824DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 執行Contoller loadPage() 的第一個Service之共用邏輯。
     * 
     * @param dto
     *            姓名變更撤銷登記DTO
     * @param exec
     *            ExecutantType
     * @return 姓名變更撤銷登記DTO
     * @throws RisBusinessException
     */
    Rl01824DTO initLoadPage(final Rl01824DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 設定第一次新增登記畫面初始值。
     * 
     * @param dto
     *            姓名變更撤銷登記DTO
     * @param exec
     *            ExecutantType
     * @return 姓名變更撤銷登記DTO
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    Rl01824DTO initOperationDTO(final Rl01824DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 設定編輯登記畫面初始值。
     * 
     * @param dto
     *            姓名變更撤銷登記DTO
     * @param exec
     *            ExecutantType
     * @return 姓名變更撤銷登記DTO
     * @throws RisBusinessException
     */
    Rl01824DTO loadOperationDTO(final Rl01824DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 再次驗證狀態時載入登記畫面初始值。
     * 
     * @param dto
     *            姓名變更撤銷登記DTO
     * @param exec
     *            ExecutantType
     * @return 姓名變更撤銷登記DTO
     * @throws RisBusinessException
     */
    Rl01824DTO reviewOperationDTO(final Rl01824DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 暫存「姓名變更撤銷登記資料」至XLDFTable。
     * 
     * @param dto
     *            姓名變更撤銷登記DTO
     * @param exec
     *            ExecutantType
     * @return 姓名變更撤銷登記DTO
     * @throws RisBusinessException
     */
    @WorkStatus(FinalType.TEMP_FINAL)
    @RisServiceMethod(MethodType.SAVE2TEMP)
    Rl01824DTO saveXldf(final Rl01824DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 選取擬撤銷的原登記申請書。
     * 
     * @param dto
     *            姓名變更撤銷登記DTO
     * @param exec
     *            ExecutantType
     * @return 姓名變更撤銷登記DTO
     * @throws RisBusinessException
     */
    Rl01824DTO selectOrgApplication(final Rl01824DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 執行資料驗證並自動組合記事。
     * 
     * @param dto
     *            姓名變更撤銷登記DTO
     * @param exec
     *            ExecutantType
     * @return 姓名變更撤銷登記DTO
     * @throws RisBusinessException
     */
    Rl01824DTO verifyAppData(final Rl01824DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 檢視擬撤銷之原登記申請書。
     * 
     * @param dto
     *            姓名變更撤銷登記DTO
     * @param exec
     *            ExecutantType
     * @return 姓名變更撤銷登記DTO
     * @throws RisBusinessException
     */
    Rl01824DTO viewOrgApplication(final Rl01824DTO dto, final ExecutantType exec) throws RisBusinessException;
}