package tw.gov.moi.aeweb.showcase.web;

import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.primefaces.event.ToggleEvent;

@ManagedBean
public class demoView {

	private String oldId;
	private String name;
	private Date birthday;
	private String bornway;
	private String city;
	private String type;
	private String addr;
	private String spouse;
	private String father;
	private String mather;
	private String newId;
	private String memo;

	private Date date1;
	private boolean showStep1 = true;
	private boolean showStep2 = false;
	private boolean showStep3 = false;

	public void handleStep2Event() {
		showStep1 = true;
		showStep2 = true;
		showStep3 = false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBornway() {
		return bornway;
	}

	public void setBornway(String bornway) {
		this.bornway = bornway;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getSpouse() {
		return spouse;
	}

	public void setSpouse(String spouse) {
		this.spouse = spouse;
	}

	public String getFather() {
		return father;
	}

	public void setFather(String father) {
		this.father = father;
	}

	public String getMather() {
		return mather;
	}

	public void setMather(String mather) {
		this.mather = mather;
	}

	public String getNewId() {
		return newId;
	}

	public void setNewId(String newId) {
		this.newId = newId;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public void handleToggle(ToggleEvent event) {
		final FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Toggled",
				"Visibility:" + event.getVisibility());
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public String getOldId() {
		return oldId;
	}

	public void setOldId(String oldId) {
		this.oldId = oldId;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Date getDate1() {
		return this.date1;
	}

	public void setDate1(Date date1) {
		this.date1 = date1;
	}

	public boolean isShowStep1() {
		return this.showStep1;
	}

	public void setShowStep1(boolean showStep1) {
		this.showStep1 = showStep1;
	}

	public boolean isShowStep2() {
		return this.showStep2;
	}

	public void setShowStep2(boolean showStep2) {
		this.showStep2 = showStep2;
	}

	public boolean isShowStep3() {
		return this.showStep3;
	}

	public void setShowStep3(boolean showStep3) {
		this.showStep3 = showStep3;
	}
}