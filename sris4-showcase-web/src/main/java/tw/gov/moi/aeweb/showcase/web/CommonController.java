package tw.gov.moi.aeweb.showcase.web;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.apache.commons.lang3.StringUtils;
import org.apache.myfaces.extensions.cdi.core.api.scope.conversation.WindowScoped;
import org.primefaces.context.RequestContext;
import org.primefaces.model.StreamedContent;

import com.iisigroup.udeweb.jsf.UDEWebController;
import com.iisigroup.udeweb.jsf.springbridge.SpringBridge;

import tw.gov.moi.ae.AECDMesg;
import tw.gov.moi.aeweb.BaseRisController;
import tw.gov.moi.aeweb.exception.RisWebException;

import tw.gov.moi.aeweb.showcase.common.IDMaker;
import tw.gov.moi.aeweb.showcase.common.Rl0171cVO;

import tw.gov.moi.aeweb.showcase.common.TestingDTO;
import tw.gov.moi.aeweb.showcase.model.ClientVO;

@Named("commonController")
@WindowScoped
@SpringBridge
@UDEWebController
public class CommonController extends BaseRisController {

	// ================================================
	// == [Enumeration types] Block Start
	// == [Enumeration types] Block End
	// ================================================
	// == [static variables] Block Start
	private static final long serialVersionUID = 1L;

	/** Logger Object. */
	@SuppressWarnings("unused")
	private static final org.slf4j.Logger LOGGER = org.slf4j.LoggerFactory.getLogger(CommonController.class);

	// == [static variables] Block Stop
	// ================================================
	// == [instance variables] Block Start.

	private TestingDTO sample;

	// TODO 練習用
	private Rl0171cVO rl0171cVO;

	private StreamedContent file;

	// == [instance variables] Block Stop
	// ================================================
	// == [static Constructor] Block Start
	// == [static Constructor] Block Stop
	// ================================================
	// == [Constructors] Block Start (含init method)

	@PostConstruct
	public void init() {
		this.sample = new TestingDTO();

		this.rl0171cVO = new Rl0171cVO();
		// InputStream stream =
		// this.getClass().getResourceAsStream("yourfile.pdf");
		// this.file = new DefaultStreamedContent(stream, "application/pdf",
		// "downloaded_file.pdf");
		clientVOs = new ArrayList<>();
		ClientVO clientVo = new ClientVO();
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
		changeCauses = new HashMap<String, String>();
		changeCauses.put("身分證號重複", "idIsBad");
		changeCauses.put("身分證號碼不佳", "idIsBad2");
	}

	// == [Constructors] Block Stop
	// ================================================
	// == [Static Method] Block Start
	// == [Static Method] Block Stop
	// ================================================
	// == [Accessor] Block Start

	public TestingDTO getSample() {
		return this.sample;
	}

	// == [Accessor] Block Stop
	// ================================================
	// == [Overrided Method] Block Start (Ex. toString/equals+hashCode)
	// == [Overrided Method] Block Stop
	// ================================================
	// == [Method] Block Start
	// ####################################################################
	// ## [Method] sub-block :
	// ####################################################################

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

	public void actionTest() {
		LOGGER.debug("test : {}", this.sample);
		this.risFacesTool.addMessage(AECDMesg.AE0001S);
	}

	// == [Method] Block Stop
	// ================================================
	// == [Inner Class] Block Start
	// == [Inner Class] Block Stop
	// ================================================

	private List<ClientVO> clientVOs;
	private boolean clientHasRender = false;
	private String clientID;
	private ClientVO renderedClientVO;
	private Map<String, String> changeCauses;
	private String changeCause;
	private String mixText = "請選擇變更原因";
	private boolean hasControlBtn = false;
	private boolean hasMakeForm = false;

	public void renderClient() {

		System.out.println("input clientID = " + clientID);
		for (int i = 0; i < clientVOs.size(); i++) {
			ClientVO clientVO = clientVOs.get(i);
			if (clientVO.getClientID().equalsIgnoreCase(this.clientID)) {
				renderedClientVO = clientVO;
				break;
			}
		}
		if (renderedClientVO == null) {
			System.out.println("no match clientID use defualt");
			renderedClientVO = clientVOs.get(0);
		}

		clientHasRender = true;

	}

	public void causeOnChange2() {
		System.out.println("cause has changed !");
		System.out.println("changeCause = " + changeCause);
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		java.util.Date date = new java.util.Date();
		if ("idIsBad".equals(changeCause)) {
			mixText = renderedClientVO.getClientName() + " 於  " + dateFormat.format(date) + " 因  身分證號重複  申請變更身分證號碼 \n"
					+ "原身分證號 : " + renderedClientVO.getClientID() + " 變更為: " + renderedClientVO.getClientNewId();
		} else if ("idIsBad2".equals(changeCause)) {
			mixText = renderedClientVO.getClientName() + " 於  " + dateFormat.format(date) + " 因  身分證號碼不佳  申請變更身分證號碼 \n "
					+ "原身分證號 : " + renderedClientVO.getClientID() + " 變更為: " + renderedClientVO.getClientNewId();
		}

		hasControlBtn = true;
	}

	public void makeNewID() {
		System.out.println("make new ID ! ");
		renderedClientVO.setClientNewId("H987654321");
	}

	public void makeForm() {
		System.out.println("make form!!");
		hasMakeForm = true;
	}

	public void doCancel2() {
		System.out.println("cancel everthing! ");
		renderedClientVO.setClientNewId("");
		renderedClientVO = null;
		clientHasRender = false;
		hasControlBtn = false;
		hasMakeForm = false;
	}

	public void doApply() {
		System.out.println("apply Form!");
	}
	// getter and setter

	public Map<String, String> getChangeCauses() {
		return changeCauses;
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

	public void setChangeCauses(Map<String, String> changeCauses) {
		this.changeCauses = changeCauses;
	}

	public String getChangeCause() {
		return changeCause;
	}

	public void setChangeCause(String changeCause) {
		this.changeCause = changeCause;
	}

	public String getMixText() {
		return mixText;
	}

	public void setMixText(String mixText) {
		this.mixText = mixText;
	}

	// 控制前端顯示區塊 TODO
	private boolean hide001;
	private boolean hide002;
	private boolean hide003;
	private boolean hide004;
	private boolean hide005;

	private boolean showcol;

	private String inputPersonID;
	private String newIDMark;

	public Rl0171cVO getRl0171cVO() {
		return rl0171cVO;
	}

	public String getInputPersonID() {
		return inputPersonID;
	}

	public void setInputPersonID(String inputPersonID) {
		this.inputPersonID = inputPersonID;
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

	public boolean isHasControlBtn() {
		return hasControlBtn;
	}

	public void setHasControlBtn(boolean hasControlBtn) {
		this.hasControlBtn = hasControlBtn;
	}

	public boolean isHasMakeForm() {
		return hasMakeForm;
	}

	public void setHasMakeForm(boolean hasMakeForm) {
		this.hasMakeForm = hasMakeForm;
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
	public void getNewId() {
		newIDMark = IDMaker.getNewIdMark(rl0171cVO.getPlaceOfBirth(), "MAN");
	}

	// 載入統一編號更正登記畫面
	public void loadPage() {
		// qry身分證統一編號是否正確 & 是否有申請單
		if (inputPersonID.length() == 0 || inputPersonID.length() < 10) {
			if (hide001) {
				rl0171cVO = new Rl0171cVO();
				hide001 = false;
				hide002 = false;
			}

			showErrorMessage("請輸入國民身分證統一編號(長度為10碼)");
		} else if (!rl0171cVO.isOrder()) {
			createSampleData();

			hide001 = true;
			hide002 = true;
			hide003 = false;
			hide004 = false;
			hide005 = false;
			showcol = false;
		}
	}

	// 取消執行統一編號更正登記
	public String doCancel() {
		hide001 = false;
		hide002 = false;

		newIDMark = "";

		changeCause = "empty";

		rl0171cVO = new Rl0171cVO();

		return "";
	}

	// 刪除統一編號更正登記資料
	public void doDelete() {
		rl0171cVO = new Rl0171cVO();
		newIDMark = "";
		hide001 = false;
		hide002 = false;
		hide003 = false;
		hide004 = false;
		hide005 = false;
		showcol = false;
	}

	// 執行資料驗證並自動組合記事
	public void verifyAppData() {
		if (newIDMark == null || newIDMark.length() == 0 || newIDMark.length() < 10) {
			showErrorMessage("新變更統一編號 不可為空值");
		} else if (changeCause.equals("empty")) {
			showErrorMessage("請選擇組合記事更變原因");
		} else {
			rl0171cVO.setOrderNumber("A160XXXXXXXX");

			hide002 = false;
			hide003 = true;
			showcol = true;
		}
	}

	public void submit() {
		hide003 = false;
		hide004 = true;
		hide005 = true;
		// todo
	}

	public void back() {
		rl0171cVO.setOrderNumber("");
		// String oldnote = sample.getNotebook();
		// oldnote = oldnote.substring(0, oldnote.indexOf("變更統一編號測試組合記事資料"));
		mixText = rl0171cVO.getNotebook();
		// 原登記國民身分證統一編號為××××××××××係錯誤（誤錄、誤報、不符配賦邏輯、性別變更、性別錯誤、出生別錯誤）民國×××年××月××日更正（經×××戶政事務所逕為更正登記）。

		// sample.setNotebook(oldnote);
		changeCause = "empty";

		hide002 = true;
		hide003 = false;
		showcol = false;
	}

	public void causeOnChange() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		java.util.Date date = new java.util.Date();

		if ("idIsBad".equals(changeCause)) {
			mixText = rl0171cVO.getNotebook() + rl0171cVO.getPersonName() + " 於  " + dateFormat.format(date)
					+ " 因  身分證號重複  申請變更身分證號碼";
		} else if ("idIsBad2".equals(changeCause)) {
			mixText = rl0171cVO.getNotebook() + rl0171cVO.getPersonName() + " 於  " + dateFormat.format(date)
					+ " 因  身分證號碼不佳  申請變更身分證號碼";
		} else if ("empty".equals(changeCause)) {
			mixText = rl0171cVO.getNotebook();
		}
	}

	// 儲存統一編號更正登記申請資料至XLDF Table
	public void saveXLDF() {
		rl0171cVO.setOrder(true);
		hide005 = false;
	}

	// 檢核是否已完成「資料驗證」
	private boolean checkIsVerifyData() {

		return true;
	}

	private void createSampleData() {
		rl0171cVO.setPersonID(inputPersonID);
		rl0171cVO.setPersonName("謝旻諺");
		rl0171cVO.setBornIdentity("婚生");
		rl0171cVO.setPlaceOfBirth("10007彰化縣");
		rl0171cVO.setBirthOrder("長男");
		rl0171cVO.setAddress("新北市板橋區中山路");
		rl0171cVO.setSpouseName("無");
		rl0171cVO.setFatherName("謝父");
		rl0171cVO.setMotherName("謝母");

		rl0171cVO.setBirthYear("73");
		rl0171cVO.setBirthMonth("01");
		rl0171cVO.setBirthDay("25");

		rl0171cVO.setNotebook("謝旻諺 統一編號××××××××××民國×73年01月25日出生（經××× 戶政事務所核准逕為出生登記）。");

		mixText = rl0171cVO.getNotebook();
	}

	private void showErrorMessage(String errorStr) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "錯誤", errorStr);
		RequestContext.getCurrentInstance().showMessageInDialog(message);
	}
}
