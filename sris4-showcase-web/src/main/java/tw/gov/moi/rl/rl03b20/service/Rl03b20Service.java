/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl03b20.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl03b20QueryDTO;

/**
 * The Interface Rl03b20Service.
 * 
 * 概要戶籍資料查詢 for PDA處理服務介面
 */
public interface Rl03b20Service {

    /**
     * 查詢戶籍資料.
     * 
     * @param rl03b20QueryDTO
     *            the rl03b20 query dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    public void doQuery(final Rl03b20QueryDTO rl03b20QueryDTO, final ExecutantType executantType)
            throws RisBusinessException;

}