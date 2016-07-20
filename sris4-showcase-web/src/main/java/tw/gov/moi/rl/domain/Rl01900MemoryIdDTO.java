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
import tw.gov.moi.domain.Tldf004mType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl01900MomeryIdDTO", propOrder = { "tldf004mList" })
@XmlRootElement(name = "Rl01900MomeryIdDTO")
public class Rl01900MemoryIdDTO implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    @XmlElement(name = "tldf004mList", required = true)
    @FieldName("tldf004mList")
    private List<Tldf004mType> tldf004mList;

    public List<Tldf004mType> getTldf004mList() {
        return tldf004mList;
    }

    public void setTldf004mList(List<Tldf004mType> tldf004mList) {
        this.tldf004mList = tldf004mList;
    }

}
