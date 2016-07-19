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
import tw.gov.moi.rl.domain.Rl01g19DTO;
import tw.gov.moi.rl.domain.TempFileDTO;

/**
 * 廢止戶籍登記服務介面.
 * 
 * @author Viva.Hong
 */
public interface Rl01g19Service {

    /** 服務名稱. */
    public static final String SERVICE_NAME = "廢止戶籍登記";

    /** 資料區名稱:RLRPA009J */
    public static final String RLRPA009J = "RLRPA009J";

    /** 類別名稱. */
    public static final String CLASS_NAME = "Rl01g19ServiceImpl";

    /** 廢止戶籍登記代碼. */
    public static final String APPLY_CODE = "09J";

    /** (非當事人)罰鍰金額. */
    public static final String FEE_AMOUNT = "已";

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

    /** 函數名稱:showErrorMessage. */
    public static final String SHOWERRORMESSAGE = SERVICE_NAME + " showErrorMessage";

    /** 函數名稱:changeApplyType. */
    public static final String CHANGEAPPLYTYPE = SERVICE_NAME + " changeApplyType";

    /** 函數名稱:addDelPersonData. */
    public static final String ADDDELPERSONDATA = SERVICE_NAME + " addDelPersonData";

    /** 函數名稱:cancelDelPersonData. */
    public static final String CANCELDELPERSONDATA = SERVICE_NAME + " cancelDelPersonData";

    /** 函數名稱:doDelete. */
    public static final String DODELETE = SERVICE_NAME + " doDelete";

    /** 函數名稱:getHouseholdMembers. */
    public static final String GETHOUSEHOLDMEMBERS = SERVICE_NAME + " getHouseholdMembers";

    /** 函數名稱:doDelete. */
    public static final String VERIFYDATA = SERVICE_NAME + " verifyData";

    /** 函數名稱:verifyAppData. */
    public static final String VERIFYAPPDATA = SERVICE_NAME + " verifyAppData";

    /** 函數名稱:autoNotes. */
    public static final String AUTONOTES = SERVICE_NAME + " autoNotes";

    /** 函數名稱:savexldf. */
    public static final String SAVEXLDF = SERVICE_NAME + " savexldf";

    /** 函數名稱:lockRCDF001MRL. */
    public static final String LOCKRCDF001MRL = SERVICE_NAME + " lockRCDF001MRL";

    /** 函數名稱:updateNewHousePersonDataList. */
    public static final String UPDATENEWHOUSEPERSONDATALIST = SERVICE_NAME + " updateNewHousePersonDataList";

    /** 函數名稱:removeHousehold. */
    public static final String REMOVEHOUSEHOLD = SERVICE_NAME + " removeHousehold";

    /** 函數名稱:removeHouseholdCommonFunction. */
    public static final String REMOVEHOUSEHOLDCOMMONFUNCTION = SERVICE_NAME + " removeHouseholdCommonFunction";

    /** 函數名稱:updateMemberPersonData. */
    public static final String UPDATEMEMBERPERSONDATA = SERVICE_NAME + " updateMemberPersonData";

    /** 函數名稱:updateDelMemberPersonData. */
    public static final String UPDATEDELMEMBERPERSONDATA = SERVICE_NAME + " updateDelMemberPersonData";

    /** 函數名稱:updateOldXLDF001M. */
    public static final String UPDATEOLDXLDF001M = SERVICE_NAME + " updateOldXLDF001M";

    /** 函數名稱:updateXCDF001MRL. */
    public static final String UPDATEXCDF001MRL = SERVICE_NAME + " updateXCDF001MRL";

    /** 函數名稱:doFineCheckAndCleanOldFine. */
    public static final String DOFINECHECKANDCLEANOLDFINE = SERVICE_NAME + " doFineCheckAndCleanOldFine";

    /** 函數名稱:createNewXLDF001M. */
    public static final String CREATENEWXLDF001M = SERVICE_NAME + " createNewXLDF001M";

    /** 函數名稱:createXLDFHouseholdNote. */
    public static final String CREATEXLDFHOUSEHOLDNOTE = SERVICE_NAME + " createXLDFHouseholdNote";

    /** 函數名稱:createXLDFPersonNote. */
    public static final String CREATEXLDFPERSONNOTE = SERVICE_NAME + " createXLDFPersonNote";

    /** 函數名稱:createXLDFX09JMX09JH. */
    public static final String CREATEXLDFX09JMX09JH = SERVICE_NAME + " createXLDFX09JMX09JH";

    /** 函數名稱:createXLDFY09JMY09JH. */
    public static final String CREATEXLDFY09JMY09JH = SERVICE_NAME + " createXLDFY09JMY09JH";

    /** 函數名稱:createXLDF003S. */
    public static final String CREATEXLDF003S = SERVICE_NAME + " createXLDF003S";

    /** 函數名稱:createXLDF039S. */
    public static final String CREATEXLDF039S = SERVICE_NAME + " createXLDF039S";

    /** 函數名稱:createXLDF004N. */
    public static final String CREATEXLDF004N = SERVICE_NAME + " createXLDF004N";

    /** 函數名稱:createXLDF017E. */
    public static final String CREATEXLDF017E = SERVICE_NAME + " createXLDF017E";

    /** 函數名稱:createXCDF002E. */
    public static final String CREATEXCDF002E = SERVICE_NAME + " createXCDF002E";

    /** 函數名稱:createXLDFM10M. */
    public static final String CREATEXLDFM10M = SERVICE_NAME + " createXLDFM10M";

    /** 函數名稱:createXLDFM10H. */
    public static final String CREATEXLDFM10H = SERVICE_NAME + " createXLDFM10H";

    /** 函數名稱:createXLDF003D. */
    public static final String CREATEXLDF003D = SERVICE_NAME + " createXLDF003D";

    /** 函數名稱:createXLDFS09J. */
    public static final String CREATEXLDFS09J = SERVICE_NAME + " createXLDFS09J";

    /** 函數名稱:createXLDF008S. */
    public static final String CREATEXLDF008S = SERVICE_NAME + " createXLDF008S";

    /** 函數名稱:createXLDF016S. */
    public static final String CREATEXLDF016S = SERVICE_NAME + " createXLDF016S";

    /** 錯誤訊息:已存在廢止戶籍者清單. */
    public static final String ERROR_MSG_PERSONID_EXIST = "已存在廢止戶籍者清單";

    /** 錯誤訊息:統號不可為空白. */
    public static final String ERROR_MSG_EMPTY = "統號不可為空白";

    /** 錯誤訊息:統號格式錯誤. */
    public static final String ERROR_MSG_REG = "統號格式錯誤";

    /** 錯誤訊息:請勾選需刪除初設戶籍者. */
    public static final String ERROR_MSG_DELETE = "請勾選需刪除初設戶籍者";

    /** 錯誤訊息:戶內人員資料. */
    public static final String ERROR_MSG_HOUSEHOLDMEMBERS = "戶內人員資料";

    /** 錯誤訊息:當事人不為現住人口. */
    public static final String ERROR_MSG_PERSONALMARK = "當事人不為現住人口";

    /** 錯誤訊息:請結束作業. */
    public static final String ERROR_MSG_WORKCLOSE = "請結束作業";

    /** 檢核錯誤訊息:請輸入「教育程度註記」. */
    public static final String VERIFY_ERROR_MSG_EDUCATIONMARK = "請輸入「教育程度註記」";

    /** 檢核錯誤訊息:請輸入「稱謂」. */
    public static final String VERIFY_ERROR_MSG_RELATIONSHIP = "請輸入「稱謂」";

    /** 檢核錯誤訊息:請選擇「新戶長」. */
    public static final String VERIFY_ERROR_MSG_NEWHOUSEHOLDHEAD = "請選擇「新戶長」";

    /** 檢核錯誤訊息:請輸入「戶別」. */
    public static final String VERIFY_ERROR_MSG_HOUSEHOLDTYPE = "請輸入「戶別」";

    /** 檢核錯誤訊息:請輸入「兼任戶長註記」. */
    public static final String VERIFY_ERROR_MSG_CONCURRENTHEADMARK = "請輸入「兼任戶長註記」";

    /** 檢核錯誤訊息:請輸入「廢止原因-主類別」. */
    public static final String VERIFY_ERROR_MSG_MAINDELREASON = "請輸入「廢止原因-主類別」";

    /** 檢核錯誤訊息:請輸入「廢止原因」. */
    public static final String VERIFY_ERROR_MSG_DELREASON = "請輸入「廢止原因」";

    /** 檢核錯誤訊息:請輸入「廢止日期」. */
    public static final String VERIFY_ERROR_MSG_DELYYYMMDD = "請輸入「廢止日期」";

    /** 檢核錯誤訊息:請輸入「核准日期」. */
    public static final String VERIFY_ERROR_MSG_DELNATIONALITYDATE = "請輸入「核准日期」";

    /** 檢核錯誤訊息:請輸入「認領日期」. */
    public static final String VERIFY_ERROR_MSG_BUSINESSDATE = "請輸入「認領日期」";

    /** 檢核錯誤訊息:請輸入「其他附繳證件」. */
    public static final String VERIFY_ERROR_MSG_OTHERCERTIFICATE = "請輸入「其他附繳證件」";

    /** 錯誤訊息:請輸入事件發生(確定)日. */
    public static final String ERROR_MSG_FINEEVENTDATE = "請輸入事件發生(確定)日";

    /** 錯誤訊息:該身分證統一編號非同戶人員. */
    public static final String ERROR_MSG_NOT_HOUSE = "該身分證統一編號非同戶人員";

    /** 戶長. */
    public static final String HOUSEHOLD_HEAD = "戶長";

    /** 其他附繳證件預設文字內容. */
    public static final String OTHER_CERTIFICATE = "內政部入出國及移民署XXX年XX月XX日第XXXXXXXXXX號函";

    /** 錯誤訊息:請輸入免罰原因. */
    public static final String ERROR_MSG_REMOVEFEEREASON = "請輸入免罰原因";

    /** 檢核錯誤訊息:請輸入「是否繳交國民身分證」. */
    public static final String VERIFY_ERROR_MSG_CANCELKIND = "請輸入「是否繳交國民身分證」";

    /** 檢核錯誤訊息:請輸入「生父姓名」. */
    public static final String VERIFY_ERROR_MSG_FATHERWEBNAME = "請輸入「生父姓名」";

    /** 檢核錯誤訊息:請輸入「生父國籍」. */
    public static final String VERIFY_ERROR_MSG_FATHERNATIONALITY = "請輸入「生父國籍」";

    /** 檢核錯誤訊息:請輸入「生母姓名」. */
    public static final String VERIFY_ERROR_MSG_MOTHERWEBNAME = "請輸入「生母姓名」";

    /** 檢核錯誤訊息:請輸入「生母國籍」. */
    public static final String VERIFY_ERROR_MSG_MOTHERNATIONALITY = "請輸入「生母國籍」";

    /** 檢核錯誤訊息:請輸入「配偶姓名」. */
    public static final String VERIFY_ERROR_MSG_SPOUSENAME = "請輸入「配偶姓名」";

    /** 檢核錯誤訊息:請輸入「配偶國籍」. */
    public static final String VERIFY_ERROR_MSG_SPOUSENATIONALITY = "請輸入「配偶國籍」";

    /** 檢核錯誤訊息:「養父姓名」、「養母姓名」必須擇一輸入. */
    public static final String VERIFY_ERROR_MSG_FOSTERINFO = "「養父姓名」、「養母姓名」必須擇一輸入";

    /** 檢核錯誤訊息:請輸入「養父(母)國籍 」. */
    public static final String VERIFY_ERROR_MSG_FOSTERNATIONALITY = "請輸入「養父(母)國籍 」";

    /** 錯誤訊息:請確認個人基本資料正確無誤 */
    public static final String ERROR_MSG_PERSON = "請確認個人基本資料正確無誤";

    /** 錯誤訊息:廢止原因若為「重複設籍」，初設戶籍者只允許1人 */
    public static final String ERROR_MSG_MAINDELREASON = "廢止原因若為「重複設籍」，初設戶籍者只允許1人";

    /** 錯誤訊息:請輸入「全戶記事」 */
    public static final String ERROR_MSG_HOUSEHOLDNOTE = "請輸入「全戶記事」";

    /** 錯誤訊息:請輸入「個人記事」 */
    public static final String ERROR_MSG_PERSONNOTE = "請輸入「個人記事」";

    /**
     * 執行Contoller loadPage() 的第一個Service之共用邏輯.
     * 
     * @param dto
     *            廢止戶籍登記DTO
     * @param exec
     *            使用者資訊
     * @return 廢止戶籍登記DTO
     * @throws RisBusinessException
     *             執行程式失敗
     */
    public Rl01g19DTO initLoadPage(final Rl01g19DTO dto, ExecutantType exec) throws RisBusinessException;

    /**
     * 第一次呼叫狀態時載入廢止戶籍登記DTO.
     * 
     * @param dto
     *            廢止戶籍登記DTO
     * @param exec
     *            使用者資訊
     * @return 廢止戶籍登記DTO
     * @throws RisBusinessException
     *             顯示廢止戶籍登記登記畫面失敗
     */
    @RisServiceMethod(value = MethodType.QUERY)
    public Rl01g19DTO initOperationDTO(final Rl01g19DTO dto, ExecutantType exec) throws RisBusinessException;

    /**
     * 編輯狀態時載入廢止戶籍登記登記DTO.
     * 
     * @param dto
     *            廢止戶籍登記DTO
     * @param exec
     *            使用者資訊
     * @return 廢止戶籍登記DTO
     * @throws RisBusinessException
     *             編輯狀態時載入廢止戶籍登記登記DTO失敗
     */
    public Rl01g19DTO loadOperationDTO(final Rl01g19DTO dto, ExecutantType exec) throws RisBusinessException;

    /**
     * 再次驗證狀態時載入廢止戶籍登記登記DTO.
     * 
     * @param dto
     *            廢止戶籍登記DTO
     * @param exec
     *            使用者資訊
     * @return 廢止戶籍登記DTO
     * @throws RisBusinessException
     *             再次驗證狀態時載入廢止戶籍登記登記DTO失敗
     */
    public Rl01g19DTO reviewOperationDTO(final Rl01g19DTO dto, ExecutantType exec) throws RisBusinessException;

    /**
     * 顯示系統錯誤例外訊息.
     * 
     * @param dto
     *            廢止戶籍登記DTO
     * @param exec
     *            使用者資訊
     * @return 廢止戶籍登記DTO
     * @throws RisBusinessException
     *             新增初設戶籍者資料失敗
     */
    public Rl01g19DTO showErrorMessage(final Rl01g19DTO dto, ExecutantType exec) throws RisBusinessException;

    /**
     * 改變WEB自立新戶時之作業.
     * 
     * @param dto
     *            廢止戶籍登記DTO
     * @param exec
     *            使用者資訊
     * @return 廢止戶籍登記DTO
     * @throws RisBusinessException
     *             改變WEB申請種類時之作業失敗
     */
    public Rl01g19DTO changeIsNewHousehold(final Rl01g19DTO dto, ExecutantType exec) throws RisBusinessException;

    /**
     * 檢核廢止戶籍者個人資料.
     * 
     * @param dto
     *            廢止戶籍登記DTO
     * @param exec
     *            使用者資訊
     * @return 廢止戶籍登記DTO
     * @throws RisBusinessException
     *             改變WEB申請種類時之作業失敗
     */
    public Rl01g19DTO checkDelPersonData(final Rl01g19DTO dto, ExecutantType exec) throws RisBusinessException;

    /**
     * 改變WEB申請種類時之作業.
     * 
     * @param dto
     *            廢止戶籍登記DTO
     * @param exec
     *            使用者資訊
     * @return 廢止戶籍登記DTO
     * @throws RisBusinessException
     *             改變WEB申請種類時之作業失敗
     */
    public Rl01g19DTO changeApplyType(final Rl01g19DTO dto, ExecutantType exec) throws RisBusinessException;

    /**
     * 新增廢止戶籍者資料(建立DB Transaction).
     * 
     * @param dto
     *            廢止戶籍登記DTO
     * @param exec
     *            使用者資訊
     * @throws RisBusinessException
     *             新增廢止戶籍者資料失敗
     */
    @RisServiceMethod(value = MethodType.QUERY)
    public void addDelPersonData(final Rl01g19DTO dto, ExecutantType exec) throws RisBusinessException;

    /**
     * 刪除廢止戶籍者資料.
     * 
     * @param dto
     *            廢止戶籍登記DTO
     * @param exec
     *            使用者資訊
     * @throws RisBusinessException
     *             刪除廢止戶籍者資料失敗
     */
    public void cancelDelPersonData(final Rl01g19DTO dto, ExecutantType exec) throws RisBusinessException;

    /**
     * 刪除廢止戶籍者資料.
     * 
     * @param dto
     *            廢止戶籍登記DTO
     * @param exec
     *            使用者資訊
     * @throws RisBusinessException
     *             刪除初設戶籍登記登記資料失敗
     */
    public void doDelete(final Rl01g19DTO dto, ExecutantType exec) throws RisBusinessException;

    /**
     * 執行資料驗證並自動組合記事.
     * 
     * @param dto
     *            廢止戶籍登記DTO
     * @param exec
     *            使用者資訊
     * @throws RisBusinessException
     *             執行資料驗證並自動組合記事失敗
     */
    public void verifyAppData(final Rl01g19DTO dto, ExecutantType exec) throws RisBusinessException;

    /**
     * 暫存廢止戶籍登記申請資料至XLDF Table.
     * 
     * @param dto
     *            廢止戶籍登記DTO
     * @param exec
     *            使用者資訊
     * @throws RisBusinessException
     *             暫存廢止戶籍登記申請資料至XLDF Table失敗
     */
    @RisServiceMethod(value = MethodType.SAVE2TEMP)
    @WorkStatus(FinalType.TEMP_FINAL)
    public void saveXldf(final Rl01g19DTO dto, ExecutantType exec) throws RisBusinessException;

    /**
     * 將DTO物件序列化成檔案.
     * 
     * @param tempFileDTO
     *            暫存DTO
     * @param exec
     *            使用者資訊
     */
    public void saveTempFile(final TempFileDTO<Rl01g19DTO> tempFileDTO, final ExecutantType exec);

    /**
     * 將DTO檔案反序列化成DTO物件.
     * 
     * @param tempFileDTO
     *            暫存DTO
     * @param exec
     *            使用者資訊
     * @return 廢止戶籍登記DTO
     */
    public Rl01g19DTO loadTempFile(final TempFileDTO<Rl01g19DTO> tempFileDTO, final ExecutantType exec);
}
