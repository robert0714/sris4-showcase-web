/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl0y100.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl0y100DTO;

/**
 * 姓名區分作業服務介面
 * 
 * @author DAXIONG
 */
public interface Rl0y100Service {
    // Constant
    static final String MAIN = "當事人";
    static final String OPERATION_CODE = "0Y100";

    // Error Message
    static final String E_MSG_METHOD_DO_DELETE = "刪除姓名區分作業資料失敗";
    static final String E_MSG_METHOD_SAVE_XCDF = "暫存姓名區分作業申請資料至XLDFTable失敗";

    /**
     * 刪除姓名區分作業資料。
     * 
     * @param dto
     *            姓名區分作業DTO
     * @param exec
     *            ExecutantType
     * @throws RisBusinessException
     */
    void doDelete(final Rl0y100DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 執行Contoller loadPage() 的第一個Service之共用邏輯。
     * 
     * @param dto
     *            姓名區分作業DTO
     * @param exec
     *            ExecutantType
     * @return 姓名區分作業DTO
     * @throws RisBusinessException
     */
    Rl0y100DTO initLoadPage(final Rl0y100DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 設定第一次新增登記畫面初始值。
     * 
     * @param dto
     *            姓名區分作業DTO
     * @param exec
     *            ExecutantType
     * @return 姓名區分作業DTO
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    Rl0y100DTO initOperationDTO(final Rl0y100DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 設定編輯登記畫面初始值。
     * 
     * @param dto
     *            姓名區分作業DTO
     * @param exec
     *            ExecutantType
     * @return 姓名區分作業DTO
     * @throws RisBusinessException
     */
    Rl0y100DTO loadOperationDTO(final Rl0y100DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 再次驗證狀態時載入登記畫面初始值。
     * 
     * @param dto
     *            姓名區分作業DTO
     * @param exec
     *            ExecutantType
     * @return 姓名區分作業DTO
     * @throws RisBusinessException
     */
    Rl0y100DTO reviewOperationDTO(final Rl0y100DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 暫存「姓名區分作業資料」至XLDFTable。
     * 
     * @param dto
     *            姓名區分作業DTO
     * @param exec
     *            ExecutantType
     * @return 姓名區分作業DTO
     * @throws RisBusinessException
     */
    @WorkStatus(FinalType.TEMP_FINAL)
    @RisServiceMethod(MethodType.SAVE2TEMP)
    Rl0y100DTO saveXldf(final Rl0y100DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 執行資料驗證並自動組合記事。
     * 
     * @param dto
     *            姓名區分作業DTO
     * @param exec
     *            ExecutantType
     * @return 姓名區分作業DTO
     * @throws RisBusinessException
     */
    Rl0y100DTO verifyAppData(final Rl0y100DTO dto, final ExecutantType exec) throws RisBusinessException;
}