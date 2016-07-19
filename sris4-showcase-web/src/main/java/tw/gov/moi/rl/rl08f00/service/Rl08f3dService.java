/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl08f00.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08f3dDTO;

/**
 * 選舉造冊封面列印服務介面.
 * 
 * @author Weiren.Jheng
 */
public interface Rl08f3dService {

    /** The report name. */
    public String REPORT_NAME = "RLRP08F3D";

    /**
     * 初始化頁面選項
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doInitPage(final Rl08f3dDTO dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 送出.
     * 
     * @param rl08f3ddto
     *            輸入的查詢條件
     * @param executantType
     *            使用者資訊
     * @return 報表檔案URL
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.PRINT2SYS)
    @WorkStatus(FinalType.FINAL)
    public Rl08f3dDTO doPrint(final Rl08f3dDTO rl08f3ddto, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 另存電子檔.
     * 
     * @param rl08f3ddto
     *            輸入的查詢條件
     * @param executantType
     *            使用者資訊
     * @return 下載檔案URL
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.DOWNLOAD)
    @WorkStatus(FinalType.FINAL)
    public void doDownload(final Rl08f3dDTO rl08f3ddto, final ExecutantType executantType) throws RisBusinessException;

}
