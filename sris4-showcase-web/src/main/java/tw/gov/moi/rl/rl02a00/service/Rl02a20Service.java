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
import tw.gov.moi.domain.Rldfz2a20Type;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl02a20DTO;

/**
 * 製作國民身分證送件聯單服務介面Service Interface
 * 
 * @author Ahhong
 */
public interface Rl02a20Service {

    /**
     * 送出 (批次列印).
     * 
     * @param rl02a20DTO
     *            輸入的查詢條件
     * @param executantType
     *            使用者資訊
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.PRINT2SYS)
    @WorkStatus(FinalType.FINAL)
    public void doBatchPrint(final Rl02a20DTO rl02a20DTO, final ExecutantType executantType)
    		throws RisBusinessException;

    /**
     * 預覽列印.
     * 
     * @param rl02a20DTO
     *            輸入的查詢條件
     * @param executantType
     *            使用者資訊
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    public void doPreview(final Rl02a20DTO rl02a20DTO, final ExecutantType executantType)
    		throws RisBusinessException;

    /**
     * 取得並下載國民身分證送件聯單
     * 
     * @param rl02a20DTO
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    @WorkStatus(FinalType.FINAL)
    public void doDownload(final Rl02a20DTO rl02a20DTO, final ExecutantType executantType)
    		throws RisBusinessException;

    /**
     * 取得最後收妥時間
     * 
     * @param yyymmdd
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void getLastReceiveDate(final String yyymmdd, final ExecutantType executantType)
    		throws RisBusinessException;

    /**
     * 取得列印的筆數
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void getPrintCount(final Rl02a20DTO dto, final ExecutantType executantType)
    		throws RisBusinessException;

    /**
     * 取得本所新式國民身分證請領記錄檔
     * 
     * @param rl02a20DTO
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public List<Rldfz2a20Type> getRldf002dList(final Rl02a20DTO dto, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 取得他所新式國民身分證請領記錄檔
     * 
     * @param rl02a20DTO
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public List<Rldfz2a20Type> getRldf022dList(final Rl02a20DTO dto, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 取得空白國民身分證及膠膜使用記錄檔
     * 
     * @param rl02a20DTO
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rldf012dType getRldf012d(final String no, final String type, final String personId,
    		final ExecutantType executantType) throws RisBusinessException;
}