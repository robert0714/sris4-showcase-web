/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl0a100.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl0a100DTO;


/**
 * 規費報表處理服務介面
 * 
 * @author neo
 */
public interface Rl0a100Service {

    /**
     * 初始化規費收據處理
     * 
     * Inits the operation dto.
     * 
     * @param rl0a100DTO
     *            the rl0a100 dto
     * @param executantType
     *            the executant type
     * @return the rl0a100 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    public Rl0a100DTO initOperationDTO(Rl0a100DTO rl0a100DTO, ExecutantType executantType) throws RisBusinessException;

    @RisServiceMethod(MethodType.PRINT2TERM)
    public void doPrint(final Rl0a100DTO dto,
			final ExecutantType pExecutantType);
    @RisServiceMethod(MethodType.PRINT2TERM)
    public void doDownload(final Rl0a100DTO dto,
			final ExecutantType pExecutantType);

    void feeComponentInit(Rl0a100DTO dto, ExecutantType executantType) throws RisBusinessException;
}
