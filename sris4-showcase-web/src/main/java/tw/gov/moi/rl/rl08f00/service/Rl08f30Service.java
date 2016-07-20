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
import tw.gov.moi.rl.domain.Rl08f30DTO;

/**
 * 列印選舉空白報表服務介面.
 * 
 * @author Stanley.Li
 */
public interface Rl08f30Service {

    final String RLRP08F32_BLANK = "RLRP08F32_BLANK";

    final String RLRP08F3W_BLANK = "RLRP08F3W_BLANK";

    final String RLRP08F33_BLANK = "RLRP08F33_BLANK";

    final String RLRP08F37_BLANK = "RLRP08F37_BLANK";

    /** 他往工投投票名冊 */
    final String SUB_TITLE2_OPTION_1 = "1";

    /** 在工作地投票名冊 */
    final String SUB_TITLE2_OPTION_2 = "2";

    /**
     * 初始化頁面選項
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doInitPage(final Rl08f30DTO dto, final ExecutantType executantType) throws RisBusinessException;

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
    public void doValidDataForUI(final Rl08f30DTO dto, final ExecutantType executantType) throws RisBusinessException;

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
    public void doPreview(final Rl08f30DTO dto, final ExecutantType executantType) throws RisBusinessException;

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
    public void doBatchPrint(final Rl08f30DTO dto, final ExecutantType executantType) throws RisBusinessException;

}
