/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.rl01300.service;

import tw.gov.moi.ae.common.annotation.FinalType;
import tw.gov.moi.ae.common.annotation.MethodType;
import tw.gov.moi.ae.common.annotation.RisServiceMethod;
import tw.gov.moi.ae.common.annotation.WorkStatus;
import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.domain.Rl01390DTO;
import tw.gov.moi.rl.domain.TempFileDTO;

/**
 * 初設戶籍登記登記服務介面.
 * 
 * @author Viva.Hong
 */
public interface Rl01390Service {

    /** 服務名稱. */
    public static final String SERVICE_NAME = "初設戶籍登記";

    /** 資料區名稱:RLRPA0077 */
    public static final String RLRPA0077 = "RLRPA0077";

    /** 類別名稱 */
    public static final String CLASS_NAME = "Rl01390ServiceImpl";

    /** 原街路門牌. */
    public static final String OLD_STREET_DOORPLATE = "自國外遷入";

    /** 初設戶籍登記代碼. */
    public static final String APPLY_CODE = RlConstant.STRING_ZERO_SEVEN_SEVEN;

    /** (非當事人)罰鍰金額. */
    public static final String FEE_AMOUNT = "已";

    /** 戶長. */
    public static final String HOUSEHOLD_HEAD = "戶長";

    /** 國籍行政作業別 */
    public static final String NAT = "NAT";

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

    /** 函數名稱:checkFirstPersonData. */
    public static final String CHECKFIRSTPERSONDATA = SERVICE_NAME + " checkFirstPersonData";

    /** 函數名稱:changeIsNewHousehold. */
    public static final String CHANGEISNEWHOUSEHOLD = SERVICE_NAME + " changeIsNewHousehold";

    /** 函數名稱:getNewHouseholdIdBySiteId. */
    public static final String GETNEWHOUSEHOLDIDBYSITEID = SERVICE_NAME + " getNewHouseholdIdBySiteId";

    /** 函數名稱:getHouseholdheadData. */
    public static final String GETHOUSEHOLDHEADDATA = SERVICE_NAME + " getHouseholdheadData";

    /** 函數名稱:addFirstPersonData. */
    public static final String ADDFIRSTPERSONDATA = SERVICE_NAME + " addFirstPersonData";

    /** 函數名稱:addRelatedPerson. */
    public static final String ADDRELATEDPERSON = SERVICE_NAME + " addRelatedPerson";

    /** 函數名稱:addFirstPersonDataService. */
    public static final String ADDFIRSTPERSONDATASERVICE = SERVICE_NAME + " addFirstPersonDataService";

    /** 函數名稱:cancelFirstPersonData. */
    public static final String CANCELFIRSTPERSONDATA = SERVICE_NAME + " cancelFirstPersonData";

    /** 函數名稱:showErrorMessage. */
    public static final String SHOWERRORMESSAGE = SERVICE_NAME + " showErrorMessage";

    /** 函數名稱:doDelete. */
    public static final String DODELETE = SERVICE_NAME + " doDelete";

    /** 函數名稱:doFineCheckAndCleanOldFine. */
    public static final String DOFINECHECKANDCLEANOLDFINE = SERVICE_NAME + " doFineCheckAndCleanOldFine";

    /** 函數名稱:getFineList. */
    public static final String GETFINELIST = SERVICE_NAME + " getFineList";

    /** 函數名稱:editFine. */
    public static final String EDITFINE = SERVICE_NAME + " editFine";

    /** 函數名稱:deleteFine. */
    public static final String DELETEFINE = SERVICE_NAME + " deleteFine";

    /** 函數名稱:autonotes. */
    public static final String AUTONOTES = SERVICE_NAME + " autonotes";

    /** 函數名稱:verifyAppData. */
    public static final String VERIFYAPPDATA = SERVICE_NAME + " verifyAppData";

    /** 函數名稱:verifyData. */
    public static final String VERIFYDATA = SERVICE_NAME + " verifyData";

    /** 函數名稱:savexldf. */
    public static final String SAVEXLDF = SERVICE_NAME + " savexldf";

    /** 函數名稱:createXLDFPersonData. */
    public static final String CREATEXLDFPERSONDATA = SERVICE_NAME + " createXLDFPersonData";

    /** 函數名稱:createXLDFPersonNote. */
    public static final String CREATEXLDFPERSONNOTE = SERVICE_NAME + " createXLDFPersonNote";

    /** 函數名稱:createXLDF2A10. */
    public static final String CREATEXLDF2A10 = SERVICE_NAME + " createXLDF2A10";

    /** 函數名稱:createXLDFM10M. */
    public static final String CREATEXLDFM10M = SERVICE_NAME + " createXLDFM10M";

    /** 函數名稱:createXLDFM11M. */
    public static final String CREATEXLDFM11M = SERVICE_NAME + " createXLDFM11M";

    /** 函數名稱:createXCDF001MRL. */
    public static final String CREATEXCDF001MRL = SERVICE_NAME + " createXCDF001MRL";

    /** 函數名稱:createXLDF008S. */
    public static final String CREATEXLDF008S = SERVICE_NAME + " createXLDF008S";

    /** 函數名稱:createXLDF009S. */
    public static final String CREATEXLDF009S = SERVICE_NAME + " createXLDF009S";

    /** 函數名稱:createXLDF016S. */
    public static final String CREATEXLDF016S = SERVICE_NAME + " createXLDF016S";

    /** 函數名稱:createXLDF001M. */
    public static final String CREATEXLDF001M = SERVICE_NAME + " createXLDF001M";

    /** 函數名稱:createXLDF002M. */
    public static final String CREATEXLDF002M = SERVICE_NAME + " createXLDF002M";

    /** 函數名稱:createXLDFX077M. */
    public static final String CREATEXLDFX077M = SERVICE_NAME + " createXLDFX077M";

    /** 函數名稱:createXLDFY077M. */
    public static final String CREATEXLDFY077M = SERVICE_NAME + " createXLDFY077M";

    /** 函數名稱:createXLDF006M. */
    public static final String CREATEXLDF006M = SERVICE_NAME + " createXLDF006M";

    /** 函數名稱:createXLDF022M. */
    public static final String CREATEXLDF022M = SERVICE_NAME + " createXLDF022M";

    /** 函數名稱:createOriginXLDF022M. */
    public static final String CREATEORIGINXLDF022M = SERVICE_NAME + " createOriginXLDF022M";

    /** 函數名稱:createXLDF030T. */
    public static final String CREATEXLDF030T = SERVICE_NAME + " createXLDF030T";

    /** 函數名稱:createXLDFS077. */
    public static final String CREATEXLDFS077 = SERVICE_NAME + " createXLDFS077";

    /** 函數名稱:createXLDFR077. */
    public static final String CREATEXLDFR077 = SERVICE_NAME + " createXLDFR077";

    /** 函數名稱:createXLDF003S. */
    public static final String CREATEXLDF003S = SERVICE_NAME + " createXLDF003S";

    /** 函數名稱:createXLDF039S. */
    public static final String CREATEXLDF039S = SERVICE_NAME + " createXLDF039S";

    /** 函數名稱:createXLDF004N. */
    public static final String CREATEXLDF004N = SERVICE_NAME + " createXLDF004N";

    /** 函數名稱:createXLDF021M. */
    public static final String CREATEXLDF021M = SERVICE_NAME + " createXLDF021M";

    /** 函數名稱:createRelationData. */
    public static final String CREATERELATIONDATA = SERVICE_NAME + " createRelationData";

    /** 函數名稱:createSpouseInfo. */
    public static final String CREATESPOUSEINFO = SERVICE_NAME + " createSpouseInfo";

    /** 函數名稱:createOriginSpouseInfo. */
    public static final String CREATEORIGINSPOUSEINFO = SERVICE_NAME + " createOriginSpouseInfo";

    /** 函數名稱:updateOtherData. */
    public static final String UPDATEOTHERDATA = SERVICE_NAME + " updateOtherData";

    /** 函數名稱:copyDomainType. */
    public static final String COPYDOMAINTYPE = SERVICE_NAME + " copyDomainType";

    /** 函數名稱:getRelatedPerson. */
    public static final String GETRELATEDPERSON = SERVICE_NAME + " getRelatedPerson";

    /** 函數名稱:saveKinshipDataObject. */
    public static final String SAVEKINSHIPDATAOBJECT = SERVICE_NAME + " saveKinshipDataObject";

    /** 錯誤訊息:取得生父資料錯誤(RlGetDataComponent). */
    public static final String ERROR_MSG_GETDATACOMPONENT_FATHER = "取得生父資料錯誤，請結束作業並確認191生父資料";

    /** 錯誤訊息:取得生母資料錯誤(RlGetDataComponent). */
    public static final String ERROR_MSG_GETDATACOMPONENT_MOTHER = "取得生母資料錯誤，請結束作業並確認191生母資料";

    /** 錯誤訊息:取得關係人資料錯誤. */
    public static final String ERROR_MSG_RELATIONDATA = "取得關係人資料錯誤";

    /** 錯誤訊息:統號格式錯誤. */
    public static final String ERROR_MSG_PERSONID_REGEX = " 統號第一碼不可以為數字，請結束作業並確認191補登資料";

    /** 錯誤訊息:統號重複. */
    public static final String ERROR_MSG_PERSONID = " 統號重複，請結束作業並確認191補登資料";

    /** 錯誤訊息:統號配賦註記<>4. */
    public static final String ERROR_MSG_PERSONID_RLDF022M = " 統號配賦註記<>4(遷入者補登)，請結束作業並確認統號配賦資料";

    /** 錯誤訊息:父統號與生父資料不同. */
    public static final String ERROR_MSG_PERSONID_FATHER = " 的父統號與生父資料不同，請結束作業並確認191補登資料";

    /** 錯誤訊息:母統號與生母資料不同. */
    public static final String ERROR_MSG_PERSONID_MOTHER = " 的母統號與生母資料不同，請結束作業並確認191補登資料";

    /** 錯誤訊息:已存在初設戶籍者清單. */
    public static final String ERROR_MSG_PERSONID_REPEAT = " 已存在初設戶籍者清單";

    /** 錯誤訊息:取得作業點為siteId的自立新戶之新戶號失敗. */
    public static final String ERROR_MSG_NEWHOUSEHOLDID = "取得作業點為siteId的自立新戶之新戶號失敗";

    /** 錯誤訊息:統號不可為空白. */
    public static final String ERROR_MSG_EMPTY = "統號不可為空白";

    /** 錯誤訊息:統號格式錯誤. */
    public static final String ERROR_MSG_REG = "統號格式錯誤";

    /** 錯誤訊息:請勾選需刪除初設戶籍者. */
    public static final String ERROR_MSG_DELETE = "請勾選需刪除初設戶籍者";

    /** 檢核錯誤訊息:請輸入「自立新戶」. */
    public static final String VERIFY_ERROR_MSG_ISNEWHOUSEHOLD = "請輸入「自立新戶」";

    /** 檢核錯誤訊息:請輸入「(全戶)作業點代碼」. */
    public static final String VERIFY_ERROR_MSG_HOUSEHOLDHEADSITEID = "請輸入「(全戶)作業點代碼」";

    /** 檢核錯誤訊息:請輸入「(全戶)戶長統號」. */
    public static final String VERIFY_ERROR_MSG_HOUSEHOLDHEADID = "請輸入「(全戶)戶長統號」";

    /** 檢核錯誤訊息:請輸入「(全戶)戶號」. */
    public static final String VERIFY_ERROR_MSG_HOUSEHOLDID = "請輸入「(全戶)戶號」";

    /** 檢核錯誤訊息:全戶基本資料Facade物件Null. */
    public static final String VERIFY_ERROR_MSG_HOUSEHOLDDATA = "全戶基本資料Facade物件Null";

    /** 檢核錯誤訊息:請輸入「(全戶)省市縣市」. */
    public static final String VERIFY_ERROR_MSG_COUNTYCODE = "請輸入「(全戶)省市縣市」";

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

    /** 檢核錯誤訊息:請輸入「(全戶)申請日期」. */
    public static final String VERIFY_ERROR_MSG_APPLYDATE = "請輸入「(全戶)申請日期」";

    /** 檢核錯誤訊息:請輸入「(附繳證件)定居證」. */
    public static final String VERIFY_ERROR_MSG_CERTIFICATE1 = "請輸入「(附繳證件)定居證」";

    /** 檢核錯誤訊息:請輸入「(附繳證件)其他 」. */
    public static final String VERIFY_ERROR_MSG_OTHERCERTIFICATE = "請輸入「(附繳證件)其他 」";

    /** 檢核錯誤訊息:請輸入「初設戶籍原因」. */
    public static final String VERIFY_ERROR_MSG_FIRSTREASONCODE = "請輸入「初設戶籍原因」";

    /** 檢核錯誤訊息:請輸入「(初設戶籍者)原申請設籍作業點代碼」. */
    public static final String VERIFY_ERROR_MSG_ORIGINALSITEID = "請輸入「(初設戶籍者)原申請設籍作業點代碼」";

    /** 檢核錯誤訊息:原申請設籍作業點代碼不可為資料補登. */
    public static final String VERIFY_ERROR_MSG_ORIGINALSITEID_NOT_888 = "原申請設籍作業點代碼不可為資料補登";

    /** 檢核錯誤訊息:請輸入「(初設戶籍者)稱謂」. */
    public static final String VERIFY_ERROR_MSG_RELATIONSHIP = "請輸入「(初設戶籍者)稱謂」";

    /** 檢核錯誤訊息:請輸入「(初設戶籍者)教育程度註記」. */
    public static final String VERIFY_ERROR_MSG_EDUCATIONMARK = "請輸入「(初設戶籍者)教育程度註記」";

    /** 檢核錯誤訊息:請輸入「(初設戶籍者)(原屬)國籍代碼」. */
    public static final String VERIFY_ERROR_MSG_NATIONALITYCODE = "請輸入「(初設戶籍者)(原屬)國籍代碼」";

    /** 檢核錯誤訊息:請輸入「(初設戶籍者)其他(原屬)國籍」. */
    public static final String VERIFY_ERROR_MSG_NATIONALITY = "請輸入「(初設戶籍者)其他(原屬)國籍」";

    /** 檢核錯誤訊息:請輸入「(初設戶籍者)原住地」. */
    public static final String VERIFY_ERROR_MSG_ORGLIVINGPLACE = "請輸入「(初設戶籍者)原住地」";

    /** 檢核錯誤訊息:請輸入「(初設戶籍者)入境日期」. */
    public static final String VERIFY_ERROR_MSG_ENTRYDATE = "請輸入「(初設戶籍者)入境日期」";

    /** 檢核錯誤訊息:請輸入「取得國籍日期」. */
    public static final String VERIFY_ERROR_MSG_OBTAINNATIONALITYDATE = "請輸入「取得國籍日期」";

    /** 檢核錯誤訊息:請輸入「戶政事務所核准日期」. */
    public static final String VERIFY_ERROR_MSG_ADMOAPPROVEDDATE = "請輸入「戶政事務所核准日期」";

    /** 檢核錯誤訊息:請輸入「受理地戶政事務所字」. */
    public static final String VERIFY_ERROR_MSG_ACPTADMOSIGN = "請輸入「受理地戶政事務所字」";

    /** 檢核錯誤訊息:請輸入「移民署函日期」. */
    public static final String VERIFY_ERROR_MSG_REISSUEDATE = "請輸入「移民署函日期」";

    /** 檢核錯誤訊息:請輸入「受理地戶政事務所號函」. */
    public static final String VERIFY_ERROR_MSG_ACPTADMOMARKING = "請輸入「受理地戶政事務所號函」";

    /** 錯誤訊息:請輸入事件發生(確定)日. */
    public static final String ERROR_MSG_FINEEVENTDATE = "請輸入事件發生(確定)日";

    /** 檢核錯誤訊息:「初設戶籍者(原屬)國籍代碼不可為001～005」. */
    public static final String VERIFY_ERROR_MSG_NATIONALITYCODE6 = "「初設戶籍者(原屬)國籍代碼不可為001～005」";

    /** 檢核錯誤訊息:「初設戶籍者(原屬)國籍須為無戶籍國民」. */
    public static final String VERIFY_ERROR_MSG_NATIONALITYCODE7 = "「初設戶籍者(原屬)國籍須為無戶籍國民」";

    /** 檢核錯誤訊息:「初設戶籍者(原屬)國籍須為香港或澳門」. */
    public static final String VERIFY_ERROR_MSG_NATIONALITYCODE8 = "「初設戶籍者(原屬)國籍須為香港或澳門」";

    /** 檢核錯誤訊息:「初設戶籍者(原屬)國籍須為中國大陸」. */
    public static final String VERIFY_ERROR_MSG_NATIONALITYCODE9 = "「初設戶籍者(原屬)國籍須為中國大陸」";

    /** 檢核錯誤訊息:「初設戶籍原因」須為「外國人或無國籍人核准定居」. */
    public static final String VERIFY_ERROR_MSG_PERSONID3RD_REGEX6 = "「初設戶籍原因」須為「外國人或無國籍人核准定居」";

    /** 檢核錯誤訊息:(初設戶籍者)原住地不為國外. */
    public static final String VERIFY_ERROR_MSG_PERSONID3RD_REGEX7 = "「(初設戶籍者)原住地不為國外」";

    /** 檢核錯誤訊息:無戶籍國民，初設戶籍原因須填「中華民國國人入境核准定居」. */
    public static final String VERIFY_ERROR_MSG_PERSONID3RD_REGEX7_2 = "無戶籍國民，初設戶籍原因須填「中華民國國人入境核准定居」";

    /** 檢核錯誤訊息:(初設戶籍者)原住地不為香港、澳門. */
    public static final String VERIFY_ERROR_MSG_PERSONID3RD_REGEX8 = "「(初設戶籍者)原住地不為香港、澳門」";

    /** 檢核錯誤訊息:(初設戶籍者)原住地不為大陸地區. */
    public static final String VERIFY_ERROR_MSG_PERSONID3RD_REGEX9 = "「(初設戶籍者)原住地不為大陸地區」";

    /** 檢核錯誤訊息:擬入戶戶籍住址不存在里鄰門牌資料檔，請檢查. */
    public static final String VERIFY_ERROR_MSG_8 = "擬入戶戶籍住址不存在里鄰門牌資料檔，請檢查";

    /** 檢核錯誤訊息:「街路門牌」」為不得設籍. */
    public static final String VERIFY_ERROR_MSG_9 = "「streetdoorplate」為不得設籍";

    /** 檢核錯誤訊息:初設戶籍者個人狀況資料尚未確認完成. */
    public static final String VERIFY_ERROR_MSG_FINISH = "初設戶籍者個人狀況資料尚未確認完成";

    /** 錯誤訊息:請輸入免罰原因. */
    public static final String ERROR_MSG_REMOVEFEEREASON = "請輸入免罰原因";

    /** 錯誤訊息:繼續修改初設戶籍申請日期?. */
    public static final String ERROR_MSG_APYYYMMDD = "繼續修改初設戶籍申請日期?";

    /** 錯誤訊息:逕為登記初設戶籍原因須為「大陸地區居民經撤銷原撤銷處分回復定居許可」. */
    public static final String ERROR_MSG_FIRSTREASONCODE = "逕為登記初設戶籍原因須為「大陸地區居民經撤銷原撤銷處分回復定居許可」";

    /** 錯誤訊息:請確認個人基本資料正確無誤 */
    public static final String ERROR_MSG_PERSON = "請確認個人基本資料正確無誤";

    /** 錯誤訊息:請確認全戶基本資料正確無誤 */
    public static final String ERROR_MSG_HOUSEHOLD = "請確認全戶基本資料正確無誤";

    /**
     * 執行Contoller loadPage() 的第一個Service之共用邏輯.
     * 
     * @param dto
     *            初設戶籍登記DTO
     * @param exec
     *            ExecutantType
     * @throws RisBusinessException
     *             執行程式失敗
     */
    @RisServiceMethod(value = MethodType.QUERY)
    public void initLoadPage(final Rl01390DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 一次呼叫狀態時載入初設戶籍登記登記DTO.
     * 
     * @param dto
     *            初設戶籍登記DTO
     * @param exec
     *            ExecutantType
     * @return 初設戶籍登記DTO
     * @throws RisBusinessException
     *             顯示初設戶籍登記登記畫面失敗
     */
    @RisServiceMethod(value = MethodType.QUERY)
    public Rl01390DTO initOperationDTO(final Rl01390DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 編輯狀態時載入初設戶籍登記登記DTO.
     * 
     * @param dto
     *            初設戶籍登記DTO
     * @param exec
     *            ExecutantType
     * @return 初設戶籍登記DTO
     * @throws RisBusinessException
     *             編輯狀態時載入初設戶籍登記登記DTO失敗
     */
    @RisServiceMethod(value = MethodType.QUERY)
    public Rl01390DTO loadOperationDTO(final Rl01390DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 再次驗證狀態時載入初設戶籍登記登記DTO.
     * 
     * @param dto
     *            初設戶籍登記DTO
     * @param exec
     *            ExecutantType
     * @return 初設戶籍登記DTO
     * @throws RisBusinessException
     *             再次驗證狀態時載入初設戶籍登記登記DTO失敗
     */
    @RisServiceMethod(value = MethodType.QUERY)
    public Rl01390DTO reviewOperationDTO(final Rl01390DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 顯示系統錯誤例外訊息.
     * 
     * @param dto
     *            初設戶籍登記DTO
     * @param exec
     *            ExecutantType
     * @return 初設戶籍登記DTO
     * @throws RisBusinessException
     *             新增初設戶籍者資料失敗
     */
    @RisServiceMethod(value = MethodType.QUERY)
    public Rl01390DTO showErrorMessage(final Rl01390DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 檢核初設戶籍者個人資料.
     * 
     * @param dto
     *            初設戶籍登記DTO
     * @param exec
     *            ExecutantType
     * @return 錯誤訊息清單
     * @throws RisBusinessException
     *             新增初設戶籍者資料失敗
     */
    @RisServiceMethod(value = MethodType.VERIFY)
    public void checkFirstPersonData(final Rl01390DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 取得非自立新戶時擬入戶戶長資料.
     * 
     * @param dto
     *            初設戶籍登記DTO
     * @param exec
     *            ExecutantType
     * @return the householdhead data
     * @throws RisBusinessException
     *             取得非自立新戶時擬入戶戶長資料
     */
    @RisServiceMethod(value = MethodType.QUERY)
    public void getHouseholdheadData(final Rl01390DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 新增初設戶籍者資料(建立DB Transaction).
     * 
     * @param dto
     *            初設戶籍登記DTO
     * @param exec
     *            ExecutantType
     * @throws RisBusinessException
     *             新增初設戶籍者資料失敗
     */
    @RisServiceMethod(value = MethodType.QUERY)
    public void addFirstPersonData(final Rl01390DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 改變WEB自立新戶時之作業.
     * 
     * @param rl01390dto
     *            初設戶籍登記DTO
     * @param exec
     *            ExecutantType
     * @return 初設戶籍登記DTO
     * @throws RisBusinessException
     *             新增初設戶籍者資料失敗
     */
    @RisServiceMethod(value = MethodType.QUERY)
    public Rl01390DTO changeIsNewHousehold(final Rl01390DTO rl01390dto, final ExecutantType exec)
            throws RisBusinessException;

    /**
     * 刪除初設戶籍者資料.
     * 
     * @param dto
     *            初設戶籍登記DTO
     * @param exec
     *            ExecutantType
     * @throws RisBusinessException
     *             新增初設戶籍者資料(建立DB Transaction)失敗
     */
    @RisServiceMethod(value = MethodType.DELETE)
    public void cancelFirstPersonData(final Rl01390DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 刪除初設戶籍登記登記資料.
     * 
     * @param dto
     *            初設戶籍登記DTO
     * @param exec
     *            ExecutantType
     * @throws RisBusinessException
     *             刪除初設戶籍登記登記資料失敗
     */
    @RisServiceMethod(value = MethodType.DELETE)
    public void doDelete(final Rl01390DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 取得罰鍰清單資料X.
     * 
     * @param dto
     *            初設戶籍登記DTO
     * @param exec
     *            ExecutantType
     * @return the fine list
     * @throws RisBusinessException
     *             取得罰鍰清單資料失敗
     */
    @RisServiceMethod(value = MethodType.QUERY)
    public void getFineList(final Rl01390DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 編輯罰鍰處分書X.
     * 
     * @param dto
     *            初設戶籍登記DTO
     * @param exec
     *            ExecutantType
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(value = MethodType.QUERY)
    public void editFine(final Rl01390DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 刪除罰鍰處分書X.
     * 
     * @param dto
     *            初設戶籍登記DTO
     * @param exec
     *            ExecutantType
     * @throws RisBusinessException
     *             the ris business exception
     */
    @RisServiceMethod(value = MethodType.DELETE)
    public void deleteFine(final Rl01390DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 執行資料驗證並自動組合記事.
     * 
     * @param dto
     *            初設戶籍登記DTO
     * @param exec
     *            ExecutantType
     * @throws RisBusinessException
     *             執行資料驗證並自動組合記事失敗
     */
    @RisServiceMethod(value = MethodType.VERIFY)
    public void verifyAppData(final Rl01390DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 暫存初設戶籍登記登記申請資料至XLDF Table.
     * 
     * @param dto
     *            初設戶籍登記DTO
     * @param exec
     *            ExecutantType
     * @throws RisBusinessException
     *             暫存初設戶籍登記登記申請資料至XLDF Table失敗
     */
    @RisServiceMethod(value = MethodType.SAVE2TEMP)
    @WorkStatus(FinalType.TEMP_FINAL)
    public void saveXldf(final Rl01390DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 將DTO物件序列化成檔案.
     * 
     * @param tempFileDTO
     *            暫存DTO
     * @param exec
     *            ExecutantType
     */
    @RisServiceMethod(MethodType.SAVE2TEMP)
    public void saveTempFile(final TempFileDTO<Rl01390DTO> tempFileDTO, final ExecutantType exec);

    /**
     * 將DTO檔案反序列化成DTO物件.
     * 
     * @param tempFileDTO
     *            暫存DTO
     * @param exec
     *            ExecutantType
     * @return 初設戶籍登記DTO
     */
    @RisServiceMethod(MethodType.QUERY)
    public Rl01390DTO loadTempFile(final TempFileDTO<Rl01390DTO> tempFileDTO, final ExecutantType exec);

    /**
     * 建立XLDF資料.
     * 
     * @param dto
     *            初設戶籍登記DTO
     * @param exec
     *            使用者資訊
     * @throws RisBusinessException
     *             建立XLDF資料失敗
     */
    public void createOriginXLDF(final Rl01390DTO dto, final ExecutantType exec) throws RisBusinessException;

}