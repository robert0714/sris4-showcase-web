/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl0f200.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl0f260DTO;

/**
 * 
 * 空白國民身分證及膠膜瑕疵退回登錄 服務介面
 * 
 * @author Marcus Chen
 * 
 */
public interface Rl0f260Service {
    /** 執行「空白國民身分證及膠膜瑕疵退回登錄-查詢-」服務失敗 */
    final String DO_QUERY_ERROR = "執行「空白國民身分證及膠膜瑕疵退回登錄-查詢-」服務失敗";

    /** 執行「空白國民身分證及膠膜瑕疵退回登錄-儲存-」服務失敗 */
    final String DO_SAVE_ERROR = "執行「空白國民身分證及膠膜瑕疵退回登錄-儲存-」服務失敗";

    /** 執行「空白國民身分證及膠膜瑕疵退回登錄-解除鎖定與清除資料-」服務失敗 */
    final String DO_CLEANUNLOCK_ERROR = "執行「空白國民身分證及膠膜瑕疵退回登錄-解除鎖定與清除資料-」服務失敗";

    /**
     * 空白國民身分證及膠膜瑕疵退回登錄-查詢-
     * 
     * @param Rl0f260DTO
     * @param executant
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doQuery(final Rl0f260DTO dto, final ExecutantType executant) throws RisBusinessException;

    /**
     * 空白國民身分證及膠膜瑕疵退回登錄-儲存-
     * 
     * @param Rl0f260DTO
     * @param executant
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void doSave(final Rl0f260DTO dto, final ExecutantType executant) throws RisBusinessException;

    /**
     * 空白國民身分證及膠膜瑕疵退回登錄-解除鎖定與清除資料-
     * 
     * @param Rl0f260DTO
     * @param executant
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doCleanLockData(final Rl0f260DTO dto, final ExecutantType executant) throws RisBusinessException;

}
