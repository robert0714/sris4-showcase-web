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
 * The Class Rl02ah0DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl02ah0DTO", propOrder = { "YearStart", "RegisterDateStart", "RegisterDateEnd", "ApplyCode_1",
        "ApplyCode_2", "ApplyCode_3", "Village_1", "Village_2", "Village_3", "ChangePageA", "ChangePageB",
        "ReportType", "ReportURL", "FileURL" })
@XmlRootElement(name = "Rl02ah0DTO")
public class Rl02ah0DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 製表類別 */
    @XmlElement(name = "Option", required = true)
    @FieldName("製表類別")
    private String option;

    /** 登記日期(起) */
    @XmlElement(name = "RegisterDateStart", required = true)
    @FieldName("登記日期(起)")
    private String registerDateStart;

    /** 登記日期(迄) */
    @XmlElement(name = "RegisterDateEnd", required = true)
    @FieldName("登記日期(迄)")
    private String registerDateEnd;

    /** 登記類別_1 */
    @XmlElement(name = "ApplyCode_1", required = true)
    @FieldName("登記類別_1")
    private String applyCode_1;

    /** 登記類別_2 */
    @XmlElement(name = "ApplyCode_2", required = true)
    @FieldName("登記類別_2")
    private String applyCode_2;

    /** 登記類別_3 */
    @XmlElement(name = "ApplyCode_3", required = true)
    @FieldName("登記類別_3")
    private String applyCode_3;

    /** 村里_1 */
    @XmlElement(name = "Village_1", required = true)
    @FieldName("村里_1")
    private String village_1;

    /** 村里_2 */
    @XmlElement(name = "Village_2", required = true)
    @FieldName("村里_2")
    private String village_2;

    /** 村里_3 */
    @XmlElement(name = "Village_3", required = true)
    @FieldName("村里_3")
    private String village_3;

    /** 換頁方式A類 */
    @XmlElement(name = "ChangePageA", required = true)
    @FieldName("換頁方式A類")
    private String changePageA;

    /** 換頁方式B類 */
    @XmlElement(name = "ChangePageB", required = true)
    @FieldName("換頁方式B類")
    private String changePageB;

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

    public String getOption() {
        return option;
    }

    public void setOption(final String option) {
        this.option = option;
    }

    public String getRegisterDateStart() {
        return registerDateStart;
    }

    public void setRegisterDateStart(final String registerDateStart) {
        this.registerDateStart = registerDateStart;
    }

    public String getRegisterDateEnd() {
        return registerDateEnd;
    }

    public void setRegisterDateEnd(final String registerDateEnd) {
        this.registerDateEnd = registerDateEnd;
    }

    public String getApplyCode_1() {
        return applyCode_1;
    }

    public void setApplyCode_1(final String applyCode_1) {
        this.applyCode_1 = applyCode_1;
    }

    public String getApplyCode_2() {
        return applyCode_2;
    }

    public void setApplyCode_2(final String applyCode_2) {
        this.applyCode_2 = applyCode_2;
    }

    public String getApplyCode_3() {
        return applyCode_3;
    }

    public void setApplyCode_3(final String applyCode_3) {
        this.applyCode_3 = applyCode_3;
    }

    public String getVillage_1() {
        return village_1;
    }

    public void setVillage_1(final String village_1) {
        this.village_1 = village_1;
    }

    public String getVillage_2() {
        return village_2;
    }

    public void setVillage_2(final String village_2) {
        this.village_2 = village_2;
    }

    public String getVillage_3() {
        return village_3;
    }

    public void setVillage_3(final String village_3) {
        this.village_3 = village_3;
    }

    public String getChangePageA() {
        return changePageA;
    }

    public void setChangePageA(final String changePageA) {
        this.changePageA = changePageA;
    }

    public String getChangePageB() {
        return changePageB;
    }

    public void setChangePageB(final String changePageB) {
        this.changePageB = changePageB;
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

    public String getFileURL() {
        return fileURL;
    }

    public void setFileURL(String fileURL) {
        this.fileURL = fileURL;
    }
}
