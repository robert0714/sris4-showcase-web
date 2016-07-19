/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl08100.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08183DTO;

/**
 * 戶籍罰鍰處罰統計表介面.
 * 
 * @author Derek Wang
 */
public interface Rl08183Service {

    /** 控制器類別名稱. */
    public static final String CONTROLLER_NAME = "Rl08183Controller";

    /** 服務類別名稱. */
    public static final String SERVICE_NAME = "Rl08183ServiceImpl";

    /** 報表名稱:RLRP08183. */
    public final static String REPORT_NAME = "RLRP08183";

    /**
     * 執行本月月統計.
     * 
     * @param dto
     *            戶籍罰鍰處罰統計表DTO
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             執行本月月統計失敗
     */
    public void doCheating2(final Rl08183DTO dto, final ExecutantType execType) throws RisBusinessException;

    /**
     * 確認月統計批次是否已執行.
     * 
     * @param dto
     *            戶籍罰鍰處罰統計表DTO
     * @param execType
     *            使用者資訊
     */
    public void doCheating2Check(final Rl08183DTO dto, final ExecutantType execType);

    /**
     * 取得並下載戶籍罰鍰處罰統計表.
     * 
     * @param dto
     *            戶籍罰鍰處罰統計表DTO
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             取得並下載戶籍罰鍰處罰統計表失敗
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    @WorkStatus(FinalType.FINAL)
    public void doDownload(final Rl08183DTO dto, final ExecutantType execType) throws RisBusinessException;

    /**
     * 製作戶籍罰鍰處罰統計表預覽.
     * 
     * @param dto
     *            製作從姓及姓名變更人數按性別分DTO
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             製作戶籍罰鍰處罰統計表預覽失敗
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    @WorkStatus(FinalType.FINAL)
    public void doPreview(final Rl08183DTO dto, final ExecutantType execType) throws RisBusinessException;

    /**
     * 列印戶籍罰鍰處罰統計表.
     * 
     * @param dto
     *            戶籍罰鍰處罰統計表DTO
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             列印戶籍罰鍰處罰統計表失敗
     */
    @RisServiceMethod(MethodType.PRINT2SYS)
    @WorkStatus(FinalType.FINAL)
    public void doPrint(final Rl08183DTO dto, final ExecutantType execType) throws RisBusinessException;
}
