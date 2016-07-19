/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl01800.service;

import java.util.List;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.domain.Rldf004mType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.domain.Rl01802DTO;
import tw.gov.moi.rl.domain.TempFileDTO;

/**
 * 離婚撤銷登記服務介面.
 * 
 * @author robert.lee
 */
public interface Rl01802Service {

    /** 作業代碼. */
    public static final String OPERATION = "01802";

    /** 資料區名稱:RLRPA0091 */
    public static final String RLRPA0091 = "RLRPA0091";

    /** 服務名稱. */
    public static final String SERVICE_NAME = "離婚撤銷登記";

    /** 類別名稱. */
    public static final String CLASS_NAME = "Rl01802ServiceImpl";

    /** 主分類. */
    public static final String MAIN_TYPE = "2";

    /** 申請書類別. */
    public static final String APPLYCODE = "091";

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

    /** 錯誤函數:saveXldf. */
    public static final String SAVEXLDF = SERVICE_NAME + " saveXldf";

    /** 錯誤函數:deleteAppData. */
    public static final String DELETEAPPDATA = SERVICE_NAME + " deleteAppData";

    /** 錯誤函數:doDelete. */
    public static final String DODELETE = SERVICE_NAME + " doDelete";

    /** 錯誤函數:getSpouseDataService. */
    public static final String GETSPOUSEDATASERVICE = SERVICE_NAME + " getSpouseDataService";

    /** 錯誤函數:doFineCheckAndCleanOldFine. */
    public static final String DOFINECHECKANDCLEANOLDFINE = SERVICE_NAME + " doFineCheckAndCleanOldFine";

    /** 錯誤函數:verifyData. */
    public static final String VERIFYDATA = SERVICE_NAME + " verifyData";

    /** 錯誤函數:autoNotes. */
    public static final String AUTONOTES = SERVICE_NAME + " autoNotes";

    /** 錯誤函數:createXLDFPersonData. */
    public static final String CREATEXLDFPERSONDATA = SERVICE_NAME + " createXLDFPersonData";

    /** 錯誤函數:createXLDFM02M. */
    public static final String CREATEXLDFM02M = SERVICE_NAME + " createXLDFM02M";

    /** 錯誤函數:createXLDFM10M. */
    public static final String CREATEXLDFM10M = SERVICE_NAME + " createXLDFM10M";

    /** 錯誤函數:createXLDF009S. */
    public static final String CREATEXLDF009S = SERVICE_NAME + " createXLDF009S";

    /** 錯誤函數:createXLDF008S. */
    public static final String CREATEXLDF008S = SERVICE_NAME + " createXLDF008S";

    /** 錯誤函數:createXLDFR090. */
    public static final String CREATEXLDFR090 = SERVICE_NAME + " createXLDFR090";

    /** 錯誤函數:getSpouseData. */
    public static final String GETSPOUSEDATA = SERVICE_NAME + " getSpouseData";

    /** 錯誤函數:createXLDF016S. */
    public static final String CREATEXLDF016S = SERVICE_NAME + " createXLDF016S";

    /** 錯誤函數:createXLDFPersonNote. */
    public static final String CREATEXLDFPERSONNOTE = SERVICE_NAME + " createXLDFPersonNote";

    /** 錯誤函數:createXLDF026S. */
    public static final String CREATEXLDF026S = SERVICE_NAME + " createXLDF026S";

    /** 錯誤函數:createXLDF2A10. */
    public static final String CREATEXLDF2A10 = SERVICE_NAME + " createXLDF2A10";

    /** 錯誤函數:createXLDFY091M. */
    public static final String CREATEXLDFY091M = SERVICE_NAME + " createXLDFY091M";

    /** 錯誤函數:createXLDFW091. */
    public static final String CREATEXLDFW091 = SERVICE_NAME + " createXLDFW091";

    /** 錯誤函數:createXLDFR091. */
    public static final String CREATEXLDFR091 = SERVICE_NAME + " createXLDFR091";

    /** 錯誤函數:createXLDFS091. */
    public static final String CREATEXLDFS091 = SERVICE_NAME + " createXLDFS091";

    /** 錯誤函數:updateXLDFS004. */
    public static final String UPDATEXLDFS004 = SERVICE_NAME + " updateXLDFS004";

    /** 錯誤函數:createXLDFS004. */
    public static final String CREATEXLDFS004 = SERVICE_NAME + " createXLDFS004";

    /** 錯誤函數:createXLDFT004. */
    public static final String CREATEXLDFT004 = SERVICE_NAME + " createXLDFT004";

    /** 錯誤函數:lockRCDF001MRL. */
    public static final String LOCKRCDF001MRL = SERVICE_NAME + " lockRCDF001MRL";

    /** 錯誤函數:CREATEXCDF001MRL. */
    public static final String CREATEXCDF001MRL = SERVICE_NAME + " CREATEXCDF001MRL";

    /** 錯誤函數:selectOrgApplication. */
    public static final String SELECTORGAPPLICATION = SERVICE_NAME + " selectOrgApplication";

    /** 錯誤函數:viewOrgApplication. */
    public static final String VIEWORGAPPLICATION = SERVICE_NAME + " viewOrgApplication";

    /** 錯誤函數:checkPersonId. */
    public static final String CHECKPERSONID = SERVICE_NAME + " checkPersonId";

    /** 錯誤函數:verify87tAnd88t. */
    public static final String VERIFY87TAND88T = SERVICE_NAME + " verify87tAnd88t";

    /** 錯誤函數:getRldf087t. */
    public static final String GETRLDF087T = SERVICE_NAME + " getRldf087t";

    /** 錯誤函數:getRldf088t. */
    public static final String GETRLDF088T = SERVICE_NAME + " getRldf088t";

    /** 錯誤函數:createXLDF087T. */
    public static final String CREATEXLDF087T = SERVICE_NAME + " createXLDF087T";

    /** 錯誤函數:createOriginXLDF087T. */
    public static final String CREATEORIGINXLDF087T = SERVICE_NAME + " createOriginXLDF087T";

    /** 錯誤函數:createXLDF088T. */
    public static final String CREATEXLDF088T = SERVICE_NAME + " createXLDF088T";

    /** 錯誤函數:createOriginXLDF088T. */
    public static final String CREATEORIGINXLDF088T = SERVICE_NAME + " createOriginXLDF088T";

    /** 錯誤函數:saveKinshipDataObject. */
    public static final String SAVEKINSHIPDATAOBJECT = SERVICE_NAME + " saveKinshipDataObject";

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

    /** 檢核邏輯錯誤訊息. */
    public static final String ERROR_MSG_1 = "請輸入夫(原屬)國籍內容";

    /** 檢核邏輯錯誤訊息. */
    public static final String ERROR_MSG_2 = "夫(原屬)國籍不可為空白";

    /** 檢核邏輯錯誤訊息. */
    public static final String ERROR_MSG_3 = "夫(原屬)國籍不可為[001]~[005]";

    /** 檢核邏輯錯誤訊息. */
    public static final String ERROR_MSG_4 = "夫(原屬)國籍須為無戶籍國民";

    /** 檢核邏輯錯誤訊息. */
    public static final String ERROR_MSG_5 = "夫(原屬)國籍須為香港或澳門";

    /** 檢核邏輯錯誤訊息. */
    public static final String ERROR_MSG_6 = "夫(原屬)國籍須為中國大陸";

    /** 檢核邏輯錯誤訊息. */
    public static final String ERROR_MSG_7 = "請輸入妻(原屬)國籍內容";

    /** 檢核邏輯錯誤訊息. */
    public static final String ERROR_MSG_8 = "妻(原屬)國籍不可為空白";

    /** 檢核邏輯錯誤訊息. */
    public static final String ERROR_MSG_9 = "妻(原屬)國籍不可為[001]~[005]";

    /** 檢核邏輯錯誤訊息. */
    public static final String ERROR_MSG_10 = "妻(原屬)國籍須為無戶籍國民";

    /** 檢核邏輯錯誤訊息. */
    public static final String ERROR_MSG_11 = "妻(原屬)國籍須為香港或澳門";

    /** 檢核邏輯錯誤訊息. */
    public static final String ERROR_MSG_12 = "妻(原屬)國籍須為中國大陸";

    /** 錯誤訊息:請輸入僑居. */
    public static final String ERROR_OVERSEAPLACE = "請輸入僑居";

    /** 錯誤訊息:請輸入外籍者英文姓名. */
    public static final String ERROR_FOREIGNNAME = "請輸入外籍者英文姓名";

    /** 訊息:(離婚撤銷者-夫). */
    public static final String HUSBAND = "(離婚撤銷者-夫)";

    /** 訊息:(離婚撤銷者-妻). */
    public static final String WIFE = "(離婚撤銷者-妻)";

    /** 錯誤訊息:「申請書配偶姓名」與「撤銷登記配偶姓名」不符. */
    public static final String ERROR_MSG_PERSONNAME = "「申請書配偶姓名」與「撤銷登記配偶姓名」不符";

    /** 錯誤訊息:請勾選擬撤銷之登記婚前結婚證明書資料. */
    public static final String ERROR_MSG_SELECT_RLDF087T = "請勾選擬撤銷之登記婚前結婚證明書資料";

    /** 錯誤訊息:請勾選擬撤銷之結婚證明書資料. */
    public static final String ERROR_MSG_SELECT_RLDF088T = "請勾選擬撤銷之結婚證明書資料";

    /** 錯誤訊息:請輸入其他之附繳證件. */
    public static final String ERROR_MSG_OTHERCERTIFICATE = "請輸入其他之附繳證件";

    /** 錯誤訊息:請輸入事件發生(確定)日. */
    public static final String ERROR_MSG_FINEEVENTDATE = "請輸入事件發生(確定)日";

    /** 錯誤訊息:請輸入免罰原因. */
    public static final String ERROR_MSG_REMOVEFEEREASON = "請輸入免罰原因";

    /** 錯誤訊息:性別錯誤. */
    public static final String ERROR_MSG_GENDER = "性別錯誤";

    /** 錯誤訊息:請選擇補登統號. */
    public static final String ERROR_MSG_FOREIGN_PERSON = "請選擇補登統號";

    /** 錯誤訊息:請確認個人基本資料正確無誤. */
    public static final String ERROR_MSG_PERSON = "請確認個人基本資料正確無誤";

    /**
     * 顯示離婚撤銷登記畫面.
     * 
     * @param dto
     *            離婚撤銷登記DTO
     * @param exec
     *            使用者資訊
     * @return 離婚撤銷登記DTO
     * @throws RisBusinessException
     *             顯示離婚撤銷登記畫面失敗
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl01802DTO initOperationDTO(final Rl01802DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 編輯狀態時載入離婚撤銷登記DTO.
     * 
     * @param dto
     *            離婚撤銷登記DTO
     * @param exec
     *            使用者資訊
     * @throws RisBusinessException
     *             編輯狀態時載入離婚撤銷登記DTO失敗
     */
    public void loadOperationDTO(final Rl01802DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 再次驗證狀態時載入離婚撤銷登記DTO.
     * 
     * @param dto
     *            離婚撤銷登記DTO
     * @param exec
     *            使用者資訊
     * @throws RisBusinessException
     *             再次驗證狀態時載入離婚撤銷登記DTO失敗
     */
    public Rl01802DTO reviewOperationDTO(final Rl01802DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 驗證離婚撤銷登記申請資料與自動組合記事.
     * 
     * @param dto
     *            離婚撤銷登記DTO
     * @param exec
     *            使用者資訊
     * @return 離婚撤銷登記DTO
     * @throws RisBusinessException
     *             驗證離婚撤銷登記申請資料與自動組合記事失敗
     */
    public Rl01802DTO verifyAppData(final Rl01802DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 取得離婚撤銷者資料.
     * 
     * @param dto
     *            離婚撤銷登記DTO
     * @param exec
     *            使用者資訊
     * @return 離婚撤銷登記DTO
     * @throws RisBusinessException
     *             取得離婚撤銷者資料失敗
     */
    @RisServiceMethod(MethodType.QUERY)
    public void getSpouseData(final Rl01802DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 刪除離婚撤销登記資料.
     * 
     * @param dto
     *            離婚撤銷登記DTO
     * @param exec
     *            使用者資訊
     * @throws RisBusinessException
     *             刪除離婚撤销登記資料失敗
     */
    public void deleteAppData(final Rl01802DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 取消執行離婚撤銷登記.
     * 
     * @param dto
     *            離婚撤銷登記DTO
     * @param exec
     *            使用者資訊
     * @throws RisBusinessException
     *             取消執行離婚撤銷登記失敗
     */
    public void doDelete(final Rl01802DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 暫存認領登記申請資料至XLDFTable.
     * 
     * @param dto
     *            離婚撤銷登記DTO
     * @param exec
     *            使用者資訊
     * @throws RisBusinessException
     *             暫存認領登記申請資料至XLDFTable失敗
     */
    @RisServiceMethod(value = MethodType.SAVE2TEMP)
    @WorkStatus(FinalType.TEMP_FINAL)
    public void saveXldf(final Rl01802DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 取得申請人2資料.
     * 
     * @param dto
     *            離婚撤銷登記DTO
     * @param exec
     *            使用者資訊
     * @return 申請人資料清單
     * @throws RisBusinessException
     *             取得申請人2資料失敗
     */
    public List<Rldf004mType> getApplyInfo(final Rl01802DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 將DTO物件序列化成檔案.
     * 
     * @param tempFileDTO
     *            暫存DTO
     * @param exec
     *            ExecutantType
     */
    public void saveTempFile(final TempFileDTO<Rl01802DTO> tempFileDTO, final ExecutantType exec);

    /**
     * 將DTO檔案反序列化成DTO物件.
     * 
     * @param tempFileDTO
     *            暫存DTO
     * @param exec
     *            ExecutantType
     * @return 離婚撤銷登記DTO
     */
    public Rl01802DTO loadTempFile(final TempFileDTO<Rl01802DTO> tempFileDTO, final ExecutantType exec);

    /**
     * 選取擬撤銷的原離婚登記申請書.
     * 
     * @param dto
     *            離婚撤銷登記DTO
     * @param exec
     *            ExecutantType
     * @return 離婚撤銷登記DTO
     * @throws RisBusinessException
     *             選取擬撤銷的原離婚登記申請書失敗
     */
    public Rl01802DTO selectOrgApplication(final Rl01802DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 檢視擬撤銷之原登記申請書.
     * 
     * @param dto
     *            離婚撤銷登記DTO
     * @param exec
     *            ExecutantType
     * @return 離婚撤銷登記DTO
     * @throws RisBusinessException
     *             檢視擬撤銷之原登記申請書失敗
     */
    public Rl01802DTO viewOrgApplication(final Rl01802DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 建立XLDF資料.
     * 
     * @param dto
     *            離婚撤銷登記DTO
     * @param exec
     *            使用者資訊
     * @throws RisBusinessException
     *             建立XLDF資料失敗
     */
    public void createOriginXLDF(final Rl01802DTO dto, final ExecutantType exec) throws RisBusinessException;

}
