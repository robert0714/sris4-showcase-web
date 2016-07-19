/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl03a00.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl03a00DTO;

/**
 * The Interface Rl03a00Service.
 * 
 * @author Derek
 */
public interface Rl03a00Service {

    /**
     * 本地個人戶籍資料查詢.
     * 
     * @param rl03a00DTO
     *            the rl03a00 dto
     * @param executantType
     *            the executant type
     * @return the rl03a00 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl03a00DTO doQuery(final Rl03a00DTO rl03a00DTO, final ExecutantType executantType)
            throws RisBusinessException;

}
