/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl08200.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08274DTO;

/**
 * 製作離婚動態統計申請書資料清冊處理服務介面.
 * 
 * @author Weiren.Jheng
 */
public interface Rl08274Service {

    public final String REPORT_NAME = "RLRP08274";

    /**
     * 製作離婚動態統計申請書資料清冊.
     * 
     * @param rl08274dto
     *            the rl08274dto
     * @param executantType
     *            the executant type
     * @return the string
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.BATCH)
    @WorkStatus(FinalType.FINAL)
    public Rl08274DTO doPrint(final Rl08274DTO rl08274dto, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 取得並下載離婚動態統計申請書資料清冊.
     * 
     * @param rl08274dto
     *            the rl08274dto
     * @param executantType
     *            the executant type
     * @return the string
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.DOWNLOAD)
    public Rl08274DTO doDownload(final Rl08274DTO rl08274dto, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 預覽離婚動態統計申請書資料清冊.
     * 
     * @param rl08274dto
     *            the rl08274dto
     * @param executantType
     *            the executant type
     * @return the string
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl08274DTO doPreview(final Rl08274DTO rl08274dto, final ExecutantType executantType)
            throws RisBusinessException;
}
