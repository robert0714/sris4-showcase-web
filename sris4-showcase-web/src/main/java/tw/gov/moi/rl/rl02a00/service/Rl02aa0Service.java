/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl02a00.service;

import java.util.List;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.domain.Rldf012dType;
import tw.gov.moi.domain.Rldfz2aa0Type;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl02aa0DTO;

/**
 * 重製國民身分證送件聯單服務介面.
 * 
 * @author Ahhong
 */
public interface Rl02aa0Service {

    /** 控制器類別名稱. */
    public static final String CONTROLLER_NAME = "Rl02aa0Controller";

    /** 服務類別名稱. */
    public static final String SERVICE_NAME = "Rl02aa0ServiceImpl";

    /**
     * 送出 (批次列印).
     * 
     * @param dto
     *            重製國民身分證送件聯單DTO
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             送出 (批次列印)失敗
     */
    @RisServiceMethod(MethodType.PRINT2SYS)
    @WorkStatus(FinalType.FINAL)
    public void doBatchPrint(final Rl02aa0DTO dto, final ExecutantType execType) throws RisBusinessException;

    /**
     * 取得並下載重製國民身分證送件聯單.
     * 
     * @param dto
     *            重製國民身分證送件聯單DTO
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             取得並下載重製國民身分證送件聯單失敗
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    @WorkStatus(FinalType.FINAL)
    public void doDownload(final Rl02aa0DTO dto, final ExecutantType execType) throws RisBusinessException;

    /**
     * 預覽列印.
     * 
     * @param dto
     *            重製國民身分證送件聯單DTO
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             預覽列印失敗
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    public void doPreview(final Rl02aa0DTO dto, final ExecutantType execType) throws RisBusinessException;

    /**
     * 取得列印的筆數.
     * 
     * @param dto
     *            重製國民身分證送件聯單DTO
     * @param execType
     *            使用者資訊
     * @throws RisBusinessException
     *             取得列印的筆數失敗
     */
    @RisServiceMethod(MethodType.QUERY)
    public void getPrintCount(final Rl02aa0DTO dto, final ExecutantType execType) throws RisBusinessException;

    /**
     * 取得本所新式國民身分證請領記錄檔.
     * 
     * @param dto
     *            重製國民身分證送件聯單DTO
     * @param execType
     *            使用者資訊
     * @return List<Rldfz2aa0Type>
     * @throws RisBusinessException
     *             取得本所新式國民身分證請領記錄檔失敗
     */
    @RisServiceMethod(MethodType.QUERY)
    public List<Rldfz2aa0Type> getRldf002dList(final Rl02aa0DTO dto, final ExecutantType execType)
            throws RisBusinessException;

    /**
     * 取得空白國民身分證及膠膜使用記錄檔.
     * 
     * @param no
     *            號碼
     * @param type
     *            類型
     * @param personId
     *            統號
     * @param execType
     *            使用者資訊
     * @return Rldf012dType
     * @throws RisBusinessException
     *             取得空白國民身分證及膠膜使用記錄檔失敗
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rldf012dType getRldf012d(final String no, final String type, final String personId,
            final ExecutantType execType) throws RisBusinessException;

    /**
     * 取得他所新式國民身分證請領記錄檔.
     * 
     * @param dto
     *            重製國民身分證送件聯單DTO
     * @param execType
     *            使用者資訊
     * @return List<Rldfz2aa0Type>
     * @throws RisBusinessException
     *             取得他所新式國民身分證請領記錄檔失敗
     */
    @RisServiceMethod(MethodType.QUERY)
    public List<Rldfz2aa0Type> getRldf022dList(final Rl02aa0DTO dto, final ExecutantType execType)
            throws RisBusinessException;
}