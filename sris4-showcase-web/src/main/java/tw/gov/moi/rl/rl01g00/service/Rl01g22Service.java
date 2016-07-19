/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl01g00.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl01g22DTO;

/**
 * 未成年子女權利義務行使負擔廢止登記介面
 */
public interface Rl01g22Service {

    /**
     * Clear father data.
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @return the rl01g22 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    public Rl01g22DTO clearFatherData(Rl01g22DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * Clear mother data.
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @return the rl01g22 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    public Rl01g22DTO clearMotherData(Rl01g22DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 刪除未成年子女權利義務行使負擔廢止登記XLDF資料
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @return the rl01g22 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    public void doDelete(Rl01g22DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 刪除未成年子女權利義務行使負擔廢止登記登記暫存之罰鍰資料XLDF
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    public void doDeleteHouseholdFine(Rl01g22DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得權益負擔人父資料.
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @return the father data
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(value = MethodType.QUERY)
    public Rl01g22DTO getFatherData(Rl01g22DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得權益負擔人母資料
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @return the mother data
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(value = MethodType.QUERY)
    public Rl01g22DTO getMotherData(Rl01g22DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得未成年子女權利義務行使負擔資料檔.
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @return the father data
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(value = MethodType.QUERY)
    public void getXLDFM05M(Rl01g22DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 執行Contoller loadPage() 的第一個Service之共用邏輯
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @return the rl01g22 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    public Rl01g22DTO initLoadPage(Rl01g22DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 初始化未成年子女權利義務行使負擔廢止登記
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @return the rl01g22 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(value = MethodType.QUERY)
    public Rl01g22DTO initOperationDTO(Rl01g22DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 載入未成年子女權利義務行使負擔廢止登記
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @return the rl01g22 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    public Rl01g22DTO loadOperationDTO(Rl01g22DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 載入未成年子女權利義務行使負擔廢止登記
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @return the rl01g22 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    public Rl01g22DTO reviewOperationDTO(Rl01g22DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 儲存未成年子女權利義務行使負擔廢止登記申請資料至XLDF Table
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @WorkStatus(FinalType.TEMP_FINAL)
    @RisServiceMethod(value = MethodType.SAVE2TEMP)
    public void saveXLDF(Rl01g22DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 執行資料驗證並自動組合記事
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @return the rl01g22 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    public Rl01g22DTO verifyAppData(Rl01g22DTO dto, ExecutantType executantType) throws RisBusinessException;

}
