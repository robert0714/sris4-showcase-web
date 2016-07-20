package tw.gov.moi.rl.rl02800.service;

import java.util.List;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.domain.Rlde207wType;
import tw.gov.moi.domain.Rlde208wType;
import tw.gov.moi.domain.Rlde210wType;
import tw.gov.moi.domain.Rldfd003Type;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl02800DTO;

/**
 * 英文戶籍謄本核發服務
 * 
 * @author Andy
 * 
 */
public interface Rl02800Service {

    public static final String QUERY_RLDE205W = "rl02100.getRlde205w";

    public static final String QUERY_RLDF003Y = "rl02800.getRldf003y";

    public static final String QUERY_RLDF004Y = "rl02800.getRldf004y";

    public static final String QUERY_RLDF005Y = "rl02800.getRldf005y";

    public static final String QUERY_RLDF006Y = "rl02800.getRldf006y";

    public static final String QUERY_RLDF007Y = "rl02800.getRldf007y";

    public static final String QUERY_RLDE207W = "rl02800.getRlde207w";

    public static final String QUERY_RLDE210W = "rl02800.getRlde210w";
    
    public static final String DS_NAME_RLDF209W = "rl01h31.getRlde209w";

    public static final String DS_NAME_RLDF210W = "rl01h31.getRlde210w";

    public static final String DS_NAME_RLDF211W = "rl01h31.getRlde211w";

    public static final String DS_NAME_RLDF212W = "rl01h31.getRlde212w";

    public static final String DS_NAME_RLDF213W = "rl01h31.getRlde213w";

    public static final String OPERATION_CODE = "02800";

    public static final String RSCD3459 = "RSCD3459";

    public static final String RSCD3224 = "RSCD3224";// 記事主分類

    public static final String RSCD3280 = "RSCD3280";// 記事次分類

    /** 英文戶籍謄本報表代碼 */
    public static final String REPORT_NAME = "RLRP02821";

    static final String GET_FEE = "執行「取得規費」失敗";

    static final String SAVE_PRINT = "執行「儲存列印資料」失敗";

    static final String HOUSEHOLD_PARTIAL = "部分PARTIAL";
    
    static final String HOUSEHOLD_TOTAL = "全戶TOTAL";
    
    static final String HOUSEHOLD_PARTIAL_E = "PARTIAL";
    
    static final String HOUSEHOLD_TOTAL_E = "TOTAL";
    
    static final String ADDRESS_FORMAT = "xxxF, No.xxx, Alley xxx, Lane xxx, Sec.xxx, xxxxxxx Rd./St., Neighborhood xxx, %s, %s";
    
    static final String PRINT_BLANK = "Blank";

    static final String PRINT_REMARKS_OMITTED = "Remarks omitted";

    static final String STATE_CODE = "C";

    static final String ACTION_CODE = "I";

    static final String COMMA = "、";

    static final String SEMICOLON = ";";

    static final String APPLY_CODE = "022";

    static final String RSCD3130 = "RSCD3130";

    static final String RSCD3003 = "RSCD3003";

    static final String TEMP_PERSON_ID = "Y000000000";

    static final String OTHER_PLACE_REG = "99998|99999";
    
    /**
     * 初始化英文戶籍謄本核發資料.
     * 
     * @param rl02800DTO
     *            the rl02800 dto
     * @param executantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.QUERY)
    void initOperationDTO(final Rl02800DTO rl02800DTO, final ExecutantType executantType);

    /**
     * 驗證戶籍謄本核發.
     * 
     * @param Rl02800DTO
     *            the rl02800 dto
     * @param ExecutantType
     *            the executant type
     */
    void verifyData(Rl02800DTO dto, ExecutantType executantType) throws RuntimeException;

    /**
     * 儲存戶籍謄本核發資料至XLDF Table.
     * 
     * @param Rl02800DTO
     *            the rl02800 dto
     * @param ExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE)
    @WorkStatus(FinalType.TEMP_FINAL)
    String saveXldf(Rl02800DTO dto, ExecutantType executantType) throws RuntimeException;


    /**
     * 儲存戶籍謄本核發資料至RLDF Table.
     * 
     * @param Rl02800DTO
     *            the rl02800 dto
     * @param ExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.SAVE)
    void saveRldf(Rl02800DTO dto, ExecutantType executantType) throws RuntimeException;

    /**
     * 儲存列印資料至TLDF table.
     * 
     * @param Rl02800DTO
     *            the rl02800 dto
     * @param ExecutantType
     *            the executant type
     */
    void savePrint(final Rl02800DTO rl02800DTO, final ExecutantType executantType) throws RuntimeException;

    /**
     * 列印「戶籍謄本核發」資料.
     * 
     * @param Rl02800DTO
     *            the rl02800 dto
     * @param ExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.PRINT2TERM)
    void doPrint(final Rl02800DTO rl02800DTO, final ExecutantType executantType) throws RuntimeException;

    /**
     * 取得規費.
     * 
     * @param Rl02800DTO
     *            the rl02800 dto
     * @param ExecutantType
     *            the executant type
     * @return the fee
     */
    String getFee(final Rl02800DTO rl02800DTO, final ExecutantType executantType) throws RuntimeException;

    /**
     * 刪除戶籍謄本核發XLDF資料.
     * 
     * @param OpeningOperationDTO
     *            the opening operation dto
     * @param ExecutantType
     *            the executant type
     */
    @RisServiceMethod(MethodType.DELETE)
    void doDelete(final Rl02800DTO rl02800DTO, final ExecutantType executantType) throws RuntimeException;

    @RisServiceMethod(MethodType.QUERY)
    void loadRemovePeople(Rl02800DTO dto, ExecutantType executantType) throws RisBusinessException;

    public List<Rldfd003Type> doQueryRLDFD003(final Rl02800DTO dto, final ExecutantType executantType) throws RisBusinessException;
    
    public void setChangeEngName(Rl02800DTO dto, ExecutantType executantType);
    
//    public String checkIsVerifyData(Rl02800DTO dto, ExecutantType executantType);
    
    /**
     * 初始化現戶資料
     * @param dto
     * @param executantType
     */
    public void initLivingHousehold(Rl02800DTO dto, ExecutantType executantType);
    
    /**
     * 電腦化前-戶內成員取得出生地英文
     * @param birthPlaceCode
     * @param executantType
     * @return
     */
    public Rlde210wType getRlde210wType(Rl02800DTO dto, ExecutantType executantType);
    
    /**
     * 電腦化前-戶內成員取得稱謂英文
     * @param relationship
     * @param executantType
     * @return
     */
    public Rlde207wType getRlde207wType(Rl02800DTO dto, ExecutantType executantType);
    
    /**
     * 電腦化前-戶內成員取得出生別英文
     * @param birthOrderSex
     * @param executantType
     * @return
     */
    public Rlde208wType getRlde208wType(Rl02800DTO dto, ExecutantType executantType);
    
    /**
     * 取得電腦化前資料
     * @param dto
     * @param executantType
     * @return
     */
    public void loadData(Rl02800DTO dto, ExecutantType executantType);

    /**
     * 翻譯
     * @param dto
     * @param executantType
     * @return
     */
    public void translate(Rl02800DTO dto, ExecutantType executantType);
    
    /**
     * 翻譯地址
     * @param dto
     * @param executantType
     * @return
     */
    public void translateAdderss(Rl02800DTO dto, ExecutantType executantType);

    /**
     * 驗證登錄的選取人員.
     * 
     * @param Rl02800DTO
     *            the rl02800 dto
     * @param ExecutantType
     *            the executant type
     */
    public void verifyPersons(Rl02800DTO dto, ExecutantType executantType);

    /**
     * 電腦化前生日生日轉為 Mon. dd, yyyy 格式.
     * 
     * @param Rl02800DTO
     *            the rl02800 dto
     * @param ExecutantType
     *            the executant type
     */
    public void setBirthMonddyyyy(Rl02800DTO dto, ExecutantType executantType);
}
