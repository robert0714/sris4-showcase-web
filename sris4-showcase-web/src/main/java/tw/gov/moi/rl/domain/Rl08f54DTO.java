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
 * The Class Rl08f54DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl08f54DTO", propOrder = { "labelHead", "voteCode", "voteDate", "personId", "ResultPersonId",
        "personName", "livingStyleCode", "votePoint", "workVotePoint", "remark", "listRl08f54ResultDTO" })
@XmlRootElement(name = "Rl08f54DTO")
public class Rl08f54DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 標題名稱. */
    @XmlElement(name = "labelHead")
    @FieldName("標題名稱")
    private String labelHead = "";

    /** 選舉組合代碼. */
    @XmlElement(name = "voteCode")
    @FieldName("選舉組合代碼")
    private String voteCode = "";

    /** 投票日期. */
    @XmlElement(name = "voteDate")
    @FieldName("投票日期")
    private String voteDate = "";

    /** 統一編號. */
    @XmlElement(name = "personId")
    @FieldName("統一編號")
    private String personId = "";

    /** 統一編號. */
    @XmlElement(name = "ResultPersonId")
    @FieldName("統一編號")
    private String ResultPersonId = "";

    /** 姓名. */
    @FieldName("姓名")
    @XmlElement(name = "personName")
    private String personName = "";

    /** 原住民身分. */
    @XmlElement(name = "livingStyleCode")
    @FieldName("原住民身分")
    private String livingStyleCode = "";

    /** 投票所. */
    @XmlElement(name = "votePoint")
    @FieldName("投票所")
    private String votePoint = "";

    /** 工作地投票所. */
    @XmlElement(name = "workVotePoint")
    @FieldName("工作地投票所")
    private String workVotePoint = "";

    /** 備註. */
    @XmlElement(name = "remark")
    @FieldName("備註")
    private String remark = "";

    /** listRl08f54ResultDTO. */
    @XmlElement(name = "listRl08f54ResultDTO")
    @FieldName("查詢結果 ")
    private List<Rl08f54ResultDTO> listRl08f54ResultDTO = new ArrayList<Rl08f54ResultDTO>(0);

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
     * Gets the person name.
     * 
     * @return the person name
     */
    public String getPersonName() {
        return personName;
    }

    /**
     * Sets the person name.
     * 
     * @param personName
     *            the new person name
     */
    public void setPersonName(String personName) {
        this.personName = personName;
    }

    /**
     * Gets the living style code.
     * 
     * @return the living style code
     */
    public String getLivingStyleCode() {
        return livingStyleCode;
    }

    /**
     * Sets the living style code.
     * 
     * @param livingStyleCode
     *            the new living style code
     */
    public void setLivingStyleCode(String livingStyleCode) {
        this.livingStyleCode = livingStyleCode;
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

    /**
     * Gets the remark.
     * 
     * @return the remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Sets the remark.
     * 
     * @param remark
     *            the new remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * Gets the result person id.
     * 
     * @return the result person id
     */
    public String getResultPersonId() {
        return ResultPersonId;
    }

    /**
     * Sets the result person id.
     * 
     * @param resultPersonId
     *            the new result person id
     */
    public void setResultPersonId(String resultPersonId) {
        ResultPersonId = resultPersonId;
    }

    /**
     * Gets the list rl08f54 result dto.
     * 
     * @return the list rl08f54 result dto
     */
    public List<Rl08f54ResultDTO> getListRl08f54ResultDTO() {
        return listRl08f54ResultDTO;
    }

    /**
     * Sets the list rl08f54 result dto.
     * 
     * @param listRl08f54ResultDTO
     *            the new list rl08f54 result dto
     */
    public void setListRl08f54ResultDTO(List<Rl08f54ResultDTO> listRl08f54ResultDTO) {
        this.listRl08f54ResultDTO = listRl08f54ResultDTO;
    }

}