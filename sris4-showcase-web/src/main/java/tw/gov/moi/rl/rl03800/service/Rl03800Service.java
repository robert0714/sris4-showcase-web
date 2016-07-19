/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl03800.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl03800DTO;

/**
 * 鄉鎮市區影像主機歷史影像查詢服務介面.
 * 
 * @author Viva-Hong
 */
public interface Rl03800Service {

    /**
     * 查影像主機歷史影像.
     * 
     * @param dto
     *            、exec
     * @param exec
     *            the exec
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(value = MethodType.QUERY)
    @WorkStatus(FinalType.FINAL)
    public void queryImages(final Rl03800DTO dto, final ExecutantType exec) throws RisBusinessException;
}
