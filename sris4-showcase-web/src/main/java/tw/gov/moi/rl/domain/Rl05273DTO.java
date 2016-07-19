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
 * The Class Rl05273DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl05273DTO", propOrder = { "type", "moveNoticeStart", "moveNoticeEnd", "houseDateStart", "houseDateEnd", "fileType", "ReportUrl" })
@XmlRootElement(name = "Rl05273DTO")
public class Rl05273DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 類型. */
    @XmlElement(name = "type")
    @FieldName("類型")
    private String type = "2";

    /** 移民起日期. */
    @XmlElement(name = "moveNoticeStart")
    @FieldName("移民起日期")
    private String moveNoticeStart;

    /** 移民迄日期. */
    @XmlElement(name = "moveNoticeEnd")
    @FieldName("移民迄日期")
    private String moveNoticeEnd;

    /** 戶所處理時間起. */
    @XmlElement(name = "houseDateStart")
    @FieldName("戶所處理時間起")
    private String houseDateStart;

    /** 戶所處理時間迄. */
    @XmlElement(name = "houseDateEnd")
    @FieldName("戶所處理時間迄")
    private String houseDateEnd;

    /** 檔案日期. */
    @XmlElement(name = "fileType")
    @FieldName("檔案日期")
    private String fileType;

    @XmlElement(name = "ReportUrl")
    @FieldName("報表url")
    private String reportUrl;

    @XmlElement(name = "ReportUrl")
    @FieldName("下載url")
    private String fildUrl;

    /**
     * Gets the type.
     * 
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type.
     * 
     * @param type
     *            the new type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets the move notice start.
     * 
     * @return the move notice start
     */
    public String getMoveNoticeStart() {
        return moveNoticeStart;
    }

    /**
     * Sets the move notice start.
     * 
     * @param moveNoticeStart
     *            the new move notice start
     */
    public void setMoveNoticeStart(String moveNoticeStart) {
        this.moveNoticeStart = moveNoticeStart;
    }

    /**
     * Gets the move notice end.
     * 
     * @return the move notice end
     */
    public String getMoveNoticeEnd() {
        return moveNoticeEnd;
    }

    /**
     * Sets the move notice end.
     * 
     * @param moveNoticeEnd
     *            the new move notice end
     */
    public void setMoveNoticeEnd(String moveNoticeEnd) {
        this.moveNoticeEnd = moveNoticeEnd;
    }

    /**
     * Gets the house date start.
     * 
     * @return the house date start
     */
    public String getHouseDateStart() {
        return houseDateStart;
    }

    /**
     * Sets the house date start.
     * 
     * @param houseDateStart
     *            the new house date start
     */
    public void setHouseDateStart(String houseDateStart) {
        this.houseDateStart = houseDateStart;
    }

    /**
     * Gets the house date end.
     * 
     * @return the house date end
     */
    public String getHouseDateEnd() {
        return houseDateEnd;
    }

    /**
     * Sets the house date end.
     * 
     * @param houseDateEnd
     *            the new house date end
     */
    public void setHouseDateEnd(String houseDateEnd) {
        this.houseDateEnd = houseDateEnd;
    }

    /**
     * Gets the file type.
     * 
     * @return the file type
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * Sets the file type.
     * 
     * @param fileType
     *            the new file type
     */
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getReportUrl() {
        return reportUrl;
    }

    public void setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
    }

    public String getFildUrl() {
        return fildUrl;
    }

    public void setFildUrl(String fildUrl) {
        this.fildUrl = fildUrl;
    }

    @Override
    public String toString() {
        return "Rl05273DTO [type=" + type + ", moveNoticeStart=" + moveNoticeStart + ", moveNoticeEnd=" + moveNoticeEnd + ", houseDateStart=" + houseDateStart + ", houseDateEnd=" + houseDateEnd + ", fileType=" + fileType + ", reportUrl=" + reportUrl + "]";
    }

}
