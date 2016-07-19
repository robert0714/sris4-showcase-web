/*
 * Copyright (c) 2010-2020 IISI. All rights reserved.
 * 
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl08f00.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08f36DTO;

/**
 * 選舉人名冊起迄頁次明細及各鄰人數統計表服務介面.
 * 
 * @author DAXIONG
 * 
 */
public interface Rl08f36Service {

    static final String RLRP08F36 = "RLRP08F36";

    static final String RLRP08J36 = "RLRP08J36";

    /**
     * 送出列印.
     * 
     * @param dto
     *            選舉人名冊起迄頁次明細及各鄰人數統計表DTO
     * @param executantType
     *            使用者資訊
     * @throws RisBusinessException
     */
    @WorkStatus(FinalType.FINAL)
    @RisServiceMethod(MethodType.BATCH)
    void doBatchPrint(final Rl08f36DTO dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 另存電子檔.
     * 
     * @param dto
     *            選舉人名冊起迄頁次明細及各鄰人數統計表DTO
     * @param executantType
     *            使用者資訊
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.DOWNLOAD)
    void doDownload(final Rl08f36DTO dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 頁面初始化.
     * 
     * @param dto
     *            選舉人名冊起迄頁次明細及各鄰人數統計表DTO
     * @param executantType
     *            使用者資訊
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    void doInitPage(final Rl08f36DTO dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 預覽.
     * 
     * @param dto
     *            選舉人名冊起迄頁次明細及各鄰人數統計表DTO
     * @param executantType
     *            使用者資訊
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.PRINT2SYS)
    void doPreview(final Rl08f36DTO dto, final ExecutantType executantType) throws RisBusinessException;

}