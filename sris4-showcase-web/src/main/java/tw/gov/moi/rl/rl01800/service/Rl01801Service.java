/*

 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl01800.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.domain.Rl01801DTO;
import tw.gov.moi.rl.domain.TempFileDTO;

/**
 * 結婚撤銷登記服務介面.
 * 
 * @author Viva.Hong
 */
public interface Rl01801Service {

    /** 服務名稱. */
    public static final String SERVICE_NAME = "結婚撤销登記";

    /** 資料區名稱:RLRPA0090 */
    public static final String RLRPA0090 = "RLRPA0090";

    /** 類別名稱. */
    public static final String CLASS_NAME = "Rl01801ServiceImpl";

    /** 結婚撤銷登記代碼. */
    public static final String APPLY_CODE = RlConstant.STRING_ZERO_NINE_ZERO;

    /** (非當事人)罰鍰金額. */
    public static final String FEE_AMOUNT = "已";

    /** method:initLoadPage. */
    public static final String INITLOADPAGE = SERVICE_NAME + " initLoadPage";

    /** method:initOperationDTO. */
    public static final String INITOPERATIONDTO = SERVICE_NAME + " initOperationDTO";

    /** method:initOperationService. */
    public static final String INITOPERATIONSERVICE = SERVICE_NAME + " initOperationService";

    /** method:loadOperationDTO. */
    public static final String LOADOPERATIONDTO = SERVICE_NAME + " loadOperationDTO";

    /** method:reviewOperationDTO. */
    public static final String REVIEWOPERATIONDTO = SERVICE_NAME + " reviewOperationDTO";

    /** method:showErrorMessage. */
    public static final String SHOWERRORMESSAGE = SERVICE_NAME + " showErrorMessage";

    /** method:getSpouseDataService. */
    public static final String GETSPOUSEDATASERVICE = SERVICE_NAME + " getSpouseDataService";

    /** method:getRldf087t. */
    public static final String ERROR_GETRLDF087T_METHOD = SERVICE_NAME + " getRldf087t";

    /** method:getRldf087t. */
    public static final String ERROR_GETRLDF088T_METHOD = SERVICE_NAME + " getRldf088t";

    /** method:doDelete. */
    public static final String DODELETE = SERVICE_NAME + " doDelete";

    /** method:autonotes. */
    public static final String AUTONOTES = SERVICE_NAME + " autonotes";

    /** method:verifyAppData. */
    public static final String VERIFYAPPDATA = SERVICE_NAME + " verifyAppData";

    /** method:doFineCheckAndCleanOldFine. */
    public static final String DOFINECHECKANDCLEANOLDFINE = SERVICE_NAME + " doFineCheckAndCleanOldFine";

    /** method:savexldf. */
    public static final String SAVEXLDF = SERVICE_NAME + " savexldf";

    /** method:lockRCDF001MRL. */
    public static final String LOCKRCDF001MRL = SERVICE_NAME + " lockRCDF001MRL";

    /** method:lockRLDF088T. */
    public static final String LOCKRLDF088T = SERVICE_NAME + " lockRLDF088T";

    /** method:saveKinshipDataObject. */
    public static final String SAVEKINSHIPDATAOBJECT = SERVICE_NAME + " saveKinshipDataObject";

    /** method:createXLDFPersonData. */
    public static final String CREATEXLDFPERSONDATA = SERVICE_NAME + " createXLDFPersonData";

    /** method:createXLDFPersonNote. */
    public static final String CREATEXLDFPERSONNOTE = SERVICE_NAME + " createXLDFPersonNote";

    /** method:createXLDFY090M. */
    public static final String CREATEXLDFY090M = SERVICE_NAME + " createXLDFY090M";

    /** method:createXLDF2A10. */
    public static final String CREATEXLDF2A10 = SERVICE_NAME + " createXLDF2A10";

    /** method:createXLDF087T. */
    public static final String CREATEXLDF087T = SERVICE_NAME + " createXLDF087T";

    /** method:createOriginXLDF087T. */
    public static final String CREATEORIGINXLDF087T = SERVICE_NAME + " createOriginXLDF087T";

    /** method:createXLDF088T. */
    public static final String CREATEXLDF088T = SERVICE_NAME + " createXLDF088T";

    /** method:createOriginXLDF088T. */
    public static final String CREATEORIGINXLDF088T = SERVICE_NAME + " createOriginXLDF088T";

    /** method:createXLDFM02M. */
    public static final String CREATEXLDFM02M = SERVICE_NAME + " createXLDFM02M";

    /** method:createXLDFM10M. */
    public static final String CREATEXLDFM10M = SERVICE_NAME + " createXLDFM10M";

    /** method:createXCDF001MRL. */
    public static final String CREATEXCDF001MRL = SERVICE_NAME + " createXCDF001MRL";

    /** method:createXLDFS003. */
    public static final String CREATEXLDFS003 = SERVICE_NAME + " createXLDFS003";

    /** method:createXLDF008S. */
    public static final String CREATEXLDF008S = SERVICE_NAME + " createXLDF008S";

    /** method:createXLDF016S. */
    public static final String CREATEXLDF016S = SERVICE_NAME + " createXLDF016S";

    /** method:createXLDFR003. */
    public static final String CREATEXLDFR003 = SERVICE_NAME + " createXLDFR003";

    /** method:createXLDF009S. */
    public static final String CREATEXLDF009S = SERVICE_NAME + " createXLDF009S";

    /** method:createXLDFW090. */
    public static final String CREATEXLDFW090 = SERVICE_NAME + " createXLDFW090";

    /** method:createXLDFR090. */
    public static final String CREATEXLDFR090 = SERVICE_NAME + " createXLDFR090";

    /** method:createXLDFS090. */
    public static final String CREATEXLDFS090 = SERVICE_NAME + " createXLDFS090";

    /** method:createXLDF026S. */
    public static final String CREATEXLDF026S = SERVICE_NAME + " createXLDF026S";

    /** method:createXLDFT003. */
    public static final String CREATEXLDFT003 = SERVICE_NAME + " createXLDFT003";

    /** method:checkPersonId. */
    public static final String CHECKPERSONID = SERVICE_NAME + " checkPersonId";

    /** method:selectOrgApplication. */
    public static final String SELECTORGAPPLICATION = SERVICE_NAME + " selectOrgApplication";

    /** method:viewOrgApplication. */
    public static final String VIEWORGAPPLICATION = SERVICE_NAME + " viewOrgApplication";

    /** method:verify87tAnd88t. */
    public static final String VERIFY87TAND88T = SERVICE_NAME + " verify87tAnd88t";

    /** 錯誤訊息:結婚者-夫. */
    public static final String HUSBAND = "(結婚撤銷者-夫)";

    /** 錯誤訊息:結婚者-妻. */
    public static final String WIFE = "(結婚撤銷者-妻)";

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

    /** 錯誤訊息:請輸入結婚撤銷日期. */
    public static final String ERROR_MSG_DELYYYMMDD = "請輸入結婚撤銷日期";

    /** 錯誤訊息:請輸入多段婚姻. */
    public static final String ERROR_MSG_MRGMULTIFLAG = "請輸入多段婚姻";

    /** 錯誤訊息:請輸入結婚登記申請日期. */
    public static final String ERROR_MSG_MRGAPPLYDATE = "請輸入結婚登記申請日期";

    /** 錯誤訊息:請輸入撤銷原因. */
    public static final String ERROR_MSG_DELREASON = "請輸入撤銷原因";

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

    /** 錯誤訊息:「申請書配偶姓名」與「撤銷登記配偶姓名」不符. */
    public static final String ERROR_MSG_PERSONNAME = "「申請書配偶姓名」與「撤銷登記配偶姓名」不符";

    /** 錯誤訊息:請勾選擬撤銷之登記婚前結婚證明書資料. */
    public static final String ERROR_MSG_SELECT_RLDF087T = "請勾選擬撤銷之登記婚前結婚證明書資料";

    /** 錯誤訊息:請勾選擬撤銷之結婚證明書資料. */
    public static final String ERROR_MSG_SELECT_RLDF088T = "請勾選擬撤銷之結婚證明書資料";

    /** 錯誤訊息:請輸入是否撤銷前一段婚姻. */
    public static final String ERROR_MSG_ORGMARRIAGECODE = "請輸入是否撤銷前一段婚姻";

    /** 錯誤訊息:性別錯誤. */
    public static final String ERROR_MSG_GENDER = "性別錯誤";

    /** 錯誤訊息:請選擇補登統號. */
    public static final String ERROR_MSG_FOREIGN_PERSON = "請選擇補登統號";

    /** 錯誤訊息:請確認個人基本資料正確無誤. */
    public static final String ERROR_MSG_PERSON = "請確認個人基本資料正確無誤";

    /**
     * 執行Contoller loadPage() 的第一個Service之共用邏輯.
     * 
     * @param dto
     *            結婚撤銷登記DTO
     * @param exec
     *            使用者資訊
     * @throws RisBusinessException
     *             執行程式失敗
     */
    public void initLoadPage(final Rl01801DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 第一次呼叫狀態時載入結婚撤销登記DTO.
     * 
     * @param dto
     *            結婚撤銷登記DTO
     * @param exec
     *            使用者資訊
     * @return the rl01801 dto
     * @throws RisBusinessException
     *             執行程式失敗
     */
    @RisServiceMethod(value = MethodType.QUERY)
    public Rl01801DTO initOperationDTO(final Rl01801DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 編輯狀態時載入結婚撤销登記DTO.
     * 
     * @param dto
     *            結婚撤銷登記DTO
     * @param exec
     *            使用者資訊
     * @return the rl01801 dto
     * @throws RisBusinessException
     *             執行程式失敗
     */
    public Rl01801DTO loadOperationDTO(final Rl01801DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 再次驗證狀態時載入結婚撤销登記DTO.
     * 
     * @param dto
     *            結婚撤銷登記DTO
     * @param exec
     *            使用者資訊
     * @return the rl01801 dto
     * @throws RisBusinessException
     *             執行程式失敗
     */
    public Rl01801DTO reviewOperationDTO(final Rl01801DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 顯示系統錯誤例外訊息.
     * 
     * @param dto
     *            結婚撤銷登記DTO
     * @param exec
     *            使用者資訊
     * @throws RisBusinessException
     *             執行程式失敗
     */
    public void showErrorMessage(final Rl01801DTO dto, ExecutantType exec) throws RisBusinessException;

    /**
     * 取得結婚撤銷者資料(建立DB Transaction).
     * 
     * @param dto
     *            結婚撤銷登記DTO
     * @param exec
     *            使用者資訊
     * @return the spouse data
     * @throws RisBusinessException
     *             執行程式失敗
     */
    @RisServiceMethod(value = MethodType.QUERY)
    public void getSpouseData(final Rl01801DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 查詢外籍者資料X.
     * 
     * @param dto
     *            結婚撤銷登記DTO
     * @param exec
     *            使用者資訊
     * @throws RisBusinessException
     *             執行程式失敗
     */
    public void queryForeignData(final Rl01801DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 刪除結婚撤销登記資料.
     * 
     * @param dto
     *            結婚撤銷登記DTO
     * @param exec
     *            使用者資訊
     * @throws RisBusinessException
     *             執行程式失敗
     */
    public void doDelete(final Rl01801DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 取得罰鍰清單資料X.
     * 
     * @param dto
     *            結婚撤銷登記DTO
     * @param exec
     *            使用者資訊
     * @return the fine list
     * @throws RisBusinessException
     *             執行程式失敗
     */
    public void getFineList(final Rl01801DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 編輯罰鍰處分書X.
     * 
     * @param dto
     *            結婚撤銷登記DTO
     * @param exec
     *            使用者資訊
     * @throws RisBusinessException
     *             執行程式失敗
     */
    public void editFine(final Rl01801DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 刪除罰鍰處分書X.
     * 
     * @param dto
     *            結婚撤銷登記DTO
     * @param exec
     *            使用者資訊
     * @throws RisBusinessException
     *             執行程式失敗
     */
    public void deleteFine(final Rl01801DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 執行資料驗證並自動組合記事.
     * 
     * @param dto
     *            結婚撤銷登記DTO
     * @param exec
     *            使用者資訊
     * @throws RisBusinessException
     *             執行程式失敗
     */
    public void verifyAppData(final Rl01801DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 暫存結婚撤销登記申請資料至XLDF Table.
     * 
     * @param dto
     *            結婚撤銷登記DTO
     * @param exec
     *            使用者資訊
     * @throws RisBusinessException
     *             執行程式失敗
     */
    @RisServiceMethod(value = MethodType.SAVE2TEMP)
    @WorkStatus(FinalType.TEMP_FINAL)
    public void saveXldf(final Rl01801DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 將DTO物件序列化成檔案.
     * 
     * @param tempFileDTO
     *            暫存DTO
     * @param exec
     *            使用者資訊
     */
    public void saveTempFile(final TempFileDTO<Rl01801DTO> tempFileDTO, final ExecutantType exec);

    /**
     * 將DTO檔案反序列化成DTO物件.
     * 
     * @param tempFileDTO
     *            暫存DTO
     * @param exec
     *            使用者資訊
     * @return 結婚撤銷登記DTO
     */
    public Rl01801DTO loadTempFile(final TempFileDTO<Rl01801DTO> tempFileDTO, final ExecutantType exec);

    /**
     * 選取擬撤銷的原結婚登記申請書.
     * 
     * @param dto
     *            結婚撤銷登記DTO
     * @param exec
     *            使用者資訊
     * @return 結婚撤銷登記DTO
     * @throws RisBusinessException
     *             選取擬撤銷的原結婚登記申請書失敗
     */
    public Rl01801DTO selectOrgApplication(final Rl01801DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 檢視擬撤銷之原登記申請書.
     * 
     * @param dto
     *            結婚撤銷登記DTO
     * @param exec
     *            使用者資訊
     * @return 結婚撤銷登記DTO
     * @throws RisBusinessException
     *             檢視擬撤銷之原登記申請書失敗
     */
    public Rl01801DTO viewOrgApplication(final Rl01801DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 建立XLDF資料.
     * 
     * @param dto
     *            結婚撤銷登記DTO
     * @param exec
     *            使用者資訊
     * @throws RisBusinessException
     *             建立XLDF資料失敗
     */
    public void createOriginXLDF(final Rl01801DTO dto, final ExecutantType exec) throws RisBusinessException;

}
