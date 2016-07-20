/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl08200.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08210DTO;

/**
 * 轉錄申請書處理服務介面
 */
public interface Rl08210Service {

    /**
     * 轉錄申請書批次作業
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    public void doJob(Rl08210DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 設定轉錄申請書資料 Do convert.
     * 
     * @param rl08210DTO
     *            the rl08210 dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    void doConvert(final Rl08210DTO rl08210DTO, final ExecutantType executantType) throws RisBusinessException;

}