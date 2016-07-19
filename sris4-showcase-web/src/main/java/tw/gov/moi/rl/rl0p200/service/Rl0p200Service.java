/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl0p200.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl0p200DTO;

/**
 * 護照親辦人別確認資料查詢處理服務介面.
 * 
 * @author Jack Liao
 */
public interface Rl0p200Service {

    /** The DS_NAME. */
    String DS_NAME = "rl0p200.getRldfp100";

    /** The REPORT_NAME. */
    String REPORT_NAME = "RLRP0P200";

    /** The INSERT_REMINDER_ERROR. */
    String INSERT_REMINDER_ERROR = "執行「發送通知訊息給主管簽核另存電子檔申請作業」服務失敗";

    /**
     * Verify data.
     * 
     * @param rl0p200DTO
     *            the rl0p200 dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.VERIFY)
    @WorkStatus(FinalType.FINAL)
    void verifyData(final Rl0p200DTO rl0p200DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * Do download.
     * 
     * @param rl0p200DTO
     *            the rl0p200 dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.SEND)
    @WorkStatus(FinalType.FINAL)
    void doDownload(final Rl0p200DTO rl0p200DTO, final ExecutantType executantType) throws RisBusinessException;

}
