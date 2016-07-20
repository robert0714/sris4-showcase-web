/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.ae.report.ReportFormat;
import tw.gov.moi.domain.Rldf014dType;
import tw.gov.moi.rl.rl02b00.service.Rl02ba0Service;
import tw.gov.moi.rs.common.report.dto.BaseITextReportParams;

/**
 * The Class Rl02ba0DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl02ba0DTO", propOrder = { "statisticYyymm", "burnedNumberBlack", "burnedNumberFilm", "reportType",
        "reportParams", "reportURL", "comment", "erroFlag", "fileURL", "msgList", "rldf014dMap", "reportDataList",
        "siteName" })
@XmlRootElement(name = "Rl02ba0DTO")
public class Rl02ba0DTO extends BaseITextReportParams implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 統計年月 */
    @XmlElement(name = "StatisticYyymm", required = true)
    @FieldName("統計年月")
    private String statisticYyymm = "";

    /** 焚毀數(空白證) */
    @XmlElement(name = "BurnedNumberBlack", required = true)
    @FieldName("焚毀數(空白證)")
    private String burnedNumberBlack = "";

    /** 焚毀數(膠　膜) */
    @XmlElement(name = "BurnedNumberFilm", required = true)
    @FieldName("焚毀數(膠　膜)")
    private String burnedNumberFilm = "";

    /** 備註 */
    @XmlElement(name = "Comment", required = true)
    @FieldName("備註")
    private String comment = "";

    /** 錯誤訊息旗標 */
    @XmlElement(name = "ErroFlag", required = true)
    @FieldName("錯誤訊息旗標")
    private String erroFlag = "";

    /** 報表格式 */
    @XmlElement(name = "ReportType", required = true)
    @FieldName("報表格式")
    private String reportType = "";

    @XmlElement(name = "Rldf014dMap")
    @FieldName("當月領發月報資料")
    private HashMap<String, Rldf014dType> rldf014dMap = new HashMap<String, Rldf014dType>();

    /** 報表路徑 */
    @XmlElement(name = "ReportURL", required = true)
    @FieldName("報表路徑")
    private String reportURL = "";

    /** 執行所回傳之下載檔案. */
    @XmlElement(name = "FileURL")
    @FieldName("執行所回傳之下載檔案")
    private String fileURL = "";

    /** 列印時提示的訊息 */
    @XmlElement(name = "MsgList")
    @FieldName("列印時提示的訊息")
    private List<String> msgList = new ArrayList<String>();

    @XmlElement(name = "ReportParams")
    @FieldName("報表參數")
    private HashMap<String, String> reportParams = new HashMap<String, String>();

    /** 報表資料. */
    @XmlElement(name = "ReportDataList")
    @FieldName("報表資料")
    private List<Rlrp02ba0DTO> reportDataList = new ArrayList<Rlrp02ba0DTO>();

    /** 戶政所別. */
    @XmlElement(name = "SiteName")
    @FieldName("戶政所別")
    private String siteName = "";

    public String getStatisticYyymm() {
        return this.statisticYyymm;
    }

    public void setStatisticYyymm(final String statisticYyymm) {
        this.statisticYyymm = statisticYyymm;
    }

    public String getBurnedNumberBlack() {
        return this.burnedNumberBlack;
    }

    public void setBurnedNumberBlack(final String burnedNumberBlack) {
        this.burnedNumberBlack = burnedNumberBlack;
    }

    public String getBurnedNumberFilm() {
        return this.burnedNumberFilm;
    }

    public void setBurnedNumberFilm(final String burnedNumberFilm) {
        this.burnedNumberFilm = burnedNumberFilm;
    }

    public String getReportType() {
        return this.reportType;
    }

    public void setReportType(final String reportType) {
        this.reportType = reportType;
    }

    public String getReportURL() {
        return this.reportURL;
    }

    public void setReportURL(final String reportURL) {
        this.reportURL = reportURL;
    }

    public HashMap<String, String> getReportParams() {
        return this.reportParams;
    }

    public void setReportParams(HashMap<String, String> reportParams) {
        this.reportParams = reportParams;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(final String comment) {
        this.comment = comment;
    }

    public String getErroFlag() {
        return this.erroFlag;
    }

    public void setErroFlag(final String erroFlag) {
        this.erroFlag = erroFlag;
    }

    public String getFileURL() {
        return this.fileURL;
    }

    public void setFileURL(String fileURL) {
        this.fileURL = fileURL;
    }

    public List<String> getMsgList() {
        return this.msgList;
    }

    public void setMsgList(List<String> msgList) {
        this.msgList = msgList;
    }

    public HashMap<String, Rldf014dType> getRldf014dMap() {
        return this.rldf014dMap;
    }

    public void setRldf014dMap(HashMap<String, Rldf014dType> rldf014dMap) {
        this.rldf014dMap = rldf014dMap;
    }

    @Override
    public String getMainReportName() {
        return Rl02ba0Service.RLRP02BA0;
    }

    @Override
    public String getReportExt() {
        return Rl02ba0Service.RLRP02BA0;
    }

    @Override
    public ReportFormat getReportFormatEnum() {
        return "csv".equalsIgnoreCase(this.reportType) ? ReportFormat.CSV : ReportFormat.PDF;
    }

    public List<Rlrp02ba0DTO> getReportDataList() {
        return this.reportDataList;
    }

    public void setReportDataList(List<Rlrp02ba0DTO> reportDataList) {
        this.reportDataList = reportDataList;
    }

    public String getSiteName() {
        return this.siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

}
