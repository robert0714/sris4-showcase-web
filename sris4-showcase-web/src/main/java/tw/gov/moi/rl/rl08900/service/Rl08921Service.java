/*
 * Copyright (c) 2010-2020 IISI. All rights reserved.
 * 
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl08900.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08921DTO;

/**
 * 查詢核准原住民族回復傳統（漢人）姓名及並列羅馬拼音登記人數資料處理服務 Interface Rl08921Service.
 * 
 * @author kenfc
 */
public interface Rl08921Service {

    final String NOTIFY_CODE = "Z199";

    /**
     * 查詢核准原住民族回復傳統（漢人）姓名及並列羅馬拼音登記人數資料處理服務介面
     * 
     * @param Rl08921DTO
     *            戶號
     * @return Rl08921DTO
     * 
     * @throws RisBusinessException
     *             執行作業失敗(TX-D088E)+extMessage=查詢自然人憑證申辦教育程度資料
     */
    @RisServiceMethod(MethodType.QUERY)
    @WorkStatus(FinalType.FINAL)
    public Rl08921DTO verifyData(Rl08921DTO rl08921DTO, ExecutantType executantType) throws RisBusinessException;

}
