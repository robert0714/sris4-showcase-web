/*

 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl01g00.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.domain.Rl01g01DTO;
import tw.gov.moi.rl.domain.TempFileDTO;

/**
 * 結婚廢止服務介面.
 * 
 * @author viva.Hong
 */
public interface Rl01g01Service {

    /** 服務名稱. */
    public static final String SERVICE_NAME = "結婚廢止登記";

    /** 資料區名稱:RLRPA00D1 */
    public static final String RLRPA00D1 = "RLRPA00D1";

    /** 類別名稱. */
    public static final String CLASS_NAME = "Rl01g01ServiceImpl";

    /** 結婚廢止登記代碼. */
    public static final String APPLY_CODE = RlConstant.STRING_ZERO_D_ONE;

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

    /** 方法名稱:showErrorMessage. */
    public static final String SHOWERRORMESSAGE = SERVICE_NAME + " showErrorMessage";

    /** 方法名稱:getSpouseDataService. */
    public static final String GETSPOUSEDATASERVICE = SERVICE_NAME + " getSpouseDataService";

    /** 方法名稱:doDelete. */
    public static final String DODELETE = SERVICE_NAME + " doDelete";

    /** 方法名稱:autonotes. */
    public static final String AUTONOTES = SERVICE_NAME + " autonotes";

    /** 方法名稱:verifyAppData. */
    public static final String VERIFYAPPDATA = SERVICE_NAME + " verifyAppData";

    /** 方法名稱:verifyData. */
    public static final String VERIFYDATA = SERVICE_NAME + " verifyData";

    /** 方法名稱:doFineCheckAndCleanOldFine. */
    public static final String DOFINECHECKANDCLEANOLDFINE = SERVICE_NAME + " doFineCheckAndCleanOldFine";

    /** 方法名稱:savexldf. */
    public static final String SAVEXLDF = SERVICE_NAME + " savexldf";

    /** 方法名稱:lockRCDF001MRL. */
    public static final String LOCKRCDF001MRL = SERVICE_NAME + " lockRCDF001MRL";

    /** 方法名稱:saveKinshipDataObject. */
    public static final String SAVEKINSHIPDATAOBJECT = SERVICE_NAME + " saveKinshipDataObject";

    /** 方法名稱:createXLDFPersonData. */
    public static final String CREATEXLDFPERSONDATA = SERVICE_NAME + " createXLDFPersonData";

    /** 方法名稱:createXLDFPersonNote. */
    public static final String CREATEXLDFPERSONNOTE = SERVICE_NAME + " createXLDFPersonNote";

    /** 方法名稱:createXLDFY090M. */
    public static final String CREATEXLDFY090M = SERVICE_NAME + " createXLDFY090M";

    /** 方法名稱:createXLDFY0D1M. */
    public static final String CREATEXLDFY0D1M = SERVICE_NAME + " createXLDFY0D1M";

    /** 方法名稱:createXLDF2A10. */
    public static final String CREATEXLDF2A10 = SERVICE_NAME + " createXLDF2A10";

    /** 方法名稱:createXLDF088T. */
    public static final String CREATEXLDF088T = SERVICE_NAME + " createXLDF088T";

    /** 方法名稱:createXLDFM02M. */
    public static final String CREATEXLDFM02M = SERVICE_NAME + " createXLDFM02M";

    /** 方法名稱:createXLDFM10M. */
    public static final String CREATEXLDFM10M = SERVICE_NAME + " createXLDFM10M";

    /** 方法名稱:createXCDF001MRL. */
    public static final String CREATEXCDF001MRL = SERVICE_NAME + " createXCDF001MRL";

    /** 方法名稱:createXLDFS0D1. */
    public static final String CREATEXLDFS0D1 = SERVICE_NAME + " createXLDFS0D1";

    /** 方法名稱:createXLDF008S. */
    public static final String CREATEXLDF008S = SERVICE_NAME + " createXLDF008S";

    /** 方法名稱:createXLDF016S. */
    public static final String CREATEXLDF016S = SERVICE_NAME + " createXLDF016S";

    /** 方法名稱:createXLDFR0D1. */
    public static final String CREATEXLDFR0D1 = SERVICE_NAME + " createXLDFR0D1";

    /** 方法名稱:createXLDF009S. */
    public static final String CREATEXLDF009S = SERVICE_NAME + " createXLDF009S";

    /** 方法名稱:createXLDFW0D1. */
    public static final String CREATEXLDFW0D1 = SERVICE_NAME + " createXLDFW0D1";

    /** 方法名稱:createXLDF026S. */
    public static final String CREATEXLDF026S = SERVICE_NAME + " createXLDF026S";

    /** 錯誤訊息:結婚者-夫. */
    public static final String HUSBAND = "(結婚廢止者-夫)";

    /** 錯誤訊息:結婚者-妻. */
    public static final String WIFE = "(結婚廢止者-妻)";

    /** 錯誤訊息:請輸入夫-身分證統一編號. */
    public static final String ERROR_MSG_H_PERSONID = "請輸入夫-身分證統一編號";

    /** 錯誤訊息:請輸入夫-教育程度註記. */
    public static final String ERROR_MSG_H_EDUCATIONMARK = "請輸入夫-教育程度註記";

    /** 錯誤訊息:請輸入夫-外籍者英文姓名. */
    public static final String ERROR_MSG_H_FOREIGNNAME = "請輸入夫-外籍者英文姓名";

    /** 錯誤訊息:請輸入妻-身分證統一編號. */
    public static final String ERROR_MSG_W_PERSONID = "請輸入妻-身分證統一編號";

    /** 錯誤訊息:請輸入妻-教育程度註記. */
    public static final String ERROR_MSG_W_EDUCATIONMARK = "請輸入妻-教育程度註記";

    /** 錯誤訊息:請輸入妻-外籍者英文姓名. */
    public static final String ERROR_MSG_W_FOREIGNNAME = "請輸入妻-外籍者英文姓名";

    /** 錯誤訊息:請輸入結婚廢止日期. */
    public static final String ERROR_MSG_DELYYYMMDD = "請輸入結婚廢止日期";

    /** 錯誤訊息:請輸入結婚登記申請日期. */
    public static final String ERROR_MSG_MRGMULTIFLAG = "請輸入多段婚姻";

    /** 錯誤訊息:請輸入結婚登記申請日期. */
    public static final String ERROR_MSG_MRGAPPLYDATE = "請輸入結婚登記申請日期";

    /** 錯誤訊息:請輸入廢止原因. */
    public static final String ERROR_MSG_DELREASON = "請輸入廢止原因";

    /** 錯誤訊息:請輸入原登記事項. */
    public static final String ERROR_MSG_BEFOREWORK = "請輸入原登記事項";

    /** 錯誤訊息:請輸入附繳證件. */
    public static final String ERROR_MSG_CERTIFICATE = "請輸入附繳證件";

    /** 錯誤訊息:請輸入其他之附繳證件. */
    public static final String ERROR_MSG_OTHERCERTIFICATE = "請輸入其他之附繳證件";

    /** 錯誤訊息:夫妻村里均為空白時請先以192補登村里. */
    public static final String ERROR_MSG_VILLAGE = "夫妻村里均為空白時請先以192補登村里";

    /** 錯誤訊息:(原屬)國籍不能為中華民國. */
    public static final String ERROR_MSG_NATIONALITYCODE = "(原屬)國籍不能為中華民國";

    /** 錯誤訊息:請輸入事件發生(確定)日. */
    public static final String ERROR_MSG_FINEEVENTDATE = "請輸入事件發生(確定)日";

    /** 錯誤訊息:請輸入免罰原因. */
    public static final String ERROR_MSG_REMOVEFEEREASON = "請輸入免罰原因";

    /** 錯誤訊息:性別錯誤 */
    public static final String ERROR_MSG_GENDER = "性別錯誤";

    /** 錯誤訊息:請選擇補登統號 */
    public static final String ERROR_MSG_FOREIGN_PERSON = "請選擇補登統號";

    /** 錯誤訊息:請確認個人基本資料正確無誤 */
    public static final String ERROR_MSG_PERSON = "請確認個人基本資料正確無誤";

    /**
     * 執行Contoller loadPage() 的第一個Service之共用邏輯.
     * 
     * @param dto
     *            結婚廢止登記DTO
     * @param exec
     *            ExecutantType
     * @throws RisBusinessException
     *             執行程式失敗
     */
    public void initLoadPage(final Rl01g01DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 第一次呼叫狀態時載入結婚撤销登記DTO.
     * 
     * @param dto
     *            結婚廢止登記DTO
     * @param exec
     *            ExecutantType
     * @return the rl01g01 dto
     * @throws RisBusinessException
     *             執行程式失敗
     */
    @RisServiceMethod(value = MethodType.QUERY)
    public Rl01g01DTO initOperationDTO(final Rl01g01DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 編輯狀態時載入結婚撤销登記DTO.
     * 
     * @param dto
     *            結婚廢止登記DTO
     * @param exec
     *            ExecutantType
     * @return the rl01g01 dto
     * @throws RisBusinessException
     *             執行程式失敗
     */
    public Rl01g01DTO loadOperationDTO(final Rl01g01DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 再次驗證狀態時載入結婚撤销登記DTO.
     * 
     * @param dto
     *            結婚廢止登記DTO
     * @param exec
     *            ExecutantType
     * @return the rl01g01 dto
     * @throws RisBusinessException
     *             執行程式失敗
     */
    public Rl01g01DTO reviewOperationDTO(final Rl01g01DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 顯示系統錯誤例外訊息.
     * 
     * @param dto
     *            結婚廢止登記DTO
     * @param exec
     *            ExecutantType
     * @throws RisBusinessException
     *             執行程式失敗
     */
    public void showErrorMessage(final Rl01g01DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 取得結婚撤銷者資料(建立DB Transaction).
     * 
     * @param dto
     *            結婚廢止登記DTO
     * @param exec
     *            ExecutantType
     * @return the spouse data
     * @throws RisBusinessException
     *             執行程式失敗
     */
    @RisServiceMethod(value = MethodType.QUERY)
    public void getSpouseData(final Rl01g01DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 刪除結婚撤销登記資料.
     * 
     * @param dto
     *            結婚廢止登記DTO
     * @param exec
     *            ExecutantType
     * @throws RisBusinessException
     *             執行程式失敗
     */
    public void doDelete(final Rl01g01DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 執行資料驗證並自動組合記事.
     * 
     * @param dto
     *            結婚廢止登記DTO
     * @param exec
     *            ExecutantType
     * @throws RisBusinessException
     *             執行程式失敗
     */
    public void verifyAppData(final Rl01g01DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 暫存結婚撤销登記申請資料至XLDF Table.
     * 
     * @param dto
     *            結婚廢止登記DTO
     * @param exec
     *            ExecutantType
     * @throws RisBusinessException
     *             執行程式失敗
     */
    @RisServiceMethod(value = MethodType.SAVE2TEMP)
    @WorkStatus(FinalType.TEMP_FINAL)
    public void saveXldf(final Rl01g01DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 將DTO物件序列化成檔案.
     * 
     * @param tempFileDTO
     *            暫存DTO
     * @param exec
     *            ExecutantType
     */
    public void saveTempFile(final TempFileDTO<Rl01g01DTO> tempFileDTO, final ExecutantType exec);

    /**
     * 將DTO檔案反序列化成DTO物件.
     * 
     * @param tempFileDTO
     *            暫存DTO
     * @param exec
     *            ExecutantType
     * @return 結婚廢止登記DTO
     */
    public Rl01g01DTO loadTempFile(final TempFileDTO<Rl01g01DTO> tempFileDTO, final ExecutantType exec);
}
