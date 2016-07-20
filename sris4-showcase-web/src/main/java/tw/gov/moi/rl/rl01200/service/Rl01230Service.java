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
import tw.gov.moi.rl.domain.Rl01230DTO;
import tw.gov.moi.rl.domain.TempFileDTO;

/**
 * 結婚登記服務介面.
 * 
 * @author Viva.Hong
 */
public interface Rl01230Service {

    /** 服務名稱. */
    public static final String SERVICE_NAME = "結婚登記";

    /** operation code. */
    public static final String OPERATION_CODE = "01230";

    /** 資料區名稱:RLRPA0003 */
    public static final String RLRPA0003 = "RLRPA0003";

    /** 類別名稱. */
    public static final String CLASS_NAME = "Rl01230ServiceImpl";

    /** 結婚登記代碼. */
    public static final String APPLY_CODE = RlConstant.STRING_ZERO_ZERO_THREE;

    /** (非當事人)罰鍰金額. */
    public static final String FEE_AMOUNT = "已";

    /** 方法名稱:initLoadPage. */
    public static final String INITLOADPAGE = SERVICE_NAME + " initLoadPage";

    /** 方法名稱:initOperationDTO. */
    public static final String INITOPERATIONDTO = SERVICE_NAME + " initOperationDTO";

    /** 方法名稱:initOperationService. */
    public static final String INITOPERATIONSERVICE = SERVICE_NAME + " initOperationService";

    /** 方法名稱:loadOperationDTO. */
    public static final String LOADOPERATIONDTO = SERVICE_NAME + " loadOperationDTO";

    /** 方法名稱:reviewOperationDTO. */
    public static final String REVIEWOPERATIONDTO = SERVICE_NAME + " reviewOperationDTO";

    /** 方法名稱:getSpouseDataService. */
    public static final String GETSPOUSEDATASERVICE = SERVICE_NAME + " getSpouseDataService";

    /** 方法名稱:showErrorMessage. */
    public static final String SHOWERRORMESSAGE = SERVICE_NAME + " showErrorMessage";

    /** 方法名稱:queryKinshipRelation. */
    public static final String QUERYKINSHIPRELATION = SERVICE_NAME + " queryKinshipRelation";

    /** 方法名稱:queryForeignData. */
    public static final String QUERYFOREIGNDATA = SERVICE_NAME + " queryForeignData";

    /** 方法名稱:setNeedLawAgentAgree. */
    public static final String SETNEEDLAWAGENTAGREE = SERVICE_NAME + " setNeedLawAgentAgree";

    /** 方法名稱:getChildList. */
    public static final String GETCHILDLIST = SERVICE_NAME + " getChildList";

    /** 方法名稱:doDelete. */
    public static final String DODELETE = SERVICE_NAME + " doDelete";

    /** 方法名稱:getFineList. */
    public static final String GETFINELIST = SERVICE_NAME + " getFineList";

    /** 方法名稱:editFine. */
    public static final String EDITFINE = SERVICE_NAME + " editFine";

    /** 方法名稱:verifyAppData. */
    public static final String DELETEFINE = SERVICE_NAME + " deleteFine";

    /** 方法名稱:verifyAppData. */
    public static final String VERIFYAPPDATA = SERVICE_NAME + " verifyAppData";

    /** 方法名稱:verifyData. */
    public static final String VERIFYDATA = SERVICE_NAME + " verifyData";

    /** 方法名稱:doFineCheckAndCleanOldFine. */
    public static final String DOFINECHECKANDCLEANOLDFINE = SERVICE_NAME + " doFineCheckAndCleanOldFine";

    /** 方法名稱:saveXldf. */
    public static final String SAVEXLDF = SERVICE_NAME + " saveXldf";

    /** 方法名稱:autonotes. */
    public static final String AUTONOTES = SERVICE_NAME + " autonotes";

    /** 方法名稱:lockRCDF001MRL. */
    public static final String LOCKRCDF001MRL = SERVICE_NAME + " lockRCDF001MRL";

    /** 方法名稱:saveKinshipDataObject. */
    public static final String SAVEKINSHIPDATAOBJECT = SERVICE_NAME + " saveKinshipDataObject";

    /** 方法名稱:createXLDFPersonData. */
    public static final String CREATEXLDFPERSONDATA = SERVICE_NAME + " createXLDFPersonData";

    /** 方法名稱:createXLDFPersonNote. */
    public static final String CREATEXLDFPERSONNOTE = SERVICE_NAME + " createXLDFPersonNote";

    /** 方法名稱:createXLDF2A10. */
    public static final String CREATEXLDF2A10 = SERVICE_NAME + " createXLDF2A10";

    /** 方法名稱:createXLDF088T. */
    public static final String CREATEXLDF088T = SERVICE_NAME + " createXLDF088T";

    /** 方法名稱:createXLDFM02M. */
    public static final String CREATEXLDFM02M = SERVICE_NAME + " createXLDFM02M";

    /** 方法名稱:createXLDFM02H. */
    public static final String CREATEXLDFM02H = SERVICE_NAME + " createXLDFM02H";

    /** 方法名稱:createXCDF001MRL. */
    public static final String CREATEXCDF001MRL = SERVICE_NAME + " createXCDF001MRL";

    /** 方法名稱:createXLDFS003. */
    public static final String CREATEXLDFS003 = SERVICE_NAME + " createXLDFS003";

    /** 方法名稱:createXLDF008S. */
    public static final String CREATEXLDF008S = SERVICE_NAME + " createXLDF008S";

    /** 方法名稱:createXLDF016S. */
    public static final String CREATEXLDF016S = SERVICE_NAME + " createXLDF016S";

    /** 方法名稱:createXLDFR003. */
    public static final String CREATEXLDFR003 = SERVICE_NAME + " createXLDFR003";

    /** 方法名稱:createXLDF009S. */
    public static final String CREATEXLDF009S = SERVICE_NAME + " createXLDF009S";

    /** 方法名稱:createXLDFW003. */
    public static final String CREATEXLDFW003 = SERVICE_NAME + " createXLDFW003";

    /** 方法名稱:createXLDF026S. */
    public static final String CREATEXLDF026S = SERVICE_NAME + " createXLDF026S";

    /** 方法名稱:createXLDFY003M. */
    public static final String CREATEXLDFY003M = SERVICE_NAME + " createXLDFY003M";

    /** 方法名稱:createXLDFY003MH. */
    public static final String CREATEXLDFY003MH = SERVICE_NAME + " createXLDFY003MH";

    /** 方法名稱:createXLDFM10M. */
    public static final String CREATEXLDFM10M = SERVICE_NAME + " createXLDFM10M";

    /** 方法名稱:createXLDFM10H. */
    public static final String CREATEXLDFM10H = SERVICE_NAME + " createXLDFM10H";

    /** 錯誤訊息:請輸入身分證統一編號. */
    public static final String ERROR_MSG_PERSONID = "請輸入身分證統一編號";

    /** 錯誤訊息:請輸入兼具他國國籍名稱. */
    public static final String ERROR_MSG_NATIONALITY = "請輸入兼具他國國籍名稱";

    /** 錯誤訊息:請輸入兼具他國國籍英文姓名. */
    public static final String ERROR_MSG_NATIONENAME = "請輸入兼具他國國籍英文姓名";

    /** 錯誤訊息:請輸入西元出生日期. */
    public static final String ERROR_MSG_FOREIGNBIRTHYMD = "請輸入西元出生日期";

    /** 錯誤訊息:請輸入僑居. */
    public static final String ERROR_MSG_OVERSEAPLACE = "請輸入僑居";

    /** 錯誤訊息:請輸入夫-稱謂. */
    public static final String ERROR_MSG_H_RELATIONSHIP = "請輸入夫-稱謂";

    /** 錯誤訊息:請輸入外籍者英文姓名. */
    public static final String ERROR_MSG_FOREIGNNAME = "請輸入外籍者英文姓名";

    /** 錯誤訊息:附繳證件須含有「法定代理人同意書」. */
    public static final String ERROR_MSG_ATTORNEY = "附繳證件須含有「法定代理人同意書」";

    /** 錯誤訊息:請輸入國外結婚通報日期. */
    public static final String FOREIGNMRGYYYMMDD = "請輸入國外結婚通報日期";

    /** 錯誤訊息:請輸入結婚生效日期 */
    public static final String ERROR_MSG_MRGYYYMMDD = "請輸入結婚生效日期";

    /** 錯誤訊息:請輸入結婚申請日期 */
    public static final String ERROR_MSG_APYYYMMDD = "請輸入結婚申請日期";

    /** 錯誤訊息:請輸入其他之附繳證件 */
    public static final String ERROR_MSG_OTHERCERTIFICATE = "請輸入其他之附繳證件";

    /** 結婚者-夫. */
    public static final String HUSBAND = "(結婚者-夫)";

    /** 結婚者-妻. */
    public static final String WIFE = "(結婚者-妻)";

    /** 錯誤訊息:(原屬)國籍不能為中華民國 */
    public static final String ERROR_MSG_NOT_CT = "(原屬)國籍不能為中華民國";

    /** 錯誤訊息:統號不可為空白. */
    public static final String ERROR_MSG_EMPTY = "統號不可為空白";

    /** 錯誤訊息:統號格式錯誤. */
    public static final String ERROR_MSG_REG = "統號格式錯誤";

    /** 錯誤訊息:請輸入事件發生(確定)日. */
    public static final String ERROR_MSG_FINEEVENTDATE = "請輸入事件發生(確定)日";

    /** 錯誤訊息:請輸入免罰原因. */
    public static final String ERROR_MSG_REMOVEFEEREASON = "請輸入免罰原因";

    /** 錯誤訊息:結婚生效日期大於系統年月下一個月份. */
    public static final String ERROR_MSG_NEXT_MRGYYYMMDD = "結婚生效日期大於系統年月下一個月份";

    /** 錯誤訊息:繼續修改結婚申請日期?. */
    public static final String ERROR_MSG_EDIT_APYYYMMDD = "繼續修改結婚登記申請日期?";

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
     *            結婚登記DTO
     * @param exec
     *            ExecutantType
     * @throws RisBusinessException
     *             執行程式失敗
     */
    public void initLoadPage(final Rl01230DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 顯示結婚登記畫面.
     * 
     * @param dto
     *            結婚登記DTO
     * @param exec
     *            ExecutantType
     * @throws RisBusinessException
     *             執行程式失敗
     */
    @RisServiceMethod(value = MethodType.QUERY)
    public void initOperationDTO(final Rl01230DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 編輯狀態時載入結婚登記DTO.
     * 
     * @param dto
     *            結婚登記DTO
     * @param exec
     *            ExecutantType
     * @throws RisBusinessException
     *             執行程式失敗
     */
    public void loadOperationDTO(final Rl01230DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 再次驗證狀態時載入結婚登記DTO.
     * 
     * @param dto
     *            結婚登記DTO
     * @param exec
     *            ExecutantType
     * @throws RisBusinessException
     *             執行程式失敗
     */
    public Rl01230DTO reviewOperationDTO(final Rl01230DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 顯示系統錯誤例外訊息.
     * 
     * @param dto
     *            結婚登記DTO
     * @param exec
     *            ExecutantType
     * @throws RisBusinessException
     *             執行程式失敗
     */
    public void showErrorMessage(final Rl01230DTO dto, ExecutantType exec) throws RisBusinessException;

    /**
     * 取得結婚者資料.
     * 
     * @param dto
     *            結婚登記DTO
     * @param exec
     *            ExecutantType
     * @return the spouse data
     * @throws RisBusinessException
     *             執行程式失敗
     */
    @RisServiceMethod(value = MethodType.QUERY)
    public void getSpouseData(final Rl01230DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 查詢夫與妻之親等關係.
     * 
     * @param dto
     *            結婚登記DTO
     * @param exec
     *            ExecutantType
     * @throws RisBusinessException
     *             執行程式失敗
     */
    public void queryKinshipRelation(final Rl01230DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 設定須法定代理人同意.
     * 
     * @param dto
     *            結婚登記DTO
     * @param exec
     *            ExecutantType
     * @throws RisBusinessException
     *             執行程式失敗
     */
    public void setNeedLawAgentAgree(final Rl01230DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 取得（養）子女資料清單.
     * 
     * @param dto
     *            結婚登記DTO
     * @param executant
     *            the executant
     * @return the child list
     * @throws RisBusinessException
     *             執行程式失敗
     */
    public void getChildList(final Rl01230DTO dto, final ExecutantType executant) throws RisBusinessException;

    /**
     * 刪除結婚登記資料.
     * 
     * @param dto
     *            結婚登記DTO
     * @param exec
     *            ExecutantType
     * @throws RisBusinessException
     *             執行程式失敗
     */
    public void doDelete(final Rl01230DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 執行資料驗證並自動組合記事.
     * 
     * @param dto
     *            結婚登記DTO
     * @param exec
     *            ExecutantType
     * @throws RisBusinessException
     *             執行程式失敗
     */
    public void verifyAppData(final Rl01230DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 儲存結婚登記申請資料至XLDF Table.
     * 
     * @param dto
     *            結婚登記DTO
     * @param exec
     *            ExecutantType
     * @throws RisBusinessException
     *             執行程式失敗
     */
    @RisServiceMethod(value = MethodType.SAVE2TEMP)
    @WorkStatus(FinalType.TEMP_FINAL)
    public void saveXldf(final Rl01230DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 將DTO物件序列化成檔案.
     * 
     * @param tempFileDTO
     *            暫存DTO
     * @param exec
     *            ExecutantType
     */
    public void saveTempFile(final TempFileDTO<Rl01230DTO> tempFileDTO, final ExecutantType exec);

    /**
     * 將DTO檔案反序列化成DTO物件.
     * 
     * @param tempFileDTO
     *            暫存DTO
     * @param exec
     *            ExecutantType
     * @return 結婚登記DTO
     */
    public Rl01230DTO loadTempFile(final TempFileDTO<Rl01230DTO> tempFileDTO, final ExecutantType exec);
}