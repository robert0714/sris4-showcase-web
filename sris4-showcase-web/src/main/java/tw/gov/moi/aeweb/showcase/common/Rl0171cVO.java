package tw.gov.moi.aeweb.showcase.common;

import java.io.Serializable;

public class Rl0171cVO implements Serializable 
{
    /**
     * 
     */
    private static final long serialVersionUID = 5300181620390493790L;
	
    // ------------練習用----------------------

    // 國民身分證統一編號
    private String personID;
    // 單號
    private String orderNumber;
    // 姓名
    private String personName;
    // 出身身分
    private String bornIdentity;
    // 出生地點
    private String placeOfBirth;
    // 出生別
    private String birthOrder;
    // 地址
    private String address;
    // 配偶
    private String spouseName;
    // 父
    private String fatherName;
    // 母
    private String motherName;
    
    // 新變更統一編號
    private String createNewPersonID;
    
    // 出生日期
    private String birthYear;
    private String birthMonth;
    private String birthDay;
    
    // 組合記事
    private String notebook;
    
    // 是否建單
    private boolean isOrder;
    

	public String getPersonID() {
		return personID;
	}

	public void setPersonID(String personID) {
		this.personID = personID;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getBornIdentity() {
		return bornIdentity;
	}

	public void setBornIdentity(String bornIdentity) {
		this.bornIdentity = bornIdentity;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public String getBirthOrder() {
		return birthOrder;
	}

	public void setBirthOrder(String birthOrder) {
		this.birthOrder = birthOrder;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSpouseName() {
		return spouseName;
	}

	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getCreateNewPersonID() {
		return createNewPersonID;
	}

	public void setCreateNewPersonID(String createNewPersonID) {
		this.createNewPersonID = createNewPersonID;
	}

	public String getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(String birthYear) {
		this.birthYear = birthYear;
	}

	public String getBirthMonth() {
		return birthMonth;
	}

	public void setBirthMonth(String birthMonth) {
		this.birthMonth = birthMonth;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public String getNotebook() {
		return notebook;
	}

	public void setNotebook(String notebook) {
		this.notebook = notebook;
	}

	public boolean isOrder() {
		return isOrder;
	}

	public void setOrder(boolean isOrder) {
		this.isOrder = isOrder;
	}
}
