package tw.gov.moi.aeweb.showcase.web;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Date;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.apache.commons.lang3.StringUtils;
import org.apache.myfaces.extensions.cdi.core.api.scope.conversation.WindowScoped;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

import com.iisigroup.udeweb.jsf.UDEWebController;
import com.iisigroup.udeweb.jsf.springbridge.SpringBridge;

import tw.gov.moi.ae.AECDMesg;
import tw.gov.moi.aeweb.BaseRisController;
import tw.gov.moi.aeweb.exception.RisWebException;
import tw.gov.moi.aeweb.showcase.common.H2DataSourceTools;
import tw.gov.moi.aeweb.showcase.common.TestingDTO;
import tw.gov.moi.aeweb.showcase.model.ClientVO;

@Named("commonController")
@WindowScoped
@SpringBridge
@UDEWebController
public class CommonController extends BaseRisController {

    //================================================
    //== [Enumeration types] Block Start
    //== [Enumeration types] Block End
    //================================================
    //== [static variables] Block Start
    private static final long serialVersionUID = 1L;

    /** Logger Object. */
    @SuppressWarnings("unused")
    private static final org.slf4j.Logger LOGGER = org.slf4j.LoggerFactory.getLogger(CommonController.class);

    //== [static variables] Block Stop
    //================================================
    //== [instance variables] Block Start.

    private TestingDTO sample;

    private StreamedContent file;

    //== [instance variables] Block Stop
    //================================================
    //== [static Constructor] Block Start
    //== [static Constructor] Block Stop
    //================================================
    //== [Constructors] Block Start (含init method)

    @PostConstruct
    public void init() {
        this.sample = new TestingDTO();
//        InputStream stream = this.getClass().getResourceAsStream("yourfile.pdf");
//        this.file = new DefaultStreamedContent(stream, "application/pdf", "downloaded_file.pdf");
        clientVOs=new ArrayList<>();
        ClientVO clientVo =new ClientVO();
        clientVo.setClientID("H123456789");
        clientVo.setClientName("李威德");
        clientVo.setClientBornIdentity("婚生");
        clientVo.setClientBornLoc("桃園");
        clientVo.setClientBornOrder("次男");
        clientVo.setClientAddress("板橋火車站");
        clientVo.setClientMate("母老虎");
        clientVo.setClientFather("李爸爸");
        clientVo.setClientMother("李媽媽");
        clientVo.setClientBornDate(new Date(87, 3, 22));
        clientVOs.add(clientVo);
        
        changeCauses=new HashMap<String, String>();
        changeCauses.put("身分證號重複", "idIsBad");
        changeCauses.put("身分證號碼不佳", "idIsBad2");
    }

    //== [Constructors] Block Stop
    //================================================
    //== [Static Method] Block Start
    //== [Static Method] Block Stop
    //================================================
    //== [Accessor] Block Start

    public TestingDTO getSample() {
        return this.sample;
    }

    //== [Accessor] Block Stop
    //================================================
    //== [Overrided Method] Block Start (Ex. toString/equals+hashCode)
    //== [Overrided Method] Block Stop
    //================================================
    //== [Method] Block Start
    //####################################################################
    //## [Method] sub-block :
    //####################################################################

    public void doQuery() {
        LOGGER.debug("SAMPLE DTO : {}", this.sample);
        this.risFacesTool.addMessage(AECDMesg.AE0001S);
    }

    public void doQueryWithException() {
        LOGGER.debug("SAMPLE DTO : {}", this.sample);
        throw RisWebException.create(AECDMesg.AE9999E);
    }

    public String doQueryPage() {
        LOGGER.debug("SAMPLE DTO : {}", this.sample);
        final String viewId = FacesContext.getCurrentInstance().getViewRoot().getViewId();
        final String returnPage = StringUtils.substringAfterLast(viewId, "/");

        this.risFacesTool.addMessage(AECDMesg.AE0001S);
        LOGGER.debug("returnPage : {}", returnPage);
        return returnPage;
    }

    public String doQueryPageWithException() {
        LOGGER.debug("SAMPLE DTO : {}", this.sample);
        throw RisWebException.create(AECDMesg.AE9999E);
    }
    
    

    //== [Method] Block Stop
    //================================================
    //== [Inner Class] Block Start
    //== [Inner Class] Block Stop
    //================================================
    
    private List<ClientVO> clientVOs;
    private boolean clientHasRender = true;
    private String clientID;
    private ClientVO renderedClientVO;
    private Map<String, String> changeCauses;
    private String changeCause;
    private String mixText;
    
    
    
    public void renderClient(){
    	
    	System.out.println("input clientID = "+clientID);
    	for(int i=0;i<clientVOs.size() ;i++){
    		ClientVO clientVO=clientVOs.get(i);
    		if(clientVO.getClientID().equalsIgnoreCase(this.clientID)){
    			renderedClientVO=clientVO;
    			break;
    		}
    	}
    	if(renderedClientVO==null){
    		System.out.println("no match clientID use defualt");
    		renderedClientVO=clientVOs.get(0);
    	}
    	
    	clientHasRender=false;
    	
    }
    
    public void causeOnChange(){
    	System.out.println("cause has changed !");
    	System.out.println("changeCause = "+changeCause);
    	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    	java.util.Date date=new java.util.Date();
    	if("idIsBad".equals(changeCause)){
    		mixText=renderedClientVO.getClientName()+" 於  "+dateFormat.format(date)+" 因  身分證號重複  申請變更身分證號碼";
    	}
    	else if("idIsBad2".equals(changeCause)){
    		mixText=renderedClientVO.getClientName()+" 於  "+dateFormat.format(date)+" 因  身分證號碼不佳  申請變更身分證號碼";
    	}
    }
    public void makeNewID(){
    	System.out.println("make new ID ! ");
    	renderedClientVO.setClientNewId("H987654321");
    }
    
	public Map<String, String> getChangeCauses() {
		return changeCauses;
	}

	public void setChangeCauses(Map<String, String> changeCauses) {
		this.changeCauses = changeCauses;
	}

	public String getChangeCause() {
		return changeCause;
	}

	public void setChangeCause(String changeCause) {
		this.changeCause = changeCause;
	}

	public List<ClientVO> getClientVOs() {
		return clientVOs;
	}

	public void setClientVOs(List<ClientVO> clientVOs) {
		this.clientVOs = clientVOs;
	}

	public boolean isClientHasRender() {
		return clientHasRender;
	}

	public void setClientHasRender(boolean clientHasRender) {
		this.clientHasRender = clientHasRender;
	}

	public String getClientID() {
		return clientID;
	}

	public void setClientID(String clientID) {
		this.clientID = clientID;
	}

	public ClientVO getRenderedClientVO() {
		return renderedClientVO;
	}

	public void setRenderedClientVO(ClientVO renderedClientVO) {
		this.renderedClientVO = renderedClientVO;
	}

	public String getMixText() {
		return mixText;
	}

	public void setMixText(String mixText) {
		this.mixText = mixText;
	}
	
    
    
    
}
