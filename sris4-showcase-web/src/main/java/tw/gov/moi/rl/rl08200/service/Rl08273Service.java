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
import tw.gov.moi.rl.domain.Rl08273DTO;

/**
 * 製作結婚動態統計申請書資料清冊處理服務介面.
 * 
 * @author Weiren.Jheng
 */
public interface Rl08273Service {

    /** 報表名稱. */
    public final String REPORT_NAME = "RLRP08273";

    /**
     * 製作結婚動態統計申請書資料清冊.
     * 
     * @param rl08273dto
     *            the rl08273dto
     * @param executantType
     *            the executant type
     * @return the string
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.BATCH)
    @WorkStatus(FinalType.FINAL)
    public Rl08273DTO doPrint(final Rl08273DTO rl08273dto, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 取得並下載結婚動態統計申請書資料清冊.
     * 
     * @param rl08273dto
     *            the rl08273dto
     * @param executantType
     *            the executant type
     * @return the string
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.DOWNLOAD)
    public Rl08273DTO doDownload(final Rl08273DTO rl08273dto, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 預覽結婚動態統計申請書資料清冊.
     * 
     * @param rl08273dto
     *            the rl08273dto
     * @param executantType
     *            the executant type
     * @return the string
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl08273DTO doPreview(final Rl08273DTO rl08273dto, final ExecutantType executantType)
            throws RisBusinessException;
}
