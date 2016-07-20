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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * 戶籍登記特殊通報處理參數物件
 * 
 * @author marcus chen
 * 
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XldfspecialnoticeList", propOrder = { "xldfspecialnoticeList" })
@XmlRootElement(name = "xldfspecialnoticeList")
public class XLDFRegisterCustomObnfParams {

    /** 戶籍登記特殊通報處理參數物件 */
    @XmlElement(name = "XldfspecialnoticeList")
    @FieldName("戶籍登記特殊通報處理清單")
    private List<XLDFRegDetailObnfParams> XldfspecialnoticeList;

    public XLDFRegisterCustomObnfParams() {
        super();
        XldfspecialnoticeList = new ArrayList<XLDFRegDetailObnfParams>();
    }

    public XLDFRegisterCustomObnfParams(List<XLDFRegDetailObnfParams> xldfspecialnoticeList) {
        super();
        XldfspecialnoticeList = xldfspecialnoticeList;
    }

    /**
     * @return the xldfspecialnoticeList
     */
    public List<XLDFRegDetailObnfParams> getXldfspecialnoticeList() {
        return XldfspecialnoticeList;
    }

    /**
     * @param xldfspecialnoticeList
     *            the xldfspecialnoticeList to set
     */
    public void setXldfspecialnoticeList(List<XLDFRegDetailObnfParams> xldfspecialnoticeList) {
        XldfspecialnoticeList = xldfspecialnoticeList;
    }

}
