/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl02a00.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.rl.domain.Rl02a50DTO;

/**
 * 國民身分證註銷狀況登錄服務介面
 * 
 * @author Jay Kan
 */
public interface Rl02a50Service {

    String DO_QUERY_EXT_MESSAGE = "查詢國民身分證註銷狀況資料";

    String DO_SAVE_EXT_MESSAGE = "儲存登錄國民身分證註銷資料";

    String PERSON_ID = "國民身分證統一編號";

    String EXPIRE_YYYMMDD = "註銷日期";

    String EXPIRE_HHMMSS = "註銷時間";

    String EXPIRE_REASON_CODE = "註銷原因";

    String RL02A50_GET_RLDF003D = "rl02a50.getRldf003d";

    String RL02A50_GET_RLDF004M = "rl02a50.getRldf004m";

    String RL02A50_GET_RLDF004H = "rl02a50.getRldf004h";

    String RL02A50_GET_TLDF004M = "rl02a50.getTldf004m";

    String RL02A50_GET_RLDF001M = "rl02a50.getRldf001m";

    String RL02A50_GET_RLDF001H = "rl02a50.getRldf001h";

    String RL02A50_GET_TLDF001M = "rl02a50.getTldf001m";

    /**
     * 查詢國民身分證註銷狀況資料
     * 
     * @param pRl02a50DTO
     *            the rl02a50 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.QUERY)
    void doQuery(final Rl02a50DTO pRl02a50DTO, final ExecutantType pExecutantType);

    /**
     * 儲存登錄國民身分證註銷資料
     * 
     * @param pRl02a50DTO
     *            the rl02a50 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    void doSave(final Rl02a50DTO pRl02a50DTO, final ExecutantType pExecutantType);
}
