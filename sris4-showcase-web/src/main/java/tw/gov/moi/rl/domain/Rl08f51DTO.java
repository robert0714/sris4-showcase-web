/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * The Class Rl08f51DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl08f51DTO", propOrder = { "labelHead", "voteCode", "voteDate", "personId", "votePoint",
        "listRl08f51ResultDTO", "listVotePoint" })
@XmlRootElement(name = "Rl08f51DTO")
public class Rl08f51DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 標題名稱. */
    @XmlElement(name = "labelHead")
    @FieldName("標題名稱")
    private String labelHead = "";

    /** 選舉組合代碼. */
    @FieldName("選舉組合代碼")
    @XmlElement(name = "voteCode")
    private String voteCode = "";

    /** 投票日期. */
    @FieldName("投票日期")
    @XmlElement(name = "voteDate")
    private String voteDate = "";

    /** 統一編號. */
    @FieldName("統一編號")
    @XmlElement(name = "personId")
    private String personId = "";

    /** 投票所. */
    @FieldName("投票所")
    @XmlElement(name = "votePoint")
    private String votePoint = "";

    /** 工作地投票資料. */
    @FieldName("工作地投票資料")
    @XmlElement(name = "listRl08f51ResultDTO")
    private List<Rl08f51ResultDTO> listRl08f51ResultDTO = new ArrayList<Rl08f51ResultDTO>(0);

    /** 投票所列表. */
    @FieldName("投票所列表")
    @XmlElement(name = "listVotePoint")
    private List<String> listVotePoint = new ArrayList<String>(0);

    /**
     * Gets the label head.
     * 
     * @return the label head
     */
    public String getLabelHead() {
        return labelHead;
    }

    /**
     * Sets the label head.
     * 
     * @param labelHead
     *            the new label head
     */
    public void setLabelHead(String labelHead) {
        this.labelHead = labelHead;
    }

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
     * Gets the person id.
     * 
     * @return the person id
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * Sets the person id.
     * 
     * @param personId
     *            the new person id
     */
    public void setPersonId(String personId) {
        this.personId = personId;
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

    /**
     * Gets the list rl08f51 result dto.
     * 
     * @return the list rl08f51 result dto
     */
    public List<Rl08f51ResultDTO> getListRl08f51ResultDTO() {
        return listRl08f51ResultDTO;
    }

    /**
     * Sets the list rl08f51 result dto.
     * 
     * @param listRl08f51ResultDTO
     *            the new list rl08f51 result dto
     */
    public void setListRl08f51ResultDTO(List<Rl08f51ResultDTO> listRl08f51ResultDTO) {
        this.listRl08f51ResultDTO = listRl08f51ResultDTO;
    }

    /**
     * Gets the list vote point.
     * 
     * @return the list vote point
     */
    public List<String> getListVotePoint() {
        return listVotePoint;
    }

    /**
     * Sets the list vote point.
     * 
     * @param listVotePoint
     *            the new list vote point
     */
    public void setListVotePoint(List<String> listVotePoint) {
        this.listVotePoint = listVotePoint;
    }

}
