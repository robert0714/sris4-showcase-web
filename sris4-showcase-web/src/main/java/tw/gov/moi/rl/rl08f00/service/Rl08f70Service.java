/*
 * Copyright (c) 2010-2020 IISI. All rights reserved.
 * 
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl08f00.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08f70DTO;

/**
 * 選舉造冊封面列印服務介面.
 * 
 * @author Weiren.Jheng
 */
public interface Rl08f70Service {

    void doInitPage(final Rl08f70DTO dto, final ExecutantType executantType) throws RisBusinessException;
}