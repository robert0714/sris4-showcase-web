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
import tw.gov.moi.domain.Rldf064mType;
import tw.gov.moi.domain.Rldf100mType;

/**
 * 清查人口資料轉錄_已接收死亡通報未辦理死亡登記者.
 * 
 * @author Derek Wang
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl089d0DTO", propOrder = { "dataObj", "dataObj064m" })
@XmlRootElement(name = "Rl089d0DTO")
public class Rl089d0DTO implements Serializable {
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    // /** dataObj. */
    // @XmlElement(name = "DataObj")
    // @FieldName("DataObj")
    // private Rldf100mType dataObj;

    /** dataObj. */
    @XmlElement(name = "DataObj")
    @FieldName("DataObj")
    private List<Rldf100mType> resultList;

    /** dataObj064m. */
    @XmlElement(name = "DataObj064m")
    @FieldName("dataObj064m")
    private Rldf064mType dataObj064m;

    /**
     * Gets the data obj.
     * 
     * @return the data obj
     */
    // public Rldf100mType getDataObj() {
    // return dataObj;
    // }

    /**
     * Sets the data obj.
     * 
     * @param dataObj
     *            the new data obj
     */
    // public void setDataObj(Rldf100mType dataObj) {
    // this.dataObj = dataObj;
    // }

    /**
     * Gets the data obj064m.
     * 
     * @return the data obj064m
     */
    public Rldf064mType getDataObj064m() {
        return dataObj064m;
    }

    /**
     * Sets the data obj064m.
     * 
     * @param dataObj064m
     *            the new data obj064m
     */
    public void setDataObj064m(Rldf064mType dataObj064m) {
        this.dataObj064m = dataObj064m;
    }

    public List<Rldf100mType> getResultList() {
        return resultList;
    }

    public void setResultList(List<Rldf100mType> resultList) {
        this.resultList = resultList;
    }

}
