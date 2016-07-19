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
import tw.gov.moi.rl.domain.Rl08271DTO;

/**
 * 製作出生動態統計申請書資料清冊處理服務介面.
 * 
 * @author Weiren.Jheng
 */
public interface Rl08271Service {

    /** The Constant REPORT_NAME. */
    public final String REPORT_NAME = "RLRP08271";

    /**
     * 製作出生動態統計申請書資料清冊.
     * 
     * @param rl08271dto
     *            輸入的查詢條件
     * @param executantType
     *            使用者資訊
     * @return 報表檔案URL
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.BATCH)
    @WorkStatus(FinalType.FINAL)
    public Rl08271DTO doPrint(final Rl08271DTO rl08271dto, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 取得並下載出生動態統計申請書資料清冊.
     * 
     * @param rl08271dto
     *            輸入的查詢條件
     * @param executantType
     *            使用者資訊
     * @return 下載檔案URL
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.DOWNLOAD)
    public Rl08271DTO doDownload(final Rl08271DTO rl08271dto, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 預覽出生動態統計申請書資料清冊
     * 
     * @param rl08271dto
     *            輸入的查詢條件
     * @param executantType
     *            使用者資訊
     * @return 檔案URL
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl08271DTO doPreview(final Rl08271DTO rl08271dto, final ExecutantType executantType)
            throws RisBusinessException;
}
