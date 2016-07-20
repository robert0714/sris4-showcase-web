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

/**
 * 製作姓名羅馬拼音資料名冊.
 * 
 * @author Derek Wang
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl08980DTO", propOrder = { "dataKind", "printKind", "registerDateStart", "registerDateEnd",
        "personId", "insertList", "reportFormat", "reportURL" })
@XmlRootElement(name = "Rl08980DTO")
public class Rl08980DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 資料類別. */
    @XmlElement(name = "DataKind")
    @FieldName("資料類別")
    private String dataKind;

    /** 統計造冊方式. */
    @XmlElement(name = "PrintKind")
    @FieldName("統計造冊方式")
    private String printKind;

    /** 登記日期 (起). */
    @XmlElement(name = "RegisterDateStart")
    @FieldName("登記日期 (起)")
    private String registerDateStart;

    /** 登記日期(迄). */
    @XmlElement(name = "RegisterDateEnd")
    @FieldName("登記日期(迄)")
    private String registerDateEnd;

    /** 當事人統號. */
    @XmlElement(name = "PersonId")
    @FieldName("當事人統號")
    private String personId;

    /** 新增List. */
    @XmlElement(name = "InsertList")
    @FieldName("新增List")
    private List<String> insertList = new ArrayList<String>();

    /** 報表格式. */
    @XmlElement(name = "ReportFormat")
    @FieldName("報表格式")
    private String reportFormat;

    /** 報表路徑. */
    @XmlElement(name = "ReportURL")
    @FieldName("報表路徑")
    private String reportURL;

    /**
     * Gets the data kind.
     * 
     * @return the data kind
     */
    public String getDataKind() {
        return dataKind;
    }

    /**
     * Sets the data kind.
     * 
     * @param dataKind
     *            the new data kind
     */
    public void setDataKind(String dataKind) {
        this.dataKind = dataKind;
    }

    /**
     * Gets the prints the kind.
     * 
     * @return the prints the kind
     */
    public String getPrintKind() {
        return printKind;
    }

    /**
     * Sets the prints the kind.
     * 
     * @param printKind
     *            the new prints the kind
     */
    public void setPrintKind(String printKind) {
        this.printKind = printKind;
    }

    /**
     * Gets the register date start.
     * 
     * @return the register date start
     */
    public String getRegisterDateStart() {
        return registerDateStart;
    }

    /**
     * Sets the register date start.
     * 
     * @param registerDateStart
     *            the new register date start
     */
    public void setRegisterDateStart(String registerDateStart) {
        this.registerDateStart = registerDateStart;
    }

    /**
     * Gets the register date end.
     * 
     * @return the register date end
     */
    public String getRegisterDateEnd() {
        return registerDateEnd;
    }

    /**
     * Sets the register date end.
     * 
     * @param registerDateEnd
     *            the new register date end
     */
    public void setRegisterDateEnd(String registerDateEnd) {
        this.registerDateEnd = registerDateEnd;
    }

    /**
     * Gets the person id.
     * 
     * @return the person id
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * Sets the person id.
     * 
     * @param personId
     *            the new person id
     */
    public void setPersonId(String personId) {
        this.personId = personId;
    }

    /**
     * Gets the insert list.
     * 
     * @return the insert list
     */
    public List<String> getInsertList() {
        return insertList;
    }

    /**
     * Sets the insert list.
     * 
     * @param insertList
     *            the new insert list
     */
    public void setInsertList(List<String> insertList) {
        this.insertList = insertList;
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

}
