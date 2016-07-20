/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl0z300.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl0z000DTO;

/**
 * 另存電子檔下載作業服務介面Service Interface
 * 
 * @author Ahhong
 */
public interface Rl0z300Service {
    String DS_NAME = "rl0z300.getRedfrptf";

    /**
     * 查詢
     * 
     * @param executantType
     * @param rl0z000DTO
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doQuery(Rl0z000DTO dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 下載
     * 
     * @param executantType
     * @param rl0z000DTO
     * @throws RisBusinessException
     */
    @WorkStatus(FinalType.FINAL)
    @RisServiceMethod(MethodType.DOWNLOAD)
    public void doDownload(Rl0z000DTO dto, ExecutantType executantType) throws RisBusinessException;

}