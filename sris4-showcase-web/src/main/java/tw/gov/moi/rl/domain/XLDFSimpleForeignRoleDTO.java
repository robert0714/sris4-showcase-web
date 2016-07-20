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
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.dto.rl00001.XLDFForeignRoleDTO;

/**
 * 外籍者資料DTO
 * 
 * @author DAXIONG
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XLDFForeignRoleDTO", propOrder = { "passportId", "residentNo", "otherId" })
public class XLDFSimpleForeignRoleDTO implements XLDFForeignRoleDTO, Serializable {

    private static final long serialVersionUID = 1L;

    /** 外籍者護照號碼 */
    @XmlElement(name = "PassportId", required = true)
    @FieldName("外籍者護照號碼")
    private String passportId;

    /** 外籍者統一證號 */
    @XmlElement(name = "ResidentNo", required = true)
    @FieldName("外籍者統一證號")
    private String residentNo;

    /** 外籍者其他證號 */
    @XmlElement(name = "OtherId", required = true)
    @FieldName("外籍者其他證號")
    private String otherId;

    public XLDFSimpleForeignRoleDTO(String passportId, String residentNo, String otherId) {
        super();
        this.passportId = passportId;
        this.residentNo = residentNo;
        this.otherId = otherId;
    }

    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        this.passportId = passportId;
    }

    public String getResidentNo() {
        return residentNo;
    }

    public void setResidentNo(String residentNo) {
        this.residentNo = residentNo;
    }

    public String getOtherId() {
        return otherId;
    }

    public void setOtherId(String otherId) {
        this.otherId = otherId;
    }

}
