/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.dbo.entity.SelectEntity;
import tw.gov.moi.domain.Rldf002dType;

/**
 * The Class Rl02ab0DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl02ab0DTO", propOrder = { "PrintDate", "PrintSerial", "Rldf002dList", "ReportType", "ReportURL",
        "FileURL" })
@XmlRootElement(name = "Rl02ab0DTO")
public class Rl02ab0DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 列印日期 */
    @XmlElement(name = "PrintDate", required = true)
    @FieldName("列印日期")
    private String printDate;

    /** 列印序號 */
    @XmlElement(name = "PrintSerial", required = true)
    @FieldName("列印序號")
    private String printSerial;

    /** 新式國民身分證請領記錄 */
    @XmlElement(name = "Rldf002dList", required = true)
    @FieldName("新式國民身分證請領記錄")
    private List<SelectEntity<Rldf002dType>> rldf002dList;

    /** 報表格式 */
    @XmlElement(name = "ReportType", required = true)
    @FieldName("報表格式")
    private String reportType;

    /** 報表路徑 */
    @XmlElement(name = "ReportURL", required = true)
    @FieldName("報表路徑")
    private String reportURL;

    /** 執行所回傳之下載檔案. */
    @XmlElement(name = "FileURL")
    @FieldName("執行所回傳之下載檔案")
    private String fileURL;

    public String getPrintDate() {
        return printDate;
    }

    public void setPrintDate(final String printDate) {
        this.printDate = printDate;
    }

    public String getPrintSerial() {
        return printSerial;
    }

    public void setPrintSerial(final String printSerial) {
        this.printSerial = printSerial;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(final String reportType) {
        this.reportType = reportType;
    }

    public String getReportURL() {
        return reportURL;
    }

    public void setReportURL(final String reportURL) {
        this.reportURL = reportURL;
    }

    public List<SelectEntity<Rldf002dType>> getRldf002dList() {
        return rldf002dList;
    }

    public void setRldf002dList(final List<SelectEntity<Rldf002dType>> rldf002dList) {
        this.rldf002dList = rldf002dList;
    }

    public String getFileURL() {
        return fileURL;
    }

    public void setFileURL(String fileURL) {
        this.fileURL = fileURL;
    }
}
