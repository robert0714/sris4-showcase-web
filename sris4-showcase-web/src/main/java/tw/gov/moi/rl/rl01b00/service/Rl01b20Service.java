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
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl01b20DTO;

/**
 * 保護家庭暴力資料註記到期處理服務介面.
 * 
 * @author Jay Kan
 */
public interface Rl01b20Service {

    /** VP */
    String VP = "VP";

    /** RCDF001M */
    String RCDF001M = "RCDF001M";

    /** RLDF004M */
    String RLDF004M = "RLDF004M";

    /** RLDF049M */
    String RLDF049M = "RLDF049M";

    /** 家暴註記 */
    String VIOLENCE_MARK = "VIOLENCE_MARK";

    /** 統號 */
    String PERSON_ID = "PERSON_ID";

    /** 統號條件 */
    String PERSON_ID_CODI = PERSON_ID + "=?" + " and site_id = ?";

    /** 資料狀態 */
    String STATE_FLAG = "STATE_FLAG";

    /** 結案日期 */
    String CLOSE_YYYMMDD = "CLOSE_YYYMMDD";

    /** 結案戶所代碼 */
    String CLOSE_SITE_ID = "CLOSE_SITE_ID";

    /** 結案戶籍員姓名 */
    String CLOSE_NAME = "CLOSE_NAME";

    /** 被保護人統號 */
    String VICTIM_ID = "VICTIM_ID";

    /** 被保護人統條件號 */
    String VICTIM_ID_CODI = VICTIM_ID + "=?";

    /** 相對人統號 */
    String VIOLATOR_ID = "VIOLATOR_ID";

    /** 保護令終止日期 */
    String END_YYYMMDD = "END_YYYMMDD";

    /** 驗証查詢輸入的被保護人統號或相對人統號是否符合 */
    String DO_VERIFY_EXT_MESSAGE = "驗証查詢輸入的被保護人統號或相對人統號是否符合";

    /** 儲存保護家庭暴力資料註記到期資料 */
    String DO_SAVE_EXT_MESSAGE = "儲存保護家庭暴力資料註記到期資料";

    /** 批次自動註記家暴資料到期 */
    String DO_AUTO_EXPIRE_EXT_MESSAGE = "批次自動註記家暴資料到期";

    /** Rldf049m保護家庭暴力資料 */
    String NO_DATA_FOUND_EXT_MESSAGE = "Rldf049m保護家庭暴力資料";

    /** 0,1,0. */
    String RULE_1 = "0,1,0";

    /** 1,0,1. */
    String RULE_2 = "1,0,1";

    /**
     * 驗証查詢輸入的被保護人統號或相對人統號是否符合.
     * 
     * @param pRl01b20DTO
     *            the rl01b20 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.VERIFY)
    void doVerify(final Rl01b20DTO pRl01b20DTO, final ExecutantType pExecutantType);

    /**
     * 儲存保護家庭暴力資料註記到期資料.
     * 
     * @param pRl01b20DTO
     *            the rl01b20 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    void doSave(final Rl01b20DTO pRl01b20DTO, final ExecutantType pExecutantType);

    /**
     * 批次自動註記家暴資料到期.
     * 
     * @param pExecutantType
     *            the executant type
     */
    /*
     * @RisServiceMethod(MethodType.SAVE) void doAutoExpire(final ExecutantType
     * pExecutantType);
     */

    /**
     * 保護家庭暴力資料註記自動到期作業
     * 
     * @param dto
     * @param executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    public void doJob(Rl01b20DTO dto, ExecutantType executantType) throws RisBusinessException;

}
