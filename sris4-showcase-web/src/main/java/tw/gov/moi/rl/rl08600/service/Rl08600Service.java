/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl08600.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08600DTO;

/**
 * 特殊註記名冊及統計表服務介面.
 * 
 * @author Jay Kan
 */
public interface Rl08600Service {

    /** 造冊 */
    String RLRP08610 = "RLRP08610";

    /** 統計 */
    String RLRP08620 = "RLRP08620";

    /**
     * 特殊註記名冊及統計表.
     * 
     * @param pRl08600DTO
     *            the rl08600 dto
     * @param pExecutantType
     *            the executant type
     * @return the string
     */
    @RisServiceMethod(MethodType.PRINT2SYS)
    @WorkStatus(FinalType.FINAL)
    void doPrint(final Rl08600DTO pRl08600DTO, final ExecutantType pExecutantType);

    /**
     * 下載特殊註記名冊及統計表.
     * 
     * @param pRl08600DTO
     *            the rl08600 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.DOWNLOAD)
    @WorkStatus(FinalType.FINAL)
    void doDownload(final Rl08600DTO pRl08600DTO, final ExecutantType pExecutantType);

    /**
     * 檢查個人基本資料
     * 
     * @param dto
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.VERIFY)
    public void validateCurrent(final Rl08600DTO pRl08600DTO, final ExecutantType executantType)
            throws RisBusinessException;
}
