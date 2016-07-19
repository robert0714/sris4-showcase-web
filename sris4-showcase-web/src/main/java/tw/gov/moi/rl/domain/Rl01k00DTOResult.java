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
 * The Class Rl01k00DTOResult.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01k00DTOResult", propOrder = { "necessaryDataContent", "certificateDataContent", "payDataContent",
        "noticeDataContent", "transactionId", "areaCode", "adminOfficceCode", "site_id", "categoryType", "dataCode",
        "dataGrade", "fatherDataCode", "isNecessary", "permutation_no", "print_order" })
@XmlRootElement(name = "Rl01k00DTOResult")
public class Rl01k00DTOResult implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 必要項目. */
    @XmlElement(name = "NecessaryDataContent")
    @FieldName("必要項目")
    private String necessaryDataContent;

    /** 應繳書件. */
    @XmlElement(name = "CertificateDataContent")
    @FieldName("應繳書件")
    private String certificateDataContent;

    /** 規費項目. */
    @XmlElement(name = "PayDataContent")
    @FieldName("規費項目")
    private String payDataContent;

    /** 規費項目. */
    @XmlElement(name = "PayDataContent")
    @FieldName("規費項目")
    private String necessaryPayDataContent;

    /** 應注意事項. */
    @XmlElement(name = "NoticeDataContent")
    @FieldName("應注意事項 ")
    private String noticeDataContent;

    /** 應注意事項. */
    @XmlElement(name = "NoticeDataContent")
    @FieldName("應注意事項 ")
    private String necessaryNoticeDataContent;

    /** 告知單個案交易序號. */
    @XmlElement(name = "TransactionId")
    @FieldName("告知單個案交易序號")
    private String transactionId;

    /** 行政區域代碼. */
    @XmlElement(name = "AreaCode")
    @FieldName("行政區域代碼")
    private String areaCode;

    /** 戶所代碼. */
    @XmlElement(name = "AdminOfficceCode")
    @FieldName("戶所代碼")
    private String adminOfficceCode;

    /** 作業點代碼. */
    @XmlElement(name = "Site_id")
    @FieldName("作業點代碼")
    private String site_id;

    /** 資料類別. */
    @XmlElement(name = "CategoryType")
    @FieldName("資料類別")
    private String categoryType;

    /** 資料代碼. */
    @XmlElement(name = "DataCode")
    @FieldName("資料代碼")
    private String dataCode;

    /** 資料層級. */
    @XmlElement(name = "DataGrade")
    @FieldName("資料層級")
    private String dataGrade;

    /** 父層級資料代碼. */
    @XmlElement(name = "FatherDataCode")
    @FieldName("父層級資料代碼")
    private String fatherDataCode;

    /** 是否必要. */
    @XmlElement(name = "IsNecessary")
    @FieldName("是否必要")
    private String isNecessary;

    /** 排列順序序號. */
    @XmlElement(name = "Permutation_no")
    @FieldName("排列順序序號")
    private String permutation_no;

    /** 報表順序序號. */
    @XmlElement(name = "Print_order")
    @FieldName("報表順序序號")
    private String print_order;

    /**
     * Gets the necessary data content.
     * 
     * @return the necessary data content
     */
    public String getNecessaryDataContent() {
        return necessaryDataContent;
    }

    /**
     * Sets the necessary data content.
     * 
     * @param necessaryDataContent
     *            the new necessary data content
     */
    public void setNecessaryDataContent(String necessaryDataContent) {
        this.necessaryDataContent = necessaryDataContent;
    }

    /**
     * Gets the certificate data content.
     * 
     * @return the certificate data content
     */
    public String getCertificateDataContent() {
        return certificateDataContent;
    }

    /**
     * Sets the certificate data content.
     * 
     * @param certificateDataContent
     *            the new certificate data content
     */
    public void setCertificateDataContent(String certificateDataContent) {
        this.certificateDataContent = certificateDataContent;
    }

    /**
     * Gets the pay data content.
     * 
     * @return the pay data content
     */
    public String getPayDataContent() {
        return payDataContent;
    }

    /**
     * Sets the pay data content.
     * 
     * @param payDataContent
     *            the new pay data content
     */
    public void setPayDataContent(String payDataContent) {
        this.payDataContent = payDataContent;
    }

    /**
     * Gets the notice data content.
     * 
     * @return the notice data content
     */
    public String getNoticeDataContent() {
        return noticeDataContent;
    }

    /**
     * Sets the notice data content.
     * 
     * @param noticeDataContent
     *            the new notice data content
     */
    public void setNoticeDataContent(String noticeDataContent) {
        this.noticeDataContent = noticeDataContent;
    }

    /**
     * Gets the area code.
     * 
     * @return the area code
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * Sets the area code.
     * 
     * @param areaCode
     *            the new area code
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    /**
     * Gets the admin officce code.
     * 
     * @return the admin officce code
     */
    public String getAdminOfficceCode() {
        return adminOfficceCode;
    }

    /**
     * Sets the admin officce code.
     * 
     * @param adminOfficceCode
     *            the new admin officce code
     */
    public void setAdminOfficceCode(String adminOfficceCode) {
        this.adminOfficceCode = adminOfficceCode;
    }

    /**
     * Gets the site_id.
     * 
     * @return the site_id
     */
    public String getSite_id() {
        return site_id;
    }

    /**
     * Sets the site_id.
     * 
     * @param site_id
     *            the new site_id
     */
    public void setSite_id(String site_id) {
        this.site_id = site_id;
    }

    /**
     * Gets the category type.
     * 
     * @return the category type
     */
    public String getCategoryType() {
        return categoryType;
    }

    /**
     * Sets the category type.
     * 
     * @param categoryType
     *            the new category type
     */
    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }

    /**
     * Gets the permutation_no.
     * 
     * @return the permutation_no
     */
    public String getPermutation_no() {
        return permutation_no;
    }

    /**
     * Sets the permutation_no.
     * 
     * @param permutation_no
     *            the new permutation_no
     */
    public void setPermutation_no(String permutation_no) {
        this.permutation_no = permutation_no;
    }

    /**
     * Gets the print_order.
     * 
     * @return the print_order
     */
    public String getPrint_order() {
        return print_order;
    }

    /**
     * Sets the print_order.
     * 
     * @param print_order
     *            the new print_order
     */
    public void setPrint_order(String print_order) {
        this.print_order = print_order;
    }

    /**
     * Gets the checks if is necessary.
     * 
     * @return the checks if is necessary
     */
    public String getIsNecessary() {
        return isNecessary;
    }

    /**
     * Sets the checks if is necessary.
     * 
     * @param isNecessary
     *            the new checks if is necessary
     */
    public void setIsNecessary(String isNecessary) {
        this.isNecessary = isNecessary;
    }

    /**
     * Gets the transaction id.
     * 
     * @return the transaction id
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the transaction id.
     * 
     * @param transactionId
     *            the new transaction id
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * Gets the father data code.
     * 
     * @return the father data code
     */
    public String getFatherDataCode() {
        return fatherDataCode;
    }

    /**
     * Sets the father data code.
     * 
     * @param fatherDataCode
     *            the new father data code
     */
    public void setFatherDataCode(String fatherDataCode) {
        this.fatherDataCode = fatherDataCode;
    }

    /**
     * Gets the data code.
     * 
     * @return the data code
     */
    public String getDataCode() {
        return dataCode;
    }

    /**
     * Sets the data code.
     * 
     * @param dataCode
     *            the new data code
     */
    public void setDataCode(String dataCode) {
        this.dataCode = dataCode;
    }

    /**
     * Gets the data grade.
     * 
     * @return the data grade
     */
    public String getDataGrade() {
        return dataGrade;
    }

    /**
     * Sets the data grade.
     * 
     * @param dataGrade
     *            the new data grade
     */
    public void setDataGrade(String dataGrade) {
        this.dataGrade = dataGrade;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((dataCode == null) ? 0 : dataCode.hashCode());
        return result;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Rl01k00DTOResult other = (Rl01k00DTOResult) obj;
        if (fatherDataCode == null) {
            if (other.dataCode != null)
                return false;
        } else if (!fatherDataCode.equals(other.dataCode))
            return false;
        return true;
    }

    public String getNecessaryPayDataContent() {
        return necessaryPayDataContent;
    }

    public void setNecessaryPayDataContent(String necessaryPayDataContent) {
        this.necessaryPayDataContent = necessaryPayDataContent;
    }

    public String getNecessaryNoticeDataContent() {
        return necessaryNoticeDataContent;
    }

    public void setNecessaryNoticeDataContent(String necessaryNoticeDataContent) {
        this.necessaryNoticeDataContent = necessaryNoticeDataContent;
    }

}
