package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.lang.builder.EqualsBuilder;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Rl02100ColumnDTO")
public class Rl02100ColumnDTO implements Serializable {
	
	private static final long serialVersionUID = 2101412238173050701L;
	
	@XmlElement(name = "IsHiden")
	@FieldName("是否隱藏稱謂")
	private boolean isHidenRelationship = false;
		
	@XmlElement(name = "IsHidenBirthYyymmdd")
	@FieldName("是否隱藏出生日期")
	private boolean isHidenBirthYyymmdd = false;
	
	@XmlElement(name = "IsHidenPersonName")
	@FieldName("是否隱藏姓名")
	private boolean isHidenPersonName = false;
	
	@XmlElement(name = "IsHideFather")
	@FieldName("是否隱藏父")
	private boolean isHideFather = false;
	
	@XmlElement(name = "IsHideFosterFather")
	@FieldName("是否隱藏養父")
	private boolean isHideFosterFather = false;
	
	@XmlElement(name = "IsHidePesronId")
	@FieldName("是否隱藏統編")
	private boolean isHidePesronId = false;
	
	@XmlElement(name = "IsHideMother")
	@FieldName("是否隱藏母")
	private boolean isHideMother = false;
	
	@XmlElement(name = "IsHideFosterMother")
	@FieldName("是否隱藏養母")
	private boolean isHideFosterMother = false;
	
	@XmlElement(name = "IsHideSpouse")
	@FieldName("是否隱藏配偶")
	private boolean isHideSpouse = false;
	
	@XmlElement(name = "IsHideLivingStyle")
	@FieldName("是否隱藏原住民及族別")
	private boolean isHideLivingStyle = false;
	
	@XmlElement(name = "IsHideBIrthPlace")
	@FieldName("是否隱藏出生地")
	private boolean isHideBIrthPlace = false;
	
	@XmlElement(name = "IsHideBirthOrder")
	@FieldName("是否隱藏出生別")
	private boolean isHideBirthOrder = false;
	
	@XmlElement(name = "IsHideNote")
	@FieldName("是否隱藏記事")
	private boolean isHideNote = false;
	
	@XmlElement(name = "Note")
	@FieldName("記事")
	private String note;
	
	@XmlElement(name = "IsPrintAll")
	@FieldName("是否全印")
	private boolean isPrintAll = true;
	
	public boolean isPrintAll() {
		if(this.isHidenRelationship) isPrintAll = false;
		else if (this.isHidenBirthYyymmdd) isPrintAll = false;
		else if (this.isHidenPersonName) isPrintAll = false;
		else if (this.isHideFather) isPrintAll = false;
		else if (this.isHideFosterFather) isPrintAll = false;
		else if (this.isHidePesronId) isPrintAll = false;
		else if (this.isHideMother) isPrintAll = false;
		else if (this.isHideSpouse) isPrintAll = false;
		else if (this.isHideLivingStyle) isPrintAll = false;
		else if (this.isHideBIrthPlace) isPrintAll = false;
		else if (this.isHideBirthOrder) isPrintAll = false;
		else if (this.isHideNote) isPrintAll = false;
		else isPrintAll = true;
		return isPrintAll;
	}

	public void setPrintAll(boolean isPrintAll) {
		this.isPrintAll = isPrintAll;
	}

	public boolean isHideFather() {
		return isHideFather;
	}

	public void setHideFather(boolean isHideFather) {
		this.isHideFather = isHideFather;
	}

	public boolean isHideMother() {
		return isHideMother;
	}

	public void setHideMother(boolean isHideMother) {
		this.isHideMother = isHideMother;
	}

	public boolean isHideNote() {
		return isHideNote;
	}

	public void setHideNote(boolean isHideNote) {
		this.isHideNote = isHideNote;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public boolean isHidenRelationship() {
		return isHidenRelationship;
	}

	public void setHidenRelationship(boolean isHidenRelationship) {
		this.isHidenRelationship = isHidenRelationship;
	}

	public boolean isHidenBirthYyymmdd() {
		return isHidenBirthYyymmdd;
	}

	public void setHidenBirthYyymmdd(boolean isHidenBirthYyymmdd) {
		this.isHidenBirthYyymmdd = isHidenBirthYyymmdd;
	}

	public boolean isHidenPersonName() {
		return isHidenPersonName;
	}

	public void setHidenPersonName(boolean isHidenPersonName) {
		this.isHidenPersonName = isHidenPersonName;
	}

	public boolean isHideFosterFather() {
		return isHideFosterFather;
	}

	public void setHideFosterFather(boolean isHideFosterFather) {
		this.isHideFosterFather = isHideFosterFather;
	}

	public boolean isHidePesronId() {
		return isHidePesronId;
	}

	public void setHidePesronId(boolean isHidePesronId) {
		this.isHidePesronId = isHidePesronId;
	}

	public boolean isHideFosterMother() {
		return isHideFosterMother;
	}

	public void setHideFosterMother(boolean isHideFosterMother) {
		this.isHideFosterMother = isHideFosterMother;
	}

	public boolean isHideSpouse() {
		return isHideSpouse;
	}

	public void setHideSpouse(boolean isHideSpouse) {
		this.isHideSpouse = isHideSpouse;
	}

	public boolean isHideLivingStyle() {
		return isHideLivingStyle;
	}

	public void setHideLivingStyle(boolean isHideLivingStyle) {
		this.isHideLivingStyle = isHideLivingStyle;
	}

	public boolean isHideBIrthPlace() {
		return isHideBIrthPlace;
	}

	public void setHideBIrthPlace(boolean isHideBIrthPlace) {
		this.isHideBIrthPlace = isHideBIrthPlace;
	}

	public boolean isHideBirthOrder() {
		return isHideBirthOrder;
	}

	public void setHideBirthOrder(boolean isHideBirthOrder) {
		this.isHideBirthOrder = isHideBirthOrder;
	}
}
