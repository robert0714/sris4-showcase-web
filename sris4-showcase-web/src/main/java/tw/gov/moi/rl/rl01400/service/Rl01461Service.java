/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl01400.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl01461DTO;

/**
 * 新增逕遷戶政事務所人口通報服務介面Service Interface
 * 
 * @author Ahhong
 */
public interface Rl01461Service {

    /**
     * 新增逕遷戶政事務所人口通報
     * 
     * @param rl01461DTO
     * @param executantType
     * @throws RisBusinessException
     */
    public void doAdd(Rl01461DTO rl01461DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 儲存並發送逕遷戶政事務所人口通報
     * 
     * @param rl01461DTO
     * @param exec
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void doSave(Rl01461DTO rl01461DTO, ExecutantType executantType) throws RisBusinessException;
}