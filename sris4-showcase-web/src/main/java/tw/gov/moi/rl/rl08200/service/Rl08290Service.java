/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl08200.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08290DTO;

/**
 * 製作原住民動態處理服務介面
 * 
 * @author philip
 */
public interface Rl08290Service {

    /** 原住民出生動態統計表（1） */
    public final static String RLRP08291 = "RLRP08291";

    /** 原住民出生動態統計表（2） */
    public final static String RLRP08292 = "RLRP08292";

    /** 原住民出生動態統計表（3） */
    public final static String RLRP08293 = "RLRP08293";

    /** 原住民結婚動態統計表（1） */
    public final static String RLRP08294 = "RLRP08294";

    /** 原住民其他動態統計表（1） */
    public final static String RLRP08295 = "RLRP08295";

    /** 原住民其他動態統計表（2） */
    public final static String RLRP08296 = "RLRP08296";

    /** 原住民其他動態統計表（3） */
    public final static String RLRP08297 = "RLRP08297";

    /** 原住民死亡動態統計表（1） */
    public final static String RLRP08298 = "RLRP08298";

    /** 原住民出生動態統計表（4） */
    public final static String RLRP08299 = "RLRP08299";

    /**
     * 製作原住民動態統計表
     * 
     * @param pRl08290DTO
     *            the rl08290 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.BATCH)
    @WorkStatus(FinalType.FINAL)
    void doPrint(final Rl08290DTO pRl08290DTO, final ExecutantType pExecutantType);

    /**
     * 預覽列印原住民動態統計表
     * 
     * @param rl08290DTO
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    @WorkStatus(FinalType.FINAL)
    public void doPreview(final Rl08290DTO rl08290DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得並下載原住民動態統計表
     * 
     * @param pRl08290DTO
     *            the rl08290 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.DOWNLOAD)
    @WorkStatus(FinalType.FINAL)
    void doDownload(final Rl08290DTO pRl08290DTO, final ExecutantType pExecutantType);
}
