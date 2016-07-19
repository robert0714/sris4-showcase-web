package tw.gov.moi.rl.rl02d00.service;


import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.domain.Rl02d00DTO;

/**
 * Rl02d00Service Interface
 * 
 * @author josh
 */
public interface Rl02d00Service {
    final String GET_FEE = "執行「取得規費」失敗";
    /**
     * RL0A2000028 結婚證明書 100 張 RL0A2000029 離婚證明書 100 張 RL0A2000030 英文結婚證明書 100 張 RL0A2000031 英文結婚證明書 100 張 /** 規費代碼
     */
    String FEE_CODE_1 = "RL0A2000028";

    /** 規費代碼 */
    String FEE_CODE_2 = "RL0A2000029";

    /** 規費代碼 */
    String FEE_CODE_3 = "RL0A2000030";

    /** 規費代碼 */
    String FEE_CODE_4 = "RL0A2000031";

    /** 中文結婚證明書申請書類別 */
    String APPLY_CODE_1 = "024";

    /** 英文結婚證明書申請書類別 */
    String APPLY_CODE_2 = "025";

    /** 中文離婚證明書申請書類別 */
    String APPLY_CODE_3 = "026";

    /** 英文離婚證明書申請書類別 */
    String APPLY_CODE_4 = "027";

    /** 中文結離婚證明書報表代碼 */
    String REPORT_NAME_A = "RLRP02D0A";

    /** 英文結離婚證明書報表代碼 */
    String REPORT_NAME_B = "RLRP02D0B";

    /** 規費名稱 */
    String FEE_ITEM_1 = "中文結婚證明書";

    /** 規費名稱 */
    String FEE_ITEM_2 = "中文離婚證明書";

    /** 規費名稱 */
    String FEE_ITEM_3 = "英文結婚證明書";

    /** 規費名稱 */
    String FEE_ITEM_4 = "英文離婚證明書";

    String UNIT = "份";
    String LOCATION = "CERT_RPT";
    

    String SAVE_XLDFU003 = "暫存「臨時規費明細檔」失敗";

    /** Constant - Rl012f0ServiceImpl */
    final static String CLASS_NAME = "Rl02d00ServiceImpl";

    /** 服務名稱. */
    static final String SERVICE_NAME = "結離婚證明書核發";

    /** 作業代碼 */
    final static String OPERATION = RlConstant.OPERATION_CODE_02D00;

    /** The Constant ERROR_METHOD_1. */
    static final String ERROR_METHOD_1 = SERVICE_NAME + " initOperationDTO";

    /** The Constant ERROR_METHOD_2. */
    static final String ERROR_METHOD_2 = SERVICE_NAME + " loadOperationDTO";

    /** The Constant ERROR_METHOD_3. */
    static final String ERROR_METHOD_3 = SERVICE_NAME + " reviewOperationDTO";

    /** The Constant ERROR_METHOD_4. */
    static final String ERROR_METHOD_4 = SERVICE_NAME + " doDelete";

    /** The Constant ERROR_METHOD_5. */
    static final String ERROR_METHOD_5 = SERVICE_NAME + " verifyAppData";

    /** The Constant ERROR_METHOD_6. */
    static final String ERROR_METHOD_6 = SERVICE_NAME + " saveXldf";

    /** The Constant ERROR_METHOD_7. */
    static final String ERROR_METHOD_7 = SERVICE_NAME + " createXLDF089T";

    /** The Constant ERROR_METHOD_8. */
    static final String ERROR_METHOD_8 = SERVICE_NAME + " createXLDF009S";

    /** The Constant ERROR_METHOD_9. */
    static final String ERROR_METHOD_9 = SERVICE_NAME + " createXLDFR027";

    /** The Constant ERROR_METHOD_10. */
    static final String ERROR_METHOD_10 = SERVICE_NAME + " createXLDFR026";

    /** The Constant ERROR_METHOD_11. */
    static final String ERROR_METHOD_11 = SERVICE_NAME + " createXLDFR025";

    /** The Constant ERROR_METHOD_21. */
    static final String ERROR_METHOD_12 = SERVICE_NAME + " createXLDFR024";

    /** The Constant ERROR_METHOD_13. */
    static final String ERROR_METHOD_13 = SERVICE_NAME + " createXLDFS027";

    /** The Constant ERROR_METHOD_14. */
    static final String ERROR_METHOD_14 = SERVICE_NAME + " createXLDF008S";

    /** The Constant ERROR_METHOD_15. */
    static final String ERROR_METHOD_15 = SERVICE_NAME + " createXLDF016S";

    /** The Constant ERROR_METHOD_16. */
    static final String ERROR_METHOD_16 = SERVICE_NAME + " createXLDFS026";

    /** The Constant ERROR_METHOD_17. */
    static final String ERROR_METHOD_17 = SERVICE_NAME + " createXLDF009S";

    /** The Constant ERROR_METHOD_18. */
    static final String ERROR_METHOD_18 = SERVICE_NAME + " createXLDFS025";

    /** The Constant ERROR_METHOD_19. */
    static final String ERROR_METHOD_19 = SERVICE_NAME + " createXLDFS024";

    /** The Constant ERROR_METHOD_20. */
    static final String ERROR_METHOD_20 = SERVICE_NAME + " verifyData";

    /** The Constant ERROR_METHOD_21. */
    static final String ERROR_METHOD_21 = " 結離婚地點輸入錯誤";

    /** The Constant ERROR_METHOD_22. */
    static final String ERROR_METHOD_22 = " 結離婚地點不可以為空白";

    /** The Constant ERROR_METHOD_23. */
    static final String ERROR_METHOD_23 = " 請輸入結離婚地點";

    /** The Constant ERROR_METHOD_23. */
    static final String ERROR_METHOD_24 = " 申請人1統號不可與當事人統號相同";

    /** The Constant ERROR_METHOD_23. */
    static final String ERROR_METHOD_25 = " 申請人2統號不可與當事人統號相同";

    /** 方法執行錯誤訊息 */
    final static String E_MSG_SAVE_XLDF089T = "執行暫存createXLDF089T失敗";

    /** 方法執行錯誤訊息 */
    final static String E_MSG_SAVE_XLDF016S = "執行暫存createXLDF016S失敗";

    /** 方法執行錯誤訊息 */
    final static String E_MSG_SAVE_XLDF008S = "執行暫存createXLDF008S失敗";

    /** 方法執行錯誤訊息 */
    final static String E_MSG_SAVE_XLDFS024 = "執行暫存createXLDFS024失敗";

    /** 方法執行錯誤訊息 */
    final static String E_MSG_SAVE_XLDFS025 = "執行暫存createXLDFS025失敗";

    /** 方法執行錯誤訊息 */
    final static String E_MSG_SAVE_XLDFS026 = "執行暫存createXLDFS026失敗";

    /** 方法執行錯誤訊息 */
    final static String E_MSG_SAVE_XLDFS027 = "執行暫存createXLDFS027失敗";

    /** 方法執行錯誤訊息 */
    final static String E_MSG_SAVE_XLDFR024 = "執行暫存createXLDFR024失敗";

    /** 方法執行錯誤訊息 */
    final static String E_MSG_SAVE_XLDFR025 = "執行暫存createXLDFR025失敗";

    /** 方法執行錯誤訊息 */
    final static String E_MSG_SAVE_XLDFR026 = "執行暫存createXLDFR026失敗";

    /** 方法執行錯誤訊息 */
    final static String E_MSG_SAVE_XLDFR027 = "執行暫存createXLDFR027失敗";

    /** 方法執行錯誤訊息 */
    final static String E_MSG_SAVE_XLDF009S = "執行暫存createXLDF009S失敗";
    
    /** 檢核邏輯錯誤訊息 */
	

	/** 檢核邏輯錯誤訊息 */
	String ERROR_MSG_2 = "夫(原屬)國籍不可為空白";

	/** 檢核邏輯錯誤訊息 */
	String ERROR_MSG_3 = "夫(原屬)國籍不可為[001]~[005]";

	/** 檢核邏輯錯誤訊息 */
	String ERROR_MSG_4 = "夫(原屬)國籍須為無戶籍國民";

	/** 檢核邏輯錯誤訊息 */
	String ERROR_MSG_5 = "夫(原屬)國籍須為香港或澳門";

	/** 檢核邏輯錯誤訊息 */
	String ERROR_MSG_6 = "夫(原屬)國籍須為中國大陸";
	

	/** 檢核邏輯錯誤訊息 */
	String ERROR_MSG_8 = "妻(原屬)國籍不可為空白";

	/** 檢核邏輯錯誤訊息 */
	String ERROR_MSG_9 = "妻(原屬)國籍不可為[001]~[005]";

	/** 檢核邏輯錯誤訊息 */
	String ERROR_MSG_10 = "妻(原屬)國籍須為無戶籍國民";

	/** 檢核邏輯錯誤訊息 */
	String ERROR_MSG_11 = "妻(原屬)國籍須為香港或澳門";

	/** 檢核邏輯錯誤訊息 */
	String ERROR_MSG_12 = "妻(原屬)國籍須為中國大陸";
	
	/** The Constant ERROR_MSG_21. */
	 static final String ERROR_MSG_21 = "夫 國籍內容";

	/** The Constant ERROR_MSG_22. */
	 static final String ERROR_MSG_22 = "妻 國籍內容";
	 
    static final String ADDRESS_FORMAT = "xxxF, No.xxx, Alley xxx, Lane xxx, Sec.xxx, xxxxxxx Rd.St., Neighborhood xxx, %s Village, %s";
    static final String ADDRESS_FORMAT_2 = "xxxF, No.xxx, Alley xxx, Lane xxx, Sec.xxx, xxxxxxx Rd.St., Neighborhood xxx, %s , %s";
    /**
     * 顯示結離婚證明書核發畫面
     * 
     * @param HouseholdContextBean
     *            、Rl02d00DTO、executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    public Rl02d00DTO initOperationDTO(final Rl02d00DTO dto,final ExecutantType exec) throws RisBusinessException;

    /**
     * 編輯狀態時載入結離婚證明書核發DTO
     * 
     * @param HouseholdContextBean
     *            、Rl02d00DTO、executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    public Rl02d00DTO loadOperationDTO(final Rl02d00DTO dto,final ExecutantType exec) throws RisBusinessException;

    public void getEnglishNationailty(final Rl02d00DTO dto, final ExecutantType executantType) throws RisBusinessException;
    /**
     * 再次驗證狀態時載入結離婚證明書核發DTO
     * 
     * @param HouseholdContextBean
     *            、Rl02d00DTO、executantType
     * @throws RisBusinessException
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    public Rl02d00DTO reviewOperationDTO(final Rl02d00DTO dto,final ExecutantType exec) throws RisBusinessException;

    /**
     * 結離婚證明書核發-取消執行結離婚證明書核發
     * 
     * @param Rl02d00DTO
     * @param ExecutantType
     * @throws RisBusinessException
     * */
    public void doDelete(final Rl02d00DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 結離婚證明書核發-執行資料驗證並自動組合記事
     * 
     * @param Rl02d00DTO
     * @param ExecutantType
     * @throws RisBusinessException
     * */
    public void verifyAppData(final Rl02d00DTO dto,final ExecutantType exec) throws RisBusinessException;

    /**
     * 結離婚證明書核發-暫存結離婚證明書核發資料至XLDF Table
     * 
     * @param Rl02d00DTO
     * @param ExecutantType
     * @throws RisBusinessException
     * */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    @WorkStatus(FinalType.TEMP_FINAL)
    public void saveXldf(final Rl02d00DTO dto,final ExecutantType exec) throws RisBusinessException;

    /**
     * 結離婚證明書核發-計算規費金額多寡
     * 
     * @param Rl02d00DTO
     * @param ExecutantType
     * @throws RisBusinessException
     * */
    public void getFeePrice(final Rl02d00DTO dto,final ExecutantType exec) throws RisBusinessException;

    /**
     * 結離婚證明書核發-得到個人所有的88t或87t資料
     * 
     * @param Rl02d00DTO
     * @param ExecutantType
     * @throws RisBusinessException
     * */
    @RisServiceMethod(MethodType.QUERY)
    public void getAllRecords(final Rl02d00DTO dto,final  ExecutantType exec) throws RisBusinessException;

    /**
     * 結離婚證明書核發-取得指定所需要的88t或87t資料
     * 
     * @param Rl02d00DTO
     * @param ExecutantType
     * @throws RisBusinessException
     * */
    public void loadRecord(final Rl02d00DTO dto,final ExecutantType exec) throws RisBusinessException;

    
    /*****
     * 結離婚證明書核發-從RC得到結離婚證明書資料(88t或87t資料)
     * 
     * @param Rl02d00DTO
     * @param ExecutantType
     * @throws RisBusinessException
     * ***/
    @RisServiceMethod(MethodType.QUERY)
    public void getAllRecordsFromRc(final Rl02d00DTO rl02d00DTO, final ExecutantType executant) throws RisBusinessException;
    /**
     * 取得配偶資料
     * 
     * @param Rl02d00DTO
     * @param ExecutantType
     * @throws RisBusinessException
     * */
    @RisServiceMethod(MethodType.QUERY)
    public void getSpouseData(final Rl02d00DTO dto, final ExecutantType exec) throws RisBusinessException;
    
    /****
     * 取得英文拼音資料查詢
     * 
     * @param Rl02d00DTO
     * @param ExecutantType
     * @throws RisBusinessException
     * ***/
    public void getQueryResult(final Rl02d00DTO dto,final ExecutantType pExecutantType)throws RisBusinessException;
    
    
    /**
     * 列印證書
     * 
     * @param Rl02d00DTO
     * @param ExecutantType
     * @throws RisBusinessException
     * */
    @RisServiceMethod(MethodType.PRINTLABEL)
    public void printCertification(final Rl02d00DTO dto, final ExecutantType executantType);



    @RisServiceMethod(MethodType.SAVE2TEMP)
    public void preparePrintCertification(final Rl02d00DTO dto, final ExecutantType executantType) ;
}
