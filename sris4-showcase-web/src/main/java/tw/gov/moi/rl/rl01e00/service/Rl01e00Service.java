/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl01e00.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl01e00DTO;
import tw.gov.moi.rl.domain.TempFileDTO;

/**
 * 教育程度註記處理服務介面.
 * 
 */
public interface Rl01e00Service {

    /**
     * 執行Contoller loadPage() 的第一個Service之共用邏輯
     * 
     * @param dto
     *            the dto
     * @param exec
     *            the exec
     * @return the rl0y100 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl01e00DTO initLoadPage(final Rl01e00DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 初始化教育程度職權變動登記
     * 
     * @param dto
     *            the dto
     * @param exec
     *            the exec
     * @return the rl0y100 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl01e00DTO initOperationDTO(final Rl01e00DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 載入教育程度職權變動登記
     * 
     * @param dto
     *            the dto
     * @param exec
     *            the exec
     * @return the rl0y100 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl01e00DTO loadOperationDTO(final Rl01e00DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 將DTO物件序列化成檔案。
     * 
     * @param tempFileDTO
     *            TempFileDTO
     * @param exec
     *            ExecutantType
     */
    @RisServiceMethod(MethodType.QUERY)
    void saveTempFile(final TempFileDTO<Rl01e00DTO> tempFileDTO, final ExecutantType exec);

    /**
     * 刪除教育程度職權變動登記XLDF資料
     * 
     * @param dto
     *            the dto
     * @param exec
     *            the exec
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.DELETE)
    public void doDelete(final Rl01e00DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 執行資料驗證並自動組合記事
     * 
     * @param dto
     *            the dto
     * @param exec
     *            the exec
     * @return the rl0y100 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    public void verifyAppData(final Rl01e00DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 儲存教育程度職權變動登記申請資料至XLDF Table
     * 
     * @param dto
     *            the dto
     * @param exec
     *            the exec
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    @WorkStatus(FinalType.TEMP_FINAL)
    public void saveXldf(final Rl01e00DTO dto, final ExecutantType exec) throws RisBusinessException;

}
