/*
 * Copyright (c) 2010-2020 IISI.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of IISI.
 */
package tw.gov.moi.rl.component.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import tw.gov.moi.ae.checker.annotation.FieldName;

/**
 * MasMovHouseholdIdDTO
 * 
 * @author marcus
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "masMovHouseholdIdDTO", propOrder = { "householdHeadId", "householdId", "siteId" })
@XmlRootElement(name = "MasMovHouseholdIdDTO")
public class MasMovHouseholdIdDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 戶長國民身分證統一編號 */
    @XmlElement(name = "HouseholdHeadId", required = true)
    @FieldName("戶長國民身分證統一編號")
    private String householdHeadId;

    /** 戶號 */
    @XmlElement(name = "HouseholdId", required = true)
    @FieldName("戶號")
    private String householdId;

    /** 鄰 */
    @XmlElement(name = "Neighbor", required = true)
    @FieldName("鄰")
    private String neighbor;

    /** 作業點代碼 */
    @XmlElement(name = "SiteId", required = true)
    @FieldName("作業點代碼")
    private String siteId;

    /** changeInfoDTO */
    @XmlElement(name = "ChangeInfoDTO", required = true)
    @FieldName("要修改的作業的資訊與欄位")
    private MassMoveCommonParamDTO changeInfoDTO = new MassMoveCommonParamDTO();

    /**
     * @return the householdHeadId
     */
    public String getHouseholdHeadId() {
        return householdHeadId;
    }

    /**
     * @param householdHeadId
     *            the householdHeadId to set
     */
    public void setHouseholdHeadId(String householdHeadId) {
        this.householdHeadId = householdHeadId;
    }

    /**
     * @return the householdId
     */
    public String getHouseholdId() {
        return householdId;
    }

    /**
     * @param householdId
     *            the householdId to set
     */
    public void setHouseholdId(String householdId) {
        this.householdId = householdId;
    }

    /**
     * @return the siteId
     */
    public String getSiteId() {
        return siteId;
    }

    /**
     * @param siteId
     *            the siteId to set
     */
    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    /**
     * @return the changeInfoDTO
     */
    public MassMoveCommonParamDTO getChangeInfoDTO() {
        return changeInfoDTO;
    }

    /**
     * @param changeInfoDTO
     *            the changeInfoDTO to set
     */
    public void setChangeInfoDTO(MassMoveCommonParamDTO changeInfoDTO) {
        this.changeInfoDTO = changeInfoDTO;
    }

    public String getNeighbor() {
        return neighbor;
    }

    public void setNeighbor(String neighbor) {
        this.neighbor = neighbor;
    }

}
