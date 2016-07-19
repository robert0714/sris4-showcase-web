/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl01400.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl01450DTO;

/**
 * 特殊註記管理
 * 
 * @author 1109001
 * 
 */
public interface Rl01450Service {
    /**
     * 清除已到期之特殊註記
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)   
    public void clearSpecialCode(final Rl01450DTO dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 預覽列印
     * 
     * @param dto
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    @WorkStatus(FinalType.FINAL)   
    public void doPreview(Rl01450DTO dto, ExecutantType executantType) throws RisBusinessException;

}
