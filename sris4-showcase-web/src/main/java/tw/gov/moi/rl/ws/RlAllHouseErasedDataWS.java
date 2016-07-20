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
import tw.gov.moi.domain.Rldf001hType;
import tw.gov.moi.domain.Rldf002hType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.domain.RlGetHouseholeRemoveDTO;
import tw.gov.moi.rl.domain.Rldf001h1DTO;
import tw.gov.moi.rl.domain.Rldf002h1DTO;

/**
 * 取得全戶除戶資料Web服務介面
 * 
 * @author josh hsu
 */
@SOAPBinding(style = Style.DOCUMENT)
@HandlerChain(file = RlConstant.HandlerChain_PATH)
@WebService(name = RlConstant.Name_AllHouseData, serviceName = RlConstant.ServiceName_AllHouseData, targetNamespace = RlConstant.Namespace_RL)
public interface RlAllHouseErasedDataWS {

    final static String ERR_MSG_Rldf001h = "getRldf001hError: 「取得除戶全戶基本資料」失敗";

    final static String ERR_MSG_RlAllHouse = "getAllHouseError: 「取得全戶除戶資料Web服務」失敗";

    final static String ERR_MSG_Rldf002h = "getRldf001hError: 「取得除戶全戶動態記事資料」失敗";

    /**
     * 取得除戶全戶基本資料檔
     * 
     * @param RlGetHouseholeRemoveDTO
     *            (householeHeadId戶長統號,householeId 戶號,remoteYyymmdd
     *            除戶日期,remoteTime 除戶時間,siteId 作業點代碼)
     * @param executant
     *            使用者資訊
     * @return RlGetHouseholeRemoveDTO
     * 
     * @throws RisBusinessException
     *             取得除戶個人基本資料檔失敗
     */
    @WebResult(name = "RlGetHouseholeRemoveDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN)
    public RlGetHouseholeRemoveDTO getAllHouseErasedData(
            @WebParam(name = "RlGetHouseholeRemoveDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetHouseholeRemoveDTO rlGetHouseholeRemoveDTO,
            @WebParam(name = "executant", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 戶役政取得除戶全戶基本資料
     * 
     * @param rldf001h1DTO
     * @param executant
     * @return
     * @throws RisBusinessException
     */
    @WebResult(name = "Rldf001h1", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf001hType> getRldf001h1(
            @WebParam(name = "Rldf001h1DTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) Rldf001h1DTO rldf001h1DTO,
            @WebParam(name = "executant", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 戶役政取得除戶全戶動態記事資料
     * 
     * @param rldf002h1DTO
     * @param executant
     * @return
     * @throws RisBusinessException
     */
    @WebResult(name = "Rldf002h1", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf002hType> getRldf002h1(
            @WebParam(name = "Rldf002h1DTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) Rldf002h1DTO rldf002h1DTO,
            @WebParam(name = "executant", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;
}
