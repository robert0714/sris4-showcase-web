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
import tw.gov.moi.rl.domain.Rl052b2DTO;

/**
 * 列印死亡／相驗屍體證明書清冊服務介面.
 * 
 * @author Derek Wang
 * 
 */
public interface Rl052b2Service {

    final static String COUNT_RLDF061M = "cnt61m";
    final static String COUNT_RLDF062M = "cnt62m";
    final static String COUNT_RLDF063M = "cnt63m";
    final static String COUNT_RLDF053M = "cnt53m";

    final static String COUNT_RLDF061M_SQL = "select count(1) from rldf061m where site_id= ? and rc_process_yyymmdd >= ? and rc_process_yyymmdd <= ? ";
    final static String COUNT_RLDF062M_SQL = "select count(1) from rldf062m where site_id= ? and rc_process_yyymmdd >= ? and rc_process_yyymmdd <= ? ";
    final static String COUNT_RLDF063M_SQL = "select count(1) from rldf063m where site_id= ? and rc_process_yyymmdd >= ? and rc_process_yyymmdd <= ? ";
    final static String COUNT_RLDF053M_SQL = "select count(1) from rldf053m where site_id= ? and rc_process_yyymmdd >= ? and rc_process_yyymmdd <= ? ";

    final static String GET_RLDF061M = "select * from rldf061m where site_id=? and rc_process_yyymmdd >=? and rc_process_yyymmdd <=? and print_mark <> 'Y'";

    final static String GET_RLDF062M = "select * from rldf062m where site_id=? and rc_process_yyymmdd >=? and rc_process_yyymmdd <=? and print_mark <> 'Y'";

    final static String GET_RLDF063M = "select * from rldf063m where site_id=? and rc_process_yyymmdd >=? and rc_process_yyymmdd <=? and print_mark <> 'Y'";

    final static String GET_RLDF053M = "select * from rldf053m where site_id=? and rc_process_yyymmdd >=? and rc_process_yyymmdd <=? and print_mark <> 'Y'";

    final static String GET_RLDF064M = "select * from rldf064m where site_id = ? and person_id = ? ";

    /**
     * Do print.
     * 
     * @param rl052b2DTO
     *            the rl052b2 dto
     * @param executantType
     *            the executant type
     * @return the string
     * @throws RisBusinessException
     *             the ris business exception
     */
    @WorkStatus(FinalType.FINAL)
    @RisServiceMethod(MethodType.PRINT2SYS)
    public void doPrint(final Rl052b2DTO rl052b2DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * Do download.
     * 
     * @param rl052b2DTO
     *            the rl052b2 dto
     * @param executantType
     *            the executant type
     * @return the string
     */
    @WorkStatus(FinalType.FINAL)
    @RisServiceMethod(MethodType.DOWNLOAD)
    public void doDownload(final Rl052b2DTO rl052b2DTO, final ExecutantType executantType);
}
