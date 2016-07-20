package tw.gov.moi.rl.ws;

import javax.jws.HandlerChain;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.domain.Rl2Er04DTO;

@SOAPBinding(style = Style.DOCUMENT)
@HandlerChain(file = RlConstant.HandlerChain_PATH)
@WebService(name = "RlRldf2FilesWS", serviceName = "RlRldf2FilesWSService", targetNamespace = RlConstant.Namespace_RL)
public interface RlRldf2FilesWS {

    @WebResult(name = "Rl2Er04DTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN)
    void runRlRldf2FilesWSImpl(//
            @WebParam(name = "Rl2Er04DTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) Rl2Er04DTO dto,//
            @WebParam(name = "executant", targetNamespace = RlConstant.Namespace_AE) ExecutantType executant);
}
