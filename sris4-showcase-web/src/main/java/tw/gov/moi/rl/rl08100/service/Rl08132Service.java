/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl08100.service;

import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08132DTO;

/**
 * 介面
 * 
 * @author weiren.jheng
 */
public interface Rl08132Service {

    public final String ALL_REPORT = "All";

    public final String RLRP08120 = "RLRP08120";
    public final String RLRP08126 = "RLRP08126";
    public final String RLRP08124 = "RLRP08124";
    public final String RLRP08129 = "RLRP08129";
    public final String RLRP0812A = "RLRP0812A";
    public final String RLRP0812B = "RLRP0812B";
    public final String RLRP0812D = "RLRP0812D";
    public final String RLRP0812E = "RLRP0812E";
    public final String RLRP0812G = "RLRP0812G";
    public final String RLRP0812I = "RLRP0812I";

    public final String RLRP08122 = "RLRP08122";
    public final String RLRP08123 = "RLRP08123";
    public final String RLRP08125 = "RLRP08125";
    public final String RLRP0812C = "RLRP0812C";

    /**
     * 列印戶籍人口統計月報表1
     * 
     * @param rl08132DTO
     *            輸入的查詢條件
     * @param executantType
     *            使用者資訊
     * @return 報表檔案URL
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.BATCH)
    public void doPrint(final Rl08132DTO rl08132DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得並下載戶籍人口統計月報表1
     * 
     * @param rl08132DTO
     *            輸入的查詢條件
     * @param executantType
     *            使用者資訊
     * @return 下載檔案URL
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.DOWNLOAD)
    public void doDownload(final Rl08132DTO rl08132DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 預覽列印報表
     * 
     * @param rl08132dto
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    void doPreview(final Rl08132DTO rl08132dto, final ExecutantType executantType) throws RisBusinessException;

    void doSendNotice(Rl08132DTO dto, ExecutantType executantType) throws RisBusinessException;
}