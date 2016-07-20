package tw.gov.moi.rl.ws;


import javax.jws.HandlerChain;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rl.domain.RlRequestRetrieveRLDFTableDataDTO;
import tw.gov.moi.rl.domain.RlRequestRetrieveTableDataBySQLDTO;
import tw.gov.moi.rl.domain.RlRequestRetrieveTableDataBySQLsDTO;
import tw.gov.moi.rl.domain.RlResponseRetrieveRLDFTableDataBySQLDTO;
import tw.gov.moi.rl.domain.RlResponseRetrieveRLDFTableDataBySQLsDTO;
import tw.gov.moi.rl.domain.RlResponseRetrieveRLDFTableDataDTO;

@SOAPBinding(style = Style.DOCUMENT)
@HandlerChain(file = RlConstant.HandlerChain_PATH)
@WebService(name = RlConstant.Name_RlRetrieveRLDFTableData, serviceName = RlConstant.ServiceName_RlRetrieveRLDFTableData, targetNamespace = RlConstant.Namespace_RL)
public interface RlRetrieveRLDFTableDataWS {

    @WebResult(name = "RlResponseRetrieveRLDFTableDataDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN)
    public RlResponseRetrieveRLDFTableDataDTO retrieveRLDFTableData(
            @WebParam(name = "RlRequestRetrieveRLDFTableDataDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlRequestRetrieveRLDFTableDataDTO dto);
    
    @WebResult(name = "RlResponseRetrieveRLDFTableDataBySQLDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN)
    public RlResponseRetrieveRLDFTableDataBySQLDTO retrieveTableDataBySQL(
            @WebParam(name = "RlRequestRetrieveTableDataBySQLDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlRequestRetrieveTableDataBySQLDTO dto);
    
   
    @WebResult(name = "RlResponseRetrieveRLDFTableDataBySQLsDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN)
    public RlResponseRetrieveRLDFTableDataBySQLsDTO retrieveTableDataBySQLs( 
	    @WebParam(name = "RlRequestRetrieveTableDataBySQLsDTO", targetNamespace = RlConstant.Namespace_RL_DOMAIN) RlRequestRetrieveTableDataBySQLsDTO dto) ;
}
