/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl01700.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.domain.Rl0171iDTO;

/**
 * 父姓名更正登記服務介面.
 * 
 * @author Jay Kan
 */
public interface Rl0171iService {

    /** 作業代碼 */
    String OPERATION_CODE = "0171I";

    /** 作業名稱. */
    String OPERATION_NAME = "父姓名更正";

    /** 父姓名更正原因代碼 */
    String UPDATE_REASON_RSCD = RlConstant.RSCD3324;

    /** 父母姓名更正-附繳證件 */
    String CERTIFICATE_RSCD = RlConstant.RSCD3284;

    /** 姓名更正引用法條 */
    String QUOTE_LOW_RSCD = RlConstant.RSCD3325;

    /** 記事例代碼 */
    String AUTO_NOTE_ID_1 = "40A4000001";

    /** 記事例代碼 */
    String AUTO_NOTE_ID_2 = "40A4000002";

    /** 次分類（申請書類別） */
    String SUB_TYPE = "0A4";

    /** 其他更正原因代碼 */
    String OTHER_UPDATE_REASON_CODE = "05";

    /** 其他附繳證件代碼 */
    String OTHER_CERTIFICATE_CODE = "21";

    /** 父姓名 */
    String FATHER = "father";

    /** 父姓 */
    String FATHER_LAST_NAME = "fatherLastName";

    /** 父名 */
    String FATHER_FIRST_NAME = "fatherFirstName";

    /** 請輸入更正原因 */
    String UPDATE_REASON_EMPTY_MSG = "請輸入更正原因";

    /** 請輸入其他更正原因 */
    String OTHER_UPDATE_REASON_EMPTY_MSG = "請輸入其他更正原因";

    /** 請輸入更正日期 */
    String UPDATE_YYYMMDD_EMPTY_MSG = "請輸入更正日期";

    /** 請輸入其他之附繳證件 */
    String OTHER_CERTIFICATE_EMPTY_MSG = "請輸入其他之附繳證件";

    /** 應更正事項，父姓名不可為空白 */
    String AFTER_FATHER_EMPTY_MSG = "應更正事項，父姓名不可為空白";

    /** 請修改父姓名 */
    String FATHER_SAME_EMPTY_MSG = "請修改父姓名";

    /** 更正日期不可大於系統日期 */
    String UPDATE_DATE_MSG = "更正日期不可大於系統日期";

    /**
     * 執行Contoller loadPage() 的第一個Service之共用邏輯.
     * 
     * @param pRl0171iDTO
     *            the rl0171i dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.QUERY)
    void initLoadPage(final Rl0171iDTO pRl0171iDTO, final ExecutantType pExecutantType);

    /**
     * 初始化父姓名更正登記.
     * 
     * @param pRl0171iDTO
     *            the rl0171i dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    void initOperationDTO(final Rl0171iDTO pRl0171iDTO, final ExecutantType pExecutantType);

    /**
     * 載入父姓名更正登記.
     * 
     * @param pOpeningOperationDTO
     *            the opening operation dto
     * @param pExecutantType
     *            the executant type
     * @return the rl0171i dto
     */
    @RisServiceMethod(MethodType.QUERY)
    Rl0171iDTO loadOperationDTO(final OpeningOperationDTO pOpeningOperationDTO, final ExecutantType pExecutantType);

    /**
     * 再次驗證狀態時載入父姓名更正登記DTO.
     * 
     * @param pOpeningOperationDTO
     *            the opening operation dto
     * @param pExecutantType
     *            the executant type
     * @return the rl0171i dto
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    Rl0171iDTO reviewOperationDTO(final OpeningOperationDTO pOpeningOperationDTO, final ExecutantType pExecutantType);

    /**
     * 刪除父姓名更正XLDF資料.
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
     * @param pRl0171iDTO
     *            the rl0171i dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.VERIFY)
    void verifyAppData(final Rl0171iDTO pRl0171iDTO, final ExecutantType pExecutantType);

    /**
     * 儲存父姓名更正申請資料至XLDF Table.
     * 
     * @param pRl0171iDTO
     *            the rl0171i dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    @WorkStatus(FinalType.TEMP_FINAL)
    void saveXLDF(final Rl0171iDTO pRl0171iDTO, final ExecutantType pExecutantType);
}