package tw.gov.moi.rl.rl0w100.service;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl0w100DTO;;

/**
 * Rl0w100Service Interface
 * 
 * @author josh
 */
public interface Rl0w100Service {
	/** The Constant STAR. */
	static final String STAR = "*";
	/** 服務名稱. */
	static final String SERVICE_NAME = "現無戶籍者結離婚登記";

	/** The Constant ERROR_METHOD_1. */
	static final String ERROR_METHOD_1 = SERVICE_NAME + " createXLDF088T";

	/** The Constant ERROR_METHOD_2. */
	static final String ERROR_METHOD_2 = SERVICE_NAME + " createXLDFM10M";

	/** The Constant ERROR_METHOD_3. */
	static final String ERROR_METHOD_3 = SERVICE_NAME + " createXLDFS0Z4";

	/** The Constant ERROR_METHOD_4. */
	static final String ERROR_METHOD_4 = SERVICE_NAME + " createXLDFS0Z5";

	/** The Constant ERROR_METHOD_5. */
	static final String ERROR_METHOD_5 = SERVICE_NAME + " createXLDF008S";

	/** The Constant ERROR_METHOD_6. */
	static final String ERROR_METHOD_6 = SERVICE_NAME + " createXLDF016S";

	/** The Constant ERROR_METHOD_7. */
	static final String ERROR_METHOD_7 = SERVICE_NAME + " initOperationDTO";

	/** The Constant ERROR_METHOD_8. */
	static final String ERROR_METHOD_8 = SERVICE_NAME + " loadOperationDTO";

	/** The Constant ERROR_METHOD_9. */
	static final String ERROR_METHOD_9 = SERVICE_NAME + " reviewOperationDTO";

	/** The Constant ERROR_METHOD_10. */
	static final String ERROR_METHOD_10 = SERVICE_NAME + " queryForeignData";

	/** The Constant ERROR_METHOD_11. */
	static final String ERROR_METHOD_11 = SERVICE_NAME
			+ " setNeedLawAgentAgree";

	/** The Constant ERROR_METHOD_12. */
	static final String ERROR_METHOD_12 = SERVICE_NAME + " doDelete";

	/** The Constant ERROR_METHOD_13. */
	static final String ERROR_METHOD_13 = SERVICE_NAME + " verifyAppData";

	/** The Constant ERROR_METHOD_14. */
	static final String ERROR_METHOD_14 = SERVICE_NAME + " saveXldf";

	/** The Constant ERROR_METHOD_15. */
	static final String ERROR_METHOD_15 = "現無戶籍者結(離)婚登記畫面失敗";

	/** The Constant ERROR_METHOD_16. */
	static final String ERROR_METHOD_16 = "夫之原屬國籍";

	/** The Constant ERROR_METHOD_17. */
	static final String ERROR_METHOD_17 = "妻之原屬國籍";

	/** The Constant ERROR_METHOD_18. */
	static final String ERROR_METHOD_18 = "暫存現無戶籍者結(離)婚登記申請資料至XLDF Table失敗";

	/** The Constant ERROR_METHOD_16. */
	static final String ERROR_METHOD_19 = "夫之個人基本資料";

	/** The Constant ERROR_METHOD_17. */
	static final String ERROR_METHOD_20 = "妻之個人基本資料";
	/** 方法執行錯誤訊息 */
	final static String E_MSG_SAVE_XLDFM10M = "執行暫存createXLDFM10M失敗";

	/** 方法執行錯誤訊息 */
	final static String E_MSG_SAVE_XLDF016S = "執行暫存createXLDF016S失敗";

	/** 方法執行錯誤訊息 */
	final static String E_MSG_SAVE_XLDF008S = "執行暫存createXLDF008S失敗";

	/** 方法執行錯誤訊息 */
	final static String E_MSG_SAVE_XLDF008T = "執行暫存createXLDF008T失敗";

	/** 方法執行錯誤訊息 */
	final static String E_MSG_SAVE_XLDFM02M = "執行暫存createXLDFM02M失敗";

	/** 方法執行錯誤訊息 */
	final static String E_MSG_SAVE_XLDF001M = "執行暫存createXLDF001M失敗";

	/** 方法執行錯誤訊息 */
	final static String E_MSG_SAVE_XLDFS0Z4 = "執行暫存createXLDFS0Z4失敗";

	/** 方法執行錯誤訊息 */
	final static String E_MSG_SAVE_XLDFS0Z5 = "執行暫存createXLDFS0Z5失敗";

	/** 檢核邏輯錯誤訊息 */
	String ERROR_MSG_1 = "請輸入(原屬)國籍內容";

	/** 檢核邏輯錯誤訊息 */
	String ERROR_MSG_2 = "原屬國籍不可為空白";

	/** 檢核邏輯錯誤訊息 */
	String ERROR_MSG_3 = "原屬國籍不可為[001]~[005]";

	/** 檢核邏輯錯誤訊息 */
	String ERROR_MSG_4 = "(原屬)國籍須為無戶籍國民";

	/** 檢核邏輯錯誤訊息 */
	String ERROR_MSG_5 = "(原屬)國籍須為香港或澳門";

	/** 檢核邏輯錯誤訊息 */
	String ERROR_MSG_6 = "(原屬)國籍須為中國大陸";

	/**
	 * 初始化現無戶籍者結離婚登記
	 * 
	 * @param Rl0w100DTO
	 * @param ExecutantType
	 * @throws RisBusinessException
	 * */
	@RisServiceMethod(MethodType.SAVE)
	public void initOperationDTO(Rl0w100DTO dto, ExecutantType exec)
			throws RisBusinessException;

	/**
	 * 編輯狀態時載入現無戶籍者結離婚登記
	 * 
	 * @param Rl0w100DTO
	 * @param ExecutantType
	 * @throws RisBusinessException
	 * */
	@RisServiceMethod(MethodType.SAVE)
	public Rl0w100DTO loadOperationDTO(Rl0w100DTO dto, ExecutantType exec)
			throws RisBusinessException;

	/**
	 * 再次驗證狀態時載入現無戶籍者結離婚登記
	 * 
	 * @param Rl0w100DTO
	 * @param ExecutantType
	 * @throws RisBusinessException
	 * */
	@RisServiceMethod(MethodType.SAVE)
	public Rl0w100DTO reviewOperationDTO(Rl0w100DTO dto, ExecutantType exec)
			throws RisBusinessException;

	/**
	 * 設定須法定代理人同意
	 * 
	 * @param Rl0w100DTO
	 *            、executantType
	 * @throws RisBusinessException
	 */
	@RisServiceMethod(MethodType.SAVE)
	public void setNeedLawAgentAgree(Rl0w100DTO dto, ExecutantType exec)
			throws RisBusinessException;

	/**
	 * 刪除現無戶籍者結離婚登記資料
	 * 
	 * @param
	 * @throws RisBusinessException
	 */
	@RisServiceMethod(MethodType.DELETE)
	public void doDelete(Rl0w100DTO dto, ExecutantType exec)
			throws RisBusinessException;

	/**
	 * 執行資料驗證
	 * 
	 * @param Rl0w100DTO
	 *            、executantType
	 * @throws RisBusinessException
	 */
	@RisServiceMethod(MethodType.VERIFY)
	public void verifyAppData(Rl0w100DTO dto, ExecutantType exec)
			throws RisBusinessException;

	/**
	 * 儲存現無戶籍者結離婚登記申請資料至XLDF Table
	 * 
	 * @param Rl0w100DTO
	 * @throws RisBusinessException
	 */
	@RisServiceMethod(MethodType.SAVE2TEMP)
	@WorkStatus(FinalType.TEMP_FINAL)
	public void saveXldf(Rl0w100DTO dto, ExecutantType exec)
			throws RisBusinessException;

	/**
	 * 取得配偶資料
	 * 
	 * @param Rl0w100DTO
	 * @throws RisBusinessException
	 */
	@RisServiceMethod(MethodType.QUERY)
	public void getSpouseData(Rl0w100DTO rl0w100dto, ExecutantType executantType);
}
