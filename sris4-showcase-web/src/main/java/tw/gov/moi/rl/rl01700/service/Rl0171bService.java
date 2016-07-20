/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl01700.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.domain.Rl0171bDTO;

/**
 * 戶別更正登記服務介面.
 * 
 */
public interface Rl0171bService {

    /** 作業代碼 */
    String OPERATION_CODE = "0171B";

    /** 記事例代碼 */
    String AUTO_NOTE_ID = "40A8000001";

    /** 戶別更正-附繳證件 */
    String CERTIFICATE_RSCD = "RSCD3256";

    /** 戶別更正原因代碼 */
    String UPDATE_REASON_RSCD = RlConstant.RSCD3254;

    /** 其他附繳證件代碼 */
    String OTHER_CERTIFICATE_CODE = "5";

    /** 次分類（申請書類別） */
    String SUB_TYPE = "0A8";

    /**
     * 執行Contoller loadPage() 的第一個Service之共用邏輯
     * 
     * @param dto
     *            the dto
     * @param executantType
     *            the executant type
     * @return the rl0171b0 dto
     */
    @RisServiceMethod(value = MethodType.QUERY)
    Rl0171bDTO initLoadPage(final Rl0171bDTO dto, final ExecutantType executantType);

    /**
     * 初始化戶別更正登記登記
     * 
     * @param rl0171bdto
     *            the rl0171bdto
     * @param executantType
     *            the executant type
     */
    @RisServiceMethod(value = MethodType.SAVE2TEMP)
    void initOperationDTO(final Rl0171bDTO dto, final ExecutantType executantType);

    /**
     * 載入戶別登記登記.
     * 
     * @param pOpeningOperationDTO
     *            the opening operation dto
     * @param executantType
     *            the executant type
     * @return the rl0171b dto
     */
    @RisServiceMethod(value = MethodType.QUERY)
    Rl0171bDTO loadOperationDTO(final OpeningOperationDTO pOpeningOperationDTO, final ExecutantType executantType);

    /**
     * Review operation dto.
     * 
     * @param pOpeningOperationDTO
     *            the opening operation dto
     * @param executantType
     *            the executant type
     * @return the rl0171b dto
     */
    @RisServiceMethod(value = MethodType.QUERY)
    Rl0171bDTO reviewOperationDTO(final OpeningOperationDTO pOpeningOperationDTO, final ExecutantType executantType);

    /**
     * 刪除戶別更正登記XLDF資料.
     * 
     * @param openingOperationDTO
     *            the opening operation dto
     * @param executantType
     *            the executant type
     */
    @RisServiceMethod(value = MethodType.DELETE)
    void doDelete(final OpeningOperationDTO openingOperationDTO, final ExecutantType executantType);

    /**
     * 執行資料驗證並自動組合記事.
     * 
     * @param rl0171bdto
     *            the rl0171bdto
     * @param executantType
     *            the executant type
     * @return the rl0171b dto
     */
    @RisServiceMethod(value = MethodType.VERIFY)
    Rl0171bDTO verifyAppData(final Rl0171bDTO dto, final ExecutantType executantType);

    /**
     * 儲存戶別更正登記申請資料至XLDF Table.
     * 
     * @param rl0171bdto
     *            the rl0171bdto
     * @param executantType
     *            the executant type
     */
    @RisServiceMethod(value = MethodType.SAVE2TEMP)
    @WorkStatus(FinalType.TEMP_FINAL)
    void saveXLDF(final Rl0171bDTO dto, final ExecutantType executantType);
}
