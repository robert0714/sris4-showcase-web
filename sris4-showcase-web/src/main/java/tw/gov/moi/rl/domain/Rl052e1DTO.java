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
import tw.gov.moi.dbo.entity.SelectEntity;
import tw.gov.moi.domain.Rldf054mType;

/**
 * The Class Rl052e1DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl052e1DTO", propOrder = { "Rldf054mList" })
@XmlRootElement(name = "Rl052e1DTO")
public class Rl052e1DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 報表路徑. */
    @XmlElement(name = "ReportURL", required = true)
    @FieldName("報表路徑")
    private String reportURL;

    /** rldf054m Data List */
    @XmlElement(name = "Rldf054mList", required = true)
    @FieldName("rldf054m Data List")
    private List<SelectEntity<Rldf054mType>> rldf054mList;

    public List<SelectEntity<Rldf054mType>> getRldf054mList() {
        return rldf054mList;
    }

    public void setRldf054mList(final List<SelectEntity<Rldf054mType>> rldf054mList) {
        this.rldf054mList = rldf054mList;
    }

    public String getReportURL() {
        return reportURL;
    }

    public void setReportURL(String reportURL) {
        this.reportURL = reportURL;
    }

}
