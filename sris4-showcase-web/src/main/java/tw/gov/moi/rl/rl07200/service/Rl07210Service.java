/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl07200.service;

import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.rl.domain.Rl07210DTO;

public interface Rl07210Service {
    @RisServiceMethod(MethodType.DELETE)
    public void doExecute(final Rl07210DTO rl07210DTO, final ExecutantType executantType);
}
