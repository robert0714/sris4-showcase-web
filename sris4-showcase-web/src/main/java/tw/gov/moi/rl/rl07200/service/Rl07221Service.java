/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl07200.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.rl.domain.Rl07221DTO;

/**
 * 戶口校正資料登錄(新增)處理服務介面
 * 
 * @author Derek Wang
 */
public interface Rl07221Service {

    /**
     * 查詢戶口校正資料
     * 
     * @param pRl07221DTO
     *            the rl07221 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl07221DTO queryData(final Rl07221DTO rl07221DTO, final ExecutantType executantType);

    /**
     * 驗証查詢輸入的戶口補校正統一編號是否符合
     * 
     * @param pRl07221DTO
     *            the rl07221 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.VERIFY)
    public void verifyData(final Rl07221DTO rl07221DTO, final ExecutantType executantType);

    /**
     * 儲存戶口校正資料
     * 
     * @param pRl07221DTO
     *            the rl07221 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE)
    public void saveData(final Rl07221DTO rl07221DTO, final ExecutantType executantType);
}
