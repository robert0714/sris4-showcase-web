package tw.gov.moi.rl.domain;

public class Rl08210SQLTitleDTO {
	private String tableCode = "";
	private String emptyFieldName = "";
	private String orderField = "";

	private String otherCondtion = "";
	private String firstNum;
	private String otherCode = "";
	private String otherAppend = "";

	private boolean isTrue = true;

	public String getOtherAppend() {
		return otherAppend;
	}

	public void setOtherAppend(String otherAppend) {
		this.otherAppend = otherAppend;
	}

	public String getTableCode() {
		return tableCode;
	}

	public void setTableCode(String tableCode) {
		this.tableCode = tableCode;
	}

	public String getOtherCondtion() {
		return otherCondtion;
	}

	public boolean isTrue() {
		return isTrue;
	}

	public String getEmptyFieldName() {
		return emptyFieldName;
	}

	public void setEmptyFieldName(String emptyFieldName) {
		this.emptyFieldName = emptyFieldName;
	}

	public void setTrue(boolean isTrue) {
		this.isTrue = isTrue;
	}

	public void setOtherCondtion(String otherCondtion) {
		this.otherCondtion = otherCondtion;
	}

	public String getOrderField() {
		return orderField;
	}

	public void setOrderField(String orderField) {
		this.orderField = orderField;
	}

	public String getFirstNum() {
		return firstNum;
	}

	public void setFirstNum(String firstNum) {
		this.firstNum = firstNum;
	}

	public String getOtherCode() {
		return otherCode;
	}

	public void setOtherCode(String otherCode) {
		this.otherCode = otherCode;
	}

	@Override
	public String toString() {
		return "Rl08210SQLTitleDTO [tableCode=" + tableCode + ", emptyFieldName=" + emptyFieldName + ", orderField=" + orderField + ", otherCondtion="
				+ otherCondtion + ", isTrue=" + isTrue + "]";
	}

}
