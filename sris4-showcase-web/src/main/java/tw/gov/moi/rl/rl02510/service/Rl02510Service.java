/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl02510.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.rl.domain.Rl02510DTO;

/**
 * 戶口名簿請補換發服務介面
 * 
 * @author Weiren.Jheng
 * 
 */
public interface Rl02510Service {

    /** 初領申請書代碼. */
    final String APPLY_CODE_1 = "035";

    /** 補領申請書代碼. */
    final String APPLY_CODE_2 = "036";

    /** 換領申請書代碼. */
    final String APPLY_CODE_3 = "037";

    /** 鄰 */
    final String NEIGHBOR_CHAR = "鄰";

    final String BY_PASS = "省略";

    /** 句號 */
    final String PERIOD = "。";

    /** 分號 */
    final String SEMICOLON = "；";

    /** 全型空白 */
    final String FULL_SPACE = "　";

    final String FILE_NAME = "RLRP02510";

    final String END_STATE = "本戶口名簿請領紀錄";

    final String FILE_NAME_CHINESE = "戶　口　名　簿";

    final String DEFAULT_SEQ_NO = "00001";

    /** 省略記事共%s筆 */
    final String NOT_PRINT_TEMPLATE = "省略記事共%s筆。";

    /** 省略記事共%s筆 */
    final String NOT_PRINT_TEMPLATE2 = "尚省略記事%s筆。";

    /** 戶口校正 */
    final String CORRECT_PRINT_TEMPLATE = "%s年戶校。";

    /** 役別 */
    final String MILITARY_PRINT_TEMPLATE = "%s。";

    /** 補、換證 */
    final String ID_CARD_APPLY_TEMPLAT = "%s%s。";

    /** 條碼編號格式 */
    final String BARCODE_NO_FORMAT = "%s%s%s%s%s";

    final String PERSON_NOTE_FORMAT = "%s（%s）";

    final String PRINT_NAME_FORMAT = "%s %s";

    final String PERSONAL_MARK_CONTENT_0 = "現住人口";

    final String PERSONAL_MARK_CONTENT_1 = "歿";

    final String PERSONAL_MARK_CONTENT_2 = "除口";

    final String FOSTER_PARENTS_REG = "養父|養母$";

    final String FAMILY_CHAR_1 = "家屬";

    final String CHAR_1 = "養";

    final String FEE_UNIT = "張";

    /** 家暴註記 */
    final String VIOLENCE_MARK = "VP";

    final String NO_NAME = "無";

    final String OTHER_PLACE_REG = "99998|99999";

    final String MOVE_OUT_REG = "3|4|5";

    final String EMPTY_PARENT_NAME = "－";

    final String EMPTY_FORSTER_PARENT_NAME = "＝";

    final String FATHER_NAME_FORMAT = "%s（父）";

    final String MOTHER_NAME_FORMAT = "%s（母）";

    final String FOSTER_FATHER_NAME_FORMAT = "%s（養父）";

    final String FOSTER_MOTHER_NAME_FORMAT = "%s（養母）";

    final String OTHER_CERTIFICATE_CODE = "5";

    final String ORIGIN_RLDF_USEDATETIME = "1030205080000";

    final String FORMAT_1 = "%s%s";

    /** 挑選. */
    final String PICK_CHAR = "挑選";

    /** 全部. */
    final String ALL_CHAR = "全部";

    /** 部份. */
    final String A_PART_CHAR = "部分";

    /** 初領 CATEGORY. */
    final String CATEGORY_1 = "02510";

    /** 換領 CATEGORY. */
    final String CATEGORY_2 = "02511";

    /** 補領 CATEGORY. */
    final String CATEGORY_3 = "02512";

    /**
     * 初始化戶口名簿請補換發資料.
     * 
     * @param rl02510DTO
     * @param executantType
     */
    // @RisServiceMethod(MethodType.QUERY)
    void initOperationDTO(final Rl02510DTO rl02510DTO, final ExecutantType executantType);

    /**
     * 驗證戶口名簿請補換發
     * 
     * @param rl02510DTO
     * @param executantType
     */
    @RisServiceMethod(MethodType.VERIFY)
    void verifyData(final Rl02510DTO rl02510DTO, final ExecutantType executantType);

    /**
     * 儲存戶口名簿請補換發資料至XLDF Table
     * 
     * @param rl02510DTO
     * @param executantType
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    @WorkStatus(FinalType.TEMP_FINAL)
    void saveXldf(final Rl02510DTO rl02510DTO, final ExecutantType executantType);

    /**
     * 儲存戶口名簿領補換記錄檔
     * 
     * @param rl02510DTO
     * @param executantType
     */
    void saveXLDF018D(final Rl02510DTO rl02510DTO, final ExecutantType executantType);

    /**
     * 取得規費
     * 
     * @param rl02510DTO
     * @param executantType
     */
    @RisServiceMethod(MethodType.QUERY)
    void getFee(final Rl02510DTO rl02510DTO, final ExecutantType executantType);

    /**
     * 儲存列印資料至TLDF table.
     * 
     * @param rl02510DTO
     * @param executantType
     */
    @RisServiceMethod(MethodType.SAVE)
    void savePrint(final Rl02510DTO rl02510DTO, final ExecutantType executantType);

    /**
     * 取得報表頁數.
     * 
     * @param rl02510DTO
     * @param executantType
     */
    // @RisServiceMethod(MethodType.QUERY)
    void getReportPageCount(final Rl02510DTO rl02510DTO, final ExecutantType executantType);

    /**
     * 列印「戶籍謄本核發」資料.
     * 
     * @param rl02510DTO
     * @param executantType
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    void doPrint(final Rl02510DTO rl02510DTO, final ExecutantType executantType);

    /**
     * 刪除戶口名簿核發XLDF資料.
     * 
     * @param pOpeningOperationDTO
     *            the opening operation dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.DELETE)
    void doDelete(final Rl02510DTO rl02510DTO, final ExecutantType pExecutantType);

    /**
     * 儲存尚未修改的記事至 XLDF TABLE
     * 
     * @param rl02510DTO
     * @param pExecutantType
     */
    // @RisServiceMethod(MethodType.SAVE)
    void saveBeforeChangeNoteToXLDF(final Rl02510DTO rl02510DTO, final ExecutantType pExecutantType);

    /**
     * 檢核戶口名簿封面編號
     * 
     * @param rl02510DTO
     * @param pExecutantType
     */
    void checkCoverNo(final Rl02510DTO rl02510DTO, final ExecutantType pExecutantType);

    /**
     * 刪除 XLDF018D 請領紀錄
     * 
     * @param rl02510DTO
     * @param pExecutantType
     */
    void doDeleteXLDF018D(final Rl02510DTO rl02510DTO, final ExecutantType pExecutantType);

}
