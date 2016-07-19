/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl01b00.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.rl.domain.Rl01b10DTO;

/**
 * 保護家庭暴力資料註記登錄處理服務介面.
 * 
 * @author Jay Kan
 */
public interface Rl01b10Service {

    /** 登錄保護家庭暴力資料 */
    String EXT_MESSAGE = "登錄保護家庭暴力資料";

    /** 被保護人 */
    String VICTIM = "被保護人";

    /** 相對人 */
    String VIOLATOR = "相對人";

    /** 申請人 */
    String APPLY = "申請人";

    /** 受委託人 */
    String COMM = "受委託人";

    /** 個人資料 */
    String PERSON_DATA = "個人資料";

    /** 全戶資料 */
    String HOUSEHOLD_DATA = "全戶資料";

    /** RCDF001M */
    String RCDF001M = "RCDF001M";

    /** RLDF004M */
    String RLDF004M = "RLDF004M";

    /** VIOLENCE_MARK */
    String VIOLENCE_MARK = "VIOLENCE_MARK";

    /** VP */
    String VP = "VP";

    /** PERSON_ID */
    String PERSON_ID = "PERSON_ID";

    /** PERSON_ID=? */
    String PERSON_ID_CON = PERSON_ID + "=?" + " and site_id = ?";

    /** 禁止相對人請領被害人/受被害人暫時監護未成年子女戶籍謄本或閱覽戶籍登記資料 */
    String PROTECT_NOTES = "禁止相對人請領被害人/受被害人暫時監護未成年子女戶籍謄本或閱覽戶籍登記資料";

    /** RLRP01B10 */
    String REPORT_NAME = "RLRP01B10";

    final String APPLY_CODE = "0Z2";

    final String ERROR_MSG_1 = "儲存保護家庭暴力資料註記申請書資料暫存檔失敗";

    /**
     * 驗證查詢保護家庭暴力資料.
     * 
     * @param pRl01b10DTO
     *            the rl01b10 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.VERIFY)
    void doVerify(final Rl01b10DTO pRl01b10DTO, final ExecutantType pExecutantType);

    /**
     * 暫存保護家庭暴力資料.
     * 
     * @param pRl01b10DTO
     *            the rl01b10 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    void doSaveTemp(final Rl01b10DTO pRl01b10DTO, final ExecutantType pExecutantType);

    /**
     * 登錄保護家庭暴力資料.
     * 
     * @param pRl01b10DTO
     *            the rl01b10 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    void doSave(final Rl01b10DTO pRl01b10DTO, final ExecutantType pExecutantType);

    /**
     * 列印保護家庭暴力申請書.
     * 
     * @param pRl01b10DTO
     *            the rl01b10 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    public void doPrint(final Rl01b10DTO pRl01b10DTO, final ExecutantType pExecutantType);
}
