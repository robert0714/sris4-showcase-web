package tw.gov.moi.rl.ws;

import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.domain.RlGetMultiDataRequestDto;
import tw.gov.moi.rl.domain.RlGetMultiDataResponseDto;
import tw.gov.moi.rl.domain.RlRemoteCommandRequestDto;
import tw.gov.moi.rl.domain.RlRemoteCommandResponseDto;

@SOAPBinding(style = Style.DOCUMENT)
@HandlerChain(file = RlConstant.HandlerChain_PATH)
@WebService(name = RlConstant.Name_RlGetMultiData, serviceName = RlConstant.ServiceName_RlGetMultiData, targetNamespace = RlConstant.Namespace_RL)
public interface RlGetMultiDataWs {
    
    @WebResult(name = "RlGetMultiDataResponseDto", targetNamespace = RlConstant.Namespace_RL_DOMAIN)
    public RlGetMultiDataResponseDto retrieveMultiDataAndLock(@WebParam(name = "RlGetMultiDataRequestDto", targetNamespace = RlConstant.Namespace_RL_DOMAIN)final RlGetMultiDataRequestDto requestDto)throws RisBusinessException;
    
    
    @WebResult(name = "RlRemoteCommandResponseDto", targetNamespace = RlConstant.Namespace_RL_DOMAIN)
    public RlRemoteCommandResponseDto remoteCommand(@WebParam(name = "RlRemoteCommandRequestDto", targetNamespace = RlConstant.Namespace_RL_DOMAIN)final RlRemoteCommandRequestDto requestDto)throws RisBusinessException;
}
