/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl01200.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.component.xldf.dto.XLDF047M;
import tw.gov.moi.rl.domain.Rl012h0DTO;

/**
 * 歸化國籍姓名羅馬拼音服務介面
 */
public interface Rl012h0Service {

    /**
     * 執行Contoller loadPage() 的第一個Service之共用邏輯
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @return the rl012h0 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(value = MethodType.QUERY)
    public Rl012h0DTO initLoadPage(Rl012h0DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 初始化 歸化國籍姓名羅馬拼音登記
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @return the rl012h0 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(value = MethodType.QUERY)
    public Rl012h0DTO initOperationDTO(Rl012h0DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 載入 歸化國籍姓名羅馬拼音登記
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @return the rl012h0 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(value = MethodType.QUERY)
    public Rl012h0DTO loadOperationDTO(Rl012h0DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 刪除 歸化國籍姓名羅馬拼音XLDF資料
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @return the rl012h0 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(value = MethodType.DELETE)
    public Rl012h0DTO doDelete(OpeningOperationDTO openingOperationDTO, ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 執行資料驗證並自動組合記事
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @return the rl012h0 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(value = MethodType.VERIFY)
    public Rl012h0DTO verifyAppData(Rl012h0DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 儲存 歸化國籍姓名羅馬拼音申請資料至XLDF Table
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(value = MethodType.SAVE2TEMP)
    @WorkStatus(FinalType.TEMP_FINAL)
    public void saveXLDF(Rl012h0DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得最後一筆姓名羅馬拼音記錄檔 Gets the last rldf047m.
     * 
     * @param Rl012h0DTO
     *            the dto
     * @param executantType
     *            the executant type
     * @param operationCode
     *            the operation code
     * @return the last rldf047h
     */
    @RisServiceMethod(value = MethodType.QUERY)
    public XLDF047M getLastRldf047m(Rl012h0DTO dto, final ExecutantType pExecutantType);

    /**
     * 取得最後一筆姓名羅馬拼音記錄檔 Gets the last rldf047m.
     * 
     * @param Rl012h0DTO
     *            the dto
     * @param executantType
     *            the executant type
     * @param operationCode
     *            the operation code
     * @return the last rldf047h
     */
    @RisServiceMethod(value = MethodType.QUERY)
    public XLDF047M getLastRldf047mByApplyItem(Rl012h0DTO dto, final ExecutantType pExecutantType);
}
