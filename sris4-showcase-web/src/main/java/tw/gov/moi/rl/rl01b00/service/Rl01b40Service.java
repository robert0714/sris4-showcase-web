/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl01b00.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl01b40DTO;

/**
 * 保護家庭暴力資料註記刪除處理服務介面.
 * 
 * @author Weiren.Jheng
 */
public interface Rl01b40Service {

    /**
     * 驗証查詢輸入的被保護人統號或相對人統號是否符合.
     * 
     * @param rl01b40dto
     *            輸入的查詢條件
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.VERIFY)
    public void doVerify(final Rl01b40DTO rl01b40dto, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 儲存保護家庭暴力資料註記刪除資料.
     * 
     * @param rl01b40dto
     *            輸入的查詢條件
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void doSave(final Rl01b40DTO rl01b40dto, final ExecutantType executantType) throws RisBusinessException;

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

    /** 相對人統號 */
    String VIOLATOR_ID = "VIOLATOR_ID";

    /** 保護令終止日期 */
    String END_YYYMMDD = "END_YYYMMDD";

    /** 儲存保護家庭暴力資料註記刪除資料 */
    String DO_SAVE_DEL_MESSAGE = "儲存保護家庭暴力資料註記刪除資料";
}
