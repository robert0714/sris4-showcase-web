/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl08100.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl08181DTO;

/**
 * 戶政管理服務案件統計表設定處理服務介面 Rl08181Service.
 * 
 * @author Derek Wang
 */
public interface Rl08181Service {

    /**
     * 查詢戶政管理服務案件統計表設定.
     * 
     * @param rl08181dto
     *            the rl08181dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    public void query(Rl08181DTO rl08181dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 儲存戶政管理服務案件統計表設定.
     * 
     * @param rl08181dto
     *            the rl08181dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    public void saveData(Rl08181DTO rl08181dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * 修改戶政管理服務案件統計表設定.
     * 
     * @param rl08181dto
     *            the rl08181dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    public void modify(Rl08181DTO rl08181dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * Do print.
     * 
     * @param rl08181dto
     *            the rl08181dto
     * @param executantType
     *            the executant type
     * @return the string
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    public void doPrint(Rl08181DTO rl08181dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * Do download.
     * 
     * @param rl08181dto
     *            the rl08181dto
     * @param executantType
     *            the executant type
     * @return the string
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    public void doDownload(Rl08181DTO rl08181dto, ExecutantType executantType) throws RisBusinessException;

    /**
     * Do send notice.
     * 
     * @param rl08181dto
     *            the rl08181dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    @WorkStatus(FinalType.FINAL)
    public void doSendNotice(Rl08181DTO rl08181dto, ExecutantType executantType) throws RisBusinessException;

}
