/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl01200.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.ChildDTO;
import tw.gov.moi.rl.domain.Rl012f0DTO;

/**
 * 未成年子女權利義務行使負擔登記介面
 */
public interface Rl012f0Service {
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
    public Rl012f0DTO clearFatherData(Rl012f0DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * Clear mother data.
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @return the rl012f0 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    public Rl012f0DTO clearMotherData(Rl012f0DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 刪除未成年子女權利義務行使負擔廢止登記XLDF資料
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @return the rl012f0 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    public void doDelete(Rl012f0DTO dto, ExecutantType executantType) throws RisBusinessException;

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
    public void doDeleteHouseholdFine(Rl012f0DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得未成年子女資料.
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
    public ChildDTO getChildData(Rl012f0DTO dto, ExecutantType executantType) throws RisBusinessException;

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
    public void getXLDFM05M(Rl012f0DTO dto, ExecutantType executantType) throws RisBusinessException;

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
    public Rl012f0DTO getFatherData(Rl012f0DTO dto, ExecutantType executantType) throws RisBusinessException;

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
    public Rl012f0DTO getMotherData(Rl012f0DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 執行Contoller loadPage() 的第一個Service之共用邏輯
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @return the rl012f0 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    public Rl012f0DTO initLoadPage(Rl012f0DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 初始化未成年子女權利義務行使負擔廢止登記
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @return the rl012f0 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(value = MethodType.QUERY)
    public Rl012f0DTO initOperationDTO(Rl012f0DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 載入未成年子女權利義務行使負擔廢止登記
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @return the rl012f0 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    public Rl012f0DTO loadOperationDTO(Rl012f0DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 載入未成年子女權利義務行使負擔廢止登記
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @return the rl012f0 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    public Rl012f0DTO reviewOperationDTO(Rl012f0DTO dto, ExecutantType executantType) throws RisBusinessException;

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
    public void saveXLDF(Rl012f0DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 執行資料驗證並自動組合記事
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @return the rl012f0 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    public Rl012f0DTO verifyAppData(Rl012f0DTO dto, ExecutantType executantType) throws RisBusinessException;
}
