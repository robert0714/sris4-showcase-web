/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl03300.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl03310DTO;

/**
 * 特殊註記資料查詢服務介面
 * 
 * @author Mego Peng
 * 
 */

public interface Rl03310Service {

    @RisServiceMethod(value = MethodType.QUERY)
    @WorkStatus(FinalType.FINAL)
    public void queryRecord(Rl03310DTO rl03310DTO, ExecutantType executantType) throws RisBusinessException;

}