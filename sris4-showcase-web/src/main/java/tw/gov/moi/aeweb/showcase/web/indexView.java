package tw.gov.moi.aeweb.showcase.web;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.primefaces.event.ToggleEvent;

@ManagedBean
public class indexView{
	
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
	
	public void queryData(ActionEvent actionEvent){
		name = "王ＯＯ";
		
		SimpleDateFormat simple = new SimpleDateFormat();

		try {
			simple.applyPattern("yyyy-MM-dd HH:mm:ss");
			birthday = simple.parse("1986-1-1 13:13:13");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		bornway = "婚生";
		city = "新北市";
		type = "次男";
		addr = "新北市板橋區縣民大道";
		spouse = "ＯＯＯ";
		father = "王爸爸";
		mather = "王媽媽";
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
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Toggled", "Visibility:" + event.getVisibility());
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
}