/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl01e00.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.domain.Rl01e20DTO;

/**
 * 完整出生地登錄服務介面.
 * 
 * @author Jay Kan
 */
public interface Rl01e20Service {

    /** 作業代碼 */
    String OPERATION_CODE = "01E20";

    /** 作業名稱. */
    String OPERATION_NAME = "完整出生地登錄";

    /** 請輸入其他出生地. */
    String OTHER_BIRTH_PLACE_EMPTY_MSG = "請輸入其他出生地";

    /** 請修改其他出生地 */
    String OTHER_BIRTH_PLACE_SAME_MSG = "請修改其他出生地";

    /** otherBirthPlace */
    String OTHER_BIRTH_PLACE = "otherBirthPlace";

    /**
     * 初始化完整出生地登錄.
     * 
     * @param pRl01e20DTO
     *            the rl01e20 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    void initOperationDTO(final Rl01e20DTO pRl01e20DTO, final ExecutantType pExecutantType);

    /**
     * 載入完整出生地登錄.
     * 
     * @param pOpeningOperationDTO
     *            the opening operation dto
     * @param pExecutantType
     *            the executant type
     * @return the rl01e20 dto
     */
    Rl01e20DTO loadOperationDTO(final OpeningOperationDTO pOpeningOperationDTO, final ExecutantType pExecutantType);

    /**
     * 再次驗證狀態時載入完整出生地登錄DTO.
     * 
     * @param pOpeningOperationDTO
     *            the opening operation dto
     * @param pExecutantType
     *            the executant type
     * @return the rl01e20 dto
     */
    Rl01e20DTO reviewOperationDTO(final OpeningOperationDTO pOpeningOperationDTO, final ExecutantType pExecutantType);

    /**
     * 刪除完整出生地登錄XLDF資料.
     * 
     * @param pOpeningOperationDTO
     *            the opening operation dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.DELETE)
    void doDelete(final OpeningOperationDTO pOpeningOperationDTO, final ExecutantType pExecutantType);

    /**
     * 執行資料驗證.
     * 
     * @param pRl01e20DTO
     *            the rl01e20 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.VERIFY)
    void verifyAppData(final Rl01e20DTO pRl01e20DTO, final ExecutantType pExecutantType);

    /**
     * 儲存完整出生地登錄申請資料至XLDF Table.
     * 
     * @param pRl01e20DTO
     *            the rl01e20 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    @WorkStatus(FinalType.TEMP_FINAL)
    void saveXLDF(final Rl01e20DTO pRl01e20DTO, final ExecutantType pExecutantType);
}
