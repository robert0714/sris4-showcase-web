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
import tw.gov.moi.rl.domain.Rl052e1DTO;

public interface Rl052e1Service {

    public final static String QUERY_RLDF008M = "select * from rldf008m where person_id = ? and site_id = ? ";

    public final static String QUERY_RLDF011M = "select * from rldf011m where person_id = ? and site_id = ? ";

    /**
     * 入出矯正機關人口通報處理及製表.
     * 
     * @param rl052e1DTO
     *            the rl052e1 dto
     * @param executantType
     *            the executant type
     */
    @WorkStatus(FinalType.FINAL)
    @RisServiceMethod(MethodType.PRINT2SYS)
    void doPrint(final Rl052e1DTO rl052e1DTO, final ExecutantType executantType);
}
