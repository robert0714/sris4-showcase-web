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
import tw.gov.moi.rl.domain.Rl08390DTO;

/**
 * 製作年終人口靜態統計項目依比例分配人數表處理服務介面.
 * 
 * @author Derek Wang
 * 
 */
public interface Rl08390Service {

    /**
     * Do print.
     * 
     * @param rl08390DTO
     *            the rl08390 dto
     * @param executantType
     *            the executant type
     * @return the string
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    void doPrint(final Rl08390DTO rl08390DTO, final ExecutantType executantType);

    /**
     * Do download.
     * 
     * @param rl08390DTO
     *            the rl08390 dto
     * @param executantType
     *            the executant type
     * @return the string
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    void doDownload(final Rl08390DTO rl08390DTO, final ExecutantType executantType);

    /**
     * 預覽列印.
     * 
     * @param rl08390DTO
     *            the rl08390 dto
     * @param executantType
     *            the executant type
     */
    void doPreview(final Rl08390DTO rl08390DTO, final ExecutantType executantType);
}
