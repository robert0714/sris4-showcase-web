/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl01b00.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.rl.domain.Rl01b30DTO;

/**
 * 保護家庭暴力資料註記查詢處理服務介面
 * 
 * @author Jay Kan
 */
public interface Rl01b30Service {

    String EXT_MESSAGE = "驗証查詢輸入的被害保護人統號或相對人統號是否符合";

    /**
     * 查詢輸入的被害保護人統號或相對人統號是否符合
     * 
     * @param pRl01b30DTO
     *            the rl01b30 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.QUERY)
    @WorkStatus(FinalType.FINAL)
    void doQuery(final Rl01b30DTO pRl01b30DTO, final ExecutantType pExecutantType);
}
