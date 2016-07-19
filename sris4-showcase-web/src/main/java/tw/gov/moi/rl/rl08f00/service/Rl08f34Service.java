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
import tw.gov.moi.rl.domain.Rl08f34DTO;

/**
 * 製作選舉人數初步／確定統計表服務介面.
 * 
 * @author DAXIONG
 * 
 */
public interface Rl08f34Service {

    /**
     * 送出列印.
     * 
     * @param dto
     *            製作選舉人數初步／確定統計表DTO
     * @param executantType
     *            使用者資訊
     * @throws RisBusinessException
     */
    @WorkStatus(FinalType.FINAL)
    @RisServiceMethod(MethodType.PRINT2SYS)
    void doBatchPrint(final Rl08f34DTO dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 另存電子檔.
     * 
     * @param dto
     *            製作選舉人數初步／確定統計表DTO
     * @param executantType
     *            使用者資訊
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.PRINT2SYS)
    void doDownload(final Rl08f34DTO dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 頁面初始化.
     * 
     * @param dto
     *            製作選舉人數初步／確定統計表DTO
     * @param executantType
     *            使用者資訊
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    void doInitPage(final Rl08f34DTO dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 預覽.
     * 
     * @param dto
     *            製作選舉人數初步／確定統計表DTO
     * @param executantType
     *            使用者資訊
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    void doPreview(final Rl08f34DTO dto, final ExecutantType executantType) throws RisBusinessException;

}