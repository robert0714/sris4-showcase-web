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
import tw.gov.moi.rl.domain.Rl052b1DTO;

/**
 * 列印死亡通報明細表服務介面.
 * 
 * @author Derek Wang
 * 
 */
public interface Rl052b1Service {

    String COUNT_SQL = "select sum(cnt) from( select count(1) cnt from rldf053m where site_id= ? and print_mark=' ' union all select count(1) cnt from rldf061m where site_id= ? and print_mark=' ' union all select count(1) cnt from rldf062m where site_id= ? and print_mark=' ' union all select count(1) cnt from rldf063m where site_id= ? and print_mark=' ' );";

    /**
     * Do print.
     * 
     * @param rl052b1DTO
     *            the rl052b1 dto
     * @param executantType
     *            the executant type
     * @return the string
     * @throws RisBusinessException
     *             the ris business exception
     */
    @WorkStatus(FinalType.FINAL)
    @RisServiceMethod(MethodType.PRINT2SYS)
    public void doPrint(final Rl052b1DTO rl052b1DTO, final ExecutantType executantType) throws RisBusinessException;

}
