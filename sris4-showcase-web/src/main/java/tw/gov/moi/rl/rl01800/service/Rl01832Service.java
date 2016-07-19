/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl01800.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl01832DTO;

/**
 * 未成年子女權利義務行使負擔撤銷登記服務介面
 */
public interface Rl01832Service {

    /**
     * Clear father data.
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @return the rl01832 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    public Rl01832DTO clearFatherData(Rl01832DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * Clear mother data.
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @return the rl01832 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    public Rl01832DTO clearMotherData(Rl01832DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 刪除未成年子女權利義務行使負擔撤銷登記XLDF資料.
     * 
     * @param dto
     *            dto
     * @param executantType
     *            the executant type
     * @return the rl01832 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    public void doDelete(Rl01832DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 刪除未成年子女權利義務行使負擔撤銷登記登記暫存之罰鍰資料XLDF
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    public void doDeleteHouseholdFine(Rl01832DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得權益負擔人父資料
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
    public Rl01832DTO getFatherData(Rl01832DTO dto, ExecutantType executantType) throws RisBusinessException;

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
    public Rl01832DTO getMotherData(Rl01832DTO dto, ExecutantType executantType) throws RisBusinessException;

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
    public void getXLDFM05M(Rl01832DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 執行Contoller loadPage() 的第一個Service之共用邏輯.
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @return the rl01832 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    public Rl01832DTO initLoadPage(Rl01832DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 初始化未成年子女權利義務行使負擔撤銷登記
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @return the rl01832 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(value = MethodType.QUERY)
    public Rl01832DTO initOperationDTO(Rl01832DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 載入未成年子女權利義務行使負擔撤銷登記
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @return the rl01832 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    public Rl01832DTO loadOperationDTO(Rl01832DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 載入未成年子女權利義務行使負擔撤銷登記
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @return the rl01832 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    public Rl01832DTO reviewOperationDTO(Rl01832DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 儲存未成年子女權利義務行使負擔撤銷登記申請資料至XLDF Table
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
    public void saveXLDF(Rl01832DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 選取擬撤銷的原認領登記申請書
     * 
     * @param dto
     *            認領撤銷登記DTO
     * @param exec
     *            ExecutantType
     * @return 認領撤銷登記DTO
     * @throws RisBusinessException
     */
    public Rl01832DTO selectOrgApplication(final Rl01832DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 執行資料驗證並自動組合記事
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @return the rl01832 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    public Rl01832DTO verifyAppData(Rl01832DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 檢視擬撤銷之原登記申請書
     * 
     * @param dto
     *            認領撤銷登記DTO
     * @param exec
     *            ExecutantType
     * @return 認領撤銷登記DTO
     * @throws RisBusinessException
     */
    public Rl01832DTO viewOrgApplication(final Rl01832DTO dto, final ExecutantType exec) throws RisBusinessException;

}
