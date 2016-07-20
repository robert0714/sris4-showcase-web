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
import tw.gov.moi.rl.domain.Rl01465DTO;

/**
 * The Interface Rl01465Service.
 */
public interface Rl01465Service {

    // final static String WK_PROCESS_SEQ_NO = "1";

    // final static String NOTICE_TYPE_C411 = "C411";

    final static String DS_NAME_1 = "rl01465.getRldf004m";

    final static String DS_NAME_2 = "rl01465.getRldf045m";

    @RisServiceMethod(MethodType.QUERY)
    public void doInit(final Rl01465DTO rl01465DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 查詢未逕遷戶政事務所人口通報.
     * 
     * @param rl01465DTO
     *            the rl01465 dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doQuery(final Rl01465DTO rl01465DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 儲存並發送逕遷戶政事務所人口通報.
     * 
     * @param rl01465DTO
     *            the rl01465 dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void doSave(final Rl01465DTO rl01465DTO, final ExecutantType executantType) throws RisBusinessException;

}
