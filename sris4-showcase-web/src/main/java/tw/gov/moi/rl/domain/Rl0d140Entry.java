/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * The Class Rl0d140Entry.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl0d140Entry", propOrder = { "No", "Id", "PersonId", "Type", "SiteId", "AreaCode", "AdminOfficeCode",
		"UseYyymmdd", "UseYyymmdd", "UseHhmmss", "UseHhmmss", "IssueYyymmdd", "IssueName", "VoidYyymmdd", "VoidHhmmss",
		"VoidCode", "VoidName", "VoidReason", "LostYyymmdd", "LostHhmmss", "LostCode", "LostName", "LostReason",
		"ExpiredCode", "ExpiredName", "Document", "AcceptYyymmdd", "AcceptHhmmss", "AcceptHhmmss", "StorageName",
		"GraspYyymmdd", "GraspHhmmss", "GraspName", "GraspFlag", "QualifyYyymmdd", "QualifyHhmmss", "QualifyName",
		"ConfirmYyymmdd", "ConfirmHhmmss", "ConfirmName", "ConfirmType", "StatisticsType", "Name", "BirthYyymmdd",
		"IdcardYyymmdd", "IdcardHhmmss", "ApplyReason", "ImageFlag", "FatherName", "MotherName", "SpouseName",
		"Military", "BirthPlace", "Village", "Neighbor", "StreetDoorplate", "ReservedField" })
@XmlRootElement(name = "Rl0d140Entry")
public class Rl0d140Entry implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 8431788095599023197L;

	/** 序號 */
	@XmlElement(name = "No", required = true)
	@FieldName("空白證號")
	private String no;

	/** 類別 */
	@XmlElement(name = "PersonId", required = true)
	@FieldName("國民身分證統一編號")
	private String personId;

	/** 型態 */
	@XmlElement(name = "Type", required = true)
	@FieldName("型態")
	private String type;

	/** SiteId */
	@XmlElement(name = "SiteId", required = true)
	@FieldName("SiteId")
	private String siteId;

	/** AreaCode */
	@XmlElement(name = "AreaCode", required = true)
	@FieldName("AreaCode")
	private String areaCode;

	/** AdminOfficeCode */
	@XmlElement(name = "AdminOfficeCode", required = true)
	@FieldName("AdminOfficeCode")
	private String adminOfficeCode;

	/** UseYyymmdd */
	@XmlElement(name = "UseYyymmdd", required = true)
	@FieldName("UseYyymmdd")
	private String useYyymmdd;

	/** UseHhmmss */
	@XmlElement(name = "UseHhmmss", required = true)
	@FieldName("UseHhmmss")
	private String useHhmmss;

	/** IssueYyymmdd */
	@XmlElement(name = "IssueYyymmdd", required = true)
	@FieldName("IssueYyymmdd")
	private String issueYyymmdd;

	/** IssueName */
	@XmlElement(name = "IssueName", required = true)
	@FieldName("IssueName")
	private String issueName;

	/** VoidYyymmdd */
	@XmlElement(name = "VoidYyymmdd", required = true)
	@FieldName("VoidYyymmdd")
	private String voidYyymmdd;

	/** VoidHhmmss */
	@XmlElement(name = "VoidHhmmss", required = true)
	@FieldName("VoidHhmmss")
	private String voidHhmmss;

	/** VoidCode */
	@XmlElement(name = "VoidCode", required = true)
	@FieldName("VoidCode")
	private String voidCode;

	/** VoidName */
	@XmlElement(name = "VoidName", required = true)
	@FieldName("VoidName")
	private String voidName;

	/** VoidReason */
	@XmlElement(name = "VoidReason", required = true)
	@FieldName("VoidReason")
	private String voidReason;

	/** LostYyymmdd */
	@XmlElement(name = "LostYyymmdd", required = true)
	@FieldName("LostYyymmdd")
	private String lostYyymmdd;

	/** LostHhmmss */
	@XmlElement(name = "LostHhmmss", required = true)
	@FieldName("LostHhmmss")
	private String lostHhmmss;

	/** LostCode */
	@XmlElement(name = "LostCode", required = true)
	@FieldName("LostCode")
	private String lostCode;

	/** LostName */
	@XmlElement(name = "LostName", required = true)
	@FieldName("LostName")
	private String lostName;

	/** LostReason */
	@XmlElement(name = "LostReason", required = true)
	@FieldName("LostReason")
	private String lostReason;

	/** ExpiredCode */
	@XmlElement(name = "ExpiredCode", required = true)
	@FieldName("ExpiredCode")
	private String expiredCode;

	/** ExpiredName */
	@XmlElement(name = "ExpiredName", required = true)
	@FieldName("ExpiredName")
	private String expiredName;

	/** Document */
	@XmlElement(name = "Document", required = true)
	@FieldName("Document")
	private String document;

	/** AcceptYyymmdd */
	@XmlElement(name = "AcceptYyymmdd", required = true)
	@FieldName("AcceptYyymmdd")
	private String acceptYyymmdd;

	/** AcceptHhmmss */
	@XmlElement(name = "AcceptHhmmss", required = true)
	@FieldName("AcceptHhmmss")
	private String acceptHhmmss;

	/** StorageName */
	@XmlElement(name = "StorageName", required = true)
	@FieldName("StorageName")
	private String storageName;

	/** GraspYyymmdd */
	@XmlElement(name = "GraspYyymmdd", required = true)
	@FieldName("GraspYyymmdd")
	private String graspYyymmdd;

	/** GraspHhmmss */
	@XmlElement(name = "GraspHhmmss", required = true)
	@FieldName("GraspHhmmss")
	private String graspHhmmss;

	/** GraspName */
	@XmlElement(name = "GraspName", required = true)
	@FieldName("GraspName")
	private String graspName;

	/** GraspFlag */
	@XmlElement(name = "GraspFlag", required = true)
	@FieldName("GraspFlag")
	private String graspFlag;

	/** QualifyYyymmdd */
	@XmlElement(name = "QualifyYyymmdd", required = true)
	@FieldName("QualifyYyymmdd")
	private String qualifyYyymmdd;

	/** QualifyHhmmss */
	@XmlElement(name = "QualifyHhmmss", required = true)
	@FieldName("QualifyHhmmss")
	private String qualifyHhmmss;

	/** QualifyName */
	@XmlElement(name = "QualifyName", required = true)
	@FieldName("QualifyName")
	private String qualifyName;

	/** ConfirmYyymmdd */
	@XmlElement(name = "ConfirmYyymmdd", required = true)
	@FieldName("ConfirmYyymmdd")
	private String confirmYyymmdd;

	/** ConfirmHhmmss */
	@XmlElement(name = "ConfirmHhmmss", required = true)
	@FieldName("ConfirmHhmmss")
	private String confirmHhmmss;

	/** ConfirmName */
	@XmlElement(name = "ConfirmName", required = true)
	@FieldName("ConfirmName")
	private String confirmName;

	/** ConfirmType */
	@XmlElement(name = "ConfirmType", required = true)
	@FieldName("ConfirmType")
	private String confirmType;

	/** StatisticsType */
	@XmlElement(name = "StatisticsType", required = true)
	@FieldName("StatisticsType")
	private String statisticsType;

	/** 姓名 */
	@XmlElement(name = "Name", required = true)
	@FieldName("姓名")
	private String name;

	/** 出生日期 */
	@XmlElement(name = "BirthYyymmdd", required = true)
	@FieldName("出生日期")
	private String birthYyymmdd;

	/** 證照日期 */
	@XmlElement(name = "IdcardYyymmdd", required = true)
	@FieldName("證照日期")
	private String idcardYyymmdd;

	/** IdcardHhmmss */
	@XmlElement(name = "IdcardHhmmss", required = true)
	@FieldName("IdcardHhmmss")
	private String idcardHhmmss;

	/** 申請原因 */
	@XmlElement(name = "ApplyReason", required = true)
	@FieldName("申請原因")
	private String applyReason;

	/** ImageFlag */
	@XmlElement(name = "ImageFlag", required = true)
	@FieldName("ImageFlag")
	private String imageFlag;

	/** FatherName */
	@XmlElement(name = "FatherName", required = true)
	@FieldName("父姓名")
	private String fatherName;

	/** MotherName */
	@XmlElement(name = "MotherName", required = true)
	@FieldName("母姓名")
	private String motherName;

	/** SpouseName */
	@XmlElement(name = "SpouseName", required = true)
	@FieldName("SpouseName")
	private String spouseName;

	/** Military */
	@XmlElement(name = "Military", required = true)
	@FieldName("役別")
	private String military;

	/** BirthPlace */
	@XmlElement(name = "BirthPlace", required = true)
	@FieldName("出生地")
	private String birthPlace;

	/** Village */
	@XmlElement(name = "Village", required = true)
	@FieldName("Village")
	private String village;

	/** Neighbor */
	@XmlElement(name = "Neighbor", required = true)
	@FieldName("Neighbor")
	private String neighbor;

	/** StreetDoorplate */
	@XmlElement(name = "StreetDoorplate", required = true)
	@FieldName("StreetDoorplate")
	private String streetDoorplate;

	/** ReservedField */
	@XmlElement(name = "ReservedField", required = true)
	@FieldName("ReservedField")
	private String reservedField;

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSiteId() {
		return siteId;
	}

	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getAdminOfficeCode() {
		return adminOfficeCode;
	}

	public void setAdminOfficeCode(String adminOfficeCode) {
		this.adminOfficeCode = adminOfficeCode;
	}

	public String getUseYyymmdd() {
		return useYyymmdd;
	}

	public void setUseYyymmdd(String useYyymmdd) {
		this.useYyymmdd = useYyymmdd;
	}

	public String getUseHhmmss() {
		return useHhmmss;
	}

	public void setUseHhmmss(String useHhmmss) {
		this.useHhmmss = useHhmmss;
	}

	public String getIssueYyymmdd() {
		return issueYyymmdd;
	}

	public void setIssueYyymmdd(String issueYyymmdd) {
		this.issueYyymmdd = issueYyymmdd;
	}

	public String getIssueName() {
		return issueName;
	}

	public void setIssueName(String issueName) {
		this.issueName = issueName;
	}

	public String getVoidYyymmdd() {
		return voidYyymmdd;
	}

	public void setVoidYyymmdd(String voidYyymmdd) {
		this.voidYyymmdd = voidYyymmdd;
	}

	public String getVoidHhmmss() {
		return voidHhmmss;
	}

	public void setVoidHhmmss(String voidHhmmss) {
		this.voidHhmmss = voidHhmmss;
	}

	public String getVoidCode() {
		return voidCode;
	}

	public void setVoidCode(String voidCode) {
		this.voidCode = voidCode;
	}

	public String getVoidName() {
		return voidName;
	}

	public void setVoidName(String voidName) {
		this.voidName = voidName;
	}

	public String getVoidReason() {
		return voidReason;
	}

	public void setVoidReason(String voidReason) {
		this.voidReason = voidReason;
	}

	public String getLostYyymmdd() {
		return lostYyymmdd;
	}

	public void setLostYyymmdd(String lostYyymmdd) {
		this.lostYyymmdd = lostYyymmdd;
	}

	public String getLostHhmmss() {
		return lostHhmmss;
	}

	public void setLostHhmmss(String lostHhmmss) {
		this.lostHhmmss = lostHhmmss;
	}

	public String getLostCode() {
		return lostCode;
	}

	public void setLostCode(String lostCode) {
		this.lostCode = lostCode;
	}

	public String getLostName() {
		return lostName;
	}

	public void setLostName(String lostName) {
		this.lostName = lostName;
	}

	public String getLostReason() {
		return lostReason;
	}

	public void setLostReason(String lostReason) {
		this.lostReason = lostReason;
	}

	public String getExpiredCode() {
		return expiredCode;
	}

	public void setExpiredCode(String expiredCode) {
		this.expiredCode = expiredCode;
	}

	public String getExpiredName() {
		return expiredName;
	}

	public void setExpiredName(String expiredName) {
		this.expiredName = expiredName;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public String getAcceptYyymmdd() {
		return acceptYyymmdd;
	}

	public void setAcceptYyymmdd(String acceptYyymmdd) {
		this.acceptYyymmdd = acceptYyymmdd;
	}

	public String getAcceptHhmmss() {
		return acceptHhmmss;
	}

	public void setAcceptHhmmss(String acceptHhmmss) {
		this.acceptHhmmss = acceptHhmmss;
	}

	public String getStorageName() {
		return storageName;
	}

	public void setStorageName(String storageName) {
		this.storageName = storageName;
	}

	public String getGraspYyymmdd() {
		return graspYyymmdd;
	}

	public void setGraspYyymmdd(String graspYyymmdd) {
		this.graspYyymmdd = graspYyymmdd;
	}

	public String getGraspHhmmss() {
		return graspHhmmss;
	}

	public void setGraspHhmmss(String graspHhmmss) {
		this.graspHhmmss = graspHhmmss;
	}

	public String getGraspName() {
		return graspName;
	}

	public void setGraspName(String graspName) {
		this.graspName = graspName;
	}

	public String getGraspFlag() {
		return graspFlag;
	}

	public void setGraspFlag(String graspFlag) {
		this.graspFlag = graspFlag;
	}

	public String getQualifyYyymmdd() {
		return qualifyYyymmdd;
	}

	public void setQualifyYyymmdd(String qualifyYyymmdd) {
		this.qualifyYyymmdd = qualifyYyymmdd;
	}

	public String getQualifyHhmmss() {
		return qualifyHhmmss;
	}

	public void setQualifyHhmmss(String qualifyHhmmss) {
		this.qualifyHhmmss = qualifyHhmmss;
	}

	public String getQualifyName() {
		return qualifyName;
	}

	public void setQualifyName(String qualifyName) {
		this.qualifyName = qualifyName;
	}

	public String getConfirmYyymmdd() {
		return confirmYyymmdd;
	}

	public void setConfirmYyymmdd(String confirmYyymmdd) {
		this.confirmYyymmdd = confirmYyymmdd;
	}

	public String getConfirmHhmmss() {
		return confirmHhmmss;
	}

	public void setConfirmHhmmss(String confirmHhmmss) {
		this.confirmHhmmss = confirmHhmmss;
	}

	public String getConfirmName() {
		return confirmName;
	}

	public void setConfirmName(String confirmName) {
		this.confirmName = confirmName;
	}

	public String getConfirmType() {
		return confirmType;
	}

	public void setConfirmType(String confirmType) {
		this.confirmType = confirmType;
	}

	public String getStatisticsType() {
		return statisticsType;
	}

	public void setStatisticsType(String statisticsType) {
		this.statisticsType = statisticsType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthYyymmdd() {
		return birthYyymmdd;
	}

	public void setBirthYyymmdd(String birthYyymmdd) {
		this.birthYyymmdd = birthYyymmdd;
	}

	public String getIdcardYyymmdd() {
		return idcardYyymmdd;
	}

	public void setIdcardYyymmdd(String idcardYyymmdd) {
		this.idcardYyymmdd = idcardYyymmdd;
	}

	public String getIdcardHhmmss() {
		return idcardHhmmss;
	}

	public void setIdcardHhmmss(String idcardHhmmss) {
		this.idcardHhmmss = idcardHhmmss;
	}

	public String getApplyReason() {
		return applyReason;
	}

	public void setApplyReason(String applyReason) {
		this.applyReason = applyReason;
	}

	public String getImageFlag() {
		return imageFlag;
	}

	public void setImageFlag(String imageFlag) {
		this.imageFlag = imageFlag;
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

	public String getSpouseName() {
		return spouseName;
	}

	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}

	public String getMilitary() {
		return military;
	}

	public void setMilitary(String military) {
		this.military = military;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
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

	public String getStreetDoorplate() {
		return streetDoorplate;
	}

	public void setStreetDoorplate(String streetDoorplate) {
		this.streetDoorplate = streetDoorplate;
	}

	public String getReservedField() {
		return reservedField;
	}

	public void setReservedField(String reservedField) {
		this.reservedField = reservedField;
	}

}
