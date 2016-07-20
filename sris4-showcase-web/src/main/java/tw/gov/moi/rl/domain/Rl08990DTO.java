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

import javax.xml.bind.annotation.XmlElement;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * 同戶人口數及同門牌設籍戶數統計.
 * 
 * @author Jay Kan
 */
public class Rl08990DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 統計造冊條件. */
    @XmlElement(name = "ReportType")
    @FieldName("統計造冊條件")
    private String reportType;

    /** 統計造冊方式. */
    @XmlElement(name = "ReportKind")
    @FieldName("統計造冊方式")
    private String reportKind;

    /** 換頁方式. */
    @XmlElement(name = "PagingMode")
    @FieldName("換頁方式")
    private String pagingMode;

    /** 檔案格式. */
    @XmlElement(name = "ReportFormat")
    @FieldName("檔案格式")
    private String reportFormat;

    /** 報表URL. */
    @XmlElement(name = "ReportURL")
    @FieldName("報表URL")
    private String reportURL;

    /** 人（含）以上. */
    @XmlElement(name = "PersonAbove")
    @FieldName("人（含）以上")
    private String personAbove;

    /** 戶（含）以上. */
    @XmlElement(name = "HouseholdAbove")
    @FieldName("戶（含）以上")
    private String householdAbove;

    /** 造冊村里／鄰. */
    @XmlElement(name = "VillageNeighborDTO")
    @FieldName("造冊村里／鄰")
    private List<Rl08990VillageNeighborDTO> villageNeighborDTO = new ArrayList<Rl08990VillageNeighborDTO>();

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getReportKind() {
        return reportKind;
    }

    public void setReportKind(String reportKind) {
        this.reportKind = reportKind;
    }

    public String getPagingMode() {
        return pagingMode;
    }

    public void setPagingMode(String pagingMode) {
        this.pagingMode = pagingMode;
    }

    public String getReportFormat() {
        return reportFormat;
    }

    public void setReportFormat(String reportFormat) {
        this.reportFormat = reportFormat;
    }

    public String getReportURL() {
        return reportURL;
    }

    public void setReportURL(String reportURL) {
        this.reportURL = reportURL;
    }

    public String getPersonAbove() {
        return personAbove;
    }

    public void setPersonAbove(String personAbove) {
        this.personAbove = personAbove;
    }

    public String getHouseholdAbove() {
        return householdAbove;
    }

    public void setHouseholdAbove(String householdAbove) {
        this.householdAbove = householdAbove;
    }

    public List<Rl08990VillageNeighborDTO> getVillageNeighborDTO() {
        return villageNeighborDTO;
    }

    public void setVillageNeighborDTO(List<Rl08990VillageNeighborDTO> villageNeighborDTO) {
        this.villageNeighborDTO = villageNeighborDTO;
    }
}
