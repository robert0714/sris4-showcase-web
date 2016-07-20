/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.beanutils.BeanUtils;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.domain.Xldf004mtType;
import tw.gov.moi.exception.RisBusinessException;
import tw.gov.moi.rl.common.constant.RlTxCodeConstant;
import tw.gov.moi.rl.component.dto.XLDFDomainObject;
import tw.gov.moi.rl.component.xldf.dto.XLDF004MT;
import tw.gov.moi.rl.dto.rl00001.XLDFForeignRoleDTO;

/**
 * 補填資料DTO(TLDF)
 * 
 * @author DAXIONG
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XLDF004MTDTO", propOrder = { "passportId", "residentNo", "otherId" })
public class XLDF004MTDTO extends XLDFPersonDataDTO {

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

    /**
     * 取得外籍者資料
     * 
     * @return XLDFForeignRoleDTO
     * 
     *         (non-Javadoc)
     * 
     * @see tw.gov.moi.rl.domain.XLDFPersonDataDTO#getForeignRoleDTO()
     */
    @Override
    public XLDFForeignRoleDTO getForeignRoleDTO() {
        return new XLDFSimpleForeignRoleDTO(passportId, residentNo, otherId);
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

    public String getOtherID() {
        return otherId;
    }

    public void setOtherId(String otherId) {
        this.otherId = otherId;
    }

    @Override
    public XLDFDomainObject makeXLDFDomainObject() {

        XLDF004MT result = new XLDF004MT();
        result.setDomainObj(new Xldf004mtType());

        try {
            BeanUtils.copyProperties(result.getDomainObj(), this);
        } catch (Exception e) {
            throw new RisBusinessException(tw.gov.moi.rs.common.constant.RsCDMesg.TX6099E, e);
        }

        return result;
    }

}
