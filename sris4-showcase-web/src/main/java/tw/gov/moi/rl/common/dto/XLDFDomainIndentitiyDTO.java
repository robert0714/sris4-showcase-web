/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.common.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.rl.component.dto.XLDFDomainObject;

/**
 * XLDF領域物件識別資料傳輸物件.
 * 
 * @author JL
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xLDFDomainIndentitiyDTO", propOrder = { "xldfType", "xldfDomainKey" })
@XmlRootElement(name = "XLDFDomainIndentitiyDTO")
public class XLDFDomainIndentitiyDTO {

    /** XLDF物件類別. */
    @XmlElement(name = "XldfType")
    private Class<? extends XLDFDomainObject> xldfType;

    /** XLDF物件鍵值. */
    @XmlElement(name = "XldfDomainKey")
    private String xldfDomainKey;

    /**
     * Instantiates a new xLDF domain indentitiy dto.
     */
    public XLDFDomainIndentitiyDTO() {
        super();
    }

    /**
     * Instantiates a new xLDF domain indentitiy dto.
     * 
     * @param xldfType
     *            the xldf type
     * @param xldfDomainKey
     *            the xldf domain key
     */
    public XLDFDomainIndentitiyDTO(Class<? extends XLDFDomainObject> xldfType, String xldfDomainKey) {
        super();
        this.xldfType = xldfType;
        this.xldfDomainKey = xldfDomainKey;
    }

    /**
     * Gets the xldf type.
     * 
     * @return the xldf type
     */
    public Class<? extends XLDFDomainObject> getXldfType() {
        return xldfType;
    }

    /**
     * Sets the xldf type.
     * 
     * @param xldfType
     *            the new xldf type
     */
    public void setXldfType(Class<? extends XLDFDomainObject> xldfType) {
        this.xldfType = xldfType;
    }

    /**
     * Gets the xldf domain key.
     * 
     * @return the xldf domain key
     */
    public String getXldfDomainKey() {
        return xldfDomainKey;
    }

    /**
     * Sets the xldf domain key.
     * 
     * @param xldfDomainKey
     *            the new xldf domain key
     */
    public void setXldfDomainKey(String xldfDomainKey) {
        this.xldfDomainKey = xldfDomainKey;
    }

}
