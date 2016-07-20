/*
 * Copyright (c) 2010-2020 IISI. All rights reserved.
 * 
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl08100.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08172DTO;

/**
 * 戶政受理案件統計表處理服務介面.
 * 
 * @author Derek Wang
 */
public interface Rl08172Service {

    /**
     * 列印戶政受理案件統計表.
     * 
     * @param rl08172DTO
     *            the rl08172 dto
     * @param executantType
     *            the executant type
     * @return the string
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    @WorkStatus(FinalType.FINAL)
    public void doPrint(final Rl08172DTO rl08172DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得並下載戶政受理案件統計表.
     * 
     * @param rl08172DTO
     *            the rl08172 dto
     * @param executantType
     *            the executant type
     * @return the string
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    @WorkStatus(FinalType.FINAL)
    public void doDownload(final Rl08172DTO rl08172DTO, final ExecutantType executantType);

    void doCheating2(Rl08172DTO dto, ExecutantType executantType) throws RisBusinessException;
}
