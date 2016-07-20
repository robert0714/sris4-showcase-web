/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl08300.service;

import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.rl.domain.Rl08380DTO;

/**
 * 年終靜態統計作業
 * 
 * @author Stanley.Li
 * 
 */
public interface Rl08380Service {

    String REPORTEXT_ALL = "All";

    /**
     * Verify rlde8310.
     * 
     * @param rl08380dto
     *            the rl08380dto
     * @param executantType
     *            the executant type
     */
    // void verifyRlde8310(final Rl08380DTO rl08380dto, final ExecutantType
    // executantType);

    /**
     * 製作年終靜態統計作業
     * 
     * @param rl08380dto
     *            the rl08380dto
     * @param executantType
     *            the executant type
     * @return the string
     */
    @RisServiceMethod(MethodType.PRINT2SYS)
    void doPrint(final Rl08380DTO rl08380dto, final ExecutantType executantType);

    /**
     * 取得並下載年終靜態統計作業
     * 
     * @param rl08380dto
     *            the rl08380dto
     * @param executantType
     *            the executant type
     * @return the string
     */
    @RisServiceMethod(MethodType.DOWNLOAD)
    void doDownload(final Rl08380DTO rl08380dto, final ExecutantType executantType);

    /**
     * 預覽列印年終靜態統計作業
     * 
     * @param rl08380dto
     *            the rl08380dto
     * @param executantType
     *            the executant type
     * @return the string
     */
    @RisServiceMethod(MethodType.PRINT2SYS)
    void doPreview(final Rl08380DTO rl08380dto, final ExecutantType executantType);

    /**
     * Do send notice.
     * 
     * @param rl08380dto
     *            the rl08380dto
     * @param executantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.NOTICE)
    void doSendNotice(final Rl08380DTO rl08380dto, final ExecutantType executantType);
}
