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
import tw.gov.moi.rl.domain.Rl01828DTO;

/**
 * 原住民身分及族別撤銷登記服務介面
 * 
 * @author DAXIONG
 */
public interface Rl01828Service {
    // Constant
    final String MAIN = "當事人";
    final String MAIN_TYPE = "8";
    final String APPLY_CODE = "09R";
    final String OPERATION_CODE = RlConstant.OPERATION_CODE_01828;

    // Error Message
    final String E_MSG_METHOD_DO_DELETE = "刪除原住民身分及族別撤銷登記資料失敗";
    final String E_MSG_METHOD_INIT_OPERATION_DTO = "設定第一次新增登記畫面初始值失敗";
    final String E_MSG_METHOD_SAVE_XCDF = "暫存原住民身分及族別撤銷登記申請資料至XLDFTable失敗";

    /**
     * 刪除原住民身分及族別撤銷登記資料資料。
     * 
     * @param dto
     *            原住民身分及族別撤銷登記DTO
     * @param exec
     *            ExecutantType
     * @throws RisBusinessException
     */
    void doDelete(final Rl01828DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 執行Contoller loadPage() 的第一個Service之共用邏輯。
     * 
     * @param dto
     *            原住民身分及族別撤銷登記DTO
     * @param exec
     *            ExecutantType
     * @return 原住民身分及族別撤銷登記DTO
     * @throws RisBusinessException
     */
    Rl01828DTO initLoadPage(final Rl01828DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 設定第一次新增登記畫面初始值。
     * 
     * @param dto
     *            原住民身分及族別撤銷登記DTO
     * @param exec
     *            ExecutantType
     * @return 原住民身分及族別撤銷登記DTO
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    Rl01828DTO initOperationDTO(final Rl01828DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 設定編輯登記畫面初始值。
     * 
     * @param dto
     *            原住民身分及族別撤銷登記DTO
     * @param exec
     *            ExecutantType
     * @return 原住民身分及族別撤銷登記DTO
     * @throws RisBusinessException
     */
    Rl01828DTO loadOperationDTO(final Rl01828DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 再次驗證狀態時載入登記畫面初始值。
     * 
     * @param dto
     *            原住民身分及族別撤銷登記DTO
     * @param exec
     *            ExecutantType
     * @return 原住民身分及族別撤銷登記DTO
     * @throws RisBusinessException
     */
    Rl01828DTO reviewOperationDTO(final Rl01828DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 暫存「原住民身分及族別撤銷登記資料」至XLDFTable。
     * 
     * @param dto
     *            原住民身分及族別撤銷登記DTO
     * @param exec
     *            ExecutantType
     * @return 原住民身分及族別撤銷登記DTO
     * @throws RisBusinessException
     */
    @WorkStatus(FinalType.TEMP_FINAL)
    @RisServiceMethod(MethodType.SAVE2TEMP)
    Rl01828DTO saveXldf(final Rl01828DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 選取擬撤銷的原登記申請書。
     * 
     * @param dto
     *            原住民身分及族別撤銷登記DTO
     * @param exec
     *            ExecutantType
     * @return 原住民身分及族別撤銷登記DTO
     * @throws RisBusinessException
     */
    Rl01828DTO selectOrgApplication(final Rl01828DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 執行資料驗證並自動組合記事。
     * 
     * @param dto
     *            原住民身分及族別撤銷登記DTO
     * @param exec
     *            ExecutantType
     * @return 原住民身分及族別撤銷登記DTO
     * @throws RisBusinessException
     */
    Rl01828DTO verifyAppData(final Rl01828DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 檢視擬撤銷之原登記申請書。
     * 
     * @param dto
     *            原住民身分及族別撤銷登記DTO
     * @param exec
     *            ExecutantType
     * @return 原住民身分及族別撤銷登記DTO
     * @throws RisBusinessException
     */
    Rl01828DTO viewOrgApplication(final Rl01828DTO dto, final ExecutantType exec) throws RisBusinessException;
}