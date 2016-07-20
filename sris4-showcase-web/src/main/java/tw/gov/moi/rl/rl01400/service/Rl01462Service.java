/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl01400.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl01462DTO;

/**
 * 逕遷戶政事務所人口通報服務介面.
 * 
 * @author JL
 */
public interface Rl01462Service {

    /** The Constant MSG1. */
    String MSG1 = "查詢逕遷戶政事務所人口通報";

    /** The Constant MSG2. */
    String MSG2 = "儲存並發送逕遷戶政事務所人口通報";

    String DS_NAME_1 = "rl01462.getRldf045m";

    /**
     * Do init.
     * 
     * @param dto
     *            the dto
     * @param info
     *            the info
     * @throws RisBusinessException
     *             the ris business exception
     */
    // void doInit(final Rl01462DTO dto, final ExecutantType info) throws
    // RisBusinessException;

    /**
     * 查詢逕遷戶政事務所人口通報.
     * 
     * @param dto
     *            輸入的查詢條件
     * @param info
     *            使用者資訊
     * @throws RisBusinessException
     *             「執行作業失敗(TX-6397-E)+extMessage=查詢逕遷戶政事務所人口通報」失敗
     */
    @RisServiceMethod(value = MethodType.QUERY)
    void doQuery(final Rl01462DTO dto, final ExecutantType info) throws RisBusinessException;

    /**
     * 儲存並發送逕遷戶政事務所人口通報.
     * 
     * @param dto
     *            輸入的查詢條件
     * @param info
     *            使用者資訊
     * @throws RisBusinessException
     *             「執行作業失敗(TX-6397-E)+extMessage=儲存並發送逕遷戶政事務所人口通報」失敗
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    void doSave(final Rl01462DTO dto, final ExecutantType info) throws RisBusinessException;

}
