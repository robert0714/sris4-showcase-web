/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * The Class Rl02ac0DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl02ac0DTO", propOrder = { "personId", "personIdList", "applyYyymmdd", "rl02ac0ResultList",
        "applyReportUrl" })
@XmlRootElement(name = "Rl02ac0DTO")
public class Rl02ac0DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 國民身分證統一編號(B類) */
    @XmlElement(name = "PersonId")
    @FieldName("國民身分證統一編號(B類)")
    private String personId;

    /** 國民身分證統一編號(A類) */
    @XmlElement(name = "PersonIdList")
    @FieldName("國民身分證統一編號(A類)")
    private String personIdList[] = new String[6];

    /** 受理日期 */
    @XmlElement(name = "ApplyYyymmdd")
    @FieldName("受理日期")
    private String applyYyymmdd;

    /** 報表路徑 */
    @XmlElement(name = "ReportUrl")
    @FieldName("報表路徑")
    private String reportUrl;

    /** Rl02ac0ResultDTO */
    @XmlElement(name = "Rl02ac0ResultList")
    @FieldName("Rl02ac0ResultList")
    private List<Rl02ac0ResultDTO> rl02ac0ResultList = new ArrayList<Rl02ac0ResultDTO>();

    /** 申請書報表路徑 */
    @XmlElement(name = "ApplyReportUrl")
    @FieldName("申請書報表路徑")
    private String applyReportUrl;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String[] getPersonIdList() {
        return personIdList;
    }

    public void setPersonIdList(String[] personIdList) {
        this.personIdList = personIdList;
    }

    public String getApplyYyymmdd() {
        return applyYyymmdd;
    }

    public void setApplyYyymmdd(String applyYyymmdd) {
        this.applyYyymmdd = applyYyymmdd;
    }

    public String getReportUrl() {
        return reportUrl;
    }

    public void setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
    }

    public List<Rl02ac0ResultDTO> getRl02ac0ResultList() {
        return rl02ac0ResultList;
    }

    public void setRl02ac0ResultList(List<Rl02ac0ResultDTO> rl02ac0ResultList) {
        this.rl02ac0ResultList = rl02ac0ResultList;
    }

    public String getApplyReportUrl() {
        return applyReportUrl;
    }

    public void setApplyReportUrl(String applyReportUrl) {
        this.applyReportUrl = applyReportUrl;
    }

}
