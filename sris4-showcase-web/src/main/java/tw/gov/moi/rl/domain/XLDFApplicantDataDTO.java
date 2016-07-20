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

/**
 * 申請人DTO
 * 
 * @author DAXIONG
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XLDFApplicantDataDTO", propOrder = { "xldfPersonBriefDataDTO", "applyRelationship" })
public class XLDFApplicantDataDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 申請人簡要資料DTO */
    @XmlElement(name = "XldfPersonBriefDataDTO", required = true)
    @FieldName("申請人簡要資料DTO")
    private XLDFPersonBriefDataDTO xldfPersonBriefDataDTO = new XLDFPersonBriefDataDTO();

    /** 申請人與當事人關係 */
    @XmlElement(name = "ApplyRelationship", required = true)
    @FieldName("申請人與當事人關係")
    private String applyRelationship;

    public XLDFApplicantDataDTO() {
        super();
        this.xldfPersonBriefDataDTO = new XLDFPersonBriefDataDTO();
    }

    public XLDFApplicantDataDTO(XLDFPersonBriefDataDTO xldfPersonBriefDataDTO, String applyRelationship) {
        super();
        this.xldfPersonBriefDataDTO = xldfPersonBriefDataDTO;
        this.applyRelationship = applyRelationship;
    }

    public XLDFPersonBriefDataDTO getXldfPersonBriefDataDTO() {
        return xldfPersonBriefDataDTO;
    }

    public void setXldfPersonBriefDataDTO(XLDFPersonBriefDataDTO xldfPersonBriefDataDTO) {
        this.xldfPersonBriefDataDTO = xldfPersonBriefDataDTO;
    }

    public String getApplyRelationship() {
        return applyRelationship;
    }

    public void setApplyRelationship(String applyRelationship) {
        this.applyRelationship = applyRelationship;
    }

}
