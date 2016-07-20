/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl05200.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl05238DTO;

/**
 * 外來戶籍通報明細簿資料查詢服務介面 Rl05238Service
 */
public interface Rl05238Service {

    /**
     * 查詢外來戶籍通報明細簿資料.
     * 
     * @param rl05238dto
     *            the rl05238dto
     * @param executantType
     *            the executant type
     * @return the rl05238 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    @WorkStatus(FinalType.FINAL)
    @RisServiceMethod(MethodType.QUERY)
    public Rl05238DTO doQuery(Rl05238DTO rl05238dto, ExecutantType executantType) throws RisBusinessException;

}
