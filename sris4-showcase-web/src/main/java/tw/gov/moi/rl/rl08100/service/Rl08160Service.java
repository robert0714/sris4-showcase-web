/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl08100.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08160DTO;

/**
 * 列印戶籍人口統計月報表處理服務介面.
 * 
 * @author Derek Wang
 * 
 */
public interface Rl08160Service {

    /**
     * Do print.
     * 
     * @param rl08160dto
     *            the rl08160dto
     * @param executantType
     *            the executant type
     * @return the string
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    public void doPrint(final Rl08160DTO rl08160dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * Do download.
     * 
     * @param rl08160dto
     *            the rl08160dto
     * @param executantType
     *            the executant type
     * @return the string
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    public void doDownload(final Rl08160DTO rl08160dto, final ExecutantType executantType);

    /**
     * Do preview.
     * 
     * @param rl08160dto
     *            the rl08160dto
     * @param executantType
     *            the executant type
     * @return the string
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.PRINT2SYS)
    public void doPreview(final Rl08160DTO rl08160dto, final ExecutantType executantType) throws RisBusinessException;

}
