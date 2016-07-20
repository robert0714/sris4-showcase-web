/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl08300.service;

import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.rl.domain.Rl08350DTO;

/**
 * The Interface Rl08310Service.
 */
public interface Rl08350Service {

    /**
     * Save data.
     * 
     * @param rl08350DTO
     *            the rl08350 dto
     * @param executantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.BATCH)
    void saveData(final Rl08350DTO rl08350DTO, final ExecutantType executantType);
}
