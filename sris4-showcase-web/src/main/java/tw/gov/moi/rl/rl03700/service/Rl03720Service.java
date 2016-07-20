/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl03700.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl03720DTO;

/**
 * 外來通報及申請書索引資料查詢服務介面
 * 
 * @author Mego Peng
 * 
 */

public interface Rl03720Service {

    @RisServiceMethod(value = MethodType.QUERY)
    @WorkStatus(FinalType.FINAL)
    public void queryRecord(Rl03720DTO rl03720DTO, ExecutantType executantType) throws RisBusinessException;

}