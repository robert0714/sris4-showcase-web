/*
 * Copyright (c) 2010-2020 IISI. All rights reserved.
 * 
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl05200.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl052b6DTO;

/**
 * 通報已辦理死亡登記逾期未接收死亡通報資料服務介面 Interface Rl052b6Service.
 * 
 * @author kenfc
 */

public interface Rl052b6Service {

    /**
     * 查詢已辦理死亡登記逾期未接收死亡通報
     * 
     * @param Rl052b6DTO
     * 
     * @return Rl052b6DTO
     * 
     * @throws RisBusinessException
     *             「執行作業失敗(TX-6397-E)+extMessage=查詢已辦理死亡登記逾期未接收死亡通報」失敗
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl052b6DTO doQuery(Rl052b6DTO rl052b6DTO, ExecutantType executantType) throws RisBusinessException;

    /**
     * 儲存並發送通報已辦理死亡登記逾期未接收死亡通報資料
     * 
     * @param Rl052b6DTO
     * 
     * @return Rl052b6DTO
     * 
     * @throws RisBusinessException
     *             「執行作業失敗(TX-6397-E)+extMessage=儲存並通報已辦理死亡登記逾期未接收死亡通報資料」失敗
     */
    @WorkStatus(FinalType.FINAL)
    @RisServiceMethod(MethodType.SAVE)
    public void doSave(Rl052b6DTO rl052b6DTO, ExecutantType executantType) throws RisBusinessException;
}
