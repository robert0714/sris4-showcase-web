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
import tw.gov.moi.rl.domain.Rl01464DTO;

/**
 * The Interface Rl01464Service.
 */
public interface Rl01464Service {

    String QUERY_XLDF1464 = "select * from XLDF1464 where transaction_id = ?";

    /**
     * 做初始化.
     * 
     * @param rl01464dto
     *            the rl01464dto
     * @param executantType
     *            the executant type
     * @return the xldf1464
     */
    @RisServiceMethod(MethodType.QUERY)
    void getXldf1464(final Rl01464DTO rl01464dto, final ExecutantType executantType);

    /**
     * Gets the xldf1464 by transaction id.
     * 
     * @param rl01464dto
     *            the rl01464dto
     * @param executantType
     *            the executant type
     * @return the xldf1464 by transaction id
     */
    @RisServiceMethod(MethodType.QUERY)
    void getXldf1464ByTransactionId(final Rl01464DTO rl01464dto, final ExecutantType executantType);

    /**
     * 查詢逕遷戶政事務所人口通報.
     * 
     * @param rl01464dto
     *            the rl01464dto
     * @param executantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.QUERY)
    void doQuery(final Rl01464DTO rl01464dto, final ExecutantType executantType);

    /**
     * 儲存並發送逕遷戶政事務所人口通報.
     * 
     * @param rl01464dto
     *            the rl01464dto
     * @param executantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    void doSave(final Rl01464DTO rl01464dto, final ExecutantType executantType);
}
