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
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Rl08750DTO")
public class Rl08750DTO implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String rptUrl;
    private String reportFormat;
    
    public String getRptUrl() {
        return rptUrl;
    }
    public void setRptUrl(String rptUrl) {
        this.rptUrl = rptUrl;
    }
    public String getReportFormat() {
        return reportFormat;
    }
    public void setReportFormat(String reportFormat) {
        this.reportFormat = reportFormat;
    }
}
