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
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl01471DTO;

/**
 * 新增遷出人口特殊註記資料之Service Interface.
 * 
 * @author Jay Kan
 */
public interface Rl01471Service {

    /** 「讀取遷出人口特殊註記資料」失敗 */
    String LOAD_PERSON_INFO_MSG = "「讀取遷出人口特殊註記資料」失敗";

    /** 「儲存特殊註記列表」失敗 */
    String SAVE_LIST_MSG = "「儲存特殊註記列表」失敗";

    /**
     * 取得個人資料
     * 
     * @param rl01471DTO
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.QUERY)
    public void doQueryRldf001004m(final Rl01471DTO rl01471dto, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 儲存特殊註記列表並通報
     * 
     * @param rl01471DTO
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)   
    public void doSaveToDB(final Rl01471DTO rl01471dto, final ExecutantType executantType) throws RisBusinessException;

}
