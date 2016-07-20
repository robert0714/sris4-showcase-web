/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl08400.service;

import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08420DTO;

/**
 * 列印學齡兒童名冊處理服務介面.
 * 
 * @author Derek Wang
 * 
 */
public interface Rl08420Service {

    /**
     * Do print.
     * 
     * @param rl08420DTO
     *            the rl08420 dto
     * @param executantType
     *            the executant type
     * @return the string
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    public void doPrint(final Rl08420DTO rl08420DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * Do download.
     * 
     * @param rl08420DTO
     *            the rl08420 dto
     * @param executantType
     *            the executant type
     * @return the string
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    public void doDownload(final Rl08420DTO rl08420DTO, final ExecutantType executantType);

    /**
     * Do init.
     * 
     * @param rl08420DTO
     *            the rl08420 dto
     * @param executantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doInit(final Rl08420DTO rl08420DTO, final ExecutantType executantType);

    void doPreview(Rl08420DTO dto, ExecutantType executantType) throws RisBusinessException;
}
