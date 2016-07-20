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

/**
 * 申請統號配賦作業 DTO.
 * 
 * @author Weiren.Jheng
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl06c00DTO", propOrder = { "adminOfficeName", "adminOfficeCode", "applyDate", "userName", "idType",
        "applyQtyList", "applyQtyListSum", "remarkDocuNo", "remarkDocuDate", "qtyOrderSum" })
@XmlRootElement(name = "Rl06c00DTO")
public class Rl06c00DTO implements Serializable {

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

    /** The id type. */
    @XmlElement(name = "IdType")
    @FieldName("配賦身分代碼")
    private String idType = "";

    /** The apply qty list. */
    @XmlElement(name = "ApplyQtyList")
    @FieldName("配賦數量")
    private List<Rl06c00QtyDTO> applyQtyList = new ArrayList<Rl06c00QtyDTO>();

    /** The apply qty list sum. */
    @XmlElement(name = "ApplyQtyListSum")
    @FieldName("配賦數量(加總後)")
    private List<HashMap<String, Integer>> applyQtyListSum = new ArrayList<HashMap<String, Integer>>();

    /** 發文字號. */
    @XmlElement(name = "RemarkDocuNo")
    @FieldName("發文字號")
    private String remarkDocuNo = "";

    /** 發文日期. */
    @XmlElement(name = "RemarkDocuDate")
    @FieldName("發文日期")
    private String remarkDocuDate = "";

    /** 加總傳入數量. */
    @XmlElement(name = "QtyOrderSum")
    @FieldName("加總傳入數量")
    private List<HashMap<String, Integer>> qtyOrderSum = new ArrayList<HashMap<String, Integer>>();

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
     * Gets the id type.
     * 
     * @return the id type
     */
    public String getIdType() {
        return idType;
    }

    /**
     * Sets the id type.
     * 
     * @param idType
     *            the new id type
     */
    public void setIdType(String idType) {
        this.idType = idType;
    }

    /**
     * Gets the apply qty list.
     * 
     * @return the apply qty list
     */
    public List<Rl06c00QtyDTO> getApplyQtyList() {
        return applyQtyList;
    }

    /**
     * Sets the apply qty list.
     * 
     * @param applyQtyList
     *            the new apply qty list
     */
    public void setApplyQtyList(List<Rl06c00QtyDTO> applyQtyList) {
        this.applyQtyList = applyQtyList;
    }

    /**
     * Gets the apply qty list sum.
     * 
     * @return the apply qty list sum
     */
    public List<HashMap<String, Integer>> getApplyQtyListSum() {
        return applyQtyListSum;
    }

    /**
     * Sets the apply qty list sum.
     * 
     * @param applyQtyListSum
     *            the apply qty list sum
     */
    public void setApplyQtyListSum(List<HashMap<String, Integer>> applyQtyListSum) {
        this.applyQtyListSum = applyQtyListSum;
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
        return "Rl06c00DTO [adminOfficeName=" + adminOfficeName + ", adminOfficeCode=" + adminOfficeCode
                + ", applyDate=" + applyDate + ", userName=" + userName + ", idType=" + idType + ", remarkDocuNo="
                + remarkDocuNo + ", remarkDocuDate=" + remarkDocuDate + "]";
    }

    public List<HashMap<String, Integer>> getQtyOrderSum() {
        return qtyOrderSum;
    }

    public void setQtyOrderSum(List<HashMap<String, Integer>> qtyOrderSum) {
        this.qtyOrderSum = qtyOrderSum;
    }

}
