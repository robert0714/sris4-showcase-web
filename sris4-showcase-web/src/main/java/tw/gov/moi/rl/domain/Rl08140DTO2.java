/*
 * Copyright (c) 2010-2020 IISI. All rights reserved.
 * 
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import tw.gov.moi.ae.checker.annotation.FieldName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Rl08140DTO2")
public class Rl08140DTO2 implements Serializable {

    private static final long serialVersionUID = 1L;

    @XmlElement(name = "DateStart")
    @FieldName("受理日期起")
    private String dateStart;

    @XmlElement(name = "DateEnd")
    @FieldName("受理日期迄")
    private String dateEnd;

    @XmlElement(name = "SiteId")
    @FieldName("SiteId")
    private String siteId;

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }
}
