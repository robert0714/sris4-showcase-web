/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl08900.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.filesystem.RisFile;
import tw.gov.moi.rl.domain.Rl08950DTO;

/**
 * 製作所內記事資料清冊服務介面.
 * 
 * @author DAXIONG
 * 
 */
public interface Rl08950Service {

    /**
     * 檔案下載.
     * 
     * @param dto
     *            所內記事資料清冊數據傳輸對象
     * @param executantType
     *            使用者資訊
     */
    @WorkStatus(FinalType.FINAL)
    @RisServiceMethod(MethodType.PRINT2TERM)
    void doDownload(final Rl08950DTO dto, final ExecutantType executantType);

    /**
     * 列印清冊.
     * 
     * @param dto
     *            所內記事資料清冊數據傳輸對象
     * @param executantType
     *            使用者資訊
     * @return 所內記事資料清冊製表物件
     */
    @WorkStatus(FinalType.FINAL)
    @RisServiceMethod(MethodType.PRINT2SYS)
    RisFile doPrint(final Rl08950DTO dto, final ExecutantType executantType);

    /**
     * 初始化.
     * 
     * @param dto
     *            所內記事資料清冊數據傳輸對象
     * @param executantType
     *            使用者資訊
     */
    @WorkStatus(FinalType.FINAL)
    @RisServiceMethod(MethodType.START)
    void init(final Rl08950DTO dto, final ExecutantType executantType);
}
