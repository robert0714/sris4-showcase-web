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
import tw.gov.moi.rl.domain.Rl01827DTO;
import tw.gov.moi.rl.domain.TempFileDTO;

/**
 * 撤銷廢止戶籍登記服務介面.
 * 
 * @author Viva.Hong
 */
public interface Rl01827Service {

    /** 服務名稱. */
    public static final String SERVICE_NAME = "撤銷廢止戶籍登記";

    /** 資料區名稱:RLRPA009Q */
    public static final String RLRPA009Q = "RLRPA009Q";

    /** 類別名稱. */
    public static final String CLASS_NAME = "Rl01827ServiceImpl";

    /** 撤銷廢止戶籍登記代碼. */
    public static final String APPLY_CODE = "09Q";

    /** 廢止戶籍登記代碼. */
    public static final String APPLY_CODE_09J = "09J";

    /** (非當事人)罰鍰金額. */
    public static final String FEE_AMOUNT = "已";

    /** 戶長. */
    public static final String HOUSEHOLD_HEAD = "戶長";

    /** 預設其他附繳證件內容:內政部入出國及移民署xxx年xx月xx日第xxxx號函. */
    public static final String OTHERCERTIFICATE = "內政部入出國及移民署xxx年xx月xx日第xxxx號函";

    /** 函數名稱:initLoadPage. */
    public static final String INITLOADPAGE = SERVICE_NAME + " initLoadPage";

    /** 函數名稱:initOperationDTO. */
    public static final String INITOPERATIONDTO = SERVICE_NAME + " initOperationDTO";

    /** 函數名稱:initOperationService. */
    public static final String INITOPERATIONSERVICE = SERVICE_NAME + " initOperationService";

    /** 函數名稱:loadOperationDTO. */
    public static final String LOADOPERATIONDTO = SERVICE_NAME + " loadOperationDTO";

    /** 函數名稱:reviewOperationDTO. */
    public static final String REVIEWOPERATIONDTO = SERVICE_NAME + " reviewOperationDTO";

    /** 函數名稱:showerrormessage. */
    public static final String SHOWERRORMESSAGE = SERVICE_NAME + " showerrormessage";

    /** 函數名稱:changeIsNewHousehold. */
    public static final String CHANGEISNEWHOUSEHOLD = SERVICE_NAME + " changeIsNewHousehold";

    /** 函數名稱:checkUnDelPersonData. */
    public static final String CHECKUNDELPERSONDATA = SERVICE_NAME + " checkUnDelPersonData";

    /** 函數名稱:getNewHouseholdIdBySiteId. */
    public static final String GETNEWHOUSEHOLDIDBYSITEID = SERVICE_NAME + " getNewHouseholdIdBySiteId";

    /** 函數名稱:getHouseholdheadData. */
    public static final String GETHOUSEHOLDHEADDATA = SERVICE_NAME + " getHouseholdheadData";

    /** 函數名稱:getHouseholdMembers. */
    public static final String GETHOUSEHOLDMEMBERS = SERVICE_NAME + " getHouseholdMembers";

    /** 函數名稱:doDelete. */
    public static final String DODELETE = SERVICE_NAME + " doDelete";

    /** 函數名稱:doDelete. */
    public static final String VERIFYDATA = SERVICE_NAME + " verifyData";

    /** 函數名稱:autonotes. */
    public static final String AUTONOTES = SERVICE_NAME + " autonotes";

    /** 函數名稱:verifyAppData. */
    public static final String VERIFYAPPDATA = SERVICE_NAME + " verifyAppData";

    /** 函數名稱:doFineCheckAndCleanOldFine. */
    public static final String DOFINECHECKANDCLEANOLDFINE = SERVICE_NAME + " doFineCheckAndCleanOldFine";

    /** 函數名稱:savexldf. */
    public static final String SAVEXLDF = SERVICE_NAME + " savexldf";

    /** 函數名稱:lockRCDF001MRL. */
    public static final String LOCKRCDF001MRL = SERVICE_NAME + " lockRCDF001MRL";

    /** 函數名稱:createXLDF001M. */
    public static final String CREATEXLDF001M = SERVICE_NAME + " createXLDF001M";

    /** 函數名稱:createXLDF002M. */
    public static final String CREATEXLDF002M = SERVICE_NAME + " createXLDF002M";

    /** 函數名稱:createXLDFPersonData. */
    public static final String CREATEXLDFPERSONDATA = SERVICE_NAME + " createXLDFPersonData";

    /** 函數名稱:createXLDFPersonNote. */
    public static final String CREATEXLDFPERSONNOTE = SERVICE_NAME + " createXLDFPersonNote";

    /** 函數名稱:createXLDFX09QMX09QH. */
    public static final String CREATEXLDFX09QMX09QH = SERVICE_NAME + " createXLDFX09QMX09QH";

    /** 函數名稱:createXLDFY09QMY09QH. */
    public static final String CREATEXLDFY09QMY09QH = SERVICE_NAME + " createXLDFY09QMY09QH";

    /** 函數名稱:createXLDF006M. */
    public static final String CREATEXLDF006M = SERVICE_NAME + " createXLDF006M";

    /** 函數名稱:createXLDF022M. */
    public static final String CREATEXLDF022M = SERVICE_NAME + " createXLDF022M";

    /** 函數名稱:createXLDF030T. */
    public static final String CREATEXLDF030T = SERVICE_NAME + " createXLDF030T";

    /** 函數名稱:createXLDF003S. */
    public static final String CREATEXLDF003S = SERVICE_NAME + " createXLDF003S";

    /** 函數名稱:createXLDF039S. */
    public static final String CREATEXLDF039S = SERVICE_NAME + " createXLDF039S";

    /** 函數名稱:createXLDF004N. */
    public static final String CREATEXLDF004N = SERVICE_NAME + " createXLDF004N";

    /** 函數名稱:createXLDF2A10. */
    public static final String CREATEXLDF2A10 = SERVICE_NAME + " createXLDF2A10";

    /** 函數名稱:createXLDFM10M. */
    public static final String CREATEXLDFM10M = SERVICE_NAME + " createXLDFM10M";

    /** 函數名稱:createXLDFM11M. */
    public static final String CREATEXLDFM11M = SERVICE_NAME + " createXLDFM11M";

    /** 函數名稱:createXLDFS09Q. */
    public static final String CREATEXLDFS09Q = SERVICE_NAME + " createXLDFS09Q";

    /** 函數名稱:createXLDF008S. */
    public static final String CREATEXLDF008S = SERVICE_NAME + " createXLDF008S";

    /** 函數名稱:createXLDF016S. */
    public static final String CREATEXLDF016S = SERVICE_NAME + " createXLDF016S";

    /** 函數名稱:createXLDFS09J. */
    public static final String CREATEXLDFS09J = SERVICE_NAME + " createXLDFS09J";

    /** 函數名稱:createXLDFT09J. */
    public static final String CREATEXLDFT09J = SERVICE_NAME + " createXLDFT09J";

    /** 函數名稱:removeHousehold. */
    public static final String REMOVEHOUSEHOLD = SERVICE_NAME + " removeHousehold";

    /** 函數名稱:updateXCDF001MRL. */
    public static final String UPDATEXCDF001MRL = SERVICE_NAME + " updateXCDF001MRL";

    /** 函數名稱:updateOtherDataHtoM. */
    public static final String UPDATEOTHERDATAHTOM = SERVICE_NAME + " updateOtherDataHtoM";

    /** 函數名稱:selectOrgApplication. */
    public static final String SELECTORGAPPLICATION = SERVICE_NAME + " selectOrgApplication";

    /** 函數名稱:viewOrgApplication. */
    public static final String VIEWORGAPPLICATION = SERVICE_NAME + " viewOrgApplication";

    /** 錯誤訊息:擬入戶戶長須為本國人. */
    public static final String ERROR_MSG_HOUSEHOLDHEAD_ROLE = "擬入戶戶長須為本國人";

    /** 錯誤訊息:擬入戶戶長個人基本資料不存在. */
    public static final String ERROR_MSG_PERSONDATA_EXISTS = "擬入戶戶長個人基本資料不存在";

    /** 錯誤訊息:擬入戶戶長須為現住人口. */
    public static final String ERROR_MSG_PERSONAL_MARK = "擬入戶戶長須為現住人口";

    /** 錯誤訊息:全戶基本資料不存在. */
    public static final String ERROR_MSG_HOUSEHOLDHEADDATA_EXISTS = "全戶基本資料不存在";

    /** 錯誤訊息:輸入資料有異動，但未執行「資料驗證」，請先執行「資料驗證」成功後再執行「暫存」 . */
    public static final String ERROR_MSG_SAVEXLDF = "輸入資料有異動，但未執行「資料驗證」，請先執行「資料驗證」成功後再執行「暫存」 ";

    /** 錯誤訊息:當事人有「現戶個人基本資料」，請用「現戶個人基本資料」辦理撤銷廢止戶籍 . */
    public static final String ERROR_MSG_TARGET = "當事人有「現戶個人基本資料」，請用「現戶個人基本資料」辦理撤銷廢止戶籍 ";

    /** 錯誤訊息:(撤銷廢止戶籍)當下的撤銷廢止戶籍者已存在撤銷廢止戶籍者清單. */
    public static final String ERROR_MSG_PERSONID_EXISTS = "(撤銷廢止戶籍)當下的撤銷廢止戶籍者PERSONID已存在撤銷廢止戶籍者清單 ";

    /** 錯誤訊息:戶內人員資料. */
    public static final String ERROR_MSG_HOUSEHOLDMEMBERS = "戶內人員資料";

    /** 錯誤訊息: 取得自立新戶之配賦新戶號失敗 . */
    public static final String ERROR_MSG_NEWHOUSEHOLDID = "取得自立新戶之配賦新戶號失敗 ";

    /** 錯誤訊息: 擬入戶戶長統號，戶號輸入錯誤 . */
    public static final String ERROR_MSG_PERSONID_HOUSEHOLDID = "擬入戶戶長統號、戶號輸入錯誤 ";

    /** 檢核錯誤訊息:請輸入「自立新戶」. */
    public static final String VERIFY_ERROR_MSG_ISNEWHOUSEHOLD = "請輸入「自立新戶」";

    /** 檢核錯誤訊息:請輸入「稱謂」. */
    public static final String VERIFY_ERROR_MSG_RELATIONSHIP = "請輸入「稱謂」";

    /** 檢核錯誤訊息:請輸入「教育程度註記」. */
    public static final String VERIFY_ERROR_MSG_EDUCATIONMARK = "請輸入「教育程度註記」";

    /** 檢核錯誤訊息:請輸入「(全戶)作業點代碼」. */
    public static final String VERIFY_ERROR_MSG_HOUSEHOLDHEADSITEID = "請輸入「(全戶)作業點代碼」";

    /** 檢核錯誤訊息:請輸入「(全戶)戶長統號」. */
    public static final String VERIFY_ERROR_MSG_HOUSEHOLDHEADID = "請輸入「(全戶)戶長統號」";

    /** 檢核錯誤訊息:請輸入「(全戶)戶號」. */
    public static final String VERIFY_ERROR_MSG_HOUSEHOLDID = "請輸入「(全戶)戶號」";

    /** 檢核錯誤訊息:全戶基本資料Facade物件Null. */
    public static final String VERIFY_ERROR_MSG_HOUSEHOLDDATA = "全戶基本資料Facade物件Null";

    /** 檢核錯誤訊息:請輸入「(全戶)省市縣市」. */
    public static final String VERIFY_ERROR_MSG_COUNTYCODE = "請輸入「(全戶)省市縣市、鄉鎮市區」";

    /** 檢核錯誤訊息:請輸入「(全戶)鄉鎮市區」. */
    public static final String VERIFY_ERROR_MSG_TOWNCODE = "請輸入「(全戶)鄉鎮市區」";

    /** 檢核錯誤訊息:請輸入「(全戶)村里」. */
    public static final String VERIFY_ERROR_MSG_VILLAGE = "請輸入「(全戶)村里」";

    /** 檢核錯誤訊息:請輸入「(全戶)鄰」. */
    public static final String VERIFY_ERROR_MSG_NEIGHBOR = "請輸入「(全戶)鄰」";

    /** 檢核錯誤訊息:請輸入「(全戶)地址」. */
    public static final String VERIFY_ERROR_MSG_STREETDOORPLATE = "請輸入「(全戶)地址」";

    /** 檢核錯誤訊息:請輸入「(全戶)戶別」. */
    public static final String VERIFY_ERROR_MSG_HOUSEHOLDTYPE = "請輸入「(全戶)戶別」";

    /** 檢核錯誤訊息:請輸入「(全戶)兼任戶長註記」. */
    public static final String VERIFY_ERROR_MSG_HEADMARK = "請輸入「(全戶)兼任戶長註記」";

    /** 檢核錯誤訊息:請輸入「撤銷廢止日期」. */
    public static final String VERIFY_ERROR_MSG_DELYYYMMDD = "請輸入「撤銷廢止日期」";

    /** 檢核錯誤訊息:請輸入「核准日期」. */
    public static final String VERIFY_ERROR_MSG_APPROVENATIONALITYDATE = "請輸入「核准日期」";

    /** 檢核錯誤訊息:請輸入「撤銷原因」. */
    public static final String VERIFY_ERROR_MSG_DELREASON = "請輸入「撤銷原因」";

    /** 檢核錯誤訊息:請輸入「(附繳證件)其他 」. */
    public static final String VERIFY_ERROR_MSG_OTHERCERTIFICATE = "請輸入「(附繳證件)其他 」";

    /** 檢核錯誤訊息:請輸入「事件發生（確定）日期」. */
    public static final String VERIFY_ERROR_MSG_EVENTDATE = "請輸入「事件發生（確定）日期」";

    /** 檢核錯誤訊息:擬入戶戶籍住址不存在里鄰門牌資料檔，請檢查. */
    public static final String VERIFY_ERROR_MSG_ADDRESS_EXISTS = "擬入戶戶籍住址不存在里鄰門牌資料檔，請檢查";

    /** 檢核錯誤訊息:「街路門牌」」為不得設籍. */
    public static final String VERIFY_ERROR_MSG_HOUSEHOLD_STREETDOORPLATE = "「streetdoorplate」為不得設籍";

    /** 錯誤訊息:請輸入免罰原因. */
    public static final String ERROR_MSG_REMOVEFEEREASON = "請輸入免罰原因";

    /** 錯誤訊息:請確認個人基本資料正確無誤 */
    public static final String ERROR_MSG_PERSON = "請確認個人基本資料正確無誤";

    /** 錯誤訊息:請確認全戶基本資料正確無誤 */
    public static final String ERROR_MSG_HOUSEHOLD = "請確認全戶基本資料正確無誤";

    /**
     * 執行Contoller loadPage() 的第一個Service之共用邏輯.
     * 
     * @param dto
     *            撤銷廢止戶籍登記DTO
     * @param exec
     *            ExecutantType
     * @return 撤銷廢止戶籍登記DTO
     * @throws RisBusinessException
     *             執行程式失敗
     */
    public Rl01827DTO initLoadPage(final Rl01827DTO dto, ExecutantType exec) throws RisBusinessException;

    /**
     * 第一次呼叫狀態時載入撤銷廢止戶籍登記DTO.
     * 
     * @param dto
     *            撤銷廢止戶籍登記DTO
     * @param exec
     *            ExecutantType
     * @return 撤銷廢止戶籍登記DTO
     * @throws RisBusinessException
     *             執行程式失敗
     */
    @RisServiceMethod(value = MethodType.QUERY)
    public Rl01827DTO initOperationDTO(final Rl01827DTO dto, ExecutantType exec) throws RisBusinessException;

    /**
     * 編輯狀態時載入撤銷廢止戶籍登記DTO.
     * 
     * @param dto
     *            撤銷廢止戶籍登記DTO
     * @param exec
     *            ExecutantType
     * @return 撤銷廢止戶籍登記DTO
     * @throws RisBusinessException
     *             執行程式失敗
     */
    public Rl01827DTO loadOperationDTO(final Rl01827DTO dto, ExecutantType exec) throws RisBusinessException;

    /**
     * 再次驗證狀態時載入撤銷廢止戶籍登記DTO.
     * 
     * @param dto
     *            撤銷廢止戶籍登記DTO
     * @param exec
     *            ExecutantType
     * @return 撤銷廢止戶籍登記DTO
     * @throws RisBusinessException
     *             執行程式失敗
     */
    public Rl01827DTO reviewOperationDTO(final Rl01827DTO dto, ExecutantType exec) throws RisBusinessException;

    /**
     * 顯示系統錯誤例外訊息.
     * 
     * @param dto
     *            撤銷廢止戶籍登記DTO
     * @param exec
     *            ExecutantType
     * @throws RisBusinessException
     *             執行程式失敗
     */
    public void showErrorMessage(final Rl01827DTO dto, ExecutantType exec) throws RisBusinessException;

    /**
     * 改變WEB自立新戶時之作業.
     * 
     * @param dto
     *            撤銷廢止戶籍登記DTO
     * @param exec
     *            ExecutantType
     * @throws RisBusinessException
     *             執行程式失敗
     */
    public void changeIsNewHousehold(final Rl01827DTO dto, ExecutantType exec) throws RisBusinessException;

    /**
     * 檢核撤銷廢止戶籍者個人資料.
     * 
     * @param dto
     *            撤銷廢止戶籍登記DTO
     * @param exec
     *            ExecutantType
     * @throws RisBusinessException
     *             執行程式失敗
     */
    public void checkUnDelPersonData(final Rl01827DTO dto, ExecutantType exec) throws RisBusinessException;

    /**
     * 依作業點代碼取得自立新戶之新戶號.
     * 
     * @param dto
     *            撤銷廢止戶籍登記DTO
     * @param exec
     *            ExecutantType
     * @return the new household id by site id
     * @throws RisBusinessException
     *             執行程式失敗
     */
    public void getNewHouseholdIdBySiteId(final Rl01827DTO dto, ExecutantType exec) throws RisBusinessException;

    /**
     * 取得非自立新戶時擬入戶戶長資料.
     * 
     * @param dto
     *            撤銷廢止戶籍登記DTO
     * @param exec
     *            使用者資訊
     * @throws RisBusinessException
     *             執行程式失敗
     */
    @RisServiceMethod(value = MethodType.QUERY)
    public void getHouseholdheadData(final Rl01827DTO dto, ExecutantType exec) throws RisBusinessException;

    /**
     * 刪除撤銷廢止戶籍登記資料.
     * 
     * @param dto
     *            撤銷廢止戶籍登記DTO
     * @param exec
     *            ExecutantType
     * @throws RisBusinessException
     *             執行程式失敗
     */
    public void doDelete(final Rl01827DTO dto, ExecutantType exec) throws RisBusinessException;

    /**
     * 執行資料驗證並自動組合記事.
     * 
     * @param dto
     *            撤銷廢止戶籍登記DTO
     * @param exec
     *            ExecutantType
     * @throws RisBusinessException
     *             執行程式失敗
     */
    public void verifyAppData(final Rl01827DTO dto, ExecutantType exec) throws RisBusinessException;

    /**
     * 暫存撤銷廢止戶籍登記申請資料至XLDF Table.
     * 
     * @param dto
     *            撤銷廢止戶籍登記DTO
     * @param exec
     *            ExecutantType
     * @throws RisBusinessException
     *             執行程式失敗
     */
    @RisServiceMethod(value = MethodType.SAVE2TEMP)
    @WorkStatus(FinalType.TEMP_FINAL)
    public void saveXldf(final Rl01827DTO dto, ExecutantType exec) throws RisBusinessException;

    /**
     * 將DTO物件序列化成檔案.
     * 
     * @param tempFileDTO
     *            暫存DTO
     * @param exec
     *            ExecutantType
     */
    public void saveTempFile(final TempFileDTO<Rl01827DTO> tempFileDTO, final ExecutantType exec);

    /**
     * 將DTO檔案反序列化成DTO物件.
     * 
     * @param tempFileDTO
     *            暫存DTO
     * @param exec
     *            ExecutantType
     * @return 撤銷廢止戶籍登記DTO
     */
    public Rl01827DTO loadTempFile(final TempFileDTO<Rl01827DTO> tempFileDTO, final ExecutantType exec);

    /**
     * 選取擬撤銷的原認領登記申請書.
     * 
     * @param dto
     *            撤銷廢止戶籍登記DTO
     * @param exec
     *            ExecutantType
     * @return 撤銷廢止戶籍登記DTO
     * @throws RisBusinessException
     *             the ris business exception
     */
    public Rl01827DTO selectOrgApplication(final Rl01827DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 檢視擬撤銷之原登記申請書.
     * 
     * @param dto
     *            撤銷廢止戶籍登記DTO
     * @param exec
     *            ExecutantType
     * @return 撤銷廢止戶籍登記DTO
     * @throws RisBusinessException
     *             the ris business exception
     */
    public Rl01827DTO viewOrgApplication(final Rl01827DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 建立XLDF資料.
     * 
     * @param dto
     *            撤銷廢止戶籍登記DTO
     * @param exec
     *            使用者資訊
     * @throws RisBusinessException
     *             建立XLDF資料失敗
     */
    public void createOriginXLDF(final Rl01827DTO dto, final ExecutantType exec) throws RisBusinessException;

}
