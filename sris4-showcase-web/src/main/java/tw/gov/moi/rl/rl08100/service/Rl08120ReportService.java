/*
 * Copyright (c) 2010-2020 IISI. All rights reserved.
 * 
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl08100.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08120DTO;

public interface Rl08120ReportService {
    
    void doBatchReportJobAll(final Rl08120DTO dto, final ExecutantType executantType) throws RisBusinessException;
    
    void doPreview(final Rl08120DTO dto, final ExecutantType executantType) throws RisBusinessException;

    void doDownloadAll(Rl08120DTO dto, ExecutantType executantType) throws RisBusinessException;
}
