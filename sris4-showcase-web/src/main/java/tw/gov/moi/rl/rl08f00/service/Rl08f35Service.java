/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl08f00.service;

import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08f35DTO;

/**
 * 在工作地投票通知單服務介面.
 * 
 * @author Viva.Hong
 */
public interface Rl08f35Service {

    /** 控制器類別名稱. */
    public static final String CONTROLLER_NAME = "Rl08f35Controller";

    /** 服務類別名稱. */
    public static final String SERVICE_NAME = "Rl08f35ServiceImpl";

    /**
     * 列印 (批次列印).
     * 
     * @param dto
     *            在工作地投票通知單DTO
     * @param executantType
     *            使用者資訊
     * @throws RisBusinessException
     *             列印 (批次列印)失敗
     */
    @RisServiceMethod(MethodType.PRINT2SYS)
    public void doBatchPrint(final Rl08f35DTO dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 初始化頁面選項.
     * 
     * @param dto
     *            在工作地投票通知單DTO
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             初始化頁面選項失敗
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doInitPage(final Rl08f35DTO dto, final ExecutantType execType) throws RisBusinessException;

    /**
     * 預覽列印.
     * 
     * @param dto
     *            在工作地投票通知單DTO
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             預覽列印失敗
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    public void doPreview(final Rl08f35DTO dto, final ExecutantType execType) throws RisBusinessException;

    /**
     * 前端 UI 資料驗證.
     * 
     * @param dto
     *            在工作地投票通知單DTO
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             前端 UI 資料驗證失敗
     */
    @RisServiceMethod(MethodType.VERIFY)
    public void doValidDataForUI(final Rl08f35DTO dto, final ExecutantType execType) throws RisBusinessException;

}
