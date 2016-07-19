/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl08900.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08922DTO;

/**
 * 列印核准原住民族回復傳統（漢人）姓名及並列羅馬拼音登記人數統計表處理服務介面.
 * 
 * @author Alan Lo
 */
public interface Rl08922Service {

    /** 報表名稱. */
    final String REPORT_NAME = "RLRP08922";

    /** The SQL. */
    final String SQL = "SELECT * FROM RSDFZ199 WHERE ACCEPT_SITE_ID = ? AND STATISTIC_YYYMM = ? ";

    /** The STATISTIC_YYYMM_FORMAT. */
    final String STATISTIC_YYYMM_FORMAT = "%s%s";

    /** 列印總表. */
    final String TOTAL = "Y";

    /** 通報類別. */
    final String NOTICE_TYPE = "Z199";

    /**
     * 列印核准原住民族回復傳統（漢人）姓名及並列羅馬拼音登記人數統計表.
     * 
     * @param rl08922DTO
     *            ,executantType
     * @param executantType
     *            the executant type
     * @return the string
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.PRINT2SYS)
    @WorkStatus(FinalType.FINAL)
    public void doPrint(final Rl08922DTO rl08922DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得並下載核准原住民族回復傳統（漢人）姓名及並列羅馬拼音登記人數統計表.
     * 
     * @param rl08922DTO
     *            ,executantType
     * @param executantType
     *            the executant type
     * @return the string
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.DOWNLOAD)
    @WorkStatus(FinalType.FINAL)
    public void doDownload(final Rl08922DTO rl08922DTO, final ExecutantType executantType) throws RisBusinessException;

}
