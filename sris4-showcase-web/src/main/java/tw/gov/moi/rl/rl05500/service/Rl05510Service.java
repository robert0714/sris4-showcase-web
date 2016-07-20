/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl05500.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl05510DTO;

/**
 * 國民身分證請領記錄重送中央服務介面Service Interface
 * 
 * @author Ahhong
 */
public interface Rl05510Service {

    /**
     * 請領紀錄查詢處理
     * 
     * @param rl05510DTO
     * @param executantType
     * @throws RisBusinessException
     */
    public void doQuery(Rl05510DTO rl05510DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 請領紀錄通報處理
     * 
     * @param rl05510DTO
     * @param executantType
     * @throws RisBusinessException
     */
    public void sendNotice(Rl05510DTO rl05510DTO, ExecutantType executantType) throws RisBusinessException;

}