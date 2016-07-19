/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang3.StringUtils;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.ae.report.ReportFormat;
import tw.gov.moi.rl.common.constant.RlConstant;
import tw.gov.moi.rs.common.report.dto.BaseITextReportParams;
import tw.gov.moi.rs.common.report.dto.RsReportParams;

/**
 * The Class Rl08600DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08600DTO", propOrder = { "tabIndex", "personId", "printType", "changePageType", "specialMark",
        "controlledEndDate", "birthDateBegin", "birthDateEnd", "printArea", "reportFormat", "reportUrl",
        "personIdList", "siteName", "dataMap", "statisticMap", "specialContent", "executeReport" })
@XmlRootElement(name = "Rl08600DTO")
public class Rl08600DTO extends BaseITextReportParams implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -4720622192830432665L;

    /** 頁面製作當事人之特殊註記名冊或製作各類特殊人口名冊欄位. */
    @XmlElement(name = "TabIndex")
    @FieldName("頁面製作當事人之特殊註記名冊或製作各類特殊人口名冊欄位")
    private String tabIndex = RlConstant.STRING_ZERO;

    /** 當事人統號. */
    @XmlElement(name = "PersonIds")
    @FieldName("當事人統號")
    private String personId;

    /** 統計造冊. */
    @XmlElement(name = "PrintType")
    @FieldName("統計造冊")
    private String printType = RlConstant.STRING_ZERO;

    /** 名冊換頁方式. */
    @XmlElement(name = "ChangePageType")
    @FieldName("名冊換頁方式")
    private String changePageType = RlConstant.STRING_TWO;

    /** 特殊註記別. */
    @XmlElement(name = "SpecialMark")
    @FieldName("特殊註記別")
    private String specialMark;

    /** 列管終止日期. */
    @XmlElement(name = "ControlledEndDate")
    @FieldName("列管終止日期")
    private String controlledEndDate;

    /** 出生日期起. */
    @XmlElement(name = "BirthDateBegin")
    @FieldName("出生日期起")
    private String birthDateBegin;

    /** 出生日期訖. */
    @XmlElement(name = "BirthDateEnd")
    @FieldName("出生日期訖")
    private String birthDateEnd;

    /** 列印區域. */
    @XmlElement(name = "PrintArea")
    @FieldName("列印區域")
    private String printArea;

    /** 檔案格式. */
    @XmlElement(name = "ReportFormat")
    @FieldName("檔案格式")
    private String reportFormat = RlConstant.ReportFormat.PDF.name();

    /** 接ReportingComponet回傳的報表位置. */
    @XmlElement(name = "ReportURL")
    @FieldName("接ReportingComponet回傳的報表位置")
    private String reportURL;

    /** 統號清單. */
    @XmlElement(name = "PersonIdList")
    @FieldName("統號清單")
    private List<String> personIdList;

    /** 戶政名稱. */
    @XmlElement(name = "SiteName")
    @FieldName("戶政名稱")
    private String siteName = "";

    /** 殊特註記清冊資料. */
    @XmlElement(name = "DataMap")
    @FieldName("特殊註記清冊資料")
    private Map<String, List<Rlrp08610SubDTO>> dataMap = new LinkedHashMap<String, List<Rlrp08610SubDTO>>();

    /** 特殊註記統計資料. */
    @XmlElement(name = "StatisticMap")
    @FieldName("特殊註記統計資料")
    private Map<String, List<Rlrp08620DTO>> statisticMap = new LinkedHashMap<String, List<Rlrp08620DTO>>();

    /** 特殊註記內容. */
    @XmlElement(name = "SpecialContent")
    @FieldName("特殊註記內容")
    private String specialContent = "";

    /** 執行的報表. */
    @XmlElement(name = "ExecuteReport")
    @FieldName("執行的報表")
    private List<String> executeReport = new ArrayList<String>();

    /**
     * Gets the tab index.
     * 
     * @return the tab index
     */
    public String getTabIndex() {
        return tabIndex;
    }

    /**
     * Sets the tab index.
     * 
     * @param tabIndex
     *            the new tab index
     */
    public void setTabIndex(String tabIndex) {
        this.tabIndex = tabIndex;
    }

    /**
     * Gets the person ids.
     * 
     * @return the person ids
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * Sets the person ids.
     * 
     * @param personIds
     *            the new person ids
     */
    public void setPersonId(String personId) {
        this.personId = personId;
    }

    /**
     * Gets the prints the type.
     * 
     * @return the prints the type
     */
    public String getPrintType() {
        return printType;
    }

    /**
     * Sets the prints the type.
     * 
     * @param printType
     *            the new prints the type
     */
    public void setPrintType(String printType) {
        this.printType = printType;
    }

    /**
     * Gets the change page type.
     * 
     * @return the change page type
     */
    public String getChangePageType() {
        return changePageType;
    }

    /**
     * Sets the change page type.
     * 
     * @param changePageType
     *            the new change page type
     */
    public void setChangePageType(String changePageType) {
        this.changePageType = changePageType;
    }

    /**
     * Gets the special mark.
     * 
     * @return the special mark
     */
    public String getSpecialMark() {
        return specialMark;
    }

    /**
     * Sets the special mark.
     * 
     * @param specialMark
     *            the new special mark
     */
    public void setSpecialMark(String specialMark) {
        this.specialMark = specialMark;
    }

    /**
     * Gets the controlled end date.
     * 
     * @return the controlled end date
     */
    public String getControlledEndDate() {
        return controlledEndDate;
    }

    /**
     * Sets the controlled end date.
     * 
     * @param controlledEndDate
     *            the new controlled end date
     */
    public void setControlledEndDate(String controlledEndDate) {
        this.controlledEndDate = controlledEndDate;
    }

    /**
     * Gets the birth date begin.
     * 
     * @return the birth date begin
     */
    public String getBirthDateBegin() {
        return birthDateBegin;
    }

    /**
     * Sets the birth date begin.
     * 
     * @param birthDateBegin
     *            the new birth date begin
     */
    public void setBirthDateBegin(String birthDateBegin) {
        this.birthDateBegin = birthDateBegin;
    }

    /**
     * Gets the birth date end.
     * 
     * @return the birth date end
     */
    public String getBirthDateEnd() {
        return birthDateEnd;
    }

    /**
     * Sets the birth date end.
     * 
     * @param birthDateEnd
     *            the new birth date end
     */
    public void setBirthDateEnd(String birthDateEnd) {
        this.birthDateEnd = birthDateEnd;
    }

    /**
     * Gets the prints the area.
     * 
     * @return the prints the area
     */
    public String getPrintArea() {
        return printArea;
    }

    /**
     * Sets the prints the area.
     * 
     * @param printArea
     *            the new prints the area
     */
    public void setPrintArea(String printArea) {
        this.printArea = printArea;
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

    public String getReportURL() {
        return reportURL;
    }

    public void setReportURL(String reportURL) {
        this.reportURL = reportURL;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public List<String> getPersonIdList() {
        return this.personIdList;
    }

    public void setPersonIdList(List<String> personIdList) {
        this.personIdList = personIdList;
    }

    @Override
    public String getMainReportName() {
        // 統計
        if (StringUtils.equals(this.printType, "1")) {
            return "RLRP08620";
        }
        // 造冊
        else {
            return "RLRP08610";
        }
    }

    @Override
    public String getReportExt() {
        return this.getMainReportName();
    }

    @Override
    public ReportFormat getReportFormatEnum() {
        return "csv".equalsIgnoreCase(this.reportFormat) ? ReportFormat.CSV : ReportFormat.PDF;
    }

    public String getSiteName() {
        return this.siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public Map<String, List<Rlrp08610SubDTO>> getDataMap() {
        return this.dataMap;
    }

    public void setDataMap(Map<String, List<Rlrp08610SubDTO>> dataMap) {
        this.dataMap = dataMap;
    }

    public Map<String, List<Rlrp08620DTO>> getStatisticMap() {
        return this.statisticMap;
    }

    public void setStatisticMap(Map<String, List<Rlrp08620DTO>> statisticMap) {
        this.statisticMap = statisticMap;
    }

    public String getSpecialContent() {
        return this.specialContent;
    }

    public void setSpecialContent(String specialContent) {
        this.specialContent = specialContent;
    }

    public List<String> getExecuteReport() {
        return this.executeReport;
    }

    public void setExecuteReport(List<String> executeReport) {
        this.executeReport = executeReport;
    }

}
