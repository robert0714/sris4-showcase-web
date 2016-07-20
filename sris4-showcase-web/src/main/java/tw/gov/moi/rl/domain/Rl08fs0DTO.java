/*
 * Copyright (c) 2010-2020 IISI. All rights reserved.
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
import tw.gov.moi.rs.domain.VoterRollsInfoDTO;

/**
 * 選舉造冊封面列印DTO.
 * 
 * @author Viva.Hong
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl08fs0DTO", propOrder = { "acceptSiteId", "initTime", "modifyVoteOffice", "nativePerson3",
        "nativePerson4", "nativePerson5", "neighbor", "pageRadio", "personId", "personName", "queryList", "steetplate",
        "transactionId", "userId", "village", "voteOffices", "voteOffices3", "voteOffices4", "voteOffices5",
        "voterRollsInfoDTO" })
@XmlRootElement(name = "Rl08fs0DTO")
public class Rl08fs0DTO implements Serializable {

    /** SerialVersion UID. */
    private static final long serialVersionUID = 1L;

    /** 受理地作業點代碼. */
    @XmlElement(name = "AcceptSiteId", required = true)
    @FieldName("受理地作業點代碼")
    private String acceptSiteId;

    /** 初始化時間. */
    @XmlElement(name = "InitTime", required = true)
    @FieldName("初始化時間")
    private String initTime;

    /** 調整後投票所. */
    @XmlElement(name = "ModifyVoteOffice")
    @FieldName("調整後投票所")
    private String modifyVoteOffice;

    /** 原住民(三)身分. */
    @XmlElement(name = "NativePerson3")
    @FieldName("原住民(三)身分")
    private String nativePerson3;

    /** 原住民(四)身分. */
    @XmlElement(name = "NativePerson4")
    @FieldName("原住民(三)身分")
    private String nativePerson4;

    /** 原住民(五)身分. */
    @XmlElement(name = "NativePerson5")
    @FieldName("原住民(三)身分")
    private String nativePerson5;

    /** 鄰. */
    @XmlElement(name = "Neighbor")
    @FieldName("鄰")
    private String neighbor;

    /** 欲調整條件. */
    @XmlElement(name = "PageRadio")
    @FieldName("pageRadio")
    private String pageRadio;

    /** 統一編號. */
    @XmlElement(name = "PersonId")
    @FieldName("統一編號")
    private String personId;

    /** 姓名. */
    @XmlElement(name = "PersonName")
    @FieldName("姓名")
    private String personName;

    /** 查詢結果清單. */
    @XmlElement(name = "QueryList")
    @FieldName("queryList")
    private List<Rl08fs0QueryResult> queryList = new ArrayList<Rl08fs0QueryResult>();

    /** 街路門牌. */
    @XmlElement(name = "Steetplate")
    @FieldName("街路門牌")
    private String steetplate;

    /** 交易序號. */
    @XmlElement(name = "TransactionId", required = true)
    @FieldName("交易序號")
    private String transactionId;

    /** 使用者帳號. */
    @XmlElement(name = "UserId", required = true)
    @FieldName("使用者帳號")
    private String userId;

    /** 村里. */
    @XmlElement(name = "Village")
    @FieldName("村里")
    private String village;

    /** 投票所清單. */
    @XmlElement(name = "VoteOffices")
    @FieldName("投票所清單")
    private String voteOffices[] = new String[10];

    /** 投票所(三)清單. */
    @XmlElement(name = "VoteOffices3")
    @FieldName("投票所清單")
    private String voteOffices3[] = new String[10];

    /** 投票所(四)清單. */
    @XmlElement(name = "VoteOffices4")
    @FieldName("投票所清單")
    private String voteOffices4[] = new String[10];

    /** 投票所(五)清單. */
    @XmlElement(name = "VoteOffices5")
    @FieldName("投票所清單")
    private String voteOffices5[] = new String[10];

    /** 選舉名冊資訊DTO. */
    @XmlElement(name = "VoterRollsInfoDTO", required = true)
    @FieldName("選舉名冊資訊DTO")
    private VoterRollsInfoDTO voterRollsInfoDTO = new VoterRollsInfoDTO();

    public String getAcceptSiteId() {
        return acceptSiteId;
    }

    public String getInitTime() {
        return initTime;
    }

    public String getModifyVoteOffice() {
        return modifyVoteOffice;
    }

    public String getNativePerson3() {
        return nativePerson3;
    }

    public String getNativePerson4() {
        return nativePerson4;
    }

    public String getNativePerson5() {
        return nativePerson5;
    }

    public String getNeighbor() {
        return neighbor;
    }

    public String getPageRadio() {
        return pageRadio;
    }

    public String getPersonId() {
        return personId;
    }

    public String getPersonName() {
        return personName;
    }

    public List<Rl08fs0QueryResult> getQueryList() {
        return queryList;
    }

    public String getQueryListSize() {
        if (queryList == null) {
            return "0";
        }
        return String.valueOf(queryList.size());
    }

    public String getSteetplate() {
        return steetplate;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getUserId() {
        return userId;
    }

    public String getVillage() {
        return village;
    }

    public String[] getVoteOffices() {
        return voteOffices;
    }

    public String[] getVoteOffices3() {
        return voteOffices3;
    }

    public String[] getVoteOffices4() {
        return voteOffices4;
    }

    public String[] getVoteOffices5() {
        return voteOffices5;
    }

    public VoterRollsInfoDTO getVoterRollsInfoDTO() {
        return voterRollsInfoDTO;
    }

    public void setAcceptSiteId(final String acceptSiteId) {
        this.acceptSiteId = acceptSiteId;
    }

    public void setInitTime(final String initTime) {
        this.initTime = initTime;
    }

    public void setModifyVoteOffice(final String modifyVoteOffice) {
        this.modifyVoteOffice = modifyVoteOffice;
    }

    public void setNativePerson3(final String nativePerson3) {
        this.nativePerson3 = nativePerson3;
    }

    public void setNativePerson4(final String nativePerson4) {
        this.nativePerson4 = nativePerson4;
    }

    public void setNativePerson5(final String nativePerson5) {
        this.nativePerson5 = nativePerson5;
    }

    public void setNeighbor(final String neighbor) {
        this.neighbor = neighbor;
    }

    public void setPageRadio(final String pageRadio) {
        this.pageRadio = pageRadio;
    }

    public void setPersonId(final String personId) {
        this.personId = personId;
    }

    public void setPersonName(final String personName) {
        this.personName = personName;
    }

    public void setQueryList(final List<Rl08fs0QueryResult> queryList) {
        this.queryList = queryList;
    }

    public void setSteetplate(final String steetplate) {
        this.steetplate = steetplate;
    }

    public void setTransactionId(final String transactionId) {
        this.transactionId = transactionId;
    }

    public void setUserId(final String userId) {
        this.userId = userId;
    }

    public void setVillage(final String village) {
        this.village = village;
    }

    public void setVoteOffices(final String[] voteOffices) {
        this.voteOffices = voteOffices;
    }

    public void setVoteOffices3(final String[] voteOffices3) {
        this.voteOffices3 = voteOffices3;
    }

    public void setVoteOffices4(final String[] voteOffices4) {
        this.voteOffices4 = voteOffices4;
    }

    public void setVoteOffices5(final String[] voteOffices5) {
        this.voteOffices5 = voteOffices5;
    }

    public void setVoterRollsInfoDTO(final VoterRollsInfoDTO voterRollsInfoDTO) {
        this.voterRollsInfoDTO = voterRollsInfoDTO;
    }
}
