/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.RlGetFileReturnDTO;
import tw.gov.moi.rl.domain.RlGetFileWsDTO;

/**
 * 
 * 取得file資料
 * 
 * @author marcus
 * 
 */
public interface RlFetchFileDataComponent {
    /***
     * 取得FileData
     * 
     * @param dto
     * @param exe
     * @return RlGetFileReturnDTO
     * @throws RisBusinessException
     */
    RlGetFileReturnDTO fetchFileData(RlGetFileWsDTO dto, ExecutantType exe) throws RisBusinessException;

}
