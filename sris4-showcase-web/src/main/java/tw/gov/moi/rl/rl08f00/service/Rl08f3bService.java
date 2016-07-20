/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl08f00.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08f3bDTO;

/**
 * 返國投票選舉人投票通知單服務介面.
 */
public interface Rl08f3bService {

    /**
     * 初始化頁面選項
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doInitPage(final Rl08f3bDTO dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 資料驗證.
     * 
     * @param dto
     *            輸入的查詢條件
     * @param executantType
     *            使用者資訊
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.VERIFY)
    public void doValidData(final Rl08f3bDTO dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 送出 (批次列印).
     * 
     * @param dto
     *            輸入的查詢條件
     * @param executantType
     *            使用者資訊
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.PRINT2SYS)
    @WorkStatus(FinalType.FINAL)
    public void doBatchPrint(final Rl08f3bDTO dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 預覽列印.
     * 
     * @param dto
     *            輸入的查詢條件
     * @param executantType
     *            使用者資訊
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    @WorkStatus(FinalType.FINAL)
    public String doPreview(final Rl08f3bDTO dto, final ExecutantType executantType) throws RisBusinessException;

}
