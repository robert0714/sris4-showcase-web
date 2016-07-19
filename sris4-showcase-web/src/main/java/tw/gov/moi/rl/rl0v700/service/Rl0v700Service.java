/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl0v700.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl0v700DTO;

/**
 * 全面換證統計表服務介面.
 * 
 * @author Viva.Hong
 */
public interface Rl0v700Service {

    /** 控制器類別名稱. */
    public static final String CONTROLLER_NAME = "Rl0v700Controller";

    /** 失敗狀態碼. */
    public static final String FAIL_STATUS_CODE = "3";

    /** 作業代碼. */
    public static final String OPERATION_CODE = "RL0V700";

    /** 報表明稱. */
    public static final String REPORT_NAME = "RLRP0V700";

    /** 服務類別名稱. */
    public static final String SERVICE_NAME = "Rl0v700ServiceImpl";

    /** 處理成功訊息. */
    public static final String SUCCESS_MESG = "處理成功";

    /** 成功狀態碼. */
    public static final String SUCCESS_STATUS_CODE = "2";

    /**
     * 全面換證統計表背景執行.
     * 
     * @param rl0v700DTO
     *            全面換證統計表DTO
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             全面換證統計表背景執行失敗
     */
    @RisServiceMethod(MethodType.PRINT2SYS)
    public void doBatchPrint(final Rl0v700DTO rl0v700DTO, final ExecutantType execType) throws RisBusinessException;

    /**
     * 取得並下載製作全面換證統計表.
     * 
     * @param rl0v700DTO
     *            全面換證統計表DTO
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             取得並下載製作全面換證統計表失敗
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    @WorkStatus(FinalType.FINAL)
    public void doDownload(final Rl0v700DTO rl0v700DTO, final ExecutantType execType) throws RisBusinessException;

    /**
     * 全面換證統計表預覽.
     * 
     * @param rl0v700DTO
     *            全面換證統計表DTO
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             全面換證統計表預覽失敗
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    @WorkStatus(FinalType.FINAL)
    public void doPreview(final Rl0v700DTO rl0v700DTO, final ExecutantType execType) throws RisBusinessException;

    /**
     * 全面換證統計表列印.
     * 
     * @param rl0v700DTO
     *            全面換證統計表DTO
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             全面換證統計表列印失敗
     */
    public void doPrint(final Rl0v700DTO rl0v700DTO, final ExecutantType execType) throws RisBusinessException;
}
