/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl04200.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl04240DTO;

/**
 * 門牌整編生效與還原處理服務介面
 * 
 * @author Mego Peng
 * 
 */

public interface Rl04240Service {

    /** 登入驗證 **/
    @RisServiceMethod(value = MethodType.QUERY)
    public void verifyLogin(final Rl04240DTO rl04240DTO, final ExecutantType executantType) throws RisBusinessException;

    /** 門牌整編生效 **/
    @RisServiceMethod(value = MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void saveRldf(final Rl04240DTO rl04240DTO, final ExecutantType executantType) throws RisBusinessException;

    /** 還原整編生效資料 **/
    @RisServiceMethod(value = MethodType.BACKUP)
    @WorkStatus(FinalType.FINAL)
    public void restoreRldf(final Rl04240DTO rl04240DTO, final ExecutantType executantType) throws RisBusinessException;

}