/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl05400.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl05400DTO;

public interface Rl05400Service {

    /**
     * 初始化
     * 
     * @param Rl05400DTO
     * @param ExecutantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doInit(final Rl05400DTO rl05400dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 發送通報
     * 
     * @param Rl05400DTO
     * @param ExecutantType
     * @return
     * @throws RisBusinessException
     */
    @WorkStatus(FinalType.FINAL)
    @RisServiceMethod(MethodType.SAVE)
    public void doSend(final Rl05400DTO rl05400DTO, final ExecutantType executantType) throws RisBusinessException;

}
