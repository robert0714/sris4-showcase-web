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
import tw.gov.moi.rl.domain.Rl01g02DTO;
import tw.gov.moi.rl.domain.TempFileDTO;

/**
 * 離婚廢止登記服務介面.
 * 
 * @author josh
 */
public interface Rl01g02Service {

    /** 作業代碼. */
    public static final String OPERATION = "01G02";

    /** 資料區名稱:RLRPA00D2 */
    public static final String RLRPA00D2 = "RLRPA00D2";

    /** 服務名稱. */
    public static final String SERVICE_NAME = "離婚廢止登記";

    /** 類別名稱. */
    public static final String CLASS_NAME = "Rl01g02ServiceImpl";

    /** 申請書編號. */
    public static final String APPLYCODE = "0D2";

    /** 主分類. */
    public static final String MAIN_TYPE = "G";

    /** 次分類. */
    public static final String SUB_TYPE = "0D2";

    /** 錯誤函數:initOperationDTO. */
    public static final String INITOPERATIONDTO = SERVICE_NAME + " initOperationDTO";

    /** 錯誤函數:initOperationService. */
    public static final String INITOPERATIONSERVICE = SERVICE_NAME + " initOperationService";

    /** 錯誤函數:loadOperationDTO. */
    public static final String LOADOPERATIONDTO = SERVICE_NAME + " loadOperationDTO";

    /** 錯誤函數:reviewOperationDTO. */
    public static final String REVIEWOPERATIONDTO = SERVICE_NAME + " reviewOperationDTO";

    /** 錯誤函數:verifyAppData. */
    public static final String VERIFYAPPDATA = SERVICE_NAME + " verifyAppData";

    /** 錯誤函數:getSpouseData. */
    public static final String GETSPOUSEDATA = SERVICE_NAME + " getSpouseData";

    /** 錯誤函數:getSpouseDataService. */
    public static final String GETSPOUSEDATASERVICE = SERVICE_NAME + " getSpouseDataService";

    /** 錯誤函數:deleteAppData. */
    public static final String DELETEAPPDATA = SERVICE_NAME + " deleteAppData";

    /** 錯誤函數:doDelete. */
    public static final String DODELETE = SERVICE_NAME + " doDelete";

    /** 錯誤函數:saveXldf. */
    public static final String SAVEXLDF = SERVICE_NAME + " saveXldf";

    /** 錯誤函數:autoNotes. */
    public static final String AUTONOTES = SERVICE_NAME + " autoNotes";

    /** 錯誤函數:doFineCheckAndCleanOldFine. */
    public static final String DOFINECHECKANDCLEANOLDFINE = SERVICE_NAME + " doFineCheckAndCleanOldFine";

    /** 錯誤函數:verifyData. */
    public static final String VERIFYDATA = SERVICE_NAME + " verifyData";

    /** 錯誤函數:lockRCDF001MRL. */
    public static final String LOCKRCDF001MRL = SERVICE_NAME + " lockRCDF001MRL";

    /** 錯誤函數:createXLDFPersonData. */
    public static final String CREATEXLDFPERSONDATA = SERVICE_NAME + " createXLDFPersonData";

    /** 錯誤函數:createXLDFM02M. */
    public static final String CREATEXLDFM02M = SERVICE_NAME + " createXLDFM02M";

    /** 錯誤函數:createXLDF026S. */
    public static final String CREATEXLDF026S = SERVICE_NAME + " createXLDF026S";

    /** 錯誤函數:createXLDF009S. */
    public static final String CREATEXLDF009S = SERVICE_NAME + " createXLDF009S";

    /** 錯誤函數:createXLDF016S. */
    public static final String CREATEXLDF016S = SERVICE_NAME + " createXLDF016S";

    /** 錯誤函數:createXLDFPersonNote. */
    public static final String CREATEXLDFPERSONNOTE = SERVICE_NAME + " createXLDFPersonNote";

    /** 錯誤函數:createXLDF008S. */
    public static final String CREATEXLDF008S = SERVICE_NAME + " createXLDF008S";

    /** 錯誤函數:createXLDFS0D2. */
    public static final String CREATEXLDFS0D2 = SERVICE_NAME + " createXLDFS0D2";

    /** 錯誤函數:createXLDFR0D2. */
    public static final String CREATEXLDFR0D2 = SERVICE_NAME + " createXLDFR0D2";

    /** 錯誤函數:createXLDFW0D2. */
    public static final String CREATEXLDFW0D2 = SERVICE_NAME + " createXLDFW0D2";

    /** 錯誤函數:createXLDF2A10. */
    public static final String CREATEXLDF2A10 = SERVICE_NAME + " createXLDF2A10";

    /** 錯誤函數:createXLDFY0D2M. */
    public static final String CREATEXLDFY0D2M = SERVICE_NAME + " createXLDFY0D2M";

    /** 錯誤函數:createXCDF001MRL. */
    public static final String CREATEXCDF001MRL = SERVICE_NAME + " createXCDF001MRL";

    /** 錯誤函數:createXLDFM10M. */
    public static final String CREATEXLDFM10M = SERVICE_NAME + " createXLDFM10M";

    /** 錯誤函數:saveKinshipDataObject. */
    public static final String SAVEKINSHIPDATAOBJECT = SERVICE_NAME + " saveKinshipDataObject";

    /** ERROR METHOD:saveKinshipDataObject. */
    public static final String ERROR_METHOD_SAVEKINSHIPDATAOBJECT = SERVICE_NAME + " saveKinshipDataObject";

    /** The APPLECODE. */
    String APPLECODE = "0D2";

    /** 訊息:(離婚廢止者-夫). */
    public static final String HUSBAND = "(離婚廢止者-夫)";

    /** 訊息:(離婚廢止者-妻). */
    public static final String WIFE = "(離婚廢止者-妻)";

    /** 檢核邏輯錯誤訊息. */
    String ERROR_MSG_1 = "請輸入夫(原屬)國籍內容";

    /** 檢核邏輯錯誤訊息. */
    String ERROR_MSG_2 = "夫(原屬)國籍不可為空白";

    /** 檢核邏輯錯誤訊息. */
    String ERROR_MSG_3 = "夫(原屬)國籍不可為[001]~[005]";

    /** 檢核邏輯錯誤訊息. */
    String ERROR_MSG_4 = "夫(原屬)國籍須為無戶籍國民";

    /** 檢核邏輯錯誤訊息. */
    String ERROR_MSG_5 = "夫(原屬)國籍須為香港或澳門";

    /** 檢核邏輯錯誤訊息. */
    String ERROR_MSG_6 = "夫(原屬)國籍須為中國大陸";

    /** 檢核邏輯錯誤訊息. */
    String ERROR_MSG_7 = "請輸入妻(原屬)國籍內容";

    /** 檢核邏輯錯誤訊息. */
    String ERROR_MSG_8 = "妻(原屬)國籍不可為空白";

    /** 檢核邏輯錯誤訊息. */
    String ERROR_MSG_9 = "妻(原屬)國籍不可為[001]~[005]";

    /** 檢核邏輯錯誤訊息. */
    String ERROR_MSG_10 = "妻(原屬)國籍須為無戶籍國民";

    /** 檢核邏輯錯誤訊息. */
    String ERROR_MSG_11 = "妻(原屬)國籍須為香港或澳門";

    /** 檢核邏輯錯誤訊息. */
    String ERROR_MSG_12 = "妻(原屬)國籍須為中國大陸";

    /** 錯誤訊息:請輸入其他之附繳證件. */
    public static final String ERROR_MSG_OTHERCERTIFICATE = "請輸入其他之附繳證件";

    /** 錯誤訊息:請輸入事件發生(確定)日. */
    public static final String ERROR_MSG_FINEEVENTDATE = "請輸入事件發生(確定)日";

    /** 錯誤訊息:請輸入免罰原因. */
    public static final String ERROR_MSG_REMOVEFEEREASON = "請輸入免罰原因";

    /** 錯誤訊息:性別錯誤. */
    public static final String ERROR_MSG_GENDER = "性別錯誤";

    /** 錯誤訊息:請輸入僑居. */
    public static final String ERROR_OVERSEAPLACE = "請輸入僑居";

    /** 錯誤訊息:請選擇補登統號. */
    public static final String ERROR_MSG_FOREIGN_PERSON = "請選擇補登統號";

    /** 錯誤訊息:請輸入身分證統一編號. */
    public static final String ERROR_PERSONID = "請輸入身分證統一編號";

    /** 錯誤訊息:請輸入作業點代碼. */
    public static final String ERROR_SITEID = "請輸入作業點代碼";

    /** 錯誤訊息:請執行取得個人基本資料. */
    public static final String ERROR_PERSONDATA = "請執行取得個人基本資料";

    /** 錯誤訊息:(原屬)國籍不能為中華民國. */
    public static final String ERROR_NATIONALITYCODE = "(原屬)國籍不能為中華民國";

    /** 錯誤訊息:請輸入西元出生日期. */
    public static final String ERROR_FOREIGNBIRTHYMD = "請輸入西元出生日期";

    /** 錯誤訊息:請確認個人基本資料正確無誤. */
    public static final String ERROR_MSG_PERSON = "請確認個人基本資料正確無誤";

    /**
     * 顯示離婚廢止登記畫面.
     * 
     * @param dto
     *            離婚廢止登記DTO
     * @param exec
     *            使用者資訊
     * @return 離婚廢止登記DTO
     * @throws RisBusinessException
     *             顯示離婚廢止登記畫面失敗
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl01g02DTO initOperationDTO(final Rl01g02DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 編輯狀態時載入離婚廢止登記DTO.
     * 
     * @param dto
     *            離婚廢止登記DTO
     * @param exec
     *            使用者資訊
     * @throws RisBusinessException
     *             編輯狀態時載入離婚廢止登記DTO失敗
     */
    public void loadOperationDTO(final Rl01g02DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 再次驗證狀態時載入離婚廢止登記DTO.
     * 
     * @param dto
     *            離婚廢止登記DTO
     * @param exec
     *            使用者資訊
     * @throws RisBusinessException
     *             再次驗證狀態時載入離婚廢止登記DTO失敗
     */
    public Rl01g02DTO reviewOperationDTO(final Rl01g02DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 驗證離婚廢止登記申請資料與自動組合記事.
     * 
     * @param dto
     *            離婚廢止登記DTO
     * @param exec
     *            使用者資訊
     * @return 離婚廢止登記DTO
     * @throws RisBusinessException
     *             驗證離婚廢止登記申請資料與自動組合記事失敗
     */
    public Rl01g02DTO verifyAppData(final Rl01g02DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 取得離婚廢止者資料.
     * 
     * @param dto
     *            離婚廢止登記DTO
     * @param exec
     *            使用者資訊
     * @throws RisBusinessException
     *             取得離婚廢止者資料失敗
     */
    @RisServiceMethod(MethodType.QUERY)
    public void getSpouseData(final Rl01g02DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 刪除離婚廢止登記資料.
     * 
     * @param dto
     *            離婚廢止登記DTO
     * @param exec
     *            使用者資訊
     * @throws RisBusinessException
     *             刪除離婚廢止登記資料失敗
     */
    public void deleteAppData(final Rl01g02DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 取消執行離婚廢止登記.
     * 
     * @param dto
     *            離婚廢止登記DTO
     * @param exec
     *            使用者資訊
     * @throws RisBusinessException
     *             取消執行離婚廢止登記失敗
     */
    public void doDelete(final Rl01g02DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 暫存認領登記申請資料至XLDFTable.
     * 
     * @param dto
     *            離婚廢止登記DTO
     * @param exec
     *            使用者資訊
     * @throws RisBusinessException
     *             暫存認領登記申請資料至XLDFTable失敗
     */
    @RisServiceMethod(value = MethodType.SAVE2TEMP)
    @WorkStatus(FinalType.TEMP_FINAL)
    public void saveXldf(final Rl01g02DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 將DTO物件序列化成檔案.
     * 
     * @param tempFileDTO
     *            暫存DTO
     * @param exec
     *            使用者資訊
     */
    public void saveTempFile(final TempFileDTO<Rl01g02DTO> tempFileDTO, final ExecutantType exec);

    /**
     * 將DTO檔案反序列化成DTO物件.
     * 
     * @param tempFileDTO
     *            暫存DTO
     * @param exec
     *            使用者資訊
     * @return 離婚廢止登記DTO
     */
    public Rl01g02DTO loadTempFile(final TempFileDTO<Rl01g02DTO> tempFileDTO, final ExecutantType exec);
}
