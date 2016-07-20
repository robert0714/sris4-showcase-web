/*
 * Copyright (c) 2010-2020 IISI. All rights reserved.
 * 
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl04100.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl04120DTO;

/**
 * 製作新舊里鄰門牌對照表處理服務介面.
 * 
 * @author Mego Peng
 */

public interface Rl04120Service {

    /**
     * 列印製作新舊里鄰門牌對照表
     * 
     * @param Rl04120DTO
     * @param ExecutantType
     * @return url
     * @throws RisBusinessException
     *             ：執行列印作業失敗（TX-6350-E）製作新舊里鄰門牌對照表
     */
    @RisServiceMethod(MethodType.PRINT2SYS)
    @WorkStatus(FinalType.FINAL)
    public void doPrint(Rl04120DTO rl04120DTO, ExecutantType executantType) throws RisBusinessException;

    @RisServiceMethod(MethodType.PRINT2SYS)
    @WorkStatus(FinalType.FINAL)
    public void doDownload(final Rl04120DTO rl04120DTO, final ExecutantType executantType) throws RisBusinessException;

    @RisServiceMethod(MethodType.PRINT2SYS)
    public void doBatchPrint(Rl04120DTO rl04120DTO, ExecutantType executantType) throws RisBusinessException;

    @RisServiceMethod(MethodType.PRINT2SYS)
    @WorkStatus(FinalType.FINAL)
    public void doPreview(Rl04120DTO rl04120DTO, ExecutantType executantType) throws RisBusinessException;

}
