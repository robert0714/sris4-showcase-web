/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl0a600.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl0a600DTO;

/**
 * 新增規費收據介面.
 * 
 * @author Viva.Hong
 */
public interface Rl0a600Service {

    /** 報表名稱. */
    public static final String REPORT_NAME = "RLRPR0000";

    /** 類別名稱. */
    public static final String CLASS_NAME = "Rl0a600ServiceImpl";

    /**
     * 初始化新增規費收據.
     * 
     * @param dto
     *            規費收據DTO
     * @param exec
     *            使用者資訊
     * @return 規費收據DTO
     * @throws RisBusinessException
     *             執行程式失敗
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl0a600DTO initOperationDTO(final Rl0a600DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 取得規費單價.
     * 
     * @param dto
     *            規費收據DTO
     * @param exec
     *            使用者資訊
     * @return 規費收據DTO
     * @throws RisBusinessException
     *             執行程式失敗
     */
    public Rl0a600DTO getFeePrice(final Rl0a600DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 取得申請人姓名.
     * 
     * @param dto
     *            規費收據DTO
     * @param exec
     *            使用者資訊
     * @return 規費收據DTO
     * @throws RisBusinessException
     *             取得申請人姓名失敗
     */
    public Rl0a600DTO getPersonName(final Rl0a600DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 列印收據.
     * 
     * @param dto
     *            規費收據DTO
     * @param exec
     *            使用者資訊
     * @return 規費收據DTO
     * @throws RisBusinessException
     *             執行程式失敗
     */
    public Rl0a600DTO printReceipt(final Rl0a600DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 取得收據號碼.
     * 
     * @param dto
     *            規費收據DTO
     * @param exec
     *            使用者資訊
     * @throws RisBusinessException
     *             取得收據號碼失敗
     */
    public void createReceiptId(final Rl0a600DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 收據存檔.
     * 
     * @param dto
     *            規費收據DTO
     * @param exec
     *            使用者資訊
     * @throws RisBusinessException
     *             執行程式失敗
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void saveRldf(final Rl0a600DTO dto, final ExecutantType exec) throws RisBusinessException;
}
