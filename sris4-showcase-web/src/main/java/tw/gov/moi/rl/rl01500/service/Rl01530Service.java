/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl01500.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.dto.Rl01530DTO;

/**
 * 印鑑廢止服務介面
 * 
 * @author Marcus Chen
 * 
 */
public interface Rl01530Service {
	
	final String E_MSG_METHOD_SAVE_XLDF4T = "暫存「辦理他所－印鑑廢止登記申請書歷史資料」至XLDF4T失敗";
	final String E_MSG_METHOD_SAVE_XLDF026S = "暫存「臨時－辦理他所申請書索引資料」至XLDF026S失敗";
	final String E_MSG_METHOD_SAVE_XLDF1S = "暫存「申請書資料檔」至XLDF1S失敗";
	final String OPERATION_CODE = RlConstant.OPERATION_CODE_01510;
	final String APPLY_CODE = "019";

    /**
     * 初始化印鑑廢止登記
     * 
     * @param rl01530DTO
     * @param executantType
     * @return Rl01530DTO
     * @throws RisBusinessException
     *             RisBusinessException：「初始化印鑑廢止登記」失敗
     */
    @RisServiceMethod(MethodType.SAVE)
    public Rl01530DTO initOperationDTO(final Rl01530DTO dto, final ExecutantType exe) throws RisBusinessException;

    /**
     * 載入印鑑廢止登記編輯頁面
     * 
     * @param rl01530DTO
     * @param executantType
     * @return Rl01530DTO
     * @throws RisBusinessException
     *             RisBusinessException：「載入印鑑廢止登記」失敗
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl01530DTO loadOperationDTO(final Rl01530DTO dto, final ExecutantType exe) throws RisBusinessException;

    /**
     * 載入印鑑廢止登記編輯後頁面
     * 
     * 
     * @param rl01530DTO
     * @param executantType
     * @return Rl01530DTO
     * @throws RisBusinessException
     *             RisBusinessException：「載入印鑑廢止登記」失敗
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl01530DTO reviewOperationDTO(final Rl01530DTO dto, final ExecutantType exe) throws RisBusinessException;

    /**
     * 執行資料驗證並自動組合記事
     * 
     * @param rl01530DTO
     * @param executantType
     * @return Rl01530DTO
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.VERIFY)
    public void verifyAppData(final Rl01530DTO dto, final ExecutantType exe) throws RisBusinessException;

    /**
     * 由輸入資料轉換衍生資料
     * 
     * @param rl01530DTO
     * @param executantType
     * @throws RisBusinessException
     *             RisBusinessException：「執行印鑑廢止登記程式失敗」失敗
     */
    @RisServiceMethod(MethodType.QUERY)
    public void convertData(final Rl01530DTO dto, final ExecutantType exe) throws RisBusinessException;

    /**
     * 暫存印鑑廢止登記申請資料至XLDF Table
     * 
     * @param rl01530DTO
     * @param executantType
     * @throws RisBusinessException
     *             RisBusinessException：「執行印鑑廢止登記程式失敗」失敗
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.TEMP_FINAL)
    public void saveXldf(final Rl01530DTO dto, final ExecutantType exe) throws RisBusinessException;

    /**
     * 刪除印鑑廢止登記資料
     * 
     * @param openingOperationDTO
     * @param executantType
     * @throws RisBusinessException
     *             RisBusinessException：「執行印鑑廢止登記程式失敗」失敗
     */
    @RisServiceMethod(MethodType.DELETE)
    public void doDelete(final OpeningOperationDTO openingOperationDTO, final ExecutantType exe)
            throws RisBusinessException;

    /**
     * 取得罰鍰清單資料
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void getFineList(final Rl01530DTO dto, final ExecutantType exe) throws RisBusinessException;

    /**
     * 編輯罰鍰處分書
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void editFine(final Rl01530DTO dto, final ExecutantType exe) throws RisBusinessException;

    /**
     * 刪除罰鍰處分書
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.DELETE)
    public void deleteFine(final Rl01530DTO dto, final ExecutantType exe) throws RisBusinessException;

    /**
     * 取得印登字號
     * 
     * @param dto
     * @param type
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void getSealNumber(final Rl01530DTO dto, final ExecutantType type) throws RisBusinessException;
}
