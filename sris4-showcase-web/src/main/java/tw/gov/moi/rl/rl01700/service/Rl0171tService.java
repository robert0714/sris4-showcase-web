package tw.gov.moi.rl.rl01700.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.rl.component.dto.OpeningOperationDTO;
import tw.gov.moi.rl.domain.Rl0171tDTO;

/**
 * 父姓名更正登記(批次)服務介面.
 * 
 * @author Jay Kan
 */
public interface Rl0171tService {

    /** 作業代碼 */
    String OPERATION_CODE = "0171T";

    /** 作業名稱. */
    String OPERATION_NAME = "父姓名更正";

    /** 記事例代碼 */
    String AUTO_NOTE_ID = "40A4000003";

    /** 父姓名更正原因代碼 */
    String UPDATE_REASON_RSCD = Rl0171iService.UPDATE_REASON_RSCD;

    /** 父母姓名更正-附繳證件 */
    String CERTIFICATE_RSCD = Rl0171iService.CERTIFICATE_RSCD;

    /** 姓名更正引用法條 */
    String QUOTE_LOW_RSCD = Rl0171iService.QUOTE_LOW_RSCD;

    /** 其他更正原因代碼 */
    String OTHER_UPDATE_REASON_CODE = Rl0171iService.OTHER_UPDATE_REASON_CODE;

    /** 其他附繳證件代碼 */
    String OTHER_CERTIFICATE_CODE = Rl0171iService.OTHER_CERTIFICATE_CODE;

    /** 次分類（申請書類別） */
    String SUB_TYPE = Rl0171iService.SUB_TYPE;

    /** 請輸入更正原因 */
    String UPDATE_REASON_EMPTY_MSG = Rl0171iService.UPDATE_REASON_EMPTY_MSG;

    /** 請輸入其他更正原因 */
    String OTHER_UPDATE_REASON_EMPTY_MSG = Rl0171iService.OTHER_UPDATE_REASON_EMPTY_MSG;

    /** 請輸入更正日期 */
    String UPDATE_YYYMMDD_EMPTY_MSG = Rl0171iService.UPDATE_YYYMMDD_EMPTY_MSG;

    /** 請輸入其他之附繳證件 */
    String OTHER_CERTIFICATE_EMPTY_MSG = Rl0171iService.OTHER_CERTIFICATE_EMPTY_MSG;

    /** 更正日期不可大於系統日期 */
    String UPDATE_DATE_MSG = Rl0171iService.UPDATE_DATE_MSG;

    /** \r\n. */
    String REPLACE_STRING = "\r\n";

    /**
     * 執行Contoller loadPage() 的第一個Service之共用邏輯.
     * 
     * @param pRl0171tDTO
     *            the rl0171t dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.QUERY)
    void initLoadPage(final Rl0171tDTO pRl0171tDTO, final ExecutantType pExecutantType);

    /**
     * 初始化父姓名更正登記.
     * 
     * @param pRl0171tDTO
     *            the rl0171t dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    void initOperationDTO(final Rl0171tDTO pRl0171tDTO, final ExecutantType pExecutantType);

    /**
     * 載入父姓名更正登記.
     * 
     * @param pOpeningOperationDTO
     *            the opening operation dto
     * @param pExecutantType
     *            the executant type
     * @return the rl0171t dto
     */
    @RisServiceMethod(MethodType.QUERY)
    Rl0171tDTO loadOperationDTO(final OpeningOperationDTO pOpeningOperationDTO, final ExecutantType pExecutantType);

    /**
     * 再次驗證狀態時載入父姓名更正登記DTO.
     * 
     * @param pOpeningOperationDTO
     *            the opening operation dto
     * @param pExecutantType
     *            the executant type
     * @return the rl0171t dto
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    Rl0171tDTO reviewOperationDTO(final OpeningOperationDTO pOpeningOperationDTO, final ExecutantType pExecutantType);

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
     * @param pRl0171tDTO
     *            the rl0171t dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.VERIFY)
    void verifyAppData(final Rl0171tDTO pRl0171tDTO, final ExecutantType pExecutantType);

    /**
     * 儲存父姓名更正申請資料至XLDF Table.
     * 
     * @param pRl0171tDTO
     *            the rl0171t dto
     * @param pExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    @WorkStatus(FinalType.TEMP_FINAL)
    void saveXLDF(final Rl0171tDTO pRl0171tDTO, final ExecutantType pExecutantType);
}