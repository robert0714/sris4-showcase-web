/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl08f00.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08f33DTO;

/**
 * 列印選舉人名冊服務介面.
 * 
 * @author Weiren.Jheng
 */
public interface Rl08f33Service {

    public final String SUB_TITLE_1 = "選舉人名冊";

    public final String SUB_TITLE_2 = "原住民投票所異動名冊";

    /** 選舉人名冊. */
    public final String RLRP08F33 = "RLRP08F33";

    /**
     * 初始化頁面選項
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doInitPage(final Rl08f33DTO dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 前端 UI 資料驗證.
     * 
     * @param dto
     *            輸入的查詢條件
     * @param executantType
     *            使用者資訊
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.VERIFY)
    public void doValidDataForUI(final Rl08f33DTO dto, final ExecutantType executantType) throws RisBusinessException;

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
    public Rl08f33DTO doPreview(final Rl08f33DTO dto, final ExecutantType executantType) throws RisBusinessException;

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
    public void doBatchPrint(final Rl08f33DTO dto, final ExecutantType executantType) throws RisBusinessException;

}
