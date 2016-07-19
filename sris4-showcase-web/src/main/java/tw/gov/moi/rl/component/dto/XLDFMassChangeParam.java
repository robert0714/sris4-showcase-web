/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component.dto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.domain.XldfopracsType;

/**
 * The Class XLDFMassChangeParam.
 * 
 * @author Marcus Chen
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XLDFMassChangeParam", propOrder = { "insertAccesses", "insertAccesses", "deleteAccesses",
        "deleteXldfObjs", "specialNoticeParam" })
public class XLDFMassChangeParam {
    /** The operation sequence id. */
    @XmlElement(name = "insertAccesses")
    private List<XldfopracsType> insertAccesses;

    @XmlElement(name = "insertXldfObjs")
    private List<Object> insertXldfObjs;

    /** The operation sequence id. */
    @XmlElement(name = "deleteAccesses")
    private List<XldfopracsType> deleteAccesses;

    @XmlElement(name = "deleteXldfObjs")
    private List<Object> deleteXldfObjs;

    @XmlElement(name = "specialNoticeParam")
    private XLDFRegisterCustomObnfParams specialNoticeParam;

    public XLDFMassChangeParam() {
        super();
        insertAccesses = new ArrayList<XldfopracsType>();
        deleteAccesses = new ArrayList<XldfopracsType>();
        insertXldfObjs = new ArrayList<Object>();
        deleteXldfObjs = new ArrayList<Object>();
        specialNoticeParam = new XLDFRegisterCustomObnfParams(new ArrayList<XLDFRegDetailObnfParams>());

    }

    public XLDFMassChangeParam(List<XldfopracsType> insertAccesses, List<Object> insertXldfObjs,
            List<XldfopracsType> deleteAccesses, List<Object> deleteXldfObjs) {
        super();
        this.insertAccesses = insertAccesses;
        this.insertXldfObjs = insertXldfObjs;
        this.deleteAccesses = deleteAccesses;
        this.deleteXldfObjs = deleteXldfObjs;
        specialNoticeParam = new XLDFRegisterCustomObnfParams(new ArrayList<XLDFRegDetailObnfParams>());
    }

    /**
     * @return the insertAccesses
     */
    public List<XldfopracsType> getInsertAccesses() {
        return insertAccesses;
    }

    /**
     * @param insertAccesses
     *            the insertAccesses to set
     */
    public void setInsertAccesses(List<XldfopracsType> insertAccesses) {
        this.insertAccesses = insertAccesses;
    }

    /**
     * @return the insertXldfObjs
     */
    public List<Object> getInsertXldfObjs() {
        return insertXldfObjs;
    }

    /**
     * @param insertXldfObjs
     *            the insertXldfObjs to set
     */
    public void setInsertXldfObjs(List<Object> insertXldfObjs) {
        this.insertXldfObjs = insertXldfObjs;
    }

    /**
     * @return the deleteAccesses
     */
    public List<XldfopracsType> getDeleteAccesses() {
        return deleteAccesses;
    }

    /**
     * @param deleteAccesses
     *            the deleteAccesses to set
     */
    public void setDeleteAccesses(List<XldfopracsType> deleteAccesses) {
        this.deleteAccesses = deleteAccesses;
    }

    /**
     * @return the deleteXldfObjs
     */
    public List<Object> getDeleteXldfObjs() {
        return deleteXldfObjs;
    }

    /**
     * @param deleteXldfObjs
     *            the deleteXldfObjs to set
     */
    public void setDeleteXldfObjs(List<Object> deleteXldfObjs) {
        this.deleteXldfObjs = deleteXldfObjs;
    }

    /**
     * @return the specialNoticeParam
     */
    public XLDFRegisterCustomObnfParams getSpecialNoticeParam() {
        return specialNoticeParam;
    }

    /**
     * @param specialNoticeParam
     *            the specialNoticeParam to set
     */
    public void setSpecialNoticeParam(XLDFRegisterCustomObnfParams specialNoticeParam) {
        this.specialNoticeParam = specialNoticeParam;
    }

}
