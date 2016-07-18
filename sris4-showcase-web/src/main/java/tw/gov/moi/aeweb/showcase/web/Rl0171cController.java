package tw.gov.moi.aeweb.showcase.web;

import java.io.InputStream;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Named;
import javax.validation.constraints.Pattern;

import org.apache.myfaces.extensions.cdi.core.api.scope.conversation.WindowScoped;
import org.primefaces.model.DefaultStreamedContent;

import tw.gov.moi.aeweb.BaseRisController;
import tw.gov.moi.aeweb.showcase.common.PeopleInfo;
import tw.gov.moi.aeweb.showcase.common.PeopleVO;
import tw.gov.moi.aeweb.showcase.common.TestingDTO;

import com.iisigroup.udeweb.jsf.UDEWebController;
import com.iisigroup.udeweb.jsf.springbridge.SpringBridge;

@ManagedBean(name="rc")
@SessionScoped
public class Rl0171cController {
	
	
	private String id;
	private String newId;
	private String reason;
	private PeopleInfo peopleInfo;
	private PeopleVO peopleVO;
	private boolean isDisplayTable = false;
	private Boolean isDisplayMemo = false;
	private Boolean dataOK = false;
	
	
	@PostConstruct
    public void init() {
		
        peopleInfo = new PeopleInfo();
       			
    }

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	public String getNewId() {
		return newId;
	}


	public void setNewId(String newId) {
		
		this.newId = newId;
	}


	public String getReason() {
		
		System.out.println("getReason()~~~~~~~~");
		return reason;
	}


	public void setReason(String reason) {
		
		System.out.println("setReason()~~~~~~~~");
		this.reason = reason;
	}


	public PeopleVO getPeopleVO() {
		return peopleVO;
	}


	public void setPeopleVO(PeopleVO peopleVO) {
		this.peopleVO = peopleVO;
	}

	
	public boolean isDisplayTable() {
		return isDisplayTable;
	}


	public void setDisplayTable(boolean isDisplayTable) {
		this.isDisplayTable = isDisplayTable;
	}


	public String getDisplayValue() {
		
		if(isDisplayTable){
			return ("display:block");
		}else{
			return ("display:none");
		}
			
	}
	
	public String getDisplayMemo() {
		
		if(isDisplayMemo){
			return ("display:block");
		}else{
			return ("display:none");
		}
			
	}


	public void loadPage(){
		
		peopleVO = null; isDisplayTable = false;
		peopleVO = peopleInfo.people_map.get(id);
		
		if( peopleVO != null || !id.isEmpty()){
			isDisplayTable = true;
		}else{
			isDisplayTable = false;
		}
		
		System.out.println("loadPage()~~~~~~~~"+isDisplayTable);
		
		
	}
	
	
	public String calculateNewId(){
		
		System.out.println("calculateNewId()~~~~~~~~");
		this.newId = "A176968405";
		return null;
		
	}
	
	public String doCancel(){
		
			this.newId = "";
			this.reason = "";
			isDisplayMemo = false;
		
		return null;
		
	}
	
	public void verifyAppData(){
		
		System.out.println("verifyAppData()~~~~~~~~");
		dataOK = true;
		
		if( dataOK ){
			isDisplayMemo = true;
		}else{
			isDisplayMemo = false;
		}
		
		
	}

}
