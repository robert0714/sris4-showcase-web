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

/**
 * The Class Rl08f52ResultDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl08f52ResultDTO", propOrder = { "rlde806wType", "workVotePoint" })
@XmlRootElement(name = "Rl08f52ResultDTO")
public class Rl08f52ResultDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 選舉人資料檔. */
    @XmlElement(name = "Rlde806wType")
    @FieldName("選舉人資料檔")
    private Rlde806wType rlde806wType = new Rlde806wType();

    /** 工作地投票所. */
    @XmlElement(name = "WorkVotePoint")
    @FieldName("工作地投票所")
    private String workVotePoint = "";

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
     * Gets the work vote point.
     * 
     * @return the work vote point
     */
    public String getWorkVotePoint() {
        return workVotePoint;
    }

    /**
     * Sets the work vote point.
     * 
     * @param workVotePoint
     *            the new work vote point
     */
    public void setWorkVotePoint(String workVotePoint) {
        this.workVotePoint = workVotePoint;
    }

}
