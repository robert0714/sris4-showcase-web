/*
 * Copyright (final c) 2010-2020 IISI.
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

/**
 * 選舉人數統計物件.
 * 
 * @author DAXIONG
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "voterNumber", propOrder = { "male", "female" })
@XmlRootElement(name = "VoterNumber")
public class VoterNumber implements Serializable {

    /** 序列版本編號. */
    private static final long serialVersionUID = 1L;

    /** 男生數量. */
    @XmlElement(name = "Male")
    @FieldName("男生數量")
    private int male;

    /** 女生數量. */
    @XmlElement(name = "Female")
    @FieldName("女生數量")
    private int female;

    /**
     * Constructor.
     */
    public VoterNumber() {
        super();
    }

    /**
     * Constructor.
     * 
     * @param male
     *            男生數量
     * @param female
     *            女生數量
     */
    public VoterNumber(final int male, final int female) {
        super();
        this.male = male;
        this.female = female;
    }

    /**
     * 取得女生數量.
     * 
     * @return 女生數量
     */
    public int getFemale() {
        return female;
    }

    /**
     * 取得男生數量.
     * 
     * @return 男生數量
     */
    public int getMale() {
        return male;
    }

    /**
     * 設定女生數量.
     * 
     * @param female
     *            女生數量
     */
    public void setFemale(final int female) {
        this.female = female;
    }

    /**
     * 設定男生數量.
     * 
     * @param male
     *            男生數量
     */
    public void setMale(final int male) {
        this.male = male;
    }

}