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
import tw.gov.moi.rl.domain.Rl07224DTO;

/**
 * 戶口校正資料登錄(新增)處理服務介面.
 * 
 * @author Derek Wang
 * 
 */
public interface Rl07224Service {

    /**
     * 查詢戶口校正資料.
     * 
     * @param rl07224DTO
     *            the rl07224 dto
     * @param executantType
     *            the executant type
     * @return the rl07224 dto
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl07224DTO queryData(final Rl07224DTO rl07224DTO, final ExecutantType executantType);

    /**
     * 儲存戶口校正資料.
     * 
     * @param rl07224DTO
     *            the rl07224 dto
     * @param executantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE)
    public void saveData(final Rl07224DTO rl07224DTO, final ExecutantType executantType);

}
