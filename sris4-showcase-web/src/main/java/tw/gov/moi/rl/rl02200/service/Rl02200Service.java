/*
 * Copyright (c) 2010-2020 IISI. All rights reserved.
 * 
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl02200.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.dto.Rl02200DTO;

/**
 * 印鑑證明核發服務介面
 * 
 * @author Marcus Chen
 * 
 */
public interface Rl02200Service {

    final String E_MSG_METHOD_SAVE_XLDF4T = "暫存「辦理他所－印鑑證明核發申請書歷史資料」至XLDF4T失敗";
    final String E_MSG_METHOD_SAVE_XLDF026S = "暫存「臨時－辦理他所申請書索引資料」至XLDF026S失敗";
    final String E_MSG_METHOD_SAVE_XLDF1S = "暫存「申請書資料檔」至XLDF1S失敗";
    final String APPLY_CODE = "020";

    /**
     * 初始化印鑑證明核發登記
     * 
     * @param rl02200DTO
     * @param executantType
     * @return Rl02200DTO
     * @throws RisBusinessException
     *             RisBusinessException：「初始化印鑑證明核發登記」失敗
     */
    //    @RisServiceMethod(MethodType.QUERY)
    public Rl02200DTO initOperationDTO(final Rl02200DTO dto, final ExecutantType exe) throws RisBusinessException;

    /**
     * 載入印鑑證明核發登記編輯頁面
     * 
     * @param rl02200DTO
     * @param executantType
     * @return Rl02200DTO
     * @throws RisBusinessException
     *             RisBusinessException：「載入印鑑證明核發登記」失敗
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl02200DTO loadOperationDTO(final Rl02200DTO dto, final ExecutantType exe) throws RisBusinessException;

    /**
     * 載入印鑑證明核發登記編輯後頁面
     * 
     * 
     * @param rl02200DTO
     * @param executantType
     * @return Rl02200DTO
     * @throws RisBusinessException
     *             RisBusinessException：「載入印鑑證明核發登記」失敗
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl02200DTO reviewOperationDTO(final Rl02200DTO dto, final ExecutantType exe) throws RisBusinessException;

    /**
     * 執行資料驗證
     * 
     * @param rl02200DTO
     * @param executantType
     * @return Rl02200DTO
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.VERIFY)
    public void verifyAppData(final Rl02200DTO dto, final ExecutantType exe) throws RisBusinessException;

    /**
     * 由輸入資料轉換衍生資料
     * 
     * @param rl02200DTO
     * @param executantType
     * @throws RisBusinessException
     *             RisBusinessException：「執行印鑑證明核發登記程式失敗」失敗
     */
    @RisServiceMethod(MethodType.QUERY)
    public void convertData(final Rl02200DTO dto, final ExecutantType exe) throws RisBusinessException;

    /**
     * 暫存印鑑證明核發登記申請資料至XLDF Table
     * 
     * @param rl02200DTO
     * @param executantType
     * @throws RisBusinessException
     *             RisBusinessException：「執行印鑑證明核發登記程式失敗」失敗
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    @WorkStatus(FinalType.TEMP_FINAL)
    public void saveXldf(final Rl02200DTO dto, final ExecutantType exe) throws RisBusinessException;

    /**
     * 刪除印鑑證明核發登記資料
     * 
     * @param openingOperationDTO
     * @param executantType
     * @throws RisBusinessException
     *             RisBusinessException：「執行印鑑證明核發登記程式失敗」失敗
     */
    @RisServiceMethod(MethodType.DELETE)
    public void doDelete(final OpeningOperationDTO openingOperationDTO, final ExecutantType exe) throws RisBusinessException;

    /**
     * 取得印鑑清單資料
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void getFineList(final Rl02200DTO dto, final ExecutantType exe) throws RisBusinessException;

    /**
     * 編輯印鑑證明書
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void editFine(final Rl02200DTO dto, final ExecutantType exe) throws RisBusinessException;

    /**
     * 刪除印鑑證明書
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.DELETE)
    public void deleteFine(final Rl02200DTO dto, final ExecutantType exe) throws RisBusinessException;

    /**
     * 列印印鑑證明書
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    void doPrint(Rl02200DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得印登字號
     * 
     * @param dto
     * @param type
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void getSealNumber(final Rl02200DTO dto, final ExecutantType type) throws RisBusinessException;

    /**
     * 儲存列印資料至XLDF table.
     * 
     * @param dto
     * @param executantType
     */
    void savePrintData(final Rl02200DTO dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 刪除XLDF table列印資料.
     * 
     * @param dto
     * @param executantType
     */
    void deletePrintData(final Rl02200DTO dto, final ExecutantType executantType) throws RisBusinessException;
}
