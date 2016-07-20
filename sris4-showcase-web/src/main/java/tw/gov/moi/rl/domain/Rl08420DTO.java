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

/**
 * 列印學齡兒童名冊.
 * 
 * @author Derek Wang
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl08420DTO", propOrder = { "gatherType", "birthDateStart", "birthDateEnd", "schoolZone",
        "schoolZoneList", "changeVillage", "isPrintEmpty", "reportFormat", "reportURL" })
@XmlRootElement(name = "Rl08420DTO")
public class Rl08420DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 統計造冊. */
    @XmlElement(name = "GatherType")
    @FieldName("統計造冊")
    private String gatherType;

    /** 學齡兒童出生日期(起)(含). */
    @XmlElement(name = "BirthDateStart")
    @FieldName("學齡兒童出生日期(起)(含)")
    private String birthDateStart;

    /** 學齡兒童出生日期(迄)(含). */
    @XmlElement(name = "BirthDateEnd")
    @FieldName("學齡兒童出生日期(迄)(含)")
    private String birthDateEnd;

    /** 學區名稱. */
    @XmlElement(name = "SchoolZone")
    @FieldName("學區名稱")
    private String schoolZone;

    /** 學區名稱List. */
    @XmlElement(name = "SchoolZoneList")
    @FieldName("學區名稱List")
    private List<String> schoolZoneList;

    /** 是否依村里跳頁. */
    @XmlElement(name = "ChangeVillage")
    @FieldName("是否依村里跳頁")
    private String changeVillage;

    /** 是否列印學齡兒童空白名冊. */
    @XmlElement(name = "IsPrintEmpty")
    @FieldName("是否列印學齡兒童空白名冊")
    private String isPrintEmpty;

    /** 報表格式. */
    @XmlElement(name = "ReportFormat")
    @FieldName("報表格式")
    private String reportFormat;

    /** 報表路徑. */
    @XmlElement(name = "ReportURL")
    @FieldName("報表路徑")
    private String reportURL;

    /**
     * Gets the gather type.
     * 
     * @return the gather type
     */
    public String getGatherType() {
        return gatherType;
    }

    /**
     * Sets the gather type.
     * 
     * @param gatherType
     *            the new gather type
     */
    public void setGatherType(String gatherType) {
        this.gatherType = gatherType;
    }

    /**
     * Gets the birth date start.
     * 
     * @return the birth date start
     */
    public String getBirthDateStart() {
        return birthDateStart;
    }

    /**
     * Sets the birth date start.
     * 
     * @param birthDateStart
     *            the new birth date start
     */
    public void setBirthDateStart(String birthDateStart) {
        this.birthDateStart = birthDateStart;
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
     * Gets the school zone.
     * 
     * @return the school zone
     */
    public String getSchoolZone() {
        return schoolZone;
    }

    /**
     * Sets the school zone.
     * 
     * @param schoolZone
     *            the new school zone
     */
    public void setSchoolZone(String schoolZone) {
        this.schoolZone = schoolZone;
    }

    /**
     * Gets the school zone list.
     * 
     * @return the school zone list
     */
    public List<String> getSchoolZoneList() {
        return schoolZoneList;
    }

    /**
     * Sets the school zone list.
     * 
     * @param schoolZoneList
     *            the new school zone list
     */
    public void setSchoolZoneList(List<String> schoolZoneList) {
        this.schoolZoneList = schoolZoneList;
    }

    /**
     * Gets the change village.
     * 
     * @return the change village
     */
    public String getChangeVillage() {
        return changeVillage;
    }

    /**
     * Sets the change village.
     * 
     * @param changeVillage
     *            the new change village
     */
    public void setChangeVillage(String changeVillage) {
        this.changeVillage = changeVillage;
    }

    /**
     * Gets the checks if is print empty.
     * 
     * @return the checks if is print empty
     */
    public String getIsPrintEmpty() {
        return isPrintEmpty;
    }

    /**
     * Sets the checks if is print empty.
     * 
     * @param isPrintEmpty
     *            the new checks if is print empty
     */
    public void setIsPrintEmpty(String isPrintEmpty) {
        this.isPrintEmpty = isPrintEmpty;
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
