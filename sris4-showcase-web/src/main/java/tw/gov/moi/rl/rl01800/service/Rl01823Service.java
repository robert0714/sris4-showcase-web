/*
 * Copyright (c) 2010-2020 IISI. All rights reserved.
 * 
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl01800.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.domain.Rl01823DTO;

/**
 * 撤銷出生地登記服務介面.
 * 
 * @author Jay Kan
 */
public interface Rl01823Service {

    /** 作業代碼 */
    String OPERATION_CODE = "01823";

    /** 作業名稱. */
    String OPERATION_NAME = "撤銷出生地";

    /** 撤銷出生地-附繳證件 */
    String CERTIFICATE_RSCD = "RSCD3500";

    /** 出生地代碼檔 */
    String BIRTH_PLACE_RSCD = RlConstant.RSCD0104;

    /** 大陸其他省市 */
    String CHINA_CODE = RlConstant.RSCD0104_CODE_99998;

    /** 國外 */
    String FOREIGN_CODE = RlConstant.RSCD0104_CODE_99999;

    /** 次分類（申請書類別） */
    String SUB_TYPE = "09M";

    /** 其他附繳證件代碼 */
    String OTHER_CERTIFICATE_CODE = "2";

    /** 記事例代碼 */
    String AUTO_NOTE_ID = "809M000001";

    /** 出生地代碼 */
    String BIRTH_PLACE_CODE = "birthPlaceCode";

    /** 其他出生地 */
    String OTHER_BIRTH_PLACE = "otherBirthPlace";

    /** 請輸入其他之附繳證件 */
    String OTHER_CERTIFICATE_EMPTY_MSG = "請輸入其他之附繳證件";

    /** 刪除「國民其他出生地資料檔」 */
    String DELETE_XLDFM13M = "刪除「國民其他出生地資料檔」";

    /**
     * 執行Contoller loadPage() 的第一個Service之共用邏輯.
     * 
     * @param pRl01823DTO
     *            the rl01823 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.QUERY)
    void initLoadPage(final Rl01823DTO pRl01823DTO, final ExecutantType pExecutantType);

    /**
     * 初始化撤銷出生地登記.
     * 
     * @param pRl01823DTO
     *            the rl01823 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    void initOperationDTO(final Rl01823DTO pRl01823DTO, final ExecutantType pExecutantType);

    /**
     * 載入撤銷出生地登記.
     * 
     * @param pOpeningOperationDTO
     *            the opening operation dto
     * @param pExecutantType
     *            the executant type
     * @return the rl01823 dto
     */
    @RisServiceMethod(MethodType.QUERY)
    Rl01823DTO loadOperationDTO(final OpeningOperationDTO pOpeningOperationDTO, final ExecutantType pExecutantType);

    /**
     * 再次驗證狀態時載入撤銷出生地登記DTO.
     * 
     * @param pOpeningOperationDTO
     *            the opening operation dto
     * @param pExecutantType
     *            the executant type
     * @return the rl01823 dto
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    Rl01823DTO reviewOperationDTO(final OpeningOperationDTO pOpeningOperationDTO, final ExecutantType pExecutantType);

    /**
     * 刪除撤銷出生地XLDF資料.
     * 
     * @param pOpeningOperationDTO
     *            the opening operation dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.DELETE)
    void doDelete(final OpeningOperationDTO pOpeningOperationDTO, final ExecutantType pExecutantType);

    /**
     * 執行資料驗證並自動組合記事.
     * 
     * @param pRl01823DTO
     *            the rl01823 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.VERIFY)
    void verifyAppData(final Rl01823DTO pRl01823DTO, final ExecutantType pExecutantType);

    /**
     * 儲存撤銷出生地申請資料至XLDF Table.
     * 
     * @param pRl01823DTO
     *            the rl01823 dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    @WorkStatus(FinalType.TEMP_FINAL)
    void saveXLDF(final Rl01823DTO pRl01823DTO, final ExecutantType pExecutantType);

    /**
     * 選取擬撤銷的原登記申請書。.
     * 
     * @param pRl01823DTO
     *            the rl01823 dto
     * @param pExecutantType
     *            the executant type
     */
    void selectOrgApplication(final Rl01823DTO pRl01823DTO, final ExecutantType pExecutantType);

    /**
     * 檢視擬撤銷之原登記申請書。.
     * 
     * @param pRl01823DTO
     *            the rl01823 dto
     * @param pExecutantType
     *            the executant type
     */
    void viewOrgApplication(final Rl01823DTO pRl01823DTO, final ExecutantType pExecutantType);
}
