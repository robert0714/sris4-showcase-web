/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl0f100.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl0f110DTO;

/**
 * 空白國民身分證（膠膜）保管人員移交 服務
 * 
 * @author Marcus Chen
 * 
 */
public interface Rl0f110Service {

    /** 執行「空白國民身分證（膠膜）保管人員移交查詢處理」服務失敗 */
    final String DO_QUERY_ERROR = "執行「空白國民身分證（膠膜）保管人員移交查詢處理」服務失敗";

    /** 執行「單筆資料中「起始號碼與終止號碼之年份不符」 */
    final String DO_QUERY_DATA_ERROR = "單筆資料中「起始號碼與終止號碼之年份不符」";

    /** 執行「空白國民身分證（膠膜）保管人員移交儲存處理」服務失敗 */
    final String DO_SAVE_ERROR = "執行「空白國民身分證（膠膜）保管人員移交儲存處理」服務失敗";

    /** 執行「空白國民身分證（膠膜）保管人員移交列印處理」服務失敗 */
    final String DO_PRINT_ERROR = "執行「空白國民身分證（膠膜）保管人員移交列印處理」服務失敗";

    /** 執行「空白國民身分證（膠膜）保管人員移交下載處理」服務失敗 */
    final String DO_DWONLOAD_ERROR = "執行「空白國民身分證（膠膜）保管人員移交下載處理」服務失敗";

    final String TYPE_ONE = "空白國民身分證";

    final String TYPE_TWO = "膠膜";

    final String REPORT_NAME = "RLRP0F110";

    /** 保管人員角色代碼. */
    final String ROLE = "RL00005";

    /**
     * 空白國民身分證（膠膜）保管人員移交 查詢
     * 
     * @param Rl0f110DTO
     * @param executant
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doQuery(final Rl0f110DTO dto, final ExecutantType executant) throws RisBusinessException;

    /**
     * 空白國民身分證（膠膜）保管人員移交 儲存
     * 
     * @param Rl0f110DTO
     * @param executant
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void doSave(final Rl0f110DTO dto, final ExecutantType executant) throws RisBusinessException;

    /**
     * 列印空白國民身分證（膠膜）保管人員移交
     * 
     * @param Rl0f110DTO
     * @param executant
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.PRINT2SYS)
    @WorkStatus(FinalType.FINAL)
    public void doPrint(final Rl0f110DTO dto, final ExecutantType executant) throws RisBusinessException;

    /**
     * 下載空白國民身分證（膠膜）保管人員移交
     * 
     * @param Rl0f110DTO
     * @param executant
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    @WorkStatus(FinalType.FINAL)
    public void doDownload(final Rl0f110DTO dto, final ExecutantType executant) throws RisBusinessException;

}
