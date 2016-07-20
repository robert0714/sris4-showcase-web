/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.HashMap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * The Class Rl02a60DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl02a60DTO", propOrder = { "expireYyymmddStart", "expireYyymmddEnd", "orderBy1", "orderBy2",
        "fileFormat", "reportURL", "reportName", "reportParams" })
@XmlRootElement(name = "Rl02a60DTO")
public class Rl02a60DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 註銷日期(起). */
    @XmlElement(name = "ExpireYyymmddStart")
    @FieldName("註銷日期(起)")
    private String expireYyymmddStart = "";

    /** 註銷日期(迄). */
    @XmlElement(name = "ExpireYyymmddEnd")
    @FieldName("註銷日期(迄)")
    private String expireYyymmddEnd = "";

    /** 排序方式1. */
    @XmlElement(name = "OrderBy1")
    @FieldName("排序方式1")
    private String orderBy1 = "";

    /** 排序方式2. */
    @XmlElement(name = "OrderBy2")
    @FieldName("排序方式2")
    private String orderBy2 = "";

    /** 檔案格式. */
    @XmlElement(name = "FileFormat")
    @FieldName("檔案格式")
    private String fileFormat = "";

    /** 報表URL. */
    @XmlElement(name = "ReportURL")
    @FieldName("報表URL")
    private String reportURL = "";

    @XmlElement(name = "ReportName")
    @FieldName("報表名稱")
    private String reportName = "RLRP02A60";

    @XmlElement(name = "ReportParams")
    @FieldName("報表參數")
    private HashMap<String, String> reportParams = new HashMap<String, String>();

    /**
     * Gets the expire yyymmdd start.
     * 
     * @return the expire yyymmdd start
     */
    public String getExpireYyymmddStart() {
        return expireYyymmddStart;
    }

    /**
     * Sets the expire yyymmdd start.
     * 
     * @param expireYyymmddStart
     *            the new expire yyymmdd start
     */
    public void setExpireYyymmddStart(String expireYyymmddStart) {
        this.expireYyymmddStart = expireYyymmddStart;
    }

    /**
     * Gets the expire yyymmdd end.
     * 
     * @return the expire yyymmdd end
     */
    public String getExpireYyymmddEnd() {
        return expireYyymmddEnd;
    }

    /**
     * Sets the expire yyymmdd end.
     * 
     * @param expireYyymmddEnd
     *            the new expire yyymmdd end
     */
    public void setExpireYyymmddEnd(String expireYyymmddEnd) {
        this.expireYyymmddEnd = expireYyymmddEnd;
    }

    /**
     * Gets the order by1.
     * 
     * @return the order by1
     */
    public String getOrderBy1() {
        return orderBy1;
    }

    /**
     * Sets the order by1.
     * 
     * @param orderBy1
     *            the new order by1
     */
    public void setOrderBy1(String orderBy1) {
        this.orderBy1 = orderBy1;
    }

    /**
     * Gets the order by2.
     * 
     * @return the order by2
     */
    public String getOrderBy2() {
        return orderBy2;
    }

    /**
     * Sets the order by2.
     * 
     * @param orderBy2
     *            the new order by2
     */
    public void setOrderBy2(String orderBy2) {
        this.orderBy2 = orderBy2;
    }

    /**
     * Gets the serialversionuid.
     * 
     * @return the serialversionuid
     */
    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    /**
     * Gets the report url.
     * 
     * @return the report url
     */
    public String getReportURL() {
        return reportURL;
    }

    /**
     * Sets the report url.
     * 
     * @param reportURL
     *            the new report url
     */
    public void setReportURL(String reportURL) {
        this.reportURL = reportURL;
    }

    /**
     * Gets the file format.
     * 
     * @return the file format
     */
    public String getFileFormat() {
        return fileFormat;
    }

    /**
     * Sets the file format.
     * 
     * @param fileFormat
     *            the new file format
     */
    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

	public String getReportName() {
		return reportName;
	}

	public void setReportName(String reportName) {
		this.reportName = reportName;
	}

	public HashMap<String, String> getReportParams() {
		return reportParams;
	}

	public void setReportParams(HashMap<String, String> reportParams) {
		this.reportParams = reportParams;
	}
}
