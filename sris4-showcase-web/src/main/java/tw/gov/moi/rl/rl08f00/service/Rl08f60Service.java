/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl08f00.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.rl.domain.Rl08f60DTO;

/**
 * 他往工投資料處理服務介面.
 * 
 * @author Ahhong
 */
public interface Rl08f60Service {

    String IS_NUMERIC_REG = "[-]?\\d+";

    /**
     * 查詢.
     * 
     * @param rl08f60DTO
     *            the rl08f60 dto
     * @param executantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.QUERY)
    void doQuery(Rl08f60DTO rl08f60DTO, ExecutantType executantType);

    /**
     * 新增.
     * 
     * @param rl08f60DTO
     *            the rl08f60 dto
     * @param executantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    void doSave(Rl08f60DTO rl08f60DTO, ExecutantType executantType);
}
