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
 * The Class Rl06d00DTO.
 * 
 * @author Weiren.Jheng
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl06d00DTO", propOrder = { "adminOfficeName", "adminOfficeCode", "applyDate", "userName", "qty",
        "remarkDocuNo", "remarkDocuDate", "idQty" })
@XmlRootElement(name = "Rl06d00DTO")
public class Rl06d00DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The admin office name. */
    @XmlElement(name = "AdminOfficeName")
    @FieldName("戶政所名稱")
    private String adminOfficeName = "";

    /** The admin office code. */
    @XmlElement(name = "AdminOfficeCode")
    @FieldName("戶政所代碼")
    private String adminOfficeCode = "";

    /** The apply date. */
    @XmlElement(name = "ApplyDate")
    @FieldName("配賦申請日期")
    private String applyDate = "";

    /** The user name. */
    @XmlElement(name = "UserName")
    @FieldName("戶籍員姓名")
    private String userName = "";

    /** The qty. */
    @XmlElement(name = "Qty")
    @FieldName("配賦數量")
    private String qty = "";

    /** 發文字號. */
    @XmlElement(name = "RemarkDocuNo")
    @FieldName("發文字號")
    private String remarkDocuNo = "";

    /** 發文日期. */
    @XmlElement(name = "RemarkDocuDate")
    @FieldName("發文日期")
    private String remarkDocuDate = "";

    /** 尚未被配賦的資料筆數. */
    @XmlElement(name = "IdQty")
    @FieldName("尚未被配賦的資料筆數")
    private int idQty = 0;

    /**
     * Gets the admin office name.
     * 
     * @return the admin office name
     */
    public String getAdminOfficeName() {
        return adminOfficeName;
    }

    /**
     * Sets the admin office name.
     * 
     * @param adminOfficeName
     *            the new admin office name
     */
    public void setAdminOfficeName(String adminOfficeName) {
        this.adminOfficeName = adminOfficeName;
    }

    /**
     * Gets the admin office code.
     * 
     * @return the admin office code
     */
    public String getAdminOfficeCode() {
        return adminOfficeCode;
    }

    /**
     * Sets the admin office code.
     * 
     * @param adminOfficeCode
     *            the new admin office code
     */
    public void setAdminOfficeCode(String adminOfficeCode) {
        this.adminOfficeCode = adminOfficeCode;
    }

    /**
     * Gets the apply date.
     * 
     * @return the apply date
     */
    public String getApplyDate() {
        return applyDate;
    }

    /**
     * Sets the apply date.
     * 
     * @param applyDate
     *            the new apply date
     */
    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }

    /**
     * Gets the user name.
     * 
     * @return the user name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the user name.
     * 
     * @param userName
     *            the new user name
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Gets the qty.
     * 
     * @return the qty
     */
    public String getQty() {
        return qty;
    }

    /**
     * Sets the qty.
     * 
     * @param qty
     *            the new qty
     */
    public void setQty(String qty) {
        this.qty = qty;
    }

    /**
     * Gets the remark docu no.
     * 
     * @return the remark docu no
     */
    public String getRemarkDocuNo() {
        return remarkDocuNo;
    }

    /**
     * Sets the remark docu no.
     * 
     * @param remarkDocuNo
     *            the new remark docu no
     */
    public void setRemarkDocuNo(String remarkDocuNo) {
        this.remarkDocuNo = remarkDocuNo;
    }

    /**
     * Gets the remark docu date.
     * 
     * @return the remark docu date
     */
    public String getRemarkDocuDate() {
        return remarkDocuDate;
    }

    /**
     * Sets the remark docu date.
     * 
     * @param remarkDocuDate
     *            the new remark docu date
     */
    public void setRemarkDocuDate(String remarkDocuDate) {
        this.remarkDocuDate = remarkDocuDate;
    }

    @Override
    public String toString() {
        return "Rl06d00DTO [adminOfficeName=" + adminOfficeName + ", adminOfficeCode=" + adminOfficeCode
                + ", applyDate=" + applyDate + ", userName=" + userName + ", qty=" + qty + ", remarkDocuNo="
                + remarkDocuNo + ", remarkDocuDate=" + remarkDocuDate + "]";
    }

    public int getIdQty() {
        return idQty;
    }

    public void setIdQty(int idQty) {
        this.idQty = idQty;
    }

}
