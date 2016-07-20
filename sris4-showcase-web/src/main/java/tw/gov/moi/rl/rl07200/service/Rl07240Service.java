/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl07200.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl07240DTO;

/**
 * The Interface Rl07240Service.
 */
public interface Rl07240Service {

    /** The Constant DS_NAME_1. */
    String DS_NAME_1 = "Rl7240.getRldf004m";

    /** The Constant DS_NAME_2. */
    String DS_NAME_2 = "Rl7240.getRldf010e";

    String RLDF004M = "rldf004m";

    String QUESTION_MARK = "=?";

    String AND_CONDITION = " and ";

    /**
     * Verify data.
     * 
     * @param rl07240DTO
     *            the rl07240 dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.VERIFY)
    public void verifyData(final Rl07240DTO rl07240DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * Save data.
     * 
     * @param rl07240DTO
     *            the rl07240 dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.SAVE)
    public void saveData(final Rl07240DTO rl07240DTO, final ExecutantType executantType) throws RisBusinessException;

}
