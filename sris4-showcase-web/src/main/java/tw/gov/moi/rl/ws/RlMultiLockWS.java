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
import tw.gov.moi.rl.domain.PersonDataDTO;
import tw.gov.moi.rl.domain.RlCommitUnlockRecDTO;
import tw.gov.moi.rl.domain.RlMultiLockRequestDto;
import tw.gov.moi.rl.domain.RlMultiLockResponseDto;
import tw.gov.moi.rs.common.constant.RsConstant;
import tw.gov.moi.rs.domain.RsLockInforDTO;
import tw.gov.moi.rs.domain.RsLockTableWSCheckTokenTypeDTO;

/**
 * 資料鎖定與解除鎖定服務介面.
 * 
 * @author morris.jou
 */
@SOAPBinding(style = Style.DOCUMENT)
@HandlerChain(file = RlConstant.HandlerChain_PATH)
@WebService(name = RlConstant.Name_MultiLock, serviceName = RlConstant.ServiceName_MultiLock, targetNamespace = RlConstant.Namespace_RL)
public interface RlMultiLockWS   {
    
    public void commitUnlockRec(
            @WebParam(name = "RlCommitUnlockRecDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlCommitUnlockRecDTO rlCommitUnlockRecDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException ;
    
    public void unlockByPersonInfo(
            @WebParam(name = "PersonDataDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) PersonDataDTO personDataDTO,
            @WebParam(name = "ExecutantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant)
            throws RisBusinessException ;
   
    @WebResult(name = "RlMultiLockResponseDto", targetNamespace = RlConstant.Namespace_RL_DOMAIN)
    public RlMultiLockResponseDto multiLock(@WebParam(name = "RlMultiLockRequestDto", targetNamespace = RlConstant.Namespace_RL_DOMAIN)final RlMultiLockRequestDto requestDto);
    
    
    @WebResult(name = "RsLockInforDTO", targetNamespace = RsConstant.NAME_SPACE_RS_DOMAIN )
    public RsLockInforDTO getLockInfo(@WebParam(name = "RsLockTableWSCheckTokenTypeDTO", targetNamespace = RsConstant.NAME_SPACE_RS_DOMAIN)final RsLockTableWSCheckTokenTypeDTO requestDto);
    
    @WebResult(name = "RsLockInforDTO2", targetNamespace = RsConstant.NAME_SPACE_RS_DOMAIN )
    public RsLockInforDTO checkLocalAllLocksById(@WebParam(name = "RsLockTableWSCheckTokenTypeDTO", targetNamespace = RsConstant.NAME_SPACE_RS_DOMAIN)final RsLockTableWSCheckTokenTypeDTO requestDto);
}
