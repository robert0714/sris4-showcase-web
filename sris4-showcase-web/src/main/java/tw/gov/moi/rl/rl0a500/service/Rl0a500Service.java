/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl0a500.service;

import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl0a500DTO;

/**
 * 規費收據查詢服務介面.
 * 
 * @author Viva.Hong
 */
public interface Rl0a500Service {

    /** 服務名稱. */
    public static final String SERVICE_NAME = "規費收據查詢";

    /** operation code. */
    public static final String OPERATION_CODE = "0A500";

    /** 類別名稱. */
    public static final String CLASS_NAME = "Rl0a500ServiceImpl";

    /**
     * 取得收據號碼.
     * 
     * @param dto
     *            規費收據查詢DTO
     * @param exec
     *            使用者資訊
     * @throws RisBusinessException
     *             取得收據號碼失敗
     */
    public void createReceiptId(final Rl0a500DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 刪除列印用Table.
     * 
     * @param dto
     *            規費收據查詢DTO
     * @param exec
     *            使用者資訊
     * @throws RisBusinessException
     *             刪除列印用Table失敗
     */
    public void doDeleteXldfmainrcp(final Rl0a500DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 列印收據.
     * 
     * @param dto
     *            規費收據查詢DTO
     * @param exec
     *            使用者資訊
     */
    public void doPrint(final Rl0a500DTO dto, final ExecutantType exec);

    /**
     * 查詢規費收據.
     * 
     * @param dto
     *            規費收據查詢DTO
     * @param exec
     *            使用者資訊
     * @return 規費收據查詢DTO
     * @throws RisBusinessException
     *             查詢規費收據失敗
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl0a500DTO doQuery(final Rl0a500DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 取得規費明細資料.
     * 
     * @param dto
     *            規費收據查詢DTO
     * @param exec
     *            使用者資訊
     * @return 規費收據查詢DTO
     * @throws RisBusinessException
     *             取得規費明細資料失敗
     */
    public Rl0a500DTO doQueryViewDetail(Rl0a500DTO dto, ExecutantType exec) throws RisBusinessException;

    /**
     * 初始化規費收據查詢處理.
     * 
     * @param dto
     *            規費收據查詢DTO
     * @param exec
     *            使用者資訊
     * @throws RisBusinessException
     *             初始化規費收據查詢失敗
     */
    public void initOperationDTO(final Rl0a500DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 列印收據.
     * 
     * @param dto
     *            規費收據查詢DTO
     * @param exec
     *            使用者資訊
     * @throws RisBusinessException
     *             列印收據失敗
     */
    public void printReceipt(final Rl0a500DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 收據存檔.
     * 
     * @param dto
     *            規費收據查詢DTO
     * @param exec
     *            使用者資訊
     */
    public void saveRldf(final Rl0a500DTO dto, final ExecutantType exec);

    /**
     * 儲存列印收據資料.
     * 
     * @param dto
     *            規費收據查詢DTO
     * @param exec
     *            使用者資訊
     * @throws RisBusinessException
     *             儲存列印收據資料失敗
     */
    public void saveXldfmainrcp(final Rl0a500DTO dto, final ExecutantType exec) throws RisBusinessException;
}
