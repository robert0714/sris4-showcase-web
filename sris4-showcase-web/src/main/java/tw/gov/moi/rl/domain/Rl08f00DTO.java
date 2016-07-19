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
 * The Class Rl08f00DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rl08f00DTO", propOrder = { "voteCode", "voteDate", "voteCopyList", "voteTypeCode1", "voteTypeCode2",
        "voteTypeCode3", "voteTypeCode4", "voteTypeCode5", "selectedRl08f00ResultDTO", "voteActionList",
        "voteClearList", "haveRlde800wData", "clearSelectedAll" })
@XmlRootElement(name = "Rl08f00DTO")
public class Rl08f00DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 8431788095599023197L;

    /** 選舉組合代碼. */
    @XmlElement(name = "voteCode")
    @FieldName("選舉組合代碼")
    private String voteCode;

    /** 投票日期. */
    @XmlElement(name = "voteDate")
    @FieldName("投票日期")
    private String voteDate;

    /** 選舉識別代碼1. */
    @XmlElement(name = "voteTypeCode1")
    @FieldName("選舉識別代碼1")
    private String voteTypeCode1;

    /** 選舉識別代碼2. */
    @XmlElement(name = "voteTypeCode2")
    @FieldName("選舉識別代碼2")
    private String voteTypeCode2;

    /** 選舉識別代碼3. */
    @XmlElement(name = "voteTypeCode3")
    @FieldName("選舉識別代碼3")
    private String voteTypeCode3;

    /** 選舉識別代碼4. */
    @XmlElement(name = "voteTypeCode4")
    @FieldName("選舉識別代碼4")
    private String voteTypeCode4;

    /** 選舉識別代碼5. */
    @XmlElement(name = "voteTypeCode5")
    @FieldName("選舉識別代碼5")
    private String voteTypeCode5;

    /** 使用者選取的. */
    @XmlElement(name = "selectedRl08f00ResultDTO")
    @FieldName("使用者選取的")
    private Rl08f00ResultDTO selectedRl08f00ResultDTO;

    /** 各選舉組合作用中的投票日期清單. */
    @XmlElement(name = "voteActionList")
    @FieldName("各選舉組合作用中的投票日期清單")
    private List<Rl08f00ResultDTO> voteActionList = new ArrayList<Rl08f00ResultDTO>(0);

    /** 可供複製投票所的選舉組合清單. */
    @XmlElement(name = "voteCopyList")
    @FieldName("可供複製投票所的選舉組合清單")
    private List<Rl08f00ResultDTO> voteCopyList = new ArrayList<Rl08f00ResultDTO>(0);

    /** 選舉清檔組合清單. */
    @XmlElement(name = "voteClearList")
    @FieldName("選舉清檔組合清單")
    private List<Rl08f00ResultDTO> voteClearList = new ArrayList<Rl08f00ResultDTO>(0);

    /** 是否已有該選舉組合. */
    @XmlElement(name = "HaveRlde800wData")
    @FieldName("是否已有該選舉組合")
    private boolean haveRlde800wData = false;

    @XmlElement(name = "clearSelectedAll")
    @FieldName("清檔是否選擇全部")
    private boolean clearSelectedAll = true;

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
     * Gets the vote type code1.
     * 
     * @return the vote type code1
     */
    public String getVoteTypeCode1() {
        return this.voteTypeCode1;
    }

    /**
     * Sets the vote type code1.
     * 
     * @param voteTypeCode1
     *            the new vote type code1
     */
    public void setVoteTypeCode1(String voteTypeCode1) {
        this.voteTypeCode1 = voteTypeCode1;
    }

    /**
     * Gets the vote type code2.
     * 
     * @return the vote type code2
     */
    public String getVoteTypeCode2() {
        return this.voteTypeCode2;
    }

    /**
     * Sets the vote type code2.
     * 
     * @param voteTypeCode2
     *            the new vote type code2
     */
    public void setVoteTypeCode2(String voteTypeCode2) {
        this.voteTypeCode2 = voteTypeCode2;
    }

    /**
     * Gets the vote type code3.
     * 
     * @return the vote type code3
     */
    public String getVoteTypeCode3() {
        return this.voteTypeCode3;
    }

    /**
     * Sets the vote type code3.
     * 
     * @param voteTypeCode3
     *            the new vote type code3
     */
    public void setVoteTypeCode3(String voteTypeCode3) {
        this.voteTypeCode3 = voteTypeCode3;
    }

    /**
     * Gets the vote action list.
     * 
     * @return the vote action list
     */
    public List<Rl08f00ResultDTO> getVoteActionList() {
        return voteActionList;
    }

    /**
     * Sets the vote action list.
     * 
     * @param voteActionList
     *            the new vote action list
     */
    public void setVoteActionList(List<Rl08f00ResultDTO> voteActionList) {
        this.voteActionList = voteActionList;
    }

    /**
     * Gets the vote copy list.
     * 
     * @return the vote copy list
     */
    public List<Rl08f00ResultDTO> getVoteCopyList() {
        return voteCopyList;
    }

    /**
     * Sets the vote copy list.
     * 
     * @param voteCopyList
     *            the new vote copy list
     */
    public void setVoteCopyList(List<Rl08f00ResultDTO> voteCopyList) {
        this.voteCopyList = voteCopyList;
    }

    /**
     * Gets the selected rl08f00 result dto.
     * 
     * @return the selected rl08f00 result dto
     */
    public Rl08f00ResultDTO getSelectedRl08f00ResultDTO() {
        return selectedRl08f00ResultDTO;
    }

    /**
     * Sets the selected rl08f00 result dto.
     * 
     * @param selectedRl08f00ResultDTO
     *            the new selected rl08f00 result dto
     */
    public void setSelectedRl08f00ResultDTO(Rl08f00ResultDTO selectedRl08f00ResultDTO) {
        this.selectedRl08f00ResultDTO = selectedRl08f00ResultDTO;
    }

    /**
     * Checks if is have rlde800w data.
     * 
     * @return true, if is have rlde800w data
     */
    public boolean isHaveRlde800wData() {
        return haveRlde800wData;
    }

    /**
     * Sets the have rlde800w data.
     * 
     * @param haveRlde800wData
     *            the new have rlde800w data
     */
    public void setHaveRlde800wData(boolean haveRlde800wData) {
        this.haveRlde800wData = haveRlde800wData;
    }

    public List<Rl08f00ResultDTO> getVoteClearList() {
        return voteClearList;
    }

    public void setVoteClearList(List<Rl08f00ResultDTO> voteClearList) {
        this.voteClearList = voteClearList;
    }

    public boolean isClearSelectedAll() {
        return clearSelectedAll;
    }

    public void setClearSelectedAll(boolean clearSelectedAll) {
        this.clearSelectedAll = clearSelectedAll;
    }

    public String getVoteTypeCode4() {
        return voteTypeCode4;
    }

    public void setVoteTypeCode4(String voteTypeCode4) {
        this.voteTypeCode4 = voteTypeCode4;
    }

    public String getVoteTypeCode5() {
        return voteTypeCode5;
    }

    public void setVoteTypeCode5(String voteTypeCode5) {
        this.voteTypeCode5 = voteTypeCode5;
    }
}
