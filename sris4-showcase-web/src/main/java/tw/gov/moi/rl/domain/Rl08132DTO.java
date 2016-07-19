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
 * The Class Rl08132DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08132DTO", propOrder = { "Item", "ReportName", "Yyy",
		"StartMonth", "EndMonth", "CityCountyCode", "TownCode", "ReportFormat",
		"Total", "PrintVillage", "Month", "Notice" })
@XmlRootElement(name = "Rl08132DTO")
public class Rl08132DTO implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The item. */
	@XmlElement(name = "Item", required = true)
	@FieldName(" Item")
	private String item = "";

	/** The report name. */
	@XmlElement(name = "ReportName", required = true)
	@FieldName(" ReportName")
	private String reportName = "";

	/** The yyy. */
	@XmlElement(name = "Yyy", required = true)
	@FieldName(" Yyy")
	private String yyy = "";

	/** The start month. */
	@XmlElement(name = "StartMonth", required = true)
	@FieldName(" StartMonth")
	private String startMonth = "";

	/** The end month. */
	@XmlElement(name = "EndMonth", required = true)
	@FieldName(" EndMonth")
	private String endMonth = "";

	/** 列印區域(市縣市). */
	@XmlElement(name = "CityCountyCode", required = true)
	@FieldName(" CityCountyCode")
	private String cityCountyCode = "";

	/** 列印區域(鄉鎮市區). */
	@XmlElement(name = "TownCode", required = true)
	@FieldName(" TownCode")
	private String townCode = "";

	/** The report format. */
	@XmlElement(name = "ReportFormat", required = true)
	@FieldName(" ReportFormat")
	private String reportFormat = "";

	/** The total. */
	@XmlElement(name = "Total", required = true)
	@FieldName("Total")
	private String total = "";

	/** 是否列印至村里 */
	@XmlElement(name = "PrintVillage", required = true)
	@FieldName("是否列印至村里")
	private boolean printVillage = false;

	/** 統計月份 */
	@XmlElement(name = "Month", required = true)
	@FieldName("統計月份")
	private String month = "";

	/** 是否通報 */
	@XmlElement(name = "Notice", required = true)
	@FieldName("是否通報")
	private boolean notice = false;
	
	@XmlElement(name = "Url", required = true)
	@FieldName("URL")
	private String url = "";
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * Gets the item.
	 * 
	 * @return the item
	 */
	public String getItem() {
		return item;
	}

	/**
	 * Sets the item.
	 * 
	 * @param item
	 *            the new item
	 */
	public void setItem(String item) {
		this.item = item;
	}

	/**
	 * Gets the report name.
	 * 
	 * @return the report name
	 */
	public String getReportName() {
		return reportName;
	}

	/**
	 * Sets the report name.
	 * 
	 * @param reportName
	 *            the new report name
	 */
	public void setReportName(String reportName) {
		this.reportName = reportName;
	}

	/**
	 * Gets the yyy.
	 * 
	 * @return the yyy
	 */
	public String getYyy() {
		return yyy;
	}

	/**
	 * Sets the yyy.
	 * 
	 * @param yyy
	 *            the new yyy
	 */
	public void setYyy(String yyy) {
		this.yyy = yyy;
	}

	/**
	 * Gets the start month.
	 * 
	 * @return the start month
	 */
	public String getStartMonth() {
		return startMonth;
	}

	/**
	 * Sets the start month.
	 * 
	 * @param startMonth
	 *            the new start month
	 */
	public void setStartMonth(String startMonth) {
		this.startMonth = startMonth;
	}

	/**
	 * Gets the end month.
	 * 
	 * @return the end month
	 */
	public String getEndMonth() {
		return endMonth;
	}

	/**
	 * Sets the end month.
	 * 
	 * @param endMonth
	 *            the new end month
	 */
	public void setEndMonth(String endMonth) {
		this.endMonth = endMonth;
	}

	/**
	 * Gets the city county code.
	 * 
	 * @return the city county code
	 */
	public String getCityCountyCode() {
		return cityCountyCode;
	}

	/**
	 * Sets the city county code.
	 * 
	 * @param cityCountyCode
	 *            the new city county code
	 */
	public void setCityCountyCode(String cityCountyCode) {
		this.cityCountyCode = cityCountyCode;
	}

	/**
	 * Gets the town code.
	 * 
	 * @return the town code
	 */
	public String getTownCode() {
		return townCode;
	}

	/**
	 * Sets the town code.
	 * 
	 * @param townCode
	 *            the new town code
	 */
	public void setTownCode(String townCode) {
		this.townCode = townCode;
	}

	/**
	 * Gets the report format.
	 * 
	 * @return the report format
	 */
	public String getReportFormat() {
		return reportFormat;
	}

	/**
	 * Sets the report format.
	 * 
	 * @param reportFormat
	 *            the new report format
	 */
	public void setReportFormat(String reportFormat) {
		this.reportFormat = reportFormat;
	}

	/**
	 * Gets the total.
	 * 
	 * @return the total
	 */
	public String getTotal() {
		return total;
	}

	/**
	 * Sets the total.
	 * 
	 * @param total
	 *            the new total
	 */
	public void setTotal(String total) {
		this.total = total;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public boolean getPrintVillage() {
		return printVillage;
	}

	public void setPrintVillage(boolean printVillage) {
		this.printVillage = printVillage;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public boolean isNotice() {
		return notice;
	}

	public void setNotice(boolean notice) {
		this.notice = notice;
	}

	@Override
	public String toString() {
		return "Rl08132DTO [item=" + item + ", reportName=" + reportName
				+ ", yyy=" + yyy + ", startMonth=" + startMonth + ", endMonth="
				+ endMonth + ", cityCountyCode=" + cityCountyCode
				+ ", townCode=" + townCode + ", reportFormat=" + reportFormat
				+ ", total=" + total + ", printVillage=" + printVillage
				+ ", month=" + month + ", notice=" + notice + "]";
	}

}
