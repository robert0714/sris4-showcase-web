/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl089f0.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl089f0DTO;

/**
 * 製作從姓及姓名變更人數按性別分介面.
 * 
 * @author Viva.Hong
 */
public interface Rl089f0Service {

    /** 報表名稱:RLRP089F0. */
    public static final String REPORT_NAME = "RLRP089F0";

    /** 控制器類別名稱. */
    public static final String CONTROLLER_NAME = "Rl089f0Controller";

    /** 服務類別名稱. */
    public static final String SERVICE_NAME = "Rl089f0ServiceImpl";

    /**
     * 取得並下載製作從姓及姓名變更人數按性別分.
     * 
     * @param dto
     *            製作從姓及姓名變更人數按性別分DTO
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             取得並下載從姓及姓名變更人數按性別分失敗
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    @WorkStatus(FinalType.FINAL)
    public void doDownload(final Rl089f0DTO dto, final ExecutantType execType) throws RisBusinessException;

    /**
     * 預覽製作從姓及姓名變更人數按性別分.
     * 
     * @param dto
     *            製作從姓及姓名變更人數按性別分DTO
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             預覽製作從姓及姓名變更人數按性別分失敗
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    @WorkStatus(FinalType.FINAL)
    public void doPreview(final Rl089f0DTO dto, final ExecutantType execType) throws RisBusinessException;

    /**
     * 列印製作從姓及姓名變更人數按性別分.
     * 
     * @param dto
     *            製作從姓及姓名變更人數按性別分DTO
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             列印製作從姓及姓名變更人數按性別分失敗
     */
    public void doPrint(final Rl089f0DTO dto, final ExecutantType execType) throws RisBusinessException;

}
