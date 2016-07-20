/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl02600.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl02600DTO;

/**
 * 戶口統計資料申請服務介面.
 * 
 */
public interface Rl02600Service {

    String RSCD3080 = "RSCD3080";

    String OTHER_APPLY_CONTENT = "9999";

    String FEE_CATEGORY_1 = "02600";

    String FEE_CATEGORY_2 = "02100";

    String[] FEE_CODE = { "0025", "0026", "0027", "0028" };

    /**
     * Inits the operation dto.
     * 
     * @param pRl02600DTO
     *            the rl02600 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.QUERY)
    void initOperationDTO(final Rl02600DTO pRl02600DTO, final ExecutantType pExecutantType);

    /**
     * 驗證戶口統計資料申請資料.
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @return the rl02600 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.VERIFY)
    void verifyData(final Rl02600DTO dto, final ExecutantType executantType);

    /**
     * 儲存戶口統計資料申請資料.
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @return the rl02600 dto
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.FINAL)
    Rl02600DTO doSave(Rl02600DTO dto, ExecutantType executantType);

    /**
     * 列印戶口統計資料申請書.
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @return the string
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    Rl02600DTO doPrint(Rl02600DTO dto, ExecutantType executantType);

    /**
     * 列印規費收據.
     * 
     * @param pRl02600DTO
     *            the rl02600 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    void printReceipt(final Rl02600DTO pRl02600DTO, final ExecutantType pExecutantType);
}
