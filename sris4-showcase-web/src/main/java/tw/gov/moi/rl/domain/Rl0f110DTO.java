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
import tw.gov.moi.domain.Rldf012dType;

/**
 * 空白國民身分證（膠膜）保管人員移交 DTO
 * 
 * @author Marcus Chen
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl0f110DTO", propOrder = { "type", "storageNameOld", "startNo", "endNo", "storageNameNew",
        "reportType", "rldf012dLockList", "resultShowList", "reportUrl", "fileURL", "queryList" })
@XmlRootElement(name = "Rl0f110DTO")
public class Rl0f110DTO implements Serializable {

    /** The Serail Id */
    private static final long serialVersionUID = -4387740318841024164L;

    /** 類別 */
    @XmlElement(name = "Type", required = true)
    @FieldName("類別")
    private String type;

    /** 起始號碼 */
    @XmlElement(name = "StartNo", required = true)
    @FieldName("起始號碼")
    private String startNo;

    /** 終止號碼 */
    @XmlElement(name = "EndNo", required = true)
    @FieldName("終止號碼")
    private String endNo;

    /** 原保管人員 */
    @XmlElement(name = "StorageNameOld", required = true)
    @FieldName("原保管人員")
    private String storageNameOld;

    /** 新保管人員 */
    @XmlElement(name = "StorageNameNew", required = true)
    @FieldName("新保管人員")
    private String storageNameNew;

    /** 檔案格式 */
    @XmlElement(name = "ReportType", required = true)
    @FieldName("檔案格式")
    private String reportType;

    /** 檔案Url */
    @XmlElement(name = "ReportUrl", required = true)
    @FieldName("檔案Url")
    private String reportUrl;

    /** Lock Obj List */
    @XmlElement(name = "Rldf012dLockList", required = true)
    private List<Rldf012dType> rldf012dLockList;

    /** 查詢顯示結果 */
    @XmlElement(name = "ResultShowList", required = true)
    private List<Rl0f110ResultDTO> resultShowList;

    /** 執行所回傳之下載檔案. */
    @XmlElement(name = "FileURL")
    @FieldName("執行所回傳之下載檔案")
    private String fileURL;

    /** 查詢結果. */
    @XmlElement(name = "QueryList")
    @FieldName("查詢結果")
    private List<Rldf012dType> queryList;

    /**
     * @return the startNo
     */
    public String getStartNo() {
        return startNo;
    }

    /**
     * @param startNo
     *            the startNo to set
     */
    public void setStartNo(String startNo) {
        this.startNo = startNo;
    }

    /**
     * @return the endNo
     */
    public String getEndNo() {
        return endNo;
    }

    /**
     * @param endNo
     *            the endNo to set
     */
    public void setEndNo(String endNo) {
        this.endNo = endNo;
    }

    /**
     * @return the storageNameOld
     */
    public String getStorageNameOld() {
        return storageNameOld;
    }

    /**
     * @param storageNameOld
     *            the storageNameOld to set
     */
    public void setStorageNameOld(String storageNameOld) {
        this.storageNameOld = storageNameOld;
    }

    /**
     * @return the storageNameNew
     */
    public String getStorageNameNew() {
        return storageNameNew;
    }

    /**
     * @param storageNameNew
     *            the storageNameNew to set
     */
    public void setStorageNameNew(String storageNameNew) {
        this.storageNameNew = storageNameNew;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     *            the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the reportType
     */
    public String getReportType() {
        return reportType;
    }

    /**
     * @param reportType
     *            the reportType to set
     */
    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    /**
     * @return the resultShowList
     */
    public List<Rl0f110ResultDTO> getResultShowList() {
        return resultShowList;
    }

    /**
     * @param resultShowList
     *            the resultShowList to set
     */
    public void setResultShowList(List<Rl0f110ResultDTO> resultShowList) {
        this.resultShowList = resultShowList;
    }

    /**
     * @return the rldf012dLockList
     */
    public List<Rldf012dType> getRldf012dLockList() {
        return rldf012dLockList;
    }

    /**
     * @param rldf012dLockList
     *            the rldf012dLockList to set
     */
    public void setRldf012dLockList(List<Rldf012dType> rldf012dLockList) {
        this.rldf012dLockList = rldf012dLockList;
    }

    public String getReportUrl() {
        return reportUrl;
    }

    public void setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
    }

    public String getFileURL() {
        return fileURL;
    }

    public void setFileURL(String fileURL) {
        this.fileURL = fileURL;
    }

    public List<Rldf012dType> getQueryList() {
        return queryList;
    }

    public void setQueryList(List<Rldf012dType> queryList) {
        this.queryList = queryList;
    }
}
