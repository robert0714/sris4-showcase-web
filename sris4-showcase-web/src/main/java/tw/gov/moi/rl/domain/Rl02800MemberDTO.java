package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Rldf006yType;
import tw.gov.moi.domain.Rldf013yType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl02800MemberDTO", propOrder = {"id", "personData", "notes"})
@XmlRootElement(name = "Rl02800MemberDTO")
public class Rl02800MemberDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@XmlElement(name = "Id")
    @FieldName("ID")
	private String id;
	
	@XmlElement(name = "PersonData")
    @FieldName("個人資料")
	private Rldf006yType personData = new Rldf006yType();
	
	@XmlElement(name = "Notes")
    @FieldName("記事")
	private List<Rldf013yType> notes = new ArrayList<Rldf013yType>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Rldf006yType getPersonData() {
		return personData;
	}

	public void setPersonData(Rldf006yType personData) {
		this.personData = personData;
	}

	public List<Rldf013yType> getNotes() {
		return notes;
	}

	public void setNotes(List<Rldf013yType> notes) {
		this.notes = notes;
	}
	
}
