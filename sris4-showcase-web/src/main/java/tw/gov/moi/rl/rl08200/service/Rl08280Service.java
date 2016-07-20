/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl08200.service;

import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08280DTO;

/**
 * 製作全年人口動態統計項目依比例分配件數表處理服務介面 Rl08280Service.
 */
public interface Rl08280Service {

    /**
     * 製作全年人口動態統計項目依比例分配件數表.
     * 
     * @param rl08280DTO
     *            the rl08280 dto
     * @param executantType
     *            the executant type
     * @return the string
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    public void doPrint(final Rl08280DTO rl08280DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得並下載重印戶籍人口統計月報.
     * 
     * @param rl08280DTO
     *            the rl08280 dto
     * @param executantType
     *            the executant type
     * @return the string
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    public void doDownload(final Rl08280DTO rl08280DTO, final ExecutantType executantType) throws RisBusinessException;
    
    void doPreview(Rl08280DTO rl08280dto, ExecutantType executantType) throws RisBusinessException;

    void doBatchPrint(Rl08280DTO rl08280dto, ExecutantType executantType) throws RisBusinessException;
}
