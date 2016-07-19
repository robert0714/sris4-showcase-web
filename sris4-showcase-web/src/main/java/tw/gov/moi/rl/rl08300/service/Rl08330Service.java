/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl08300.service;

import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.rl.domain.Rl08330DTO;

/**
 * 製作不符邏輯年終人口靜態資料表處理服務介面 Rl08330Service.
 * 
 * @author Dan Tsai
 */
public interface Rl08330Service {

    /**
     * Verify rlde8310.
     * 
     * @param rl08330DTO
     *            the rl08330 dto
     * @param executantType
     *            the executant type
     */
    void verifyRlde8310(final Rl08330DTO rl08330DTO, final ExecutantType executantType);

    /**
     * 製作不符邏輯年終人口靜態資料表.
     * 
     * @param rl08330DTO
     *            the rl08330 dto
     * @param executantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.BATCH)
    void doPrint(final Rl08330DTO rl08330DTO, final ExecutantType executantType);

    /**
     * 取得並下載不符邏輯年終人口靜態資料表.
     * 
     * @param rl08330DTO
     *            the rl08330 dto
     * @param executantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.DOWNLOAD)
    void doDownload(final Rl08330DTO rl08330DTO, final ExecutantType executantType);

    /**
     * 預覽列印.
     * 
     * @param rl08330DTO
     *            the rl08330 dto
     * @param executantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.PRINT2SYS)
    void doPreview(final Rl08330DTO rl08330DTO, final ExecutantType executantType);
}
