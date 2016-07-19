/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl01400.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.rl.domain.Rl01420DTO;

/**
 * 特殊註記資料變更之Service Interface.
 * 
 * @author Jay Kan
 */
public interface Rl01420Service {

    /** 取得個人基本資料 */
    String RL01420_GET_RLDF004M = "rl01420.getRldf004m";

    /** 取得特殊人口資料檔 */
    String RL01420_GET_RLDF008M = "rl01420.getRldf008m";

    /** 「讀取特殊註記資料」失敗 */
    String LOAD_SPECIAL_CODE_INFO = "「讀取特殊註記資料」失敗";

    /** 當事人不得為死亡人口 */
    String PERSONAL_MARK_ERROR_MSG_1 = "當事人不得為死亡人口";

    /** 遷出已接通報者，應在其戶籍所在地辦理 */
    String PERSONAL_MARK_ERROR_MSG_2 = "遷出已接通報者，應在其戶籍所在地辦理";

    /** 「儲存特殊註記列表」失敗 */
    String SAVE_LIST_ERROR_MSG = "「儲存特殊註記列表」失敗";

    /** 「組通報資料」失敗 */
    String MAKE_NOTICE_DATA_ERROR_MSG = "「組通報資料」失敗";

    /**
     * 儲存特殊註記列表.
     * 
     * @param pRl01420DTO
     *            the rl01420 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)   
    void saveList(final Rl01420DTO pRl01420DTO, final ExecutantType pExecutantType);

    /**
     * 取得特殊註記資料.
     * 
     * @param pRl01420DTO
     *            the rl01420 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.QUERY)
    void loadSpecialCodeInfo(final Rl01420DTO pRl01420DTO, final ExecutantType pExecutantType);
}
