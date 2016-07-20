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
import tw.gov.moi.rl.domain.Rl01819DTO;
import tw.gov.moi.rl.domain.TempFileDTO;

/**
 * 撤銷戶籍登記登記服務介面.
 * 
 * @author Peter Yu
 */
public interface Rl01819Service {

    /** 撤銷戶籍登記代碼. */
    public static final String APPLY_CODE = "09I";

    /** 資料區名稱:RLRPA009I */
    public static final String RLRPA009I = "RLRPA009I";

    /** 服務名稱. */
    public static final String SERVICE_NAME = "撤銷戶籍登記";

    /** 戶長. */
    public static final String HOUSEHOLD_HEAD = "戶長";

    /** 類別名稱. */
    public static final String CLASS_NAME = "Rl01819ServiceImpl";

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

    /** 函數名稱:checkFirstPersonData. */
    public static final String CHECKFIRSTPERSONDATA = SERVICE_NAME + " checkFirstPersonData";

    /** 函數名稱:changeIsNewHousehold. */
    public static final String CHANGEISNEWHOUSEHOLD = SERVICE_NAME + " changeIsNewHousehold";

    /** 函數名稱:getNewHouseholdIdBySiteId. */
    public static final String GETNEWHOUSEHOLDIDBYSITEID = SERVICE_NAME + " getNewHouseholdIdBySiteId";

    /** 函數名稱:getHouseholdheadData. */
    public static final String GETHOUSEHOLDHEADDATA = SERVICE_NAME + " getHouseholdheadData";

    /** 函數名稱:getHouseholdMembers. */
    public static final String GETHOUSEHOLDMEMBERS = SERVICE_NAME + " getHouseholdMembers";

    /** 函數名稱:addFirstPersonData. */
    public static final String ADDFIRSTPERSONDATA = SERVICE_NAME + " addFirstPersonData";

    /** 函數名稱:addFirstPersonDataService. */
    public static final String ADDFIRSTPERSONDATASERVICE = SERVICE_NAME + " addFirstPersonDataService";

    /** 函數名稱:addFirstPersonData. */
    public static final String GETFINALPERSONDATA = SERVICE_NAME + " getFinalPersonData";

    /** 函數名稱:addFirstPersonDataService. */
    public static final String GETFINALPERSONDATASERVICE = SERVICE_NAME + " getFinalPersonDataService";

    /** 函數名稱:cancelFirstPersonData. */
    public static final String CANCELFIRSTPERSONDATA = SERVICE_NAME + " cancelFirstPersonData";

    /** 函數名稱:checkDelPersonData. */
    public static final String CHECKDELPERSONDATA = SERVICE_NAME + " checkDelPersonData";

    /** 函數名稱:showErrorMessage. */
    public static final String SHOWERRORMESSAGE = SERVICE_NAME + " showErrorMessage";

    /** 函數名稱:doDelete. */
    public static final String DODELETE = SERVICE_NAME + " doDelete";

    /** 函數名稱:doDelete. */
    public static final String VERIFYAPPDATA = SERVICE_NAME + " verifyAppData";

    /** 函數名稱:verifyData. */
    public static final String VERIFYDATA = SERVICE_NAME + " verifyData";

    /** 函數名稱:getFineList. */
    public static final String GETFINELIST = SERVICE_NAME + " getFineList";

    /** 函數名稱:editFine. */
    public static final String EDITFINE = SERVICE_NAME + " editFine";

    /** 函數名稱:deleteFine. */
    public static final String DELETEFINE = SERVICE_NAME + " deleteFine";

    /** 函數名稱:autonotes. */
    public static final String AUTONOTES = SERVICE_NAME + " autonotes";

    /** 函數名稱:savexldf. */
    public static final String SAVEXLDF = SERVICE_NAME + " savexldf";

    /** 函數名稱:doFineCheckAndCleanOldFine. */
    public static final String DOFINECHECKANDCLEANOLDFINE = SERVICE_NAME + " doFineCheckAndCleanOldFine";

    /** 函數名稱:lockRCDF001MRL. */
    public static final String LOCKRCDF001MRL = SERVICE_NAME + " lockRCDF001MRL";

    /** 函數名稱:removeHousehold. */
    public static final String REMOVEHOUSEHOLD = SERVICE_NAME + " removeHousehold";

    /** 函數名稱:updateMemberPersonData. */
    public static final String UPDATEMEMBERPERSONDATA = SERVICE_NAME + " updateMemberPersonData";

    /** 函數名稱:updateDelMemberPersonData. */
    public static final String UPDATEDELMEMBERPERSONDATA = SERVICE_NAME + " updateDelMemberPersonData";

    /** 函數名稱:updateOldXLDF001M. */
    public static final String UPDATEOLDXLDF001M = SERVICE_NAME + " updateOldXLDF001M";

    /** 函數名稱:createNewXLDF001M. */
    public static final String CREATENEWXLDF001M = SERVICE_NAME + " createNewXLDF001M";

    /** 函數名稱:createXLDFPersonData. */
    public static final String CREATEXLDFPERSONDATA = SERVICE_NAME + " createXLDFPersonData";

    /** 函數名稱:createXLDFPersonNote. */
    public static final String CREATEXLDFPERSONNOTE = SERVICE_NAME + " createXLDFPersonNote";

    /** 函數名稱:createXLDFPersonNote. */
    public static final String CREATEXLDFHOUSEHOLDNOTE = SERVICE_NAME + " createXLDFHouseholdNote";

    /** 函數名稱:createXLDF2A10. */
    public static final String CREATEXLDF2A10 = SERVICE_NAME + " createXLDF2A10";

    /** 函數名稱:updateMemberPersonData. */
    public static final String UPDATEMEMBERPERSONData = SERVICE_NAME + " updateMemberPersonData";

    /** 函數名稱:updateDelMemberPersonData. */
    public static final String UPDATEDELMEMBERPERSONData = SERVICE_NAME + " updateDelMemberPersonData";

    /** 函數名稱:updateXCDF001MRL. */
    public static final String UPDATEXCDF001MRL = SERVICE_NAME + " updateXCDF001MRL";

    /** 函數名稱:createXLDFM10M. */
    public static final String CREATEXLDFM10M = SERVICE_NAME + " createXLDFM10M";

    /** 函數名稱:createXLDFM10H. */
    public static final String CREATEXLDFM10H = SERVICE_NAME + " createXLDFM10H";

    /** 函數名稱:createXCDF001MRL. */
    public static final String CREATEXCDF001MRL = SERVICE_NAME + " createXCDF001MRL";

    /** 函數名稱:createXLDF008S. */
    public static final String CREATEXLDF008S = SERVICE_NAME + " createXLDF008S";

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

    /** 函數名稱:createXLDF030T. */
    public static final String CREATEXLDF030T = SERVICE_NAME + " createXLDF030T";

    /** 函數名稱:createXLDFS077. */
    public static final String CREATEXLDFS077 = SERVICE_NAME + " createXLDFS077";

    /** 函數名稱:createXLDF003S. */
    public static final String CREATEXLDF003S = SERVICE_NAME + " createXLDF003S";

    /** 函數名稱:createXLDF039S. */
    public static final String CREATEXLDF039S = SERVICE_NAME + " createXLDF039S";

    /** 函數名稱:createXLDF003D. */
    public static final String CREATEXLDF003D = SERVICE_NAME + " createXLDF003D";

    /** 函數名稱:createXLDFS09I. */
    public static final String CREATEXLDFS09I = SERVICE_NAME + " createXLDFS09I";

    /** 函數名稱:removeHouseholdCommonFunction. */
    public static final String REMOVEHOUSEHOLDCOMMONFUNCTION = SERVICE_NAME + " removeHouseholdCommonFunction";

    /** 函數名稱:createXLDFY09IMY09IH. */
    public static final String CREATEXLDFY09IMY09IH = SERVICE_NAME + " createXLDFY09IMY09IH";

    /** 函數名稱:createXLDFX09IMX09IH. */
    public static final String CREATEXLDFX09IMX09IH = SERVICE_NAME + " createXLDFX09IMX09IH";

    /** 函數名稱:createXCDF002E. */
    public static final String CREATEXCDF002E = SERVICE_NAME + " createXCDF002E";

    /** 函數名稱:createXLDF004N. */
    public static final String CREATEXLDF004N = SERVICE_NAME + " createXLDF004N";

    /** 函數名稱:updateOtherData. */
    public static final String UPDATEOTHERDATA = SERVICE_NAME + " updateOtherData";

    /** 函數名稱:copyDomainType. */
    public static final String COPYDOMAINTYPE = SERVICE_NAME + " copyDomainType";

    /** 函數名稱:updateNewHousePersonDataList. */
    public static final String UPDATENEWHOUSEPERSONDATALIST = SERVICE_NAME + " updateNewHousePersonDataList";

    /** 函數名稱:saveKinshipDataObject. */
    public static final String SAVEKINSHIPDATAOBJECT = SERVICE_NAME + " saveKinshipDataObject";

    /** 錯誤訊息:取得生父資料錯誤(RlGetDataComponent). */
    public static final String ERROR_MSG_GETDATACOMPONENT_FATHER = "取得生父資料錯誤，請結束作業並確認191生父資料";

    /** 錯誤訊息:取得生母資料錯誤(RlGetDataComponent). */
    public static final String ERROR_MSG_GETDATACOMPONENT_MOTHER = "取得生母資料錯誤，請結束作業並確認191生母資料";

    /** 錯誤訊息:統號格式錯誤. */
    public static final String ERROR_MSG_PERSONID_REGEX = " 統號第一碼不可以為數字，請結束作業並確認191補登資料";

    /** 錯誤訊息:統號重複. */
    public static final String ERROR_MSG_PERSONID = " 統號重複，請結束作業並確認191補登資料";

    /** 錯誤訊息:統號配賦註記<>4. */
    public static final String ERROR_MSG_PERSONID_RLDF002M = " 統號配賦註記<>4，請結束作業並確認統號配賦資料";

    /** 錯誤訊息:父統號與生父資料不同. */
    public static final String ERROR_MSG_PERSONID_FATHER = " 的父統號與生父資料不同，請結束作業並確認191補登資料";

    /** 錯誤訊息:母統號與生母資料不同. */
    public static final String ERROR_MSG_PERSONID_MOTHER = " 的母統號與生母資料不同，請結束作業並確認191補登資料";

    /** 錯誤訊息:已存在撤銷戶籍者清單. */
    public static final String ERROR_MSG_PERSONID_REPEAT = " 已存在撤銷戶籍者清單";

    /** 錯誤訊息:取得作業點為siteId的自立新戶之新戶號失敗. */
    public static final String ERROR_MSG_NEWHOUSEHOLDID = "取得作業點為siteId的自立新戶之新戶號失敗";

    /** 錯誤訊息:統號不可為空白. */
    public static final String ERROR_MSG_EMPTY = "統號不可為空白";

    /** 錯誤訊息:統號格式錯誤. */
    public static final String ERROR_MSG_REG = "統號格式錯誤";

    /** 錯誤訊息:請勾選需刪除撤銷戶籍者. */
    public static final String ERROR_MSG_DELETE = "請勾選需刪除撤銷戶籍者";

    /** 錯誤訊息:請結束作業. */
    public static final String ERROR_MSG_WORKCLOSE = "請結束作業";

    /** 檢核錯誤訊息:請輸入「(撤銷後設籍地-當事人) 身分證統一編號」. */
    public static final String VERIFY_ERROR_MSG_WEBFINALPERSONID = "請輸入「(撤銷後設籍地-當事人) 身分證統一編號」";

    /** 檢核錯誤訊息:請先取得「(撤銷後設籍地-當事人)資料」. */
    public static final String VERIFY_ERROR_MSG_WEBFINALDATA = "請先取得「(撤銷後設籍地-當事人)資料」";

    /** 檢核錯誤訊息:請輸入「自立新戶」. */
    public static final String VERIFY_ERROR_MSG_ISNEWHOUSEHOLD = "請輸入「自立新戶」";

    /** 檢核錯誤訊息:請輸入「(全戶)作業點代碼」. */
    public static final String VERIFY_ERROR_MSG_HOUSEHOLDHEADSITEID = "請輸入「(全戶)作業點代碼」";

    /** 發生錯誤函數:lockRCDF001MRL. */
    public static final String ERROR_METHOD_LOCKRCDF001MRL = SERVICE_NAME + " lockRCDF001MRL";

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

    /** 檢核錯誤訊息:請輸入「(撤銷戶籍者)補報戶籍」. */
    public static final String VERIFY_ERROR_MSG_SUPPLEMENTARYFLAG = "請輸入「(撤銷戶籍者)補報戶籍」";

    /** 檢核錯誤訊息:請輸入「(撤銷戶籍者)原申請設籍作業點代碼」. */
    public static final String VERIFY_ERROR_MSG_ORIGINALSITEID = "請輸入「(撤銷戶籍者)原申請設籍作業點代碼」";

    /** 檢核錯誤訊息:請輸入「(撤銷後設籍地)當事人資料作業點代碼」. */
    public static final String VERIFY_ERROR_MSG_FINALSITEID = "請輸入「(撤銷後設籍地)當事人資料作業點代碼」";

    /** 檢核錯誤訊息:請輸入「(撤銷戶籍者)稱謂」. */
    public static final String VERIFY_ERROR_MSG_RELATIONSHIP = "請輸入「(撤銷戶籍者)稱謂」";

    /** 檢核錯誤訊息:請輸入「(撤銷後設籍地-當事人資料)教育程度註記」. */
    public static final String VERIFY_ERROR_MSG_FINALEDUCATIONMARK = "請輸入「(撤銷後設籍地-當事人資料)教育程度註記」";

    /** 檢核錯誤訊息:請輸入「(撤銷戶籍地-撤銷戶籍者資料)教育程度註記」. */
    public static final String VERIFY_ERROR_MSG_EDUCATIONMARK = "請輸入「(撤銷戶籍地-撤銷戶籍者資料)教育程度註記」";

    /** 檢核錯誤訊息:請輸入「(撤銷戶籍者)(原屬)國籍代碼」. */
    public static final String VERIFY_ERROR_MSG_NATIONALITYCODE = "請輸入「(撤銷戶籍者)(原屬)國籍代碼」";

    /** 檢核錯誤訊息:請輸入「(撤銷戶籍者)其他(原屬)國籍」. */
    public static final String VERIFY_ERROR_MSG_NATIONALITY = "請輸入「(撤銷戶籍者)其他(原屬)國籍」";

    /** 檢核錯誤訊息:請輸入「(撤銷戶籍者)原住地」. */
    public static final String VERIFY_ERROR_MSG_ORGLIVINGPLACE = "請輸入「(撤銷戶籍者)原住地」";

    /** 檢核錯誤訊息:請輸入「(撤銷戶籍者)入境日期」. */
    public static final String VERIFY_ERROR_MSG_ENTRYDATE = "請輸入「(撤銷戶籍者)入境日期」";

    /** 檢核錯誤訊息:請輸入「取得國籍日期」. */
    public static final String VERIFY_ERROR_MSG_OBTAINNATIONALITYDATE = "請輸入「取得國籍日期」";

    /** 檢核錯誤訊息:請輸入「戶政事務所核准日期」. */
    public static final String VERIFY_ERROR_MSG_ADMOAPPROVEDDATE = "請輸入「戶政事務所核准日期」";

    /** 檢核錯誤訊息:請輸入「受理地戶政事務所字」. */
    public static final String VERIFY_ERROR_MSG_ACPTADMOSIGN = "請輸入「受理地戶政事務所字」";

    /** 檢核錯誤訊息:請輸入「受理地戶政事務所號函」. */
    public static final String VERIFY_ERROR_MSG_ACPTADMOMARKING = "請輸入「受理地戶政事務所號函」";

    /** 檢核錯誤訊息:「撤銷戶籍者(原屬)國籍須為無戶籍國民」. */
    public static final String VERIFY_ERROR_MSG_NATIONALITYCODE7 = "「撤銷戶籍者(原屬)國籍須為無戶籍國民」";

    /** 檢核錯誤訊息:「撤銷戶籍者(原屬)國籍須為香港或澳門」. */
    public static final String VERIFY_ERROR_MSG_NATIONALITYCODE8 = "「撤銷戶籍者(原屬)國籍須為香港或澳門」";

    /** 檢核錯誤訊息:「撤銷戶籍者(原屬)國籍須為中國大陸」. */
    public static final String VERIFY_ERROR_MSG_NATIONALITYCODE9 = "「撤銷戶籍者(原屬)國籍須為中國大陸」";

    /** 檢核錯誤訊息:「撤銷戶籍者姓名欄項」原住地不為國外. */
    public static final String VERIFY_ERROR_MSG_PERSONID3RD_REGEX7 = "「撤銷戶籍者姓名欄項」原住地不為國外";

    /** 檢核錯誤訊息:「撤銷戶籍者姓名欄項」原住地不為香港、澳門. */
    public static final String VERIFY_ERROR_MSG_PERSONID3RD_REGEX8 = "「撤銷戶籍者姓名欄項」原住地不為香港、澳門";

    /** 檢核錯誤訊息:「撤銷戶籍者姓名欄項」原住地不為大陸地區. */
    public static final String VERIFY_ERROR_MSG_PERSONID3RD_REGEX9 = "「撤銷戶籍者姓名欄項」原住地不為大陸地區";

    /** 檢核錯誤訊息:擬入戶戶籍住址不存在里鄰門牌資料檔，請檢查. */
    public static final String VERIFY_ERROR_MSG_8 = "擬入戶戶籍住址不存在里鄰門牌資料檔，請檢查";

    /** 檢核錯誤訊息:Rl01819DTO.webHouseholdHeadPersonData（畫面-全戶基本資料）.「街路門牌」」為不得設籍. */
    public static final String VERIFY_ERROR_MSG_9 = "Rl01819DTO.webHouseholdHeadPersonData（畫面-全戶基本資料）.「街路門牌」」為不得設籍";

    /** 檢核錯誤訊息:撤銷戶籍者資料尚未確認完成. */
    public static final String VERIFY_ERROR_MSG_FINISH = "撤銷戶籍者資料尚未確認完成";

    /** 檢核錯誤訊息:請選擇「新戶長」. */
    public static final String VERIFY_ERROR_MSG_NEWHOUSEHOLDHEAD = "請選擇「新戶長」";

    /** 檢核錯誤訊息:請輸入「戶別」. */
    public static final String VERIFY_ERROR_MSG_NEWHOUSEHOLDTYPE = "請輸入「戶別」";

    /** 檢核錯誤訊息:請輸入「兼任戶長註記」. */
    public static final String VERIFY_ERROR_MSG_CONCURRENTHEADMARK = "請輸入「兼任戶長註記」";

    /** 檢核錯誤訊息:請輸入「(原始設籍地)設籍日期」. */
    public static final String VERIFY_ERROR_MSG_BEFOREFinalMoveInYyymmdd = "請輸入「(原始設籍地)設籍日期」";

    /** 檢核錯誤訊息:請輸入「(原始設籍地)省市縣市」. */
    public static final String VERIFY_ERROR_MSG_BEFOREFinalCOUNTYCODE = "請輸入「(原始設籍地)省市縣市」";

    /** 檢核錯誤訊息:請輸入「(原始設籍地)鄉鎮市區」. */
    public static final String VERIFY_ERROR_MSG_BEFOREFinalTOWNCODE = "請輸入「(原始設籍地)鄉鎮市區」";

    /** 檢核錯誤訊息:請輸入「(原始設籍地)村里」. */
    public static final String VERIFY_ERROR_MSG_BEFOREFinalVILLAGE = "請輸入「(原始設籍地)村里」";

    /** 檢核錯誤訊息:請輸入「(原始設籍地)鄰」. */
    public static final String VERIFY_ERROR_MSG_BEFOREFinalNEIGHBOR = "請輸入「(原始設籍地)鄰」";

    /** 檢核錯誤訊息:請輸入「(原始設籍地)地址」. */
    public static final String VERIFY_ERROR_MSG_BEFOREFinalSTREETDOORPLATE = "請輸入「(原始設籍地)地址」";

    /** 檢核錯誤訊息:請輸入「撤銷原因」. */
    public static final String VERIFY_ERROR_MSG_DELREASON = "請輸入「撤銷原因」";

    /** 錯誤訊息:請輸入事件發生(確定)日. */
    public static final String ERROR_MSG_FINEEVENTDATE = "請輸入事件發生(確定)日";

    /** 其他附繳證件預設文字內容. */
    public static final String OTHER_CERTIFICATE = "";

    /** 檢核錯誤訊息:請輸入「是否繳交國民身分證」. */
    public static final String VERIFY_ERROR_MSG_CANCELKIND = "請輸入「是否繳交國民身分證」";

    /** 檢核錯誤訊息:請輸入「3個月內未繳銷原籍證明，撤銷定居許可」. */
    public static final String VERIFY_ERROR_MSG_CANCELPERMIT = "請輸入「3個月內未繳銷原籍證明，撤銷定居許可」";

    /** 錯誤訊息:請確認個人基本資料正確無誤. */
    public static final String ERROR_MSG_PERSON = "請確認個人基本資料正確無誤";

    /** 錯誤訊息:請輸入「全戶記事」 */
    public static final String ERROR_MSG_HOUSEHOLDNOTE = "請輸入「全戶記事」";

    /** 錯誤訊息:請輸入「個人記事」 */
    public static final String ERROR_MSG_PERSONNOTE = "請輸入「個人記事」";

    /**
     * 執行Contoller loadPage() 的第一個Service之共用邏輯.
     * 
     * @param dto
     *            撤銷戶籍登記DTO
     * @param exec
     *            使用者資訊
     * @return 撤銷戶籍登記DTO
     * @throws RisBusinessException
     *             執行程式失敗
     */
    public Rl01819DTO initLoadPage(final Rl01819DTO dto, ExecutantType exec) throws RisBusinessException;

    /**
     * 一次呼叫狀態時載入撤銷戶籍登記登記DTO. 執行Contoller loadPage() 的第一個Service之共用邏輯
     * 
     * @param dto
     *            撤銷戶籍登記DTO
     * @param exec
     *            使用者資訊
     * @return 撤銷戶籍登記DTO
     * @throws RisBusinessException
     *             顯示撤銷戶籍登記登記畫面失敗
     */
    @RisServiceMethod(value = MethodType.QUERY)
    public Rl01819DTO initOperationDTO(final Rl01819DTO dto, ExecutantType exec) throws RisBusinessException;

    /**
     * 編輯狀態時載入撤銷戶籍登記登記DTO. 第一次呼叫狀態時載入撤銷戶籍登記DTO
     * 
     * @param dto
     *            撤銷戶籍登記DTO
     * @param exec
     *            使用者資訊
     * @return 撤銷戶籍登記DTO
     * @throws RisBusinessException
     *             編輯狀態時載入撤銷戶籍登記登記DTO失敗
     */
    public Rl01819DTO loadOperationDTO(final Rl01819DTO dto, ExecutantType exec) throws RisBusinessException;

    /**
     * 再次驗證狀態時載入撤銷戶籍登記登記DTO.
     * 
     * @param dto
     *            撤銷戶籍登記DTO
     * @param exec
     *            使用者資訊
     * @return 撤銷戶籍登記DTO
     * @throws RisBusinessException
     *             再次驗證狀態時載入撤銷戶籍登記登記DTO失敗
     */
    public Rl01819DTO reviewOperationDTO(final Rl01819DTO dto, ExecutantType exec) throws RisBusinessException;

    /**
     * 顯示系統錯誤例外訊息. 再次驗證狀態時載入撤銷戶籍登記DTO
     * 
     * @param dto
     *            撤銷戶籍登記DTO
     * @param exec
     *            使用者資訊
     * @return 撤銷戶籍登記DTO
     * @throws RisBusinessException
     *             新增撤銷戶籍者資料失敗
     */
    public Rl01819DTO showErrorMessage(final Rl01819DTO dto, ExecutantType exec) throws RisBusinessException;

    /**
     * 檢核撤銷戶籍者個人資料. 顯示系統錯誤例外訊息
     * 
     * @param dto
     *            撤銷戶籍登記DTO
     * @param exec
     *            使用者資訊
     * @return 錯誤訊息清單
     * @throws RisBusinessException
     *             新增撤銷戶籍者資料失敗
     */
    public void checkDelPersonData(final Rl01819DTO dto, ExecutantType exec) throws RisBusinessException;

    /**
     * 刪除撤銷戶籍者資料.
     * 
     * @param dto
     *            撤銷戶籍登記DTO
     * @param exec
     *            使用者資訊
     * @throws RisBusinessException
     *             刪除撤銷戶籍登記登記資料失敗
     */
    public void doDelete(final Rl01819DTO dto, ExecutantType exec) throws RisBusinessException;

    /**
     * 刪除罰鍰處分書X.
     * 
     * @param dto
     *            撤銷戶籍登記DTO
     * @param exec
     *            使用者資訊
     * @throws RisBusinessException
     *             執行資料驗證並自動組合記事失敗
     */
    public void verifyAppData(final Rl01819DTO dto, ExecutantType exec) throws RisBusinessException;

    /**
     * 暫存撤銷戶籍登記申請資料至XLDF Table.
     * 
     * @param dto
     *            撤銷戶籍登記DTO
     * @param exec
     *            ExecutantType
     * @throws RisBusinessException
     *             暫存撤銷戶籍登記登記申請資料至XLDF Table失敗
     */
    @RisServiceMethod(value = MethodType.SAVE2TEMP)
    @WorkStatus(FinalType.TEMP_FINAL)
    public void saveXldf(final Rl01819DTO dto, final ExecutantType exec) throws RisBusinessException;

    /**
     * 取得撤銷後設籍地當事人資料.
     * 
     * @param dto
     *            撤銷戶籍登記DTO
     * @param exec
     *            使用者資訊
     */
    public void getFinalPersonData(final Rl01819DTO dto, final ExecutantType exec);

    /**
     * 將DTO物件序列化成檔案.
     * 
     * @param pTempFileDTO
     *            暫存DTO
     * @param exec
     *            使用者資訊
     */
    public void saveTempFile(final TempFileDTO<Rl01819DTO> pTempFileDTO, final ExecutantType exec);

    /**
     * 將DTO檔案反序列化成DTO物件.
     * 
     * @param pTempFileDTO
     *            暫存DTO
     * @param exec
     *            使用者資訊
     * @return 撤銷戶籍登記DTO
     */
    public Rl01819DTO loadTempFile(final TempFileDTO<Rl01819DTO> pTempFileDTO, final ExecutantType exec);
}