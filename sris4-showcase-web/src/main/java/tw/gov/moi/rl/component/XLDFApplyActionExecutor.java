/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.component.dto.ExecutorResultDTO;
import tw.gov.moi.rl.component.dto.XLDFDomainObject;

/**
 * XLDF存檔特殊處理元件介面
 * 
 * @author Marcus Chen
 * 
 */
public interface XLDFApplyActionExecutor {

    /**
     * 執行處理
     * 
     * @param domainObj
     *            XLDF領域物件
     * @param exe
     *            執行環境參數
     * @throws RisBusinessException
     */
    public ExecutorResultDTO execute(XLDFDomainObject domainObj, ExecutantType exe) throws RisBusinessException;
}
