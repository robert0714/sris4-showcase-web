/*
 * Copyright (c) 2010-2020 IISI. All rights reserved.
 * 
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl08100.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08171DTO;

/**
 */
public interface Rl08171Service {

    void doExecute(final Rl08171DTO rl08171DTO, final ExecutantType executantType) throws RisBusinessException;

    void doBatch(final Rl08171DTO dto, final ExecutantType executantType) throws RisBusinessException;
}
