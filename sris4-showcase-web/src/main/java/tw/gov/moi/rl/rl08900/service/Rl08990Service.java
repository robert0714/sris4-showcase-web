/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl08900.service;

import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.rl.domain.Rl08990DTO;

/**
 * 同戶人口數及同門牌設籍戶數統計服務介面.
 * 
 * @author Jay Kan
 */
public interface Rl08990Service {

    /**
     * 列印同戶人口數及同門牌設籍戶數統計.
     * 
     * @param rl08990DTO
     *            the rl08990 dto
     * @param executantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.BATCH)
    void doPrint(final Rl08990DTO rl08990DTO, final ExecutantType executantType);

    /**
     * 下載列印同戶人口數及同門牌設籍戶數統計.
     * 
     * @param rl08990DTO
     *            the rl08990 dto
     * @param executantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.DOWNLOAD)
    void doDownload(final Rl08990DTO rl08990DTO, final ExecutantType executantType);

    /**
     * 預覽列印同戶人口數及同門牌設籍戶數統計.
     * 
     * @param rl08990DTO
     *            the rl08990 dto
     * @param executantType
     *            the executant type
     * @return the string
     */
    @RisServiceMethod(MethodType.PRINT2SYS)
    void doPreview(final Rl08990DTO rl08990DTO, final ExecutantType executantType);
}
