/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */

package tw.gov.moi.rl.component;

import java.util.List;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.dbo.entity.SelectEntity;
import tw.gov.moi.domain.*;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.component.dto.RelationData;
import tw.gov.moi.rl.component.dto.XLDFDomainObject;
import tw.gov.moi.rl.domain.Rl02100HDTOResult;
import tw.gov.moi.rl.domain.Rl02100MDTOResult;
import tw.gov.moi.rl.domain.Rl0251zWsDTO;
import tw.gov.moi.rl.domain.Rl03100RemovedResultDTO;
import tw.gov.moi.rl.domain.Rl03100ResultDTO;
import tw.gov.moi.rl.domain.RlGetFileReturnDTO;
import tw.gov.moi.rl.domain.RlGetFileWsDTO;
import tw.gov.moi.rl.domain.RlGetRldf047wDTO;
import tw.gov.moi.rl.domain.RlGetRldfxDataDTO;
import tw.gov.moi.rl.domain.RlGetRldfyDataDTO;
import tw.gov.moi.rl.domain.RlHouseholdNumResultDTO;
import tw.gov.moi.rl.domain.RlMoveinDataResultDTO;
import tw.gov.moi.rl.domain.RlPersonDataResultDTO;
import tw.gov.moi.rl.domain.RlRmve41ResultDTO;
import tw.gov.moi.rl.domain.Rldf004mAndRldf001mDTO;
import tw.gov.moi.rl.domain.Rldf004mAndRldf049mDTO;
import tw.gov.moi.rl.domain.Rldf058mDTO;
import tw.gov.moi.rl.domain.RldfxDataResultDTO;
import tw.gov.moi.rs.domain.RsO8WSDTO;
import tw.gov.moi.rs.domain.Rsdf001mDTO;
import tw.gov.moi.rs.dto.Rcdf001mDTO;
import tw.gov.moi.rs.dto.Rcdf002mAndRcdf003mDTO;
import tw.gov.moi.rs.dto.Rrdf004mRrdf001mRrdf008mDTO;
import tw.gov.moi.rs.dto.RsWebServiceQueryDTO;

/**
 * 資料讀取共用元件介面.
 * 
 * @author cf.lin
 */
public interface RlGetDataComponent {

    // final static String ERR_MSG_Application =
    // "getApplicationError: 「取得申請書清單」失敗";

    /** The Constant ERR_MSG_Rcdf003m. */
    final static String ERR_MSG_Rcdf003m = "getRcdf003mError: 「取得遷徙紀錄」失敗";

    /** The Constant ERR_MSG_getChildList. */
    final static String ERR_MSG_getChildList = "getChildListError: 「取得子女資料」失敗";

    /** The Constant ERR_MSG_getCurrentRldf047H. */
    final static String ERR_MSG_getCurrentRldf047H = "getCurrentRldf047HError: 「由當事人統號取得當事人羅馬拼音姓名資料」失敗";

    /** The Constant ERR_MSG_getRlde210W. */
    final static String ERR_MSG_getRlde210W = "getRlde210WError: 「取得全戶出生地英文版資料」失敗";

    /** The Constant ERR_MSG_getRldf003Y. */
    final static String ERR_MSG_getRldf003Y = "getRldf003YError: 「取得全戶人員英文姓名資料」失敗";

    /** The Constant ERR_MSG_getRldf006Y. */
    final static String ERR_MSG_getRldf006Y = "getRldf006YError: 「取得全戶人員個人資料」失敗";

    /** The Constant ERR_MSG_getRldf007Y. */
    final static String ERR_MSG_getRldf007Y = "getRldf007YError: 「取得個人記事翻譯資料」失敗";

    /** The Constant ERR_MSG_getRldf005Y. */
    final static String ERR_MSG_getRldf005Y = "getRldf005YError: 「取得全戶記事翻譯資料」失敗";

    /** The Constant ERR_MSG_getRldf012Y. */
    final static String ERR_MSG_getRldf012Y = "getRldf012YError: 「取得個人翻譯資料」失敗";

    /** The Constant ERR_MSG_getRldf010Y. */
    final static String ERR_MSG_getRldf010Y = "getRldf010YError: 「取得全戶翻譯資料」失敗";

    /** The Constant ERR_MSG_getCurrentRldf047M. */
    final static String ERR_MSG_getCurrentRldf047M = "getCurrentRldf047MError: 「由當事人統號取得當事人羅馬拼音姓名資料」失敗";

    /** The Constant ERR_MSG_getCurrentTldf047M. */
    final static String ERR_MSG_getCurrentTldf047M = "getCurrentTldf047MError: 「由當事人統號取得當事人羅馬拼音姓名資料」失敗";

    /** The Constant ERR_MSG_getDeleteHouseholdMember. */
    final static String ERR_MSG_getDeleteHouseholdMember = "getDeleteHouseholdMemberError: 「取得除戶簿頁戶內人口除戶個人基本資料」失敗";

    /** The Constant ERR_MSG_getDeletePersonalData. */
    final static String ERR_MSG_getDeletePersonalData = "getDeletePersonalDataError: 「取得除戶戶籍資料」失敗";

    /** The Constant ERR_MSG_getEntityUtity. */
    final static String ERR_MSG_getEntityUtity = "getEntityUtityError: 「查詢資料」失敗";

    /** The Constant ERR_MSG_getHouseholdMember. */
    final static String ERR_MSG_getHouseholdMember = "getHouseholdMemberError: 「取得戶內現住人口個人基本資料」失敗";

    /** The Constant ERR_MSG_getHouseholdMemberBy1MKey. */
    final static String ERR_MSG_getHouseholdMemberBy1MKey = "getHouseholdMemberBy1MKeyError: 「取得戶內現住人口個人基本資料(by Rldf001M Ky)」失敗";

    /** The Constant ERR_MSG_getRemoveHouseholdMember. */
    final static String ERR_MSG_getRemoveHouseholdMember = "getRemoveHouseholdMemberError: 「取得除戶戶內人口個人基本資料」失敗";

    /** The Constant ERR_MSG_getHouseLifeMemberId. */
    final static String ERR_MSG_getHouseLifeMemberId = "getHouseLifeMemberId: 「取得戶內現住人口統號清單」失敗";

    /** The Constant ERR_MSG_getHouseLifeMemberNo. */
    final static String ERR_MSG_getHouseLifeMemberNo = "getHouseLifeMemberNo: 「取得戶內現住人口人數」失敗";

    /** The Constant ERR_MSG_getHouseMemberId. */
    final static String ERR_MSG_getHouseMemberId = "getHouseMemberId: 「取得戶內人口統號清單」失敗";

    /** The Constant ERR_MSG_getPersonalData. */
    final static String ERR_MSG_getPersonalData = "getPersonalDataError: 「取得現戶戶籍資料」失敗";

    /** The Constant ERR_MSG_getReplenishData. */
    final static String ERR_MSG_getReplenishData = "getReplenishDataError: 「取得補登戶籍資料」失敗";

    /** The Constant ERR_MSG_getReplenishMember. */
    final static String ERR_MSG_getReplenishMember = "getReplenishMemberError: 「取得戶內人口補登資料」失敗";

    /** The Constant ERR_MSG_getTempHouseholdMember. */
    final static String ERR_MSG_getTempHouseholdMember = "getTempHouseholdMemberError: 「取得暫存簿頁戶內人口暫存個人基本資料」失敗";

    /** The Constant ERR_MSG_getTemporaryPersonalData. */
    final static String ERR_MSG_getTemporaryPersonalData = "getTemporaryPersonalDataError: 「取得暫存戶籍資料」失敗";

    /** The Constant ERR_MSG_getXldf004m. */
    final static String ERR_MSG_getXldf004m = "getXldf004mError: 「取得臨時個人基本資料檔」失敗";

    /** The Constant ERR_MSG_isExistTemp. */
    final static String ERR_MSG_isExistTemp = "isExistTempError: 「判斷當事人是否存在暫存簿頁」失敗";

    /** The Constant ERR_MSG_LastRLDF100M. */
    final static String ERR_MSG_LastRLDF100M = "getLastRLDF100MError: 「取得最後一筆應清查人口資料」失敗";

    /** The Constant ERR_MSG_Rcdf001m. */
    final static String ERR_MSG_Rcdf001m = "getRcdf001mError: 「取得全國個人基本資料」失敗";

    /** The Constant ERR_MSG_Rcdf001mrl. */
    final static String ERR_MSG_Rcdf001mrl = "getRcdf001mrlError: 「取得作業點」失敗";

    /** The Constant ERR_MSG_Rcdf002m. */
    final static String ERR_MSG_Rcdf002m = "getRcdf002mError: 「取得統號變更紀錄」失敗";

    /** The Constant ERR_MSG_Rcdf004m. */
    final static String ERR_MSG_Rcdf004m = "getRcdf004mError: 「取得姓名更改紀錄」失敗";

    /** The Constant ERR_MSG_Rldf001h. */
    final static String ERR_MSG_Rldf001h = "getRldf001hError: 「取得除戶全戶基本資料」失敗";

    /** The Constant ERR_MSG_Rldf001m. */
    final static String ERR_MSG_Rldf001m = "getRldf001mError: 「取得全戶基本資料」失敗";

    /** The Constant ERR_MSG_Rldf002d. */
    final static String ERR_MSG_Rldf002d = "getRldf002dError: 「取得新式國民身分證請領記錄資料」失敗";

    /** The Constant ERR_MSG_Rldf022d. */
    final static String ERR_MSG_Rldf022d = "getRldf022dError: 「取得辦理他所新式國民身分證請領記錄資料」失敗";

    /** The Constant ERR_MSG_Rldf002m. */
    final static String ERR_MSG_Rldf002m = "getRldf002mError: 「取得全戶動態記事資料」失敗";

    /** The Constant ERR_MSG_Rldf004h. */
    final static String ERR_MSG_Rldf004h = "getRldf004hError: 「取得除戶個人基本資料」失敗";

    /** The Constant ERR_MSG_Rldf004m. */
    final static String ERR_MSG_Rldf004m = "getRldf004mError: 「取得個人基本資料」失敗";

    /** The Constant ERR_MSG_Rldf005m. */
    final static String ERR_MSG_Rldf005m = "getRldf005mError: 「取得個人記事資料」失敗";

    /** The Constant ERR_MSG_Rldf005h. */
    final static String ERR_MSG_Rldf005h = "getRldf005hError: 「取得除戶個人記事資料」失敗";

    /** The Constant ERR_MSG_Rldf006m. */
    final static String ERR_MSG_Rldf006m = "getRldf006mError: 「個人遷徙記錄資料」失敗";

    /** The Constant ERR_MSG_Rldf006h. */
    final static String ERR_MSG_Rldf006h = "getRldf006hError: 「取得除戶個人遷徙記錄資料」失敗";

    /** The Constant ERR_MSG_Rldf007m. */
    final static String ERR_MSG_Rldf007m = "getRldf007mError: 「取得姓名更改記錄資料」失敗";

    /** The Constant ERR_MSG_Rldf007h. */
    final static String ERR_MSG_Rldf007h = "getRldf007hError: 「取得除戶個人姓名更改記錄資料」失敗";

    /** The Constant ERR_MSG_Rldf008m. */
    final static String ERR_MSG_Rldf008m = "getRldf008mError: 「取得特殊人口資料」失敗";

    /** The Constant ERR_MSG_Rldf008h. */
    final static String ERR_MSG_Rldf008h = "getRldf008hError: 「取得特殊人口資料」失敗";

    /** The Constant ERR_MSG_Rrdf004m. */
    final static String ERR_MSG_Rrdf004m = "getRrdf004mError: 「取得特殊人口資料」失敗";

    /** The Constant ERR_MSG_Rrdf008m. */
    final static String ERR_MSG_Rrdf008m = "getRrdf008mError: 「取得特殊人口資料」失敗";

    /** The Constant ERR_MSG_Rldf010m. */
    final static String ERR_MSG_Rldf010m = "getRldf010mError: 「取得限制遷徙人口資料」失敗";

    /** The Constant ERR_MSG_Rldf010h. */
    final static String ERR_MSG_Rldf010h = "getRldf010hError: 「取得限制遷徙人口資料」失敗";

    /** The Constant ERR_MSG_Rldf011m. */
    final static String ERR_MSG_Rldf011m = "getRldf011mError: 「取得遷出未接通報資料」失敗";

    /** The Constant ERR_MSG_Rldf020m. */
    final static String ERR_MSG_Rldf020m = "getRldf020mError: 「取得里鄰門牌資料」失敗";

    /** The Constant ERR_MSG_Rldf020s. */
    final static String ERR_MSG_Rldf020s = "getRldf020sError: 「取得逕遷至戶政事務所人數資料」失敗";

    /** The Constant ERR_MSG_Rldf021m. */
    final static String ERR_MSG_Rldf021m = "getRldf021mError: 「取得戶號配賦資料」失敗";

    /** The Constant ERR_MSG_Rldf022m. */
    final static String ERR_MSG_Rldf022m = "getRldf022mError: 「取得國民身分證統一編號配賦資料」失敗";

    /** The Constant ERR_MSG_Rldf024m. */
    final static String ERR_MSG_Rldf024m = "getRldf024mError: 「取得暫存個人基本資料」失敗";

    /** The Constant ERR_MSG_Rldf030m. */
    final static String ERR_MSG_Rldf030m = "getRldf030mError: 「取得所內記事資料」失敗";

    /** The Constant ERR_MSG_Rldf039m. */
    final static String ERR_MSG_Rldf039m = "getRldf039mError: 「取得出境滿二年未入境通報紀錄」失敗";

    /** The Constant ERR_MSG_Rldf040m. */
    final static String ERR_MSG_Rldf040m = "getRldf040mError: 「取得出境滿二年再入境通報紀錄」失敗";

    /** The Constant ERR_MSG_Rldf004m. */
    final static String ERR_MSG_Rldf045m = "getRldf045mError: 「取得逕遷戶政事務所人口通報」失敗";

    /** The Constant ERR_MSG_Rldf047m. */
    final static String ERR_MSG_Rldf047m = "getRldf047mError: 「取得姓名羅馬拼音記錄資料」失敗";

    /** The Constant ERR_MSG_Rldf047h. */
    final static String ERR_MSG_Rldf047h = "getRldf047hError: 「取得姓名羅馬拼音記錄資料」失敗";

    /** The Constant ERR_MSG_Rldf049m. */
    final static String ERR_MSG_Rldf049m = "getRldf049mError: 「取得保護家庭暴力資料」失敗";

    /** The Constant ERR_MSG_Rldf051mByMother. */
    final static String ERR_MSG_Rldf051mByMother = "getRldf051mByMotherError: 「由產婦統號取得出生通報資料」失敗";

    /** The Constant ERR_MSG_Rldf051mBySpouse. */
    final static String ERR_MSG_Rldf051mBySpouse = "getRldf051mBySpouseError: 「由配偶統號取得出生通報資料」失敗";

    /** The Constant ERR_MSG_Rldfm01m. */
    final static String ERR_MSG_Rldfm01m = "getRldfm01mError: 「取得本地出生資料」失敗";

    /** The Constant ERR_MSG_Rldfm02m. */
    final static String ERR_MSG_Rldfm02m = "getRldfm02mError: 「取得婚姻紀錄」失敗";

    /** The Constant ERR_MSG_Rldfm03m. */
    final static String ERR_MSG_Rldfm03m = "getRldfm03mError: 「取得統號更改紀錄」失敗";

    /** The Constant ERR_MSG_Rldfm04m. */
    final static String ERR_MSG_Rldfm04m = "getRldfm04mError: 「取得收養記錄」失敗";

    /** The Constant ERR_MSG_Rldfm05m. */
    final static String ERR_MSG_Rldfm05m = "getRldfm05mError: 「取得監護、輔助、未成年子女權利義務行使負擔資料」失敗";

    /** The Constant ERR_MSG_Rldfm06m. */
    final static String ERR_MSG_Rldfm06m = "getRldfm06mError: 「取得國民身分證掛失紀錄」失敗";

    /** The Constant ERR_MSG_Rldfm07m. */
    final static String ERR_MSG_Rldfm07m = "getRldfm07mError: 「取得重婚資料」失敗";

    /** The Constant ERR_MSG_Rldfm08m. */
    final static String ERR_MSG_Rldfm08m = "getRldfm08mError: 「取得監護、輔助、未成年子女權利義務行使負擔紀錄」失敗";

    /** The Constant ERR_MSG_Rldfm09m. */
    final static String ERR_MSG_Rldfm09m = "getRldfm09mError: 「取得出生日期更改紀錄」失敗";

    /** The Constant ERR_MSG_Rldfm10m. */
    final static String ERR_MSG_Rldfm10m = "getRldfm10mError: 「取得個人申請書紀錄」失敗";

    /** The Constant ERR_MSG_Rldfm11m. */
    final static String ERR_MSG_Rldfm11m = "getRldfm11mError: 「取得個人姓氏資料紀錄」失敗";

    /** The Constant ERR_MSG_Rldfm12m. */
    final static String ERR_MSG_Rldfm12m = "getRldfm12mError: 「取得國民身分證列印旗標資料紀錄」失敗";

    /** The Constant ERR_MSG_Rldfm13m. */
    final static String ERR_MSG_Rldfm13m = "getRldfm13mError: 「取得國民其他出生地資料檔」失敗";

    /** The Constant ERR_MSG_Rldfm11h. */
    final static String ERR_MSG_Rldfm11h = "getRldfm11hError: 「取得個人姓氏資料紀錄」失敗";

    /** 錯誤訊息:取得監護登記個人記事欄位化失敗. */
    final static String ERR_MSG_Rldfy079dm = "getRldfy079dmError: 「取得監護登記個人記事欄位化」失敗";

    /** 錯誤訊息:取得輔助登記個人記事欄位化失敗. */
    final static String ERR_MSG_Rldfy081dm = "getRldfy081dmError: 「取得輔助登記個人記事欄位化」失敗";

    /** The Constant ERR_MSG_Rldfu002. */
    final static String ERR_MSG_Rldfu002 = "getRldfu002Error: 「取得規費主檔紀錄」失敗";

    /** The Constant ERR_MSG_Rldfu003. */
    final static String ERR_MSG_Rldfu003 = "getRldfu003Error: 「取得規費清單紀錄」失敗";

    /** The Constant ERR_MSG_Tldf001m. */
    final static String ERR_MSG_Tldf001m = "getTldf001mdError: 「取得補登全戶基本資料」失敗";

    /** The Constant ERR_MSG_Tldf004m. */
    final static String ERR_MSG_Tldf004m = "getTldf004mdError: 「取得補登個人基本資料」失敗";

    /** The Constant ERR_MSG_Tldf005m. */
    final static String ERR_MSG_Tldf005m = "getTldf005mdError: 「取得個人記事資料」失敗";

    /** The Constant ERR_MSG_Tldf006m. */
    final static String ERR_MSG_Tldf006m = "getTldf006mdError: 「取得暫存-個人遷徙紀錄」失敗";

    /** The Constant ERR_MSG_Tldf007m. */
    final static String ERR_MSG_Tldf007m = "getTldf007mdError: 「取得暫存-姓名更改紀錄」失敗";

    /** The Constant ERR_MSG_Tldf008m. */
    final static String ERR_MSG_Tldf008m = "getTldf008mdError: 「取得暫存-特殊人口資料」失敗";

    /** The Constant ERR_MSG_Tldf010m. */
    final static String ERR_MSG_Tldf010m = "getTldf0010mdError: 「取得暫存-個人記事」失敗";

    /** The Constant ERR_MSG_Tldf030m. */
    final static String ERR_MSG_Tldf030m = "getTldf030mdError: 「取得暫存-所內記事」失敗";

    /** The Constant ERR_MSG_Tldf030t. */
    final static String ERR_MSG_Tldf030t = "getTldf030tdError: 「取得補登之他所行政協助所內記事資料」失敗";

    /** The Constant ERR_MSG_Tldf047m. */
    final static String ERR_MSG_Tldf047m = "getTldf047mdError: 「取得暫存-姓名羅馬拼音紀錄」失敗";

    /** The Constant ERR_MSG_Rldfm01h. */
    final static String ERR_MSG_Rldfm01h = "getRldfm01hError: 「取得除戶-出生資料」失敗";

    /** The Constant ERR_MSG_Rldfm02h. */
    final static String ERR_MSG_Rldfm02h = "getRldfm02hError: 「取得除戶-婚姻紀錄」失敗";

    /** The Constant ERR_MSG_Rldfm03h. */
    final static String ERR_MSG_Rldfm03h = "getRldfm03hError: 「取得除戶-統號更改紀錄」失敗";

    /** The Constant ERR_MSG_Rldfm04h. */
    final static String ERR_MSG_Rldfm04h = "getRldfm04hError: 「取得除戶-收養紀錄」失敗";

    /** The Constant ERR_MSG_Rldfm05h. */
    final static String ERR_MSG_Rldfm05h = "getRldfm05hError: 「取得除戶-監護、輔助、未成年子女權利義務行使負擔資料」失敗";

    /** The Constant ERR_MSG_Rldfm06h. */
    final static String ERR_MSG_Rldfm06h = "getRldfm06hError: 「取得除戶-國民身分證掛失紀錄」失敗";

    /** The Constant ERR_MSG_Rldfm07h. */
    final static String ERR_MSG_Rldfm07h = "getRldfm07hError: 「取得除戶-重婚資料」失敗";

    /** The Constant ERR_MSG_Rldfm08h. */
    final static String ERR_MSG_Rldfm08h = "getRldfm08hError: 「取得除戶-監護、輔助、未成年子女權利義務行使負擔紀錄」失敗";

    /** The Constant ERR_MSG_Rldfm09h. */
    final static String ERR_MSG_Rldfm09h = "getRldfm09hError: 「取得除戶-出生日期更改紀錄」失敗";

    /** The Constant ERR_MSG_Rldfm10h. */
    final static String ERR_MSG_Rldfm10h = "getRldfm10hError: 「取得除戶-個人申請書紀錄」失敗";

    /** The Constant ERR_MSG_Rldf087t. */
    final static String ERR_MSG_Rldf087t = "getRldf087tError: 「取得登記婚前結(離)婚證明書資料 」失敗";

    /** The Constant ERR_MSG_Rldf088t. */
    final static String ERR_MSG_Rldf088t = "getRldf088tError: 「取得結(離)婚證明書資料」失敗";

    /** The Constant ERR_MSG_Rldf089t. */
    final static String ERR_MSG_Rldf089t = "getRldf089tError: 「取得英文結(離)婚證明書資料」失敗";

    /** The Constant ERR_MSG_Rldf087th. */
    final static String ERR_MSG_Rldf087th = "getRldf087thError: 「取得除戶-登記婚前結(離)婚證明書資料 」失敗";

    /** The Constant ERR_MSG_Rldf088th. */
    final static String ERR_MSG_Rldf088th = "getRldf088thError: 「取得除戶-結(離)婚證明書資料」失敗";

    /** The Constant ERR_MSG_Rldf089th. */
    final static String ERR_MSG_Rldf089th = "getRldf089thError: 「取得除戶-英文結(離)婚證明書資料」失敗";

    /** The Constant ERR_MSG_Tldf087t. */
    final static String ERR_MSG_Tldf087t = "getTldf087tError: 「取得暫存-登記婚前結(離)婚證明書資料 」失敗";

    /** The Constant ERR_MSG_Tldf088t. */
    final static String ERR_MSG_Tldf088t = "getTldf088tError: 「取得暫存-結(離)婚證明書資料」失敗";

    /** The Constant ERR_MSG_Tldf089t. */
    final static String ERR_MSG_Tldf089t = "getTldf089tError: 「取得暫存-英文結(離)婚證明書資料」失敗";

    /** The Constant ERR_MSG_Rldf030t. */
    final static String ERR_MSG_Rldf030t = "getRldf030tError: 「他所行政協助所內記事檔」失敗";

    /** The Constant ERR_MSG_getXldf004h. */
    final static String ERR_MSG_getXldf004h = "getXldf004hError: 「取得臨時除戶-個人基本資料檔」失敗";

    /** The Constant ERR_MSG_getXldf006m. */
    final static String ERR_MSG_getXldf006m = "getXldf006mError: 「取得臨時-個人遷徙紀錄檔」失敗";

    /** The Constant ERR_MSG_getRrdf004m. */
    final static String ERR_MSG_getRrdf004m = "getRrdf004mError: 「取得個人基本資料檔」失敗";

    /** The Constant ERR_MSG_getRrdf008m. */
    final static String ERR_MSG_getRrdf008m = "getRrdf008mError: 「取得資料檔」失敗";

    /** The Constant ERR_MSG_getRcdf003m. */
    final static String ERR_MSG_getRcdf003m = "getRcdf003mError: 「取得資料檔」失敗";

    /** The Constant ERR_MSG_getRcdf001mByParentsId. */
    final static String ERR_MSG_getRcdf001mByParentsId = "getRcdf001mByParentsIdError: 「取得兄弟姊妹基本資料檔」失敗";

    /** The Constant ERR_MSG_Rldf002h. */
    final static String ERR_MSG_Rldf002h = "getRldf002hError: 「取得除戶全戶動態記事資料」失敗";

    /** The Constant ERR_MSG_getRcdf003m. */
    final static String ERR_MSG_Rldf003d = "getRldf003dError: 「取得資料檔」失敗";

    /** The Constant ERR_MSG_getRcdf003m. */
    final static String ERR_MSG_Rldf012d = "getRldf012dError: 「取得資料檔」失敗";

    /** The Constant ERR_MSG_getRcdf003m. */
    final static String ERR_MSG_Rldf017d = "getRldf017dError: 「取得資料檔」失敗";

    /** The Constant ERR_MSG_getRcdf003m. */
    final static String ERR_MSG_Rldf018d = "getRldf018dError: 「取得資料檔」失敗";

    /** The Constant ERR_MSG_Tldfm01m. */
    final static String ERR_MSG_Tldfm01m = "getTldfm01mError: 「取得暫存-出生資料」失敗";

    /** The Constant ERR_MSG_Tldfm02m. */
    final static String ERR_MSG_Tldfm02m = "getTldfm02mError: 「取得暫存-婚姻紀錄」失敗";

    /** The Constant ERR_MSG_Tldfm03m. */
    final static String ERR_MSG_Tldfm03m = "getTldfm03mError: 「取得暫存-統號更改紀錄」失敗";

    /** The Constant ERR_MSG_Tldfm04m. */
    final static String ERR_MSG_Tldfm04m = "getTldfm04mError: 「取得暫存-收養紀錄」失敗";

    /** The Constant ERR_MSG_Tldfm05m. */
    final static String ERR_MSG_Tldfm05m = "getTldfm05mError: 「取得暫存-監護、輔助、未成年子女權利義務行使負擔資料」失敗";

    /** The Constant ERR_MSG_Tldfm06m. */
    final static String ERR_MSG_Tldfm06m = "getTldfm06mError: 「取得暫存-國民身分證掛失紀錄」失敗";

    /** The Constant ERR_MSG_Tldfm07m. */
    final static String ERR_MSG_Tldfm07m = "getTldfm07mError: 「取得暫存-重婚資料」失敗";

    /** The Constant ERR_MSG_Tldfm08m. */
    final static String ERR_MSG_Tldfm08m = "getTldfm08mError: 「取得暫存-監護、輔助、未成年子女權利義務行使負擔紀錄」失敗";

    /** The Constant ERR_MSG_Tldfm09m. */
    final static String ERR_MSG_Tldfm09m = "getTldfm09mError: 「取得暫存-出生日期更改紀錄」失敗";

    /** The Constant ERR_MSG_Tldfm10m. */
    final static String ERR_MSG_Tldfm10m = "getTldfm10mError: 「取得暫存-個人申請書紀錄」失敗";

    /** The Constant ERR_MSG_Tldfm11m. */
    final static String ERR_MSG_Tldfm11m = "getTldfm11mError: 「取得暫存-個人姓氏資料紀錄」失敗";

    /** The Constant ERR_MSG_Rcdf049m. */
    final static String ERR_MSG_Rcdf049m = "getRcdf049mByViolatorId: 「取得保護家庭暴力資料」失敗";

    /** The Constant ERR_MSG_Rldfm13m. */
    final static String ERR_MSG_PrepareDataFile = "prepareDataFromFile: 「取得遠端資料檔案至本主機」失敗";

    /** The Constant ERR_MSG_MEMBER_CNT. */
    final static String ERR_MSG_MEMBER_CNT = "getMemberCntError: 「取得戶下成員人口數(現住、非現住、死亡)」失敗";

    /** The Constant ERR_MSG_MEMBER_CNT. */
    final static String ERR_MSG_PERSON_DATA = "getPersonDataError: 「取得多人個人基本資料」失敗";

    /** The Constant ERR_MSG_PERSON_RLDFY_DATA. */
    final static String ERR_MSG_PERSON_RLDFY_DATA = "「取得多人個人記事欄位化資料」失敗";

    /** The Constant ERR_MSG_PERSON_MOVEIN_OLDDATA. */
    final static String ERR_MSG_PERSON_MOVEIN_OLDDATA = "getRlMoveinOldData: 「取得遷入地除口與除戶基本資料」失敗";

    /**
     * 取得申請書清單.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            the site id
     * @param executant
     *            使用者資訊
     * @return List
     */
    // public <E extends Object> List<E> getApplication(String applyType, String
    // applyKind, String transactionId,
    // String sequenceId, String siteId, String personId, ExecutantType
    // executant) throws RisBusinessException;

    /**
     * 取得申請書清單
     * 
     * @param applyType
     *            申請書種類
     * @param applyKind
     *            申請書類別
     * @param transactionId
     *            交易序號
     * @param sequenceId
     *            作業順序編號
     * @param siteId
     *            資料地作業點代碼
     * @param personId
     *            國民身分證統一編號
     * @param executant
     *            使用者資訊
     * @return List
     * 
     * @throws RisBusinessException
     *             取得申請書清單失敗
     */
    // public <E extends Object> List<E> getDsApplication(String applyType,
    // String applyKind, String transactionId,
    // String sequenceId, String siteId, String personId, ExecutantType
    // executant) throws RisBusinessException;

    /**
     * 判斷遠端獲取的資料是否已存在主機中.
     * 
     * @param personId
     *            the person id
     * @param siteId
     *            the site id
     * @param executant
     *            the executant
     * @return true, if successful
     */
    public boolean checkFileDataExist(String personId, String siteId, ExecutantType executant);

    /**
     * 依據 DS_NAME 查詢 RL 資料.
     * 
     * @param rsWebServiceQueryList
     *            the rs web service query list
     * @param executant
     *            the executant
     * @return the list
     * @throws RisBusinessException
     *             the ris business exception
     */
    public List<RsWebServiceQueryDTO> doQueryDsRlData(final List<RsWebServiceQueryDTO> rsWebServiceQueryList,
            final ExecutantType executant) throws RisBusinessException;

    /**
     * 查詢 RL 資料.
     * 
     * @param rsWebServiceQueryList
     *            the rs web service query list
     * @param executant
     *            the executant
     * @return the list
     * @throws RisBusinessException
     *             the ris business exception
     */
    public List<RsWebServiceQueryDTO> doQueryRlData(final List<RsWebServiceQueryDTO> rsWebServiceQueryList,
            final ExecutantType executant) throws RisBusinessException;

    /**
     * 更新 RLDF018D 資料
     * 
     * @param rldf028dList
     * @param destSiteId
     * @param pExecutantType
     */
    public void doUpdateRldf018d(final List<Rldf028dType> rldf028dList, final String destSiteId,
            final ExecutantType pExecutantType);

    /**
     * 執行更新 RLDF018D 資料
     * 
     * @param rldf028dList
     * @param pExecutantType
     */
    public void executeUpdateRldf018d(final List<Rldf028dType> rldf028dList, final ExecutantType pExecutantType);

    /**
     * 取得暫存簿頁戶內人口暫存個人基本資料.
     * 
     * @param personId
     *            the person id
     * @param siteId
     *            作業點代碼
     * @param type
     *            the type
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得暫存簿頁戶內人口暫存個人基本資料失敗
     */
    /*
     * public List<Rldf024mType> getTempHouseholdMember(String househouldHeadId,
     * String houseHoldId, String siteId, ExecutantType executant) throws
     * RisBusinessException;
     */
    /**
     * 取得暫存戶籍資料
     * 
     * @param personId
     *            國民身分證統一編號
     * @param houseHoldId
     *            戶號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * 
     * @throws RisBusinessException
     *             取得暫存戶籍資料失敗
     */
    /*
     * public List<SelectEntity<Rldf024mType>> getTemporaryPersonalData(String
     * personId, String houseHoldId, String siteId, ExecutantType executant)
     * throws RisBusinessException;
     */
    /**
     * 取得臨時個人基本資料
     * 
     * @param adminOfficeCodeLocal
     *            受理地戶所代碼
     * @param transactionId
     *            交易序號
     * @param operationSeq
     *            作業順序
     * @param serialNo
     *            流水號
     * @param dataTiming
     *            資料時機
     * @param state
     *            更新模式
     * @param personId
     *            當事人國民身分證統一編號
     * @param adminOfficeCode
     *            戶所代碼
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * 
     * @throws RisBusinessException
     *             取得臨時個人基本資料失敗
     */
    /*
     * public List<Xldf004mType> getXldf004m(String adminOfficeCodeLocal, String
     * transactionId, String operationSeq, String serialNo, String dataTiming,
     * String state, String personId, String adminOfficeCode, String siteId,
     * ExecutantType executant) throws RisBusinessException;
     */
    /**
     * 取得子女資料
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param type
     *            類別
     * @param executant
     *            使用者資訊
     * @return List
     * 
     * @throws RisBusinessException
     *             取得子女資料失敗
     */

    public List<List<String>> getChildList(String personId, String siteId, String[] type, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得子女Rcdf001mrl資料清單.
     * 
     * @param apply1PersonId
     *            申請人1統號(當事人)
     * @param apply2PersonId
     *            申請人2統號
     * @param executantType
     *            使用者資訊
     * @return 子女Rcdf001mrl資料清單
     * @throws RisBusinessException
     *             取得子女Rcdf001mrl資料清單失敗
     */
    public List<Rcdf001mrlType> getChildRcdf001mrlList(final String apply1PersonId, final String apply2PersonId,
            final ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得當事人羅馬拼音姓名資料.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param removeYymmdd
     *            the remove yymmdd
     * @param removeHhmmss
     *            the remove hhmmss
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得姓名羅馬拼音記錄資料失敗
     */
    public Rldf047hType getCurrentRldf047H(String personId, String siteId, String removeYymmdd, String removeHhmmss,
            ExecutantType executant) throws RisBusinessException;

    /**
     * 取得當事人羅馬拼音姓名資料.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得姓名羅馬拼音記錄資料失敗
     */
    public Rldf047mType getCurrentRldf047M(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得當事人羅馬拼音姓名資料.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得姓名羅馬拼音記錄資料失敗
     */
    public Tldf047mType getCurrentTldf047m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得除戶簿頁戶內人口除戶個人基本資料.
     * 
     * @param househouldHeadId
     *            除戶戶長國民身分證統一編號
     * @param houseHoldId
     *            除戶戶號
     * @param removeDate
     *            除戶日期
     * @param removeTime
     *            除戶時間
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得除戶簿頁戶內人口除戶個人基本資料失敗
     */
    public List<Rldf004hType> getDeleteHouseholdMember(String househouldHeadId, String houseHoldId, String removeDate,
            String removeTime, String siteId, ExecutantType executant) throws RisBusinessException;

    /**
     * 取得除戶戶籍資料.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param removeDate
     *            除戶日期
     * @param removeTime
     *            除戶時間
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得除戶戶籍資料失敗
     */
    public List<SelectEntity<Rldf004hType>> getDeletePersonalData(String personId, String removeDate,
            String removeTime, String siteId, ExecutantType executant) throws RisBusinessException;

    /**
     * 取得查詢資料(無判斷本地異地-WS專用).
     * 
     * @param dsName
     *            the ds name
     * @param queryParameter
     *            the query parameter
     * @param destSiteId
     *            the dest site id
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得查詢資料失敗
     */
    public Object getDsEntityUtity(String dsName, List<String> queryParameter, String destSiteId,
            ExecutantType executant) throws RisBusinessException;

    /**
     * 取得戶內現住人口個人基本資料(無判斷本地異地-WS專用).
     * 
     * @param personId
     *            戶長國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得戶內現住人口個人基本資料失敗
     */
    public List<Rldf004mType> getDsHouseholdMember(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得戶內現住人口個人基本資料(無判斷本地異地-WS專用).
     * 
     * @param householdHeadId
     *            戶長國民身分證統一編號
     * @param householdId
     *            戶號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得戶內現住人口個人基本資料失敗
     */
    public List<Rldf004mType> getDsHouseholdMember(String householdHeadId, String householdId, String siteId,
            ExecutantType executant) throws RisBusinessException;

    /**
     * 取得戶內成員人數(包含現住、非現住、死亡)(無判斷本地異地-WS專用).
     * 
     * @param householdHeadId
     *            the household head id
     * @param householdId
     *            the household id
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得戶內現住人口個人基本資料失敗
     */
    public int getDsHouseholdMemberCntInM(String householdHeadId, String householdId, String siteId,
            ExecutantType executant) throws RisBusinessException;

    /**
     * 取得戶內所有現住人口統號清單.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得戶內所有現住人口統號清單失敗
     */
    public List<String> getDsHouseLifeMemberId(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得戶內所有現住人口之人數.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得戶內所有現住人口之人數失敗
     */
    public int getDsHouseLifeMemberNo(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得戶內人口統號清單.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得戶內所有現住人口統號清單失敗
     */
    public List<String> getDsHouseMemberId(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * Gets the ds lastRldf004h.
     * 
     * @param personId
     *            the person id
     * @param siteId
     *            the site id
     * @param executant
     *            the executant
     * @return the ds rldf004h
     * @throws RisBusinessException
     *             the ris business exception
     */
    public List<Rldf004hType> getDsLastRldf004h(final String personId, final String siteId,
            final ExecutantType executant) throws RisBusinessException;

    /**
     * Gets the ds rldf006m.
     * 
     * @param personId
     *            the person id
     * @param siteId
     *            the site id
     * @param executant
     *            the executant
     * @return the ds rldf006m
     * @throws RisBusinessException
     *             the ris business exception
     */
    public List<Rldf006mType> getDsLastRldf006m(final String personId, final String siteId,
            final ExecutantType executant) throws RisBusinessException;

    /**
     * Gets the ds lastRldf004h.
     * 
     * @param personId
     *            the person id
     * @param siteId
     *            the site id
     * @param executant
     *            the executant
     * @return the ds rldf004h
     * @throws RisBusinessException
     *             the ris business exception
     */
    public List<Xldf004hType> getDsLastXldf004h(final String personId, final String siteId,
            final ExecutantType executant) throws RisBusinessException;

    /**
     * Gets the ds rldf006m.
     * 
     * @param personId
     *            the person id
     * @param siteId
     *            the site id
     * @param executant
     *            the executant
     * @return the ds rldf006m
     * @throws RisBusinessException
     *             the ris business exception
     */
    public List<Xldf006mType> getDsLastXldf006m(final String personId, final String siteId,
            final ExecutantType executant) throws RisBusinessException;

    /**
     * 取得現戶戶籍資料(無判斷本地異地-WS專用).
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得現戶戶籍資料失敗
     */
    public List<SelectEntity<Rldf004mType>> getDsPersonalData(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得作業點代碼.
     * 
     * @param personId
     *            統一編號
     * @param executant
     *            the executant
     * @return String 作業點代碼
     * @throws RisBusinessException
     *             取得作業點代碼失敗
     */
    public String getDsRcdf001mrl(String personId, ExecutantType executant) throws RisBusinessException;

    /**
     * 依生父生母取得Rcdf001mrl資料.
     * 
     * @param fatherId
     *            生父統號
     * @param motherId
     *            生母統號
     * @param executant
     *            使用者資訊
     * @return 全國個人資料摘要
     * @throws RisBusinessException
     *             the ris business exception
     */
    List<Rcdf001mrlType> getDsRcdf001mrl(String fatherId, String motherId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得作業點代碼.
     * 
     * @param personId
     *            統一編號
     * @param executant
     *            the executant
     * @return Rcdf001mrlType domain type
     * @throws RisBusinessException
     *             取得作業點代碼失敗
     */
    public Rcdf001mrlType getDsRcdf001mrlType(String personId, ExecutantType executant) throws RisBusinessException;

    /**
     * 取得除戶戶內人口個人基本資料(無判斷本地異地-WS專用).
     * 
     * @param personId
     *            戶長國民身分證統一編號
     * @param removeYyymmdd
     *            除戶日期
     * @param removeTime
     *            除戶時間
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得除戶戶內人口個人基本資料失敗
     */
    public List<Rldf004hType> getDsRemoveHouseholdMember(String personId, String removeYyymmdd, String removeTime,
            String siteId, ExecutantType executant) throws RisBusinessException;

    /**
     * 取得全戶基本資料(無判斷本地異地-WS專用).
     * 
     * @param househouldHeadId
     *            戶長國民身分證統一編號
     * @param houseHoldId
     *            戶號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得全戶基本資料失敗
     */
    public List<Rldf001mType> getDsRldf001m(String househouldHeadId, String houseHoldId, String siteId,
            ExecutantType executant) throws RisBusinessException;

    /**
     * Gets the ds rldf002d.
     * 
     * @param personId
     *            the person id
     * @param siteId
     *            the site id
     * @param executant
     *            the executant
     * @return the ds rldf002d
     * @throws RisBusinessException
     *             the ris business exception
     */
    public List<Rldf002dType> getDsRldf002d(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * Gets the ds rldf002d by apply.
     * 
     * @param personId
     *            the person id
     * @param siteId
     *            the site id
     * @param acceptAdminOfficeCode
     *            the accept admin office code
     * @param applyYyymmdd
     *            the apply yyymmdd
     * @param applyHhmmss
     *            the apply hhmmss
     * @param executant
     *            the executant
     * @return the ds rldf002d by apply
     * @throws RisBusinessException
     *             the ris business exception
     */
    public List<Rldf002dType> getDsRldf002dByApply(String personId, String siteId, String acceptAdminOfficeCode,
            String applyYyymmdd, String applyHhmmss, ExecutantType executant) throws RisBusinessException;

    /**
     * 取得除戶全戶動態記事資料(無判斷本地異地-WS專用).
     * 
     * @param househouldHeadId
     *            戶長國民身分證統一編號
     * @param houseHoldId
     *            戶號
     * @param removeDate
     *            the remove date
     * @param removeTime
     *            the remove time
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得除戶全戶動態記事資料
     */
    public List<Rldf002hType> getDsRldf002h(String househouldHeadId, String houseHoldId, String removeDate,
            String removeTime, String siteId, ExecutantType executant) throws RisBusinessException;

    /**
     * 取得全戶動態記事資料(無判斷本地異地-WS專用).
     * 
     * @param househouldHeadId
     *            戶長國民身分證統一編號
     * @param houseHoldId
     *            戶號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得全戶動態記事資料
     */
    public List<Rldf002mType> getDsRldf002m(String househouldHeadId, String houseHoldId, String siteId,
            ExecutantType executant) throws RisBusinessException;

    /**
     * Gets the ds rldf003d by apply.
     * 
     * @param personId
     *            the person id
     * @param siteId
     *            the site id
     * @param expireYyymmdd
     *            the expire yyymmdd
     * @param expireHhmmss
     *            the expire hhmmss
     * @param executant
     *            the executant
     * @return the ds rldf003d by apply
     * @throws RisBusinessException
     *             the ris business exception
     */
    public List<Rldf003dType> getDsRldf003dByApply(String personId, String siteId, String expireYyymmdd,
            String expireHhmmss, ExecutantType executant) throws RisBusinessException;

    /**
     * 取得個人基本資料(無判斷本地異地-WS專用).
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得個人基本資料失敗
     */
    public List<Rldf004mType> getDsRldf004m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得除戶個人記事資料(無判斷本地異地-WS專用).
     * 
     * @param personId
     *            國民身分證統一編號
     * @param removeYyymmdd
     *            除戶日期
     * @param removeTime
     *            除戶時間
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得除戶個人記事資料失敗
     */
    public List<Rldf005hType> getDsRldf005h(String personId, String removeYyymmdd, String removeTime, String siteId,
            ExecutantType executant) throws RisBusinessException;

    /**
     * 取得個人記事資料(無判斷本地異地-WS專用).
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得個人記事資料失敗
     */
    public List<Rldf005mType> getDsRldf005m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得除戶個人遷徙紀錄資料(無判斷本地異地-WS專用).
     * 
     * @param personId
     *            國民身分證統一編號
     * @param removeYyymmdd
     *            除戶日期
     * @param removeTime
     *            除戶時間
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得個人遷徙記錄資料失敗
     */
    public List<Rldf006hType> getDsRldf006h(String personId, String removeYyymmdd, String removeTime, String siteId,
            ExecutantType executant) throws RisBusinessException;

    /**
     * 取得個人遷徙記錄資料(無判斷本地異地-WS專用).
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得個人遷徙記錄資料失敗
     */
    public List<Rldf006mType> getDsRldf006m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得除戶個人姓名更改資料(無判斷本地異地-WS專用).
     * 
     * @param personId
     *            國民身分證統一編號
     * @param removeYyymmdd
     *            除戶日期
     * @param removeTime
     *            除戶時間
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得個人遷徙記錄資料失敗
     */
    public List<Rldf007hType> getDsRldf007h(String personId, String removeYyymmdd, String removeTime, String siteId,
            ExecutantType executant) throws RisBusinessException;

    /**
     * 取得姓名更改記錄資料(無判斷本地異地-WS專用).
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得姓名更改記錄資料失敗
     */
    public List<Rldf007mType> getDsRldf007m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * RLDF008A 全民換證資料檔.
     * 
     * @param destSiteId
     *            the dest site id
     * @param executant
     *            the executant
     * @return the ds rldf008a
     */
    public List<Rldf008aType> getDsRldf008a(final String destSiteId, final ExecutantType executant);

    /**
     * 取得特殊人口資料(無判斷本地異地-WS專用).
     * 
     * 
     * @param personId
     *            國民身分證統一編號
     * @param removeYyymmdd
     *            除戶日期
     * @param removeTime
     *            除戶時間
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得特殊人口資料失敗
     */
    public List<Rldf008hType> getDsRldf008h(String personId, String removeYyymmdd, String removeTime, String siteId,
            ExecutantType executant) throws RisBusinessException;

    /**
     * 取得特殊人口資料(無判斷本地異地-WS專用).
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得特殊人口資料失敗
     */
    public List<Rldf008mType> getDsRldf008m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得特殊人口資料(無判斷本地異地-WS專用).
     * 
     * 
     * @param personId
     *            國民身分證統一編號
     * @param removeYyymmdd
     *            除戶日期
     * @param removeTime
     *            除戶時間
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得特殊人口資料失敗
     */
    public List<Rldf010hType> getDsRldf010h(String personId, String removeYyymmdd, String removeTime, String siteId,
            ExecutantType executant) throws RisBusinessException;

    /**
     * 取得限制遷徙人口資料.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得限制遷徙人口資料失敗
     */
    public List<Rldf010mType> getDsRldf010m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得遷出未接通報資料(無判斷本地異地-WS專用).
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得遷出未接通報資料失敗
     */
    public List<Rldf011mType> getDsRldf011m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * Gets the ds rldf012d by apply.
     * 
     * @param type
     *            the type
     * @param no
     *            the no
     * @param siteId
     *            the site id
     * @param executant
     *            the executant
     * @return the ds rldf012d by apply
     * @throws RisBusinessException
     *             the ris business exception
     */
    public List<Rldf012dType> getDsRldf012dByApply(String type, String no, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * Gets the ds rldf018d_2.
     * 
     * @param householdHeadId
     *            the household head id
     * @param householdId
     *            the household id
     * @param siteId
     *            the site id
     * @param executant
     *            the executant
     * @return the ds rldf018d_2
     */
    List<Rldf018dType> getDsRldf018d_2(final String householdHeadId, final String householdId, final String siteId,
            final ExecutantType executant);

    /**
     * Gets the ds rldf018d for251z.
     * 
     * @param rl0251zWsDTO
     *            the rl0251z ws dto
     * @param executant
     *            the executant
     * @return the ds rldf018d for251z
     */
    public List<Rldf018dType> getDsRldf018dFor251z(final Rl0251zWsDTO rl0251zWsDTO, final ExecutantType executant);

    /**
     * 取得里鄰門牌資料.
     * 
     * @param village
     *            村
     * @param neighbor
     *            鄰
     * @param streetDoorplate
     *            街路門牌
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得里鄰門牌資料失敗
     */
    public List<Rldf020mType> getDsRldf020m(String village, String neighbor, String streetDoorplate, String siteId,
            ExecutantType executant) throws RisBusinessException;

    /**
     * 取得逕遷至戶政事務所人數資料.
     * 
     * @param dataYear
     *            統計日期(年)
     * @param dataMonth
     *            統計日期(月)
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得逕遷至戶政事務所人數資料失敗
     */
    public List<Rldf020sType> getDsRldf020s(String dataYear, String dataMonth, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得戶號配賦資料 (前 200 筆).
     * 
     * @param householdId
     *            戶號
     * @param householdIdEndueMark
     *            戶號配賦註記
     * @param siteId
     *            siteId
     * @param executant
     *            使用者資訊
     * @return List<E>
     * @throws RisBusinessException
     *             取得戶號配賦資料失敗
     */
    public List<Rldf021mType> getDsRldf021m(final String householdId, final String householdIdEndueMark,
            final String siteId, final ExecutantType executant) throws RisBusinessException;

    /**
     * 取得戶號配賦資料總筆數
     * 
     * @param householdId
     *            戶號
     * @param householdIdEndueMark
     *            戶號配賦註記
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return 戶號配賦資料總筆數
     * @throws RisBusinessException
     */
    public int getDsRldf021mCount(final String householdId, final String householdIdEndueMark, final String siteId,
            final ExecutantType executantType) throws RisBusinessException;

    /**
     * 
     * @param personId
     * @param acceptSiteId
     * @param applyYyymmdd
     * @param applyHhmmss
     * @param executant
     * @return
     * @throws RisBusinessException
     */
    public List<Rldf022dType> getDsRldf022dByApply(String personId, String acceptSiteId, String applyYyymmdd,
            String applyHhmmss, ExecutantType executant) throws RisBusinessException;

    /**
     * 取得國民身分證統一編號配賦資料.
     * 
     * @param personId
     *            統號
     * @param personIdEndueMark
     *            統號配賦註記
     * @param gender
     *            性別
     * @param idType
     *            身分別
     * @param siteId
     *            siteId
     * @param executant
     *            使用者資訊
     * @return List
     * 
     * @throws RisBusinessException
     *             取得國民身分證統一編號配賦資料失敗
     */
    public List<Rldf022mType> getDsRldf022m(String personId, String personIdEndueMark, String gender, String idType,
            String siteId, ExecutantType executant) throws RisBusinessException;

    /**
     * 取得國民身分證統一編號配賦資料總筆數
     * 
     * @param personIdEndueMark
     *            統號配賦註記
     * @param gender
     *            性別
     * @param idType
     *            身分別
     * @param siteId
     *            作業點代碼
     * @param executantType
     *            使用者資訊
     * @return 國民身分證統一編號配賦資料總筆數
     * @throws RisBusinessException
     */
    public int getDsRldf022mCount(final String personIdEndueMark, final String gender, final String idType,
            final String siteId, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得國民身分證統一編號配賦資料 前 200 筆.
     * 
     * @param personIdEndueMark
     *            統號配賦註記
     * @param gender
     *            性別
     * @param idType
     *            身分別
     * @param siteId
     *            siteId
     * @param executant
     *            使用者資訊
     * @return List
     * 
     * @throws RisBusinessException
     *             取得國民身分證統一編號配賦資料失敗
     */
    public List<Rldf022mType> getDsRldf022mTop(final String personIdEndueMark, final String gender,
            final String idType, final String siteId, final ExecutantType executant) throws RisBusinessException;

    /**
     * 取得個人基本資料檔.
     * 
     * @param personId
     *            戶長國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得個人基本資料檔失敗
     */
    public List<Rldf024mType> getDsRldf024m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得所內記事資料(無判斷本地異地-WS專用).
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得所內記事資料失敗
     */
    public List<Rldf030mType> getDsRldf030m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * Gets the ds rldf030t.
     * 
     * @param personId
     *            the person id
     * @param siteId
     *            the site id
     * @param registerYyymmdd
     *            the register yyymmdd
     * @param registerHhmmss
     *            the register hhmmss
     * @param executant
     *            the executant
     * @return the ds rldf030t
     * @throws RisBusinessException
     *             the ris business exception
     */
    public List<Rldf030tType> getDsRldf030t(final String personId, final String siteId, final String registerYyymmdd,
            final String registerHhmmss, final ExecutantType executant) throws RisBusinessException;

    /**
     * 取得出境滿二年未入境通報紀錄(無判斷本地異地-WS專用).
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得出境滿二年未入境通報紀錄失敗
     */
    public List<Rldf039mType> getDsRldf039m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得出境滿二年再入境通報紀錄(無判斷本地異地-WS專用).
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得出境滿二年再入境通報紀錄失敗
     */
    public List<Rldf040mType> getDsRldf040m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得逕遷戶政事務所人口通報.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param processMark01
     *            the process mark01
     * @param processMark02
     *            the process mark02
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得個人基本資料失敗
     */

    public List<Rldf045mType> getDsRldf045m(String personId, String siteId, String processMark01, String processMark02,
            ExecutantType executant) throws RisBusinessException;

    /**
     * 取得逕遷戶政事務所人口通報.
     * 
     * @param householdHeadId
     *            the household head id
     * @param householdId
     *            the household id
     * @param siteId
     *            作業點代碼
     * @param processMark01
     *            the process mark01
     * @param processMark02
     *            the process mark02
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得個人基本資料失敗
     */

    public List<Rldf045mType> getDsRldf045m(String householdHeadId, String householdId, String siteId,
            String processMark01, String processMark02, ExecutantType executant) throws RisBusinessException;

    /**
     * 取得除戶-姓名羅馬拼音記錄資料(無判斷本地異地-WS專用).
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param removeYyymmdd
     *            除戶日期
     * @param removeHhmmss
     *            除戶時間
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得除戶-姓名羅馬拼音記錄資料失敗
     */
    public List<Rldf047hType> getDsRldf047h(String personId, String siteId, String removeYyymmdd, String removeHhmmss,
            ExecutantType executant) throws RisBusinessException;

    /**
     * 取得姓名羅馬拼音記錄資料(無判斷本地異地-WS專用).
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得姓名羅馬拼音記錄資料失敗
     */
    public List<Rldf047mType> getDsRldf047m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得保護家庭暴力資料.
     * 
     * @param victimId
     *            被保護人統號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List 保護家庭暴力資料
     * @throws RisBusinessException
     *             「取得保護家庭暴力資料」失敗
     */
    public List<Rldf049mType> getDsRldf049m(String victimId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得出生通報查核結果資料檔.
     * 
     * @param queryObject
     *            出生通報查核結果資料檔查詢物件
     * @param executantType
     *            使用者資訊
     * @return 出生通報查核結果資料檔
     * @throws RisBusinessException
     */
    Rldf058mType getDsRldf058m(final Rldf058mDTO queryObject, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 取得登記婚前結(離)婚證明書資料(只取得本機資料使用).
     * 
     * @param personId
     *            the person id
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List<Rldf087tType>
     * @throws RisBusinessException
     *             「取得登記婚前結(離)婚證明書資料」失敗
     */
    public List<Rldf087tType> getDsRldf087t(final String personId, final String siteId, final ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得除戶-登記婚前結(離)婚證明書資料(只取得本機資料使用).
     * 
     * @param personId
     *            the person id
     * @param removeYyymmdd
     *            the remove yyymmdd
     * @param removeHhmmss
     *            the remove hhmmss
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List<Rldf087thType>
     * @throws RisBusinessException
     *             「取得登記婚前結(離)婚證明書資料」失敗
     */
    public List<Rldf087thType> getDsRldf087th(final String personId, final String removeYyymmdd,
            final String removeHhmmss, final String siteId, final ExecutantType executant) throws RisBusinessException;

    /**
     * 取得結(離)婚證明書資料(只取得本機資料使用).
     * 
     * @param personId
     *            the person id
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List<Rldf088tType>
     * @throws RisBusinessException
     *             「取得結(離)婚證明書資料」失敗
     */
    public List<Rldf088tType> getDsRldf088t(final String personId, final String siteId, final ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得除戶-結(離)婚證明書資料(只取得本機資料使用).
     * 
     * @param personId
     *            the person id
     * @param removeYyymmdd
     *            the remove yyymmdd
     * @param removeHhmmss
     *            the remove hhmmss
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List<Rldf088thType>
     * @throws RisBusinessException
     *             「取得結(離)婚證明書資料」失敗
     */
    public List<Rldf088thType> getDsRldf088th(final String personId, final String removeYyymmdd,
            final String removeHhmmss, final String siteId, final ExecutantType executant) throws RisBusinessException;

    /**
     * 取得英文結(離)婚證明書資料(只取得本機資料使用).
     * 
     * @param personId
     *            the person id
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List<Rldf089tType>
     * @throws RisBusinessException
     *             「取得英文結(離)婚證明書資料」失敗
     */
    public List<Rldf089tType> getDsRldf089t(final String personId, final String siteId, final ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得除戶-英文結(離)婚證明書資料(只取得本機資料使用).
     * 
     * @param personId
     *            the person id
     * @param removeYyymmdd
     *            the remove yyymmdd
     * @param removeHhmmss
     *            the remove hhmmss
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List<Rldf089thType>
     * @throws RisBusinessException
     *             「取得英文結(離)婚證明書資料」失敗
     */
    public List<Rldf089thType> getDsRldf089th(final String personId, final String removeYyymmdd,
            final String removeHhmmss, final String siteId, final ExecutantType executant) throws RisBusinessException;

    /**
     * 取得出生資料.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param removeYyymmdd
     *            除戶日期
     * @param removeTime
     *            the remove time
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List 出生資料
     * @throws RisBusinessException
     *             「取得本地出生資料」失敗
     */
    public List<Rldfm01hType> getDsRldfm01h(final String personId, final String removeYyymmdd, final String removeTime,
            final String siteId, final ExecutantType executant) throws RisBusinessException;

    /**
     * 取得出生資料.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List 出生資料
     * @throws RisBusinessException
     *             「取得本地出生資料」失敗
     */
    public List<Rldfm01mType> getDsRldfm01m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得婚姻紀錄.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param removeYyymmdd
     *            除戶日期
     * @param removeTime
     *            除戶時間
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List 婚姻紀錄
     * @throws RisBusinessException
     *             「取得婚姻紀錄」失敗
     */
    public List<Rldfm02hType> getDsRldfm02h(final String personId, final String removeYyymmdd, final String removeTime,
            final String siteId, final ExecutantType executant) throws RisBusinessException;

    /**
     * 取得婚姻紀錄.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List 婚姻紀錄
     * @throws RisBusinessException
     *             「取得婚姻紀錄」失敗
     */
    public List<Rldfm02mType> getDsRldfm02m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得統號更改紀錄.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param removeYyymmdd
     *            除戶日期
     * @param removeTime
     *            除戶時間
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List 統號更改紀錄
     * @throws RisBusinessException
     *             「取得統號更改紀錄」失敗
     */
    public List<Rldfm03hType> getDsRldfm03h(final String personId, final String removeYyymmdd, final String removeTime,
            final String siteId, final ExecutantType executant) throws RisBusinessException;

    /**
     * 取得統號更改紀錄(M).
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List 統號更改紀錄
     * @throws RisBusinessException
     *             「取得統號更改紀錄」失敗
     */
    public List<Rldfm03mType> getDsRldfm03m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得收養記錄.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param removeYyymmdd
     *            除戶日期
     * @param removeTime
     *            除戶時間
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List 婚姻紀錄
     * @throws RisBusinessException
     *             「取得婚姻紀錄」失敗
     */
    public List<Rldfm04hType> getDsRldfm04h(final String personId, final String removeYyymmdd, final String removeTime,
            final String siteId, final ExecutantType executant) throws RisBusinessException;

    /**
     * 取得收養記錄.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List 收養記錄
     * @throws RisBusinessException
     *             「取得收養記錄」失敗
     */
    public List<Rldfm04mType> getDsRldfm04m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得監護、輔助、未成年子女權利義務行使負擔資料.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param removeYyymmdd
     *            除戶日期
     * @param removeTime
     *            除戶時間
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List 婚姻紀錄
     * @throws RisBusinessException
     *             「取得監護、輔助、未成年子女權利義務行使負擔資料」失敗
     */
    public List<Rldfm05hType> getDsRldfm05h(final String personId, final String removeYyymmdd, final String removeTime,
            final String siteId, final ExecutantType executant) throws RisBusinessException;

    /**
     * 取得監護、輔助、未成年子女權利義務行使負擔資料.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List 監護、輔助、未成年子女權利義務行使負擔資料
     * @throws RisBusinessException
     *             「取得監護、輔助、未成年子女權利義務行使負擔資料」失敗
     */
    public List<Rldfm05mType> getDsRldfm05m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得國民身分證掛失紀錄.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param removeYyymmdd
     *            除戶日期
     * @param removeTime
     *            除戶時間
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List 國民身分證掛失紀錄
     * @throws RisBusinessException
     *             「取得國民身分證掛失紀錄」失敗
     */
    public List<Rldfm06hType> getDsRldfm06h(final String personId, final String removeYyymmdd, final String removeTime,
            final String siteId, final ExecutantType executant) throws RisBusinessException;

    /**
     * 取得國民身分證掛失紀錄.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List 國民身分證掛失紀錄
     * @throws RisBusinessException
     *             「取得國民身分證掛失紀錄」失敗
     */
    public List<Rldfm06mType> getDsRldfm06m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得重婚資料.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param removeYyymmdd
     *            除戶日期
     * @param removeTime
     *            除戶時間
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List 重婚資料
     * @throws RisBusinessException
     *             「取得重婚資料」失敗
     */
    public List<Rldfm07hType> getDsRldfm07h(final String personId, final String removeYyymmdd, final String removeTime,
            final String siteId, final ExecutantType executant) throws RisBusinessException;

    /**
     * 取得重婚資料.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List 重婚資料
     * @throws RisBusinessException
     *             「取得重婚資料」失敗
     */
    public List<Rldfm07mType> getDsRldfm07m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得監護、輔助、未成年子女權利義務行使負擔紀錄.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param removeYyymmdd
     *            除戶日期
     * @param removeTime
     *            除戶時間
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List 監護、輔助、未成年子女權利義務行使負擔紀錄
     * @throws RisBusinessException
     *             「取得監護、輔助、未成年子女權利義務行使負擔」失敗
     */
    public List<Rldfm08hType> getDsRldfm08h(final String personId, final String removeYyymmdd, final String removeTime,
            final String siteId, final ExecutantType executant) throws RisBusinessException;

    /**
     * 取得監護、輔助、未成年子女權利義務行使負擔紀錄.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List 監護、輔助、未成年子女權利義務行使負擔紀錄
     * @throws RisBusinessException
     *             「取得監護、輔助、未成年子女權利義務行使負擔紀錄」失敗
     */
    public List<Rldfm08mType> getDsRldfm08m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得出生日期更改紀錄.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param removeYyymmdd
     *            除戶日期
     * @param removeTime
     *            除戶時間
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List 出生日期更改紀錄
     * @throws RisBusinessException
     *             「取得出生日期更改紀錄」失敗
     */
    public List<Rldfm09hType> getDsRldfm09h(final String personId, final String removeYyymmdd, final String removeTime,
            final String siteId, final ExecutantType executant) throws RisBusinessException;

    /**
     * 取得出生日期更改紀錄.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List 出生日期更改紀錄
     * @throws RisBusinessException
     *             「取得出生日期更改紀錄」失敗
     */
    public List<Rldfm09mType> getDsRldfm09m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得個人申請書紀錄.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param removeYyymmdd
     *            除戶日期
     * @param removeTime
     *            除戶時間
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List 個人申請書紀錄
     * @throws RisBusinessException
     *             「取得個人申請書紀錄」失敗
     */
    public List<Rldfm10hType> getDsRldfm10h(final String personId, final String removeYyymmdd, final String removeTime,
            final String siteId, final ExecutantType executant) throws RisBusinessException;

    // FIXME Viva
    /**
     * (除戶)取得個人申請書紀錄.
     * 
     * @param personId
     *            統號
     * @param siteId
     *            作業點代碼
     * @param removeYyymmdd
     *            除戶日期
     * @param removeTime
     *            除戶時間
     * @param applyCode
     *            申請書代碼
     * @param applyType
     *            交待R或T
     * @param executant
     *            使用者資訊
     * @return (除戶)個人申請書紀錄清單
     * @throws RisBusinessException
     *             (除戶)取得個人申請書紀錄失敗
     */
    public List<Rldfm10hType> getDsRldfm10hList(final String personId, final String siteId, final String removeYyymmdd,
            final String removeTime, final String applyCode, final String applyType, final ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得個人申請書紀錄.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param dataSiteId
     *            資料地作業點代碼
     * @param applyTransationId
     *            交易序號
     * @param applySequenceId
     *            作業順序編號
     * @param applyType
     *            交待R或T
     * @param executant
     *            使用者資訊
     * @return List 個人申請書紀錄
     * @throws RisBusinessException
     *             「取得個人申請書紀錄」失敗
     */
    public List<Rldfm10mType> getDsRldfm10m(final String personId, final String siteId, final String dataSiteId,
            final String applyTransationId, final String applySequenceId, final String applyType,
            final ExecutantType executant) throws RisBusinessException;

    /**
     * 取得個人申請書紀錄.
     * 
     * @param personId
     *            統號
     * @param siteId
     *            作業點代碼
     * @param applyCode
     *            申請書代碼
     * @param applyType
     *            交待R或T
     * @param executant
     *            使用者資訊
     * @return 個人申請書紀錄
     * @throws RisBusinessException
     *             the ris business exception
     */
    public List<Rldfm10mType> getDsRldfm10mList(final String personId, final String siteId, final String applyCode,
            final String applyType, final ExecutantType executant) throws RisBusinessException;

    /**
     * 取得個人姓氏紀錄.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param removeYyymmdd
     *            除戶日期
     * @param removeTime
     *            除戶時間
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             「取得個人姓氏紀錄」失敗
     */
    public List<Rldfm11hType> getDsRldfm11h(final String personId, final String removeYyymmdd, final String removeTime,
            final String siteId, final ExecutantType executant) throws RisBusinessException;

    /**
     * 取得個人姓氏紀錄.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List 個人姓氏紀錄
     * @throws RisBusinessException
     *             「取得個人姓氏紀錄」失敗
     */
    public List<Rldfm11mType> getDsRldfm11m(final String personId, final String siteId, final ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得國民身分證列印旗標資料紀錄.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List 個人姓氏紀錄
     * @throws RisBusinessException
     *             「取得國民身分證列印旗標資料紀錄」失敗
     */
    public List<Rldfm12mType> getDsRldfm12m(final String personId, final String siteId, final ExecutantType executant)
            throws RisBusinessException;

    /**
     * RLDFM13M國民其他出生地資料檔.
     * 
     * @param personId
     *            the person id
     * @param siteId
     *            the site id
     * @param executant
     *            the executant
     * @return the ds rldfm13m
     */
    public List<Rldfm13mType> getDsRldfm13m(String personId, String siteId, ExecutantType executant);

    /**
     * Gets the ds rrdf008m.
     * 
     * @param personId
     *            the person id
     * @param siteId
     *            the site id
     * @param executant
     *            the executant
     * @return the rrdf008m
     * @throws RisBusinessException
     *             the ris business exception
     */

    public List<Rrdf008mType> getDsRrdf008m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得統號更改紀錄(T).
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List 統號更改紀錄
     * @throws RisBusinessException
     *             「取得統號更改紀錄」失敗
     */
    public List<Tldfm03mType> getDsTldfm03m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * Gets the entity by object.
     * 
     * @param <T>
     *            the generic type
     * @param pObject
     *            the object
     * @param pSiteId
     *            the site id
     * @param pExecutantType
     *            the executant type
     * @return the entity by object
     */
    <T> List<T> getEntityByObject(final T pObject, final String pSiteId, final ExecutantType pExecutantType);

    /**
     * 取得查詢資料.
     * 
     * @param dsName
     *            the ds name
     * @param queryParameter
     *            the query parameter
     * @param destSiteId
     *            the dest site id
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得查詢資料失敗
     */
    public Object getEntityUtity(String dsName, List<String> queryParameter, String destSiteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得查詢資料.
     * 
     * @param <E>
     *            the element type
     * @param dsName
     *            the ds name
     * @param queryParameter
     *            the query parameter
     * @param destSiteId
     *            the dest site id
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得查詢資料失敗
     */
    <E> List<E> getEntityUtitys(final String dsName, final List<String> queryParameter, final String destSiteId,
            final ExecutantType executant) throws RisBusinessException;

    /**
     * 取得戶號配賦資料.
     * 
     * @param householdId
     *            戶號
     * @param householdIdEndueMark
     *            戶號配賦註記
     * @param siteId
     *            siteId
     * @param executant
     *            使用者資訊
     * @return List<E>
     * 
     * @throws RisBusinessException
     *             取得戶號配賦資料失敗
     */
    List<Rldf021mType> getFilterRldf021m(final String householdId, final String householdIdEndueMark,
            final String siteId, final ExecutantType executant) throws RisBusinessException;

    /**
     * 取得國民身分證統一編號配賦資料.
     * 
     * @param personId
     *            統號
     * @param personIdEndueMark
     *            統號配賦註記
     * @param gender
     *            性別
     * @param idType
     *            身分別
     * @param siteId
     *            siteId
     * @param executant
     *            使用者資訊
     * @return List
     * 
     * @throws RisBusinessException
     *             取得國民身分證統一編號配賦資料失敗
     */
    List<Rldf022mType> getFilterRldf022m(String personId, String personIdEndueMark, String gender, String idType,
            String siteId, ExecutantType executant) throws RisBusinessException;

    /**
     * 取得戶內現住人口個人基本資料.
     * 
     * @param personId
     *            戶長國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得戶內現住人口個人基本資料失敗
     */
    public List<Rldf004mType> getHouseholdMember(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得戶內現住人口個人基本資料.
     * 
     * @param householdHeadId
     *            戶長國民身分證統一編號
     * @param householdId
     *            戶號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得戶內現住人口個人基本資料失敗
     */
    public List<Rldf004mType> getHouseholdMember(String householdHeadId, String householdId, String siteId,
            ExecutantType executant) throws RisBusinessException;

    /**
     * 取得戶內成員人數(包含現住、非現住、死亡)從M取得.
     * 
     * @param householdHeadId
     *            戶長國民身分證統一編號
     * @param householdId
     *            戶號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得戶內成員人數(包含現住、非現住、死亡)失敗
     */
    public int getHouseholdMemberCntInM(String householdHeadId, String householdId, String siteId,
            ExecutantType executant) throws RisBusinessException;

    /**
     * 取得戶內成員人數(包含現住、非現住、死亡) 從MT取得.
     * 
     * @param householdHeadId
     *            戶長國民身分證統一編號
     * @param householdId
     *            戶號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得戶內成員人數(包含現住、非現住、死亡)失敗
     */
    public int getHouseholdMemberCntInMT(String householdHeadId, String householdId, String siteId,
            ExecutantType executant) throws RisBusinessException;

    /**
     * 取得戶內所有現住人口統號清單.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得戶內所有現住人口統號清單失敗
     */
    public List<String> getHouseLifeMemberId(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得戶內所有現住人口之人數.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得戶內所有現住人口之人數失敗
     */
    public int getHouseLifeMemberNo(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得戶內人口統號清單.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得戶內所有現住人口統號清單失敗
     */
    public List<String> getHouseMemberId(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * Gets the ds rldf004h.
     * 
     * @param personId
     *            the person id
     * @param siteId
     *            the site id
     * @param executant
     *            the executant
     * @return the ds rldf004h
     * @throws RisBusinessException
     *             the ris business exception
     */
    public List<Rldf004hType> getLastRldf004h(final String personId, final String siteId, final ExecutantType executant)
            throws RisBusinessException;

    /**
     * Gets the ds rldf006m.
     * 
     * @param personId
     *            the person id
     * @param siteId
     *            the site id
     * @param executant
     *            the executant
     * @return the ds rldf006m
     * @throws RisBusinessException
     *             the ris business exception
     */
    public List<Rldf006mType> getLastRldf006m(final String personId, final String siteId, final ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得最後一筆姓名羅馬拼音記錄檔 Gets the last rldf047m.
     * 
     * @param rlGetRldf047wDTO
     *            the rl get rldf047w dto
     * @param executantType
     *            the executant type
     * @return the last rldf047h
     */
    public XLDFDomainObject getLastRldf047mByApplyItem(final RlGetRldf047wDTO rlGetRldf047wDTO,
            final ExecutantType executantType);

    /**
     * Gets the last rld f100 m.
     * 
     * @param personId
     *            the person id
     * @param executant
     *            the executant
     * @return the last rld f100 m
     * @throws RisBusinessException
     *             the ris business exception
     */
    List<Rldf100mType> getLastRLDF100M(String personId, ExecutantType executant) throws RisBusinessException;

    /**
     * 取得最後一筆應清查人口資料.
     * 
     * @param personId
     *            統號
     * @param siteId
     *            the site id
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得最後一筆應清查人口資料失敗
     */

    public List<Rldf100mType> getLastRLDF100M(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * Gets the ds rldf004h.
     * 
     * @param personId
     *            the person id
     * @param siteId
     *            the site id
     * @param executant
     *            the executant
     * @return the ds rldf004h
     * @throws RisBusinessException
     *             the ris business exception
     */
    public List<Xldf004hType> getLastXldf004h(final String personId, final String siteId, final ExecutantType executant)
            throws RisBusinessException;

    /**
     * Gets the ds rldf006m.
     * 
     * @param personId
     *            the person id
     * @param siteId
     *            the site id
     * @param executant
     *            the executant
     * @return the ds rldf006m
     * @throws RisBusinessException
     *             the ris business exception
     */
    public List<Xldf006mType> getLastXldf006m(final String personId, final String siteId, final ExecutantType executant)
            throws RisBusinessException;

    /**
     * Get all personal data that needed when siteId changed(Local).
     * 
     * @param personIds
     *            the person ids
     * @param siteId
     *            the site id
     * @param pExecutantType
     *            the executant type
     * @return the local personal data
     */
    RlPersonDataResultDTO getLocalMovePersonData(final List<String> personIds, final String siteId,
            ExecutantType pExecutantType);

    /**
     * Get all personal data that needed when siteId changed(Local).
     * 
     * @param personIds
     *            the person ids
     * @param siteId
     *            the site id
     * @param pExecutantType
     *            the executant type
     * @return the local personal data
     */
    RlPersonDataResultDTO getLocalMovePersonDataLight(final List<String> personIds, final String siteId,
            ExecutantType pExecutantType);

    /**
     * 取得除戶個人基本資料與全戶基本資料.(本地)
     * 
     * @param personId
     *            國民身分證統一編號
     * @param removeDate
     *            除戶日期
     * @param removeTime
     *            除戶時間
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return RlRmve41ResultDTO
     * @throws RisBusinessException
     *             取得除戶全戶基本資料失敗
     */
    public RlRmve41ResultDTO getLocalRldf004hAnd1h(String personId, String removeDate, String removeTime,
            String siteId, ExecutantType executant) throws RisBusinessException;

    /**
     * 取得個人基本資料(非除口之人).
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得個人基本資料失敗
     */
    public Rldf004mType getLocalRldf004mNotRemove(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * Gets the local rldfx data.
     * 
     * @param dto
     *            the dto
     * @param executant
     *            the executant
     * @return the local rldfx data
     */
    RldfxDataResultDTO getLocalRldfxData(final RlGetRldfxDataDTO dto, final ExecutantType executant);

    /**
     * 取得個人記事欄位化資料.
     * 
     * @param dto
     *            RlGetRldfyDataDTO
     * @param executant
     *            the executant
     * @return RlGetRldfyDataDTO
     */
    public RlGetRldfyDataDTO getLocalRldfyData(RlGetRldfyDataDTO dto, ExecutantType executant);

    /**
     * 取得非現住人口數(包含除口與死亡人口)(Local).
     * 
     * @param householdHeadI
     *            the household head i
     * @param householdId
     *            the household id
     * @param siteId
     *            the site id
     * @param pExecutantType
     *            the executant type
     * @return the local rl household member non resident num
     */
    Integer getLocalRlHouseholdMemberNonResidentNum(final String householdHeadI, final String householdId,
            final String siteId, ExecutantType pExecutantType);

    /**
     * 取得現住人口數(包含兼任戶長)(Local).
     * 
     * @param householdHeadI
     *            the household head i
     * @param householdId
     *            the household id
     * @param siteId
     *            the site id
     * @param pExecutantType
     *            the executant type
     * @return the local rl household member resident num
     */
    Integer getLocalRlHouseholdMemberResidentNum(final String householdHeadI, final String householdId,
            final String siteId, ExecutantType pExecutantType);

    /**
     * 取得遷入地除口或除戶資料(本地).
     * 
     * @param personIds
     *            the person ids
     * @param siteId
     *            the site id
     * @param removeYyymmdd
     *            the remove yyymmdd
     * @param removeHhmmss
     *            the remove hhmmss
     * @param pExecutantType
     *            the executant type
     * @return the local rl movein old data
     */
    RlMoveinDataResultDTO getLocalRlMoveinOldData(final List<String> personIds, final String siteId,
            final String removeYyymmdd, final String removeHhmmss, ExecutantType pExecutantType);

    /**
     * Get all personal data that needed when siteId changed.
     * 
     * @param personIds
     *            the person ids
     * @param siteId
     *            the site id
     * @param pExecutantType
     *            the executant type
     * @return the local personal data
     */
    RlPersonDataResultDTO getMovePersonData(final List<String> personIds, final String siteId,
            ExecutantType pExecutantType);

    /**
     * Get all personal data that needed when siteId changed.
     * 
     * @param personIds
     *            the person ids
     * @param siteId
     *            the site id
     * @param pExecutantType
     *            the executant type
     * @return the local personal data
     */
    RlPersonDataResultDTO getMovePersonDataLight(final List<String> personIds, final String siteId,
            ExecutantType pExecutantType);

    /**
     * 取得現戶戶籍資料.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得現戶戶籍資料失敗
     */
    public List<SelectEntity<Rldf004mType>> getPersonalData(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得遷徙當事人的RLDF DATA.
     * 
     * @param personIds
     *            the person ids
     * @param siteId
     *            the site id
     * @param exe
     *            the exe
     * @return the person data for move
     */
    RlPersonDataResultDTO getPersonDataForMove(List<String> personIds, String siteId, ExecutantType exe);

    /**
     * 取得全國個人基本資料.
     * 
     * @param rcdf001mDTO
     *            the rcdf001m dto
     * @param executant
     *            the executant
     * @return the rcdf001m
     * @throws RisBusinessException
     *             取得全國個人基本資料失敗
     */
    public List<Rcdf001mType> getRcdf001m(final Rcdf001mDTO rcdf001mDTO, final ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得全國個人基本資料.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得全國個人基本資料失敗
     */
    public List<Rcdf001mType> getRcdf001m(String personId, ExecutantType executant) throws RisBusinessException;

    /**
     * Gets the rcdf001m_4.
     * 
     * @param rsdf001mDTO
     *            the rsdf001m dto
     * @param pExecutantType
     *            the executant type
     * @return the rcdf001m_4
     */
    List<Rcdf001mType> getRcdf001m_4(final Rsdf001mDTO rsdf001mDTO, final ExecutantType pExecutantType);

    /**
     * 依生父統號取得全國個人基本資料.
     * 
     * @param fatherId
     *            生父統號
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             依生父統號取得全國個人基本資料失敗
     */
    public List<Rcdf001mType> getRcdf001mByFatherId(final String fatherId, final ExecutantType executant)
            throws RisBusinessException;

    /**
     * 依生母統號取得全國個人基本資料.
     * 
     * @param motherId
     *            生母統號
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             依生母統號取得全國個人基本資料失敗
     */
    public List<Rcdf001mType> getRcdf001mByMotherId(final String motherId, final ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得當事人之兄弟/姊妹個人基本資料物件.
     * 
     * @param rcdf001mDTO
     *            the rcdf001m dto
     * @param executant
     *            the executant
     * @return Rcdf001mDTO
     * @throws RisBusinessException
     *             the ris business exception
     */
    public List<Rcdf001mDTO> getRcdf001mByParentsId(Rcdf001mDTO rcdf001mDTO, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得資料檔.
     * 
     * @param personId
     *            個人統號
     * @param executant
     *            the executant
     * @return the rcdf002m_1
     * @throws RisBusinessException
     *             the ris business exception
     */
    public List<Rcdf002mType> getRcdf002m_1(String personId, ExecutantType executant) throws RisBusinessException;

    /**
     * getRcdf002mAndRcdf003m.
     * 
     * @param personId
     *            the person id
     * @param executant
     *            the executant
     * @return the rcdf002m and rcdf003m
     * @throws RisBusinessException
     *             the ris business exception
     */
    public Rcdf002mAndRcdf003mDTO getRcdf002mAndRcdf003m(String personId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * Gets the ds rcdf003m.
     * 
     * @param personId
     *            the person id
     * @param executant
     *            the executant
     * @return the ds rldf003m
     * @throws RisBusinessException
     *             the ris business exception
     */
    public List<Rcdf003mType> getRcdf003m(final String personId, final ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得資料檔.
     * 
     * @param personId
     *            個人統號
     * @param executant
     *            the executant
     * @return the rcdf003m_1
     * @throws RisBusinessException
     *             the ris business exception
     */
    public List<Rcdf003mType> getRcdf003m_1(String personId, ExecutantType executant) throws RisBusinessException;

    /**
     * 取得姓名更改紀錄.
     * 
     * @param personId
     *            戶長國民身分證統一編號
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得姓名更改紀錄失敗
     */
    public List<Rcdf004mType> getRcdf004m(String personId, ExecutantType executant) throws RisBusinessException;

    /**
     * getRcdf049mByViolatorId 依相對人統號取得家暴資料.
     * 
     * @param violatorId
     *            the violator id
     * @param executant
     *            the executant
     * @return 保護家庭暴力資料 (List<Rcdf049mType>)
     */
    public List<Rcdf049mType> getRcdf049mByViolatorId(final String violatorId, final ExecutantType executant);

    /**
     * 取得關係人清單(從RC的RCDF001M取得)
     * 
     * @param personId
     *            統號
     * @param executant
     *            ExecutantType
     * @return 關係人清單
     * @throws RisBusinessException
     */
    public List<RelationData> getRelatedPerson(final String personId, final ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得關係人清單
     * 
     * @param personId
     *            統號
     * @param executant
     *            ExecutantType
     * @param fromRl
     *            true:從RL的RCDF001MRL取得；false:從RC的RCDF001M取得
     * @return 關係人清單
     * @throws RisBusinessException
     */
    public List<RelationData> getRelatedPerson(final String personId, final ExecutantType executant,
            final Boolean fromRl) throws RisBusinessException;

    /**
     * 取得除戶戶內人口個人基本資料.
     * 
     * @param personId
     *            戶長國民身分證統一編號
     * @param removeYyymmdd
     *            除戶日期
     * @param removeTime
     *            除戶時間
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得戶內現住人口個人基本資料失敗
     */
    public List<Rldf004hType> getRemoveHouseholdMember(String personId, String removeYyymmdd, String removeTime,
            String siteId, ExecutantType executant) throws RisBusinessException;

    /**
     * 取得補登戶籍資料.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得補登戶籍資料失敗
     */
    public List<SelectEntity<Tldf004mType>> getReplenishData(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得戶內人口補登資料.
     * 
     * @param househouldHeadId
     *            戶長國民身分證統一編號
     * @param houseHoldId
     *            戶號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得戶內人口補登資料失敗
     */
    public List<Tldf004mType> getReplenishMember(String househouldHeadId, String houseHoldId, String siteId,
            ExecutantType executant) throws RisBusinessException;

    /**
     * 取得空白國民身分證及膠膜使用記錄.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得空白國民身分證及膠膜使用記錄失敗
     */
    public List<Rldf012dType> getReRldf012d(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * Gets the rl02100 hdto result.
     * 
     * @param personId
     *            the person id
     * @param siteId
     *            the site id
     * @param removeYyymmdd
     *            the remove yyymmdd
     * @param removeTime
     *            the remove time
     * @param executant
     *            the executant
     * @return the rl02100 hdto result
     * @throws RisBusinessException
     *             the ris business exception
     */
    public Rl02100HDTOResult getRl02100HDTOResult(final String personId, final String siteId,
            final String removeYyymmdd, final String removeTime, final ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得02100戶籍謄本所需要資料.
     * 
     * @param personId
     *            the person id
     * @param siteId
     *            the site id
     * @param executant
     *            the executant
     * @return the rl02100 mdto result
     * @throws RisBusinessException
     *             the ris business exception
     */
    public Rl02100MDTOResult getRl02100MDTOResult(final String personId, final String siteId,
            final ExecutantType executant) throws RisBusinessException;

    /**
     * Gets the rl03100 data.
     * 
     * @param pPersonId
     *            the person id
     * @param pSiteId
     *            the site id
     * @param pExecutantType
     *            the executant type
     * @return the rl03100 data
     */
    Rl03100ResultDTO getRl03100Data(final String pPersonId, final String pSiteId, final ExecutantType pExecutantType);

    /**
     * Gets the rl03100 local data.
     * 
     * @param pPersonId
     *            the person id
     * @param pSiteId
     *            the site id
     * @param pExecutantType
     *            the executant type
     * @return the rl03100 local data
     */
    Rl03100ResultDTO getRl03100LocalData(final String pPersonId, final String pSiteId,
            final ExecutantType pExecutantType);

    /**
     * Gets the rl03100 local removed data.
     * 
     * @param pHouseholdHeadId
     *            the household head id
     * @param pHouseholdId
     *            the household id
     * @param pPersonId
     *            the person id
     * @param pRemoveYyymmdd
     *            the remove yyymmdd
     * @param pRemoveTime
     *            the remove time
     * @param pSiteId
     *            the site id
     * @param pExecutantType
     *            the executant type
     * @return the rl03100 local removed data
     */
    Rl03100RemovedResultDTO getRl03100LocalRemovedData(final String pHouseholdHeadId, final String pHouseholdId,
            final String pPersonId, final String pRemoveYyymmdd, final String pRemoveTime, final String pSiteId,
            final ExecutantType pExecutantType);

    /**
     * Gets the rl03100 removed data.
     * 
     * @param pHouseholdHeadId
     *            the household head id
     * @param pHouseholdId
     *            the household id
     * @param pPersonId
     *            the person id
     * @param pRemoveYyymmdd
     *            the remove yyymmdd
     * @param pRemoveTime
     *            the remove time
     * @param pSiteId
     *            the site id
     * @param pExecutantType
     *            the executant type
     * @return the rl03100 removed data
     */
    Rl03100RemovedResultDTO getRl03100RemovedData(final String pHouseholdHeadId, final String pHouseholdId,
            final String pPersonId, final String pRemoveYyymmdd, final String pRemoveTime, final String pSiteId,
            final ExecutantType pExecutantType);

    /**
     * 取得全戶出生地英文版資料.
     * 
     * @param birthCode
     *            出生地代碼
     * @param areaCode
     *            行政區域代碼
     * @param siteId
     *            the site id
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得全戶出生地英文版資料失敗
     */
    public List<Rlde210wType> getRlde210w(String birthCode, String areaCode, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * Gets the rldf001h.
     * 
     * @param pHouseHoldId
     *            戶號
     * @param pRemoveYear
     *            除戶年分
     * @param pSiteId
     *            the site id
     * @param pExecutantType
     *            the executant type
     * @return the rldf001h
     */
    List<Rldf001hType> getRldf001h(final String pHouseHoldId, final String pRemoveYear, final String pSiteId,
            final ExecutantType pExecutantType);

    /**
     * 取得除戶全戶基本資料.
     * 
     * @param househouldHeadId
     *            戶長國民身分證統一編號
     * @param houseHoldId
     *            戶號
     * @param removeDate
     *            除戶日期
     * @param removeTime
     *            除戶時間
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得除戶全戶基本資料失敗
     */
    public List<Rldf001hType> getRldf001h(String househouldHeadId, String houseHoldId, String removeDate,
            String removeTime, String siteId, ExecutantType executant) throws RisBusinessException;

    /**
     * 取得全戶基本資料.
     * 
     * @param househouldHeadId
     *            戶長國民身分證統一編號
     * @param houseHoldId
     *            戶號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得全戶基本資料失敗
     */
    public List<Rldf001mType> getRldf001m(String househouldHeadId, String houseHoldId, String siteId,
            ExecutantType executant) throws RisBusinessException;

    /**
     * 同時取得1m與4m.
     * 
     * @param pPserondId
     *            the pserond id
     * @param pSiteId
     *            the site id
     * @param pExecutantType
     *            the executant type
     * @return the rldf001m and rldf004m
     * @throws RisBusinessException
     *             the ris business exception
     */
    public Rldf004mAndRldf001mDTO getRldf001mAndRldf004m(final String pPserondId, final String pSiteId,
            ExecutantType pExecutantType) throws RisBusinessException;

    /**
     * 取得新式國民身分證請領記錄資料.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得新式國民身分證請領記錄資料失敗
     */
    public List<Rldf002dType> getRldf002d(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 依發證戶所取得國民身分證請領資料.
     * 
     * @param personId
     *            統號
     * @param siteId
     *            目的地作業點代碼
     * @param acceptAdminOfficeCode
     *            發證戶所
     * @param applyYyymmdd
     *            受理日期
     * @param applyHhmmss
     *            受理時間
     * @param executant
     *            the executant
     * @return the rldf002d by apply
     * @throws RisBusinessException
     *             the ris business exception
     */
    public List<Rldf002dType> getRldf002dByApply(String personId, String siteId, String acceptAdminOfficeCode,
            String applyYyymmdd, String applyHhmmss, ExecutantType executant) throws RisBusinessException;

    /**
     * 取得除戶全戶動態記事資料(無判斷本地異地-WS專用).
     * 
     * @param househouldHeadId
     *            戶長國民身分證統一編號
     * @param houseHoldId
     *            戶號
     * @param removeDate
     *            the remove date
     * @param removeTime
     *            the remove time
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得除戶全戶動態記事資料
     */
    public List<Rldf002hType> getRldf002h(String househouldHeadId, String houseHoldId, String removeDate,
            String removeTime, String siteId, ExecutantType executant) throws RisBusinessException;

    /**
     * 取得全戶動態記事資料.
     * 
     * @param househouldHeadId
     *            戶長國民身分證統一編號
     * @param houseHoldId
     *            戶號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得全戶動態記事資料
     */
    public List<Rldf002mType> getRldf002m(String househouldHeadId, String houseHoldId, String siteId,
            ExecutantType executant) throws RisBusinessException;

    /**
     * 取得國民身分證及膠膜註銷記錄.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得國民身分證及膠膜註銷記錄失敗
     */
    public List<Rldf003dType> getRldf003d(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * Gets the rldf003d by apply.
     * 
     * @param personId
     *            the person id
     * @param siteId
     *            the site id
     * @param expireYyymmdd
     *            the expire yyymmdd
     * @param expireHhmmss
     *            the expire hhmmss
     * @param executant
     *            the executant
     * @return the rldf003d by apply
     * @throws RisBusinessException
     *             the ris business exception
     */
    public List<Rldf003dType> getRldf003dByApply(String personId, String siteId, String expireYyymmdd,
            String expireHhmmss, ExecutantType executant) throws RisBusinessException;

    /**
     * 取得全戶人員英文姓名資料.
     * 
     * @param householdId
     *            戶號
     * @param personNameC
     *            中文姓名
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得全戶人員英文姓名資料失敗
     */
    public List<Rldf003yType> getRldf003y(String householdId, String personNameC, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得除戶全戶基本資料.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param removeDate
     *            除戶日期
     * @param removeTime
     *            除戶時間
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得除戶全戶基本資料失敗
     */
    public List<Rldf004hType> getRldf004h(String personId, String removeDate, String removeTime, String siteId,
            ExecutantType executant) throws RisBusinessException;

    /**
     * 取得除戶個人基本資料與全戶基本資料.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param removeDate
     *            除戶日期
     * @param removeTime
     *            除戶時間
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return RlRmve41ResultDTO
     * @throws RisBusinessException
     *             取得除戶全戶基本資料失敗
     */
    public RlRmve41ResultDTO getRldf004hAnd1h(String personId, String removeDate, String removeTime, String siteId,
            ExecutantType executant) throws RisBusinessException;

    /**
     * 取得個人基本資料.
     * 
     * @param executant
     *            the executant
     * @param personId
     *            the person id
     * @param personalMark
     *            the personal mark
     * @param siteId
     *            the site id
     * @return the rldf004m
     * @throws RisBusinessException
     *             the ris business exception
     */
    public Rldf004mType getRldf004m(final ExecutantType executant, final String personId, final String personalMark,
            final String siteId) throws RisBusinessException;

    /**
     * 取得個人基本資料.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得個人基本資料失敗
     */
    public List<Rldf004mType> getRldf004m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * Gets the rldf004m.
     * 
     * @param householdheadId
     *            戶長統號
     * @param householdId
     *            戶號
     * @param siteId
     *            the site id
     * @param executant
     *            the executant
     * @return the rldf004m
     * @throws RisBusinessException
     *             the ris business exception
     */
    public List<Rldf004mType> getRldf004m(String householdheadId, String householdId, String siteId,
            ExecutantType executant) throws RisBusinessException;

    /**
     * 取得除戶個人記事資料.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param removeYyymmdd
     *            除戶日期
     * @param removeTime
     *            除戶時間
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得除戶個人記事資料失敗
     */
    public List<Rldf005hType> getRldf005h(String personId, String removeYyymmdd, String removeTime, String siteId,
            ExecutantType executant) throws RisBusinessException;

    /**
     * 依據統號清單取得除戶個人記事資料.
     * 
     * @param personIds
     *            統號清單
     * @param siteId
     *            the site id
     * @param removeYyymmdd
     *            the remove yyymmdd
     * @param removeTime
     *            the remove time
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得個人記事資料失敗
     */
    public List<Rldf005hType> getRldf005hs(final List<String> personIds, final String siteId, String removeYyymmdd,
            String removeTime, final ExecutantType executant) throws RisBusinessException;

    /**
     * 取得個人記事資料.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得個人記事資料失敗
     */
    public List<Rldf005mType> getRldf005m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 依據統號清單取得個人記事資料.
     * 
     * @param personIds
     *            統號清單
     * @param siteId
     *            the site id
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得個人記事資料失敗
     */
    public List<Rldf005mType> getRldf005ms(final List<String> personIds, final String siteId,
            final ExecutantType executant) throws RisBusinessException;

    /**
     * 取得全戶記事翻譯資料.
     * 
     * @param houseHId
     *            the house h id
     * @param yyyMmDd
     *            登記日期
     * @param hhMmSs
     *            登記時間
     * @param siteId
     *            作業點代碼
     * @param executantType
     *            the executant type
     * @return List
     */
    public List<Rldf005yType> getRldf005y(String houseHId, String yyyMmDd, String hhMmSs, String siteId,
            ExecutantType executantType);

    /**
     * 取得除戶個人遷徙紀錄資料.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param removeYyymmdd
     *            除戶日期
     * @param removeTime
     *            除戶時間
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得個人遷徙記錄資料失敗
     */
    public List<Rldf006hType> getRldf006h(String personId, String removeYyymmdd, String removeTime, String siteId,
            ExecutantType executant) throws RisBusinessException;

    /**
     * 取得個人遷徙記錄資料.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得個人遷徙記錄資料失敗
     */
    public List<Rldf006mType> getRldf006m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得戶號配賦紀錄檔.
     * 
     * @param siteId
     *            作業點代碼
     * @param rlProcessCode
     *            RL處理註記
     * @param executant
     *            the executant
     * @return List 戶號配賦紀錄
     * @throws RisBusinessException
     *             the ris business exception
     */
    public List<Rldf006sType> getRldf006s(final String siteId, final String rlProcessCode, final ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得全戶人員個人資料.
     * 
     * @param personId
     *            統號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得全戶人員個人資料失敗
     */
    public List<Rldf006yType> getRldf006y(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得除戶個人姓名更改紀錄資料.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param removeYyymmdd
     *            除戶日期
     * @param removeTime
     *            除戶時間
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得個人遷徙記錄資料失敗
     */
    public List<Rldf007hType> getRldf007h(String personId, String removeYyymmdd, String removeTime, String siteId,
            ExecutantType executant) throws RisBusinessException;

    /**
     * 取得姓名更改記錄資料.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得姓名更改記錄資料失敗
     */
    public List<Rldf007mType> getRldf007m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得統號配賦紀錄檔.
     * 
     * @param siteId
     *            作業點代碼
     * @param gender
     *            性別
     * @param idType
     *            配賦身分代碼
     * @param rlProcessCode
     *            RL處理註記
     * @param executant
     *            the executant
     * @return List 統號配賦紀錄
     * @throws RisBusinessException
     *             the ris business exception
     */
    public List<Rldf007sType> getRldf007s(final String siteId, final String gender, final String idType,
            final String rlProcessCode, final ExecutantType executant) throws RisBusinessException;

    /**
     * 取得個人記事翻譯資料.
     * 
     * @param personNoteId
     *            the person note id
     * @param yyyMmDd
     *            登記日期
     * @param hhMmSs
     *            登記時間
     * @param siteId
     *            作業點代碼
     * @param executantType
     *            the executant type
     * @return List
     */
    public List<Rldf007yType> getRldf007y(String personNoteId, String yyyMmDd, String hhMmSs, String siteId,
            ExecutantType executantType);

    /**
     * 取得特殊人口資料.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param removeYyymmdd
     *            除戶日期
     * @param removeTime
     *            除戶時間
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得特殊人口資料失敗
     */
    public List<Rldf008hType> getRldf008h(String personId, String removeYyymmdd, String removeTime, String siteId,
            ExecutantType executant) throws RisBusinessException;

    /**
     * 取得特殊人口資料.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得特殊人口資料失敗
     */
    public List<Rldf008mType> getRldf008m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得限制遷徙人口資料.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param removeYyymmdd
     *            除戶日期
     * @param removeTime
     *            除戶時間
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得限制遷徙人口資料失敗
     */
    public List<Rldf010hType> getRldf010h(String personId, String removeYyymmdd, String removeTime, String siteId,
            ExecutantType executant) throws RisBusinessException;

    /**
     * 取得限制遷徙人口資料.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得限制遷徙人口資料失敗
     */
    public List<Rldf010mType> getRldf010m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得全戶翻譯資料(電腦化前).
     * 
     * @param householdName
     *            戶長姓名
     * @param householdId
     *            戶號
     * @param siteId
     *            作業點代碼
     * @param executantType
     *            the executant type
     * @return List
     */
    public List<Rldf010yType> getRldf010y(String householdName, String householdId, String siteId,
            ExecutantType executantType);

    /**
     * 取得遷出未接通報資料.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得遷出未接通報資料失敗
     */
    public List<Rldf011mType> getRldf011m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * Gets the rldf012d by apply.
     * 
     * @param type
     *            the type
     * @param no
     *            the no
     * @param siteId
     *            the site id
     * @param executant
     *            the executant
     * @return the rldf012d by apply
     * @throws RisBusinessException
     *             the ris business exception
     */
    public List<Rldf012dType> getRldf012dByApply(String type, String no, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得個人翻譯資料(電腦化前).
     * 
     * @param pPersonName
     *            the person name
     * @param pPersonId
     *            the person id
     * @param siteId
     *            作業點代碼
     * @param executantType
     *            the executant type
     * @return List
     */
    public List<Rldf012yType> getRldf012y(String pPersonName, String pPersonId, String siteId,
            ExecutantType executantType);

    /**
     * 取得沿用影像資料.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得沿用影像資料失敗
     */
    public List<Rldf017dType> getRldf017d(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得戶口名簿請領資料.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得戶口名簿請領資料失敗
     */
    public List<Rldf018dType> getRldf018d(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * Gets the rldf018d_2.
     * 
     * @param householdHeadId
     *            the household head id
     * @param householdId
     *            the household id
     * @param siteId
     *            the site id
     * @param executant
     *            the executant
     * @return the rldf018d_2
     * @throws RisBusinessException
     *             the ris business exception
     */
    public List<Rldf018dType> getRldf018d_2(final String householdHeadId, final String householdId,
            final String siteId, final ExecutantType executant) throws RisBusinessException;

    /**
     * Gets the rldf018d_251z.
     * 
     * @param rl0251zWsDTO
     *            the rl0251zWsDTO
     * @param executant
     *            the executant
     * @return the rldf018d_251z
     * @throws RisBusinessException
     *             the ris business exception
     */
    public List<Rldf018dType> getRldf018dFor251z(final Rl0251zWsDTO rl0251zWsDTO, final ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得里鄰門牌資料.
     * 
     * @param village
     *            村
     * @param neighbor
     *            鄰
     * @param streetDoorplate
     *            街路門牌
     * @param siteId
     *            the site id
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得里鄰門牌資料失敗
     */
    public List<Rldf020mType> getRldf020m(String village, String neighbor, String streetDoorplate, String siteId,
            ExecutantType executant) throws RisBusinessException;

    /**
     * 取得逕遷至戶政事務所人數資料.
     * 
     * @param dataYear
     *            統計日期(年)
     * @param dataMonth
     *            統計日期(月)
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得逕遷至戶政事務所人數資料失敗
     */
    public List<Rldf020sType> getRldf020s(String dataYear, String dataMonth, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得戶號配賦資料 (前 200 筆資料).
     * 
     * @param householdId
     *            戶號
     * @param householdIdEndueMark
     *            戶號配賦註記
     * @param siteId
     *            siteId
     * @param executant
     *            使用者資訊
     * @return List<E>
     * @throws RisBusinessException
     *             取得戶號配賦資料失敗
     */
    public List<Rldf021mType> getRldf021m(String householdId, String householdIdEndueMark, String siteId,
            ExecutantType executant) throws RisBusinessException;

    /**
     * 取得戶號配賦資料總筆數
     * 
     * @param householdId
     *            戶號
     * @param householdIdEndueMark
     *            戶號配賦註記
     * @param siteId
     *            作業點代碼
     * @param executantType
     *            使用者資訊
     * @return 戶號配賦資料總筆數
     * @throws RisBusinessException
     */
    public int getRldf021mCount(final String householdId, final String householdIdEndueMark, final String siteId,
            final ExecutantType executantType) throws RisBusinessException;

    // /**
    // * Gets the rrdf004m.
    // *
    // * @param personName
    // * the person name
    // * @param executant
    // * the executant
    // * @return the rrdf004m
    // * @throws RisBusinessException
    // * the ris business exception
    // */
    // public List<Rrdf004mType> getRrdf004m(String personName, ExecutantType
    // executant) throws RisBusinessException;

    /**
     * 戶號安全存量控制檔.
     * 
     * @param siteId
     *            作業點代碼
     * @param executant
     *            the executant
     * @return List 戶號安全存量
     * @throws RisBusinessException
     *             the ris business exception
     */
    public List<Rldf021oType> getRldf021o(final String siteId, final ExecutantType executant)
            throws RisBusinessException;

    /**
     * 
     * @param personId
     * @param acceptSiteId
     * @param applyYyymmdd
     * @param applyHhmmss
     * @param executant
     * @return
     * @throws RisBusinessException
     */
    public List<Rldf022dType> getRldf022dByApply(String personId, String acceptSiteId, String applyYyymmdd,
            String applyHhmmss, ExecutantType executant) throws RisBusinessException;

    /**
     * 取得國民身分證統一編號配賦資料.
     * 
     * @param personId
     *            統號
     * @param personIdEndueMark
     *            統號配賦註記
     * @param gender
     *            性別
     * @param idType
     *            身分別
     * @param siteId
     *            siteId
     * @param executant
     *            使用者資訊
     * @return List
     * 
     * @throws RisBusinessException
     *             取得國民身分證統一編號配賦資料失敗
     */
    public List<Rldf022mType> getRldf022m(String personId, String personIdEndueMark, String gender, String idType,
            String siteId, ExecutantType executant) throws RisBusinessException;

    /**
     * 取得國民身分證統一編號配賦資料總筆數
     * 
     * @param personIdEndueMark
     *            統號配賦註記
     * @param gender
     *            性別
     * @param idType
     *            身分別
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return 國民身分證統一編號配賦資料總筆數
     * @throws RisBusinessException
     */
    public int getRldf022mCount(final String personIdEndueMark, final String gender, final String idType,
            final String siteId, final ExecutantType executantType) throws RisBusinessException;

    /**
     * 取得國民身分證統一編號配賦資料 前 200 筆.
     * 
     * @param personIdEndueMark
     *            統號配賦註記
     * @param gender
     *            性別
     * @param idType
     *            身分別
     * @param siteId
     *            siteId
     * @param executant
     *            使用者資訊
     * @return List
     * 
     * @throws RisBusinessException
     *             取得國民身分證統一編號配賦資料失敗
     */
    public List<Rldf022mType> getRldf022mTop(final String personIdEndueMark, final String gender, final String idType,
            final String siteId, final ExecutantType executant) throws RisBusinessException;

    /**
     * 統號安全存量控制檔.
     * 
     * @param siteId
     *            作業點代碼
     * @param executant
     *            the executant
     * @return List 統號安全存量
     * @throws RisBusinessException
     *             the ris business exception
     */
    public List<Rldf022oType> getRldf022o(final String siteId, final ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得國民身分證統一編號配賦資料.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param househouldHeadId
     *            戶長國民身分證統一編號
     * @param houseHoldId
     *            戶號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得國民身分證統一編號配賦資料失敗
     */
    public List<Rldf024mType> getRldf024m(String personId, String househouldHeadId, String houseHoldId, String siteId,
            ExecutantType executant) throws RisBusinessException;

    /**
     * 取得所內記事資料.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得所內記事資料失敗
     */
    public List<Rldf030mType> getRldf030m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * Gets the rldf030t.
     * 
     * @param personId
     *            the person id
     * @param siteId
     *            the site id
     * @param registerYyymmdd
     *            the register yyymmdd
     * @param registerHhmmss
     *            the register hhmmss
     * @param executant
     *            the executant
     * @return the rldf030t
     * @throws RisBusinessException
     *             the ris business exception
     */
    public List<Rldf030tType> getRldf030t(final String personId, final String siteId, final String registerYyymmdd,
            final String registerHhmmss, final ExecutantType executant) throws RisBusinessException;

    /**
     * Gets the rldf030t.
     * 
     * @param personId
     *            the person id
     * @param siteId
     *            the site id
     * @param executant
     *            the executant
     * @return the rldf030t
     * @throws RisBusinessException
     *             the ris business exception
     */
    public List<Rldf030tType> getRldf030tHousehold(final String personId, final String siteId,
            final ExecutantType executant) throws RisBusinessException;

    /**
     * 取得出境滿二年未入境通報紀錄.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得出境滿二年未入境通報紀錄失敗
     */
    public List<Rldf039mType> getRldf039m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得出境滿二年再入境通報紀錄.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得出境滿二年再入境通報紀錄失敗
     */
    public List<Rldf040mType> getRldf040m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得逕遷戶政事務所人口通報.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param processMark01
     *            the process mark01
     * @param processMark02
     *            the process mark02
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得個人基本資料失敗
     */
    public List<Rldf045mType> getRldf045m(String personId, String siteId, String processMark01, String processMark02,
            ExecutantType executant) throws RisBusinessException;

    /**
     * 取得逕遷戶政事務所人口通報.
     * 
     * @param householdHeadId
     *            the household head id
     * @param householdId
     *            the household id
     * @param siteId
     *            作業點代碼
     * @param processMark01
     *            the process mark01
     * @param processMark02
     *            the process mark02
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得個人基本資料失敗
     */
    public List<Rldf045mType> getRldf045m(String householdHeadId, String householdId, String siteId,
            String processMark01, String processMark02, ExecutantType executant) throws RisBusinessException;

    /**
     * 取得姓名羅馬拼音記錄資料.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param removeYyymmdd
     *            除戶日期
     * @param removeTime
     *            除戶時間
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得姓名羅馬拼音記錄資料失敗
     */
    public List<Rldf047hType> getRldf047h(String personId, String removeYyymmdd, String removeTime, String siteId,
            ExecutantType executant) throws RisBusinessException;

    /**
     * 取得姓名羅馬拼音記錄資料.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得姓名羅馬拼音記錄資料失敗
     */
    public List<Rldf047mType> getRldf047m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得保護家庭暴力資料.
     * 
     * @param victimId
     *            被保護人統號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List 保護家庭暴力資料
     * @throws RisBusinessException
     *             取得姓名羅馬拼音記錄資料失敗
     */
    public List<Rldf049mType> getRldf049m(String victimId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * Gets the rldf049m.
     * 
     * @param victimId
     *            the victim id
     * @param violatorId
     *            the violator id
     * @param pSiteId
     *            the site id
     * @param pExecutantType
     *            the executant type
     * @return the rldf049m
     * @throws RisBusinessException
     *             the ris business exception
     */
    public List<Rldf049mType> getRldf049m(String victimId, String violatorId, String pSiteId,
            ExecutantType pExecutantType) throws RisBusinessException;

    /**
     * 取得保護家庭暴力資料.
     * 
     * @param pVictimId
     *            被保護人統號
     * @param pViolatorId
     *            相對人統號
     * @param pBeginYyymmdd
     *            保護令期限(起) (option)
     * @param pEndYyymmdd
     *            保護令期限(迄) (option)
     * @param pSiteId
     *            the site id
     * @param pExecutantType
     *            the executant type
     * @return the rldf049m
     */
    List<Rldf049mType> getRldf049m(final String pVictimId, final String pViolatorId, final String pBeginYyymmdd,
            final String pEndYyymmdd, final String pSiteId, ExecutantType pExecutantType);

    /**
     * 同時取得49m與4m.
     * 
     * @param pPserondId
     *            the pserond id
     * @param pSiteId
     *            the site id
     * @param pExecutantType
     *            the executant type
     * @return the rldf049m and rldf004m
     * @throws RisBusinessException
     *             the ris business exception
     */
    public Rldf004mAndRldf049mDTO getRldf049mAndRldf004m(final String pPserondId, final String pSiteId,
            ExecutantType pExecutantType) throws RisBusinessException;

    /**
     * 由產婦統號取得出生通報資料.
     * 
     * @param personId
     *            產婦統號
     * @param siteId
     *            產婦作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得保護家庭暴力資料失敗
     */
    public List<Rldf051mType> getRldf051mByMother(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 由配偶統號取得出生通報資料.
     * 
     * @param personId
     *            配偶統號
     * @param siteId
     *            配偶作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             由配偶統號取得出生通報資料失敗
     */
    public List<Rldf051mType> getRldf051mBySpouse(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得出生通報查核結果資料檔.
     * 
     * @param queryObject
     *            出生通報查核結果資料檔查詢物件
     * @param executantType
     *            使用者資訊
     * @return 出生通報查核結果資料檔
     * @throws RisBusinessException
     */
    Rldf058mType getRldf058m(final Rldf058mDTO queryObject, final ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 取得登記婚前結(離)婚證明書資料.
     * 
     * @param personId
     *            the person id
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List<Rldf087tType>
     * @throws RisBusinessException
     *             「取得登記婚前結(離)婚證明書資料」失敗
     */
    public List<Rldf087tType> getRldf087t(final String personId, final String siteId, final ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得除戶-登記婚前結(離)婚證明書資料.
     * 
     * @param personId
     *            the person id
     * @param removeYyymmdd
     *            the remove yyymmdd
     * @param removeTime
     *            the remove time
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List<Rldf087thType>
     * @throws RisBusinessException
     *             「取得登記婚前結(離)婚證明書資料」失敗
     */
    public List<Rldf087thType> getRldf087th(final String personId, final String removeYyymmdd, final String removeTime,
            final String siteId, final ExecutantType executant) throws RisBusinessException;

    /**
     * 取得結(離)婚證明書資料.
     * 
     * @param personId
     *            the person id
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List<Rldf087tType>
     * @throws RisBusinessException
     *             「取得結(離)婚證明書資料」失敗
     */
    public List<Rldf088tType> getRldf088t(final String personId, final String siteId, final ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得除戶-結(離)婚證明書資料.
     * 
     * @param personId
     *            the person id
     * @param removeYyymmdd
     *            the remove yyymmdd
     * @param removeTime
     *            the remove time
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List<Rldf088thType>
     * @throws RisBusinessException
     *             「取得結(離)婚證明書資料」失敗
     */
    public List<Rldf088thType> getRldf088th(final String personId, final String removeYyymmdd, final String removeTime,
            final String siteId, final ExecutantType executant) throws RisBusinessException;

    /**
     * 取得英文結(離)婚證明書資料.
     * 
     * @param personId
     *            the person id
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List<Rldf087tType>
     * @throws RisBusinessException
     *             「取得英文結(離)婚證明書資料」失敗
     */
    public List<Rldf089tType> getRldf089t(final String personId, final String siteId, final ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得除戶-英文結(離)婚證明書資料.
     * 
     * @param personId
     *            the person id
     * @param removeYyymmdd
     *            the remove yyymmdd
     * @param removeTime
     *            the remove time
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List<Rldf089thType>
     * @throws RisBusinessException
     *             「取得英文結(離)婚證明書資料」失敗
     */
    public List<Rldf089thType> getRldf089th(final String personId, final String removeYyymmdd, final String removeTime,
            final String siteId, final ExecutantType executant) throws RisBusinessException;

    /**
     * 取得除戶-出生資料記錄.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param removeYymmdd
     *            作業點代碼
     * @param removeHhmmss
     *            除戶日期
     * @param siteId
     *            除戶時間
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得除戶-出生記錄資料失敗
     */
    public List<Rldfm01hType> getRldfm01h(String personId, String removeYymmdd, String removeHhmmss, String siteId,
            ExecutantType executant) throws RisBusinessException;

    /**
     * 取得出生資料.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List 出生資料
     * @throws RisBusinessException
     *             「取得本地出生資料」失敗
     */
    public List<Rldfm01mType> getRldfm01m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得除戶-婚姻紀錄.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param removeYymmdd
     *            作業點代碼
     * @param removeHhmmss
     *            除戶日期
     * @param siteId
     *            除戶時間
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得除戶-婚姻紀錄資料失敗
     */
    public List<Rldfm02hType> getRldfm02h(String personId, String removeYymmdd, String removeHhmmss, String siteId,
            ExecutantType executant) throws RisBusinessException;

    /**
     * 取得婚姻紀錄.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List 婚姻紀錄
     * @throws RisBusinessException
     *             「取得婚姻紀錄」失敗
     */
    public List<Rldfm02mType> getRldfm02m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得除戶-統號更改紀錄.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param removeYymmdd
     *            作業點代碼
     * @param removeHhmmss
     *            除戶日期
     * @param siteId
     *            除戶時間
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得除戶-統號更改紀錄資料失敗
     */
    public List<Rldfm03hType> getRldfm03h(String personId, String removeYymmdd, String removeHhmmss, String siteId,
            ExecutantType executant) throws RisBusinessException;

    /**
     * 取得統號更改紀錄.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List 統號更改紀錄
     * @throws RisBusinessException
     *             「取得統號更改紀錄」失敗
     */
    public List<Rldfm03mType> getRldfm03m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得除戶-收養紀錄.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param removeYymmdd
     *            作業點代碼
     * @param removeHhmmss
     *            除戶日期
     * @param siteId
     *            除戶時間
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得除戶-收養紀錄資料失敗
     */
    public List<Rldfm04hType> getRldfm04h(String personId, String removeYymmdd, String removeHhmmss, String siteId,
            ExecutantType executant) throws RisBusinessException;

    /**
     * 取得收養記錄.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List 收養記錄
     * @throws RisBusinessException
     *             「取得收養記錄」失敗
     */
    public List<Rldfm04mType> getRldfm04m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得除戶-監護、輔助、未成年子女權利義務行使負擔資料.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param removeYymmdd
     *            作業點代碼
     * @param removeHhmmss
     *            除戶日期
     * @param siteId
     *            除戶時間
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得除戶-監護、輔助、未成年子女權利義務行使負擔記錄資料失敗
     */
    public List<Rldfm05hType> getRldfm05h(String personId, String removeYymmdd, String removeHhmmss, String siteId,
            ExecutantType executant) throws RisBusinessException;

    /**
     * 取得除戶之監護、輔助、未成年子女權利義務行使負擔資料.
     * 
     * @param personId
     *            統號
     * @param siteId
     *            作業點代碼
     * @param relationId
     *            關係人統號
     * @param removeYyymmdd
     *            除戶日期
     * @param removeHhmmss
     *            除戶時間
     * @param relationCode
     *            關係人之彼此關係代碼
     * @param executant
     *            使用者資訊
     * @return 除戶之監護、輔助、未成年子女權利義務行使負擔資料
     * @throws RisBusinessException
     *             取得除戶之監護、輔助、未成年子女權利義務行使負擔資料失敗
     */
    public List<Rldfm05hType> getRldfm05h(final String personId, final String siteId, final String relationId,
            String removeYyymmdd, String removeHhmmss, final String relationCode, final ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得監護、輔助、未成年子女權利義務行使負擔資料.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List 監護、輔助、未成年子女權利義務行使負擔資料
     * @throws RisBusinessException
     *             「取得監護、輔助、未成年子女權利義務行使負擔資料」失敗
     */
    public List<Rldfm05mType> getRldfm05m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得監護、輔助、未成年子女權利義務行使負擔資料.
     * 
     * @param personId
     *            統號
     * @param siteId
     *            作業點代碼
     * @param relationId
     *            關係人統號
     * @param relationCode
     *            關係人之彼此關係代碼
     * @param executant
     *            使用者資訊
     * @return 監護、輔助、未成年子女權利義務行使負擔資料
     * @throws RisBusinessException
     *             取得監護、輔助、未成年子女權利義務行使負擔資料失敗
     */
    public List<Rldfm05mType> getRldfm05m(final String personId, final String siteId, final String relationId,
            final String relationCode, final ExecutantType executant) throws RisBusinessException;

    /**
     * 取得除戶-國民身分證掛失紀錄.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param removeYymmdd
     *            作業點代碼
     * @param removeHhmmss
     *            除戶日期
     * @param siteId
     *            除戶時間
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得除戶-國民身分證掛失紀錄資料失敗
     */
    public List<Rldfm06hType> getRldfm06h(String personId, String removeYymmdd, String removeHhmmss, String siteId,
            ExecutantType executant) throws RisBusinessException;

    /**
     * 取得國民身分證掛失紀錄.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List 國民身分證掛失紀錄
     * @throws RisBusinessException
     *             「取得國民身分證掛失紀錄」失敗
     */
    public List<Rldfm06mType> getRldfm06m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得除戶-重婚紀錄.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param removeYymmdd
     *            作業點代碼
     * @param removeHhmmss
     *            除戶日期
     * @param siteId
     *            除戶時間
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得除戶-重婚紀錄資料失敗
     */
    public List<Rldfm07hType> getRldfm07h(String personId, String removeYymmdd, String removeHhmmss, String siteId,
            ExecutantType executant) throws RisBusinessException;

    /**
     * 取得重婚資料.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List 重婚資料
     * @throws RisBusinessException
     *             「取得重婚資料」失敗
     */
    public List<Rldfm07mType> getRldfm07m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得除戶-監護、輔助、未成年子女權利義務行使負擔紀錄.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param removeYymmdd
     *            作業點代碼
     * @param removeHhmmss
     *            除戶日期
     * @param siteId
     *            除戶時間
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得除戶-監護、輔助、未成年子女權利義務行使負擔紀錄資料失敗
     */
    public List<Rldfm08hType> getRldfm08h(String personId, String removeYymmdd, String removeHhmmss, String siteId,
            ExecutantType executant) throws RisBusinessException;

    /**
     * 取得監護、輔助、未成年子女權利義務行使負擔紀錄.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List 監護、輔助、未成年子女權利義務行使負擔紀錄
     * @throws RisBusinessException
     *             「取得監護、輔助、未成年子女權利義務行使負擔紀錄」失敗
     */
    public List<Rldfm08mType> getRldfm08m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得除戶-出生日期更改紀錄.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param removeYymmdd
     *            作業點代碼
     * @param removeHhmmss
     *            除戶日期
     * @param siteId
     *            除戶時間
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得除戶-出生日期更改紀錄資料失敗
     */
    public List<Rldfm09hType> getRldfm09h(String personId, String removeYymmdd, String removeHhmmss, String siteId,
            ExecutantType executant) throws RisBusinessException;

    /**
     * 取得出生日期更改紀錄.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List 出生日期更改紀錄
     * @throws RisBusinessException
     *             「取得出生日期更改紀錄」失敗
     */
    public List<Rldfm09mType> getRldfm09m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得除戶-個人申請書紀錄.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param removeYymmdd
     *            作業點代碼
     * @param removeHhmmss
     *            除戶日期
     * @param siteId
     *            除戶時間
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得除戶-個人申請書紀錄資料失敗
     */
    public List<Rldfm10hType> getRldfm10h(String personId, String removeYymmdd, String removeHhmmss, String siteId,
            ExecutantType executant) throws RisBusinessException;

    /**
     * 取得(除戶)個人申請書紀錄檔.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param removeYyymmdd
     *            除戶日期
     * @param removeTime
     *            除戶時間
     * @param applyCode
     *            申請書代碼
     * @param applyType
     *            交代R或T
     * @param executant
     *            使用者資訊
     * @return (除戶)個人申請書紀錄檔清單
     * @throws RisBusinessException
     *             取得(除戶)個人申請書紀錄檔失敗
     */
    public List<Rldfm10hType> getRldfm10h(final String personId, final String siteId, final String removeYyymmdd,
            final String removeTime, final String applyCode, final String applyType, final ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得除戶-個人申請書紀錄檔.
     * 
     * @param personId
     *            統號
     * @param removeYyymmdd
     *            除戶日期
     * @param removeTime
     *            除戶時間
     * @param siteId
     *            作業點代碼
     * @param applyCode
     *            申請書代碼
     * @param applyType
     *            申請書類別
     * @param executantType
     *            使用者資訊
     * @return List<Rldfm10hType>
     */
    public List<Rldfm10hType> getRldfm10h2(final String personId, final String removeYyymmdd, final String removeTime,
            final String siteId, final String applyCode, final String applyType, final ExecutantType executantType);

    /**
     * 取得個人申請書紀錄.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List 個人申請書紀錄
     * @throws RisBusinessException
     *             「取得個人申請書紀錄」失敗
     */
    public List<Rldfm10mType> getRldfm10m(final String personId, final String siteId, final ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得個人申請書紀錄.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param applyCode
     *            申請書代碼
     * @param applyType
     *            交待R或T
     * @param executant
     *            使用者資訊
     * @return 個人申請書紀錄
     * @throws RisBusinessException
     *             the ris business exception
     */
    public List<Rldfm10mType> getRldfm10m(final String personId, final String siteId, final String applyCode,
            final String applyType, final ExecutantType executant) throws RisBusinessException;

    /**
     * 取得個人申請書紀錄.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param dataSiteId
     *            資料地作業點代碼
     * @param applyTransationId
     *            交易序號
     * @param applySequenceId
     *            作業順序編號
     * @param applyType
     *            交待R或T
     * @param executant
     *            使用者資訊
     * @return List 個人申請書紀錄
     * @throws RisBusinessException
     *             「取得個人申請書紀錄」失敗
     */
    public List<Rldfm10mType> getRldfm10m(final String personId, final String siteId, final String dataSiteId,
            final String applyTransationId, final String applySequenceId, final String applyType,
            final ExecutantType executant) throws RisBusinessException;

    /**
     * 取得個人姓氏資料紀錄.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param removeYyymmdd
     *            除戶日期
     * @param removeTime
     *            除戶時間
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             「取得個人姓氏資料紀錄」失敗
     */
    public List<Rldfm11hType> getRldfm11h(String personId, String removeYyymmdd, String removeTime, String siteId,
            ExecutantType executant) throws RisBusinessException;

    /**
     * 取得個人姓氏資料紀錄.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List 個人姓氏資料紀錄
     * @throws RisBusinessException
     *             「取得個人姓氏資料紀錄」失敗
     */
    public List<Rldfm11mType> getRldfm11m(final String personId, final String siteId, final ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得國民身分證列印旗標資料紀錄.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             「取得國民身分證列印旗標資料紀錄」失敗
     */
    public List<Rldfm12mType> getRldfm12m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * RLDFM13M國民其他出生地資料檔.
     * 
     * @param personId
     *            the person id
     * @param siteId
     *            the site id
     * @param executant
     *            the executant
     * @return the rldfm13m
     */
    public List<Rldfm13mType> getRldfm13m(String personId, String siteId, ExecutantType executant);

    /**
     * 取得規費主檔.
     * 
     * @param executant
     *            使用者資訊
     * @return Rldfu002
     * @throws RisBusinessException
     *             取得規費主檔失敗
     */
    public Rldfu002Type getRldfu002(ExecutantType executant) throws RisBusinessException;

    /**
     * 取得規費主檔.
     * 
     * @param receiptId
     *            收據號碼
     * @param executant
     *            使用者資訊
     * @return Rldfu002
     * @throws RisBusinessException
     *             取得規費主檔失敗
     */
    public Rldfu002Type getRldfu002WithReceiptId(String receiptId, ExecutantType executant) throws RisBusinessException;

    /**
     * 取得規費清單.
     * 
     * @param transactionId
     *            識別序號
     * @param executant
     *            使用者資訊
     * @return Rldfu002
     * @throws RisBusinessException
     *             取得規費主檔失敗
     */
    public List<Rldfu003Type> getRldfu003(String transactionId, ExecutantType executant) throws RisBusinessException;

    /**
     * 取得全戶記事欄位化資料.
     * 
     * @param dto
     *            RlGetRldfxDataDTO
     * @param executant
     *            the executant
     * @return RldfxDataResultDTO
     */
    RldfxDataResultDTO getRldfxData(final RlGetRldfxDataDTO dto, final ExecutantType executant);

    /**
     * 取得監護登記個人記事欄位化子檔.
     * 
     * @param personId
     *            統號
     * @param siteId
     *            作業點代碼
     * @param registerYyymmdd
     *            登記日期
     * @param registerHhmmss
     *            登記時間
     * @param executant
     *            使用者資訊
     * @return List<Rldfy079dmType>
     */
    public List<Rldfy079dmType> getRldfy079dm(String personId, String siteId, String registerYyymmdd,
            String registerHhmmss, ExecutantType executant);

    /**
     * 取得輔助登記個人記事欄位化子檔.
     * 
     * @param personId
     *            統號
     * @param siteId
     *            作業點代碼
     * @param registerYyymmdd
     *            登記日期
     * @param registerHhmmss
     *            登記時間
     * @param executant
     *            使用者資訊
     * @return List<Rldfy081dmType>
     */
    public List<Rldfy081dmType> getRldfy081dm(String personId, String siteId, String registerYyymmdd,
            String registerHhmmss, ExecutantType executant);

    /**
     * 取得個人記事欄位化資料.
     * 
     * @param dto
     *            RlGetRldfyDataDTO
     * @param executant
     *            the executant
     * @return RlGetRldfyDataDTO
     */
    public RlGetRldfyDataDTO getRldfyData(RlGetRldfyDataDTO dto, ExecutantType executant);

    /**
     * 取得現住人口數(包含兼任戶長).
     * 
     * @param householdHeadI
     *            the household head i
     * @param householdId
     *            the household id
     * @param siteId
     *            the site id
     * @param pExecutantType
     *            the executant type
     * @return the rl household member resident num
     */
    RlHouseholdNumResultDTO getRlHouseholdMemberResidentNum(final String householdHeadI, final String householdId,
            final String siteId, ExecutantType pExecutantType);

    /**
     * 取得遷入地除口或除戶資料.
     * 
     * @param personIds
     *            the person ids
     * @param siteId
     *            the site id
     * @param removeYyymmdd
     *            the remove yyymmdd
     * @param removeHhmmss
     *            the remove hhmmss
     * @param pExecutantType
     *            the executant type
     * @return the rl movein old data
     */
    RlMoveinDataResultDTO getRlMoveinOldData(final List<String> personIds, final String siteId,
            final String removeYyymmdd, final String removeHhmmss, ExecutantType pExecutantType);

    /**
     * Gets the rl o8 data.
     * 
     * @param pPersonId
     *            the person id
     * @param pSiteId
     *            the site id
     * @param pExecutantType
     *            the executant type
     * @return the rl o8 data
     */
    RsO8WSDTO getRlO8Data(final String pPersonId, final String pSiteId, final ExecutantType pExecutantType);

    /**
     * 取得個人基本資料檔.
     * 
     * @param personId
     *            個人統號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            the executant
     * @return the rrdf004m_2
     * @throws RisBusinessException
     *             the ris business exception
     */
    public List<Rrdf004mType> getRrdf004m_2(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得個人基本資料檔.
     * 
     * @param personName
     *            the person name
     * @param siteId
     *            作業點代碼
     * @param executant
     *            the executant
     * @return the rrdf004m_3
     * @throws RisBusinessException
     *             the ris business exception
     */
    public List<Rrdf004mType> getRrdf004m_3(String personName, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * Gets the rrdf004m rrdf001m rrdf008m.
     * 
     * @param personId
     *            the person id
     * @param siteId
     *            the site id
     * @param executant
     *            the executant
     * @return the rrdf004m rrdf001m rrdf008m
     * @throws RisBusinessException
     *             the ris business exception
     */
    public Rrdf004mRrdf001mRrdf008mDTO getRrdf004mRrdf001mRrdf008m(String personId, String siteId,
            ExecutantType executant) throws RisBusinessException;

    /**
     * 取得個人基本資料檔.
     * 
     * @param personId
     *            個人統號
     * @param executant
     *            the executant
     * @return the rrdf008m
     * @throws RisBusinessException
     *             the ris business exception
     */
    public List<Rrdf008mType> getRrdf008m(String personId, ExecutantType executant) throws RisBusinessException;

    /**
     * Gets the rrdf008m.
     * 
     * @param personId
     *            the person id
     * @param siteId
     *            the site id
     * @param executant
     *            the executant
     * @return the ds rrdf008m
     * @throws RisBusinessException
     *             the ris business exception
     */
    public List<Rrdf008mType> getRrdf008m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得補登全戶基本資料.
     * 
     * @param housseholdHeadId
     *            戶長國民身分證統一編號
     * @param householdId
     *            the household id
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return the tldf001m
     * @throws RisBusinessException
     *             the ris business exception
     */
    public List<Tldf001mType> getTldf001m(String housseholdHeadId, String householdId, String siteId,
            ExecutantType executant) throws RisBusinessException;

    /**
     * 取得補登個人基本資料.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得補登個人基本資料失敗
     */
    public List<Tldf004mType> getTldf004m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得個人記事資料.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得個人記事資料失敗
     */
    public List<Tldf005mType> getTldf005m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得暫存-個人遷徙紀錄.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得暫存-個人遷徙紀錄失敗
     */
    public List<Tldf006mType> getTldf006m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得暫存-姓名更改紀錄.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得暫存-姓名更改紀錄失敗
     */
    public List<Tldf007mType> getTldf007m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得暫存-特殊人口資料.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得暫存-特殊人口資料失敗
     */
    public List<Tldf008mType> getTldf008m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得暫存-個人記事.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得暫存-個人記事失敗
     */
    public List<Tldf010mType> getTldf010m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;;

    /**
     * 取得暫存-所內記事.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得暫存-個人記事失敗
     */
    public List<Tldf030mType> getTldf030m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得補登之他所行政協助所內記事資料.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得所內記事資料失敗
     */
    public List<Tldf030tType> getTldf030t(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得暫存-姓名羅馬拼音紀錄.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得暫存-姓名羅馬拼音紀錄失敗
     */
    public List<Tldf047mType> getTldf047m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 暫存-登記婚前結(離)婚證明書資料.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得暫存-登記婚前結(離)婚證明書資料失敗
     */
    public List<Tldf087tType> getTldf087t(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 暫存-結(離)婚證明書資料.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得暫存-結(離)婚證明書資料失敗
     */
    public List<Tldf088tType> getTldf088t(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 暫存-英文結(離)婚證明書資料.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得暫存-英文結(離)婚證明書資料失敗
     */
    public List<Tldf089tType> getTldf089t(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得暫存-個人記事.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得暫存-個人記事失敗
     */
    public List<Tldfm01mType> getTldfm01m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得暫存-婚姻紀錄.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得暫存-婚姻紀錄失敗
     */
    public List<Tldfm02mType> getTldfm02m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得暫存-統號更改紀錄.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得暫存-統號更改紀錄失敗
     */
    public List<Tldfm03mType> getTldfm03m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得暫存-收養紀錄.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得暫存-收養紀錄失敗
     */
    public List<Tldfm04mType> getTldfm04m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得暫存-監護、輔助、未成年子女權利義務行使負擔資料.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得暫存-監護、輔助、未成年子女權利義務行使負擔資料失敗
     */
    public List<Tldfm05mType> getTldfm05m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得暫存-國民身分證掛失紀錄.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得暫存-國民身分證掛失紀錄
     */
    public List<Tldfm06mType> getTldfm06m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得暫存-重婚資料.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得暫存-重婚資料失敗
     */
    public List<Tldfm07mType> getTldfm07m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得暫存-監護、輔助、未成年子女權利義務行使負擔紀錄.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得暫存-監護、輔助、未成年子女權利義務行使負擔紀錄失敗
     */
    public List<Tldfm08mType> getTldfm08m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得暫存-出生日期更改紀錄.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得暫存-出生日期更改紀錄失敗
     */
    public List<Tldfm09mType> getTldfm09m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得暫存-個人申請書紀錄.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得暫存-個人申請書紀錄失敗
     */
    public List<Tldfm10mType> getTldfm10m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得個人申請書紀錄(MT).
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param applyCode
     *            申請書代碼
     * @param applyType
     *            交待R或T
     * @param executant
     *            使用者資訊
     * @return 個人申請書紀錄
     * @throws RisBusinessException
     *             the ris business exception
     */
    public List<Tldfm10mType> getTldfm10m(final String personId, final String siteId, final String applyCode,
            final String applyType, final ExecutantType executant) throws RisBusinessException;

    /**
     * 暫存-個人姓氏資料紀錄.
     * 
     * @param personId
     *            國民身分證統一編號
     * @param siteId
     *            作業點代碼
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得暫存-個人姓氏資料紀錄失敗
     */
    public List<Tldfm11mType> getTldfm11m(String personId, String siteId, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 判斷當事人是否存在暫存簿頁.
     * 
     * @param personId
     *            當事人國民身分證統一編號
     * @param houseHoldId
     *            戶號
     * @param adminOfficeCode
     *            戶所代碼
     * @param executant
     *            使用者資訊
     * @return boolean
     * @throws RisBusinessException
     *             判斷當事人是否存在暫存簿頁失敗
     */
    public boolean isExistTemp(String personId, String houseHoldId, String adminOfficeCode, ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得遠端獲取的資料放入現在主機的file中.
     * 
     * @param personId
     *            the person id
     * @param siteId
     *            the site id
     * @param executant
     *            the executant
     */
    public void prepareDataFromFile(String personId, String siteId, ExecutantType executant);

    /**
     * 取得遠端獲取的資料(包含全戶基本資料、個人基本資料、戶下成員)放入現在主機的file中.
     * 
     * @param personId
     *            the person id
     * @param siteId
     *            the site id
     * @param executant
     *            the executant
     * @return 是否為大戶
     */
    public boolean prepareFileDataAll(String personId, String siteId, ExecutantType executant);

    /**
     * 取得遠端獲取的資料(包含全戶基本資料、個人基本資料、戶長個人基本資料)放入現在主機的file中.
     * 
     * @param personId
     *            the person id
     * @param siteId
     *            the site id
     * @param executant
     *            the executant
     */
    public void prepareFileDataLight(String personId, String siteId, ExecutantType executant);

    /**
     * 取得遠端獲取的資料(包含全戶基本資料、個人基本資料、戶下成員)放入現在主機的file中.
     * 
     * @param dto
     *            the dto
     * @param executant
     *            the executant
     * @return RlGetFileReturnDTO
     */
    public RlGetFileReturnDTO prepareFileFromRemote(RlGetFileWsDTO dto, ExecutantType executant);
}
