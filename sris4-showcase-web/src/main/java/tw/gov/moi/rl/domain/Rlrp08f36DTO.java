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
 * RLRP08F36 Report DTO
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rlrp08f36DTO", propOrder = { "votePoint", "village", "neighbor", "mainPage", "subPage", "serialNo",
        "sex", "vote1", "vote2", "vote3", "vote3_0", "vote3_1", "vote3_2", "vote3_3", "vote3_4", "vote4_0", "vote4_1",
        "vote4_2", "vote4_3", "vote4_4", "vote5_0", "vote5_1", "vote5_2", "vote5_3", "vote5_4", "livingStyleCode0",
        "livingStyleCode1", "livingStyleCode2" })
@XmlRootElement(name = "Rlrp08f36DTO")
public class Rlrp08f36DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -352658858891451780L;

    /** 投票所. */
    @XmlElement(name = "VotePoint")
    @FieldName("投票所")
    private String votePoint = "";

    /** 村里. */
    @XmlElement(name = "Village")
    @FieldName("村里")
    private String village = "";

    /** 鄰. */
    @XmlElement(name = "Neighbor")
    @FieldName("鄰")
    private String neighbor = "";

    /** 主頁. */
    @XmlElement(name = "MainPage")
    @FieldName("主頁")
    private String mainPage = "";

    /** 副頁. */
    @XmlElement(name = "SubPage")
    @FieldName("副頁")
    private String subPage = "";

    /** 編號. */
    @XmlElement(name = "SerialNo")
    @FieldName("編號")
    private String serialNo = "";

    /** 性別. */
    @XmlElement(name = "Sex")
    @FieldName("性別")
    private String sex = "";

    /** 選舉權(一). */
    @XmlElement(name = "Vote1")
    @FieldName("選舉權(一)")
    private String vote1 = "";

    /** 選舉權(二). */
    @XmlElement(name = "Vote2")
    @FieldName("選舉權(二)")
    private String vote2 = "";

    /** 選舉權(三). */
    @XmlElement(name = "Vote3")
    @FieldName("選舉權(三)")
    private String vote3 = "";

    /** 選舉權(三)區域. */
    @XmlElement(name = "Vote3_0")
    @FieldName("選舉權(三)區域")
    private String vote3_0 = "";

    /** 選舉權(三)平地原住民. */
    @XmlElement(name = "Vote3_1")
    @FieldName("選舉權(三)平地原住民")
    private String vote3_1 = "";

    /** 選舉權(三)山地原住民. */
    @XmlElement(name = "Vote3_2")
    @FieldName("選舉權(三)山地原住民")
    private String vote3_2 = "";

    /** 選舉權(三)原住民. */
    @XmlElement(name = "Vote3_3")
    @FieldName("選舉權(三)原住民")
    private String vote3_3 = "";

    /** 選舉權(三)-----. */
    @XmlElement(name = "Vote3_4")
    @FieldName("選舉權(三)-----")
    private String vote3_4 = "";

    /** 選舉權(四)區域. */
    @XmlElement(name = "Vote4_0")
    @FieldName("選舉權(四)區域")
    private String vote4_0 = "";

    /** 選舉權(四)平地原住民. */
    @XmlElement(name = "Vote4_1")
    @FieldName("選舉權(四)平地原住民")
    private String vote4_1 = "";

    /** 選舉權(四)山地原住民. */
    @XmlElement(name = "Vote4_2")
    @FieldName("選舉權(四)山地原住民")
    private String vote4_2 = "";

    /** 選舉權(四)原住民. */
    @XmlElement(name = "Vote4_3")
    @FieldName("選舉權(四)原住民")
    private String vote4_3 = "";

    /** 選舉權(四)-----. */
    @XmlElement(name = "Vote4_4")
    @FieldName("選舉權(四)-----")
    private String vote4_4 = "";

    /** 選舉權(五)區域. */
    @XmlElement(name = "Vote5_0")
    @FieldName("選舉權(五)區域")
    private String vote5_0 = "";

    /** 選舉權(五)平地原住民. */
    @XmlElement(name = "Vote5_1")
    @FieldName("選舉權(五)平地原住民")
    private String vote5_1 = "";

    /** 選舉權(五)山地原住民. */
    @XmlElement(name = "Vote5_2")
    @FieldName("選舉權(五)山地原住民")
    private String vote5_2 = "";

    /** 選舉權(五)原住民. */
    @XmlElement(name = "Vote5_3")
    @FieldName("選舉權(五)原住民")
    private String vote5_3 = "";

    /** 選舉權(五)-----. */
    @XmlElement(name = "Vote5_4")
    @FieldName("選舉權(五)-----")
    private String vote5_4 = "";

    /** 未滿選舉居住期間者區域. */
    @XmlElement(name = "LivingStyleCode0")
    @FieldName("未滿選舉居住期間者區域")
    private String livingStyleCode0 = "";

    /** 未滿選舉居住期間者平地原住民. */
    @XmlElement(name = "LivingStyleCode1")
    @FieldName("未滿選舉居住期間者平地原住民")
    private String livingStyleCode1 = "";

    /** 未滿選舉居住期間者山地原住民. */
    @XmlElement(name = "LivingStyleCode2")
    @FieldName("未滿選舉居住期間者山地原住民")
    private String livingStyleCode2 = "";

    public String getVotePoint() {
        return this.votePoint;
    }

    public void setVotePoint(String votePoint) {
        this.votePoint = votePoint;
    }

    public String getVillage() {
        return this.village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getNeighbor() {
        return this.neighbor;
    }

    public void setNeighbor(String neighbor) {
        this.neighbor = neighbor;
    }

    public String getMainPage() {
        return this.mainPage;
    }

    public void setMainPage(String mainPage) {
        this.mainPage = mainPage;
    }

    public String getSubPage() {
        return this.subPage;
    }

    public void setSubPage(String subPage) {
        this.subPage = subPage;
    }

    public String getSerialNo() {
        return this.serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getVote1() {
        return this.vote1;
    }

    public void setVote1(String vote1) {
        this.vote1 = vote1;
    }

    public String getVote2() {
        return this.vote2;
    }

    public void setVote2(String vote2) {
        this.vote2 = vote2;
    }

    public String getVote3() {
        return this.vote3;
    }

    public void setVote3(String vote3) {
        this.vote3 = vote3;
    }

    public String getVote3_0() {
        return this.vote3_0;
    }

    public void setVote3_0(String vote3_0) {
        this.vote3_0 = vote3_0;
    }

    public String getVote3_1() {
        return this.vote3_1;
    }

    public void setVote3_1(String vote3_1) {
        this.vote3_1 = vote3_1;
    }

    public String getVote3_2() {
        return this.vote3_2;
    }

    public void setVote3_2(String vote3_2) {
        this.vote3_2 = vote3_2;
    }

    public String getVote3_3() {
        return this.vote3_3;
    }

    public void setVote3_3(String vote3_3) {
        this.vote3_3 = vote3_3;
    }

    public String getVote3_4() {
        return this.vote3_4;
    }

    public void setVote3_4(String vote3_4) {
        this.vote3_4 = vote3_4;
    }

    public String getVote4_0() {
        return this.vote4_0;
    }

    public void setVote4_0(String vote4_0) {
        this.vote4_0 = vote4_0;
    }

    public String getVote4_1() {
        return this.vote4_1;
    }

    public void setVote4_1(String vote4_1) {
        this.vote4_1 = vote4_1;
    }

    public String getVote4_2() {
        return this.vote4_2;
    }

    public void setVote4_2(String vote4_2) {
        this.vote4_2 = vote4_2;
    }

    public String getVote4_3() {
        return this.vote4_3;
    }

    public void setVote4_3(String vote4_3) {
        this.vote4_3 = vote4_3;
    }

    public String getVote4_4() {
        return this.vote4_4;
    }

    public void setVote4_4(String vote4_4) {
        this.vote4_4 = vote4_4;
    }

    public String getVote5_0() {
        return this.vote5_0;
    }

    public void setVote5_0(String vote5_0) {
        this.vote5_0 = vote5_0;
    }

    public String getVote5_1() {
        return this.vote5_1;
    }

    public void setVote5_1(String vote5_1) {
        this.vote5_1 = vote5_1;
    }

    public String getVote5_2() {
        return this.vote5_2;
    }

    public void setVote5_2(String vote5_2) {
        this.vote5_2 = vote5_2;
    }

    public String getVote5_3() {
        return this.vote5_3;
    }

    public void setVote5_3(String vote5_3) {
        this.vote5_3 = vote5_3;
    }

    public String getVote5_4() {
        return this.vote5_4;
    }

    public void setVote5_4(String vote5_4) {
        this.vote5_4 = vote5_4;
    }

    public String getLivingStyleCode0() {
        return this.livingStyleCode0;
    }

    public void setLivingStyleCode0(String livingStyleCode0) {
        this.livingStyleCode0 = livingStyleCode0;
    }

    public String getLivingStyleCode1() {
        return this.livingStyleCode1;
    }

    public void setLivingStyleCode1(String livingStyleCode1) {
        this.livingStyleCode1 = livingStyleCode1;
    }

    public String getLivingStyleCode2() {
        return this.livingStyleCode2;
    }

    public void setLivingStyleCode2(String livingStyleCode2) {
        this.livingStyleCode2 = livingStyleCode2;
    }

}
