/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl02a00.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.rl.domain.Rl02a80DTO;

/**
 * 製作國民身分證臨時證明書服務介面.
 */
public interface Rl02a80Service {

    /**
     * 列印國民身分證臨時證明書.
     * 
     * @param rl02a80DTO
     *            製作國民身分證臨時證明書DTO
     * @param executantType
     *            使用者資訊
     */
    @RisServiceMethod(MethodType.PRINT2SYS)
    @WorkStatus(FinalType.FINAL)
    public void doPrint(Rl02a80DTO rl02a80DTO, ExecutantType executantType);

    /**
     * 驗證查詢.
     * 
     * @param rl02a80DTO
     *            製作國民身分證臨時證明書DTO
     * @param executantType
     *            使用者資訊
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doQuery(Rl02a80DTO rl02a80DTO, ExecutantType executantType);

}