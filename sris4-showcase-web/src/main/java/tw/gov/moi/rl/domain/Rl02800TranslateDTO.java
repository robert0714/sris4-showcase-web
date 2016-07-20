package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang.StringUtils;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "rl02800TranslateDTO")
@XmlType(name = "Rl02800TranslateDTO", propOrder = {
		"name", "english1", "english2"
})
public class Rl02800TranslateDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@XmlElement(name = "Name")
    @FieldName("中文名稱")
	private String name;
	
	@XmlElement(name = "English1")
    @FieldName("漢語")
	private String english1;
	
	@XmlElement(name = "English2")
    @FieldName("通用")
	private String english2;

	public Rl02800TranslateDTO(String name, String english1, String english2) {
		super();
		this.name = name;
		this.english1 = english1;
		this.english2 = english2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEnglish1() {
		return english1;
	}

	public void setEnglish1(String english1) {
		this.english1 = english1;
	}

	public String getEnglish2() {
		return english2;
	}

	public void setEnglish2(String english2) {
		this.english2 = english2;
	}

	@Override
	public boolean equals(Object arg0) {
		Rl02800TranslateDTO obj = (Rl02800TranslateDTO)arg0;
		return StringUtils.equals(this.name, obj.getName());
	}
	
}
