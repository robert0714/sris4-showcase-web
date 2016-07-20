/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl01i00.service;

import java.util.regex.Pattern;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.domain.Rl01i00DTO;

/**
 * 個人聯絡資訊維護服務介面
 * 
 * @author Jay Kan
 */
public interface Rl01i00Service {

    /** 作業代碼 */
    String OPERATION_CODE = "01I00";

    /** 作業名稱. */
    String OPERATION_NAME = "個人聯絡資訊維護";

    /** 數字格式 */
    String NUMBER_ONLY = "[0-9]+";

    /** 電子信箱格式 */
    Pattern EMAIL_PATTERN = Pattern
            .compile("^([a-z0-9A-Z]+[-\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$");

    /**
     * 設定第一次新增登記畫面初始值.
     * 
     * @param dto
     *            :個人聯絡資訊維護 DTO
     * @param exec
     *            :Executant Type
     */
    void initOperationDTO(final Rl01i00DTO dto, final ExecutantType exec);

    /**
     * 載入個人聯絡資訊維護登記.
     * 
     * @param pOpeningOperationDTO
     *            the opening operation dto
     * @param pExecutantType
     *            the executant type
     * @return the rl01i00 dto
     */
    @RisServiceMethod(MethodType.SAVE)
    Rl01i00DTO loadOperationDTO(final OpeningOperationDTO pOpeningOperationDTO, final ExecutantType pExecutantType);

    /**
     * 再次驗證狀態時載入個人聯絡資訊維護登記DTO.
     * 
     * @param pOpeningOperationDTO
     *            the opening operation dto
     * @param pExecutantType
     *            the executant type
     * @return the rl01i00 dto
     */
    @RisServiceMethod(MethodType.SAVE)
    Rl01i00DTO reviewOperationDTO(final OpeningOperationDTO pOpeningOperationDTO, final ExecutantType pExecutantType);

    /**
     * 暫存「個人聯絡資訊維護資料」至XLDFTable.
     * 
     * @param dto
     *            :個人聯絡資訊維護DTO
     * @param exec
     *            :Executant Type
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.TEMP_FINAL)
    void saveXldf(final Rl01i00DTO dto, final ExecutantType exec);

    /**
     * 執行資料驗證.
     * 
     * @param dto
     *            :個人聯絡資訊維護 DTO
     * @param exec
     *            :Executant Type
     */
    @RisServiceMethod(MethodType.VERIFY)
    void verifyAppData(final Rl01i00DTO dto, final ExecutantType exec);

    /**
     * 刪除個人聯絡資訊維護XLDF資料.
     * 
     * @param pOpeningOperationDTO
     *            the opening operation dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.DELETE)
    void doDelete(final OpeningOperationDTO pOpeningOperationDTO, final ExecutantType pExecutantType);

    /**
     * 列印個人聯絡資訊維護同意書.
     * 
     * @param dto
     *            the dto
     * @param exec
     *            the exec
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    void doPrint(final Rl01i00DTO dto, final ExecutantType exec);
}