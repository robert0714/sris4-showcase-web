/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl01z00.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl01z00DTO;

/**
 * 列印空白申請書處理服務介面.
 * 
 * @author Derek Wang
 * 
 */
public interface Rl01z00Service {

    /**
     * Do print.
     * 
     * @param rl01z00DTO
     *            the rl01z00 dto
     * @param executantType
     *            the executant type
     * @return the string
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    public void doPrint(final Rl01z00DTO rl01z00DTO, final ExecutantType executantType) throws RisBusinessException;

}
