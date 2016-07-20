/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl08700.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08750DTO;

public interface Rl08750Service {
    void doExecute(Rl08750DTO dto, ExecutantType executantType) throws RisBusinessException;
    void doPreview(Rl08750DTO dto, ExecutantType executantType) throws RisBusinessException;
    void doDownload(Rl08750DTO dto, ExecutantType executantType) throws RisBusinessException;
    void doPrint(Rl08750DTO dto, ExecutantType executantType) throws RisBusinessException;
}
