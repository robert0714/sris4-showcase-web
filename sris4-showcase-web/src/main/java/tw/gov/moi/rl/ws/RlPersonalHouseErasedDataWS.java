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
import tw.gov.moi.domain.Rldf004hType;
import tw.gov.moi.domain.Rldf005hType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.domain.RlGetPersonRemoveDataDTO;
import tw.gov.moi.rl.domain.Rldf004h1DTO;
import tw.gov.moi.rl.domain.Rldf005h1DTO;

/**
 * 取得當事人除戶資料服務Web服務介面
 * 
 * @author josh hsu
 */
@SOAPBinding(style = Style.DOCUMENT)
@HandlerChain(file = RlConstant.HandlerChain_PATH)
@WebService(name = RlConstant.Name_PersonalHouseData, serviceName = RlConstant.ServiceName_PersonalHouseData, targetNamespace = RlConstant.Namespace_RL)
public interface RlPersonalHouseErasedDataWS {

    final static String ERR_MSG_Rldf004h = "getRldf004hError: 「取得除戶個人基本資料」失敗";

    final static String ERR_MSG_RlPersonalHouse = "getPersonalHouseError: 「取得除戶個人基本資料檔」失敗";

    final static String ERR_MSG_Rldf005h = "getRldf005hError: 「取得除戶個人記事資料」失敗";

    final static String ERR_MSG_Rldf001h = "getRldf001hError: 「取得除戶全戶資料」失敗";

    /**
     * 取得除戶個人基本資料檔
     * 
     * @param rldfDTO
     *            (personId 國民身分證統一編號,siteId 作業點代碼,householeHeadId
     *            戶長統號,householeId 戶號,removeYyymmdd 除戶日期,removeTime 除戶時間)
     * @param executant
     *            使用者資訊
     * @return RlGetPersonRemoveDataDTO
     * 
     * @throws RisBusinessException
     *             取得除戶個人基本資料檔失敗
     */
    @WebResult(name = "RlGetPersonRemoveDataDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN)
    public RlGetPersonRemoveDataDTO getPersonalHouseErasedData(
            @WebParam(name = "RlGetPersonRemoveDataDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonRemoveDataDTO rlGetPersonRemoveDataDTO,
            @WebParam(name = "executant", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 戶役政取得除戶個人基本資料
     * 
     * @param Rldf004h1DTO
     * @param executant
     * @return
     * @throws RisBusinessException
     */
    @WebResult(name = "Rldf004h1", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf004hType> getRldf004h1(
            @WebParam(name = "Rldf004h1DTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) Rldf004h1DTO Rldf004h1DTO,
            @WebParam(name = "executant", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 戶役政取得除戶個人記事資料
     * 
     * @param rldf005h1DTO
     * @param executant
     * @return
     * @throws RisBusinessException
     */
    @WebResult(name = "Rldf005h1", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf005hType> getRldf005h1(
            @WebParam(name = "Rldf005h1DTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) Rldf005h1DTO rldf005h1DTO,
            @WebParam(name = "executant", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;
}
