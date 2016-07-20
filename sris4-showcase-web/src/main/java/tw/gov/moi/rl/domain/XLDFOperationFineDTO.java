/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import javax.xml.bind.annotation.XmlElement;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.dto.XLDFDomainDTO;

/**
 * The Class XLDFOperationFineDTO.
 */
public abstract class XLDFOperationFineDTO implements XLDFDomainDTO {

    /** site id. */
    @XmlElement(name = "SiteId", required = true)
    @FieldName("作業代碼")
    private String siteId;

    /**
     * Gets the site id.
     * 
     * @return the site id
     */
    public String getSiteId() {
        return siteId;
    }

    /**
     * Sets the site id.
     * 
     * @param siteId
     *            the new site id
     */
    public void setSiteId(final String siteId) {
        this.siteId = siteId;
    }
}
