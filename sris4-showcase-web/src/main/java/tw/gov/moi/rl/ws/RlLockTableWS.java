/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.ws;

import javax.jws.HandlerChain;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rs.common.constant.RsConstant;
import tw.gov.moi.rs.domain.RsLockTableWSCheckLockDTO;
import tw.gov.moi.rs.domain.RsLockTableWSCheckLockTypeDTO;
import tw.gov.moi.rs.domain.RsLockTableWSCheckTokenTypeDTO;
import tw.gov.moi.rs.domain.RsLockTableWSGetPersonTokenDTO;
import tw.gov.moi.rs.domain.RsLockTableWSLockDTO;
import tw.gov.moi.rs.domain.RsLockTableWSReturnPersonTokenDTO;
import tw.gov.moi.rs.domain.RsLockTableWSUnlockDTO;
import tw.gov.moi.rs.ws.RsLockTableWs;

/**
 * 資料鎖定與解除鎖定服務介面.
 * 
 * @author morris.jou
 */
@SOAPBinding(style = Style.DOCUMENT)
@HandlerChain(file = RlConstant.HandlerChain_PATH)
@WebService(name = RlConstant.Name_LockTable, serviceName = RlConstant.ServiceName_LockTable, targetNamespace = RlConstant.Namespace_RL)
public interface RlLockTableWS extends RsLockTableWs {

    /** WS 鎖定失敗. **/
    final static String ERR_MSG_1 = "WS 鎖定失敗";

    /** WS 解鎖失敗. **/
    final static String ERR_MSG_2 = "WS 解鎖失敗";

    /** WS 檢核鎖定失敗. **/
    final static String ERR_MSG_3 = "WS 檢核鎖定失敗";

    /** WS 檢核鎖定型態失敗. **/
    final static String ERR_MSG_4 = "WS 檢核鎖定型態失敗";

    /**
     * 資料鎖定.
     * 
     * @param destSiteId
     *            目的端作業點代碼
     * @param targetType
     *            鎖定的資料的資料物件名稱
     * @param keys
     *            鎖定的資料的資料物件 keys
     * @param values
     *            鎖定的資料的資料物件 keys's values
     * @param executantType
     *            the executant type
     * @param actionIp
     *            the action ip
     * @throws RisBusinessException
     *             the dB exception
     */
    @WebResult(name = "lockResult", targetNamespace = RlConstant.Namespace_RIS)
    public void lock(
            @WebParam(name = "dto", targetNamespace = RsConstant.NAME_SPACE_RS_DOMAIN) RsLockTableWSLockDTO dto,
            @WebParam(name = "executantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executantType)
            throws RisBusinessException;

    /**
     * 解除資料鎖定.
     * 
     * @param targetType
     *            鎖定的資料的資料物件名稱
     * @param keys
     *            鎖定的資料的資料物件 keys
     * @param values
     *            鎖定的資料的資料物件 keys's values
     * @param actionId
     *            交易序號
     * @param siteId
     *            作業點代碼
     * @throws RisBusinessException
     *             the dB exception
     */
    @WebResult(name = "unlockResult", targetNamespace = RlConstant.Namespace_RIS)
    public void unlock(
            @WebParam(name = "dto", targetNamespace = RsConstant.NAME_SPACE_RS_DOMAIN) RsLockTableWSUnlockDTO dto)
            throws RisBusinessException;

    /**
     * 檢查鎖定.
     * 
     * @param targetType
     *            鎖定的資料的資料物件名稱
     * @param keys
     *            鎖定的資料的資料物件 keys
     * @param values
     *            鎖定的資料的資料物件 keys's values
     * @param siteId
     *            作業點代碼
     * @return true 已有相同鎖定資料，false 未有相同鎖定資料
     * @throws RisBusinessException
     *             the ris business exception
     */
    @WebResult(name = "checkLockResult", targetNamespace = RlConstant.Namespace_RIS)
    public boolean checkLock(
            @WebParam(name = "dto", targetNamespace = RsConstant.NAME_SPACE_RS_DOMAIN) RsLockTableWSCheckLockDTO dto)
            throws RisBusinessException;

    /**
     * 檢查鎖定的型態，判別是否有相同鎖定資料.
     * 
     * @param targetType
     *            鎖定的資料的資料物件名稱
     * @param keys
     *            鎖定的資料的資料物件 keys
     * @param values
     *            鎖定的資料的資料物件 keys's values
     * @param actionId
     *            鎖定資料的單位
     * @param siteId
     *            作業點代碼
     * @return the int 回傳鎖定型態，0 表示未有相同的鎖定資料，1 被自己鎖定，2 被其他人鎖定
     * @throws RisBusinessException
     *             the ris business exception
     */
    @WebResult(name = "checkLockTypeResult", targetNamespace = RlConstant.Namespace_RIS)
    public int checkLockType(
            @WebParam(name = "dto", targetNamespace = RsConstant.NAME_SPACE_RS_DOMAIN) RsLockTableWSCheckLockTypeDTO dto)
            throws RisBusinessException;

    /**
     * token lock.
     * 
     * @param personIds
     *            統號
     * @param actionId
     *            交易序號
     * @param userId
     *            使用者帳號
     * @param siteId
     *            作業點代碼
     * @param actionIp
     *            IP address
     * @return 交易序號
     * @throws RisBusinessException
     *             the ris business exception
     */
    @WebResult(name = "tokenLockResult", targetNamespace = RlConstant.Namespace_RIS)
    String getPersonToken(
            @WebParam(name = "dto", targetNamespace = RsConstant.NAME_SPACE_RS_DOMAIN) RsLockTableWSGetPersonTokenDTO dto)
            throws RisBusinessException;

    /**
     * token unLock.
     * 
     * @param actionId
     *            交易序號
     * @param siteId
     *            作業點代碼
     * @throws RisBusinessException
     *             the ris business exception
     */
    @WebResult(name = "tokenUnLockResult", targetNamespace = RlConstant.Namespace_RIS)
    void returnPersonToken(
            @WebParam(name = "dto", targetNamespace = RsConstant.NAME_SPACE_RS_DOMAIN) RsLockTableWSReturnPersonTokenDTO dto)
            throws RisBusinessException;

    /**
     * token check lock.
     * 
     * @param actionId
     *            鎖定資料的單位
     * @param personId
     *            統號
     * @param siteId
     *            作業點代碼
     * @return the int 回傳鎖定型態，0 表示未有相同的鎖定資料，1 被自己鎖定，2 被其他人鎖定
     * @throws RisBusinessException
     *             the ris business exception
     */
    @WebResult(name = "checkTokenTypeResult", targetNamespace = RlConstant.Namespace_RIS)
    int checkTokenType(
            @WebParam(name = "dto", targetNamespace = RsConstant.NAME_SPACE_RS_DOMAIN) RsLockTableWSCheckTokenTypeDTO dto)
            throws RisBusinessException;
}
