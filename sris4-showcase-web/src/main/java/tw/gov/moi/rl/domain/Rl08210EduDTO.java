package tw.gov.moi.rl.domain;

import javax.xml.bind.annotation.XmlElement;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.component.rl08210.R08210SQLComponet;

public class Rl08210EduDTO {

	@XmlElement(name = "EduCode")
	@FieldName("出生日期正確")
	private String eduCode;

	@XmlElement(name = "BirthCode")
	@FieldName("出生日期正確")
	private String birthCode;

	@XmlElement(name = "ErrorMsg")
	@FieldName("出生日期正確")
	private String errorMsg;

	@XmlElement(name = "NationCode")
	@FieldName("nationCode")
	private String nationCode;

	@XmlElement(name = "Table")
	@FieldName("table")
	private String table;
	@XmlElement(name = "AgeCode")
	@FieldName("年紀")
	private String ageCode;

	@XmlElement(name = "SqlComponet")
	@FieldName("正確組合")
	private R08210SQLComponet sqlComponet = null;

	@XmlElement(name = "SqlNotComponet")
	@FieldName("錯誤組合")
	private R08210SQLComponet sqlNotComponet = null;

	@XmlElement(name = "FirstName")
	@FieldName("firstName")
	private String firstName = "";

	private String registerChName = "";

	private String message = "";

	public String getRegisterChName() {
		return registerChName;
	}

	public void setRegisterChName(String registerChName) {
		this.registerChName = registerChName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getEduCode() {
		return eduCode;
	}

	public void setEduCode(String eduCode) {
		this.eduCode = eduCode;
	}

	public String getBirthCode() {
		return birthCode;
	}

	public void setBirthCode(String birthCode) {
		this.birthCode = birthCode;
	}

	public String getAgeCode() {
		return ageCode;
	}

	public void setAgeCode(String ageCode) {
		this.ageCode = ageCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public String getTable() {
		return table;
	}

	public void setTable(String table) {
		this.table = table;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getNationCode() {
		return nationCode;
	}

	public void setNationCode(String nationCode) {
		this.nationCode = nationCode;
	}

	public R08210SQLComponet getSqlComponet() {
		return sqlComponet;
	}

	public void setSqlComponet(R08210SQLComponet sqlComponet) {
		this.sqlComponet = sqlComponet;
	}

	public R08210SQLComponet getSqlNotComponet() {
		return sqlNotComponet;
	}

	public void setSqlNotComponet(R08210SQLComponet sqlNotComponet) {
		this.sqlNotComponet = sqlNotComponet;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "Rl08210EduDTO [eduCode=" + eduCode + ", birthCode=" + birthCode + ", errorMsg=" + errorMsg + ", nationCode=" + nationCode + ", table=" + table
				+ ", ageCode=" + ageCode + ", sqlComponet=" + sqlComponet + ", sqlNotComponet=" + sqlNotComponet + "]";
	}

}
