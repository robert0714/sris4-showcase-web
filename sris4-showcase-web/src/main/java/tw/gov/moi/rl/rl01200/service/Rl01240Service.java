/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl01200.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.domain.Rl01240DTO;
import tw.gov.moi.rl.domain.TempFileDTO;

/**
 * 離婚登記服務介面.
 * 
 * @author josh
 */
public interface Rl01240Service {

    /** 服務名稱. */
    public static final String SERVICE_NAME = "離婚登記";

    /** 資料區名稱:RLRPA0004 */
    public static final String RLRPA0004 = "RLRPA0004";

    /** 類別名稱. */
    public static final String CLASS_NAME = "Rl01240ServiceImpl";

    /** 申請書類別. */
    public static final String APPLYCODE = RlConstant.STRING_ZERO_ZERO_FOUR;

    /** 作業代碼. */
    public static final String OPERATION = "01240";

    /** 錯誤函數:initLoadPage. */
    public static final String INITLOADPAGE = SERVICE_NAME + " initLoadPage";

    /** 錯誤函數:initOperationDTO. */
    public static final String INITOPERATIONDTO = SERVICE_NAME + " initOperationDTO";

    /** 錯誤函數:initOperationService. */
    public static final String INITOPERATIONSERVICE = SERVICE_NAME + " initOperationService";

    /** 錯誤函數:loadOperationDTO. */
    public static final String LOADOPERATIONDTO = SERVICE_NAME + " loadOperationDTO";

    /** 錯誤函數:reviewOperationDTO. */
    public static final String REVIEWOPERATIONDTO = SERVICE_NAME + " reviewOperationDTO";

    /** 錯誤函數:getSpouseDataService. */
    public static final String GETSPOUSEDATASERVICE = SERVICE_NAME + " getSpouseDataService";

    /** 錯誤函數:queryKinshipRelation. */
    public static final String QUERYKINSHIPRELATION = SERVICE_NAME + " queryKinshipRelation";

    /** 錯誤函數:queryForeignData. */
    public static final String QUERYFOREIGNDATA = SERVICE_NAME + " queryForeignData";

    /** 錯誤函數:setNeedLawAgentAgree. */
    public static final String SETNEEDLAWAGENTAGREE = SERVICE_NAME + " setNeedLawAgentAgree";

    /** 錯誤函數:getChildList. */
    public static final String GETCHILDLIST = SERVICE_NAME + " getChildList";

    /** 錯誤函數:doDelete. */
    public static final String DODELETE = SERVICE_NAME + " doDelete";

    /** 錯誤函數:doFineCheckAndCleanOldFine. */
    public static final String DOFINECHECKANDCLEANOLDFINE = SERVICE_NAME + " doFineCheckAndCleanOldFine";

    /** 錯誤函數:deleteAppData. */
    public static final String DELETEAPPDATA = SERVICE_NAME + " deleteAppData";

    /** 錯誤函數:getFineList. */
    public static final String GETFINELIST = SERVICE_NAME + " getFineList";

    /** 錯誤函數:editFine. */
    public static final String EDITFINE = SERVICE_NAME + " editFine";

    /** 錯誤函數:deleteFine. */
    public static final String DELETEFINE = SERVICE_NAME + " deleteFine";

    /** 錯誤函數:showErrorMessage. */
    public static final String SHOWERRORMESSAGE = SERVICE_NAME + " showErrorMessage";

    /** 錯誤函數:verifyAppData. */
    public static final String VERIFYAPPDATA = SERVICE_NAME + " verifyAppData";

    /** 錯誤函數:verifyData. */
    public static final String VERIFYDATA = SERVICE_NAME + " verifyData";

    /** 錯誤函數:autoNotes. */
    public static final String AUTONOTES = SERVICE_NAME + " autoNotes";

    /** 錯誤函數:saveXldf. */
    public static final String SAVEXLDF = SERVICE_NAME + " saveXldf";

    /** 錯誤函數:lockRCDF001MRL. */
    public static final String LOCKRCDF001MRL = SERVICE_NAME + " lockRCDF001MRL";

    /** 錯誤函數:createXLDFPersonData. */
    public static final String CREATEXLDFPERSONDATA = SERVICE_NAME + " createXLDFPersonData";

    /** 錯誤函數:createXLDFPersonNote. */
    public static final String CREATEXLDFPERSONNOTE = SERVICE_NAME + " createXLDFPersonNote";

    /** 錯誤函數:createXLDFY004M. */
    public static final String CREATEXLDFY004M = SERVICE_NAME + " createXLDFY004M";

    /** 錯誤函數:createXLDF2A10. */
    public static final String CREATEXLDF2A10 = SERVICE_NAME + " createXLDF2A10";

    /** 錯誤函數:createXLDF088T. */
    public static final String CREATEXLDF088T = SERVICE_NAME + " createXLDF088T";

    /** 錯誤函數:createXLDFM02M. */
    public static final String CREATEXLDFM02M = SERVICE_NAME + " createXLDFM02M";

    /** 錯誤函數:createXLDFM02H. */
    public static final String CREATEXLDFM02H = SERVICE_NAME + " createXLDFM02H";

    /** 錯誤函數:createXCDF001MRL. */
    public static final String CREATEXCDF001MRL = SERVICE_NAME + " createXCDF001MRL";

    /** 錯誤函數:createXLDFS003. */
    public static final String CREATEXLDFS003 = SERVICE_NAME + " createXLDFS003";

    /** 錯誤函數:createXLDFS004. */
    public static final String CREATEXLDFS004 = SERVICE_NAME + " createXLDFS004";

    /** 錯誤函數:createXLDFW004. */
    public static final String CREATEXLDFW004 = SERVICE_NAME + " createXLDFW004";

    /** 錯誤函數:createXLDF008S. */
    public static final String CREATEXLDF008S = SERVICE_NAME + " createXLDF008S";

    /** 錯誤函數:createXLDF016S. */
    public static final String CREATEXLDF016S = SERVICE_NAME + " createXLDF016S";

    /** 錯誤函數:createXLDFR004. */
    public static final String CREATEXLDFR004 = SERVICE_NAME + " createXLDFR004";

    /** 錯誤函數:createXLDF009S. */
    public static final String CREATEXLDF009S = SERVICE_NAME + " createXLDF009S";

    /** 錯誤函數:createXLDFW003. */
    public static final String CREATEXLDFW003 = SERVICE_NAME + " createXLDFW003";

    /** 錯誤函數:createXLDF026S. */
    public static final String CREATEXLDF026S = SERVICE_NAME + " createXLDF026S";

    /** 錯誤函數:createXLDFM10M. */
    public static final String CREATEXLDFM10M = SERVICE_NAME + " createXLDFM10M";

    /** 錯誤函數:createXLDFM10H. */
    public static final String CREATEXLDFM10H = SERVICE_NAME + " createXLDFM10H";

    /** 錯誤函數:saveKinshipDataObject. */
    public static final String SAVEKINSHIPDATAOBJECT = SERVICE_NAME + " saveKinshipDataObject";

    /** The Constant ERROR_MSG_3. */
    public static final String ERROR_MSG_3 = "請輸入夫-教育程度註記";

    /** The Constant ERROR_MSG_4. */
    public static final String ERROR_MSG_4 = "請輸入夫-兼具他國國籍名稱";

    /** The Constant ERROR_MSG_5. */
    public static final String ERROR_MSG_5 = "請輸入夫-兼具他國國籍英文姓名";

    /** The Constant ERROR_MSG_6. */
    public static final String ERROR_MSG_6 = "請輸入夫-西元出生日期";

    /** The Constant ERROR_MSG_7. */
    public static final String ERROR_MSG_7 = "請輸入夫-僑居";

    /** The Constant ERROR_MSG_10. */
    public static final String ERROR_MSG_10 = "請輸入妻-教育程度註記";

    /** The Constant ERROR_MSG_11. */
    public static final String ERROR_MSG_11 = "請輸入妻-兼具他國國籍名稱";

    /** The Constant ERROR_MSG_12. */
    public static final String ERROR_MSG_12 = "請輸入妻-兼具他國國籍英文姓名";

    /** The Constant ERROR_MSG_13. */
    public static final String ERROR_MSG_13 = "請輸入妻-西元出生日期";

    /** The Constant ERROR_MSG_14. */
    public static final String ERROR_MSG_14 = "請輸入妻-僑居";

    /** The Constant ERROR_MSG_17. */
    public static final String ERROR_MSG_17 = "請輸入國外離婚通報日期";

    /** The Constant ERROR_MSG_18. */
    public static final String ERROR_MSG_18 = "請輸入離婚生效日期";

    /** The Constant ERROR_MSG_19. */
    public static final String ERROR_MSG_19 = "請輸入離婚申請日期";

    /** The Constant ERROR_MSG_20. */
    public static final String ERROR_MSG_20 = "請輸入其他之附繳證件";

    /** The Constant ERROR_MSG_21. */
    public static final String HUSBAND = "(離婚者-夫)";

    /** The Constant ERROR_MSG_22. */
    public static final String WIFE = "(離婚者-妻)";

    /** The Constant ERROR_MSG_21. */
    public static final String ERROR_MSG_23 = "請輸入夫-外籍者英文姓名";

    /** The Constant ERROR_MSG_22. */
    public static final String ERROR_MSG_24 = "請輸入妻-外籍者英文姓名";

    /** 錯誤訊息:請輸入身分證統一編號. */
    public static final String ERROR_MSG_PERSONID = "請輸入身分證統一編號";

    /** 錯誤訊息:請輸入外籍者英文姓名. */
    public static final String ERROR_MSG_FOREIGNNAME = "請輸入外籍者英文姓名";

    /** 錯誤訊息:請輸入(原屬)國籍. */
    public static final String ERROR_MSG_NATIONALITYCODE = "請輸入(原屬)國籍";

    /** 錯誤訊息:請輸入西元出生日期. */
    public static final String ERROR_MSG_FOREIGNBIRTHYYYYMMDD = "請輸入西元出生日期";

    /** 錯誤訊息:請輸入僑居. */
    public static final String ERROR_MSG_OVERSEAPLACE = "請輸入僑居";

    /** 錯誤訊息:請擇一輸入護照號碼、統一證號、其他證號. */
    public static final String ERROR_MSG_FOREIGN = "請擇一輸入護照號碼、統一證號、其他證號";

    /** 錯誤訊息:繼續修改離婚申請日期?. */
    public static final String ERROR_MSG_DIV_APYYYMMDD = "繼續修改離婚申請日期?";

    /** 錯誤訊息:請輸入其他離婚地點. */
    public static final String ERROR_MSG_OTHERDEVPLACE = "請輸入其他離婚地點";

    /** 錯誤訊息:請輸入其他之附繳證件. */
    public static final String ERROR_MSG_OTHERCERTIFICATE = "請輸入其他之附繳證件";

    /** 錯誤訊息:請輸入事件發生(確定)日. */
    public static final String ERROR_MSG_FINEEVENTDATE = "請輸入事件發生(確定)日";

    /** 錯誤訊息:請輸入免罰原因. */
    public static final String ERROR_MSG_REMOVEFEEREASON = "請輸入免罰原因";

    /** 錯誤訊息:未婚不得辦理離婚登記. */
    public static final String ERROR_MSG_MARRIAGECODE = "未婚不得辦理離婚登記";

    /** 錯誤訊息:兩願離婚不可辦理逕為離婚登記. */
    public static final String ERROR_MSG_ENFORCED = "兩願離婚不可辦理逕為離婚登記";

    /** 錯誤訊息:未滿18歲. */
    public static final String ERROR_MSG_AGE_NOT_18 = "未滿18歲";

    /** 錯誤訊息:未滿18歲且喪偶. */
    public static final String ERROR_MSG_AGE_NOT_18_WIDOWED = "未滿18歲且喪偶";

    /** 錯誤訊息:未滿18歲且離婚. */
    public static final String ERROR_MSG_AGE_NOT_18_DEV = "未滿18歲且離婚";

    /** 錯誤訊息:未滿16歲. */
    public static final String ERROR_MSG_AGE_NOT_16 = "未滿16歲";

    /** 錯誤訊息:未滿16歲且喪偶. */
    public static final String ERROR_MSG_AGE_NOT_16_WIDOWED = "未滿16歲且喪偶";

    /** 錯誤訊息:未滿16歲且離婚. */
    public static final String ERROR_MSG_AGE_NOT_16_DEV = "未滿16歲且離婚";

    /** 錯誤訊息:請輸入兼具他國國籍名稱. */
    public static final String ERROR_MSG_NATIONALITY = "請輸入兼具他國國籍名稱";

    /** 錯誤訊息:請輸入兼具他國國籍英文姓名. */
    public static final String ERROR_MSG_NATIONENAME = "請輸入兼具他國國籍英文姓名";

    /** 錯誤訊息:(原屬)國籍不能為中華民國 */
    public static final String ERROR_MSG_NOT_CT = "(原屬)國籍不能為中華民國";

    /** 錯誤訊息:性別錯誤 */
    public static final String ERROR_MSG_GENDER = "性別錯誤";

    /** 錯誤訊息:請選擇補登統號 */
    public static final String ERROR_MSG_FOREIGN_PERSON = "請選擇補登統號";

    /** 錯誤訊息:請確認個人基本資料正確無誤 */
    public static final String ERROR_MSG_PERSON = "請確認個人基本資料正確無誤";

    /** 錯誤訊息:未複製除戶日期時間 */
    public static final String ERROR_MSG_REMOVE = "未複製除戶日期時間";

    /**
     * 執行Contoller loadPage() 的第一個Service之共用邏輯.
     * 
     * @param dto
     *            離婚登記DTO
     * @param exec
     *            ExecutantType
     * @throws RisBusinessException
     *             執行程式失敗
     */
    public void initLoadPage(final Rl01240DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 離婚登記-取得離婚者資料.
     * 
     * @param dto
     *            離婚登記DTO
     * @param exec
     *            ExecutantType
     * @throws RisBusinessException
     *             執行程式失敗
     */
    @RisServiceMethod(MethodType.QUERY)
    public void getSpouseData(Rl01240DTO dto, ExecutantType exec) throws RisBusinessException;

    /**
     * 離婚登記-取消執行離婚登記.
     * 
     * @param dto
     *            離婚登記DTO
     * @param exec
     *            ExecutantType
     * @throws RisBusinessException
     *             執行程式失敗
     */
    public void doDelete(Rl01240DTO dto, ExecutantType exec) throws RisBusinessException;

    /**
     * 離婚登記-執行資料驗證並自動組合記事.
     * 
     * @param dto
     *            離婚登記DTO
     * @param exec
     *            ExecutantType
     * @throws RisBusinessException
     *             執行程式失敗
     */
    public void verifyAppData(Rl01240DTO dto, ExecutantType exec) throws RisBusinessException;

    /**
     * 離婚登記-暫存離婚登記申請資料至XLDF Table.
     * 
     * @param dto
     *            離婚登記DTO
     * @param exec
     *            ExecutantType
     * @throws RisBusinessException
     *             執行程式失敗
     */
    @RisServiceMethod(value = MethodType.SAVE2TEMP)
    @WorkStatus(FinalType.TEMP_FINAL)
    public void saveXldf(Rl01240DTO dto, ExecutantType exec) throws RisBusinessException;

    /**
     * 顯示離婚登記畫面.
     * 
     * @param dto
     *            離婚登記DTO
     * @param exec
     *            ExecutantType
     * @throws RisBusinessException
     *             執行程式失敗
     */
    @RisServiceMethod(MethodType.QUERY)
    public void initOperationDTO(Rl01240DTO dto, ExecutantType exec) throws RisBusinessException;

    /**
     * 編輯狀態時載入離婚登記DTO.
     * 
     * @param dto
     *            離婚登記DTO
     * @param exec
     *            ExecutantType
     * @throws RisBusinessException
     *             執行程式失敗
     */
    public void loadOperationDTO(Rl01240DTO dto, ExecutantType exec) throws RisBusinessException;

    /**
     * 再次驗證狀態時載入離婚登記DTO.
     * 
     * @param dto
     *            離婚登記DTO
     * @param exec
     *            ExecutantType
     * @throws RisBusinessException
     *             執行程式失敗
     */
    public Rl01240DTO reviewOperationDTO(Rl01240DTO dto, ExecutantType exec) throws RisBusinessException;

    /**
     * 顯示系統錯誤例外訊息.
     * 
     * @param dto
     *            離婚登記DTO
     * @param exec
     *            ExecutantType
     * @throws RisBusinessException
     *             執行程式失敗
     */
    public void showErrorMessage(final Rl01240DTO dto, ExecutantType exec) throws RisBusinessException;

    /**
     * 將DTO物件序列化成檔案.
     * 
     * @param tempFileDTO
     *            暫存DTO
     * @param exec
     *            ExecutantType
     */
    public void saveTempFile(final TempFileDTO<Rl01240DTO> tempFileDTO, final ExecutantType exec);

    /**
     * 將DTO檔案反序列化成DTO物件.
     * 
     * @param tempFileDTO
     *            暫存DTO
     * @param exec
     *            ExecutantType
     * @return 離婚撤銷登記DTO
     */
    public Rl01240DTO loadTempFile(final TempFileDTO<Rl01240DTO> tempFileDTO, final ExecutantType exec);

}
