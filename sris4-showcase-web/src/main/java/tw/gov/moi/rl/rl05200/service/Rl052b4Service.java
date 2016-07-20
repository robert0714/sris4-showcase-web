/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
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
import tw.gov.moi.rl.domain.Rl052b4DTO;

/**
 * 列印已接收死亡通報未辦理死亡登記清冊服務介面.
 * 
 * @author Derek Wang
 * 
 */
public interface Rl052b4Service {
    String COUNT_RLDF064M_SQL = "select count(1) from rldf064m where site_id= ? and notice_yyymmdd >= ? and notice_yyymmdd <= ? and reg_yyymmdd='       ' ";
    String REPORT_NAME = "RLRP052B4";

    /**
     * Do print.
     * 
     * @param rl052b4DTO
     *            the rl052b4 dto
     * @param executantType
     *            the executant type
     * @return the string
     * @throws RisBusinessException
     *             the ris business exception
     */
    @WorkStatus(FinalType.FINAL)
    @RisServiceMethod(MethodType.PRINT2SYS)
    public void doPrint(final Rl052b4DTO rl052b4DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * Do download.
     * 
     * @param rl052b4DTO
     *            the rl052b4 dto
     * @param executantType
     *            the executant type
     * @return the string
     */
    @WorkStatus(FinalType.FINAL)
    @RisServiceMethod(MethodType.DOWNLOAD)
    public void doDownload(final Rl052b4DTO rl052b4DTO, final ExecutantType executantType);
}
