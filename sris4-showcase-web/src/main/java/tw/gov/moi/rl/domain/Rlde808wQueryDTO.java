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

/**
 * The Class Rldf808wQueryDTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlde808wQueryDTO", propOrder = { "voteCode", "voteDate", "votePoint", "kind" })
@XmlRootElement(name = "Rlde808wQueryDTO")
public class Rlde808wQueryDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 7994966598178869086L;

    /** 選舉組合代碼. */
    @XmlElement(name = "VoteCode")
    @FieldName("選舉組合代碼")
    private String voteCode = "";

    /** 投票日期. */
    @XmlElement(name = "VoteDate")
    @FieldName("投票日期")
    private String voteDate = "";

    /** 投票所. */
    @XmlElement(name = "VotePoint")
    @FieldName("投票所")
    private String votePoint = "";

    /** 種類. */
    @XmlElement(name = "Kind")
    @FieldName("種類")
    private String kind = "";

    /**
     * Gets the vote code.
     * 
     * @return the vote code
     */
    public String getVoteCode() {
        return voteCode;
    }

    /**
     * Sets the vote code.
     * 
     * @param voteCode
     *            the new vote code
     */
    public void setVoteCode(String voteCode) {
        this.voteCode = voteCode;
    }

    /**
     * Gets the vote date.
     * 
     * @return the vote date
     */
    public String getVoteDate() {
        return voteDate;
    }

    /**
     * Sets the vote date.
     * 
     * @param voteDate
     *            the new vote date
     */
    public void setVoteDate(String voteDate) {
        this.voteDate = voteDate;
    }

    /**
     * Gets the vote point.
     * 
     * @return the vote point
     */
    public String getVotePoint() {
        return votePoint;
    }

    /**
     * Sets the vote point.
     * 
     * @param votePoint
     *            the new vote point
     */
    public void setVotePoint(String votePoint) {
        this.votePoint = votePoint;
    }

    @Override
    public String toString() {
        return "Rlde808wQueryDTO [voteCode=" + voteCode + ", voteDate=" + voteDate + ", votePoint=" + votePoint
                + ", kind=" + kind + "]";
    }

    /**
     * Gets the kind.
     * 
     * @return the kind
     */
    public String getKind() {
        return kind;
    }

    /**
     * Sets the kind.
     * 
     * @param kind
     *            the new kind
     */
    public void setKind(String kind) {
        this.kind = kind;
    }
}
