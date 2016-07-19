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
import tw.gov.moi.domain.Rlde806wType;
import tw.gov.moi.domain.Rlde809wType;

/**
 * The Class Rl08f54ResultDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl08f54ResultDTO", propOrder = { "rlde806wType", "rlde809wType1", "rlde809wType2" })
@XmlRootElement(name = "Rl08f54ResultDTO")
public class Rl08f54ResultDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** rlde806wType. */
    @XmlElement(name = "rlde806wType")
    @FieldName("選舉人資料檔")
    private Rlde806wType rlde806wType = new Rlde806wType();

    /** 工作地投票資料檔 (他往工投). */
    @XmlElement(name = "Rlde809wType1")
    @FieldName("工作地投票資料檔 (他往工投)")
    private Rlde809wType rlde809wType1 = new Rlde809wType();

    /** 工作地投票資料檔 (外來工投). */
    @XmlElement(name = "Rlde809wType2")
    @FieldName("工作地投票資料檔 (外來工投)")
    private Rlde809wType rlde809wType2 = new Rlde809wType();

    /**
     * Gets the rlde806w type.
     * 
     * @return the rlde806w type
     */
    public Rlde806wType getRlde806wType() {
        return rlde806wType;
    }

    /**
     * Sets the rlde806w type.
     * 
     * @param rlde806wType
     *            the new rlde806w type
     */
    public void setRlde806wType(Rlde806wType rlde806wType) {
        this.rlde806wType = rlde806wType;
    }

    /**
     * Gets the rlde809w type1.
     * 
     * @return the rlde809w type1
     */
    public Rlde809wType getRlde809wType1() {
        return rlde809wType1;
    }

    /**
     * Sets the rlde809w type1.
     * 
     * @param rlde809wType1
     *            the new rlde809w type1
     */
    public void setRlde809wType1(Rlde809wType rlde809wType1) {
        this.rlde809wType1 = rlde809wType1;
    }

    /**
     * Gets the rlde809w type2.
     * 
     * @return the rlde809w type2
     */
    public Rlde809wType getRlde809wType2() {
        return rlde809wType2;
    }

    /**
     * Sets the rlde809w type2.
     * 
     * @param rlde809wType2
     *            the new rlde809w type2
     */
    public void setRlde809wType2(Rlde809wType rlde809wType2) {
        this.rlde809wType2 = rlde809wType2;
    }

}
