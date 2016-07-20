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
 * The Class UploadedCertificateFileDTO.
 * 
 * @author Jay Kan
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uploadedCertificateFileDTO", propOrder = { "operationSequenceId", "operationCode", "suffixName",
        "fileName", "contents" })
@XmlRootElement(name = "UploadedCertificateFileDTO")
public class UploadedCertificateFileDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -1624587836573338002L;

    /** 作業序號. */
    @XmlElement(name = "OperationSequenceId")
    @FieldName("作業序號")
    private String operationSequenceId;

    /** 作業代碼. */
    @XmlElement(name = "OperationCode")
    @FieldName("作業代碼")
    private String operationCode;

    /** 流水號. */
    @XmlElement(name = "SuffixName")
    @FieldName("流水號")
    private String suffixName;

    /** 檔名. */
    @XmlElement(name = "FileName")
    @FieldName("檔名")
    private String fileName;

    /** 檔案內容. */
    @XmlElement(name = "Contents")
    @FieldName("檔案內容")
    private byte[] contents;

    /**
     * Instantiates a new uploaded certificate file dto.
     */
    public UploadedCertificateFileDTO() {

    }

    /**
     * Instantiates a new uploaded certificate file dto.
     * 
     * @param pOperationSequenceId
     *            the operation sequence id
     * @param pOperationCode
     *            the operation code
     * @param pSuffixName
     *            the suffix name
     * @param pFileName
     *            the file name
     * @param pContents
     *            the contents
     */
    public UploadedCertificateFileDTO(final String pOperationSequenceId, final String pOperationCode,
            final String pSuffixName, final String pFileName, final byte[] pContents) {
        this.operationSequenceId = pOperationSequenceId;
        this.operationCode = pOperationCode;
        this.suffixName = pSuffixName;
        this.fileName = pFileName;
        this.contents = pContents;
    }

    /**
     * Gets the operation sequence id.
     * 
     * @return the operation sequence id
     */
    public String getOperationSequenceId() {
        return operationSequenceId;
    }

    /**
     * Sets the operation sequence id.
     * 
     * @param operationSequenceId
     *            the new operation sequence id
     */
    public void setOperationSequenceId(final String operationSequenceId) {
        this.operationSequenceId = operationSequenceId;
    }

    /**
     * Gets the operation code.
     * 
     * @return the operation code
     */
    public String getOperationCode() {
        return operationCode;
    }

    /**
     * Sets the operation code.
     * 
     * @param operationCode
     *            the new operation code
     */
    public void setOperationCode(final String operationCode) {
        this.operationCode = operationCode;
    }

    /**
     * Gets the suffix name.
     * 
     * @return the suffix name
     */
    public String getSuffixName() {
        return suffixName;
    }

    /**
     * Sets the suffix name.
     * 
     * @param suffixName
     *            the new suffix name
     */
    public void setSuffixName(final String suffixName) {
        this.suffixName = suffixName;
    }

    /**
     * Gets the file name.
     * 
     * @return the file name
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the file name.
     * 
     * @param fileName
     *            the new file name
     */
    public void setFileName(final String fileName) {
        this.fileName = fileName;
    }

    /**
     * Gets the contents.
     * 
     * @return the contents
     */
    public byte[] getContents() {
        return contents;
    }

    /**
     * Sets the contents.
     * 
     * @param contents
     *            the new contents
     */
    public void setContents(final byte[] contents) {
        this.contents = contents;
    }
}
