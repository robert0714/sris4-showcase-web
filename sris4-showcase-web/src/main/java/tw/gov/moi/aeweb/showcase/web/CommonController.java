package tw.gov.moi.aeweb.showcase.web;

import java.io.InputStream;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.apache.commons.lang3.StringUtils;
import org.apache.myfaces.extensions.cdi.core.api.scope.conversation.WindowScoped;
import org.primefaces.context.RequestContext;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

import com.iisigroup.udeweb.jsf.UDEWebController;
import com.iisigroup.udeweb.jsf.springbridge.SpringBridge;

import tw.gov.moi.ae.AECDMesg;
import tw.gov.moi.aeweb.BaseRisController;
import tw.gov.moi.aeweb.exception.RisWebException;
import tw.gov.moi.aeweb.showcase.common.IDMaker;
import tw.gov.moi.aeweb.showcase.common.TestingDTO;

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
        InputStream stream = this.getClass().getResourceAsStream("yourfile.pdf");
        this.file = new DefaultStreamedContent(stream, "application/pdf", "downloaded_file.pdf");
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
    	System.err.println("this test method~~~~");
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

    
    public void actionTest() {
        LOGGER.debug("test : {}", this.sample);
        this.risFacesTool.addMessage(AECDMesg.AE0001S);
    }
    
    
    // 控制前端顯示區塊
    private boolean hide001;
    private boolean hide002;
    private boolean hide003;
    private boolean hide004;
    private boolean hide005;
    
    private boolean isQuery;
    private boolean isVerify;
    private boolean isApply;
    private boolean isDone;
    
    private String legend;
    
    private boolean showcol;
    
    private String intputPersonID;
    private String newIDMark;
    
    
   
	public String getIntputPersonID() {
		return intputPersonID;
	}

	public void setIntputPersonID(String intputPersonID) {
		this.intputPersonID = intputPersonID;
	}

	public void setNewIDMark(String newIDMark) {
		this.newIDMark = newIDMark;
	}

	
	public String getNewIDMark() {
		return newIDMark;
	}

	public boolean isHide001() {
		return hide001;
	}

	public void setHide001(boolean hide001) {
		this.hide001 = hide001;
	}

	public boolean isHide002() {
		return hide002;
	}

	public void setHide002(boolean hide002) {
		this.hide002 = hide002;
	}

	public boolean isHide003() {
		return hide003;
	}

	public void setHide003(boolean hide003) {
		this.hide003 = hide003;
	}

	public boolean isHide004() {
		return hide004;
	}

	public void setHide004(boolean hide004) {
		this.hide004 = hide004;
	}
	
	public boolean isHide005() {
		return hide005;
	}

	public void setHide005(boolean hide005) {
		this.hide005 = hide005;
	}

	
	
	public boolean isShowcol() {
		return showcol;
	}

	public void setShowcol(boolean showcol) {
		this.showcol = showcol;
	}

	// 取得新統一編號
    public void getNewId()
    {
    	newIDMark = IDMaker.getNewIdMark(sample.getPlaceOfBirth(), "MAN");
    	sample.setNotebook("袁明聖 統一編號"+newIDMark+"民國"+sample.getBirthYear()+"年"+sample.getBirthMonth()+"月"+sample.getBirthDay()
		+"日出生（經××× 戶政事務所核准逕為出生登記）。");
    }
    
    // 載入統一編號更正登記畫面
 	public void loadPage()
 	{
 		// qry身分證統一編號是否正確 & 是否有申請單
 		if (intputPersonID.length() == 0 || 
			intputPersonID.length() < 10)
 		{
 			if (hide001)
 	 		{
 	 			sample = new TestingDTO();
 	 			hide001 = false;
 	 			hide002 = false;
 	 		}
 			
 			showErrorMessage("請輸入國民身分證統一編號(長度為10碼)");
 		}
 		else if (!sample.isOrder())
 		{
	 		createSampleData();
	
	 		isQuery = true;
	 		isVerify = false;
	 		isApply = false;
	 		
	 		legend = "變更統一編號";
	 		
	 		hide001 = true;
	 		hide002 = true;
	 		hide003 = false;
	 		hide004 = false;
	 		hide005 = false;
	 		showcol = false;
 		}
 	}	
 	
	
    // 取消執行統一編號更正登記
	public String doCancel()
	{
		
		
		hide001 = false;
		hide002 = false;
		
		
		
		newIDMark = "";
		
		sample = new TestingDTO();	
		
		return "";
	}
	
	// 刪除統一編號更正登記資料
	public void doDelete()
	{
		sample = new TestingDTO();
		newIDMark = "";
		hide001 = false;
 		hide002 = false;
 		hide003 = false;
 		hide004 = false;
 		hide005 = false;
 		showcol = false;
 		
 		isQuery = false;
 		isVerify = false;
 		isApply = false;
 		isDone = false;
	}
	
	// 執行資料驗證並自動組合記事
	public void verifyAppData()
	{
		if (newIDMark == null ||
			newIDMark.length() == 0 || 
			newIDMark.length() < 10)
 		{
			showErrorMessage("新變更統一編號 不可為空值");
 		}
 		else
 		{
 			
			sample.setOrderNumber("A160XXXXXXXX");
			String oldnote = sample.getNotebook();
			sample.setNotebook(oldnote + "變更統一編號測試組合記事資料");
			
			setIsVerify(true);
			legend = "申請單號:A0000116";
			
			hide002 = false;
			hide003 = true;
			showcol = true;
 		}
	}
	
	public void submit()
	{
		hide003 = false;
		hide004 = true;
		hide005 = true;
		
		isApply = true;
		isDone = true;
		// todo
	}
	
	public void back()
	{
		sample.setOrderNumber("");
		String oldnote = sample.getNotebook();
		oldnote = oldnote.substring(0, oldnote.indexOf("變更統一編號測試組合記事資料"));
		
		sample.setNotebook(oldnote);
		
		hide002 = true;
		hide003 = false;
		showcol = false;
	}
	
	// 儲存統一編號更正登記申請資料至XLDF Table
	public void saveXLDF()
	{
		sample.setOrder(true);
		hide005 = false;
		isDone = false;
	}
	
	// 檢核是否已完成「資料驗證」
	private boolean checkIsVerifyData()
	{
		
		return true;
	}
	
	private void createSampleData()
	{
		sample.setPersonID(intputPersonID);
		sample.setPersonName("袁明聖");
		sample.setBornIdentity("婚生");
		sample.setPlaceOfBirth("10007彰化縣");
		sample.setBirthOrder("次男");
		sample.setAddress("桃園市中壢區慈惠一街");
		sample.setSpouseName("無");
		sample.setFatherName("袁父");
		sample.setMotherName("袁母");
		
		sample.setBirthYear("78");
		sample.setBirthMonth("10");
		sample.setBirthDay("15");
		
	}
	
	private void showErrorMessage(String errorStr)
	{
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "錯誤", errorStr);
		RequestContext.getCurrentInstance().showMessageInDialog(message);
	}

	public boolean getIsQuery() {
		return isQuery;
	}

	public void setIsQuery(boolean isQuery) {
		this.isQuery = isQuery;
	}

	public boolean getIsVerify() {
		return isVerify;
	}

	public void setIsVerify(boolean isVerify) {
		this.isVerify = isVerify;
	}

	public String getLegend() {
		return legend;
	}

	public void setLegend(String legend) {
		this.legend = legend;
	}

	public boolean getIsApply() {
		return isApply;
	}

	public void setIsApply(boolean isApply) {
		this.isApply = isApply;
	}

	public boolean getIsDone() {
		return isDone;
	}

	public void setIsDone(boolean isDone) {
		this.isDone = isDone;
	}

}
