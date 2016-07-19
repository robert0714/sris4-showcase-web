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
 * The Class Rl05238DTO.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rl05238DTO", propOrder = { "SeqNo", "ReceiveDateS", "ReceiveDateE", "ApplyCode", "PersonId",
        "Village", "SiteId", "Rl05238ResultList" })
@XmlRootElement(name = "Rl05238DTO")
public class Rl05238DTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** 明細簿序號 */
    @FieldName("明細簿序號")
    @XmlElement(name = "SeqNo")
    private String seqNo;

    /** 明細簿登錄日期起 */
    @FieldName("明細簿登錄日期起")
    @XmlElement(name = "ReceiveDateS")
    private String receiveDateS;

    /** 明細簿登錄日期迄 */
    @FieldName("明細簿登錄日期迄")
    @XmlElement(name = "ReceiveDateE")
    private String receiveDateE;

    /** 申請書種類 */
    @FieldName("申請書種類")
    @XmlElement(name = "ApplyCode")
    private String applyCode;

    /** 當事人統一編號 */
    @FieldName("當事人統一編號")
    @XmlElement(name = "PersonId")
    private String personId;

    /** 當事人所在地村里 */
    @FieldName("當事人所在地村里")
    @XmlElement(name = "Village")
    private String village;

    /** 來文戶政事務所 */
    @FieldName("來文戶政事務所 ")
    @XmlElement(name = "siteId")
    private String siteId;

    /** 外來戶籍通報明細簿資料 */
    @FieldName("外來戶籍通報明細簿資料")
    @XmlElement(name = "Rl05238ResultList")
    private List<Rl05238ResultDTO> rl05238ResultList = new ArrayList<Rl05238ResultDTO>();

    public String getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo;
    }

    public String getReceiveDateS() {
        return receiveDateS;
    }

    public void setReceiveDateS(String receiveDateS) {
        this.receiveDateS = receiveDateS;
    }

    public String getReceiveDateE() {
        return receiveDateE;
    }

    public void setReceiveDateE(String receiveDateE) {
        this.receiveDateE = receiveDateE;
    }

    public String getApplyCode() {
        return applyCode;
    }

    public void setApplyCode(String applyCode) {
        this.applyCode = applyCode;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public List<Rl05238ResultDTO> getRl05238ResultList() {
        return rl05238ResultList;
    }

    public void setRl05238ResultList(List<Rl05238ResultDTO> rl05238ResultList) {
        this.rl05238ResultList = rl05238ResultList;
    }

}
