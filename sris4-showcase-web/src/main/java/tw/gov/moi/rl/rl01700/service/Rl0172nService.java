/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl01700.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl0172nDTO;
import tw.gov.moi.rl.domain.TempFileDTO;

/**
 * 統一編號變更登記介面.
 * 
 * @author Charles Chen
 */
public interface Rl0172nService {

    /** 服務名稱. */
    public static final String SERVICE_NAME = "統一編號變更登記";

    /** 類別名稱. */
    public static final String CLASS_NAME = "Rl0172nServiceImpl";

    /** 錯誤函數:initOperationService. */
    public static final String INITOPERATIONSERVICE = SERVICE_NAME + " initOperationService";

    /** 錯誤函數:createOtherDataOrgXLDF. */
    public static final String CREATEOTHERDATAORGXLDF = SERVICE_NAME + " createOtherDataOrgXLDF";

    /** 錯誤函數:loadOperationDTO. */
    public static final String LOADOPERATIONDTO = SERVICE_NAME + " loadOperationDTO";

    /** 錯誤函數:reviewOperationDTO. */
    public static final String REVIEWOPERATIONDTO = SERVICE_NAME + " reviewOperationDTO";

    /** 錯誤函數:getLastRldfm03m. */
    public static final String GETLASTRLDFM03M = SERVICE_NAME + " getLastRldfm03m";

    /** 錯誤函數:doDelete. */
    public static final String DODELETE = SERVICE_NAME + " doDelete";

    /** 錯誤函數:saveXldf. */
    public static final String SAVEXLDF = SERVICE_NAME + " saveXldf";

    /**
     * 執行Contoller loadPage() 的第一個Service之共用邏輯.
     * 
     * @param dto
     *            統一編號變更登記DTO
     * @param exec
     *            使用者資訊
     * @return 統一編號變更登記DTO
     * @throws RisBusinessException
     *             執行程式失敗
     */
    public Rl0172nDTO initLoadPage(final Rl0172nDTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 設定第一次新增登記畫面初始值.
     * 
     * @param dto
     *            統一編號變更登記DTO
     * @param exec
     *            使用者資訊
     * @return 統一編號變更登記DTO
     * @throws RisBusinessException
     *             執行程式失敗
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl0172nDTO initOperationDTO(final Rl0172nDTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 設定編輯登記畫面初始值.
     * 
     * @param dto
     *            統一編號變更登記DTO
     * @param exec
     *            使用者資訊
     * @return 統一編號變更登記DTO
     * @throws RisBusinessException
     *             執行程式失敗
     */
    public Rl0172nDTO loadOperationDTO(final Rl0172nDTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 再次驗證狀態時載入結婚撤销登記DTO.
     * 
     * @param dto
     *            統一編號變更登記DTO
     * @param exec
     *            使用者資訊
     * @return 統一編號變更登記DTO
     * @throws RisBusinessException
     *             執行程式失敗
     */
    public Rl0172nDTO reviewOperationDTO(final Rl0172nDTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 將DTO檔案反序列化成DTO物件。.
     * 
     * @param tempFileDTO
     *            TempFileDTO
     * @param exec
     *            使用者資訊
     * @return 統一編號變更登記DTO
     */
    public Rl0172nDTO loadTempFile(final TempFileDTO<Rl0172nDTO> tempFileDTO, final ExecutantType exec);

    /**
     * 將DTO物件序列化成檔案。.
     * 
     * @param tempFileDTO
     *            TempFileDTO
     * @param exec
     *            使用者資訊
     */
    public void saveTempFile(final TempFileDTO<Rl0172nDTO> tempFileDTO, final ExecutantType exec);

    /**
     * 刪除統一編號變更登記資料.
     * 
     * @param dto
     *            統一編號變更登記DTO
     * @param exec
     *            使用者資訊
     * @throws RisBusinessException
     *             執行程式失敗
     */
    public void doDelete(final Rl0172nDTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 執行資料驗證並自動組合記事.
     * 
     * @param dto
     *            統一編號變更登記DTO
     * @param exec
     *            使用者資訊
     * @return 統一編號變更登記DTO
     * @throws RisBusinessException
     *             執行程式失敗
     */
    public Rl0172nDTO verifyAppData(final Rl0172nDTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 暫存「統一編號變更登記資料」至XLDFTable.
     * 
     * @param dto
     *            統一編號變更登記DTO
     * @param exec
     *            使用者資訊
     * @return 統一編號變更登記DTO
     * @throws RisBusinessException
     *             執行程式失敗
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    @WorkStatus(FinalType.TEMP_FINAL)
    public void saveXldf(final Rl0172nDTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 刪除「統一編號變更登記資料」之罰鍰資料XLDF.
     * 
     * @param dto
     *            統一編號變更登記DTO
     * @param exec
     *            使用者資訊
     * @throws RisBusinessException
     *             執行程式失敗
     */
    public void doDeleteHouseholdFine(final Rl0172nDTO dto, final ExecutantType exec) throws RisBusinessException;

}
