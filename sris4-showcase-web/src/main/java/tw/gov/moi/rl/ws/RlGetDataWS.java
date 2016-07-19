/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.ws;

import java.util.List;

import javax.jws.HandlerChain;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.dbo.entity.SelectEntity;
import tw.gov.moi.domain.Rcdf001mType;
import tw.gov.moi.domain.Rlde211wType;
import tw.gov.moi.domain.Rlde212wType;
import tw.gov.moi.domain.Rldf001hType;
import tw.gov.moi.domain.Rldf001mType;
import tw.gov.moi.domain.Rldf002dType;
import tw.gov.moi.domain.Rldf002hType;
import tw.gov.moi.domain.Rldf002mType;
import tw.gov.moi.domain.Rldf003dType;
import tw.gov.moi.domain.Rldf004hType;
import tw.gov.moi.domain.Rldf004mType;
import tw.gov.moi.domain.Rldf005hType;
import tw.gov.moi.domain.Rldf005mType;
import tw.gov.moi.domain.Rldf006hType;
import tw.gov.moi.domain.Rldf006mType;
import tw.gov.moi.domain.Rldf006sType;
import tw.gov.moi.domain.Rldf007hType;
import tw.gov.moi.domain.Rldf007mType;
import tw.gov.moi.domain.Rldf007sType;
import tw.gov.moi.domain.Rldf008aType;
import tw.gov.moi.domain.Rldf008hType;
import tw.gov.moi.domain.Rldf008mType;
import tw.gov.moi.domain.Rldf010hType;
import tw.gov.moi.domain.Rldf010mType;
import tw.gov.moi.domain.Rldf011mType;
import tw.gov.moi.domain.Rldf012dType;
import tw.gov.moi.domain.Rldf017dType;
import tw.gov.moi.domain.Rldf018dType;
import tw.gov.moi.domain.Rldf020mType;
import tw.gov.moi.domain.Rldf020sType;
import tw.gov.moi.domain.Rldf021mType;
import tw.gov.moi.domain.Rldf021oType;
import tw.gov.moi.domain.Rldf022dType;
import tw.gov.moi.domain.Rldf022mType;
import tw.gov.moi.domain.Rldf022oType;
import tw.gov.moi.domain.Rldf024mType;
import tw.gov.moi.domain.Rldf025mType;
import tw.gov.moi.domain.Rldf028dType;
import tw.gov.moi.domain.Rldf030mType;
import tw.gov.moi.domain.Rldf030tType;
import tw.gov.moi.domain.Rldf039mType;
import tw.gov.moi.domain.Rldf040mType;
import tw.gov.moi.domain.Rldf045mType;
import tw.gov.moi.domain.Rldf047hType;
import tw.gov.moi.domain.Rldf047mType;
import tw.gov.moi.domain.Rldf049mType;
import tw.gov.moi.domain.Rldf051mType;
import tw.gov.moi.domain.Rldf053mType;
import tw.gov.moi.domain.Rldf058mType;
import tw.gov.moi.domain.Rldf062mType;
import tw.gov.moi.domain.Rldf063mType;
import tw.gov.moi.domain.Rldf087tType;
import tw.gov.moi.domain.Rldf087thType;
import tw.gov.moi.domain.Rldf088tType;
import tw.gov.moi.domain.Rldf088thType;
import tw.gov.moi.domain.Rldf089tType;
import tw.gov.moi.domain.Rldf089thType;
import tw.gov.moi.domain.Rldf100mType;
import tw.gov.moi.domain.Rldfm01hType;
import tw.gov.moi.domain.Rldfm01mType;
import tw.gov.moi.domain.Rldfm02hType;
import tw.gov.moi.domain.Rldfm02mType;
import tw.gov.moi.domain.Rldfm03hType;
import tw.gov.moi.domain.Rldfm03mType;
import tw.gov.moi.domain.Rldfm04hType;
import tw.gov.moi.domain.Rldfm04mType;
import tw.gov.moi.domain.Rldfm05hType;
import tw.gov.moi.domain.Rldfm05mType;
import tw.gov.moi.domain.Rldfm06hType;
import tw.gov.moi.domain.Rldfm06mType;
import tw.gov.moi.domain.Rldfm07hType;
import tw.gov.moi.domain.Rldfm07mType;
import tw.gov.moi.domain.Rldfm08hType;
import tw.gov.moi.domain.Rldfm08mType;
import tw.gov.moi.domain.Rldfm09hType;
import tw.gov.moi.domain.Rldfm09mType;
import tw.gov.moi.domain.Rldfm10hType;
import tw.gov.moi.domain.Rldfm10mType;
import tw.gov.moi.domain.Rldfm11hType;
import tw.gov.moi.domain.Rldfm11mType;
import tw.gov.moi.domain.Rldfm12mType;
import tw.gov.moi.domain.Rldfm13mType;
import tw.gov.moi.domain.Rldfy079dmType;
import tw.gov.moi.domain.Rldfy081dmType;
import tw.gov.moi.domain.Rrdf008mType;
import tw.gov.moi.domain.Xldf004hType;
import tw.gov.moi.domain.Xldf006mType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.domain.EntityDTO;
import tw.gov.moi.rl.domain.GetRldf030tDTO;
import tw.gov.moi.rl.domain.GetRldf045mDTO;
import tw.gov.moi.rl.domain.Rl0251zWsDTO;
import tw.gov.moi.rl.domain.Rl03100QueryRemovedDTO;
import tw.gov.moi.rl.domain.Rl03100RemovedResultDTO;
import tw.gov.moi.rl.domain.Rl03100ResultDTO;
import tw.gov.moi.rl.domain.RlCountDTO;
import tw.gov.moi.rl.domain.RlEntityUtilResultDTO;
import tw.gov.moi.rl.domain.RlGetAddressDTO;
import tw.gov.moi.rl.domain.RlGetApplyDTO;
import tw.gov.moi.rl.domain.RlGetBirthAndRemoveDTO;
import tw.gov.moi.rl.domain.RlGetEntityObjectDTO;
import tw.gov.moi.rl.domain.RlGetEntityUtityDTO;
import tw.gov.moi.rl.domain.RlGetFileReturnDTO;
import tw.gov.moi.rl.domain.RlGetFileWsDTO;
import tw.gov.moi.rl.domain.RlGetHouseholdEndueDTO;
import tw.gov.moi.rl.domain.RlGetHouseholdIdDTO;
import tw.gov.moi.rl.domain.RlGetHouseholeRemoveDTO;
import tw.gov.moi.rl.domain.RlGetHousehouldHeadIdDTO;
import tw.gov.moi.rl.domain.RlGetIdCardDataDTO;
import tw.gov.moi.rl.domain.RlGetMoveCountDTO;
import tw.gov.moi.rl.domain.RlGetPersonBirthDTO;
import tw.gov.moi.rl.domain.RlGetPersonDataDTO;
import tw.gov.moi.rl.domain.RlGetPersonIdBirthDTO;
import tw.gov.moi.rl.domain.RlGetPersonIdDTO;
import tw.gov.moi.rl.domain.RlGetPersonIdEndueDTO;
import tw.gov.moi.rl.domain.RlGetPersonModifyDTO;
import tw.gov.moi.rl.domain.RlGetPersonRemoveDTO;
import tw.gov.moi.rl.domain.RlGetPersonRemoveDataDTO;
import tw.gov.moi.rl.domain.RlGetRemoveYearDTO;
import tw.gov.moi.rl.domain.RlGetRldf047wDTO;
import tw.gov.moi.rl.domain.RlGetRldfxDataDTO;
import tw.gov.moi.rl.domain.RlGetRldfyDataDTO;
import tw.gov.moi.rl.domain.RlGetVictimIdDTO;
import tw.gov.moi.rl.domain.RlGetViolatorIdDTO;
import tw.gov.moi.rl.domain.RlGetvictimIdAndviolatorIdDTO;
import tw.gov.moi.rl.domain.RlHouseholdNumResultDTO;
import tw.gov.moi.rl.domain.RlMoveinDataResultDTO;
import tw.gov.moi.rl.domain.RlMoveinParamDTO;
import tw.gov.moi.rl.domain.RlPersonDataResultDTO;
import tw.gov.moi.rl.domain.RlRmve41ResultDTO;
import tw.gov.moi.rl.domain.Rlde211wDTO;
import tw.gov.moi.rl.domain.Rlde212wDTO;
import tw.gov.moi.rl.domain.Rldf004mAndRldf001mDTO;
import tw.gov.moi.rl.domain.Rldf004mAndRldf01mQueryDTO;
import tw.gov.moi.rl.domain.Rldf004mAndRldf049mDTO;
import tw.gov.moi.rl.domain.Rldf006sQueryDTO;
import tw.gov.moi.rl.domain.Rldf007sQueryDTO;
import tw.gov.moi.rl.domain.Rldf021oQueryDTO;
import tw.gov.moi.rl.domain.Rldf022oQueryDTO;
import tw.gov.moi.rl.domain.Rldf051mDTO;
import tw.gov.moi.rl.domain.Rldf058mDTO;
import tw.gov.moi.rl.domain.Rldfm10hQueryDTO;
import tw.gov.moi.rl.domain.Rldfm10mDTO;
import tw.gov.moi.rl.domain.RldfxDataResultDTO;
import tw.gov.moi.rl.domain.RrGetPersonIdDTO;
import tw.gov.moi.rl.domain.XLDFPersonBriefDataDTO;
import tw.gov.moi.rl.dto.rl03100.Rl03100QueryDTO;
import tw.gov.moi.rs.domain.RsO8WSDTO;
import tw.gov.moi.rs.domain.Rsdf001mDTO;
import tw.gov.moi.rs.dto.HouseLifeMemberIdDTO;
import tw.gov.moi.rs.dto.HouseLifeMemberNoDTO;
import tw.gov.moi.rs.dto.HouseMemberIdDTO;
import tw.gov.moi.rs.dto.RsWebServiceQueryDTO;

/**
 * 取得當事人資料Web服務介面.
 * 
 * @author kenfc
 */
@SOAPBinding(style = Style.DOCUMENT)
@HandlerChain(file = RlConstant.HandlerChain_PATH)
@WebService(name = RlConstant.Name_GetData, serviceName = RlConstant.ServiceName_GetData, targetNamespace = RlConstant.Namespace_RL)
public interface RlGetDataWS {

    /** The Constant ERR_MSG_getEntityUtity. */
    final static String ERR_MSG_getEntityUtity = "getEntityUtityHError: 「查詢資料」失敗";

    /** The Constant ERR_MSG_getHouseholdMember. */
    final static String ERR_MSG_getHouseholdMember = "getHouseholdMemberError: 「取得戶內現住人口個人基本資料」失敗";

    /** The Constant ERR_MSG_getHouseholdMemberBy1MKey. */
    final static String ERR_MSG_getHouseholdMemberBy1MKey = "getHouseholdMemberBy1MkeyError: 「取得戶內現住人口個人基本資料(by Rldf001M Ky)」失敗";

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

    /** The ER r_ ms g_ rlde211w. */
    String ERR_MSG_Rlde211w = "getRlde211wError: 「取得村里漢語、通用拼音資料」失敗";

    /** The ER r_ ms g_ rlde212w. */
    String ERR_MSG_Rlde212w = "getRlde212wError: 「取得街路門牌漢語、通用拼音資料」失敗";

    /** The Constant ERR_MSG_Rldf001h. */
    final static String ERR_MSG_Rldf001h = "getRldf001hError: 「取得除戶全戶基本資料」失敗";

    /** The Constant ERR_MSG_Rldf001m. */
    final static String ERR_MSG_Rldf001m = "getRldf001mError: 「取得全戶基本資料」失敗";

    /** The Constant ERR_MSG_Rldf002d. */
    final static String ERR_MSG_Rldf002d = "getRldf002dError: 「取得全面換證資料」失敗";

    /** The Constant ERR_MSG_Rldf002h. */
    final static String ERR_MSG_Rldf002h = "getRldf002hError: 「取得除戶全戶動態記事資料」失敗";

    /** The Constant ERR_MSG_Rldf003d. */
    final static String ERR_MSG_Rldf003d = "getRldf003dError: 「取得資料檔」失敗";

    /** The Constant ERR_MSG_Rldf002m. */
    final static String ERR_MSG_Rldf002m = "getRldf002mError: 「取得全戶動態記事資料」失敗";

    /** The Constant ERR_MSG_Rldf004h. */
    final static String ERR_MSG_Rldf004h = "getRldf004hError: 「取得除戶個人基本資料」失敗";

    /** The Constant ERR_MSG_Rldf004m. */
    final static String ERR_MSG_Rldf004m = "getRldf004mError: 「取得個人基本資料」失敗";

    /** The Constant ERR_MSG_Rldf005h. */
    final static String ERR_MSG_Rldf005h = "getRldf005hError: 「取得除戶個人記事資料」失敗";

    /** The Constant ERR_MSG_Rldf005m. */
    final static String ERR_MSG_Rldf005m = "getRldf005mError: 「取得個人記事資料」失敗";

    /** The Constant ERR_MSG_Rldf006m. */
    final static String ERR_MSG_Rldf006m = "getRldf006mError: 「個人遷徙記錄資料」失敗";

    /** The Constant ERR_MSG_Rldf006h. */
    final static String ERR_MSG_Rldf006h = "getRldf006hError: 「取得除戶個人遷徙記錄資料」失敗";

    /** The Constant ERR_MSG_Rldf006s. */
    final static String ERR_MSG_Rldf006s = "getRldf006mError: 「取得戶號配賦紀錄檔」失敗";

    /** The Constant ERR_MSG_Rldf007m. */
    final static String ERR_MSG_Rldf007m = "getRldf007mError: 「取得姓名更改記錄資料」失敗";

    /** The Constant ERR_MSG_Rldf007h. */
    final static String ERR_MSG_Rldf007h = "getRldf007hError: 「取得除戶個人姓名更改記錄資料」失敗";

    /** The Constant ERR_MSG_Rldf007s. */
    final static String ERR_MSG_Rldf007s = "getRldf007mError: 「取得統號配賦紀錄檔」失敗";

    /** The Constant ERR_MSG_Rldf008m. */
    final static String ERR_MSG_Rldf008m = "getRldf008mError: 「取得特殊人口資料」失敗";

    /** The Constant ERR_MSG_Rldf008h. */
    final static String ERR_MSG_Rldf008h = "getRldf008hError: 「取得除戶特殊人口資料」失敗";

    /** The Constant ERR_MSG_Rldf010m. */
    final static String ERR_MSG_Rldf010m = "getRldf010mError: 「取得限制遷徙人口資料」失敗";

    /** The Constant ERR_MSG_Rldf010h. */
    final static String ERR_MSG_Rldf010h = "getRldf010hError: 「取得除戶限制遷徙人口資料」失敗";

    /** The Constant ERR_MSG_Rrdf008m. */
    final static String ERR_MSG_Rrdf008m = "getRrdf008mError: 「取得特殊人口資料」失敗";

    /** The Constant ERR_MSG_Rldf011m. */
    final static String ERR_MSG_Rldf011m = "getRldf011mError: 「取得遷出未接通報資料」失敗";

    /** The Constant ERR_MSG_Rldf012d. */
    final static String ERR_MSG_Rldf012d = "getRldf012dError: 「取得資料檔」失敗";

    /** The Constant ERR_MSG_Rldf017d. */
    final static String ERR_MSG_Rldf017d = "getRldf017dError: 「取得資料檔」失敗";

    /** The Constant ERR_MSG_Rldf018d. */
    final static String ERR_MSG_Rldf018d = "getRldf018dError: 「取得資料檔」失敗";

    /** The Constant ERR_MSG_Rldf020m. */
    final static String ERR_MSG_Rldf020m = "getRldf020mError: 「取得里鄰門牌資料」失敗";

    /** The Constant ERR_MSG_Rldf020s. */
    final static String ERR_MSG_Rldf020s = "getRldf020sError: 「取得逕遷至戶政事務所人數資料」失敗";

    /** The Constant ERR_MSG_Rldf021m. */
    final static String ERR_MSG_Rldf021m = "getRldf021mError: 「取得戶號配賦資料」失敗";

    /** The Constant ERR_MSG_Rldf021o. */
    final static String ERR_MSG_Rldf021o = "getRldf021oError: 「取得戶號安全存量控制檔」失敗";

    /** The Constant ERR_MSG_Rldf022m. */
    final static String ERR_MSG_Rldf022m = "getRldf022mError: 「取得國民身分證統一編號配賦資料」失敗";

    /** The Constant ERR_MSG_Rldf022o. */
    final static String ERR_MSG_Rldf022o = "getRldf022oError: 「取得統號安全存量控制檔」失敗";

    /** The Constant ERR_MSG_Rldf024m. */
    final static String ERR_MSG_Rldf024m = "getRldf024mError: 「取得暫存個人基本資料」失敗";

    /** The Constant ERR_MSG_Rldf025m. */
    final static String ERR_MSG_Rldf025m = "getRldf025mError: 「取得暫存個人記事」失敗";

    /** The Constant ERR_MSG_Rldf030m. */
    final static String ERR_MSG_Rldf030m = "getRldf030mError: 「取得遷出未接通報資料」失敗";

    /** The Constant ERR_MSG_Rldf039m. */
    final static String ERR_MSG_Rldf039m = "getRldf039mError: 「取得出境滿二年未入境通報紀錄」失敗";

    /** The Constant ERR_MSG_Rldf040m. */
    final static String ERR_MSG_Rldf040m = "getRldf040mError: 「取得出境滿二年再入境通報紀錄」失敗";

    /** The Constant ERR_MSG_Rldf045m. */
    final static String ERR_MSG_Rldf045m = "getRldf045mError: 「取得逕遷戶政事務所人口通報」失敗";

    /** The Constant ERR_MSG_Rldf047m. */
    final static String ERR_MSG_Rldf047m = "getRldf047mError: 「取得姓名羅馬拼音記錄資料」失敗";

    /** The Constant ERR_MSG_Rldf047h. */
    final static String ERR_MSG_Rldf047h = "getRldf047hError: 「取得除戶姓名羅馬拼音記錄資料」失敗";

    /** The Constant ERR_MSG_Rldf049m. */
    final static String ERR_MSG_Rldf049m = "getRldf049mError: 「取得保護家庭暴力資料」失敗";

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
    final static String ERR_MSG_Rldfm12m = "getRldfm12mError: 「取得國民身分證列印旗標資料」失敗";

    /** The Constant ERR_MSG_Rldfm13m. */
    final static String ERR_MSG_Rldfm13m = "getRldfm13mError: 「取得國民其他出生地資料檔」失敗";

    /** 錯誤訊息:取得監護登記個人記事欄位化失敗. */
    final static String ERR_MSG_Rldfy079dm = "getRldfy079dmError: 「取得監護登記個人記事欄位化」失敗";

    /** 錯誤訊息:取得輔助登記個人記事欄位化失敗. */
    final static String ERR_MSG_Rldfy081dm = "getRldfy081dmError: 「取得輔助登記個人記事欄位化」失敗";

    /** The Constant ERR_MSG_LastRldf004h. */
    final static String ERR_MSG_LastRldf004h = "getLastRldf004hError: 「取得最後一筆除戶個人基本資料」失敗";

    /** The Constant ERR_MSG_LastRldf006m. */
    final static String ERR_MSG_LastRldf006m = "getLastRldf006mError: 「取得最後一筆個人遷徙紀錄」失敗";

    /** The Constant ERR_MSG_LastRldf007m. */
    final static String ERR_MSG_LastRldf007m = "getLastRldf007mError: 「取得最後一筆姓名羅馬拼音記錄檔」失敗";

    /** The Constant ERR_MSG_LastRldf062m. */
    final static String ERR_MSG_LastRldf062m = "getLastRldf062hError: 「取得最後一筆國防部相驗屍體證明書通報資料」失敗";

    /** The Constant ERR_MSG_LastRldf063m. */
    final static String ERR_MSG_LastRldf063m = "getLastRldf063hError: 「取得最後一筆法務部相驗屍體證明書通報資料」失敗";

    /** The Constant ERR_MSG_LastRldf053m. */
    final static String ERR_MSG_LastRldf053m = "getLastRldf053hError: 「取得最後一筆衛生署死亡證明書資料」失敗";

    /** The Constant ERR_MSG_LastRldf100m. */
    final static String ERR_MSG_LastRldf100m = "getLastRldf100mError: 「取得最後一筆資料」失敗";

    /** The Constant ERR_MSG_Rldf087t. */
    final static String ERR_MSG_Rldf087t = "getRldf087tError: 「取得登記婚前結(離)婚證明書資料」失敗";

    /** The Constant ERR_MSG_Rldf088t. */
    final static String ERR_MSG_Rldf088t = "getRldf088tError: 「結(離)婚證明書資料」失敗";

    /** The Constant ERR_MSG_Rldf089t. */
    final static String ERR_MSG_Rldf089t = "getRldf089tError: 「英文結(離)婚證明書資料」失敗";

    /** The Constant ERR_MSG_Rldf030t. */
    final static String ERR_MSG_Rldf030t = "getRldf030tError: 「他所行政協助所內記事檔」失敗";

    /** The Constant ERR_MSG_Rldf030t_household. */
    final static String ERR_MSG_Rldf030t_household = "getRldf030thouseholdError: 「他所行政協助所內記事檔」失敗";

    /** The Constant ERR_MSG_getXldf004h. */
    final static String ERR_MSG_getXldf004h = "getXldf004hError: 「取得臨時除戶-個人基本資料檔」失敗";

    /** The Constant ERR_MSG_getXldf006m. */
    final static String ERR_MSG_getXldf006m = "getXldf006mError: 「取得臨時-個人遷徙紀錄檔」失敗";

    /** The Constant ERR_MSG_Rldfm01h. */
    final static String ERR_MSG_Rldfm01h = "getRldfm01hError: 「取得資料檔」失敗";

    /** The Constant ERR_MSG_Rldfm02h. */
    final static String ERR_MSG_Rldfm02h = "getRldfm02hError: 「取得資料檔」失敗";

    /** The Constant ERR_MSG_Rldfm03h. */
    final static String ERR_MSG_Rldfm03h = "getRldfm03hError: 「取得資料檔」失敗";

    /** The Constant ERR_MSG_Rldfm04h. */
    final static String ERR_MSG_Rldfm04h = "getRldfm04hError: 「取得資料檔」失敗";

    /** The Constant ERR_MSG_Rldfm05h. */
    final static String ERR_MSG_Rldfm05h = "getRldfm05hError: 「取得資料檔」失敗";

    /** The Constant ERR_MSG_Rldfm06h. */
    final static String ERR_MSG_Rldfm06h = "getRldfm06hError: 「取得資料檔」失敗";

    /** The Constant ERR_MSG_Rldfm07h. */
    final static String ERR_MSG_Rldfm07h = "getRldfm07hError: 「取得資料檔」失敗";

    /** The Constant ERR_MSG_Rldfm08h. */
    final static String ERR_MSG_Rldfm08h = "getRldfm08hError: 「取得資料檔」失敗";

    /** The Constant ERR_MSG_Rldfm09h. */
    final static String ERR_MSG_Rldfm09h = "getRldfm09hError: 「取得資料檔」失敗";

    /** The Constant ERR_MSG_Rldfm10h. */
    final static String ERR_MSG_Rldfm10h = "getRldfm10hError: 「取得資料檔」失敗";

    /** The Constant ERR_MSG_Rldfm11h. */
    final static String ERR_MSG_Rldfm11h = "getRldfm11hError: 「取得資料檔」失敗";

    /** The Constant ERR_MSG_Rldf051mByMother. */
    final static String ERR_MSG_Rldf051mByMother = "getRldf051mByMotherError: 「取得出生通報資料檔」失敗";

    /** The Constant ERR_MSG_Rldf051mBySpouse. */
    final static String ERR_MSG_Rldf051mBySpouse = "getRldf051mBySpouseError: 「取得出生通報資料檔」失敗";

    /** The Constant ERR_MSG_Rldfm05mByKey. */
    final static String ERR_MSG_Rldfm05mByKey = "getRldfm05m_1Error: 「取得監護輔助未成年子女權利義務行使負擔資料檔」失敗";

    /** The Constant ERR_MSG_Rldfm05hByKey. */
    final static String ERR_MSG_Rldfm05hByKey = "getRldfm05h_1Error: 「取得監護輔助未成年子女權利義務行使負擔資料檔」失敗";

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

    /** The Constant ERR_MSG_ORGIDRECORDS. */
    final static String ERR_MSG_ORGIDRECORDS = "getOrgIdRecordsError: 「取得指定之原統號的統號更改紀錄」失敗";

    /** The Constant ERR_MSG_Rldf002dByApply. */
    final static String ERR_MSG_Rldf002dByApply = "getRldf002dError: 「身分證請領資料」失敗";

    /** The Constant ERR_MSG_Rldf003dByApply. */
    final static String ERR_MSG_Rldf003dByApply = "getRldf003dError: 「身分證註銷記錄」失敗";

    /** The Constant ERR_MSG_Rldf012dByApply. */
    final static String ERR_MSG_Rldf012dByApply = "getRldf012dError: 「空白國民身分證及膠膜使用記錄檔」失敗";

    /** The Constant ERR_MSG_Rldf008aByApply. */
    final static String ERR_MSG_Rldf008aByApply = "getRldf008aError: 「全民換證記錄檔」失敗";

    /** The Constant ERR_MSG_FilePersonData. */
    final static String ERR_MSG_FilePersonData = "getFilePersonData: 「取得遠端個人資料檔案」失敗";

    /** The Constant ERR_MSG_FileHouseholdData. */
    final static String ERR_MSG_FileHouseholdData = "getFileHouseholdData: 「取得遠端全戶基本資料檔案」失敗";

    /** The Constant ERR_MSG_FileHouseholdMember. */
    final static String ERR_MSG_FileHouseholdMember = "getFileHouseholdMember: 「取得遠端戶下成員資料檔案」失敗";

    /** The Constant ERR_MSG_FileRemovePersonData. */
    final static String ERR_MSG_FileRemovePersonData = "FileRemovePersonData: 「取得遠端除戶個人資料檔案」失敗";

    /** The Constant ERR_MSG_FileRemoveHouseholdData. */
    final static String ERR_MSG_FileRemoveHouseholdData = "getFileRemoveHouseholdData: 「取得遠端除戶全戶基本資料檔案」失敗";

    /** The Constant ERR_MSG_GetHouseholdMemberCnt. */
    final static String ERR_MSG_GetHouseholdMemberCnt = "getHouseholdMemberCnt: 「取得戶下成員人數」失敗";

    /** The Constant ERR_MSG_GetHouseholdResidentMemberCnt. */
    final static String ERR_MSG_GetHouseholdResidentMemberCnt = "getHouseholdResidentMemberCnt: 「取得戶下成員現住人口數」失敗";

    /** The Constant ERR_MSG_GetMoveinOldData. */
    final static String ERR_MSG_GetMoveinOldData = "getMoveinOldData: 「取得遷入地之除口與除戶個人基本資料」失敗";

    /** The Constant ERR_MSG_GetRldfyData. */
    final static String ERR_MSG_GetRldfyData = "getRldfyData: 「取得個人記事欄位化資料」失敗";

    /**
     * 取得申請書清單.
     * 
     * @param rlGetAddressDTO
     *            the rl get address dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得申請書清單失敗
     */
    // @WebResult(name = "Application", targetNamespace =
    // RlConstant.Namespace_RIS)
    // public List<Object> getApplication(
    // @WebParam(name = "applyType", targetNamespace = RlConstant.Namespace_RIS)
    // String applyType,
    // @WebParam(name = "applyKind", targetNamespace = RlConstant.Namespace_RIS)
    // String applyKind,
    // @WebParam(name = "transactionId", targetNamespace =
    // RlConstant.Namespace_RIS) String transactionId,
    // @WebParam(name = "sequenceId", targetNamespace =
    // RlConstant.Namespace_RIS) String sequenceId,
    // @WebParam(name = "siteId", targetNamespace = RlConstant.Namespace_RIS)
    // String siteId,
    // @WebParam(name = "personId", targetNamespace = RlConstant.Namespace_RIS)
    // String personId,
    // @WebParam(name = "ExecutantType", targetNamespace =
    // RlConstant.Namespace_AE)
    // ExecutantType executant)
    // throws RisBusinessException;

    /**
     * 查詢 RL 資料.
     * 
     * @param rsWebServiceQueryList
     *            the rs web service query list
     * @param executant
     *            the executant
     * @return List<RsWebServiceQueryDTO>
     * @throws RisBusinessException
     *             the ris business exception
     */
    @WebResult(name = "RsWebServiceQueryDTO", targetNamespace = RlConstant.Namespace_RS_DOMAIN)
    public List<RsWebServiceQueryDTO> doQueryRlData(
            @WebParam(name = "RsWebServiceQueryDTO", targetNamespace = RlConstant.Namespace_RS_DOMAIN) final List<RsWebServiceQueryDTO> rsWebServiceQueryList,
            @WebParam(name = "executant", targetNamespace = RlConstant.Namespace_AE) final ExecutantType executant)
            throws RisBusinessException;

    /**
     * 更新 RLDF018D 資料
     * 
     * @param rldf028dList
     * @param executant
     * @throws RisBusinessException
     */
    public void doUpdateRldf018d(
            @WebParam(name = "Rldf028dType", targetNamespace = "http://tw.gov.moi/domain") List<Rldf028dType> rldf028dList,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得遠端全戶戶下成員資料的File 並上傳至本主機(包含:戶下成員人口基本資料、全戶基本資料).
     * 
     * @param rlGetPersonIdDTO
     *            the rl get person id dto
     * @param executant
     *            the executant
     * @return the data file all
     * @throws RisBusinessException
     *             the ris business exception
     */
    @WebResult(name = "RlGetFileReturnDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN)
    public RlGetFileReturnDTO getDataFileAll(
            @WebParam(name = "RlGetPersonIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonIdDTO rlGetPersonIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得遠端個人資料的File 並上傳至本主機(包含:個人基本資料、全戶基本資料、戶長個人基本資料).
     * 
     * @param rlGetPersonIdDTO
     *            the rl get person id dto
     * @param executant
     *            the executant
     * @return the data file light
     * @throws RisBusinessException
     *             the ris business exception
     */

    public void getDataFileLight(
            @WebParam(name = "RlGetPersonIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonIdDTO rlGetPersonIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * Gets the entity object.
     * 
     * @param pRlGetEntityObjectDTO
     *            the rl get entity object dto
     * @param executant
     *            the executant
     * @return the entity object
     */
    @WebResult(name = "EntityObject", targetNamespace = RlConstant.Namespace_RL_DOMAIN)
    EntityDTO getEntityObject(
            @WebParam(name = "RlGetEntityObjectDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetEntityObjectDTO pRlGetEntityObjectDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant);

    /**
     * 取得查詢資料.
     * 
     * @param rlGetEntityUtityDTO
     *            the rl get entity utity dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得查詢資料失敗
     */
    @WebResult(name = "ByteArray", targetNamespace = RlConstant.Namespace_RIS)
    public RlEntityUtilResultDTO getEntityUtity(
            @WebParam(name = "RlGetEntityUtityDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetEntityUtityDTO rlGetEntityUtityDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得查詢資料.
     * 
     * @param rlGetEntityUtityDTO
     *            the rl get entity utity dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得查詢資料失敗
     */
    @WebResult(name = "ByteArray", targetNamespace = RlConstant.Namespace_RL_DOMAIN)
    public EntityDTO getEntityUtitys(
            @WebParam(name = "RlGetEntityUtityDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetEntityUtityDTO rlGetEntityUtityDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) final ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得遠端的資料的File 並上傳至本主機.
     * 
     * @param rlGetFileWsDTO
     *            the rl get file ws dto
     * @param executant
     *            the executant
     * @return the file data from remote site
     * @throws RisBusinessException
     *             the ris business exception
     */
    @WebResult(name = "RlGetFileReturnDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN)
    public RlGetFileReturnDTO getFileDataFromRemoteSite(
            @WebParam(name = "RlGetFileWsDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetFileWsDTO rlGetFileWsDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得遠端全戶資料的File 並上傳至本主機.
     * 
     * @param rlGetHouseholdIdDTO
     *            the rl get household id dto
     * @param executant
     *            the executant
     * @return the file household data
     * @throws RisBusinessException
     *             the ris business exception
     */

    public void getFileHouseholdData(
            @WebParam(name = "RlGetHouseholdIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetHouseholdIdDTO rlGetHouseholdIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得遠端個人資料的File 並上傳至本主機.
     * 
     * @param rlGetPersonIdDTO
     *            the rl get person id dto
     * @param executant
     *            the executant
     * @return the file person data
     * @throws RisBusinessException
     *             the ris business exception
     */

    public void getFilePersonData(
            @WebParam(name = "RlGetPersonIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonIdDTO rlGetPersonIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * getHouseholdMember 取得戶內現住人口個人基本資料.
     * 
     * @param rlGetPersonIdDTO
     *            the rl get person id dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得戶內現住人口個人基本資料失敗
     */
    @WebResult(name = "Rldf004m", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf004mType> getHouseholdMember(
            @WebParam(name = "RlGetPersonIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonIdDTO rlGetPersonIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * getHouseholdMember 取得戶內現住人口個人基本資料.
     * 
     * @param rlGetPersonIdDTO
     *            the rl get person id dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得戶內現住人口個人基本資料失敗
     */
    @WebResult(name = "Rldf004m", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf004mType> getHouseholdMemberBy1Mkey(
            @WebParam(name = "RlGetPersonIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonIdDTO rlGetPersonIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得戶下成員數.
     * 
     * @param rlGetHouseholdIdDTO
     *            the rl get household id dto
     * @param executant
     *            使用者資訊
     * @return List <Integer>
     * @throws RisBusinessException
     *             取得戶下成員數失敗
     */
    @WebResult(name = "integer", targetNamespace = RlConstant.Namespace_RIS)
    public List<Integer> getHouseholdMemberCnt(
            @WebParam(name = "RlGetHouseholdIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetHouseholdIdDTO rlGetHouseholdIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * getHouseholdMember 取得戶內現住人口統號清單.
     * 
     * @param houseLifeMemberIdDTO
     *            the house life member id dto
     * @param executant
     *            使用者資訊
     * @return HouseLifeMemberIdDTO
     * @throws RisBusinessException
     *             取得戶內現住人口統號清單失敗
     */
    @WebResult(name = "HouseLifeMemberIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN)
    public HouseLifeMemberIdDTO getHouseLifeMemberId(
            @WebParam(name = "HouseLifeMemberIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) HouseLifeMemberIdDTO houseLifeMemberIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * getHouseholdMember 取得戶內現住人口人數.
     * 
     * @param houseLifeMemberNoDTO
     *            the house life member no dto
     * @param executant
     *            使用者資訊
     * @return HouseLifeMemberIdDTO
     * @throws RisBusinessException
     *             取得戶內現住人口人數失敗
     */
    @WebResult(name = "HouseLifeMemberNoDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN)
    public HouseLifeMemberNoDTO getHouseLifeMemberNo(
            @WebParam(name = "HouseLifeMemberNoDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) HouseLifeMemberNoDTO houseLifeMemberNoDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * getHouseholdMember 取得戶內人口統號清單.
     * 
     * @param houseMemberIdDTO
     *            the house member id dto
     * @param executant
     *            使用者資訊
     * @return HouseLifeMemberIdDTO
     * @throws RisBusinessException
     *             取得戶內人口統號清單失敗
     */
    @WebResult(name = "HouseMemberIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN)
    public HouseMemberIdDTO getHouseMemberId(
            @WebParam(name = "HouseMemberIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) HouseMemberIdDTO houseMemberIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得最後一筆除戶個人基本資料.
     * 
     * @param rlGetPersonIdDTO
     *            the rl get person id dto
     * @param executant
     *            使用者資訊
     * @return Rldf004hType
     * @throws RisBusinessException
     *             取得最後一筆除戶個人基本資料失敗
     */
    @WebResult(name = "lastRldf004h", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf004hType> getLastRldf004h(
            @WebParam(name = "RlGetPersonIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonIdDTO rlGetPersonIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得最後一筆個人遷徙紀錄.
     * 
     * @param rlGetPersonIdDTO
     *            the rl get person id dto
     * @param executant
     *            使用者資訊
     * @return Rldf004hType
     * @throws RisBusinessException
     *             取得最後一筆個人遷徙紀錄失敗
     */
    @WebResult(name = "lastRldf006m", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf006mType> getLastRldf006m(
            @WebParam(name = "RlGetPersonIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonIdDTO rlGetPersonIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得最後一筆姓名更改紀錄.
     * 
     * @param rlGetPersonModifyDTO
     *            the rl get person modify dto
     * @param executant
     *            使用者資訊
     * @return Rldf004hType
     * @throws RisBusinessException
     *             取得最後一筆姓名更改紀錄失敗
     */
    @WebResult(name = "lastRldf007h", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf007mType> getLastRldf007m(
            @WebParam(name = "RlGetPersonModifyDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonModifyDTO rlGetPersonModifyDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得逕遷戶所人口通報資料.
     * 
     * @param rlGetPersonIdDTO
     *            the rl get person id dto
     * @param executant
     *            the executant
     * @return the last rldf062m
     * @throws RisBusinessException
     *             the ris business exception
     */
    @WebResult(name = "lastRldf053m", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf053mType> getLastRldf053m(
            @WebParam(name = "RlGetPersonIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonIdDTO rlGetPersonIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得最後一筆國防部相驗屍體證明書通報資料.
     * 
     * @param rlGetPersonIdDTO
     *            the rl get person id dto
     * @param executant
     *            the executant
     * @return the last rldf062m
     * @throws RisBusinessException
     *             the ris business exception
     */

    @WebResult(name = "lastRldf062m", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf062mType> getLastRldf062m(
            @WebParam(name = "RlGetPersonIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonIdDTO rlGetPersonIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得最後一筆法務部相驗屍體證明書通報資料.
     * 
     * @param rlGetPersonIdDTO
     *            the rl get person id dto
     * @param executant
     *            the executant
     * @return the last rldf062m
     * @throws RisBusinessException
     *             the ris business exception
     */
    @WebResult(name = "lastRldf063m", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf063mType> getLastRldf063m(
            @WebParam(name = "RlGetPersonIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonIdDTO rlGetPersonIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得資料檔.
     * 
     * @param rlGetPersonIdDTO
     *            the rl get person id dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得資料檔失敗
     */
    @WebResult(name = "lastRldf100m", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf100mType> getLastRldf100m(
            @WebParam(name = "RlGetPersonIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) final RlGetPersonIdDTO rlGetPersonIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) final ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得最後一筆除戶個人基本資料.
     * 
     * @param rlGetPersonIdDTO
     *            the rl get person id dto
     * @param executant
     *            使用者資訊
     * @return Xldf004hType
     * @throws RisBusinessException
     *             取得最後一筆除戶個人基本資料失敗
     */
    @WebResult(name = "lastXldf004h", targetNamespace = RlConstant.Namespace_RIS)
    public List<Xldf004hType> getLastXldf004h(
            @WebParam(name = "RlGetPersonIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonIdDTO rlGetPersonIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得最後一筆個人遷徙紀錄.
     * 
     * @param rlGetPersonIdDTO
     *            the rl get person id dto
     * @param executant
     *            使用者資訊
     * @return Rldf004hType
     * @throws RisBusinessException
     *             取得最後一筆個人遷徙紀錄失敗
     */
    @WebResult(name = "lastXldf006m", targetNamespace = RlConstant.Namespace_RIS)
    public List<Xldf006mType> getLastXldf006m(
            @WebParam(name = "RlGetPersonIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonIdDTO rlGetPersonIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得遷入地除口或除戶4M 4H 1M.
     * 
     * @param dto
     *            the dto
     * @param executant
     *            使用者資訊
     * @return IntegerDTO
     * @throws RisBusinessException
     *             取得戶下成員數失敗
     */
    @WebResult(name = "RlMoveinDataResultDTO", targetNamespace = RlConstant.Namespace_RIS)
    public RlMoveinDataResultDTO getMoveinOldData(
            @WebParam(name = "RlMoveinParamDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlMoveinParamDTO dto,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * getRldf005m 取得遷徙時會帶者走的相關資料.
     * 
     * @param rlGetPersonIdDTO
     *            the rl get person id dto
     * @param executant
     *            使用者資訊
     * @return RlPersonDataResultDTO RlPersonDataResultDTO
     * @throws RisBusinessException
     *             取得個人記事資料失敗
     */
    @WebResult(name = "RlPersonDataResultDTO", targetNamespace = RlConstant.Namespace_RIS)
    RlPersonDataResultDTO getMovePersonData(
            @WebParam(name = "RlGetPersonIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonIdDTO rlGetPersonIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得統號配賦紀錄檔.
     * 
     * @param rlGetPersonIdDTO
     *            the rl get person id dto
     * @param executant
     *            the executant
     * @return the org id records
     * @throws RisBusinessException
     *             the ris business exception
     */
    @WebResult(name = "Rldfm03mType", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldfm03mType> getOrgIdRecords(
            @WebParam(name = "RlGetPersonIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonIdDTO rlGetPersonIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得現戶戶籍資料.
     * 
     * @param rlGetPersonIdDTO
     *            the rl get person id dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得現戶戶籍資料失敗
     */
    @WebResult(name = "Rldf004mEntity", targetNamespace = RlConstant.Namespace_RIS)
    public List<SelectEntity<Rldf004mType>> getPersonalData(
            @WebParam(name = "RlGetPersonIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonIdDTO rlGetPersonIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * Gets the rcdf001m_4.
     * 
     * @param rsdf001mDTO
     *            the rsdf001m dto
     * @param pExecutantType
     *            the executant type
     * @return the rcdf001m_4
     */
    @WebResult(name = "getRcdf001m_4", targetNamespace = RlConstant.Namespace_RIS)
    List<Rcdf001mType> getRcdf001m_4(
            @WebParam(name = "Rsdf001mDTO", targetNamespace = RlConstant.Namespace_RS_DOMAIN) final Rsdf001mDTO rsdf001mDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) final ExecutantType pExecutantType);

    /**
     * getRemoveHouseholdMember 取得除戶戶內人口個人基本資料.
     * 
     * @param rlGetPersonRemoveDataDTO
     *            the rl get person remove data dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得除戶戶內人口個人基本資料失敗
     */
    @WebResult(name = "Rldf004h", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf004hType> getRemoveHouseholdMember(
            @WebParam(name = "RlGetPersonRemoveDataDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonRemoveDataDTO rlGetPersonRemoveDataDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得資料檔.
     * 
     * @param rlGetPersonIdDTO
     *            the rl get person id dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得資料檔失敗
     */
    @WebResult(name = "getRldf012d", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf012dType> getReRldf012d(
            @WebParam(name = "RlGetPersonIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) final RlGetPersonIdDTO rlGetPersonIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) final ExecutantType executant)
            throws RisBusinessException;

    /**
     * Gets the rl03100 data.
     * 
     * @param rl03100QueryDTO
     *            the rl03100 query dto
     * @param executant
     *            the executant
     * @return the rl03100 data
     */
    @WebResult(name = "Rl03100ResultDTO", targetNamespace = RlConstant.Namespace_RIS)
    Rl03100ResultDTO getRl03100Data(
            @WebParam(name = "Rl03100QueryDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) Rl03100QueryDTO rl03100QueryDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant);

    /**
     * Gets the rl03100 removed data.
     * 
     * @param rl03100QueryRemovedDTO
     *            the rl03100 query removed dto
     * @param executant
     *            the executant
     * @return the rl03100 removed data
     */
    @WebResult(name = "Rl03100RemovedResultDTO", targetNamespace = RlConstant.Namespace_RIS)
    Rl03100RemovedResultDTO getRl03100RemovedData(
            @WebParam(name = "Rl03100QueryRemovedDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) Rl03100QueryRemovedDTO rl03100QueryRemovedDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant);

    /**
     * 取得「村里」漢語、通用拼音資料.
     * 
     * @param rlde211wDTO
     *            the rlde211w dto
     * @param executantType
     *            the executant type
     * @return the rlde211w
     */
    @WebResult(name = "getRlde211w", targetNamespace = RlConstant.Namespace_RIS)
    List<Rlde211wType> getRlde211w(
            @WebParam(name = "Rlde211wDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) final Rlde211wDTO rlde211wDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_RL_DOMAIN) final ExecutantType executantType);

    /**
     * 取得「街路門牌」漢語、通用拼音資料.
     * 
     * @param rlde212wDTO
     *            the rlde212w dto
     * @param executantType
     *            the executant type
     * @return the rlde212w
     */
    @WebResult(name = "getRlde212w", targetNamespace = RlConstant.Namespace_RIS)
    List<Rlde212wType> getRlde212w(
            @WebParam(name = "Rlde212wDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) final Rlde212wDTO rlde212wDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_RL_DOMAIN) final ExecutantType executantType);

    /**
     * 取得除戶全戶基本資料檔.
     * 
     * @param rlGetHouseholeRemoveDTO
     *            the rl get househole remove dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得除戶個人基本資料檔失敗
     */
    @WebResult(name = "Rldf001h", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf001hType> getRldf001h(
            @WebParam(name = "RlGetHouseholeRemoveDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetHouseholeRemoveDTO rlGetHouseholeRemoveDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得除戶全戶基本資料檔.
     * 
     * @param rlGetRemoveYearDTO
     *            the rl get remove year dto
     * @param executant
     *            the executant
     * @return the rldf001h_1
     */
    @WebResult(name = "Rldf001h_1", targetNamespace = RlConstant.Namespace_RIS)
    List<Rldf001hType> getRldf001h_1(
            @WebParam(name = "RlGetRemoveYearDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) final RlGetRemoveYearDTO rlGetRemoveYearDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) final ExecutantType executant);

    /**
     * getRldf001m 取得全戶基本資料.
     * 
     * @param rlGetHouseholdIdDTO
     *            the rl get household id dto
     * @param executant
     *            the executant
     * @return List
     * @throws RisBusinessException
     *             取得全戶基本資料失敗
     */
    @WebResult(name = "Rldf001m", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf001mType> getRldf001m(
            @WebParam(name = "RlGetHouseholdIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetHouseholdIdDTO rlGetHouseholdIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * getRldf001m 取得全戶基本資料.
     * 
     * @param rlGetHousehouldHeadIdDTO
     *            the rl get househould head id dto
     * @param executant
     *            the executant
     * @return List
     * @throws RisBusinessException
     *             取得全戶基本資料失敗
     */
    @WebResult(name = "Rldf001m_2", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf001mType> getRldf001m_2(
            @WebParam(name = "RlGetHousehouldHeadIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetHousehouldHeadIdDTO rlGetHousehouldHeadIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * getRldf002d 取得全面換證資料.
     * 
     * @param rlGetPersonIdDTO
     *            the rl get person id dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得全面換證資料失敗
     */
    @WebResult(name = "Rldf002d", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf002dType> getRldf002d(
            @WebParam(name = "RlGetPersonIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonIdDTO rlGetPersonIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得身分證請領記錄檔.
     * 
     * @param rlGetIdCardDataDTO
     *            the rl get id card data dto
     * @param executant
     *            the executant
     * @return the rldf002d by apply
     * @throws RisBusinessException
     *             the ris business exception
     */
    @WebResult(name = "Rldf002dType", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf002dType> getRldf002dByApply(
            @WebParam(name = "RlGetIdCardDataDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetIdCardDataDTO rlGetIdCardDataDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得除戶全戶動態記事資料.
     * 
     * @param rlGetHouseholeRemoveDTO
     *            the rl get househole remove dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得除戶全戶動態記事資料失敗
     */
    @WebResult(name = "Rldf002h", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf002hType> getRldf002h(
            @WebParam(name = "RlGetHouseholeRemoveDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetHouseholeRemoveDTO rlGetHouseholeRemoveDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * getRldf002m 取得全戶動態記事資料.
     * 
     * @param rlGetHouseholdIdDTO
     *            the rl get household id dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得全戶動態記事資料
     */
    @WebResult(name = "Rldf002m", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf002mType> getRldf002m(
            @WebParam(name = "RlGetHouseholdIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetHouseholdIdDTO rlGetHouseholdIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * getRldf002m 取得全戶動態記事資料.
     * 
     * @param rlGetHousehouldHeadIdDTO
     *            the rl get househould head id dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得全戶動態記事資料
     */
    @WebResult(name = "Rldf002m_2", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf002mType> getRldf002m_2(
            @WebParam(name = "RlGetHousehouldHeadIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetHousehouldHeadIdDTO rlGetHousehouldHeadIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得資料檔.
     * 
     * @param rlGetPersonIdDTO
     *            the rl get person id dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得資料檔失敗
     */
    @WebResult(name = "getRldf003d", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf003dType> getRldf003d(
            @WebParam(name = "RlGetPersonIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) final RlGetPersonIdDTO rlGetPersonIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) final ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得身分證註銷記錄檔.
     * 
     * @param rlGetIdCardDataDTO
     *            the rl get id card data dto
     * @param executant
     *            the executant
     * @return the rldf003d by apply
     * @throws RisBusinessException
     *             the ris business exception
     */
    @WebResult(name = "Rldf003dType", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf003dType> getRldf003dByApply(
            @WebParam(name = "RlGetIdCardDataDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetIdCardDataDTO rlGetIdCardDataDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得除戶個人基本資料檔.
     * 
     * @param rlGetPersonRemoveDataDTO
     *            the rl get person remove data dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得除戶個人基本資料檔失敗
     */
    @WebResult(name = "Rldf004h", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf004hType> getRldf004h(
            @WebParam(name = "RlGetPersonRemoveDataDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonRemoveDataDTO rlGetPersonRemoveDataDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得除戶個人基本資料檔.
     * 
     * @param rlGetPersonIdBirthDTO
     *            the rl get person id birth dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得除戶個人基本資料檔失敗
     */
    @WebResult(name = "Rldf004h_2", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf004hType> getRldf004h_2(
            @WebParam(name = "RlGetPersonIdBirthDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonIdBirthDTO rlGetPersonIdBirthDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得除戶個人基本資料檔.
     * 
     * @param rlGetBirthAndRemoveDTO
     *            the rl get birth and remove dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得除戶個人基本資料檔失敗
     */
    @WebResult(name = "Rldf004h_3", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf004hType> getRldf004h_3(
            @WebParam(name = "RlGetBirthAndRemoveDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetBirthAndRemoveDTO rlGetBirthAndRemoveDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得除戶個人基本資料檔.
     * 
     * @param rlGetPersonRemoveDataDTO
     *            the rl get person remove data dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得除戶個人基本資料檔失敗
     */
    @WebResult(name = "Rldf004h", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf004hType> getRldf004h_4(
            @WebParam(name = "RlGetPersonRemoveDataDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonRemoveDataDTO rlGetPersonRemoveDataDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得除戶資料 (全戶基本資料+個人基本資料).
     * 
     * @param rlGetPersonRemoveDataDTO
     *            the rl get person remove data dto
     * @param executant
     *            使用者資訊
     * @return RlRmve41ResultDTO 除戶資料 (全戶基本資料+個人基本資料)
     * @throws RisBusinessException
     *             取得除戶個人基本資料檔失敗
     */
    @WebResult(name = "RlRmve41ResultDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN)
    public RlRmve41ResultDTO getRldf004h1h(
            @WebParam(name = "RlGetPersonRemoveDataDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonRemoveDataDTO rlGetPersonRemoveDataDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * getRldf004m 取得個人基本資料.
     * 
     * @param rlGetPersonIdDTO
     *            the rl get person id dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得個人基本資料失敗
     */
    @WebResult(name = "Rldf004m", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf004mType> getRldf004m(
            @WebParam(name = "RlGetPersonIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonIdDTO rlGetPersonIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * Gets the rldf004m_2.
     * 
     * @param rlGetPersonIdDTO
     *            (householdHeadId戶長統號 householdId 戶號 )
     * @param executant
     *            the executant
     * @return the rldf004m_2
     * @throws RisBusinessException
     *             the ris business exception
     */
    @WebResult(name = "Rldf004m", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf004mType> getRldf004m_2(
            @WebParam(name = "RlGetPersonIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonIdDTO rlGetPersonIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * Gets the rldf004m and rldf001m.
     * 
     * @param dto
     *            the dto
     * @param executant
     *            the executant
     * @return the rldf004m and rldf001m
     * @throws RisBusinessException
     *             the ris business exception
     */
    @WebResult(name = "Rldf004mAndRldf001mDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN)
    public Rldf004mAndRldf001mDTO getRldf004mAndRldf001m(
            @WebParam(name = "Rldf004mAndRldf01mQueryDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) Rldf004mAndRldf01mQueryDTO dto,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * Gets the rldf004m and rldf049m.
     * 
     * @param dto
     *            the dto
     * @param executant
     *            the executant
     * @return the rldf004m and rldf049m
     * @throws RisBusinessException
     *             the ris business exception
     */
    @WebResult(name = "Rldf004mAndRldf049mDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN)
    public Rldf004mAndRldf049mDTO getRldf004mAndRldf049m(
            @WebParam(name = "Rldf004mAndRldf049mDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) Rldf004mAndRldf049mDTO dto,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得除戶個人記事資料.
     * 
     * @param rlGetPersonRemoveDTO
     *            the rl get person remove dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得除戶個人記事資料失敗
     */
    @WebResult(name = "Rldf005h", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf005hType> getRldf005h(
            @WebParam(name = "RlGetPersonRemoveDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonRemoveDTO rlGetPersonRemoveDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * getRldf005hs 取得個人除戶記事資料.
     * 
     * @param rlGetPersonIdDTO
     *            the rl get person id dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得個人記事資料失敗
     */
    @WebResult(name = "Rldf005h", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf005hType> getRldf005hs(
            @WebParam(name = "RlGetPersonIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonIdDTO rlGetPersonIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * getRldf005m 取得個人記事資料.
     * 
     * @param rlGetPersonIdDTO
     *            the rl get person id dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得個人記事資料失敗
     */
    @WebResult(name = "Rldf005m", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf005mType> getRldf005m(
            @WebParam(name = "RlGetPersonIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonIdDTO rlGetPersonIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * getRldf005ms 取得個人記事資料.
     * 
     * @param rlGetPersonIdDTO
     *            the rl get person id dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得個人記事資料失敗
     */
    @WebResult(name = "Rldf005m", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf005mType> getRldf005ms(
            @WebParam(name = "RlGetPersonIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonIdDTO rlGetPersonIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得除戶個人遷徙記錄資料.
     * 
     * @param rlGetPersonRemoveDTO
     *            the rl get person remove dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得個人遷徙記錄資料失敗
     */
    @WebResult(name = "Rldf006h", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf006hType> getRldf006h(
            @WebParam(name = "RlGetPersonRemoveDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonRemoveDTO rlGetPersonRemoveDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得個人遷徙記錄資料.
     * 
     * @param rlGetPersonIdDTO
     *            the rl get person id dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得個人遷徙記錄資料失敗
     */
    @WebResult(name = "Rldf006m", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf006mType> getRldf006m(
            @WebParam(name = "RlGetPersonIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonIdDTO rlGetPersonIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得戶號配賦紀錄檔.
     * 
     * @param rldf006sQueryDTO
     *            the rldf006s query dto
     * @param executant
     *            the executant
     * @return the rldf006s
     * @throws RisBusinessException
     *             the ris business exception
     */
    @WebResult(name = "Rldf006sType", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf006sType> getRldf006s(
            @WebParam(name = "Rldf006sQueryDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) Rldf006sQueryDTO rldf006sQueryDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得除戶個人姓名更改記錄資料.
     * 
     * @param rlGetPersonRemoveDTO
     *            the rl get person remove dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得個人遷徙記錄資料失敗
     */
    @WebResult(name = "Rldf007h", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf007hType> getRldf007h(
            @WebParam(name = "RlGetPersonRemoveDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonRemoveDTO rlGetPersonRemoveDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得姓名更改記錄資料.
     * 
     * @param rlGetPersonIdDTO
     *            the rl get person id dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得姓名更改記錄資料失敗
     */
    @WebResult(name = "Rldf007m", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf007mType> getRldf007m(
            @WebParam(name = "RlGetPersonIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonIdDTO rlGetPersonIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得統號配賦紀錄檔.
     * 
     * @param rldf007sQueryDTO
     *            the rldf007s query dto
     * @param executant
     *            the executant
     * @return the rldf007s
     * @throws RisBusinessException
     *             the ris business exception
     */
    @WebResult(name = "Rldf007sType", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf007sType> getRldf007s(
            @WebParam(name = "Rldf007sQueryDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) Rldf007sQueryDTO rldf007sQueryDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得 RLDF008A 全民換證資料檔.
     * 
     * @param rlGetPersonBirthDTO
     *            the rl get person birth dto
     * @param executant
     *            the executant
     * @return the rldf008a
     * @throws RisBusinessException
     *             the ris business exception
     */
    @WebResult(name = "Rldf008aType", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf008aType> getRldf008a(
            @WebParam(name = "RlGetPersonBirthDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonBirthDTO rlGetPersonBirthDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得特殊人口資料.
     * 
     * @param rlGetPersonRemoveDTO
     *            the rl get person remove dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得特殊人口資料
     */
    @WebResult(name = "Rldf008hType", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf008hType> getRldf008h(
            @WebParam(name = "RlGetPersonRemoveDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonRemoveDTO rlGetPersonRemoveDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得特殊人口資料.
     * 
     * @param rlGetPersonIdDTO
     *            the rl get person id dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得特殊人口資料
     */
    @WebResult(name = "Rldf008m", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf008mType> getRldf008m(
            @WebParam(name = "RlGetPersonIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonIdDTO rlGetPersonIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * getRldf010h 取得限制人口資料.
     * 
     * @param rlGetPersonRemoveDTO
     *            the rl get person remove dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             getRldf010h 取得限制人口資料
     */
    @WebResult(name = "Rldf010hType", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf010hType> getRldf010h(
            @WebParam(name = "RlGetPersonRemoveDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonRemoveDTO rlGetPersonRemoveDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * getRldf010m 取得限制人口資料.
     * 
     * @param rlGetPersonIdDTO
     *            the rl get person id dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得個人記事資料失敗
     */
    @WebResult(name = "Rldf010m", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf010mType> getRldf010m(
            @WebParam(name = "RlGetPersonIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonIdDTO rlGetPersonIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得遷出未接通報資料.
     * 
     * @param rlGetPersonIdDTO
     *            the rl get person id dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得遷出未接通報資料
     */
    @WebResult(name = "Rldf011m", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf011mType> getRldf011m(
            @WebParam(name = "RlGetPersonIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonIdDTO rlGetPersonIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得空白國民身分證及膠膜使用記錄檔.
     * 
     * @param rlGetIdCardDataDTO
     *            the rl get id card data dto
     * @param executant
     *            the executant
     * @return the rldf012d by apply
     * @throws RisBusinessException
     *             the ris business exception
     */
    @WebResult(name = "Rldf012dType", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf012dType> getRldf012dByApply(
            @WebParam(name = "RlGetIdCardDataDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetIdCardDataDTO rlGetIdCardDataDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得資料檔.
     * 
     * @param rlGetPersonIdDTO
     *            the rl get person id dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得資料檔失敗
     */
    @WebResult(name = "getRldf017d", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf017dType> getRldf017d(
            @WebParam(name = "RlGetPersonIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) final RlGetPersonIdDTO rlGetPersonIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) final ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得資料檔.
     * 
     * @param rlGetPersonIdDTO
     *            the rl get person id dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得資料檔失敗
     */
    @WebResult(name = "getRldf018d", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf018dType> getRldf018d(
            @WebParam(name = "RlGetPersonIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) final RlGetPersonIdDTO rlGetPersonIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) final ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得戶口名簿請領記錄資料檔.
     * 
     * @param rlGetPersonIdDTO
     *            the rl get person id dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得資料檔失敗
     */
    @WebResult(name = "Rldf018dType", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf018dType> getRldf018d_2(
            @WebParam(name = "RlGetPersonIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) final RlGetPersonIdDTO rlGetPersonIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) final ExecutantType executant)
            throws RisBusinessException;

    /**
     * Gets the rldf018d for251z.
     * 
     * @param rl0251zWsDTO
     *            the rl0251z ws dto
     * @param executant
     *            the executant
     * @return the rldf018d for251z
     * @throws RisBusinessException
     *             the ris business exception
     */
    @WebResult(name = "getRldf018dFor251z", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf018dType> getRldf018dFor251z(
            @WebParam(name = "Rl0251zWsDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) final Rl0251zWsDTO rl0251zWsDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) final ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得里鄰門牌資料
     * 
     * @param RlGetAddressDTO
     *            (village 村里,neighbor 鄰,streetDoorplate 街路門牌,siteId 作業點代碼)
     * @param executant
     *            使用者資訊
     * @return List
     * 
     * @throws RisBusinessException
     *             取得里鄰門牌資料失敗
     */
    @WebResult(name = "Rldf020m", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf020mType> getRldf020m(
            @WebParam(name = "RlGetAddressDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetAddressDTO rlGetAddressDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得逕遷至戶政事務所人數資料.
     * 
     * @param rlGetMoveCountDTO
     *            the rl get move count dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得逕遷至戶政事務所人數資料失敗
     */
    @WebResult(name = "Rldf020s", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf020sType> getRldf020s(
            @WebParam(name = "RlGetMoveCountDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetMoveCountDTO rlGetMoveCountDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得戶號配賦資料.
     * 
     * @param rlGetEndueDTO
     *            the rl get endue dto
     * @param executant
     *            使用者資訊
     * @return List<E>
     * @throws RisBusinessException
     *             取得戶號配賦資料失敗
     */
    @WebResult(name = "Rldf021m", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf021mType> getRldf021m(
            @WebParam(name = "RlGetHouseholdEndueDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetHouseholdEndueDTO rlGetEndueDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得戶號配賦資料總筆數
     * 
     * @param rlGetHouseholdEndueDTO
     *            RlGetHouseholdEndueDTO
     * @param executant
     *            使用者資訊
     * @return 戶號配賦資料總筆數
     * @throws RisBusinessException
     */
    @WebResult(name = "RlCountDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN)
    public RlCountDTO getRldf021mCount(
            @WebParam(name = "RlGetHouseholdEndueDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetHouseholdEndueDTO rlGetHouseholdEndueDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得戶號安全存量控制檔.
     * 
     * @param rldf021oQueryDTO
     *            the rldf021o query dto
     * @param executant
     *            the executant
     * @return the rldf021o
     * @throws RisBusinessException
     *             the ris business exception
     */
    @WebResult(name = "Rldf021oType", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf021oType> getRldf021o(
            @WebParam(name = "Rldf021oQueryDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) Rldf021oQueryDTO rldf021oQueryDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得辦理他所身分證請領記錄檔.
     * 
     * @param rlGetIdCardDataDTO
     *            the rl get id card data dto
     * @param executant
     *            the executant
     * @return the rldf002d by apply
     * @throws RisBusinessException
     *             the ris business exception
     */
    @WebResult(name = "Rldf022dType", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf022dType> getRldf022dByApply(
            @WebParam(name = "RlGetIdCardDataDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetIdCardDataDTO rlGetIdCardDataDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得國民身分證統一編號配賦資料.
     * 
     * @param rlGetPersonIdEndueDTO
     *            the rl get person id endue dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得國民身分證統一編號配賦資料失敗
     */
    @WebResult(name = "Rldf022m", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf022mType> getRldf022m(
            @WebParam(name = "RlGetPersonIdEndueDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonIdEndueDTO rlGetPersonIdEndueDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得國民身分證統一編號配賦資料總筆數
     * 
     * @param rlGetPersonIdEndueDTO
     *            RlGetPersonIdEndueDTO
     * @param executant
     *            使用者資訊
     * @return 國民身分證統一編號配賦資料總筆數
     * @throws RisBusinessException
     */
    @WebResult(name = "RlCountDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN)
    public RlCountDTO getRldf022mCount(
            @WebParam(name = "RlGetPersonIdEndueDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonIdEndueDTO rlGetPersonIdEndueDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得國民身分證統一編號配賦資料 (前 200 筆).
     * 
     * @param rlGetPersonIdEndueDTO
     *            the rl get person id endue dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得國民身分證統一編號配賦資料失敗
     */
    @WebResult(name = "Rldf022m", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf022mType> getRldf022mTop(
            @WebParam(name = "RlGetPersonIdEndueDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonIdEndueDTO rlGetPersonIdEndueDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得統號安全存量控制檔.
     * 
     * @param rldf022oQueryDTO
     *            the rldf022o query dto
     * @param executant
     *            the executant
     * @return the rldf022o
     * @throws RisBusinessException
     *             the ris business exception
     */
    @WebResult(name = "Rldf022oType", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf022oType> getRldf022o(
            @WebParam(name = "Rldf022oQueryDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) Rldf022oQueryDTO rldf022oQueryDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得個人基本資料檔.
     * 
     * @param rlGetPersonDataDTO
     *            the rl get person data dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得個人基本資料檔失敗
     */
    @WebResult(name = "Rldf024m", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf024mType> getRldf024m(
            @WebParam(name = "RlGetPersonDataDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonDataDTO rlGetPersonDataDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得個人基本資料檔.
     * 
     * @param rlGetPersonBirthDTO
     *            the rl get person birth dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得個人基本資料檔失敗
     */
    @WebResult(name = "Rldf024m_2", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf024mType> getRldf024m_2(
            @WebParam(name = "RlGetPersonBirthDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonBirthDTO rlGetPersonBirthDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得暫存個人記事.
     * 
     * @param rlGetPersonDataDTO
     *            the rl get person data dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得暫存個人記事檔失敗
     */
    @WebResult(name = "Rldf025m", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf025mType> getRldf025m(
            @WebParam(name = "RlGetPersonDataDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonDataDTO rlGetPersonDataDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得所內記事資料.
     * 
     * @param rlGetPersonIdDTO
     *            the rl get person id dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得所內記事資料失敗
     */
    @WebResult(name = "Rldf030m", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf030mType> getRldf030m(
            @WebParam(name = "RlGetPersonIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonIdDTO rlGetPersonIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得他所行政協助所內記事檔.
     * 
     * @param getRldf030tDTO
     *            getRldf030tDTO
     * @param executant
     *            使用者資訊
     * @return List<Rldf030tType>
     * @throws RisBusinessException
     *             取得他所行政協助所內記事檔 失敗
     */
    @WebResult(name = "Rldf030t", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf030tType> getRldf030t(
            @WebParam(name = "GetRldf030tDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) final GetRldf030tDTO getRldf030tDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) final ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得他所行政協助所內記事檔.
     * 
     * @param rlGetPersonIdDTO
     *            the rl get person id dto
     * @param executant
     *            使用者資訊
     * @return List<Rldf030tType>
     * @throws RisBusinessException
     *             取得他所行政協助所內記事檔 失敗
     */
    @WebResult(name = "Rldf030tHousehold", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf030tType> getRldf030tHousehold(
            @WebParam(name = "RlGetPersonIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) final RlGetPersonIdDTO rlGetPersonIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) final ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得出境滿二年未入境通報紀錄.
     * 
     * @param rlGetPersonIdDTO
     *            the rl get person id dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得出境滿二年未入境通報紀錄失敗
     */
    @WebResult(name = "Rldf039m", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf039mType> getRldf039m(
            @WebParam(name = "RlGetPersonIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonIdDTO rlGetPersonIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得出境滿二年再入境通報紀錄.
     * 
     * @param rlGetPersonIdDTO
     *            the rl get person id dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得出境滿二年再入境通報紀錄失敗
     */
    @WebResult(name = "Rldf040m", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf040mType> getRldf040m(
            @WebParam(name = "RlGetPersonIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonIdDTO rlGetPersonIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * getRldf004m 取得個人基本資料.
     * 
     * @param getRldf045mDTO
     *            the get rldf045m dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得個人基本資料失敗
     */
    @WebResult(name = "Rldf045m", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf045mType> getRldf045m(
            @WebParam(name = "GetRldf045mDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) GetRldf045mDTO getRldf045mDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得姓名羅馬拼音記錄資料.
     * 
     * @param xLDFPersonBriefDataDTO
     *            the x ldf person brief data dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得姓名羅馬拼音記錄資料失敗
     */
    @WebResult(name = "Rldf047hType", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf047hType> getRldf047h(
            @WebParam(name = "XLDFPersonBriefDataDTO", targetNamespace = "http://tw.gov.moi/rl/dto/rl00001") XLDFPersonBriefDataDTO xLDFPersonBriefDataDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得姓名羅馬拼音記錄資料.
     * 
     * @param rlGetPersonIdDTO
     *            the rl get person id dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得姓名羅馬拼音記錄資料失敗
     */
    @WebResult(name = "Rldf047m", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf047mType> getRldf047m(
            @WebParam(name = "RlGetPersonIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonIdDTO rlGetPersonIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得最後姓名羅馬拼音記錄資料依申請類別(1:登記2:更正3:變更4:撤銷).
     * 
     * @param rlGetRldf047wDTO
     *            the rl get rldf047w dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得姓名羅馬拼音記錄資料失敗
     */
    @WebResult(name = "getRldf047m_2", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf047mType> getRldf047m_2(
            @WebParam(name = "RlGetRldf047wDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetRldf047wDTO rlGetRldf047wDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得保護家庭暴力資料.
     * 
     * @param rlGetPersonIdDTO
     *            the rl get person id dto
     * @param executant
     *            使用者資訊
     * @return List 保護家庭暴力資料
     * @throws RisBusinessException
     *             取得姓名羅馬拼音記錄資料失敗
     */
    @WebResult(name = "Rldf049m", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf049mType> getRldf049m(
            @WebParam(name = "RlGetPersonIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonIdDTO rlGetPersonIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得保護家庭暴力資料.
     * 
     * @param rlGetVictimIdDTO
     *            the rl get victim id dto
     * @param executant
     *            the executant
     * @return the rldf049m_1
     */
    @WebResult(name = "Rldf049m_1", targetNamespace = RlConstant.Namespace_RIS)
    List<Rldf049mType> getRldf049m_1(
            @WebParam(name = "RlGetVictimIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) final RlGetVictimIdDTO rlGetVictimIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant);

    /**
     * 取得保護家庭暴力資料.
     * 
     * @param rlGetViolatorIdDTO
     *            the rl get violator id dto
     * @param executant
     *            the executant
     * @return the rldf049m_2
     */
    @WebResult(name = "Rldf049m_2", targetNamespace = RlConstant.Namespace_RIS)
    List<Rldf049mType> getRldf049m_2(
            @WebParam(name = "RlGetViolatorIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) final RlGetViolatorIdDTO rlGetViolatorIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant);

    /**
     * Gets the rldf049m_3.
     * 
     * @param rlGetvictimIdAndviolatorIdDTO
     *            the rl getvictim id andviolator id dto
     * @param executant
     *            the executant
     * @return the rldf049m_3
     * @throws RisBusinessException
     *             the ris business exception
     */
    @WebResult(name = "Rldf049m", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf049mType> getRldf049m_3(
            @WebParam(name = "RlGetvictimIdAndviolatorIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetvictimIdAndviolatorIdDTO rlGetvictimIdAndviolatorIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 由母統號取得出生通報資料.
     * 
     * @param rldf051mDTO
     *            the rldf051m dto
     * @param executant
     *            the executant
     * @return the rldf051m by mother
     * @throws RisBusinessException
     *             the ris business exception
     */
    @WebResult(name = "getRldf051mByMother", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf051mType> getRldf051mByMother(
            @WebParam(name = "Rldf051mDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) Rldf051mDTO rldf051mDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 由配偶統號取得出生通報資料.
     * 
     * @param rldf051mDTO
     *            the rldf051m dto
     * @param executant
     *            the executant
     * @return the rldf051m by spouse
     * @throws RisBusinessException
     *             the ris business exception
     */
    @WebResult(name = "getRldf051mBySpouse", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf051mType> getRldf051mBySpouse(
            @WebParam(name = "Rldf051mDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) Rldf051mDTO rldf051mDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得出生通報查核結果資料檔.
     * 
     * @param queryObject
     *            查詢物件
     * @param executantType
     *            使用者資訊
     * @return 出生通報查核結果資料檔
     * @throws RisBusinessException
     */
    @WebResult(name = "getRldf058m", targetNamespace = RlConstant.Namespace_RIS)
    Rldf058mType getRldf058m(
            @WebParam(name = "Rldf058mDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) Rldf058mDTO queryObject,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 取得登記婚前結(離)婚證明書資料.
     * 
     * @param rlGetPersonIdDTO
     *            the rl get person id dto
     * @param executant
     *            使用者資訊
     * @return List<Rldf087tType>
     * @throws RisBusinessException
     *             取得登記婚前結(離)婚證明書資料 失敗
     */
    @WebResult(name = "Rldf087t", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf087tType> getRldf087t(
            @WebParam(name = "RlGetPersonIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonIdDTO rlGetPersonIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得除戶登記婚前結(離)婚證明書資料.
     * 
     * @param rlGetPersonRemoveDTO
     *            the rl get person remove dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得除戶登記婚前結(離)婚證明書資料失敗
     */
    @WebResult(name = "Rldf087thType", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf087thType> getRldf087th(
            @WebParam(name = "RlGetPersonRemoveDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonRemoveDTO rlGetPersonRemoveDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得結(離)婚證明書資料.
     * 
     * @param rlGetPersonIdDTO
     *            the rl get person id dto
     * @param executant
     *            使用者資訊
     * @return List<Rldf088tType>
     * @throws RisBusinessException
     *             取得結(離)婚證明書資料失敗
     */
    @WebResult(name = "Rldf088t", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf088tType> getRldf088t(
            @WebParam(name = "RlGetPersonIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonIdDTO rlGetPersonIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得除戶結(離)婚證明書資料.
     * 
     * @param rlGetPersonRemoveDTO
     *            the rl get person remove dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得除戶結(離)婚證明書資料失敗
     */
    @WebResult(name = "Rldf088thType", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf088thType> getRldf088th(
            @WebParam(name = "RlGetPersonRemoveDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonRemoveDTO rlGetPersonRemoveDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得英文結(離)婚證明書資料.
     * 
     * @param rlGetPersonIdDTO
     *            the rl get person id dto
     * @param executant
     *            使用者資訊
     * @return List<Rldf089tType>
     * @throws RisBusinessException
     *             取得英文結(離)婚證明書資料 失敗
     */
    @WebResult(name = "Rldf089t", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf089tType> getRldf089t(
            @WebParam(name = "RlGetPersonIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonIdDTO rlGetPersonIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得除戶結(離)婚證明書資料.
     * 
     * @param rlGetPersonRemoveDTO
     *            the rl get person remove dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得除戶結(離)婚證明書資料失敗
     */
    @WebResult(name = "Rldf089thType", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf089thType> getRldf089th(
            @WebParam(name = "RlGetPersonRemoveDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonRemoveDTO rlGetPersonRemoveDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得資料檔.
     * 
     * @param xLDFPersonBriefDataDTO
     *            the x ldf person brief data dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得資料檔失敗
     */
    @WebResult(name = "getRldfm01h", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldfm01hType> getRldfm01h(
            @WebParam(name = "XLDFPersonBriefDataDTO", targetNamespace = "http://tw.gov.moi/rl/dto/rl00001") final XLDFPersonBriefDataDTO xLDFPersonBriefDataDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) final ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得出生資料
     * 
     * RlGetPersonIdDTO(personId 國民身分證統一編號,siteId 作業點代碼).
     * 
     * @param rlGetPersonIdDTO
     *            the rl get person id dto
     * @param executant
     *            使用者資訊
     * @return List 出生資料
     * @throws RisBusinessException
     *             「取得本地出生資料」失敗
     */
    @WebResult(name = "Rldfm01m", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldfm01mType> getRldfm01m(
            @WebParam(name = "RlGetPersonIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonIdDTO rlGetPersonIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得資料檔.
     * 
     * @param xLDFPersonBriefDataDTO
     *            the x ldf person brief data dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得資料檔失敗
     */
    @WebResult(name = "getRldfm02h", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldfm02hType> getRldfm02h(
            @WebParam(name = "XLDFPersonBriefDataDTO", targetNamespace = "http://tw.gov.moi/rl/dto/rl00001") final XLDFPersonBriefDataDTO xLDFPersonBriefDataDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) final ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得婚姻紀錄.
     * 
     * @param rlGetPersonIdDTO
     *            the rl get person id dto
     * @param executant
     *            使用者資訊
     * @return List 婚姻紀錄
     * @throws RisBusinessException
     *             「取得婚姻紀錄」失敗
     */
    @WebResult(name = "Rldfm02m", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldfm02mType> getRldfm02m(
            @WebParam(name = "RlGetPersonIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonIdDTO rlGetPersonIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得資料檔.
     * 
     * @param xLDFPersonBriefDataDTO
     *            the x ldf person brief data dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得資料檔失敗
     */
    @WebResult(name = "getRldfm03hType", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldfm03hType> getRldfm03h(
            @WebParam(name = "XLDFPersonBriefDataDTO", targetNamespace = "http://tw.gov.moi/rl/dto/rl00001") final XLDFPersonBriefDataDTO xLDFPersonBriefDataDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) final ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得統號更改紀錄.
     * 
     * @param rlGetPersonIdDTO
     *            the rl get person id dto
     * @param executant
     *            使用者資訊
     * @return List 統號更改紀錄
     * @throws RisBusinessException
     *             「取得統號更改紀錄」失敗
     * @paramRlGetPersonIdDTO(personId 國民身分證統一編號,siteId 作業點代碼)
     */
    @WebResult(name = "Rldfm03mType", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldfm03mType> getRldfm03m(
            @WebParam(name = "RlGetPersonIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonIdDTO rlGetPersonIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得資料檔.
     * 
     * @param xLDFPersonBriefDataDTO
     *            the x ldf person brief data dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得資料檔失敗
     */
    @WebResult(name = "getRldfm04h", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldfm04hType> getRldfm04h(
            @WebParam(name = "XLDFPersonBriefDataDTO", targetNamespace = "http://tw.gov.moi/rl/dto/rl00001") final XLDFPersonBriefDataDTO xLDFPersonBriefDataDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) final ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得收養記錄.
     * 
     * @param rlGetPersonIdDTO
     *            the rl get person id dto
     * @param executant
     *            使用者資訊
     * @return List 收養記錄
     * @throws RisBusinessException
     *             「取得收養記錄」失敗
     */
    @WebResult(name = "Rldfm04m", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldfm04mType> getRldfm04m(
            @WebParam(name = "RlGetPersonIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonIdDTO rlGetPersonIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得資料檔.
     * 
     * @param xLDFPersonBriefDataDTO
     *            the x ldf person brief data dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得資料檔失敗
     */
    @WebResult(name = "getRldfm05h", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldfm05hType> getRldfm05h(
            @WebParam(name = "XLDFPersonBriefDataDTO", targetNamespace = "http://tw.gov.moi/rl/dto/rl00001") final XLDFPersonBriefDataDTO xLDFPersonBriefDataDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) final ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得監護輔助未成年子女權利義務行使負擔資料檔.
     * 
     * @param xLDFPersonBriefDataDTO
     *            the x ldf person brief data dto
     * @param executant
     *            the executant
     * @return the rldfm05h_1
     */
    @WebResult(name = "getRldfm05h_1", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldfm05hType> getRldfm05h_1(
            @WebParam(name = "XLDFPersonBriefDataDTO", targetNamespace = "http://tw.gov.moi/rl/dto/rl00001") final XLDFPersonBriefDataDTO xLDFPersonBriefDataDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant);

    /**
     * 取得監護、輔助、未成年子女權利義務行使負擔資料.
     * 
     * @param rlGetPersonIdDTO
     *            the rl get person id dto
     * @param executant
     *            使用者資訊
     * @return List 監護、輔助、未成年子女權利義務行使負擔資料
     * @throws RisBusinessException
     *             「取得監護、輔助、未成年子女權利義務行使負擔資料」失敗
     */
    @WebResult(name = "Rldfm05m", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldfm05mType> getRldfm05m(
            @WebParam(name = "RlGetPersonIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonIdDTO rlGetPersonIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得監護、輔助、未成年子女權利義務行使負擔資料.
     * 
     * @param rlGetPersonIdDTO
     *            the rl get person id dto
     * @param executant
     *            the executant
     * @return the rldfm05m_1
     */
    @WebResult(name = "getRldfm05m_1", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldfm05mType> getRldfm05m_1(
            @WebParam(name = "RlGetPersonIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) final RlGetPersonIdDTO rlGetPersonIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant);

    /**
     * 取得資料檔.
     * 
     * @param xLDFPersonBriefDataDTO
     *            the x ldf person brief data dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得資料檔失敗
     */
    @WebResult(name = "getRldfm06h", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldfm06hType> getRldfm06h(
            @WebParam(name = "XLDFPersonBriefDataDTO", targetNamespace = "http://tw.gov.moi/rl/dto/rl00001") final XLDFPersonBriefDataDTO xLDFPersonBriefDataDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) final ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得國民身分證掛失紀錄.
     * 
     * @param rlGetPersonIdDTO
     *            the rl get person id dto
     * @param executant
     *            使用者資訊
     * @return List 國民身分證掛失紀錄
     * @throws RisBusinessException
     *             「取得國民身分證掛失紀錄」失敗
     */
    @WebResult(name = "Rldfm06m", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldfm06mType> getRldfm06m(
            @WebParam(name = "RlGetPersonIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonIdDTO rlGetPersonIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得資料檔.
     * 
     * @param xLDFPersonBriefDataDTO
     *            the x ldf person brief data dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得資料檔失敗
     */
    @WebResult(name = "getRldfm07h", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldfm07hType> getRldfm07h(
            @WebParam(name = "XLDFPersonBriefDataDTO", targetNamespace = "http://tw.gov.moi/rl/dto/rl00001") final XLDFPersonBriefDataDTO xLDFPersonBriefDataDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) final ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得重婚資料.
     * 
     * @param rlGetPersonIdDTO
     *            the rl get person id dto
     * @param executant
     *            使用者資訊
     * @return List 重婚資料
     * @throws RisBusinessException
     *             「取得重婚資料」失敗
     */
    @WebResult(name = "Rldfm07m", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldfm07mType> getRldfm07m(
            @WebParam(name = "RlGetPersonIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonIdDTO rlGetPersonIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得資料檔.
     * 
     * @param xLDFPersonBriefDataDTO
     *            the x ldf person brief data dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得資料檔失敗
     */
    @WebResult(name = "getRldfm08h", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldfm08hType> getRldfm08h(
            @WebParam(name = "XLDFPersonBriefDataDTO", targetNamespace = "http://tw.gov.moi/rl/dto/rl00001") final XLDFPersonBriefDataDTO xLDFPersonBriefDataDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) final ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得監護、輔助、未成年子女權利義務行使負擔紀錄.
     * 
     * @param rlGetPersonIdDTO
     *            the rl get person id dto
     * @param executant
     *            使用者資訊
     * @return List 監護、輔助、未成年子女權利義務行使負擔紀錄
     * @throws RisBusinessException
     *             「取得監護、輔助、未成年子女權利義務行使負擔紀錄」失敗
     */
    @WebResult(name = "Rldfm08m", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldfm08mType> getRldfm08m(
            @WebParam(name = "RlGetPersonIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonIdDTO rlGetPersonIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得資料檔.
     * 
     * @param xLDFPersonBriefDataDTO
     *            the x ldf person brief data dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得資料檔失敗
     */
    @WebResult(name = "getRldfm09h", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldfm09hType> getRldfm09h(
            @WebParam(name = "XLDFPersonBriefDataDTO", targetNamespace = "http://tw.gov.moi/rl/dto/rl00001") final XLDFPersonBriefDataDTO xLDFPersonBriefDataDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) final ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得出生日期更改紀錄.
     * 
     * @param rlGetPersonIdDTO
     *            the rl get person id dto
     * @param executant
     *            使用者資訊
     * @return List 出生日期更改紀錄
     * @throws RisBusinessException
     *             「取得出生日期更改紀錄」失敗
     */
    @WebResult(name = "Rldfm09m", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldfm09mType> getRldfm09m(
            @WebParam(name = "RlGetPersonIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonIdDTO rlGetPersonIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得資料檔.
     * 
     * @param xLDFPersonBriefDataDTO
     *            the x ldf person brief data dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得資料檔失敗
     */
    @WebResult(name = "getRldfm10h", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldfm10hType> getRldfm10h(
            @WebParam(name = "XLDFPersonBriefDataDTO", targetNamespace = "http://tw.gov.moi/rl/dto/rl00001") final XLDFPersonBriefDataDTO xLDFPersonBriefDataDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) final ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得除戶-個人申請書紀錄檔.
     * 
     * @param rldfm10hQueryDTO
     *            (統號、除戶日期、除戶時間、作業點代碼、申請書代碼、申請書類別)
     * @param executant
     *            使用者資訊
     * @return List<Rldfm10hType>
     * @throws RisBusinessException
     *             the ris business exception
     */
    @WebResult(name = "Rldfm10hType", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldfm10hType> getRldfm10h2(
            @WebParam(name = "Rldfm10hQueryDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) Rldfm10hQueryDTO rldfm10hQueryDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得個人申請書紀錄.
     * 
     * @param rlGetApplyDTO
     *            the rl get apply dto
     * @param executant
     *            使用者資訊
     * @return List 個人申請書紀錄
     * @throws RisBusinessException
     *             「取得個人申請書紀錄」失敗
     */
    @WebResult(name = "Rldfm10m", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldfm10mType> getRldfm10m(
            @WebParam(name = "RlGetApplyDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetApplyDTO rlGetApplyDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得個人申請書紀錄清單.
     * 
     * @param dto
     *            (personId 統號,siteId 作業點代碼,applyCode 申請書代碼,applyType 交待R或T)
     * @param executant
     *            使用者資訊
     * @return 個人申請書紀錄清單
     * @throws RisBusinessException
     *             the ris business exception
     */
    @WebResult(name = "Rldfm10mType", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldfm10mType> getRldfm10mList(
            @WebParam(name = "Rldfm10mDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) Rldfm10mDTO dto,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得個人姓氏資料紀錄.
     * 
     * @param xLDFPersonBriefDataDTO
     *            the x ldf person brief data dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得個人姓氏資料紀錄
     */
    @WebResult(name = "Rldfm11hType", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldfm11hType> getRldfm11h(
            @WebParam(name = "XLDFPersonBriefDataDTO", targetNamespace = "http://tw.gov.moi/rl/dto/rl00001") final XLDFPersonBriefDataDTO xLDFPersonBriefDataDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) final ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得個人姓氏資料紀錄.
     * 
     * @param rlGetPersonIdDTO
     *            the rl get person id dto
     * @param executant
     *            使用者資訊
     * @return List 出生日期更改紀錄
     * @throws RisBusinessException
     *             「取得個人姓氏資料紀錄」失敗
     */
    @WebResult(name = "Rldfm11m", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldfm11mType> getRldfm11m(
            @WebParam(name = "RlGetPersonIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonIdDTO rlGetPersonIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得國民身分證列印旗標資料.
     * 
     * @param rlGetPersonIdDTO
     *            the rl get person id dto
     * @param executant
     *            使用者資訊
     * @return List 出生日期更改紀錄
     * @throws RisBusinessException
     *             「取得國民身分證列印旗標資料」失敗
     */
    @WebResult(name = "Rldfm12m", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldfm12mType> getRldfm12m(
            @WebParam(name = "RlGetPersonIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonIdDTO rlGetPersonIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得RLDFM13M國民其他出生地資料檔.
     * 
     * @param rlGetPersonIdDTO
     *            the rl get person id dto
     * @param executant
     *            the executant
     * @return the rldfm13m
     * @throws RisBusinessException
     *             the ris business exception
     */
    @WebResult(name = "Rldfm13mType", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldfm13mType> getRldfm13m(
            @WebParam(name = "RlGetPersonIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonIdDTO rlGetPersonIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得全戶記事欄位化資料.
     * 
     * @param dto
     *            RlGetRldfxDataDTO
     * @param executant
     *            the executant
     * @return the rldfx data
     */
    @WebResult(name = "RldfxDataResultDTO", targetNamespace = RlConstant.Namespace_RIS)
    public RldfxDataResultDTO getRldfxData(
            @WebParam(name = "RlGetRldfxDataDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetRldfxDataDTO dto,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant);

    /**
     * 取得監護登記個人記事欄位化子檔.
     * 
     * @param rlGetPersonIdDTO
     *            個人資料DTO
     * @param executant
     *            使用者資訊
     * @return List<Rldfy079dmType>
     * @throws RisBusinessException
     *             取得監護登記個人記事欄位化子檔失敗
     */
    @WebResult(name = "getRldfy079dm", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldfy079dmType> getRldfy079dm(
            @WebParam(name = "RlGetPersonIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonIdDTO rlGetPersonIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得輔助登記個人記事欄位化子檔.
     * 
     * @param rlGetPersonIdDTO
     *            個人資料DTO
     * @param executant
     *            使用者資訊
     * @return List<Rldfy081dmType>
     * @throws RisBusinessException
     *             取得輔助登記個人記事欄位化子檔失敗
     */
    @WebResult(name = "getRldfy081dm", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldfy081dmType> getRldfy081dm(
            @WebParam(name = "RlGetPersonIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonIdDTO rlGetPersonIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得個人記事欄位化資料.
     * 
     * @param dto
     *            RlGetRldfyDataDTO
     * @param executant
     *            the executant
     * @return the rldfy data
     * @throws RisBusinessException
     *             the ris business exception
     */
    @WebResult(name = "RlGetRldfyDataDTO", targetNamespace = RlConstant.Namespace_RIS)
    public RlGetRldfyDataDTO getRldfyData(
            @WebParam(name = "RlGetRldfyDataDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetRldfyDataDTO dto,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得戶下現住人口數(含兼任戶長).
     * 
     * @param rlGetHouseholdIdDTO
     *            the rl get household id dto
     * @param executant
     *            使用者資訊
     * @return RlHouseholdNumResultDTO residentNum 現住人口數 nonResidentNum 非現住人口數
     * @throws RisBusinessException
     *             取得戶下成員數失敗
     */
    @WebResult(name = "RlHouseholdNumResultDTO", targetNamespace = RlConstant.Namespace_RIS)
    public RlHouseholdNumResultDTO getRlHouseholdResidentMemberCnt(
            @WebParam(name = "RlGetHouseholdIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetHouseholdIdDTO rlGetHouseholdIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * Gets the rl o8 data.
     * 
     * @param dto
     *            the dto
     * @param executant
     *            the executant
     * @return the rl o8 data
     */
    @WebResult(name = "RsO8WSDTO", targetNamespace = RlConstant.Namespace_RS_DOMAIN)
    RsO8WSDTO getRlO8Data(
            @WebParam(name = "RsO8WSDTO", targetNamespace = RlConstant.Namespace_RS_DOMAIN) RsO8WSDTO dto,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant);

    /**
     * 取得特殊人口資料.
     * 
     * @param rrGetPersonIdDTO
     *            the rr get person id dto
     * @param executant
     *            使用者資訊
     * @return List
     * @throws RisBusinessException
     *             取得特殊人口資料失敗
     */
    @WebResult(name = "Rrdf008m", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rrdf008mType> getRrdf008m(
            @WebParam(name = "RrGetPersonIdDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RrGetPersonIdDTO rrGetPersonIdDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;
}
