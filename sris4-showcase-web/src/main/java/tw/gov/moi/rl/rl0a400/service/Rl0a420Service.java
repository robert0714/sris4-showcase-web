/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl0a400.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl0a420DTO;

/**
 * 製作罰鍰處理服務介面
 */
public interface Rl0a420Service {

    /**
     * 查詢罰鍰資料.
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @return the rl0a420 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl0a420DTO doQuery(Rl0a420DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 查詢驗證罰鍰資料.
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @return the rl0a420 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.VERIFY)
    public Rl0a420DTO verifyData(Rl0a420DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 儲存暫存罰鍰資料.
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.TEMP_FINAL)
    public void saveXldfData(Rl0a420DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 刪除暫存罰鍰資料.
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.DELETE)
    public void deleteXldfData(Rl0a420DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 初始化大簿罰鍰資料.
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl0a420DTO initData(Rl0a420DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 列印大簿罰鍰裁處書.
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.PRINT2SYS)
    public void doPrint(final Rl0a420DTO dto, final ExecutantType pExecutantType);

}
