/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl05700.service;

import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl05700DTO;

/**
 * 列印他所辦理申請書服務介面.
 * 
 * @author DAXIONG
 * 
 */
public interface Rl05700Service {

    /**
     * 送出列印.
     * 
     * @param dto
     *            列印他所辦理申請書DTO
     * @param executantType
     *            使用者資訊
     * @return 路徑
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    String doPrint(final Rl05700DTO dto, final ExecutantType executantType) throws RisBusinessException;

}
