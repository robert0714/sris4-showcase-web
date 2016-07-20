package tw.gov.moi.rl.domain;

import javax.xml.bind.annotation.XmlElement;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.component.rl08210.R08210SQLComponet;

public class Rl08210BirthNumDTO {
	private String birthNUmCode = "";
	private String age = "";
	private String otherCondtion = "";

	@XmlElement(name = "SqlComponet")
	@FieldName("正確組合")
	private R08210SQLComponet sqlComponet = null;

	@XmlElement(name = "SqlNotComponet")
	@FieldName("錯誤組合")
	private R08210SQLComponet sqlNotComponet = null;

	public String getBirthNUmCode() {
		return birthNUmCode;
	}

	public void setBirthNUmCode(String birthNUmCode) {
		this.birthNUmCode = birthNUmCode;
	}

	public String getOtherCondtion() {
		return otherCondtion;
	}

	public void setOtherCondtion(String otherCondtion) {
		this.otherCondtion = otherCondtion;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
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

	@Override
	public String toString() {
		return "Rl08210BirthNumDTO [birthNUmCode=" + birthNUmCode + ", age=" + age + ", otherCondtion=" + otherCondtion + ", sqlComponet=" + sqlComponet
				+ ", sqlNotComponet=" + sqlNotComponet + "]";
	}

}
