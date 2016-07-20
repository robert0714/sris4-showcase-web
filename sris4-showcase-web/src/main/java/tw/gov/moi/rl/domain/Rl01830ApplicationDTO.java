package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.component.xldf.dto.XLDFM10M;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01830ApplicationDTO", propOrder = {"xldfm10m", "selected"})
@XmlRootElement(name = "Rl01830ApplicationDTO")
public class Rl01830ApplicationDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@XmlElement(name = "xldfm10m", required = true)
	@FieldName("原登記申請書")
	private XLDFM10M xldfm10m;
	
	@XmlElement(name = "selected", required = true)
	@FieldName("是否選擇")
	private boolean selected = false;

	public XLDFM10M getXldfm10m() {
		return xldfm10m;
	}

	public void setXldfm10m(XLDFM10M xldfm10m) {
		this.xldfm10m = xldfm10m;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}
}
