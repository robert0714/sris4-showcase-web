/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl08900.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl089d2DTO;

/**
 * The Interface Rl089d2Service.
 */
public interface Rl089d2Service {

    String content1 = "同戶籍地址　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　";
    String content2 = "現住地ＸＸＸＸＸＸＸＸＸＸＸＸＸＸＸＸＸＸＸＸＸＸＸＸＸＸＸＸＸＸＸＸＸＸＸＸＸＸＸＸＸＸ　　　　　　　　　　　　　　　　";
    String content3 = "民國ＸＸＸ年ＸＸ月ＸＸ日出境。　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　";
    String content4 = "已出境且辦理遷出登記，民國ＸＸＸ年ＸＸ月ＸＸ日註記（戶所代碼）。　　　　　　　　　　　　　　　　　　　　　　　　　　　　　";
    String content5 = "自ＸＸＸ、ＸＸＸ知悉當事人已失蹤，民國ＸＸＸ年ＸＸ月ＸＸ日註記（戶所代碼）。　　　　　　　　　　　　　　　　　　　　　　　";
    String content6 = "民國ＸＸＸ年ＸＸ月ＸＸ日已列入失蹤人口。　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　";
    String content7 = "民國ＸＸＸ年ＸＸ月ＸＸ日向法院申請死亡宣告，民國ＸＸＸ年ＸＸ月ＸＸ日註記（戶所代碼）。　　　　　　　　　　　　　　　　　　";
    String content8 = "因ＸＸＸＸＸＸＸＸＸＸ未辦理死亡（死亡宣告）登記，民國ＸＸＸ年ＸＸ月ＸＸ日註記（戶所代碼）。民國ＸＸＸ年ＸＸ月ＸＸ日催告。";
    String content9 = "當事人辦理死亡（死亡宣告）登記後自動註記並列入除戶（除口）結案。　　　　　　　　　　　　　　　　　　　　　　　　　　　　　";
    String content10 = "發現地：ＸＸＸＸＸＸＸＸＸＸＸＸＸＸＸＸＸＸＸＸＸＸＸＸＸＸＸＸＸＸ，。民國ＸＸＸ年ＸＸ月ＸＸ日通知社政單位。　　　　　　";
    String content11 = "ＸＸＸＸＸＸＸＸＸＸ監獄。　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　　";

    /**
     * Verify data.驗証查詢輸入統一編號與條件是否符合
     * 
     * @param pRl089d2DTO
     *            the rl089d2 dto
     * @param executantType
     *            the executant type
     * @return the rl089d2 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.QUERY)
    public void verifyData(final Rl089d2DTO pRl089d2DTO, final ExecutantType executantType) throws RisBusinessException;

    /**
     * Save data.儲存登錄應清查人口查對成果資料
     * 
     * @param pRl089d2DTO
     *            the rl089d2 dto
     * @param executantType
     *            the executant type
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    public void saveData(final Rl089d2DTO pRl089d2DTO, final ExecutantType executantType) throws RisBusinessException;

}
