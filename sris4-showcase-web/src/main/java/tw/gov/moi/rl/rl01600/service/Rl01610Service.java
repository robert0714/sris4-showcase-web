/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl01600.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.domain.Rl01610DTO;

/**
 * 門牌編釘申請書儲存列印服務介面.
 * 
 * @author Jay Kan
 */
public interface Rl01610Service {

    String SAVE_XLDFU003 = "暫存「臨時規費明細檔」失敗";

    /** 請輸入其他之附繳證件 */
    String OTHER_CERTIFICATE_EMPTY_MSG = "請輸入其他之附繳證件";

    /** 報表名稱. */
    String REPORT_NAME = "RLRPR0000";

    /** 門牌編釘登記附繳證件 */
    String CERTIFICATE_RSCD = "RSCD3571";

    /** 門牌編釘申請書代碼 */
    String APPLY_KIND_RSCD = RlConstant.RSCD3062;

    /** 門牌編釘申請人身分代碼 */
    String APPLY_ROLE_RSCD = RlConstant.RSCD3063;

    /** 其他附繳證件代碼 */
    String OTHER_CERTIFICATE_CODE = "12";

    String SELECT_RLDFU001_SQL = "select * from rldfu001 where site_id = ? and category = ?";

    String FEE_CATEGORY = "01610";

    /**
     * Inits the operation dto.
     * 
     * @param pRl01610DTO
     *            the rl01610 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.QUERY)
    void initOperationDTO(final Rl01610DTO pRl01610DTO, final ExecutantType pExecutantType);

    /**
     * 驗證門牌編釘申請書.
     * 
     * @param pRl01610DTO
     *            the rl01610 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.VERIFY)
    void verifyAppData(final Rl01610DTO pRl01610DTO, final ExecutantType pExecutantType);

    /**
     * 列印規費收據.
     * 
     * @param pRl01610DTO
     *            the rl01610 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    void printReceipt(final Rl01610DTO pRl01610DTO, final ExecutantType pExecutantType);

    /**
     * 列印門牌編釘申請書.
     * 
     * @param pRl01610DTO
     *            the rl01610 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.PRINT2SYS)
    void doPrint(final Rl01610DTO pRl01610DTO, final ExecutantType pExecutantType);

    /**
     * Prepare print data.
     * 
     * @param pRl01610DTO
     *            the rl01610 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    void preparePrintData(final Rl01610DTO pRl01610DTO, final ExecutantType pExecutantType);

    /**
     * 儲存門牌編釘申請書.
     * 
     * @param pRl01610DTO
     *            the rl01610 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    void doSave(final Rl01610DTO pRl01610DTO, final ExecutantType pExecutantType);

    /**
     * 取得申請人資料.
     * 
     * @param pRl01610DTO
     *            the rl01610 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.QUERY)
    void queryApplyData(final Rl01610DTO pRl01610DTO, final ExecutantType pExecutantType);

    /**
     * 取得受委託人資料.
     * 
     * @param pRl01610DTO
     *            the rl01610 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.QUERY)
    void queryCommData(final Rl01610DTO pRl01610DTO, final ExecutantType pExecutantType);
}
