package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * 受罰人相關資料
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01330PunishedDTO", propOrder = {"personId", "personName", "siteId", "gender", "birthDate", "village", "neighbor", "streetDoorPlate"
		, "applySequenceId", "applyPersonId", "applySiteId", "applySeq", "applyCaseNo"})
@XmlRootElement(name = "Rl01330PunishedDTO")
public class Rl01330PunishedDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@XmlElement(name = "personId", required = true)
	@FieldName("統編")
	private String personId;
	
	@XmlElement(name = "personName", required = true)
	@FieldName("姓名")
	private String personName;
	
	@XmlElement(name = "siteId", required = true)
	@FieldName("作業點代碼")
	private String siteId;
	
	@XmlElement(name = "gender", required = true)
	@FieldName("性別")
	private String gender;
	
	@XmlElement(name = "birthDate", required = true)
	@FieldName("出生日期")
	private String birthDate;
	
	@XmlElement(name = "village", required = true)
	@FieldName("村里")
	private String village;
	
	@XmlElement(name = "neighbor", required = true)
	@FieldName("鄰")
	private String neighbor;
	
	@XmlElement(name = "streetDoorPlate", required = true)
	@FieldName("街路門牌")
	private String streetDoorPlate;
	
	@XmlElement(name = "applySequenceId", required = true)
	@FieldName("當事人交易順序")
	private String applySequenceId;
	
	@XmlElement(name = "applyPersonId", required = true)
	@FieldName("當事人統編")
	private String applyPersonId;
	
	@XmlElement(name = "applySiteId", required = true)
	@FieldName("當事人作業點代碼")
	private String applySiteId;
	
	@XmlElement(name = "applySeq", required = true)
	@FieldName("序號")
	private String applySeq;
	
	@XmlElement(name = "applyCaseNo", required = true)
	@FieldName("作業代碼")
	private String applyCaseNo;

	public String getApplySequenceId() {
		return applySequenceId;
	}

	public void setApplySequenceId(String applySequenceId) {
		this.applySequenceId = applySequenceId;
	}

	public String getApplyPersonId() {
		return applyPersonId;
	}

	public void setApplyPersonId(String applyPersonId) {
		this.applyPersonId = applyPersonId;
	}

	public String getApplySiteId() {
		return applySiteId;
	}

	public void setApplySiteId(String applySiteId) {
		this.applySiteId = applySiteId;
	}

	public String getApplySeq() {
		return applySeq;
	}

	public void setApplySeq(String applySeq) {
		this.applySeq = applySeq;
	}

	public String getApplyCaseNo() {
		return applyCaseNo;
	}

	public void setApplyCaseNo(String applyCaseNo) {
		this.applyCaseNo = applyCaseNo;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public String getSiteId() {
		return siteId;
	}

	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getNeighbor() {
		return neighbor;
	}

	public void setNeighbor(String neighbor) {
		this.neighbor = neighbor;
	}

	public String getStreetDoorPlate() {
		return streetDoorPlate;
	}

	public void setStreetDoorPlate(String streetDoorPlate) {
		this.streetDoorPlate = streetDoorPlate;
	}
}
