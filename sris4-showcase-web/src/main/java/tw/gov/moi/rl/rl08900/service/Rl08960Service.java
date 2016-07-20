/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl08900.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08960DTO;

/**
 * 列印遷徙記錄名冊處理服務介面 Rl08960Service.
 */
public interface Rl08960Service {

    /**
     * 列印遷徙記錄名冊.
     * 
     * @param rl08960dto
     *            the rl08960dto
     * @param executantType
     *            the executant type
     * @return the string
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    public void doPrint(final Rl08960DTO rl08960dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得並下載遷徙記錄名冊.
     * 
     * @param rl08960dto
     *            the rl08960dto
     * @param executantType
     *            the executant type
     * @return the string
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    public void doDownload(final Rl08960DTO rl08960dto, final ExecutantType executantType) throws RisBusinessException;

}
