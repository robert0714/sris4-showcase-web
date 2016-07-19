package tw.gov.moi.rl.ws;

import javax.jws.HandlerChain;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import tw.gov.moi.ae.domain.ExecutantType;
import tw.gov.moi.domain.Rldf012dType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.domain.RlIdCardMaterialDTO;

/**
 * 查詢鄉鎮市區戶政資訊系統空白身分證及膠膜狀態Web服務
 */
@SOAPBinding(style = Style.DOCUMENT)
@HandlerChain(file = RlConstant.HandlerChain_PATH)
@WebService(name = RlConstant.Name_RlIdCardMaterialWS, serviceName = RlConstant.ServiceName_RlIdCardMaterialWS, targetNamespace = RlConstant.Namespace_RL)
public interface RlIdCardMaterialWS {

    /**
     * 取得空白國民身分證及膠膜使用記錄
     * 
     * @param rlIdCardMaterialDto
     * @param executantType
     * @return
     * @throws RisBusinessException
     */
    @WebResult(name = "Rldf012d", targetNamespace = RlConstant.Namespace_RIS)
    public Rldf012dType getRldf012d(
            @WebParam(name = "rlIdCardMaterialDto", targetNamespace = RlConstant.Namespace_RIS) RlIdCardMaterialDTO rlIdCardMaterialDto,
            @WebParam(name = "executantType", targetNamespace = RlConstant.Namespace_AE) ExecutantType executantType)
            throws RisBusinessException;

}
