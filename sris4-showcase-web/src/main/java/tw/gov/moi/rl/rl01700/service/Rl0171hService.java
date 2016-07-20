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
import tw.gov.moi.rl.domain.Rl0171hDTO;

/**
 * 配偶姓名更正服務介面.
 * 
 * @author Dan Tsai
 */
public interface Rl0171hService {

    /** 作業代碼. */
    String OPERATION_CODE = "0171H";

    /** 作業名稱. */
    String OPERATION_NAME = "配偶姓名更正";

    /** 配偶姓名更正原因代碼 */
    String UPDATE_REASON_RSCD = RlConstant.RSCD3324;

    /** 配偶姓名更正-附繳證件 */
    String CERTIFICATE_RSCD = RlConstant.RSCD3284;

    /** 記事例代碼. */
    String AUTO_NOTE_ID_1 = "40AA000001";

    /** 記事例代碼. */
    String AUTO_NOTE_ID_2 = "40AA000002";

    /** 次分類（申請書類別）. */
    String SUB_TYPE = "0AA";

    /** 登記日期. */
    String REGISTER_DATE = "registerDate";

    /** 登記時間. */
    String REGISTER_TIME = "registerTime";

    /** 父姓名. */
    String SPOUSE = "spouse";

    /** 父姓. */
    String SPOUSE_LAST_NAME = "spouseLastName";

    /** 父名. */
    String SPOUSE_FIRST_NAME = "spouseFirstName";

    /** 請輸入（原屬）國籍. */
    String NATIONALITY_CODE_EMPTY_MSG = "請輸入（原屬）國籍";

    /** 請輸入(原屬)國籍其他內容. */
    String NATIONALITY_EMPTY_MSG = "請輸入(原屬)國籍其他內容";

    /** 請輸入其他更正原因 */
    String OTHER_UPDATE_REASON_EMPTY_MSG = "請輸入其他更正原因";

    /** 請輸入更正原因. */
    String UPDATE_REASON_EMPTY_MSG = "請輸入更正原因";

    /** 請輸入更正日期. */
    String UPDATE_YYYMMDD_EMPTY_MSG = "請輸入更正日期";

    /** 請輸入其他之附繳證件. */
    String OTHER_CERTIFICATE_EMPTY_MSG = "請輸入其他之附繳證件";

    /** 當事人之配偶姓名不可為空白. */
    String AFTER_FATHER_EMPTY_MSG = "當事人之配偶姓名不可為空白";

    /** 請修改配偶姓名. */
    String FATHER_SAME_EMPTY_MSG = "請修改配偶姓名";

    /** 更正日期不可大於系統日期. */
    String UPDATE_DATE_MSG = "更正日期不可大於系統日期";

    /** 請輸入記事內容. */
    String REGISTER_CONTENT_EMPTY_MSG = "請輸入記事內容";

    /** 初始化父姓名更正登記. */
    String INIT_OPERATION_DTO_EXT_MESSAGE = "初始化配偶姓名更正";

    /** 刪除配偶姓名更正XLDF資料. */
    String DO_DELETE_EXT_MESSAGE = "刪除配偶姓名更正XLDF資料";

    /** 執行資料驗證並自動組合記事. */
    String VERIFY_APPDATA_EXT_MESSAGE = "執行資料驗證並自動組合記事";

    /** 更新當事人「個人基本資料」. */
    String UPDATE_PERSON_DATA_EXT_MESSAGE = "更新當事人「個人基本資料」";

    /** 新增當事人之「個人動態記事」失敗. */
    String CREATE_XLDF005M_EXT_MESSAGE = "新增當事人之「個人動態記事」失敗";

    /** 新增「配偶姓名更正申請書」及「申請書索引資料」. */
    String CREATE_APP_DATA_EXT_MESSAGE = "新增「配偶姓名更正申請書」及「申請書索引資料」";

    /** 暫存「臨時－辦理他所申請書索引資料」至XLDF026S 失敗. */
    String SAVE_XLDF026S_EXT_MESSAGE = "暫存「臨時－辦理他所申請書索引資料」至XLDF026S 失敗";

    /** 暫存「辦理他所－配偶姓名更正申請書歷史資料」至XLDFW0AA. */
    String SAVE_XLDFW0AA_EXT_MESSAGE = "暫存「辦理他所－配偶姓名更正申請書歷史資料」至XLDFW0AA";

    /** 新增「臨時─個人申請書紀錄資料」失敗. */
    String CREATE_XLDFM10M_EXT_MESSAGE = "新增「臨時─個人申請書紀錄資料」失敗";

    /** 儲存戶別更正登記申請資料至XLDF Table. */
    String SAVE_XLDF_EXT_MESSAGE = "儲存戶別更正登記申請資料至XLDF Table";

    /** 其他更正原因代碼 */
    String OTHER_UPDATE_REASON_CODE = "05";

    /** 其他附繳證件代碼 */
    String OTHER_CERTIFICATE_CODE = "21";

    @RisServiceMethod(MethodType.QUERY)
    void initLoadPage(final Rl0171hDTO pRl0171hDTO, final ExecutantType pExecutantType);

    /**
     * 初始化配偶姓名更正登記.
     * 
     * @param pRl0171hDTO
     *            the rl0171h dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    void initOperationDTO(final Rl0171hDTO pRl0171hDTO, final ExecutantType pExecutantType);

    /**
     * 載入配偶姓名更正登記.
     * 
     * @param pRl0171hDTO
     *            the rl0171h dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.QUERY)
    Rl0171hDTO loadOperationDTO(final OpeningOperationDTO pOpeningOperationDTO, final ExecutantType pExecutantType);

    /**
     * 再次驗證狀態時載入配偶姓名更正登記DTO.
     * 
     * @param pRl0171hDTO
     *            the rl0171h dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    Rl0171hDTO reviewOperationDTO(final OpeningOperationDTO pOpeningOperationDTO, final ExecutantType pExecutantType);

    /**
     * 刪除配偶姓名更正XLDF資料.
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
     * @param pRl0171hDTO
     *            the rl0171h dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.VERIFY)
    void verifyAppData(final Rl0171hDTO pRl0171hDTO, final ExecutantType pExecutantType);

    /**
     * 儲存配偶姓名更正申請資料至XLDF Table.
     * 
     * @param pRl0171hDTO
     *            the rl0171h dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    @WorkStatus(FinalType.TEMP_FINAL)
    void saveXLDF(final Rl0171hDTO pRl0171hDTO, final ExecutantType pExecutantType);
}
