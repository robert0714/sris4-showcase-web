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
import tw.gov.moi.rl.common.constant.RlConstant;

/**
 * The Class Rl01a40DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01a40DTO", propOrder = { "type", "personId", "startDate", "endDate", "printScope", "printDetail","reportType", "reportURL",
          "reportName" })
@XmlRootElement(name = "Rl01a40DTO")
public class Rl01a40DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 查詢方式 */
    @XmlElement(name = "Type", required = true)
    @FieldName("查詢方式")
    private String type = RlConstant.STRING_ONE;

    /** 統號 */
    @XmlElement(name = "PersonId", required = true)
    @FieldName("統號")
    private String personId;

    /** 日期(起) */
    @XmlElement(name = "StartDate", required = true)
    @FieldName("日期(起)")
    private String startDate;

    /** 日期(迄) */
    @XmlElement(name = "EndDate", required = true)
    @FieldName("日期(迄)")
    private String endDate;

    /** 列印範圍 */
    @XmlElement(name = "PrintScope", required = true)
    @FieldName("列印範圍")
    private String printScope = RlConstant.YES_CHAR;

    /** 是否列印明細 */
    @XmlElement(name = "PrintDetail", required = true)
    @FieldName("是否列印明細")
    private boolean printDetail = true;

    /** 報表格式 */
    @XmlElement(name = "ReportType", required = true)
    @FieldName("報表格式")
    private String reportType;

    /** 報表路徑 */
    @XmlElement(name = "ReportURL", required = true)
    @FieldName("報表路徑")
    private String reportURL;

    /** 報表名稱. */
    @XmlElement(name = "ReportName")
    @FieldName("報表名稱")
    private String reportName;

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

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(final String personId) {
        this.personId = personId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(final String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(final String endDate) {
        this.endDate = endDate;
    }

    public String getPrintScope() {
        return printScope;
    }

    public void setPrintScope(final String printScope) {
        this.printScope = printScope;
    }

    public boolean isPrintDetail() {
        return printDetail;
    }

    public void setPrintDetail(final boolean printDetail) {
        this.printDetail = printDetail;
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

}
