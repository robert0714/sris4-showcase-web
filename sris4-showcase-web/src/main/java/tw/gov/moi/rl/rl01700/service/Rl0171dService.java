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
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.domain.Rl0171dDTO;

/**
 * 姓名更正登記服務介面
 * 
 * @author DAXIONG
 */
public interface Rl0171dService {
    // Constant
    static final String MAIN = "當事人";
    static final String APPLY_CODE = "085";
    static final String OPERATION_CODE = RlConstant.OPERATION_CODE_0171D;

    // Error Message
    static final String E_MSG_METHOD_DO_DELETE = "刪除姓名更正登記資料失敗";
    static final String E_MSG_METHOD_INIT_OPERATION_DTO = "設定第一次新增登記畫面初始值失敗";
    static final String E_MSG_METHOD_SAVE_XCDF = "暫存姓名更正登記申請資料至XLDFTable失敗";

    /**
     * 刪除姓名更正登記資料。
     * 
     * @param dto
     *            姓名更正登記DTO
     * @param exec
     *            ExecutantType
     * @throws RisBusinessException
     */
    void doDelete(final Rl0171dDTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 執行Contoller loadPage() 的第一個Service之共用邏輯。
     * 
     * @param dto
     *            姓名更正登記DTO
     * @param exec
     *            ExecutantType
     * @return 姓名更正登記DTO
     * @throws RisBusinessException
     */
    Rl0171dDTO initLoadPage(final Rl0171dDTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 設定第一次新增登記畫面初始值。
     * 
     * @param dto
     *            姓名更正登記DTO
     * @param exec
     *            ExecutantType
     * @return 姓名更正登記DTO
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    Rl0171dDTO initOperationDTO(final Rl0171dDTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 設定編輯登記畫面初始值。
     * 
     * @param dto
     *            姓名更正登記DTO
     * @param exec
     *            ExecutantType
     * @return 姓名更正登記DTO
     * @throws RisBusinessException
     */
    Rl0171dDTO loadOperationDTO(final Rl0171dDTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 再次驗證狀態時載入登記畫面初始值。
     * 
     * @param dto
     *            姓名更正登記DTO
     * @param exec
     *            ExecutantType
     * @return 姓名更正登記DTO
     * @throws RisBusinessException
     */
    Rl0171dDTO reviewOperationDTO(final Rl0171dDTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 暫存「姓名更正登記資料」至XLDFTable。
     * 
     * @param dto
     *            姓名更正登記DTO
     * @param exec
     *            ExecutantType
     * @return 姓名更正登記DTO
     * @throws RisBusinessException
     */
    @WorkStatus(FinalType.TEMP_FINAL)
    @RisServiceMethod(MethodType.SAVE2TEMP)
    Rl0171dDTO saveXldf(final Rl0171dDTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 執行資料驗證並自動組合記事。
     * 
     * @param dto
     *            姓名更正登記DTO
     * @param exec
     *            ExecutantType
     * @return 姓名更正登記DTO
     * @throws RisBusinessException
     */
    Rl0171dDTO verifyAppData(final Rl0171dDTO dto, final ExecutantType exec) throws RisBusinessException;
}