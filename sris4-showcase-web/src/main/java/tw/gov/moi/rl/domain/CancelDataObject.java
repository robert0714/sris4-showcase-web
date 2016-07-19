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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;
import tw.gov.moi.rl.component.xldf.dto.XLDF087T;
import tw.gov.moi.rl.component.xldf.dto.XLDF088T;

/**
 * 結婚撤銷登記勾87、88T TDTO.
 * 
 * @author Viva.Hong
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelDataObject", propOrder = { "xldf087t", "xldf088t", "selectFlag" })
@XmlRootElement(name = "CancelDataObject")
public class CancelDataObject implements Serializable {

    /** serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 登記婚前結婚證明書. */
    @XmlElement(name = "Xldf087t", required = true)
    @FieldName("登記婚前結婚證明書")
    private XLDF087T xldf087t;

    /** 結婚證明書. */
    @XmlElement(name = "Xldf088t", required = true)
    @FieldName("結婚證明書")
    private XLDF088T xldf088t;

    /** 是否已勾選. */
    @XmlElement(name = "SelectFlag", required = true)
    @FieldName("是否已勾選")
    private boolean selectFlag = true;

    /**
     * Gets the xldf087t.
     * 
     * @return the xldf087t
     */
    public XLDF087T getXldf087t() {
        return xldf087t;
    }

    /**
     * Sets the xldf087t.
     * 
     * @param xldf087t
     *            the new xldf087t
     */
    public void setXldf087t(final XLDF087T xldf087t) {
        this.xldf087t = xldf087t;
    }

    /**
     * Gets the xldf088t.
     * 
     * @return the xldf088t
     */
    public XLDF088T getXldf088t() {
        return xldf088t;
    }

    /**
     * Sets the xldf088t.
     * 
     * @param xldf088t
     *            the new xldf088t
     */
    public void setXldf088t(final XLDF088T xldf088t) {
        this.xldf088t = xldf088t;
    }

    /**
     * Checks if is select flag.
     * 
     * @return true, if is select flag
     */
    public boolean isSelectFlag() {
        return selectFlag;
    }

    /**
     * Sets the select flag.
     * 
     * @param selectFlag
     *            the new select flag
     */
    public void setSelectFlag(final boolean selectFlag) {
        this.selectFlag = selectFlag;
    }
}
