/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl05200.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl052b3DTO;

/**
 * 列印死亡／相驗屍體證明書服務介面.
 * 
 * @author Derek Wang
 * 
 */
public interface Rl052b3Service {

    final static String COUNT_RLDF053M_SQL = "select count(1) from rldf053m where site_id= ? and death_notice_no = ? ";
    final static String COUNT_RLDF062M_SQL = "select count(1) from rldf062m where site_id= ? and notice_no = ? ";
    final static String COUNT_RLDF063M_SQL = "select count(1) from rldf063m where site_id= ? and notice_no = ? ";
    final static String REPORT_RLRP052BB = "RLRP052BB";
    final static String REPORT_RLRP052BA = "RLRP052BA";
    final static String REPORT_RLRP052B3 = "RLRP052B3";

    /**
     * Do print.
     * 
     * @param rl052b3DTO
     *            the rl052b3 dto
     * @param executantType
     *            the executant type
     * @return the string
     * @throws RisBusinessException
     *             the ris business exception
     */
    @WorkStatus(FinalType.FINAL)
    @RisServiceMethod(MethodType.PRINT2TERM)
    public void doPrint(final Rl052b3DTO rl052b3DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * Do download.
     * 
     * @param rl052b3DTO
     *            the rl052b3 dto
     * @param executantType
     *            the executant type
     * @return the string
     */
    @WorkStatus(FinalType.FINAL)
    @RisServiceMethod(MethodType.DOWNLOAD)
    public void doDownload(final Rl052b3DTO rl052b3DTO, final ExecutantType executantType);

}
