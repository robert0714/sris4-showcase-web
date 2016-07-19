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
import tw.gov.moi.rl.domain.Rl08110DTO;

/**
 * 戶籍登記案件及核發證明文件月統計表處理服務介面 Rl08110Service.
 */
public interface Rl08110Service {

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
    public void doBatchPrint(final Rl08110DTO dto, final ExecutantType executantType) throws RisBusinessException;

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
    @WorkStatus(FinalType.FINAL)
    @RisServiceMethod(MethodType.PRINT2TERM)
    public void doPreview(final Rl08110DTO dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 另存電子檔.
     * 
     * @param dto
     *            輸入的查詢條件
     * @param executantType
     *            使用者資訊
     * @throws RisBusinessException
     *             the ris business exception
     */
    @WorkStatus(FinalType.FINAL)
    @RisServiceMethod(MethodType.SAVE)
    public void doDownload(final Rl08110DTO dto, final ExecutantType executantType) throws RisBusinessException;

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
    @WorkStatus(FinalType.FINAL)
    @RisServiceMethod(MethodType.PRINT2TERM)
    public void doCheating(final Rl08110DTO dto, final ExecutantType executantType) throws RisBusinessException;

    void doCheating2(Rl08110DTO dto, ExecutantType executantType) throws RisBusinessException;

    void doCheating2Check(Rl08110DTO dto, ExecutantType executantType) throws RisBusinessException;

    void doCheating3(Rl08110DTO dto, ExecutantType executantType) throws RisBusinessException;

    void doFixData(Rl08110DTO dto, ExecutantType executantType) throws RisBusinessException;
}
