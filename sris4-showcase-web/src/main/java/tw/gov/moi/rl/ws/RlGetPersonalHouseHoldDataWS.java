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
import tw.gov.moi.domain.Rldf004mType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.domain.RlGetPersonIdDTO;
import tw.gov.moi.rl.domain.RlGetPersonRemoveDataDTO;

/**
 * 取得當事人現戶、除戶資料服務Web服務介面
 * 
 * @author josh hsu
 */
@SOAPBinding(style = Style.DOCUMENT)
@HandlerChain(file = RlConstant.HandlerChain_PATH)
@WebService(name = RlConstant.Name_HouseHoldData, serviceName = RlConstant.ServiceName_HouseHoldData, targetNamespace = RlConstant.Namespace_RL)
public interface RlGetPersonalHouseHoldDataWS {

    final static String ERR_MSG_Rldf004h = "getRldf004hError: 「取得除戶個人基本資料」失敗";
    final static String ERR_MSG_Rldf004m = "getRldf004mError: 「取得現戶個人基本資料」失敗";

    /**
     * 取得現戶個人基本資料檔
     * 
     * @param rldfDTO
     *            (personId 國民身分證統一編號,siteId 作業點代碼)
     * @param executant
     *            使用者資訊
     * @return List
     * 
     * @throws RisBusinessException
     *             取得現戶個人基本資料檔失敗
     */
    @WebResult(name = "Rldf004m", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf004mType> getPersonalHouseHoldData(
            @WebParam(name = "RlGetPersonDataDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonIdDTO rlGetPersonIdDTO,
            @WebParam(name = "executant", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;

    /**
     * 取得除戶個人基本資料檔
     * 
     * @param rldfDTO
     *            (personId 國民身分證統一編號,siteId 作業點代碼,householeHeadId
     *            戶長統號,householeId 戶號,removeYyymmdd 除戶日期,removeTime 除戶時間)
     * @param executant
     *            使用者資訊
     * @return List
     * 
     * @throws RisBusinessException
     *             取得除戶個人基本資料檔失敗
     */
    @WebResult(name = "Rldf004h", targetNamespace = RlConstant.Namespace_RIS)
    public List<Rldf004hType> getPersonalHouseHoldRemoveData(
            @WebParam(name = "RlGetPersonRemoveDataDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlGetPersonRemoveDataDTO rlGetPersonRemoveDataDTO,
            @WebParam(name = "executant", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException;
}
