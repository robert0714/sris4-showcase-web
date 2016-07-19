/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl02b00.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl02bb0DTO;

/**
 * The Interface Rl02bb0Service.
 */
public interface Rl02bb0Service {

    /**
     * 送出_空白國民身分證及膠膜領發報告表列印.
     * 
     * @param rl02bb0DTO
     *            the rl02bb0 dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    @WorkStatus(FinalType.FINAL)
    void doPrint(final Rl02bb0DTO rl02bb0DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 另存電子檔_取得並下載空白國民身分證及膠膜領發報告表.
     * 
     * @param rl02bb0DTO
     *            the rl02bb0 dto
     * @param executantType
     *            the executant type
     * @return the string
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    @WorkStatus(FinalType.FINAL)
    void doDownload(final Rl02bb0DTO rl02bb0DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 預覽列印_空白國民身分證及膠膜領發報告表列印.
     * 
     * @param rl02bb0DTO
     *            the rl02bb0 dto
     * @param executantType
     *            the executant type
     * @return the string
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    void doPreview(final Rl02bb0DTO rl02bb0DTO, final ExecutantType executantType) throws RisBusinessException;

}
