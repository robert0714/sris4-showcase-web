/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * @author marcus
 * 
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xLDFRemoveAsyncParam", propOrder = { "beforeKey", "domainKey", "mXldfDomainObj", "hXldfDomainObj",
        "needCreateOrigin" })
@XmlRootElement(name = "XLDFRemoveAsyncParam")
public class XLDFRemoveAsyncParam {

    /** The beforeKey. */
    @XmlElement(name = "BeforeKey")
    @FieldName("XLDFDomainKey beforeKey")
    private XLDFDomainKey beforeKey;

    /** The MXldfDomainObj. */
    @XmlElement(name = "DomainKey")
    @FieldName("domainKey")
    private String domainKey;

    /** The MXldfDomainObj. */
    @XmlElement(name = "MXldfDomainObj")
    @FieldName("現戶XLDFDomainObject")
    private XLDFDomainObject mXldfDomainObj;

    /** The HXldfDomainObj. */
    @XmlElement(name = "HXldfDomainObj")
    @FieldName("除戶XLDFDomainObject")
    private XLDFDomainObject hXldfDomainObj;

    /** The NeedCreateOrigin. */
    @XmlElement(name = "NeedCreateOrigin")
    @FieldName("是否要建立OriginXldf")
    private boolean needCreateOrigin = Boolean.FALSE;

    public XLDFRemoveAsyncParam() {

    }

    public XLDFRemoveAsyncParam(XLDFDomainKey beforeKey, String domainKey, XLDFDomainObject mXldfDomainObj,
            XLDFDomainObject hXldfDomainObj, boolean needCreateOrigin) {
        super();
        this.beforeKey = beforeKey;
        this.domainKey = domainKey;
        this.mXldfDomainObj = mXldfDomainObj;
        this.hXldfDomainObj = hXldfDomainObj;
        this.needCreateOrigin = needCreateOrigin;
    }

    /**
     * @return the beforeKey
     */
    public XLDFDomainKey getBeforeKey() {
        return beforeKey;
    }

    /**
     * @param beforeKey
     *            the beforeKey to set
     */
    public void setBeforeKey(XLDFDomainKey beforeKey) {
        this.beforeKey = beforeKey;
    }

    /**
     * @return the domainKey
     */
    public String getDomainKey() {
        return domainKey;
    }

    /**
     * @param domainKey
     *            the domainKey to set
     */
    public void setDomainKey(String domainKey) {
        this.domainKey = domainKey;
    }

    /**
     * @return the mXldfDomainObj
     */
    public XLDFDomainObject getmXldfDomainObj() {
        return mXldfDomainObj;
    }

    /**
     * @param mXldfDomainObj
     *            the mXldfDomainObj to set
     */
    public void setmXldfDomainObj(XLDFDomainObject mXldfDomainObj) {
        this.mXldfDomainObj = mXldfDomainObj;
    }

    /**
     * @return the hXldfDomainObj
     */
    public XLDFDomainObject gethXldfDomainObj() {
        return hXldfDomainObj;
    }

    /**
     * @param hXldfDomainObj
     *            the hXldfDomainObj to set
     */
    public void sethXldfDomainObj(XLDFDomainObject hXldfDomainObj) {
        this.hXldfDomainObj = hXldfDomainObj;
    }

    /**
     * @return the needCreateOrigin
     */
    public boolean isNeedCreateOrigin() {
        return needCreateOrigin;
    }

    /**
     * @param needCreateOrigin
     *            the needCreateOrigin to set
     */
    public void setNeedCreateOrigin(boolean needCreateOrigin) {
        this.needCreateOrigin = needCreateOrigin;
    }

}
