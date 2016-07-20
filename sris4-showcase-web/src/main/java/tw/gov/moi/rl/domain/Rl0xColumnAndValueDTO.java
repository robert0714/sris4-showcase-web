package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0xColumnAndValueDTO", propOrder = { "ColumnCode", "LeftColumnvalue", "RightColumnvalue" })
@XmlRootElement(name = "Rl0xColumnAndValueDTO")
public class Rl0xColumnAndValueDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@XmlElement(name = "ColumnCode")
	@FieldName("欄位名稱")
	private String ColumnCode = "";

	@XmlElement(name = "LeftColumnvalue")
	@FieldName("左邊欄位值")
	private String leftColumnvalue = "";

	@XmlElement(name = "RightColumnvalue")
	@FieldName("右邊欄位值")
	private String rightColumnvalue = "";

	public String getColumnCode() {
		return ColumnCode;
	}

	public void setColumnCode(String columnCode) {
		ColumnCode = columnCode;
	}

	public String getLeftColumnvalue() {
		return leftColumnvalue;
	}

	public void setLeftColumnvalue(String leftColumnvalue) {
		this.leftColumnvalue = leftColumnvalue;
	}

	public String getRightColumnvalue() {
		return rightColumnvalue;
	}

	public void setRightColumnvalue(String rightColumnvalue) {
		this.rightColumnvalue = rightColumnvalue;
	}

	public Rl0xColumnAndValueDTO(String columnCode, String leftColumnvalue, String rightColumnvalue) {
		super();
		ColumnCode = columnCode;
		this.leftColumnvalue = leftColumnvalue;
		this.rightColumnvalue = rightColumnvalue;
	}

	@Override
	public String toString() {
		return "Rl0xColumnAndValueDTO [ColumnCode=" + ColumnCode + ", leftColumnvalue=" + leftColumnvalue + ", rightColumnvalue=" + rightColumnvalue + "]";
	}

}
