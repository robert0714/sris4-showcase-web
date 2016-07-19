/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
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
import tw.gov.moi.rl.common.constant.RlConstant;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08970DTO", propOrder = { "printType", "category", "pageDataList", "processList", "houseHoldList",
        "reportFormat", "fileURL", "reportURL" })
@XmlRootElement(name = "Rl08970DTO")
public class Rl08970DTO implements Serializable {

    private static final long serialVersionUID = 1L;

    // 頁面 列印報表選擇
    @XmlElement(name = "PrintType")
    @FieldName("頁面 列印報表選擇")
    private String printType = RlConstant.STRING_ONE;

    // 全戶或是部分
    @XmlElement(name = "Category")
    @FieldName("全戶或是部分")
    private String category = RlConstant.STRING_ONE;

    // 頁面顯示資料
    @XmlElement(name = "PageDataList")
    @FieldName("頁面顯示資料")
    private List<Rl08970DTOResuls> pageDataList = new ArrayList<Rl08970DTOResuls>();

    /** 檔案格式：頁面檔案格式欄位. */
    @XmlElement(name = "ReportFormat")
    @FieldName("頁面檔案格式欄位")
    private String reportFormat;

    /** 執行所回傳之下載檔案. */
    @XmlElement(name = "FileURL")
    @FieldName("執行所回傳之下載檔案")
    private String fileURL;

    /** 接ReportingComponet回傳的報表位置. */
    @XmlElement(name = "ReportURL")
    @FieldName("接ReportingComponet回傳的報表位置")
    private String reportURL;

    public String getPrintType() {
        return printType;
    }

    public void setPrintType(String printType) {
        this.printType = printType;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(final String category) {
        this.category = category;
    }

    public void remove(Rl08970DTOResuls anResult) {
        pageDataList.remove(anResult);
    }

    public List<Rl08970DTOResuls> getPageDataList() {
        return pageDataList;
    }

    public void setPageDataList(List<Rl08970DTOResuls> pageDataList) {
        this.pageDataList = pageDataList;
    }

    public String getReportFormat() {
        return reportFormat;
    }

    public void setReportFormat(String reportFormat) {
        this.reportFormat = reportFormat;
    }

    public String getFileURL() {
        return fileURL;
    }

    public void setFileURL(String fileURL) {
        this.fileURL = fileURL;
    }

    public String getReportURL() {
        return reportURL;
    }

    public void setReportURL(String reportURL) {
        this.reportURL = reportURL;
    }

    @Override
    public String toString() {
        return "Rl08970DTO [printType=" + printType + ", category=" + category + ", reportFormat=" + reportFormat
                + ", fileURL=" + fileURL + ", reportURL=" + reportURL + "]";
    }

}