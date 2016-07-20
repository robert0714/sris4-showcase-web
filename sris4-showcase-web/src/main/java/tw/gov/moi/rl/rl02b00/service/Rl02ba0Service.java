/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl02b00.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.rl.domain.Rl02ba0DTO;

/**
 * The Interface Rl02ba0Service.
 */
public interface Rl02ba0Service {

    String RLRP02BA0 = "RLRP02BA0";

    /**
     * 送出_空白國民身分證及膠膜領發月報表列印.
     * 
     * @param rl02ba0DTO
     *            the rl02ba0 dto
     * @param executantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.BATCH)
    @WorkStatus(FinalType.FINAL)
    void doPrint(final Rl02ba0DTO rl02ba0DTO, final ExecutantType executantType);

    /**
     * 另存電子檔_取得並下載空白國民身分證及膠膜領發月報表.
     * 
     * @param rl02ba0DTO
     *            the rl02ba0 dto
     * @param executantType
     *            the executant type
     * @return the string
     */
    @RisServiceMethod(MethodType.DOWNLOAD)
    @WorkStatus(FinalType.FINAL)
    void doDownload(final Rl02ba0DTO rl02ba0DTO, final ExecutantType executantType);

    /**
     * 預覽列印_空白國民身分證及膠膜領發月報表列印.
     * 
     * @param rl02ba0DTO
     *            the rl02ba0 dto
     * @param executantType
     *            the executant type
     * @return the string
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    void doPreview(final Rl02ba0DTO rl02ba0DTO, final ExecutantType executantType);

    /**
     * 取得當月空白國民身分證及膠膜領發月報表
     * 
     * @param dto
     * @param executantType
     */
    @RisServiceMethod(MethodType.QUERY)
    void queryRldf014ds(final Rl02ba0DTO dto, final ExecutantType executantType);
}
