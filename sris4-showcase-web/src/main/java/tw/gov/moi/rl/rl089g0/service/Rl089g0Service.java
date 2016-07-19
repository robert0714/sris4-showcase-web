/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl089g0.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl089g0DTO;

/**
 * 製作出生登記子女從姓人數按性別及從姓方式分介面.
 * 
 * @author Viva.Hong
 */
public interface Rl089g0Service {

    /** 報表名稱:RLRP089G0. */
    public static final String REPORT_NAME = "RLRP089G0";

    /** 控制器類別名稱. */
    public static final String CONTROLLER_NAME = "Rl089g0Controller";

    /** 服務類別名稱. */
    public static final String SERVICE_NAME = "Rl089g0ServiceImpl";

    /**
     * 取得並下載製作出生登記子女從姓人數按性別及從姓方式分.
     * 
     * @param dto
     *            製作出生登記子女從姓人數按性別及從姓方式分DTO
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             取得並下載製作出生登記子女從姓人數按性別及從姓方式分失敗
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.TEMP_FINAL)
    public void doDownload(Rl089g0DTO dto, ExecutantType execType) throws RisBusinessException;

    /**
     * 預覽製作出生登記子女從姓人數按性別及從姓方式分.
     * 
     * @param dto
     *            製作出生登記子女從姓人數按性別及從姓方式分DTO
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             預覽製作出生登記子女從姓人數按性別及從姓方式分失敗
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    @WorkStatus(FinalType.FINAL)
    public void doPreview(final Rl089g0DTO dto, final ExecutantType execType) throws RisBusinessException;

    /**
     * 列印製作出生登記子女從姓人數按性別及從姓方式分.
     * 
     * @param dto
     *            製作出生登記子女從姓人數按性別及從姓方式分DTO
     * @param execType
     *            使用者資訊
     * @return the string
     * @throws RisBusinessException
     *             列印製作出生登記子女從姓人數按性別及從姓方式分失敗
     */
    @RisServiceMethod(MethodType.PRINT2SYS)
    @WorkStatus(FinalType.TEMP_FINAL)
    public void doPrint(Rl089g0DTO dto, ExecutantType execType) throws RisBusinessException;
}
